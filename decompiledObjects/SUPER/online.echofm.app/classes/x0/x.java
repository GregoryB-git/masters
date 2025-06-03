package x0;

import B0.b;
import android.os.Handler;
import d0.I;
import d0.u;
import i0.y;
import l0.y1;

public abstract interface x
{
  public abstract u a();
  
  public abstract void c(E paramE);
  
  public abstract void d(c paramc);
  
  public abstract void e(v paramv);
  
  public abstract v f(b paramb, b paramb1, long paramLong);
  
  public abstract void g(c paramc, y paramy, y1 paramy1);
  
  public abstract void h();
  
  public abstract boolean i();
  
  public abstract I j();
  
  public abstract void k(Handler paramHandler, p0.v paramv);
  
  public abstract void l(u paramu);
  
  public abstract void m(c paramc);
  
  public abstract void n(c paramc);
  
  public abstract void o(p0.v paramv);
  
  public abstract void p(Handler paramHandler, E paramE);
  
  public static abstract interface a {}
  
  public static final class b
  {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    
    public b(Object paramObject)
    {
      this(paramObject, -1L);
    }
    
    public b(Object paramObject, int paramInt1, int paramInt2, long paramLong)
    {
      this(paramObject, paramInt1, paramInt2, paramLong, -1);
    }
    
    public b(Object paramObject, int paramInt1, int paramInt2, long paramLong, int paramInt3)
    {
      a = paramObject;
      b = paramInt1;
      c = paramInt2;
      d = paramLong;
      e = paramInt3;
    }
    
    public b(Object paramObject, long paramLong)
    {
      this(paramObject, -1, -1, paramLong, -1);
    }
    
    public b(Object paramObject, long paramLong, int paramInt)
    {
      this(paramObject, -1, -1, paramLong, paramInt);
    }
    
    public b a(Object paramObject)
    {
      if (a.equals(paramObject)) {
        paramObject = this;
      } else {
        paramObject = new b(paramObject, b, c, d, e);
      }
      return (b)paramObject;
    }
    
    public boolean b()
    {
      boolean bool;
      if (b != -1) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof b)) {
        return false;
      }
      paramObject = (b)paramObject;
      if ((!a.equals(a)) || (b != b) || (c != c) || (d != d) || (e != e)) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      return ((((527 + a.hashCode()) * 31 + b) * 31 + c) * 31 + (int)d) * 31 + e;
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(x paramx, I paramI);
  }
}

/* Location:
 * Qualified Name:     x0.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */