package com.daralkhaleej.gulftoday;

public class Config {


    public static final String PURCHASECODE = "xxxxxx-xxxxxx-xxxxxx-xxxxxx-xxxxxx";


    /**
     * Main configuration of the WebView
     */

    // Domain host without http:// (e.g. "www.example.org")
    public static final String HOST = "www.gulftoday.ae";

    // Your URL including http:// and www.
    public static final String HOME_URL = "https://www.gulftoday.ae";

    // Customized UserAgent for WebView URL requests (leave it empty to use the default Android UserAgent)
    public static final String USER_AGENT = "Mozilla/5.0 (Linux; Android 9; SM-G973F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.101 Mobile Safari/537.36";

    // Set to true to open external links in another browser
    public static final boolean OPEN_EXTERNAL_URLS_IN_ANOTHER_BROWSER = true;//

    // Set to true to clear the WebView cache on each app startup and do not use cached versions of your web app/website
    public static final boolean CLEAR_CACHE_ON_STARTUP = true;//

    //Set to "true" to use local "assets/index.html" file instead of URL
    public static final boolean USE_LOCAL_HTML_FOLDER = false;

    //Set to "true" to enable deeplinking
    public static final boolean IS_DEEP_LINKING_ENABLED = true;

    //Set the splash screen timeout in milliseconds
    public static final int SPLASH_TIMEOUT = 200;


    /**
     * Dialogs
     */

    // The minimum number of days to be passed after the application is installed before the rating dialog is shown
    public static final int RATE_DAYS_UNTIL_PROMPT = 3;
    // The minimum number of application launches before the rating dialog is shown
    public static final int RATE_LAUNCHES_UNTIL_PROMPT = 3;

    // The minimum number of days to be passed after the application is installed before the Facebook dialog is shown
    public static final int FACEBOOK_DAYS_UNTIL_PROMPT = 2000;
    // The minimum number of application launches before the Facebook dialog is shown
    public static final int FACEBOOK_LAUNCHES_UNTIL_PROMPT = 0; //4000;
    // URL of your Facebook page
    public static final String FACEBOOK_URL = "https://www.facebook.com/";

    //OneSignal options
    //set to true to activate OneSignal Push (set OneSignal IDs in the build.gradle file)
    public static final boolean PUSH_ENABLED = true;

    //set to true if you want to extend URL request by ?onesignal_push_id=XYZ (set OneSignal IDs in the build.gradle file)
    public static final boolean PUSH_ENHANCE_WEBVIEW_URL = true;

    //set to true if WebView should be reloaded when the app gets a UserID from OneSignal (set OneSignal IDs in the build.gradle file)
    public static final boolean PUSH_RELOAD_ON_USERID = true;

    //AdMob options
    //set to true if you want to display AdMob banner ads (set AdMob IDs in the strings.xml file)
    public static final boolean SHOW_BANNER_AD = false;

    //set to true if you want to display AdMob fullscreen interstitial ads after X website clicks (set AdMob IDs in the strings.xml file)
    public static final boolean SHOW_FULL_SCREEN_AD = false;

    //X website clicks for AdMob interstitial ads (set AdMob IDs in the strings.xml file)
    public static final int SHOW_AD_AFTER_X = 5;

    //Set Google Play In-App Purchase Key (from Google Play Developer Console)
    public static final String PURCHASE_LICENSE_KEY = "123456789";
}