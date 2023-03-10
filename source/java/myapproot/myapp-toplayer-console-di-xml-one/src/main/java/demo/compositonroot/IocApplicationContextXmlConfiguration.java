package demo.compositonroot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/* the annotations drive this functionality */
@Configuration
@ImportResource({"classpath*:applicationContext.xml"})
public class IocApplicationContextXmlConfiguration {
}
