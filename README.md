# OpencartTesting
Detach opencart demo site related testing from automation UI project
and include multiple QA members to do testing

# Agile Board 
https://trello.com/b/MVdb3O1a/weekend-project-automation-ui-selenium

# Test cases 
https://drive.google.com/drive/folders/0Bzvlm2T8LMb1N2ktem9qTU8xRUE?usp=sharing


# Level In Source : 

1. Common Usages : -> Package Start with Org. -> Utils -> Managers -> 

2. Project Specific : -> Package Start with Project. -> Helpers : Project Specific Helpers -> Pages : POM Model 3.

# Level in Test : 

1. Test Steps -> Reusable test steps, all are test 
2. Workflows (group of test steps preset for testing) 
3. Tests, for specific purposes 4. Groupped Tests 5. Tests Suits.

Libs:(gradually Increments) Selenium-java Junit Allure-Junit SL4J AspectJ

Running The tests : Maven Test Run ->Locally ->From Jenkins or any CI (for CLI support , there will be an entry from Program -> main method) ->With Webdriver Remote Driver execution

Converted to multiple Maven Project
- Common utils
- selenium utils
 - project pages + tests
 - Contribute

Fork it. Create a branch (git checkout -b myBranch) Commit your changes (git commit -am "Added feature") Push to the branch (git push origin myBranch) Create a new Issue with a link to your branch, or just make a Pull Request.

I will enrich more scripts so that it is useful to support more typr of angular apps

# Project structure 
 - Single Module Maven Project to minimize complexity 
 
 - Cucumber intregration (optional, open for discussion)
 
 - Allure Integration (optional, open for discussion)

# Project Goal 
Testing Open cart site

# Driver 
Dwnload driver and put in driver folder (which will be used in property) 

# Notes : 
Currently, code is out dated 
# Dependencies 
 - Selenium 
 - Webdriver Manager
# Useful Maven comamnds 
- To test : mvn test, mvn verify
- To Run 

# Report : 
1. Allure report
2. Maven failsafe 
3. Cucumber 

# Report Note 
-create a folder for reports in project root (src lavel)  

# remote driver 
- Remote Driver management 

# Todo : 
1. Yandex Element 
2. Selenide
3. Local Remote Driver
4. Test Case in Allure

