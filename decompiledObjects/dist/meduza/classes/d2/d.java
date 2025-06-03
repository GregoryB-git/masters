package d2;

import a0.e;
import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.io.File;

public final class d
{
  public static boolean a(ServiceWorkerWebSettings paramServiceWorkerWebSettings)
  {
    return paramServiceWorkerWebSettings.getAllowContentAccess();
  }
  
  public static boolean b(ServiceWorkerWebSettings paramServiceWorkerWebSettings)
  {
    return paramServiceWorkerWebSettings.getAllowFileAccess();
  }
  
  public static boolean c(ServiceWorkerWebSettings paramServiceWorkerWebSettings)
  {
    return paramServiceWorkerWebSettings.getBlockNetworkLoads();
  }
  
  public static int d(ServiceWorkerWebSettings paramServiceWorkerWebSettings)
  {
    return paramServiceWorkerWebSettings.getCacheMode();
  }
  
  public static File e(Context paramContext)
  {
    return e.d(paramContext);
  }
  
  public static int f(WebSettings paramWebSettings)
  {
    return b0.f.a(paramWebSettings);
  }
  
  public static ServiceWorkerController g()
  {
    return ServiceWorkerController.getInstance();
  }
  
  public static ServiceWorkerWebSettings h(ServiceWorkerController paramServiceWorkerController)
  {
    return paramServiceWorkerController.getServiceWorkerWebSettings();
  }
  
  public static y i(ServiceWorkerController paramServiceWorkerController)
  {
    return new y(h(paramServiceWorkerController));
  }
  
  public static boolean j(WebResourceRequest paramWebResourceRequest)
  {
    return a0.d.m(paramWebResourceRequest);
  }
  
  public static void k(ServiceWorkerWebSettings paramServiceWorkerWebSettings, boolean paramBoolean)
  {
    paramServiceWorkerWebSettings.setAllowContentAccess(paramBoolean);
  }
  
  public static void l(ServiceWorkerWebSettings paramServiceWorkerWebSettings, boolean paramBoolean)
  {
    paramServiceWorkerWebSettings.setAllowFileAccess(paramBoolean);
  }
  
  public static void m(ServiceWorkerWebSettings paramServiceWorkerWebSettings, boolean paramBoolean)
  {
    paramServiceWorkerWebSettings.setBlockNetworkLoads(paramBoolean);
  }
  
  public static void n(ServiceWorkerWebSettings paramServiceWorkerWebSettings, int paramInt)
  {
    paramServiceWorkerWebSettings.setCacheMode(paramInt);
  }
  
  public static void o(WebSettings paramWebSettings, int paramInt)
  {
    e.i(paramWebSettings, paramInt);
  }
  
  public static void p(ServiceWorkerController paramServiceWorkerController, ServiceWorkerClient paramServiceWorkerClient)
  {
    paramServiceWorkerController.setServiceWorkerClient(paramServiceWorkerClient);
  }
  
  public static void q(ServiceWorkerController paramServiceWorkerController, c2.f paramf)
  {
    paramServiceWorkerController.setServiceWorkerClient(new r(paramf));
  }
}

/* Location:
 * Qualified Name:     d2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */