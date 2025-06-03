package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

public abstract interface WebViewProviderFactoryBoundaryInterface
{
  public abstract InvocationHandler createWebView(WebView paramWebView);
  
  public abstract InvocationHandler getDropDataProvider();
  
  public abstract InvocationHandler getProfileStore();
  
  public abstract InvocationHandler getProxyController();
  
  public abstract InvocationHandler getServiceWorkerController();
  
  public abstract InvocationHandler getStatics();
  
  public abstract String[] getSupportedFeatures();
  
  public abstract InvocationHandler getTracingController();
  
  public abstract InvocationHandler getWebkitToCompatConverter();
}

/* Location:
 * Qualified Name:     org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */