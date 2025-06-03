package x3;

import android.os.Handler;
import v3.d0.b;
import v3.i0;
import x0.q0;
import z3.e;
import z3.i;

public abstract interface l
{
  public abstract void A(e parame);
  
  public abstract void C(long paramLong1, long paramLong2, String paramString);
  
  public abstract void g(e parame);
  
  public abstract void i(String paramString);
  
  public abstract void o(boolean paramBoolean);
  
  public abstract void p(Exception paramException);
  
  @Deprecated
  public abstract void q();
  
  public abstract void s(long paramLong);
  
  public abstract void t(Exception paramException);
  
  public abstract void u(i0 parami0, i parami);
  
  public abstract void z(int paramInt, long paramLong1, long paramLong2);
  
  public static final class a
  {
    public final Handler a;
    public final l b;
    
    public a(Handler paramHandler, d0.b paramb)
    {
      a = paramHandler;
      b = paramb;
    }
    
    public final void a(e parame)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new q0(5, this, parame));
      }
    }
  }
}

/* Location:
 * Qualified Name:     x3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */