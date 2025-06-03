package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.graphics.Color;
import android.view.View;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;
import y1.e;

public class PullToRefreshChannelDelegate
  extends ChannelDelegateImpl
{
  private PullToRefreshLayout pullToRefreshView;
  
  public PullToRefreshChannelDelegate(PullToRefreshLayout paramPullToRefreshLayout, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    pullToRefreshView = paramPullToRefreshLayout;
  }
  
  public void dispose()
  {
    super.dispose();
    pullToRefreshView = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = method;
    localObject.getClass();
    int i = ((String)localObject).hashCode();
    boolean bool = true;
    switch (i)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        i = -1;
                        break;
                      } while (!((String)localObject).equals("isEnabled"));
                      i = 9;
                      break;
                    } while (!((String)localObject).equals("setSize"));
                    i = 8;
                    break;
                  } while (!((String)localObject).equals("isRefreshing"));
                  i = 7;
                  break;
                } while (!((String)localObject).equals("setDistanceToTriggerSync"));
                i = 6;
                break;
              } while (!((String)localObject).equals("setBackgroundColor"));
              i = 5;
              break;
            } while (!((String)localObject).equals("setColor"));
            i = 4;
            break;
          } while (!((String)localObject).equals("setEnabled"));
          i = 3;
          break;
        } while (!((String)localObject).equals("getDefaultSlingshotDistance"));
        i = 2;
        break;
      } while (!((String)localObject).equals("setRefreshing"));
      i = 1;
      break;
    } while (!((String)localObject).equals("setSlingshotDistance"));
    i = 0;
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 9: 
      paramMethodCall = pullToRefreshView;
      if (paramMethodCall != null) {
        paramMethodCall = Boolean.valueOf(paramMethodCall.isEnabled());
      }
      break;
    case 8: 
      if (pullToRefreshView != null)
      {
        paramMethodCall = (Integer)paramMethodCall.argument("size");
        pullToRefreshView.setSize(paramMethodCall.intValue());
      }
      break;
    case 7: 
      paramMethodCall = pullToRefreshView;
      if ((paramMethodCall == null) || (!paramMethodCall.isRefreshing())) {
        bool = false;
      }
      paramMethodCall = Boolean.valueOf(bool);
      break;
    case 6: 
      if (pullToRefreshView != null)
      {
        paramMethodCall = (Integer)paramMethodCall.argument("distanceToTriggerSync");
        pullToRefreshView.setDistanceToTriggerSync(paramMethodCall.intValue());
      }
      break;
    case 5: 
      if (pullToRefreshView != null)
      {
        paramMethodCall = (String)paramMethodCall.argument("color");
        pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor(paramMethodCall));
      }
      break;
    case 4: 
      if (pullToRefreshView != null)
      {
        paramMethodCall = (String)paramMethodCall.argument("color");
        pullToRefreshView.setColorSchemeColors(new int[] { Color.parseColor(paramMethodCall) });
      }
      break;
    case 3: 
      if (pullToRefreshView != null)
      {
        paramMethodCall = (Boolean)paramMethodCall.argument("enabled");
        localObject = pullToRefreshView;
        settings.enabled = paramMethodCall;
        ((e)localObject).setEnabled(paramMethodCall.booleanValue());
      }
      break;
    }
    for (;;)
    {
      paramMethodCall = Boolean.TRUE;
      label603:
      do
      {
        do
        {
          paramMethodCall = Boolean.FALSE;
          break label603;
          paramMethodCall = Integer.valueOf(-1);
          paramResult.success(paramMethodCall);
          break;
        } while (pullToRefreshView == null);
        paramMethodCall = (Boolean)paramMethodCall.argument("refreshing");
        pullToRefreshView.setRefreshing(paramMethodCall.booleanValue());
        break;
      } while (pullToRefreshView == null);
      paramMethodCall = (Integer)paramMethodCall.argument("slingshotDistance");
      pullToRefreshView.setSlingshotDistance(paramMethodCall.intValue());
    }
  }
  
  public void onRefresh()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onRefresh", new HashMap());
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */