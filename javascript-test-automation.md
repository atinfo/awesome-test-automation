# JavaScript test automation 

A comprehensive curated list of JavaScript test automation frameworks, tools, libraries and software to help software engineers easily bootstrap test automation on JavaScript. Sponsored by http://sdclabs.com

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

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## TDD \ ATDD \ BDD

- BDD/TDD
    * [WebdriverIO](http://webdriver.io/) - Nodejs webdriver bindings implementation, based on JsonWire protocol. Requires selenium server running. Includes promises, extended syntax, asynchronus calls with callbacks etc. Also supports SauceLabs, BrowserStack and many other online tools.
    * [WebdriverJS](https://github.com/SeleniumHQ/selenium/wiki/WebDriverJs) - webdriver nodejs implemetations from authors of selenium, includes all basic features and commands.
    * [MochaJS](http://mochajs.org/) - feature-rich JavaScript test framework running on node.js and the browser.
    * [Intern](https://theintern.github.io/) - is a complete test stack for JavaScript designed to help you write and run consistent, high-quality test cases for your JavaScript libraries and applications. It can be used to test any JavaScript code. Its functional testing capabilities can even be used to test non-JavaScript Web and mobile apps, if you really want.
    * [CodeceptJS](http://codecept.io/) - Modern era acceptance testing for NodeJS
	* [Chai](http://chaijs.com/) - Chai is a BDD / TDD assertion library for node and the browser that can be delightfully paired with any javascript testing framework
- TDD
    * [Karma](http://mochajs.org/) - test runner for making TDD much easier by pre-build test environments.
- BDD
    * [Jasmine](http://jasmine.github.io/) - Behavior Driven Development testing framework for JavaScript. It does not rely on browsers, DOM, or any JavaScript framework. Thus it's suited for websites, Node.js projects, or anywhere that JavaScript can run.
    * [CucumberJS](https://github.com/cucumber/cucumber-js) - Cucumber is a tool for running automated tests written in plain language.Cucumber.js is the JavaScript implementation of Cucumber and runs on both Node.js and modern web browsers.

## Mock frameworks
* [Sinon.JS](http://sinonjs.org/) - Standalone test spies, stubs and mocks for JavaScript.
No dependencies, works with any unit testing framework.
* [JSMockito](http://jsmockito.org/) - JsMockito is a JavaScript stub/mock framework heavily inspired by java's Mockito.
* [apimocker](https://github.com/gstroup/apimocker) - This is a node.js module to run a simple http server, which can serve up mock service responses. Responses can be JSON or XML to simulate REST or SOAP services.

## Code analysis 
* [ESLint](http://eslint.org/) - Pluggable JavaScript linting tool. Custom rules can be added to extend the existing functionality.
* [HintJS](http://jshint.com/) - Community driving js code analysis tool supported by twitter, facebook, wiki, jquery, mozilla, yahoo and others.
* [JsLint](http://www.jslint.com/) - JavaScript syntax checker and validator.

## Web UI test automation
* [WebdriverIO](http://webdriver.io/) - Nodejs webdriver bindings implementation, based on JsonWire protocol. Requires selenium server running. Includes promises, extended syntax, asynchronus calls with callbacks etc. Also supports SauceLabs, BrowserStack and many other online tools.
* [WebdriverJS](https://github.com/SeleniumHQ/selenium/wiki/WebDriverJs) - webdriver nodejs implemetations from authors of selenium, includes all basic features and commands.
* [Protractor](http://www.protractortest.org/#/) - End-to-end test framework for AngularJS applications.
* [Nightwatch.js](http://nightwatchjs.org/) - Easy to use Node.js based End-to-End (E2E) testing solution for browser based apps and websites.
* [Dalek.js](http://dalekjs.com/) - Automated cross browser testing with JavaScript.
* [Nemo](http://nemo.js.org/) - Nemo provides a simple way to add selenium automation to your NodeJS web projects. With a powerful configuration ability provided by krakenjs/confit, and plugin architecture, Nemo is flexible enough to handle any browser/device automation need.
* [Frisby](http://frisbyjs.com/) - Is a REST API testing framework built on node.js and Jasmine that makes testing API endpoints easy, fast, and fun.
* [TestCafe](https://devexpress.github.io/testcafe/) - Automated browser testing for the modern web development stack.
* [Nightmare](http://www.nightmarejs.org/) - A high-level browser automation library.
* [Gemini](https://gemini-testing.github.io) - Is an open-source utility for automating visual regression testing of web pages. Gemini takes a screenshot of elements on a page and compares it with baseline images of these elements. If the images don't match, the differences are shown in a report. 
* [Hermione](https://github.com/gemini-testing/hermione#hermione) - Is the utility for integration testing of web pages using [WebdriverIO](http://webdriver.io/) and [Mocha](https://mochajs.org).
* [Gremlins.js](https://github.com/marmelab/gremlins.js) - gremlins.js is a monkey testing library written in JavaScript, for Node.js and the browser. Use it to check the robustness of web applications by unleashing a horde of undisciplined gremlins.

## Mobile test automation
* [WebdriverIO's Appium implementation](http://webdriver.io/api/appium/backgroundApp.html) - nodejs bindings implemeting Appium commands.
* [Macaca](https://macacajs.com/) - Solution for Automation Test with Ease. Both Mobile, Desktop Platforms Supported, native, Hybrid, Mobile Web Multi-applications Supported, Command line tools & CI Solution provided.

## Windows UI test automation 
* [RobotJS](https://robotjs.io/) - The Node.js Desktop Automation Library

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Unix \ Linux UI test automation 

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## MacOS UI test automation 

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Virtual environments

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Performance & stress & load
* [k6](https://github.com/loadimpact/k6) - Like unit testing, for performance. A modern load testing tool, using Go and JavaScript.

## Security checking
* [npm vulnerability scanner](https://github.com/ellerbrock/travis-vulnerability-scanner) - Vulnerability Scanner for npm Modules with Travis CI and the Node Security Platform CLI Tool.

## Continuous Integration
* [Strider CD](http://strider-cd.github.io/) - Open Source Continuous Deployment / Continuous Integration platform written in NodeJS.
* [Gulp](http://gulpjs.com/) - Streaming building system/task runner in nodejs. Based on streaming data flow conception (https://github.com/substack/stream-handbook).
* [Grunt](https://gruntjs.com/) - Streaming building system/task runner in nodejs. Can't do anything without plugins, but there are many of them for all kinds of purposes.

## Reporting
* [Istanbul](https://github.com/gotwarlost/istanbul) - JS coverage tool for unit tests, server side functional tests and browser tests.
* [Blanket](http://blanketjs.org/) - JavaScript code coverage library that works both in-browser and with nodejs.
* [Mochawesome](https://github.com/adamgruber/mochawesome) - reporter for Mocha that generates a full fledged HTML/CSS report that helps visualize your test suites
* [Allure](http://allure.qatools.ru/) - a universal reporter for any testing framework. Supports [Mocha](https://docs.qameta.io/allure/2.0/#_mocha) and [Jasmine (and Protractor)](https://docs.qameta.io/allure/2.0/#_jasmine)

## Documentation generation
* [JSdoc3](http://usejsdoc.org/) - An API documentation generator for JavaScript
* [jsdoc-to-markdown](https://github.com/jsdoc2md/jsdoc-to-markdown) - Generates markdown API documentation from jsdoc annotated source code.
* [Docco](http://jashkenas.github.io/docco/) - Docco is a quick-and-dirty documentation generator, written in Literate CoffeeScript
* [MrDoc](https://mr-doc.github.io/mr-doc/) - A personal source documenter
* [YUIDocs](http://yui.github.io/yuidoc/) - YUI's JavaScript Documentation engine
* [ESDoc](https://esdoc.org/) - Configurble documentation generator with good ES6/ES7 support

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Editors, IDE, consoles
* [WebStorm](https://www.jetbrains.com/webstorm/) - PhpStorm without php support. One of thee most powerfull JS/HTML IDE.
* [Brackets](http://brackets.io/) - Open source newly released IDE for JS/HTML from Adobe. 
* [Komodo](https://www.activestate.com/komodo-ide) - Cross platform IDE for multiple languages, strongly supporting JS.
* [Cloud9](https://c9.io/) - Cloud based nodejs IDE supporting multiple features, eg. pair programming, preview in a new browser, built-in image editor, terminal and many others
* [Visual Studio Code](https://code.visualstudio.com/) - Cross platform editor from Microsoft, with integrated Node.js debugger and hooks for taskrunners such as Gulp
* [Atom](https://atom.io) - Full-featured, right out of the box text editor that's modern, approachable, yet hackable to the core from Github

## Useful libs

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)


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
* [test automation and software testing as services](https://github.com/atinfo/awesome-test-automation/blob/master/automation-and-testing-as-service.md)
* [mobile, tablet and tv test automation](https://github.com/atinfo/awesome-test-automation/blob/master/mobile-test-automation.md)
* [general purpose test automation tools](https://github.com/atinfo/awesome-test-automation/blob/master/general-purpose-test-automation-tools.md)

Also we are supporting and looking for contribution for project:

* [practical test automation by examples](https://github.com/atinfo/at.info-knowledge-base)


# [Contributing](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)
Your contributions are always welcome!
