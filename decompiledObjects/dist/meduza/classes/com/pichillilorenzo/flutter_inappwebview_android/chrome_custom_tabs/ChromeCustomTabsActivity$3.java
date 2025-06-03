package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.os.Bundle;
import p.v;

class ChromeCustomTabsActivity$3
  implements v
{
  public ChromeCustomTabsActivity$3(ChromeCustomTabsActivity paramChromeCustomTabsActivity) {}
  
  public void onGreatestScrollPercentageIncreased(int paramInt, Bundle paramBundle)
  {
    paramBundle = this$0.channelDelegate;
    if (paramBundle != null) {
      paramBundle.onGreatestScrollPercentageIncreased(paramInt);
    }
  }
  
  public void onSessionEnded(boolean paramBoolean, Bundle paramBundle)
  {
    paramBundle = this$0.channelDelegate;
    if (paramBundle != null) {
      paramBundle.onSessionEnded(paramBoolean);
    }
  }
  
  public void onVerticalScrollEvent(boolean paramBoolean, Bundle paramBundle)
  {
    paramBundle = this$0.channelDelegate;
    if (paramBundle != null) {
      paramBundle.onVerticalScrollEvent(paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */