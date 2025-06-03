package v3;

import a5.a.a;
import android.util.Pair;
import o7.t;
import o7.t.a;
import v5.k;
import x0.g;
import x6.b;
import z4.s;
import z4.t.b;

public final class s0
{
  public final r1.b a;
  public final r1.c b;
  public final w3.a c;
  public final k d;
  public long e;
  public int f;
  public boolean g;
  public q0 h;
  public q0 i;
  public q0 j;
  public int k;
  public Object l;
  public long m;
  
  public s0(w3.a parama, k paramk)
  {
    c = parama;
    d = paramk;
    a = new r1.b();
    b = new r1.c();
  }
  
  public static t.b m(r1 paramr1, Object paramObject, long paramLong1, long paramLong2, r1.c paramc, r1.b paramb)
  {
    paramr1.g(paramObject, paramb);
    paramr1.m(c, paramc);
    int i1;
    for (int n = paramr1.b(paramObject); d == 0L; n = i1)
    {
      a5.a locala = o;
      if ((b <= 0) || (!paramb.g(e)) || (paramb.c(0L) != -1)) {
        break;
      }
      i1 = n + 1;
      if (n >= x) {
        break;
      }
      paramr1.f(i1, paramb, true);
      paramObject = b;
      paramObject.getClass();
    }
    paramr1.g(paramObject, paramb);
    n = paramb.c(paramLong1);
    if (n == -1) {
      return new t.b(paramObject, paramb.b(paramLong1), paramLong2);
    }
    return new t.b(paramObject, n, paramb.f(n), paramLong2);
  }
  
  public final q0 a()
  {
    q0 localq0 = h;
    if (localq0 == null) {
      return null;
    }
    if (localq0 == i) {
      i = l;
    }
    localq0.f();
    int n = k - 1;
    k = n;
    if (n == 0)
    {
      j = null;
      localq0 = h;
      l = b;
      m = f.a.d;
    }
    h = h.l;
    k();
    return h;
  }
  
  public final void b()
  {
    if (k == 0) {
      return;
    }
    q0 localq0 = h;
    b.K(localq0);
    l = b;
    m = f.a.d;
    while (localq0 != null)
    {
      localq0.f();
      localq0 = l;
    }
    h = null;
    j = null;
    i = null;
    k = 0;
    k();
  }
  
  public final r0 c(r1 paramr1, q0 paramq0, long paramLong)
  {
    r0 localr0 = f;
    long l1 = o + e - paramLong;
    boolean bool1 = g;
    paramLong = 0L;
    Object localObject2;
    long l3;
    if (bool1)
    {
      n = paramr1.b(a.a);
      localObject1 = a;
      localObject2 = b;
      i1 = f;
      boolean bool2 = g;
      bool1 = true;
      n = paramr1.d(n, (r1.b)localObject1, (r1.c)localObject2, i1, bool2);
      if (n == -1) {
        return null;
      }
      i1 = fa, bool1).c;
      localObject1 = a.b;
      localObject1.getClass();
      long l2 = a.d;
      if (mb).w == n)
      {
        localObject2 = paramr1.j(b, a, i1, -9223372036854775807L, Math.max(0L, l1));
        if (localObject2 == null) {
          return null;
        }
        localObject1 = first;
        l3 = ((Long)second).longValue();
        paramq0 = l;
        if ((paramq0 != null) && (b.equals(localObject1)))
        {
          paramLong = f.a.d;
        }
        else
        {
          paramLong = e;
          e = (1L + paramLong);
        }
        l1 = -9223372036854775807L;
        paramq0 = (q0)localObject1;
        l2 = paramLong;
        paramLong = l3;
        l3 = l1;
      }
      else
      {
        l3 = 0L;
        paramq0 = (q0)localObject1;
      }
      localObject1 = m(paramr1, paramq0, paramLong, l2, b, a);
      l2 = paramLong;
      if (l3 != -9223372036854775807L)
      {
        l2 = paramLong;
        if (c != -9223372036854775807L)
        {
          if (ga.a, a).o.b > 0)
          {
            paramq0 = a;
            if (paramq0.g(o.e)) {}
          }
          else
          {
            bool1 = false;
          }
          if ((((s)localObject1).a()) && (bool1))
          {
            l3 = c;
            l2 = paramLong;
          }
          else
          {
            l2 = paramLong;
            if (bool1) {
              l2 = c;
            }
          }
        }
      }
      return d(paramr1, (t.b)localObject1, l3, l2);
    }
    int n = 1;
    paramq0 = a;
    paramr1.g(a, a);
    if (paramq0.a())
    {
      i1 = b;
      n = a.o.a(i1).b;
      if (n == -1) {
        return null;
      }
      localObject1 = a;
      i2 = c;
      i2 = o.a(i1).a(i2);
      if (i2 < n) {
        return e(paramr1, a, i1, i2, c, d);
      }
      l3 = c;
      paramLong = l3;
      if (l3 == -9223372036854775807L)
      {
        localObject2 = b;
        localObject1 = a;
        localObject1 = paramr1.j((r1.c)localObject2, (r1.b)localObject1, c, -9223372036854775807L, Math.max(0L, l1));
        if (localObject1 == null) {
          return null;
        }
        paramLong = ((Long)second).longValue();
      }
      l3 = g(paramr1, a, b);
      return f(paramr1, a, Math.max(l3, paramLong), c, d);
    }
    int i1 = a.f(e);
    if ((!a.g(e)) || (a.e(e, i1) != 3)) {
      n = 0;
    }
    Object localObject1 = a;
    int i2 = e;
    if ((i1 != o.a(i2).b) && (n == 0)) {
      return e(paramr1, a, e, i1, e, d);
    }
    paramLong = g(paramr1, a, e);
    return f(paramr1, a, paramLong, e, d);
  }
  
  public final r0 d(r1 paramr1, t.b paramb, long paramLong1, long paramLong2)
  {
    paramr1.g(a, a);
    boolean bool = paramb.a();
    Object localObject = a;
    if (bool) {
      return e(paramr1, localObject, b, c, paramLong1, d);
    }
    return f(paramr1, localObject, paramLong2, paramLong1, d);
  }
  
  public final r0 e(r1 paramr1, Object paramObject, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    t.b localb = new t.b(paramObject, paramInt1, paramInt2, paramLong2);
    long l1 = paramr1.g(paramObject, a).a(paramInt1, paramInt2);
    if (paramInt2 == a.f(paramInt1)) {
      paramLong2 = a.o.c;
    } else {
      paramLong2 = 0L;
    }
    boolean bool = a.g(paramInt1);
    if ((l1 != -9223372036854775807L) && (paramLong2 >= l1)) {
      paramLong2 = Math.max(0L, l1 - 1L);
    }
    return new r0(localb, paramLong2, paramLong1, -9223372036854775807L, l1, bool, false, false, false);
  }
  
  public final r0 f(r1 paramr1, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = paramLong1;
    paramr1.g(paramObject, a);
    int n = a.b(l1);
    r1.b localb = a;
    int i1 = 0;
    Object localObject;
    if (n == -1)
    {
      localObject = o;
      if ((b <= 0) || (!localb.g(e))) {
        break label195;
      }
    }
    else
    {
      if (!localb.g(n)) {
        break label195;
      }
      paramLong1 = a.d(n);
      localObject = a;
      if (paramLong1 != d) {
        break label195;
      }
      localObject = o.a(n);
      if (b == -1)
      {
        i2 = 1;
      }
      else
      {
        for (i2 = 0;; i2++)
        {
          if (i2 >= b) {
            break label176;
          }
          int i3 = e[i2];
          if ((i3 == 0) || (i3 == 1)) {
            break;
          }
        }
        label176:
        i2 = 0;
      }
      if ((i2 ^ 0x1) == 0) {
        break label195;
      }
      n = -1;
    }
    int i2 = 1;
    break label198;
    label195:
    i2 = 0;
    label198:
    paramObject = new t.b(paramObject, n, paramLong3);
    boolean bool1;
    if ((!((s)paramObject).a()) && (n == -1)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2 = j(paramr1, (t.b)paramObject);
    boolean bool3 = i(paramr1, (t.b)paramObject, bool1);
    boolean bool4;
    if ((n != -1) && (a.g(n))) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    if (n != -1)
    {
      paramLong1 = a.d(n);
    }
    else
    {
      if (i2 == 0) {
        break label313;
      }
      paramLong1 = a.d;
    }
    break label317;
    label313:
    paramLong1 = -9223372036854775807L;
    label317:
    if ((paramLong1 != -9223372036854775807L) && (paramLong1 != Long.MIN_VALUE)) {
      paramLong3 = paramLong1;
    } else {
      paramLong3 = a.d;
    }
    long l2 = l1;
    if (paramLong3 != -9223372036854775807L)
    {
      l2 = l1;
      if (l1 >= paramLong3)
      {
        if (!bool3)
        {
          n = i1;
          if (i2 != 0) {}
        }
        else
        {
          n = 1;
        }
        l2 = Math.max(0L, paramLong3 - n);
      }
    }
    return new r0((t.b)paramObject, l2, paramLong2, paramLong1, paramLong3, bool4, bool1, bool2, bool3);
  }
  
  public final long g(r1 paramr1, Object paramObject, int paramInt)
  {
    paramr1.g(paramObject, a);
    long l1 = a.d(paramInt);
    if (l1 == Long.MIN_VALUE) {
      return a.d;
    }
    return l1 + a.o.a(paramInt).o;
  }
  
  public final r0 h(r1 paramr1, r0 paramr0)
  {
    t.b localb = a;
    boolean bool1;
    if ((!localb.a()) && (e == -1)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2 = j(paramr1, localb);
    boolean bool3 = i(paramr1, localb, bool1);
    paramr1.g(a.a, a);
    int n;
    if (!localb.a())
    {
      n = e;
      if (n != -1)
      {
        l1 = a.d(n);
        break label104;
      }
    }
    long l1 = -9223372036854775807L;
    label104:
    long l2;
    if (localb.a()) {
      l2 = a.a(b, c);
    } else if ((l1 != -9223372036854775807L) && (l1 != Long.MIN_VALUE)) {
      l2 = l1;
    } else {
      l2 = a.d;
    }
    boolean bool4;
    if (localb.a())
    {
      bool4 = a.g(b);
    }
    else
    {
      n = e;
      if ((n != -1) && (a.g(n))) {
        bool4 = true;
      } else {
        bool4 = false;
      }
    }
    return new r0(localb, b, c, l1, l2, bool4, bool1, bool2, bool3);
  }
  
  public final boolean i(r1 paramr1, t.b paramb, boolean paramBoolean)
  {
    int n = paramr1.b(a);
    paramb = a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!mfc, b).q)
    {
      if (paramr1.d(n, a, b, f, g) == -1) {
        n = 1;
      } else {
        n = 0;
      }
      bool2 = bool1;
      if (n != 0)
      {
        bool2 = bool1;
        if (paramBoolean) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final boolean j(r1 paramr1, t.b paramb)
  {
    boolean bool1 = paramb.a();
    boolean bool2 = true;
    if ((!bool1) && (e == -1)) {
      n = 1;
    } else {
      n = 0;
    }
    if (n == 0) {
      return false;
    }
    int i1 = ga, a).c;
    int n = paramr1.b(a);
    if (mb).x != n) {
      bool2 = false;
    }
    return bool2;
  }
  
  public final void k()
  {
    Object localObject = t.b;
    t.a locala = new t.a();
    for (localObject = h; localObject != null; localObject = l) {
      locala.c(f.a);
    }
    localObject = i;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = f.a;
    }
    d.e(new g(this, locala, localObject, 2));
  }
  
  public final boolean l(q0 paramq0)
  {
    boolean bool1 = false;
    if (paramq0 != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.H(bool2);
    if (paramq0.equals(j)) {
      return false;
    }
    j = paramq0;
    boolean bool2 = bool1;
    for (;;)
    {
      paramq0 = l;
      if (paramq0 == null) {
        break;
      }
      if (paramq0 == i)
      {
        i = h;
        bool2 = true;
      }
      paramq0.f();
      k -= 1;
    }
    paramq0 = j;
    if (l != null)
    {
      paramq0.b();
      l = null;
      paramq0.c();
    }
    k();
    return bool2;
  }
  
  public final t.b n(r1 paramr1, Object paramObject, long paramLong)
  {
    Object localObject1 = paramObject;
    int n = ga).c;
    Object localObject2 = l;
    long l1;
    if (localObject2 != null)
    {
      i1 = paramr1.b(localObject2);
      if ((i1 != -1) && (fa, false).c == n)) {
        l1 = m;
      }
    }
    for (;;)
    {
      break;
      for (localObject2 = h; localObject2 != null; localObject2 = l) {
        if (b.equals(paramObject)) {
          break label153;
        }
      }
      for (localObject2 = h;; localObject2 = l)
      {
        if (localObject2 == null) {
          break label179;
        }
        i1 = paramr1.b(b);
        if ((i1 != -1) && (fa, false).c == n))
        {
          label153:
          l1 = f.a.d;
          break;
        }
      }
      label179:
      long l2 = e;
      e = (1L + l2);
      l1 = l2;
      if (h == null)
      {
        l = localObject1;
        m = l2;
        l1 = l2;
      }
    }
    paramr1.g(paramObject, a);
    paramr1.m(a.c, b);
    int i1 = paramr1.b(paramObject);
    n = 0;
    paramObject = localObject1;
    for (;;)
    {
      localObject2 = paramObject;
      if (i1 < b.w) {
        break;
      }
      localObject2 = a;
      int i2 = 1;
      paramr1.f(i1, (r1.b)localObject2, true);
      localObject2 = a;
      if (o.b <= 0) {
        i2 = 0;
      }
      n |= i2;
      if (((r1.b)localObject2).c(d) != -1)
      {
        paramObject = a.b;
        paramObject.getClass();
      }
      if (n != 0)
      {
        localObject2 = paramObject;
        if (i2 == 0) {
          break;
        }
        if (a.d != 0L)
        {
          localObject2 = paramObject;
          break;
        }
      }
      i1--;
    }
    return m(paramr1, localObject2, paramLong, l1, b, a);
  }
  
  public final boolean o(r1 paramr1)
  {
    q0 localq01 = h;
    if (localq01 == null) {
      return true;
    }
    int n = paramr1.b(b);
    q0 localq02;
    for (;;)
    {
      n = paramr1.d(n, a, b, f, g);
      for (localq02 = localq01;; localq02 = localq01)
      {
        localq01 = l;
        if ((localq01 == null) || (f.g)) {
          break;
        }
      }
      if ((n == -1) || (localq01 == null) || (paramr1.b(b) != n)) {
        break;
      }
    }
    boolean bool = l(localq02);
    f = h(paramr1, f);
    return bool ^ true;
  }
  
  public final boolean p(r1 paramr1, long paramLong1, long paramLong2)
  {
    Object localObject1 = h;
    Object localObject2 = null;
    for (;;)
    {
      boolean bool = true;
      if (localObject1 == null) {
        break;
      }
      r0 localr0 = f;
      int n;
      if (localObject2 == null)
      {
        localObject2 = h(paramr1, localr0);
      }
      else
      {
        localObject3 = c(paramr1, (q0)localObject2, paramLong1);
        if (localObject3 == null) {}
        for (bool = l((q0)localObject2);; bool = l((q0)localObject2))
        {
          return bool ^ true;
          if ((b == b) && (a.equals(a))) {
            n = 1;
          } else {
            n = 0;
          }
          if (n != 0) {
            break;
          }
        }
        localObject2 = localObject3;
      }
      f = ((r0)localObject2).a(c);
      long l1 = e;
      long l2 = e;
      if ((l1 != -9223372036854775807L) && (l1 != l2)) {
        n = 0;
      } else {
        n = 1;
      }
      if (n == 0)
      {
        ((q0)localObject1).h();
        paramLong1 = e;
        if (paramLong1 == -9223372036854775807L) {
          paramLong1 = Long.MAX_VALUE;
        } else {
          paramLong1 += o;
        }
        if ((localObject1 == i) && (!f.f) && ((paramLong2 == Long.MIN_VALUE) || (paramLong2 >= paramLong1))) {
          n = 1;
        } else {
          n = 0;
        }
        if ((l((q0)localObject1)) || (n != 0)) {
          bool = false;
        }
        return bool;
      }
      Object localObject3 = l;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     v3.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */