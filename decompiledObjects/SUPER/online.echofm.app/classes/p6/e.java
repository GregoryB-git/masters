package p6;

import X5.g;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

public final class e
  extends a
{
  public final Thread r;
  public final a0 s;
  
  public e(g paramg, Thread paramThread, a0 parama0)
  {
    super(paramg, true, true);
    r = paramThread;
    s = parama0;
  }
  
  public void F(Object paramObject)
  {
    if (!Intrinsics.a(Thread.currentThread(), r))
    {
      paramObject = r;
      c.a();
      LockSupport.unpark((Thread)paramObject);
    }
  }
  
  public final Object K0()
  {
    c.a();
    try
    {
      localObject1 = s;
      Object localObject2 = null;
      if (localObject1 != null) {
        a0.N((a0)localObject1, false, 1, null);
      }
    }
    finally
    {
      break label164;
    }
    for (;;)
    {
      try
      {
        if (Thread.interrupted()) {
          break label130;
        }
        localObject1 = s;
        if (localObject1 != null) {
          l = ((a0)localObject1).Q();
        }
      }
      finally
      {
        break label146;
      }
      long l = Long.MAX_VALUE;
      if (f0()) {
        break;
      }
      c.a();
      LockSupport.parkNanos(this, l);
    }
    Object localObject1 = s;
    if (localObject1 != null) {
      a0.I((a0)localObject1, false, 1, null);
    }
    c.a();
    localObject1 = y0.h(b0());
    if ((localObject1 instanceof z)) {
      localObject5 = (z)localObject1;
    }
    if (localObject5 == null) {
      return localObject1;
    }
    throw a;
    label130:
    Object localObject5 = new java/lang/InterruptedException;
    ((InterruptedException)localObject5).<init>();
    I((Throwable)localObject5);
    throw ((Throwable)localObject5);
    label146:
    localObject1 = s;
    if (localObject1 != null) {
      a0.I((a0)localObject1, false, 1, null);
    }
    throw ((Throwable)localObject5);
    label164:
    c.a();
    throw ((Throwable)localObject5);
  }
  
  public boolean g0()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     p6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */