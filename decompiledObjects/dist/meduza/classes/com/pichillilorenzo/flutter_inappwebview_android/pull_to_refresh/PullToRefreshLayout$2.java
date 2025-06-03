package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import y1.e;
import y1.e.j;

class PullToRefreshLayout$2
  implements e.j
{
  public void onRefresh()
  {
    PullToRefreshChannelDelegate localPullToRefreshChannelDelegate = this$0.channelDelegate;
    if (localPullToRefreshChannelDelegate == null)
    {
      val$self.setRefreshing(false);
      return;
    }
    localPullToRefreshChannelDelegate.onRefresh();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */