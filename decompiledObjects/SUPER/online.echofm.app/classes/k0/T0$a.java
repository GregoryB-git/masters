package k0;

import android.util.Pair;
import g0.k;
import java.io.IOException;
import p0.v;
import x0.E;
import x0.r;
import x0.u;
import x0.x.b;

public final class T0$a
  implements E, v
{
  public final T0.c a;
  
  public T0$a(T0 paramT0, T0.c paramc)
  {
    a = paramc;
  }
  
  public final Pair G(int paramInt, x.b paramb)
  {
    x.b localb = null;
    if (paramb != null)
    {
      localb = T0.c(a, paramb);
      if (localb == null) {
        return null;
      }
    }
    return Pair.create(Integer.valueOf(T0.d(a, paramInt)), localb);
  }
  
  public void K(int paramInt, x.b paramb, r paramr, u paramu)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new K0(this, paramb, paramr, paramu));
    }
  }
  
  public void M(int paramInt1, x.b paramb, int paramInt2)
  {
    paramb = G(paramInt1, paramb);
    if (paramb != null) {
      T0.b(b).j(new Q0(this, paramb, paramInt2));
    }
  }
  
  public void S(int paramInt, x.b paramb)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new J0(this, paramb));
    }
  }
  
  public void T(int paramInt, x.b paramb)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new O0(this, paramb));
    }
  }
  
  public void W(int paramInt, x.b paramb, u paramu)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new L0(this, paramb, paramu));
    }
  }
  
  public void Z(int paramInt, x.b paramb, u paramu)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new H0(this, paramb, paramu));
    }
  }
  
  public void a0(int paramInt, x.b paramb, r paramr, u paramu, IOException paramIOException, boolean paramBoolean)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new R0(this, paramb, paramr, paramu, paramIOException, paramBoolean));
    }
  }
  
  public void d0(int paramInt, x.b paramb, Exception paramException)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new N0(this, paramb, paramException));
    }
  }
  
  public void g0(int paramInt, x.b paramb)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new S0(this, paramb));
    }
  }
  
  public void l0(int paramInt, x.b paramb)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new I0(this, paramb));
    }
  }
  
  public void m0(int paramInt, x.b paramb, r paramr, u paramu)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new P0(this, paramb, paramr, paramu));
    }
  }
  
  public void p0(int paramInt, x.b paramb, r paramr, u paramu)
  {
    paramb = G(paramInt, paramb);
    if (paramb != null) {
      T0.b(b).j(new M0(this, paramb, paramr, paramu));
    }
  }
}

/* Location:
 * Qualified Name:     k0.T0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */