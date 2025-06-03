package d2;

import android.webkit.WebMessagePort;
import c2.j;
import c2.k;
import c2.k.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import zc.a.a;

public final class f0
  extends k
{
  public WebMessagePort a;
  public WebMessagePortBoundaryInterface b;
  
  public f0(WebMessagePort paramWebMessagePort)
  {
    a = paramWebMessagePort;
  }
  
  public f0(InvocationHandler paramInvocationHandler)
  {
    b = ((WebMessagePortBoundaryInterface)zc.a.a(WebMessagePortBoundaryInterface.class, paramInvocationHandler));
  }
  
  public final void a()
  {
    i0.t.getClass();
    c.a(g());
  }
  
  public final WebMessagePort b()
  {
    return g();
  }
  
  public final InvocationHandler c()
  {
    return Proxy.getInvocationHandler(f());
  }
  
  public final void d(j paramj)
  {
    a.b localb = i0.s;
    localb.getClass();
    if (d == 0)
    {
      c.h(g(), c.b(paramj));
    }
    else
    {
      if (!localb.d()) {
        break label107;
      }
      int i = d;
      int j = 1;
      int k = j;
      if (i != 0) {
        if ((i == 1) && (i0.u.d())) {
          k = j;
        } else {
          k = 0;
        }
      }
      if (k == 0) {
        break label107;
      }
      f().postMessage(new a.a(new b0(paramj)));
    }
    return;
    label107:
    throw i0.a();
  }
  
  public final void e(k.a parama)
  {
    if (i0.v.d()) {
      f().setWebMessageCallback(new a.a(new c0(parama)));
    } else {
      c.l(g(), parama);
    }
  }
  
  public final WebMessagePortBoundaryInterface f()
  {
    if (b == null)
    {
      h0 localh0 = j0.a.a;
      WebMessagePort localWebMessagePort = a;
      b = ((WebMessagePortBoundaryInterface)zc.a.a(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)b).convertWebMessagePort(localWebMessagePort)));
    }
    return b;
  }
  
  public final WebMessagePort g()
  {
    if (a == null)
    {
      h0 localh0 = j0.a.a;
      InvocationHandler localInvocationHandler = Proxy.getInvocationHandler(b);
      a = ((WebMessagePort)((WebkitToCompatConverterBoundaryInterface)b).convertWebMessagePort(localInvocationHandler));
    }
    return a;
  }
}

/* Location:
 * Qualified Name:     d2.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */