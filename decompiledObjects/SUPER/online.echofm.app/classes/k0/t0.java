package k0;

import A0.D;
import A0.D.a;
import A0.E;
import A0.y;
import B0.e;
import X2.a0;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import d0.A;
import d0.C;
import d0.I;
import d0.I.b;
import d0.I.c;
import d0.q;
import d0.u.g;
import d0.x;
import g0.F;
import g0.M;
import g0.k;
import g0.k.a;
import g0.o;
import i0.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.y1;
import p0.n.a;
import x0.Q;
import x0.T;
import x0.Z;
import x0.b;
import z0.i;

public final class t0
  implements Handler.Callback, x0.v.a, D.a, T0.d, s.a, V0.a
{
  public static final long l0 = M.i1(10000L);
  public final long A;
  public final boolean B;
  public final s C;
  public final ArrayList D;
  public final g0.c E;
  public final f F;
  public final E0 G;
  public final T0 H;
  public final w0 I;
  public final long J;
  public final y1 K;
  public final boolean L;
  public d1 M;
  public U0 N;
  public e O;
  public boolean P;
  public boolean Q;
  public boolean R;
  public boolean S;
  public long T;
  public boolean U;
  public int V;
  public boolean W;
  public boolean X;
  public boolean Y;
  public boolean Z;
  public int a0;
  public h b0;
  public long c0;
  public long d0;
  public int e0;
  public boolean f0;
  public u g0;
  public long h0;
  public long i0;
  public w.c j0;
  public I k0;
  public final Y0[] o;
  public final Set p;
  public final a1[] q;
  public final D r;
  public final E s;
  public final x0 t;
  public final e u;
  public final k v;
  public final HandlerThread w;
  public final Looper x;
  public final I.c y;
  public final I.b z;
  
  public t0(Y0[] paramArrayOfY0, D paramD, E paramE, x0 paramx0, e parame, int paramInt, boolean paramBoolean1, l0.a parama, d1 paramd1, w0 paramw0, long paramLong, boolean paramBoolean2, boolean paramBoolean3, Looper paramLooper1, g0.c paramc, f paramf, y1 paramy1, Looper paramLooper2, w.c paramc1)
  {
    F = paramf;
    o = paramArrayOfY0;
    r = paramD;
    s = paramE;
    t = paramx0;
    u = parame;
    V = paramInt;
    W = paramBoolean1;
    M = paramd1;
    I = paramw0;
    J = paramLong;
    h0 = paramLong;
    Q = paramBoolean2;
    L = paramBoolean3;
    E = paramc;
    K = paramy1;
    j0 = paramc1;
    i0 = -9223372036854775807L;
    T = -9223372036854775807L;
    A = paramx0.h(paramy1);
    B = paramx0.f(paramy1);
    k0 = I.a;
    paramE = U0.k(paramE);
    N = paramE;
    O = new e(paramE);
    q = new a1[paramArrayOfY0.length];
    paramE = paramD.d();
    for (paramInt = 0; paramInt < paramArrayOfY0.length; paramInt++)
    {
      paramArrayOfY0[paramInt].D(paramInt, paramy1, paramc);
      q[paramInt] = paramArrayOfY0[paramInt].G();
      if (paramE != null) {
        q[paramInt].x(paramE);
      }
    }
    C = new s(this, paramc);
    D = new ArrayList();
    p = a0.h();
    y = new I.c();
    z = new I.b();
    paramD.e(this, parame);
    f0 = true;
    paramArrayOfY0 = paramc.e(paramLooper1, null);
    G = new E0(parama, paramArrayOfY0, new s0(this), paramc1);
    H = new T0(this, parama, paramArrayOfY0, paramy1);
    if (paramLooper2 != null)
    {
      w = null;
      x = paramLooper2;
    }
    else
    {
      paramArrayOfY0 = new HandlerThread("ExoPlayer:Playback", -16);
      w = paramArrayOfY0;
      paramArrayOfY0.start();
      x = paramArrayOfY0.getLooper();
    }
    v = paramc.e(x, this);
  }
  
  public static void D0(I paramI, d paramd, I.c paramc, I.b paramb)
  {
    int i = nhr, paramb).c, paramc).o;
    paramI = gb;
    long l = d;
    if (l != -9223372036854775807L) {
      l -= 1L;
    } else {
      l = Long.MAX_VALUE;
    }
    paramd.e(i, l, paramI);
  }
  
  public static q[] E(y paramy)
  {
    int i = 0;
    int j;
    if (paramy != null) {
      j = paramy.length();
    } else {
      j = 0;
    }
    q[] arrayOfq = new q[j];
    while (i < j)
    {
      arrayOfq[i] = paramy.b(i);
      i++;
    }
    return arrayOfq;
  }
  
  public static boolean E0(d paramd, I paramI1, I paramI2, int paramInt, boolean paramBoolean, I.c paramc, I.b paramb)
  {
    Object localObject = r;
    long l1;
    if (localObject == null)
    {
      if (o.f() == Long.MIN_VALUE) {
        l1 = -9223372036854775807L;
      } else {
        l1 = M.J0(o.f());
      }
      paramI2 = H0(paramI1, new h(o.h(), o.d(), l1), false, paramInt, paramBoolean, paramc, paramb);
      if (paramI2 == null) {
        return false;
      }
      paramd.e(paramI1.b(first), ((Long)second).longValue(), first);
      if (o.f() == Long.MIN_VALUE) {
        D0(paramI1, paramd, paramc, paramb);
      }
      return true;
    }
    paramInt = paramI1.b(localObject);
    if (paramInt == -1) {
      return false;
    }
    if (o.f() == Long.MIN_VALUE)
    {
      D0(paramI1, paramd, paramc, paramb);
      return true;
    }
    p = paramInt;
    paramI2.h(r, paramb);
    if ((f) && (nc, paramc).n == paramI2.b(r)))
    {
      long l2 = q;
      l1 = paramb.n();
      paramI2 = paramI1.j(paramc, paramb, hr, paramb).c, l2 + l1);
      paramd.e(paramI1.b(first), ((Long)second).longValue(), first);
    }
    return true;
  }
  
  public static g G0(I paramI, U0 paramU0, h paramh, E0 paramE0, int paramInt, boolean paramBoolean, I.c paramc, I.b paramb)
  {
    if (paramI.q()) {
      return new g(U0.l(), 0L, -9223372036854775807L, false, true, false);
    }
    Object localObject1 = b;
    Object localObject2 = a;
    boolean bool1 = Z(paramU0, paramb);
    if ((!b.b()) && (!bool1)) {}
    for (long l1 = s;; l1 = c) {
      break;
    }
    int i = 1;
    long l2;
    boolean bool2;
    boolean bool3;
    int j;
    if (paramh != null)
    {
      Pair localPair = H0(paramI, paramh, true, paramInt, paramBoolean, paramc, paramb);
      if (localPair == null)
      {
        paramInt = paramI.a(paramBoolean);
        l2 = l1;
        bool2 = false;
        bool3 = bool2;
        paramBoolean = true;
      }
      else
      {
        if (c == -9223372036854775807L)
        {
          paramInt = hfirst, paramb).c;
          l2 = l1;
          bool2 = false;
        }
        else
        {
          localObject2 = first;
          l2 = ((Long)second).longValue();
          paramInt = -1;
          bool2 = true;
        }
        if (e == 4) {
          bool3 = true;
        } else {
          bool3 = false;
        }
        paramBoolean = false;
      }
      bool4 = paramBoolean;
      paramBoolean = bool2;
      bool2 = bool4;
      paramh = (h)localObject1;
    }
    else
    {
      paramh = (h)localObject1;
      j = -1;
      if (a.q()) {}
      for (paramInt = paramI.a(paramBoolean);; paramInt = hc)
      {
        l2 = l1;
        bool3 = false;
        bool2 = bool3;
        paramBoolean = bool2;
        break;
        if (paramI.b(localObject2) == j)
        {
          paramInt = I0(paramc, paramb, paramInt, paramBoolean, localObject2, a, paramI);
          if (paramInt == j)
          {
            paramInt = paramI.a(paramBoolean);
            paramBoolean = true;
          }
          else
          {
            paramBoolean = false;
          }
          bool2 = paramBoolean;
          l2 = l1;
          bool3 = false;
          paramBoolean = bool3;
          break;
        }
        if (l1 != -9223372036854775807L) {
          break label376;
        }
      }
      label376:
      if (bool1)
      {
        localObject1 = a;
        ((I)localObject1).h(a, paramb);
        if (a.n(c, paramc).n == a.b(a))
        {
          l2 = paramb.n();
          localObject1 = paramI.j(paramc, paramb, hc, l1 + l2);
          localObject2 = first;
          l2 = ((Long)second).longValue();
        }
        else
        {
          l2 = l1;
        }
        paramInt = j;
        bool3 = false;
        bool2 = bool3;
        paramBoolean = true;
      }
      else
      {
        paramInt = j;
        l2 = l1;
        bool3 = false;
        bool2 = bool3;
        paramBoolean = bool2;
      }
    }
    long l3;
    if (paramInt != -1)
    {
      paramc = paramI.j(paramc, paramb, paramInt, -9223372036854775807L);
      localObject2 = first;
      l2 = ((Long)second).longValue();
      l3 = -9223372036854775807L;
    }
    else
    {
      l3 = l2;
    }
    paramE0 = paramE0.L(paramI, localObject2, l2);
    paramInt = e;
    if (paramInt != -1)
    {
      j = e;
      if ((j == -1) || (paramInt < j))
      {
        paramInt = 0;
        break label632;
      }
    }
    paramInt = 1;
    label632:
    if ((a.equals(localObject2)) && (!paramh.b()) && (!paramE0.b()) && (paramInt != 0)) {
      paramInt = i;
    } else {
      paramInt = 0;
    }
    boolean bool4 = V(bool1, paramh, l1, paramE0, paramI.h(localObject2, paramb), l3);
    if ((paramInt != 0) || (bool4)) {
      paramE0 = paramh;
    }
    l1 = l2;
    if (paramE0.b())
    {
      if (!paramE0.equals(paramh)) {
        break label734;
      }
      l1 = s;
    }
    for (;;)
    {
      break;
      label734:
      paramI.h(a, paramb);
      if (c == paramb.k(b)) {
        l1 = paramb.g();
      } else {
        l1 = 0L;
      }
    }
    return new g(paramE0, l1, l3, bool3, bool2, paramBoolean);
  }
  
  public static Pair H0(I paramI, h paramh, boolean paramBoolean1, int paramInt, boolean paramBoolean2, I.c paramc, I.b paramb)
  {
    I localI = a;
    if (paramI.q()) {
      return null;
    }
    if (localI.q()) {
      localI = paramI;
    }
    try
    {
      Pair localPair1 = localI.j(paramc, paramb, b, c);
      if (paramI.equals(localI)) {
        return localPair1;
      }
      if (paramI.b(first) != -1)
      {
        Pair localPair2 = localPair1;
        if (hfirst, paramb).f)
        {
          localPair2 = localPair1;
          if (nc, paramc).n == localI.b(first)) {
            localPair2 = paramI.j(paramc, paramb, hfirst, paramb).c, c);
          }
        }
        return localPair2;
      }
      if (paramBoolean1)
      {
        paramInt = I0(paramc, paramb, paramInt, paramBoolean2, first, localI, paramI);
        if (paramInt != -1) {
          return paramI.j(paramc, paramb, paramInt, -9223372036854775807L);
        }
      }
    }
    catch (IndexOutOfBoundsException paramI)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static int I0(I.c paramc, I.b paramb, int paramInt, boolean paramBoolean, Object paramObject, I paramI1, I paramI2)
  {
    Object localObject = nhc, paramc).a;
    int i = 0;
    for (int j = 0; j < paramI2.p(); j++) {
      if (na.equals(localObject)) {
        return j;
      }
    }
    int k = paramI1.b(paramObject);
    int m = paramI1.i();
    int n = -1;
    j = -1;
    while ((i < m) && (j == -1))
    {
      k = paramI1.d(k, paramb, paramc, paramInt, paramBoolean);
      if (k == -1) {
        break;
      }
      j = paramI2.b(paramI1.m(k));
      i++;
    }
    if (j == -1) {
      paramInt = n;
    } else {
      paramInt = fc;
    }
    return paramInt;
  }
  
  public static boolean V(boolean paramBoolean, x0.x.b paramb1, long paramLong1, x0.x.b paramb2, I.b paramb, long paramLong2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = bool1;
    if (!paramBoolean)
    {
      bool3 = bool1;
      if (paramLong1 == paramLong2) {
        if (!a.equals(a))
        {
          bool3 = bool1;
        }
        else
        {
          if ((paramb1.b()) && (paramb.r(b)))
          {
            paramBoolean = bool2;
            if (paramb.h(b, c) != 4)
            {
              paramBoolean = bool2;
              if (paramb.h(b, c) != 2) {
                paramBoolean = true;
              }
            }
            return paramBoolean;
          }
          bool3 = bool1;
          if (paramb2.b())
          {
            bool3 = bool1;
            if (paramb.r(b)) {
              bool3 = true;
            }
          }
        }
      }
    }
    return bool3;
  }
  
  public static boolean X(Y0 paramY0)
  {
    boolean bool;
    if (paramY0.getState() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean Z(U0 paramU0, I.b paramb)
  {
    x0.x.b localb = b;
    paramU0 = a;
    boolean bool;
    if ((!paramU0.q()) && (!ha, paramb).f)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void A(Y0 paramY0)
  {
    if (paramY0.getState() == 2) {
      paramY0.stop();
    }
  }
  
  public final void A0(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    v.f(2);
    Z localZ = null;
    g0 = null;
    int i = 1;
    B1(false, true);
    C.f();
    c0 = 1000000000000L;
    for (Y0 localY0 : o)
    {
      try
      {
        v(localY0);
      }
      catch (RuntimeException localRuntimeException2) {}catch (u localu) {}
      o.d("ExoPlayerImplInternal", "Disable failed.", localu);
    }
    if (paramBoolean1) {
      for (??? : o) {
        if (p.remove(???)) {
          try
          {
            ???.b();
          }
          catch (RuntimeException localRuntimeException1)
          {
            o.d("ExoPlayerImplInternal", "Reset failed.", localRuntimeException1);
          }
        }
      }
    }
    a0 = 0;
    Object localObject1 = N;
    ??? = b;
    long l1 = s;
    long l2;
    if ((!N.b.b()) && (!Z(N, z))) {
      l2 = N.s;
    } else {
      l2 = N.c;
    }
    if (paramBoolean2)
    {
      b0 = null;
      ??? = H(N.a);
      localObject1 = (x0.x.b)first;
      long l3 = ((Long)second).longValue();
      paramBoolean1 = ((x0.x.b)localObject1).equals(N.b);
      long l4 = -9223372036854775807L;
      ??? = localObject1;
      l1 = l3;
      l2 = l4;
      if (!paramBoolean1)
      {
        l2 = l4;
        l1 = l3;
        ??? = localObject1;
      }
    }
    for (??? = i;; ??? = 0) {
      break;
    }
    G.f();
    U = false;
    Object localObject3 = N.a;
    localObject1 = localObject3;
    if (paramBoolean3)
    {
      localObject1 = localObject3;
      if ((localObject3 instanceof W0))
      {
        localObject3 = ((W0)localObject3).E(H.q());
        localObject1 = localObject3;
        if (b != -1)
        {
          ((I)localObject3).h(a, z);
          localObject1 = localObject3;
          if (((I)localObject3).n(z.c, y).f())
          {
            localObject1 = new x0.x.b(a, d);
            ??? = localObject3;
            break label507;
          }
        }
      }
    }
    localObject3 = localObject1;
    localObject1 = ???;
    ??? = localObject3;
    label507:
    Object localObject4 = N;
    i = e;
    if (paramBoolean4) {}
    for (localObject3 = localZ;; localObject3 = f) {
      break;
    }
    if (??? != 0) {}
    for (localZ = Z.d;; localZ = h) {
      break;
    }
    if (??? != 0) {}
    for (E localE = s;; localE = i) {
      break;
    }
    if (??? != 0) {}
    for (localObject4 = X2.v.Y();; localObject4 = j) {
      break;
    }
    U0 localU0 = N;
    N = new U0((I)???, (x0.x.b)localObject1, l2, l1, i, (u)localObject3, false, localZ, localE, (List)localObject4, (x0.x.b)localObject1, l, m, n, o, l1, 0L, l1, 0L, false);
    if (paramBoolean3)
    {
      G.H();
      H.y();
    }
  }
  
  public final void A1(I paramI1, x0.x.b paramb1, I paramI2, x0.x.b paramb2, long paramLong, boolean paramBoolean)
  {
    if (!q1(paramI1, paramb1))
    {
      if (paramb1.b()) {
        paramI1 = C.d;
      } else {
        paramI1 = N.o;
      }
      if (!C.h().equals(paramI1))
      {
        V0(paramI1);
        Q(N.o, a, false, false);
      }
      return;
    }
    paramI1.n(ha, z).c, y);
    I.b((u.g)M.i(y.j));
    if (paramLong != -9223372036854775807L)
    {
      I.d(F(paramI1, a, paramLong));
    }
    else
    {
      paramb1 = y.a;
      if (!paramI2.q()) {
        paramI1 = nha, z).c, y).a;
      } else {
        paramI1 = null;
      }
      if ((!M.c(paramI1, paramb1)) || (paramBoolean)) {
        I.d(-9223372036854775807L);
      }
    }
  }
  
  public void B(long paramLong)
  {
    h0 = paramLong;
  }
  
  public final void B0()
  {
    B0 localB0 = G.t();
    boolean bool;
    if ((localB0 != null) && (f.h) && (Q)) {
      bool = true;
    } else {
      bool = false;
    }
    R = bool;
  }
  
  public final void B1(boolean paramBoolean1, boolean paramBoolean2)
  {
    S = paramBoolean1;
    long l;
    if ((paramBoolean1) && (!paramBoolean2)) {
      l = E.b();
    } else {
      l = -9223372036854775807L;
    }
    T = l;
  }
  
  public final X2.v C(y[] paramArrayOfy)
  {
    X2.v.a locala = new X2.v.a();
    int i = paramArrayOfy.length;
    int j = 0;
    int m;
    for (int k = j; j < i; k = m)
    {
      Object localObject = paramArrayOfy[j];
      m = k;
      if (localObject != null)
      {
        localObject = b0k;
        if (localObject == null)
        {
          locala.h(new x(new d0.x.b[0]));
          m = k;
        }
        else
        {
          locala.h(localObject);
          m = 1;
        }
      }
      j++;
    }
    if (k != 0) {
      paramArrayOfy = locala.k();
    } else {
      paramArrayOfy = X2.v.Y();
    }
    return paramArrayOfy;
  }
  
  public final void C0(long paramLong)
  {
    B0 localB0 = G.t();
    if (localB0 == null) {
      paramLong += 1000000000000L;
    } else {
      paramLong = localB0.B(paramLong);
    }
    c0 = paramLong;
    C.c(paramLong);
    for (localB0 : o) {
      if (X(localB0)) {
        localB0.z(c0);
      }
    }
    n0();
  }
  
  public final void C1(float paramFloat)
  {
    for (B0 localB0 = G.t(); localB0 != null; localB0 = localB0.k()) {
      for (y localy : pc) {
        if (localy != null) {
          localy.r(paramFloat);
        }
      }
    }
  }
  
  public final long D()
  {
    U0 localU0 = N;
    return F(a, b.a, s);
  }
  
  public final void D1(W2.s params, long paramLong)
  {
    try
    {
      long l1 = E.b();
      int i = 0;
      long l2 = paramLong;
      boolean bool;
      do
      {
        bool = ((Boolean)params.get()).booleanValue();
      } while ((!bool) && (l2 > 0L));
      if (i == 0) {
        break label102;
      }
    }
    finally
    {
      try
      {
        E.f();
        wait(l2);
      }
      catch (InterruptedException localInterruptedException)
      {
        i = 1;
        l2 = l1 + paramLong - E.b();
      }
      params = finally;
      break label105;
    }
    Thread.currentThread().interrupt();
    label102:
    return;
    label105:
    throw params;
  }
  
  public final long F(I paramI, Object paramObject, long paramLong)
  {
    paramI.n(hz).c, y);
    paramI = y;
    if ((f != -9223372036854775807L) && (paramI.f()))
    {
      paramI = y;
      if (i) {
        return M.J0(paramI.a() - y.f) - (paramLong + z.n());
      }
    }
    return -9223372036854775807L;
  }
  
  public final void F0(I paramI1, I paramI2)
  {
    if ((paramI1.q()) && (paramI2.q())) {
      return;
    }
    for (int i = D.size() - 1; i >= 0; i--) {
      if (!E0((d)D.get(i), paramI1, paramI2, V, W, y, z))
      {
        D.get(i)).o.k(false);
        D.remove(i);
      }
    }
    Collections.sort(D);
  }
  
  public final long G()
  {
    B0 localB0 = G.u();
    if (localB0 == null) {
      return 0L;
    }
    long l1 = localB0.m();
    if (!d) {
      return l1;
    }
    int i = 0;
    for (;;)
    {
      Y0[] arrayOfY0 = o;
      if (i >= arrayOfY0.length) {
        break;
      }
      long l2 = l1;
      if (X(arrayOfY0[i])) {
        if (o[i].i() != c[i])
        {
          l2 = l1;
        }
        else
        {
          l2 = o[i].w();
          if (l2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
          }
          l2 = Math.max(l2, l1);
        }
      }
      i++;
      l1 = l2;
    }
    return l1;
  }
  
  public final Pair H(I paramI)
  {
    boolean bool = paramI.q();
    long l1 = 0L;
    if (bool) {
      return Pair.create(U0.l(), Long.valueOf(0L));
    }
    int i = paramI.a(W);
    Pair localPair = paramI.j(y, z, i, -9223372036854775807L);
    x0.x.b localb = G.L(paramI, first, 0L);
    long l2 = ((Long)second).longValue();
    if (localb.b())
    {
      paramI.h(a, z);
      l2 = l1;
      if (c == z.k(b)) {
        l2 = z.g();
      }
    }
    return Pair.create(localb, Long.valueOf(l2));
  }
  
  public Looper I()
  {
    return x;
  }
  
  public final long J()
  {
    return K(N.q);
  }
  
  public final void J0(long paramLong)
  {
    long l1;
    if ((N.e == 3) && ((L) || (!o1()))) {
      l1 = 1000L;
    } else {
      l1 = l0;
    }
    long l2 = l1;
    if (L)
    {
      l2 = l1;
      if (o1())
      {
        Y0[] arrayOfY0 = o;
        int i = arrayOfY0.length;
        int j = 0;
        for (;;)
        {
          l2 = l1;
          if (j >= i) {
            break;
          }
          Y0 localY0 = arrayOfY0[j];
          l2 = l1;
          if (X(localY0)) {
            l2 = Math.min(l1, M.i1(localY0.q(c0, d0)));
          }
          j++;
          l1 = l2;
        }
      }
    }
    v.e(2, paramLong + l2);
  }
  
  public final long K(long paramLong)
  {
    B0 localB0 = G.m();
    if (localB0 == null) {
      return 0L;
    }
    return Math.max(0L, paramLong - localB0.A(c0));
  }
  
  public void K0(I paramI, int paramInt, long paramLong)
  {
    v.g(3, new h(paramI, paramInt, paramLong)).a();
  }
  
  public final void L(x0.v paramv)
  {
    if (!G.B(paramv)) {
      return;
    }
    G.F(c0);
    c0();
  }
  
  public final void L0(boolean paramBoolean)
  {
    x0.x.b localb = G.t().f.a;
    long l = O0(localb, N.s, true, false);
    if (l != N.s)
    {
      U0 localU0 = N;
      N = S(localb, l, c, d, paramBoolean, 5);
    }
  }
  
  public final void M(IOException paramIOException, int paramInt)
  {
    u localu = u.c(paramIOException, paramInt);
    B0 localB0 = G.t();
    paramIOException = localu;
    if (localB0 != null) {
      paramIOException = localu.a(f.a);
    }
    o.d("ExoPlayerImplInternal", "Playback error", paramIOException);
    t1(false, false);
    N = N.f(paramIOException);
  }
  
  public final void M0(h paramh)
  {
    Object localObject1 = O;
    boolean bool1 = true;
    ((e)localObject1).b(1);
    Object localObject2 = H0(N.a, paramh, true, V, W, y, z);
    long l1;
    boolean bool2;
    long l2;
    if (localObject2 == null)
    {
      Pair localPair = H(N.a);
      localObject1 = (x0.x.b)first;
      l1 = ((Long)second).longValue();
      bool2 = N.a.q() ^ true;
      l2 = -9223372036854775807L;
    }
    long l3;
    for (;;)
    {
      l3 = l2;
      l2 = l1;
      break;
      localObject1 = first;
      l1 = ((Long)second).longValue();
      if (c == -9223372036854775807L) {
        l2 = -9223372036854775807L;
      } else {
        l2 = l1;
      }
      localObject1 = G.L(N.a, localObject1, l1);
      if (((x0.x.b)localObject1).b())
      {
        N.a.h(a, z);
        if (z.k(b) == c) {
          l1 = z.g();
        } else {
          l1 = 0L;
        }
        l3 = l2;
        bool2 = true;
        l2 = l1;
        break;
      }
      if (c == -9223372036854775807L) {
        bool2 = true;
      } else {
        bool2 = false;
      }
    }
    try
    {
      if (N.a.q()) {
        b0 = paramh;
      }
    }
    finally
    {
      break label573;
    }
    if (localObject2 == null)
    {
      if (N.e != 1) {
        l1(4);
      }
      A0(false, true, false, true);
      l1 = l2;
    }
    else
    {
      long l4;
      if (((x0.x.b)localObject1).equals(N.b))
      {
        paramh = G.t();
        if ((paramh != null) && (d) && (l2 != 0L)) {
          l1 = a.d(l2, M);
        } else {
          l1 = l2;
        }
        l4 = l1;
        if (M.i1(l1) == M.i1(N.s))
        {
          paramh = N;
          int i = e;
          if (i != 2)
          {
            l4 = l1;
            if (i != 3) {}
          }
          else
          {
            l1 = s;
            N = S((x0.x.b)localObject1, l1, l3, l1, bool2, 2);
          }
        }
      }
      else
      {
        l4 = l2;
      }
      boolean bool3;
      if (N.e == 4) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      l1 = N0((x0.x.b)localObject1, l4, bool3);
      if (l2 == l1) {
        bool1 = false;
      }
      bool2 |= bool1;
    }
    try
    {
      paramh = N;
      localObject2 = a;
      A1((I)localObject2, (x0.x.b)localObject1, (I)localObject2, b, l3, true);
      N = S((x0.x.b)localObject1, l1, l3, l1, bool2, 2);
      return;
    }
    finally
    {
      l2 = l1;
    }
    label573:
    N = S((x0.x.b)localObject1, l2, l3, l2, bool2, 2);
    throw paramh;
  }
  
  public final void N(boolean paramBoolean)
  {
    B0 localB0 = G.m();
    if (localB0 == null) {
      localObject = N.b;
    } else {
      localObject = f.a;
    }
    boolean bool = N.k.equals(localObject) ^ true;
    if (bool) {
      N = N.c((x0.x.b)localObject);
    }
    Object localObject = N;
    long l;
    if (localB0 == null) {
      l = s;
    } else {
      l = localB0.j();
    }
    q = l;
    N.r = J();
    if (((bool) || (paramBoolean)) && (localB0 != null) && (d)) {
      w1(f.a, localB0.o(), localB0.p());
    }
  }
  
  public final long N0(x0.x.b paramb, long paramLong, boolean paramBoolean)
  {
    if (G.t() != G.u()) {}
    for (boolean bool = true;; bool = false) {
      break;
    }
    return O0(paramb, paramLong, bool, paramBoolean);
  }
  
  /* Error */
  public final void O(I paramI, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield 200	k0/t0:N	Lk0/U0;
    //   5: aload_0
    //   6: getfield 564	k0/t0:b0	Lk0/t0$h;
    //   9: aload_0
    //   10: getfield 276	k0/t0:G	Lk0/E0;
    //   13: aload_0
    //   14: getfield 147	k0/t0:V	I
    //   17: aload_0
    //   18: getfield 149	k0/t0:W	Z
    //   21: aload_0
    //   22: getfield 249	k0/t0:y	Ld0/I$c;
    //   25: aload_0
    //   26: getfield 254	k0/t0:z	Ld0/I$b;
    //   29: invokestatic 917	k0/t0:G0	(Ld0/I;Lk0/U0;Lk0/t0$h;Lk0/E0;IZLd0/I$c;Ld0/I$b;)Lk0/t0$g;
    //   32: astore_3
    //   33: aload_3
    //   34: getfield 918	k0/t0$g:a	Lx0/x$b;
    //   37: astore 4
    //   39: aload_3
    //   40: getfield 919	k0/t0$g:c	J
    //   43: lstore 5
    //   45: aload_3
    //   46: getfield 920	k0/t0$g:d	Z
    //   49: istore 7
    //   51: aload_3
    //   52: getfield 922	k0/t0$g:b	J
    //   55: lstore 8
    //   57: aload_0
    //   58: getfield 200	k0/t0:N	Lk0/U0;
    //   61: getfield 419	k0/U0:b	Lx0/x$b;
    //   64: aload 4
    //   66: invokevirtual 455	x0/x$b:equals	(Ljava/lang/Object;)Z
    //   69: ifeq +25 -> 94
    //   72: lload 8
    //   74: aload_0
    //   75: getfield 200	k0/t0:N	Lk0/U0;
    //   78: getfield 430	k0/U0:s	J
    //   81: lcmp
    //   82: ifeq +6 -> 88
    //   85: goto +9 -> 94
    //   88: iconst_0
    //   89: istore 10
    //   91: goto +6 -> 97
    //   94: iconst_1
    //   95: istore 10
    //   97: ldc2_w 168
    //   100: lstore 11
    //   102: aload_3
    //   103: getfield 924	k0/t0$g:e	Z
    //   106: ifeq +35 -> 141
    //   109: aload_0
    //   110: getfield 200	k0/t0:N	Lk0/U0;
    //   113: getfield 438	k0/U0:e	I
    //   116: iconst_1
    //   117: if_icmpeq +16 -> 133
    //   120: aload_0
    //   121: iconst_4
    //   122: invokevirtual 880	k0/t0:l1	(I)V
    //   125: goto +8 -> 133
    //   128: astore 13
    //   130: goto +456 -> 586
    //   133: aload_0
    //   134: iconst_0
    //   135: iconst_0
    //   136: iconst_0
    //   137: iconst_1
    //   138: invokevirtual 882	k0/t0:A0	(ZZZZ)V
    //   141: aload_0
    //   142: getfield 137	k0/t0:o	[Lk0/Y0;
    //   145: astore 13
    //   147: aload 13
    //   149: arraylength
    //   150: istore 14
    //   152: iconst_0
    //   153: istore 15
    //   155: iload 15
    //   157: iload 14
    //   159: if_icmpge +25 -> 184
    //   162: aload 13
    //   164: iload 15
    //   166: aaload
    //   167: aload_1
    //   168: invokeinterface 927 2 0
    //   173: iinc 15 1
    //   176: goto -21 -> 155
    //   179: astore 13
    //   181: goto +405 -> 586
    //   184: iload 10
    //   186: ifne +52 -> 238
    //   189: aload_0
    //   190: getfield 276	k0/t0:G	Lk0/E0;
    //   193: astore 13
    //   195: aload_0
    //   196: getfield 540	k0/t0:c0	J
    //   199: lstore 16
    //   201: aload_0
    //   202: invokevirtual 929	k0/t0:G	()J
    //   205: lstore 18
    //   207: aload 13
    //   209: aload_1
    //   210: lload 16
    //   212: lload 18
    //   214: invokevirtual 932	k0/E0:R	(Ld0/I;JJ)Z
    //   217: ifne +8 -> 225
    //   220: aload_0
    //   221: iconst_0
    //   222: invokevirtual 934	k0/t0:L0	(Z)V
    //   225: goto +128 -> 353
    //   228: astore 13
    //   230: goto +356 -> 586
    //   233: astore 13
    //   235: goto -5 -> 230
    //   238: lload 8
    //   240: lstore 16
    //   242: aload_1
    //   243: invokevirtual 409	d0/I:q	()Z
    //   246: istore 20
    //   248: iload 20
    //   250: ifne -25 -> 225
    //   253: aload_0
    //   254: getfield 276	k0/t0:G	Lk0/E0;
    //   257: invokevirtual 667	k0/E0:t	()Lk0/B0;
    //   260: astore 13
    //   262: aload 13
    //   264: ifnull +52 -> 316
    //   267: aload 13
    //   269: getfield 672	k0/B0:f	Lk0/C0;
    //   272: getfield 850	k0/C0:a	Lx0/x$b;
    //   275: aload 4
    //   277: invokevirtual 455	x0/x$b:equals	(Ljava/lang/Object;)Z
    //   280: ifeq +26 -> 306
    //   283: aload 13
    //   285: aload_0
    //   286: getfield 276	k0/t0:G	Lk0/E0;
    //   289: aload_1
    //   290: aload 13
    //   292: getfield 672	k0/B0:f	Lk0/C0;
    //   295: invokevirtual 937	k0/E0:v	(Ld0/I;Lk0/C0;)Lk0/C0;
    //   298: putfield 672	k0/B0:f	Lk0/C0;
    //   301: aload 13
    //   303: invokevirtual 939	k0/B0:C	()V
    //   306: aload 13
    //   308: invokevirtual 729	k0/B0:k	()Lk0/B0;
    //   311: astore 13
    //   313: goto -51 -> 262
    //   316: lload 16
    //   318: lstore 8
    //   320: aload_0
    //   321: aload 4
    //   323: lload 8
    //   325: iload 7
    //   327: invokevirtual 894	k0/t0:N0	(Lx0/x$b;JZ)J
    //   330: lstore 16
    //   332: lload 16
    //   334: lstore 8
    //   336: goto +17 -> 353
    //   339: astore 13
    //   341: goto -106 -> 235
    //   344: astore 13
    //   346: lload 16
    //   348: lstore 8
    //   350: goto -115 -> 235
    //   353: aload_0
    //   354: getfield 200	k0/t0:N	Lk0/U0;
    //   357: astore 21
    //   359: aload 21
    //   361: getfield 439	k0/U0:a	Ld0/I;
    //   364: astore 13
    //   366: aload 21
    //   368: getfield 419	k0/U0:b	Lx0/x$b;
    //   371: astore 21
    //   373: aload_3
    //   374: getfield 940	k0/t0$g:f	Z
    //   377: ifeq +10 -> 387
    //   380: lload 8
    //   382: lstore 16
    //   384: goto +8 -> 392
    //   387: ldc2_w 168
    //   390: lstore 16
    //   392: aload_0
    //   393: aload_1
    //   394: aload 4
    //   396: aload 13
    //   398: aload 21
    //   400: lload 16
    //   402: iconst_0
    //   403: invokevirtual 896	k0/t0:A1	(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V
    //   406: iload 10
    //   408: ifne +16 -> 424
    //   411: lload 5
    //   413: aload_0
    //   414: getfield 200	k0/t0:N	Lk0/U0;
    //   417: getfield 432	k0/U0:c	J
    //   420: lcmp
    //   421: ifeq +108 -> 529
    //   424: aload_0
    //   425: getfield 200	k0/t0:N	Lk0/U0;
    //   428: astore_3
    //   429: aload_3
    //   430: getfield 419	k0/U0:b	Lx0/x$b;
    //   433: getfield 423	x0/x$b:a	Ljava/lang/Object;
    //   436: astore 13
    //   438: aload_3
    //   439: getfield 439	k0/U0:a	Ld0/I;
    //   442: astore_3
    //   443: iload 10
    //   445: ifeq +35 -> 480
    //   448: iload_2
    //   449: ifeq +31 -> 480
    //   452: aload_3
    //   453: invokevirtual 409	d0/I:q	()Z
    //   456: ifne +24 -> 480
    //   459: aload_3
    //   460: aload 13
    //   462: aload_0
    //   463: getfield 254	k0/t0:z	Ld0/I$b;
    //   466: invokevirtual 313	d0/I:h	(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;
    //   469: getfield 394	d0/I$b:f	Z
    //   472: ifne +8 -> 480
    //   475: iconst_1
    //   476: istore_2
    //   477: goto +5 -> 482
    //   480: iconst_0
    //   481: istore_2
    //   482: aload_0
    //   483: getfield 200	k0/t0:N	Lk0/U0;
    //   486: getfield 855	k0/U0:d	J
    //   489: lstore 16
    //   491: aload_1
    //   492: aload 13
    //   494: invokevirtual 380	d0/I:b	(Ljava/lang/Object;)I
    //   497: iconst_m1
    //   498: if_icmpne +9 -> 507
    //   501: iconst_4
    //   502: istore 10
    //   504: goto +6 -> 510
    //   507: iconst_3
    //   508: istore 10
    //   510: aload_0
    //   511: aload_0
    //   512: aload 4
    //   514: lload 8
    //   516: lload 5
    //   518: lload 16
    //   520: iload_2
    //   521: iload 10
    //   523: invokevirtual 858	k0/t0:S	(Lx0/x$b;JJJZI)Lk0/U0;
    //   526: putfield 200	k0/t0:N	Lk0/U0;
    //   529: aload_0
    //   530: invokevirtual 942	k0/t0:B0	()V
    //   533: aload_0
    //   534: aload_1
    //   535: aload_0
    //   536: getfield 200	k0/t0:N	Lk0/U0;
    //   539: getfield 439	k0/U0:a	Ld0/I;
    //   542: invokevirtual 944	k0/t0:F0	(Ld0/I;Ld0/I;)V
    //   545: aload_0
    //   546: aload_0
    //   547: getfield 200	k0/t0:N	Lk0/U0;
    //   550: aload_1
    //   551: invokevirtual 947	k0/U0:j	(Ld0/I;)Lk0/U0;
    //   554: putfield 200	k0/t0:N	Lk0/U0;
    //   557: aload_1
    //   558: invokevirtual 409	d0/I:q	()Z
    //   561: ifne +8 -> 569
    //   564: aload_0
    //   565: aconst_null
    //   566: putfield 564	k0/t0:b0	Lk0/t0$h;
    //   569: aload_0
    //   570: iconst_0
    //   571: invokevirtual 949	k0/t0:N	(Z)V
    //   574: aload_0
    //   575: getfield 305	k0/t0:v	Lg0/k;
    //   578: iconst_2
    //   579: invokeinterface 951 2 0
    //   584: pop
    //   585: return
    //   586: aload_0
    //   587: getfield 200	k0/t0:N	Lk0/U0;
    //   590: astore 22
    //   592: aload 22
    //   594: getfield 439	k0/U0:a	Ld0/I;
    //   597: astore 21
    //   599: aload 22
    //   601: getfield 419	k0/U0:b	Lx0/x$b;
    //   604: astore 22
    //   606: lload 11
    //   608: lstore 16
    //   610: aload_3
    //   611: getfield 940	k0/t0$g:f	Z
    //   614: ifeq +7 -> 621
    //   617: lload 8
    //   619: lstore 16
    //   621: aload_0
    //   622: aload_1
    //   623: aload 4
    //   625: aload 21
    //   627: aload 22
    //   629: lload 16
    //   631: iconst_0
    //   632: invokevirtual 896	k0/t0:A1	(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V
    //   635: iload 10
    //   637: ifne +16 -> 653
    //   640: lload 5
    //   642: aload_0
    //   643: getfield 200	k0/t0:N	Lk0/U0;
    //   646: getfield 432	k0/U0:c	J
    //   649: lcmp
    //   650: ifeq +111 -> 761
    //   653: aload_0
    //   654: getfield 200	k0/t0:N	Lk0/U0;
    //   657: astore 21
    //   659: aload 21
    //   661: getfield 419	k0/U0:b	Lx0/x$b;
    //   664: getfield 423	x0/x$b:a	Ljava/lang/Object;
    //   667: astore_3
    //   668: aload 21
    //   670: getfield 439	k0/U0:a	Ld0/I;
    //   673: astore 21
    //   675: iload 10
    //   677: ifeq +36 -> 713
    //   680: iload_2
    //   681: ifeq +32 -> 713
    //   684: aload 21
    //   686: invokevirtual 409	d0/I:q	()Z
    //   689: ifne +24 -> 713
    //   692: aload 21
    //   694: aload_3
    //   695: aload_0
    //   696: getfield 254	k0/t0:z	Ld0/I$b;
    //   699: invokevirtual 313	d0/I:h	(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;
    //   702: getfield 394	d0/I$b:f	Z
    //   705: ifne +8 -> 713
    //   708: iconst_1
    //   709: istore_2
    //   710: goto +5 -> 715
    //   713: iconst_0
    //   714: istore_2
    //   715: aload_0
    //   716: getfield 200	k0/t0:N	Lk0/U0;
    //   719: getfield 855	k0/U0:d	J
    //   722: lstore 16
    //   724: aload_1
    //   725: aload_3
    //   726: invokevirtual 380	d0/I:b	(Ljava/lang/Object;)I
    //   729: iconst_m1
    //   730: if_icmpne +9 -> 739
    //   733: iconst_4
    //   734: istore 10
    //   736: goto +6 -> 742
    //   739: iconst_3
    //   740: istore 10
    //   742: aload_0
    //   743: aload_0
    //   744: aload 4
    //   746: lload 8
    //   748: lload 5
    //   750: lload 16
    //   752: iload_2
    //   753: iload 10
    //   755: invokevirtual 858	k0/t0:S	(Lx0/x$b;JJJZI)Lk0/U0;
    //   758: putfield 200	k0/t0:N	Lk0/U0;
    //   761: aload_0
    //   762: invokevirtual 942	k0/t0:B0	()V
    //   765: aload_0
    //   766: aload_1
    //   767: aload_0
    //   768: getfield 200	k0/t0:N	Lk0/U0;
    //   771: getfield 439	k0/U0:a	Ld0/I;
    //   774: invokevirtual 944	k0/t0:F0	(Ld0/I;Ld0/I;)V
    //   777: aload_0
    //   778: aload_0
    //   779: getfield 200	k0/t0:N	Lk0/U0;
    //   782: aload_1
    //   783: invokevirtual 947	k0/U0:j	(Ld0/I;)Lk0/U0;
    //   786: putfield 200	k0/t0:N	Lk0/U0;
    //   789: aload_1
    //   790: invokevirtual 409	d0/I:q	()Z
    //   793: ifne +8 -> 801
    //   796: aload_0
    //   797: aconst_null
    //   798: putfield 564	k0/t0:b0	Lk0/t0$h;
    //   801: aload_0
    //   802: iconst_0
    //   803: invokevirtual 949	k0/t0:N	(Z)V
    //   806: aload_0
    //   807: getfield 305	k0/t0:v	Lg0/k;
    //   810: iconst_2
    //   811: invokeinterface 951 2 0
    //   816: pop
    //   817: aload 13
    //   819: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	820	0	this	t0
    //   0	820	1	paramI	I
    //   0	820	2	paramBoolean	boolean
    //   32	694	3	localObject1	Object
    //   37	708	4	localb	x0.x.b
    //   43	706	5	l1	long
    //   49	277	7	bool1	boolean
    //   55	692	8	l2	long
    //   89	665	10	i	int
    //   100	507	11	l3	long
    //   128	1	13	localObject2	Object
    //   145	18	13	arrayOfY0	Y0[]
    //   179	1	13	localObject3	Object
    //   193	15	13	localE0	E0
    //   228	1	13	localObject4	Object
    //   233	1	13	localObject5	Object
    //   260	52	13	localB0	B0
    //   339	1	13	localObject6	Object
    //   344	1	13	localObject7	Object
    //   364	454	13	localObject8	Object
    //   150	10	14	j	int
    //   153	21	15	k	int
    //   199	552	16	l4	long
    //   205	8	18	l5	long
    //   246	3	20	bool2	boolean
    //   357	336	21	localObject9	Object
    //   590	38	22	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   102	125	128	finally
    //   133	141	128	finally
    //   141	147	128	finally
    //   147	152	179	finally
    //   162	173	179	finally
    //   207	225	228	finally
    //   242	248	228	finally
    //   267	306	228	finally
    //   306	313	228	finally
    //   189	207	233	finally
    //   320	332	339	finally
    //   253	262	344	finally
  }
  
  public final long O0(x0.x.b paramb, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    u1();
    B1(false, true);
    if ((paramBoolean2) || (N.e == 3)) {
      l1(2);
    }
    B0 localB01 = G.t();
    for (B0 localB02 = localB01; (localB02 != null) && (!paramb.equals(f.a)); localB02 = localB02.k()) {}
    if ((paramBoolean1) || (localB01 != localB02) || ((localB02 != null) && (localB02.B(paramLong) < 0L)))
    {
      paramb = o;
      int i = paramb.length;
      for (int j = 0; j < i; j++) {
        v(paramb[j]);
      }
      if (localB02 != null)
      {
        while (G.t() != localB02) {
          G.b();
        }
        G.I(localB02);
        localB02.z(1000000000000L);
        y();
      }
    }
    paramb = G;
    if (localB02 != null)
    {
      paramb.I(localB02);
      long l;
      if (!d)
      {
        f = f.b(paramLong);
        l = paramLong;
      }
      else
      {
        l = paramLong;
        if (e)
        {
          l = a.s(paramLong);
          a.q(l - A, B);
        }
      }
      C0(l);
      c0();
      paramLong = l;
    }
    else
    {
      paramb.f();
      C0(paramLong);
    }
    N(false);
    v.c(2);
    return paramLong;
  }
  
  public final void P(x0.v paramv)
  {
    if (!G.B(paramv)) {
      return;
    }
    B0 localB0 = G.m();
    localB0.q(C.h().a, N.a);
    w1(f.a, localB0.o(), localB0.p());
    if (localB0 == G.t())
    {
      C0(f.b);
      y();
      U0 localU0 = N;
      paramv = b;
      long l = f.b;
      N = S(paramv, l, c, l, false, 5);
    }
    c0();
  }
  
  public final void P0(V0 paramV0)
  {
    if (paramV0.f() == -9223372036854775807L)
    {
      Q0(paramV0);
    }
    else if (N.a.q())
    {
      D.add(new d(paramV0));
    }
    else
    {
      d locald = new d(paramV0);
      I localI = N.a;
      if (E0(locald, localI, localI, V, W, y, z))
      {
        D.add(locald);
        Collections.sort(D);
      }
      else
      {
        paramV0.k(false);
      }
    }
  }
  
  public final void Q(C paramC, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      if (paramBoolean2) {
        O.b(1);
      }
      N = N.g(paramC);
    }
    C1(a);
    for (Y0 localY0 : o) {
      if (localY0 != null) {
        localY0.I(paramFloat, a);
      }
    }
  }
  
  public final void Q0(V0 paramV0)
  {
    if (paramV0.c() == x)
    {
      u(paramV0);
      int i = N.e;
      if ((i == 3) || (i == 2)) {
        v.c(2);
      }
    }
    else
    {
      v.g(15, paramV0).a();
    }
  }
  
  public final void R(C paramC, boolean paramBoolean)
  {
    Q(paramC, a, true, paramBoolean);
  }
  
  public final void R0(V0 paramV0)
  {
    Looper localLooper = paramV0.c();
    if (!localLooper.getThread().isAlive())
    {
      o.h("TAG", "Trying to send message on a dead thread.");
      paramV0.k(false);
      return;
    }
    E.e(localLooper, null).j(new r0(this, paramV0));
  }
  
  public final U0 S(x0.x.b paramb, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, int paramInt)
  {
    boolean bool;
    if ((!f0) && (paramLong1 == N.s) && (paramb.equals(N.b))) {
      bool = false;
    } else {
      bool = true;
    }
    f0 = bool;
    B0();
    Object localObject = N;
    Z localZ = h;
    E localE = i;
    localObject = j;
    if (H.t())
    {
      B0 localB0 = G.t();
      if (localB0 == null) {
        localZ = Z.d;
      } else {
        localZ = localB0.o();
      }
      if (localB0 == null) {
        localE = s;
      } else {
        localE = localB0.p();
      }
      localObject = C(c);
      if (localB0 != null)
      {
        C0 localC0 = f;
        if (c != paramLong2) {
          f = localC0.a(paramLong2);
        }
      }
      g0();
    }
    else if (!paramb.equals(N.b))
    {
      localZ = Z.d;
      localE = s;
      localObject = X2.v.Y();
    }
    if (paramBoolean) {
      O.d(paramInt);
    }
    return N.d(paramb, paramLong1, paramLong2, paramLong3, J(), localZ, localE, (List)localObject);
  }
  
  public final void S0(long paramLong)
  {
    for (Y0 localY0 : o) {
      if (localY0.i() != null) {
        T0(localY0, paramLong);
      }
    }
  }
  
  public final boolean T(Y0 paramY0, B0 paramB0)
  {
    B0 localB0 = paramB0.k();
    boolean bool;
    if ((f.f) && (d) && (((paramY0 instanceof i)) || ((paramY0 instanceof u0.c)) || (paramY0.w() >= localB0.n()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void T0(Y0 paramY0, long paramLong)
  {
    paramY0.u();
    if ((paramY0 instanceof i)) {
      ((i)paramY0).w0(paramLong);
    }
  }
  
  public final boolean U()
  {
    B0 localB0 = G.u();
    if (!d) {
      return false;
    }
    for (int i = 0;; i++)
    {
      Object localObject = o;
      if (i >= localObject.length) {
        break label88;
      }
      Y0 localY0 = localObject[i];
      localObject = c[i];
      if ((localY0.i() != localObject) || ((localObject != null) && (!localY0.p()) && (!T(localY0, localB0)))) {
        break;
      }
    }
    return false;
    label88:
    return true;
  }
  
  public final void U0(boolean paramBoolean, AtomicBoolean paramAtomicBoolean)
  {
    if (X != paramBoolean)
    {
      X = paramBoolean;
      if (!paramBoolean) {
        for (Y0 localY0 : o) {
          if ((!X(localY0)) && (p.remove(localY0))) {
            localY0.b();
          }
        }
      }
    }
    if (paramAtomicBoolean != null) {
      try
      {
        paramAtomicBoolean.set(true);
        notifyAll();
      }
      finally {}
    }
  }
  
  public final void V0(C paramC)
  {
    v.f(16);
    C.k(paramC);
  }
  
  public final boolean W()
  {
    B0 localB0 = G.m();
    if (localB0 == null) {
      return false;
    }
    if (localB0.r()) {
      return false;
    }
    return localB0.l() != Long.MIN_VALUE;
  }
  
  public final void W0(b paramb)
  {
    O.b(1);
    if (b.a(paramb) != -1) {
      b0 = new h(new W0(b.b(paramb), b.c(paramb)), b.a(paramb), b.d(paramb));
    }
    O(H.C(b.b(paramb), b.c(paramb)), false);
  }
  
  public void X0(List paramList, int paramInt, long paramLong, T paramT)
  {
    v.g(17, new b(paramList, paramT, paramInt, paramLong, null)).a();
  }
  
  public final boolean Y()
  {
    B0 localB0 = G.t();
    long l = f.e;
    boolean bool;
    if ((d) && ((l == -9223372036854775807L) || (N.s < l) || (!o1()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void Y0(boolean paramBoolean)
  {
    if (paramBoolean == Z) {
      return;
    }
    Z = paramBoolean;
    if ((!paramBoolean) && (N.p)) {
      v.c(2);
    }
  }
  
  public final void Z0(boolean paramBoolean)
  {
    Q = paramBoolean;
    B0();
    if ((R) && (G.u() != G.t()))
    {
      L0(true);
      N(false);
    }
  }
  
  public void a(Y0 paramY0)
  {
    v.c(26);
  }
  
  public void a1(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    v.b(1, paramBoolean, paramInt1 | paramInt2 << 4).a();
  }
  
  public void b()
  {
    v.f(2);
    v.c(22);
  }
  
  public final void b1(boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2)
  {
    O.b(paramBoolean2);
    N = N.e(paramBoolean1, paramInt2, paramInt1);
    B1(false, false);
    o0(paramBoolean1);
    if (!o1())
    {
      u1();
      z1();
    }
    else
    {
      paramInt1 = N.e;
      if (paramInt1 == 3)
      {
        C.e();
        r1();
      }
      while (paramInt1 == 2)
      {
        v.c(2);
        break;
      }
    }
  }
  
  public void c(V0 paramV0)
  {
    label66:
    try
    {
      if ((!P) && (x.getThread().isAlive()))
      {
        v.g(14, paramV0).a();
        return;
      }
    }
    finally
    {
      break label66;
      o.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
      paramV0.k(false);
      return;
    }
  }
  
  public final void c0()
  {
    boolean bool = n1();
    U = bool;
    if (bool) {
      G.m().e(c0, C.h().a, T);
    }
    v1();
  }
  
  public void c1(C paramC)
  {
    v.g(4, paramC).a();
  }
  
  public void d()
  {
    v.c(10);
  }
  
  public final void d0()
  {
    O.c(N);
    if (e.a(O))
    {
      F.a(O);
      O = new e(N);
    }
  }
  
  public final void d1(C paramC)
  {
    V0(paramC);
    R(C.h(), true);
  }
  
  /* Error */
  public final void e0(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   4: invokevirtual 1169	java/util/ArrayList:isEmpty	()Z
    //   7: ifne +506 -> 513
    //   10: aload_0
    //   11: getfield 200	k0/t0:N	Lk0/U0;
    //   14: getfield 419	k0/U0:b	Lx0/x$b;
    //   17: invokevirtual 428	x0/x$b:b	()Z
    //   20: ifeq +6 -> 26
    //   23: goto +490 -> 513
    //   26: lload_1
    //   27: lstore 5
    //   29: aload_0
    //   30: getfield 259	k0/t0:f0	Z
    //   33: ifeq +13 -> 46
    //   36: lload_1
    //   37: lconst_1
    //   38: lsub
    //   39: lstore 5
    //   41: aload_0
    //   42: iconst_0
    //   43: putfield 259	k0/t0:f0	Z
    //   46: aload_0
    //   47: getfield 200	k0/t0:N	Lk0/U0;
    //   50: astore 7
    //   52: aload 7
    //   54: getfield 439	k0/U0:a	Ld0/I;
    //   57: aload 7
    //   59: getfield 419	k0/U0:b	Lx0/x$b;
    //   62: getfield 423	x0/x$b:a	Ljava/lang/Object;
    //   65: invokevirtual 380	d0/I:b	(Ljava/lang/Object;)I
    //   68: istore 8
    //   70: aload_0
    //   71: getfield 1171	k0/t0:e0	I
    //   74: aload_0
    //   75: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   78: invokevirtual 766	java/util/ArrayList:size	()I
    //   81: invokestatic 1173	java/lang/Math:min	(II)I
    //   84: istore 9
    //   86: iload 9
    //   88: ifle +22 -> 110
    //   91: aload_0
    //   92: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   95: iload 9
    //   97: iconst_1
    //   98: isub
    //   99: invokevirtual 768	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   102: checkcast 26	k0/t0$d
    //   105: astore 7
    //   107: goto +6 -> 113
    //   110: aconst_null
    //   111: astore 7
    //   113: aload 7
    //   115: ifnull +75 -> 190
    //   118: aload 7
    //   120: getfield 392	k0/t0$d:p	I
    //   123: istore 10
    //   125: iload 10
    //   127: iload 8
    //   129: if_icmpgt +21 -> 150
    //   132: iload 10
    //   134: iload 8
    //   136: if_icmpne +54 -> 190
    //   139: aload 7
    //   141: getfield 398	k0/t0$d:q	J
    //   144: lload 5
    //   146: lcmp
    //   147: ifle +43 -> 190
    //   150: iload 9
    //   152: iconst_1
    //   153: isub
    //   154: istore 10
    //   156: iload 10
    //   158: ifle +22 -> 180
    //   161: aload_0
    //   162: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   165: iload 9
    //   167: iconst_2
    //   168: isub
    //   169: invokevirtual 768	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   172: checkcast 26	k0/t0$d
    //   175: astore 7
    //   177: goto +6 -> 183
    //   180: aconst_null
    //   181: astore 7
    //   183: iload 10
    //   185: istore 9
    //   187: goto -74 -> 113
    //   190: iload 9
    //   192: istore 10
    //   194: lload 5
    //   196: lstore 11
    //   198: iload 9
    //   200: aload_0
    //   201: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   204: invokevirtual 766	java/util/ArrayList:size	()I
    //   207: if_icmpge +23 -> 230
    //   210: lload 5
    //   212: lstore_1
    //   213: aload_0
    //   214: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   217: iload 9
    //   219: invokevirtual 768	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   222: checkcast 26	k0/t0$d
    //   225: astore 13
    //   227: goto +13 -> 240
    //   230: aconst_null
    //   231: astore 13
    //   233: lload 11
    //   235: lstore_1
    //   236: iload 10
    //   238: istore 9
    //   240: iload 9
    //   242: istore 10
    //   244: aload 13
    //   246: astore 7
    //   248: aload 13
    //   250: ifnull +91 -> 341
    //   253: iload 9
    //   255: istore 10
    //   257: aload 13
    //   259: astore 7
    //   261: aload 13
    //   263: getfield 310	k0/t0$d:r	Ljava/lang/Object;
    //   266: ifnull +75 -> 341
    //   269: aload 13
    //   271: getfield 392	k0/t0$d:p	I
    //   274: istore 14
    //   276: iload 14
    //   278: iload 8
    //   280: if_icmplt +36 -> 316
    //   283: iload 9
    //   285: istore 10
    //   287: aload 13
    //   289: astore 7
    //   291: iload 14
    //   293: iload 8
    //   295: if_icmpne +46 -> 341
    //   298: iload 9
    //   300: istore 10
    //   302: aload 13
    //   304: astore 7
    //   306: aload 13
    //   308: getfield 398	k0/t0$d:q	J
    //   311: lload_1
    //   312: lcmp
    //   313: ifgt +28 -> 341
    //   316: iinc 9 1
    //   319: iload 9
    //   321: istore 10
    //   323: lload_1
    //   324: lstore 11
    //   326: iload 9
    //   328: aload_0
    //   329: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   332: invokevirtual 766	java/util/ArrayList:size	()I
    //   335: if_icmpge -105 -> 230
    //   338: goto -125 -> 213
    //   341: aload 7
    //   343: ifnull +164 -> 507
    //   346: aload 7
    //   348: getfield 310	k0/t0$d:r	Ljava/lang/Object;
    //   351: ifnull +156 -> 507
    //   354: aload 7
    //   356: getfield 392	k0/t0$d:p	I
    //   359: iload 8
    //   361: if_icmpne +146 -> 507
    //   364: aload 7
    //   366: getfield 398	k0/t0$d:q	J
    //   369: lstore 5
    //   371: lload 5
    //   373: lload_1
    //   374: lcmp
    //   375: ifle +132 -> 507
    //   378: lload 5
    //   380: lload_3
    //   381: lcmp
    //   382: ifgt +125 -> 507
    //   385: aload_0
    //   386: aload 7
    //   388: getfield 350	k0/t0$d:o	Lk0/V0;
    //   391: invokevirtual 980	k0/t0:Q0	(Lk0/V0;)V
    //   394: aload 7
    //   396: getfield 350	k0/t0$d:o	Lk0/V0;
    //   399: invokevirtual 1174	k0/V0:b	()Z
    //   402: ifne +23 -> 425
    //   405: aload 7
    //   407: getfield 350	k0/t0$d:o	Lk0/V0;
    //   410: invokevirtual 1176	k0/V0:j	()Z
    //   413: ifeq +6 -> 419
    //   416: goto +9 -> 425
    //   419: iinc 10 1
    //   422: goto +13 -> 435
    //   425: aload_0
    //   426: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   429: iload 10
    //   431: invokevirtual 775	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   434: pop
    //   435: iload 10
    //   437: aload_0
    //   438: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   441: invokevirtual 766	java/util/ArrayList:size	()I
    //   444: if_icmpge +20 -> 464
    //   447: aload_0
    //   448: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   451: iload 10
    //   453: invokevirtual 768	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   456: checkcast 26	k0/t0$d
    //   459: astore 7
    //   461: goto -120 -> 341
    //   464: aconst_null
    //   465: astore 7
    //   467: goto -126 -> 341
    //   470: astore 13
    //   472: aload 7
    //   474: getfield 350	k0/t0$d:o	Lk0/V0;
    //   477: invokevirtual 1174	k0/V0:b	()Z
    //   480: ifne +14 -> 494
    //   483: aload 7
    //   485: getfield 350	k0/t0$d:o	Lk0/V0;
    //   488: invokevirtual 1176	k0/V0:j	()Z
    //   491: ifeq +13 -> 504
    //   494: aload_0
    //   495: getfield 237	k0/t0:D	Ljava/util/ArrayList;
    //   498: iload 10
    //   500: invokevirtual 775	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   503: pop
    //   504: aload 13
    //   506: athrow
    //   507: aload_0
    //   508: iload 10
    //   510: putfield 1171	k0/t0:e0	I
    //   513: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	514	0	this	t0
    //   0	514	1	paramLong1	long
    //   0	514	3	paramLong2	long
    //   27	352	5	l1	long
    //   50	434	7	localObject1	Object
    //   68	294	8	i	int
    //   84	252	9	j	int
    //   123	386	10	k	int
    //   196	129	11	l2	long
    //   225	82	13	locald	d
    //   470	35	13	localObject2	Object
    //   274	22	14	m	int
    // Exception table:
    //   from	to	target	type
    //   385	394	470	finally
  }
  
  public final void e1(w.c paramc)
  {
    j0 = paramc;
    G.Q(N.a, paramc);
  }
  
  public final boolean f0()
  {
    G.F(c0);
    boolean bool1 = G.O();
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      C0 localC0 = G.s(c0, N);
      bool3 = bool2;
      if (localC0 != null)
      {
        B0 localB0 = G.g(localC0);
        a.u(this, b);
        if (G.t() == localB0) {
          C0(b);
        }
        N(false);
        bool3 = true;
      }
    }
    if (U)
    {
      U = W();
      v1();
    }
    else
    {
      c0();
    }
    return bool3;
  }
  
  public void f1(int paramInt)
  {
    v.b(11, paramInt, 0).a();
  }
  
  public final void g0()
  {
    Object localObject = G.t();
    if (localObject != null)
    {
      localObject = ((B0)localObject).p();
      boolean bool1 = false;
      int i = 0;
      for (int j = i; i < o.length; j = k)
      {
        k = j;
        if (((E)localObject).c(i))
        {
          if (o[i].l() != 1)
          {
            k = 0;
            break label98;
          }
          k = j;
          if (b[i].a != 0) {
            k = 1;
          }
        }
        i++;
      }
      int k = 1;
      label98:
      boolean bool2 = bool1;
      if (j != 0)
      {
        bool2 = bool1;
        if (k != 0) {
          bool2 = true;
        }
      }
      Y0(bool2);
    }
  }
  
  public final void g1(int paramInt)
  {
    V = paramInt;
    if (!G.S(N.a, paramInt)) {
      L0(true);
    }
    N(false);
  }
  
  public final void h0()
  {
    for (int i = 0; m1(); i = 1)
    {
      if (i != 0) {
        d0();
      }
      B0 localB0 = (B0)g0.a.e(G.b());
      if (N.b.a.equals(f.a.a))
      {
        localObject = N.b;
        if (b == -1)
        {
          localb = f.a;
          if ((b == -1) && (e != e))
          {
            i = 1;
            break label110;
          }
        }
      }
      i = 0;
      label110:
      Object localObject = f;
      x0.x.b localb = a;
      long l = b;
      N = S(localb, l, c, l, i ^ 0x1, 0);
      B0();
      z1();
      if (N.e == 3) {
        r1();
      }
      r();
    }
  }
  
  public final void h1(d1 paramd1)
  {
    M = paramd1;
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = 1000;
    try
    {
      switch (what)
      {
      case 24: 
      default: 
        return false;
      }
    }
    catch (RuntimeException paramMessage)
    {
      break label593;
    }
    catch (IOException paramMessage)
    {
      break label650;
    }
    catch (b paramMessage)
    {
      break label663;
    }
    catch (h paramMessage)
    {
      break label670;
    }
    catch (A paramMessage)
    {
      break label678;
    }
    catch (n.a paramMessage)
    {
      break label747;
    }
    catch (u localu) {}
    s0();
    break label1048;
    e1((w.c)obj);
    break label1048;
    x1(arg1, arg2, (List)obj);
    break label1048;
    z0();
    break label1048;
    s();
    break label1048;
    boolean bool;
    if (arg1 != 0) {
      bool = true;
    } else {
      bool = false;
    }
    Z0(bool);
    break label1048;
    l0();
    break label1048;
    k1((T)obj);
    break label1048;
    w0(arg1, arg2, (T)obj);
    break label1048;
    android.support.v4.media.a.a(obj);
    m0(null);
    break label1048;
    q((b)obj, arg1);
    break label1048;
    W0((b)obj);
    break label1048;
    R((C)obj, false);
    break label1048;
    R0((V0)obj);
    break label1048;
    P0((V0)obj);
    break label1048;
    if (arg1 != 0) {
      bool = true;
    } else {
      bool = false;
    }
    U0(bool, (AtomicBoolean)obj);
    break label1048;
    if (arg1 != 0) {
      bool = true;
    } else {
      bool = false;
    }
    j1(bool);
    break label1048;
    g1(arg1);
    break label1048;
    y0();
    break label1048;
    L((x0.v)obj);
    break label1048;
    P((x0.v)obj);
    break label1048;
    u0();
    return true;
    t1(false, true);
    break label1048;
    h1((d1)obj);
    break label1048;
    d1((C)obj);
    break label1048;
    M0((h)obj);
    break label1048;
    w();
    break label1048;
    if (arg1 != 0) {
      bool = true;
    } else {
      bool = false;
    }
    int j = arg2;
    b1(bool, j >> 4, true, j & 0xF);
    break label1048;
    label593:
    if (((paramMessage instanceof IllegalStateException)) || ((paramMessage instanceof IllegalArgumentException))) {
      i = 1004;
    }
    paramMessage = u.d(paramMessage, i);
    o.d("ExoPlayerImplInternal", "Playback error", paramMessage);
    t1(true, false);
    label650:
    label663:
    label670:
    label678:
    label747:
    Object localObject1;
    for (paramMessage = N.f(paramMessage);; paramMessage = N.f((u)localObject1))
    {
      N = paramMessage;
      break;
      i = 2000;
      for (;;)
      {
        M(paramMessage, i);
        break;
        i = 1002;
        continue;
        i = o;
        continue;
        j = p;
        if (j == 1) {
          if (o) {
            i = 3001;
          }
        }
        for (;;)
        {
          break;
          i = 3003;
          continue;
          if (j != 4) {
            break;
          }
          if (o) {
            i = 3002;
          } else {
            i = 3004;
          }
        }
        M(paramMessage, i);
        break;
        i = o;
      }
      paramMessage = localu;
      if (x == 1)
      {
        localObject2 = G.u();
        paramMessage = localu;
        if (localObject2 != null) {
          paramMessage = localu.a(f.a);
        }
      }
      if (D) {
        if (g0 != null)
        {
          i = o;
          if ((i != 5004) && (i != 5003)) {}
        }
        else
        {
          o.i("ExoPlayerImplInternal", "Recoverable renderer error", paramMessage);
          localObject1 = g0;
          if (localObject1 != null)
          {
            ((Throwable)localObject1).addSuppressed(paramMessage);
            paramMessage = g0;
          }
          else
          {
            g0 = paramMessage;
          }
          localObject1 = v;
          ((k)localObject1).d(((k)localObject1).g(25, paramMessage));
          break;
        }
      }
      Object localObject2 = g0;
      localObject1 = paramMessage;
      if (localObject2 != null)
      {
        ((Throwable)localObject2).addSuppressed(paramMessage);
        localObject1 = g0;
      }
      o.d("ExoPlayerImplInternal", "Playback error", (Throwable)localObject1);
      if ((x == 1) && (G.t() != G.u()))
      {
        while (G.t() != G.u()) {
          G.b();
        }
        paramMessage = (B0)g0.a.e(G.t());
        d0();
        paramMessage = f;
        localObject2 = a;
        long l = b;
        N = S((x0.x.b)localObject2, l, c, l, true, 0);
      }
      t1(true, false);
    }
    label1048:
    d0();
    return true;
  }
  
  public final void i0(boolean paramBoolean)
  {
    if ((j0.a != -9223372036854775807L) && ((paramBoolean) || (!N.a.equals(k0))))
    {
      I localI = N.a;
      k0 = localI;
      G.x(localI);
    }
  }
  
  public void i1(boolean paramBoolean)
  {
    v.b(12, paramBoolean, 0).a();
  }
  
  public void j(C paramC)
  {
    v.g(16, paramC).a();
  }
  
  public final void j0()
  {
    Object localObject1 = G.u();
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = ((B0)localObject1).k();
    int i = 0;
    E localE2;
    if ((localObject2 != null) && (!R))
    {
      if (!U()) {
        return;
      }
      if ((!kd) && (c0 < ((B0)localObject1).k().n())) {
        return;
      }
      E localE1 = ((B0)localObject1).p();
      localObject2 = G.c();
      localE2 = ((B0)localObject2).p();
      Object localObject3 = N.a;
      A1((I)localObject3, f.a, (I)localObject3, f.a, -9223372036854775807L, false);
      if ((d) && (a.l() != -9223372036854775807L))
      {
        S0(((B0)localObject2).n());
        if (!((B0)localObject2).s())
        {
          G.I((B0)localObject2);
          N(false);
          c0();
        }
        return;
      }
      for (j = 0; j < o.length; j++)
      {
        boolean bool1 = localE1.c(j);
        boolean bool2 = localE2.c(j);
        if ((bool1) && (!o[j].A()))
        {
          if (q[j].l() == -2) {
            i = 1;
          } else {
            i = 0;
          }
          localObject1 = b[j];
          localObject3 = b[j];
          if ((!bool2) || (!((b1)localObject3).equals(localObject1)) || (i != 0)) {
            T0(o[j], ((B0)localObject2).n());
          }
        }
      }
      return;
    }
    int j = i;
    if (!f.i)
    {
      if (!R) {}
    }
    else {
      for (j = i;; j++)
      {
        localObject2 = o;
        if (j >= localObject2.length) {
          break;
        }
        localE2 = localObject2[j];
        localObject2 = c[j];
        if ((localObject2 != null) && (localE2.i() == localObject2) && (localE2.p()))
        {
          long l = f.e;
          if ((l != -9223372036854775807L) && (l != Long.MIN_VALUE)) {
            l = ((B0)localObject1).m() + f.e;
          } else {
            l = -9223372036854775807L;
          }
          T0(localE2, l);
        }
      }
    }
  }
  
  public final void j1(boolean paramBoolean)
  {
    W = paramBoolean;
    if (!G.T(N.a, paramBoolean)) {
      L0(true);
    }
    N(false);
  }
  
  public void k(x0.v paramv)
  {
    v.g(8, paramv).a();
  }
  
  public final void k0()
  {
    B0 localB0 = G.u();
    if ((localB0 != null) && (G.t() != localB0) && (!g) && (x0())) {
      y();
    }
  }
  
  public final void k1(T paramT)
  {
    O.b(1);
    O(H.D(paramT), false);
  }
  
  public final void l0()
  {
    O(H.i(), true);
  }
  
  public final void l1(int paramInt)
  {
    U0 localU0 = N;
    if (e != paramInt)
    {
      if (paramInt != 2) {
        i0 = -9223372036854775807L;
      }
      N = localU0.h(paramInt);
    }
  }
  
  public final void m0(c paramc)
  {
    O.b(1);
    throw null;
  }
  
  public final boolean m1()
  {
    boolean bool1 = o1();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (R) {
      return false;
    }
    B0 localB0 = G.t();
    if (localB0 == null) {
      return false;
    }
    localB0 = localB0.k();
    bool1 = bool2;
    if (localB0 != null)
    {
      bool1 = bool2;
      if (c0 >= localB0.n())
      {
        bool1 = bool2;
        if (g) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final void n0()
  {
    for (B0 localB0 = G.t(); localB0 != null; localB0 = localB0.k()) {
      for (y localy : pc) {
        if (localy != null) {
          localy.t();
        }
      }
    }
  }
  
  public final boolean n1()
  {
    if (!W()) {
      return false;
    }
    Object localObject = G.m();
    long l1 = K(((B0)localObject).l());
    if (localObject == G.t()) {}
    for (long l2 = ((B0)localObject).A(c0);; l2 = ((B0)localObject).A(c0) - f.b) {
      break;
    }
    if (q1(N.a, f.a)) {}
    for (long l3 = I.e();; l3 = -9223372036854775807L) {
      break;
    }
    localObject = new x0.a(K, N.a, f.a, l2, l1, C.h().a, N.l, S, l3);
    boolean bool1 = t.c((x0.a)localObject);
    B0 localB0 = G.t();
    boolean bool2 = bool1;
    if (!bool1)
    {
      bool2 = bool1;
      if (d)
      {
        bool2 = bool1;
        if (l1 < 500000L) {
          if (A <= 0L)
          {
            bool2 = bool1;
            if (!B) {}
          }
          else
          {
            a.q(N.s, false);
            bool2 = t.c((x0.a)localObject);
          }
        }
      }
    }
    return bool2;
  }
  
  public final void o0(boolean paramBoolean)
  {
    for (B0 localB0 = G.t(); localB0 != null; localB0 = localB0.k()) {
      for (y localy : pc) {
        if (localy != null) {
          localy.h(paramBoolean);
        }
      }
    }
  }
  
  public final boolean o1()
  {
    U0 localU0 = N;
    boolean bool;
    if ((l) && (n == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void p0()
  {
    for (B0 localB0 = G.t(); localB0 != null; localB0 = localB0.k()) {
      for (y localy : pc) {
        if (localy != null) {
          localy.u();
        }
      }
    }
  }
  
  public final boolean p1(boolean paramBoolean)
  {
    if (a0 == 0) {
      return Y();
    }
    boolean bool = false;
    if (!paramBoolean) {
      return false;
    }
    if (!N.g) {
      return true;
    }
    B0 localB01 = G.t();
    if (q1(N.a, f.a)) {}
    for (long l = I.e();; l = -9223372036854775807L) {
      break;
    }
    B0 localB02 = G.m();
    int i;
    if ((localB02.s()) && (f.i)) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((f.a.b()) && (!d)) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i == 0) && (j == 0))
    {
      paramBoolean = bool;
      if (!t.e(new x0.a(K, N.a, f.a, localB01.A(c0), J(), C.h().a, N.l, S, l))) {}
    }
    else
    {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public final void q(b paramb, int paramInt)
  {
    O.b(1);
    T0 localT0 = H;
    int i = paramInt;
    if (paramInt == -1) {
      i = localT0.r();
    }
    O(localT0.f(i, b.b(paramb), b.c(paramb)), false);
  }
  
  public void q0(x0.v paramv)
  {
    v.g(9, paramv).a();
  }
  
  public final boolean q1(I paramI, x0.x.b paramb)
  {
    boolean bool1 = paramb.b();
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (!bool1) {
      if (paramI.q())
      {
        bool3 = bool2;
      }
      else
      {
        paramI.n(ha, z).c, y);
        bool3 = bool2;
        if (y.f())
        {
          paramI = y;
          bool3 = bool2;
          if (i)
          {
            bool3 = bool2;
            if (f != -9223372036854775807L) {
              bool3 = true;
            }
          }
        }
      }
    }
    return bool3;
  }
  
  public final void r()
  {
    E localE = G.t().p();
    for (int i = 0; i < o.length; i++) {
      if (localE.c(i)) {
        o[i].j();
      }
    }
  }
  
  public void r0()
  {
    v.k(29).a();
  }
  
  public final void r1()
  {
    Object localObject = G.t();
    if (localObject == null) {
      return;
    }
    localObject = ((B0)localObject).p();
    for (int i = 0; i < o.length; i++) {
      if ((((E)localObject).c(i)) && (o[i].getState() == 1)) {
        o[i].start();
      }
    }
  }
  
  public final void s()
  {
    z0();
  }
  
  public final void s0()
  {
    O.b(1);
    A0(false, false, false, true);
    t.a(K);
    int i;
    if (N.a.q()) {
      i = 4;
    } else {
      i = 2;
    }
    l1(i);
    H.w(u.a());
    v.c(2);
  }
  
  public void s1()
  {
    v.k(6).a();
  }
  
  public final B0 t(C0 paramC0, long paramLong)
  {
    return new B0(q, paramLong, r, t.i(), H, paramC0, s);
  }
  
  public boolean t0()
  {
    label72:
    try
    {
      if ((!P) && (x.getThread().isAlive()))
      {
        v.c(7);
        q0 localq0 = new k0/q0;
        localq0.<init>(this);
        D1(localq0, J);
        boolean bool = P;
        return bool;
      }
    }
    finally
    {
      break label72;
      return true;
    }
  }
  
  public final void t1(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (X)) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    A0(paramBoolean1, false, true, false);
    O.b(paramBoolean2);
    t.g(K);
    l1(1);
  }
  
  public final void u(V0 paramV0)
  {
    if (paramV0.j()) {
      return;
    }
    try
    {
      paramV0.g().t(paramV0.i(), paramV0.e());
      return;
    }
    finally
    {
      paramV0.k(true);
    }
  }
  
  /* Error */
  public final void u0()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: iconst_0
    //   3: iconst_1
    //   4: iconst_0
    //   5: invokevirtual 882	k0/t0:A0	(ZZZZ)V
    //   8: aload_0
    //   9: invokevirtual 1472	k0/t0:v0	()V
    //   12: aload_0
    //   13: getfield 143	k0/t0:t	Lk0/x0;
    //   16: aload_0
    //   17: getfield 165	k0/t0:K	Ll0/y1;
    //   20: invokeinterface 1474 2 0
    //   25: aload_0
    //   26: iconst_1
    //   27: invokevirtual 880	k0/t0:l1	(I)V
    //   30: aload_0
    //   31: getfield 285	k0/t0:w	Landroid/os/HandlerThread;
    //   34: astore_1
    //   35: aload_1
    //   36: ifnull +8 -> 44
    //   39: aload_1
    //   40: invokevirtual 1477	android/os/HandlerThread:quit	()Z
    //   43: pop
    //   44: aload_0
    //   45: monitorenter
    //   46: aload_0
    //   47: iconst_1
    //   48: putfield 1109	k0/t0:P	Z
    //   51: aload_0
    //   52: invokevirtual 1068	java/lang/Object:notifyAll	()V
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: astore_1
    //   64: aload_0
    //   65: getfield 285	k0/t0:w	Landroid/os/HandlerThread;
    //   68: astore_2
    //   69: aload_2
    //   70: ifnull +8 -> 78
    //   73: aload_2
    //   74: invokevirtual 1477	android/os/HandlerThread:quit	()Z
    //   77: pop
    //   78: aload_0
    //   79: monitorenter
    //   80: aload_0
    //   81: iconst_1
    //   82: putfield 1109	k0/t0:P	Z
    //   85: aload_0
    //   86: invokevirtual 1068	java/lang/Object:notifyAll	()V
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    //   93: astore_1
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_1
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	t0
    //   34	6	1	localHandlerThread1	HandlerThread
    //   58	4	1	localObject1	Object
    //   63	29	1	localObject2	Object
    //   93	4	1	localObject3	Object
    //   68	6	2	localHandlerThread2	HandlerThread
    // Exception table:
    //   from	to	target	type
    //   46	57	58	finally
    //   59	61	58	finally
    //   0	30	63	finally
    //   80	91	93	finally
    //   94	96	93	finally
  }
  
  public final void u1()
  {
    C.f();
    for (Y0 localY0 : o) {
      if (X(localY0)) {
        A(localY0);
      }
    }
  }
  
  public final void v(Y0 paramY0)
  {
    if (!X(paramY0)) {
      return;
    }
    C.a(paramY0);
    A(paramY0);
    paramY0.g();
    a0 -= 1;
  }
  
  public final void v0()
  {
    for (int i = 0; i < o.length; i++)
    {
      q[i].o();
      o[i].release();
    }
  }
  
  public final void v1()
  {
    Object localObject = G.m();
    boolean bool;
    if ((!U) && ((localObject == null) || (!a.b()))) {
      bool = false;
    } else {
      bool = true;
    }
    localObject = N;
    if (bool != g) {
      N = ((U0)localObject).b(bool);
    }
  }
  
  public final void w()
  {
    long l1 = E.d();
    v.f(2);
    y1();
    int i = N.e;
    boolean bool1 = true;
    if ((i != 1) && (i != 4))
    {
      Object localObject1 = G.t();
      if (localObject1 == null)
      {
        J0(l1);
        return;
      }
      F.a("doSomeWork");
      z1();
      boolean bool3;
      Object localObject2;
      int j;
      if (d)
      {
        d0 = M.J0(E.b());
        a.q(N.s - A, B);
        boolean bool2 = true;
        bool3 = bool2;
        i = 0;
        for (;;)
        {
          localObject2 = o;
          bool4 = bool2;
          bool5 = bool3;
          if (i >= localObject2.length) {
            break;
          }
          localObject2 = localObject2[i];
          if (!X((Y0)localObject2))
          {
            bool5 = bool2;
            bool4 = bool3;
          }
          else
          {
            ((Y0)localObject2).f(c0, d0);
            if ((bool2) && (((Y0)localObject2).c())) {
              bool2 = true;
            } else {
              bool2 = false;
            }
            if (c[i] != ((Y0)localObject2).i()) {
              j = 1;
            } else {
              j = 0;
            }
            int k;
            if ((j == 0) && (((Y0)localObject2).p())) {
              k = 1;
            } else {
              k = 0;
            }
            if ((j == 0) && (k == 0) && (!((Y0)localObject2).e()) && (!((Y0)localObject2).c())) {
              j = 0;
            } else {
              j = 1;
            }
            if ((bool3) && (j != 0)) {
              bool3 = true;
            } else {
              bool3 = false;
            }
            bool5 = bool2;
            bool4 = bool3;
            if (j == 0)
            {
              ((Y0)localObject2).v();
              bool4 = bool3;
              bool5 = bool2;
            }
          }
          i++;
          bool2 = bool5;
          bool3 = bool4;
        }
      }
      a.p();
      boolean bool4 = true;
      boolean bool5 = bool4;
      long l2 = f.e;
      if ((bool4) && (d) && ((l2 == -9223372036854775807L) || (l2 <= N.s))) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i != 0) && (R))
      {
        R = false;
        b1(false, N.n, false, 5);
      }
      if ((i != 0) && (f.i)) {
        l1(4);
      }
      for (;;)
      {
        u1();
        break;
        if ((N.e == 2) && (p1(bool5)))
        {
          l1(3);
          g0 = null;
          if (!o1()) {
            break;
          }
          B1(false, false);
          C.e();
          r1();
          break;
        }
        if ((N.e != 3) || (a0 == 0 ? Y() : bool5)) {
          break;
        }
        B1(o1(), false);
        l1(2);
        if (S)
        {
          p0();
          I.a();
        }
      }
      if (N.e == 2)
      {
        for (i = 0;; i++)
        {
          localObject2 = o;
          if (i >= localObject2.length) {
            break;
          }
          if ((X(localObject2[i])) && (o[i].i() == c[i])) {
            o[i].v();
          }
        }
        localObject1 = N;
        if ((!g) && (r < 500000L) && (W())) {
          if (i0 != -9223372036854775807L) {}
        }
      }
      for (l2 = E.b();; l2 = -9223372036854775807L)
      {
        i0 = l2;
        break;
        if (E.b() - i0 < 4000L) {
          break;
        }
        throw new IllegalStateException("Playback stuck buffering and not loading");
      }
      if ((o1()) && (N.e == 3)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((Z) && (Y) && (i != 0)) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
      localObject1 = N;
      if (p != bool3) {
        N = ((U0)localObject1).i(bool3);
      }
      Y = false;
      if (!bool3)
      {
        j = N.e;
        if ((j != 4) && ((i != 0) || (j == 2) || ((j == 3) && (a0 != 0)))) {
          J0(l1);
        }
      }
      F.b();
    }
  }
  
  public final void w0(int paramInt1, int paramInt2, T paramT)
  {
    O.b(1);
    O(H.A(paramInt1, paramInt2, paramT), false);
  }
  
  public final void w1(x0.x.b paramb, Z paramZ, E paramE)
  {
    t.b(K, N.a, paramb, o, paramZ, c);
  }
  
  public final void x(int paramInt, boolean paramBoolean, long paramLong)
  {
    Y0 localY0 = o[paramInt];
    if (X(localY0)) {
      return;
    }
    B0 localB0 = G.u();
    boolean bool;
    if (localB0 == G.t()) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject = localB0.p();
    b1 localb1 = b[paramInt];
    localObject = E(c[paramInt]);
    int i;
    if ((o1()) && (N.e == 3)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((!paramBoolean) && (i != 0)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    a0 += 1;
    p.add(localY0);
    localY0.C(localb1, (q[])localObject, c[paramInt], c0, paramBoolean, bool, paramLong, localB0.m(), f.a);
    localY0.t(11, new a());
    C.b(localY0);
    if ((i != 0) && (bool)) {
      localY0.start();
    }
  }
  
  public final boolean x0()
  {
    B0 localB0 = G.u();
    E localE = localB0.p();
    int i = 0;
    int k;
    for (int j = i;; j = k)
    {
      Object localObject = o;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (!X((Y0)localObject))
      {
        k = j;
      }
      else
      {
        if (((Y0)localObject).i() != c[i]) {
          k = 1;
        } else {
          k = 0;
        }
        if ((localE.c(i)) && (k == 0))
        {
          k = j;
        }
        else if (!((Y0)localObject).A())
        {
          ((Y0)localObject).F(E(c[i]), c[i], localB0.n(), localB0.m(), f.a);
          k = j;
          if (Z)
          {
            Y0(false);
            k = j;
          }
        }
        else if (((Y0)localObject).c())
        {
          v((Y0)localObject);
          k = j;
        }
        else
        {
          k = 1;
        }
      }
      i++;
    }
    return j ^ 0x1;
  }
  
  public final void x1(int paramInt1, int paramInt2, List paramList)
  {
    O.b(1);
    O(H.E(paramInt1, paramInt2, paramList), false);
  }
  
  public final void y()
  {
    z(new boolean[o.length], G.u().n());
  }
  
  public final void y0()
  {
    float f = C.h().a;
    B0 localB0 = G.t();
    Object localObject1 = G.u();
    Object localObject2 = null;
    int i = 1;
    while ((localB0 != null) && (d))
    {
      Object localObject3 = localB0.x(f, N.a);
      if (localB0 == G.t()) {
        localObject2 = localObject3;
      }
      if (!((E)localObject3).a(localB0.p()))
      {
        localObject1 = G;
        if (i != 0)
        {
          localB0 = ((E0)localObject1).t();
          boolean bool = G.I(localB0);
          localObject3 = new boolean[o.length];
          long l = localB0.b((E)g0.a.e(localObject2), N.s, bool, (boolean[])localObject3);
          localObject2 = N;
          if ((e != 4) && (l != s)) {
            bool = true;
          } else {
            bool = false;
          }
          localObject2 = N;
          N = S(b, l, c, d, bool, 5);
          if (bool) {
            C0(l);
          }
          localObject2 = new boolean[o.length];
          for (i = 0;; i++)
          {
            localObject1 = o;
            if (i >= localObject1.length) {
              break;
            }
            localObject1 = localObject1[i];
            bool = X((Y0)localObject1);
            localObject2[i] = bool;
            Q localQ = c[i];
            if (bool) {
              if (localQ != ((Y0)localObject1).i()) {
                v((Y0)localObject1);
              } else if (localObject3[i] != 0) {
                ((Y0)localObject1).z(c0);
              }
            }
          }
          z((boolean[])localObject2, c0);
        }
        for (;;)
        {
          break;
          ((E0)localObject1).I(localB0);
          if (d) {
            localB0.a((E)localObject3, Math.max(f.b, localB0.A(c0)), false);
          }
        }
        N(true);
        if (N.e != 4)
        {
          c0();
          z1();
          v.c(2);
        }
        return;
      }
      if (localB0 == localObject1) {
        i = 0;
      }
      localB0 = localB0.k();
    }
  }
  
  public final void y1()
  {
    if ((!N.a.q()) && (H.t()))
    {
      boolean bool = f0();
      j0();
      k0();
      h0();
      i0(bool);
    }
  }
  
  public final void z(boolean[] paramArrayOfBoolean, long paramLong)
  {
    B0 localB0 = G.u();
    E localE = localB0.p();
    int i = 0;
    int k;
    for (int j = 0;; j++)
    {
      k = i;
      if (j >= o.length) {
        break;
      }
      if ((!localE.c(j)) && (p.remove(o[j]))) {
        o[j].b();
      }
    }
    while (k < o.length)
    {
      if (localE.c(k)) {
        x(k, paramArrayOfBoolean[k], paramLong);
      }
      k++;
    }
    g = true;
  }
  
  public final void z0()
  {
    y0();
    L0(true);
  }
  
  public final void z1()
  {
    Object localObject1 = G.t();
    if (localObject1 == null) {
      return;
    }
    long l1;
    if (d) {
      l1 = a.l();
    } else {
      l1 = -9223372036854775807L;
    }
    boolean bool;
    int i;
    long l3;
    if (l1 != -9223372036854775807L)
    {
      if (!((B0)localObject1).s())
      {
        G.I((B0)localObject1);
        N(false);
        c0();
      }
      C0(l1);
      if (l1 != N.s)
      {
        localObject1 = N;
        localObject2 = b;
        long l2 = c;
        bool = true;
        i = 5;
        l3 = l1;
        l1 = l2;
      }
    }
    else
    {
      for (;;)
      {
        N = S((x0.x.b)localObject2, l3, l1, l3, bool, i);
        break label250;
        localObject2 = C;
        if (localObject1 != G.u()) {
          bool = true;
        } else {
          bool = false;
        }
        l1 = ((s)localObject2).g(bool);
        c0 = l1;
        l3 = ((B0)localObject1).A(l1);
        e0(N.s, l3);
        if (!C.r()) {
          break;
        }
        bool = O.d ^ true;
        localObject1 = N;
        localObject2 = b;
        l1 = c;
        i = 6;
      }
      N.o(l3);
    }
    label250:
    Object localObject2 = G.m();
    N.q = ((B0)localObject2).j();
    N.r = J();
    localObject2 = N;
    if ((l) && (e == 3) && (q1(a, b)) && (N.o.a == 1.0F))
    {
      float f = I.c(D(), J());
      if (C.h().a != f)
      {
        V0(N.o.b(f));
        Q(N.o, C.h().a, false, false);
      }
    }
  }
  
  public class a
    implements Y0.a
  {
    public a() {}
    
    public void a()
    {
      t0.i(t0.this, true);
    }
    
    public void b()
    {
      if ((t0.l(t0.this)) || (t0.n(t0.this))) {
        t0.p(t0.this).c(2);
      }
    }
  }
  
  public static final class b
  {
    public final List a;
    public final T b;
    public final int c;
    public final long d;
    
    public b(List paramList, T paramT, int paramInt, long paramLong)
    {
      a = paramList;
      b = paramT;
      c = paramInt;
      d = paramLong;
    }
  }
  
  public static abstract class c {}
  
  public static final class d
    implements Comparable
  {
    public final V0 o;
    public int p;
    public long q;
    public Object r;
    
    public d(V0 paramV0)
    {
      o = paramV0;
    }
    
    public int c(d paramd)
    {
      Object localObject = r;
      int i = 1;
      if (localObject == null) {
        j = 1;
      } else {
        j = 0;
      }
      int k;
      if (r == null) {
        k = 1;
      } else {
        k = 0;
      }
      if (j != k)
      {
        j = i;
        if (localObject != null) {
          j = -1;
        }
        return j;
      }
      if (localObject == null) {
        return 0;
      }
      int j = p - p;
      if (j != 0) {
        return j;
      }
      return M.n(q, q);
    }
    
    public void e(int paramInt, long paramLong, Object paramObject)
    {
      p = paramInt;
      q = paramLong;
      r = paramObject;
    }
  }
  
  public static final class e
  {
    public boolean a;
    public U0 b;
    public int c;
    public boolean d;
    public int e;
    
    public e(U0 paramU0)
    {
      b = paramU0;
    }
    
    public void b(int paramInt)
    {
      boolean bool1 = a;
      boolean bool2;
      if (paramInt > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      a = (bool1 | bool2);
      c += paramInt;
    }
    
    public void c(U0 paramU0)
    {
      boolean bool1 = a;
      boolean bool2;
      if (b != paramU0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      a = (bool1 | bool2);
      b = paramU0;
    }
    
    public void d(int paramInt)
    {
      boolean bool1 = d;
      boolean bool2 = true;
      if ((bool1) && (e != 5))
      {
        if (paramInt != 5) {
          bool2 = false;
        }
        g0.a.a(bool2);
        return;
      }
      a = true;
      d = true;
      e = paramInt;
    }
  }
  
  public static abstract interface f
  {
    public abstract void a(t0.e parame);
  }
  
  public static final class g
  {
    public final x0.x.b a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    
    public g(x0.x.b paramb, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      a = paramb;
      b = paramLong1;
      c = paramLong2;
      d = paramBoolean1;
      e = paramBoolean2;
      f = paramBoolean3;
    }
  }
  
  public static final class h
  {
    public final I a;
    public final int b;
    public final long c;
    
    public h(I paramI, int paramInt, long paramLong)
    {
      a = paramI;
      b = paramInt;
      c = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     k0.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */