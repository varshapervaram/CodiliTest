$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/varsha.pervaram/IdeaProjects/CodiliTest/src/test/resources/featureFiles/viewCart.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "###########################################################################################################################################################"
    },
    {
      "line": 2,
      "value": "#"
    }
  ],
  "line": 3,
  "name": "Wish list lowest price item added to cart for Demo Shop Application",
  "description": "",
  "id": "wish-list-lowest-price-item-added-to-cart-for-demo-shop-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10296386500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "###########################################################################################################################################################"
    }
  ],
  "line": 7,
  "name": "Wish list lowest price item added to MyCart for Demo Shop Application",
  "description": "",
  "id": "wish-list-lowest-price-item-added-to-cart-for-demo-shop-application;wish-list-lowest-price-item-added-to-mycart-for-demo-shop-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I add four different products to my wish list",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I view my wish list table",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I find total four selected items in my wish list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I search for lowest price product",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I must be able to add the lowest price item to my cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I am able to verify the item in my cart",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAddFourDifferentProductsToMyWishList()"
});
formatter.result({
  "duration": 3874942400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iViewMyWishListTable()"
});
formatter.result({
  "duration": 1509984500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iFindTotalFourSelectedItemsInMyWishList()"
});
formatter.result({
  "duration": 347942700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSearchForLowestPriceProduct()"
});
formatter.result({
  "duration": 358633000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMustBeAbleToAddTheLowestPriceItemToMyCart()"
});
formatter.result({
  "duration": 132554800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iAmAbleToVerifyTheItemInMyCart()"
});
formatter.result({
  "duration": 2395295500,
  "status": "passed"
});
});