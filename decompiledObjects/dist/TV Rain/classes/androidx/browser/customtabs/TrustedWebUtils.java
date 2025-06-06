package androidx.browser.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.app.BundleCompat;

public class TrustedWebUtils
{
  public static final String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
  
  public static void launchAsTrustedWebActivity(@NonNull Context paramContext, @NonNull CustomTabsIntent paramCustomTabsIntent, @NonNull Uri paramUri)
  {
    if (BundleCompat.getBinder(intent.getExtras(), "android.support.customtabs.extra.SESSION") != null)
    {
      intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
      paramCustomTabsIntent.launchUrl(paramContext, paramUri);
      return;
    }
    throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
  }
}

/* Location:
 * Qualified Name:     androidx.browser.customtabs.TrustedWebUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */