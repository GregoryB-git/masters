package com.facebook.appevents;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.aam.MetadataRule;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class UserDataStore
{
  public static final String CITY = "ct";
  public static final String COUNTRY = "country";
  private static final String DATA_SEPARATOR = ",";
  public static final String DATE_OF_BIRTH = "db";
  public static final String EMAIL = "em";
  public static final String FIRST_NAME = "fn";
  public static final String GENDER = "ge";
  private static final String INTERNAL_USER_DATA_KEY = "com.facebook.appevents.UserDataStore.internalUserData";
  public static final String LAST_NAME = "ln";
  private static final int MAX_NUM = 5;
  public static final String PHONE = "ph";
  public static final String STATE = "st";
  private static final String TAG = "UserDataStore";
  private static final String USER_DATA_KEY = "com.facebook.appevents.UserDataStore.userData";
  public static final String ZIP = "zp";
  private static final ConcurrentHashMap<String, String> externalHashedUserData = new ConcurrentHashMap();
  private static AtomicBoolean initialized = new AtomicBoolean(false);
  private static final ConcurrentHashMap<String, String> internalHashedUserData = new ConcurrentHashMap();
  private static SharedPreferences sharedPreferences;
  
  public static void clear()
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return;
    }
    try
    {
      Executor localExecutor = InternalAppEventsLogger.getAnalyticsExecutor();
      Runnable local3 = new com/facebook/appevents/UserDataStore$3;
      local3.<init>();
      localExecutor.execute(local3);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserDataStore.class);
    }
  }
  
  public static String getAllHashedUserData()
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return null;
    }
    try
    {
      if (!initialized.get()) {
        initAndWait();
      }
      Object localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>();
      ((HashMap)localObject).putAll(externalHashedUserData);
      ((HashMap)localObject).putAll(getEnabledInternalUserData());
      localObject = Utility.mapToJsonStr((Map)localObject);
      return (String)localObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserDataStore.class);
    }
    return null;
  }
  
  private static Map<String, String> getEnabledInternalUserData()
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return null;
    }
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      Set localSet = MetadataRule.getEnabledRuleNames();
      Iterator localIterator = internalHashedUserData.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (localSet.contains(str)) {
          localHashMap.put(str, internalHashedUserData.get(str));
        }
      }
      return localHashMap;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserDataStore.class);
    }
    return null;
  }
  
  public static String getHashedUserData()
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return null;
    }
    try
    {
      if (!initialized.get())
      {
        Log.w(TAG, "initStore should have been called before calling setUserID");
        initAndWait();
      }
      String str = Utility.mapToJsonStr(externalHashedUserData);
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserDataStore.class);
    }
    return null;
  }
  
  /* Error */
  private static void initAndWait()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 96	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_0
    //   9: iload_0
    //   10: ifeq +7 -> 17
    //   13: ldc 2
    //   15: monitorexit
    //   16: return
    //   17: getstatic 78	com/facebook/appevents/UserDataStore:initialized	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   20: invokevirtual 144	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   23: istore_0
    //   24: iload_0
    //   25: ifeq +7 -> 32
    //   28: ldc 2
    //   30: monitorexit
    //   31: return
    //   32: invokestatic 214	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   35: invokestatic 220	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   38: astore_1
    //   39: aload_1
    //   40: putstatic 108	com/facebook/appevents/UserDataStore:sharedPreferences	Landroid/content/SharedPreferences;
    //   43: aload_1
    //   44: ldc 57
    //   46: ldc -34
    //   48: invokeinterface 228 3 0
    //   53: astore_1
    //   54: getstatic 108	com/facebook/appevents/UserDataStore:sharedPreferences	Landroid/content/SharedPreferences;
    //   57: ldc 39
    //   59: ldc -34
    //   61: invokeinterface 228 3 0
    //   66: astore_2
    //   67: getstatic 84	com/facebook/appevents/UserDataStore:externalHashedUserData	Ljava/util/concurrent/ConcurrentHashMap;
    //   70: aload_1
    //   71: invokestatic 232	com/facebook/internal/Utility:JsonStrToMap	(Ljava/lang/String;)Ljava/util/Map;
    //   74: invokevirtual 233	java/util/concurrent/ConcurrentHashMap:putAll	(Ljava/util/Map;)V
    //   77: getstatic 86	com/facebook/appevents/UserDataStore:internalHashedUserData	Ljava/util/concurrent/ConcurrentHashMap;
    //   80: aload_2
    //   81: invokestatic 232	com/facebook/internal/Utility:JsonStrToMap	(Ljava/lang/String;)Ljava/util/Map;
    //   84: invokevirtual 233	java/util/concurrent/ConcurrentHashMap:putAll	(Ljava/util/Map;)V
    //   87: getstatic 78	com/facebook/appevents/UserDataStore:initialized	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   90: iconst_1
    //   91: invokevirtual 236	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   94: ldc 2
    //   96: monitorexit
    //   97: return
    //   98: astore_1
    //   99: aload_1
    //   100: ldc 2
    //   102: invokestatic 100	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   105: ldc 2
    //   107: monitorexit
    //   108: return
    //   109: astore_1
    //   110: ldc 2
    //   112: monitorexit
    //   113: aload_1
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	17	0	bool	boolean
    //   38	33	1	localObject1	Object
    //   98	2	1	localThrowable	Throwable
    //   109	5	1	localObject2	Object
    //   66	15	2	str	String
    // Exception table:
    //   from	to	target	type
    //   17	24	98	finally
    //   32	94	98	finally
    //   3	9	109	finally
    //   99	105	109	finally
  }
  
  public static void initStore()
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return;
    }
    try
    {
      if (initialized.get()) {
        return;
      }
      initAndWait();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserDataStore.class);
    }
  }
  
  private static boolean maybeSHA256Hashed(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return false;
    }
    try
    {
      boolean bool = paramString.matches("[A-Fa-f0-9]{64}");
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, UserDataStore.class);
    }
    return false;
  }
  
  private static String normalizeData(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return null;
    }
    try
    {
      paramString2 = paramString2.trim().toLowerCase();
      boolean bool = "em".equals(paramString1);
      if (bool)
      {
        if (Patterns.EMAIL_ADDRESS.matcher(paramString2).matches()) {
          return paramString2;
        }
        Log.e(TAG, "Setting email failure: this is not a valid email address");
        return "";
      }
      if ("ph".equals(paramString1)) {
        return paramString2.replaceAll("[^0-9]", "");
      }
      if ("ge".equals(paramString1))
      {
        if (paramString2.length() > 0) {
          paramString1 = paramString2.substring(0, 1);
        } else {
          paramString1 = "";
        }
        if ((!"f".equals(paramString1)) && (!"m".equals(paramString1)))
        {
          Log.e(TAG, "Setting gender failure: the supported value for gender is f or m");
          return "";
        }
        return paramString1;
      }
      return paramString2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, UserDataStore.class);
    }
    return null;
  }
  
  public static void setInternalUd(Map<String, String> paramMap)
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return;
    }
    try
    {
      if (!initialized.get()) {
        initAndWait();
      }
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)((Map.Entry)localIterator.next()).getKey();
        String str2 = Utility.sha256hash(normalizeData(str1, ((String)paramMap.get(str1)).trim()));
        Object localObject = internalHashedUserData;
        if (((ConcurrentHashMap)localObject).containsKey(str1))
        {
          String str3 = (String)((ConcurrentHashMap)localObject).get(str1);
          if (str3 != null) {
            localObject = str3.split(",");
          } else {
            localObject = new String[0];
          }
          HashSet localHashSet = new java/util/HashSet;
          localHashSet.<init>(Arrays.asList((Object[])localObject));
          if (localHashSet.contains(str2)) {
            return;
          }
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          if (localObject.length == 0)
          {
            localStringBuilder.append(str2);
          }
          else if (localObject.length < 5)
          {
            localStringBuilder.append(str3);
            localStringBuilder.append(",");
            localStringBuilder.append(str2);
          }
          else
          {
            for (int i = 1; i < 5; i++)
            {
              localStringBuilder.append(localObject[i]);
              localStringBuilder.append(",");
            }
            localStringBuilder.append(str2);
            localHashSet.remove(localObject[0]);
          }
          internalHashedUserData.put(str1, localStringBuilder.toString());
        }
        else
        {
          ((ConcurrentHashMap)localObject).put(str1, str2);
        }
      }
      writeDataIntoCache("com.facebook.appevents.UserDataStore.internalUserData", Utility.mapToJsonStr(internalHashedUserData));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMap, UserDataStore.class);
    }
  }
  
  public static void setUserDataAndHash(Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return;
    }
    try
    {
      Executor localExecutor = InternalAppEventsLogger.getAnalyticsExecutor();
      Runnable local2 = new com/facebook/appevents/UserDataStore$2;
      local2.<init>(paramBundle);
      localExecutor.execute(local2);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, UserDataStore.class);
    }
  }
  
  public static void setUserDataAndHash(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, @Nullable String paramString6, @Nullable String paramString7, @Nullable String paramString8, @Nullable String paramString9, @Nullable String paramString10)
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      if (paramString1 != null) {
        localBundle.putString("em", paramString1);
      }
      if (paramString2 != null) {
        localBundle.putString("fn", paramString2);
      }
      if (paramString3 != null) {
        localBundle.putString("ln", paramString3);
      }
      if (paramString4 != null) {
        localBundle.putString("ph", paramString4);
      }
      if (paramString5 != null) {
        localBundle.putString("db", paramString5);
      }
      if (paramString6 != null) {
        localBundle.putString("ge", paramString6);
      }
      if (paramString7 != null) {
        localBundle.putString("ct", paramString7);
      }
      if (paramString8 != null) {
        localBundle.putString("st", paramString8);
      }
      if (paramString9 != null) {
        localBundle.putString("zp", paramString9);
      }
      if (paramString10 != null) {
        localBundle.putString("country", paramString10);
      }
      setUserDataAndHash(localBundle);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, UserDataStore.class);
    }
  }
  
  private static void updateHashUserData(Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return;
    }
    if (paramBundle == null) {
      return;
    }
    try
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = paramBundle.get(str);
        if (localObject != null)
        {
          localObject = localObject.toString();
          if (maybeSHA256Hashed((String)localObject))
          {
            externalHashedUserData.put(str, ((String)localObject).toLowerCase());
          }
          else
          {
            localObject = Utility.sha256hash(normalizeData(str, (String)localObject));
            if (localObject != null) {
              externalHashedUserData.put(str, localObject);
            }
          }
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, UserDataStore.class);
    }
  }
  
  private static void writeDataIntoCache(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(UserDataStore.class)) {
      return;
    }
    try
    {
      Executor localExecutor = FacebookSdk.getExecutor();
      Runnable local1 = new com/facebook/appevents/UserDataStore$1;
      local1.<init>(paramString1, paramString2);
      localExecutor.execute(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, UserDataStore.class);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.UserDataStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */