package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class LegacyTokenHelper
{
  public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
  public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
  public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
  public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
  public static final String EXPIRED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.ExpiredPermissions";
  private static final long INVALID_BUNDLE_MILLISECONDS = Long.MIN_VALUE;
  private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
  private static final String JSON_VALUE = "value";
  private static final String JSON_VALUE_ENUM_TYPE = "enumType";
  private static final String JSON_VALUE_TYPE = "valueType";
  public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
  public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
  private static final String TAG = "LegacyTokenHelper";
  public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
  public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
  private static final String TYPE_BOOLEAN = "bool";
  private static final String TYPE_BOOLEAN_ARRAY = "bool[]";
  private static final String TYPE_BYTE = "byte";
  private static final String TYPE_BYTE_ARRAY = "byte[]";
  private static final String TYPE_CHAR = "char";
  private static final String TYPE_CHAR_ARRAY = "char[]";
  private static final String TYPE_DOUBLE = "double";
  private static final String TYPE_DOUBLE_ARRAY = "double[]";
  private static final String TYPE_ENUM = "enum";
  private static final String TYPE_FLOAT = "float";
  private static final String TYPE_FLOAT_ARRAY = "float[]";
  private static final String TYPE_INTEGER = "int";
  private static final String TYPE_INTEGER_ARRAY = "int[]";
  private static final String TYPE_LONG = "long";
  private static final String TYPE_LONG_ARRAY = "long[]";
  private static final String TYPE_SHORT = "short";
  private static final String TYPE_SHORT_ARRAY = "short[]";
  private static final String TYPE_STRING = "string";
  private static final String TYPE_STRING_LIST = "stringList";
  private SharedPreferences cache;
  private String cacheKey;
  
  public LegacyTokenHelper(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public LegacyTokenHelper(Context paramContext, String paramString)
  {
    Validate.notNull(paramContext, "context");
    String str = paramString;
    if (Utility.isNullOrEmpty(paramString)) {
      str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    }
    cacheKey = str;
    paramString = paramContext.getApplicationContext();
    if (paramString != null) {
      paramContext = paramString;
    }
    cache = paramContext.getSharedPreferences(cacheKey, 0);
  }
  
  private void deserializeKey(String paramString, Bundle paramBundle)
    throws JSONException
  {
    Object localObject1 = new JSONObject(cache.getString(paramString, "{}"));
    Object localObject2 = ((JSONObject)localObject1).getString("valueType");
    if (((String)localObject2).equals("bool"))
    {
      paramBundle.putBoolean(paramString, ((JSONObject)localObject1).getBoolean("value"));
    }
    else
    {
      boolean bool = ((String)localObject2).equals("bool[]");
      int i = 0;
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      if (bool)
      {
        localObject1 = ((JSONObject)localObject1).getJSONArray("value");
        i = ((JSONArray)localObject1).length();
        localObject2 = new boolean[i];
        while (i3 < i)
        {
          localObject2[i3] = ((JSONArray)localObject1).getBoolean(i3);
          i3++;
        }
        paramBundle.putBooleanArray(paramString, (boolean[])localObject2);
      }
      else if (((String)localObject2).equals("byte"))
      {
        paramBundle.putByte(paramString, (byte)((JSONObject)localObject1).getInt("value"));
      }
      else if (((String)localObject2).equals("byte[]"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        j = ((JSONArray)localObject2).length();
        localObject1 = new byte[j];
        for (i3 = i; i3 < j; i3++) {
          localObject1[i3] = ((byte)(byte)((JSONArray)localObject2).getInt(i3));
        }
        paramBundle.putByteArray(paramString, (byte[])localObject1);
      }
      else if (((String)localObject2).equals("short"))
      {
        paramBundle.putShort(paramString, (short)((JSONObject)localObject1).getInt("value"));
      }
      else if (((String)localObject2).equals("short[]"))
      {
        localObject1 = ((JSONObject)localObject1).getJSONArray("value");
        i = ((JSONArray)localObject1).length();
        localObject2 = new short[i];
        for (i3 = j; i3 < i; i3++) {
          localObject2[i3] = ((short)(short)((JSONArray)localObject1).getInt(i3));
        }
        paramBundle.putShortArray(paramString, (short[])localObject2);
      }
      else if (((String)localObject2).equals("int"))
      {
        paramBundle.putInt(paramString, ((JSONObject)localObject1).getInt("value"));
      }
      else if (((String)localObject2).equals("int[]"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        i = ((JSONArray)localObject2).length();
        localObject1 = new int[i];
        for (i3 = k; i3 < i; i3++) {
          localObject1[i3] = ((JSONArray)localObject2).getInt(i3);
        }
        paramBundle.putIntArray(paramString, (int[])localObject1);
      }
      else if (((String)localObject2).equals("long"))
      {
        paramBundle.putLong(paramString, ((JSONObject)localObject1).getLong("value"));
      }
      else if (((String)localObject2).equals("long[]"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        i = ((JSONArray)localObject2).length();
        localObject1 = new long[i];
        for (i3 = m; i3 < i; i3++) {
          localObject1[i3] = ((JSONArray)localObject2).getLong(i3);
        }
        paramBundle.putLongArray(paramString, (long[])localObject1);
      }
      else if (((String)localObject2).equals("float"))
      {
        paramBundle.putFloat(paramString, (float)((JSONObject)localObject1).getDouble("value"));
      }
      else if (((String)localObject2).equals("float[]"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        i = ((JSONArray)localObject2).length();
        localObject1 = new float[i];
        for (i3 = n; i3 < i; i3++) {
          localObject1[i3] = ((float)((JSONArray)localObject2).getDouble(i3));
        }
        paramBundle.putFloatArray(paramString, (float[])localObject1);
      }
      else if (((String)localObject2).equals("double"))
      {
        paramBundle.putDouble(paramString, ((JSONObject)localObject1).getDouble("value"));
      }
      else if (((String)localObject2).equals("double[]"))
      {
        localObject2 = ((JSONObject)localObject1).getJSONArray("value");
        i = ((JSONArray)localObject2).length();
        localObject1 = new double[i];
        for (i3 = i1; i3 < i; i3++) {
          localObject1[i3] = ((JSONArray)localObject2).getDouble(i3);
        }
        paramBundle.putDoubleArray(paramString, (double[])localObject1);
      }
      else if (((String)localObject2).equals("char"))
      {
        localObject2 = ((JSONObject)localObject1).getString("value");
        if ((localObject2 != null) && (((String)localObject2).length() == 1)) {
          paramBundle.putChar(paramString, ((String)localObject2).charAt(0));
        }
      }
      else
      {
        Object localObject3;
        if (((String)localObject2).equals("char[]"))
        {
          localObject3 = ((JSONObject)localObject1).getJSONArray("value");
          i = ((JSONArray)localObject3).length();
          localObject1 = new char[i];
          for (i3 = 0; i3 < i; i3++)
          {
            localObject2 = ((JSONArray)localObject3).getString(i3);
            if ((localObject2 != null) && (((String)localObject2).length() == 1)) {
              localObject1[i3] = ((String)localObject2).charAt(0);
            }
          }
          paramBundle.putCharArray(paramString, (char[])localObject1);
        }
        else if (((String)localObject2).equals("string"))
        {
          paramBundle.putString(paramString, ((JSONObject)localObject1).getString("value"));
        }
        else if (((String)localObject2).equals("stringList"))
        {
          localObject1 = ((JSONObject)localObject1).getJSONArray("value");
          i = ((JSONArray)localObject1).length();
          localObject3 = new ArrayList(i);
          for (i3 = i2; i3 < i; i3++)
          {
            localObject2 = ((JSONArray)localObject1).get(i3);
            if (localObject2 == JSONObject.NULL) {
              localObject2 = null;
            } else {
              localObject2 = (String)localObject2;
            }
            ((ArrayList)localObject3).add(i3, localObject2);
          }
          paramBundle.putStringArrayList(paramString, (ArrayList)localObject3);
        }
        else if (!((String)localObject2).equals("enum")) {}
      }
    }
    try
    {
      paramBundle.putSerializable(paramString, Enum.valueOf(Class.forName(((JSONObject)localObject1).getString("enumType")), ((JSONObject)localObject1).getString("value")));
      return;
    }
    catch (ClassNotFoundException|IllegalArgumentException paramString)
    {
      for (;;) {}
    }
  }
  
  public static String getApplicationId(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    return paramBundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
  }
  
  public static Date getDate(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null) {
      return null;
    }
    long l = paramBundle.getLong(paramString, Long.MIN_VALUE);
    if (l == Long.MIN_VALUE) {
      return null;
    }
    return new Date(l);
  }
  
  public static Date getExpirationDate(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    return getDate(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
  }
  
  public static long getExpirationMilliseconds(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    return paramBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate");
  }
  
  public static Date getLastRefreshDate(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    return getDate(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
  }
  
  public static long getLastRefreshMilliseconds(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    return paramBundle.getLong("com.facebook.TokenCachingStrategy.LastRefreshDate");
  }
  
  public static Set<String> getPermissions(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    paramBundle = paramBundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions");
    if (paramBundle == null) {
      return null;
    }
    return new HashSet(paramBundle);
  }
  
  public static AccessTokenSource getSource(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    if (paramBundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
      return (AccessTokenSource)paramBundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
    }
    if (paramBundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
      paramBundle = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    } else {
      paramBundle = AccessTokenSource.WEB_VIEW;
    }
    return paramBundle;
  }
  
  public static String getToken(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    return paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
  }
  
  public static boolean hasTokenInformation(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return false;
    }
    String str = paramBundle.getString("com.facebook.TokenCachingStrategy.Token");
    if ((str != null) && (str.length() != 0)) {
      return paramBundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L;
    }
    return false;
  }
  
  public static void putApplicationId(Bundle paramBundle, String paramString)
  {
    Validate.notNull(paramBundle, "bundle");
    paramBundle.putString("com.facebook.TokenCachingStrategy.ApplicationId", paramString);
  }
  
  public static void putDate(Bundle paramBundle, String paramString, Date paramDate)
  {
    paramBundle.putLong(paramString, paramDate.getTime());
  }
  
  public static void putDeclinedPermissions(Bundle paramBundle, Collection<String> paramCollection)
  {
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramCollection, "value");
    paramBundle.putStringArrayList("com.facebook.TokenCachingStrategy.DeclinedPermissions", new ArrayList(paramCollection));
  }
  
  public static void putExpirationDate(Bundle paramBundle, Date paramDate)
  {
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramDate, "value");
    putDate(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate", paramDate);
  }
  
  public static void putExpirationMilliseconds(Bundle paramBundle, long paramLong)
  {
    Validate.notNull(paramBundle, "bundle");
    paramBundle.putLong("com.facebook.TokenCachingStrategy.ExpirationDate", paramLong);
  }
  
  public static void putExpiredPermissions(Bundle paramBundle, Collection<String> paramCollection)
  {
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramCollection, "value");
    paramBundle.putStringArrayList("com.facebook.TokenCachingStrategy.ExpiredPermissions", new ArrayList(paramCollection));
  }
  
  public static void putLastRefreshDate(Bundle paramBundle, Date paramDate)
  {
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramDate, "value");
    putDate(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", paramDate);
  }
  
  public static void putLastRefreshMilliseconds(Bundle paramBundle, long paramLong)
  {
    Validate.notNull(paramBundle, "bundle");
    paramBundle.putLong("com.facebook.TokenCachingStrategy.LastRefreshDate", paramLong);
  }
  
  public static void putPermissions(Bundle paramBundle, Collection<String> paramCollection)
  {
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramCollection, "value");
    paramBundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList(paramCollection));
  }
  
  public static void putSource(Bundle paramBundle, AccessTokenSource paramAccessTokenSource)
  {
    Validate.notNull(paramBundle, "bundle");
    paramBundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", paramAccessTokenSource);
  }
  
  public static void putToken(Bundle paramBundle, String paramString)
  {
    Validate.notNull(paramBundle, "bundle");
    Validate.notNull(paramString, "value");
    paramBundle.putString("com.facebook.TokenCachingStrategy.Token", paramString);
  }
  
  private void serializeKey(String paramString, Bundle paramBundle, SharedPreferences.Editor paramEditor)
    throws JSONException
  {
    Object localObject = paramBundle.get(paramString);
    if (localObject == null) {
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    boolean bool = localObject instanceof Byte;
    paramBundle = null;
    if (bool)
    {
      localJSONObject.put("value", ((Byte)localObject).intValue());
      paramBundle = "byte";
    }
    for (;;)
    {
      localJSONArray = null;
      break label856;
      if ((localObject instanceof Short))
      {
        localJSONObject.put("value", ((Short)localObject).intValue());
        paramBundle = "short";
      }
      else if ((localObject instanceof Integer))
      {
        localJSONObject.put("value", ((Integer)localObject).intValue());
        paramBundle = "int";
      }
      else if ((localObject instanceof Long))
      {
        localJSONObject.put("value", ((Long)localObject).longValue());
        paramBundle = "long";
      }
      else if ((localObject instanceof Float))
      {
        localJSONObject.put("value", ((Float)localObject).doubleValue());
        paramBundle = "float";
      }
      else if ((localObject instanceof Double))
      {
        localJSONObject.put("value", ((Double)localObject).doubleValue());
        paramBundle = "double";
      }
      else if ((localObject instanceof Boolean))
      {
        localJSONObject.put("value", ((Boolean)localObject).booleanValue());
        paramBundle = "bool";
      }
      else if ((localObject instanceof Character))
      {
        localJSONObject.put("value", localObject.toString());
        paramBundle = "char";
      }
      else if ((localObject instanceof String))
      {
        localJSONObject.put("value", (String)localObject);
        paramBundle = "string";
      }
      else
      {
        if (!(localObject instanceof Enum)) {
          break;
        }
        localJSONObject.put("value", localObject.toString());
        localJSONObject.put("enumType", localObject.getClass().getName());
        paramBundle = "enum";
      }
    }
    JSONArray localJSONArray = new JSONArray();
    bool = localObject instanceof byte[];
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    if (bool)
    {
      paramBundle = (byte[])localObject;
      i = paramBundle.length;
      while (i3 < i)
      {
        localJSONArray.put(paramBundle[i3]);
        i3++;
      }
      paramBundle = "byte[]";
    }
    else if ((localObject instanceof short[]))
    {
      paramBundle = (short[])localObject;
      j = paramBundle.length;
      for (i3 = i; i3 < j; i3++) {
        localJSONArray.put(paramBundle[i3]);
      }
      paramBundle = "short[]";
    }
    else if ((localObject instanceof int[]))
    {
      paramBundle = (int[])localObject;
      i = paramBundle.length;
      for (i3 = j; i3 < i; i3++) {
        localJSONArray.put(paramBundle[i3]);
      }
      paramBundle = "int[]";
    }
    else if ((localObject instanceof long[]))
    {
      paramBundle = (long[])localObject;
      i = paramBundle.length;
      for (i3 = k; i3 < i; i3++) {
        localJSONArray.put(paramBundle[i3]);
      }
      paramBundle = "long[]";
    }
    else if ((localObject instanceof float[]))
    {
      paramBundle = (float[])localObject;
      i = paramBundle.length;
      for (i3 = m; i3 < i; i3++) {
        localJSONArray.put(paramBundle[i3]);
      }
      paramBundle = "float[]";
    }
    else if ((localObject instanceof double[]))
    {
      paramBundle = (double[])localObject;
      i = paramBundle.length;
      for (i3 = n; i3 < i; i3++) {
        localJSONArray.put(paramBundle[i3]);
      }
      paramBundle = "double[]";
    }
    else if ((localObject instanceof boolean[]))
    {
      paramBundle = (boolean[])localObject;
      i = paramBundle.length;
      for (i3 = i1; i3 < i; i3++) {
        localJSONArray.put(paramBundle[i3]);
      }
      paramBundle = "bool[]";
    }
    else if ((localObject instanceof char[]))
    {
      paramBundle = (char[])localObject;
      i = paramBundle.length;
      for (i3 = i2; i3 < i; i3++) {
        localJSONArray.put(String.valueOf(paramBundle[i3]));
      }
      paramBundle = "char[]";
    }
    else if ((localObject instanceof List))
    {
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        paramBundle = (Bundle)localObject;
        if (localObject == null) {
          paramBundle = JSONObject.NULL;
        }
        localJSONArray.put(paramBundle);
      }
      paramBundle = "stringList";
    }
    else
    {
      localJSONArray = null;
    }
    label856:
    if (paramBundle != null)
    {
      localJSONObject.put("valueType", paramBundle);
      if (localJSONArray != null) {
        localJSONObject.putOpt("value", localJSONArray);
      }
      paramEditor.putString(paramString, localJSONObject.toString());
    }
  }
  
  public void clear()
  {
    cache.edit().clear().apply();
  }
  
  public Bundle load()
  {
    Bundle localBundle = new Bundle();
    Object localObject1 = cache.getAll().keySet().iterator();
    Object localObject2;
    for (;;)
    {
      localObject2 = localBundle;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        try
        {
          deserializeKey((String)localObject2, localBundle);
        }
        catch (JSONException localJSONException)
        {
          localObject1 = LoggingBehavior.CACHE;
          String str = TAG;
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Error reading cached value for key: '");
          localStringBuilder.append((String)localObject2);
          localStringBuilder.append("' -- ");
          localStringBuilder.append(localJSONException);
          Logger.log((LoggingBehavior)localObject1, 5, str, localStringBuilder.toString());
          localObject2 = null;
        }
      }
    }
    return (Bundle)localObject2;
  }
  
  public void save(Bundle paramBundle)
  {
    Validate.notNull(paramBundle, "bundle");
    Object localObject1 = cache.edit();
    Object localObject2 = paramBundle.keySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      try
      {
        serializeKey(str, paramBundle, (SharedPreferences.Editor)localObject1);
      }
      catch (JSONException localJSONException)
      {
        paramBundle = LoggingBehavior.CACHE;
        localObject2 = TAG;
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Error processing value for key: '");
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append("' -- ");
        ((StringBuilder)localObject1).append(localJSONException);
        Logger.log(paramBundle, 5, (String)localObject2, ((StringBuilder)localObject1).toString());
        return;
      }
    }
    ((SharedPreferences.Editor)localObject1).apply();
  }
}

/* Location:
 * Qualified Name:     com.facebook.LegacyTokenHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */