package k0;

import A0.y;
import B0.e;
import B0.e.a;
import W2.g;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import d0.C;
import d0.D.b;
import d0.D.b.a;
import d0.D.d;
import d0.D.e;
import d0.I.b;
import d0.I.c;
import d0.l;
import d0.l.b;
import d0.q;
import g0.A;
import g0.k;
import g0.n;
import g0.n.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import l0.w1;
import l0.y1;
import m0.z.a;
import x0.T.a;
import x0.t;
import x0.x.a;
import x0.x.b;
import z0.h;

public final class f0
  extends d0.f
  implements w
{
  public final b A;
  public final m B;
  public final g1 C;
  public final i1 D;
  public final j1 E;
  public final long F;
  public AudioManager G;
  public final boolean H;
  public int I;
  public boolean J;
  public int K;
  public int L;
  public boolean M;
  public d1 N;
  public x0.T O;
  public w.c P;
  public boolean Q;
  public D.b R;
  public d0.w S;
  public d0.w T;
  public q U;
  public q V;
  public AudioTrack W;
  public Object X;
  public Surface Y;
  public SurfaceHolder Z;
  public boolean a0;
  public final A0.E b;
  public TextureView b0;
  public final D.b c;
  public int c0;
  public final g0.f d;
  public int d0;
  public final Context e;
  public A e0;
  public final d0.D f;
  public o f0;
  public final Y0[] g;
  public o g0;
  public final A0.D h;
  public int h0;
  public final k i;
  public d0.b i0;
  public final t0.f j;
  public float j0;
  public final t0 k;
  public boolean k0;
  public final n l;
  public f0.b l0;
  public final CopyOnWriteArraySet m;
  public boolean m0;
  public final I.b n;
  public boolean n0;
  public final List o;
  public int o0;
  public final boolean p;
  public boolean p0;
  public final x.a q;
  public boolean q0;
  public final l0.a r;
  public l r0;
  public final Looper s;
  public d0.P s0;
  public final e t;
  public d0.w t0;
  public final long u;
  public U0 u0;
  public final long v;
  public int v0;
  public final long w;
  public int w0;
  public final g0.c x;
  public long x0;
  public final d y;
  public final e z;
  
  static
  {
    d0.v.a("media3.exoplayer");
  }
  
  public f0(w.b paramb, d0.D paramD)
  {
    g0.f localf = new g0.f();
    d = localf;
    Object localObject1;
    Object localObject2;
    d locald;
    Handler localHandler;
    Y0[] arrayOfY0;
    boolean bool;
    A0.D localD;
    e locale;
    Looper localLooper;
    g0.c localc;
    Object localObject4;
    Object localObject5;
    int i1;
    for (;;)
    {
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Init ");
        ((StringBuilder)localObject1).append(Integer.toHexString(System.identityHashCode(this)));
        ((StringBuilder)localObject1).append(" [");
        ((StringBuilder)localObject1).append("AndroidXMedia3/1.4.1");
        ((StringBuilder)localObject1).append("] [");
        ((StringBuilder)localObject1).append(g0.M.e);
        ((StringBuilder)localObject1).append("]");
        g0.o.f("ExoPlayerImpl", ((StringBuilder)localObject1).toString());
        localObject2 = a.getApplicationContext();
        e = ((Context)localObject2);
        localObject3 = (l0.a)i.apply(b);
        r = ((l0.a)localObject3);
        o0 = k;
        i0 = l;
        c0 = r;
        d0 = s;
        k0 = p;
        F = A;
        locald = new k0/f0$d;
        locald.<init>(this, null);
        y = locald;
        localObject1 = new k0/f0$e;
        ((e)localObject1).<init>(null);
        z = ((e)localObject1);
        localHandler = new android/os/Handler;
        localHandler.<init>(j);
        arrayOfY0 = ((c1)d.get()).a(localHandler, locald, locald, locald, locald);
        g = arrayOfY0;
        if (arrayOfY0.length > 0) {
          bool = true;
        } else {
          bool = false;
        }
        g0.a.f(bool);
        localD = (A0.D)f.get();
        h = localD;
        q = ((x.a)e.get());
        locale = (e)h.get();
        t = locale;
        p = t;
        N = u;
        u = v;
        v = w;
        w = x;
        Q = B;
        localLooper = j;
        s = localLooper;
        localc = b;
        x = localc;
        if (paramD == null) {
          paramD = this;
        }
        f = paramD;
        bool = F;
        H = bool;
        localObject4 = new g0/n;
        localObject5 = new k0/O;
        ((O)localObject5).<init>(this);
        ((n)localObject4).<init>(localLooper, localc, (n.b)localObject5);
        l = ((n)localObject4);
        localObject5 = new java/util/concurrent/CopyOnWriteArraySet;
        ((CopyOnWriteArraySet)localObject5).<init>();
        m = ((CopyOnWriteArraySet)localObject5);
        localObject5 = new java/util/ArrayList;
        ((ArrayList)localObject5).<init>();
        o = ((List)localObject5);
        localObject5 = new x0/T$a;
        ((T.a)localObject5).<init>(0);
        O = ((x0.T)localObject5);
        P = w.c.b;
        localObject5 = new A0/E;
        ((A0.E)localObject5).<init>(new b1[arrayOfY0.length], new y[arrayOfY0.length], d0.L.b, null);
        b = ((A0.E)localObject5);
        localObject4 = new d0/I$b;
        ((I.b)localObject4).<init>();
        n = ((I.b)localObject4);
        localObject4 = new d0/D$b$a;
        ((D.b.a)localObject4).<init>();
        localObject6 = ((D.b.a)localObject4).c(new int[] { 1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32 }).d(29, localD.h()).d(23, q).d(25, q).d(33, q).d(26, q).d(34, q).e();
        c = ((D.b)localObject6);
        localObject4 = new d0/D$b$a;
        ((D.b.a)localObject4).<init>();
        R = ((D.b.a)localObject4).b((D.b)localObject6).a(4).a(10).e();
        i = localc.e(localLooper, null);
        localObject4 = new k0/Q;
        ((Q)localObject4).<init>(this);
        j = ((t0.f)localObject4);
        u0 = U0.k((A0.E)localObject5);
        ((l0.a)localObject3).o0(paramD, localLooper);
        i1 = g0.M.a;
        if (i1 < 31)
        {
          paramD = new l0/y1;
          paramD.<init>(G);
        }
      }
      finally
      {
        break;
      }
      paramD = c.a((Context)localObject2, this, C, G);
    }
    Object localObject6 = new k0/t0;
    ((t0)localObject6).<init>(arrayOfY0, localD, (A0.E)localObject5, (x0)g.get(), locale, I, J, (l0.a)localObject3, N, y, z, Q, H, localLooper, localc, (t0.f)localObject4, paramD, D, P);
    k = ((t0)localObject6);
    j0 = 1.0F;
    I = 0;
    paramD = d0.w.H;
    S = paramD;
    T = paramD;
    t0 = paramD;
    v0 = -1;
    if (i1 < 21) {}
    for (int i2 = x1(0);; i2 = g0.M.J((Context)localObject2))
    {
      h0 = i2;
      break;
    }
    l0 = f0.b.c;
    m0 = true;
    v((D.d)localObject3);
    paramD = new android/os/Handler;
    paramD.<init>(localLooper);
    locale.i(paramD, (e.a)localObject3);
    d1(locald);
    long l1 = c;
    if (l1 > 0L) {
      ((t0)localObject6).B(l1);
    }
    paramD = new k0/b;
    paramD.<init>(a, localHandler, locald);
    A = paramD;
    paramD.b(o);
    Object localObject3 = new k0/m;
    ((m)localObject3).<init>(a, localHandler, locald);
    B = ((m)localObject3);
    if (m) {
      paramD = i0;
    } else {
      paramD = null;
    }
    ((m)localObject3).m(paramD);
    if ((bool) && (i1 >= 23))
    {
      paramD = (AudioManager)((Context)localObject2).getSystemService("audio");
      G = paramD;
      localObject3 = new k0/f0$g;
      ((g)localObject3).<init>(this, null);
      localObject2 = new android/os/Handler;
      ((Handler)localObject2).<init>(localLooper);
      b.b(paramD, (AudioDeviceCallback)localObject3, (Handler)localObject2);
    }
    if (q)
    {
      paramD = new k0/g1;
      paramD.<init>(a, localHandler, locald);
      C = paramD;
      paramD.h(g0.M.k0(i0.c));
    }
    else
    {
      C = null;
    }
    paramD = new k0/i1;
    paramD.<init>(a);
    D = paramD;
    if (n != 0) {
      bool = true;
    } else {
      bool = false;
    }
    paramD.a(bool);
    paramD = new k0/j1;
    paramD.<init>(a);
    E = paramD;
    if (n == 2) {
      bool = true;
    } else {
      bool = false;
    }
    paramD.a(bool);
    r0 = h1(C);
    s0 = d0.P.e;
    e0 = A.c;
    localD.l(i0);
    f2(1, 10, Integer.valueOf(h0));
    f2(2, 10, Integer.valueOf(h0));
    f2(1, 3, i0);
    f2(2, 4, Integer.valueOf(c0));
    f2(2, 5, Integer.valueOf(d0));
    f2(1, 9, Boolean.valueOf(k0));
    f2(2, 7, localObject1);
    f2(6, 8, localObject1);
    g2(16, Integer.valueOf(o0));
    localf.e();
    return;
    d.e();
    throw paramb;
  }
  
  public static l h1(g1 paramg1)
  {
    int i1 = 0;
    l.b localb = new l.b(0);
    if (paramg1 != null) {
      i2 = paramg1.d();
    } else {
      i2 = 0;
    }
    localb = localb.g(i2);
    int i2 = i1;
    if (paramg1 != null) {
      i2 = paramg1.c();
    }
    return localb.f(i2).e();
  }
  
  public static int q1(int paramInt)
  {
    if (paramInt == -1) {
      paramInt = 2;
    } else {
      paramInt = 1;
    }
    return paramInt;
  }
  
  public static long u1(U0 paramU0)
  {
    I.c localc = new I.c();
    I.b localb = new I.b();
    a.h(b.a, localb);
    long l1;
    if (c == -9223372036854775807L) {
      l1 = a.n(c, localc).c();
    } else {
      l1 = localb.n() + c;
    }
    return l1;
  }
  
  public void A(d0.b paramb, boolean paramBoolean)
  {
    u2();
    if (q0) {
      return;
    }
    Object localObject;
    if (!g0.M.c(i0, paramb))
    {
      i0 = paramb;
      f2(1, 3, paramb);
      localObject = C;
      if (localObject != null) {
        ((g1)localObject).h(g0.M.k0(c));
      }
      l.i(20, new S(paramb));
    }
    m localm = B;
    if (paramBoolean) {
      localObject = paramb;
    } else {
      localObject = null;
    }
    localm.m((d0.b)localObject);
    h.l(paramb);
    paramBoolean = u();
    int i1 = B.p(paramBoolean, f());
    p2(paramBoolean, i1, q1(i1));
    l.f();
  }
  
  public int C()
  {
    u2();
    if (u0.a.q()) {
      return w0;
    }
    U0 localU0 = u0;
    return a.b(b.a);
  }
  
  public int D()
  {
    u2();
    int i1;
    if (o()) {
      i1 = u0.b.b;
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public int E()
  {
    u2();
    int i1 = p1(u0);
    int i2 = i1;
    if (i1 == -1) {
      i2 = 0;
    }
    return i2;
  }
  
  public void F(d0.K paramK)
  {
    u2();
    if ((h.h()) && (!paramK.equals(h.c())))
    {
      h.m(paramK);
      l.k(19, new T(paramK));
    }
  }
  
  public int H()
  {
    u2();
    int i1;
    if (o()) {
      i1 = u0.b.c;
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public int J()
  {
    u2();
    return u0.n;
  }
  
  public long K()
  {
    u2();
    if (o())
    {
      U0 localU0 = u0;
      x.b localb = b;
      a.h(a, n);
      return g0.M.i1(n.b(b, c));
    }
    return a();
  }
  
  public d0.I L()
  {
    u2();
    return u0.a;
  }
  
  public boolean N()
  {
    u2();
    return J;
  }
  
  public d0.K O()
  {
    u2();
    return h.c();
  }
  
  public long P()
  {
    u2();
    return g0.M.i1(o1(u0));
  }
  
  public void U(int paramInt1, long paramLong, int paramInt2, boolean paramBoolean)
  {
    u2();
    if (paramInt1 == -1) {
      return;
    }
    boolean bool;
    if (paramInt1 >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    d0.I localI = u0.a;
    if ((!localI.q()) && (paramInt1 >= localI.p())) {
      return;
    }
    r.f0();
    K += 1;
    if (o())
    {
      g0.o.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
      localObject = new t0.e(u0);
      ((t0.e)localObject).b(1);
      j.a((t0.e)localObject);
      return;
    }
    U0 localU0 = u0;
    paramInt2 = e;
    if (paramInt2 != 3)
    {
      localObject = localU0;
      if (paramInt2 == 4)
      {
        localObject = localU0;
        if (localI.q()) {}
      }
    }
    else
    {
      localObject = u0.h(2);
    }
    paramInt2 = E();
    Object localObject = Z1((U0)localObject, localI, a2(localI, paramInt1, paramLong));
    k.K0(localI, paramInt1, g0.M.J0(paramLong));
    q2((U0)localObject, 0, true, 1, o1((U0)localObject), paramInt2, paramBoolean);
  }
  
  public final U0 Z1(U0 paramU0, d0.I paramI, Pair paramPair)
  {
    boolean bool1;
    if ((!paramI.q()) && (paramPair == null)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    g0.a.a(bool1);
    d0.I localI = a;
    long l1 = n1(paramU0);
    U0 localU0 = paramU0.j(paramI);
    if (paramI.q())
    {
      paramU0 = U0.l();
      l1 = g0.M.J0(x0);
      paramU0 = localU0.d(paramU0, l1, l1, l1, 0L, x0.Z.d, b, X2.v.Y()).c(paramU0);
      q = s;
      return paramU0;
    }
    paramU0 = b.a;
    boolean bool2 = paramU0.equals(ifirst) ^ true;
    if (bool2) {}
    for (x.b localb = new x.b(first);; localb = b) {
      break;
    }
    long l2 = ((Long)second).longValue();
    long l3 = g0.M.J0(l1);
    l1 = l3;
    if (!localI.q()) {
      l1 = l3 - localI.h(paramU0, n).n();
    }
    boolean bool3;
    if (!bool2)
    {
      bool3 = l2 < l1;
      if (bool3) {}
    }
    else
    {
      if (!bool3)
      {
        int i1 = paramI.b(k.a);
        if (i1 != -1)
        {
          paramU0 = localU0;
          if (fn).c == ha, n).c) {}
        }
        else
        {
          paramI.h(a, n);
          if (localb.b()) {
            l1 = n.b(b, c);
          } else {
            l1 = n.d;
          }
          paramU0 = localU0.d(localb, s, s, d, l1 - s, h, i, j).c(localb);
          break label491;
        }
      }
      for (;;)
      {
        break;
        g0.a.f(localb.b() ^ true);
        l3 = Math.max(0L, r - (l2 - l1));
        l1 = q;
        if (k.equals(b)) {
          l1 = l2 + l3;
        }
        paramU0 = localU0.d(localb, l2, l2, l2, l3, h, i, j);
        label491:
        q = l1;
      }
    }
    g0.a.f(localb.b() ^ true);
    if (bool2) {}
    for (paramU0 = x0.Z.d;; paramU0 = h) {
      break;
    }
    if (bool2) {}
    for (paramI = b;; paramI = i) {
      break;
    }
    if (bool2) {}
    for (paramPair = X2.v.Y();; paramPair = j) {
      break;
    }
    paramU0 = localU0.d(localb, l2, l2, l2, 0L, paramU0, paramI, paramPair).c(localb);
    q = l2;
    return paramU0;
  }
  
  public final Pair a2(d0.I paramI, int paramInt, long paramLong)
  {
    if (paramI.q())
    {
      v0 = paramInt;
      long l1 = paramLong;
      if (paramLong == -9223372036854775807L) {
        l1 = 0L;
      }
      x0 = l1;
      w0 = 0;
      return null;
    }
    int i1;
    if (paramInt != -1)
    {
      i1 = paramInt;
      if (paramInt >= paramI.p()) {}
    }
    for (;;)
    {
      break;
      i1 = paramI.a(J);
      paramLong = paramI.n(i1, a).b();
    }
    return paramI.j(a, n, i1, g0.M.J0(paramLong));
  }
  
  public final void b2(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != e0.b()) || (paramInt2 != e0.a()))
    {
      e0 = new A(paramInt1, paramInt2);
      l.k(24, new U(paramInt1, paramInt2));
      f2(2, 14, new A(paramInt1, paramInt2));
    }
  }
  
  public void c1(l0.c paramc)
  {
    r.N((l0.c)g0.a.e(paramc));
  }
  
  public final long c2(d0.I paramI, x.b paramb, long paramLong)
  {
    paramI.h(a, n);
    return paramLong + n.n();
  }
  
  public void d(boolean paramBoolean)
  {
    u2();
    if (k0 == paramBoolean) {
      return;
    }
    k0 = paramBoolean;
    f2(1, 9, Boolean.valueOf(paramBoolean));
    l.k(23, new J(paramBoolean));
  }
  
  public void d1(w.a parama)
  {
    m.add(parama);
  }
  
  public final void d2(int paramInt1, int paramInt2)
  {
    for (int i1 = paramInt2 - 1; i1 >= paramInt1; i1--) {
      o.remove(i1);
    }
    O = O.b(paramInt1, paramInt2);
  }
  
  public void e(x0.x paramx)
  {
    u2();
    i2(Collections.singletonList(paramx));
  }
  
  public final List e1(int paramInt, List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < paramList.size(); i1++)
    {
      T0.c localc = new T0.c((x0.x)paramList.get(i1), p);
      localArrayList.add(localc);
      o.add(i1 + paramInt, new f(b, a));
    }
    O = O.d(paramInt, localArrayList.size());
    return localArrayList;
  }
  
  public final void e2()
  {
    Object localObject = b0;
    if (localObject != null)
    {
      if (((TextureView)localObject).getSurfaceTextureListener() != y) {
        g0.o.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
      } else {
        b0.setSurfaceTextureListener(null);
      }
      b0 = null;
    }
    localObject = Z;
    if (localObject != null)
    {
      ((SurfaceHolder)localObject).removeCallback(y);
      Z = null;
    }
  }
  
  public int f()
  {
    u2();
    return u0.e;
  }
  
  public final d0.w f1()
  {
    Object localObject = L();
    if (((d0.I)localObject).q()) {
      return t0;
    }
    localObject = nEa).c;
    return t0.a().K(e).I();
  }
  
  public final void f2(int paramInt1, int paramInt2, Object paramObject)
  {
    for (Y0 localY0 : g) {
      if ((paramInt1 == -1) || (localY0.l() == paramInt1)) {
        j1(localY0).n(paramInt2).m(paramObject).l();
      }
    }
  }
  
  public void g()
  {
    u2();
    boolean bool = u();
    Object localObject = B;
    int i1 = 2;
    int i2 = ((m)localObject).p(bool, 2);
    p2(bool, i2, q1(i2));
    localObject = u0;
    if (e != 1) {
      return;
    }
    localObject = ((U0)localObject).f(null);
    if (a.q()) {
      i1 = 4;
    }
    localObject = ((U0)localObject).h(i1);
    K += 1;
    k.r0();
    q2((U0)localObject, 1, false, 5, -9223372036854775807L, -1, false);
  }
  
  public final int g1(boolean paramBoolean, int paramInt)
  {
    if (paramInt == 0) {
      return 1;
    }
    if (H)
    {
      if ((paramBoolean) && (!w1())) {
        return 3;
      }
      if ((!paramBoolean) && (u0.n == 3)) {
        return 3;
      }
    }
    return 0;
  }
  
  public final void g2(int paramInt, Object paramObject)
  {
    f2(-1, paramInt, paramObject);
  }
  
  public C h()
  {
    u2();
    return u0.o;
  }
  
  public final void h2()
  {
    f2(1, 2, Float.valueOf(j0 * B.g()));
  }
  
  public void i(int paramInt)
  {
    u2();
    if (I != paramInt)
    {
      I = paramInt;
      k.f1(paramInt);
      l.i(8, new M(paramInt));
      o2();
      l.f();
    }
  }
  
  public final d0.I i1()
  {
    return new W0(o, O);
  }
  
  public void i2(List paramList)
  {
    u2();
    j2(paramList, true);
  }
  
  public int j()
  {
    u2();
    return h0;
  }
  
  public final V0 j1(V0.b paramb)
  {
    int i1 = p1(u0);
    t0 localt0 = k;
    d0.I localI = u0.a;
    int i2 = i1;
    if (i1 == -1) {
      i2 = 0;
    }
    return new V0(localt0, paramb, localI, i2, x, localt0.I());
  }
  
  public void j2(List paramList, boolean paramBoolean)
  {
    u2();
    k2(paramList, -1, -9223372036854775807L, paramBoolean);
  }
  
  public void k(C paramC)
  {
    u2();
    C localC = paramC;
    if (paramC == null) {
      localC = C.d;
    }
    if (u0.o.equals(localC)) {
      return;
    }
    paramC = u0.g(localC);
    K += 1;
    k.c1(localC);
    q2(paramC, 0, false, 5, -9223372036854775807L, -1, false);
  }
  
  public final Pair k1(U0 paramU01, U0 paramU02, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3)
  {
    d0.I localI1 = a;
    d0.I localI2 = a;
    boolean bool1 = localI2.q();
    Integer localInteger = Integer.valueOf(-1);
    if ((bool1) && (localI1.q())) {
      return new Pair(Boolean.FALSE, localInteger);
    }
    bool1 = localI2.q();
    boolean bool2 = localI1.q();
    int i1 = 3;
    if (bool1 != bool2) {
      return new Pair(Boolean.TRUE, Integer.valueOf(3));
    }
    if (!nhb.a, n).c, a).a.equals(nhb.a, n).c, a).a))
    {
      if ((paramBoolean1) && (paramInt == 0))
      {
        paramInt = 1;
      }
      else if ((paramBoolean1) && (paramInt == 1))
      {
        paramInt = 2;
      }
      else
      {
        if (!paramBoolean2) {
          break label214;
        }
        paramInt = i1;
      }
      return new Pair(Boolean.TRUE, Integer.valueOf(paramInt));
      label214:
      throw new IllegalStateException();
    }
    if ((paramBoolean1) && (paramInt == 0) && (b.d < b.d)) {
      return new Pair(Boolean.TRUE, Integer.valueOf(0));
    }
    if ((paramBoolean1) && (paramInt == 1) && (paramBoolean3)) {
      return new Pair(Boolean.TRUE, Integer.valueOf(2));
    }
    return new Pair(Boolean.FALSE, localInteger);
  }
  
  public final void k2(List paramList, int paramInt, long paramLong, boolean paramBoolean)
  {
    int i1 = p1(u0);
    long l1 = P();
    int i2 = K;
    boolean bool = true;
    K = (i2 + 1);
    if (!o.isEmpty()) {
      d2(0, o.size());
    }
    paramList = e1(0, paramList);
    d0.I localI = i1();
    if ((localI.q()) || (paramInt >= localI.p())) {
      throw new d0.s(localI, paramInt, paramLong);
    }
    if (paramBoolean)
    {
      paramInt = localI.a(J);
      paramLong = -9223372036854775807L;
    }
    else if (paramInt == -1)
    {
      paramInt = i1;
      paramLong = l1;
    }
    U0 localU0 = Z1(u0, localI, a2(localI, paramInt, paramLong));
    i2 = e;
    i1 = i2;
    if (paramInt != -1)
    {
      i1 = i2;
      if (i2 != 1) {
        if ((!localI.q()) && (paramInt < localI.p())) {
          i1 = 2;
        } else {
          i1 = 4;
        }
      }
    }
    localU0 = localU0.h(i1);
    k.X0(paramList, paramInt, g0.M.J0(paramLong), O);
    if ((!u0.b.a.equals(b.a)) && (!u0.a.q())) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    q2(localU0, 0, paramBoolean, 4, o1(localU0), -1, false);
  }
  
  public void l(float paramFloat)
  {
    u2();
    paramFloat = g0.M.o(paramFloat, 0.0F, 1.0F);
    if (j0 == paramFloat) {
      return;
    }
    j0 = paramFloat;
    h2();
    l.k(22, new K(paramFloat));
  }
  
  public Looper l1()
  {
    return s;
  }
  
  public final void l2(SurfaceTexture paramSurfaceTexture)
  {
    paramSurfaceTexture = new Surface(paramSurfaceTexture);
    m2(paramSurfaceTexture);
    Y = paramSurfaceTexture;
  }
  
  public long m1()
  {
    u2();
    if (u0.a.q()) {
      return x0;
    }
    Object localObject = u0;
    if (k.d != b.d) {
      return a.n(E(), a).d();
    }
    long l1 = q;
    if (u0.k.b())
    {
      localObject = u0;
      localObject = a.h(k.a, n);
      l1 = ((I.b)localObject).f(u0.k.b);
      if (l1 == Long.MIN_VALUE) {
        l1 = d;
      }
    }
    localObject = u0;
    return g0.M.i1(c2(a, k, l1));
  }
  
  public final void m2(Object paramObject)
  {
    Object localObject1 = new ArrayList();
    Y0[] arrayOfY0 = g;
    int i1 = arrayOfY0.length;
    int i2 = 0;
    int i3 = 0;
    for (int i4 = 0; i4 < i1; i4++)
    {
      localObject2 = arrayOfY0[i4];
      if (((Y0)localObject2).l() == 2) {
        ((List)localObject1).add(j1((V0.b)localObject2).n(1).m(paramObject).l());
      }
    }
    Object localObject2 = X;
    i1 = i2;
    if (localObject2 != null)
    {
      i1 = i2;
      if (localObject2 != paramObject)
      {
        try
        {
          localObject1 = ((List)localObject1).iterator();
          for (;;)
          {
            i4 = i3;
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
            ((V0)((Iterator)localObject1).next()).a(F);
          }
          localObject2 = X;
        }
        catch (TimeoutException localTimeoutException)
        {
          i4 = 1;
        }
        catch (InterruptedException localInterruptedException)
        {
          Thread.currentThread().interrupt();
          i4 = i3;
        }
        Surface localSurface = Y;
        i1 = i4;
        if (localObject2 == localSurface)
        {
          localSurface.release();
          Y = null;
          i1 = i4;
        }
      }
    }
    X = paramObject;
    if (i1 != 0) {
      n2(u.d(new u0(3), 1003));
    }
  }
  
  public void n(boolean paramBoolean)
  {
    u2();
    int i1 = B.p(paramBoolean, f());
    p2(paramBoolean, i1, q1(i1));
  }
  
  public final long n1(U0 paramU0)
  {
    if (b.b())
    {
      a.h(b.a, n);
      long l1;
      if (c == -9223372036854775807L) {
        l1 = a.n(p1(paramU0), a).b();
      } else {
        l1 = n.m() + g0.M.i1(c);
      }
      return l1;
    }
    return g0.M.i1(o1(paramU0));
  }
  
  public final void n2(u paramu)
  {
    Object localObject = u0;
    localObject = ((U0)localObject).c(b);
    q = s;
    r = 0L;
    U0 localU0 = ((U0)localObject).h(1);
    localObject = localU0;
    if (paramu != null) {
      localObject = localU0.f(paramu);
    }
    K += 1;
    k.s1();
    q2((U0)localObject, 0, false, 5, -9223372036854775807L, -1, false);
  }
  
  public boolean o()
  {
    u2();
    return u0.b.b();
  }
  
  public final long o1(U0 paramU0)
  {
    if (a.q()) {
      return g0.M.J0(x0);
    }
    long l1;
    if (p) {
      l1 = paramU0.m();
    } else {
      l1 = s;
    }
    if (b.b()) {
      return l1;
    }
    return c2(a, b, l1);
  }
  
  public final void o2()
  {
    D.b localb1 = R;
    D.b localb2 = g0.M.N(f, c);
    R = localb2;
    if (!localb2.equals(localb1)) {
      l.i(13, new W(this));
    }
  }
  
  public long p()
  {
    u2();
    return n1(u0);
  }
  
  public final int p1(U0 paramU0)
  {
    if (a.q()) {
      return v0;
    }
    return a.h(b.a, n).c;
  }
  
  public final void p2(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if ((paramBoolean) && (paramInt1 != -1)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    paramInt1 = g1(paramBoolean, paramInt1);
    U0 localU0 = u0;
    if ((l == paramBoolean) && (n == paramInt1) && (m == paramInt2)) {
      return;
    }
    r2(paramBoolean, paramInt2, paramInt1);
  }
  
  public int q()
  {
    u2();
    return I;
  }
  
  public final void q2(U0 paramU0, int paramInt1, boolean paramBoolean1, int paramInt2, long paramLong, int paramInt3, boolean paramBoolean2)
  {
    U0 localU0 = u0;
    u0 = paramU0;
    boolean bool1 = a.equals(a) ^ true;
    Object localObject1 = k1(paramU0, localU0, paramBoolean1, paramInt2, bool1, paramBoolean2);
    paramBoolean2 = ((Boolean)first).booleanValue();
    int i1 = ((Integer)second).intValue();
    localObject1 = null;
    Object localObject2 = null;
    int i2;
    if (paramBoolean2)
    {
      localObject1 = localObject2;
      if (!a.q())
      {
        i2 = a.h(b.a, n).c;
        localObject1 = a.n(i2, a).c;
      }
      t0 = d0.w.H;
    }
    if ((paramBoolean2) || (!j.equals(j))) {
      t0 = t0.a().M(j).I();
    }
    localObject2 = f1();
    boolean bool2 = ((d0.w)localObject2).equals(S);
    S = ((d0.w)localObject2);
    if (l != l) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i3;
    if (e != e) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if ((i3 != 0) || (i2 != 0)) {
      t2();
    }
    boolean bool3 = g;
    boolean bool4 = g;
    int i4;
    if (bool3 != bool4) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    if (i4 != 0) {
      s2(bool4);
    }
    if (bool1) {
      l.i(0, new E(paramU0, paramInt1));
    }
    if (paramBoolean1)
    {
      localObject2 = t1(paramInt2, localU0, paramInt3);
      D.e locale = s1(paramLong);
      l.i(11, new a0(paramInt2, (D.e)localObject2, locale));
    }
    if (paramBoolean2) {
      l.i(1, new b0((d0.u)localObject1, i1));
    }
    if (f != f)
    {
      l.i(10, new c0(paramU0));
      if (f != null) {
        l.i(10, new d0(paramU0));
      }
    }
    localObject1 = i;
    localObject2 = i;
    if (localObject1 != localObject2)
    {
      h.i(e);
      l.i(2, new e0(paramU0));
    }
    if ((bool2 ^ true))
    {
      localObject1 = S;
      l.i(14, new F((d0.w)localObject1));
    }
    if (i4 != 0) {
      l.i(3, new G(paramU0));
    }
    if ((i3 != 0) || (i2 != 0)) {
      l.i(-1, new H(paramU0));
    }
    if (i3 != 0) {
      l.i(4, new I(paramU0));
    }
    if ((i2 != 0) || (m != m)) {
      l.i(5, new P(paramU0));
    }
    if (n != n) {
      l.i(6, new X(paramU0));
    }
    if (localU0.n() != paramU0.n()) {
      l.i(7, new Y(paramU0));
    }
    if (!o.equals(o)) {
      l.i(12, new Z(paramU0));
    }
    o2();
    l.f();
    if (p != p)
    {
      localObject1 = m.iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((w.a)((Iterator)localObject1).next()).C(p);
      }
    }
  }
  
  public long r()
  {
    u2();
    return g0.M.i1(u0.r);
  }
  
  public u r1()
  {
    u2();
    return u0.f;
  }
  
  public final void r2(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    K += 1;
    U0 localU01 = u0;
    U0 localU02 = localU01;
    if (p) {
      localU02 = localU01.a();
    }
    localU02 = localU02.e(paramBoolean, paramInt1, paramInt2);
    k.a1(paramBoolean, paramInt1, paramInt2);
    q2(localU02, 0, false, 5, -9223372036854775807L, -1, false);
  }
  
  public void release()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Release ");
    ((StringBuilder)localObject).append(Integer.toHexString(System.identityHashCode(this)));
    ((StringBuilder)localObject).append(" [");
    ((StringBuilder)localObject).append("AndroidXMedia3/1.4.1");
    ((StringBuilder)localObject).append("] [");
    ((StringBuilder)localObject).append(g0.M.e);
    ((StringBuilder)localObject).append("] [");
    ((StringBuilder)localObject).append(d0.v.b());
    ((StringBuilder)localObject).append("]");
    g0.o.f("ExoPlayerImpl", ((StringBuilder)localObject).toString());
    u2();
    if (g0.M.a < 21)
    {
      localObject = W;
      if (localObject != null)
      {
        ((AudioTrack)localObject).release();
        W = null;
      }
    }
    A.b(false);
    localObject = C;
    if (localObject != null) {
      ((g1)localObject).g();
    }
    D.b(false);
    E.b(false);
    B.i();
    if (!k.t0()) {
      l.k(10, new L());
    }
    l.j();
    i.h(null);
    t.c(r);
    localObject = u0;
    if (p) {
      u0 = ((U0)localObject).a();
    }
    localObject = u0.h(1);
    u0 = ((U0)localObject);
    localObject = ((U0)localObject).c(b);
    u0 = ((U0)localObject);
    q = s;
    u0.r = 0L;
    r.release();
    h.j();
    e2();
    localObject = Y;
    if (localObject != null)
    {
      ((Surface)localObject).release();
      Y = null;
    }
    if (!p0)
    {
      l0 = f0.b.c;
      q0 = true;
      return;
    }
    android.support.v4.media.a.a(g0.a.e(null));
    throw null;
  }
  
  public final D.e s1(long paramLong)
  {
    int i1 = E();
    Object localObject1;
    Object localObject2;
    int i2;
    d0.u localu;
    if (!u0.a.q())
    {
      localObject1 = u0;
      localObject2 = b.a;
      a.h(localObject2, n);
      i2 = u0.a.b(localObject2);
      localObject1 = u0.a.n(i1, a).a;
      localu = a.c;
    }
    else
    {
      localu = null;
      localObject2 = localu;
      i2 = -1;
      localObject1 = localObject2;
    }
    long l1 = g0.M.i1(paramLong);
    if (u0.b.b()) {
      paramLong = g0.M.i1(u1(u0));
    } else {
      paramLong = l1;
    }
    x.b localb = u0.b;
    return new D.e(localObject1, i1, localu, localObject2, i2, l1, paramLong, b, c);
  }
  
  public final void s2(boolean paramBoolean) {}
  
  public void stop()
  {
    u2();
    B.p(u(), 1);
    n2(null);
    l0 = new f0.b(X2.v.Y(), u0.s);
  }
  
  public long t()
  {
    u2();
    if (o())
    {
      U0 localU0 = u0;
      long l1;
      if (k.equals(b)) {
        l1 = g0.M.i1(u0.q);
      } else {
        l1 = K();
      }
      return l1;
    }
    return m1();
  }
  
  public final D.e t1(int paramInt1, U0 paramU0, int paramInt2)
  {
    I.b localb = new I.b();
    Object localObject1;
    int i1;
    Object localObject2;
    Object localObject3;
    x.b localb1;
    if (!a.q())
    {
      localObject1 = b.a;
      a.h(localObject1, localb);
      i1 = c;
      paramInt2 = a.b(localObject1);
      localObject2 = a.n(i1, a).a;
      localObject3 = a.c;
    }
    else
    {
      i1 = paramInt2;
      localb1 = null;
      localObject2 = localb1;
      localObject1 = localObject2;
      paramInt2 = -1;
      localObject3 = localObject2;
      localObject2 = localb1;
    }
    boolean bool = b.b();
    if (paramInt1 == 0)
    {
      if (bool)
      {
        localb1 = b;
        l1 = localb.b(b, c);
        l2 = u1(paramU0);
        break label233;
      }
      if (b.e != -1) {
        l1 = u1(u0);
      }
    }
    for (;;)
    {
      l2 = l1;
      break label233;
      l1 = e + d;
      continue;
      if (bool)
      {
        l1 = s;
        break;
      }
      l1 = e + s;
    }
    label233:
    long l1 = g0.M.i1(l1);
    long l2 = g0.M.i1(l2);
    paramU0 = b;
    return new D.e(localObject2, i1, (d0.u)localObject3, localObject1, paramInt2, l1, l2, b, c);
  }
  
  public final void t2()
  {
    int i1 = f();
    boolean bool1 = true;
    if (i1 != 1) {
      if ((i1 != 2) && (i1 != 3))
      {
        if (i1 != 4) {
          throw new IllegalStateException();
        }
      }
      else
      {
        boolean bool2 = y1();
        i1 locali1 = D;
        if ((!u()) || (bool2)) {
          bool1 = false;
        }
        locali1.b(bool1);
        E.b(u());
        return;
      }
    }
    D.b(false);
    E.b(false);
  }
  
  public boolean u()
  {
    u2();
    return u0.l;
  }
  
  public final void u2()
  {
    d.b();
    if (Thread.currentThread() != l1().getThread())
    {
      String str = g0.M.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new Object[] { Thread.currentThread().getName(), l1().getThread().getName() });
      if (!m0)
      {
        IllegalStateException localIllegalStateException;
        if (n0) {
          localIllegalStateException = null;
        } else {
          localIllegalStateException = new IllegalStateException();
        }
        g0.o.i("ExoPlayerImpl", str, localIllegalStateException);
        n0 = true;
      }
      else
      {
        throw new IllegalStateException(str);
      }
    }
  }
  
  public void v(D.d paramd)
  {
    l.c((D.d)g0.a.e(paramd));
  }
  
  public final void v1(t0.e parame)
  {
    int i1 = K - c;
    K = i1;
    boolean bool1 = d;
    boolean bool2 = true;
    if (bool1)
    {
      L = e;
      M = true;
    }
    if (i1 == 0)
    {
      d0.I localI = b.a;
      if ((!u0.a.q()) && (localI.q()))
      {
        v0 = -1;
        x0 = 0L;
        w0 = 0;
      }
      Object localObject;
      if (!localI.q())
      {
        localObject = ((W0)localI).F();
        if (((List)localObject).size() == o.size()) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        g0.a.f(bool1);
        for (i1 = 0; i1 < ((List)localObject).size(); i1++) {
          ((f)o.get(i1)).c((d0.I)((List)localObject).get(i1));
        }
      }
      bool1 = M;
      long l1 = -9223372036854775807L;
      if (bool1)
      {
        bool1 = bool2;
        if (b.b.equals(u0.b)) {
          if (b.d != u0.s) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
        bool2 = bool1;
        if (bool1)
        {
          if ((!localI.q()) && (!b.b.b()))
          {
            localObject = b;
            l1 = c2(localI, b, d);
          }
          else
          {
            l1 = b.d;
          }
          bool2 = bool1;
        }
      }
      else
      {
        bool2 = false;
      }
      M = false;
      q2(b, 1, bool2, L, l1, -1, false);
    }
  }
  
  public final boolean w1()
  {
    AudioManager localAudioManager = G;
    if ((localAudioManager != null) && (g0.M.a >= 23)) {
      return b.a(e, localAudioManager.getDevices(2));
    }
    return true;
  }
  
  public void x(boolean paramBoolean)
  {
    u2();
    if (J != paramBoolean)
    {
      J = paramBoolean;
      k.i1(paramBoolean);
      l.i(9, new N(paramBoolean));
      o2();
      l.f();
    }
  }
  
  public final int x1(int paramInt)
  {
    AudioTrack localAudioTrack = W;
    if ((localAudioTrack != null) && (localAudioTrack.getAudioSessionId() != paramInt))
    {
      W.release();
      W = null;
    }
    if (W == null) {
      W = new AudioTrack(3, 4000, 4, 2, 2, 0, paramInt);
    }
    return W.getAudioSessionId();
  }
  
  public boolean y1()
  {
    u2();
    return u0.p;
  }
  
  public d0.L z()
  {
    u2();
    return u0.i.d;
  }
  
  public static final abstract class b
  {
    public static boolean a(Context paramContext, AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
    {
      if (!g0.M.F0(paramContext)) {
        return true;
      }
      int i = paramArrayOfAudioDeviceInfo.length;
      int j = 0;
      while (j < i)
      {
        paramContext = paramArrayOfAudioDeviceInfo[j];
        if ((paramContext.getType() != 8) && (paramContext.getType() != 5) && (paramContext.getType() != 6) && (paramContext.getType() != 11) && (paramContext.getType() != 4) && (paramContext.getType() != 3))
        {
          int k = g0.M.a;
          if ((k >= 26) && (paramContext.getType() == 22)) {
            return true;
          }
          if ((k >= 28) && (paramContext.getType() == 23)) {
            return true;
          }
          if ((k >= 31) && ((paramContext.getType() == 26) || (paramContext.getType() == 27))) {
            return true;
          }
          if ((k >= 33) && (paramContext.getType() == 30)) {
            return true;
          }
          j++;
        }
        else
        {
          return true;
        }
      }
      return false;
    }
    
    public static void b(AudioManager paramAudioManager, AudioDeviceCallback paramAudioDeviceCallback, Handler paramHandler)
    {
      paramAudioManager.registerAudioDeviceCallback(paramAudioDeviceCallback, paramHandler);
    }
  }
  
  public static final abstract class c
  {
    public static y1 a(Context paramContext, f0 paramf0, boolean paramBoolean, String paramString)
    {
      paramContext = w1.x0(paramContext);
      if (paramContext == null)
      {
        g0.o.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
        return new y1(g0.a(), paramString);
      }
      if (paramBoolean) {
        paramf0.c1(paramContext);
      }
      return new y1(paramContext.E0(), paramString);
    }
  }
  
  public final class d
    implements D0.E, m0.x, h, u0.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, m.b, b.b, g1.b, w.a
  {
    public d() {}
    
    public void A(o paramo)
    {
      f0.x0(f0.this, paramo);
      f0.X0(f0.this).A(paramo);
    }
    
    public void B(int paramInt, boolean paramBoolean)
    {
      f0.a1(f0.this).k(30, new m0(paramInt, paramBoolean));
    }
    
    public void C(boolean paramBoolean)
    {
      f0.S0(f0.this);
    }
    
    public void D(int paramInt)
    {
      l locall = f0.P0(f0.O0(f0.this));
      if (!locall.equals(f0.Q0(f0.this)))
      {
        f0.R0(f0.this, locall);
        f0.a1(f0.this).k(29, new l0(locall));
      }
    }
    
    public void E()
    {
      f0.N0(f0.this, false, -1, 3);
    }
    
    public void F(float paramFloat)
    {
      f0.L0(f0.this);
    }
    
    public void a(z.a parama)
    {
      f0.X0(f0.this).a(parama);
    }
    
    public void b(d0.P paramP)
    {
      f0.Z0(f0.this, paramP);
      f0.a1(f0.this).k(25, new n0(paramP));
    }
    
    public void c(boolean paramBoolean)
    {
      if (f0.z0(f0.this) == paramBoolean) {
        return;
      }
      f0.A0(f0.this, paramBoolean);
      f0.a1(f0.this).k(23, new p0(paramBoolean));
    }
    
    public void d(Exception paramException)
    {
      f0.X0(f0.this).d(paramException);
    }
    
    public void e(z.a parama)
    {
      f0.X0(f0.this).e(parama);
    }
    
    public void f(o paramo)
    {
      f0.X0(f0.this).f(paramo);
      f0.y0(f0.this, null);
      f0.x0(f0.this, null);
    }
    
    public void g(String paramString)
    {
      f0.X0(f0.this).g(paramString);
    }
    
    public void h(Object paramObject, long paramLong)
    {
      f0.X0(f0.this).h(paramObject, paramLong);
      if (f0.b1(f0.this) == paramObject) {
        f0.a1(f0.this).k(26, new o0());
      }
    }
    
    public void i(String paramString, long paramLong1, long paramLong2)
    {
      f0.X0(f0.this).i(paramString, paramLong1, paramLong2);
    }
    
    public void j(int paramInt)
    {
      boolean bool = u();
      f0.N0(f0.this, bool, paramInt, f0.M0(paramInt));
    }
    
    public void k(List paramList)
    {
      f0.a1(f0.this).k(27, new k0(paramList));
    }
    
    public void l(long paramLong)
    {
      f0.X0(f0.this).l(paramLong);
    }
    
    public void n(o paramo)
    {
      f0.W0(f0.this, paramo);
      f0.X0(f0.this).n(paramo);
    }
    
    public void o(o paramo)
    {
      f0.X0(f0.this).o(paramo);
      f0.Y0(f0.this, null);
      f0.W0(f0.this, null);
    }
    
    public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      f0.K0(f0.this, paramSurfaceTexture);
      f0.J0(f0.this, paramInt1, paramInt2);
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      f0.I0(f0.this, null);
      f0.J0(f0.this, 0, 0);
      return true;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      f0.J0(f0.this, paramInt1, paramInt2);
    }
    
    public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
    
    public void p(Exception paramException)
    {
      f0.X0(f0.this).p(paramException);
    }
    
    public void q(Exception paramException)
    {
      f0.X0(f0.this).q(paramException);
    }
    
    public void r(f0.b paramb)
    {
      f0.B0(f0.this, paramb);
      f0.a1(f0.this).k(27, new h0(paramb));
    }
    
    public void s(String paramString)
    {
      f0.X0(f0.this).s(paramString);
    }
    
    public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
    {
      f0.J0(f0.this, paramInt2, paramInt3);
    }
    
    public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
    {
      if (f0.H0(f0.this)) {
        f0.I0(f0.this, paramSurfaceHolder.getSurface());
      }
    }
    
    public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
    {
      if (f0.H0(f0.this)) {
        f0.I0(f0.this, null);
      }
      f0.J0(f0.this, 0, 0);
    }
    
    public void t(String paramString, long paramLong1, long paramLong2)
    {
      f0.X0(f0.this).t(paramString, paramLong1, paramLong2);
    }
    
    public void u(q paramq, p paramp)
    {
      f0.Y0(f0.this, paramq);
      f0.X0(f0.this).u(paramq, paramp);
    }
    
    public void v(int paramInt, long paramLong1, long paramLong2)
    {
      f0.X0(f0.this).v(paramInt, paramLong1, paramLong2);
    }
    
    public void w(int paramInt, long paramLong)
    {
      f0.X0(f0.this).w(paramInt, paramLong);
    }
    
    public void x(d0.x paramx)
    {
      Object localObject = f0.this;
      f0.D0((f0)localObject, f0.C0((f0)localObject).a().L(paramx).I());
      localObject = f0.E0(f0.this);
      if (!((d0.w)localObject).equals(f0.F0(f0.this)))
      {
        f0.G0(f0.this, (d0.w)localObject);
        f0.a1(f0.this).i(14, new i0(this));
      }
      f0.a1(f0.this).i(28, new j0(paramx));
      f0.a1(f0.this).f();
    }
    
    public void y(long paramLong, int paramInt)
    {
      f0.X0(f0.this).y(paramLong, paramInt);
    }
    
    public void z(q paramq, p paramp)
    {
      f0.y0(f0.this, paramq);
      f0.X0(f0.this).z(paramq, paramp);
    }
  }
  
  public static final class e
    implements D0.p, E0.a, V0.b
  {
    public D0.p o;
    public E0.a p;
    public D0.p q;
    public E0.a r;
    
    public void a(long paramLong, float[] paramArrayOfFloat)
    {
      E0.a locala = r;
      if (locala != null) {
        locala.a(paramLong, paramArrayOfFloat);
      }
      locala = p;
      if (locala != null) {
        locala.a(paramLong, paramArrayOfFloat);
      }
    }
    
    public void h()
    {
      E0.a locala = r;
      if (locala != null) {
        locala.h();
      }
      locala = p;
      if (locala != null) {
        locala.h();
      }
    }
    
    public void k(long paramLong1, long paramLong2, q paramq, MediaFormat paramMediaFormat)
    {
      D0.p localp = q;
      if (localp != null) {
        localp.k(paramLong1, paramLong2, paramq, paramMediaFormat);
      }
      localp = o;
      if (localp != null) {
        localp.k(paramLong1, paramLong2, paramq, paramMediaFormat);
      }
    }
    
    public void t(int paramInt, Object paramObject)
    {
      if (paramInt != 7)
      {
        if (paramInt != 8)
        {
          if (paramInt == 10000)
          {
            android.support.v4.media.a.a(paramObject);
            q = null;
            r = null;
          }
        }
        else {
          p = ((E0.a)paramObject);
        }
      }
      else {
        o = ((D0.p)paramObject);
      }
    }
  }
  
  public static final class f
    implements F0
  {
    public final Object a;
    public final x0.x b;
    public d0.I c;
    
    public f(Object paramObject, t paramt)
    {
      a = paramObject;
      b = paramt;
      c = paramt.Z();
    }
    
    public Object a()
    {
      return a;
    }
    
    public d0.I b()
    {
      return c;
    }
    
    public void c(d0.I paramI)
    {
      c = paramI;
    }
  }
  
  public final class g
    extends AudioDeviceCallback
  {
    public g() {}
    
    public void onAudioDevicesAdded(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
    {
      if ((f0.T0(f0.this)) && (U0n == 3))
      {
        paramArrayOfAudioDeviceInfo = f0.this;
        f0.V0(paramArrayOfAudioDeviceInfo, U0l, 1, 0);
      }
    }
    
    public void onAudioDevicesRemoved(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
    {
      if (!f0.T0(f0.this))
      {
        paramArrayOfAudioDeviceInfo = f0.this;
        f0.V0(paramArrayOfAudioDeviceInfo, U0l, 1, 3);
      }
    }
  }
}

/* Location:
 * Qualified Name:     k0.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */