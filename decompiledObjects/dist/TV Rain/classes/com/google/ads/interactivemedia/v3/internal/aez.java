package com.google.ads.interactivemedia.v3.internal;

import a;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class aez
  extends WebViewClient
{
  public aez(afa paramafa) {}
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {
      paramWebView = "Finished ".concat(paramWebView);
    } else {
      paramWebView = new String("Finished ");
    }
    afa.c(paramWebView);
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    paramWebView = String.valueOf(paramString);
    if (paramWebView.length() != 0) {
      paramWebView = "Started ".concat(paramWebView);
    } else {
      paramWebView = new String("Started ");
    }
    afa.c(paramWebView);
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    paramWebView = new StringBuilder(a.b(paramString2, a.b(paramString1, 20)));
    paramWebView.append("Error: ");
    paramWebView.append(paramInt);
    paramWebView.append(" ");
    paramWebView.append(paramString1);
    paramWebView.append(" ");
    paramWebView.append(paramString2);
    afa.c(paramWebView.toString());
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (!paramString.startsWith("gmsg://")) {
      return false;
    }
    a.b(paramString);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aez
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */