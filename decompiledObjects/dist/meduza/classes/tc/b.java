package tc;

import java.util.concurrent.Executor;
import nc.a0;
import nc.b1;
import sc.v;
import ub.i;

public final class b
  extends b1
  implements Executor
{
  public static final b c = new b();
  public static final a0 d;
  
  static
  {
    Object localObject = k.c;
    int i = v.a;
    if (64 >= i) {
      i = 64;
    }
    i = x6.b.w0("kotlinx.coroutines.io.parallelism", i, 0, 0, 12);
    localObject.getClass();
    x6.b.C(i);
    if (i < j.d)
    {
      x6.b.C(i);
      localObject = new sc.h((k)localObject, i);
    }
    d = (a0)localObject;
  }
  
  public final void A0(ub.h paramh, Runnable paramRunnable)
  {
    d.A0(paramh, paramRunnable);
  }
  
  public final void close()
  {
    throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
  }
  
  public final void execute(Runnable paramRunnable)
  {
    z0(i.a, paramRunnable);
  }
  
  public final String toString()
  {
    return "Dispatchers.IO";
  }
  
  public final void z0(ub.h paramh, Runnable paramRunnable)
  {
    d.z0(paramh, paramRunnable);
  }
}

/* Location:
 * Qualified Name:     tc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */