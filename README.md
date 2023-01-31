# gradle-multi-with-spring-bean-proof


Sample project.  This project is trying to figure out spring.bean.xml files in "other" gradle subproject(s)/modules in a gradle multi-module setup.


JDK11 was the JDK being used to develop.  That is a secondary concern.

Gradle-Wrapper file (and version) is available at:

    ./gradle/wrapper/gradle-wrapper.properties



startup class (with "main" method)

    source/java/myapproot/myapp-toplayer-console-di-xml-one/src/main/java/demo/SpringBootApplicationContextXmlConsoleApplication.java


gradle command line commands

    ./gradlew clean build

    ./gradlew myCustomPrintClasspathTask

    ./gradlew run




output of "gradlew run"


    Caused by: java.io.FileNotFoundException: ./source/java/myapproot/myapp-toplayer-console-di-xml-one/build/resources/main/clientproxy.one.di.xml (No such file or directory)
    at java.base/java.io.FileInputStream.open0(Native Method)
    at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
    at java.base/sun.net.www.protocol.file.FileURLConnection.connect(FileURLConnection.java:86)
    at java.base/sun.net.www.protocol.file.FileURLConnection.getInputStream(FileURLConnection.java:184)
    at org.springframework.core.io.UrlResource.getInputStream(UrlResource.java:187)
    at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:333)
    ... 32 more
