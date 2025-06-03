package hb;

import f;
import gb.e2.b;
import gb.j3;
import ib.i;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class e$c
  implements e2.b
{
  public e$c(e parame) {}
  
  public final e.d a()
  {
    e locale = a;
    boolean bool;
    if (h != Long.MAX_VALUE) {
      bool = true;
    } else {
      bool = false;
    }
    j3 localj31 = c;
    j3 localj32 = d;
    int i = q0.g.c(g);
    Object localObject;
    if (i != 0) {
      if (i == 1) {
        localObject = null;
      }
    }
    for (;;)
    {
      break label127;
      localObject = f.l("Unknown negotiation type: ");
      ((StringBuilder)localObject).append(g.p(g));
      throw new RuntimeException(((StringBuilder)localObject).toString());
      try
      {
        if (e == null) {
          e = SSLContext.getInstance("Default", da).getSocketFactory();
        }
        localObject = e;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        label127:
        throw new RuntimeException("TLS Provider failure", localGeneralSecurityException);
      }
    }
    return new e.d(localj31, localj32, (SSLSocketFactory)localObject, f, k, bool, h, i, j, l, b);
  }
}

/* Location:
 * Qualified Name:     hb.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */