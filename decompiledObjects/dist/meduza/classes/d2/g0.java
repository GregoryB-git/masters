package d2;

import android.webkit.WebResourceError;
import c2.l;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import zc.a;

public final class g0
  extends l
{
  public WebResourceError a;
  public WebResourceErrorBoundaryInterface b;
  
  public g0(WebResourceError paramWebResourceError)
  {
    a = paramWebResourceError;
  }
  
  public g0(InvocationHandler paramInvocationHandler)
  {
    b = ((WebResourceErrorBoundaryInterface)a.a(WebResourceErrorBoundaryInterface.class, paramInvocationHandler));
  }
}

/* Location:
 * Qualified Name:     d2.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */