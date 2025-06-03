package r0;

import B0.m;
import B0.m.a;
import B0.m.b;
import B0.m.c;
import B0.n;
import B0.n.b;
import B0.n.c;
import B0.p;
import B0.p.a;
import X2.B;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.SystemClock;
import d0.A;
import g0.M;
import g0.a;
import i0.t;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import x0.E.a;
import x0.r;
import x0.u;

public final class c
  implements k, n.b
{
  public static final k.a D = new b();
  public f A;
  public boolean B;
  public long C;
  public final q0.g o;
  public final j p;
  public final m q;
  public final HashMap r;
  public final CopyOnWriteArrayList s;
  public final double t;
  public E.a u;
  public n v;
  public Handler w;
  public k.e x;
  public g y;
  public Uri z;
  
  public c(q0.g paramg, m paramm, j paramj)
  {
    this(paramg, paramm, paramj, 3.5D);
  }
  
  public c(q0.g paramg, m paramm, j paramj, double paramDouble)
  {
    o = paramg;
    p = paramj;
    q = paramm;
    t = paramDouble;
    s = new CopyOnWriteArrayList();
    r = new HashMap();
    C = -9223372036854775807L;
  }
  
  public static f.d G(f paramf1, f paramf2)
  {
    int i = (int)(k - k);
    paramf1 = r;
    if (i < paramf1.size()) {
      paramf1 = (f.d)paramf1.get(i);
    } else {
      paramf1 = null;
    }
    return paramf1;
  }
  
  public final void F(List paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      Uri localUri = (Uri)paramList.get(j);
      c localc = new c(localUri);
      r.put(localUri, localc);
    }
  }
  
  public final f H(f paramf1, f paramf2)
  {
    if (!paramf2.f(paramf1))
    {
      f localf = paramf1;
      if (o) {
        localf = paramf1.d();
      }
      return localf;
    }
    return paramf2.c(J(paramf1, paramf2), I(paramf1, paramf2));
  }
  
  public final int I(f paramf1, f paramf2)
  {
    if (i) {
      return j;
    }
    Object localObject = A;
    int i;
    if (localObject != null) {
      i = j;
    } else {
      i = 0;
    }
    if (paramf1 == null) {
      return i;
    }
    localObject = G(paramf1, paramf2);
    if (localObject != null) {
      return j + r - r.get(0)).r;
    }
    return i;
  }
  
  public final long J(f paramf1, f paramf2)
  {
    if (p) {
      return h;
    }
    Object localObject = A;
    long l;
    if (localObject != null) {
      l = h;
    } else {
      l = 0L;
    }
    if (paramf1 == null) {
      return l;
    }
    int i = r.size();
    localObject = G(paramf1, paramf2);
    if (localObject != null) {
      return h + s;
    }
    if (i == k - k) {
      return paramf1.e();
    }
    return l;
  }
  
  public final Uri K(Uri paramUri)
  {
    Object localObject = A;
    Uri localUri = paramUri;
    if (localObject != null)
    {
      localUri = paramUri;
      if (v.e)
      {
        localObject = (f.c)t.get(paramUri);
        localUri = paramUri;
        if (localObject != null)
        {
          paramUri = paramUri.buildUpon();
          paramUri.appendQueryParameter("_HLS_msn", String.valueOf(b));
          int i = c;
          if (i != -1) {
            paramUri.appendQueryParameter("_HLS_part", String.valueOf(i));
          }
          localUri = paramUri.build();
        }
      }
    }
    return localUri;
  }
  
  public final boolean L(Uri paramUri)
  {
    List localList = y.e;
    for (int i = 0; i < localList.size(); i++) {
      if (paramUri.equals(geta)) {
        return true;
      }
    }
    return false;
  }
  
  public final void M(Uri paramUri)
  {
    paramUri = (c)r.get(paramUri);
    f localf = paramUri.j();
    if (paramUri.k()) {
      return;
    }
    paramUri.z(true);
    if ((localf != null) && (!o)) {
      paramUri.n(true);
    }
  }
  
  public final boolean N()
  {
    Object localObject = y.e;
    int i = ((List)localObject).size();
    long l = SystemClock.elapsedRealtime();
    for (int j = 0; j < i; j++)
    {
      c localc = (c)a.e((c)r.get(geta));
      if (l > c.d(localc))
      {
        localObject = c.e(localc);
        z = ((Uri)localObject);
        c.f(localc, K((Uri)localObject));
        return true;
      }
    }
    return false;
  }
  
  public final void O(Uri paramUri)
  {
    if ((!paramUri.equals(z)) && (L(paramUri)))
    {
      f localf = A;
      if ((localf == null) || (!o))
      {
        z = paramUri;
        c localc = (c)r.get(paramUri);
        localf = c.g(localc);
        if ((localf != null) && (o))
        {
          A = localf;
          x.b(localf);
        }
        else
        {
          c.f(localc, K(paramUri));
        }
      }
    }
  }
  
  public final boolean P(Uri paramUri, m.c paramc, boolean paramBoolean)
  {
    Iterator localIterator = s.iterator();
    boolean bool = false;
    while (localIterator.hasNext()) {
      bool |= ((k.b)localIterator.next()).e(paramUri, paramc, paramBoolean) ^ true;
    }
    return bool;
  }
  
  public void Q(p paramp, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
    q.a(a);
    u.p(localr, 4);
  }
  
  public void R(p paramp, long paramLong1, long paramLong2)
  {
    h localh = (h)paramp.e();
    boolean bool = localh instanceof f;
    if (bool) {
      localObject = g.e(a);
    } else {
      localObject = (g)localh;
    }
    y = ((g)localObject);
    z = e.get(0)).a;
    s.add(new b(null));
    F(d);
    r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
    Object localObject = (c)r.get(z);
    if (bool) {
      c.c((c)localObject, (f)localh, localr);
    } else {
      ((c)localObject).n(false);
    }
    q.a(a);
    u.s(localr, 4);
  }
  
  public n.c S(p paramp, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
    u localu = new u(c);
    paramLong1 = q.c(new m.c(localr, localu, paramIOException, paramInt));
    boolean bool;
    if (paramLong1 == -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    u.w(localr, c, paramIOException, bool);
    if (bool) {
      q.a(a);
    }
    if (bool) {
      paramp = n.g;
    } else {
      paramp = n.h(false, paramLong1);
    }
    return paramp;
  }
  
  public final void T(Uri paramUri, f paramf)
  {
    if (paramUri.equals(z))
    {
      if (A == null)
      {
        B = (o ^ true);
        C = h;
      }
      A = paramf;
      x.b(paramf);
    }
    paramUri = s.iterator();
    while (paramUri.hasNext()) {
      ((k.b)paramUri.next()).a();
    }
  }
  
  public boolean a()
  {
    return B;
  }
  
  public g b()
  {
    return y;
  }
  
  public boolean c(Uri paramUri, long paramLong)
  {
    paramUri = (c)r.get(paramUri);
    if (paramUri != null) {
      return c.b(paramUri, paramLong) ^ true;
    }
    return false;
  }
  
  public boolean d(Uri paramUri)
  {
    return ((c)r.get(paramUri)).l();
  }
  
  public void e(Uri paramUri, E.a parama, k.e parame)
  {
    w = M.A();
    u = parama;
    x = parame;
    paramUri = new p(o.a(4), paramUri, 4, p.b());
    boolean bool;
    if (v == null) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    parame = new n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
    v = parame;
    long l = parame.n(paramUri, this, q.d(c));
    parama.y(new r(a, b, l), c);
  }
  
  public void f()
  {
    Object localObject = v;
    if (localObject != null) {
      ((n)localObject).a();
    }
    localObject = z;
    if (localObject != null) {
      h((Uri)localObject);
    }
  }
  
  public void g(Uri paramUri)
  {
    paramUri = (c)r.get(paramUri);
    if (paramUri != null) {
      paramUri.z(false);
    }
  }
  
  public void h(Uri paramUri)
  {
    ((c)r.get(paramUri)).s();
  }
  
  public void i(Uri paramUri)
  {
    ((c)r.get(paramUri)).n(true);
  }
  
  public void j(k.b paramb)
  {
    a.e(paramb);
    s.add(paramb);
  }
  
  public f k(Uri paramUri, boolean paramBoolean)
  {
    f localf = ((c)r.get(paramUri)).j();
    if ((localf != null) && (paramBoolean))
    {
      O(paramUri);
      M(paramUri);
    }
    return localf;
  }
  
  public void l(k.b paramb)
  {
    s.remove(paramb);
  }
  
  public long m()
  {
    return C;
  }
  
  public void stop()
  {
    z = null;
    A = null;
    y = null;
    C = -9223372036854775807L;
    v.l();
    v = null;
    Iterator localIterator = r.values().iterator();
    while (localIterator.hasNext()) {
      ((c)localIterator.next()).y();
    }
    w.removeCallbacksAndMessages(null);
    w = null;
    r.clear();
  }
  
  public class b
    implements k.b
  {
    public b() {}
    
    public void a()
    {
      c.z(c.this).remove(this);
    }
    
    public boolean e(Uri paramUri, m.c paramc, boolean paramBoolean)
    {
      if (c.A(c.this) == null)
      {
        long l = SystemClock.elapsedRealtime();
        Object localObject = iqe;
        int i = 0;
        int k;
        for (int j = i; i < ((List)localObject).size(); j = k)
        {
          c.c localc = (c.c)c.B(c.this).get(geta);
          k = j;
          if (localc != null)
          {
            k = j;
            if (l < c.c.d(localc)) {
              k = j + 1;
            }
          }
          i++;
        }
        localObject = new m.a(1, 0, qe.size(), j);
        paramc = c.E(c.this).b((m.a)localObject, paramc);
        if ((paramc != null) && (a == 2))
        {
          paramUri = (c.c)c.B(c.this).get(paramUri);
          if (paramUri != null) {
            c.c.b(paramUri, b);
          }
        }
      }
      return false;
    }
  }
  
  public final class c
    implements n.b
  {
    public final Uri o;
    public final n p;
    public final i0.g q;
    public f r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public IOException x;
    public boolean y;
    
    public c(Uri paramUri)
    {
      o = paramUri;
      p = new n("DefaultHlsPlaylistTracker:MediaPlaylist");
      q = c.C(c.this).a(4);
    }
    
    public final boolean h(long paramLong)
    {
      v = (SystemClock.elapsedRealtime() + paramLong);
      boolean bool;
      if ((o.equals(c.x(c.this))) && (!c.y(c.this))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final Uri i()
    {
      Object localObject = r;
      if (localObject != null)
      {
        localObject = v;
        if ((a != -9223372036854775807L) || (e))
        {
          Uri.Builder localBuilder = o.buildUpon();
          localObject = r;
          if (v.e)
          {
            localBuilder.appendQueryParameter("_HLS_msn", String.valueOf(k + r.size()));
            localObject = r;
            if (n != -9223372036854775807L)
            {
              localObject = s;
              int i = ((List)localObject).size();
              int j = i;
              if (!((List)localObject).isEmpty())
              {
                j = i;
                if (dA) {
                  j = i - 1;
                }
              }
              localBuilder.appendQueryParameter("_HLS_part", String.valueOf(j));
            }
          }
          localObject = r.v;
          if (a != -9223372036854775807L)
          {
            if (b) {
              localObject = "v2";
            } else {
              localObject = "YES";
            }
            localBuilder.appendQueryParameter("_HLS_skip", (String)localObject);
          }
          return localBuilder.build();
        }
      }
      return o;
    }
    
    public f j()
    {
      return r;
    }
    
    public boolean k()
    {
      return y;
    }
    
    public boolean l()
    {
      f localf = r;
      boolean bool = false;
      if (localf == null) {
        return false;
      }
      long l1 = SystemClock.elapsedRealtime();
      long l2 = Math.max(30000L, M.i1(r.u));
      localf = r;
      if (!o)
      {
        int i = d;
        if ((i != 2) && (i != 1) && (s + l2 <= l1)) {}
      }
      else
      {
        bool = true;
      }
      return bool;
    }
    
    public void n(boolean paramBoolean)
    {
      Uri localUri;
      if (paramBoolean) {
        localUri = i();
      } else {
        localUri = o;
      }
      q(localUri);
    }
    
    public final void p(Uri paramUri)
    {
      p.a locala = c.s(c.this).a(c.q(c.this), r);
      paramUri = new p(q, paramUri, 4, locala);
      long l = p.n(paramUri, this, c.E(c.this).d(c));
      c.D(c.this).y(new r(a, b, l), c);
    }
    
    public final void q(Uri paramUri)
    {
      v = 0L;
      if ((!w) && (!p.j()) && (!p.i()))
      {
        long l = SystemClock.elapsedRealtime();
        if (l < u)
        {
          w = true;
          c.p(c.this).postDelayed(new d(this, paramUri), u - l);
        }
        else
        {
          p(paramUri);
        }
      }
    }
    
    public void s()
    {
      p.a();
      IOException localIOException = x;
      if (localIOException == null) {
        return;
      }
      throw localIOException;
    }
    
    public void u(p paramp, long paramLong1, long paramLong2, boolean paramBoolean)
    {
      r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
      c.E(c.this).a(a);
      c.D(c.this).p(localr, 4);
    }
    
    public void v(p paramp, long paramLong1, long paramLong2)
    {
      h localh = (h)paramp.e();
      r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
      if ((localh instanceof f))
      {
        x((f)localh, localr);
        c.D(c.this).s(localr, 4);
      }
      else
      {
        x = A.c("Loaded playlist has unexpected type.", null);
        c.D(c.this).w(localr, 4, x, true);
      }
      c.E(c.this).a(a);
    }
    
    public n.c w(p paramp, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
      int i;
      if (paramp.f().getQueryParameter("_HLS_msn") != null) {
        i = 1;
      } else {
        i = 0;
      }
      boolean bool = paramIOException instanceof i.a;
      if ((i != 0) || (bool))
      {
        if ((paramIOException instanceof t)) {
          i = r;
        } else {
          i = Integer.MAX_VALUE;
        }
        if ((bool) || (i == 400) || (i == 503)) {}
      }
      else
      {
        Object localObject = new m.c(localr, new u(c), paramIOException, paramInt);
        if (c.n(c.this, o, (m.c)localObject, false))
        {
          paramLong1 = c.E(c.this).c((m.c)localObject);
          if (paramLong1 != -9223372036854775807L) {
            localObject = n.h(false, paramLong1);
          } else {
            localObject = n.g;
          }
        }
        else
        {
          localObject = n.f;
        }
        bool = true ^ ((n.c)localObject).c();
        c.D(c.this).w(localr, c, paramIOException, bool);
        if (bool) {
          c.E(c.this).a(a);
        }
        return (n.c)localObject;
      }
      u = SystemClock.elapsedRealtime();
      n(false);
      ((E.a)M.i(c.D(c.this))).w(localr, c, paramIOException, true);
      return n.f;
    }
    
    public final void x(f paramf, r paramr)
    {
      f localf1 = r;
      long l1 = SystemClock.elapsedRealtime();
      s = l1;
      f localf2 = c.u(c.this, localf1, paramf);
      r = localf2;
      Object localObject = null;
      long l3;
      if (localf2 != localf1)
      {
        x = null;
        t = l1;
        c.v(c.this, o, localf2);
      }
      else if (!o)
      {
        long l2 = k;
        l3 = r.size();
        paramf = r;
        boolean bool1;
        if (l2 + l3 < k)
        {
          paramf = new k.c(o);
          bool1 = true;
        }
        else
        {
          double d1 = l1 - t;
          double d2 = M.i1(m);
          double d3 = c.w(c.this);
          boolean bool2 = false;
          bool1 = bool2;
          paramf = (f)localObject;
          if (d1 > d2 * d3)
          {
            paramf = new k.d(o);
            bool1 = bool2;
          }
        }
        if (paramf != null)
        {
          x = paramf;
          c.n(c.this, o, new m.c(paramr, new u(4), paramf, 1), bool1);
        }
      }
      paramf = r;
      if (!v.e)
      {
        l3 = m;
        if (paramf == localf1) {
          l3 /= 2L;
        }
      }
      else
      {
        l3 = 0L;
      }
      u = (l1 + M.i1(l3) - f);
      if ((!r.o) && ((o.equals(c.x(c.this))) || (y))) {
        q(i());
      }
    }
    
    public void y()
    {
      p.l();
    }
    
    public void z(boolean paramBoolean)
    {
      y = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     r0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */