# C# test automation 

A comprehensive curated list of C# test automation frameworks, tools, libraries and software to help software engineers easily bootstrap test automation on C#. Sponsored by http://sdclabs.com

[![Have questions\issues\problems, join the chat at https://gitter.im/atinfo/awesome-test-automation](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/atinfo/awesome-test-automation)

Table of content:

- [xUnit frameworks](#xunit-frameworks)
- [TDD \ ATTD \ BDD](#tdd--atdd--bdd)
- [Code Analysis](#code-analysis)
- [Web UI test automation](#web-ui-test-automation)
- [Mobile test automation](#mobile-test-automation)
- [Windows UI test automation](#windows-ui-test-automation)
- [API automation](#api-automation)
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
- [DataBase test automation](#database-test-automation)

Also:

- [Resources](#resources)
- [Other Awesome Test Automation Lists](#other-awesome-test-automation-lists)
- [Contributing](#contributing)

---

## xUnit frameworks

* [NUnit](https://github.com/nunit/nunit) ― The most known, extensible and portable(yes, you can run your tests on Mono for Linux and Mac) unit-testing framework in the .Net world. It comes with descent test adapters for Visual Studio 2013 - ... as well as standalone GUI and command line runners
* [MSTest (Visual Studio Test)](https://docs.microsoft.com/en-us/dotnet/core/testing/unit-testing-with-mstest) ― the most conservative and slow evolving unit testing framework with only one good thing: it is built-in to the Visual Studio. So, you can always rely it is there.
* [xUnit](https://github.com/xunit/xunit) ― the "bleeding edge" unit testing framework, beloved by many developers, even from Microsoft. This is community based open source project, written by the original inventor of NUnit 2.0 
* [Gallio Icarus and MbUnit](https://code.google.com/p/mb-unit/) ― the most feature reach Test Runner, Test Reporter and Unit testing framework. It is still popular in many .NET shops, especially for running Selenium WebDriver UI tests... Unfortunately, it is not being maintained since 2012. :skull:

## TDD \ ATDD \ BDD
* [Fluent Assertions](http://www.fluentassertions.com/) is a set of .NET extension methods that allow you to more naturally specify the expected outcome of a TDD or BDD-style test.
``` csharp
string actual = "ABCDEFGHI";
actual.Should().StartWith("AB").And.EndWith("HI").And.Contain("EF").And.HaveLength(9);
```
* [SpecFlow](http://www.specflow.org/) ―  A pragmatic BDD solution for .NET. It uses the Gherkin specification language and integrates to Visual Studio.
* [SpecFlow.Selenium.Plugin](https://github.com/unickq/SpecFlow.Selenium.Plugin) ― SpecFlow plugin for Selenium instances generation over tags. Cucumber for dotnet
* [BDDfy](http://docs.teststack.net/bddfy/) - The simplest BDD framework for .Net EVER! The name comes from the fact that it allows you to turn your tests into BDD behaviors simply. 

## Code analysis 

* [NCover](https://www.ncover.com/) ― really good code coverage tool, but $$
* [OpenCover](https://github.com/OpenCover/opencover) is a code coverage tool for .NET 2 and above, support for 32 and 64 processes with both branch and sequence points
* [NCrunch](http://www.ncrunch.net/) - an automated concurrent testing tool for Visual Studio.
* See also: [Code Coverage for C#/.NET](http://stackoverflow.com/questions/276829/code-coverage-for-c-net)

## Web UI test automation

* [Selenium WebDriver](https://www.nuget.org/packages/Selenium.WebDriver) ― Yes! [WebDriver](http://www.seleniumhq.org/) is everywhere! This is the best and the most popular UI test automation library and infrastructure.
* [Atata](https://atata-framework.github.io/) ― An open source C#/.NET test automation full featured framework based on Selenium WebDriver. It uses fluent page object pattern with built-in logging. Atata Framework is extensible and contains a set of components, triggers and much more.
* Coded UI (deprecated :skull:) ($$$) (Internet Explorer only) ― Okay... it is integrated into the Visual Studio Premium+ and supports Record&Playback "automation". 
* [WatiN](http://watin.org/) ― Before the Selenium Webdriver appeared on the market, WatiN was one of the best Web UI automation frameworks for .NET.  Now it is not maintained. :skull:
* [Golem](https://github.com/ProtoTest/ProtoTest.Golem) Object Oriented C# Automated Testing Framework. Golem was created to simplify the process of creating enterprise-scale automated testing suites. It wraps around Gallio/MbUnit and a number of automation tools (such as Selenium-WebDriver) to provide the tester with a simple process for creating automated tests no matter what the tool. The inclusion of advanced features, diagnostic information, easy configuration, and enhanced API's helps Golem make automating in code-based automation tools much more practical. A standard test structure is enforced throughout the Golem framework to make the code readable and easy to reuse. Company behind it (ProtoTest) is in the process of winding down. Last commit was done in May, 2015.
* [Mailosaur](https://github.com/mailosaur/mailosaur-dotnet) - .NET client for email testing/automation via Mailosaur.
* [Ocaramba](https://github.com/ObjectivityLtd/Ocaramba) - Cross-Platform C# framework to automate tests using Selenium WebDriver. [Ocaramba.templates](https://github.com/ObjectivityLtd/Ocaramba.templates) Ocaramba project extension for Visual Studio - a set of project and class templates for web automated testing using Ocaramba Framework.


## Mobile test automation

* [Coded UI](https://msdn.microsoft.com/en-us/library/dn747198.aspx) (deprecated :skull:) supports some level of the mobile test automation 
for Windows Phone
* [Xamarin.UITest](http://developer.xamarin.com/guides/testcloud/uitest/) is a library that comes with Xamarin Forms and allows you to automate the applications built with Xamarin
technology on Windows Phone, iOS and Android
* [Appium](http://appium.io/) supports cross platform test automation for Native and Hybrid mobile applications
* [Testura.Android](https://github.com/Testura/Testura.Android) A lightweight test automation framework to test android applications. Easy to start and require minimum set up.

## Windows UI test automation 

* [Winium.Cruciatus](https://github.com/2gis/Winium.Cruciatus) is an open source C# Framework for automated testing of Windows application based on WinForms and WPF platforms.
* [Teststack White](https://github.com/TestStack/White) is one of the most popular and stable open source UI test automation library 
  for Windows (WinAPI / WPF / Silverlight / Windows Forms).
* Coded UI (deprecated :skull:) ($$$) does a pretty good job for Windows UI automation. Pricey... because it comes with Visual Studio Premium and Ultimate.
* [Cutie](https://github.com/icnocop/cuite) - CUITe (Coded UI Test enhanced) Framework is a thin layer developed on top of Microsoft Visual Studio Team Test's Coded UI 
* [AutoIt (COM bindings)](https://www.autoitscript.com/autoit3/docs/intro/ComRef.htm) ― since it implements COM+ interface, autoit can be available from any language on windows, including C#.
* [WebAii Testing Framework](http://www.telerik.com/teststudio/testing-framework) - Framework for cross-browser testing with native support for Telerik UI for ASP.NET AJAX, Silverlight, WPF, HTML5 and XAML applications, etc.
* [FlaUI](https://github.com/Roemer/FlaUI) - UI automation library for .Net. Rewritten White with UIA3, UIA2, MSAA support
* [Windows Application Driver](https://github.com/Microsoft/WinAppDriver) - Windows Application Driver is a service to support UI Test Automation of Windows Applications. The service design subscribes to the Mobile JSON Wire Protocol standard.

## API automtation

* [ApprovalTests](https://github.com/approvals/ApprovalTests.Net) - an open source assertion/verification library to aid unit testing. It is compatible with most .Net unit testing frameworks (Nunit, MsTest, xUnit, MBUnit)

## Virtual environments

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Performance & stress & load

[NBomber](https://github.com/PragmaticFlow/NBomber) – a modern and flexible load-testing framework for Pull and Push scenarios, designed to test any system regardless of a protocol (HTTP/WebSockets/AMQP, etc) or a semantic model (Pull/Push).

## Security checking

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Continuous Integration

* [Jenkins](http://jenkins-ci.org/) ― can be easily configured to support C# continuous integration process:
    1. Use NUnit as your test runner with [Jenkins NUnit Plugin](https://wiki.jenkins-ci.org/display/JENKINS/NUnit+Plugin)
    2. Use [Microsoft Build Tools](http://www.microsoft.com/en-us/search/result.aspx?q=%22Microsoft%20Build%20Tools%22&form=DLC) to build the project without Visual Studio
    3. Use Windows Batch files and / or Powershell to perform any system configuration tasks
    4. Use `msdeploy` from [Web Deploy Toolkit](http://www.iis.net/downloads/microsoft/web-deploy) in order to perform the remote 
       deployment and configuration tasks.
       
* [TeamCity](https://www.jetbrains.com/teamcity/) is a free and simple Build and Continuous integration server. You can 
run the C# tests just out of the box
* [Team Foundation Server] ― well... the marketing guys say that it can also build something for you

* [Appveyor](http://www.appveyor.com/) is free for open source projects and easy to use.

## Reporting

* [Allure](https://github.com/allure-framework/allure-csharp) - An open-source reporting library for test automation (NUnit 2 and MSTest adapters).
* [Allure SpecFlow](https://github.com/allure-framework/allure-csharp/tree/master/Allure.SpecFlowPlugin) - Allure SpecFlow Plugin
* [Allure NUnit](https://github.com/unickq/allure-nunit) - Allure NUnit plugin
* [ReportPortal](http://reportportal.io/) - Full-featured result management tool for clients, managers & test automation engineers (NUnit 2, Nunit 3 and SpecFlow adapters).
* [ExtentReports](http://extentreports.relevantcodes.com) - An open-source reporting library for test automation.
* [GHPReporter](http://ghpreporter.github.io/) - An open-source .NET test reporting tool for several testing frameworks (supports NUnit 3, MSTest and SpecFlow).

## Documentation generation

* [Doxygen](http://www.stack.nl/~dimitri/doxygen/) is a free and open source documentation generation platform, that supports multiple languages. 
You may write a standard C# XML documentation ― and Doxygen will process it correctly; Yo may use markdown and include images ― Doxygen can handle even more.
Grab and modify this [Doxyfile for C#](https://github.com/dzharii/SWD.Starter/blob/master/Doxyfile)
* [Wyam](https://wyam.io/) Static site generator with built-in capability to generate API documentation from .NET library metadata and XML documentation.

## Editors, IDE, consoles

* [Free Visual Studio Community Edition](http://www.visualstudio.com/en-us/news/vs2013-community-vs.aspx) ― starting from VS2013, 
Visual Studio Professional is became free for small teams. 
* [Sharpdevelop](http://www.icsharpcode.net/opensource/sd/) is a free and open source IDE for C#
* [Visual Studio Code](https://code.visualstudio.com/) is a free and cross-platform IDE 

## Useful libs

* [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) is a popular high-performance JSON framework for .NET
* [RestSharp](https://www.nuget.org/packages/RestSharp/) ― simple REST and HTTP API Client
* [XMLUnit](http://www.xmlunit.org/) - testing and comparing XML output for Java and .NET

## DataBase test automation
* [DBTestCompareGenerator](https://github.com/ObjectivityLtd/DBTestCompareGenerator) - Tool for generating database tests that can be run with [DBTestCompare](https://github.com/ObjectivityLtd/DBTestCompare).
* [NBi](https://github.com/Seddryck/NBi) - NBi is a testing framework (add-on to NUnit) for Business Intelligence. It supports most of the relational databases (SQL server, MySQL, postgreSQL ...) and OLAP platforms (Analysis Services, Mondrian ...) but also ETL and reporting components (Microsoft technologies).

# Resources
Where to discover new libraries, information, tools, etc.

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
* [kotlin test automation](https://github.com/atinfo/awesome-test-automation/blob/master/kotlin-test-automation.md) 
* [test automation and software testing as services](https://github.com/atinfo/awesome-test-automation/blob/master/automation-and-testing-as-service.md) 
* [mobile, tablet and tv test automation](https://github.com/atinfo/awesome-test-automation/blob/master/mobile-test-automation.md)
* [general purpose test automation tools](https://github.com/atinfo/awesome-test-automation/blob/master/general-purpose-test-automation-tools.md)

Also we are supporting and looking for contribution for project:

* [practical test automation by examples](https://github.com/atinfo/at.info-knowledge-base)


# [Contributing](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)
Your contributions are always welcome!
