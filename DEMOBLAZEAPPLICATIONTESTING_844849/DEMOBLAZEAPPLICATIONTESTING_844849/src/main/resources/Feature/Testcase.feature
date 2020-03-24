@DemoBlaze_Feature
Feature: DemoBlaze Website

@tc01_demoblazeloginusingexcel
Scenario:
Given the user launched the chromebrowser
When the user open the Demoblaze website
Then user clicks on login button
And user will enter the username password using excel
Then handling the popup message by using assert

@tc02_demoblazeloginandlogout
Scenario:
Given user launched the chromebrowser
When the user opens Demoblazeapplication
Then user will click on the loginbutton
Then user will enter credentials
Then user will logout

@tc03_demoblazeupdatecart
Scenario:

Given user launches the chromebrowser
When the user opened the demoblaze website
Then user will add multiple products and will display price on console window
And user will tahe the screenshot of the addedproducts.

@tc04_demoblazeplacetheorder
Scenario:

Given user launches ChromeBrowser
When the user open demoBlaze
Then user will add the product and place the order
