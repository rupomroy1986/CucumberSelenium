$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for Vegetables",
  "description": "",
  "id": "search-and-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search for items and validate results",
  "description": "",
  "id": "search-and-place-order-for-vegetables;search-for-items-and-validate-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searched for cucumber Vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"Cucumber - 1 Kg\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "duration": 6417645340,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber",
      "offset": 18
    }
  ],
  "location": "MyStepDefinitions.user_searched_for_vegetable(String)"
});
formatter.result({
  "duration": 6117099070,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber - 1 Kg",
      "offset": 1
    }
  ],
  "location": "MyStepDefinitions.something_results_are_displayed(String)"
});
formatter.result({
  "duration": 5051881757,
  "status": "passed"
});
formatter.after({
  "duration": 593064521,
  "status": "passed"
});
});