# PHP test automation 

A comprehensive curated list of PHP test automation frameworks, tools, libraries and software to help software engineers easily bootstrap test automation on PHP. Sponsored by http://sdclabs.com

[![Have questions\issues\problems, join the chat at https://gitter.im/atinfo/awesome-test-automation](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/atinfo/awesome-test-automation)

Table of content:

- [xUnit frameworks](#xunit-frameworks)
- [TDD \ ATTD \ BDD](#tdd--atdd--bdd)
- [Code Analysis](#code-analysis)
- [Web UI test automation](#web-ui-test-automation)
- [Mobile test automation](#mobile-test-automation)
- [Windows UI test automation](#windows-ui-test-automation)
- [Unix \ Linux UI test automation](#unix--linux-ui-test-automation)
- [MacOS UI test automation](#macos-ui-test-automation)
- [Virtual environments](#virtual-environments)
- [Performance & stress & load](#performance--stress--load)
- [Security checking](#security-checking)
- [Continuous Integration](#continuous-integration)
- [Reporting](#reporting)
- [Documentation generation](#documentation-generation)
- [Editors, IDE and consoles](#editors-ide-consoles)
- [Useful libs](#useful-libs)

Also:

- [Resources](#resources)
- [Other Awesome Test Automation Lists](#other-awesome-test-automation-lists)
- [Contributing](#contributing)

---

## xUnit frameworks

* [PHPUnit](https://phpunit.de/) - Most known testing frameworks based on xUnit architecture. Full line coverage, pathc coverage, extended reports and even hhvm are pre-built.
* [Atoum](https://github.com/atoum/atoum) - Lightweight PHP unit testing framework with simple report generation.
* [Infection](https://infection.github.io/) - AST based PHP Mutation Testing Framework.

## Mock frameworks

* [php-vfs](http://thornag.github.io/php-vfs/) - Virtual filesystem provider
* [adlawson/vfs](https://github.com/adlawson/php-vfs) - Another virtual filesystem provider
* [vfsStream](https://github.com/mikey179/vfsStream) - A stream wrapper for a virtual file system that may be helpful in unit tests to mock the real file system. It can be used with any unit test framework, like PHPUnit or SimpleTest.
* [Mockery](https://github.com/padraic/mockery) - Objects mocking and method call assertions framework
* [Prophecy](https://github.com/phpspec/prophecy) - Object mocking framework for PHP.
* [Phake](https://github.com/mlively/Phake) - Mock php objects, test doubles and method stubs, inspired by Mockito for Java.
* [Codeception's AspectMock](https://github.com/Codeception/AspectMock) - AspectMock allows you to stub and mock practically anything in your PHP code.

## TDD \ ATDD \ BDD

- BDD
    * [Behat](https://github.com/Behat/Behat) - BDD framework for PHP to help you test business expectations.
    * [Codeception](http://codeception.com) - BDD-styled PHP testing framework; Selenium WebDriver integration, Symfony2, Laravel4, Yii, Phalcon, Zend Framework support; PageObjects and StepObjects included, BDD-style readable tests, powered by PHPUnit, API testing: REST,SOAP,XML-RPC; Facebook API testing; Data Cleanup; HTML, XML, TAP, JSON reports; CodeCoverage and Remote CodeCoverage; Parallel Execution, etc
    * [phpspec](http://www.phpspec.net/en/stable/) - Tool which can help you write clean and working PHP code using behaviour driven development or BDD.

## Code analysis 

* [PHP Mess Detector](http://phpmd.org/) - Static analysis tool that finds long method names, methods with excessive cyclomatic complexity, etc. 
* [PHP Code Sniffer](https://github.com/squizlabs/PHP_CodeSniffer) - Standard/convention violation checker
* [PHP Dead Code Detector](https://github.com/sebastianbergmann/phpdcd) - Unused code locator
* [PHP DocBlock Checker](https://github.com/Block8/php-docblock-checker) - Simple tool that checks focblock presence
* [PHP Parallel Lint](https://github.com/JakubOnderka/PHP-Parallel-Lint) - Simple lint checker
* [PDepend](http://pdepend.org/) - Complex metrics analyzer
* [PHP Lines Of Code](https://github.com/sebastianbergmann/phploc) - Project sizing analyzer

## Web UI test automation

* [Facebook php-webdriver](https://github.com/facebook/php-webdriver) - Facebook supported PHP webdriver bindings
* [Element-34 php-webdriver](https://github.com/facebook/php-webdriver) - Fork of Facebook PHP webdriver with  WebDriverWait implementation and available via PEAR
* [BeHat's Mink](http://mink.behat.org/en/latest/) - An open source browser controller/emulator for web applications
* [saunter.php](https://github.com/Element-34/saunter.php) - Selenium Page Objects implementation in PHP
* [Mailosaur](https://github.com/mailosaur/mailosaur-php) - PHP client for email testing/automation via Mailosaur.
   
## Mobile test automation

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Windows UI test automation 

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Unix \ Linux UI test automation 

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## MacOS UI test automation 

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Virtual environments

* [Vagrant](https://vagrantup.com) - Configuration-driven virtual machines
* [Docker](https://www.docker.com/) - Ultimate containerization tool 

## Performance & stress & load

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Security checking

* [SensioLabs Security Checker](https://github.com/sensiolabs/security-checker) - Command line tool that checks if 
your application uses dependencies with known security vulnerabilities. It uses the [SensioLabs Security Check Web 
service](http://security.sensiolabs.org/) and the [Security Advisories Database](https://github.com/FriendsOfPHP/security-advisories).

## Continuous Integration

* [PHPCI](https://www.phptesting.org/) - Free and open source continuous integration tool specifically designed for PHP.
* [PHP Censor](https://github.com/php-censor/php-censor) - Open source self-hosted continuous integration server for PHP projects.
* [Jenkins PHP project template](http://jenkins-php.org/) - The goal of this project is to provide a standard template for Jenkins jobs for PHP projects.
* [Sismo](https://sismo.symfony.com/) - Unlike more "advanced" Continuous Integration Servers (like Jenkins), Sismo does not try to do more than getting your code, running your tests, and send you notifications.

## Reporting

* [ReportPortal.io](http://ReportPortal.io) - [BeHat](https://github.com/reportportal/agent-php-Behat) powerfull results management and analytics for test automation reports. Powered with Machine Learning. Real-time integration and reports, visualization of trends and statistics, custom dashboards and widgets, gives you real visibility into the state of test automation. Integral part of CI/CD with TA and Continous Testing. Server-client application, can be used for any type of automated tests. Free and OpenSourced, [GitHub link](https://github.com/reportportal).
* [Allure Framework](http://allure.qatools.ru/) - Allure Framework is a framework that provides rich and
beautiful reports with extended possibilities like screenshot capturing. Allure
provides plugins for [Codeception](https://github.com/allure-framework/allure-codeception)
and [PHPUnit](https://github.com/allure-framework/allure-phpunit).

## Documentation generation

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Editors, IDE, consoles

* [PhpStorm](https://www.jetbrains.com/phpstorm/) - PHP IDE with highlighting, code analyzer, debugging features, all kinds of repositories and many others.
* [ZendStudio](http://www.zend.com/en/products/studio) - PHP IDE from PHP creators' company, multiply features + different js frameworks supports.
* [NetBeans](https://netbeans.org/features/php/) - Open source free PHP IDE.
* [Aptana](http://www.aptana.com/) - Another free IDE.

## Useful libs

* [PHP CS Fixer](http://cs.sensiolabs.org/) - tool for automatic convention violations correction

# Resources

Where to discover new libraries, information, tools, etc.

## Websites

* [automated-testing.info](http://automated-testing.info) - Test automation community
* [atinfo.github.io/at.info-knowledge-base](http://atinfo.github.io/at.info-knowledge-base/)  - Knowledge base for test automation examples on different tools and technologies
* [PHP QA Toolchain](http://phpqatools.org/) - website with reference of most frequently used QA tools

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
Your contributions are always welcome!
