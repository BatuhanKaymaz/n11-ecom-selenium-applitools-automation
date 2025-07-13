n11-ecom-selenium-applitools-automation
n11-ecom-visual-automation-test This project is a test automation solution developed to automate a critical user flow and detect visual regressions on the N11.com e-commerce platform. The project combines functional test automation with Selenium WebDriver and visual AI-powered test automation with Applitools Eyes.

🚀 Project Objective: To automate a core e-commerce flow on N11.com (login, search, add to cart, and monitor custom product changes).

To proactively detect user interface (UI) changes and visual errors on the cart page using Applitools Eyes.

To enable continuous and automated test execution by integrating the developed tests into the Jenkins CI/CD pipeline.

✨ Test Scenario: This automation test covers the following steps:

N11.com is successfully logged in.

Searches for "laptop" using the search bar.

Adds a specific laptop product to the cart from the search results.

Takes a snapshot of the cart page with Applitools Eyes, compares it to predefined base images, and reports visual differences.

🛠️ Technologies Used: Java: The core programming language.

Selenium WebDriver: For web browser automation.

Applitools Eyes: For AI-powered visual test automation and UI regression detection.

TestNG: A testing framework for orchestrating and running tests.

Maven: A project dependency management and build tool.

ChromeDriver: For automating the Google Chrome browser.

Jenkins: For Continuous Integration (CI) and automated test execution.

📦 Project Structure. ├── src │ ├── main │ │ └── java │ │ └── io.github.BatuhanKaymaz │ │ └── Main (Main application or launch point) │ └── test │ └── java │ └── io.github.BatuhanKaymaz │ ├── base │ │ ├── BasePage.java │ │ └── BaseTest.java (Management of WebDriver and Applitools Views) │ ├── pages │ │ ├── BasketPage.java │ │ ├── LoginPage.java │ │ ├── ProductPage.java │ │ ├── ResultPage.java │ │ └── TabBarPage.java (Page Object Model implementation) │ ├── tests │ │ └── N11Test.java (Main test case and TestNG test methods) │ └── tools │ └── Secrets.java (API keys and sensitive information) ├── target (Maven (compile output) ├── .env (Environment variables - for local execution) ├── .gitignore └── pom.xml (Maven project configuration) ⚙️ Installation and Run Prerequisites:

Java Development Kit (JDK) 8+

Maven

Google Chrome Browser

Jenkins (optional, for CI/CD)

Applitools API Key (obtain from your Applitools account)
