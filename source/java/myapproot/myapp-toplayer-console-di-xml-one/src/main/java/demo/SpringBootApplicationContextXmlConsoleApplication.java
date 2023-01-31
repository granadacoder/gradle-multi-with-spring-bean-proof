package demo;

import com.mycompany.myteam.myappone.businesslogiclayer.domain.Patient;
import com.mycompany.myteam.myappone.businesslogiclayer.interfaces.IMyOrchestrator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/* The below exclude(DataSourceAutoConfiguration) has been added because DataSource configuration has been moved to CompositionRootJavaConfig.  Also see : https://www.baeldung.com/spring-boot-failed-to-configure-data-source */
/* suppress warning, SpringBootApplication annotation class cannot be final */
@SuppressWarnings("checkstyle:DesignForExtension")
@SpringBootApplication()
public class SpringBootApplicationContextXmlConsoleApplication
        implements CommandLineRunner, ApplicationContextAware {

    public static final String ERROR_MSG_APPLICATION_CONTEXT_IS_NULL = "ApplicationContext is null";

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootApplicationContextXmlConsoleApplication.class);

    private static final String PATIENT_KEY = "ExamplePatientKeyXmlTopLayerP123";

    private ApplicationContext iocContext;

    public static void main(String[] args) {
        LOGGER.info("STARTING THE APPLICATION");
        SpringApplication.run(SpringBootApplicationContextXmlConsoleApplication.class, args);
        LOGGER.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        try {
            LOGGER.info("EXECUTING : command line runner");

            IMyOrchestrator orch = this.iocContext.getBean(IMyOrchestrator.class);

            LOGGER.info("START : runPatientDemo");
            this.runPatientDemo(orch);
            LOGGER.info("END : runPatientDemo");

        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
        }
    }

    private void runPatientDemo(IMyOrchestrator orch) {
        try {
            Patient result = orch.getAPatient(PATIENT_KEY);

            LOGGER.info("getPatientKey='{}'", result.getPatientKey());
            LOGGER.info("END : runPatientDemo");

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    /* java DI trick. this is defined by ApplicationContextAware interface */
    @Override
    public void setApplicationContext(ApplicationContext ioc) {

        if (null == ioc) {
            throw new IllegalArgumentException(ERROR_MSG_APPLICATION_CONTEXT_IS_NULL);
        }

        this.iocContext = ioc;
    }
}
