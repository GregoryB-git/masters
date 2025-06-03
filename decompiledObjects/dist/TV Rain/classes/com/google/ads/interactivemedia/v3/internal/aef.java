package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener;
import java.util.Iterator;
import java.util.List;

final class aef
  extends WebViewClient
{
  public aef(aeg paramaeg) {}
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    a.a.c(paramString);
    paramWebView = a.b.iterator();
    while (paramWebView.hasNext()) {
      ((CompanionAdSlot.ClickListener)paramWebView.next()).onCompanionAdClick();
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */