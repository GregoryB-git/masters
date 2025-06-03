package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import c2.f;
import c2.g;
import c2.g.a;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import d2.a;
import d2.a.c;
import d2.d;
import d2.i0;
import d2.j0.b;
import d2.k0;
import d2.q;
import d2.x;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.util.Map;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import x6.b;
import zc.a.a;

public class ServiceWorkerManager
  implements Disposable
{
  public static final String LOG_TAG = "ServiceWorkerManager";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
  public static g serviceWorkerController;
  public ServiceWorkerChannelDelegate channelDelegate;
  public InAppWebViewFlutterPlugin plugin;
  
  public ServiceWorkerManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    plugin = paramInAppWebViewFlutterPlugin;
    channelDelegate = new ServiceWorkerChannelDelegate(this, new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller"));
  }
  
  private f dummyServiceWorkerClientCompat()
  {
    return DummyServiceWorkerClientCompat.INSTANCE;
  }
  
  public static void init()
  {
    if ((serviceWorkerController == null) && (b.c0("SERVICE_WORKER_BASIC_USAGE"))) {
      serviceWorkerController = g.a.a;
    }
  }
  
  public void dispose()
  {
    ServiceWorkerChannelDelegate localServiceWorkerChannelDelegate = channelDelegate;
    if (localServiceWorkerChannelDelegate != null)
    {
      localServiceWorkerChannelDelegate.dispose();
      channelDelegate = null;
    }
    plugin = null;
  }
  
  public void setServiceWorkerClient(Boolean paramBoolean)
  {
    Object localObject = serviceWorkerController;
    if (localObject != null)
    {
      if (paramBoolean.booleanValue()) {
        paramBoolean = dummyServiceWorkerClientCompat();
      } else {
        paramBoolean = new f()
        {
          public WebResourceResponse shouldInterceptRequest(WebResourceRequest paramAnonymousWebResourceRequest)
          {
            paramAnonymousWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(paramAnonymousWebResourceRequest);
            Object localObject1 = channelDelegate;
            Object localObject2 = null;
            if (localObject1 != null) {
              try
              {
                paramAnonymousWebResourceRequest = ((ServiceWorkerChannelDelegate)localObject1).shouldInterceptRequest(paramAnonymousWebResourceRequest);
              }
              catch (InterruptedException paramAnonymousWebResourceRequest)
              {
                Log.e("ServiceWorkerManager", "", paramAnonymousWebResourceRequest);
                return null;
              }
            } else {
              paramAnonymousWebResourceRequest = null;
            }
            if (paramAnonymousWebResourceRequest != null)
            {
              String str1 = paramAnonymousWebResourceRequest.getContentType();
              String str2 = paramAnonymousWebResourceRequest.getContentEncoding();
              byte[] arrayOfByte = paramAnonymousWebResourceRequest.getData();
              localObject1 = paramAnonymousWebResourceRequest.getHeaders();
              Integer localInteger = paramAnonymousWebResourceRequest.getStatusCode();
              String str3 = paramAnonymousWebResourceRequest.getReasonPhrase();
              paramAnonymousWebResourceRequest = (WebResourceRequest)localObject2;
              if (arrayOfByte != null) {
                paramAnonymousWebResourceRequest = new ByteArrayInputStream(arrayOfByte);
              }
              if ((localInteger != null) && (str3 != null)) {
                return new WebResourceResponse(str1, str2, localInteger.intValue(), str3, (Map)localObject1, paramAnonymousWebResourceRequest);
              }
              return new WebResourceResponse(str1, str2, paramAnonymousWebResourceRequest);
            }
            return null;
          }
        };
      }
      x localx = (x)localObject;
      localObject = i0.h;
      if (((a.c)localObject).c())
      {
        if (paramBoolean == null)
        {
          if (a == null) {
            a = d.g();
          }
          d.p(a, null);
        }
        else
        {
          if (a == null) {
            a = d.g();
          }
          d.q(a, paramBoolean);
        }
      }
      else if (((a)localObject).d())
      {
        if (paramBoolean == null)
        {
          if (b == null) {
            b = j0.b.a.getServiceWorkerController();
          }
          b.setServiceWorkerClient(null);
        }
        else
        {
          if (b == null) {
            b = j0.b.a.getServiceWorkerController();
          }
          b.setServiceWorkerClient(new a.a(new q(paramBoolean, 1)));
        }
      }
      else {
        throw i0.a();
      }
    }
  }
  
  public static final class DummyServiceWorkerClientCompat
    extends f
  {
    public static final f INSTANCE = new DummyServiceWorkerClientCompat();
    
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest paramWebResourceRequest)
    {
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */