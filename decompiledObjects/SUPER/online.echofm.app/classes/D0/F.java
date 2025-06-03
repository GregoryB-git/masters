package D0;

import android.view.Surface;
import d0.P;
import d0.q;
import g0.A;
import java.util.List;
import java.util.concurrent.Executor;

public abstract interface F
{
  public abstract void A(boolean paramBoolean);
  
  public abstract void B();
  
  public abstract void C(List paramList);
  
  public abstract void D(long paramLong1, long paramLong2);
  
  public abstract boolean E();
  
  public abstract void F(a parama, Executor paramExecutor);
  
  public abstract void G(int paramInt, q paramq);
  
  public abstract void H(q paramq);
  
  public abstract void I(Surface paramSurface, A paramA);
  
  public abstract boolean J();
  
  public abstract void K(boolean paramBoolean);
  
  public abstract void L();
  
  public abstract boolean c();
  
  public abstract boolean e();
  
  public abstract void f(long paramLong1, long paramLong2);
  
  public abstract void j();
  
  public abstract void release();
  
  public abstract void u(float paramFloat);
  
  public abstract void v();
  
  public abstract long w(long paramLong, boolean paramBoolean);
  
  public abstract Surface x();
  
  public abstract void y();
  
  public abstract void z(p paramp);
  
  public static abstract interface a
  {
    public static final a a = new a();
    
    public abstract void a(F paramF);
    
    public abstract void b(F paramF);
    
    public abstract void c(F paramF, P paramP);
    
    public class a
      implements F.a
    {
      public void a(F paramF) {}
      
      public void b(F paramF) {}
      
      public void c(F paramF, P paramP) {}
    }
  }
  
  public static final class b
    extends Exception
  {
    public final q o;
    
    public b(Throwable paramThrowable, q paramq)
    {
      super();
      o = paramq;
    }
  }
}

/* Location:
 * Qualified Name:     D0.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */