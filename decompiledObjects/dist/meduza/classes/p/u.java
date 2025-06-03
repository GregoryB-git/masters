package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

public final class u
{
  public final Object a = new Object();
  public final ICustomTabsService b;
  public final ICustomTabsCallback c;
  public final ComponentName d;
  public final PendingIntent e;
  
  public u(ICustomTabsService paramICustomTabsService, m paramm, ComponentName paramComponentName)
  {
    b = paramICustomTabsService;
    c = paramm;
    d = paramComponentName;
    e = null;
  }
  
  public final Bundle a(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    if (paramBundle != null) {
      localBundle.putAll(paramBundle);
    }
    paramBundle = e;
    if (paramBundle != null) {
      localBundle.putParcelable("android.support.customtabs.extra.SESSION_ID", paramBundle);
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     p.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */