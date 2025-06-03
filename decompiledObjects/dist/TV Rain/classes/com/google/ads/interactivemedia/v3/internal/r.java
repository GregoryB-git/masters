package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

public final class r
{
  private static r a = new r();
  
  public static r a()
  {
    return a;
  }
  
  public static boolean a(WebView paramWebView, String paramString)
  {
    if ((paramWebView != null) && (!TextUtils.isEmpty(paramString)))
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "javascript: ".concat(paramString);
      } else {
        paramString = new String("javascript: ");
      }
      paramWebView.loadUrl(paramString);
      return true;
    }
    return false;
  }
  
  public final void a(WebView paramWebView)
  {
    a(paramWebView, "finishSession", new Object[0]);
  }
  
  public final void a(WebView paramWebView, float paramFloat)
  {
    a(paramWebView, "setDeviceVolume", new Object[] { Float.valueOf(paramFloat) });
  }
  
  public final void a(WebView paramWebView, String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    a(paramWebView, "startSession", new Object[] { paramString, paramJSONObject1, paramJSONObject2 });
  }
  
  public final void a(WebView paramWebView, String paramString, Object... paramVarArgs)
  {
    if (paramWebView != null)
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
      localStringBuilder.append(paramString);
      localStringBuilder.append("(");
      if ((paramVarArgs != null) && (paramVarArgs.length > 0))
      {
        int i = paramVarArgs.length;
        for (int j = 0; j < i; j++)
        {
          paramString = paramVarArgs[j];
          if (paramString == null)
          {
            localStringBuilder.append('"');
            localStringBuilder.append('"');
          }
          else if ((paramString instanceof String))
          {
            paramString = paramString.toString();
            if (paramString.startsWith("{"))
            {
              localStringBuilder.append(paramString);
            }
            else
            {
              localStringBuilder.append('"');
              localStringBuilder.append(paramString);
              localStringBuilder.append('"');
            }
          }
          else
          {
            localStringBuilder.append(paramString);
          }
          localStringBuilder.append(",");
        }
        localStringBuilder.setLength(localStringBuilder.length() - 1);
      }
      localStringBuilder.append(")}");
      paramString = localStringBuilder.toString();
      paramVarArgs = paramWebView.getHandler();
      if ((paramVarArgs != null) && (Looper.myLooper() != paramVarArgs.getLooper()))
      {
        paramVarArgs.post(new q(paramWebView, paramString));
        return;
      }
      paramWebView.loadUrl(paramString);
    }
    else
    {
      paramWebView = String.valueOf(paramString);
      if (paramWebView.length() != 0) {
        "The WebView is null for ".concat(paramWebView);
      }
      h.e();
    }
  }
  
  public final void a(WebView paramWebView, JSONObject paramJSONObject)
  {
    a(paramWebView, "init", new Object[] { paramJSONObject });
  }
  
  public final void b(WebView paramWebView, String paramString)
  {
    a(paramWebView, "setNativeViewHierarchy", new Object[] { paramString });
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */