package androidx.browser.customtabs;

import android.os.Bundle;

class CustomTabsClient$2$1
  implements Runnable
{
  public CustomTabsClient$2$1(CustomTabsClient.2 param2, int paramInt, Bundle paramBundle) {}
  
  public void run()
  {
    this$1.val$callback.onNavigationEvent(val$navigationEvent, val$extras);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsClient.2.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */