# n11-ecom-selenium-applitools-automation
n11-ecom-visual-automation-test
This project is a test automation solution developed to automate a critical user flow on the N11.com e-commerce platform and detect visual regressions. The project combines functional test automation with Selenium WebDriver and visual AI-powered test automation with Applitools Eyes.

🚀 Project Objective
To automate a core e-commerce flow (login, search, add to cart) on N11.com.

To proactively detect user interface (UI) changes and visual errors on the cart page using Applitools Eyes.

To enable continuous and automated test executions by integrating the developed tests into the Jenkins CI/CD pipeline.

✨ Test Scenario
This automation test covers the following steps:

Successfully logs into N11.com.

Performs a product search for "laptop" using the search bar.

Adds a specific laptop product to the cart from the search results.

It takes a snapshot of the cart page with Applitools Eyes, compares it with previously defined baseline images, and reports visual differences.

🛠️ Technologies Used
Java: The basic programming language.

Selenium WebDriver: For web browser automation.

Applitools Eyes: For AI-powered visual test automation and UI regression detection.

TestNG: A testing framework for organizing and running tests.

Maven: A project dependency management and build tool.

ChromeDriver: For automating the Google Chrome browser.

Jenkins: For Continuous Integration (CI) and automated test execution.

📦 Project Structure
.
├── src
│ ├── main
│ │ └── java
│ │ └── io.github.BatuhanKaymaz
│ │ └── Main (Main application or launch point)
│ └── test
│ └── java
│ └── io.github.BatuhanKaymaz
│ ├── base
│ │ ├── BasePage.java
│ │ └── BaseTest.java (Management of WebDriver and Applitools Eyes)
│ ├── pages
│ │ ├── BasketPage.java
│ │ ├── LoginPage.java
│ │ ├── ProductPage.java
│ │ ├── ResultPage.java
│ │ └── TabBarPage.java (Page Object Model implementation)
│ ├── tests
│ │ └── N11Test.java (Main test case and TestNG test methods)
│ └── utils
│ └── Secrets.java (API keys and sensitive information)
├── target (Maven build output)
├── .env (Environment variables - for local execution)
├── .gitignore
└── pom.xml (Maven project configuration)
⚙️ Installation and Run
Prerequisites:

Java Development Kit (JDK) 8+

Maven

Google Chrome Browser

Jenkins (optional, for CI/CD)

Applitools API Key (obtain from your Applitools account)
