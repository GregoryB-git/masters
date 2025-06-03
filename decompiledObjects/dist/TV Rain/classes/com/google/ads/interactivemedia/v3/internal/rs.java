package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class rs
  implements sd, uo<uz<rz>>
{
  public static final sg a = rr.a;
  private final qw b;
  private final se c;
  private final un d;
  private final HashMap<Uri, ru> e;
  private final List<sf> f;
  private final double g;
  private uy<rz> h;
  private mu i;
  private um j;
  private Handler k;
  private sk l;
  private rw m;
  private Uri n;
  private rx o;
  private boolean p;
  private long q;
  
  public rs(qw paramqw, un paramun, se paramse)
  {
    this(paramqw, paramun, paramse, 3.5D);
  }
  
  private rs(qw paramqw, un paramun, se paramse, double paramDouble)
  {
    b = paramqw;
    c = paramse;
    d = paramun;
    g = 3.5D;
    f = new ArrayList();
    e = new HashMap();
    q = -9223372036854775807L;
  }
  
  private final rx a(rx paramrx1, rx paramrx2)
  {
    int i1 = 1;
    int i2 = i1;
    long l1;
    long l2;
    if (paramrx1 != null)
    {
      l1 = f;
      l2 = f;
      if (l1 > l2)
      {
        i2 = i1;
      }
      else
      {
        if (l1 >= l2)
        {
          int i3 = l.size();
          int i4 = l.size();
          i2 = i1;
          if (i3 > i4) {
            break label105;
          }
          if ((i3 == i4) && (i) && (!i))
          {
            i2 = i1;
            break label105;
          }
        }
        i2 = 0;
      }
    }
    label105:
    if (i2 == 0)
    {
      if (i)
      {
        if (i) {
          return paramrx1;
        }
        return new rx(a, n, o, b, c, d, e, f, g, h, p, true, j, k, l);
      }
      return paramrx1;
    }
    if (j) {
      l1 = c;
    }
    Object localObject;
    for (;;)
    {
      break;
      localObject = o;
      if (localObject != null) {
        l2 = c;
      } else {
        l2 = 0L;
      }
      l1 = l2;
      if (paramrx1 != null)
      {
        i2 = l.size();
        localObject = b(paramrx1, paramrx2);
        if (localObject != null)
        {
          l1 = c + e;
        }
        else
        {
          l1 = l2;
          if (i2 == f - f) {
            l1 = paramrx1.a();
          }
        }
      }
    }
    if (d) {}
    for (i2 = e;; i2 = e + d - l.get(0)).d)
    {
      break;
      localObject = o;
      if (localObject != null) {
        i2 = e;
      } else {
        i2 = 0;
      }
      if (paramrx1 == null) {
        break;
      }
      localObject = b(paramrx1, paramrx2);
      if (localObject == null) {
        break;
      }
    }
    return new rx(a, n, o, b, l1, true, i2, f, g, h, p, i, j, k, l);
  }
  
  private final void a(Uri paramUri, rx paramrx)
  {
    if (paramUri.equals(n))
    {
      if (o == null)
      {
        p = (i ^ true);
        q = c;
      }
      o = paramrx;
      l.a(paramrx);
    }
    int i1 = f.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((sf)f.get(i2)).i();
    }
  }
  
  private final boolean a(Uri paramUri, long paramLong)
  {
    int i1 = f.size();
    int i2 = 0;
    boolean bool = false;
    while (i2 < i1)
    {
      bool |= ((sf)f.get(i2)).a(paramUri, paramLong) ^ true;
      i2++;
    }
    return bool;
  }
  
  private static sa b(rx paramrx1, rx paramrx2)
  {
    int i1 = (int)(f - f);
    paramrx1 = l;
    if (i1 < paramrx1.size()) {
      return (sa)paramrx1.get(i1);
    }
    return null;
  }
  
  private final boolean f()
  {
    List localList = m.c;
    int i1 = localList.size();
    long l1 = SystemClock.elapsedRealtime();
    for (int i2 = 0; i2 < i1; i2++)
    {
      ru localru = (ru)e.get(geta);
      if (l1 > ru.a(localru))
      {
        n = ru.b(localru);
        localru.d();
        return true;
      }
    }
    return false;
  }
  
  public final rx a(Uri paramUri, boolean paramBoolean)
  {
    rx localrx = ((ru)e.get(paramUri)).a();
    if ((localrx != null) && (paramBoolean) && (!paramUri.equals(n)))
    {
      Object localObject = m.c;
      int i1 = 0;
      int i3;
      for (int i2 = 0;; i2++)
      {
        i3 = i1;
        if (i2 >= ((List)localObject).size()) {
          break;
        }
        if (paramUri.equals(geta))
        {
          i3 = 1;
          break;
        }
      }
      if (i3 != 0)
      {
        localObject = o;
        if ((localObject == null) || (!i))
        {
          n = paramUri;
          ((ru)e.get(paramUri)).d();
        }
      }
    }
    return localrx;
  }
  
  public final void a()
  {
    n = null;
    o = null;
    m = null;
    q = -9223372036854775807L;
    j.a(null);
    j = null;
    Iterator localIterator = e.values().iterator();
    while (localIterator.hasNext()) {
      ((ru)localIterator.next()).c();
    }
    k.removeCallbacksAndMessages(null);
    k = null;
    e.clear();
  }
  
  public final void a(Uri paramUri, mu parammu, sk paramsk)
  {
    k = new Handler();
    i = parammu;
    l = paramsk;
    paramUri = new uz(b.a(), paramUri, 4, c.a());
    boolean bool;
    if (j == null) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    paramsk = new um("DefaultHlsPlaylistTracker:MasterPlaylist");
    j = paramsk;
    long l1 = paramsk.a(paramUri, this, d.a(b));
    parammu.a(a, b, l1);
  }
  
  public final void a(sf paramsf)
  {
    f.add(paramsf);
  }
  
  public final boolean a(Uri paramUri)
  {
    return ((ru)e.get(paramUri)).b();
  }
  
  public final rw b()
  {
    return m;
  }
  
  public final void b(Uri paramUri)
    throws IOException
  {
    ((ru)e.get(paramUri)).e();
  }
  
  public final void b(sf paramsf)
  {
    f.remove(paramsf);
  }
  
  public final long c()
  {
    return q;
  }
  
  public final void c(Uri paramUri)
  {
    ((ru)e.get(paramUri)).d();
  }
  
  public final void d()
    throws IOException
  {
    Object localObject = j;
    if (localObject != null) {
      ((um)localObject).a();
    }
    localObject = n;
    if (localObject != null) {
      b((Uri)localObject);
    }
  }
  
  public final boolean e()
  {
    return p;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */