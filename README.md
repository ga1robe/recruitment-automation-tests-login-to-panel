# recruitment-automation-tests-login-to-panel

Preparation of tests to automate the operation, logging into the client's panel at nazwa.pl.

The page with the login form is available at
https://www.nazwa.pl/zaloguj-sie.

Tech stack Java / Junit5 / Selenium (chromedriver) / Maven.

Tests were performed on
ChromeDriver 96.0.4664.45.
Please change to the appropriate version.

In case of too many requests (from one IP per unit of time) a captcha will appear in the login form, then you have to wait about 1 hour.