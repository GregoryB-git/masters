package bolts;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class MeasurementEvent
{
  public static final String APP_LINK_NAVIGATE_IN_EVENT_NAME = "al_nav_in";
  public static final String APP_LINK_NAVIGATE_OUT_EVENT_NAME = "al_nav_out";
  public static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
  public static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
  public static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
  private Context appContext;
  private Bundle args;
  private String name;
  
  private MeasurementEvent(Context paramContext, String paramString, Bundle paramBundle)
  {
    appContext = paramContext.getApplicationContext();
    name = paramString;
    args = paramBundle;
  }
  
  private static Bundle getApplinkLogData(Context paramContext, String paramString, Bundle paramBundle, Intent paramIntent)
  {
    Bundle localBundle1 = new Bundle();
    paramContext = paramIntent.resolveActivity(paramContext.getPackageManager());
    if (paramContext != null) {
      localBundle1.putString("class", paramContext.getShortClassName());
    }
    if ("al_nav_out".equals(paramString))
    {
      if (paramContext != null) {
        localBundle1.putString("package", paramContext.getPackageName());
      }
      if (paramIntent.getData() != null) {
        localBundle1.putString("outputURL", paramIntent.getData().toString());
      }
      if (paramIntent.getScheme() != null) {
        localBundle1.putString("outputURLScheme", paramIntent.getScheme());
      }
    }
    else if ("al_nav_in".equals(paramString))
    {
      if (paramIntent.getData() != null) {
        localBundle1.putString("inputURL", paramIntent.getData().toString());
      }
      if (paramIntent.getScheme() != null) {
        localBundle1.putString("inputURLScheme", paramIntent.getScheme());
      }
    }
    paramContext = paramBundle.keySet().iterator();
    while (paramContext.hasNext())
    {
      paramString = (String)paramContext.next();
      paramIntent = paramBundle.get(paramString);
      if ((paramIntent instanceof Bundle))
      {
        Bundle localBundle2 = (Bundle)paramIntent;
        paramIntent = localBundle2.keySet().iterator();
        while (paramIntent.hasNext())
        {
          String str1 = (String)paramIntent.next();
          String str2 = objectToJSONString(localBundle2.get(str1));
          if (paramString.equals("referer_app_link"))
          {
            if (str1.equalsIgnoreCase("url"))
            {
              localBundle1.putString("refererURL", str2);
              continue;
            }
            if (str1.equalsIgnoreCase("app_name"))
            {
              localBundle1.putString("refererAppName", str2);
              continue;
            }
            if (str1.equalsIgnoreCase("package"))
            {
              localBundle1.putString("sourceApplication", str2);
              continue;
            }
          }
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(paramString);
          localStringBuilder.append("/");
          localStringBuilder.append(str1);
          localBundle1.putString(localStringBuilder.toString(), str2);
        }
      }
      else
      {
        paramIntent = objectToJSONString(paramIntent);
        if (paramString.equals("target_url"))
        {
          paramString = Uri.parse(paramIntent);
          localBundle1.putString("targetURL", paramString.toString());
          localBundle1.putString("targetURLHost", paramString.getHost());
        }
        else
        {
          localBundle1.putString(paramString, paramIntent);
        }
      }
    }
    return localBundle1;
  }
  
  private static String objectToJSONString(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((!(paramObject instanceof JSONArray)) && (!(paramObject instanceof JSONObject))) {
      try
      {
        Object localObject;
        if ((paramObject instanceof Collection))
        {
          localObject = new org/json/JSONArray;
          ((JSONArray)localObject).<init>((Collection)paramObject);
          return ((JSONArray)localObject).toString();
        }
        if ((paramObject instanceof Map))
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>((Map)paramObject);
          return ((JSONObject)localObject).toString();
        }
        paramObject = paramObject.toString();
        return (String)paramObject;
      }
      catch (Exception paramObject)
      {
        return null;
      }
    }
    return paramObject.toString();
  }
  
  private void sendBroadcast()
  {
    if (name == null) {
      Log.d(getClass().getName(), "Event name is required");
    }
    try
    {
      int i = LocalBroadcastManager.MSG_EXEC_PENDING_BROADCASTS;
      Object localObject = LocalBroadcastManager.class.getMethod("getInstance", new Class[] { Context.class });
      Method localMethod = LocalBroadcastManager.class.getMethod("sendBroadcast", new Class[] { Intent.class });
      localObject = ((Method)localObject).invoke(null, new Object[] { appContext });
      Intent localIntent = new android/content/Intent;
      localIntent.<init>("com.parse.bolts.measurement_event");
      localIntent.putExtra("event_name", name);
      localIntent.putExtra("event_args", args);
      localMethod.invoke(localObject, new Object[] { localIntent });
    }
    catch (Exception localException)
    {
      Log.d(getClass().getName(), "LocalBroadcastManager in android support library is required to raise bolts event.");
    }
  }
  
  public static void sendBroadcastEvent(Context paramContext, String paramString, Intent paramIntent, Map<String, String> paramMap)
  {
    Object localObject1 = new Bundle();
    Object localObject2 = localObject1;
    if (paramIntent != null)
    {
      localObject2 = AppLinks.getAppLinkData(paramIntent);
      if (localObject2 != null)
      {
        localObject2 = getApplinkLogData(paramContext, paramString, (Bundle)localObject2, paramIntent);
      }
      else
      {
        localObject2 = paramIntent.getData();
        if (localObject2 != null) {
          ((BaseBundle)localObject1).putString("intentData", ((Uri)localObject2).toString());
        }
        Bundle localBundle = paramIntent.getExtras();
        localObject2 = localObject1;
        if (localBundle != null)
        {
          paramIntent = localBundle.keySet().iterator();
          for (;;)
          {
            localObject2 = localObject1;
            if (!paramIntent.hasNext()) {
              break;
            }
            localObject2 = (String)paramIntent.next();
            ((BaseBundle)localObject1).putString((String)localObject2, objectToJSONString(localBundle.get((String)localObject2)));
          }
        }
      }
    }
    if (paramMap != null)
    {
      paramIntent = paramMap.keySet().iterator();
      while (paramIntent.hasNext())
      {
        localObject1 = (String)paramIntent.next();
        ((BaseBundle)localObject2).putString((String)localObject1, (String)paramMap.get(localObject1));
      }
    }
    new MeasurementEvent(paramContext, paramString, (Bundle)localObject2).sendBroadcast();
  }
}

/* Location:
 * Qualified Name:     bolts.MeasurementEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */