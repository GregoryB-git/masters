package d2;

import android.webkit.ServiceWorkerWebSettings;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import m.e;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import zc.a;

public final class y
  extends e
{
  public ServiceWorkerWebSettings b;
  public ServiceWorkerWebSettingsBoundaryInterface c;
  
  public y(ServiceWorkerWebSettings paramServiceWorkerWebSettings)
  {
    super(2);
    b = paramServiceWorkerWebSettings;
  }
  
  public y(InvocationHandler paramInvocationHandler)
  {
    super(2);
    c = ((ServiceWorkerWebSettingsBoundaryInterface)a.a(ServiceWorkerWebSettingsBoundaryInterface.class, paramInvocationHandler));
  }
  
  public final ServiceWorkerWebSettingsBoundaryInterface v()
  {
    if (c == null)
    {
      h0 localh0 = j0.a.a;
      ServiceWorkerWebSettings localServiceWorkerWebSettings = b;
      c = ((ServiceWorkerWebSettingsBoundaryInterface)a.a(ServiceWorkerWebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)b).convertServiceWorkerSettings(localServiceWorkerWebSettings)));
    }
    return c;
  }
  
  public final ServiceWorkerWebSettings w()
  {
    if (b == null)
    {
      h0 localh0 = j0.a.a;
      InvocationHandler localInvocationHandler = Proxy.getInvocationHandler(c);
      b = ((ServiceWorkerWebSettings)((WebkitToCompatConverterBoundaryInterface)b).convertServiceWorkerSettings(localInvocationHandler));
    }
    return b;
  }
}

/* Location:
 * Qualified Name:     d2.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */