# General purpose test automation tools

A comprehensive curated list of general purpose test automation tools (or 'universal tools' that suite to different applications and languagues) to help software engineers easily bootstrap test automation and software testing. Sponsored by http://sdclabs.com

[![Have questions\issues\problems, join the chat at https://gitter.im/atinfo/awesome-test-automation](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/atinfo/awesome-test-automation)

Table of content:

- [Functional Testing](#functional-testing)
- [Performance and load testing](#performance-and-load-testing)
- [Security testing](#security-testing)
- [REST API testing](#api-testing)
- [Test design](#test-design)
- [Test management](#test-management)
- [Web UI test automation](#web-ui-test-automation)
- [Windows GUI automation](#windows-gui-automation)

Also:

- [Resources](#resources)
- [Other Awesome Test Automation Lists](#other-awesome-test-automation-lists)
- [Contributing](#contributing)

---

## Functional testing
* [gauge](https://gauge.org/) Lightweight cross-platform test automation.
* [STAF](http://staf.sourceforge.net/) The Software Testing Automation Framework (STAF) is an open source, multi-platform, multi-language framework designed around the idea of reusable components, called services (such as process invocation, resource management, logging, and monitoring). STAF removes the tedium of building an automation infrastructure, thus enabling you to focus on building your automation solution. The STAF framework provides the foundation upon which to build higher level solutions, and provides a pluggable approach supported across a large variety of platforms and languages.
* [Cerberus](https://github.com/cerberustesting/cerberus-source) is a low-code software testing automation enabling continuous testing at scale. The solution allows the collaboration of the teams from the use-cases definition to the test case execution on the variety of browsers, devices, apps and APIs. It supports various integrations for speed of implementation such as Jenkins, Bitbucket,  Slack, Kafka. It is available and maintained in open-source by various digital and retail players such as La Redoute, Decathlon, Adeo, Norauto.
* [OpenTest](https://getopentest.org/) OpenTest is an open source functional test automation tool for web applications, mobile apps and REST APIs, maintained by McDonald's. OpenTest requires little to no coding skills but does provide the ability to seamlessly embed JavaScript code into the test logic to cater to complex scenarios.
* [RobotFramework](http://robotframework.org/) Robot Framework is a generic test automation framework for acceptance testing and acceptance test-driven development (ATDD).
* [Ranorex](http://www.ranorex.com/) - Ranorex is a GUI test automation framework for testing of desktop, web-based and mobile applications. Ranorex is provided by Ranorex GmbH, a software development company for innovative software test automation solutions.
* [TestComplete](https://smartbear.com/product/testcomplete/overview/) - TestComplete is a functional automated testing platform developed by SmartBear Software. TestComplete gives testers the ability to create automated tests for Microsoft Windows, Web, Android (operating system), and iOS applications.
* [HP Unified Functional Testing (UFT), formerly known as (QTP)](http://www8.hp.com/us/en/software-solutions/unified-functional-automated-testing/index.html) - HP Unified Functional Testing is automated testing software designed for testing various software applications and environments.
* [Puppetry](https://puppetry.app/) - Puppetry is an open-source scriptless test automation tool built on top of Google’s Puppeteer. It can be used by QA engineers with no programming background. Puppetry can also export the tests into a Jest.js project, so they can be  included into CI/CD pipeline.
* [Testsigma](https://testsigma.com/) - Testsigma is an AI-Driven Test Automation Ecosystem for Web, Mobile Web, Android & iOS Apps, and API automated testing on Microsoft Windows, Mac and Linux Operating Systems. No coding skills required.
* [Touca.io](https://github.com/trytouca/trytouca) - Touca is an open source continuous regression testing system for engineering teams, especially useful for testing complex workflows with no web interface. Get feedback when you write code that could break your software.
* [VIVIDUS](https://docs.vividus.dev/) - a test automation tool that offers already implemented solution for testing of most popular application types. No coding skills are required.

## Web UI test automation
* [Ggr](https://github.com/aandryashin/ggr) - active load balancer to create scalable and highly-available Selenium cluster.
* [Selenoid](https://github.com/aandryashin/selenoid) - alternative Selenium Hub running browsers within containers.
* [RedwoodHQ](https://github.com/dmolchanenko/RedwoodHQ) - RedwoodHQ is a free Open Source test automation framework that allows multiple users to develop automation code, create readable action/keyword driven test cases and execute them all under a single Web interface.

## API testing

* [Postman REST Client](https://www.npmjs.com/package/postman-bdd) - The Postman REST client allows you to write tests for your APIs, such as ensuring that your endpoints return the proper HTTP status codes, headers, and content. It even has has a built-in test runner that makes it easy to run all of your tests and immediately see the results. And you can use the Newman command-line tool to automate your tests and integrate them into your CI and deployment pipeline.
* [StREST](https://github.com/eykrehbein/strest) - StREST is an open-source tool to set up tests for REST api's in seconds with YAML configuration files. StREST allows you to connect multiple requests by using values from previous requests in future requests. StREST also gives you a flexible validation framework for responses, allows using special headers, and can be configured to test APIs with random input or env vars.
* [SoapUI](https://www.soapui.org/) - SoapUI is an open-source web service testing application for service-oriented architectures (SOA) and REST. Its functionality covers web service inspection, invoking, development, simulation and mocking, functional testing, load and compliance testing.
* [Rapise](https://www.inflectra.com/Rapise/) - Rapise is GUI based tool. Rapise's unique Learn and Go testing method is much more time efficient than traditional record-and-playback processes.
* [Restlet Client](https://chrome.google.com/webstore/detail/restlet-client-rest-api-t/aejoelaoggembcahagimdiliamlcdmfm) - Restlet Client (formerly known as DHC) allows you to interact with REST services. It brings many different features that make your user experience better, save you precious time when debugging HTTP calls or sharing your requests with others.
* [Beeceptor](https://beeceptor.com) - Beeceptor is an HTTP proxy for intercepting and mocking API calls selectively. E.g. assume api 'A' has a downstream api 'B', how do simulate B's responses for validating 'A'. Beeceptor also helps in performance testing 'A' by mocking all calls of 'B' and not impacting downstream services.
* [Swagger](https://swagger.io/) - Swagger is the open-source framework of API developer tools for the OpenAPI Specification(OAS), enabling development across the entire API lifecycle, from design and documentation, to test and deployment.
* [Schemathesis](https://github.com/kiwicom/schemathesis) - Schemathesis is a tool for property-based testing of applications based on Open API & Swagger specs. It reads the application schema and generates test cases which will ensure that your application is compliant with its schema.
* [GMeter](https://github.com/hexdigest/gmeter) - GMeter is an open-source standalone HTTP reverse-proxy server for recording and replaying HTTP requests. GMeter allows you to record multiple HTTP requests made within one test case to a "cassette" and to use this cassette to mock downstream service later on.
* [Insomnia](https://insomnia.rest/) provides workflows and tools to make API Development Easier.
* [Apitest](https://github.com/sigoden/apitest) - Apitest is declarative api testing tool with JSON-like DSL for easy testing of REST services.
* [vREST NG](https://vrest.io) is a zero code API automation solution for functional and regression testing of your APIs. It will help you to efficiently develop your test suites using record/replay, excel sheets (data driven testing) and allow you to derive your API testing using Swagger or OpenAPI specs.

## Performance and load testing
* [Apache Jmeter](https://jmeter.apache.org/) - The most popular Open Source tool for load testing for web and other protocols.
* [k6](https://github.com/loadimpact/k6) - Like unit testing, for performance. A modern load testing tool, using Go and JavaScript.
* [LoadComplete](https://smartbear.com/product/loadcomplete/overview/) - LoadComplete is a desktop tool for load, stress, scalability testing of websites and web applications. Designed from the ground-up to help you focus on the tasks at hand, it does not require advanced programming skills. It works with both traditional HTML web sites and with Rich Internet Applications using modern web technologies like AJAX, ASP.NET, Java, Flash, Flex and Silverlight. The licensing policy is based on the number of virtual users required for the load testing.

## Security testing

* [OWASP Glue](https://github.com/OWASP/glue) - Glue is a framework for running a series of tools. Generally, it is intended as a backbone for automating a security analysis pipeline of tools.
* [Cloudquery](https://github.com/cloudquery/cloudquery) - Cloudquery transforms your cloud infrastructure to relational database. Giving you the power to run security and compliance checks with SQL statements.
* [Burp Suite](https://portswigger.net/burp) it is a platform for performing web application security testing.

## Windows GUI automation

* [AutoIt](https://www.autoitscript.com/site/) - AutoIt v3 is a freeware BASIC-like scripting language designed for automating the Windows GUI and general scripting. It uses a combination of simulated keystrokes, mouse movement and window/control manipulation in order to automate tasks.

## Test design

* [PICT (Pairwise Independent Combinatorial Testing)](https://github.com/Microsoft/pict) - PICT generates test cases and test configurations. With PICT, you can generate tests that are more effective than manually generated tests and in a fraction of the time required by hands-on test case design.

## Test management

* [Testomat.io](https://testomat.io/) - test management and reporting system for javascript automated tests

# Resources
Where to discover new libraries, information, tools, etc.

## Websites

* [automated-testing.info](http://automated-testing.info) - Test automation community
* [atinfo.github.io/at.info-knowledge-base](http://atinfo.github.io/at.info-knowledge-base/)  - Knowledge base for test automation examples on different tools and technologies
* [Testomat.io](https://testomat.io/) - test management and reporting system for automated tests

# Other Awesome Test Automation Lists

* [python test automation](https://github.com/atinfo/awesome-test-automation/blob/master/python-test-automation.md)
* [java test automation](https://github.com/atinfo/awesome-test-automation/blob/master/java-test-automation.md)
* [ruby test automation](https://github.com/atinfo/awesome-test-automation/blob/master/ruby-test-automation.md)
* [c# test automation](https://github.com/atinfo/awesome-test-automation/blob/master/c%23-test-automation.md)
* [php test automation](https://github.com/atinfo/awesome-test-automation/blob/master/php-test-automation.md)
* [javascript test automation](https://github.com/atinfo/awesome-test-automation/blob/master/javascript-test-automation.md)
* [kotlin test automation](https://github.com/atinfo/awesome-test-automation/blob/master/kotlin-test-automation.md)
* [test automation and software testing as services](https://github.com/atinfo/awesome-test-automation/blob/master/automation-and-testing-as-service.md)
* [mobile, tablet and tv test automation](https://github.com/atinfo/awesome-test-automation/blob/master/mobile-test-automation.md)
* [general purpose test automation tools](https://github.com/atinfo/awesome-test-automation/blob/master/general-purpose-test-automation-tools.md)

Also we are supporting and looking for contribution for project:

* [practical test automation by examples](https://github.com/atinfo/at.info-knowledge-base)


# [Contributing](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)
Your contributions are always welcome! [Contribute](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)
