package p0;

import android.os.Handler;
import g0.M;
import g0.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import x0.x.b;

public abstract interface v
{
  public abstract void M(int paramInt1, x.b paramb, int paramInt2);
  
  public abstract void S(int paramInt, x.b paramb);
  
  public abstract void T(int paramInt, x.b paramb);
  
  public abstract void b0(int paramInt, x.b paramb);
  
  public abstract void d0(int paramInt, x.b paramb, Exception paramException);
  
  public abstract void g0(int paramInt, x.b paramb);
  
  public abstract void l0(int paramInt, x.b paramb);
  
  public static class a
  {
    public final int a;
    public final x.b b;
    public final CopyOnWriteArrayList c;
    
    public a()
    {
      this(new CopyOnWriteArrayList(), 0, null);
    }
    
    public a(CopyOnWriteArrayList paramCopyOnWriteArrayList, int paramInt, x.b paramb)
    {
      c = paramCopyOnWriteArrayList;
      a = paramInt;
      b = paramb;
    }
    
    public void g(Handler paramHandler, v paramv)
    {
      a.e(paramHandler);
      a.e(paramv);
      c.add(new a(paramHandler, paramv));
    }
    
    public void h()
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        v localv = b;
        M.S0(a, new u(this, localv));
      }
    }
    
    public void i()
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        v localv = b;
        M.S0(a, new s(this, localv));
      }
    }
    
    public void j()
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        v localv = b;
        M.S0(a, new t(this, localv));
      }
    }
    
    public void k(int paramInt)
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        v localv = b;
        M.S0(a, new q(this, localv, paramInt));
      }
    }
    
    public void l(Exception paramException)
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        v localv = b;
        M.S0(a, new p(this, localv, paramException));
      }
    }
    
    public void m()
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        v localv = b;
        M.S0(a, new r(this, localv));
      }
    }
    
    public void t(v paramv)
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (b == paramv) {
          c.remove(locala);
        }
      }
    }
    
    public a u(int paramInt, x.b paramb)
    {
      return new a(c, paramInt, paramb);
    }
    
    public static final class a
    {
      public Handler a;
      public v b;
      
      public a(Handler paramHandler, v paramv)
      {
        a = paramHandler;
        b = paramv;
      }
    }
  }
}

/* Location:
 * Qualified Name:     p0.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */