package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import d2.a;
import d2.a.c;
import d2.d;
import d2.i0;
import d2.x;
import d2.y;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.Map;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import x6.b;

public class ServiceWorkerChannelDelegate
  extends ChannelDelegateImpl
{
  private ServiceWorkerManager serviceWorkerManager;
  
  public ServiceWorkerChannelDelegate(ServiceWorkerManager paramServiceWorkerManager, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    serviceWorkerManager = paramServiceWorkerManager;
  }
  
  public void dispose()
  {
    super.dispose();
    serviceWorkerManager = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    ServiceWorkerManager.init();
    Object localObject = ServiceWorkerManager.serviceWorkerController;
    if (localObject != null) {
      localObject = c;
    } else {
      localObject = null;
    }
    String str = method;
    str.getClass();
    int i = -1;
    switch (str.hashCode())
    {
    default: 
      break;
    case 1694822198: 
      if (str.equals("getBlockNetworkLoads")) {
        i = 8;
      }
      break;
    case 1594928487: 
      if (str.equals("setAllowFileAccess")) {
        i = 7;
      }
      break;
    case 1203480182: 
      if (str.equals("setAllowContentAccess")) {
        i = 6;
      }
      break;
    case 1083898794: 
      if (str.equals("setBlockNetworkLoads")) {
        i = 5;
      }
      break;
    case 985595395: 
      if (str.equals("setCacheMode")) {
        i = 4;
      }
      break;
    case 674894835: 
      if (str.equals("getAllowFileAccess")) {
        i = 3;
      }
      break;
    case -563397233: 
      if (str.equals("getCacheMode")) {
        i = 2;
      }
      break;
    case -1165005700: 
      if (str.equals("setServiceWorkerClient")) {
        i = 1;
      }
      break;
    case -1332730774: 
      if (str.equals("getAllowContentAccess")) {
        i = 0;
      }
      break;
    }
    boolean bool;
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 8: 
      if ((localObject == null) || (!b.c0("SERVICE_WORKER_BLOCK_NETWORK_LOADS"))) {
        break label955;
      }
      paramMethodCall = i0.l;
      if (paramMethodCall.c())
      {
        bool = d.c(((y)localObject).w());
        break label942;
      }
      if (paramMethodCall.d())
      {
        bool = ((y)localObject).v().getBlockNetworkLoads();
        break label942;
      }
      throw i0.a();
    case 7: 
      if ((localObject != null) && (b.c0("SERVICE_WORKER_FILE_ACCESS")))
      {
        bool = ((Boolean)paramMethodCall.argument("allow")).booleanValue();
        paramMethodCall = i0.k;
        if (paramMethodCall.c()) {
          d.l(((y)localObject).w(), bool);
        } else if (paramMethodCall.d()) {
          ((y)localObject).v().setAllowFileAccess(bool);
        } else {
          throw i0.a();
        }
      }
    case 6: 
      if ((localObject != null) && (b.c0("SERVICE_WORKER_CONTENT_ACCESS")))
      {
        bool = ((Boolean)paramMethodCall.argument("allow")).booleanValue();
        paramMethodCall = i0.j;
        if (paramMethodCall.c()) {
          d.k(((y)localObject).w(), bool);
        } else if (paramMethodCall.d()) {
          ((y)localObject).v().setAllowContentAccess(bool);
        } else {
          throw i0.a();
        }
      }
    case 5: 
      if ((localObject != null) && (b.c0("SERVICE_WORKER_BLOCK_NETWORK_LOADS")))
      {
        bool = ((Boolean)paramMethodCall.argument("flag")).booleanValue();
        paramMethodCall = i0.l;
        if (paramMethodCall.c()) {
          d.m(((y)localObject).w(), bool);
        } else if (paramMethodCall.d()) {
          ((y)localObject).v().setBlockNetworkLoads(bool);
        } else {
          throw i0.a();
        }
      }
    case 4: 
      if ((localObject != null) && (b.c0("SERVICE_WORKER_CACHE_MODE")))
      {
        i = ((Integer)paramMethodCall.argument("mode")).intValue();
        paramMethodCall = i0.i;
        if (paramMethodCall.c()) {
          d.n(((y)localObject).w(), i);
        } else if (paramMethodCall.d()) {
          ((y)localObject).v().setCacheMode(i);
        } else {
          throw i0.a();
        }
      }
    case 3: 
      if ((localObject == null) || (!b.c0("SERVICE_WORKER_FILE_ACCESS"))) {
        break label955;
      }
      paramMethodCall = i0.k;
      if (paramMethodCall.c())
      {
        bool = d.b(((y)localObject).w());
        break label942;
      }
      if (paramMethodCall.d())
      {
        bool = ((y)localObject).v().getAllowFileAccess();
        break label942;
      }
      throw i0.a();
    case 2: 
      if ((localObject != null) && (b.c0("SERVICE_WORKER_CACHE_MODE")))
      {
        paramMethodCall = i0.i;
        if (paramMethodCall.c())
        {
          i = d.d(((y)localObject).w());
        }
        else
        {
          if (!paramMethodCall.d()) {
            break label843;
          }
          i = ((y)localObject).v().getCacheMode();
        }
        paramMethodCall = Integer.valueOf(i);
        break label959;
        throw i0.a();
      }
      paramResult.success(null);
      break;
    case 1: 
      label843:
      if (serviceWorkerManager == null) {
        break label955;
      }
      paramMethodCall = (Boolean)paramMethodCall.argument("isNull");
      serviceWorkerManager.setServiceWorkerClient(paramMethodCall);
      paramMethodCall = Boolean.TRUE;
      break;
    }
    if ((localObject != null) && (b.c0("SERVICE_WORKER_CONTENT_ACCESS")))
    {
      paramMethodCall = i0.j;
      if (paramMethodCall.c())
      {
        bool = d.a(((y)localObject).w());
      }
      else
      {
        if (!paramMethodCall.d()) {
          break label951;
        }
        bool = ((y)localObject).v().getAllowContentAccess();
      }
      label942:
      paramMethodCall = Boolean.valueOf(bool);
      break label959;
      label951:
      throw i0.a();
    }
    else
    {
      label955:
      paramMethodCall = Boolean.FALSE;
    }
    label959:
    paramResult.success(paramMethodCall);
  }
  
  public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt paramWebResourceRequestExt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return null;
    }
    SyncShouldInterceptRequestCallback localSyncShouldInterceptRequestCallback = new SyncShouldInterceptRequestCallback();
    return (WebResourceResponseExt)Util.invokeMethodAndWaitResult(localMethodChannel, "shouldInterceptRequest", paramWebResourceRequestExt.toMap(), localSyncShouldInterceptRequestCallback);
  }
  
  public void shouldInterceptRequest(WebResourceRequestExt paramWebResourceRequestExt, ShouldInterceptRequestCallback paramShouldInterceptRequestCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("shouldInterceptRequest", paramWebResourceRequestExt.toMap(), paramShouldInterceptRequestCallback);
  }
  
  public static class ShouldInterceptRequestCallback
    extends BaseCallbackResultImpl<WebResourceResponseExt>
  {
    public WebResourceResponseExt decodeResult(Object paramObject)
    {
      return WebResourceResponseExt.fromMap((Map)paramObject);
    }
  }
  
  public static class SyncShouldInterceptRequestCallback
    extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
  {
    public WebResourceResponseExt decodeResult(Object paramObject)
    {
      return new ServiceWorkerChannelDelegate.ShouldInterceptRequestCallback().decodeResult(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */