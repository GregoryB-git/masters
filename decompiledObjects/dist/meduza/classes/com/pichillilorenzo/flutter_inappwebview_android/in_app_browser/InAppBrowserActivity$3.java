package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.SearchView;

class InAppBrowserActivity$3
  implements View.OnFocusChangeListener
{
  public InAppBrowserActivity$3(InAppBrowserActivity paramInAppBrowserActivity) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      paramView = this$0.searchView;
      if (paramView != null)
      {
        paramView.setQuery("", false);
        this$0.searchView.setIconified(true);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */