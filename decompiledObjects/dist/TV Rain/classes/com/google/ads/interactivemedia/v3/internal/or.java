package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class or<T extends os>
  implements nw, nz, uo<ok>, us
{
  public final int a;
  public long b;
  public boolean c;
  private final int[] d;
  private final bw[] e;
  private final boolean[] f;
  private final T g;
  private final ny<or<T>> h;
  private final mu i;
  private final un j;
  private final um k;
  private final oo l;
  private final ArrayList<oi> m;
  private final List<oi> n;
  private final nv o;
  private final mh p;
  private final nv[] q;
  private final op r;
  private bw s;
  private ot<T> t;
  private long u;
  private long v;
  private int w;
  
  public or(int paramInt, int[] paramArrayOfInt, bw[] paramArrayOfbw, T paramT, ny<or<T>> paramny, tk paramtk, long paramLong, fj<?> paramfj, un paramun, mu parammu)
  {
    a = paramInt;
    d = paramArrayOfInt;
    e = paramArrayOfbw;
    g = paramT;
    h = paramny;
    i = parammu;
    j = paramun;
    k = new um("Loader:ChunkSampleStream");
    l = new oo();
    paramArrayOfbw = new ArrayList();
    m = paramArrayOfbw;
    n = Collections.unmodifiableList(paramArrayOfbw);
    int i1 = paramArrayOfInt.length;
    q = new nv[i1];
    f = new boolean[i1];
    int i2 = i1 + 1;
    paramArrayOfbw = new int[i2];
    paramT = new nv[i2];
    paramny = new nv(paramtk);
    o = paramny;
    p = new mh(paramny, paramfj);
    i2 = 0;
    paramArrayOfbw[0] = paramInt;
    paramT[0] = paramny;
    for (paramInt = i2; paramInt < i1; paramInt = i2)
    {
      paramny = new nv(paramtk);
      q[paramInt] = paramny;
      i2 = paramInt + 1;
      paramT[i2] = paramny;
      paramArrayOfbw[i2] = paramArrayOfInt[paramInt];
    }
    r = new op(paramArrayOfbw, paramT);
    u = paramLong;
    v = paramLong;
  }
  
  private final int a(int paramInt1, int paramInt2)
  {
    int i1;
    do
    {
      i1 = paramInt2 + 1;
      if (i1 >= m.size()) {
        break;
      }
      paramInt2 = i1;
    } while (((oi)m.get(i1)).a(0) <= paramInt1);
    return i1 - 1;
    return m.size() - 1;
  }
  
  private final boolean a(int paramInt)
  {
    oi localoi = (oi)m.get(paramInt);
    if (o.f() > localoi.a(0)) {
      return true;
    }
    paramInt = 0;
    int i1;
    int i2;
    do
    {
      nv[] arrayOfnv = q;
      if (paramInt >= arrayOfnv.length) {
        break;
      }
      i1 = arrayOfnv[paramInt].f();
      i2 = paramInt + 1;
      paramInt = i2;
    } while (i1 <= localoi.a(i2));
    return true;
    return false;
  }
  
  private final oi b(int paramInt)
  {
    oi localoi = (oi)m.get(paramInt);
    Object localObject = m;
    wl.a((List)localObject, paramInt, ((ArrayList)localObject).size());
    w = Math.max(w, m.size());
    localObject = o;
    paramInt = 0;
    ((nv)localObject).b(localoi.a(0));
    for (;;)
    {
      localObject = q;
      if (paramInt >= localObject.length) {
        break;
      }
      localObject = localObject[paramInt];
      paramInt++;
      ((nv)localObject).b(localoi.a(paramInt));
    }
    return localoi;
  }
  
  private final void h()
  {
    int i1 = a(o.f(), w - 1);
    for (;;)
    {
      int i2 = w;
      if (i2 > i1) {
        break;
      }
      w = (i2 + 1);
      oi localoi = (oi)m.get(i2);
      bw localbw = e;
      if (!localbw.equals(s)) {
        i.a(a, localbw, f, g, h);
      }
      s = localbw;
    }
  }
  
  private final oi i()
  {
    ArrayList localArrayList = m;
    return (oi)localArrayList.get(localArrayList.size() - 1);
  }
  
  public final int a(by paramby, ez paramez, boolean paramBoolean)
  {
    if (f()) {
      return -3;
    }
    h();
    return p.a(paramby, paramez, paramBoolean, c, b);
  }
  
  public final long a(long paramLong, cn paramcn)
  {
    return g.a(paramLong, paramcn);
  }
  
  public final oq a(long paramLong, int paramInt)
  {
    for (int i1 = 0; i1 < q.length; i1++) {
      if (d[i1] == paramInt)
      {
        rp.c(f[i1] ^ 0x1);
        f[i1] = true;
        q[i1].l();
        q[i1].b(paramLong, true, true);
        return new oq(this, this, q[i1], i1);
      }
    }
    throw new IllegalStateException();
  }
  
  public final T a()
  {
    return g;
  }
  
  public final void a(long paramLong)
  {
    if ((!k.b()) && (!f()))
    {
      int i1 = m.size();
      int i2 = g.a(paramLong, n);
      int i3 = i2;
      if (i1 <= i2) {
        return;
      }
      while (i3 < i1)
      {
        if (!a(i3)) {
          break label82;
        }
        i3++;
      }
      i3 = i1;
      label82:
      if (i3 == i1) {
        return;
      }
      paramLong = ii;
      oi localoi = b(i3);
      if (m.isEmpty()) {
        u = v;
      }
      c = false;
      i.a(a, h, paramLong);
    }
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    if (f()) {
      return;
    }
    int i1 = o.e();
    o.a(paramLong, paramBoolean, true);
    int i2 = o.e();
    if (i2 > i1)
    {
      paramLong = o.k();
      for (i1 = 0;; i1++)
      {
        nv[] arrayOfnv = q;
        if (i1 >= arrayOfnv.length) {
          break;
        }
        arrayOfnv[i1].a(paramLong, paramBoolean, f[i1]);
      }
    }
    i1 = Math.min(a(i2, 0), w);
    if (i1 > 0)
    {
      wl.a(m, 0, i1);
      w -= i1;
    }
  }
  
  public final void a(ot<T> paramot)
  {
    t = paramot;
    o.n();
    p.a();
    paramot = q;
    int i1 = paramot.length;
    for (int i2 = 0; i2 < i1; i2++) {
      paramot[i2].n();
    }
    k.a(this);
  }
  
  public final void b(long paramLong)
  {
    v = paramLong;
    if (f())
    {
      u = paramLong;
      return;
    }
    Object localObject1 = null;
    int i1 = 0;
    for (int i2 = 0;; i2++)
    {
      localObject2 = localObject1;
      if (i2 >= m.size()) {
        break;
      }
      localObject2 = (oi)m.get(i2);
      boolean bool1 = h < paramLong;
      if ((!bool1) && (a == -9223372036854775807L)) {
        break;
      }
      localObject2 = localObject1;
      if (bool1) {
        break;
      }
    }
    o.l();
    boolean bool2;
    if (localObject2 != null)
    {
      bool2 = o.c(((oi)localObject2).a(0));
      b = 0L;
    }
    else
    {
      localObject2 = o;
      if (paramLong < e()) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (((nv)localObject2).b(paramLong, true, bool2) != -1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      b = v;
    }
    if (bool2)
    {
      w = a(o.f(), 0);
      for (localObject1 : q)
      {
        ((nv)localObject1).l();
        ((nv)localObject1).b(paramLong, true, false);
      }
      return;
    }
    u = paramLong;
    c = false;
    m.clear();
    w = 0;
    if (k.b())
    {
      k.c();
      return;
    }
    o.a();
    Object localObject2 = q;
    int i3 = localObject2.length;
    for (i2 = i1; i2 < i3; i2++) {
      localObject2[i2].a();
    }
  }
  
  public final boolean b()
  {
    return (!f()) && (p.a(c));
  }
  
  public final int b_(long paramLong)
  {
    boolean bool = f();
    int i1 = 0;
    if (bool) {
      return 0;
    }
    int i2;
    if ((c) && (paramLong > o.i()))
    {
      i2 = o.o();
    }
    else
    {
      i2 = o.b(paramLong, true, true);
      if (i2 == -1) {
        i2 = i1;
      }
    }
    h();
    return i2;
  }
  
  public final void c()
    throws IOException
  {
    k.a();
    p.b();
    if (!k.b()) {
      g.a();
    }
  }
  
  public final boolean c(long paramLong)
  {
    boolean bool1 = c;
    int i1 = 0;
    if ((!bool1) && (!k.b()))
    {
      bool1 = f();
      long l1;
      if (bool1)
      {
        localObject1 = Collections.emptyList();
        l1 = u;
      }
      else
      {
        localObject1 = n;
        l1 = ii;
      }
      g.a(paramLong, l1, (List)localObject1, l);
      Object localObject2 = l;
      boolean bool2 = b;
      Object localObject1 = a;
      a = null;
      b = false;
      if (bool2)
      {
        u = -9223372036854775807L;
        c = true;
        return true;
      }
      if (localObject1 == null) {
        return false;
      }
      if ((localObject1 instanceof oi))
      {
        localObject2 = (oi)localObject1;
        if (bool1)
        {
          l1 = h;
          paramLong = u;
          if (l1 == paramLong) {
            i1 = 1;
          }
          if (i1 != 0) {
            paramLong = 0L;
          }
          b = paramLong;
          u = -9223372036854775807L;
        }
        ((oi)localObject2).a(r);
        m.add(localObject2);
      }
      paramLong = k.a((ut)localObject1, this, j.a(d));
      i.a(c, d, a, e, f, g, h, i, paramLong);
      return true;
    }
    return false;
  }
  
  public final long d()
  {
    if (c) {
      return Long.MIN_VALUE;
    }
    if (f()) {
      return u;
    }
    long l1 = v;
    Object localObject = i();
    if (!((ow)localObject).h()) {
      if (m.size() > 1)
      {
        localObject = m;
        localObject = (oi)((ArrayList)localObject).get(((ArrayList)localObject).size() - 2);
      }
      else
      {
        localObject = null;
      }
    }
    long l2 = l1;
    if (localObject != null) {
      l2 = Math.max(l1, i);
    }
    return Math.max(l2, o.i());
  }
  
  public final long e()
  {
    if (f()) {
      return u;
    }
    if (c) {
      return Long.MIN_VALUE;
    }
    return ii;
  }
  
  public final boolean f()
  {
    return u != -9223372036854775807L;
  }
  
  public final void g()
  {
    o.a();
    Object localObject = q;
    int i1 = localObject.length;
    for (int i2 = 0; i2 < i1; i2++) {
      localObject[i2].a();
    }
    localObject = t;
    if (localObject != null) {
      ((ot)localObject).a(this);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.or
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */