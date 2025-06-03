package l0;

import X2.w.a;
import android.os.Looper;
import android.util.SparseArray;
import d0.D.b;
import d0.D.c;
import d0.D.e;
import d0.I.b;
import d0.I.c;
import g0.n.a;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;
import m0.z.a;
import x0.x.b;

public class s0
  implements a
{
  public final g0.c a;
  public final I.b b;
  public final I.c c;
  public final a d;
  public final SparseArray e;
  public g0.n f;
  public d0.D g;
  public g0.k h;
  public boolean i;
  
  public s0(g0.c paramc)
  {
    a = ((g0.c)g0.a.e(paramc));
    f = new g0.n(g0.M.U(), paramc, new A());
    paramc = new I.b();
    b = paramc;
    c = new I.c();
    d = new a(paramc);
    e = new SparseArray();
  }
  
  public final void A(k0.o paramo)
  {
    c.a locala = M1();
    c3(locala, 1007, new o0(locala, paramo));
  }
  
  public final void B(int paramInt)
  {
    c.a locala = G1();
    c3(locala, 6, new s(locala, paramInt));
  }
  
  public final void C(boolean paramBoolean, int paramInt)
  {
    c.a locala = G1();
    c3(locala, -1, new l(locala, paramBoolean, paramInt));
  }
  
  public void D(d0.K paramK)
  {
    c.a locala = G1();
    c3(locala, 19, new h0(locala, paramK));
  }
  
  public void E(d0.B paramB)
  {
    c.a locala = N1(paramB);
    c3(locala, 10, new v(locala, paramB));
  }
  
  public final void F(d0.b paramb)
  {
    c.a locala = M1();
    c3(locala, 20, new m(locala, paramb));
  }
  
  public void G(boolean paramBoolean) {}
  
  public final c.a G1()
  {
    return I1(d.d());
  }
  
  public void H(int paramInt) {}
  
  public final c.a H1(d0.I paramI, int paramInt, x.b paramb)
  {
    if (paramI.q()) {
      paramb = null;
    }
    long l1 = a.b();
    int j;
    if ((paramI.equals(g.L())) && (paramInt == g.E())) {
      j = 1;
    } else {
      j = 0;
    }
    long l2 = 0L;
    long l3;
    if ((paramb != null) && (paramb.b()))
    {
      l3 = l2;
      if (j != 0)
      {
        l3 = l2;
        if (g.D() == b)
        {
          l3 = l2;
          if (g.H() == c) {
            l3 = g.P();
          }
        }
      }
    }
    else if (j != 0)
    {
      l3 = g.p();
    }
    else if (paramI.q())
    {
      l3 = l2;
    }
    else
    {
      l3 = paramI.n(paramInt, c).b();
    }
    x.b localb = d.d();
    return new c.a(l1, paramI, paramInt, paramb, l3, g.L(), g.E(), localb, g.P(), g.r());
  }
  
  public void I(d0.w paramw)
  {
    c.a locala = G1();
    c3(locala, 14, new W(locala, paramw));
  }
  
  public final c.a I1(x.b paramb)
  {
    g0.a.e(g);
    d0.I localI;
    if (paramb == null) {
      localI = null;
    } else {
      localI = d.f(paramb);
    }
    if ((paramb != null) && (localI != null)) {
      return H1(localI, ha, b).c, paramb);
    }
    int j = g.E();
    paramb = g.L();
    if (j >= paramb.p()) {
      paramb = d0.I.a;
    }
    return H1(paramb, j, null);
  }
  
  public void J(d0.L paramL)
  {
    c.a locala = G1();
    c3(locala, 2, new o(locala, paramL));
  }
  
  public final c.a J1()
  {
    return I1(d.e());
  }
  
  public final void K(int paramInt, x.b paramb, x0.r paramr, x0.u paramu)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1000, new r0(paramb, paramr, paramu));
  }
  
  public final c.a K1(int paramInt, x.b paramb)
  {
    g0.a.e(g);
    if (paramb != null)
    {
      if (d.f(paramb) != null) {
        paramb = I1(paramb);
      } else {
        paramb = H1(d0.I.a, paramInt, paramb);
      }
      return paramb;
    }
    paramb = g.L();
    if (paramInt >= paramb.p()) {
      paramb = d0.I.a;
    }
    return H1(paramb, paramInt, null);
  }
  
  public final void L(List paramList, x.b paramb)
  {
    d.k(paramList, paramb, (d0.D)g0.a.e(g));
  }
  
  public final c.a L1()
  {
    return I1(d.g());
  }
  
  public final void M(int paramInt1, x.b paramb, int paramInt2)
  {
    paramb = K1(paramInt1, paramb);
    c3(paramb, 1022, new e0(paramb, paramInt2));
  }
  
  public final c.a M1()
  {
    return I1(d.h());
  }
  
  public void N(c paramc)
  {
    g0.a.e(paramc);
    f.c(paramc);
  }
  
  public final c.a N1(d0.B paramB)
  {
    if ((paramB instanceof k0.u))
    {
      paramB = C;
      if (paramB != null) {
        return I1(paramB);
      }
    }
    return G1();
  }
  
  public final void O(d0.u paramu, int paramInt)
  {
    c.a locala = G1();
    c3(locala, 1, new g(locala, paramu, paramInt));
  }
  
  public final void P(d0.I paramI, int paramInt)
  {
    d.l((d0.D)g0.a.e(g));
    paramI = G1();
    c3(paramI, 0, new f(paramI, paramInt));
  }
  
  public final void Q(boolean paramBoolean)
  {
    c.a locala = G1();
    c3(locala, 3, new p0(locala, paramBoolean));
  }
  
  public void R() {}
  
  public final void S(int paramInt, x.b paramb)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1023, new n0(paramb));
  }
  
  public final void T(int paramInt, x.b paramb)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1027, new k0(paramb));
  }
  
  public final void U(float paramFloat)
  {
    c.a locala = M1();
    c3(locala, 22, new i(locala, paramFloat));
  }
  
  public void V(d0.l paraml)
  {
    c.a locala = G1();
    c3(locala, 29, new F(locala, paraml));
  }
  
  public final void W(int paramInt, x.b paramb, x0.u paramu)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1004, new U(paramb, paramu));
  }
  
  public final void X(int paramInt)
  {
    c.a locala = G1();
    c3(locala, 4, new E(locala, paramInt));
  }
  
  public final void Y(boolean paramBoolean, int paramInt)
  {
    c.a locala = G1();
    c3(locala, 5, new x(locala, paramBoolean, paramInt));
  }
  
  public final void Z(int paramInt, x.b paramb, x0.u paramu)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1005, new a0(paramb, paramu));
  }
  
  public void a(z.a parama)
  {
    c.a locala = M1();
    c3(locala, 1031, new i0(locala, parama));
  }
  
  public final void a0(int paramInt, x.b paramb, x0.r paramr, x0.u paramu, IOException paramIOException, boolean paramBoolean)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1003, new c0(paramb, paramr, paramu, paramIOException, paramBoolean));
  }
  
  public final void b(d0.P paramP)
  {
    c.a locala = M1();
    c3(locala, 25, new Y(locala, paramP));
  }
  
  public final void b3()
  {
    c.a locala = G1();
    c3(locala, 1028, new V(locala));
    f.j();
  }
  
  public final void c(boolean paramBoolean)
  {
    c.a locala = M1();
    c3(locala, 23, new h(locala, paramBoolean));
  }
  
  public final void c0(int paramInt, long paramLong1, long paramLong2)
  {
    c.a locala = J1();
    c3(locala, 1006, new b0(locala, paramInt, paramLong1, paramLong2));
  }
  
  public final void c3(c.a parama, int paramInt, n.a parama1)
  {
    e.put(paramInt, parama);
    f.k(paramInt, parama1);
  }
  
  public final void d(Exception paramException)
  {
    c.a locala = M1();
    c3(locala, 1014, new Q(locala, paramException));
  }
  
  public final void d0(int paramInt, x.b paramb, Exception paramException)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1024, new f0(paramb, paramException));
  }
  
  public void e(z.a parama)
  {
    c.a locala = M1();
    c3(locala, 1032, new j0(locala, parama));
  }
  
  public final void e0(d0.B paramB)
  {
    c.a locala = N1(paramB);
    c3(locala, 10, new C(locala, paramB));
  }
  
  public final void f(k0.o paramo)
  {
    c.a locala = L1();
    c3(locala, 1013, new D(locala, paramo));
  }
  
  public final void f0()
  {
    if (!i)
    {
      c.a locala = G1();
      i = true;
      c3(locala, -1, new H(locala));
    }
  }
  
  public final void g(String paramString)
  {
    c.a locala = M1();
    c3(locala, 1019, new t(locala, paramString));
  }
  
  public final void g0(int paramInt, x.b paramb)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1026, new l0(paramb));
  }
  
  public final void h(Object paramObject, long paramLong)
  {
    c.a locala = M1();
    c3(locala, 26, new Z(locala, paramObject, paramLong));
  }
  
  public final void h0(boolean paramBoolean)
  {
    c.a locala = G1();
    c3(locala, 9, new S(locala, paramBoolean));
  }
  
  public final void i(String paramString, long paramLong1, long paramLong2)
  {
    c.a locala = M1();
    c3(locala, 1016, new P(locala, paramString, paramLong2, paramLong1));
  }
  
  public final void i0(int paramInt1, int paramInt2)
  {
    c.a locala = M1();
    c3(locala, 24, new T(locala, paramInt1, paramInt2));
  }
  
  public final void j(d0.C paramC)
  {
    c.a locala = G1();
    c3(locala, 12, new d(locala, paramC));
  }
  
  public void j0(D.b paramb)
  {
    c.a locala = G1();
    c3(locala, 13, new e(locala, paramb));
  }
  
  public void k(List paramList)
  {
    c.a locala = G1();
    c3(locala, 27, new y(locala, paramList));
  }
  
  public final void k0(D.e parame1, D.e parame2, int paramInt)
  {
    if (paramInt == 1) {
      i = false;
    }
    d.j((d0.D)g0.a.e(g));
    c.a locala = G1();
    c3(locala, 11, new J(locala, paramInt, parame1, parame2));
  }
  
  public final void l(long paramLong)
  {
    c.a locala = M1();
    c3(locala, 1010, new p(locala, paramLong));
  }
  
  public final void l0(int paramInt, x.b paramb)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1025, new m0(paramb));
  }
  
  public final void m(int paramInt)
  {
    c.a locala = G1();
    c3(locala, 8, new N(locala, paramInt));
  }
  
  public final void m0(int paramInt, x.b paramb, x0.r paramr, x0.u paramu)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1001, new g0(paramb, paramr, paramu));
  }
  
  public final void n(k0.o paramo)
  {
    c.a locala = M1();
    c3(locala, 1015, new L(locala, paramo));
  }
  
  public void n0(d0.D paramD, D.c paramc) {}
  
  public final void o(k0.o paramo)
  {
    c.a locala = L1();
    c3(locala, 1020, new z(locala, paramo));
  }
  
  public void o0(d0.D paramD, Looper paramLooper)
  {
    boolean bool;
    if ((g != null) && (!a.a(d).isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    g0.a.f(bool);
    g = ((d0.D)g0.a.e(paramD));
    h = a.e(paramLooper, null);
    f = f.e(paramLooper, new k(this, paramD));
  }
  
  public final void p(Exception paramException)
  {
    c.a locala = M1();
    c3(locala, 1029, new O(locala, paramException));
  }
  
  public final void p0(int paramInt, x.b paramb, x0.r paramr, x0.u paramu)
  {
    paramb = K1(paramInt, paramb);
    c3(paramb, 1002, new d0(paramb, paramr, paramu));
  }
  
  public final void q(Exception paramException)
  {
    c.a locala = M1();
    c3(locala, 1030, new j(locala, paramException));
  }
  
  public void q0(int paramInt, boolean paramBoolean)
  {
    c.a locala = G1();
    c3(locala, 30, new w(locala, paramInt, paramBoolean));
  }
  
  public void r(f0.b paramb)
  {
    c.a locala = G1();
    c3(locala, 27, new K(locala, paramb));
  }
  
  public void r0(boolean paramBoolean)
  {
    c.a locala = G1();
    c3(locala, 7, new q(locala, paramBoolean));
  }
  
  public void release()
  {
    ((g0.k)g0.a.h(h)).j(new M(this));
  }
  
  public final void s(String paramString)
  {
    c.a locala = M1();
    c3(locala, 1012, new q0(locala, paramString));
  }
  
  public final void t(String paramString, long paramLong1, long paramLong2)
  {
    c.a locala = M1();
    c3(locala, 1008, new r(locala, paramString, paramLong2, paramLong1));
  }
  
  public final void u(d0.q paramq, k0.p paramp)
  {
    c.a locala = M1();
    c3(locala, 1017, new G(locala, paramq, paramp));
  }
  
  public final void v(int paramInt, long paramLong1, long paramLong2)
  {
    c.a locala = M1();
    c3(locala, 1011, new X(locala, paramInt, paramLong1, paramLong2));
  }
  
  public final void w(int paramInt, long paramLong)
  {
    c.a locala = L1();
    c3(locala, 1018, new u(locala, paramInt, paramLong));
  }
  
  public final void x(d0.x paramx)
  {
    c.a locala = G1();
    c3(locala, 28, new n(locala, paramx));
  }
  
  public final void y(long paramLong, int paramInt)
  {
    c.a locala = L1();
    c3(locala, 1021, new B(locala, paramLong, paramInt));
  }
  
  public final void z(d0.q paramq, k0.p paramp)
  {
    c.a locala = M1();
    c3(locala, 1009, new I(locala, paramq, paramp));
  }
  
  public static final class a
  {
    public final I.b a;
    public X2.v b;
    public X2.w c;
    public x.b d;
    public x.b e;
    public x.b f;
    
    public a(I.b paramb)
    {
      a = paramb;
      b = X2.v.Y();
      c = X2.w.j();
    }
    
    public static x.b c(d0.D paramD, X2.v paramv, x.b paramb, I.b paramb1)
    {
      d0.I localI = paramD.L();
      int i = paramD.C();
      Object localObject;
      if (localI.q()) {
        localObject = null;
      } else {
        localObject = localI.m(i);
      }
      if ((!paramD.o()) && (!localI.q())) {
        i = localI.f(i, paramb1).d(g0.M.J0(paramD.P()) - paramb1.n());
      } else {
        i = -1;
      }
      for (int j = 0; j < paramv.size(); j++)
      {
        paramb1 = (x.b)paramv.get(j);
        if (i(paramb1, localObject, paramD.o(), paramD.D(), paramD.H(), i)) {
          return paramb1;
        }
      }
      if ((paramv.isEmpty()) && (paramb != null) && (i(paramb, localObject, paramD.o(), paramD.D(), paramD.H(), i))) {
        return paramb;
      }
      return null;
    }
    
    public static boolean i(x.b paramb, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
    {
      boolean bool1 = a.equals(paramObject);
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      if ((!paramBoolean) || (b != paramInt1) || (c != paramInt2))
      {
        bool1 = bool2;
        if (!paramBoolean)
        {
          bool1 = bool2;
          if (b == -1)
          {
            bool1 = bool2;
            if (e != paramInt3) {}
          }
        }
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    
    public final void b(w.a parama, x.b paramb, d0.I paramI)
    {
      if (paramb == null) {
        return;
      }
      if (paramI.b(a) != -1) {}
      do
      {
        parama.f(paramb, paramI);
        break;
        paramI = (d0.I)c.get(paramb);
      } while (paramI != null);
    }
    
    public x.b d()
    {
      return d;
    }
    
    public x.b e()
    {
      x.b localb;
      if (b.isEmpty()) {
        localb = null;
      } else {
        localb = (x.b)X2.B.d(b);
      }
      return localb;
    }
    
    public d0.I f(x.b paramb)
    {
      return (d0.I)c.get(paramb);
    }
    
    public x.b g()
    {
      return e;
    }
    
    public x.b h()
    {
      return f;
    }
    
    public void j(d0.D paramD)
    {
      d = c(paramD, b, e, a);
    }
    
    public void k(List paramList, x.b paramb, d0.D paramD)
    {
      b = X2.v.U(paramList);
      if (!paramList.isEmpty())
      {
        e = ((x.b)paramList.get(0));
        f = ((x.b)g0.a.e(paramb));
      }
      if (d == null) {
        d = c(paramD, b, e, a);
      }
      m(paramD.L());
    }
    
    public void l(d0.D paramD)
    {
      d = c(paramD, b, e, a);
      m(paramD.L());
    }
    
    public final void m(d0.I paramI)
    {
      w.a locala = X2.w.a();
      if (b.isEmpty())
      {
        b(locala, e, paramI);
        if (!W2.k.a(f, e)) {
          b(locala, f, paramI);
        }
        if ((W2.k.a(d, e)) || (W2.k.a(d, f))) {}
      }
      else
      {
        do
        {
          b(locala, d, paramI);
          break;
          for (int i = 0; i < b.size(); i++) {
            b(locala, (x.b)b.get(i), paramI);
          }
        } while (!b.contains(d));
      }
      c = locala.c();
    }
  }
}

/* Location:
 * Qualified Name:     l0.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */