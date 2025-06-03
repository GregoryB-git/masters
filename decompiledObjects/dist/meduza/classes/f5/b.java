package f5;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import e5.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import t5.c0;
import t5.c0.a;
import t5.c0.b;
import t5.c0.c;
import t5.d0;
import t5.d0.a;
import t5.d0.b;
import t5.d0.d;
import t5.d0.g;
import t5.f0;
import t5.f0.a;
import t5.j0;
import t5.k;
import t5.l;
import t5.u;
import t5.w;
import t5.z;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;
import w3.v;
import z4.n;
import z4.w.a;

public final class b
  implements j, d0.a<f0<g>>
{
  public static final v w = new v(10);
  public final h a;
  public final i b;
  public final c0 c;
  public final HashMap<Uri, b> d;
  public final CopyOnWriteArrayList<j.a> e;
  public w.a f;
  public d0 o;
  public Handler p;
  public j.d q;
  public f r;
  public Uri s;
  public e t;
  public boolean u;
  public long v;
  
  public b(h paramh, u paramu, i parami)
  {
    a = paramh;
    b = parami;
    c = paramu;
    e = new CopyOnWriteArrayList();
    d = new HashMap();
    v = -9223372036854775807L;
  }
  
  public final boolean a(Uri paramUri)
  {
    paramUri = (b)d.get(paramUri);
    e locale = d;
    boolean bool = false;
    if (locale != null)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = Math.max(30000L, e0.R(d.u));
      locale = d;
      if (!o)
      {
        int i = d;
        if ((i != 2) && (i != 1) && (e + l2 <= l1)) {}
      }
      else
      {
        bool = true;
      }
    }
    return bool;
  }
  
  public final void b(Uri paramUri)
  {
    paramUri = (b)d.get(paramUri);
    b.a();
    paramUri = r;
    if (paramUri == null) {
      return;
    }
    throw paramUri;
  }
  
  public final void c(j.a parama)
  {
    e.remove(parama);
  }
  
  public final void d(j.a parama)
  {
    parama.getClass();
    e.add(parama);
  }
  
  public final long e()
  {
    return v;
  }
  
  public final void f(Uri paramUri, w.a parama, j.d paramd)
  {
    p = e0.l(null);
    f = parama;
    q = paramd;
    f0 localf0 = new f0(a.a(), paramUri, 4, b.b());
    boolean bool;
    if (o == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    paramUri = new d0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
    o = paramUri;
    paramd = c;
    int i = c;
    long l = paramUri.f(localf0, this, ((u)paramd).b(i));
    parama.m(new n(a, b, l), c);
  }
  
  public final boolean g()
  {
    return u;
  }
  
  public final f h()
  {
    return r;
  }
  
  public final boolean i(Uri paramUri, long paramLong)
  {
    paramUri = (b)d.get(paramUri);
    if (paramUri != null) {
      return b.a(paramUri, paramLong) ^ true;
    }
    return false;
  }
  
  public final void j()
  {
    Object localObject = o;
    if (localObject != null) {
      ((d0)localObject).a();
    }
    localObject = s;
    if (localObject != null) {
      b((Uri)localObject);
    }
  }
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    paramd = (f0)paramd;
    paramLong1 = a;
    paramd = d;
    Uri localUri = c;
    paramd = new n(d);
    c.getClass();
    f.d(paramd, 4);
  }
  
  public final void l(Uri paramUri)
  {
    paramUri = (b)d.get(paramUri);
    paramUri.c(a);
  }
  
  public final e m(boolean paramBoolean, Uri paramUri)
  {
    e locale1 = d.get(paramUri)).d;
    if ((locale1 != null) && (paramBoolean) && (!paramUri.equals(s)))
    {
      Object localObject = r.e;
      int i = 0;
      int k;
      for (int j = 0;; j++)
      {
        k = i;
        if (j >= ((List)localObject).size()) {
          break;
        }
        if (paramUri.equals(geta))
        {
          k = 1;
          break;
        }
      }
      if (k != 0)
      {
        localObject = t;
        if ((localObject == null) || (!o))
        {
          s = paramUri;
          localObject = (b)d.get(paramUri);
          e locale2 = d;
          if ((locale2 != null) && (o))
          {
            t = locale2;
            ((HlsMediaSource)q).y(locale2);
          }
          else
          {
            ((b)localObject).c(n(paramUri));
          }
        }
      }
    }
    return locale1;
  }
  
  public final Uri n(Uri paramUri)
  {
    Object localObject = t;
    Uri localUri = paramUri;
    if (localObject != null)
    {
      localUri = paramUri;
      if (v.e)
      {
        localObject = (e.b)((o7.m0)t).get(paramUri);
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
  
  public final void p(d0.d paramd, long paramLong1, long paramLong2)
  {
    Object localObject1 = (f0)paramd;
    g localg = (g)f;
    boolean bool = localg instanceof e;
    if (bool)
    {
      localObject2 = a;
      paramd = f.n;
      paramd = Uri.parse((String)localObject2);
      localObject2 = new i0.a();
      a = "0";
      j = "application/x-mpegURL";
      paramd = Collections.singletonList(new f.b(paramd, new i0((i0.a)localObject2), null, null, null, null));
      paramd = new f("", Collections.emptyList(), paramd, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }
    else
    {
      paramd = (f)localg;
    }
    r = paramd;
    Object localObject2 = e;
    int i = 0;
    s = get0a;
    e.add(new a());
    localObject2 = d;
    int j = ((List)localObject2).size();
    while (i < j)
    {
      Uri localUri = (Uri)((List)localObject2).get(i);
      paramd = new b(localUri);
      d.put(localUri, paramd);
      i++;
    }
    localObject1 = d;
    paramd = c;
    localObject1 = new n(d);
    paramd = (b)d.get(s);
    if (bool) {
      paramd.d((e)localg);
    } else {
      paramd.c(a);
    }
    c.getClass();
    f.g((n)localObject1, 4);
  }
  
  public final void stop()
  {
    s = null;
    t = null;
    r = null;
    v = -9223372036854775807L;
    o.e(null);
    o = null;
    Iterator localIterator = d.values().iterator();
    while (localIterator.hasNext()) {
      nextb.e(null);
    }
    p.removeCallbacksAndMessages(null);
    p = null;
    d.clear();
  }
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    f0 localf0 = (f0)paramd;
    paramLong1 = a;
    paramd = d;
    Object localObject = c;
    localObject = new n(d);
    ((u)c).getClass();
    boolean bool1 = paramIOException instanceof a1;
    boolean bool2 = true;
    if ((!bool1) && (!(paramIOException instanceof FileNotFoundException)) && (!(paramIOException instanceof w)) && (!(paramIOException instanceof d0.g)))
    {
      int i = l.b;
      for (paramd = paramIOException; paramd != null; paramd = paramd.getCause()) {
        if (((paramd instanceof l)) && (a == 2008))
        {
          i = 1;
          break label136;
        }
      }
      i = 0;
      label136:
      if (i == 0)
      {
        paramLong1 = Math.min((paramInt - 1) * 1000, 5000);
        break label167;
      }
    }
    paramLong1 = -9223372036854775807L;
    label167:
    if (paramLong1 != -9223372036854775807L) {
      bool2 = false;
    }
    f.k((n)localObject, c, paramIOException, bool2);
    if (bool2) {
      c.getClass();
    }
    if (bool2) {
      paramd = d0.f;
    } else {
      paramd = new d0.b(0, paramLong1);
    }
    return paramd;
  }
  
  public final class a
    implements j.a
  {
    public a() {}
    
    public final boolean a(Uri paramUri, c0.c paramc, boolean paramBoolean)
    {
      if (t == null)
      {
        long l = SystemClock.elapsedRealtime();
        Object localObject = r;
        int i = e0.a;
        List localList = e;
        i = 0;
        int k;
        for (int j = i; i < localList.size(); j = k)
        {
          localObject = (b.b)d.get(geta);
          k = j;
          if (localObject != null)
          {
            k = j;
            if (l < p) {
              k = j + 1;
            }
          }
          i++;
        }
        localObject = new c0.a(1, 0, r.e.size(), j);
        paramc = ((u)c).a((c0.a)localObject, paramc);
        if ((paramc != null) && (a == 2))
        {
          paramUri = (b.b)d.get(paramUri);
          if (paramUri != null) {
            b.b.a(paramUri, b);
          }
        }
      }
      return false;
    }
    
    public final void f()
    {
      e.remove(this);
    }
  }
  
  public final class b
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
    
    public b(Uri paramUri)
    {
      a = paramUri;
      b = new d0("DefaultHlsPlaylistTracker:MediaPlaylist");
      c = a.a();
    }
    
    public static boolean a(b paramb, long paramLong)
    {
      p = (SystemClock.elapsedRealtime() + paramLong);
      boolean bool1 = a.equals(s);
      boolean bool2 = true;
      if (bool1)
      {
        paramb = b.this;
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
      Object localObject = b.this;
      localObject = b.a(r, d);
      paramUri = new f0(c, paramUri, 4, (f0.a)localObject);
      d0 locald0 = b;
      localObject = c;
      int i = c;
      long l = locald0.f(paramUri, this, ((u)localObject).b(i));
      f.m(new n(a, b, l), c);
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
          p.postDelayed(new x0.f(11, this, paramUri), l2 - l1);
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
      b localb = b.this;
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
        parame = b.this;
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
          getClass();
          parame = (e)localObject1;
          if (d1 > d2 * 3.5D) {
            parame = new j.c();
          }
          bool2 = false;
        }
        if (parame != null)
        {
          r = parame;
          localObject1 = b.this;
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
        if (!a.equals(s)) {}
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
      c.getClass();
      f.d(paramd, 4);
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
        f.g((n)localObject, 4);
      }
      else
      {
        paramd = a1.b("Loaded playlist has unexpected type.", null);
        r = paramd;
        f.k((n)localObject, 4, paramd, true);
      }
      c.getClass();
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
        Object localObject2 = b.this;
        Uri localUri = a;
        localObject2 = e.iterator();
        paramInt = 0;
        while (((Iterator)localObject2).hasNext()) {
          paramInt |= ((j.a)((Iterator)localObject2).next()).a(localUri, paramd, false) ^ true;
        }
        if (paramInt != 0)
        {
          paramLong1 = ((u)c).c(paramd);
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
        f.k((n)localObject1, c, paramIOException, bool);
        paramIOException = paramd;
        if (!bool) {
          break label351;
        }
        c.getClass();
        paramIOException = paramd;
        break label351;
      }
      o = SystemClock.elapsedRealtime();
      c(a);
      paramd = f;
      paramInt = e0.a;
      paramd.k((n)localObject1, c, paramIOException, true);
      paramIOException = d0.e;
      label351:
      return paramIOException;
    }
  }
}

/* Location:
 * Qualified Name:     f5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */