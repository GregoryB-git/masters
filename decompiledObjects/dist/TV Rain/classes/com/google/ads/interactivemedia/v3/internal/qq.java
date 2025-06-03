package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;

final class qq
{
  private final qz a;
  private final tt b;
  private final tt c;
  private final rn d;
  private final Uri[] e;
  private final bw[] f;
  private final sd g;
  private final od h;
  private final List<bw> i;
  private final qs j;
  private boolean k;
  private byte[] l;
  private IOException m;
  private Uri n;
  private boolean o;
  private sy p;
  private long q;
  private boolean r;
  
  public qq(qz paramqz, sd paramsd, Uri[] paramArrayOfUri, bw[] paramArrayOfbw, qw paramqw, vc paramvc, rn paramrn, List<bw> paramList)
  {
    a = paramqz;
    g = paramsd;
    e = paramArrayOfUri;
    f = paramArrayOfbw;
    d = paramrn;
    i = paramList;
    j = new qs();
    q = -9223372036854775807L;
    paramqz = paramqw.a();
    b = paramqz;
    if (paramvc != null) {
      paramqz.a(paramvc);
    }
    c = paramqw.a();
    h = new od(paramArrayOfbw);
    paramqz = new int[paramArrayOfUri.length];
    for (int i1 = 0; i1 < paramArrayOfUri.length; i1++) {
      paramqz[i1] = i1;
    }
    p = new qx(h, paramqz);
  }
  
  private final long a(ra paramra, boolean paramBoolean, rx paramrx, long paramLong1, long paramLong2)
  {
    if ((paramra != null) && (!paramBoolean)) {
      return paramra.g();
    }
    long l1 = m;
    long l2 = paramLong2;
    if (paramra != null) {
      if (o) {
        l2 = paramLong2;
      } else {
        l2 = h;
      }
    }
    if ((!i) && (l2 >= l1 + paramLong1)) {
      paramLong1 = f;
    }
    for (paramLong2 = l.size();; paramLong2 = f)
    {
      return paramLong1 + paramLong2;
      List localList = l;
      if ((g.e()) && (paramra != null)) {
        paramBoolean = false;
      } else {
        paramBoolean = true;
      }
      paramLong1 = wl.a(localList, Long.valueOf(l2 - paramLong1), true, paramBoolean);
    }
  }
  
  private static Uri a(rx paramrx, sa paramsa)
  {
    if (paramsa != null)
    {
      paramsa = g;
      if (paramsa != null) {
        return rp.a(n, paramsa);
      }
    }
    return null;
  }
  
  private final ok a(Uri paramUri, int paramInt)
  {
    if (paramUri == null) {
      return null;
    }
    if (j.containsKey(paramUri))
    {
      qs localqs = j;
      localqs.a(paramUri, (byte[])localqs.remove(paramUri));
      return null;
    }
    paramUri = new tx(paramUri, 0L, -1L, null, 1);
    return new qt(c, paramUri, f[paramInt], p.b(), p.c(), l);
  }
  
  public final void a()
    throws IOException
  {
    Object localObject = m;
    if (localObject == null)
    {
      localObject = n;
      if ((localObject != null) && (r)) {
        g.b((Uri)localObject);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public final void a(long paramLong1, long paramLong2, List<ra> paramList, boolean paramBoolean, qv paramqv)
  {
    boolean bool = paramList.isEmpty();
    int i1 = 1;
    ra localra;
    if (bool) {
      localra = null;
    } else {
      localra = (ra)paramList.get(paramList.size() - 1);
    }
    int i2;
    if (localra == null) {
      i2 = -1;
    } else {
      i2 = h.a(e);
    }
    long l1 = paramLong2 - paramLong1;
    long l2 = q;
    long l3 = -9223372036854775807L;
    if (l2 == -9223372036854775807L) {
      i1 = 0;
    }
    long l4;
    if (i1 != 0) {
      l4 = l2 - paramLong1;
    } else {
      l4 = -9223372036854775807L;
    }
    l2 = l1;
    if (localra != null)
    {
      l2 = l1;
      if (!o)
      {
        long l5 = i - h;
        l1 = Math.max(0L, l1 - l5);
        l2 = l1;
        if (l4 != -9223372036854775807L)
        {
          l4 = Math.max(0L, l4 - l5);
          l2 = l1;
        }
      }
    }
    Object localObject1 = a(localra, paramLong2);
    Object localObject2 = p;
    bool = false;
    ((sy)localObject2).a(paramLong1, l2, l4, paramList, (oz[])localObject1);
    i1 = p.i();
    if (i2 != i1) {
      bool = true;
    }
    localObject2 = e[i1];
    if (!g.a((Uri)localObject2))
    {
      c = ((Uri)localObject2);
      r &= ((Uri)localObject2).equals(n);
      n = ((Uri)localObject2);
      return;
    }
    paramList = g.a((Uri)localObject2, true);
    o = p;
    if (i) {
      paramLong1 = l3;
    } else {
      paramLong1 = paramList.a() - g.c();
    }
    q = paramLong1;
    paramLong1 = c - g.c();
    paramLong2 = a(localra, bool, paramList, paramLong1, paramLong2);
    if ((paramLong2 < f) && (localra != null) && (bool))
    {
      localObject2 = e[i2];
      paramList = g.a((Uri)localObject2, true);
      paramLong1 = c;
      l2 = g.c();
      paramLong2 = localra.g();
      paramLong1 -= l2;
    }
    else
    {
      i2 = i1;
    }
    l2 = f;
    if (paramLong2 < l2)
    {
      m = new lq();
      return;
    }
    i1 = (int)(paramLong2 - l2);
    int i3 = l.size();
    if (i1 >= i3) {
      if (i)
      {
        if ((!paramBoolean) && (i3 != 0)) {
          i1 = i3 - 1;
        } else {
          b = true;
        }
      }
      else
      {
        c = ((Uri)localObject2);
        r &= ((Uri)localObject2).equals(n);
        n = ((Uri)localObject2);
        return;
      }
    }
    r = false;
    n = null;
    Object localObject3 = (sa)l.get(i1);
    localObject1 = a(paramList, b);
    Object localObject4 = a((Uri)localObject1, i2);
    a = ((ok)localObject4);
    if (localObject4 != null) {
      return;
    }
    localObject4 = a(paramList, (sa)localObject3);
    localObject3 = a((Uri)localObject4, i2);
    a = ((ok)localObject3);
    if (localObject3 != null) {
      return;
    }
    a = ra.a(a, b, f[i2], paramLong1, paramList, i1, (Uri)localObject2, i, p.b(), p.c(), k, d, localra, j.a(localObject4), j.a(localObject1));
  }
  
  public final void a(ok paramok)
  {
    if ((paramok instanceof qt))
    {
      paramok = (qt)paramok;
      l = paramok.c();
      j.a(c.a, paramok.g());
    }
  }
  
  public final void a(sy paramsy)
  {
    p = paramsy;
  }
  
  public final void a(boolean paramBoolean)
  {
    k = paramBoolean;
  }
  
  public final boolean a(Uri paramUri, long paramLong)
  {
    for (int i1 = 0;; i1++)
    {
      Uri[] arrayOfUri = e;
      if (i1 >= arrayOfUri.length) {
        break;
      }
      if (arrayOfUri[i1].equals(paramUri)) {
        break label41;
      }
    }
    i1 = -1;
    label41:
    if (i1 == -1) {
      return true;
    }
    i1 = p.c(i1);
    if (i1 == -1) {
      return true;
    }
    boolean bool = r;
    r = (paramUri.equals(n) | bool);
    return (paramLong == -9223372036854775807L) || (p.a(i1, paramLong));
  }
  
  public final boolean a(ok paramok, long paramLong)
  {
    sy localsy = p;
    return localsy.a(localsy.c(h.a(e)), paramLong);
  }
  
  public final oz[] a(ra paramra, long paramLong)
  {
    int i1;
    if (paramra == null) {
      i1 = -1;
    } else {
      i1 = h.a(e);
    }
    int i2 = p.g();
    oz[] arrayOfoz = new oz[i2];
    for (int i3 = 0; i3 < i2; i3++)
    {
      int i4 = p.b(i3);
      Object localObject = e[i4];
      if (!g.a((Uri)localObject))
      {
        arrayOfoz[i3] = oz.a;
      }
      else
      {
        localObject = g.a((Uri)localObject, false);
        long l1 = c - g.c();
        boolean bool;
        if (i4 != i1) {
          bool = true;
        } else {
          bool = false;
        }
        long l2 = a(paramra, bool, (rx)localObject, l1, paramLong);
        long l3 = f;
        if (l2 < l3) {
          arrayOfoz[i3] = oz.a;
        } else {
          arrayOfoz[i3] = new qu((rx)localObject, l1, (int)(l2 - l3));
        }
      }
    }
    return arrayOfoz;
  }
  
  public final od b()
  {
    return h;
  }
  
  public final sy c()
  {
    return p;
  }
  
  public final void d()
  {
    m = null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */