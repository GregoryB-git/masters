package gb;

import eb.r;
import hb.l;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayDeque;

public final class f
  implements a0
{
  public final k3 a;
  public final g b;
  public final i2 c;
  
  public f(y0 paramy01, y0 paramy02, i2 parami2)
  {
    paramy01 = new k3(paramy01);
    a = paramy01;
    paramy01 = new g(paramy01, paramy02);
    b = paramy01;
    a = paramy01;
    c = parami2;
  }
  
  public final void C(final u2 paramu2)
  {
    k3 localk3 = a;
    paramu2 = (l)paramu2;
    localk3.a(new f(new b(paramu2), new c(paramu2)));
  }
  
  public final void H()
  {
    a.a(new g(new d()));
  }
  
  public final void I(r paramr)
  {
    c.I(paramr);
  }
  
  public final void close()
  {
    c.A = true;
    a.a(new g(new e()));
  }
  
  public final void f(final int paramInt)
  {
    a.a(new g(new a(paramInt)));
  }
  
  public final void g(int paramInt)
  {
    c.b = paramInt;
  }
  
  public final class a
    implements Runnable
  {
    public a(int paramInt) {}
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 19	gb/f$a:b	Lgb/f;
      //   4: getfield 30	gb/f:c	Lgb/i2;
      //   7: invokevirtual 36	gb/i2:isClosed	()Z
      //   10: ifeq +4 -> 14
      //   13: return
      //   14: aload_0
      //   15: getfield 19	gb/f$a:b	Lgb/f;
      //   18: getfield 30	gb/f:c	Lgb/i2;
      //   21: aload_0
      //   22: getfield 21	gb/f$a:a	I
      //   25: invokevirtual 37	gb/i2:f	(I)V
      //   28: goto +25 -> 53
      //   31: astore_1
      //   32: aload_0
      //   33: getfield 19	gb/f$a:b	Lgb/f;
      //   36: getfield 40	gb/f:b	Lgb/g;
      //   39: aload_1
      //   40: invokevirtual 46	gb/g:e	(Ljava/lang/Throwable;)V
      //   43: aload_0
      //   44: getfield 19	gb/f$a:b	Lgb/f;
      //   47: getfield 30	gb/f:c	Lgb/i2;
      //   50: invokevirtual 49	gb/i2:close	()V
      //   53: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	54	0	this	a
      //   31	9	1	localThrowable	Throwable
      // Exception table:
      //   from	to	target	type
      //   14	28	31	finally
    }
  }
  
  public final class b
    implements Runnable
  {
    public b(l paraml) {}
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 19	gb/f$b:b	Lgb/f;
      //   4: getfield 30	gb/f:c	Lgb/i2;
      //   7: aload_0
      //   8: getfield 21	gb/f$b:a	Lgb/u2;
      //   11: invokevirtual 33	gb/i2:C	(Lgb/u2;)V
      //   14: goto +25 -> 39
      //   17: astore_1
      //   18: aload_0
      //   19: getfield 19	gb/f$b:b	Lgb/f;
      //   22: getfield 36	gb/f:b	Lgb/g;
      //   25: aload_1
      //   26: invokevirtual 42	gb/g:e	(Ljava/lang/Throwable;)V
      //   29: aload_0
      //   30: getfield 19	gb/f$b:b	Lgb/f;
      //   33: getfield 30	gb/f:c	Lgb/i2;
      //   36: invokevirtual 45	gb/i2:close	()V
      //   39: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	40	0	this	b
      //   17	9	1	localThrowable	Throwable
      // Exception table:
      //   from	to	target	type
      //   0	14	17	finally
    }
  }
  
  public final class c
    implements Closeable
  {
    public c() {}
    
    public final void close()
    {
      f.this.close();
    }
  }
  
  public final class d
    implements Runnable
  {
    public d() {}
    
    public final void run()
    {
      c.H();
    }
  }
  
  public final class e
    implements Runnable
  {
    public e() {}
    
    public final void run()
    {
      c.close();
    }
  }
  
  public final class f
    extends f.g
    implements Closeable
  {
    public final Closeable d;
    
    public f(f.b paramb, f.c paramc)
    {
      super(paramb);
      d = paramc;
    }
    
    public final void close()
    {
      d.close();
    }
  }
  
  public class g
    implements n3.a
  {
    public final Runnable a;
    public boolean b = false;
    
    public g(Runnable paramRunnable)
    {
      a = paramRunnable;
    }
    
    public final InputStream next()
    {
      if (!b)
      {
        a.run();
        b = true;
      }
      return (InputStream)b.c.poll();
    }
  }
}

/* Location:
 * Qualified Name:     gb.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */