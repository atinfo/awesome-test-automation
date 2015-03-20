# Java test automation 

A comprehensive curated list of Java test automation frameworks, tools, libraries and software to help software engineers easily bootstrap test automation on Java.

Table of content:

- [xUnit frameworks](#xunit-frameworks)
- [TDD \ ATTD \ BDD](#tdd--atdd--bdd)
- [Model-Based Testing](#model-based-testing)
- [Code Analysis](#code-analysis)
- [Web UI test automation](#web-ui-test-automation)
- [Mobile test automation](#mobile-test-automation)
- [Windows UI test automation](#windows-ui-test-automation)
- [Unix \ Linux UI test automation](#unix--linux-ui-test-automation)
- [MacOS UI test automation](#macos-ui-test-automation)
- [Server side test automation](#server-side-test-automation)
- [Virtual environments](#virtual-environments)
- [Performance & stress & load](#performance--stress--load)
- [Security checking](#security-checking)
- [Build Tools](#build-tools)
- [Continuous Integration](#continuous-integration)
- [Reporting](#reporting)
- [Documentation generation](#documentation-generation)
- [Editors, IDE and consoles](#editors-ide-consoles)
- [ORM frameworks and libraries](#orm-frameworks-and-libraries)
- [Useful libs](#useful-libs)

Also:

- [Resources](#resources)
- [Other Awesome Test Automation Lists](#other-awesome-lists)
- [Contributing](#contributing)

---

## xUnit frameworks

* [JUnit](http://junit.org/) - Common testing framework.
* [TestNG](http://testng.org/) - TestNG - Testing framework.

## TDD \ ATDD \ BDD

- tools
    * [JBehave](http://jbehave.org/) - A framework for Behaviour-Driven Development (BDD). BDD is an evolution of test-driven development (TDD) and acceptance-test driven design, and is intended to make these practices more accessible and intuitive to newcomers and experts alike.
    * [Cucumber-JVM](https://github.com/cucumber/cucumber-jvm) - A pure Java implementation of Cucumber that supports the most popular programming languages for the JVM.
    * [easyb](http://easyb.org/) - A behavior driven development framework for the Java platform. By using a specification based Domain Specific Language, easyb aims to enable executable, yet readable documentation.
    * [Robot Framework](http://robotframework.org/) - A generic test automation framework for acceptance testing and acceptance test-driven development (ATDD).
- extensions
    * [cucumber-report-db](https://github.com/porscheinformatik/cucumber-report-db) - Stores results of BDD tests with Cucumber-JVM in a database and provides reporting capabilities.

## Model-Based Testing

- [GraphWalker](http://graphwalker.org/) - A framework for Model-Based Testing. The tool reads models in various formats like graphml, dot or json, and then generates tests from the models.

## Code analysis 

* [SonarQube](http://www.sonarqube.org/) - Open source project to manage code quality.

## Web UI test automation

- libraries
    * [Selenium](http://docs.seleniumhq.org/) - Portable software testing framework for web applications.
    * [SikuliX](http://www.sikulix.com/) - SikuliX automates anything you see on the screen of your desktop computer running Windows, Mac or some Linux/Unix. It uses image recognition powered by OpenCV to identify and control GUI components. This is handy in cases when there is no easy access to a GUI's internals or the source code of the application or web page you want to act on.
- frameworks and wrappers
    * [Selenide](http://selenide.org/) - Concise API around Selenium to write stable and readable UI tests.
    * [Thucydides](http://www.thucydides.info/) - An innovative open source library that helps you write more effective automated acceptance tests, and uses these acceptance tests to generates rich documentation and reports about your product and project.
    * [htmlelements](https://github.com/yandex-qatools/htmlelements) - A Java framework providing easy-to-use way of interaction with web-page elements in web-page tests.
    * [atlassian-selenium](https://bitbucket.org/atlassian/atlassian-selenium) - An open-source (BSD) project that aims at facilitating development of functional tests in Selenium/WebDriver libraries.
- extensions
    * [BrowserMob Proxy](https://github.com/lightbody/browsermob-proxy) - Is a simple utility that makes it easy to capture performance data from browsers, typically written using automation toolkits such as Selenium and Watir.
- IDE plugins
    * [IntelliJ IDEA Selenium plugin](http://perfect-test.com/index.php/ru/instruments-rus-menu/15-selenium-plugin-rus) - Plugin for IntelliJ Idea to simplify creation of web tests using selenium 
## Mobile test automation

* [Appium](http://appium.io/) - An open source test automation framework for use with native, hybrid and mobile web apps. It drives iOS and Android apps using the WebDriver protocol.
* [Calabash](http://calaba.sh/) - A cross-platform test automation framework for Android and iOS native and hybrid applications. Calabash’s easy-to-understand syntax enables even non-technical people to create and execute automated acceptance tests for apps on both of these mobile platforms.
* [Robotium](https://code.google.com/p/robotium/) - An Android test automation framework that fully supports native and hybrid applications. Robotium makes it easy to write powerful and robust automatic black-box UI tests for Android applications. With the support of Robotium, test case developers can write function, system and user acceptance test scenarios, spanning multiple Android activities.
* [UIautomator](http://developer.android.com/tools/help/uiautomator/index.html) - Provides an efficient way to test UIs. It creates automated functional test cases that can be executed against apps on real Android devices and emulators. It includes a viewer, which is a GUI tool to scan and analyze the UI components of an Android app.
* [Espresso](https://code.google.com/p/android-test-kit/wiki/Espresso) - A pretty new test automation framework that got open-sourced just last year, making it available for developers and testers to hammer out their UIs. Espresso has an API that is small, predictable, easy to learn and built on top of the Android instrumentation framework. You can quickly write concise and reliable Android UI tests with it.

## Windows UI test automation 

* [SikuliX](http://www.sikulix.com/) - SikuliX automates anything you see on the screen of your desktop computer running Windows, Mac or some Linux/Unix. It uses image recognition powered by OpenCV to identify and control GUI components. This is handy in cases when there is no easy access to a GUI's internals or the source code of the application or web page you want to act on.

## Unix \ Linux UI test automation 

* [SikuliX](http://www.sikulix.com/) - SikuliX automates anything you see on the screen of your desktop computer running Windows, Mac or some Linux/Unix. It uses image recognition powered by OpenCV to identify and control GUI components. This is handy in cases when there is no easy access to a GUI's internals or the source code of the application or web page you want to act on.

## MacOS UI test automation 

* [SikuliX](http://www.sikulix.com/) - SikuliX automates anything you see on the screen of your desktop computer running Windows, Mac or some Linux/Unix. It uses image recognition powered by OpenCV to identify and control GUI components. This is handy in cases when there is no easy access to a GUI's internals or the source code of the application or web page you want to act on.

## Server side test automation

* [Citrus](https://github.com/christophd/citrus) - Test framework written in Java that is able to create fully automated end-to-end use case tests for enterprise SOA applications. Citrus simulates surrounding interface partners supporting a huge set of different transports and protocols like HTTP, JMS, TCP/IP, FTP, SOAP, XML and JSON.

## Virtual environments

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Performance & stress & load

* [Apache JMeter](http://jmeter.apache.org/) - Functional testing and performance measurements.
* [The Grinder](http://grinder.sourceforge.net/) - Load testing framework that makes it easy to run a distributed test using many load injector machines. 

## Security checking

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Build Tools

* [Apache Ant](http://ant.apache.org/) - Apache Ant is a Java library and command-line tool whose mission is to drive processes described in build files as targets and extension points dependent upon each other. The main known usage of Ant is the build of Java applications.
* [Apache Maven](http://maven.apache.org/) - Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.
* [Gradle](https://gradle.org/) - Gradle is an open source build automation system. Gradle can automate the building, testing, publishing, deployment and more of software packages or other types of projects such as generated static websites, generated documentation or indeed anything else.

## Continuous Integration

* [Jenkins](http://jenkins-ci.org/) - Jenkins is an award-winning application that monitors executions of repeated jobs, such as building a software project or jobs run by cron.
* [TeamCity](https://www.jetbrains.com/teamcity/) - Powerful and user-friendly Continuous Integration and Deployment server that works out of the box.

## Reporting

* [ReportNG](http://reportng.uncommons.org/) - ReportNG is a simple HTML reporting plug-in for the TestNG unit-testing framework.
* [Allure](http://allure.qatools.ru/) - Open-source framework designed to create test execution reports clear to everyone in the team.

## Documentation generation

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Editors, IDE, consoles

* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - A free and open-source IDE for Java, Groovy, Scala and Android development.
* [Eclipse](https://eclipse.org/ide/) - Eclipse is famous for our Java Integrated Development Environment (IDE), C/C++ IDE and PHP IDE.
* [NetBeans](https://netbeans.org/features/index.html) - NetBeans IDE is the official IDE for Java 8. With its editors, code analyzers, and converters, you can quickly and smoothly upgrade your applications to use new Java 8 language constructs, such as lambdas, functional operations, and method references.

## ORM frameworks and libraries

* [Hibernate](http://hibernate.org/orm/) - Hibernate ORM enables developers to more easily write applications whose data outlives the application process. As an Object/Relational Mapping (ORM) framework, Hibernate is concerned with data persistence as it applies to relational databases (via JDBC).
* [Morphia](https://github.com/mongodb/morphia) - Morphia is a lightweight type-safe library for mapping Java objects to/from MongoDB. Morphia provides a typesafe, and fluent Query API support with (runtime) validation. Morphia uses annotations so there are no XML files to manage or update. Morphia should feel very comfortable for any developer with JPA experience.

## Useful libs

* [AspectJ](https://eclipse.org/aspectj/) - Seamless aspect-oriented extension to the Java. AspectJ enables clean modularization of crosscutting concerns, such as error checking and handling, synchronization, context-sensitive behavior, performance optimizations, monitoring and logging, debugging support, and multi-object protocols.
* [aShot](https://github.com/yandex-qatools/ashot) - WebDriver Screenshot utility. Take screenshots, crop, prettify, compare.
* [rest-assured](https://code.google.com/p/rest-assured/) - Testing and validating REST services in Java is harder than in dynamic languages such as Ruby and Groovy. REST Assured brings the simplicity of using these languages into the Java domain.

# Resources
* [Thucydides libraries](http://thucydides.info/docs/thucydides-one-page/thucydides.html)
* [Automation tests structure](http://habrahabr.ru/post/168451/)

## Websites

* [automated-testing.info](http://automated-testing.info) - Test automation community
* [atinfo.github.io/at.info-knowledge-base](http://atinfo.github.io/at.info-knowledge-base/)  - Knowledge base for test automation examples on different tools and technologies

# Other Awesome Test Automation Lists

* [python test automation](https://github.com/atinfo/awesome-test-automation/blob/master/python-test-automation.md)
* [java test automation](https://github.com/atinfo/awesome-test-automation/blob/master/java-test-automation.md)
* [ruby test automation](https://github.com/atinfo/awesome-test-automation/blob/master/ruby-test-automation.md)
* [c# test automation](https://github.com/atinfo/awesome-test-automation/blob/master/c%23-test-automation.md)
* [php test automation](https://github.com/atinfo/awesome-test-automation/blob/master/php-test-automation.md)
* [javascript test automation](https://github.com/atinfo/awesome-test-automation/blob/master/javascript-test-automation.md)
* [test automation and software testing as services](https://github.com/atinfo/awesome-test-automation/blob/master/automation-and-testing-as-service.md)

# [Contributing](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)
Your contributions are always welcome!
