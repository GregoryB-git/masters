package V3;

import A2.n;
import R3.i;
import T3.h.a;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import s3.m;

public abstract class f
{
  public c4.d a;
  public j b;
  public A c;
  public A d;
  public r e;
  public String f;
  public List g;
  public String h;
  public c4.d.a i = c4.d.a.p;
  public boolean j;
  public long k = 10485760L;
  public s3.e l;
  public X3.e m;
  public boolean n = false;
  public boolean o = false;
  public l p;
  
  public static T3.d H(A paramA, ScheduledExecutorService paramScheduledExecutorService)
  {
    return new d(paramA, paramScheduledExecutorService);
  }
  
  public final void A()
  {
    try
    {
      i locali = new R3/i;
      locali.<init>(l);
      p = locali;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean B()
  {
    return n;
  }
  
  public boolean C()
  {
    return j;
  }
  
  public T3.h E(T3.f paramf, h.a parama)
  {
    return u().d(this, n(), paramf, parama);
  }
  
  public void F()
  {
    if (o)
    {
      G();
      o = false;
    }
  }
  
  public final void G()
  {
    b.a();
    e.a();
  }
  
  public void b()
  {
    if (!B()) {
      return;
    }
    throw new Q3.d("Modifications to DatabaseConfig objects must occur before they are in use");
  }
  
  public final String c(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Firebase/");
    localStringBuilder.append("5");
    localStringBuilder.append("/");
    localStringBuilder.append(Q3.h.g());
    localStringBuilder.append("/");
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  public final void d()
  {
    n.j(d, "You must register an appCheckTokenProvider before initializing Context.");
  }
  
  public final void e()
  {
    n.j(c, "You must register an authTokenProvider before initializing Context.");
  }
  
  public final void f()
  {
    if (b == null) {
      b = u().g(this);
    }
  }
  
  public final void g()
  {
    if (a == null) {
      a = u().b(this, i, g);
    }
  }
  
  public final void h()
  {
    if (e == null) {
      e = p.a(this);
    }
  }
  
  public final void i()
  {
    if (f == null) {
      f = "default";
    }
  }
  
  public final void j()
  {
    if (h == null) {
      h = c(u().e(this));
    }
  }
  
  /* Error */
  public void k()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	V3/f:n	Z
    //   6: ifne +19 -> 25
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 50	V3/f:n	Z
    //   14: aload_0
    //   15: invokevirtual 187	V3/f:z	()V
    //   18: goto +7 -> 25
    //   21: astore_1
    //   22: goto +6 -> 28
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	f
    //   21	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	18	21	finally
  }
  
  public A l()
  {
    return d;
  }
  
  public A m()
  {
    return c;
  }
  
  public T3.c n()
  {
    return new T3.c(r(), H(m(), p()), H(l(), p()), p(), C(), Q3.h.g(), y(), l.r().c(), w().getAbsolutePath());
  }
  
  public j o()
  {
    return b;
  }
  
  public final ScheduledExecutorService p()
  {
    r localr = v();
    if ((localr instanceof Y3.c)) {
      return ((Y3.c)localr).d();
    }
    throw new RuntimeException("Custom run loops are not supported!");
  }
  
  public c4.c q(String paramString)
  {
    return new c4.c(a, paramString);
  }
  
  public c4.d r()
  {
    return a;
  }
  
  public long s()
  {
    return k;
  }
  
  public X3.e t(String paramString)
  {
    X3.e locale = m;
    if (locale != null) {
      return locale;
    }
    if (j)
    {
      paramString = p.f(this, paramString);
      if (paramString != null) {
        return paramString;
      }
      throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }
    return new X3.d();
  }
  
  public final l u()
  {
    if (p == null) {
      A();
    }
    return p;
  }
  
  public r v()
  {
    return e;
  }
  
  public File w()
  {
    return u().c();
  }
  
  public String x()
  {
    return f;
  }
  
  public String y()
  {
    return h;
  }
  
  public final void z()
  {
    g();
    u();
    j();
    f();
    h();
    i();
    e();
    d();
  }
  
  public class a
    implements A.a
  {
    public a(T3.d.a parama) {}
    
    public void a(String paramString)
    {
      execute(new e(b, paramString));
    }
  }
}

/* Location:
 * Qualified Name:     V3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */