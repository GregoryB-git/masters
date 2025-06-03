package com.facebook.core.internal.logging.dumpsys;

import android.view.View;
import android.webkit.WebView;

final class WebViewDumpHelper$WebViewData
{
  private static final int[] mLocation = new int[2];
  public final int height;
  public final String key;
  public final int left;
  public final int top;
  public final int width;
  
  public WebViewDumpHelper$WebViewData(WebView paramWebView)
  {
    key = String.format("%s{%s}", new Object[] { paramWebView.getClass().getName(), Integer.toHexString(paramWebView.hashCode()) });
    int[] arrayOfInt = mLocation;
    paramWebView.getLocationOnScreen(arrayOfInt);
    left = arrayOfInt[0];
    top = arrayOfInt[1];
    width = paramWebView.getWidth();
    height = paramWebView.getHeight();
  }
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.WebViewDumpHelper.WebViewData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */