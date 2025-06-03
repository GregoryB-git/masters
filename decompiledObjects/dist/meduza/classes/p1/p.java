package p1;

import b.z;
import dc.a;
import ec.i;
import java.util.concurrent.atomic.AtomicBoolean;
import rb.g;
import t1.b;
import t1.c;
import t1.f;

public abstract class p
{
  public final j a;
  public final AtomicBoolean b;
  public final g c;
  
  public p(j paramj)
  {
    a = paramj;
    b = new AtomicBoolean(false);
    c = z.n(new a(this));
  }
  
  public final f a()
  {
    a.a();
    f localf;
    if (b.compareAndSet(false, true)) {
      localf = (f)c.getValue();
    } else {
      localf = b();
    }
    return localf;
  }
  
  public final f b()
  {
    String str = c();
    j localj = a;
    localj.getClass();
    i.e(str, "sql");
    localj.a();
    localj.b();
    return localj.g().getWritableDatabase().q(str);
  }
  
  public abstract String c();
  
  public final void d(f paramf)
  {
    i.e(paramf, "statement");
    if (paramf == (f)c.getValue()) {
      b.set(false);
    }
  }
  
  public static final class a
    extends ec.j
    implements a<f>
  {
    public a(p paramp)
    {
      super();
    }
    
    public final Object invoke()
    {
      return a.b();
    }
  }
}

/* Location:
 * Qualified Name:     p1.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */