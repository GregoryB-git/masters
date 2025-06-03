package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.view.View;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import y1.e;
import y1.e.i;

class PullToRefreshLayout$1
  implements e.i
{
  public PullToRefreshLayout$1(PullToRefreshLayout paramPullToRefreshLayout) {}
  
  public boolean canChildScrollUp(e parame, View paramView)
  {
    boolean bool1 = paramView instanceof InAppWebView;
    boolean bool2 = true;
    boolean bool3 = bool2;
    if (bool1)
    {
      parame = (InAppWebView)paramView;
      if (parame.canScrollVertically())
      {
        bool3 = bool2;
        if (parame.getScrollY() > 0) {}
      }
      else if ((!parame.canScrollVertically()) && (parame.getScrollY() == 0))
      {
        bool3 = bool2;
      }
      else
      {
        bool3 = false;
      }
    }
    return bool3;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */