package u5;

import android.net.Uri;
import f;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n7.d;
import t5.g0;
import t5.h;
import t5.k;
import t5.k0;
import t5.l0;
import t5.n;
import t5.r;
import t5.v;
import v5.e0;

public final class c
  implements k
{
  public final a a;
  public final k b;
  public final k0 c;
  public final k d;
  public final boolean e;
  public final boolean f;
  public final boolean g;
  public Uri h;
  public n i;
  public n j;
  public k k;
  public long l;
  public long m;
  public long n;
  public g o;
  public boolean p;
  public boolean q;
  public long r;
  public long s;
  
  public c(q paramq, r paramr, v paramv, b paramb)
  {
    a = paramq;
    b = paramv;
    e = true;
    f = true;
    g = false;
    paramq = null;
    if (paramr != null)
    {
      d = paramr;
      paramq = new k0(paramr, paramb);
    }
    else
    {
      d = g0.a;
    }
    c = paramq;
  }
  
  public final long a(n paramn)
  {
    try
    {
      String str = h;
      if (str == null) {
        str = a.toString();
      }
      Uri localUri = a;
      long l1 = b;
      i1 = c;
      Object localObject1 = d;
      Object localObject2 = e;
      long l2 = f;
      long l3 = g;
      int i2 = i;
      Object localObject3 = j;
      n localn;
      if (localUri != null)
      {
        localn = new t5/n;
        localn.<init>(localUri, l1, i1, (byte[])localObject1, (Map)localObject2, l2, l3, str, i2, localObject3);
        i = localn;
        localObject1 = a;
        localObject2 = a;
        localObject3 = (byte[])cb.get("exo_redir");
        localUri = null;
        if (localObject3 != null)
        {
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>((byte[])localObject3, d.c);
        }
        else
        {
          localObject1 = null;
        }
        if (localObject1 == null) {
          localObject1 = localUri;
        } else {
          localObject1 = Uri.parse((String)localObject1);
        }
        if (localObject1 != null) {
          localObject2 = localObject1;
        }
        h = ((Uri)localObject2);
        m = f;
        if ((f) && (p)) {
          i1 = 0;
        } else if ((g) && (g == -1L)) {
          i1 = 1;
        } else {
          i1 = -1;
        }
        boolean bool;
        if (i1 != -1) {
          bool = true;
        } else {
          bool = false;
        }
        q = bool;
        if (q)
        {
          n = -1L;
        }
        else
        {
          l1 = f.d(a.c(str));
          n = l1;
          if (l1 != -1L)
          {
            l1 -= f;
            n = l1;
            if (l1 < 0L)
            {
              paramn = new t5/l;
              paramn.<init>(2008);
              throw paramn;
            }
          }
        }
        l1 = g;
        if (l1 != -1L)
        {
          l2 = n;
          if (l2 != -1L) {
            l1 = Math.min(l2, l1);
          }
          n = l1;
        }
        l1 = n;
        if ((l1 <= 0L) && (l1 != -1L)) {
          break label452;
        }
      }
      try
      {
        p(localn, false);
        label452:
        l1 = g;
        if (l1 == -1L) {
          l1 = n;
        }
        return l1;
      }
      finally
      {
        break label496;
      }
      paramn = new java/lang/IllegalStateException;
      paramn.<init>("The uri must be set.");
      throw paramn;
    }
    finally {}
    label496:
    int i1 = 0;
    if (k == b) {
      i1 = 1;
    }
    if ((i1 != 0) || ((paramn instanceof a.a))) {
      p = true;
    }
    throw paramn;
  }
  
  public final void close()
  {
    i = null;
    h = null;
    m = 0L;
    try
    {
      o();
      return;
    }
    finally
    {
      int i1;
      if (k == b) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i1 != 0) || ((localObject instanceof a.a))) {
        p = true;
      }
    }
  }
  
  public final void f(l0 paraml0)
  {
    paraml0.getClass();
    b.f(paraml0);
    d.f(paraml0);
  }
  
  public final Map<String, List<String>> h()
  {
    int i1;
    if (k == b) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    Map localMap;
    if ((i1 ^ 0x1) != 0) {
      localMap = d.h();
    } else {
      localMap = Collections.emptyMap();
    }
    return localMap;
  }
  
  public final Uri l()
  {
    return h;
  }
  
  public final void o()
  {
    Object localObject1 = k;
    if (localObject1 == null) {
      return;
    }
    try
    {
      ((k)localObject1).close();
      return;
    }
    finally
    {
      j = null;
      k = null;
      localObject1 = o;
      if (localObject1 != null)
      {
        a.b((g)localObject1);
        o = null;
      }
    }
  }
  
  public final void p(n paramn, boolean paramBoolean)
  {
    String str1 = h;
    int i1 = e0.a;
    if (q) {
      localObject1 = null;
    } else if (e) {
      try
      {
        localObject1 = a.k(m, n, str1);
      }
      catch (InterruptedException paramn)
      {
        Thread.currentThread().interrupt();
        throw new InterruptedIOException();
      }
    } else {
      localObject1 = a.a(m, n, str1);
    }
    Object localObject2;
    Object localObject3;
    long l1;
    int i2;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    long l2;
    if (localObject1 == null)
    {
      localObject2 = d;
      localObject3 = a;
      l1 = b;
      i2 = c;
      localObject4 = d;
      localObject5 = e;
      String str2 = h;
      i1 = i;
      localObject6 = j;
      l2 = m;
      l3 = n;
      if (localObject3 != null) {
        localObject4 = new n((Uri)localObject3, l1, i2, (byte[])localObject4, (Map)localObject5, l2, l3, str2, i1, localObject6);
      } else {
        throw new IllegalStateException("The uri must be set.");
      }
    }
    else
    {
      if (d)
      {
        localObject6 = Uri.fromFile(e);
        l2 = b;
        long l4 = m - l2;
        l1 = c - l4;
        long l5 = n;
        l3 = l1;
        if (l5 != -1L) {
          l3 = Math.min(l1, l5);
        }
        i2 = c;
        localObject5 = d;
        localObject3 = e;
        localObject2 = h;
        i1 = i;
        localObject4 = j;
        if (localObject6 != null)
        {
          localObject4 = new n((Uri)localObject6, l2, i2, (byte[])localObject5, (Map)localObject3, l4, l3, (String)localObject2, i1, localObject4);
          localObject2 = b;
        }
      }
      do
      {
        break;
        throw new IllegalStateException("The uri must be set.");
        l1 = c;
        if (l1 == -1L) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0)
        {
          l3 = n;
        }
        else
        {
          l2 = n;
          l3 = l1;
          if (l2 != -1L) {
            l3 = Math.min(l1, l2);
          }
        }
        localObject3 = a;
        l1 = b;
        i2 = c;
        localObject5 = d;
        localObject6 = e;
        localObject4 = h;
        i1 = i;
        localObject2 = j;
        l2 = m;
        if (localObject3 == null) {
          break label966;
        }
        localObject4 = new n((Uri)localObject3, l1, i2, (byte[])localObject5, (Map)localObject6, l2, l3, (String)localObject4, i1, localObject2);
        localObject2 = c;
      } while (localObject2 != null);
      localObject2 = d;
      a.b((g)localObject1);
      localObject1 = null;
    }
    if ((!q) && (localObject2 == d)) {
      l3 = m + 102400L;
    } else {
      l3 = Long.MAX_VALUE;
    }
    s = l3;
    if (paramBoolean)
    {
      if (k == d) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      x6.b.H(paramBoolean);
      if (localObject2 == d) {
        return;
      }
    }
    try
    {
      o();
    }
    finally
    {
      if ((d ^ true)) {
        a.b((g)localObject1);
      }
    }
    o = ((g)localObject1);
    k = ((k)localObject2);
    j = ((n)localObject4);
    l = 0L;
    long l3 = ((k)localObject2).a((n)localObject4);
    Object localObject1 = new l();
    if ((g == -1L) && (l3 != -1L))
    {
      n = l3;
      localObject5 = Long.valueOf(m + l3);
      localObject4 = a;
      localObject5.getClass();
      ((HashMap)localObject4).put("exo_len", localObject5);
      b.remove("exo_len");
    }
    if (k == b) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if ((i1 ^ 0x1) != 0)
    {
      localObject2 = ((k)localObject2).l();
      h = ((Uri)localObject2);
      if ((a.equals(localObject2) ^ true)) {
        paramn = h;
      } else {
        paramn = null;
      }
      if (paramn == null)
      {
        b.add("exo_redir");
        a.remove("exo_redir");
      }
      else
      {
        paramn = paramn.toString();
        localObject2 = a;
        paramn.getClass();
        ((HashMap)localObject2).put("exo_redir", paramn);
        b.remove("exo_redir");
      }
    }
    if (k == c) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0) {
      a.f(str1, (l)localObject1);
    }
    return;
    label966:
    throw new IllegalStateException("The uri must be set.");
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (paramInt2 == 0) {
      return 0;
    }
    if (n == 0L) {
      return -1;
    }
    Object localObject1 = i;
    localObject1.getClass();
    Object localObject2 = j;
    localObject2.getClass();
    int i2;
    try
    {
      if (m >= s) {
        p((n)localObject1, true);
      }
      localObject3 = k;
      localObject3.getClass();
      i2 = ((h)localObject3).read(paramArrayOfByte, paramInt1, paramInt2);
      if (i2 != -1)
      {
        if (k == b) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        }
        if (paramInt1 != 0) {
          r += i2;
        }
        long l1 = m;
        l2 = i2;
        m = (l1 + l2);
        l += l2;
        l1 = n;
        if (l1 != -1L) {
          n = (l1 - l2);
        }
      }
    }
    finally
    {
      break label403;
    }
    Object localObject3 = k;
    int i3;
    if (localObject3 == b) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if ((i3 ^ 0x1) != 0)
    {
      l2 = g;
      if (l2 != -1L) {
        if (l >= l2) {
          break label354;
        }
      }
      paramArrayOfByte = h;
      paramInt1 = e0.a;
      n = 0L;
      if (localObject3 == c) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      if (paramInt1 == 0) {
        break label379;
      }
      localObject2 = new u5/l;
      ((l)localObject2).<init>();
      localObject1 = Long.valueOf(m);
      localObject3 = a;
      localObject1.getClass();
      ((HashMap)localObject3).put("exo_len", localObject1);
      b.remove("exo_len");
      a.f(paramArrayOfByte, (l)localObject2);
      break label379;
    }
    label354:
    long l2 = n;
    if ((l2 <= 0L) && (l2 != -1L)) {
      label379:
      return i2;
    }
    o();
    p((n)localObject1, false);
    paramInt1 = read(paramArrayOfByte, paramInt1, paramInt2);
    return paramInt1;
    label403:
    paramInt1 = i1;
    if (k == b) {
      paramInt1 = 1;
    }
    if ((paramInt1 != 0) || ((paramArrayOfByte instanceof a.a))) {
      p = true;
    }
    throw paramArrayOfByte;
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
}

/* Location:
 * Qualified Name:     u5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */