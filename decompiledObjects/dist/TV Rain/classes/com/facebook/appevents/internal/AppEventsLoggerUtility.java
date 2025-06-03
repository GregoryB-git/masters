package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppEventsLoggerUtility
{
  private static final Map<GraphAPIActivityType, String> API_ACTIVITY_TYPE_TO_STRING = new HashMap() {};
  
  public static JSONObject getJSONObjectForGraphAPICall(GraphAPIActivityType paramGraphAPIActivityType, AttributionIdentifiers paramAttributionIdentifiers, String paramString, boolean paramBoolean, Context paramContext)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("event", API_ACTIVITY_TYPE_TO_STRING.get(paramGraphAPIActivityType));
    paramGraphAPIActivityType = AppEventsLogger.getUserID();
    if (paramGraphAPIActivityType != null) {
      localJSONObject.put("app_user_id", paramGraphAPIActivityType);
    }
    Utility.setAppEventAttributionParameters(localJSONObject, paramAttributionIdentifiers, paramString, paramBoolean);
    try
    {
      Utility.setAppEventExtendedDeviceInfoParameters(localJSONObject, paramContext);
    }
    catch (Exception paramGraphAPIActivityType)
    {
      Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] { paramGraphAPIActivityType.toString() });
    }
    paramAttributionIdentifiers = Utility.getDataProcessingOptions();
    if (paramAttributionIdentifiers != null)
    {
      paramGraphAPIActivityType = paramAttributionIdentifiers.keys();
      while (paramGraphAPIActivityType.hasNext())
      {
        paramString = (String)paramGraphAPIActivityType.next();
        localJSONObject.put(paramString, paramAttributionIdentifiers.get(paramString));
      }
    }
    localJSONObject.put("application_package_name", paramContext.getPackageName());
    return localJSONObject;
  }
  
  public static enum GraphAPIActivityType
  {
    static
    {
      GraphAPIActivityType localGraphAPIActivityType1 = new GraphAPIActivityType("MOBILE_INSTALL_EVENT", 0);
      MOBILE_INSTALL_EVENT = localGraphAPIActivityType1;
      GraphAPIActivityType localGraphAPIActivityType2 = new GraphAPIActivityType("CUSTOM_APP_EVENTS", 1);
      CUSTOM_APP_EVENTS = localGraphAPIActivityType2;
      $VALUES = new GraphAPIActivityType[] { localGraphAPIActivityType1, localGraphAPIActivityType2 };
    }
    
    private GraphAPIActivityType() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.AppEventsLoggerUtility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */