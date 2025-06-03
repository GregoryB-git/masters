package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import java.util.Arrays;

final class io
{
  private final gi a;
  private final boolean b;
  private final boolean c;
  private final SparseArray<vw> d;
  private final SparseArray<vx> e;
  private final wb f;
  private byte[] g;
  private int h;
  private int i;
  private long j;
  private boolean k;
  private long l;
  private ir m;
  private ir n;
  private boolean o;
  private long p;
  private long q;
  private boolean r;
  
  public io(gi paramgi, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramgi;
    b = paramBoolean1;
    c = paramBoolean2;
    d = new SparseArray();
    e = new SparseArray();
    m = new ir((byte)0);
    n = new ir((byte)0);
    paramgi = new byte[''];
    g = paramgi;
    f = new wb(paramgi, 0, 0);
    b();
  }
  
  public final void a(long paramLong1, int paramInt, long paramLong2)
  {
    i = paramInt;
    l = paramLong2;
    j = paramLong1;
    if (((b) && (paramInt == 1)) || ((c) && ((paramInt == 5) || (paramInt == 1) || (paramInt == 2))))
    {
      ir localir = m;
      m = n;
      n = localir;
      localir.a();
      h = 0;
      k = true;
    }
  }
  
  public final void a(vw paramvw)
  {
    d.append(d, paramvw);
  }
  
  public final void a(vx paramvx)
  {
    e.append(a, paramvx);
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!k) {
      return;
    }
    int i1 = paramInt2 - paramInt1;
    Object localObject = g;
    int i2 = localObject.length;
    paramInt2 = h;
    if (i2 < paramInt2 + i1) {
      g = Arrays.copyOf((byte[])localObject, paramInt2 + i1 << 1);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, g, h, i1);
    paramInt1 = h + i1;
    h = paramInt1;
    f.a(g, 0, paramInt1);
    if (!f.b(8)) {
      return;
    }
    f.a();
    int i3 = f.c(2);
    f.a(5);
    if (!f.c()) {
      return;
    }
    f.d();
    if (!f.c()) {
      return;
    }
    int i4 = f.d();
    if (!c)
    {
      k = false;
      n.a(i4);
      return;
    }
    if (!f.c()) {
      return;
    }
    int i5 = f.d();
    if (e.indexOfKey(i5) < 0)
    {
      k = false;
      return;
    }
    localObject = (vx)e.get(i5);
    paramArrayOfByte = (vw)d.get(b);
    if (h)
    {
      if (!f.b(2)) {
        return;
      }
      f.a(2);
    }
    if (!f.b(j)) {
      return;
    }
    int i6 = f.c(j);
    boolean bool1;
    if (!i)
    {
      if (!f.b(1)) {
        return;
      }
      bool1 = f.b();
      if (bool1)
      {
        if (!f.b(1)) {
          return;
        }
        bool2 = f.b();
        bool3 = true;
        break label388;
      }
    }
    else
    {
      bool1 = false;
    }
    boolean bool3 = false;
    boolean bool2 = false;
    label388:
    boolean bool4;
    if (i == 5) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    int i7;
    if (bool4)
    {
      if (!f.c()) {
        return;
      }
      i7 = f.d();
    }
    else
    {
      i7 = 0;
    }
    paramInt1 = k;
    if (paramInt1 == 0)
    {
      if (!f.b(l)) {
        return;
      }
      paramInt2 = f.c(l);
      if ((c) && (!bool1))
      {
        if (!f.c()) {
          return;
        }
        i2 = f.e();
        paramInt1 = 0;
        break label605;
      }
    }
    else
    {
      if ((paramInt1 == 1) && (!m))
      {
        if (!f.c()) {
          return;
        }
        i1 = f.e();
        if ((c) && (!bool1))
        {
          if (!f.c()) {
            return;
          }
          i8 = f.e();
          paramInt1 = 0;
          i2 = paramInt1;
          break label613;
        }
        paramInt1 = 0;
        i2 = paramInt1;
        i8 = i2;
        break label613;
      }
      paramInt2 = 0;
    }
    i2 = 0;
    paramInt1 = 0;
    label605:
    int i8 = paramInt1;
    i1 = paramInt1;
    paramInt1 = paramInt2;
    label613:
    n.a(paramArrayOfByte, i3, i4, i6, i5, bool1, bool3, bool2, bool4, i7, paramInt1, i2, i1, i8);
    k = false;
  }
  
  public final boolean a()
  {
    return c;
  }
  
  public final boolean a(long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = i;
    int i2 = 0;
    if ((i1 == 9) || ((c) && (ir.a(n, m))))
    {
      if ((paramBoolean1) && (o))
      {
        long l1 = j;
        i1 = (int)(paramLong - l1);
        int i3 = r;
        int i4 = (int)(l1 - p);
        a.a(q, i3, i4, paramInt + i1, null);
      }
      p = j;
      q = l;
      r = false;
      o = true;
    }
    if (b) {
      paramBoolean1 = n.b();
    } else {
      paramBoolean1 = paramBoolean2;
    }
    paramBoolean2 = r;
    i1 = i;
    if (i1 != 5)
    {
      paramInt = i2;
      if (paramBoolean1)
      {
        paramInt = i2;
        if (i1 != 1) {}
      }
    }
    else
    {
      paramInt = 1;
    }
    paramBoolean1 = paramBoolean2 | paramInt;
    r = paramBoolean1;
    return paramBoolean1;
  }
  
  public final void b()
  {
    k = false;
    o = false;
    n.a();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.io
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */