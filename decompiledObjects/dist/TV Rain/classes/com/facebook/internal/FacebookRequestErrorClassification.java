package com.facebook.internal;

import com.facebook.FacebookRequestError.Category;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FacebookRequestErrorClassification
{
  public static final int EC_APP_NOT_INSTALLED = 412;
  public static final int EC_APP_TOO_MANY_CALLS = 4;
  public static final int EC_INVALID_SESSION = 102;
  public static final int EC_INVALID_TOKEN = 190;
  public static final int EC_RATE = 9;
  public static final int EC_SERVICE_UNAVAILABLE = 2;
  public static final int EC_TOO_MANY_USER_ACTION_CALLS = 341;
  public static final int EC_USER_TOO_MANY_CALLS = 17;
  public static final int ESC_APP_INACTIVE = 493;
  public static final int ESC_APP_NOT_INSTALLED = 458;
  public static final String KEY_LOGIN_RECOVERABLE = "login_recoverable";
  public static final String KEY_NAME = "name";
  public static final String KEY_OTHER = "other";
  public static final String KEY_RECOVERY_MESSAGE = "recovery_message";
  public static final String KEY_TRANSIENT = "transient";
  private static FacebookRequestErrorClassification defaultInstance;
  private final Map<Integer, Set<Integer>> loginRecoverableErrors;
  private final String loginRecoverableRecoveryMessage;
  private final Map<Integer, Set<Integer>> otherErrors;
  private final String otherRecoveryMessage;
  private final Map<Integer, Set<Integer>> transientErrors;
  private final String transientRecoveryMessage;
  
  public FacebookRequestErrorClassification(Map<Integer, Set<Integer>> paramMap1, Map<Integer, Set<Integer>> paramMap2, Map<Integer, Set<Integer>> paramMap3, String paramString1, String paramString2, String paramString3)
  {
    otherErrors = paramMap1;
    transientErrors = paramMap2;
    loginRecoverableErrors = paramMap3;
    otherRecoveryMessage = paramString1;
    transientRecoveryMessage = paramString2;
    loginRecoverableRecoveryMessage = paramString3;
  }
  
  public static FacebookRequestErrorClassification createFromJSON(JSONArray paramJSONArray)
  {
    if (paramJSONArray == null) {
      return null;
    }
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    while (i < paramJSONArray.length())
    {
      JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
      Object localObject7;
      Object localObject8;
      Object localObject9;
      Object localObject10;
      if (localJSONObject == null)
      {
        localObject7 = localObject1;
        localObject8 = localObject2;
        localObject9 = localObject4;
        localObject10 = localObject5;
      }
      else
      {
        String str = localJSONObject.optString("name");
        if (str == null)
        {
          localObject7 = localObject1;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = localObject5;
        }
        else if (str.equalsIgnoreCase("other"))
        {
          localObject9 = localJSONObject.optString("recovery_message", null);
          localObject7 = parseJSONDefinition(localJSONObject);
          localObject8 = localObject2;
          localObject10 = localObject5;
        }
        else if (str.equalsIgnoreCase("transient"))
        {
          localObject10 = localJSONObject.optString("recovery_message", null);
          localObject8 = parseJSONDefinition(localJSONObject);
          localObject7 = localObject1;
          localObject9 = localObject4;
        }
        else
        {
          localObject7 = localObject1;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = localObject5;
          if (str.equalsIgnoreCase("login_recoverable"))
          {
            localObject6 = localJSONObject.optString("recovery_message", null);
            localObject3 = parseJSONDefinition(localJSONObject);
            localObject10 = localObject5;
            localObject9 = localObject4;
            localObject8 = localObject2;
            localObject7 = localObject1;
          }
        }
      }
      i++;
      localObject1 = localObject7;
      localObject2 = localObject8;
      localObject4 = localObject9;
      localObject5 = localObject10;
    }
    return new FacebookRequestErrorClassification((Map)localObject1, (Map)localObject2, (Map)localObject3, (String)localObject4, (String)localObject5, (String)localObject6);
  }
  
  public static FacebookRequestErrorClassification getDefaultErrorClassification()
  {
    try
    {
      if (defaultInstance == null) {
        defaultInstance = getDefaultErrorClassificationImpl();
      }
      FacebookRequestErrorClassification localFacebookRequestErrorClassification = defaultInstance;
      return localFacebookRequestErrorClassification;
    }
    finally {}
  }
  
  private static FacebookRequestErrorClassification getDefaultErrorClassificationImpl()
  {
    new FacebookRequestErrorClassification(null, new HashMap()new HashMap {}, new HashMap() {}, null, null, null);
  }
  
  private static Map<Integer, Set<Integer>> parseJSONDefinition(JSONObject paramJSONObject)
  {
    JSONArray localJSONArray1 = paramJSONObject.optJSONArray("items");
    if (localJSONArray1.length() == 0) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < localJSONArray1.length(); i++)
    {
      paramJSONObject = localJSONArray1.optJSONObject(i);
      if (paramJSONObject != null)
      {
        int j = paramJSONObject.optInt("code");
        if (j != 0)
        {
          JSONArray localJSONArray2 = paramJSONObject.optJSONArray("subcodes");
          if ((localJSONArray2 != null) && (localJSONArray2.length() > 0))
          {
            HashSet localHashSet = new HashSet();
            for (int k = 0;; k++)
            {
              paramJSONObject = localHashSet;
              if (k >= localJSONArray2.length()) {
                break;
              }
              int m = localJSONArray2.optInt(k);
              if (m != 0) {
                localHashSet.add(Integer.valueOf(m));
              }
            }
          }
          paramJSONObject = null;
          localHashMap.put(Integer.valueOf(j), paramJSONObject);
        }
      }
    }
    return localHashMap;
  }
  
  public FacebookRequestError.Category classify(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return FacebookRequestError.Category.TRANSIENT;
    }
    Object localObject = otherErrors;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)otherErrors.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return FacebookRequestError.Category.OTHER;
      }
    }
    localObject = loginRecoverableErrors;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)loginRecoverableErrors.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return FacebookRequestError.Category.LOGIN_RECOVERABLE;
      }
    }
    localObject = transientErrors;
    if ((localObject != null) && (((Map)localObject).containsKey(Integer.valueOf(paramInt1))))
    {
      localObject = (Set)transientErrors.get(Integer.valueOf(paramInt1));
      if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2)))) {
        return FacebookRequestError.Category.TRANSIENT;
      }
    }
    return FacebookRequestError.Category.OTHER;
  }
  
  public Map<Integer, Set<Integer>> getLoginRecoverableErrors()
  {
    return loginRecoverableErrors;
  }
  
  public Map<Integer, Set<Integer>> getOtherErrors()
  {
    return otherErrors;
  }
  
  public String getRecoveryMessage(FacebookRequestError.Category paramCategory)
  {
    int i = 3.$SwitchMap$com$facebook$FacebookRequestError$Category[paramCategory.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return null;
        }
        return transientRecoveryMessage;
      }
      return loginRecoverableRecoveryMessage;
    }
    return otherRecoveryMessage;
  }
  
  public Map<Integer, Set<Integer>> getTransientErrors()
  {
    return transientErrors;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FacebookRequestErrorClassification
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */