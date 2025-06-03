package u6;

import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.F;
import p6.O;
import p6.S;

public final class m
  extends F
  implements S
{
  public static final AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(m.class, "runningWorkers");
  public final F q;
  public final int r;
  private volatile int runningWorkers;
  public final r t;
  public final Object u;
  
  public m(F paramF, int paramInt)
  {
    q = paramF;
    r = paramInt;
    if ((paramF instanceof S)) {
      paramF = (S)paramF;
    } else {
      paramF = null;
    }
    Object localObject = paramF;
    if (paramF == null) {
      localObject = O.a();
    }
    s = ((S)localObject);
    t = new r(false);
    u = new Object();
  }
  
  public void E(g paramg, Runnable paramRunnable)
  {
    t.a(paramRunnable);
    if ((v.get(this) < r) && (K()))
    {
      paramg = J();
      if (paramg != null)
      {
        paramg = new a(paramg);
        q.E(this, paramg);
      }
    }
  }
  
  public final Runnable J()
  {
    for (;;)
    {
      ??? = (Runnable)t.d();
      if (??? == null) {
        synchronized (u)
        {
          AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = v;
          localAtomicIntegerFieldUpdater.decrementAndGet(this);
          int i = t.c();
          if (i == 0) {
            return null;
          }
          localAtomicIntegerFieldUpdater.incrementAndGet(this);
        }
      }
    }
    return (Runnable)???;
  }
  
  public final boolean K()
  {
    synchronized (u)
    {
      AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = v;
      int i = localAtomicIntegerFieldUpdater.get(this);
      int j = r;
      if (i >= j) {
        return false;
      }
      localAtomicIntegerFieldUpdater.incrementAndGet(this);
      return true;
    }
  }
  
  public final class a
    implements Runnable
  {
    public Runnable o;
    
    public a(Runnable paramRunnable)
    {
      o = paramRunnable;
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: aload_0
      //   3: getfield 22	u6/m$a:o	Ljava/lang/Runnable;
      //   6: invokeinterface 26 1 0
      //   11: goto +11 -> 22
      //   14: astore_2
      //   15: getstatic 31	X5/h:o	LX5/h;
      //   18: aload_2
      //   19: invokestatic 36	p6/H:a	(LX5/g;Ljava/lang/Throwable;)V
      //   22: aload_0
      //   23: getfield 17	u6/m$a:p	Lu6/m;
      //   26: invokestatic 40	u6/m:I	(Lu6/m;)Ljava/lang/Runnable;
      //   29: astore_2
      //   30: aload_2
      //   31: ifnonnull +4 -> 35
      //   34: return
      //   35: aload_0
      //   36: aload_2
      //   37: putfield 22	u6/m$a:o	Ljava/lang/Runnable;
      //   40: iload_1
      //   41: iconst_1
      //   42: iadd
      //   43: istore_3
      //   44: iload_3
      //   45: istore_1
      //   46: iload_3
      //   47: bipush 16
      //   49: if_icmplt -47 -> 2
      //   52: iload_3
      //   53: istore_1
      //   54: aload_0
      //   55: getfield 17	u6/m$a:p	Lu6/m;
      //   58: invokestatic 44	u6/m:H	(Lu6/m;)Lp6/F;
      //   61: aload_0
      //   62: getfield 17	u6/m$a:p	Lu6/m;
      //   65: invokevirtual 50	p6/F:F	(LX5/g;)Z
      //   68: ifeq -66 -> 2
      //   71: aload_0
      //   72: getfield 17	u6/m$a:p	Lu6/m;
      //   75: invokestatic 44	u6/m:H	(Lu6/m;)Lp6/F;
      //   78: aload_0
      //   79: getfield 17	u6/m$a:p	Lu6/m;
      //   82: aload_0
      //   83: invokevirtual 54	p6/F:E	(LX5/g;Ljava/lang/Runnable;)V
      //   86: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	87	0	this	a
      //   1	53	1	i	int
      //   14	5	2	localThrowable	Throwable
      //   29	8	2	localRunnable	Runnable
      //   43	10	3	j	int
      // Exception table:
      //   from	to	target	type
      //   2	11	14	finally
    }
  }
}

/* Location:
 * Qualified Name:     u6.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */