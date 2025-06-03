package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;

final class CustomTabsClient$1
  extends CustomTabsServiceConnection
{
  public CustomTabsClient$1(Context paramContext) {}
  
  public final void onCustomTabsServiceConnected(ComponentName paramComponentName, CustomTabsClient paramCustomTabsClient)
  {
    paramCustomTabsClient.warmup(0L);
    val$applicationContext.unbindService(this);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {}
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.CustomTabsClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */