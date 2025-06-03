package com.facebook.appevents;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class AppEvent
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private static final HashSet<String> validatedIdentifiers = new HashSet();
  private final String checksum;
  private final boolean inBackground;
  private final boolean isImplicit;
  private final JSONObject jsonObject;
  private final String name;
  
  public AppEvent(String paramString1, @NonNull String paramString2, Double paramDouble, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, @Nullable UUID paramUUID)
    throws JSONException, FacebookException
  {
    isImplicit = paramBoolean1;
    inBackground = paramBoolean2;
    name = paramString2;
    jsonObject = getJSONObjectForAppEvent(paramString1, paramString2, paramDouble, paramBundle, paramUUID);
    checksum = calculateChecksum();
  }
  
  private AppEvent(String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
    throws JSONException
  {
    paramString1 = new JSONObject(paramString1);
    jsonObject = paramString1;
    isImplicit = paramBoolean1;
    name = paramString1.optString("_eventName");
    checksum = paramString2;
    inBackground = paramBoolean2;
  }
  
  private String calculateChecksum()
  {
    return md5Checksum(jsonObject.toString());
  }
  
  private JSONObject getJSONObjectForAppEvent(String paramString1, @NonNull String paramString2, Double paramDouble, Bundle paramBundle, @Nullable UUID paramUUID)
    throws JSONException
  {
    validateIdentifier(paramString2);
    JSONObject localJSONObject = new JSONObject();
    paramString2 = RestrictiveDataManager.processEvent(paramString2);
    localJSONObject.put("_eventName", paramString2);
    localJSONObject.put("_eventName_md5", md5Checksum(paramString2));
    localJSONObject.put("_logTime", System.currentTimeMillis() / 1000L);
    localJSONObject.put("_ui", paramString1);
    if (paramUUID != null) {
      localJSONObject.put("_session_id", paramUUID);
    }
    if (paramBundle != null)
    {
      paramString2 = validateParameters(paramBundle);
      paramBundle = paramString2.keySet().iterator();
      while (paramBundle.hasNext())
      {
        paramString1 = (String)paramBundle.next();
        localJSONObject.put(paramString1, paramString2.get(paramString1));
      }
    }
    if (paramDouble != null) {
      localJSONObject.put("_valueToSum", paramDouble.doubleValue());
    }
    if (inBackground) {
      localJSONObject.put("_inBackground", "1");
    }
    if (isImplicit) {
      localJSONObject.put("_implicitlyLogged", "1");
    } else {
      Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", new Object[] { localJSONObject.toString() });
    }
    return localJSONObject;
  }
  
  private static String md5Checksum(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      paramString = paramString.getBytes("UTF-8");
      localMessageDigest.update(paramString, 0, paramString.length);
      paramString = AppEventUtility.bytesToHex(localMessageDigest.digest());
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      Utility.logd("Failed to generate checksum: ", paramString);
      return "1";
    }
    catch (NoSuchAlgorithmException paramString)
    {
      Utility.logd("Failed to generate checksum: ", paramString);
    }
    return "0";
  }
  
  private static void validateIdentifier(String paramString)
    throws FacebookException
  {
    if ((paramString != null) && (paramString.length() != 0) && (paramString.length() <= 40)) {
      synchronized (validatedIdentifiers)
      {
        boolean bool = ((HashSet)???).contains(paramString);
        if (!bool) {
          if (paramString.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            try
            {
              ((HashSet)???).add(paramString);
            }
            finally {}
          } else {
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] { paramString }));
          }
        }
        return;
      }
    }
    ??? = paramString;
    if (paramString == null) {
      ??? = "<None Provided>";
    }
    throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] { ???, Integer.valueOf(40) }));
  }
  
  private Map<String, String> validateParameters(Bundle paramBundle)
    throws FacebookException
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      validateIdentifier(str);
      Object localObject = paramBundle.get(str);
      if ((!(localObject instanceof String)) && (!(localObject instanceof Number))) {
        throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] { localObject, str }));
      }
      localHashMap.put(str, localObject.toString());
    }
    IntegrityManager.processParameters(localHashMap);
    RestrictiveDataManager.processParameters(localHashMap, name);
    EventDeactivationManager.processDeprecatedParameters(localHashMap, name);
    return localHashMap;
  }
  
  private Object writeReplace()
  {
    return new SerializationProxyV2(jsonObject.toString(), isImplicit, inBackground, checksum, null);
  }
  
  public boolean getIsImplicit()
  {
    return isImplicit;
  }
  
  public JSONObject getJSONObject()
  {
    return jsonObject;
  }
  
  public String getName()
  {
    return name;
  }
  
  public boolean isChecksumValid()
  {
    if (checksum == null) {
      return true;
    }
    return calculateChecksum().equals(checksum);
  }
  
  public String toString()
  {
    return String.format("\"%s\", implicit: %b, json: %s", new Object[] { jsonObject.optString("_eventName"), Boolean.valueOf(isImplicit), jsonObject.toString() });
  }
  
  public static class SerializationProxyV1
    implements Serializable
  {
    private static final long serialVersionUID = -2488473066578201069L;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final String jsonString;
    
    private SerializationProxyV1(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      jsonString = paramString;
      isImplicit = paramBoolean1;
      inBackground = paramBoolean2;
    }
    
    private Object readResolve()
      throws JSONException
    {
      return new AppEvent(jsonString, isImplicit, inBackground, null, null);
    }
  }
  
  public static class SerializationProxyV2
    implements Serializable
  {
    private static final long serialVersionUID = 20160803001L;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final String jsonString;
    
    private SerializationProxyV2(String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
    {
      jsonString = paramString1;
      isImplicit = paramBoolean1;
      inBackground = paramBoolean2;
      checksum = paramString2;
    }
    
    private Object readResolve()
      throws JSONException
    {
      return new AppEvent(jsonString, isImplicit, inBackground, checksum, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */