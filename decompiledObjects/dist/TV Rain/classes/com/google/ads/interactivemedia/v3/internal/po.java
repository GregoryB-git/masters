package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class po
  implements os
{
  private final ux a;
  private final int[] b;
  private final int c;
  private final tt d;
  private final long e;
  private final int f;
  private final px g;
  private final pr[] h;
  private sy i;
  private aaa j;
  private int k;
  private IOException l;
  private boolean m;
  private long n;
  
  public po(ux paramux, aaa paramaaa, int paramInt1, int[] paramArrayOfInt, sy paramsy, int paramInt2, tt paramtt, long paramLong, int paramInt3, boolean paramBoolean, List<bw> paramList, px parampx)
  {
    a = paramux;
    j = paramaaa;
    b = paramArrayOfInt;
    i = paramsy;
    c = paramInt2;
    d = paramtt;
    k = paramInt1;
    e = paramLong;
    f = paramInt3;
    g = parampx;
    paramLong = paramaaa.c(paramInt1);
    n = -9223372036854775807L;
    paramux = b();
    h = new pr[paramsy.g()];
    for (paramInt1 = 0; paramInt1 < h.length; paramInt1++)
    {
      paramaaa = (qc)paramux.get(paramsy.b(paramInt1));
      h[paramInt1] = new pr(paramLong, paramInt2, paramaaa, paramBoolean, paramList, parampx);
    }
  }
  
  private static long a(pr parampr, ow paramow, long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramow != null) {
      return paramow.g();
    }
    return wl.a(parampr.c(paramLong1), paramLong2, paramLong3);
  }
  
  private final ArrayList<qc> b()
  {
    List localList = j.a(k).c;
    ArrayList localArrayList = new ArrayList();
    int[] arrayOfInt = b;
    int i1 = arrayOfInt.length;
    for (int i2 = 0; i2 < i1; i2++) {
      localArrayList.addAll(getc);
    }
    return localArrayList;
  }
  
  public final int a(long paramLong, List<? extends ow> paramList)
  {
    if ((l == null) && (i.g() >= 2)) {
      return i.a(paramLong, paramList);
    }
    return paramList.size();
  }
  
  public final long a(long paramLong, cn paramcn)
  {
    for (pr localpr : h) {
      if (c != null)
      {
        long l1 = localpr.c(paramLong);
        long l2 = localpr.a(l1);
        if ((l2 < paramLong) && (l1 < localpr.b() - 1)) {
          l1 = localpr.a(l1 + 1L);
        } else {
          l1 = l2;
        }
        return wl.a(paramLong, paramcn, l2, l1);
      }
    }
    return paramLong;
  }
  
  public final void a()
    throws IOException
  {
    IOException localIOException = l;
    if (localIOException == null)
    {
      a.a();
      return;
    }
    throw localIOException;
  }
  
  public final void a(long paramLong1, long paramLong2, List<? extends ow> paramList, oo paramoo)
  {
    if (l != null) {
      return;
    }
    Object localObject1 = j;
    boolean bool1 = d;
    boolean bool2 = false;
    if ((bool1) && (n != -9223372036854775807L)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0) {
      l1 = n - paramLong1;
    } else {
      l1 = -9223372036854775807L;
    }
    long l2 = av.b(a);
    long l3 = av.b(j.a(k).b);
    localObject1 = g;
    if ((localObject1 != null) && (a.a(l3 + l2 + paramLong2))) {
      return;
    }
    if (e != 0L) {
      l3 = SystemClock.elapsedRealtime() + e;
    } else {
      l3 = System.currentTimeMillis();
    }
    l3 *= 1000L;
    bool1 = paramList.isEmpty();
    Object localObject2 = null;
    Object localObject3;
    if (bool1) {
      localObject3 = null;
    } else {
      localObject3 = (ow)paramList.get(paramList.size() - 1);
    }
    int i3 = i.g();
    localObject1 = new oz[i3];
    Object localObject4;
    for (int i1 = 0; i1 < i3; i1++)
    {
      localObject4 = h[i1];
      if (c == null)
      {
        localObject1[i1] = oz.a;
      }
      else
      {
        l2 = ((pr)localObject4).a(j, k, l3);
        l4 = ((pr)localObject4).b(j, k, l3);
        int i4 = i1;
        localObject5 = localObject1;
        long l5 = a((pr)localObject4, (ow)localObject3, paramLong2, l2, l4);
        if (l5 < l2) {
          localObject5[i4] = oz.a;
        } else {
          localObject5[i4] = new pq((pr)localObject4, l5, l4);
        }
      }
    }
    i.a(paramLong1, paramLong2 - paramLong1, l1, paramList, (oz[])localObject1);
    Object localObject5 = h[i.a()];
    localObject1 = a;
    Object localObject6;
    Object localObject7;
    if (localObject1 != null)
    {
      localObject4 = b;
      if (((on)localObject1).c() == null) {
        localObject1 = ((qc)localObject4).c();
      } else {
        localObject1 = null;
      }
      if (c == null) {
        localObject2 = ((qc)localObject4).d();
      }
      if ((localObject1 != null) || (localObject2 != null))
      {
        localObject6 = d;
        localObject3 = i.h();
        i1 = i.b();
        localObject7 = i.c();
        localObject4 = b.b;
        paramList = (List<? extends ow>)localObject2;
        if (localObject1 != null)
        {
          localObject2 = ((qd)localObject1).a((qd)localObject2, (String)localObject4);
          paramList = (List<? extends ow>)localObject2;
          if (localObject2 == null) {}
        }
        else
        {
          localObject1 = paramList;
        }
        a = new ox((tt)localObject6, new tx(((qd)localObject1).a((String)localObject4), a, b, b.f()), (bw)localObject3, i1, localObject7, a);
        return;
      }
    }
    l2 = pr.a((pr)localObject5);
    int i5 = l2 < -9223372036854775807L;
    if (i5 != 0) {
      bool2 = true;
    }
    if (((pr)localObject5).b() == 0)
    {
      b = bool2;
      return;
    }
    long l4 = ((pr)localObject5).a(j, k, l3);
    l3 = ((pr)localObject5).b(j, k, l3);
    if (j.d) {
      paramLong1 = ((pr)localObject5).b(l3);
    } else {
      paramLong1 = -9223372036854775807L;
    }
    n = paramLong1;
    long l1 = a((pr)localObject5, (ow)localObject3, paramLong2, l4, l3);
    if (l1 < l4)
    {
      l = new lq();
      return;
    }
    boolean bool3 = l1 < l3;
    if ((!bool3) && ((!m) || (bool3)))
    {
      if ((bool2) && (((pr)localObject5).a(l1) >= l2))
      {
        b = true;
        return;
      }
      int i2 = (int)Math.min(f, l3 - l1 + 1L);
      i3 = i2;
      if (i5 != 0) {
        for (;;)
        {
          i3 = i2;
          if (i2 <= 1) {
            break;
          }
          i3 = i2;
          if (((pr)localObject5).a(i2 + l1 - 1L) < l2) {
            break;
          }
          i2--;
        }
      }
      if (paramList.isEmpty()) {
        paramLong1 = paramLong2;
      } else {
        paramLong1 = -9223372036854775807L;
      }
      localObject2 = d;
      i2 = c;
      localObject6 = i.h();
      int i6 = i.b();
      localObject3 = i.c();
      localObject7 = b;
      l3 = ((pr)localObject5).a(l1);
      paramList = ((pr)localObject5).d(l1);
      localObject4 = b;
      if (a == null)
      {
        paramLong1 = ((pr)localObject5).b(l1);
        paramList = new pb((tt)localObject2, new tx(paramList.a((String)localObject4), a, b, ((qc)localObject7).f()), (bw)localObject6, i6, localObject3, l3, paramLong1, l1, i2, (bw)localObject6);
      }
      else
      {
        i2 = 1;
        i5 = 1;
        while (i2 < i3)
        {
          localObject1 = paramList.a(((pr)localObject5).d(i2 + l1), (String)localObject4);
          if (localObject1 == null) {
            break;
          }
          i5++;
          i2++;
          paramList = (List<? extends ow>)localObject1;
        }
        l2 = ((pr)localObject5).b(i5 + l1 - 1L);
        paramLong2 = pr.a((pr)localObject5);
        if ((paramLong2 == -9223372036854775807L) || (paramLong2 > l2)) {
          paramLong2 = -9223372036854775807L;
        }
        paramList = new ov((tt)localObject2, new tx(paramList.a((String)localObject4), a, b, ((qc)localObject7).f()), (bw)localObject6, i6, localObject3, l3, l2, paramLong1, paramLong2, l1, i5, -c, a);
      }
      a = paramList;
      return;
    }
    b = bool2;
  }
  
  public final void a(aaa paramaaa, int paramInt)
  {
    try
    {
      j = paramaaa;
      k = paramInt;
      long l1 = paramaaa.c(paramInt);
      ArrayList localArrayList = b();
      for (paramInt = 0; paramInt < h.length; paramInt++)
      {
        qc localqc = (qc)localArrayList.get(i.b(paramInt));
        paramaaa = h;
        paramaaa[paramInt] = paramaaa[paramInt].a(l1, localqc);
      }
      return;
    }
    catch (lq paramaaa)
    {
      l = paramaaa;
    }
  }
  
  public final void a(ok paramok)
  {
    if ((paramok instanceof ox))
    {
      localObject = (ox)paramok;
      int i1 = i.a(e);
      pr localpr = h[i1];
      if (c == null)
      {
        localObject = a.b();
        if (localObject != null) {
          h[i1] = localpr.a(new ug((fv)localObject, b.c));
        }
      }
    }
    Object localObject = g;
    if (localObject != null) {
      a.b(paramok);
    }
  }
  
  public final void a(sy paramsy)
  {
    i = paramsy;
  }
  
  public final boolean a(ok paramok, boolean paramBoolean, Exception paramException, long paramLong)
  {
    if (!paramBoolean) {
      return false;
    }
    px localpx = g;
    if ((localpx != null) && (a.a(paramok))) {
      return true;
    }
    if ((!j.d) && ((paramok instanceof ow)) && ((paramException instanceof ul)) && (a == 404))
    {
      paramException = h[i.a(e)];
      int i1 = paramException.b();
      if ((i1 != -1) && (i1 != 0))
      {
        long l1 = paramException.a();
        long l2 = i1;
        if (((ow)paramok).g() > l1 + l2 - 1L)
        {
          m = true;
          return true;
        }
      }
    }
    if (paramLong != -9223372036854775807L)
    {
      paramException = i;
      if (paramException.a(paramException.a(e), paramLong)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.po
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */