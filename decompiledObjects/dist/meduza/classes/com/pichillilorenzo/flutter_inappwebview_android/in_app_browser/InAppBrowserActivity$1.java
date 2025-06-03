package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.webkit.WebView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;

class InAppBrowserActivity$1
  implements SearchView.OnQueryTextListener
{
  public InAppBrowserActivity$1(InAppBrowserActivity paramInAppBrowserActivity) {}
  
  public boolean onQueryTextChange(String paramString)
  {
    return false;
  }
  
  public boolean onQueryTextSubmit(String paramString)
  {
    if (!paramString.isEmpty())
    {
      InAppWebView localInAppWebView = this$0.webView;
      if (localInAppWebView != null) {
        localInAppWebView.loadUrl(paramString);
      }
      paramString = this$0.searchView;
      if (paramString != null)
      {
        paramString.setQuery("", false);
        this$0.searchView.setIconified(true);
      }
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */