package D0;

import android.os.Handler;
import android.os.SystemClock;
import d0.P;
import d0.q;
import g0.a;
import k0.o;
import k0.p;

public abstract interface E
{
  public abstract void b(P paramP);
  
  public abstract void g(String paramString);
  
  public abstract void h(Object paramObject, long paramLong);
  
  public abstract void i(String paramString, long paramLong1, long paramLong2);
  
  public abstract void n(o paramo);
  
  public abstract void o(o paramo);
  
  public abstract void q(Exception paramException);
  
  public abstract void u(q paramq, p paramp);
  
  public abstract void w(int paramInt, long paramLong);
  
  public abstract void y(long paramLong, int paramInt);
  
  public static final class a
  {
    public final Handler a;
    public final E b;
    
    public a(Handler paramHandler, E paramE)
    {
      if (paramE != null) {
        paramHandler = (Handler)a.e(paramHandler);
      } else {
        paramHandler = null;
      }
      a = paramHandler;
      b = paramE;
    }
    
    public void A(Object paramObject)
    {
      if (a != null)
      {
        long l = SystemClock.elapsedRealtime();
        a.post(new x(this, paramObject, l));
      }
    }
    
    public void B(long paramLong, int paramInt)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new y(this, paramLong, paramInt));
      }
    }
    
    public void C(Exception paramException)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new z(this, paramException));
      }
    }
    
    public void D(P paramP)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new v(this, paramP));
      }
    }
    
    public void k(String paramString, long paramLong1, long paramLong2)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new u(this, paramString, paramLong1, paramLong2));
      }
    }
    
    public void l(String paramString)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new D(this, paramString));
      }
    }
    
    public void m(o paramo)
    {
      paramo.c();
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new C(this, paramo));
      }
    }
    
    public void n(int paramInt, long paramLong)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new w(this, paramInt, paramLong));
      }
    }
    
    public void o(o paramo)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new A(this, paramo));
      }
    }
    
    public void p(q paramq, p paramp)
    {
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new B(this, paramq, paramp));
      }
    }
  }
}

/* Location:
 * Qualified Name:     D0.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */