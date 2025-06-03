package w5;

import android.os.Handler;
import v3.d0.b;
import v3.i0;
import z3.e;
import z3.i;

public abstract interface n
{
  public abstract void a(e parame);
  
  public abstract void b(o paramo);
  
  public abstract void c(String paramString);
  
  public abstract void e(int paramInt, long paramLong);
  
  public abstract void h(i0 parami0, i parami);
  
  public abstract void k(int paramInt, long paramLong);
  
  public abstract void l(Object paramObject, long paramLong);
  
  public abstract void n(e parame);
  
  public abstract void v(Exception paramException);
  
  @Deprecated
  public abstract void x();
  
  public abstract void y(long paramLong1, long paramLong2, String paramString);
  
  public static final class a
  {
    public final Handler a;
    public final n b;
    
    public a(Handler paramHandler, d0.b paramb)
    {
      a = paramHandler;
      b = paramb;
    }
  }
}

/* Location:
 * Qualified Name:     w5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */