package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;

class InAppBrowserActivity$4
  implements MenuItem.OnMenuItemClickListener
{
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    paramMenuItem = this$0.channelDelegate;
    if (paramMenuItem != null) {
      paramMenuItem.onMenuItemClicked(val$menuItem);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */