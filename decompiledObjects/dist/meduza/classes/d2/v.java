package d2;

import android.webkit.SafeBrowsingResponse;
import c2.d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public final class v
  extends d
{
  public SafeBrowsingResponse a;
  public SafeBrowsingResponseBoundaryInterface b;
  
  public v(SafeBrowsingResponse paramSafeBrowsingResponse)
  {
    a = paramSafeBrowsingResponse;
  }
  
  public v(InvocationHandler paramInvocationHandler)
  {
    b = ((SafeBrowsingResponseBoundaryInterface)zc.a.a(SafeBrowsingResponseBoundaryInterface.class, paramInvocationHandler));
  }
  
  public final void a(boolean paramBoolean)
  {
    a.f localf = i0.r;
    if (localf.c())
    {
      j.e(c(), paramBoolean);
    }
    else
    {
      if (!localf.d()) {
        break label40;
      }
      b().showInterstitial(paramBoolean);
    }
    return;
    label40:
    throw i0.a();
  }
  
  public final SafeBrowsingResponseBoundaryInterface b()
  {
    if (b == null)
    {
      h0 localh0 = j0.a.a;
      SafeBrowsingResponse localSafeBrowsingResponse = a;
      b = ((SafeBrowsingResponseBoundaryInterface)zc.a.a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface)b).convertSafeBrowsingResponse(localSafeBrowsingResponse)));
    }
    return b;
  }
  
  public final SafeBrowsingResponse c()
  {
    if (a == null)
    {
      h0 localh0 = j0.a.a;
      InvocationHandler localInvocationHandler = Proxy.getInvocationHandler(b);
      a = ((SafeBrowsingResponse)((WebkitToCompatConverterBoundaryInterface)b).convertSafeBrowsingResponse(localInvocationHandler));
    }
    return a;
  }
}

/* Location:
 * Qualified Name:     d2.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */