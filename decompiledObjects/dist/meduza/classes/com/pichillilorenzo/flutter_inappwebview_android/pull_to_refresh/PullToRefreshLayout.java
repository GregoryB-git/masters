package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.MethodChannel;
import y1.e;
import y1.e.i;
import y1.e.j;

public class PullToRefreshLayout
  extends e
  implements Disposable
{
  public static final String LOG_TAG = "PullToRefreshLayout";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_";
  public PullToRefreshChannelDelegate channelDelegate;
  public PullToRefreshSettings settings;
  
  public PullToRefreshLayout(Context paramContext)
  {
    super(paramContext);
    settings = new PullToRefreshSettings();
  }
  
  public PullToRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    settings = new PullToRefreshSettings();
  }
  
  public PullToRefreshLayout(Context paramContext, InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, Object paramObject, PullToRefreshSettings paramPullToRefreshSettings)
  {
    super(paramContext);
    new PullToRefreshSettings();
    settings = paramPullToRefreshSettings;
    paramInAppWebViewFlutterPlugin = messenger;
    paramContext = new StringBuilder();
    paramContext.append("com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_");
    paramContext.append(paramObject);
    channelDelegate = new PullToRefreshChannelDelegate(this, new MethodChannel(paramInAppWebViewFlutterPlugin, paramContext.toString()));
  }
  
  public void dispose()
  {
    PullToRefreshChannelDelegate localPullToRefreshChannelDelegate = channelDelegate;
    if (localPullToRefreshChannelDelegate != null)
    {
      localPullToRefreshChannelDelegate.dispose();
      channelDelegate = null;
    }
    removeAllViews();
  }
  
  public void prepare()
  {
    setEnabled(settings.enabled.booleanValue());
    setOnChildScrollUpCallback(new e.i()
    {
      public boolean canChildScrollUp(e paramAnonymouse, View paramAnonymousView)
      {
        boolean bool1 = paramAnonymousView instanceof InAppWebView;
        boolean bool2 = true;
        boolean bool3 = bool2;
        if (bool1)
        {
          paramAnonymouse = (InAppWebView)paramAnonymousView;
          if (paramAnonymouse.canScrollVertically())
          {
            bool3 = bool2;
            if (paramAnonymouse.getScrollY() > 0) {}
          }
          else if ((!paramAnonymouse.canScrollVertically()) && (paramAnonymouse.getScrollY() == 0))
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
    });
    setOnRefreshListener(new e.j()
    {
      public void onRefresh()
      {
        PullToRefreshChannelDelegate localPullToRefreshChannelDelegate = this$0.channelDelegate;
        if (localPullToRefreshChannelDelegate == null)
        {
          jdField_this.setRefreshing(false);
          return;
        }
        localPullToRefreshChannelDelegate.onRefresh();
      }
    });
    Object localObject = settings.color;
    if (localObject != null) {
      setColorSchemeColors(new int[] { Color.parseColor((String)localObject) });
    }
    localObject = settings.backgroundColor;
    if (localObject != null) {
      setProgressBackgroundColorSchemeColor(Color.parseColor((String)localObject));
    }
    localObject = settings.distanceToTriggerSync;
    if (localObject != null) {
      setDistanceToTriggerSync(((Integer)localObject).intValue());
    }
    localObject = settings.slingshotDistance;
    if (localObject != null) {
      setSlingshotDistance(((Integer)localObject).intValue());
    }
    localObject = settings.size;
    if (localObject != null) {
      setSize(((Integer)localObject).intValue());
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */