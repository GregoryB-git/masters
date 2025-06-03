package d2;

import c2.k.a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import zc.a;

public final class c0
  implements WebMessageCallbackBoundaryInterface
{
  public final k.a a;
  
  public c0(k.a parama)
  {
    a = parama;
  }
  
  public final String[] getSupportedFeatures()
  {
    return new String[] { "WEB_MESSAGE_CALLBACK_ON_MESSAGE" };
  }
  
  public final void onMessage(InvocationHandler paramInvocationHandler1, InvocationHandler paramInvocationHandler2)
  {
    paramInvocationHandler2 = b0.a((WebMessageBoundaryInterface)a.a(WebMessageBoundaryInterface.class, paramInvocationHandler2));
    if (paramInvocationHandler2 != null) {
      a.onMessage(new f0(paramInvocationHandler1), paramInvocationHandler2);
    }
  }
}

/* Location:
 * Qualified Name:     d2.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */