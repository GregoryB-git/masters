package w6;

import X5.g;
import X5.h;
import java.util.concurrent.Executor;
import l6.d;
import p6.F;
import p6.g0;
import u6.G;

public final class b
  extends g0
  implements Executor
{
  public static final b r = new b();
  public static final F s = m.q.G(G.g("kotlinx.coroutines.io.parallelism", d.a(64, G.a()), 0, 0, 12, null));
  
  public void E(g paramg, Runnable paramRunnable)
  {
    s.E(paramg, paramRunnable);
  }
  
  public void close()
  {
    throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
  }
  
  public void execute(Runnable paramRunnable)
  {
    E(h.o, paramRunnable);
  }
  
  public String toString()
  {
    return "Dispatchers.IO";
  }
}

/* Location:
 * Qualified Name:     w6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */