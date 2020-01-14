$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contact.feature");
formatter.feature({
  "line": 1,
  "name": "Contact Page Details",
  "description": "",
  "id": "contact-page-details",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Adding contact page details",
  "description": "",
  "id": "contact-page-details;adding-contact-page-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user click on conact page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user click on New button and enters users details",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user click on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "verify Success message",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the brouser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactPageTest.user_is_on_home_page()"
});
formatter.result({
  "duration": 61297596600,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.user_click_on_conact_page()"
});
formatter.result({
  "duration": 4671548900,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.user_click_on_New_button_and_enters_users_details()"
});
formatter.result({
  "duration": 7211746300,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.user_click_on_save_button()"
});
formatter.result({
  "duration": 197924800,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.verify_Success_message()"
});
formatter.result({
  "duration": 103795600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.close_the_brouser()"
});
formatter.result({
  "duration": 4648643500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Deleting contact page details",
  "description": "",
  "id": "contact-page-details;deleting-contact-page-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user click on conact page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Select the user that is to be deleted",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Delete Item",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Validate the delete message and contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close the brouser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactPageTest.user_is_on_home_page()"
});
formatter.result({
  "duration": 34491938500,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.user_click_on_conact_page()"
});
formatter.result({
  "duration": 7122466200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginPageTest.close_the_brouser()"
});
formatter.result({
  "status": "skipped"
});
});