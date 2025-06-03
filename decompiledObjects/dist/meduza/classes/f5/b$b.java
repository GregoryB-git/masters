package f5;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import e5.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p2.m0;
import t5.c0.c;
import t5.d0;
import t5.d0.a;
import t5.d0.b;
import t5.d0.d;
import t5.f0;
import t5.f0.a;
import t5.j0;
import t5.k;
import t5.u;
import t5.z;
import v3.a1;
import v5.e0;
import z4.n;
import z4.w.a;

public final class b$b
  implements d0.a<f0<g>>
{
  public final Uri a;
  public final d0 b;
  public final k c;
  public e d;
  public long e;
  public long f;
  public long o;
  public long p;
  public boolean q;
  public IOException r;
  
  public b$b(b paramb, Uri paramUri)
  {
    a = paramUri;
    b = new d0("DefaultHlsPlaylistTracker:MediaPlaylist");
    c = a.a();
  }
  
  public static boolean a(b paramb, long paramLong)
  {
    p = (SystemClock.elapsedRealtime() + paramLong);
    boolean bool1 = a.equals(s.s);
    boolean bool2 = true;
    if (bool1)
    {
      paramb = s;
      Object localObject = r.e;
      int i = ((List)localObject).size();
      paramLong = SystemClock.elapsedRealtime();
      for (int j = 0; j < i; j++)
      {
        b localb = (b)d.get(geta);
        localb.getClass();
        if (paramLong > p)
        {
          localObject = a;
          s = ((Uri)localObject);
          localb.c(paramb.n((Uri)localObject));
          j = 1;
          break label150;
        }
      }
      j = 0;
      label150:
      if (j == 0) {}
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public final void b(Uri paramUri)
  {
    Object localObject = s;
    localObject = b.a(r, d);
    paramUri = new f0(c, paramUri, 4, (f0.a)localObject);
    d0 locald0 = b;
    localObject = s.c;
    int i = c;
    long l = locald0.f(paramUri, this, ((u)localObject).b(i));
    s.f.m(new n(a, b, l), c);
  }
  
  public final void c(Uri paramUri)
  {
    p = 0L;
    if ((!q) && (!b.d()) && (!b.c()))
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = o;
      if (l1 < l2)
      {
        q = true;
        s.p.postDelayed(new x0.f(11, this, paramUri), l2 - l1);
      }
      else
      {
        b(paramUri);
      }
    }
  }
  
  public final void d(e parame)
  {
    e locale = d;
    long l1 = SystemClock.elapsedRealtime();
    e = l1;
    b localb = s;
    localb.getClass();
    int i = 0;
    int k;
    if (locale != null)
    {
      boolean bool1 = k < k;
      if (!bool1)
      {
        if (!bool1)
        {
          j = r.size() - r.size();
          if (j != 0)
          {
            if (j > 0) {
              break label158;
            }
          }
          else
          {
            j = s.size();
            k = s.size();
            if ((j > k) || ((j == k) && (o) && (!o))) {
              break label158;
            }
          }
        }
        j = 0;
        break label161;
      }
    }
    else
    {
      parame.getClass();
    }
    label158:
    int j = 1;
    label161:
    Object localObject1 = null;
    Object localObject2;
    long l2;
    long l3;
    if (j == 0)
    {
      if ((o) && (!o)) {
        localObject2 = new e(d, a, b, e, g, h, i, j, k, l, m, n, c, true, p, q, r, s, v, t);
      } else {
        localObject2 = locale;
      }
    }
    else
    {
      if (p) {}
      for (l2 = h;; l2 += l3)
      {
        break;
        localObject2 = t;
        if (localObject2 != null) {
          l2 = h;
        } else {
          l2 = 0L;
        }
        if (locale == null) {
          break;
        }
        j = r.size();
        k = (int)(k - k);
        localObject2 = r;
        if (k < ((List)localObject2).size()) {
          localObject2 = (e.c)((List)localObject2).get(k);
        } else {
          localObject2 = null;
        }
        if (localObject2 != null)
        {
          l2 = h;
          l3 = e;
        }
        else
        {
          if (j != k - k) {
            break;
          }
          l2 = h;
          l3 = u;
        }
      }
      if (i) {
        j = j;
      }
      for (;;)
      {
        break;
        localObject2 = t;
        if (localObject2 != null) {
          j = j;
        } else {
          j = 0;
        }
        if (locale != null)
        {
          k = (int)(k - k);
          localObject2 = r;
          if (k < ((List)localObject2).size()) {
            localObject2 = (e.c)((List)localObject2).get(k);
          } else {
            localObject2 = null;
          }
          if (localObject2 != null) {
            j = j + d - r.get(0)).d;
          }
        }
      }
      localObject2 = new e(d, a, b, e, g, l2, true, j, k, l, m, n, c, o, p, q, r, s, v, t);
    }
    d = ((e)localObject2);
    if (localObject2 != locale)
    {
      r = null;
      f = l1;
      parame = s;
      if (a.equals(s))
      {
        if (t == null)
        {
          u = (o ^ true);
          v = h;
        }
        t = ((e)localObject2);
        ((HlsMediaSource)q).y((e)localObject2);
      }
      parame = e.iterator();
      while (parame.hasNext()) {
        ((j.a)parame.next()).f();
      }
    }
    if (!o)
    {
      l2 = k;
      l3 = r.size();
      parame = d;
      boolean bool2;
      if (l2 + l3 < k)
      {
        parame = new j.b();
        bool2 = true;
      }
      else
      {
        double d1 = l1 - f;
        double d2 = e0.R(m);
        s.getClass();
        parame = (e)localObject1;
        if (d1 > d2 * 3.5D) {
          parame = new j.c();
        }
        bool2 = false;
      }
      if (parame != null)
      {
        r = parame;
        localObject1 = s;
        localObject2 = a;
        parame = new c0.c(parame, 1);
        localObject1 = e.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((j.a)((Iterator)localObject1).next()).a((Uri)localObject2, parame, bool2);
        }
      }
    }
    parame = d;
    if (!v.e)
    {
      if (parame != locale) {
        l2 = m;
      } else {
        l2 = m / 2L;
      }
    }
    else {
      l2 = 0L;
    }
    o = (e0.R(l2) + l1);
    if (d.n == -9223372036854775807L)
    {
      j = i;
      if (!a.equals(s.s)) {}
    }
    else
    {
      j = 1;
    }
    if (j != 0)
    {
      parame = d;
      if (!o)
      {
        parame = v;
        if ((a == -9223372036854775807L) && (!e))
        {
          parame = a;
        }
        else
        {
          localObject2 = a.buildUpon();
          parame = d;
          if (v.e)
          {
            ((Uri.Builder)localObject2).appendQueryParameter("_HLS_msn", String.valueOf(k + r.size()));
            parame = d;
            if (n != -9223372036854775807L)
            {
              parame = s;
              i = parame.size();
              j = i;
              if (!parame.isEmpty())
              {
                j = i;
                if (Ku) {
                  j = i - 1;
                }
              }
              ((Uri.Builder)localObject2).appendQueryParameter("_HLS_part", String.valueOf(j));
            }
          }
          parame = d.v;
          if (a != -9223372036854775807L)
          {
            if (b) {
              parame = "v2";
            } else {
              parame = "YES";
            }
            ((Uri.Builder)localObject2).appendQueryParameter("_HLS_skip", parame);
          }
          parame = ((Uri.Builder)localObject2).build();
        }
        c(parame);
      }
    }
  }
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    paramd = (f0)paramd;
    paramLong1 = a;
    j0 localj0 = d;
    paramd = c;
    paramd = new n(d);
    s.c.getClass();
    s.f.d(paramd, 4);
  }
  
  public final void p(d0.d paramd, long paramLong1, long paramLong2)
  {
    Object localObject = (f0)paramd;
    paramd = (g)f;
    j0 localj0 = d;
    localObject = c;
    localObject = new n(d);
    if ((paramd instanceof e))
    {
      d((e)paramd);
      s.f.g((n)localObject, 4);
    }
    else
    {
      paramd = a1.b("Loaded playlist has unexpected type.", null);
      r = paramd;
      s.f.k((n)localObject, 4, paramd, true);
    }
    s.c.getClass();
  }
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    f0 localf0 = (f0)paramd;
    paramLong1 = a;
    Object localObject1 = d;
    paramd = c;
    localObject1 = new n(d);
    int i;
    if (paramd.getQueryParameter("_HLS_msn") != null) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool = paramIOException instanceof h.a;
    if ((i != 0) || (bool))
    {
      i = Integer.MAX_VALUE;
      if ((paramIOException instanceof z)) {
        i = d;
      }
      if ((bool) || (i == 400) || (i == 503)) {}
    }
    else
    {
      paramd = new c0.c(paramIOException, paramInt);
      Object localObject2 = s;
      Uri localUri = a;
      localObject2 = e.iterator();
      paramInt = 0;
      while (((Iterator)localObject2).hasNext()) {
        paramInt |= ((j.a)((Iterator)localObject2).next()).a(localUri, paramd, false) ^ true;
      }
      if (paramInt != 0)
      {
        paramLong1 = ((u)s.c).c(paramd);
        if (paramLong1 != -9223372036854775807L) {
          paramd = new d0.b(0, paramLong1);
        } else {
          paramd = d0.f;
        }
      }
      else
      {
        paramd = d0.e;
      }
      bool = paramd.a() ^ true;
      s.f.k((n)localObject1, c, paramIOException, bool);
      paramIOException = paramd;
      if (!bool) {
        break label351;
      }
      s.c.getClass();
      paramIOException = paramd;
      break label351;
    }
    o = SystemClock.elapsedRealtime();
    c(a);
    paramd = s.f;
    paramInt = e0.a;
    paramd.k((n)localObject1, c, paramIOException, true);
    paramIOException = d0.e;
    label351:
    return paramIOException;
  }
}

/* Location:
 * Qualified Name:     f5.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */