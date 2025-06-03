package gb;

import eb.h1;
import eb.k0.e;
import eb.k0.f;
import eb.k0.g;
import eb.k0.i;
import eb.k0.j;
import java.util.concurrent.atomic.AtomicBoolean;
import x6.b;

public final class q2$d
  extends k0.j
{
  public final k0.i a;
  public final AtomicBoolean b = new AtomicBoolean(false);
  
  public q2$d(q2 paramq2, k0.i parami)
  {
    b.y(parami, "subchannel");
    a = parami;
  }
  
  public final k0.f a(k0.g paramg)
  {
    if (b.compareAndSet(false, true)) {
      c.f.d().execute(new a());
    }
    return k0.f.e;
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      a.f();
    }
  }
}

/* Location:
 * Qualified Name:     gb.q2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */