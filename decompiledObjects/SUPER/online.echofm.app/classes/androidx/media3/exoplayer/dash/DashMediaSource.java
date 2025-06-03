package androidx.media3.exoplayer.dash;

import B0.m.c;
import B0.n;
import B0.n.b;
import B0.n.c;
import B0.o.a;
import B0.p;
import B0.p.a;
import C0.a.b;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import d0.I;
import d0.I.b;
import d0.I.c;
import d0.u.g;
import d0.u.g.a;
import d0.u.h;
import g0.M;
import i0.g.a;
import i0.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.d;
import p0.x;
import x0.E.a;
import x0.r;
import x0.x.a;
import x0.x.b;

public final class DashMediaSource
  extends x0.a
{
  public n A;
  public y B;
  public IOException C;
  public Handler D;
  public u.g E;
  public Uri F;
  public Uri G;
  public o0.c H;
  public boolean I;
  public long J;
  public long K;
  public long L;
  public int M;
  public long N;
  public int O;
  public d0.u P;
  public final boolean h;
  public final g.a i;
  public final a.a j;
  public final x0.j k;
  public final x l;
  public final B0.m m;
  public final n0.b n;
  public final long o;
  public final long p;
  public final E.a q;
  public final p.a r;
  public final e s;
  public final Object t;
  public final SparseArray u;
  public final Runnable v;
  public final Runnable w;
  public final d.b x;
  public final B0.o y;
  public i0.g z;
  
  static
  {
    d0.v.a("media3.exoplayer.dash");
  }
  
  public DashMediaSource(d0.u paramu, o0.c paramc, g.a parama, p.a parama1, a.a parama2, x0.j paramj, B0.f paramf, x paramx, B0.m paramm, long paramLong1, long paramLong2)
  {
    P = paramu;
    E = d;
    F = eb)).a;
    G = b.a;
    H = paramc;
    i = parama;
    r = parama1;
    j = parama2;
    l = paramx;
    m = paramm;
    o = paramLong1;
    p = paramLong2;
    k = paramj;
    n = new n0.b();
    boolean bool;
    if (paramc != null) {
      bool = true;
    } else {
      bool = false;
    }
    h = bool;
    q = u(null);
    t = new Object();
    u = new SparseArray();
    x = new c(null);
    N = -9223372036854775807L;
    L = -9223372036854775807L;
    if (bool)
    {
      g0.a.f(true ^ d);
      s = null;
      v = null;
      w = null;
      y = new o.a();
    }
    else
    {
      s = new e(null);
      y = new f();
      v = new n0.e(this);
      w = new n0.f(this);
    }
  }
  
  public static long I(o0.g paramg, long paramLong1, long paramLong2)
  {
    long l1 = M.J0(b);
    boolean bool = M(paramg);
    long l2 = Long.MAX_VALUE;
    int i1 = 0;
    while (i1 < c.size())
    {
      Object localObject = (o0.a)c.get(i1);
      List localList = c;
      int i2 = b;
      int i3 = 1;
      if ((i2 == 1) || (i2 == 2)) {
        i3 = 0;
      }
      long l3;
      if (bool)
      {
        l3 = l2;
        if (i3 != 0) {}
      }
      else if (localList.isEmpty())
      {
        l3 = l2;
      }
      else
      {
        localObject = ((o0.j)localList.get(0)).l();
        if (localObject == null) {
          return l1 + paramLong1;
        }
        l3 = ((n0.g)localObject).j(paramLong1, paramLong2);
        if (l3 == 0L) {
          return l1;
        }
        l3 = ((n0.g)localObject).d(paramLong1, paramLong2) + l3 - 1L;
        long l4 = ((n0.g)localObject).c(l3);
        l3 = Math.min(l2, ((n0.g)localObject).b(l3, paramLong1) + (l4 + l1));
      }
      i1++;
      l2 = l3;
    }
    return l2;
  }
  
  public static long J(o0.g paramg, long paramLong1, long paramLong2)
  {
    long l1 = M.J0(b);
    boolean bool = M(paramg);
    long l2 = l1;
    int i1 = 0;
    while (i1 < c.size())
    {
      o0.a locala = (o0.a)c.get(i1);
      Object localObject = c;
      int i2 = b;
      int i3 = 1;
      if ((i2 == 1) || (i2 == 2)) {
        i3 = 0;
      }
      long l3;
      if (bool)
      {
        l3 = l2;
        if (i3 != 0) {}
      }
      else if (((List)localObject).isEmpty())
      {
        l3 = l2;
      }
      else
      {
        localObject = ((o0.j)((List)localObject).get(0)).l();
        if (localObject == null) {
          return l1;
        }
        if (((n0.g)localObject).j(paramLong1, paramLong2) == 0L) {
          return l1;
        }
        l3 = Math.max(l2, ((n0.g)localObject).c(((n0.g)localObject).d(paramLong1, paramLong2)) + l1);
      }
      i1++;
      l2 = l3;
    }
    return l2;
  }
  
  public static long K(o0.c paramc, long paramLong)
  {
    int i1 = paramc.e() - 1;
    o0.g localg = paramc.d(i1);
    long l1 = M.J0(b);
    long l2 = paramc.g(i1);
    long l3 = M.J0(paramLong);
    long l4 = M.J0(a);
    paramLong = M.J0(5000L);
    i1 = 0;
    while (i1 < c.size())
    {
      paramc = c.get(i1)).c;
      long l5;
      if (paramc.isEmpty())
      {
        l5 = paramLong;
      }
      else
      {
        paramc = ((o0.j)paramc.get(0)).l();
        l5 = paramLong;
        if (paramc != null)
        {
          long l6 = l4 + l1 + paramc.e(l2, l3) - l3;
          if (l6 >= paramLong - 100000L)
          {
            l5 = paramLong;
            if (l6 > paramLong)
            {
              l5 = paramLong;
              if (l6 >= paramLong + 100000L) {}
            }
          }
          else
          {
            l5 = l6;
          }
        }
      }
      i1++;
      paramLong = l5;
    }
    return Z2.e.b(paramLong, 1000L, RoundingMode.CEILING);
  }
  
  public static boolean M(o0.g paramg)
  {
    int i1 = 0;
    while (i1 < c.size())
    {
      int i2 = c.get(i1)).b;
      if ((i2 != 1) && (i2 != 2)) {
        i1++;
      } else {
        return true;
      }
    }
    return false;
  }
  
  public static boolean N(o0.g paramg)
  {
    int i1 = 0;
    while (i1 < c.size())
    {
      n0.g localg = ((o0.j)c.get(i1)).c.get(0)).l();
      if ((localg != null) && (!localg.g())) {
        i1++;
      } else {
        return true;
      }
    }
    return false;
  }
  
  public void B()
  {
    I = false;
    z = null;
    Object localObject = A;
    if (localObject != null)
    {
      ((n)localObject).l();
      A = null;
    }
    J = 0L;
    K = 0L;
    F = G;
    C = null;
    localObject = D;
    if (localObject != null)
    {
      ((Handler)localObject).removeCallbacksAndMessages(null);
      D = null;
    }
    L = -9223372036854775807L;
    M = 0;
    N = -9223372036854775807L;
    u.clear();
    n.i();
    l.release();
  }
  
  public final long L()
  {
    return Math.min((M - 1) * 1000, 5000);
  }
  
  public final void P()
  {
    C0.a.j(A, new a());
  }
  
  public void Q(long paramLong)
  {
    long l1 = N;
    if ((l1 == -9223372036854775807L) || (l1 < paramLong)) {
      N = paramLong;
    }
  }
  
  public void R()
  {
    D.removeCallbacks(w);
    f0();
  }
  
  public void S(p paramp, long paramLong1, long paramLong2)
  {
    r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
    m.a(a);
    q.p(localr, c);
  }
  
  public void T(p paramp, long paramLong1, long paramLong2)
  {
    Object localObject1 = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
    m.a(a);
    q.s((r)localObject1, c);
    localObject1 = (o0.c)paramp.e();
    ??? = H;
    int i1;
    if (??? == null) {
      i1 = 0;
    } else {
      i1 = ((o0.c)???).e();
    }
    long l1 = d0b;
    for (int i2 = 0; (i2 < i1) && (H.d(i2).b < l1); i2++) {}
    if (d)
    {
      if (i1 - i2 > ((o0.c)localObject1).e())
      {
        g0.o.h("DashMediaSource", "Loaded out of sync manifest");
      }
      else
      {
        l1 = N;
        if ((l1 == -9223372036854775807L) || (h * 1000L > l1)) {
          break label313;
        }
        ??? = new StringBuilder();
        ((StringBuilder)???).append("Loaded stale dynamic manifest: ");
        ((StringBuilder)???).append(h);
        ((StringBuilder)???).append(", ");
        ((StringBuilder)???).append(N);
        g0.o.h("DashMediaSource", ((StringBuilder)???).toString());
      }
      i1 = M;
      M = (i1 + 1);
      if (i1 < m.d(c)) {
        d0(L());
      } else {
        C = new n0.c();
      }
      return;
      label313:
      M = 0;
    }
    H = ((o0.c)localObject1);
    boolean bool = I;
    I = (d & bool);
    J = (paramLong1 - paramLong2);
    K = paramLong1;
    O += i2;
    synchronized (t)
    {
      if (b.a == F)
      {
        localObject1 = H.k;
        if (localObject1 != null) {
          paramp = (p)localObject1;
        } else {
          paramp = paramp.f();
        }
        F = paramp;
      }
    }
    paramp = H;
    if ((d) && (L == -9223372036854775807L))
    {
      paramp = i;
      if (paramp != null) {
        a0(paramp);
      } else {
        P();
      }
    }
    else
    {
      Z(true);
    }
  }
  
  public n.c U(p paramp, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
    Object localObject = new m.c(localr, new x0.u(c), paramIOException, paramInt);
    paramLong1 = m.c((m.c)localObject);
    if (paramLong1 == -9223372036854775807L) {
      localObject = n.g;
    } else {
      localObject = n.h(false, paramLong1);
    }
    boolean bool = ((n.c)localObject).c() ^ true;
    q.w(localr, c, paramIOException, bool);
    if (bool) {
      m.a(a);
    }
    return (n.c)localObject;
  }
  
  public void V(p paramp, long paramLong1, long paramLong2)
  {
    r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
    m.a(a);
    q.s(localr, c);
    Y(((Long)paramp.e()).longValue() - paramLong1);
  }
  
  public n.c W(p paramp, long paramLong1, long paramLong2, IOException paramIOException)
  {
    q.w(new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a()), c, paramIOException, true);
    m.a(a);
    X(paramIOException);
    return n.f;
  }
  
  public final void X(IOException paramIOException)
  {
    g0.o.d("DashMediaSource", "Failed to resolve time offset.", paramIOException);
    L = (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    Z(true);
  }
  
  public final void Y(long paramLong)
  {
    L = paramLong;
    Z(true);
  }
  
  public final void Z(boolean paramBoolean)
  {
    for (int i1 = 0; i1 < u.size(); i1++)
    {
      i2 = u.keyAt(i1);
      if (i2 >= O) {
        ((b)u.valueAt(i1)).P(H, i2 - O);
      }
    }
    Object localObject1 = H.d(0);
    i1 = H.e() - 1;
    Object localObject2 = H.d(i1);
    long l1 = H.g(i1);
    long l2 = M.J0(M.d0(L));
    long l3 = J((o0.g)localObject1, H.g(0), l2);
    long l4 = I((o0.g)localObject2, l1, l2);
    if ((H.d) && (!N((o0.g)localObject2))) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    l1 = l3;
    if (i1 != 0)
    {
      l5 = H.f;
      l1 = l3;
      if (l5 != -9223372036854775807L) {
        l1 = Math.max(l3, l4 - M.J0(l5));
      }
    }
    long l5 = l4 - l1;
    localObject2 = H;
    if (d)
    {
      boolean bool;
      if (a != -9223372036854775807L) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.f(bool);
      l3 = l2 - M.J0(H.a) - l1;
      g0(l3, l5);
      l6 = H.a;
      l2 = M.i1(l1);
      l4 = l3 - M.J0(E.a);
      l3 = Math.min(p, l5 / 2L);
      l2 = l6 + l2;
      if (l4 >= l3) {
        for (;;)
        {
          l3 = l4;
        }
      }
    }
    else
    {
      l2 = -9223372036854775807L;
      l3 = 0L;
    }
    long l7 = M.J0(b);
    o0.c localc = H;
    l4 = a;
    long l6 = L;
    int i2 = O;
    localObject2 = a();
    if (H.d) {}
    for (localObject1 = E;; localObject1 = null) {
      break;
    }
    A(new b(l4, l2, l6, i2, l1 - l7, l5, l3, localc, (d0.u)localObject2, (u.g)localObject1));
    if (!h)
    {
      D.removeCallbacks(w);
      if (i1 != 0) {
        D.postDelayed(w, K(H, M.d0(L)));
      }
      if (I)
      {
        f0();
      }
      else if (paramBoolean)
      {
        localObject1 = H;
        if (d)
        {
          l1 = e;
          if (l1 != -9223372036854775807L)
          {
            l3 = l1;
            if (l1 == 0L) {
              l3 = 5000L;
            }
            d0(Math.max(0L, J + l3 - SystemClock.elapsedRealtime()));
          }
        }
      }
    }
  }
  
  public d0.u a()
  {
    try
    {
      d0.u localu = P;
      return localu;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a0(o0.o paramo)
  {
    Object localObject = a;
    if ((!M.c(localObject, "urn:mpeg:dash:utc:direct:2014")) && (!M.c(localObject, "urn:mpeg:dash:utc:direct:2012")))
    {
      if ((!M.c(localObject, "urn:mpeg:dash:utc:http-iso:2014")) && (!M.c(localObject, "urn:mpeg:dash:utc:http-iso:2012"))) {
        if ((!M.c(localObject, "urn:mpeg:dash:utc:http-xsdate:2014")) && (!M.c(localObject, "urn:mpeg:dash:utc:http-xsdate:2012")))
        {
          if ((!M.c(localObject, "urn:mpeg:dash:utc:ntp:2014")) && (!M.c(localObject, "urn:mpeg:dash:utc:ntp:2012")))
          {
            X(new IOException("Unsupported UTC timing scheme"));
            return;
          }
          P();
          return;
        }
      }
      for (localObject = new h(null);; localObject = new d())
      {
        c0(paramo, (p.a)localObject);
        break;
      }
    }
    else
    {
      b0(paramo);
    }
  }
  
  public final void b0(o0.o paramo)
  {
    try
    {
      Y(M.Q0(b) - K);
    }
    catch (d0.A paramo)
    {
      X(paramo);
    }
  }
  
  public final void c0(o0.o paramo, p.a parama)
  {
    e0(new p(z, Uri.parse(b), 5, parama), new g(null), 1);
  }
  
  public final void d0(long paramLong)
  {
    D.postDelayed(v, paramLong);
  }
  
  public void e(x0.v paramv)
  {
    paramv = (b)paramv;
    paramv.L();
    u.remove(o);
  }
  
  public final void e0(p paramp, n.b paramb, int paramInt)
  {
    long l1 = A.n(paramp, paramb, paramInt);
    q.y(new r(a, b, l1), c);
  }
  
  public x0.v f(x.b paramb, B0.b paramb1, long paramLong)
  {
    int i1 = ((Integer)a).intValue() - O;
    E.a locala = u(paramb);
    paramb = s(paramb);
    paramb = new b(i1 + O, H, n, i1, j, B, null, l, paramb, m, locala, L, y, paramb1, k, x, x());
    u.put(o, paramb);
    return paramb;
  }
  
  public final void f0()
  {
    D.removeCallbacks(v);
    if (A.i()) {
      return;
    }
    if (A.j())
    {
      I = true;
      return;
    }
    synchronized (t)
    {
      Uri localUri = F;
      I = false;
      e0(new p(z, localUri, 4, r), s, m.d(4));
      return;
    }
  }
  
  public final void g0(long paramLong1, long paramLong2)
  {
    Object localObject1 = ad;
    long l1 = M.i1(paramLong1);
    long l2 = c;
    if (l2 != -9223372036854775807L) {}
    Object localObject2;
    do
    {
      l2 = Math.min(l1, l2);
      break label80;
      localObject2 = H.j;
      if (localObject2 == null) {
        break;
      }
      l2 = c;
    } while (l2 != -9223372036854775807L);
    l2 = l1;
    label80:
    long l3 = M.i1(paramLong1 - paramLong2);
    long l4 = l3;
    if (l3 < 0L)
    {
      l4 = l3;
      if (l2 > 0L) {
        l4 = 0L;
      }
    }
    long l5 = H.c;
    l3 = l4;
    if (l5 != -9223372036854775807L) {
      l3 = Math.min(l4 + l5, l1);
    }
    l4 = b;
    if (l4 != -9223372036854775807L) {}
    for (;;)
    {
      l4 = M.q(l4, l3, l1);
      break;
      localObject2 = H.j;
      l4 = l3;
      if (localObject2 == null) {
        break;
      }
      l5 = b;
      l4 = l3;
      if (l5 == -9223372036854775807L) {
        break;
      }
      l4 = l5;
    }
    l1 = l2;
    if (l4 > l2) {
      l1 = l4;
    }
    l2 = E.a;
    if (l2 == -9223372036854775807L)
    {
      localObject2 = H;
      o0.l locall = j;
      if (locall != null)
      {
        l2 = a;
        if (l2 != -9223372036854775807L) {}
      }
      else
      {
        l2 = g;
        if (l2 == -9223372036854775807L) {
          l2 = o;
        }
      }
    }
    l3 = l2;
    if (l2 < l4) {
      l3 = l4;
    }
    l2 = l3;
    if (l3 > l1) {
      l2 = M.q(M.i1(paramLong1 - Math.min(p, paramLong2 / 2L)), l4, l1);
    }
    float f1 = d;
    if (f1 == -3.4028235E38F)
    {
      localObject2 = H.j;
      if (localObject2 != null) {
        f1 = d;
      } else {
        f1 = -3.4028235E38F;
      }
    }
    float f2 = e;
    if (f2 == -3.4028235E38F)
    {
      localObject1 = H.j;
      if (localObject1 != null) {
        f2 = e;
      } else {
        f2 = -3.4028235E38F;
      }
    }
    float f3 = f2;
    float f4 = f1;
    if (f1 == -3.4028235E38F)
    {
      f3 = f2;
      f4 = f1;
      if (f2 == -3.4028235E38F)
      {
        localObject1 = H.j;
        if (localObject1 != null)
        {
          f3 = f2;
          f4 = f1;
          if (a != -9223372036854775807L) {}
        }
        else
        {
          f4 = 1.0F;
          f3 = 1.0F;
        }
      }
    }
    E = new u.g.a().k(l2).i(l4).g(l1).j(f4).h(f3).f();
  }
  
  public void h()
  {
    y.a();
  }
  
  public void l(d0.u paramu)
  {
    try
    {
      P = paramu;
      return;
    }
    finally
    {
      paramu = finally;
      throw paramu;
    }
  }
  
  public void z(y paramy)
  {
    B = paramy;
    l.a(Looper.myLooper(), x());
    l.g();
    if (h)
    {
      Z(false);
    }
    else
    {
      z = i.a();
      A = new n("DashMediaSource");
      D = M.A();
      f0();
    }
  }
  
  public static final class Factory
    implements x.a
  {
    public final a.a a;
    public final g.a b;
    public p0.A c;
    public x0.j d;
    public B0.m e;
    public long f;
    public long g;
    public p.a h;
    
    public Factory(a.a parama, g.a parama1)
    {
      a = ((a.a)g0.a.e(parama));
      b = parama1;
      c = new p0.l();
      e = new B0.k();
      f = 30000L;
      g = 5000000L;
      d = new x0.m();
      b(true);
    }
    
    public Factory(g.a parama)
    {
      this(new c.a(parama), parama);
    }
    
    public DashMediaSource a(d0.u paramu)
    {
      g0.a.e(b);
      Object localObject1 = h;
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new d();
      }
      localObject1 = b.d;
      if (!((List)localObject1).isEmpty()) {
        localObject2 = new v0.b((p.a)localObject2, (List)localObject1);
      }
      return new DashMediaSource(paramu, null, b, (p.a)localObject2, a, d, null, c.a(paramu), e, f, g, null);
    }
    
    public Factory b(boolean paramBoolean)
    {
      a.a(paramBoolean);
      return this;
    }
  }
  
  public class a
    implements a.b
  {
    public a() {}
    
    public void a()
    {
      DashMediaSource.E(DashMediaSource.this, C0.a.h());
    }
    
    public void b(IOException paramIOException)
    {
      DashMediaSource.F(DashMediaSource.this, paramIOException);
    }
  }
  
  public static final class b
    extends I
  {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final o0.c l;
    public final d0.u m;
    public final u.g n;
    
    public b(long paramLong1, long paramLong2, long paramLong3, int paramInt, long paramLong4, long paramLong5, long paramLong6, o0.c paramc, d0.u paramu, u.g paramg)
    {
      boolean bool1 = d;
      boolean bool2 = true;
      boolean bool3;
      if (paramg != null) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      if (bool1 == bool3) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      g0.a.f(bool3);
      e = paramLong1;
      f = paramLong2;
      g = paramLong3;
      h = paramInt;
      i = paramLong4;
      j = paramLong5;
      k = paramLong6;
      l = paramc;
      m = paramu;
      n = paramg;
    }
    
    public static boolean t(o0.c paramc)
    {
      boolean bool;
      if ((d) && (e != -9223372036854775807L) && (b == -9223372036854775807L)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int b(Object paramObject)
    {
      boolean bool = paramObject instanceof Integer;
      int i1 = -1;
      if (!bool) {
        return -1;
      }
      int i2 = ((Integer)paramObject).intValue() - h;
      int i3 = i1;
      if (i2 >= 0) {
        if (i2 >= i()) {
          i3 = i1;
        } else {
          i3 = i2;
        }
      }
      return i3;
    }
    
    public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
    {
      g0.a.c(paramInt, 0, i());
      Integer localInteger = null;
      String str;
      if (paramBoolean) {
        str = l.d(paramInt).a;
      } else {
        str = null;
      }
      if (paramBoolean) {
        localInteger = Integer.valueOf(h + paramInt);
      }
      return paramb.s(str, localInteger, 0, l.g(paramInt), M.J0(l.d(paramInt).b - l.d(0).b) - i);
    }
    
    public int i()
    {
      return l.e();
    }
    
    public Object m(int paramInt)
    {
      g0.a.c(paramInt, 0, i());
      return Integer.valueOf(h + paramInt);
    }
    
    public I.c o(int paramInt, I.c paramc, long paramLong)
    {
      g0.a.c(paramInt, 0, 1);
      paramLong = s(paramLong);
      Object localObject = I.c.q;
      d0.u localu = m;
      o0.c localc = l;
      return paramc.g(localObject, localu, localc, e, f, g, true, t(localc), n, paramLong, j, 0, i() - 1, i);
    }
    
    public int p()
    {
      return 1;
    }
    
    public final long s(long paramLong)
    {
      long l1 = k;
      if (!t(l)) {
        return l1;
      }
      long l2 = l1;
      if (paramLong > 0L)
      {
        paramLong = l1 + paramLong;
        l2 = paramLong;
        if (paramLong > j) {
          return -9223372036854775807L;
        }
      }
      l1 = i + l2;
      paramLong = l.g(0);
      int i1 = 0;
      while ((i1 < l.e() - 1) && (l1 >= paramLong))
      {
        l1 -= paramLong;
        i1++;
        paramLong = l.g(i1);
      }
      Object localObject = l.d(i1);
      i1 = ((o0.g)localObject).a(2);
      if (i1 == -1) {
        return l2;
      }
      localObject = ((o0.j)c.get(i1)).c.get(0)).l();
      long l3 = l2;
      if (localObject != null) {
        if (((n0.g)localObject).i(paramLong) == 0L) {
          l3 = l2;
        } else {
          l3 = l2 + ((n0.g)localObject).c(((n0.g)localObject).a(l1, paramLong)) - l1;
        }
      }
      return l3;
    }
  }
  
  public final class c
    implements d.b
  {
    public c() {}
    
    public void a()
    {
      R();
    }
    
    public void b(long paramLong)
    {
      Q(paramLong);
    }
  }
  
  public static final class d
    implements p.a
  {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");
    
    public Long b(Uri paramUri, InputStream paramInputStream)
    {
      paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream, W2.e.c)).readLine();
      try
      {
        paramUri = a.matcher(paramInputStream);
        if (paramUri.matches())
        {
          paramInputStream = paramUri.group(1);
          SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
          localSimpleDateFormat.<init>("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
          localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
          long l1 = localSimpleDateFormat.parse(paramInputStream).getTime();
          long l2;
          if ("Z".equals(paramUri.group(2)))
          {
            l2 = l1;
          }
          else
          {
            if ("+".equals(paramUri.group(4))) {
              l2 = 1L;
            } else {
              l2 = -1L;
            }
            long l3 = Long.parseLong(paramUri.group(5));
            paramUri = paramUri.group(7);
            long l4;
            if (TextUtils.isEmpty(paramUri)) {
              l4 = 0L;
            } else {
              l4 = Long.parseLong(paramUri);
            }
            l2 = l1 - l2 * ((l3 * 60L + l4) * 60000L);
          }
          return Long.valueOf(l2);
        }
      }
      catch (ParseException paramUri)
      {
        break label216;
        paramUri = new java/lang/StringBuilder;
        paramUri.<init>();
        paramUri.append("Couldn't parse timestamp: ");
        paramUri.append(paramInputStream);
        throw d0.A.c(paramUri.toString(), null);
        label216:
        throw d0.A.c(null, paramUri);
      }
    }
  }
  
  public final class e
    implements n.b
  {
    public e() {}
    
    public void a(p paramp, long paramLong1, long paramLong2, boolean paramBoolean)
    {
      S(paramp, paramLong1, paramLong2);
    }
    
    public void b(p paramp, long paramLong1, long paramLong2)
    {
      T(paramp, paramLong1, paramLong2);
    }
    
    public n.c c(p paramp, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      return U(paramp, paramLong1, paramLong2, paramIOException, paramInt);
    }
  }
  
  public final class f
    implements B0.o
  {
    public f() {}
    
    public void a()
    {
      DashMediaSource.G(DashMediaSource.this).a();
      b();
    }
    
    public final void b()
    {
      if (DashMediaSource.H(DashMediaSource.this) == null) {
        return;
      }
      throw DashMediaSource.H(DashMediaSource.this);
    }
  }
  
  public final class g
    implements n.b
  {
    public g() {}
    
    public void a(p paramp, long paramLong1, long paramLong2, boolean paramBoolean)
    {
      S(paramp, paramLong1, paramLong2);
    }
    
    public void b(p paramp, long paramLong1, long paramLong2)
    {
      V(paramp, paramLong1, paramLong2);
    }
    
    public n.c c(p paramp, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      return W(paramp, paramLong1, paramLong2, paramIOException);
    }
  }
  
  public static final class h
    implements p.a
  {
    public Long b(Uri paramUri, InputStream paramInputStream)
    {
      return Long.valueOf(M.Q0(new BufferedReader(new InputStreamReader(paramInputStream)).readLine()));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.DashMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */