package l0;

import W2.k;
import android.util.SparseArray;
import d0.B;
import d0.C;
import d0.D;
import d0.D.b;
import d0.D.e;
import d0.I;
import d0.K;
import d0.L;
import d0.P;
import d0.l;
import d0.q;
import d0.w;
import d0.x;
import g0.a;
import java.io.IOException;
import java.util.List;
import k0.o;
import m0.z.a;
import x0.r;
import x0.x.b;

public abstract interface c
{
  public abstract void A(a parama, Exception paramException);
  
  public abstract void B(a parama, o paramo);
  
  public abstract void C(a parama, B paramB);
  
  public abstract void D(a parama, String paramString);
  
  public abstract void E(a parama, int paramInt);
  
  public abstract void F(a parama, d0.u paramu, int paramInt);
  
  public abstract void G(a parama, boolean paramBoolean, int paramInt);
  
  public abstract void H(a parama, boolean paramBoolean, int paramInt);
  
  public abstract void I(a parama, String paramString);
  
  public abstract void J(a parama, r paramr, x0.u paramu);
  
  public abstract void K(a parama, x0.u paramu);
  
  public abstract void L(a parama, B paramB);
  
  public abstract void M(a parama, D.b paramb);
  
  public abstract void N(a parama, x0.u paramu);
  
  public abstract void O(D paramD, b paramb);
  
  public abstract void P(a parama);
  
  public abstract void Q(a parama, String paramString, long paramLong);
  
  public abstract void R(a parama, l paraml);
  
  public abstract void S(a parama, int paramInt);
  
  public abstract void T(a parama, P paramP);
  
  public abstract void V(a parama, f0.b paramb);
  
  public abstract void W(a parama, q paramq, k0.p paramp);
  
  public abstract void X(a parama, int paramInt, long paramLong1, long paramLong2);
  
  public abstract void Y(a parama);
  
  public abstract void Z(a parama, int paramInt);
  
  public abstract void a(a parama, int paramInt, long paramLong);
  
  public abstract void a0(a parama);
  
  public abstract void b(a parama);
  
  public abstract void c(a parama, int paramInt, boolean paramBoolean);
  
  public abstract void c0(a parama, long paramLong);
  
  public abstract void d(a parama, boolean paramBoolean);
  
  public abstract void d0(a parama, Exception paramException);
  
  public abstract void e(a parama, Exception paramException);
  
  public abstract void e0(a parama, L paramL);
  
  public abstract void f0(a parama, long paramLong, int paramInt);
  
  public abstract void g(a parama, o paramo);
  
  public abstract void g0(a parama, z.a parama1);
  
  public abstract void h(a parama, int paramInt1, int paramInt2);
  
  public abstract void h0(a parama, q paramq, k0.p paramp);
  
  public abstract void i(a parama, r paramr, x0.u paramu);
  
  public abstract void i0(a parama, boolean paramBoolean);
  
  public abstract void j(a parama, boolean paramBoolean);
  
  public abstract void j0(a parama, int paramInt1, int paramInt2, int paramInt3, float paramFloat);
  
  public abstract void k(a parama, float paramFloat);
  
  public abstract void k0(a parama, D.e parame1, D.e parame2, int paramInt);
  
  public abstract void l(a parama, o paramo);
  
  public abstract void l0(a parama, boolean paramBoolean);
  
  public abstract void m(a parama, r paramr, x0.u paramu, IOException paramIOException, boolean paramBoolean);
  
  public abstract void m0(a parama, Exception paramException);
  
  public abstract void n(a parama);
  
  public abstract void n0(a parama, int paramInt);
  
  public abstract void o(a parama, x paramx);
  
  public abstract void o0(a parama, o paramo);
  
  public abstract void p(a parama, d0.b paramb);
  
  public abstract void q(a parama, r paramr, x0.u paramu);
  
  public abstract void q0(a parama, w paramw);
  
  public abstract void r(a parama, K paramK);
  
  public abstract void r0(a parama);
  
  public abstract void s(a parama);
  
  public abstract void s0(a parama, List paramList);
  
  public abstract void t(a parama, Object paramObject, long paramLong);
  
  public abstract void t0(a parama, boolean paramBoolean);
  
  public abstract void u(a parama, String paramString, long paramLong);
  
  public abstract void u0(a parama, int paramInt, long paramLong1, long paramLong2);
  
  public abstract void v(a parama, String paramString, long paramLong1, long paramLong2);
  
  public abstract void v0(a parama, C paramC);
  
  public abstract void w(a parama, z.a parama1);
  
  public abstract void x(a parama, int paramInt);
  
  public abstract void y(a parama, int paramInt);
  
  public abstract void z(a parama, String paramString, long paramLong1, long paramLong2);
  
  public static final class a
  {
    public final long a;
    public final I b;
    public final int c;
    public final x.b d;
    public final long e;
    public final I f;
    public final int g;
    public final x.b h;
    public final long i;
    public final long j;
    
    public a(long paramLong1, I paramI1, int paramInt1, x.b paramb1, long paramLong2, I paramI2, int paramInt2, x.b paramb2, long paramLong3, long paramLong4)
    {
      a = paramLong1;
      b = paramI1;
      c = paramInt1;
      d = paramb1;
      e = paramLong2;
      f = paramI2;
      g = paramInt2;
      h = paramb2;
      i = paramLong3;
      j = paramLong4;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (a.class == paramObject.getClass()))
      {
        paramObject = (a)paramObject;
        if ((a != a) || (c != c) || (e != e) || (g != g) || (i != i) || (j != j) || (!k.a(b, b)) || (!k.a(d, d)) || (!k.a(f, f)) || (!k.a(h, h))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return k.b(new Object[] { Long.valueOf(a), b, Integer.valueOf(c), d, Long.valueOf(e), f, Integer.valueOf(g), h, Long.valueOf(i), Long.valueOf(j) });
    }
  }
  
  public static final class b
  {
    public final d0.p a;
    public final SparseArray b;
    
    public b(d0.p paramp, SparseArray paramSparseArray)
    {
      a = paramp;
      SparseArray localSparseArray = new SparseArray(paramp.c());
      for (int i = 0; i < paramp.c(); i++)
      {
        int j = paramp.b(i);
        localSparseArray.append(j, (c.a)a.e((c.a)paramSparseArray.get(j)));
      }
      b = localSparseArray;
    }
    
    public boolean a(int paramInt)
    {
      return a.a(paramInt);
    }
    
    public int b(int paramInt)
    {
      return a.b(paramInt);
    }
    
    public c.a c(int paramInt)
    {
      return (c.a)a.e((c.a)b.get(paramInt));
    }
    
    public int d()
    {
      return a.c();
    }
  }
}

/* Location:
 * Qualified Name:     l0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */