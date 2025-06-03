package l0;

import X2.g0;
import X2.v;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics.Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent.Builder;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import d0.A;
import d0.B;
import d0.D;
import d0.D.e;
import d0.I;
import d0.I.b;
import d0.I.c;
import d0.L;
import d0.L.a;
import d0.P;
import d0.g;
import d0.m;
import d0.m.b;
import d0.q;
import d0.q.b;
import d0.u.h;
import g0.M;
import g0.a;
import i0.p.b;
import i0.s;
import i0.z.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import m0.z.c;
import m0.z.f;
import p0.T;
import p0.h.e;
import p0.n.a;
import t0.w.d;
import x0.x.b;

public final class w1
  implements c, x1.a
{
  public boolean A;
  public final Context a;
  public final x1 b;
  public final PlaybackSession c;
  public final long d;
  public final I.c e;
  public final I.b f;
  public final HashMap g;
  public final HashMap h;
  public String i;
  public PlaybackMetrics.Builder j;
  public int k;
  public int l;
  public int m;
  public B n;
  public b o;
  public b p;
  public b q;
  public q r;
  public q s;
  public q t;
  public boolean u;
  public int v;
  public boolean w;
  public int x;
  public int y;
  public int z;
  
  public w1(Context paramContext, PlaybackSession paramPlaybackSession)
  {
    a = paramContext.getApplicationContext();
    c = paramPlaybackSession;
    e = new I.c();
    f = new I.b();
    h = new HashMap();
    g = new HashMap();
    d = SystemClock.elapsedRealtime();
    l = 0;
    m = 0;
    paramContext = new u0();
    b = paramContext;
    paramContext.a(this);
  }
  
  public static m A0(v paramv)
  {
    g0 localg0 = paramv.q();
    while (localg0.hasNext())
    {
      L.a locala = (L.a)localg0.next();
      for (int i1 = 0; i1 < a; i1++) {
        if (locala.e(i1))
        {
          paramv = br;
          if (paramv != null) {
            return paramv;
          }
        }
      }
    }
    return null;
  }
  
  public static int B0(m paramm)
  {
    for (int i1 = 0; i1 < r; i1++)
    {
      UUID localUUID = ep;
      if (localUUID.equals(g.d)) {
        return 3;
      }
      if (localUUID.equals(g.e)) {
        return 2;
      }
      if (localUUID.equals(g.c)) {
        return 6;
      }
    }
    return 1;
  }
  
  public static a C0(B paramB, Context paramContext, boolean paramBoolean)
  {
    if (o == 1001) {
      return new a(20, 0);
    }
    int i1;
    int i2;
    if ((paramB instanceof k0.u))
    {
      localObject = (k0.u)paramB;
      if (x == 1) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      i2 = B;
    }
    else
    {
      i2 = 0;
      i1 = i2;
    }
    Object localObject = (Throwable)a.e(paramB.getCause());
    if ((localObject instanceof IOException))
    {
      if ((localObject instanceof i0.t)) {
        return new a(5, r);
      }
      if ((!(localObject instanceof s)) && (!(localObject instanceof A)))
      {
        if ((!(localObject instanceof i0.r)) && (!(localObject instanceof z.a)))
        {
          if (o == 1002) {
            return new a(21, 0);
          }
          if ((localObject instanceof n.a))
          {
            paramB = (Throwable)a.e(((Throwable)localObject).getCause());
            i1 = M.a;
            if ((i1 >= 21) && ((paramB instanceof MediaDrm.MediaDrmStateException)))
            {
              i1 = M.X(((MediaDrm.MediaDrmStateException)paramB).getDiagnosticInfo());
              return new a(z0(i1), i1);
            }
            if ((i1 >= 23) && ((paramB instanceof MediaDrmResetException))) {
              return new a(27, 0);
            }
            if ((paramB instanceof NotProvisionedException)) {
              return new a(24, 0);
            }
            if ((paramB instanceof DeniedByServerException)) {
              return new a(29, 0);
            }
            if ((paramB instanceof T)) {
              return new a(23, 0);
            }
            if ((paramB instanceof h.e)) {
              return new a(28, 0);
            }
            return new a(30, 0);
          }
          if (((localObject instanceof p.b)) && ((((Throwable)localObject).getCause() instanceof FileNotFoundException)))
          {
            paramB = ((Throwable)a.e(((Throwable)localObject).getCause())).getCause();
            if ((M.a >= 21) && ((paramB instanceof ErrnoException)) && (errno == OsConstants.EACCES)) {
              return new a(32, 0);
            }
            return new a(31, 0);
          }
          return new a(9, 0);
        }
        if (g0.t.d(paramContext).f() == 1) {
          return new a(3, 0);
        }
        paramB = ((Throwable)localObject).getCause();
        if ((paramB instanceof UnknownHostException)) {
          return new a(6, 0);
        }
        if ((paramB instanceof SocketTimeoutException)) {
          return new a(7, 0);
        }
        if (((localObject instanceof i0.r)) && (q == 1)) {
          return new a(4, 0);
        }
        return new a(8, 0);
      }
      if (paramBoolean) {
        i1 = 10;
      } else {
        i1 = 11;
      }
      return new a(i1, 0);
    }
    if ((i1 != 0) && ((i2 == 0) || (i2 == 1))) {
      return new a(35, 0);
    }
    if ((i1 != 0) && (i2 == 3)) {
      return new a(15, 0);
    }
    if ((i1 != 0) && (i2 == 2)) {
      return new a(23, 0);
    }
    if ((localObject instanceof w.d)) {
      return new a(13, M.X(r));
    }
    if ((localObject instanceof t0.o)) {
      return new a(14, q);
    }
    if ((localObject instanceof OutOfMemoryError)) {
      return new a(14, 0);
    }
    if ((localObject instanceof z.c)) {
      return new a(17, o);
    }
    if ((localObject instanceof z.f)) {
      return new a(18, o);
    }
    if ((localObject instanceof MediaCodec.CryptoException))
    {
      i1 = ((MediaCodec.CryptoException)localObject).getErrorCode();
      return new a(z0(i1), i1);
    }
    return new a(22, 0);
  }
  
  public static Pair D0(String paramString)
  {
    paramString = M.b1(paramString, "-");
    Object localObject = paramString[0];
    if (paramString.length >= 2) {
      paramString = paramString[1];
    } else {
      paramString = null;
    }
    return Pair.create(localObject, paramString);
  }
  
  public static int F0(Context paramContext)
  {
    switch (g0.t.d(paramContext).f())
    {
    case 6: 
    case 8: 
    default: 
      return 1;
    case 10: 
      return 7;
    case 9: 
      return 8;
    case 7: 
      return 3;
    case 5: 
      return 6;
    case 4: 
      return 5;
    case 3: 
      return 4;
    case 2: 
      return 2;
    case 1: 
      return 9;
    }
    return 0;
  }
  
  public static int G0(d0.u paramu)
  {
    paramu = b;
    if (paramu == null) {
      return 0;
    }
    int i1 = M.u0(a, b);
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2) {
          return 1;
        }
        return 4;
      }
      return 5;
    }
    return 3;
  }
  
  public static int H0(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return 1;
        }
        return 4;
      }
      return 3;
    }
    return 2;
  }
  
  public static w1 x0(Context paramContext)
  {
    MediaMetricsManager localMediaMetricsManager = r1.a(paramContext.getSystemService("media_metrics"));
    if (localMediaMetricsManager == null) {
      paramContext = null;
    } else {
      paramContext = new w1(paramContext, s1.a(localMediaMetricsManager));
    }
    return paramContext;
  }
  
  public static int z0(int paramInt)
  {
    switch (M.W(paramInt))
    {
    default: 
      return 27;
    case 6005: 
      return 26;
    case 6004: 
      return 25;
    case 6003: 
      return 28;
    }
    return 24;
  }
  
  public LogSessionId E0()
  {
    return m1.a(c);
  }
  
  public final void I0(c.b paramb)
  {
    for (int i1 = 0; i1 < paramb.d(); i1++)
    {
      int i2 = paramb.b(i1);
      c.a locala = paramb.c(i2);
      if (i2 == 0) {
        b.c(locala);
      } else if (i2 == 11) {
        b.e(locala, k);
      } else {
        b.f(locala);
      }
    }
  }
  
  public final void J0(long paramLong)
  {
    int i1 = F0(a);
    if (i1 != m)
    {
      m = i1;
      N0.a(c, M0.a(L0.a(K0.a(G0.a(), i1), paramLong - d)));
    }
  }
  
  public void K(c.a parama, x0.u paramu)
  {
    if (d == null) {
      return;
    }
    parama = new b((q)a.e(c), d, b.b(b, (x.b)a.e(d)));
    int i1 = b;
    if (i1 != 0) {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3) {
            return;
          }
          q = parama;
          return;
        }
      }
      else
      {
        p = parama;
        return;
      }
    }
    o = parama;
  }
  
  public final void K0(long paramLong)
  {
    B localB = n;
    if (localB == null) {
      return;
    }
    Object localObject = a;
    boolean bool;
    if (v == 4) {
      bool = true;
    } else {
      bool = false;
    }
    localObject = C0(localB, (Context)localObject, bool);
    Y0.a(c, X0.a(W0.a(V0.a(U0.a(T0.a(c1.a(), paramLong - d), a), b), localB)));
    A = true;
    n = null;
  }
  
  public void L(c.a parama, B paramB)
  {
    n = paramB;
  }
  
  public final void L0(D paramD, c.b paramb, long paramLong)
  {
    if (paramD.f() != 2) {
      u = false;
    }
    if (paramD.m() == null) {
      w = false;
    } else if (paramb.a(10)) {
      w = true;
    }
    int i1 = T0(paramD);
    if (l != i1)
    {
      l = i1;
      A = true;
      l1.a(c, k1.a(j1.a(i1.a(n1.a(), l), paramLong - d)));
    }
  }
  
  public final void M0(D paramD, c.b paramb, long paramLong)
  {
    if (paramb.a(2))
    {
      paramD = paramD.z();
      boolean bool1 = paramD.b(2);
      boolean bool2 = paramD.b(1);
      boolean bool3 = paramD.b(3);
      if ((bool1) || (bool2) || (bool3))
      {
        if (!bool1) {
          R0(paramLong, null, 0);
        }
        if (!bool2) {
          N0(paramLong, null, 0);
        }
        if (!bool3) {
          P0(paramLong, null, 0);
        }
      }
    }
    if (w0(o))
    {
      paramb = o;
      paramD = a;
      if (u != -1)
      {
        R0(paramLong, paramD, b);
        o = null;
      }
    }
    if (w0(p))
    {
      paramD = p;
      N0(paramLong, a, b);
      p = null;
    }
    if (w0(q))
    {
      paramD = q;
      P0(paramLong, a, b);
      q = null;
    }
  }
  
  public final void N0(long paramLong, q paramq, int paramInt)
  {
    if (M.c(s, paramq)) {
      return;
    }
    int i1 = paramInt;
    if (s == null)
    {
      i1 = paramInt;
      if (paramInt == 0) {
        i1 = 1;
      }
    }
    s = paramq;
    S0(0, paramLong, paramq, i1);
  }
  
  public void O(D paramD, c.b paramb)
  {
    if (paramb.d() == 0) {
      return;
    }
    I0(paramb);
    long l1 = SystemClock.elapsedRealtime();
    O0(paramD, paramb);
    K0(l1);
    M0(paramD, paramb, l1);
    J0(l1);
    L0(paramD, paramb, l1);
    if (paramb.a(1028)) {
      b.g(paramb.c(1028));
    }
  }
  
  public final void O0(D paramD, c.b paramb)
  {
    if (paramb.a(0))
    {
      c.a locala = paramb.c(0);
      if (j != null) {
        Q0(b, d);
      }
    }
    if ((paramb.a(2)) && (j != null))
    {
      paramD = A0(paramD.z().a());
      if (paramD != null) {
        P0.a(O0.a(M.i(j)), B0(paramD));
      }
    }
    if (paramb.a(1011)) {
      z += 1;
    }
  }
  
  public final void P0(long paramLong, q paramq, int paramInt)
  {
    if (M.c(t, paramq)) {
      return;
    }
    int i1 = paramInt;
    if (t == null)
    {
      i1 = paramInt;
      if (paramInt == 0) {
        i1 = 1;
      }
    }
    t = paramq;
    S0(2, paramLong, paramq, i1);
  }
  
  public final void Q0(I paramI, x.b paramb)
  {
    PlaybackMetrics.Builder localBuilder = j;
    if (paramb == null) {
      return;
    }
    int i1 = paramI.b(a);
    if (i1 == -1) {
      return;
    }
    paramI.f(i1, f);
    paramI.n(f.c, e);
    o1.a(localBuilder, G0(e.c));
    paramI = e;
    if ((m != -9223372036854775807L) && (!k) && (!i) && (!paramI.f())) {
      p1.a(localBuilder, e.d());
    }
    if (e.f()) {
      i1 = 2;
    } else {
      i1 = 1;
    }
    q1.a(localBuilder, i1);
    A = true;
  }
  
  public final void R0(long paramLong, q paramq, int paramInt)
  {
    if (M.c(r, paramq)) {
      return;
    }
    int i1 = paramInt;
    if (r == null)
    {
      i1 = paramInt;
      if (paramInt == 0) {
        i1 = 1;
      }
    }
    r = paramq;
    S0(1, paramLong, paramq, i1);
  }
  
  public final void S0(int paramInt1, long paramLong, q paramq, int paramInt2)
  {
    TrackChangeEvent.Builder localBuilder = t1.a(v0.a(paramInt1), paramLong - d);
    if (paramq != null)
    {
      y0.a(localBuilder, 1);
      B0.a(localBuilder, H0(paramInt2));
      Object localObject = m;
      if (localObject != null) {
        C0.a(localBuilder, (String)localObject);
      }
      localObject = n;
      if (localObject != null) {
        D0.a(localBuilder, (String)localObject);
      }
      localObject = j;
      if (localObject != null) {
        E0.a(localBuilder, (String)localObject);
      }
      paramInt1 = i;
      if (paramInt1 != -1) {
        F0.a(localBuilder, paramInt1);
      }
      paramInt1 = t;
      if (paramInt1 != -1) {
        H0.a(localBuilder, paramInt1);
      }
      paramInt1 = u;
      if (paramInt1 != -1) {
        I0.a(localBuilder, paramInt1);
      }
      paramInt1 = B;
      if (paramInt1 != -1) {
        J0.a(localBuilder, paramInt1);
      }
      paramInt1 = C;
      if (paramInt1 != -1) {
        u1.a(localBuilder, paramInt1);
      }
      localObject = d;
      if (localObject != null)
      {
        localObject = D0((String)localObject);
        v1.a(localBuilder, (String)first);
        localObject = second;
        if (localObject != null) {
          w0.a(localBuilder, (String)localObject);
        }
      }
      float f1 = v;
      if (f1 != -1.0F) {
        x0.a(localBuilder, f1);
      }
    }
    else
    {
      y0.a(localBuilder, 0);
    }
    A = true;
    A0.a(c, z0.a(localBuilder));
  }
  
  public void T(c.a parama, P paramP)
  {
    b localb = o;
    if (localb != null)
    {
      parama = a;
      if (u == -1) {
        o = new b(parama.a().v0(a).Y(b).K(), b, c);
      }
    }
  }
  
  public final int T0(D paramD)
  {
    int i1 = paramD.f();
    if (u) {
      return 5;
    }
    if (w) {
      return 13;
    }
    if (i1 == 4) {
      return 11;
    }
    if (i1 == 2)
    {
      i2 = l;
      if ((i2 != 0) && (i2 != 2) && (i2 != 12))
      {
        if (!paramD.u()) {
          return 7;
        }
        if (paramD.J() != 0) {
          i2 = 10;
        } else {
          i2 = 6;
        }
        return i2;
      }
      return 2;
    }
    int i2 = 3;
    if (i1 == 3)
    {
      if (!paramD.u()) {
        return 4;
      }
      if (paramD.J() != 0) {
        i2 = 9;
      }
      return i2;
    }
    if ((i1 == 1) && (l != 0)) {
      return 12;
    }
    return l;
  }
  
  public void U(c.a parama, String paramString1, String paramString2) {}
  
  public void X(c.a parama, int paramInt, long paramLong1, long paramLong2)
  {
    Object localObject1 = d;
    if (localObject1 != null)
    {
      parama = b.b(b, (x.b)a.e(localObject1));
      Object localObject2 = (Long)h.get(parama);
      localObject1 = (Long)g.get(parama);
      HashMap localHashMap = h;
      long l1 = 0L;
      if (localObject2 == null) {
        paramLong2 = 0L;
      } else {
        paramLong2 = ((Long)localObject2).longValue();
      }
      localHashMap.put(parama, Long.valueOf(paramLong2 + paramLong1));
      localObject2 = g;
      if (localObject1 == null) {
        paramLong1 = l1;
      } else {
        paramLong1 = ((Long)localObject1).longValue();
      }
      ((HashMap)localObject2).put(parama, Long.valueOf(paramLong1 + paramInt));
    }
  }
  
  public void b0(c.a parama, String paramString)
  {
    x.b localb = d;
    if ((localb != null) && (localb.b())) {
      return;
    }
    y0();
    i = paramString;
    j = S0.a(Q0.a(R0.a(), "AndroidXMedia3"), "1.4.1");
    Q0(b, d);
  }
  
  public void f(c.a parama, String paramString, boolean paramBoolean)
  {
    parama = d;
    if (((parama == null) || (!parama.b())) && (paramString.equals(i))) {
      y0();
    }
    g.remove(paramString);
    h.remove(paramString);
  }
  
  public void g(c.a parama, k0.o paramo)
  {
    x += g;
    y += e;
  }
  
  public void k0(c.a parama, D.e parame1, D.e parame2, int paramInt)
  {
    if (paramInt == 1) {
      u = true;
    }
    k = paramInt;
  }
  
  public void m(c.a parama, x0.r paramr, x0.u paramu, IOException paramIOException, boolean paramBoolean)
  {
    v = a;
  }
  
  public void p0(c.a parama, String paramString) {}
  
  public final boolean w0(b paramb)
  {
    boolean bool;
    if ((paramb != null) && (c.equals(b.d()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void y0()
  {
    Object localObject1 = j;
    if ((localObject1 != null) && (A))
    {
      Z0.a((PlaybackMetrics.Builder)localObject1, z);
      a1.a(j, x);
      b1.a(j, y);
      Object localObject2 = (Long)g.get(i);
      localObject1 = j;
      long l1;
      if (localObject2 == null) {
        l1 = 0L;
      } else {
        l1 = ((Long)localObject2).longValue();
      }
      d1.a((PlaybackMetrics.Builder)localObject1, l1);
      localObject1 = (Long)h.get(i);
      localObject2 = j;
      if (localObject1 == null) {
        l1 = 0L;
      } else {
        l1 = ((Long)localObject1).longValue();
      }
      e1.a((PlaybackMetrics.Builder)localObject2, l1);
      localObject2 = j;
      int i1;
      if ((localObject1 != null) && (((Long)localObject1).longValue() > 0L)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      f1.a((PlaybackMetrics.Builder)localObject2, i1);
      h1.a(c, g1.a(j));
    }
    j = null;
    i = null;
    z = 0;
    x = 0;
    y = 0;
    r = null;
    s = null;
    t = null;
    A = false;
  }
  
  public static final class a
  {
    public final int a;
    public final int b;
    
    public a(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
  }
  
  public static final class b
  {
    public final q a;
    public final int b;
    public final String c;
    
    public b(q paramq, int paramInt, String paramString)
    {
      a = paramq;
      b = paramInt;
      c = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     l0.w1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */