package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;

public class ServiceWorkerChannelDelegate$SyncShouldInterceptRequestCallback
  extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
{
  public WebResourceResponseExt decodeResult(Object paramObject)
  {
    return new ServiceWorkerChannelDelegate.ShouldInterceptRequestCallback().decodeResult(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerChannelDelegate.SyncShouldInterceptRequestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */