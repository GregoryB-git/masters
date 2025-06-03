package v3;

import aa.m0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p4.a.b;
import r5.f;
import v5.a0.a;
import v5.h.a;
import v5.k;
import v5.l.b;
import v5.l.c;
import x5.j.b;
import z4.e0.a;
import z4.j0;
import z4.p.a;
import z4.t.a;
import z4.t.b;

public final class d0
  extends e
{
  public final d A;
  public final p1 B;
  public final t1 C;
  public final u1 D;
  public final long E;
  public int F;
  public boolean G;
  public int H;
  public int I;
  public boolean J;
  public int K;
  public n1 L;
  public z4.e0 M;
  public f1.a N;
  public p0 O;
  public i0 P;
  public AudioTrack Q;
  public Object R;
  public Surface S;
  public int T;
  public v5.w U;
  public int V;
  public x3.d W;
  public float X;
  public boolean Y;
  public boolean Z;
  public boolean a0;
  public final r5.p b;
  public boolean b0;
  public final f1.a c;
  public m c0;
  public final b5.g d = new b5.g(1);
  public p0 d0;
  public final Context e;
  public d1 e0;
  public final f1 f;
  public int f0;
  public final j1[] g;
  public long g0;
  public final r5.o h;
  public final k i;
  public final io.flutter.plugins.firebase.auth.g j;
  public final g0 k;
  public final v5.l<f1.c> l;
  public final CopyOnWriteArraySet<o> m;
  public final r1.b n;
  public final ArrayList o;
  public final boolean p;
  public final t.a q;
  public final w3.a r;
  public final Looper s;
  public final t5.e t;
  public final long u;
  public final long v;
  public final v5.z w;
  public final b x;
  public final c y;
  public final b z;
  
  static
  {
    h0.a("goog.exo.exoplayer");
  }
  
  public d0(r paramr)
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Init ");
      ((StringBuilder)localObject1).append(Integer.toHexString(System.identityHashCode(this)));
      ((StringBuilder)localObject1).append(" [");
      ((StringBuilder)localObject1).append("ExoPlayerLib/2.18.7");
      ((StringBuilder)localObject1).append("] [");
      ((StringBuilder)localObject1).append(v5.e0.e);
      ((StringBuilder)localObject1).append("]");
      v5.m.e("ExoPlayerImpl", ((StringBuilder)localObject1).toString());
      e = a.getApplicationContext();
      r = ((w3.a)h.apply(b));
      W = j;
      T = k;
      Y = false;
      E = r;
      localObject1 = new v3/d0$b;
      ((b)localObject1).<init>(this);
      x = ((b)localObject1);
      Object localObject2 = new v3/d0$c;
      ((c)localObject2).<init>();
      y = ((c)localObject2);
      localObject2 = new android/os/Handler;
      ((Handler)localObject2).<init>(i);
      localObject1 = ((m1)c.get()).a((Handler)localObject2, (b)localObject1, (b)localObject1, (b)localObject1, (b)localObject1);
      g = ((j1[])localObject1);
      boolean bool;
      if (localObject1.length > 0) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.H(bool);
      h = ((r5.o)e.get());
      q = ((t.a)d.get());
      t = ((t5.e)g.get());
      p = l;
      L = m;
      u = n;
      v = o;
      Object localObject3 = i;
      s = ((Looper)localObject3);
      Object localObject4 = b;
      w = ((v5.z)localObject4);
      f = this;
      v5.l locall = new v5/l;
      w localw = new v3/w;
      localw.<init>(this);
      locall.<init>((Looper)localObject3, (v5.c)localObject4, localw);
      l = locall;
      localObject3 = new java/util/concurrent/CopyOnWriteArraySet;
      ((CopyOnWriteArraySet)localObject3).<init>();
      m = ((CopyOnWriteArraySet)localObject3);
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      o = ((ArrayList)localObject3);
      localObject3 = new z4/e0$a;
      ((e0.a)localObject3).<init>();
      M = ((z4.e0)localObject3);
      localObject3 = new r5/p;
      ((r5.p)localObject3).<init>(new l1[localObject1.length], new r5.h[localObject1.length], s1.b, null);
      b = ((r5.p)localObject3);
      localObject1 = new v3/r1$b;
      ((r1.b)localObject1).<init>();
      n = ((r1.b)localObject1);
      localObject1 = new android/util/SparseBooleanArray;
      ((SparseBooleanArray)localObject1).<init>();
      for (int i1 = 0; i1 < 21; i1++)
      {
        i2 = new int[] { 1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28 }[i1];
        x6.b.H(0x1 ^ 0x0);
        ((SparseBooleanArray)localObject1).append(i2, true);
      }
      localObject3 = h;
      localObject3.getClass();
      if ((localObject3 instanceof f))
      {
        x6.b.H(0x0 ^ 0x1);
        ((SparseBooleanArray)localObject1).append(29, true);
      }
      localObject4 = new v3/f1$a;
      x6.b.H(0x1 ^ 0x0);
      localObject3 = new v5/h;
      ((v5.h)localObject3).<init>((SparseBooleanArray)localObject1);
      ((f1.a)localObject4).<init>((v5.h)localObject3);
      c = ((f1.a)localObject4);
      localObject1 = new android/util/SparseBooleanArray;
      ((SparseBooleanArray)localObject1).<init>();
      for (i1 = 0; i1 < ((v5.h)localObject3).b(); i1++)
      {
        i2 = ((v5.h)localObject3).a(i1);
        x6.b.H(0x1 ^ 0x0);
        ((SparseBooleanArray)localObject1).append(i2, true);
      }
      x6.b.H(0x1 ^ 0x0);
      ((SparseBooleanArray)localObject1).append(4, true);
      x6.b.H(0x1 ^ 0x0);
      ((SparseBooleanArray)localObject1).append(10, true);
      localObject3 = new v3/f1$a;
      x6.b.H(0x1 ^ 0x0);
      localObject4 = new v5/h;
      ((v5.h)localObject4).<init>((SparseBooleanArray)localObject1);
      ((f1.a)localObject3).<init>((v5.h)localObject4);
      N = ((f1.a)localObject3);
      i = w.b(s, null);
      localObject3 = new io/flutter/plugins/firebase/auth/g;
      ((io.flutter.plugins.firebase.auth.g)localObject3).<init>(this, 5);
      j = ((io.flutter.plugins.firebase.auth.g)localObject3);
      e0 = d1.h(b);
      r.i0(f, s);
      int i2 = v5.e0.a;
      if (i2 < 31)
      {
        localObject1 = new w3/a0;
        ((w3.a0)localObject1).<init>();
      }
      else
      {
        localObject1 = a.a(e, this, s);
      }
      localObject4 = new v3/g0;
      ((g0)localObject4).<init>(g, h, b, (n0)f.get(), t, F, G, r, L, p, q, false, s, w, (io.flutter.plugins.firebase.auth.g)localObject3, (w3.a0)localObject1);
      k = ((g0)localObject4);
      X = 1.0F;
      F = 0;
      localObject1 = p0.Q;
      O = ((p0)localObject1);
      d0 = ((p0)localObject1);
      i1 = -1;
      f0 = -1;
      if (i2 < 21)
      {
        localObject1 = Q;
        if ((localObject1 != null) && (((AudioTrack)localObject1).getAudioSessionId() != 0))
        {
          Q.release();
          Q = null;
        }
        if (Q == null)
        {
          localObject1 = new android/media/AudioTrack;
          ((AudioTrack)localObject1).<init>(3, 4000, 4, 2, 2, 0, 0);
          Q = ((AudioTrack)localObject1);
        }
        i1 = Q.getAudioSessionId();
      }
      else
      {
        localObject1 = (AudioManager)e.getSystemService("audio");
        if (localObject1 != null) {
          i1 = ((AudioManager)localObject1).generateAudioSessionId();
        }
      }
      V = i1;
      i1 = h5.c.b;
      Z = true;
      s(r);
      localObject3 = t;
      localObject1 = new android/os/Handler;
      ((Handler)localObject1).<init>(s);
      ((t5.e)localObject3).e((Handler)localObject1, r);
      localObject1 = x;
      m.add(localObject1);
      localObject1 = new v3/b;
      ((b)localObject1).<init>(a, (Handler)localObject2, x);
      z = ((b)localObject1);
      ((b)localObject1).a();
      localObject1 = new v3/d;
      ((d)localObject1).<init>(a, (Handler)localObject2, x);
      A = ((d)localObject1);
      ((d)localObject1).c(null);
      localObject1 = new v3/p1;
      ((p1)localObject1).<init>(a, (Handler)localObject2, x);
      B = ((p1)localObject1);
      ((p1)localObject1).b(v5.e0.y(W.c));
      localObject2 = new v3/t1;
      ((t1)localObject2).<init>(a);
      C = ((t1)localObject2);
      localObject2 = new v3/u1;
      ((u1)localObject2).<init>(a);
      D = ((u1)localObject2);
      c0 = Y((p1)localObject1);
      paramr = w5.o.e;
      U = v5.w.c;
      h.d(W);
      j0(Integer.valueOf(V), 1, 10);
      j0(Integer.valueOf(V), 2, 10);
      j0(W, 1, 3);
      j0(Integer.valueOf(T), 2, 4);
      j0(Integer.valueOf(0), 2, 5);
      j0(Boolean.valueOf(Y), 1, 9);
      j0(y, 2, 7);
      j0(y, 6, 8);
      return;
    }
    finally
    {
      d.a();
    }
  }
  
  public static m Y(p1 paramp1)
  {
    paramp1.getClass();
    int i1;
    if (v5.e0.a >= 28) {
      i1 = com.google.android.recaptcha.internal.a.c(d, f);
    } else {
      i1 = 0;
    }
    return new m(0, i1, d.getStreamMaxVolume(f));
  }
  
  public static long c0(d1 paramd1)
  {
    r1.c localc = new r1.c();
    r1.b localb = new r1.b();
    a.g(b.a, localb);
    long l1 = c;
    if (l1 == -9223372036854775807L) {
      l1 = a.m(c, localc).u;
    } else {
      l1 = e + l1;
    }
    return l1;
  }
  
  public static boolean d0(d1 paramd1)
  {
    boolean bool;
    if ((e == 3) && (l) && (m == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final s1 B()
  {
    u0();
    return e0.i.d;
  }
  
  public final int E()
  {
    u0();
    int i1;
    if (g()) {
      i1 = e0.b.b;
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public final int F()
  {
    u0();
    int i1 = b0();
    int i2 = i1;
    if (i1 == -1) {
      i2 = 0;
    }
    return i2;
  }
  
  public final int I()
  {
    u0();
    return e0.m;
  }
  
  public final r1 J()
  {
    u0();
    return e0.a;
  }
  
  public final Looper K()
  {
    return s;
  }
  
  public final boolean L()
  {
    u0();
    return G;
  }
  
  public final long P()
  {
    u0();
    return v5.e0.R(a0(e0));
  }
  
  public final void S(int paramInt, long paramLong, boolean paramBoolean)
  {
    u0();
    int i1 = 1;
    boolean bool;
    if (paramInt >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.q(bool);
    r.S();
    Object localObject1 = e0.a;
    if ((!((r1)localObject1).p()) && (paramInt >= ((r1)localObject1).o())) {
      return;
    }
    H += 1;
    if (g())
    {
      v5.m.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
      localObject2 = new g0.d(e0);
      ((g0.d)localObject2).a(1);
      localObject1 = (d0)j.b;
      i.e(new g.q(4, localObject1, localObject2));
      return;
    }
    if (d() != 1) {
      i1 = 2;
    }
    int i2 = F();
    Object localObject2 = e0(e0.f(i1), (r1)localObject1, f0((r1)localObject1, paramInt, paramLong));
    g0 localg0 = k;
    paramLong = v5.e0.I(paramLong);
    p.k(3, new g0.g((r1)localObject1, paramInt, paramLong)).a();
    s0((d1)localObject2, 0, 1, true, true, 1, a0((d1)localObject2), i2, paramBoolean);
  }
  
  public final p0 X()
  {
    Object localObject1 = J();
    if (((r1)localObject1).p()) {
      return d0;
    }
    Object localObject2 = mFa).c;
    localObject1 = d0;
    localObject1.getClass();
    localObject1 = new p0.a((p0)localObject1);
    localObject2 = d;
    if (localObject2 != null)
    {
      Object localObject3 = a;
      if (localObject3 != null) {
        a = ((CharSequence)localObject3);
      }
      localObject3 = b;
      if (localObject3 != null) {
        b = ((CharSequence)localObject3);
      }
      localObject3 = c;
      if (localObject3 != null) {
        c = ((CharSequence)localObject3);
      }
      localObject3 = d;
      if (localObject3 != null) {
        d = ((CharSequence)localObject3);
      }
      localObject3 = e;
      if (localObject3 != null) {
        e = ((CharSequence)localObject3);
      }
      localObject3 = f;
      if (localObject3 != null) {
        f = ((CharSequence)localObject3);
      }
      localObject3 = o;
      if (localObject3 != null) {
        g = ((CharSequence)localObject3);
      }
      localObject3 = p;
      if (localObject3 != null) {
        h = ((i1)localObject3);
      }
      localObject3 = q;
      if (localObject3 != null) {
        i = ((i1)localObject3);
      }
      localObject3 = r;
      if (localObject3 != null)
      {
        Integer localInteger = s;
        j = ((byte[])((byte[])localObject3).clone());
        k = localInteger;
      }
      localObject3 = t;
      if (localObject3 != null) {
        l = ((Uri)localObject3);
      }
      localObject3 = u;
      if (localObject3 != null) {
        m = ((Integer)localObject3);
      }
      localObject3 = v;
      if (localObject3 != null) {
        n = ((Integer)localObject3);
      }
      localObject3 = w;
      if (localObject3 != null) {
        o = ((Integer)localObject3);
      }
      localObject3 = x;
      if (localObject3 != null) {
        p = ((Boolean)localObject3);
      }
      localObject3 = y;
      if (localObject3 != null) {
        q = ((Boolean)localObject3);
      }
      localObject3 = z;
      if (localObject3 != null) {
        r = ((Integer)localObject3);
      }
      localObject3 = A;
      if (localObject3 != null) {
        r = ((Integer)localObject3);
      }
      localObject3 = B;
      if (localObject3 != null) {
        s = ((Integer)localObject3);
      }
      localObject3 = C;
      if (localObject3 != null) {
        t = ((Integer)localObject3);
      }
      localObject3 = D;
      if (localObject3 != null) {
        u = ((Integer)localObject3);
      }
      localObject3 = E;
      if (localObject3 != null) {
        v = ((Integer)localObject3);
      }
      localObject3 = F;
      if (localObject3 != null) {
        w = ((Integer)localObject3);
      }
      localObject3 = G;
      if (localObject3 != null) {
        x = ((CharSequence)localObject3);
      }
      localObject3 = H;
      if (localObject3 != null) {
        y = ((CharSequence)localObject3);
      }
      localObject3 = I;
      if (localObject3 != null) {
        z = ((CharSequence)localObject3);
      }
      localObject3 = J;
      if (localObject3 != null) {
        A = ((Integer)localObject3);
      }
      localObject3 = K;
      if (localObject3 != null) {
        B = ((Integer)localObject3);
      }
      localObject3 = L;
      if (localObject3 != null) {
        C = ((CharSequence)localObject3);
      }
      localObject3 = M;
      if (localObject3 != null) {
        D = ((CharSequence)localObject3);
      }
      localObject3 = N;
      if (localObject3 != null) {
        E = ((CharSequence)localObject3);
      }
      localObject3 = O;
      if (localObject3 != null) {
        F = ((Integer)localObject3);
      }
      localObject2 = P;
      if (localObject2 != null) {
        G = ((Bundle)localObject2);
      }
    }
    return new p0((p0.a)localObject1);
  }
  
  public final g1 Z(g1.b paramb)
  {
    int i1 = b0();
    g0 localg0 = k;
    r1 localr1 = e0.a;
    int i2 = i1;
    if (i1 == -1) {
      i2 = 0;
    }
    return new g1(localg0, paramb, localr1, i2, w, r);
  }
  
  public final void a()
  {
    u0();
    boolean bool = k();
    Object localObject = A;
    int i1 = 2;
    int i2 = ((d)localObject).e(2, bool);
    if ((bool) && (i2 != 1)) {
      i3 = 2;
    } else {
      i3 = 1;
    }
    r0(i2, i3, bool);
    localObject = e0;
    if (e != 1) {
      return;
    }
    localObject = ((d1)localObject).d(null);
    int i3 = i1;
    if (a.p()) {
      i3 = 4;
    }
    localObject = ((d1)localObject).f(i3);
    H += 1;
    k.p.f(0).a();
    s0((d1)localObject, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
  }
  
  public final long a0(d1 paramd1)
  {
    if (a.p()) {
      return v5.e0.I(g0);
    }
    if (b.a()) {
      return r;
    }
    r1 localr1 = a;
    t.b localb = b;
    long l1 = r;
    localr1.g(a, n);
    return l1 + n.e;
  }
  
  public final int b0()
  {
    if (e0.a.p()) {
      return f0;
    }
    d1 locald1 = e0;
    return a.g(b.a, n).c;
  }
  
  public final void c(e1 parame1)
  {
    u0();
    if (e0.n.equals(parame1)) {
      return;
    }
    d1 locald1 = e0.e(parame1);
    H += 1;
    k.p.k(4, parame1).a();
    s0(locald1, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
  }
  
  public final int d()
  {
    u0();
    return e0.e;
  }
  
  public final d1 e0(d1 paramd1, r1 paramr1, Pair<Object, Long> paramPair)
  {
    boolean bool1;
    if ((!paramr1.p()) && (paramPair == null)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    x6.b.q(bool1);
    r1 localr1 = a;
    d1 locald1 = paramd1.g(paramr1);
    if (paramr1.p())
    {
      paramd1 = d1.s;
      l1 = v5.e0.I(g0);
      paramd1 = locald1.b(paramd1, l1, l1, l1, 0L, j0.d, b, o7.l0.e).a(paramd1);
      p = r;
      return paramd1;
    }
    paramd1 = b.a;
    boolean bool2 = paramd1.equals(first) ^ true;
    t.b localb;
    if (bool2) {
      localb = new t.b(first);
    } else {
      localb = b;
    }
    long l2 = ((Long)second).longValue();
    long l3 = v5.e0.I(y());
    long l1 = l3;
    if (!localr1.p()) {
      l1 = l3 - gn).e;
    }
    int i1;
    if (!bool2)
    {
      boolean bool3 = l2 < l1;
      if (!bool3)
      {
        if (!bool3)
        {
          i1 = paramr1.b(k.a);
          if (i1 != -1)
          {
            paramd1 = locald1;
            if (fn, false).c == ga, n).c) {
              return paramd1;
            }
          }
          paramr1.g(a, n);
          if (localb.a()) {
            l1 = n.a(b, c);
          } else {
            l1 = n.d;
          }
          paramd1 = locald1.b(localb, r, r, d, l1 - r, h, i, j).a(localb);
        }
        else
        {
          x6.b.H(localb.a() ^ true);
          l3 = Math.max(0L, q - (l2 - l1));
          l1 = p;
          if (k.equals(b)) {
            l1 = l2 + l3;
          }
          paramd1 = locald1.b(localb, l2, l2, l2, l3, h, i, j);
        }
        p = l1;
        return paramd1;
      }
    }
    x6.b.H(localb.a() ^ true);
    if (i1 != 0) {
      paramd1 = j0.d;
    } else {
      paramd1 = h;
    }
    if (i1 != 0) {
      paramr1 = b;
    } else {
      paramr1 = i;
    }
    if (i1 != 0)
    {
      paramPair = o7.t.b;
      paramPair = o7.l0.e;
    }
    else
    {
      paramPair = j;
    }
    paramd1 = locald1.b(localb, l2, l2, l2, 0L, paramd1, paramr1, paramPair).a(localb);
    p = l2;
    return paramd1;
  }
  
  public final e1 f()
  {
    u0();
    return e0.n;
  }
  
  public final Pair<Object, Long> f0(r1 paramr1, int paramInt, long paramLong)
  {
    if (paramr1.p())
    {
      f0 = paramInt;
      long l1 = paramLong;
      if (paramLong == -9223372036854775807L) {
        l1 = 0L;
      }
      g0 = l1;
      return null;
    }
    int i1;
    if (paramInt != -1)
    {
      i1 = paramInt;
      if (paramInt < paramr1.o()) {}
    }
    else
    {
      i1 = paramr1.a(G);
      paramLong = v5.e0.R(ma).u);
    }
    return paramr1.i(a, n, i1, v5.e0.I(paramLong));
  }
  
  public final boolean g()
  {
    u0();
    return e0.b.a();
  }
  
  public final void g0(int paramInt1, int paramInt2)
  {
    v5.w localw = U;
    if ((paramInt1 != a) || (paramInt2 != b))
    {
      U = new v5.w(paramInt1, paramInt2);
      l.e(24, new s(paramInt1, paramInt2));
    }
  }
  
  public final long getDuration()
  {
    u0();
    if (g())
    {
      d1 locald1 = e0;
      localObject = b;
      a.g(a, n);
      return v5.e0.R(n.a(b, c));
    }
    Object localObject = J();
    long l1;
    if (((r1)localObject).p()) {
      l1 = -9223372036854775807L;
    } else {
      l1 = v5.e0.R(mFa).v);
    }
    return l1;
  }
  
  public final void h(f1.c paramc)
  {
    u0();
    v5.l locall = l;
    paramc.getClass();
    locall.f();
    Iterator localIterator = d.iterator();
    while (localIterator.hasNext())
    {
      l.c localc = (l.c)localIterator.next();
      if (a.equals(paramc))
      {
        l.b localb = c;
        d = true;
        if (c)
        {
          c = false;
          localb.d(a, b.b());
        }
        d.remove(localc);
      }
    }
  }
  
  /* Error */
  public final void h0()
  {
    // Byte code:
    //   0: ldc_w 1036
    //   3: invokestatic 1039	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6: astore_1
    //   7: aload_1
    //   8: aload_0
    //   9: invokestatic 148	java/lang/System:identityHashCode	(Ljava/lang/Object;)I
    //   12: invokestatic 154	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   15: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: pop
    //   19: aload_1
    //   20: ldc -100
    //   22: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: aload_1
    //   27: ldc -98
    //   29: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: pop
    //   33: aload_1
    //   34: ldc -96
    //   36: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_1
    //   41: getstatic 165	v5/e0:e	Ljava/lang/String;
    //   44: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_1
    //   49: ldc -96
    //   51: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: getstatic 1042	v3/h0:a	Ljava/util/HashSet;
    //   58: astore_2
    //   59: ldc 118
    //   61: monitorenter
    //   62: getstatic 1044	v3/h0:b	Ljava/lang/String;
    //   65: astore_2
    //   66: ldc 118
    //   68: monitorexit
    //   69: aload_1
    //   70: aload_2
    //   71: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: aload_1
    //   76: ldc -89
    //   78: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: ldc -87
    //   84: aload_1
    //   85: invokevirtual 173	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   88: invokestatic 178	v5/m:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_0
    //   92: invokevirtual 616	v3/d0:u0	()V
    //   95: getstatic 402	v5/e0:a	I
    //   98: bipush 21
    //   100: if_icmpge +21 -> 121
    //   103: aload_0
    //   104: getfield 444	v3/d0:Q	Landroid/media/AudioTrack;
    //   107: astore_1
    //   108: aload_1
    //   109: ifnull +12 -> 121
    //   112: aload_1
    //   113: invokevirtual 452	android/media/AudioTrack:release	()V
    //   116: aload_0
    //   117: aconst_null
    //   118: putfield 444	v3/d0:Q	Landroid/media/AudioTrack;
    //   121: aload_0
    //   122: getfield 491	v3/d0:z	Lv3/b;
    //   125: invokevirtual 493	v3/b:a	()V
    //   128: aload_0
    //   129: getfield 506	v3/d0:B	Lv3/p1;
    //   132: astore_1
    //   133: aload_1
    //   134: getfield 1047	v3/p1:e	Lv3/p1$b;
    //   137: astore_2
    //   138: aload_2
    //   139: ifnull +30 -> 169
    //   142: aload_1
    //   143: getfield 1048	v3/p1:a	Landroid/content/Context;
    //   146: aload_2
    //   147: invokevirtual 1052	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   150: goto +14 -> 164
    //   153: astore_2
    //   154: ldc_w 1054
    //   157: ldc_w 1056
    //   160: aload_2
    //   161: invokestatic 1059	v5/m:g	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   164: aload_1
    //   165: aconst_null
    //   166: putfield 1047	v3/p1:e	Lv3/p1$b;
    //   169: aload_0
    //   170: getfield 521	v3/d0:C	Lv3/t1;
    //   173: invokevirtual 353	java/lang/Object:getClass	()Ljava/lang/Class;
    //   176: pop
    //   177: aload_0
    //   178: getfield 526	v3/d0:D	Lv3/u1;
    //   181: invokevirtual 353	java/lang/Object:getClass	()Ljava/lang/Class;
    //   184: pop
    //   185: aload_0
    //   186: getfield 498	v3/d0:A	Lv3/d;
    //   189: astore_1
    //   190: aload_1
    //   191: aconst_null
    //   192: putfield 1062	v3/d:c	Lv3/d$b;
    //   195: aload_1
    //   196: invokevirtual 1063	v3/d:a	()V
    //   199: aload_0
    //   200: getfield 430	v3/d0:k	Lv3/g0;
    //   203: astore_1
    //   204: aload_1
    //   205: monitorenter
    //   206: aload_1
    //   207: getfield 1065	v3/g0:H	Z
    //   210: ifne +60 -> 270
    //   213: aload_1
    //   214: getfield 857	v3/g0:r	Landroid/os/Looper;
    //   217: invokevirtual 1071	android/os/Looper:getThread	()Ljava/lang/Thread;
    //   220: invokevirtual 1076	java/lang/Thread:isAlive	()Z
    //   223: ifne +6 -> 229
    //   226: goto +44 -> 270
    //   229: aload_1
    //   230: getfield 684	v3/g0:p	Lv5/k;
    //   233: bipush 7
    //   235: invokeinterface 1079 2 0
    //   240: pop
    //   241: new 1080	e
    //   244: astore_2
    //   245: aload_2
    //   246: aload_1
    //   247: iconst_3
    //   248: invokespecial 1081	e:<init>	(Ljava/lang/Object;I)V
    //   251: aload_1
    //   252: aload_2
    //   253: aload_1
    //   254: getfield 1083	v3/g0:D	J
    //   257: invokevirtual 1086	v3/g0:g0	(Le;J)V
    //   260: aload_1
    //   261: getfield 1065	v3/g0:H	Z
    //   264: istore_3
    //   265: aload_1
    //   266: monitorexit
    //   267: goto +7 -> 274
    //   270: aload_1
    //   271: monitorexit
    //   272: iconst_1
    //   273: istore_3
    //   274: iload_3
    //   275: ifne +20 -> 295
    //   278: aload_0
    //   279: getfield 305	v3/d0:l	Lv5/l;
    //   282: bipush 10
    //   284: new 1088	r3/j
    //   287: dup
    //   288: iconst_4
    //   289: invokespecial 1089	r3/j:<init>	(I)V
    //   292: invokevirtual 988	v5/l:e	(ILv5/l$a;)V
    //   295: aload_0
    //   296: getfield 305	v3/d0:l	Lv5/l;
    //   299: invokevirtual 1091	v5/l:d	()V
    //   302: aload_0
    //   303: getfield 382	v3/d0:i	Lv5/k;
    //   306: invokeinterface 1093 1 0
    //   311: aload_0
    //   312: getfield 273	v3/d0:t	Lt5/e;
    //   315: aload_0
    //   316: getfield 205	v3/d0:r	Lw3/a;
    //   319: invokeinterface 1096 2 0
    //   324: aload_0
    //   325: getfield 396	v3/d0:e0	Lv3/d1;
    //   328: iconst_1
    //   329: invokevirtual 674	v3/d1:f	(I)Lv3/d1;
    //   332: astore_1
    //   333: aload_0
    //   334: aload_1
    //   335: putfield 396	v3/d0:e0	Lv3/d1;
    //   338: aload_1
    //   339: aload_1
    //   340: getfield 586	v3/d1:b	Lz4/t$b;
    //   343: invokevirtual 912	v3/d1:a	(Lz4/t$b;)Lv3/d1;
    //   346: astore_1
    //   347: aload_0
    //   348: aload_1
    //   349: putfield 396	v3/d0:e0	Lv3/d1;
    //   352: aload_1
    //   353: aload_1
    //   354: getfield 879	v3/d1:r	J
    //   357: putfield 914	v3/d1:p	J
    //   360: aload_0
    //   361: getfield 396	v3/d0:e0	Lv3/d1;
    //   364: lconst_0
    //   365: putfield 955	v3/d1:q	J
    //   368: aload_0
    //   369: getfield 205	v3/d0:r	Lw3/a;
    //   372: invokeinterface 1097 1 0
    //   377: aload_0
    //   378: getfield 261	v3/d0:h	Lr5/o;
    //   381: invokevirtual 1099	r5/o:b	()V
    //   384: aload_0
    //   385: getfield 1101	v3/d0:S	Landroid/view/Surface;
    //   388: astore_1
    //   389: aload_1
    //   390: ifnull +12 -> 402
    //   393: aload_1
    //   394: invokevirtual 1104	android/view/Surface:release	()V
    //   397: aload_0
    //   398: aconst_null
    //   399: putfield 1101	v3/d0:S	Landroid/view/Surface;
    //   402: getstatic 472	h5/c:b	I
    //   405: istore 4
    //   407: aload_0
    //   408: iconst_1
    //   409: putfield 1106	v3/d0:b0	Z
    //   412: return
    //   413: astore_2
    //   414: aload_1
    //   415: monitorexit
    //   416: aload_2
    //   417: athrow
    //   418: astore_1
    //   419: ldc 118
    //   421: monitorexit
    //   422: aload_1
    //   423: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	424	0	this	d0
    //   418	5	1	localObject2	Object
    //   58	89	2	localObject3	Object
    //   153	8	2	localRuntimeException	RuntimeException
    //   244	9	2	locale	e
    //   413	4	2	localObject4	Object
    //   264	11	3	bool	boolean
    //   405	1	4	i1	int
    // Exception table:
    //   from	to	target	type
    //   142	150	153	java/lang/RuntimeException
    //   206	226	413	finally
    //   229	265	413	finally
    //   62	66	418	finally
  }
  
  public final long i()
  {
    u0();
    return v5.e0.R(e0.q);
  }
  
  public final d1 i0(int paramInt)
  {
    int i1 = F();
    r1 localr1 = J();
    int i2 = o.size();
    H += 1;
    for (int i3 = paramInt - 1; i3 >= 0; i3--) {
      o.remove(i3);
    }
    M = M.a(0, paramInt);
    Object localObject1 = new h1(o, M);
    Object localObject2 = e0;
    long l1 = y();
    boolean bool = localr1.p();
    int i4 = -1;
    if ((!bool) && (!((r1)localObject1).p()))
    {
      i3 = F();
      localObject3 = localr1.i(a, n, i3, v5.e0.I(l1));
      Object localObject4 = first;
      if (((a)localObject1).b(localObject4) == -1)
      {
        localObject3 = g0.G(a, n, F, G, localObject4, localr1, (r1)localObject1);
        if (localObject3 != null)
        {
          ((a)localObject1).g(localObject3, n);
          i3 = n.c;
          localObject3 = f0((r1)localObject1, i3, v5.e0.R(ma).u));
        }
        else
        {
          localObject3 = f0((r1)localObject1, -1, -9223372036854775807L);
        }
      }
    }
    else
    {
      if ((!localr1.p()) && (((r1)localObject1).p())) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if (i3 == 0) {
        i4 = b0();
      }
      if (i3 != 0) {
        l1 = -9223372036854775807L;
      }
      localObject3 = f0((r1)localObject1, i4, l1);
    }
    localObject1 = e0((d1)localObject2, (r1)localObject1, (Pair)localObject3);
    i3 = e;
    if ((i3 != 1) && (i3 != 4) && (paramInt > 0) && (paramInt == i2) && (i1 >= a.o())) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    Object localObject3 = localObject1;
    if (i3 != 0) {
      localObject3 = ((d1)localObject1).f(4);
    }
    localObject2 = k;
    localObject1 = M;
    p.d((z4.e0)localObject1, paramInt).a();
    return (d1)localObject3;
  }
  
  public final void j0(Object paramObject, int paramInt1, int paramInt2)
  {
    for (Object localObject : g) {
      if (((j1)localObject).x() == paramInt1)
      {
        localObject = Z((g1.b)localObject);
        x6.b.H(g ^ true);
        d = paramInt2;
        x6.b.H(g ^ true);
        e = paramObject;
        ((g1)localObject).c();
      }
    }
  }
  
  public final boolean k()
  {
    u0();
    return e0.l;
  }
  
  public final void k0(x3.d paramd, boolean paramBoolean)
  {
    u0();
    if (b0) {
      return;
    }
    boolean bool = v5.e0.a(W, paramd);
    int i1 = 1;
    if (!bool)
    {
      W = paramd;
      j0(paramd, 1, 3);
      B.b(v5.e0.y(c));
      l.c(20, new d(paramd, 4));
    }
    d locald = A;
    x3.d locald1;
    if (paramBoolean) {
      locald1 = paramd;
    } else {
      locald1 = null;
    }
    locald.c(locald1);
    h.d(paramd);
    paramBoolean = k();
    int i2 = A.e(d(), paramBoolean);
    int i3 = i1;
    if (paramBoolean)
    {
      i3 = i1;
      if (i2 != 1) {
        i3 = 2;
      }
    }
    r0(i2, i3, paramBoolean);
    l.b();
  }
  
  public final void l0(z4.t paramt)
  {
    u0();
    Object localObject1 = Collections.singletonList(paramt);
    u0();
    u0();
    b0();
    P();
    H += 1;
    if (!o.isEmpty())
    {
      i1 = o.size();
      for (i2 = i1 - 1; i2 >= 0; i2--) {
        o.remove(i2);
      }
      M = M.a(0, i1);
    }
    paramt = new ArrayList();
    for (int i2 = 0; i2 < ((List)localObject1).size(); i2++)
    {
      localObject2 = new z0.c((z4.t)((List)localObject1).get(i2), p);
      paramt.add(localObject2);
      ArrayList localArrayList = o;
      localObject3 = b;
      localArrayList.add(i2 + 0, new d(a.w, localObject3));
    }
    M = M.e(0, paramt.size());
    localObject1 = new h1(o, M);
    if ((!((r1)localObject1).p()) && (-1 >= f)) {
      throw new l0();
    }
    int i3 = ((a)localObject1).a(G);
    Object localObject2 = e0(e0, (r1)localObject1, f0((r1)localObject1, i3, -9223372036854775807L));
    int i1 = e;
    i2 = i1;
    if (i3 != -1)
    {
      i2 = i1;
      if (i1 != 1) {
        if ((!((r1)localObject1).p()) && (i3 < f)) {
          i2 = 2;
        } else {
          i2 = 4;
        }
      }
    }
    Object localObject3 = ((d1)localObject2).f(i2);
    localObject2 = k;
    long l1 = v5.e0.I(-9223372036854775807L);
    localObject1 = M;
    p.k(17, new g0.a(paramt, (z4.e0)localObject1, i3, l1)).a();
    boolean bool;
    if ((!e0.b.a.equals(b.a)) && (!e0.a.p())) {
      bool = true;
    } else {
      bool = false;
    }
    s0((d1)localObject3, 0, 1, false, bool, 4, a0((d1)localObject3), -1, false);
  }
  
  public final void m0(boolean paramBoolean)
  {
    u0();
    int i1 = A.e(d(), paramBoolean);
    int i2 = 1;
    int i3 = i2;
    if (paramBoolean)
    {
      i3 = i2;
      if (i1 != 1) {
        i3 = 2;
      }
    }
    r0(i1, i3, paramBoolean);
  }
  
  public final void n(boolean paramBoolean)
  {
    u0();
    if (G != paramBoolean)
    {
      G = paramBoolean;
      k.p.b(12, paramBoolean, 0).a();
      l.c(9, new v(paramBoolean));
      q0();
      l.b();
    }
  }
  
  /* Error */
  public final void n0(Surface paramSurface)
  {
    // Byte code:
    //   0: new 312	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 313	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 250	v3/d0:g	[Lv3/j1;
    //   12: astore_3
    //   13: aload_3
    //   14: arraylength
    //   15: istore 4
    //   17: iconst_0
    //   18: istore 5
    //   20: iconst_1
    //   21: istore 6
    //   23: iload 5
    //   25: iload 4
    //   27: if_icmpge +78 -> 105
    //   30: aload_3
    //   31: iload 5
    //   33: aaload
    //   34: astore 7
    //   36: aload 7
    //   38: invokeinterface 1136 1 0
    //   43: iconst_2
    //   44: if_icmpne +55 -> 99
    //   47: aload_0
    //   48: aload 7
    //   50: invokevirtual 1138	v3/d0:Z	(Lv3/g1$b;)Lv3/g1;
    //   53: astore 7
    //   55: aload 7
    //   57: getfield 1140	v3/g1:g	Z
    //   60: iconst_1
    //   61: ixor
    //   62: invokestatic 255	x6/b:H	(Z)V
    //   65: aload 7
    //   67: iconst_1
    //   68: putfield 1142	v3/g1:d	I
    //   71: iconst_1
    //   72: aload 7
    //   74: getfield 1140	v3/g1:g	Z
    //   77: ixor
    //   78: invokestatic 255	x6/b:H	(Z)V
    //   81: aload 7
    //   83: aload_1
    //   84: putfield 1144	v3/g1:e	Ljava/lang/Object;
    //   87: aload 7
    //   89: invokevirtual 1146	v3/g1:c	()V
    //   92: aload_2
    //   93: aload 7
    //   95: invokevirtual 1182	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   98: pop
    //   99: iinc 5 1
    //   102: goto -82 -> 20
    //   105: aload_0
    //   106: getfield 1228	v3/d0:R	Ljava/lang/Object;
    //   109: astore_3
    //   110: aload_3
    //   111: ifnull +86 -> 197
    //   114: aload_3
    //   115: aload_1
    //   116: if_acmpeq +81 -> 197
    //   119: aload_2
    //   120: invokevirtual 1229	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   123: astore_2
    //   124: aload_2
    //   125: invokeinterface 1003 1 0
    //   130: ifeq +29 -> 159
    //   133: aload_2
    //   134: invokeinterface 1006 1 0
    //   139: checkcast 855	v3/g1
    //   142: aload_0
    //   143: getfield 219	v3/d0:E	J
    //   146: invokevirtual 1232	v3/g1:a	(J)V
    //   149: goto -25 -> 124
    //   152: astore_2
    //   153: invokestatic 1235	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   156: invokevirtual 1238	java/lang/Thread:interrupt	()V
    //   159: iconst_0
    //   160: istore 5
    //   162: aload_0
    //   163: getfield 1228	v3/d0:R	Ljava/lang/Object;
    //   166: astore_2
    //   167: aload_0
    //   168: getfield 1101	v3/d0:S	Landroid/view/Surface;
    //   171: astore_3
    //   172: iload 5
    //   174: istore 6
    //   176: aload_2
    //   177: aload_3
    //   178: if_acmpne +22 -> 200
    //   181: aload_3
    //   182: invokevirtual 1104	android/view/Surface:release	()V
    //   185: aload_0
    //   186: aconst_null
    //   187: putfield 1101	v3/d0:S	Landroid/view/Surface;
    //   190: iload 5
    //   192: istore 6
    //   194: goto +6 -> 200
    //   197: iconst_0
    //   198: istore 6
    //   200: aload_0
    //   201: aload_1
    //   202: putfield 1228	v3/d0:R	Ljava/lang/Object;
    //   205: iload 6
    //   207: ifeq +27 -> 234
    //   210: aload_0
    //   211: iconst_0
    //   212: new 1240	v3/n
    //   215: dup
    //   216: iconst_2
    //   217: sipush 1003
    //   220: new 1242	n7/w
    //   223: dup
    //   224: iconst_3
    //   225: invokespecial 1243	n7/w:<init>	(I)V
    //   228: invokespecial 1246	v3/n:<init>	(IILjava/lang/Throwable;)V
    //   231: invokevirtual 1250	v3/d0:p0	(ZLv3/n;)V
    //   234: return
    //   235: astore_2
    //   236: iload 6
    //   238: istore 5
    //   240: goto -78 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	this	d0
    //   0	243	1	paramSurface	Surface
    //   7	127	2	localObject1	Object
    //   152	1	2	localInterruptedException	InterruptedException
    //   166	11	2	localObject2	Object
    //   235	1	2	localTimeoutException	java.util.concurrent.TimeoutException
    //   12	170	3	localObject3	Object
    //   15	13	4	i1	int
    //   18	221	5	i2	int
    //   21	216	6	i3	int
    //   34	60	7	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   119	124	152	java/lang/InterruptedException
    //   124	149	152	java/lang/InterruptedException
    //   119	124	235	java/util/concurrent/TimeoutException
    //   124	149	235	java/util/concurrent/TimeoutException
  }
  
  public final void o(boolean paramBoolean)
  {
    u0();
    A.e(1, k());
    p0(paramBoolean, null);
    o7.l0 locall0 = o7.l0.e;
    long l1 = e0.r;
    new h5.c(locall0);
  }
  
  public final void o0(float paramFloat)
  {
    u0();
    paramFloat = v5.e0.h(paramFloat, 0.0F, 1.0F);
    if (X == paramFloat) {
      return;
    }
    X = paramFloat;
    j0(Float.valueOf(A.g * paramFloat), 1, 2);
    l.e(22, new x(paramFloat));
  }
  
  public final int p()
  {
    u0();
    if (e0.a.p()) {
      return 0;
    }
    d1 locald1 = e0;
    return a.b(b.a);
  }
  
  public final void p0(boolean paramBoolean, n paramn)
  {
    if (paramBoolean)
    {
      localObject = i0(o.size()).d(null);
    }
    else
    {
      localObject = e0;
      localObject = ((d1)localObject).a(b);
      p = r;
      q = 0L;
    }
    paramBoolean = true;
    d1 locald1 = ((d1)localObject).f(1);
    Object localObject = locald1;
    if (paramn != null) {
      localObject = locald1.d(paramn);
    }
    H += 1;
    k.p.f(6).a();
    if ((!a.p()) || (e0.a.p())) {
      paramBoolean = false;
    }
    s0((d1)localObject, 0, 1, false, paramBoolean, 4, a0((d1)localObject), -1, false);
  }
  
  public final void q0()
  {
    f1.a locala = N;
    Object localObject1 = f;
    Object localObject2 = c;
    int i1 = v5.e0.a;
    boolean bool1 = ((f1)localObject1).g();
    boolean bool2 = ((f1)localObject1).A();
    boolean bool3 = ((f1)localObject1).q();
    boolean bool4 = ((f1)localObject1).C();
    boolean bool5 = ((f1)localObject1).Q();
    boolean bool6 = ((f1)localObject1).H();
    boolean bool7 = ((f1)localObject1).J().p();
    f1.a.a locala1 = new f1.a.a();
    localObject1 = a;
    localObject2 = a;
    localObject1.getClass();
    boolean bool8 = false;
    for (i1 = 0; i1 < ((v5.h)localObject2).b(); i1++) {
      ((h.a)localObject1).a(((v5.h)localObject2).a(i1));
    }
    boolean bool9 = bool1 ^ true;
    locala1.a(4, bool9);
    if ((bool2) && (!bool1)) {
      bool10 = true;
    } else {
      bool10 = false;
    }
    locala1.a(5, bool10);
    if ((bool3) && (!bool1)) {
      bool10 = true;
    } else {
      bool10 = false;
    }
    locala1.a(6, bool10);
    if ((!bool7) && ((bool3) || (!bool5) || (bool2)) && (!bool1)) {
      bool10 = true;
    } else {
      bool10 = false;
    }
    locala1.a(7, bool10);
    if ((bool4) && (!bool1)) {
      bool10 = true;
    } else {
      bool10 = false;
    }
    locala1.a(8, bool10);
    if ((!bool7) && ((bool4) || ((bool5) && (bool6))) && (!bool1)) {
      bool10 = true;
    } else {
      bool10 = false;
    }
    locala1.a(9, bool10);
    locala1.a(10, bool9);
    if ((bool2) && (!bool1)) {
      bool10 = true;
    } else {
      bool10 = false;
    }
    locala1.a(11, bool10);
    boolean bool10 = bool8;
    if (bool2)
    {
      bool10 = bool8;
      if (!bool1) {
        bool10 = true;
      }
    }
    locala1.a(12, bool10);
    localObject1 = new f1.a(a.b());
    N = ((f1.a)localObject1);
    if (!((f1.a)localObject1).equals(locala)) {
      l.c(13, new w(this));
    }
  }
  
  public final int r()
  {
    u0();
    int i1;
    if (g()) {
      i1 = e0.b.c;
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public final void r0(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = 0;
    int i2;
    if ((paramBoolean) && (paramInt1 != -1)) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i3 = i1;
    if (i2 != 0)
    {
      i3 = i1;
      if (paramInt1 != 1) {
        i3 = 1;
      }
    }
    d1 locald1 = e0;
    if ((l == i2) && (m == i3)) {
      return;
    }
    H += 1;
    locald1 = locald1.c(i3, i2);
    k.p.b(1, i2, i3).a();
    s0(locald1, 0, paramInt2, false, false, 5, -9223372036854775807L, -1, false);
  }
  
  public final void s(f1.c paramc)
  {
    v5.l locall = l;
    paramc.getClass();
    locall.a(paramc);
  }
  
  public final void s0(d1 paramd1, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, int paramInt3, long paramLong, int paramInt4, boolean paramBoolean3)
  {
    d1 locald1 = e0;
    e0 = paramd1;
    boolean bool1 = a.equals(a) ^ true;
    Object localObject1 = a;
    Object localObject2 = a;
    boolean bool2 = ((r1)localObject2).p();
    Object localObject3 = Integer.valueOf(-1);
    int i1;
    if ((bool2) && (((r1)localObject1).p()))
    {
      localObject3 = new Pair(Boolean.FALSE, localObject3);
    }
    else if (((r1)localObject2).p() != ((r1)localObject1).p())
    {
      localObject3 = new Pair(Boolean.TRUE, Integer.valueOf(3));
    }
    else if (!mgb.a, n).c, a).a.equals(mgb.a, n).c, a).a))
    {
      if ((paramBoolean2) && (paramInt3 == 0))
      {
        i1 = 1;
      }
      else if ((paramBoolean2) && (paramInt3 == 1))
      {
        i1 = 2;
      }
      else
      {
        if (!bool1) {
          break label245;
        }
        i1 = 3;
      }
      localObject3 = new Pair(Boolean.TRUE, Integer.valueOf(i1));
      break label350;
      label245:
      throw new IllegalStateException();
    }
    else if ((paramBoolean2) && (paramInt3 == 0) && (b.d < b.d))
    {
      localObject3 = new Pair(Boolean.TRUE, Integer.valueOf(0));
    }
    else if ((paramBoolean2) && (paramInt3 == 1) && (paramBoolean3))
    {
      localObject3 = new Pair(Boolean.TRUE, Integer.valueOf(2));
    }
    else
    {
      localObject3 = new Pair(Boolean.FALSE, localObject3);
    }
    label350:
    bool2 = ((Boolean)first).booleanValue();
    int i2 = ((Integer)second).intValue();
    localObject1 = O;
    if (bool2)
    {
      if (!a.p())
      {
        i1 = a.g(b.a, n).c;
        localObject3 = a.m(i1, a).c;
      }
      else
      {
        localObject3 = null;
      }
      d0 = p0.Q;
    }
    else
    {
      localObject3 = null;
    }
    Object localObject4;
    Object localObject5;
    int i3;
    if ((bool2) || (!j.equals(j)))
    {
      localObject1 = d0;
      localObject1.getClass();
      localObject2 = new p0.a((p0)localObject1);
      localObject4 = j;
      for (i1 = 0; i1 < ((List)localObject4).size(); i1++)
      {
        localObject5 = (p4.a)((List)localObject4).get(i1);
        for (i3 = 0;; i3++)
        {
          localObject1 = a;
          if (i3 >= localObject1.length) {
            break;
          }
          localObject1[i3].l((p0.a)localObject2);
        }
      }
      d0 = new p0((p0.a)localObject2);
      localObject1 = X();
    }
    paramBoolean3 = ((p0)localObject1).equals(O);
    O = ((p0)localObject1);
    if (l != l) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (e != e) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if ((i3 != 0) || (i1 != 0)) {
      t0();
    }
    int i4;
    if (g != g) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    if (bool1) {
      l.c(0, new y(paramd1, paramInt1, 0));
    }
    if (paramBoolean2)
    {
      localObject5 = new r1.b();
      if (!a.p())
      {
        localObject1 = b.a;
        a.g(localObject1, (r1.b)localObject5);
        paramInt4 = c;
        paramInt1 = a.b(localObject1);
        localObject4 = a.m(paramInt4, a).a;
        localObject2 = a.c;
      }
      else
      {
        localObject4 = null;
        localObject2 = null;
        localObject1 = null;
        paramInt1 = -1;
      }
      paramBoolean2 = b.a();
      if (paramInt3 == 0)
      {
        if (paramBoolean2)
        {
          localb = b;
          l1 = ((r1.b)localObject5).a(b, c);
        }
        else
        {
          if (b.e != -1)
          {
            l1 = c0(e0);
            break label954;
          }
          l2 = e;
          l1 = d;
          break label947;
        }
      }
      else
      {
        if (!paramBoolean2) {
          break label933;
        }
        l1 = r;
      }
      long l2 = c0(locald1);
      break label958;
      label933:
      long l1 = e;
      l2 = r;
      label947:
      l1 += l2;
      label954:
      l2 = l1;
      label958:
      l1 = v5.e0.R(l1);
      l2 = v5.e0.R(l2);
      localObject5 = b;
      localObject5 = new f1.d(localObject4, paramInt4, (o0)localObject2, localObject1, paramInt1, l1, l2, b, c);
      paramInt4 = F();
      if (!e0.a.p())
      {
        localObject1 = e0;
        localObject2 = b.a;
        a.g(localObject2, n);
        paramInt1 = e0.a.b(localObject2);
        localObject4 = e0.a.m(paramInt4, a).a;
        localObject1 = a.c;
      }
      else
      {
        localObject4 = null;
        localObject1 = null;
        localObject2 = null;
        paramInt1 = -1;
      }
      l1 = v5.e0.R(paramLong);
      if (e0.b.a()) {
        paramLong = v5.e0.R(c0(e0));
      } else {
        paramLong = l1;
      }
      t.b localb = e0.b;
      localObject1 = new f1.d(localObject4, paramInt4, (o0)localObject1, localObject2, paramInt1, l1, paramLong, b, c);
      l.c(11, new b0(paramInt3, (f1.d)localObject5, (f1.d)localObject1));
    }
    if (bool2) {
      l.c(1, new c0(localObject3, i2, 0));
    }
    if (f != f)
    {
      l.c(10, new a0(paramd1, 1));
      if (f != null) {
        l.c(10, new t(paramd1, 0));
      }
    }
    localObject3 = i;
    localObject1 = i;
    if (localObject3 != localObject1)
    {
      h.a(e);
      l.c(2, new z(paramd1, 1));
    }
    if ((paramBoolean3 ^ true))
    {
      localObject3 = O;
      l.c(14, new io.flutter.plugins.firebase.auth.g(localObject3, 7));
    }
    if (i4 != 0) {
      l.c(3, new a0(paramd1, 2));
    }
    if ((i3 != 0) || (i1 != 0)) {
      l.c(-1, new t(paramd1, 1));
    }
    if (i3 != 0) {
      l.c(4, new z(paramd1, 2));
    }
    if (i1 != 0) {
      l.c(5, new d9.g(paramd1, paramInt2));
    }
    if (m != m) {
      l.c(6, new z(paramd1, 0));
    }
    if (d0(locald1) != d0(paramd1)) {
      l.c(7, new io.flutter.plugins.firebase.auth.g(paramd1, 6));
    }
    if (!n.equals(n)) {
      l.c(12, new a0(paramd1, 0));
    }
    if (paramBoolean1) {
      l.c(-1, new r3.j(5));
    }
    q0();
    l.b();
    if (o != o)
    {
      paramd1 = m.iterator();
      while (paramd1.hasNext()) {
        ((o)paramd1.next()).B();
      }
    }
  }
  
  public final void stop()
  {
    u0();
    o(false);
  }
  
  public final void t0()
  {
    int i1 = d();
    if (i1 != 1) {
      if ((i1 != 2) && (i1 != 3))
      {
        if (i1 != 4) {
          throw new IllegalStateException();
        }
      }
      else
      {
        u0();
        boolean bool = e0.o;
        localObject = C;
        k();
        localObject.getClass();
        localObject = D;
        k();
        break label89;
      }
    }
    C.getClass();
    Object localObject = D;
    label89:
    localObject.getClass();
  }
  
  public final void u(int paramInt)
  {
    u0();
    if (F != paramInt)
    {
      F = paramInt;
      k.p.b(11, paramInt, 0).a();
      l.c(8, new d9.r(paramInt));
      q0();
      l.b();
    }
  }
  
  public final void u0()
  {
    Object localObject1 = d;
    int i1 = 0;
    try
    {
      for (;;)
      {
        boolean bool = a;
        if (bool) {
          break;
        }
        try
        {
          localObject1.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          i1 = 1;
        }
      }
      if (i1 != 0) {
        Thread.currentThread().interrupt();
      }
      if (Thread.currentThread() != s.getThread())
      {
        String str = v5.e0.m("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new Object[] { Thread.currentThread().getName(), s.getThread().getName() });
        if (!Z)
        {
          if (a0) {
            localObject1 = null;
          } else {
            localObject1 = new IllegalStateException();
          }
          v5.m.g("ExoPlayerImpl", str, (Exception)localObject1);
          a0 = true;
        }
        else
        {
          throw new IllegalStateException(str);
        }
      }
      return;
    }
    finally {}
  }
  
  public final c1 v()
  {
    u0();
    return e0.f;
  }
  
  public final int x()
  {
    u0();
    return F;
  }
  
  public final long y()
  {
    u0();
    if (g())
    {
      d1 locald1 = e0;
      a.g(b.a, n);
      locald1 = e0;
      long l1;
      if (c == -9223372036854775807L) {
        l1 = v5.e0.R(a.m(F(), a).u);
      } else {
        l1 = v5.e0.R(n.e) + v5.e0.R(e0.c);
      }
      return l1;
    }
    return P();
  }
  
  public final long z()
  {
    u0();
    Object localObject;
    long l1;
    if (g())
    {
      localObject = e0;
      if (k.equals(b)) {
        l1 = v5.e0.R(e0.p);
      } else {
        l1 = getDuration();
      }
      return l1;
    }
    u0();
    if (e0.a.p())
    {
      l1 = g0;
    }
    else
    {
      localObject = e0;
      if (k.d != b.d)
      {
        l1 = v5.e0.R(a.m(F(), a).v);
      }
      else
      {
        l1 = p;
        if (e0.k.a())
        {
          localObject = e0;
          localObject = a.g(k.a, n);
          l1 = ((r1.b)localObject).d(e0.k.b);
          if (l1 == Long.MIN_VALUE) {
            l1 = d;
          }
        }
        localObject = e0;
        a.g(k.a, n);
        l1 = v5.e0.R(l1 + n.e);
      }
    }
    return l1;
  }
  
  public static final class a
  {
    public static w3.a0 a(Context paramContext, d0 paramd0, boolean paramBoolean)
    {
      MediaMetricsManager localMediaMetricsManager = (MediaMetricsManager)paramContext.getSystemService("media_metrics");
      if (localMediaMetricsManager == null) {
        paramContext = null;
      } else {
        paramContext = new w3.y(paramContext, localMediaMetricsManager.createPlaybackSession());
      }
      if (paramContext == null)
      {
        v5.m.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
        return new w3.a0(LogSessionId.LOG_SESSION_ID_NONE);
      }
      if (paramBoolean) {
        r.g0(paramContext);
      }
      return new w3.a0(c.getSessionId());
    }
  }
  
  public final class b
    implements w5.n, x3.l, h5.m, p4.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, j.b, d.b, b.b, p1.a, o
  {
    public b() {}
    
    public final void A(z3.e parame)
    {
      r.A(parame);
      getClass();
      getClass();
    }
    
    public final void B()
    {
      t0();
    }
    
    public final void C(long paramLong1, long paramLong2, String paramString)
    {
      r.C(paramLong1, paramLong2, paramString);
    }
    
    public final void a(z3.e parame)
    {
      r.a(parame);
      P = null;
    }
    
    public final void b(w5.o paramo)
    {
      getClass();
      l.e(25, new m0(paramo, 3));
    }
    
    public final void c(String paramString)
    {
      r.c(paramString);
    }
    
    public final void e(int paramInt, long paramLong)
    {
      r.e(paramInt, paramLong);
    }
    
    public final void f()
    {
      n0(null);
    }
    
    public final void g(z3.e parame)
    {
      getClass();
      r.g(parame);
    }
    
    public final void h(i0 parami0, z3.i parami)
    {
      d0 locald0 = d0.this;
      P = parami0;
      r.h(parami0, parami);
    }
    
    public final void i(String paramString)
    {
      r.i(paramString);
    }
    
    public final void j(h5.c paramc)
    {
      getClass();
      l.e(27, new d(paramc, 6));
    }
    
    public final void k(int paramInt, long paramLong)
    {
      r.k(paramInt, paramLong);
    }
    
    public final void l(Object paramObject, long paramLong)
    {
      r.l(paramObject, paramLong);
      d0 locald0 = d0.this;
      if (R == paramObject) {
        l.e(26, new r3.j(6));
      }
    }
    
    public final void m(Surface paramSurface)
    {
      n0(paramSurface);
    }
    
    public final void n(z3.e parame)
    {
      getClass();
      r.n(parame);
    }
    
    public final void o(boolean paramBoolean)
    {
      d0 locald0 = d0.this;
      if (Y == paramBoolean) {
        return;
      }
      Y = paramBoolean;
      l.e(23, new u(1, paramBoolean));
    }
    
    public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      d0 locald0 = d0.this;
      locald0.getClass();
      paramSurfaceTexture = new Surface(paramSurfaceTexture);
      locald0.n0(paramSurfaceTexture);
      S = paramSurfaceTexture;
      g0(paramInt1, paramInt2);
    }
    
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      n0(null);
      g0(0, 0);
      return true;
    }
    
    public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      g0(paramInt1, paramInt2);
    }
    
    public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
    
    public final void p(Exception paramException)
    {
      r.p(paramException);
    }
    
    public final void r(List<h5.a> paramList)
    {
      l.e(27, new e(paramList, 4));
    }
    
    public final void s(long paramLong)
    {
      r.s(paramLong);
    }
    
    public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
    {
      g0(paramInt2, paramInt3);
    }
    
    public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
    {
      getClass();
    }
    
    public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
    {
      getClass();
      g0(0, 0);
    }
    
    public final void t(Exception paramException)
    {
      r.t(paramException);
    }
    
    public final void u(i0 parami0, z3.i parami)
    {
      getClass();
      r.u(parami0, parami);
    }
    
    public final void v(Exception paramException)
    {
      r.v(paramException);
    }
    
    public final void w(p4.a parama)
    {
      d0 locald0 = d0.this;
      Object localObject = d0;
      localObject.getClass();
      localObject = new p0.a((p0)localObject);
      for (int i = 0;; i++)
      {
        a.b[] arrayOfb = a;
        if (i >= arrayOfb.length) {
          break;
        }
        arrayOfb[i].l((p0.a)localObject);
      }
      d0 = new p0((p0.a)localObject);
      localObject = X();
      if (!((p0)localObject).equals(O))
      {
        locald0 = d0.this;
        O = ((p0)localObject);
        l.c(14, new io.flutter.plugins.firebase.auth.g(this, 8));
      }
      l.c(28, new d(parama, 5));
      l.b();
    }
    
    public final void y(long paramLong1, long paramLong2, String paramString)
    {
      r.y(paramLong1, paramLong2, paramString);
    }
    
    public final void z(int paramInt, long paramLong1, long paramLong2)
    {
      r.z(paramInt, paramLong1, paramLong2);
    }
  }
  
  public static final class c
    implements w5.i, x5.a, g1.b
  {
    public w5.i a;
    public x5.a b;
    public w5.i c;
    public x5.a d;
    
    public final void a(long paramLong, float[] paramArrayOfFloat)
    {
      x5.a locala = d;
      if (locala != null) {
        locala.a(paramLong, paramArrayOfFloat);
      }
      locala = b;
      if (locala != null) {
        locala.a(paramLong, paramArrayOfFloat);
      }
    }
    
    public final void c(long paramLong1, long paramLong2, i0 parami0, MediaFormat paramMediaFormat)
    {
      w5.i locali = c;
      if (locali != null) {
        locali.c(paramLong1, paramLong2, parami0, paramMediaFormat);
      }
      locali = a;
      if (locali != null) {
        locali.c(paramLong1, paramLong2, parami0, paramMediaFormat);
      }
    }
    
    public final void f()
    {
      x5.a locala = d;
      if (locala != null) {
        locala.f();
      }
      locala = b;
      if (locala != null) {
        locala.f();
      }
    }
    
    public final void q(int paramInt, Object paramObject)
    {
      if (paramInt != 7)
      {
        if (paramInt != 8)
        {
          if (paramInt == 10000)
          {
            paramObject = (x5.j)paramObject;
            if (paramObject == null)
            {
              paramObject = null;
              c = null;
            }
            else
            {
              c = ((x5.j)paramObject).getVideoFrameMetadataListener();
              paramObject = ((x5.j)paramObject).getCameraMotionListener();
            }
            d = ((x5.a)paramObject);
          }
        }
        else {
          b = ((x5.a)paramObject);
        }
      }
      else {
        a = ((w5.i)paramObject);
      }
    }
  }
  
  public static final class d
    implements t0
  {
    public final Object a;
    public r1 b;
    
    public d(p.a parama, Object paramObject)
    {
      a = paramObject;
      b = parama;
    }
    
    public final Object a()
    {
      return a;
    }
    
    public final r1 b()
    {
      return b;
    }
  }
}

/* Location:
 * Qualified Name:     v3.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */