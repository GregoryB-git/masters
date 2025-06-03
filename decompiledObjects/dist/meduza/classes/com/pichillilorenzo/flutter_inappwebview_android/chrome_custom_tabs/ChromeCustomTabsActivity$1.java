package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

class ChromeCustomTabsActivity$1
  implements CustomTabActivityHelper.ConnectionCallback
{
  public void onCustomTabsConnected()
  {
    this$0.customTabsConnected();
    ChromeCustomTabsChannelDelegate localChromeCustomTabsChannelDelegate = this$0.channelDelegate;
    if (localChromeCustomTabsChannelDelegate != null) {
      localChromeCustomTabsChannelDelegate.onServiceConnected();
    }
  }
  
  public void onCustomTabsDisconnected()
  {
    val$chromeCustomTabsActivity.close();
    this$0.dispose();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */