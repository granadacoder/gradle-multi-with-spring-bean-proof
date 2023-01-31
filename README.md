# gradle-multi-with-spring-bean-proof


Sample project.  This project is trying to figure out spring.bean.xml files in "other" gradle subproject(s)/modules in a gradle multi-module setup.


JDK11 was the JDK being used to develop.  That is a secondary concern.

Gradle-Wrapper file (and version) is available at:

    ./gradle/wrapper/gradle-wrapper.properties



startup class (with "main" method)

    source/java/myapproot/myapp-toplayer-console-di-xml-one/src/main/java/demo/SpringBootApplicationContextXmlConsoleApplication.java


gradle command line commands

    ./gradlew clean build

    ./gradlew printClasspath

    ./gradlew run




output of "gradlew run"


    [main] INFO demo.SpringBootApplicationContextXmlConsoleApplication - Started SpringBootApplicationContextXmlConsoleApplication in 1.724 seconds (JVM running for 2.054)
    [main] INFO demo.SpringBootApplicationContextXmlConsoleApplication - EXECUTING : command line runner
    [main] INFO demo.SpringBootApplicationContextXmlConsoleApplication - START : runPatientDemo
    [main] INFO demo.SpringBootApplicationContextXmlConsoleApplication - getPatientKey='ExamplePatientKeyXmlTopLayerP123'
    [main] INFO demo.SpringBootApplicationContextXmlConsoleApplication - END : runPatientDemo
    [main] INFO demo.SpringBootApplicationContextXmlConsoleApplication - END : runPatientDemo
    [main] INFO demo.SpringBootApplicationContextXmlConsoleApplication - APPLICATION FINISHED
