package androidx.browser.customtabs;

import android.os.IBinder.DeathRecipient;

class CustomTabsService$1$1
  implements IBinder.DeathRecipient
{
  public CustomTabsService$1$1(CustomTabsService.1 param1, CustomTabsSessionToken paramCustomTabsSessionToken) {}
  
  public void binderDied()
  {
    this$1.this$0.cleanUpSession(val$sessionToken);
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsService.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */