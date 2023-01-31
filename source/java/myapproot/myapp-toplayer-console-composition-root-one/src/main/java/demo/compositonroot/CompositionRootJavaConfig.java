package demo.compositonroot;

import com.mycompany.myteam.clientproxies.myclientproxy.concrete.MyClientProxyConcrete;
import com.mycompany.myteam.clientproxies.myclientproxy.interfaces.IMyClientProxy;
import com.mycompany.myteam.myappone.businesslogiclayer.MyOrchestrator;
import com.mycompany.myteam.myappone.businesslogiclayer.interfaces.IMyOrchestrator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("checkstyle:DesignForExtension") // @Configuration classes cannot be final :(
@Configuration
public class CompositionRootJavaConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompositionRootJavaConfig.class);

    @Bean
    public IMyOrchestrator getAnIMyOrchestrator(IMyClientProxy icp) {
        LOGGER.info("CompositionRootJavaConfig.getAnIMyOrchestrator fired");
        return new MyOrchestrator(icp);
    }

    @Bean
    public IMyClientProxy getAnIMyClientProxy() {
        LOGGER.info("CompositionRootJavaConfig.getAnIMyOrchestrator fired");
        return new MyClientProxyConcrete();
    }

}

