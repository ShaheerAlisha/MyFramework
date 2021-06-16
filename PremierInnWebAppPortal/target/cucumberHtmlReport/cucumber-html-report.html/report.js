$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/AmendBooking.feature");
formatter.feature({
  "name": "Amend booking in PremierInn web portal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Change the arrival date to different date for the given set of BookingReferences",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user opens homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "user select Manage Booking",
  "keyword": "When "
});
formatter.step({
  "name": "enter \"\u003cBookingReference\u003e\",\"\u003cLastName\u003e\", \"\u003cArrivalDate\u003e\" to search booking",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the booking information \"\u003cBookingReference\u003e\" and click on Amend Booking",
  "keyword": "Then "
});
formatter.step({
  "name": "click on arrival date field and change the date \"\u003cAmendedDate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "capture the Rooms available information in csv file \"\u003cBookingReference\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "BookingReference",
        "LastName",
        "ArrivalDate",
        "AmendedDate"
      ]
    },
    {
      "cells": [
        "AYHR171492",
        "Tester",
        "21-June-21",
        "22-June-21"
      ]
    },
    {
      "cells": [
        "BGIR73460",
        "Tester",
        "21-June-21",
        "23-June-21"
      ]
    },
    {
      "cells": [
        "BFER85199",
        "Tester",
        "21-June-21",
        "24-June-21"
      ]
    },
    {
      "cells": [
        "AYHR171905",
        "Tester",
        "21-June-21",
        "25-June-21"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Change the arrival date to different date for the given set of BookingReferences",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AmendBookingStepDef.user_open_web_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Manage Booking",
  "keyword": "When "
});
formatter.match({
  "location": "AmendBookingStepDef.user_select_manage_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"AYHR171492\",\"Tester\", \"21-June-21\" to search booking",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.enter_to_search_booking(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the booking information \"AYHR171492\" and click on Amend Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.verify_the_booking_information_and_click_on_amend_booking(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on arrival date field and change the date \"22-June-21\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.click_on_arrival_date_field_and_change_the_date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "capture the Rooms available information in csv file \"AYHR171492\"",
  "keyword": "And "
});
formatter.match({
  "location": "AmendBookingStepDef.capture_the_rooms_available_information_in_csv_file(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Change the arrival date to different date for the given set of BookingReferences",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AmendBookingStepDef.user_open_web_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Manage Booking",
  "keyword": "When "
});
formatter.match({
  "location": "AmendBookingStepDef.user_select_manage_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"BGIR73460\",\"Tester\", \"21-June-21\" to search booking",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.enter_to_search_booking(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the booking information \"BGIR73460\" and click on Amend Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.verify_the_booking_information_and_click_on_amend_booking(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on arrival date field and change the date \"23-June-21\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.click_on_arrival_date_field_and_change_the_date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "capture the Rooms available information in csv file \"BGIR73460\"",
  "keyword": "And "
});
formatter.match({
  "location": "AmendBookingStepDef.capture_the_rooms_available_information_in_csv_file(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Change the arrival date to different date for the given set of BookingReferences",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AmendBookingStepDef.user_open_web_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Manage Booking",
  "keyword": "When "
});
formatter.match({
  "location": "AmendBookingStepDef.user_select_manage_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"BFER85199\",\"Tester\", \"21-June-21\" to search booking",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.enter_to_search_booking(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the booking information \"BFER85199\" and click on Amend Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.verify_the_booking_information_and_click_on_amend_booking(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on arrival date field and change the date \"24-June-21\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.click_on_arrival_date_field_and_change_the_date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "capture the Rooms available information in csv file \"BFER85199\"",
  "keyword": "And "
});
formatter.match({
  "location": "AmendBookingStepDef.capture_the_rooms_available_information_in_csv_file(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Change the arrival date to different date for the given set of BookingReferences",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AmendBookingStepDef.user_open_web_page_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Manage Booking",
  "keyword": "When "
});
formatter.match({
  "location": "AmendBookingStepDef.user_select_manage_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"AYHR171905\",\"Tester\", \"21-June-21\" to search booking",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.enter_to_search_booking(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the booking information \"AYHR171905\" and click on Amend Booking",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.verify_the_booking_information_and_click_on_amend_booking(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on arrival date field and change the date \"25-June-21\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AmendBookingStepDef.click_on_arrival_date_field_and_change_the_date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "capture the Rooms available information in csv file \"AYHR171905\"",
  "keyword": "And "
});
formatter.match({
  "location": "AmendBookingStepDef.capture_the_rooms_available_information_in_csv_file(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});