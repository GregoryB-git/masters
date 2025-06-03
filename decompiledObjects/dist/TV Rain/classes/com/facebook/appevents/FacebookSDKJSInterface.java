package com.facebook.appevents;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

class FacebookSDKJSInterface
{
  private static final String PARAMETER_FBSDK_PIXEL_REFERRAL = "_fb_pixel_referral_id";
  private static final String PROTOCOL = "fbmq-0.1";
  public static final String TAG = "FacebookSDKJSInterface";
  private Context context;
  
  public FacebookSDKJSInterface(Context paramContext)
  {
    context = paramContext;
  }
  
  /* Error */
  @androidx.annotation.VisibleForTesting
  public static Bundle jsonStringToBundle(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 35	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: new 37	org/json/JSONObject
    //   13: astore_1
    //   14: aload_1
    //   15: aload_0
    //   16: invokespecial 40	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: invokestatic 44	com/facebook/appevents/FacebookSDKJSInterface:jsonToBundle	(Lorg/json/JSONObject;)Landroid/os/Bundle;
    //   23: astore_0
    //   24: aload_0
    //   25: areturn
    //   26: astore_0
    //   27: goto +14 -> 41
    //   30: astore_0
    //   31: new 46	android/os/Bundle
    //   34: dup
    //   35: invokespecial 47	android/os/Bundle:<init>	()V
    //   38: astore_0
    //   39: aload_0
    //   40: areturn
    //   41: aload_0
    //   42: ldc 2
    //   44: invokestatic 51	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   47: aconst_null
    //   48: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	paramString	String
    //   13	7	1	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   10	24	26	finally
    //   31	39	26	finally
    //   10	24	30	org/json/JSONException
  }
  
  private static Bundle jsonToBundle(JSONObject paramJSONObject)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(FacebookSDKJSInterface.class)) {
      return null;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localBundle.putString(str, paramJSONObject.getString(str));
      }
      return localBundle;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramJSONObject, FacebookSDKJSInterface.class);
    }
    return null;
  }
  
  @JavascriptInterface
  public String getProtocol()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    return "fbmq-0.1";
  }
  
  @JavascriptInterface
  public void sendEvent(String paramString1, String paramString2, String paramString3)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    if (paramString1 == null) {}
    try
    {
      Logger.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
      return;
    }
    finally
    {
      InternalAppEventsLogger localInternalAppEventsLogger;
      CrashShieldHandler.handleThrowable(paramString1, this);
    }
    localInternalAppEventsLogger = new com/facebook/appevents/InternalAppEventsLogger;
    localInternalAppEventsLogger.<init>(context);
    paramString3 = jsonStringToBundle(paramString3);
    paramString3.putString("_fb_pixel_referral_id", paramString1);
    localInternalAppEventsLogger.logEvent(paramString2, paramString3);
    return;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.FacebookSDKJSInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */