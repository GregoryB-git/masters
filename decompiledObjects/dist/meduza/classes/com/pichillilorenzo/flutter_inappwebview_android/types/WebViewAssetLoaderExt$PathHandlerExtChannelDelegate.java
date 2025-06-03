package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

public class WebViewAssetLoaderExt$PathHandlerExtChannelDelegate
  extends ChannelDelegateImpl
{
  private WebViewAssetLoaderExt.PathHandlerExt pathHandler;
  
  public WebViewAssetLoaderExt$PathHandlerExtChannelDelegate(WebViewAssetLoaderExt.PathHandlerExt paramPathHandlerExt, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    pathHandler = paramPathHandlerExt;
  }
  
  public void dispose()
  {
    super.dispose();
    pathHandler = null;
  }
  
  public WebResourceResponseExt handle(String paramString)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return null;
    }
    SyncHandleCallback localSyncHandleCallback = new SyncHandleCallback();
    HashMap localHashMap = new HashMap();
    localHashMap.put("path", paramString);
    return (WebResourceResponseExt)Util.invokeMethodAndWaitResult(localMethodChannel, "handle", localHashMap, localSyncHandleCallback);
  }
  
  public void handle(String paramString, HandleCallback paramHandleCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("path", paramString);
    localMethodChannel.invokeMethod("handle", localHashMap, paramHandleCallback);
  }
  
  public static class HandleCallback
    extends BaseCallbackResultImpl<WebResourceResponseExt>
  {
    public WebResourceResponseExt decodeResult(Object paramObject)
    {
      return WebResourceResponseExt.fromMap((Map)paramObject);
    }
  }
  
  public static class SyncHandleCallback
    extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
  {
    public WebResourceResponseExt decodeResult(Object paramObject)
    {
      return new WebViewAssetLoaderExt.PathHandlerExtChannelDelegate.HandleCallback().decodeResult(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt.PathHandlerExtChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */