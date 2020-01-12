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
formatter.match({
  "location": "ContactPageTest.user_is_on_home_page()"
});
formatter.result({
  "duration": 54638501600,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.user_click_on_conact_page()"
});
formatter.result({
  "duration": 3312330300,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.user_click_on_New_button_and_enters_users_details()"
});
formatter.result({
  "duration": 5696701800,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.user_click_on_save_button()"
});
formatter.result({
  "duration": 295829500,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageTest.verify_Success_message()"
});
formatter.result({
  "duration": 44239400,
  "status": "passed"
});
});