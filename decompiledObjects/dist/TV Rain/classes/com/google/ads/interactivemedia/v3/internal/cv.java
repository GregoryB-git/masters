package com.google.ads.interactivemedia.v3.internal;

import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class cv
  implements ci, dm, dn, mv, tp, wx, xa
{
  private final CopyOnWriteArraySet<da> a;
  private final vh b;
  private final cw c;
  private final cx d;
  private cf e;
  
  public cv(vh paramvh)
  {
    b = ((vh)rp.a(paramvh));
    a = new CopyOnWriteArraySet();
    d = new cx();
    c = new cw();
  }
  
  private final cz a(cr paramcr, int paramInt, mt parammt)
  {
    if (paramcr.a()) {
      parammt = null;
    }
    long l1 = b.a();
    cr localcr = e.l();
    int i = 1;
    int j;
    if ((paramcr == localcr) && (paramInt == e.e())) {
      j = 1;
    } else {
      j = 0;
    }
    long l2 = 0L;
    if ((parammt != null) && (parammt.a()))
    {
      if ((j != 0) && (e.i() == b) && (e.j() == c)) {
        j = i;
      } else {
        j = 0;
      }
      if (j != 0) {
        l2 = e.g();
      }
    }
    else if (j != 0)
    {
      l2 = e.k();
    }
    else if (!paramcr.a())
    {
      l2 = av.a(ac, 0L).g);
    }
    return new cz(l1, paramcr, paramInt, parammt, l2, e.g(), e.h());
  }
  
  private final cz a(cy paramcy)
  {
    rp.a(e);
    cy localcy = paramcy;
    if (paramcy == null)
    {
      int i = e.e();
      localcy = d.a(i);
      if (localcy == null)
      {
        paramcy = e.l();
        int j;
        if (i < paramcy.b()) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {
          paramcy = cr.a;
        }
        return a(paramcy, i, null);
      }
    }
    return a(b, c, a);
  }
  
  private final cz d(int paramInt, mt parammt)
  {
    rp.a(e);
    if (parammt != null)
    {
      cy localcy = d.a(parammt);
      if (localcy != null) {
        return a(localcy);
      }
      return a(cr.a, paramInt, parammt);
    }
    parammt = e.l();
    int i;
    if (paramInt < parammt.b()) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      parammt = cr.a;
    }
    return a(parammt, paramInt, null);
  }
  
  private final cz e()
  {
    return a(d.b());
  }
  
  private final cz f()
  {
    return a(d.a());
  }
  
  private final cz g()
  {
    return a(d.c());
  }
  
  public final void a()
  {
    if (d.e())
    {
      d.h();
      cz localcz = f();
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext()) {
        ((da)localIterator.next()).b(localcz);
      }
    }
  }
  
  public final void a(int paramInt)
  {
    d.f();
    f();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).b(paramInt);
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramInt1, paramInt2);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramInt1, paramInt2, paramInt3, paramFloat);
    }
  }
  
  public final void a(int paramInt, long paramLong)
  {
    cz localcz = e();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramInt, paramLong);
    }
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).b(localcz, paramInt, paramLong1, paramLong2);
    }
  }
  
  public final void a(int paramInt, mt parammt)
  {
    d.a(paramInt, parammt);
    cz localcz = d(paramInt, parammt);
    parammt = a.iterator();
    while (parammt.hasNext()) {
      ((da)parammt.next()).c(localcz);
    }
  }
  
  public final void a(int paramInt, mt parammt, ng paramng)
  {
    parammt = d(paramInt, parammt);
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).b(parammt, paramng);
    }
  }
  
  public final void a(int paramInt, mt parammt, nh paramnh, ng paramng)
  {
    cz localcz = d(paramInt, parammt);
    parammt = a.iterator();
    while (parammt.hasNext()) {
      ((da)parammt.next()).a(localcz, paramnh, paramng);
    }
  }
  
  public final void a(int paramInt, mt parammt, nh paramnh, ng paramng, IOException paramIOException, boolean paramBoolean)
  {
    parammt = d(paramInt, parammt);
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(parammt, paramnh, paramng, paramIOException, paramBoolean);
    }
  }
  
  public final void a(Surface paramSurface)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramSurface);
    }
  }
  
  public final void a(ba paramba)
  {
    cz localcz = e();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramba);
    }
  }
  
  public final void a(bw parambw)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, 2, parambw);
    }
  }
  
  public final void a(cf paramcf)
  {
    boolean bool;
    if ((e != null) && (!cx.a(d).isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    rp.c(bool);
    e = ((cf)rp.a(paramcf));
  }
  
  public final void a(cg paramcg)
  {
    cz localcz = f();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramcg);
    }
  }
  
  public final void a(cr paramcr, int paramInt)
  {
    d.a(paramcr);
    cz localcz = f();
    paramcr = a.iterator();
    while (paramcr.hasNext()) {
      ((da)paramcr.next()).a(localcz, paramInt);
    }
  }
  
  public final void a(da paramda)
  {
    a.add(paramda);
  }
  
  public final void a(fa paramfa)
  {
    cz localcz = f();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, 2, paramfa);
    }
  }
  
  public final void a(of paramof, td paramtd)
  {
    cz localcz = f();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramof, paramtd);
    }
  }
  
  public final void a(String paramString, long paramLong1, long paramLong2)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, 2, paramString, paramLong2);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    cz localcz = f();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramBoolean);
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    f();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(paramInt);
    }
  }
  
  public final void b()
  {
    if (!d.e())
    {
      cz localcz = f();
      d.g();
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext()) {
        ((da)localIterator.next()).a(localcz);
      }
    }
  }
  
  public final void b(int paramInt)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).b(localcz, paramInt);
    }
  }
  
  public final void b(int paramInt, long paramLong1, long paramLong2)
  {
    cz localcz = a(d.d());
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, paramInt, paramLong1, paramLong2);
    }
  }
  
  public final void b(int paramInt, mt parammt)
  {
    cz localcz = d(paramInt, parammt);
    if (d.b(parammt))
    {
      parammt = a.iterator();
      while (parammt.hasNext()) {
        ((da)parammt.next()).d(localcz);
      }
    }
  }
  
  public final void b(int paramInt, mt parammt, ng paramng)
  {
    parammt = d(paramInt, parammt);
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(parammt, paramng);
    }
  }
  
  public final void b(int paramInt, mt parammt, nh paramnh, ng paramng)
  {
    parammt = d(paramInt, parammt);
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).b(parammt, paramnh, paramng);
    }
  }
  
  public final void b(bw parambw)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, 1, parambw);
    }
  }
  
  public final void b(da paramda)
  {
    a.remove(paramda);
  }
  
  public final void b(fa paramfa)
  {
    cz localcz = e();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).b(localcz, 2, paramfa);
    }
  }
  
  public final void b(String paramString, long paramLong1, long paramLong2)
  {
    cz localcz = g();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, 1, paramString, paramLong2);
    }
  }
  
  public final void c()
  {
    ArrayList localArrayList = new ArrayList(cx.a(d));
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = localArrayList.get(j);
      j++;
      localObject = (cy)localObject;
      b(c, a);
    }
  }
  
  public final void c(int paramInt, mt parammt)
  {
    d.c(parammt);
    cz localcz = d(paramInt, parammt);
    parammt = a.iterator();
    while (parammt.hasNext()) {
      ((da)parammt.next()).e(localcz);
    }
  }
  
  public final void c(int paramInt, mt parammt, nh paramnh, ng paramng)
  {
    parammt = d(paramInt, parammt);
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).c(parammt, paramnh, paramng);
    }
  }
  
  public final void c(fa paramfa)
  {
    cz localcz = f();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).a(localcz, 1, paramfa);
    }
  }
  
  public final void d() {}
  
  public final void d(fa paramfa)
  {
    cz localcz = e();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((da)localIterator.next()).b(localcz, 1, paramfa);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */