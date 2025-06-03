package com.google.ads.interactivemedia.v3.internal;

import a;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

@SuppressLint({"SetJavaScriptEnabled", "NewApi"})
public final class afa
{
  private final afc a;
  private final WebView b;
  
  public afa(Context paramContext, afc paramafc)
  {
    this(new WebView(paramContext), paramafc);
  }
  
  private afa(WebView paramWebView, afc paramafc)
  {
    a = paramafc;
    b = paramWebView;
    paramWebView.setBackgroundColor(0);
    paramWebView.getSettings().setMixedContentMode(0);
    paramWebView.getSettings().setJavaScriptEnabled(true);
    paramWebView.setWebViewClient(new aez(this));
    paramWebView.setWebChromeClient(new WebChromeClient());
    paramWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
    paramafc = CookieManager.getInstance();
    paramafc.setAcceptCookie(true);
    paramafc.setAcceptThirdPartyCookies(paramWebView, true);
  }
  
  private static final void a(boolean paramBoolean, aeq paramaeq, String paramString)
  {
    String str1;
    if (paramBoolean) {
      str1 = "Sending javascript msg: ";
    } else {
      str1 = "Received msg: ";
    }
    if (aem.a(aem.a))
    {
      String str2 = String.valueOf(paramaeq);
      int i = str1.length();
      paramaeq = new StringBuilder(a.b(paramString, str2.length() + (i + 7)));
      paramaeq.append(str1);
      paramaeq.append(str2);
      paramaeq.append("; URL: ");
      paramaeq.append(paramString);
      Log.d("IMASDK", paramaeq.toString());
      return;
    }
    if (aem.a(aem.b))
    {
      paramString = paramaeq.a().name();
      paramaeq = paramaeq.b().name();
      paramString = a.q(a.b(paramaeq, a.b(paramString, str1.length() + 17)), str1, "Channel: ", paramString, "; type: ");
      paramString.append(paramaeq);
      Log.d("IMASDK", paramString.toString());
    }
  }
  
  public static final void c(String paramString)
  {
    if (aem.a(aem.c)) {
      Log.d("IMASDK", paramString);
    }
  }
  
  public final WebView a()
  {
    return b;
  }
  
  @TargetApi(19)
  public final void a(aeq paramaeq)
  {
    String str = paramaeq.e();
    a(true, paramaeq, str);
    try
    {
      b.evaluateJavascript(str, null);
      return;
    }
    catch (IllegalStateException paramaeq)
    {
      b.loadUrl(str);
    }
  }
  
  public final void a(String paramString)
  {
    b.loadUrl(paramString);
  }
  
  public final void b(String paramString)
  {
    try
    {
      aeq localaeq = aeq.a(paramString);
      a(false, localaeq, paramString);
      a.a(localaeq);
      return;
    }
    catch (Exception localException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "An internal error occured parsing message from javascript.  Message to be parsed: ".concat(paramString);
      } else {
        paramString = new String("An internal error occured parsing message from javascript.  Message to be parsed: ");
      }
      Log.e("IMASDK", paramString, localException);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Invalid internal message, ignoring. Please make sure the Google IMA SDK library is up to date. Message: ".concat(paramString);
      } else {
        paramString = new String("Invalid internal message, ignoring. Please make sure the Google IMA SDK library is up to date. Message: ");
      }
      Log.w("IMASDK", paramString);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */