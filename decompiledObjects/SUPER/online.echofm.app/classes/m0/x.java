package m0;

import android.os.Handler;
import g0.a;

public abstract interface x
{
  public abstract void A(k0.o paramo);
  
  public abstract void a(z.a parama);
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void d(Exception paramException);
  
  public abstract void e(z.a parama);
  
  public abstract void f(k0.o paramo);
  
  public abstract void l(long paramLong);
  
  public abstract void p(Exception paramException);
  
  public abstract void s(String paramString);
  
  public abstract void t(String paramString, long paramLong1, long paramLong2);
  
  public abstract void v(int paramInt, long paramLong1, long paramLong2);
  
  public abstract void z(d0.q paramq, k0.p paramp);
  
  public static final class a
  {
    public final Handler a;
    public final x b;
    
    public a(Handler paramHandler, x paramx)
    {
      if (paramx != null) {
        paramHandler = (Handler)a.e(paramHandler);
      } else {
        paramHandler = null;
      }
      a = paramHandler;
      b = paramx;
    }
    
    public void H(long paramLong)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new u(this, paramLong));
      }
    }
    
    public void I(boolean paramBoolean)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new w(this, paramBoolean));
      }
    }
    
    public void J(int paramInt, long paramLong1, long paramLong2)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new v(this, paramInt, paramLong1, paramLong2));
      }
    }
    
    public void m(Exception paramException)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new o(this, paramException));
      }
    }
    
    public void n(Exception paramException)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new p(this, paramException));
      }
    }
    
    public void o(z.a parama)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new m(this, parama));
      }
    }
    
    public void p(z.a parama)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new n(this, parama));
      }
    }
    
    public void q(String paramString, long paramLong1, long paramLong2)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new r(this, paramString, paramLong1, paramLong2));
      }
    }
    
    public void r(String paramString)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new s(this, paramString));
      }
    }
    
    public void s(k0.o paramo)
    {
      paramo.c();
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new t(this, paramo));
      }
    }
    
    public void t(k0.o paramo)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new l(this, paramo));
      }
    }
    
    public void u(d0.q paramq, k0.p paramp)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new q(this, paramq, paramp));
      }
    }
  }
}

/* Location:
 * Qualified Name:     m0.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */