package A0;

import B0.e;
import d0.I;
import d0.K;
import d0.b;
import g0.a;
import k0.Y0;
import k0.a1;
import k0.a1.a;
import x0.Z;
import x0.x.b;

public abstract class D
{
  public a a;
  public e b;
  
  public final e b()
  {
    return (e)a.h(b);
  }
  
  public abstract K c();
  
  public abstract a1.a d();
  
  public void e(a parama, e parame)
  {
    a = parama;
    b = parame;
  }
  
  public final void f()
  {
    a locala = a;
    if (locala != null) {
      locala.d();
    }
  }
  
  public final void g(Y0 paramY0)
  {
    a locala = a;
    if (locala != null) {
      locala.a(paramY0);
    }
  }
  
  public abstract boolean h();
  
  public abstract void i(Object paramObject);
  
  public void j()
  {
    a = null;
    b = null;
  }
  
  public abstract E k(a1[] paramArrayOfa1, Z paramZ, x.b paramb, I paramI);
  
  public abstract void l(b paramb);
  
  public abstract void m(K paramK);
  
  public static abstract interface a
  {
    public abstract void a(Y0 paramY0);
    
    public abstract void d();
  }
}

/* Location:
 * Qualified Name:     A0.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */