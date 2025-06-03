package aa;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public final class s
{
  public final Bundle a;
  
  public s(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      a = new Bundle(paramBundle);
      return;
    }
    throw new NullPointerException("data");
  }
  
  public static boolean l(Bundle paramBundle)
  {
    boolean bool;
    if ((!"1".equals(paramBundle.getString("gcm.n.e"))) && (!"1".equals(paramBundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification."))))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static String n(String paramString)
  {
    String str = paramString;
    if (paramString.startsWith("gcm.n.")) {
      str = paramString.substring(6);
    }
    return str;
  }
  
  public final boolean a(String paramString)
  {
    paramString = j(paramString);
    boolean bool;
    if ((!"1".equals(paramString)) && (!Boolean.parseBoolean(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final Integer b(String paramString)
  {
    String str = j(paramString);
    if (!TextUtils.isEmpty(str)) {
      try
      {
        int i = Integer.parseInt(str);
        return Integer.valueOf(i);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder = f.l("Couldn't parse value of ");
        localStringBuilder.append(n(paramString));
        localStringBuilder.append("(");
        localStringBuilder.append(str);
        localStringBuilder.append(") into an int");
        Log.w("NotificationParams", localStringBuilder.toString());
      }
    }
    return null;
  }
  
  public final JSONArray c(String paramString)
  {
    String str = j(paramString);
    if (!TextUtils.isEmpty(str)) {
      try
      {
        JSONArray localJSONArray = new JSONArray(str);
        return localJSONArray;
      }
      catch (JSONException localJSONException)
      {
        StringBuilder localStringBuilder = f.l("Malformed JSON for key ");
        localStringBuilder.append(n(paramString));
        localStringBuilder.append(": ");
        localStringBuilder.append(str);
        localStringBuilder.append(", falling back to default");
        Log.w("NotificationParams", localStringBuilder.toString());
      }
    }
    return null;
  }
  
  public final int[] d()
  {
    Object localObject1 = c("gcm.n.light_settings");
    if (localObject1 == null) {
      return null;
    }
    try
    {
      if (((JSONArray)localObject1).length() == 3)
      {
        int i = Color.parseColor(((JSONArray)localObject1).optString(0));
        if (i != -16777216) {
          return new int[] { i, ((JSONArray)localObject1).optInt(1), ((JSONArray)localObject1).optInt(2) };
        }
        localObject2 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject2).<init>("Transparent color is invalid");
        throw ((Throwable)localObject2);
      }
      Object localObject2 = new org/json/JSONException;
      ((JSONException)localObject2).<init>("lightSettings don't have all three fields");
      throw ((Throwable)localObject2);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("LightSettings is invalid: ");
      localStringBuilder2.append(localObject1);
      localStringBuilder2.append(". ");
      localStringBuilder2.append(localIllegalArgumentException.getMessage());
      localStringBuilder2.append(". Skipping setting LightSettings");
      localObject1 = localStringBuilder2.toString();
    }
    catch (JSONException localJSONException)
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("LightSettings is invalid: ");
      localStringBuilder1.append(localObject1);
      localStringBuilder1.append(". Skipping setting LightSettings");
      localObject1 = localStringBuilder1.toString();
    }
    Log.w("NotificationParams", (String)localObject1);
    return null;
  }
  
  public final Uri e()
  {
    String str1 = j("gcm.n.link_android");
    String str2 = str1;
    if (TextUtils.isEmpty(str1)) {
      str2 = j("gcm.n.link");
    }
    if (!TextUtils.isEmpty(str2)) {
      return Uri.parse(str2);
    }
    return null;
  }
  
  public final Object[] f(String paramString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("_loc_args");
    localObject = c(((StringBuilder)localObject).toString());
    if (localObject == null) {
      return null;
    }
    int i = ((JSONArray)localObject).length();
    paramString = new String[i];
    for (int j = 0; j < i; j++) {
      paramString[j] = ((JSONArray)localObject).optString(j);
    }
    return paramString;
  }
  
  public final String g(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("_loc_key");
    return j(localStringBuilder.toString());
  }
  
  public final Long h()
  {
    String str = j("gcm.n.event_time");
    if (!TextUtils.isEmpty(str)) {
      try
      {
        long l = Long.parseLong(str);
        return Long.valueOf(l);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder = f.l("Couldn't parse value of ");
        localStringBuilder.append(n("gcm.n.event_time"));
        localStringBuilder.append("(");
        localStringBuilder.append(str);
        localStringBuilder.append(") into a long");
        Log.w("NotificationParams", localStringBuilder.toString());
      }
    }
    return null;
  }
  
  public final String i(Resources paramResources, String paramString1, String paramString2)
  {
    String str = j(paramString2);
    if (!TextUtils.isEmpty(str)) {
      return str;
    }
    Object localObject = g(paramString2);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    str = null;
    if (bool)
    {
      paramResources = str;
    }
    else
    {
      int i = paramResources.getIdentifier((String)localObject, "string", paramString1);
      if (i == 0)
      {
        paramString1 = new StringBuilder();
        paramResources = new StringBuilder();
        paramResources.append(paramString2);
        paramResources.append("_loc_key");
        paramString1.append(n(paramResources.toString()));
        paramString1.append(" resource not found: ");
        paramString1.append(paramString2);
        paramString1.append(" Default value will be used.");
        Log.w("NotificationParams", paramString1.toString());
        paramResources = str;
      }
      else
      {
        paramString1 = f(paramString2);
        if (paramString1 == null) {
          paramResources = paramResources.getString(i);
        } else {
          try
          {
            paramResources = paramResources.getString(i, paramString1);
          }
          catch (MissingFormatArgumentException paramResources)
          {
            localObject = f.l("Missing format argument for ");
            ((StringBuilder)localObject).append(n(paramString2));
            ((StringBuilder)localObject).append(": ");
            ((StringBuilder)localObject).append(Arrays.toString(paramString1));
            ((StringBuilder)localObject).append(" Default value will be used.");
            Log.w("NotificationParams", ((StringBuilder)localObject).toString(), paramResources);
            paramResources = str;
          }
        }
      }
    }
    return paramResources;
  }
  
  public final String j(String paramString)
  {
    Bundle localBundle = a;
    Object localObject = paramString;
    if (!localBundle.containsKey(paramString))
    {
      localObject = paramString;
      if (paramString.startsWith("gcm.n."))
      {
        String str;
        if (!paramString.startsWith("gcm.n.")) {
          str = paramString;
        } else {
          str = paramString.replace("gcm.n.", "gcm.notification.");
        }
        localObject = paramString;
        if (a.containsKey(str)) {
          localObject = str;
        }
      }
    }
    return localBundle.getString((String)localObject);
  }
  
  public final long[] k()
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
  
  public final Bundle m()
  {
    Bundle localBundle = new Bundle(a);
    Iterator localIterator = a.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      int i;
      if ((!str.startsWith("google.c.a.")) && (!str.equals("from"))) {
        i = 0;
      } else {
        i = 1;
      }
      if (i == 0) {
        localBundle.remove(str);
      }
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     aa.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */