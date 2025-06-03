package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class je
  implements fw
{
  private final int a;
  private final List<wi> b;
  private final vy c;
  private final SparseIntArray d;
  private final jk e;
  private final SparseArray<jj> f;
  private final SparseBooleanArray g;
  private final SparseBooleanArray h;
  private final jf i;
  private jd j;
  private fy k;
  private int l;
  private boolean m;
  private boolean n;
  private boolean o;
  private jj p;
  private int q;
  private int r;
  
  public je()
  {
    this(0);
  }
  
  private je(int paramInt)
  {
    this(1, 0);
  }
  
  private je(int paramInt1, int paramInt2)
  {
    this(1, new wi(0L), new jk(paramInt2));
  }
  
  public je(int paramInt, wi paramwi, jk paramjk)
  {
    paramjk = (jk)rp.a(paramjk);
    e = paramjk;
    a = paramInt;
    if ((paramInt != 1) && (paramInt != 2))
    {
      localObject = new ArrayList();
      b = ((List)localObject);
      ((List)localObject).add(paramwi);
    }
    else
    {
      b = Collections.singletonList(paramwi);
    }
    c = new vy(new byte['Ⓒ'], 0);
    Object localObject = new SparseBooleanArray();
    g = ((SparseBooleanArray)localObject);
    h = new SparseBooleanArray();
    paramwi = new SparseArray();
    f = paramwi;
    d = new SparseIntArray();
    i = new jf();
    r = -1;
    ((SparseBooleanArray)localObject).clear();
    paramwi.clear();
    paramwi = paramjk.a();
    int i1 = paramwi.size();
    for (paramInt = 0; paramInt < i1; paramInt++) {
      f.put(paramwi.keyAt(paramInt), (jj)paramwi.valueAt(paramInt));
    }
    f.put(0, new iy(new jh(this)));
    p = null;
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    long l1 = paramfz.d();
    boolean bool = m;
    Object localObject1 = null;
    if (bool)
    {
      if ((l1 != -1L) && (a != 2)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i1 != 0) && (!i.a())) {
        return i.a(paramfz, paramgf, r);
      }
      if (!n)
      {
        n = true;
        if (i.b() != -9223372036854775807L)
        {
          localObject2 = new jd(i.c(), i.b(), l1, r);
          j = ((jd)localObject2);
          k.a(((fp)localObject2).a());
        }
        else
        {
          k.a(new gg(i.b()));
        }
      }
      if (o)
      {
        o = false;
        a(0L, 0L);
        if (paramfz.c() != 0L)
        {
          a = 0L;
          return 1;
        }
      }
      localObject2 = j;
      if ((localObject2 != null) && (((fp)localObject2).b())) {
        return j.a(paramfz, paramgf, null);
      }
    }
    paramgf = c;
    Object localObject2 = a;
    if (9400 - paramgf.d() < 188)
    {
      i1 = c.b();
      if (i1 > 0) {
        System.arraycopy(localObject2, c.d(), localObject2, 0, i1);
      }
      c.a((byte[])localObject2, i1);
    }
    while (c.b() < 188)
    {
      i1 = c.c();
      i2 = paramfz.a((byte[])localObject2, i1, 9400 - i1);
      if (i2 == -1)
      {
        i1 = 0;
        break label375;
      }
      c.b(i1 + i2);
    }
    int i1 = 1;
    label375:
    if (i1 == 0) {
      return -1;
    }
    int i3 = c.d();
    int i2 = c.c();
    i1 = h.a(c.a, i3, i2);
    c.c(i1);
    int i4 = i1 + 188;
    if (i4 > i2)
    {
      i1 = i1 - i3 + q;
      q = i1;
      if ((a == 2) && (i1 > 376)) {
        throw new ce("Cannot find sync byte. Most likely not a Transport Stream.");
      }
    }
    else
    {
      q = 0;
    }
    int i5 = c.c();
    if (i4 > i5) {
      return 0;
    }
    int i6 = c.l();
    if ((0x800000 & i6) != 0)
    {
      c.c(i4);
      return 0;
    }
    if ((0x400000 & i6) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    i3 = i1 | 0x0;
    int i7 = (0x1FFF00 & i6) >> 8;
    if ((i6 & 0x20) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if ((i6 & 0x10) != 0) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    paramfz = (fz)localObject1;
    if (i2 != 0) {
      paramfz = (jj)f.get(i7);
    }
    if (paramfz == null)
    {
      c.c(i4);
      return 0;
    }
    if (a != 2)
    {
      i2 = i6 & 0xF;
      i6 = d.get(i7, i2 - 1);
      d.put(i7, i2);
      if (i6 == i2)
      {
        c.c(i4);
        return 0;
      }
      if (i2 != (i6 + 1 & 0xF)) {
        paramfz.a();
      }
    }
    i2 = i3;
    if (i1 != 0)
    {
      i6 = c.e();
      if ((c.e() & 0x40) != 0) {
        i1 = 2;
      } else {
        i1 = 0;
      }
      i2 = i3 | i1;
      c.d(i6 - 1);
    }
    bool = m;
    if ((a != 2) && (!bool) && (h.get(i7, false))) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    if (i1 != 0)
    {
      c.b(i4);
      paramfz.a(c, i2);
      c.b(i5);
    }
    if ((a != 2) && (!bool) && (m) && (l1 != -1L)) {
      o = true;
    }
    c.c(i4);
    return 0;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    boolean bool;
    if (a != 2) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    int i1 = b.size();
    Object localObject;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject = (wi)b.get(i2);
      int i3;
      if (((wi)localObject).c() == -9223372036854775807L) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if ((i3 != 0) || ((((wi)localObject).c() != 0L) && (((wi)localObject).a() != paramLong2)))
      {
        ((wi)localObject).d();
        ((wi)localObject).a(paramLong2);
      }
    }
    if (paramLong2 != 0L)
    {
      localObject = j;
      if (localObject != null) {
        ((fp)localObject).a(paramLong2);
      }
    }
    c.a();
    d.clear();
    for (i2 = 0; i2 < f.size(); i2++) {
      ((jj)f.valueAt(i2)).a();
    }
    q = 0;
  }
  
  public final void a(fy paramfy)
  {
    k = paramfy;
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = c.a;
    paramfz.c(arrayOfByte, 0, 940);
    for (int i1 = 0; i1 < 188; i1++)
    {
      for (int i2 = 0; i2 < 5; i2++) {
        if (arrayOfByte[(i2 * 188 + i1)] != 71)
        {
          i2 = 0;
          break label65;
        }
      }
      i2 = 1;
      label65:
      if (i2 != 0)
      {
        paramfz.b(i1);
        return true;
      }
    }
    return false;
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.je
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */