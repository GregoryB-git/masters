package v3;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import r5.h;
import v5.m;
import z4.c;
import z4.c0;
import z4.j0;
import z4.k;
import z4.r;
import z4.s;
import z4.t;
import z4.t.b;

public final class q0
{
  public final r a;
  public final Object b;
  public final c0[] c;
  public boolean d;
  public boolean e;
  public r0 f;
  public boolean g;
  public final boolean[] h;
  public final k1[] i;
  public final r5.o j;
  public final z0 k;
  public q0 l;
  public j0 m;
  public r5.p n;
  public long o;
  
  public q0(k1[] paramArrayOfk1, long paramLong, r5.o paramo, t5.b paramb, z0 paramz0, r0 paramr0, r5.p paramp)
  {
    i = paramArrayOfk1;
    o = paramLong;
    j = paramo;
    k = paramz0;
    paramo = a;
    b = a;
    f = paramr0;
    m = j0.d;
    n = paramp;
    c = new c0[paramArrayOfk1.length];
    h = new boolean[paramArrayOfk1.length];
    long l1 = b;
    paramLong = d;
    paramz0.getClass();
    paramArrayOfk1 = a;
    int i1 = a.e;
    paramr0 = (Pair)paramArrayOfk1;
    paramArrayOfk1 = first;
    paramo = paramo.b(second);
    paramArrayOfk1 = (z0.c)d.get(paramArrayOfk1);
    paramArrayOfk1.getClass();
    g.add(paramArrayOfk1);
    paramr0 = (z0.b)f.get(paramArrayOfk1);
    if (paramr0 != null) {
      a.b(b);
    }
    c.add(paramo);
    paramo = a.F(paramo, paramb, l1);
    c.put(paramo, paramArrayOfk1);
    paramz0.d();
    paramArrayOfk1 = paramo;
    if (paramLong != -9223372036854775807L) {
      paramArrayOfk1 = new c(paramo, true, 0L, paramLong);
    }
    a = paramArrayOfk1;
  }
  
  public final long a(r5.p paramp, long paramLong, boolean paramBoolean, boolean[] paramArrayOfBoolean)
  {
    for (int i1 = 0;; i1++)
    {
      int i2 = a;
      int i3 = 1;
      if (i1 >= i2) {
        break;
      }
      localObject = h;
      if ((paramBoolean) || (!paramp.a(n, i1))) {
        i3 = 0;
      }
      localObject[i1] = i3;
    }
    Object localObject = c;
    for (i1 = 0;; i1++)
    {
      k1[] arrayOfk1 = i;
      if (i1 >= arrayOfk1.length) {
        break;
      }
      if (a == -2) {
        localObject[i1] = null;
      }
    }
    b();
    n = paramp;
    c();
    paramLong = a.i(c, h, c, paramArrayOfBoolean, paramLong);
    paramArrayOfBoolean = c;
    for (i1 = 0;; i1++)
    {
      localObject = i;
      if (i1 >= localObject.length) {
        break;
      }
      if ((a == -2) && (n.b(i1))) {
        paramArrayOfBoolean[i1] = new k();
      }
    }
    e = false;
    for (i1 = 0;; i1++)
    {
      paramArrayOfBoolean = c;
      if (i1 >= paramArrayOfBoolean.length) {
        break;
      }
      if (paramArrayOfBoolean[i1] != null)
      {
        x6.b.H(paramp.b(i1));
        if (i[i1]).a != -2) {
          e = true;
        }
      }
      else
      {
        if (c[i1] == null) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        x6.b.H(paramBoolean);
      }
    }
    return paramLong;
  }
  
  public final void b()
  {
    Object localObject = l;
    int i1 = 0;
    int i2;
    if (localObject == null) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (i2 == 0) {
      return;
    }
    for (;;)
    {
      localObject = n;
      if (i1 >= a) {
        break;
      }
      boolean bool = ((r5.p)localObject).b(i1);
      localObject = n.c[i1];
      if ((bool) && (localObject != null)) {
        ((h)localObject).g();
      }
      i1++;
    }
  }
  
  public final void c()
  {
    Object localObject = l;
    int i1 = 0;
    int i2;
    if (localObject == null) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (i2 == 0) {
      return;
    }
    for (;;)
    {
      localObject = n;
      if (i1 >= a) {
        break;
      }
      boolean bool = ((r5.p)localObject).b(i1);
      localObject = n.c[i1];
      if ((bool) && (localObject != null)) {
        ((h)localObject).m();
      }
      i1++;
    }
  }
  
  public final long d()
  {
    if (!d) {
      return f.b;
    }
    long l1;
    if (e) {
      l1 = a.g();
    } else {
      l1 = Long.MIN_VALUE;
    }
    long l2 = l1;
    if (l1 == Long.MIN_VALUE) {
      l2 = f.e;
    }
    return l2;
  }
  
  public final long e()
  {
    return f.b + o;
  }
  
  public final void f()
  {
    b();
    z0 localz0 = k;
    Object localObject1 = a;
    Object localObject2 = localObject1;
    try
    {
      if ((localObject1 instanceof c)) {
        localObject2 = a;
      }
      localObject1 = (z0.c)c.remove(localObject2);
      localObject1.getClass();
      a.g((r)localObject2);
      c.remove(a);
      if (!c.isEmpty()) {
        localz0.d();
      }
      localz0.e((z0.c)localObject1);
    }
    catch (RuntimeException localRuntimeException)
    {
      m.d("MediaPeriodHolder", "Period release failed.", localRuntimeException);
    }
  }
  
  public final r5.p g(float paramFloat, r1 paramr1)
  {
    r5.o localo = j;
    k1[] arrayOfk1 = i;
    Object localObject = m;
    paramr1 = f.a;
    paramr1 = localo.c(arrayOfk1, (j0)localObject);
    for (arrayOfk1 : c) {
      if (arrayOfk1 != null) {
        arrayOfk1.r(paramFloat);
      }
    }
    return paramr1;
  }
  
  public final void h()
  {
    Object localObject = a;
    if ((localObject instanceof c))
    {
      long l1 = f.d;
      long l2 = l1;
      if (l1 == -9223372036854775807L) {
        l2 = Long.MIN_VALUE;
      }
      localObject = (c)localObject;
      e = 0L;
      f = l2;
    }
  }
}

/* Location:
 * Qualified Name:     v3.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */