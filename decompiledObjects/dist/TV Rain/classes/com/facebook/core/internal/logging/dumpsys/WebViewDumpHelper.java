package com.facebook.core.internal.logging.dumpsys;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressLint({"NewApi", "StringFormatUse", "DefaultLocale", "BadMethodUse-java.lang.String.length"})
final class WebViewDumpHelper
{
  public static final String GET_WEBVIEW_HTML_JS_SCRIPT = "(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();";
  private final Map<String, String> mWebViewHTMLs = new HashMap();
  private final Set<WebViewData> mWebViews = new HashSet();
  
  private static String fixHtmlString(WebViewData paramWebViewData, String paramString)
  {
    paramString = paramString.replace("\\u003C", "<").replace("\\n", "").replace("\\\"", "\"");
    return String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", new Object[] { key, Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(width), Integer.valueOf(height), paramString.substring(1, paramString.length() - 1) });
  }
  
  public void dump(PrintWriter paramPrintWriter)
  {
    try
    {
      Iterator localIterator = mWebViews.iterator();
      while (localIterator.hasNext())
      {
        WebViewData localWebViewData = (WebViewData)localIterator.next();
        String str = (String)mWebViewHTMLs.get(key);
        if (str != null)
        {
          paramPrintWriter.print("WebView HTML for ");
          paramPrintWriter.print(localWebViewData);
          paramPrintWriter.println(":");
          paramPrintWriter.println(fixHtmlString(localWebViewData, str));
        }
      }
    }
    catch (Exception paramPrintWriter)
    {
      for (;;) {}
    }
    mWebViews.clear();
    mWebViewHTMLs.clear();
  }
  
  public void handle(WebView paramWebView)
  {
    final WebViewData localWebViewData = new WebViewData(paramWebView);
    mWebViews.add(localWebViewData);
    DisplayMetrics localDisplayMetrics = paramWebView.getResources().getDisplayMetrics();
    paramWebView.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", new Object[] { Integer.valueOf(left), Integer.valueOf(top), Float.valueOf(scaledDensity) }), new ValueCallback()
    {
      public void onReceiveValue(String paramAnonymousString)
      {
        WebViewDumpHelper.access$000(WebViewDumpHelper.this).put(localWebViewDatakey, paramAnonymousString);
      }
    });
  }
  
  public static final class WebViewData
  {
    private static final int[] mLocation = new int[2];
    public final int height;
    public final String key;
    public final int left;
    public final int top;
    public final int width;
    
    public WebViewData(WebView paramWebView)
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
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.WebViewDumpHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */