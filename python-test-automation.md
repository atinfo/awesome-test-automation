# Python test automation

A comprehensive curated list of python test automation frameworks, tools, libraries and software to help software engineers easily bootstrap test automation on python.

Table of content:

- [xUnit frameworks](#xunit-frameworks)
- [TDD \ ATTD \ BDD](#tdd--atdd--bdd)
- [Test Data manipulation](#test-data-manipulation)
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
- [Other Awesome Test Automation Lists](#other-awesome-lists)
- [Contributing](#contributing)

---

## xUnit frameworks

- frameworks
    * [unittest](https://docs.python.org/library/unittest.html) - is a library to make unit testing distributed with python out of the box.
    * [unittest2](https://pypi.python.org/pypi/unittest2) - is a backport of the new features added to the unittest testing framework in Python 2.7 and onwards.
    * [pytest](http://pytest.org/) - is a mature full-featured Python testing tool that helps you write better programs.
    * [nosetests](https://nose.readthedocs.org/en/latest/) - is a nicer testing for python.
    * [slash](https://github.com/slash-testing/slash) - is a testing framework written in Python.
- extensions
    * [proboscis](https://pythonhosted.org/proboscis/) -  is a Python test framework that extends Python’s built-in unittest module and Nose with features from TestNG.
    * [grail](https://github.com/wgnet/grail) - is a library which allows test script creation based on steps.
    * [testify](https://github.com/Yelp/Testify/) - unit test framework, provides Enhanced test fixture setup, Split test suites into buckets for easy parallelization, PEP8 naming conventions & Fancy color test runner with lots of logging / reporting option.
    * [trial](http://twistedmatrix.com/trac/wiki/TwistedTrial) - Extension of unittest to support writing asynchronous unit tests using Deferreds and new result types ('skip' and 'todo'). Includes a command-line program that does test discovery and integrates with doctest and coverage.
    * [subunit](https://launchpad.net/subunit) - Transparently adds support for running unittest test cases/suites in a separate process : prevents system wide changes by a test destabilising the test runner. It also allows reporting from tests in another process into the unittest framework, giving a single integrated test environment.
    * [testresources](https://launchpad.net/testresources) - Provides a mechanism for managing 'resources' - expensive bits of infrastructure - that are needed by multiple tests. Resources are constructed and free on demand, but with an optional TestSuite?, the test run order is optimised to reduce the number of resource constructions and releases needed. Compatible with unittest.
    * [testtools](https://launchpad.net/testtools) - Useful extensions to unittest derived from custom extensions by projects such as Twisted and Bazaar.
    * [Sancho](https://www.mems-exchange.org/software/DurusWorks/) - Sancho 2.1 runs tests, and provides output for tests that fail; Sancho 2.1 does not count tests passed or failed; targets projects that do not maintain failing tests
    * [zope.testing](https://pypi.python.org/pypi/zope.testing) - Powerful test runner that includes support for post-mortem debugging of test failures. Also includes profiling and coverage reporting. This is a standalone package that has no dependencies on Zope and works just fine with projects that don't use Zope.
    * [pythoscope](http://pythoscope.org/) - Tool that will automatically, or semi-automatically, generate unit tests for legacy systems written in Python.
    * [testlib](http://www.logilab.org/project/logilab-common/) - Gives more power to standard unittest. More assert* methods; support for module level setup/teardown; skip test feature...
    * [dutest](https://pypi.python.org/pypi/dutest) - An object oriented interface to retrieve unittest test cases out of doctests. Hides initialization from doctests by allowing setUp and tearDown for each interactive example. Allows control over all the options provided by doctest. Specialized classes allow selective test discovery across a package hierarchy.
    * [green](https://github.com/CleanCut/green) - Green is a clean, colorful test runner for Python unit tests. Compare it to nose or trial.


## TDD \ ATDD \ BDD

- BDD
    * [behave](https://pypi.python.org/pypi/behave) - BDD tool
    * [lettuce](http://lettuce.it/) - BDD tool
        * [lettuce-tools](https://github.com/telefonicaid/lettuce-tools) - Lettuce Tools are a set of tools and utilities that extend the lettuce out of the box features fill some of the gaps detected in the projects.
    * [contexts](https://github.com/benjamin-hodgson/Contexts) - Descriptive testing for Python.
    * [mamba](http://nestorsalceda.github.io/mamba/) - The definitive testing tool for Python. Born under the banner of Behavior Driven Development.
    * [pyvows](http://heynemann.github.io/pyvows/) - Asynchronous behaviour driven development for Python.
    * [robotframework](http://robotframework.org/) - A generic test automation framework for acceptance testing and acceptance test-driven development (ATDD)
- Assertions
    * [pyshould](https://github.com/drslump/pyshould) - Should style asserts based on pyhamcrest.
    * [pyhamcrest](https://github.com/hamcrest/PyHamcrest) - Hamcrest matchers for Python.
    * [sure](https://github.com/gabrielfalcao/sure) - A testing library for python with powerful and flexible assertions.
- Mocking
    * [mock](https://pypi.python.org/pypi/mock) - A Python Mocking and Patching Library for Testing.
    * [responses](https://github.com/dropbox/responses) - A utility library for mocking out the requests Python library.
    * [doublex](https://pypi.python.org/pypi/doublex) - Powerful test doubles framework for Python.
    * [freezegun](https://github.com/spulec/freezegun) - Travel through time by mocking the datetime module.
    * [httpretty](http://falcao.it/HTTPretty/) - HTTP request mock tool for Python.
    * [httmock](https://github.com/patrys/httmock) - A mocking library for requests for Python 2.6+ and 3.2+.
    * [pretenders](https://github.com/pretenders/pretenders) - fake servers for testing.

## Test Data manipulation

* [faker](http://www.joke2k.net/faker/) - A Python package that generates fake data.
* [fake2db](https://github.com/emirozer/fake2db) - Fake database generator.
* [ForgeryPy](https://pypi.python.org/pypi/ForgeryPy) - An easy to use forged data generator for Python. It's a port of forgery.
* [radar](https://pypi.python.org/pypi/radar) - Generate random datetime / time.
* [robotframework-faker](https://github.com/guykisel/robotframework-faker) - Robot Framework wrapper for faker.

## Code analysis

* [pysonar2](https://github.com/yinwang0/pysonar2) - A type inferencer and indexer for Python.
* [coverage](https://pypi.python.org/pypi/coverage) - Code coverage measurement
* [pycallgraph](https://github.com/gak/pycallgraph) - A library that visualises the flow (call graph) of your Python application.
* [Flake8](https://pypi.python.org/pypi/flake8) - The modular source code checker: pep8, pyflakes and co.
* [pylama](https://pylama.readthedocs.org/) - Code audit tool for Python and JavaScript.
* [Pylint](http://www.pylint.org/) - A source code analyzer.

## Web UI test automation

- libraries
    * [selenium webdriver](https://pypi.python.org/pypi/selenium) - Browser automation tool.
    * [splinter](https://github.com/cobrateam/splinter) - A tool for test web applications with a simple for find elements, form actions, and others browser actions.
    * [mechanize](https://pypi.python.org/pypi/mechanize/) - Stateful programmatic web browsing in Python.
- frameworks and wrappers
    * [py.saunter](https://github.com/element-34/py.saunter) - An opinionated automation framework for use with the Selenium RC and WebDriver libraries.
    * [moz-web-qa](https://github.com/davehunt/pytest-mozwebqa) - A plugin for py.test that provides additional features needed for Mozilla's WebQA projects.
    * [testutils sst](http://testutils.org/sst) - A web test framework that uses Python to generate functional browser-based tests.
    * [wtframework](https://github.com/wiredrive/wtframework) - Framework for configurable Web Tests in Python.
    * [holmium.core](https://github.com/alisaifee/holmium.core) - Page objects & Utilities for writing selenium test cases.
    * [robotframework-selenium2library](https://github.com/rtomac/robotframework-selenium2library) - Web testing library for Robot Framework.
    * [gocept.selenium](https://pypi.python.org/pypi/gocept.selenium) - An API for the Selenium remote control that is suited for writing tests and integrates this with your test suite for any WSGI, Plone, Zope 2, ZTK, or Grok application.
    * [webium](https://github.com/wgnet/webium) - A Page Object pattern implementation library for Python
    * [robotframework-anywherelibrary](https://github.com/luisxiaomai/robotframework-anywherelibrary) - A cross platform(desktop browser,android,ios) testing library for Robot Framework that leverages the Selenium 2(WebDriver) libraries internally to control a web browser and appium as mobile test automation framework for use with native and hybrid app.
    * [robotframework-pageobjects](https://github.com/ncbi/robotframework-pageobjects) - Nice implementation of the Page Object pattern with robotframework and selenium, that can work even outside of robotframework. More on this [blog post](http://kahunacohen.com/2014/12/03/new-testing-paradigm-robotframework-pageobjects/)
    * [elementium](https://github.com/actmd/elementium) - jQuery-style syntactic sugar for highly reliable automated browser testing in Python
- extensions
    * [pytest_splinter](https://github.com/pytest-dev/pytest-splinter) - pytest spinter and selenium integration for anyone interested in browser interaction in tests.
    * [lettuce_webdriver](https://github.com/bbangert/lettuce_webdriver) - Selenium webdriver for lettuce.
    * [Browsermob Proxy](https://github.com/AutomatedTester/browsermob-proxy-py) - A python wrapper for Browsermob Proxy.
    * [FireRobot](https://github.com/joao-carloto/FireRobot) - A Firefox extension that allows you to create Robot Framework/Selenium tests, in a more efficient way.
    * [pytractor](https://github.com/kpodl/pytractor) - Python selenium extensions for testing angular.js apps

## Mobile test automation

* [appium](http://appium.io/) - An open source test automation framework for use with native, hybrid and mobile web apps. It drives iOS and Android apps using the WebDriver protocol.
* [selendroid](https://github.com/selendroid/selendroid) - Selendroid is a test automation framework which drives of the UI of Android native and hybrid applications (apps) and the mobile web with Selendroid.
* [robotframework-androidlibrary](https://github.com/lovelysystems/robotframework-androidlibrary) - A Robot Framework test library for all your Android automation needs.
* [robotframework-appiumlibrary](https://github.com/jollychang/robotframework-appiumlibrary) - An appium testing library for RobotFramework.
* [robotframework-ioslibrary](https://github.com/lovelysystems/robotframework-ioslibrary) - A Robot Framework test library for all your iOS automation needs.
* [uiautomator](https://github.com/xiaocong/uiautomator) - Python wrapper of Android uiautomator test tool, it works on Android 4.1+ simply with Android device attached via adb.

## Windows UI test automation

* [PyAutoGUI](https://pypi.python.org/pypi/PyAutoGUI) - A cross-platform module for GUI automation for human beings. Control the keyboard and mouse from a Python script.
* [robotframework-autoitlibrary](https://code.google.com/p/robotframework-autoitlibrary/) - A Windows GUI testing library for Robot Framework
* [autopy](https://github.com/msanders/autopy) - A simple, cross-platform GUI automation toolkit for Python.
* [UISoup](https://pypi.python.org/pypi/UISoup/) - This library supports UI-related testing using Python on Windows and Mac OS. (Only Python x86 is supported)

## Unix \ Linux UI test automation

* [ldtp](https://pypi.python.org/pypi/ldtp) - Cross Platform Linux Desktop (GUI Application) Testing Project.
* [fMBT](https://github.com/01org/fMBT) - Python libraries for multiplatform GUI testing.

## MacOS UI test automation

* [PyAutoGUI](https://pypi.python.org/pypi/PyAutoGUI) - A cross-platform module for GUI automation for human beings. Control the keyboard and mouse from a Python script.
* [ATOMac](https://github.com/pyatom/pyatom) - Python library to fully enable GUI testing of Mac applications via the Apple Accessibility API

## Virtual environments

* [virtualenv](https://pypi.python.org/pypi/virtualenv) - A tool to create isolated Python environments.
* [virtualenvwrapper](https://virtualenvwrapper.readthedocs.org/en/latest/) - A set of extensions to Ian Bicking’s virtualenv tool.
* [tox](https://pypi.python.org/pypi/tox) - A generic virtualenv management and test command line tool to test code on different python versions.
* [PyVirtualDisplay](https://pypi.python.org/pypi/PyVirtualDisplay) - A python wrapper for Xvfb, Xephyr and Xvnc for GUI testing and\or automatic GUI screenshot.
* [pew](https://pypi.python.org/pypi/pew/) - A set of tools to manage multiple virtual environments.
* [Vex](https://github.com/sashahart/vex) - Run a command in the named virtualenv.
* [PyRun](https://www.egenix.com/products/python/PyRun/) - A one-file, no-installation-needed version of Python.
* [pyenv](https://github.com/yyuu/pyenv) - Simple Python version management.
* [Tapper](https://tapper.github.io/Tapper/) - all-embracing test infrastructure.


## Performance & stress & load

* [Multi-Mechanize](http://testutils.org/multi-mechanize/) - An open source framework for performance and load testing.
* [locust](https://github.com/locustio/locust) - Scalable user load testing tool written in Python.
* [Yandex.Tank](https://github.com/yandex/yandex-tank) - Load and performance benchmark tool.
* [pytest-benchmark](https://github.com/ionelmc/pytest-benchmark) - A py.test fixture for benchmarking code.
* [Airspeed Velocity](https://github.com/spacetelescope/asv) - A simple Python benchmarking tool with web-based reporting
* [The Grinder](http://grinder.sourceforge.net/) - Load testing framework that makes it easy to run a distributed test using many load injector machines. This includes common cases such as HTTP web servers, SOAP and REST web services, and application servers (CORBA, RMI, JMS, EJBs), as well as custom protocols. Flexible Scripting Test scripts are written in the powerful Jython and Clojure languages.

## Security checking

* [sparta](http://sparta.secforce.com/) - A GUI application which simplifies network infrastructure penetration testing by aiding the penetration tester in the scanning and enumeration phase.
* [OWASP ZAP](https://code.google.com/p/zaproxy/wiki/ApiPython) - An API for the usage of OWASP ZAP-features from a Python-script.

## Continuous Integration

* [buildbot](https://pypi.python.org/pypi/buildbot/) - A system to automate the compile/test cycle required by most software projects to validate code changes.
* [jenkins](http://jenkins-ci.org/) - An extensible open source continuous integration server.
* [travis-ci](https://travis-ci.org) - Free Hosted Continuous Integration Platform.

## Reporting

* [allure pytest](https://github.com/allure-framework/allure-python) - Allure adapter for PyTest framework.
* [HTMLTestRunner](http://tungwaiyip.info/software/HTMLTestRunner.html) - An extension to the Python standard library's unittest module. It generates easy to use HTML test reports.
* [unittest-xml-reporting](https://github.com/xmlrunner/unittest-xml-reporting) - A unittest test runner that can save test results to XML files that can be consumed by a wide range of tools, such as build systems, IDEs and continuous integration servers.

## Documentation generation

* [Sphinx](http://sphinx-doc.org/) - Python Documentation generator.
* [MkDocs](http://www.mkdocs.org/) - Markdown friendly documentation generator.
* [Pycco](http://fitzgen.github.io/pycco/) - The original quick-and-dirty, hundred-line-long, literate-programming-style documentation generator.

## Editors, IDE, consoles

* [pycharm](https://www.jetbrains.com/pycharm/) - Smart code editor provides first-class support for Python
* [pydev](http://pydev.org/) - Full featured python ide based on eclipse
* [sublime](http://sublimetext.com/) - A sophisticated text editor for code, markup and prose.
* [ipython](http://ipython.org/) - A command shell for interactive computing in multiple programming languages, originally developed for the Python programming language

## Useful libs

Libraries that may help you to build better test automation.

* [requests](https://pypi.python.org/pypi/requests/) - An Apache2 Licensed HTTP library, written in Python, for human beings.
* [WebTest](http://webtest.readthedocs.org/en/latest/) - WebTest helps you test your WSGI-based web applications.
* [lxml](http://lxml.de/) - Most feature-rich and easy-to-use library for processing XML and HTML in the Python language.
* [suds](https://fedorahosted.org/suds/) - A lightweight SOAP python client for consuming Web Services.
* [fabric](http://www.fabfile.org/) - A Python library and command-line tool for streamlining the use of SSH for application deployment or systems administration tasks.
* [BeautifulSoup](http://www.crummy.com/software/BeautifulSoup/) - Package for parsing HTML documents (including having malformed markup, i.e. non-closed tags, so named after Tag soup). It creates a parse tree for parsed pages that can be used to extract data from HTML, which is useful for web scraping.
* [waiting](https://github.com/vmalloc/waiting) - python utility library for waiting for predicates.
* [Comcast](https://github.com/tylertreat/Comcast/) - simulating shitty network connections so you can build better systems.
* [dateutil](https://pypi.python.org/pypi/python-dateutil) - Extensions to the standard Python datetime module.
* [python-tesseract](https://code.google.com/p/python-tesseract/) - Wrapper class for tesseract OCR (Linux & Mac & Windows)
* [pywinrm](https://github.com/diyan/pywinrm/) - A Python client for Windows Remote Management (WinRM). This allows you to invoke commands on target Windows machines from any machine that can run Python. WinRM allows you to call native objects in Windows. These include, but are not limited to, running batch scripts, powershell scripts and fetching WMI variables. For more information on WinRM, please visit Microsoft's WinRM site.
* [fig](http://www.fig.sh/) - Fast, isolated development environments using [Docker](https://www.docker.com/).
* [gitapi](http://bitbucket.org/haard/gitapi) - Pure-Python API for git.
* [Pyro4](https://github.com/irmen/Pyro4) - Pyro enables you to build applications in which objects can talk to each other over the network, with minimal programming effort.

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

# [Contributing](https://github.com/atinfo/awesome-test-automation/blob/master/CONTRIBUTING.md)
Your contributions are always welcome!
