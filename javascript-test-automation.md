# JavaScript test automation

A comprehensive curated list of JavaScript test automation frameworks, tools, libraries and software to help software engineers easily bootstrap test automation on JavaScript. Sponsored by http://sdclabs.com

[![Have questions\issues\problems, join the chat at https://gitter.im/atinfo/awesome-test-automation](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/atinfo/awesome-test-automation)

Table of content:

- [xUnit frameworks](#xunit-frameworks)
- [TDD \ ATTD \ BDD](#tdd--atdd--bdd)
- [Mock frameworks](#mock-frameworks)
- [Code Analysis](#code-analysis)
- [Web UI test automation](#web-ui-test-automation)
- [API automation](#api-automation)
- [Mobile test automation](#mobile-test-automation)
- [Windows UI test automation](#windows-ui-test-automation)
- [Unix \ Linux UI test automation](#unix--linux-ui-test-automation)
- [MacOS UI test automation](#macos-ui-test-automation)
- [Virtual environments](#virtual-environments)
- [Performance & stress & load](#performance--stress--load)
- [Security checking](#security-checking)
- [Continuous Integration](#continuous-integration)
- [Reporting](#reporting)
- [Data-Driven Testing](#data-driven-testing)
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
    * [MochaJS](http://mochajs.org/) - feature-rich JavaScript test framework running on node.js and the browser.
    * [Jasmine](http://jasmine.github.io/) - Behavior Driven Development testing framework for JavaScript. It does not rely on browsers, DOM, or any JavaScript framework. Thus it's suited for websites, Node.js projects, or anywhere that JavaScript can run.
    * [Intern](https://theintern.github.io/) - is a complete test stack for JavaScript designed to help you write and run consistent, high-quality test cases for your JavaScript libraries and applications. It can be used to test any JavaScript code. Its functional testing capabilities can even be used to test non-JavaScript Web and mobile apps, if you really want.
	* [Chai](http://chaijs.com/) - Chai is a BDD / TDD assertion library for node and the browser that can be delightfully paired with any javascript testing framework
    * [Chakram](http://dareid.github.io/chakram/) - Chakram is a REST API testing framework offering a BDD testing style and fully exploiting promises
- BDD
    * [CucumberJS](https://github.com/cucumber/cucumber-js) - Cucumber is a tool for running automated tests written in plain language.Cucumber.js is the JavaScript implementation of Cucumber and runs on both Node.js and modern web browsers.
- Runners
    * [Karma](http://mochajs.org/) - test runner for making TDD much easier by pre-build test environments.
    * [Wallaby.js](https://wallabyjs.com/) - Wallaby.js runs your JavaScript tests immediately as you type and displays execution results in your code editor. It also provides live test execution and code coverage reports.
    * [Jest](https://facebook.github.io/jest/) - Jest is used by Facebook to test all JavaScript code including React applications. One of Jest's philosophies is to provide an integrated "zero-configuration" experience. We observed that when engineers are provided with ready-to-use tools, they end up writing more tests, which in turn results in more stable and healthy code bases.
    * [GlaceJS](https://glacejs.github.io/glace-core) - quick-start functional testing framework based on [mocha](http://mochajs.org/) and extensible with [plugins](https://github.com/glacejs).
    * [Apickli](https://github.com/apickli/apickli) - REST API integration testing framework based on cucumber.js
    * [Mocha Parallel Tests](https://github.com/mocha-parallel/mocha-parallel-tests) - mocha-parallel-tests is a test runner for tests written with mocha testing framework which allows you to run them in parallel.
    * [Tupe](https://github.com/jl-/tupe) - A generic unit-testing runner for front-end built on puppeteer.
    * [AVA](https://github.com/avajs/ava) - 🚀 A test runner which takes advantage of NodeJS's asynchronous nature to parallelize IO, and run tests concurrently.
    * [Gauge](https://github.com/getgauge/gauge) - A test runner for test specifications written in Markdown and implementations in JavaScript.

## Mock frameworks
* [Sinon.JS](http://sinonjs.org/) - Standalone test spies, stubs and mocks for JavaScript.
No dependencies, works with any unit testing framework.
* [JSMockito](http://jsmockito.org/) - JsMockito is a JavaScript stub/mock framework heavily inspired by java's Mockito.
* [apimocker](https://github.com/gstroup/apimocker) - This is a node.js module to run a simple http server, which can serve up mock service responses. Responses can be JSON or XML to simulate REST or SOAP services.
* [rewire](https://github.com/jhnns/rewire) - Easy monkey-patching lib for `node.js` unit tests, which allows to inject mocks for other modules or globals like `process`, inspect private variables, override variables within the module.

## Code analysis
* [ESLint](http://eslint.org/) - Pluggable JavaScript linting tool. Custom rules can be added to extend the existing functionality.
* [HintJS](http://jshint.com/) - Community driving js code analysis tool supported by twitter, facebook, wiki, jquery, mozilla, yahoo and others.
* [JsLint](http://www.jslint.com/) - JavaScript syntax checker and validator.

## Web UI test automation
* [WebdriverJS](https://github.com/SeleniumHQ/selenium/wiki/WebDriverJs) - Nodejs webdriver language bindings official implementation from authors of selenium, includes only basic features and commands. Uses Control Flow to syncrhonize async actions.
* [WebdriverIO](http://webdriver.io/) - Nodejs webdriver language bindings unofficial implementation. Has own handling of async actions using Fibers and rich set of features
* [Protractor](http://www.protractortest.org/#/) - End-to-end test framework for Angular applications, comes with JasmineWD included, and built on top of WebdriverJS
* [CodeceptJS](http://codecept.io/) - Supercharged end 2 end testing for NodeJS
* [Nightwatch.js](http://nightwatchjs.org/) - Easy to use Node.js based End-to-End (E2E) testing solution for browser based apps and websites.
* [Dalek.js](http://dalekjs.com/) - Automated cross browser testing with JavaScript.
* [Nemo](http://nemo.js.org/) - Nemo provides a simple way to add selenium automation to your NodeJS web projects. With a powerful configuration ability provided by krakenjs/confit, and plugin architecture, Nemo is flexible enough to handle any browser/device automation need.
* [Frisby](http://frisbyjs.com/) - Is a REST API testing framework built on node.js and Jasmine that makes testing API endpoints easy, fast, and fun.
* [TestCafe](https://devexpress.github.io/testcafe/) - Automated browser testing for the modern web development stack.
* [Nightmare](http://www.nightmarejs.org/) - A high-level browser automation library.
* [Gemini](https://gemini-testing.github.io) - Is an open-source utility for automating visual regression testing of web pages. Gemini takes a screenshot of elements on a page and compares it with baseline images of these elements. If the images don't match, the differences are shown in a report. (Deperecated in favor of Hermione)
* [Hermione](https://github.com/gemini-testing/hermione#hermione) - Is the utility for integration testing of web pages using [WebdriverIO](http://webdriver.io/) and [Mocha](https://mochajs.org).
* [Gremlins.js](https://github.com/marmelab/gremlins.js) - gremlins.js is a monkey testing library written in JavaScript, for Node.js and the browser. Use it to check the robustness of web applications by unleashing a horde of undisciplined gremlins.
* [Puppeteer](https://github.com/GoogleChrome/puppeteer) - Puppeteer is a Node library which provides a high-level API to control headless Chrome over the DevTools Protocol. It can also be configured to use full (non-headless) Chrome. Built with <3 by the Chrome team.
* [Playwright](https://github.com/microsoft/playwright) - Playwright is a Node library to automate the Chromium, WebKit and Firefox browsers with a single API. It enables cross-browser web automation that is ever-green, capable, reliable and fast.
* [Chromeless](https://github.com/graphcool/chromeless) - Works with AWS Lambda to deploy parallel testing in a serverless setup. Compared to incumbents, API is basic for now but it’s trending like a rocket now. Contributors and maintainers can shape it into a great tool.
* [Chrominator](https://github.com/jesg/chrominator) - Made by PhantomJS GhostDriver maintainer so the API is extensive. It covers many edge cases that users expect from mature headless browsers frameworks such as NightmareJS/Electron or CasperJS/PhantomJS.
* [Chromy](https://github.com/OnetapInc/chromy) - Possibly the earliest that shipped to market, releasing in early May a thoughtful set of high-level API that works with headless Chrome. Rapid improvements since then and actively explored by BackstopJS maintainer.
* [Navalia](https://github.com/joelgriffith/navalia) - Pretty refreshing approach by supporting the popular GraphQL language, which is normally meant for querying API endpoints. Looks to have a mature API set and most importantly it is well-documented.
* [Lambdium](https://github.com/smithclay/lambdium) - Deployments on AWS Lambda using Selenium WebDriver. This is a very interesting proposition, because for the existing large Selenium code base in market, it has the potential for very easy migration to this tool.
* [GhostJS](https://github.com/KevinGrandon/ghostjs) - Interesting project base on modern JavaScript that works on a multitude of browsers such as Chrome, Firefox, PhantomJS, plus expressive API. Released some time back, development seems to be picking up speed.
* [CasperJS](http://casperjs.org/) - CasperJS is a navigation scripting & testing utility for PhantomJS and SlimerJS (still experimental). It eases the process of defining a full navigation scenario and provides useful high-level functions, methods & syntactic sugar for doing common tasks
* [Mailosaur](https://github.com/mailosaur/mailosaur-node) - Node.js client for email testing/automation via Mailosaur.
* [Cypress.io](https://github.com/cypress-io/cypress) - Fast, easy and reliable testing for anything that runs in a browser. Runs on Mac, Linux, Windows and any CI.
* [Differencify](https://github.com/NimaSoroush/differencify) - A library for visual regression testing using [Puppeteer](https://github.com/GoogleChrome/puppeteer).
* [Serenity/JS](https://serenity-js.org/) - Serenity/JS makes acceptance and regression testing of modern web apps faster, more collaborative and easier to scale.
* [Chimpy.js](https://thebrainfamily.github.io/chimpy/) - An awesome developer-centric experience to writing tests with realtime feedback using Mocha, Jasmine or Cucumber.js
* [Sakuli](https://sakuli.io) - An awesome Node.js based End-to-End (E2E) testing solution which combines Selenium based web testing with full desktop automation. It's custom DSL allows to write complex scenarios which seamlessly switch between the browser and your desktop. It's built-in monitoring support allows to measure performance data from a user perspective.
* [Buster.js](https://busterjs.readthedocs.io/en/latest) - A browser JavaScript/Node.js testing toolkit.
* [page-object](https://github.com/vitalets/page-object) - A Page Object pattern implementation library for JavaScript.
* [BackstopJS](https://github.com/garris/BackstopJS) - BackstopJS automates visual regression testing of your responsive web UI by comparing DOM screenshots over time.
* [Taiko](https://github.com/getgauge/Taiko) - A Node.js library to test and automate chromium browsers.
* [QA Wolf](https://github.com/qawolf/qawolf) - A Node.js library to create browser tests 10x faster with Puppeteer and Jest.


## API automation
* [SuperTest](https://github.com/visionmedia/supertest) - Super-agent driven library for testing node.js HTTP servers using a fluent API.
* [Frisby](https://github.com/vlucas/frisby) - Frisby is a REST API testing framework built on Jest that makes testing API endpoints easy, fast, and fun.
* [Just-API](https://github.com/kiranz/just-api) - Declarative testing framework for REST, GraphQL APIs.
* [PactumJS](https://pactumjs.github.io) - REST API Testing Tool for all levels in a Test Pyramid.
* [Got](https://github.com/sindresorhus/got) - Human-friendly and powerful HTTP request library for Node.js
* [Axios](https://github.com/axios/axios) - Promise based HTTP client for the browser and node.js

## Mobile test automation
* [WebdriverIO's Appium implementation](https://github.com/webdriverio/appium-boilerplate/) - nodejs bindings implemeting Appium commands.
* [Macaca](https://macacajs.github.io/) - Solution for Automation Test with Ease. Both Mobile, Desktop Platforms Supported, native, Hybrid, Mobile Web Multi-applications Supported, Command line tools & CI Solution provided.
* [Detox](https://github.com/wix/Detox) - Gray Box End-to-End Testing and Automation Framework for Mobile Apps 
* [Cavy](https://github.com/pixielabs/cavy) - Cavy is a cross-platform integration test framework for React Native, by Pixie Labs.

## Windows UI test automation
* [RobotJS](https://robotjs.io/) - The Node.js Desktop Automation Library
* [SikuliX](http://www.sikulix.com/) - SikuliX automates anything you see on the screen of your desktop computer running Windows, Mac or some Linux/Unix. It uses image recognition powered by OpenCV to identify and control GUI components. This is handy in cases when there is no easy access to a GUI's internals or the source code of the application or web page you want to act on.
* [Sakuli](https://sakuli.io) - An awesome Node.js based End-to-End (E2E) testing solution which combines Selenium based web testing with full desktop automation. It's custom DSL allows to write complex scenarios which seamlessly switch between the browser and your desktop. It's built-in monitoring support allows to measure performance data from a user perspective.

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Unix \ Linux UI test automation
* [SikuliX](http://www.sikulix.com/) - SikuliX automates anything you see on the screen of your desktop computer running Windows, Mac or some Linux/Unix. It uses image recognition powered by OpenCV to identify and control GUI components. This is handy in cases when there is no easy access to a GUI's internals or the source code of the application or web page you want to act on.
* [Sakuli](https://sakuli.io) - An awesome Node.js based End-to-End (E2E) testing solution which combines Selenium based web testing with full desktop automation. It's custom DSL allows to write complex scenarios which seamlessly switch between the browser and your desktop. It's built-in monitoring support allows to measure performance data from a user perspective.

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## MacOS UI test automation
* [SikuliX](http://www.sikulix.com/) - SikuliX automates anything you see on the screen of your desktop computer running Windows, Mac or some Linux/Unix. It uses image recognition powered by OpenCV to identify and control GUI components. This is handy in cases when there is no easy access to a GUI's internals or the source code of the application or web page you want to act on.
* [Sakuli](https://sakuli.io) - An awesome Node.js based End-to-End (E2E) testing solution which combines Selenium based web testing with full desktop automation. It's custom DSL allows to write complex scenarios which seamlessly switch between the browser and your desktop. It's built-in monitoring support allows to measure performance data from a user perspective.

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Virtual environments

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Performance & stress & load
* [k6](https://github.com/loadimpact/k6) - Like unit testing, for performance. A modern load testing tool, using Go and JavaScript.
* [artillery](https://artillery.io/) - Artillery is a modern, powerful & easy-to-use load testing toolkit. Use it to build scalable applications that stay performant & resilient under high load.
* [predator](https://predator.dev) - Distributed performance testing platform for APIs, using [artillery](https://artillery.io/) as its load engine.

## Security checking
* [npm vulnerability scanner](https://github.com/ellerbrock/travis-vulnerability-scanner) - Vulnerability Scanner for npm Modules with Travis CI and the Node Security Platform CLI Tool.

## Continuous Integration
* [Strider CD](http://strider-cd.github.io/) - Open Source Continuous Deployment / Continuous Integration platform written in NodeJS.
* [Gulp](http://gulpjs.com/) - Streaming building system/task runner in nodejs.
* [Grunt](https://gruntjs.com/) - Streaming building system/task runner in nodejs. Can't do anything without plugins, but there are many of them for all kinds of purposes.

## Reporting
* [Testomat.io](https://testomat.io/) - test management and reporting system for javascript automated tests
* [ReportPortal.io](http://ReportPortal.io) - powerfull results management and analytics for test automation reports. Powered with Machine Learning. Real-time integration and reports, visualization of trends and statistics, custom dashboards and widgets, gives you real visibility into the state of test automation. Integral part of CI/CD with TA and Continous Testing. Server-client application, can be used for any type of automated tests, with huge list of [available integrations](https://github.com/reportportal?utf8=✓&q=agent-). Free and OpenSourced, [GitHub link](https://github.com/reportportal).
* [Istanbul](https://github.com/gotwarlost/istanbul) - JS coverage tool for unit tests, server side functional tests and browser tests.
* [Blanket](https://github.com/alex-seville/blanket) - JavaScript code coverage library that works both in-browser and with nodejs.
* [Mochawesome](https://github.com/adamgruber/mochawesome) - reporter for Mocha that generates a full fledged HTML/CSS report that helps visualize your test suites
* [Allure](http://allure.qatools.ru/) - a universal reporter for any testing framework. Supports [Mocha](https://docs.qameta.io/allure/2.0/#_mocha) and [Jasmine (and Protractor)](https://docs.qameta.io/allure/2.0/#_jasmine)
* [cucumber-html-reporter](https://www.npmjs.com/package/cucumber-html-reporter) - Provide Cucumber JSON report file created from your framework and this module will create pretty HTML reports. Choose your best suitable HTML theme and dashboard on your CI with available HTML reporter plugins.
* [Coveralls GitHub Action](https://github.com/gavinhenderson/coveralls-action) - A GitHub Action that will automatically report your latest test results to coveralls



## Data-Driven Testing
* [test-each](https://github.com/ehmicky/test-each) - Repeat tests using different inputs.

## Documentation generation
* [JSdoc3](https://jsdoc.app/) - An API documentation generator for JavaScript
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
* [faker](https://www.npmjs.com/package/faker) - generate massive amounts of fake data in the browser and node.js
* [interfake](https://github.com/basicallydan/interfake) -  Fake APIs for prototypes & automated tests.
* [node-replay](https://github.com/assaf/node-replay) -  When API testing slows you down: record and replay HTTP responses like a boss 

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)


# Resources
Where to discover new libraries, information, tools, etc.

## Websites

* [automated-testing.info](http://automated-testing.info) - Test automation community
* [atinfo.github.io/at.info-knowledge-base](http://atinfo.github.io/at.info-knowledge-base/)  - Knowledge base for test automation examples on different tools and technologies
* [Testomat.io](https://testomat.io/) - test management and reporting system for javascript automated tests


## Articles
* [js-testrunners-bench](https://github.com/vitalets/js-testrunners-bench) - Performance comparison of the most popular JavaScript test-runners. 

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
