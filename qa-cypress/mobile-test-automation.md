# Mobile, Tablet, TV test automation

A comprehensive curated list of Mobile, Tablet, TV test automation frameworks, tools, libraries and software to help software engineers easily bootstrap test automation. Sponsored by http://sdclabs.com

[![Have questions\issues\problems, join the chat at https://gitter.im/atinfo/awesome-test-automation](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/atinfo/awesome-test-automation)

Table of content:

- [Cross-platform tools](#cross-platform-tools)
- [Android](#android)
- [iOS](#ios)
- [Environment](#environment)

Make a pull request to add new chapter

Also:

- [Resources](#resources)
- [Other Awesome Test Automation Lists](#other-awesome-test-automation-lists)
- [Contributing](#contributing)

---

## Cross-platform tools
* [Appium](http://appium.io/) - An open source test automation framework for use with native, hybrid and mobile web apps. It drives iOS and Android apps using the WebDriver protocol.
    * [Appium Desktop](https://github.com/appium/appium-desktop) - Appium Desktop is an open source app for Mac, Windows, and Linux which gives you the power of the Appium automation server in a beautiful and flexible UI.
* [Winium.StoreApps](https://github.com/2gis/Winium.StoreApps/) - An open source test automation tool for Windows Store apps, tested on emulators. It is Selenium Remote WebDriver implementation.
* [Macaca](https://macacajs.com/) - Solution for Automation Test with Ease. Both Mobile, Desktop Platforms Supported, native, Hybrid, Mobile Web Multi-applications Supported, Command line tools & CI Solution provided.
* [Katalon](https://www.katalon.com/) - An all-in-one test automation solution

## Android
* [Robotium](https://code.google.com/p/robotium/) - An Android test automation framework that fully supports native and hybrid applications. Robotium makes it easy to write powerful and robust automatic black-box UI tests for Android applications. With the support of Robotium, test case developers can write function, system and user acceptance test scenarios, spanning multiple Android activities.
* [UIautomator](http://developer.android.com/tools/help/uiautomator/index.html) - Provides an efficient way to test UIs. It creates automated functional test cases that can be executed against apps on real Android devices and emulators. It includes a viewer, which is a GUI tool to scan and analyze the UI components of an Android app.
* [Espresso](https://code.google.com/p/android-test-kit/wiki/Espresso) - A pretty new test automation framework that got open-sourced just last year, making it available for developers and testers to hammer out their UIs. Espresso has an API that is small, predictable, easy to learn and built on top of the Android instrumentation framework. You can quickly write concise and reliable Android UI tests with it.
    * [Barista](https://github.com/AdevintaSpain/Barista) Barista makes developing UI test faster, easier and more predictable. Built on top of Espresso, it provides a simple and discoverable API, removing most of the boilerplate and verbosity of common Espresso tasks.
    * [Kakao](https://github.com/agoda-com/Kakao) Nice and simple DSL for Espresso in Kotlin
    * [Spoon](https://github.com/square/spoon) - Distributing instrumentation tests to all your Androids.
    * [Composer](https://github.com/gojuno/composer) Composer is a modern reactive replacement for square/spoon
    * [Flank](https://github.com/Flank/flank) Flank is a massively parallel Android and iOS test runner for Firebase Test Lab.
    * [Kaspresso](https://github.com/KasperskyLab/Kaspresso) Kaspresso is a great framework for UI testing. Based on Espresso and UI Automator, Kaspresso provides a wide range of additional amazing features.

## iOS
* [EarlGrey](https://github.com/google/EarlGrey) is a native iOS UI automation test framework that enables you to write clear, concise tests. With the EarlGrey framework, you have access to enhanced synchronization features. EarlGrey automatically synchronizes with the UI, network requests, and various queues; but still allows you to manually implement customized timings, if needed.
* [Bluepill](https://github.com/linkedin/bluepill) is a reliable iOS testing tool that runs UI tests using multiple simulators on a single machine.
* [KIF](https://github.com/kif-framework/KIF) is an iOS integration test framework. It allows for easy automation of iOS apps by leveraging the accessibility attributes that the OS makes available for those with visual disabilities.
* [XCUITest](https://developer.apple.com/library/archive/documentation/DeveloperTools/Conceptual/testing_with_xcode/chapters/09-ui_testing.html) is the automation framework that ships with Apple's XCode. The XCTest framework lets iOS app developers create and run unit tests, performance tests and UI tests for XCode projects.
    * [Flank](https://github.com/Flank/flank) Flank is a massively parallel Android and iOS test runner for Firebase Test Lab.
    * [Cucumberish](https://github.com/Ahmed-Ali/Cucumberish) Cucumberish is a test automation framework for Behaviour Driven Development (BDD). It is inspired by the amazing way of writing automated test cases introduced originally in Cucumber using the Gherkin language.

## Environment

* [Hive CI](http://bbc.github.io/hive-ci/) is a CI system built around devices. Connect your physical devices to a hive and run your tests on the same platforms as your users
* [STF](https://github.com/openstf/stf) - STF (or Smartphone Test Farm) is a web application for debugging smartphones, smartwatches and other gadgets remotely, from the comfort of your browser.
* [Genymotion](https://www.genymotion.com/) - Genymotion is one of the best free Android emulators on the market. The software, which is both powerful and easy to use, will be of interest to the naturally curious, as well as for Android developers.
* [SauceLabs](https://saucelabs.com/) - Provides the world's largest automation cloud for testing web and native/hybrid mobile applications. Founded by the original creator of Selenium, Sauce Labs helps companies accelerate software development cycles, improve application quality and deploy with confidence across 450+ browser / OS platforms, including Windows, Linux, iOS, Android & Mac OS X.
* [Browserstack](http://www.browserstack.com/) - Online tool which allows users to test their website from different browsers. The list of supported browsers includes Google Chrome, Internet Explorer, Opera and Safari. This even includes different browser versions as well including the beta versions as well. With Browserstack, you can test every aspect of your website like flash, CSS, Java and more.
* [Perfecto](https://www.perfecto.io/) Perfecto Is the Leading Testing Platform for Web & Mobile Apps
* [Kobiton](https://kobiton.com/) The only AI-infused real device testing platform built to accelerate your app delivery timeline from development to release.

## Continuous Integration

* [Bitrise](https://www.bitrise.io/) Build better mobile applications, faster
* [CircleCI](https://circleci.com/) Code. Commit. Done.
* [Jenkins](http://jenkins-ci.org/) - Jenkins is an award-winning application that monitors executions of repeated jobs, such as building a software project or jobs run by cron.

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
