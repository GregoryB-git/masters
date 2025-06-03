package d2;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public abstract interface k0
{
  public abstract String[] a();
  
  public abstract WebViewProviderBoundaryInterface createWebView(WebView paramWebView);
  
  public abstract ProxyControllerBoundaryInterface getProxyController();
  
  public abstract ServiceWorkerControllerBoundaryInterface getServiceWorkerController();
  
  public abstract StaticsBoundaryInterface getStatics();
  
  public abstract TracingControllerBoundaryInterface getTracingController();
  
  public abstract WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}

/* Location:
 * Qualified Name:     d2.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */