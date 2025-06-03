package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import c2.f;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import java.io.ByteArrayInputStream;
import java.util.Map;

class ServiceWorkerManager$1
  extends f
{
  public ServiceWorkerManager$1(ServiceWorkerManager paramServiceWorkerManager) {}
  
  public WebResourceResponse shouldInterceptRequest(WebResourceRequest paramWebResourceRequest)
  {
    paramWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(paramWebResourceRequest);
    Object localObject1 = this$0.channelDelegate;
    Object localObject2 = null;
    if (localObject1 != null) {
      try
      {
        paramWebResourceRequest = ((ServiceWorkerChannelDelegate)localObject1).shouldInterceptRequest(paramWebResourceRequest);
      }
      catch (InterruptedException paramWebResourceRequest)
      {
        Log.e("ServiceWorkerManager", "", paramWebResourceRequest);
        return null;
      }
    } else {
      paramWebResourceRequest = null;
    }
    if (paramWebResourceRequest != null)
    {
      String str1 = paramWebResourceRequest.getContentType();
      String str2 = paramWebResourceRequest.getContentEncoding();
      byte[] arrayOfByte = paramWebResourceRequest.getData();
      localObject1 = paramWebResourceRequest.getHeaders();
      Integer localInteger = paramWebResourceRequest.getStatusCode();
      String str3 = paramWebResourceRequest.getReasonPhrase();
      paramWebResourceRequest = (WebResourceRequest)localObject2;
      if (arrayOfByte != null) {
        paramWebResourceRequest = new ByteArrayInputStream(arrayOfByte);
      }
      if ((localInteger != null) && (str3 != null)) {
        return new WebResourceResponse(str1, str2, localInteger.intValue(), str3, (Map)localObject1, paramWebResourceRequest);
      }
      return new WebResourceResponse(str1, str2, paramWebResourceRequest);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */