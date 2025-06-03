package a4;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p.s;
import v5.e0;
import x0.d;
import z4.t.b;

public abstract interface g
{
  @Deprecated
  public abstract void B();
  
  public abstract void E(int paramInt, t.b paramb);
  
  public abstract void H(int paramInt, t.b paramb);
  
  public abstract void O(int paramInt, t.b paramb);
  
  public abstract void P(int paramInt, t.b paramb, Exception paramException);
  
  public abstract void U(int paramInt1, t.b paramb, int paramInt2);
  
  public abstract void j0(int paramInt, t.b paramb);
  
  public static final class a
  {
    public final int a;
    public final t.b b;
    public final CopyOnWriteArrayList<a> c;
    
    public a()
    {
      this(new CopyOnWriteArrayList(), 0, null);
    }
    
    public a(CopyOnWriteArrayList<a> paramCopyOnWriteArrayList, int paramInt, t.b paramb)
    {
      c = paramCopyOnWriteArrayList;
      a = paramInt;
      b = paramb;
    }
    
    public final void a()
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        g localg = b;
        e0.M(a, new f(this, localg, 1));
      }
    }
    
    public final void b()
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        g localg = b;
        e0.M(a, new w.g(10, this, localg));
      }
    }
    
    public final void c()
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        g localg = b;
        e0.M(a, new x0.f(10, this, localg));
      }
    }
    
    public final void d(int paramInt)
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        g localg = b;
        e0.M(a, new s(this, localg, paramInt, 3));
      }
    }
    
    public final void e(Exception paramException)
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        g localg = b;
        e0.M(a, new d(this, localg, paramException, 3));
      }
    }
    
    public final void f()
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        g localg = b;
        e0.M(a, new f(this, localg, 0));
      }
    }
    
    public static final class a
    {
      public Handler a;
      public g b;
      
      public a(Handler paramHandler, g paramg)
      {
        a = paramHandler;
        b = paramg;
      }
    }
  }
}

/* Location:
 * Qualified Name:     a4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */