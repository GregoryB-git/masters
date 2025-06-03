package com.facebook.applinks;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import bolts.AppLink;
import bolts.AppLink.Target;
import bolts.AppLinkResolver;
import bolts.Continuation;
import bolts.Task;
import bolts.Task.TaskCompletionSource;
import bolts.TaskCompletionSource;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookAppLinkResolver
  implements AppLinkResolver
{
  private static final String APP_LINK_ANDROID_TARGET_KEY = "android";
  private static final String APP_LINK_KEY = "app_links";
  private static final String APP_LINK_TARGET_APP_NAME_KEY = "app_name";
  private static final String APP_LINK_TARGET_CLASS_KEY = "class";
  private static final String APP_LINK_TARGET_PACKAGE_KEY = "package";
  private static final String APP_LINK_TARGET_SHOULD_FALLBACK_KEY = "should_fallback";
  private static final String APP_LINK_TARGET_URL_KEY = "url";
  private static final String APP_LINK_WEB_TARGET_KEY = "web";
  private final HashMap<Uri, AppLink> cachedAppLinks = new HashMap();
  
  private static AppLink.Target getAndroidTargetFromJson(JSONObject paramJSONObject)
  {
    if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
      return null;
    }
    try
    {
      String str1 = tryGetStringFromJson(paramJSONObject, "package", null);
      if (str1 == null) {
        return null;
      }
      String str2 = tryGetStringFromJson(paramJSONObject, "class", null);
      String str3 = tryGetStringFromJson(paramJSONObject, "app_name", null);
      paramJSONObject = tryGetStringFromJson(paramJSONObject, "url", null);
      if (paramJSONObject != null) {
        paramJSONObject = Uri.parse(paramJSONObject);
      } else {
        paramJSONObject = null;
      }
      paramJSONObject = new AppLink.Target(str1, str2, paramJSONObject, str3);
      return paramJSONObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramJSONObject, FacebookAppLinkResolver.class);
    }
    return null;
  }
  
  /* Error */
  private static Uri getWebFallbackUriFromJson(Uri paramUri, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: istore_2
    //   6: aconst_null
    //   7: astore_3
    //   8: iload_2
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: aload_1
    //   15: ldc 35
    //   17: invokevirtual 93	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   20: astore_1
    //   21: aload_1
    //   22: ldc 29
    //   24: iconst_1
    //   25: invokestatic 97	com/facebook/applinks/FacebookAppLinkResolver:tryGetBooleanFromJson	(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    //   28: ifne +5 -> 33
    //   31: aconst_null
    //   32: areturn
    //   33: aload_1
    //   34: ldc 32
    //   36: aconst_null
    //   37: invokestatic 74	com/facebook/applinks/FacebookAppLinkResolver:tryGetStringFromJson	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   40: astore 4
    //   42: aload_3
    //   43: astore_1
    //   44: aload 4
    //   46: ifnull +9 -> 55
    //   49: aload 4
    //   51: invokestatic 80	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnull +5 -> 61
    //   59: aload_1
    //   60: astore_0
    //   61: aload_0
    //   62: areturn
    //   63: astore_0
    //   64: aload_0
    //   65: ldc 2
    //   67: invokestatic 63	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   70: aconst_null
    //   71: areturn
    //   72: astore_1
    //   73: aload_0
    //   74: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	paramUri	Uri
    //   0	75	1	paramJSONObject	JSONObject
    //   5	4	2	bool	boolean
    //   7	36	3	localObject	Object
    //   40	10	4	str	String
    // Exception table:
    //   from	to	target	type
    //   14	31	63	finally
    //   33	42	63	finally
    //   49	55	63	finally
    //   14	31	72	org/json/JSONException
    //   33	42	72	org/json/JSONException
    //   49	55	72	org/json/JSONException
  }
  
  /* Error */
  private static boolean tryGetBooleanFromJson(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 101	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   15: istore_3
    //   16: iload_3
    //   17: ireturn
    //   18: astore_0
    //   19: aload_0
    //   20: ldc 2
    //   22: invokestatic 63	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   25: iconst_0
    //   26: ireturn
    //   27: astore_0
    //   28: iload_2
    //   29: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	paramJSONObject	JSONObject
    //   0	30	1	paramString	String
    //   0	30	2	paramBoolean	boolean
    //   15	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   10	16	18	finally
    //   10	16	27	org/json/JSONException
  }
  
  /* Error */
  private static String tryGetStringFromJson(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 56	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 105	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   15: astore_0
    //   16: aload_0
    //   17: areturn
    //   18: astore_0
    //   19: aload_0
    //   20: ldc 2
    //   22: invokestatic 63	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   25: aconst_null
    //   26: areturn
    //   27: astore_0
    //   28: aload_2
    //   29: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	paramJSONObject	JSONObject
    //   0	30	1	paramString1	String
    //   0	30	2	paramString2	String
    // Exception table:
    //   from	to	target	type
    //   10	16	18	finally
    //   10	16	27	org/json/JSONException
  }
  
  public Task<AppLink> getAppLinkFromUrlInBackground(Uri paramUri)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      ((ArrayList)localObject).add(paramUri);
      Task localTask = getAppLinkFromUrlsInBackground((List)localObject);
      localObject = new com/facebook/applinks/FacebookAppLinkResolver$1;
      ((1)localObject).<init>(this, paramUri);
      paramUri = localTask.onSuccess((Continuation)localObject);
      return paramUri;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUri, this);
    }
    return null;
  }
  
  public Task<Map<Uri, AppLink>> getAppLinkFromUrlsInBackground(List<Uri> arg1)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = ???.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Uri)((Iterator)localObject3).next();
        synchronized (cachedAppLinks)
        {
          localObject5 = (AppLink)cachedAppLinks.get(localObject4);
          if (localObject5 != null)
          {
            localHashMap.put(localObject4, localObject5);
          }
          else
          {
            if (!localHashSet.isEmpty()) {
              ((StringBuilder)localObject2).append(',');
            }
            ((StringBuilder)localObject2).append(((Uri)localObject4).toString());
            localHashSet.add(localObject4);
          }
        }
      }
      if (localHashSet.isEmpty()) {
        return Task.forResult(localObject1);
      }
      localObject3 = Task.create();
      ??? = new android/os/Bundle;
      ???.<init>();
      ???.putString("ids", ((StringBuilder)localObject2).toString());
      ???.putString("fields", String.format("%s.fields(%s,%s)", new Object[] { "app_links", "android", "web" }));
      localObject2 = new com/facebook/GraphRequest;
      Object localObject5 = AccessToken.getCurrentAccessToken();
      Object localObject4 = new com/facebook/applinks/FacebookAppLinkResolver$2;
      ((2)localObject4).<init>(this, (Task.TaskCompletionSource)localObject3, (Map)localObject1, localHashSet);
      ((GraphRequest)localObject2).<init>((AccessToken)localObject5, "", ???, null, (GraphRequest.Callback)localObject4);
      ((GraphRequest)localObject2).executeAsync();
      ??? = ((TaskCompletionSource)localObject3).getTask();
      return (Task<Map<Uri, AppLink>>)???;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(???, this);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.applinks.FacebookAppLinkResolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */