package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;

public final class gx
  implements fw
{
  private static final ky a = gw.a;
  private final int b;
  private final long c;
  private final vy d;
  private final gc e;
  private final ga f;
  private final gd g;
  private fy h;
  private gi i;
  private int j;
  private kd k;
  private gz l;
  private long m;
  private long n;
  private long o;
  private int p;
  
  public gx()
  {
    this(0);
  }
  
  private gx(int paramInt)
  {
    this(0, -9223372036854775807L);
  }
  
  public gx(int paramInt, long paramLong)
  {
    b = paramInt;
    c = paramLong;
    d = new vy(10);
    e = new gc();
    f = new ga();
    m = -9223372036854775807L;
    g = new gd();
  }
  
  private static boolean a(int paramInt, long paramLong)
  {
    return (paramInt & 0xFFFE0C00) == (paramLong & 0xFFFFFFFFFFFE0C00);
  }
  
  private final boolean a(fz paramfz, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    int i1;
    if (paramBoolean) {
      i1 = 16384;
    } else {
      i1 = 131072;
    }
    paramfz.a();
    int i3;
    if (paramfz.c() == 0L)
    {
      if ((b & 0x2) == 0) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if (i2 != 0) {
        localObject = null;
      } else {
        localObject = a;
      }
      Object localObject = g.a(paramfz, (ky)localObject);
      k = ((kd)localObject);
      if (localObject != null) {
        f.a((kd)localObject);
      }
      i3 = (int)paramfz.b();
      if (!paramBoolean) {
        paramfz.b(i3);
      }
    }
    else
    {
      i3 = 0;
    }
    int i2 = 0;
    int i4 = 0;
    int i5 = i4;
    for (;;)
    {
      if (b(paramfz))
      {
        if (i4 > 0) {
          break;
        }
        throw new EOFException();
      }
      d.c(0);
      int i6 = d.l();
      int i7;
      if ((i2 == 0) || (a(i6, i2)))
      {
        i7 = gc.a(i6);
        if (i7 != -1) {}
      }
      else
      {
        i2 = i5 + 1;
        if (i5 == i1)
        {
          if (paramBoolean) {
            return false;
          }
          throw new ce("Searched too many bytes.");
        }
        if (paramBoolean)
        {
          paramfz.a();
          paramfz.c(i3 + i2);
        }
        else
        {
          paramfz.b(1);
        }
        i4 = 0;
        i5 = i2;
        i2 = i4;
        continue;
      }
      i4++;
      if (i4 == 1)
      {
        gc.a(i6, e);
        i2 = i6;
      }
      else
      {
        if (i4 == 4) {
          break;
        }
      }
      paramfz.c(i7 - 4);
    }
    if (paramBoolean) {
      paramfz.b(i3 + i5);
    } else {
      paramfz.a();
    }
    j = i2;
    return true;
  }
  
  private final boolean b(fz paramfz)
    throws IOException, InterruptedException
  {
    gz localgz = l;
    if (localgz != null)
    {
      long l1 = localgz.c();
      if ((l1 != -1L) && (paramfz.b() > l1 - 4L)) {
        return true;
      }
    }
    try
    {
      boolean bool = paramfz.b(d.a, 0, 4, true);
      return !bool;
    }
    catch (EOFException paramfz) {}
    return true;
  }
  
  private final gz c(fz paramfz)
    throws IOException, InterruptedException
  {
    paramfz.c(d.a, 0, 4);
    d.c(0);
    gc.a(d.l(), e);
    return new gv(paramfz.d(), paramfz.c(), e);
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    if (j == 0) {
      try
      {
        a(paramfz, false);
      }
      catch (EOFException paramfz)
      {
        return -1;
      }
    }
    if (l == null)
    {
      paramgf = new vy(e.c);
      paramfz.c(a, 0, e.c);
      Object localObject1 = e;
      int i1 = a;
      i2 = 21;
      if ((i1 & 0x1) != 0)
      {
        if (e != 1)
        {
          i1 = 36;
          break label114;
        }
      }
      else if (e == 1) {
        i2 = 13;
      }
      i1 = i2;
      label114:
      if (paramgf.c() >= i1 + 4)
      {
        paramgf.c(i1);
        i2 = paramgf.l();
        if ((i2 != 1483304551) && (i2 == 1231971951)) {}
      }
      else
      {
        if (paramgf.c() >= 40)
        {
          paramgf.c(36);
          if (paramgf.l() == 1447187017)
          {
            i2 = 1447187017;
            break label188;
          }
        }
        i2 = 0;
      }
      label188:
      if ((i2 != 1483304551) && (i2 != 1231971951))
      {
        if (i2 == 1447187017)
        {
          paramgf = gy.a(paramfz.d(), paramfz.c(), e, paramgf);
          paramfz.b(e.c);
        }
        else
        {
          paramfz.a();
          paramgf = null;
        }
      }
      else
      {
        paramgf = hb.a(paramfz.d(), paramfz.c(), e, paramgf);
        if ((paramgf != null) && (!f.a()))
        {
          paramfz.a();
          paramfz.c(i1 + 141);
          paramfz.c(d.a, 0, 3);
          d.c(0);
          localObject1 = f;
          i3 = d.i();
          i1 = i3 >> 12;
          i3 &= 0xFFF;
          if ((i1 > 0) || (i3 > 0))
          {
            a = i1;
            b = i3;
          }
        }
        paramfz.b(e.c);
        if ((paramgf != null) && (!paramgf.a()) && (i2 == 1231971951)) {
          paramgf = c(paramfz);
        }
      }
      Object localObject2 = k;
      l1 = paramfz.c();
      if (localObject2 != null)
      {
        i1 = ((kd)localObject2).a();
        for (i2 = 0; i2 < i1; i2++)
        {
          localObject1 = ((kd)localObject2).a(i2);
          if ((localObject1 instanceof lf))
          {
            localObject1 = gu.a(l1, (lf)localObject1);
            break label479;
          }
        }
      }
      localObject1 = null;
      label479:
      if (localObject1 != null) {
        l = ((gz)localObject1);
      } else if (paramgf != null) {
        l = paramgf;
      }
      paramgf = l;
      if ((paramgf == null) || ((!paramgf.a()) && ((b & 0x1) != 0))) {
        l = c(paramfz);
      }
      h.a(l);
      localObject1 = i;
      paramgf = e;
      localObject2 = b;
      int i4 = e;
      i2 = d;
      paramgf = f;
      i1 = a;
      int i3 = b;
      if ((b & 0x2) != 0) {
        paramgf = null;
      } else {
        paramgf = k;
      }
      ((gi)localObject1).a(bw.a(null, (String)localObject2, null, -1, 4096, i4, i2, -1, i1, i3, null, null, 0, null, paramgf));
      o = paramfz.c();
    }
    else if (o != 0L)
    {
      l2 = paramfz.c();
      l1 = o;
      if (l2 < l1) {
        paramfz.b((int)(l1 - l2));
      }
    }
    if (p == 0)
    {
      paramfz.a();
      if (b(paramfz)) {
        return -1;
      }
      d.c(0);
      i2 = d.l();
      if ((a(i2, j)) && (gc.a(i2) != -1))
      {
        gc.a(i2, e);
        if (m == -9223372036854775807L)
        {
          m = l.b(paramfz.c());
          if (c != -9223372036854775807L)
          {
            l1 = l.b(0L);
            l2 = m;
            m = (c - l1 + l2);
          }
        }
        p = e.c;
      }
      else
      {
        paramfz.b(1);
        j = 0;
        return 0;
      }
    }
    int i2 = i.a(paramfz, p, true);
    if (i2 == -1) {
      return -1;
    }
    i2 = p - i2;
    p = i2;
    if (i2 > 0) {
      return 0;
    }
    long l1 = m;
    long l2 = n;
    paramfz = e;
    l2 = l2 * 1000000L / d;
    i.a(l2 + l1, 1, c, 0, null);
    n += e.g;
    p = 0;
    return 0;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    j = 0;
    m = -9223372036854775807L;
    n = 0L;
    p = 0;
  }
  
  public final void a(fy paramfy)
  {
    h = paramfy;
    i = paramfy.a(0, 1);
    h.a();
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    return a(paramfz, true);
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */