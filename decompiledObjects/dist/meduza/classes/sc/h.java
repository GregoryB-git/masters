package sc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nc.a0;
import nc.e2;
import nc.i0;
import nc.l;
import nc.l0;
import nc.t0;

public final class h
  extends a0
  implements l0
{
  public static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers");
  public final a0 c;
  public final int d;
  public final k<Runnable> f;
  public final Object o;
  private volatile int runningWorkers;
  
  public h(tc.k paramk, int paramInt)
  {
    c = paramk;
    d = paramInt;
    if ((paramk instanceof l0)) {
      paramk = (l0)paramk;
    } else {
      paramk = null;
    }
    Object localObject = paramk;
    if (paramk == null) {
      localObject = i0.a;
    }
    e = ((l0)localObject);
    f = new k();
    o = new Object();
  }
  
  public final void A0(ub.h arg1, Runnable paramRunnable)
  {
    f.a(paramRunnable);
    paramRunnable = p;
    if (paramRunnable.get(this) < d) {
      synchronized (o)
      {
        int i;
        if (paramRunnable.get(this) >= d)
        {
          i = 0;
        }
        else
        {
          paramRunnable.incrementAndGet(this);
          i = 1;
        }
        if (i != 0)
        {
          ??? = C0();
          if (??? != null)
          {
            ??? = new a(???);
            c.A0(this, ???);
          }
        }
      }
    }
  }
  
  public final Runnable C0()
  {
    for (;;)
    {
      ??? = (Runnable)f.d();
      if (??? == null) {
        synchronized (o)
        {
          AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = p;
          localAtomicIntegerFieldUpdater.decrementAndGet(this);
          int i = f.c();
          if (i == 0) {
            return null;
          }
          localAtomicIntegerFieldUpdater.incrementAndGet(this);
        }
      }
    }
    return (Runnable)???;
  }
  
  public final void f(long paramLong, l paraml)
  {
    e.f(paramLong, paraml);
  }
  
  public final t0 q0(long paramLong, e2 parame2, ub.h paramh)
  {
    return e.q0(paramLong, parame2, paramh);
  }
  
  public final void z0(ub.h arg1, Runnable paramRunnable)
  {
    f.a(paramRunnable);
    paramRunnable = p;
    if (paramRunnable.get(this) < d) {
      synchronized (o)
      {
        int i;
        if (paramRunnable.get(this) >= d)
        {
          i = 0;
        }
        else
        {
          paramRunnable.incrementAndGet(this);
          i = 1;
        }
        if (i != 0)
        {
          ??? = C0();
          if (??? != null)
          {
            ??? = new a(???);
            c.z0(this, ???);
          }
        }
      }
    }
  }
  
  public final class a
    implements Runnable
  {
    public Runnable a;
    
    public a()
    {
      Runnable localRunnable;
      a = localRunnable;
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_1
      //   2: aload_0
      //   3: getfield 21	sc/h$a:a	Ljava/lang/Runnable;
      //   6: invokeinterface 27 1 0
      //   11: goto +11 -> 22
      //   14: astore_2
      //   15: getstatic 32	ub/i:a	Lub/i;
      //   18: aload_2
      //   19: invokestatic 37	nc/c0:a	(Lub/h;Ljava/lang/Throwable;)V
      //   22: aload_0
      //   23: getfield 16	sc/h$a:b	Lsc/h;
      //   26: invokevirtual 41	sc/h:C0	()Ljava/lang/Runnable;
      //   29: astore_2
      //   30: aload_2
      //   31: ifnonnull +4 -> 35
      //   34: return
      //   35: aload_0
      //   36: aload_2
      //   37: putfield 21	sc/h$a:a	Ljava/lang/Runnable;
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
      //   55: getfield 16	sc/h$a:b	Lsc/h;
      //   58: getfield 45	sc/h:c	Lnc/a0;
      //   61: invokevirtual 51	nc/a0:B0	()Z
      //   64: ifeq -62 -> 2
      //   67: aload_0
      //   68: getfield 16	sc/h$a:b	Lsc/h;
      //   71: astore_2
      //   72: aload_2
      //   73: getfield 45	sc/h:c	Lnc/a0;
      //   76: aload_2
      //   77: aload_0
      //   78: invokevirtual 55	nc/a0:z0	(Lub/h;Ljava/lang/Runnable;)V
      //   81: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	82	0	this	a
      //   1	53	1	i	int
      //   14	5	2	localThrowable	Throwable
      //   29	48	2	localObject	Object
      //   43	10	3	j	int
      // Exception table:
      //   from	to	target	type
      //   2	11	14	finally
    }
  }
}

/* Location:
 * Qualified Name:     sc.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */