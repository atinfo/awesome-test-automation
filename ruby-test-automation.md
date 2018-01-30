# Ruby test automation

A comprehensive curated list of Ruby test automation frameworks, tools, libraries and software to help software engineers easily bootstrap test automation on Ruby. Sponsored by http://sdclabs.com

[![Have questions\issues\problems, join the chat at https://gitter.im/atinfo/awesome-test-automation](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/atinfo/awesome-test-automation)

Table of content:

- [xUnit frameworks](#xunit-frameworks)
- [TDD \ ATTD \ BDD](#tdd--atdd--bdd)
- [Code Analysis](#code-analysis)
- [Test Data](#test-data)
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

* [Test::Unit](http://ruby-doc.org//stdlib-2.1.5//libdoc/test/unit/rdoc/Test/Unit.html) - is intended for unit testing and comes bundled with Ruby.
* [MiniTest](https://github.com/CapnKernul/minitest-reporters#readme) - becomes available on attaching the minitest-reporters gem. The minitests are added to the Test::Unit framework.
* [yard-doctest](https://github.com/p0deje/yard-doctest) - allows to use YARD examples as tests

## TDD \ ATDD \ BDD
- TDD
    * [RR](https://github.com/rr/rr) - A test double framework that features a rich selection of double techniques and a terse syntax.
- BDD
    * [RSpec](http://rspec.info/) - Behaviour Driven Development for Ruby. RSpec becomes available in Ruby projects on attaching the rspec gem. For the Rails applications, rspec-rails gem is also required.
    * [Cucumber](http://cukes.info/) - This testing tool supports BDD, and enables using features and scenarios written in a human-readable language, either English or any other language specified in the # language: comment. Cucumber becomes available in project upon installing and activating the cucumber gem.
    * [Bacon](https://github.com/chneukirchen/bacon) - A small RSpec clone.
    * [minitest](https://github.com/seattlerb/minitest) - minitest provides a complete suite of testing facilities supporting TDD, BDD, mocking, and benchmarking.
    * [Spinach](https://github.com/codegram/spinach) - Spinach is a high-level BDD framework that leverages the expressive Gherkin language (used by Cucumber) to help you define executable specifications of your application or library's acceptance criteria.
- Assertions
    * [Shoulda](https://github.com/thoughtbot/shoulda) - is intended for unit testing, and becomes available in Ruby projects on attaching the shoulda gem. So doing, the Shoulda tests are added on to the Test::Unit framework.
    * [shoulda-matchers](https://github.com/thoughtbot/shoulda-matchers) - Provides Test::Unit- and RSpec-compatible one-liners that test common Rails functionality. These tests would otherwise be much longer, more complex, and error-prone.
- Mocking
    * [ActiveMocker](https://github.com/zeisler/active_mocker) - Generate mocks from ActiveRecord models for unit tests that run fast because they don’t need to load Rails or a database.
    * [TestXml](https://github.com/alovak/test_xml) - TestXml is a small extension for testing XML/HTML.
    * [WebMock](https://github.com/bblimke/webmock) - Library for stubbing and setting expectations on HTTP requests.
    * [vcr](https://github.com/vcr/vcr) - Record your test suite's HTTP interactions and replay them during future test runs for fast, deterministic, accurate tests.
- Extensions
    * [Cutest](https://github.com/djanowski/cutest) - Isolated tests in Ruby. Each test file is run in a forked process to avoid shared state. Once a failure is found, you get a report detailing what failed and how to locate the error and the rest of the file is skipped.
    * [Spork](https://github.com/sporkrb/spork) - A DRb server for testing frameworks (RSpec / Cucumber currently).


## Code analysis

* [Rubocop](https://github.com/bbatsov/rubocop) - A Ruby static code analyzer, based on the community Ruby style guide.
* [Pronto](https://github.com/prontolabs/pronto) - Quick automated code review of your changes.

## Test data

* [Fabrication](http://fabricationgem.org/) - A simple and powerful object generation library.
* [factory_bot](https://github.com/thoughtbot/factory_bot) - A library for setting up Ruby objects as test data.
* [Fake Person](https://github.com/adamcooke/fake-person) - Uses some of the most popular given & surnames in the US & UK.
* [faker](https://github.com/stympy/faker) - A library for generating fake data such as names, addresses, and phone numbers.
* [ffaker](https://github.com/EmmanuelOga/ffaker) - A faster Faker, generates dummy data, rewrite of faker.
* [Forgery](https://github.com/sevenwire/forgery) - Easy and customizable generation of forged data.
* [Machinist](https://github.com/notahat/machinist) - Fixtures aren't fun. Machinist is.


## Web UI test automation

- libraries
    * [Selenium WebDriver](http://selenium.googlecode.com/git/docs/api/rb/index.html) - This gem provides Ruby bindings for WebDriver.
    * [API Taster](https://github.com/fredwu/api_taster) - A quick and easy way to visually test your Rails application's API.
    * [Watir](https://github.com/watir/watir/) - Web application testing in Ruby.
    * [Watir-webdriver](http://watirwebdriver.com/) - The most elegant way to use WebDriver with ruby.
    * [Poltergeist](https://github.com/teampoltergeist/poltergeist) - Poltergeist is a driver for Capybara. It allows you to run your Capybara tests on a headless WebKit browser, provided by PhantomJS.
    * [PhantomJS](http://phantomjs.org/) - is a headless WebKit scriptable with a JavaScript API. It has fast and native support for various web standards: DOM handling, CSS selector, JSON, Canvas, and SVG.
    * [unobtainium](https://github.com/jfinkhaeuser/unobtainium) - configuration driven wrapper for Selenium WebDriver and [appium](http://appium.io/), with PhantomJS support.
- frameworks
    * [Capybara](https://github.com/teamcapybara/capybara) - Acceptance test framework for web applications.
    * [Konacha](https://github.com/jfirebaugh/konacha) - Test your Rails application's JavaScript with the mocha test framework and chai assertion library.
    * [chemistrykit](https://github.com/chemistrykit/chemistrykit) - Simple and opinionated web testing framework for Selenium WebDriver that follows convention over configuration and integrates with SauceLabs for cross-browser execution in the cloud.
    * [howitzer](https://github.com/strongqa/howitzer) - is a Ruby-based framework for acceptance testing. It was originally developed for testing web applications, but you can also use it for API testing and web service testing.The framework was built with modern patterns, techniques, and tools in automated testing.
- page objects
    * [page-object](https://github.com/cheezy/page-object) - Gem to implement PageObject pattern in watir-webdriver and selenium-webdriver.
    * [watirsome](https://github.com/p0deje/watirsome) - Awesome page objects with Watir.
    * [widgeon](https://github.com/yashaka/widgeon) - Yet another 'page objects for Capybara' gem with ability to create custom loadable elements akka 'widgets'
    * [Site Prism](https://github.com/natritmeyer/site_prism) - A Page Object Model DSL for Capybara
- extensions
    * [Selenium-Grid-Extras](https://github.com/groupon/Selenium-Grid-Extras) - Simplify the managment of the Selenium Grid Nodes and stabilize said nodes by cleaning up the test environment after the build has been completed
    * [Mailosaur](https://github.com/mailosaur/mailosaur-ruby) - Ruby client for email testing/automation via Mailosaur.

## Mobile test automation

* [Calabash](http://calaba.sh/) - Calabash enables you to write and execute automated acceptance tests on mobile apps. It's cross-platform, supporting Android and iOS native apps. 

## Windows UI test automation

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Unix \ Linux UI test automation

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## MacOS UI test automation

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Virtual environments

* [RVM](https://rvm.io/) - Ruby Version Manager (RVM) is a unix command-line tool which allows you to easily install, manage, and work with multiple ruby environments from interpreters to sets of gems.
* [Pik](http://rubyinstaller.org/add-ons/pik/) - Multi-Ruby Manager for Windows.
* [rbenv](http://rbenv.org/) - Use rbenv to pick a Ruby version for your application and guarantee that your development environment matches production.

## Performance & stress & load

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Security checking

* [Brakeman](https://brakemanscanner.org/) - Static analysis security scanner for Ruby on Rails.
* [bundle-audit](https://github.com/rubysec/bundler-audit) - Patch-level verification for bundler. Checks for vulnerable gems.

## Continuous Integration

* [Knapsack](https://github.com/ArturT/knapsack) - Optimal test suite parallelisation across CI nodes for RSpec, Cucumber, Minitest, Spinach and Turnip.

## Reporting

* [ReportPortal.io](http://ReportPortal.io) - [Ruby Cucumber + RSpec](https://github.com/reportportal?utf8=✓&q=agent-ruby&type=&language=) powerfull results management and analytics for test automation reports. Powered with Machine Learning. Real-time integration and reports, visualization of trends and statistics, custom dashboards and widgets, gives you real visibility into the state of test automation. Integral part of CI/CD with TA and Continous Testing. Server-client application, can be used for any type of automated tests. Free and OpenSourced, [GitHub link](https://github.com/reportportal).

## Documentation generation

[Contribute to this section](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)

## Editors, IDE, consoles

[Contribute to this section](https://github.com/grosser/parallel_tests)

## Useful libs

* [parallel_tests](https://github.com/grosser/parallel_tests) - Speedup Test::Unit + RSpec + Cucumber by running parallel on multiple CPUs (or cores). ParallelTests splits tests into even groups(by number of tests or runtime) and runs each group in a single process with its own database.
* [headless](https://github.com/leonid-shevtsov/headless) - Is the Ruby interface for Xvfb. It allows you to create a headless display straight from Ruby code, hiding some low-level action. It can also capture images and video from the virtual framebuffer.  
* [watir-jquery](https://github.com/eugene-tkachenko/watir-jquery) - Watir-jquery gem allows you to use the jQuery syntax to find page elements and returns Watir-object type.


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
