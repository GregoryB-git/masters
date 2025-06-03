package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public class L
{
  public final Bundle a;
  
  public L(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      a = new Bundle(paramBundle);
      return;
    }
    throw new NullPointerException("data");
  }
  
  public static int d(String paramString)
  {
    int i = Color.parseColor(paramString);
    if (i != -16777216) {
      return i;
    }
    throw new IllegalArgumentException("Transparent color is invalid");
  }
  
  public static boolean s(String paramString)
  {
    boolean bool;
    if ((!paramString.startsWith("google.c.a.")) && (!paramString.equals("from"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean t(Bundle paramBundle)
  {
    boolean bool;
    if ((!"1".equals(paramBundle.getString("gcm.n.e"))) && (!"1".equals(paramBundle.getString(v("gcm.n.e"))))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean u(String paramString)
  {
    boolean bool;
    if ((!paramString.startsWith("google.c.")) && (!paramString.startsWith("gcm.n.")) && (!paramString.startsWith("gcm.notification."))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static String v(String paramString)
  {
    if (!paramString.startsWith("gcm.n.")) {
      return paramString;
    }
    return paramString.replace("gcm.n.", "gcm.notification.");
  }
  
  public static String z(String paramString)
  {
    String str = paramString;
    if (paramString.startsWith("gcm.n.")) {
      str = paramString.substring(6);
    }
    return str;
  }
  
  public boolean a(String paramString)
  {
    paramString = p(paramString);
    boolean bool;
    if ((!"1".equals(paramString)) && (!Boolean.parseBoolean(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Integer b(String paramString)
  {
    String str = p(paramString);
    if (!TextUtils.isEmpty(str)) {
      try
      {
        int i = Integer.parseInt(str);
        return Integer.valueOf(i);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Couldn't parse value of ");
        localStringBuilder.append(z(paramString));
        localStringBuilder.append("(");
        localStringBuilder.append(str);
        localStringBuilder.append(") into an int");
        Log.w("NotificationParams", localStringBuilder.toString());
      }
    }
    return null;
  }
  
  public JSONArray c(String paramString)
  {
    String str = p(paramString);
    if (!TextUtils.isEmpty(str)) {
      try
      {
        JSONArray localJSONArray = new JSONArray(str);
        return localJSONArray;
      }
      catch (JSONException localJSONException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Malformed JSON for key ");
        localStringBuilder.append(z(paramString));
        localStringBuilder.append(": ");
        localStringBuilder.append(str);
        localStringBuilder.append(", falling back to default");
        Log.w("NotificationParams", localStringBuilder.toString());
      }
    }
    return null;
  }
  
  public int[] e()
  {
    Object localObject = c("gcm.n.light_settings");
    if (localObject == null) {
      return null;
    }
    try
    {
      if (((JSONArray)localObject).length() == 3) {
        return new int[] { d(((JSONArray)localObject).optString(0)), ((JSONArray)localObject).optInt(1), ((JSONArray)localObject).optInt(2) };
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label68;
      JSONException localJSONException1 = new org/json/JSONException;
      localJSONException1.<init>("lightSettings don't have all three fields");
      throw localJSONException1;
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("LightSettings is invalid: ");
      localStringBuilder2.append(localObject);
      localStringBuilder2.append(". ");
      localStringBuilder2.append(localJSONException1.getMessage());
      localStringBuilder2.append(". Skipping setting LightSettings");
      localObject = localStringBuilder2.toString();
      Log.w("NotificationParams", (String)localObject);
    }
    catch (JSONException localJSONException2)
    {
      for (;;)
      {
        label68:
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("LightSettings is invalid: ");
        localStringBuilder1.append(localObject);
        localStringBuilder1.append(". Skipping setting LightSettings");
        localObject = localStringBuilder1.toString();
      }
    }
    return null;
  }
  
  public Uri f()
  {
    String str1 = p("gcm.n.link_android");
    String str2 = str1;
    if (TextUtils.isEmpty(str1)) {
      str2 = p("gcm.n.link");
    }
    if (!TextUtils.isEmpty(str2)) {
      return Uri.parse(str2);
    }
    return null;
  }
  
  public Object[] g(String paramString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("_loc_args");
    paramString = c(((StringBuilder)localObject).toString());
    if (paramString == null) {
      return null;
    }
    int i = paramString.length();
    localObject = new String[i];
    for (int j = 0; j < i; j++) {
      localObject[j] = paramString.optString(j);
    }
    return (Object[])localObject;
  }
  
  public String h(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("_loc_key");
    return p(localStringBuilder.toString());
  }
  
  public String i(Resources paramResources, String paramString1, String paramString2)
  {
    String str = h(paramString2);
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    int i = paramResources.getIdentifier(str, "string", paramString1);
    if (i == 0)
    {
      paramString1 = new StringBuilder();
      paramResources = new StringBuilder();
      paramResources.append(paramString2);
      paramResources.append("_loc_key");
      paramString1.append(z(paramResources.toString()));
      paramString1.append(" resource not found: ");
      paramString1.append(paramString2);
      paramString1.append(" Default value will be used.");
      Log.w("NotificationParams", paramString1.toString());
      return null;
    }
    paramString1 = g(paramString2);
    if (paramString1 == null) {
      return paramResources.getString(i);
    }
    try
    {
      paramResources = paramResources.getString(i, paramString1);
      return paramResources;
    }
    catch (MissingFormatArgumentException localMissingFormatArgumentException)
    {
      paramResources = new StringBuilder();
      paramResources.append("Missing format argument for ");
      paramResources.append(z(paramString2));
      paramResources.append(": ");
      paramResources.append(Arrays.toString(paramString1));
      paramResources.append(" Default value will be used.");
      Log.w("NotificationParams", paramResources.toString(), localMissingFormatArgumentException);
    }
    return null;
  }
  
  public Long j(String paramString)
  {
    String str = p(paramString);
    if (!TextUtils.isEmpty(str)) {
      try
      {
        long l = Long.parseLong(str);
        return Long.valueOf(l);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Couldn't parse value of ");
        localStringBuilder.append(z(paramString));
        localStringBuilder.append("(");
        localStringBuilder.append(str);
        localStringBuilder.append(") into a long");
        Log.w("NotificationParams", localStringBuilder.toString());
      }
    }
    return null;
  }
  
  public String k()
  {
    return p("gcm.n.android_channel_id");
  }
  
  public Integer l()
  {
    Integer localInteger = b("gcm.n.notification_count");
    if (localInteger == null) {
      return null;
    }
    if (localInteger.intValue() < 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("notificationCount is invalid: ");
      localStringBuilder.append(localInteger);
      localStringBuilder.append(". Skipping setting notificationCount.");
      Log.w("FirebaseMessaging", localStringBuilder.toString());
      return null;
    }
    return localInteger;
  }
  
  public Integer m()
  {
    Integer localInteger = b("gcm.n.notification_priority");
    if (localInteger == null) {
      return null;
    }
    if ((localInteger.intValue() >= -2) && (localInteger.intValue() <= 2)) {
      return localInteger;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("notificationPriority is invalid ");
    localStringBuilder.append(localInteger);
    localStringBuilder.append(". Skipping setting notificationPriority.");
    Log.w("FirebaseMessaging", localStringBuilder.toString());
    return null;
  }
  
  public String n(Resources paramResources, String paramString1, String paramString2)
  {
    String str = p(paramString2);
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    return i(paramResources, paramString1, paramString2);
  }
  
  public String o()
  {
    String str1 = p("gcm.n.sound2");
    String str2 = str1;
    if (TextUtils.isEmpty(str1)) {
      str2 = p("gcm.n.sound");
    }
    return str2;
  }
  
  public String p(String paramString)
  {
    return a.getString(w(paramString));
  }
  
  public long[] q()
  {
    JSONArray localJSONArray = c("gcm.n.vibrate_timings");
    if (localJSONArray == null) {
      return null;
    }
    try
    {
      if (localJSONArray.length() > 1)
      {
        int i = localJSONArray.length();
        localObject = new long[i];
        for (int j = 0; j < i; j++) {
          localObject[j] = localJSONArray.optLong(j);
        }
        return (long[])localObject;
      }
      Object localObject = new org/json/JSONException;
      ((JSONException)localObject).<init>("vibrateTimings have invalid length");
      throw ((Throwable)localObject);
    }
    catch (JSONException|NumberFormatException localJSONException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("User defined vibrateTimings is invalid: ");
      localStringBuilder.append(localJSONArray);
      localStringBuilder.append(". Skipping setting vibrateTimings.");
      Log.w("NotificationParams", localStringBuilder.toString());
    }
    return null;
  }
  
  public Integer r()
  {
    Integer localInteger = b("gcm.n.visibility");
    if (localInteger == null) {
      return null;
    }
    if ((localInteger.intValue() >= -1) && (localInteger.intValue() <= 1)) {
      return localInteger;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("visibility is invalid: ");
    localStringBuilder.append(localInteger);
    localStringBuilder.append(". Skipping setting visibility.");
    Log.w("NotificationParams", localStringBuilder.toString());
    return null;
  }
  
  public final String w(String paramString)
  {
    if ((!a.containsKey(paramString)) && (paramString.startsWith("gcm.n.")))
    {
      String str = v(paramString);
      if (a.containsKey(str)) {
        return str;
      }
    }
    return paramString;
  }
  
  public Bundle x()
  {
    Bundle localBundle = new Bundle(a);
    Iterator localIterator = a.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!s(str)) {
        localBundle.remove(str);
      }
    }
    return localBundle;
  }
  
  public Bundle y()
  {
    Bundle localBundle = new Bundle(a);
    Iterator localIterator = a.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (u(str)) {
        localBundle.remove(str);
      }
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */