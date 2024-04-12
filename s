## Project Name - World Clock
 
## Problem Statement: 
	1. Verify Local Time, London Time and NewYork Time.
    2. Verify hot apps in OneCognizant portal.
	3. Print enabled and disabled apps and take screenshots.	

## Detailed Description: 
	1. Navigating to Be.cognizant and capture the user information.
	2. Scroll down and navigate to one cognizant.
	3. Go to hot apps and view all apps.
	4. Verify whether all alphabets are displayed and whether all are in enabled manner.
	5. Data of disabled alphabets should be printed.
	6. Choose a random alphabet and print all the apps that are displayed and also take screenshots for every test case
	7. Again navigate to becognizant, scroll down and verify whether world clock is displayed or not. 
	8. Check all the time zones mentioned and verify whether the local time is matching to our system time.
	9. Check the other country time zones and verify in the google whether it matches.
	10. Verify date, day and time mentioned.
	11. For other countries verify whether behind/ahead time is correct or not.

## Key Automation Scopes:  
	-Extract menu items & store in collections 
	-Handling different browser windows 
	-Handling search option
	-Taken screenshots
 
 
## About this Project:
 
	src/test/java contains 3 packages
	  -pageObjects package contains page object elements and methods.
	  -testCases package contains all the test cases.
	  -utilityMethods package contains extendReport.

	report folder contains
	  -automation-report.html is the report generated by using the Extent Reports.

	pom.xml contains the dependencies required by the project
	testng.xml file is for running the test cases.
 
	test-output folder contains testng report and other files.

	In this project we have also performed the cross browser testing (chrome,edge).

 
## Tools and Technologies used:
	-Selenium with Java in Eclipse IDE
	-TestNG
	-Maven
	-WebDriverManager
	-ExtentReports
 
 

 	


