package w3;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;
import o7.l0;
import o7.u.a;
import v3.c0;
import v3.e1;
import v3.f1;
import v3.f1.a;
import v3.f1.b;
import v3.f1.d;
import v3.i0;
import v3.o0;
import v3.p0;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v3.s1;
import v5.e0;
import v5.l.a;
import z4.t.b;

public final class w
  implements a
{
  public final v5.c a;
  public final r1.b b;
  public final r1.c c;
  public final a d;
  public final SparseArray<b.a> e;
  public v5.l<b> f;
  public f1 o;
  public v5.k p;
  public boolean q;
  
  public w(v5.c paramc)
  {
    paramc.getClass();
    a = paramc;
    int i = e0.a;
    Looper localLooper = Looper.myLooper();
    if (localLooper == null) {
      localLooper = Looper.getMainLooper();
    }
    f = new v5.l(localLooper, paramc, new e0.e(10));
    paramc = new r1.b();
    b = paramc;
    c = new r1.c();
    d = new a(paramc);
    e = new SparseArray();
  }
  
  public final void A(z3.e parame)
  {
    b.a locala = s0(d.e);
    v0(locala, 1013, new f(1, locala, parame));
  }
  
  public final void C(long paramLong1, long paramLong2, String paramString)
  {
    b.a locala = u0();
    v0(locala, 1008, new a0.j(locala, paramString, paramLong2, paramLong1));
  }
  
  public final void D(boolean paramBoolean) {}
  
  public final void E(int paramInt, t.b paramb)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1025, new c(paramb, 1));
  }
  
  public final void F(f1.a parama)
  {
    b.a locala = q0();
    v0(locala, 13, new k1.a(6, locala, parama));
  }
  
  public final void G(int paramInt, f1.d paramd1, f1.d paramd2)
  {
    if (paramInt == 1) {
      q = false;
    }
    a locala = d;
    Object localObject = o;
    localObject.getClass();
    d = a.b((f1)localObject, b, e, a);
    localObject = q0();
    v0((b.a)localObject, 11, new l(paramInt, paramd1, paramd2, (b.a)localObject));
  }
  
  public final void H(int paramInt, t.b paramb)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1027, new c(paramb, 0));
  }
  
  public final void I(boolean paramBoolean)
  {
    b.a locala = q0();
    v0(locala, 3, new j(locala, paramBoolean));
  }
  
  public final void J(l0 paraml0, t.b paramb)
  {
    a locala = d;
    f1 localf1 = o;
    localf1.getClass();
    locala.getClass();
    b = o7.t.p(paraml0);
    if (!paraml0.isEmpty())
    {
      e = ((t.b)paraml0.get(0));
      paramb.getClass();
      f = paramb;
    }
    if (d == null) {
      d = a.b(localf1, b, e, a);
    }
    locala.d(localf1.J());
  }
  
  public final void K(int paramInt, boolean paramBoolean)
  {
    b.a locala = q0();
    v0(locala, 5, new h(paramInt, locala, paramBoolean));
  }
  
  public final void L(float paramFloat)
  {
    b.a locala = u0();
    v0(locala, 22, new f(locala, paramFloat));
  }
  
  public final void M(int paramInt, t.b paramb, z4.n paramn, z4.q paramq)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1002, new d9.p(paramb, paramn, paramq, 0));
  }
  
  public final void N(int paramInt)
  {
    b.a locala = q0();
    v0(locala, 4, new p(locala, paramInt, 0));
  }
  
  public final void O(int paramInt, t.b paramb)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1026, new aa.m0(paramb, 4));
  }
  
  public final void P(int paramInt, t.b paramb, Exception paramException)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1024, new e0.e(paramb, paramException, 1));
  }
  
  public final void Q(int paramInt, long paramLong1, long paramLong2)
  {
    Object localObject = d;
    if (b.isEmpty()) {
      localObject = null;
    } else {
      localObject = (t.b)p2.m0.K(b);
    }
    localObject = s0((t.b)localObject);
    v0((b.a)localObject, 1006, new o((b.a)localObject, paramInt, paramLong1, paramLong2));
  }
  
  public final void R(p0 paramp0)
  {
    b.a locala = q0();
    v0(locala, 14, new k1.a(4, locala, paramp0));
  }
  
  public final void S()
  {
    if (!q)
    {
      b.a locala = q0();
      q = true;
      v0(locala, -1, new r(locala, 0));
    }
  }
  
  public final void T(boolean paramBoolean)
  {
    b.a locala = q0();
    v0(locala, 9, new t(locala, paramBoolean));
  }
  
  public final void U(int paramInt1, t.b paramb, int paramInt2)
  {
    paramb = t0(paramInt1, paramb);
    v0(paramb, 1022, new c0(paramb, paramInt2, 1));
  }
  
  public final void V(int paramInt, t.b paramb, z4.q paramq)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1004, new q3.h(5, paramb, paramq));
  }
  
  public final void W(int paramInt, boolean paramBoolean)
  {
    b.a locala = q0();
    v0(locala, 30, new u(paramInt, locala, paramBoolean));
  }
  
  public final void X(v3.n paramn)
  {
    if ((paramn instanceof v3.n))
    {
      localObject = p;
      if (localObject != null)
      {
        localObject = s0(new t.b((z4.s)localObject));
        break label37;
      }
    }
    Object localObject = q0();
    label37:
    v0((b.a)localObject, 10, new r3.l(1, localObject, paramn));
  }
  
  public final void Y(r1 paramr1, int paramInt)
  {
    a locala = d;
    paramr1 = o;
    paramr1.getClass();
    d = a.b(paramr1, b, e, a);
    locala.d(paramr1.J());
    paramr1 = q0();
    v0(paramr1, 0, new v3.y(paramr1, paramInt, 1));
  }
  
  public final void Z(s1 params1)
  {
    b.a locala = q0();
    v0(locala, 2, new q3.h(4, locala, params1));
  }
  
  public final void a(z3.e parame)
  {
    b.a locala = s0(d.e);
    v0(locala, 1020, new f(0, locala, parame));
  }
  
  public final void a0(v3.n paramn)
  {
    if ((paramn instanceof v3.n))
    {
      localObject = p;
      if (localObject != null)
      {
        localObject = s0(new t.b((z4.s)localObject));
        break label37;
      }
    }
    Object localObject = q0();
    label37:
    v0((b.a)localObject, 10, new q3.h(2, localObject, paramn));
  }
  
  public final void b(w5.o paramo)
  {
    b.a locala = u0();
    v0(locala, 25, new o9.l(4, locala, paramo));
  }
  
  public final void b0(int paramInt, boolean paramBoolean)
  {
    b.a locala = q0();
    v0(locala, -1, new e(paramInt, locala, paramBoolean));
  }
  
  public final void c(String paramString)
  {
    b.a locala = u0();
    v0(locala, 1019, new o9.l(2, locala, paramString));
  }
  
  public final void c0(e1 parame1)
  {
    b.a locala = q0();
    v0(locala, 12, new q3.h(7, locala, parame1));
  }
  
  public final void d(int paramInt) {}
  
  public final void d0(x3.d paramd)
  {
    b.a locala = u0();
    v0(locala, 20, new r3.l(3, locala, paramd));
  }
  
  public final void e(int paramInt, long paramLong)
  {
    b.a locala = s0(d.e);
    v0(locala, 1021, new q(locala, paramLong, paramInt));
  }
  
  public final void e0(f1 paramf1, f1.b paramb) {}
  
  public final void f()
  {
    b.a locala = q0();
    v0(locala, -1, new r(locala, 1));
  }
  
  public final void f0(int paramInt, t.b paramb, z4.n paramn, z4.q paramq, IOException paramIOException, boolean paramBoolean)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1003, new i(paramb, paramn, paramq, paramIOException, paramBoolean));
  }
  
  public final void g(z3.e parame)
  {
    b.a locala = u0();
    v0(locala, 1007, new o9.l(3, locala, parame));
  }
  
  public final void g0(y paramy)
  {
    f.a(paramy);
  }
  
  public final void h(i0 parami0, z3.i parami)
  {
    b.a locala = u0();
    v0(locala, 1017, new d9.q(locala, parami0, parami, 1));
  }
  
  public final void h0(int paramInt, t.b paramb, z4.n paramn, z4.q paramq)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1000, new k(paramb, paramn, paramq));
  }
  
  public final void i(String paramString)
  {
    b.a locala = u0();
    v0(locala, 1012, new k1.a(5, locala, paramString));
  }
  
  public final void i0(f1 paramf1, Looper paramLooper)
  {
    boolean bool;
    if ((o != null) && (!d.b.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    x6.b.H(bool);
    paramf1.getClass();
    o = paramf1;
    p = a.b(paramLooper, null);
    v5.l locall = f;
    paramf1 = new q3.h(3, this, paramf1);
    v5.c localc = a;
    f = new v5.l(d, paramLooper, localc, paramf1);
  }
  
  public final void j(h5.c paramc)
  {
    b.a locala = q0();
    v0(locala, 27, new q3.h(6, locala, paramc));
  }
  
  public final void j0(int paramInt, t.b paramb)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1023, new io.flutter.plugins.firebase.auth.g(paramb, 9));
  }
  
  public final void k(int paramInt, long paramLong)
  {
    b.a locala = s0(d.e);
    v0(locala, 1018, new q(locala, paramInt, paramLong));
  }
  
  public final void k0(o0 paramo0, int paramInt)
  {
    b.a locala = q0();
    v0(locala, 1, new g(locala, paramo0, paramInt));
  }
  
  public final void l(Object paramObject, long paramLong)
  {
    b.a locala = u0();
    v0(locala, 26, new n(locala, paramObject, paramLong));
  }
  
  public final void l0(v3.m paramm)
  {
    b.a locala = q0();
    v0(locala, 29, new k1.a(3, locala, paramm));
  }
  
  public final void m() {}
  
  public final void m0(int paramInt1, int paramInt2)
  {
    b.a locala = u0();
    v0(locala, 24, new g(locala, paramInt1, paramInt2));
  }
  
  public final void n(z3.e parame)
  {
    b.a locala = u0();
    v0(locala, 1015, new r3.l(2, locala, parame));
  }
  
  public final void n0(int paramInt, t.b paramb, z4.n paramn, z4.q paramq)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1001, new d9.p(paramb, paramn, paramq, 1));
  }
  
  public final void o(boolean paramBoolean)
  {
    b.a locala = u0();
    v0(locala, 23, new v(0, locala, paramBoolean));
  }
  
  public final void o0(int paramInt, t.b paramb, z4.q paramq)
  {
    paramb = t0(paramInt, paramb);
    v0(paramb, 1005, new r3.l(4, paramb, paramq));
  }
  
  public final void p(Exception paramException)
  {
    b.a locala = u0();
    v0(locala, 1014, new e0.d(locala, paramException, 0));
  }
  
  public final void p0(boolean paramBoolean)
  {
    b.a locala = q0();
    v0(locala, 7, new v(1, locala, paramBoolean));
  }
  
  public final void q(int paramInt)
  {
    b.a locala = q0();
    v0(locala, 8, new p(locala, paramInt, 1));
  }
  
  public final b.a q0()
  {
    return s0(d.d);
  }
  
  public final void r(List<h5.a> paramList)
  {
    b.a locala = q0();
    v0(locala, 27, new k1.a(7, locala, paramList));
  }
  
  public final b.a r0(r1 paramr1, int paramInt, t.b paramb)
  {
    if (paramr1.p()) {
      paramb = null;
    }
    long l1 = a.d();
    boolean bool = paramr1.equals(o.J());
    int i = 1;
    int j;
    if ((bool) && (paramInt == o.F())) {
      j = 1;
    } else {
      j = 0;
    }
    long l2 = 0L;
    if ((paramb != null) && (paramb.a()))
    {
      if ((j != 0) && (o.E() == b) && (o.r() == c)) {
        j = i;
      } else {
        j = 0;
      }
      if (j != 0) {
        l2 = o.P();
      }
    }
    else if (j != 0)
    {
      l2 = o.y();
    }
    else if (!paramr1.p())
    {
      l2 = e0.R(mc).u);
    }
    t.b localb = d.d;
    return new b.a(l1, paramr1, paramInt, paramb, l2, o.J(), o.F(), localb, o.P(), o.i());
  }
  
  public final void release()
  {
    v5.k localk = p;
    x6.b.K(localk);
    localk.e(new u.a(this, 8));
  }
  
  public final void s(long paramLong)
  {
    b.a locala = u0();
    v0(locala, 1010, new v3.q(locala, paramLong));
  }
  
  public final b.a s0(t.b paramb)
  {
    o.getClass();
    r1 localr1;
    if (paramb == null) {
      localr1 = null;
    } else {
      localr1 = (r1)d.c.get(paramb);
    }
    if ((paramb != null) && (localr1 != null)) {
      return r0(localr1, ga, b).c, paramb);
    }
    int i = o.F();
    paramb = o.J();
    int j;
    if (i < paramb.o()) {
      j = 1;
    } else {
      j = 0;
    }
    if (j == 0) {
      paramb = r1.a;
    }
    return r0(paramb, i, null);
  }
  
  public final void t(Exception paramException)
  {
    b.a locala = u0();
    v0(locala, 1029, new e0.d(locala, paramException, 1));
  }
  
  public final b.a t0(int paramInt, t.b paramb)
  {
    o.getClass();
    int i = 1;
    int j = 1;
    if (paramb != null)
    {
      if ((r1)d.c.get(paramb) == null) {
        j = 0;
      }
      if (j != 0) {
        paramb = s0(paramb);
      } else {
        paramb = r0(r1.a, paramInt, paramb);
      }
      return paramb;
    }
    paramb = o.J();
    if (paramInt < paramb.o()) {
      j = i;
    } else {
      j = 0;
    }
    if (j == 0) {
      paramb = r1.a;
    }
    return r0(paramb, paramInt, null);
  }
  
  public final void u(i0 parami0, z3.i parami)
  {
    b.a locala = u0();
    v0(locala, 1009, new d9.q(locala, parami0, parami, 0));
  }
  
  public final b.a u0()
  {
    return s0(d.f);
  }
  
  public final void v(Exception paramException)
  {
    b.a locala = u0();
    v0(locala, 1030, new e0.e(locala, paramException, 0));
  }
  
  public final void v0(b.a parama, int paramInt, l.a<b> parama1)
  {
    e.put(paramInt, parama);
    f.e(paramInt, parama1);
  }
  
  public final void w(p4.a parama)
  {
    b.a locala = q0();
    v0(locala, 28, new q3.h(1, locala, parama));
  }
  
  public final void x(int paramInt)
  {
    b.a locala = q0();
    v0(locala, 6, new d(locala, paramInt));
  }
  
  public final void y(long paramLong1, long paramLong2, String paramString)
  {
    b.a locala = u0();
    v0(locala, 1016, new s(locala, paramString, paramLong2, paramLong1));
  }
  
  public final void z(int paramInt, long paramLong1, long paramLong2)
  {
    b.a locala = u0();
    v0(locala, 1011, new m(locala, paramInt, paramLong1, paramLong2));
  }
  
  public static final class a
  {
    public final r1.b a;
    public o7.t<t.b> b;
    public o7.m0 c;
    public t.b d;
    public t.b e;
    public t.b f;
    
    public a(r1.b paramb)
    {
      a = paramb;
      paramb = o7.t.b;
      b = l0.e;
      c = o7.m0.o;
    }
    
    public static t.b b(f1 paramf1, o7.t<t.b> paramt, t.b paramb, r1.b paramb1)
    {
      r1 localr1 = paramf1.J();
      int i = paramf1.p();
      Object localObject;
      if (localr1.p()) {
        localObject = null;
      } else {
        localObject = localr1.l(i);
      }
      if ((!paramf1.g()) && (!localr1.p())) {
        i = localr1.f(i, paramb1, false).b(e0.I(paramf1.P()) - e);
      } else {
        i = -1;
      }
      for (int j = 0; j < paramt.size(); j++)
      {
        paramb1 = (t.b)paramt.get(j);
        if (c(paramb1, localObject, paramf1.g(), paramf1.E(), paramf1.r(), i)) {
          return paramb1;
        }
      }
      if ((paramt.isEmpty()) && (paramb != null) && (c(paramb, localObject, paramf1.g(), paramf1.E(), paramf1.r(), i))) {
        return paramb;
      }
      return null;
    }
    
    public static boolean c(t.b paramb, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
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
    
    public final void a(u.a<t.b, r1> parama, t.b paramb, r1 paramr1)
    {
      if (paramb == null) {
        return;
      }
      if (paramr1.b(a) == -1)
      {
        paramr1 = (r1)c.get(paramb);
        if (paramr1 == null) {}
      }
      else
      {
        parama.b(paramb, paramr1);
      }
    }
    
    public final void d(r1 paramr1)
    {
      u.a locala = new u.a(4);
      if (b.isEmpty())
      {
        a(locala, e, paramr1);
        if (!x6.b.Q(f, e)) {
          a(locala, f, paramr1);
        }
        if ((x6.b.Q(d, e)) || (x6.b.Q(d, f))) {
          break label146;
        }
      }
      else
      {
        for (int i = 0; i < b.size(); i++) {
          a(locala, (t.b)b.get(i), paramr1);
        }
        if (b.contains(d)) {
          break label146;
        }
      }
      a(locala, d, paramr1);
      label146:
      c = locala.a();
    }
  }
}

/* Location:
 * Qualified Name:     w3.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */