package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookWebFallbackDialog
  extends WebDialog
{
  private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
  private static final String TAG = FacebookWebFallbackDialog.class.getName();
  private boolean waitingForDialogToClose;
  
  private FacebookWebFallbackDialog(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1);
    setExpectedRedirectUrl(paramString2);
  }
  
  public static FacebookWebFallbackDialog newInstance(Context paramContext, String paramString1, String paramString2)
  {
    WebDialog.initDefaultTheme(paramContext);
    return new FacebookWebFallbackDialog(paramContext, paramString1, paramString2);
  }
  
  public void cancel()
  {
    WebView localWebView = getWebView();
    if ((isPageFinished()) && (!isListenerCalled()) && (localWebView != null) && (localWebView.isShown()))
    {
      if (waitingForDialogToClose) {
        return;
      }
      waitingForDialogToClose = true;
      localWebView.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
      new Handler(Looper.getMainLooper()).postDelayed(new Runnable()
      {
        public void run()
        {
          if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
          }
          try
          {
            FacebookWebFallbackDialog.access$001(FacebookWebFallbackDialog.this);
            return;
          }
          finally
          {
            CrashShieldHandler.handleThrowable(localThrowable, this);
          }
        }
      }, 1500L);
      return;
    }
    super.cancel();
  }
  
  public Bundle parseResponseUri(String paramString)
  {
    Bundle localBundle = Utility.parseUrlQueryString(Uri.parse(paramString).getQuery());
    paramString = localBundle.getString("bridge_args");
    localBundle.remove("bridge_args");
    if (!Utility.isNullOrEmpty(paramString)) {
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        localBundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.convertToBundle((JSONObject)localObject));
      }
      catch (JSONException paramString)
      {
        Utility.logd(TAG, "Unable to parse bridge_args JSON", paramString);
      }
    }
    Object localObject = localBundle.getString("method_results");
    localBundle.remove("method_results");
    if (!Utility.isNullOrEmpty((String)localObject))
    {
      paramString = (String)localObject;
      if (Utility.isNullOrEmpty((String)localObject)) {
        paramString = "{}";
      }
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        localBundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.convertToBundle((JSONObject)localObject));
      }
      catch (JSONException paramString)
      {
        Utility.logd(TAG, "Unable to parse bridge_args JSON", paramString);
      }
    }
    localBundle.remove("version");
    localBundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.getLatestKnownVersion());
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FacebookWebFallbackDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */