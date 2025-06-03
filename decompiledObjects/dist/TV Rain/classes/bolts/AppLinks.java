package bolts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;

public final class AppLinks
{
  public static final String KEY_NAME_APPLINK_DATA = "al_applink_data";
  public static final String KEY_NAME_EXTRAS = "extras";
  public static final String KEY_NAME_TARGET = "target_url";
  
  public static Bundle getAppLinkData(Intent paramIntent)
  {
    return paramIntent.getBundleExtra("al_applink_data");
  }
  
  public static Bundle getAppLinkExtras(Intent paramIntent)
  {
    paramIntent = getAppLinkData(paramIntent);
    if (paramIntent == null) {
      return null;
    }
    return paramIntent.getBundle("extras");
  }
  
  public static Uri getTargetUrl(Intent paramIntent)
  {
    Object localObject = getAppLinkData(paramIntent);
    if (localObject != null)
    {
      localObject = ((BaseBundle)localObject).getString("target_url");
      if (localObject != null) {
        return Uri.parse((String)localObject);
      }
    }
    return paramIntent.getData();
  }
  
  public static Uri getTargetUrlFromInboundIntent(Context paramContext, Intent paramIntent)
  {
    Object localObject = getAppLinkData(paramIntent);
    if (localObject != null)
    {
      localObject = ((BaseBundle)localObject).getString("target_url");
      if (localObject != null)
      {
        MeasurementEvent.sendBroadcastEvent(paramContext, "al_nav_in", paramIntent, null);
        return Uri.parse((String)localObject);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     bolts.AppLinks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */