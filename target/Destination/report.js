$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("googlePageContent.feature");
formatter.feature({
  "line": 1,
  "name": "testing if all the fields are appeared on home page",
  "description": "",
  "id": "testing-if-all-the-fields-are-appeared-on-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "verify fields on homepage",
  "description": "",
  "id": "testing-if-all-the-fields-are-appeared-on-home-page;verify-fields-on-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on Google homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I should verify links below",
  "rows": [
    {
      "cells": [
        "linkSelector",
        "linkText"
      ],
      "line": 6
    },
    {
      "cells": [
        "//*[@id\u003d\"gbw\"]/div/div/div[1]/div[1]/a",
        "Gmail"
      ],
      "line": 7
    },
    {
      "cells": [
        "//*[@id\u003d\"gbw\"]/div/div/div[1]/div[2]/a",
        "Images"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify Google search \"#lst-ib\"field",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepDef.i_am_on_Google_homepage()"
});
formatter.result({
  "duration": 20339864020,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDef.i_should_verify_links_below(DataTable)"
});
formatter.result({
  "duration": 337723283,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#lst-ib",
      "offset": 24
    }
  ],
  "location": "GoogleStepDef.i_verify_field(String)"
});
formatter.result({
  "duration": 42782240,
  "status": "passed"
});
});