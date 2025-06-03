package r0;

import B0.m;
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
import i0.t;
import java.io.IOException;
import java.util.List;
import x0.E.a;
import x0.r;
import x0.u;

public final class c$c
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
  
  public c$c(c paramc, Uri paramUri)
  {
    o = paramUri;
    p = new n("DefaultHlsPlaylistTracker:MediaPlaylist");
    q = c.C(paramc).a(4);
  }
  
  public final boolean h(long paramLong)
  {
    v = (SystemClock.elapsedRealtime() + paramLong);
    boolean bool;
    if ((o.equals(c.x(z))) && (!c.y(z))) {
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
    p.a locala = c.s(z).a(c.q(z), r);
    paramUri = new p(q, paramUri, 4, locala);
    long l = p.n(paramUri, this, c.E(z).d(c));
    c.D(z).y(new r(a, b, l), c);
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
        c.p(z).postDelayed(new d(this, paramUri), u - l);
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
    c.E(z).a(a);
    c.D(z).p(localr, 4);
  }
  
  public void v(p paramp, long paramLong1, long paramLong2)
  {
    h localh = (h)paramp.e();
    r localr = new r(a, b, paramp.f(), paramp.d(), paramLong1, paramLong2, paramp.a());
    if ((localh instanceof f))
    {
      x((f)localh, localr);
      c.D(z).s(localr, 4);
    }
    else
    {
      x = A.c("Loaded playlist has unexpected type.", null);
      c.D(z).w(localr, 4, x, true);
    }
    c.E(z).a(a);
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
      if (c.n(z, o, (m.c)localObject, false))
      {
        paramLong1 = c.E(z).c((m.c)localObject);
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
      c.D(z).w(localr, c, paramIOException, bool);
      if (bool) {
        c.E(z).a(a);
      }
      return (n.c)localObject;
    }
    u = SystemClock.elapsedRealtime();
    n(false);
    ((E.a)M.i(c.D(z))).w(localr, c, paramIOException, true);
    return n.f;
  }
  
  public final void x(f paramf, r paramr)
  {
    f localf1 = r;
    long l1 = SystemClock.elapsedRealtime();
    s = l1;
    f localf2 = c.u(z, localf1, paramf);
    r = localf2;
    Object localObject = null;
    long l3;
    if (localf2 != localf1)
    {
      x = null;
      t = l1;
      c.v(z, o, localf2);
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
        double d3 = c.w(z);
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
        c.n(z, o, new m.c(paramr, new u(4), paramf, 1), bool1);
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
    if ((!r.o) && ((o.equals(c.x(z))) || (y))) {
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

/* Location:
 * Qualified Name:     r0.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */