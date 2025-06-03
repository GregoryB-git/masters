package z4;

import a4.g;
import android.os.Handler;
import t5.b;
import t5.l0;
import v3.o0;
import v3.r1;
import w3.a0;

public abstract interface t
{
  public abstract void a(c paramc);
  
  public abstract void b(c paramc);
  
  public abstract void c(g paramg);
  
  public abstract void d(Handler paramHandler, g paramg);
  
  public abstract void e(c paramc, l0 paraml0, a0 parama0);
  
  public abstract o0 f();
  
  public abstract void g(r paramr);
  
  public abstract void h();
  
  public abstract boolean i();
  
  public abstract r1 j();
  
  public abstract void l(c paramc);
  
  public abstract void m(w paramw);
  
  public abstract void n(Handler paramHandler, w paramw);
  
  public abstract r o(b paramb, b paramb1, long paramLong);
  
  public static abstract interface a {}
  
  public static final class b
    extends s
  {
    public b(Object paramObject)
    {
      super(-1L);
    }
    
    public b(Object paramObject, int paramInt1, int paramInt2, long paramLong)
    {
      super(paramInt1, paramInt2, paramLong, -1);
    }
    
    public b(Object paramObject, int paramInt, long paramLong)
    {
      super(-1, -1, paramLong, paramInt);
    }
    
    public b(Object paramObject, long paramLong)
    {
      super(paramLong);
    }
    
    public b(s params)
    {
      super();
    }
    
    public final b b(Object paramObject)
    {
      if (a.equals(paramObject)) {
        paramObject = this;
      } else {
        paramObject = new s(paramObject, b, c, d, e);
      }
      return new b((s)paramObject);
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(t paramt, r1 paramr1);
  }
}

/* Location:
 * Qualified Name:     z4.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */