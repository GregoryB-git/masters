package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

public class InAppBrowserChannelDelegate
  extends ChannelDelegateImpl
{
  public InAppBrowserChannelDelegate(MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
  }
  
  public void onBrowserCreated()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onBrowserCreated", new HashMap());
  }
  
  public void onExit()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onExit", new HashMap());
  }
  
  public void onMenuItemClicked(InAppBrowserMenuItem paramInAppBrowserMenuItem)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", Integer.valueOf(paramInAppBrowserMenuItem.getId()));
    localMethodChannel.invokeMethod("onMenuItemClicked", localHashMap);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */