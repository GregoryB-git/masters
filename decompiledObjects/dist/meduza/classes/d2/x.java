package d2;

import android.webkit.ServiceWorkerController;
import c2.g;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

public final class x
  extends g
{
  public ServiceWorkerController a;
  public ServiceWorkerControllerBoundaryInterface b;
  public final y c;
  
  public x()
  {
    Object localObject = i0.h;
    if (((a.c)localObject).c())
    {
      localObject = d.g();
      a = ((ServiceWorkerController)localObject);
      b = null;
      if (localObject == null) {
        a = d.g();
      }
      c = d.i(a);
    }
    else
    {
      if (!((a)localObject).d()) {
        break label98;
      }
      a = null;
      localObject = j0.b.a.getServiceWorkerController();
      b = ((ServiceWorkerControllerBoundaryInterface)localObject);
      c = new y(((ServiceWorkerControllerBoundaryInterface)localObject).getServiceWorkerWebSettings());
    }
    return;
    label98:
    throw i0.a();
  }
}

/* Location:
 * Qualified Name:     d2.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */