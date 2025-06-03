package gb;

import eb.c;
import eb.e;
import eb.e0;
import eb.e1;
import eb.f0;
import eb.n;
import eb.n0;
import eb.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import n7.g;

public final class n2
  extends n0
  implements e0<Object>
{
  static
  {
    Logger.getLogger(n2.class.getName());
  }
  
  public final boolean C(long paramLong, TimeUnit paramTimeUnit)
  {
    throw null;
  }
  
  public final n E()
  {
    return n.d;
  }
  
  public final n0 G()
  {
    e1.n.g("OobChannel.shutdown() called");
    throw null;
  }
  
  public final n0 H()
  {
    e1.n.g("OobChannel.shutdownNow() called");
    throw null;
  }
  
  public final String b()
  {
    return null;
  }
  
  public final f0 f()
  {
    return null;
  }
  
  public final String toString()
  {
    g.b(this);
    throw null;
  }
  
  public final <RequestT, ResponseT> e<RequestT, ResponseT> v(t0<RequestT, ResponseT> paramt0, c paramc)
  {
    Executor localExecutor1 = b;
    Executor localExecutor2 = localExecutor1;
    if (localExecutor1 == null) {
      localExecutor2 = null;
    }
    return new q(paramt0, localExecutor2, paramc, null, null, null);
  }
}

/* Location:
 * Qualified Name:     gb.n2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */