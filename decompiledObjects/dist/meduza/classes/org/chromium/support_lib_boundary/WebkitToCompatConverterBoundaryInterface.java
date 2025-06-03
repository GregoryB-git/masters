package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;

public abstract interface WebkitToCompatConverterBoundaryInterface
{
  public abstract InvocationHandler convertCookieManager(Object paramObject);
  
  public abstract Object convertSafeBrowsingResponse(InvocationHandler paramInvocationHandler);
  
  public abstract InvocationHandler convertSafeBrowsingResponse(Object paramObject);
  
  public abstract Object convertServiceWorkerSettings(InvocationHandler paramInvocationHandler);
  
  public abstract InvocationHandler convertServiceWorkerSettings(Object paramObject);
  
  public abstract InvocationHandler convertSettings(WebSettings paramWebSettings);
  
  public abstract Object convertWebMessagePort(InvocationHandler paramInvocationHandler);
  
  public abstract InvocationHandler convertWebMessagePort(Object paramObject);
  
  public abstract Object convertWebResourceError(InvocationHandler paramInvocationHandler);
  
  public abstract InvocationHandler convertWebResourceError(Object paramObject);
  
  public abstract InvocationHandler convertWebResourceRequest(WebResourceRequest paramWebResourceRequest);
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */