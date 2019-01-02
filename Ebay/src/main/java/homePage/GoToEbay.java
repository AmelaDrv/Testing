package homePage;

import base.commonAPI;

public class GoToEbay extends commonAPI {
    //this is where we put the parameter
    String url = "https://www.ebay.com/";

    public void ebayHomePage(){
        driver.get(url);

    }
   /* public void searchBox() {
        typeOnCss("gh-tb ui-autocomplete-input", "Headphones");
    }*/
}
