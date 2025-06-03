package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class nv
  implements gi
{
  private final tk a;
  private final int b;
  private final nt c;
  private final ns d;
  private final vy e;
  private nu f;
  private nu g;
  private nu h;
  private bw i;
  private boolean j;
  private bw k;
  private long l;
  private long m;
  private boolean n;
  private nx o;
  
  public nv(tk paramtk)
  {
    a = paramtk;
    int i1 = paramtk.c();
    b = i1;
    c = new nt();
    d = new ns();
    e = new vy(32);
    paramtk = new nu(0L, i1);
    f = paramtk;
    g = paramtk;
    h = paramtk;
  }
  
  private final void a(long paramLong, ByteBuffer paramByteBuffer, int paramInt)
  {
    b(paramLong);
    while (paramInt > 0)
    {
      int i1 = Math.min(paramInt, (int)(g.b - paramLong));
      nu localnu = g;
      paramByteBuffer.put(d.a, localnu.a(paramLong), i1);
      int i2 = paramInt - i1;
      long l1 = paramLong + i1;
      localnu = g;
      paramLong = l1;
      paramInt = i2;
      if (l1 == b)
      {
        g = e;
        paramLong = l1;
        paramInt = i2;
      }
    }
  }
  
  private final void a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    b(paramLong);
    int i1 = paramInt;
    while (i1 > 0)
    {
      int i2 = Math.min(i1, (int)(g.b - paramLong));
      nu localnu = g;
      System.arraycopy(d.a, localnu.a(paramLong), paramArrayOfByte, paramInt - i1, i2);
      int i3 = i1 - i2;
      long l1 = paramLong + i2;
      localnu = g;
      i1 = i3;
      paramLong = l1;
      if (l1 == b)
      {
        g = e;
        i1 = i3;
        paramLong = l1;
      }
    }
  }
  
  private final void a(nu paramnu)
  {
    if (!c) {
      return;
    }
    Object localObject = h;
    int i1 = c;
    int i3 = (int)(a - a) / b + i1;
    localObject = new tl[i3];
    for (int i2 = 0; i2 < i3; i2++)
    {
      localObject[i2] = d;
      paramnu = paramnu.a();
    }
    a.a((tl[])localObject);
  }
  
  private final void b(long paramLong)
  {
    for (;;)
    {
      nu localnu = g;
      if (paramLong < b) {
        break;
      }
      g = e;
    }
  }
  
  private final void c(long paramLong)
  {
    if (paramLong == -1L) {
      return;
    }
    nu localnu;
    for (;;)
    {
      localnu = f;
      if (paramLong < b) {
        break;
      }
      a.a(d);
      f = f.a();
    }
    if (g.a < a) {
      g = localnu;
    }
  }
  
  private final int d(int paramInt)
  {
    nu localnu1 = h;
    if (!c)
    {
      tl localtl = a.a();
      nu localnu2 = new nu(h.b, b);
      d = localtl;
      e = localnu2;
      c = true;
    }
    return Math.min(paramInt, (int)(h.b - m));
  }
  
  private final void e(int paramInt)
  {
    long l1 = m + paramInt;
    m = l1;
    nu localnu = h;
    if (l1 == b) {
      h = e;
    }
  }
  
  public final int a(by paramby, ez paramez, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong)
  {
    int i1 = c.a(paramby, paramez, paramBoolean1, paramBoolean2, paramBoolean3, i, d);
    if (i1 != -5)
    {
      if (i1 != -4)
      {
        if (i1 == -3) {
          return -3;
        }
        throw new IllegalStateException();
      }
      if (!paramez.c())
      {
        if (c < paramLong) {
          paramez.b(Integer.MIN_VALUE);
        }
        if (!paramez.f())
        {
          ns localns = d;
          if (paramez.g())
          {
            paramLong = b;
            paramby = e;
            i1 = 1;
            paramby.a(1);
            a(paramLong, e.a, 1);
            paramLong += 1L;
            int i2 = e.a[0];
            int i3;
            if ((i2 & 0x80) != 0) {
              i3 = 1;
            } else {
              i3 = 0;
            }
            i2 &= 0x7F;
            paramby = a;
            if (a == null) {
              a = new byte[16];
            }
            a(paramLong, a, i2);
            long l1 = paramLong + i2;
            paramLong = l1;
            if (i3 != 0)
            {
              e.a(2);
              a(l1, e.a, 2);
              paramLong = l1 + 2L;
              i1 = e.f();
            }
            Object localObject1 = a;
            Object localObject2 = b;
            if (localObject2 != null)
            {
              paramby = (by)localObject2;
              if (localObject2.length >= i1) {}
            }
            else
            {
              paramby = new int[i1];
            }
            localObject1 = c;
            if (localObject1 != null)
            {
              localObject2 = localObject1;
              if (localObject1.length >= i1) {}
            }
            else
            {
              localObject2 = new int[i1];
            }
            if (i3 != 0)
            {
              i3 = i1 * 6;
              e.a(i3);
              a(paramLong, e.a, i3);
              l1 = paramLong + i3;
              e.c(0);
              for (i3 = 0;; i3++)
              {
                paramLong = l1;
                if (i3 >= i1) {
                  break;
                }
                paramby[i3] = e.f();
                localObject2[i3] = e.p();
              }
            }
            paramby[0] = 0;
            localObject2[0] = (a - (int)(paramLong - b));
            localObject1 = c;
            ey localey = a;
            localey.a(i1, paramby, (int[])localObject2, b, a, a, c, d);
            l1 = b;
            i1 = (int)(paramLong - l1);
            b = (l1 + i1);
            a -= i1;
          }
          if (paramez.e())
          {
            e.a(4);
            a(b, e.a, 4);
            i1 = e.p();
            b += 4L;
            a -= 4;
            paramez.d(i1);
            a(b, b, i1);
            b += i1;
            i1 = a - i1;
            a = i1;
            paramby = d;
            if ((paramby == null) || (paramby.capacity() < i1)) {
              d = ByteBuffer.allocate(i1);
            }
            d.position(0);
            d.limit(i1);
            a(b, d, a);
          }
          else
          {
            paramez.d(a);
            a(b, b, a);
          }
        }
      }
      return -4;
    }
    i = c;
    return -5;
  }
  
  public final int a(fz paramfz, int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    paramInt = d(paramInt);
    nu localnu = h;
    paramInt = paramfz.a(d.a, localnu.a(m), paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    e(paramInt);
    return paramInt;
  }
  
  public final void a()
  {
    a(false);
  }
  
  public final void a(int paramInt)
  {
    c.b(paramInt);
  }
  
  public final void a(long paramLong)
  {
    if (l != paramLong)
    {
      l = paramLong;
      j = true;
    }
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, gl paramgl)
  {
    if (j) {
      a(k);
    }
    paramLong += l;
    if (n) {
      if (((paramInt1 & 0x1) != 0) && (c.a(paramLong))) {
        n = false;
      } else {
        return;
      }
    }
    long l1 = m;
    long l2 = paramInt2;
    long l3 = paramInt3;
    c.a(paramLong, paramInt1, l1 - l2 - l3, paramInt2, paramgl);
  }
  
  public final void a(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    c(c.b(paramLong, paramBoolean1, paramBoolean2));
  }
  
  public void a(bw parambw)
  {
    long l1 = l;
    bw localbw;
    if (parambw == null)
    {
      localbw = null;
    }
    else
    {
      if (l1 != 0L)
      {
        long l2 = m;
        if (l2 != Long.MAX_VALUE)
        {
          localbw = parambw.a(l2 + l1);
          break label52;
        }
      }
      localbw = parambw;
    }
    label52:
    boolean bool = c.b(localbw);
    k = parambw;
    j = false;
    parambw = o;
    if ((parambw != null) && (bool)) {
      parambw.i();
    }
  }
  
  public final void a(nx paramnx)
  {
    o = paramnx;
  }
  
  public final void a(vy paramvy, int paramInt)
  {
    while (paramInt > 0)
    {
      int i1 = d(paramInt);
      nu localnu = h;
      paramvy.a(d.a, localnu.a(m), i1);
      paramInt -= i1;
      e(i1);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    c.a(paramBoolean);
    a(f);
    nu localnu = new nu(0L, b);
    f = localnu;
    g = localnu;
    h = localnu;
    m = 0L;
    a.b();
  }
  
  public final int b(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    return c.a(paramLong, true, paramBoolean2);
  }
  
  public final void b()
  {
    n = true;
  }
  
  public final void b(int paramInt)
  {
    long l1 = c.a(paramInt);
    m = l1;
    if (l1 != 0L)
    {
      Object localObject1 = f;
      localObject2 = localObject1;
      if (l1 != a)
      {
        while (m > b) {
          localObject2 = e;
        }
        nu localnu1 = e;
        a(localnu1);
        nu localnu2 = new nu(b, b);
        e = localnu2;
        localObject1 = localObject2;
        if (m == b) {
          localObject1 = localnu2;
        }
        h = ((nu)localObject1);
        if (g == localnu1) {
          g = localnu2;
        }
        return;
      }
    }
    a(f);
    Object localObject2 = new nu(m, b);
    f = ((nu)localObject2);
    g = ((nu)localObject2);
    h = ((nu)localObject2);
  }
  
  public final int c()
  {
    return c.a();
  }
  
  public final boolean c(int paramInt)
  {
    return c.c(paramInt);
  }
  
  public final boolean d()
  {
    return c.e();
  }
  
  public final int e()
  {
    return c.b();
  }
  
  public final int f()
  {
    return c.c();
  }
  
  public final int g()
  {
    return c.d();
  }
  
  public final bw h()
  {
    return c.f();
  }
  
  public final long i()
  {
    return c.g();
  }
  
  public final boolean j()
  {
    return c.h();
  }
  
  public final long k()
  {
    return c.i();
  }
  
  public final void l()
  {
    c.j();
    g = f;
  }
  
  public final void m()
  {
    c(c.l());
  }
  
  public final void n()
  {
    c(c.m());
  }
  
  public final int o()
  {
    return c.k();
  }
  
  public final int p()
  {
    return c.a(i);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.nv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */