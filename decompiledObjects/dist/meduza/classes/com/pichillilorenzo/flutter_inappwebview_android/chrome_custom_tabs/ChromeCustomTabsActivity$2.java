package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.net.Uri;
import android.os.Bundle;
import p.b;

class ChromeCustomTabsActivity$2
  extends b
{
  public ChromeCustomTabsActivity$2(ChromeCustomTabsActivity paramChromeCustomTabsActivity) {}
  
  public void extraCallback(String paramString, Bundle paramBundle) {}
  
  public void onMessageChannelReady(Bundle paramBundle)
  {
    paramBundle = this$0.channelDelegate;
    if (paramBundle != null) {
      paramBundle.onMessageChannelReady();
    }
  }
  
  public void onNavigationEvent(int paramInt, Bundle paramBundle)
  {
    if (paramInt == 5)
    {
      paramBundle = this$0;
      if (!onOpened)
      {
        onOpened = true;
        paramBundle = channelDelegate;
        if (paramBundle != null) {
          paramBundle.onOpened();
        }
      }
    }
    if (paramInt == 2)
    {
      paramBundle = this$0;
      if (!onCompletedInitialLoad)
      {
        onCompletedInitialLoad = true;
        paramBundle = channelDelegate;
        if (paramBundle != null) {
          paramBundle.onCompletedInitialLoad();
        }
      }
    }
    paramBundle = this$0.channelDelegate;
    if (paramBundle != null) {
      paramBundle.onNavigationEvent(paramInt);
    }
  }
  
  public void onPostMessage(String paramString, Bundle paramBundle)
  {
    paramBundle = this$0.channelDelegate;
    if (paramBundle != null) {
      paramBundle.onPostMessage(paramString);
    }
  }
  
  public void onRelationshipValidationResult(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle)
  {
    paramBundle = this$0.channelDelegate;
    if (paramBundle != null) {
      paramBundle.onRelationshipValidationResult(paramInt, paramUri, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */