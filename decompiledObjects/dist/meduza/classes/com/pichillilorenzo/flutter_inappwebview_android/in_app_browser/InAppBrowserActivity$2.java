package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.webkit.WebView;
import android.widget.SearchView;
import android.widget.SearchView.OnCloseListener;

class InAppBrowserActivity$2
  implements SearchView.OnCloseListener
{
  public InAppBrowserActivity$2(InAppBrowserActivity paramInAppBrowserActivity) {}
  
  public boolean onClose()
  {
    Object localObject = this$0.searchView;
    if ((localObject != null) && (((SearchView)localObject).getQuery().toString().isEmpty()))
    {
      localObject = this$0;
      SearchView localSearchView = searchView;
      localObject = webView;
      if (localObject != null) {
        localObject = ((WebView)localObject).getUrl();
      } else {
        localObject = "";
      }
      localSearchView.setQuery((CharSequence)localObject, false);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */