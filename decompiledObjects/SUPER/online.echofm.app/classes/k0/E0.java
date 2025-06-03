package k0;

import X2.v.a;
import android.util.Pair;
import d0.I;
import d0.I.b;
import d0.I.c;
import g0.k;
import java.util.ArrayList;
import java.util.List;
import x0.x.b;

public final class E0
{
  public final I.b a;
  public final I.c b;
  public final l0.a c;
  public final k d;
  public final B0.a e;
  public long f;
  public int g;
  public boolean h;
  public B0 i;
  public B0 j;
  public B0 k;
  public int l;
  public Object m;
  public long n;
  public w.c o;
  public List p;
  
  public E0(l0.a parama, k paramk, B0.a parama1, w.c paramc)
  {
    c = parama;
    d = paramk;
    e = parama1;
    o = paramc;
    a = new I.b();
    b = new I.c();
    p = new ArrayList();
  }
  
  public static boolean C(I.b paramb)
  {
    int i1 = paramb.c();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i1 != 0) {
      if (i1 == 1)
      {
        bool2 = bool1;
        if (paramb.q(0)) {}
      }
      else
      {
        bool2 = bool1;
        if (paramb.r(paramb.o()))
        {
          long l1 = 0L;
          if (paramb.e(0L) != -1)
          {
            bool2 = bool1;
          }
          else
          {
            if (d == 0L) {
              return true;
            }
            int i2;
            if (paramb.q(i1 - 1)) {
              i2 = 2;
            } else {
              i2 = 1;
            }
            for (int i3 = 0; i3 <= i1 - i2; i3++) {
              l1 += paramb.i(i3);
            }
            bool2 = bool1;
            if (d <= l1) {
              bool2 = true;
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public static x.b K(I paramI, Object paramObject, long paramLong1, long paramLong2, I.c paramc, I.b paramb)
  {
    paramI.h(paramObject, paramb);
    paramI.n(c, paramc);
    for (int i1 = paramI.b(paramObject); (C(paramb)) && (i1 <= o); i1++)
    {
      paramI.g(i1, paramb, true);
      paramObject = g0.a.e(b);
    }
    paramI.h(paramObject, paramb);
    i1 = paramb.e(paramLong1);
    if (i1 == -1) {
      return new x.b(paramObject, paramLong2, paramb.d(paramLong1));
    }
    return new x.b(paramObject, i1, paramb.k(i1), paramLong2);
  }
  
  public static boolean d(long paramLong1, long paramLong2)
  {
    boolean bool;
    if ((paramLong1 != -9223372036854775807L) && (paramLong1 != paramLong2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean A(I paramI, x.b paramb)
  {
    boolean bool1 = y(paramb);
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i1 = ha, a).c;
    int i2 = paramI.b(a);
    if (nb).o == i2) {
      bool2 = true;
    }
    return bool2;
  }
  
  public boolean B(x0.v paramv)
  {
    B0 localB0 = k;
    boolean bool;
    if ((localB0 != null) && (a == paramv)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void E()
  {
    v.a locala = X2.v.M();
    for (Object localObject = i; localObject != null; localObject = ((B0)localObject).k()) {
      locala.h(f.a);
    }
    localObject = j;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = f.a;
    }
    d.j(new D0(this, locala, (x.b)localObject));
  }
  
  public void F(long paramLong)
  {
    B0 localB0 = k;
    if (localB0 != null) {
      localB0.u(paramLong);
    }
  }
  
  public final void G(List paramList)
  {
    for (int i1 = 0; i1 < p.size(); i1++) {
      ((B0)p.get(i1)).v();
    }
    p = paramList;
  }
  
  public void H()
  {
    if (!p.isEmpty()) {
      G(new ArrayList());
    }
  }
  
  public boolean I(B0 paramB0)
  {
    g0.a.h(paramB0);
    boolean bool1 = paramB0.equals(k);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    k = paramB0;
    while (paramB0.k() != null)
    {
      paramB0 = (B0)g0.a.e(paramB0.k());
      if (paramB0 == j)
      {
        j = i;
        bool2 = true;
      }
      paramB0.v();
      l -= 1;
    }
    ((B0)g0.a.e(k)).y(null);
    E();
    return bool2;
  }
  
  public final B0 J(C0 paramC0)
  {
    for (int i1 = 0; i1 < p.size(); i1++) {
      if (((B0)p.get(i1)).d(paramC0)) {
        return (B0)p.remove(i1);
      }
    }
    return null;
  }
  
  public x.b L(I paramI, Object paramObject, long paramLong)
  {
    long l1 = M(paramI, paramObject);
    paramI.h(paramObject, a);
    paramI.n(a.c, b);
    int i1 = paramI.b(paramObject);
    int i2 = 0;
    Object localObject;
    for (;;)
    {
      localObject = paramObject;
      if (i1 >= b.n)
      {
        localObject = a;
        int i3 = 1;
        paramI.g(i1, (I.b)localObject, true);
        if (a.c() <= 0) {
          i3 = 0;
        }
        i2 |= i3;
        localObject = a;
        if (((I.b)localObject).e(d) != -1) {
          paramObject = g0.a.e(a.b);
        }
        if (i2 == 0) {
          break label163;
        }
        localObject = paramObject;
        if (i3 != 0)
        {
          if (a.d == 0L) {
            break label163;
          }
          localObject = paramObject;
        }
      }
      break;
      label163:
      i1--;
    }
    return K(paramI, localObject, paramLong, l1, b, a);
  }
  
  public final long M(I paramI, Object paramObject)
  {
    int i1 = ha).c;
    Object localObject = m;
    int i2;
    if (localObject != null)
    {
      i2 = paramI.b(localObject);
      if ((i2 != -1) && (fa).c == i1)) {
        return n;
      }
    }
    for (localObject = i; localObject != null; localObject = ((B0)localObject).k()) {
      if (b.equals(paramObject)) {
        return f.a.d;
      }
    }
    for (localObject = i;; localObject = ((B0)localObject).k())
    {
      if (localObject == null) {
        break label163;
      }
      i2 = paramI.b(b);
      if ((i2 != -1) && (fa).c == i1)) {
        break;
      }
    }
    label163:
    long l1 = N(paramObject);
    if (l1 != -1L) {
      return l1;
    }
    l1 = f;
    f = (1L + l1);
    if (i == null)
    {
      m = paramObject;
      n = l1;
    }
    return l1;
  }
  
  public final long N(Object paramObject)
  {
    for (int i1 = 0; i1 < p.size(); i1++)
    {
      B0 localB0 = (B0)p.get(i1);
      if (b.equals(paramObject)) {
        return f.a.d;
      }
    }
    return -1L;
  }
  
  public boolean O()
  {
    B0 localB0 = k;
    boolean bool;
    if ((localB0 != null) && ((f.i) || (!localB0.s()) || (k.f.e == -9223372036854775807L) || (l >= 100))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean P(I paramI)
  {
    Object localObject = i;
    if (localObject == null) {
      return true;
    }
    int i1 = paramI.b(b);
    for (;;)
    {
      i1 = paramI.d(i1, a, b, g, h);
      while ((((B0)g0.a.e(localObject)).k() != null) && (!f.g)) {
        localObject = ((B0)localObject).k();
      }
      B0 localB0 = ((B0)localObject).k();
      if ((i1 == -1) || (localB0 == null) || (paramI.b(b) != i1)) {
        break;
      }
      localObject = localB0;
    }
    boolean bool = I((B0)localObject);
    f = v(paramI, f);
    return bool ^ true;
  }
  
  public void Q(I paramI, w.c paramc)
  {
    o = paramc;
    x(paramI);
  }
  
  public boolean R(I paramI, long paramLong1, long paramLong2)
  {
    Object localObject1 = i;
    Object localObject2 = null;
    for (;;)
    {
      boolean bool = true;
      if (localObject1 == null) {
        break;
      }
      C0 localC0 = f;
      if (localObject2 == null)
      {
        localObject2 = v(paramI, localC0);
      }
      else
      {
        localObject3 = k(paramI, (B0)localObject2, paramLong1);
        if (localObject3 == null) {
          return I((B0)localObject2) ^ true;
        }
        if (!e(localC0, (C0)localObject3)) {
          return I((B0)localObject2) ^ true;
        }
        localObject2 = localObject3;
      }
      f = ((C0)localObject2).a(c);
      if (!d(e, e))
      {
        ((B0)localObject1).C();
        paramLong1 = e;
        if (paramLong1 == -9223372036854775807L) {
          paramLong1 = Long.MAX_VALUE;
        } else {
          paramLong1 = ((B0)localObject1).B(paramLong1);
        }
        int i1;
        if ((localObject1 == j) && (!f.f) && ((paramLong2 == Long.MIN_VALUE) || (paramLong2 >= paramLong1))) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if ((I((B0)localObject1)) || (i1 != 0)) {
          bool = false;
        }
        return bool;
      }
      Object localObject3 = ((B0)localObject1).k();
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    return true;
  }
  
  public boolean S(I paramI, int paramInt)
  {
    g = paramInt;
    return P(paramI);
  }
  
  public boolean T(I paramI, boolean paramBoolean)
  {
    h = paramBoolean;
    return P(paramI);
  }
  
  public B0 b()
  {
    B0 localB0 = i;
    if (localB0 == null) {
      return null;
    }
    if (localB0 == j) {
      j = localB0.k();
    }
    i.v();
    int i1 = l - 1;
    l = i1;
    if (i1 == 0)
    {
      k = null;
      localB0 = i;
      m = b;
      n = f.a.d;
    }
    i = i.k();
    E();
    return i;
  }
  
  public B0 c()
  {
    j = ((B0)g0.a.h(j)).k();
    E();
    return (B0)g0.a.h(j);
  }
  
  public final boolean e(C0 paramC01, C0 paramC02)
  {
    boolean bool;
    if ((b == b) && (a.equals(a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void f()
  {
    if (l == 0) {
      return;
    }
    B0 localB0 = (B0)g0.a.h(i);
    m = b;
    n = f.a.d;
    while (localB0 != null)
    {
      localB0.v();
      localB0 = localB0.k();
    }
    i = null;
    k = null;
    j = null;
    l = 0;
    E();
  }
  
  public B0 g(C0 paramC0)
  {
    B0 localB0 = k;
    long l1;
    if (localB0 == null) {
      l1 = 1000000000000L;
    } else {
      l1 = localB0.m() + k.f.e - b;
    }
    localB0 = J(paramC0);
    if (localB0 == null)
    {
      paramC0 = e.a(paramC0, l1);
    }
    else
    {
      f = paramC0;
      localB0.z(l1);
      paramC0 = localB0;
    }
    localB0 = k;
    if (localB0 != null)
    {
      localB0.y(paramC0);
    }
    else
    {
      i = paramC0;
      j = paramC0;
    }
    m = null;
    k = paramC0;
    l += 1;
    E();
    return paramC0;
  }
  
  public final Pair h(I paramI, Object paramObject, long paramLong)
  {
    int i1 = paramI.e(ha).c, g, h);
    if (i1 != -1) {
      paramI = paramI.k(b, a, i1, -9223372036854775807L, paramLong);
    } else {
      paramI = null;
    }
    return paramI;
  }
  
  public final C0 i(U0 paramU0)
  {
    return n(a, b, c, s);
  }
  
  public final C0 j(I paramI, B0 paramB0, long paramLong)
  {
    C0 localC0 = f;
    int i1 = paramI.d(paramI.b(a.a), a, b, g, h);
    if (i1 == -1) {
      return null;
    }
    int i2 = ga, true).c;
    Object localObject = g0.a.e(a.b);
    long l1 = a.d;
    if (nb).n == i1)
    {
      Pair localPair = paramI.k(b, a, i2, -9223372036854775807L, Math.max(0L, paramLong));
      if (localPair == null) {
        return null;
      }
      localObject = first;
      l2 = ((Long)second).longValue();
      paramB0 = paramB0.k();
      if ((paramB0 != null) && (b.equals(localObject))) {
        paramLong = f.a.d;
      }
      for (;;)
      {
        l1 = paramLong;
        paramLong = -9223372036854775807L;
        paramB0 = (B0)localObject;
        break;
        l1 = N(localObject);
        paramLong = l1;
        if (l1 == -1L)
        {
          paramLong = f;
          f = (1L + paramLong);
        }
      }
    }
    paramLong = 0L;
    paramB0 = (B0)localObject;
    long l2 = paramLong;
    paramB0 = K(paramI, paramB0, l2, l1, b, a);
    l1 = paramLong;
    boolean bool;
    if (paramLong != -9223372036854775807L)
    {
      l1 = paramLong;
      if (c != -9223372036854775807L)
      {
        bool = w(a.a, paramI);
        if ((!paramB0.b()) || (!bool)) {
          break label327;
        }
        l1 = c;
      }
    }
    label327:
    do
    {
      paramLong = l1;
      break;
      l1 = paramLong;
    } while (!bool);
    l2 = c;
    return n(paramI, paramB0, paramLong, l2);
  }
  
  public final C0 k(I paramI, B0 paramB0, long paramLong)
  {
    C0 localC0 = f;
    paramLong = paramB0.m() + e - paramLong;
    if (g) {
      paramI = j(paramI, paramB0, paramLong);
    } else {
      paramI = l(paramI, paramB0, paramLong);
    }
    return paramI;
  }
  
  public final C0 l(I paramI, B0 paramB0, long paramLong)
  {
    C0 localC0 = f;
    x.b localb = a;
    paramI.h(a, a);
    if (localb.b())
    {
      i1 = b;
      i2 = a.a(i1);
      if (i2 == -1) {
        return null;
      }
      int i3 = a.l(i1, c);
      if (i3 < i2) {
        return o(paramI, a, i1, i3, c, d);
      }
      long l1 = c;
      long l2 = l1;
      if (l1 == -9223372036854775807L)
      {
        paramB0 = b;
        I.b localb1 = a;
        paramB0 = paramI.k(paramB0, localb1, c, -9223372036854775807L, Math.max(0L, paramLong));
        if (paramB0 == null) {
          return null;
        }
        l2 = ((Long)second).longValue();
      }
      paramLong = r(paramI, a, b);
      return p(paramI, a, Math.max(paramLong, l2), c, d);
    }
    int i1 = e;
    if ((i1 != -1) && (a.q(i1))) {
      return j(paramI, paramB0, paramLong);
    }
    int i2 = a.k(e);
    if ((a.r(e)) && (a.h(e, i2) == 3)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if ((i2 != a.a(e)) && (i1 == 0)) {
      return o(paramI, a, e, i2, e, d);
    }
    paramLong = r(paramI, a, e);
    return p(paramI, a, paramLong, e, d);
  }
  
  public B0 m()
  {
    return k;
  }
  
  public final C0 n(I paramI, x.b paramb, long paramLong1, long paramLong2)
  {
    paramI.h(a, a);
    boolean bool = paramb.b();
    Object localObject = a;
    if (bool) {
      return o(paramI, localObject, b, c, paramLong1, d);
    }
    return p(paramI, localObject, paramLong2, paramLong1, d);
  }
  
  public final C0 o(I paramI, Object paramObject, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    paramObject = new x.b(paramObject, paramInt1, paramInt2, paramLong2);
    long l1 = paramI.h(a, a).b(b, c);
    if (paramInt2 == a.k(paramInt1)) {
      paramLong2 = a.g();
    } else {
      paramLong2 = 0L;
    }
    boolean bool = a.r(b);
    if ((l1 != -9223372036854775807L) && (paramLong2 >= l1)) {
      paramLong2 = Math.max(0L, l1 - 1L);
    }
    return new C0((x.b)paramObject, paramLong2, paramLong1, -9223372036854775807L, l1, bool, false, false, false);
  }
  
  public final C0 p(I paramI, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = paramLong1;
    paramI.h(paramObject, a);
    int i1 = a.d(l1);
    int i2 = 0;
    int i3;
    if ((i1 != -1) && (a.q(i1))) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    I.b localb = a;
    if (i1 == -1)
    {
      if (localb.c() > 0)
      {
        localb = a;
        if (localb.r(localb.o()))
        {
          i4 = 1;
          break label157;
        }
      }
    }
    else if (localb.r(i1))
    {
      paramLong1 = a.f(i1);
      localb = a;
      if ((paramLong1 == d) && (localb.p(i1)))
      {
        i4 = 1;
        i1 = -1;
        break label157;
      }
    }
    int i4 = 0;
    label157:
    paramObject = new x.b(paramObject, paramLong3, i1);
    boolean bool1 = y((x.b)paramObject);
    boolean bool2 = A(paramI, (x.b)paramObject);
    boolean bool3 = z(paramI, (x.b)paramObject, bool1);
    boolean bool4;
    if ((i1 != -1) && (a.r(i1)) && (i3 == 0)) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    if ((i1 != -1) && (i3 == 0)) {
      paramLong1 = a.f(i1);
    }
    for (;;)
    {
      break;
      if (i4 != 0) {
        paramLong1 = a.d;
      } else {
        paramLong1 = -9223372036854775807L;
      }
    }
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
          i3 = i2;
          if (i4 != 0) {}
        }
        else
        {
          i3 = 1;
        }
        l2 = Math.max(0L, paramLong3 - i3);
      }
    }
    return new C0((x.b)paramObject, l2, paramLong2, paramLong1, paramLong3, bool4, bool1, bool2, bool3);
  }
  
  public final C0 q(I paramI, Object paramObject, long paramLong1, long paramLong2)
  {
    x.b localb = K(paramI, paramObject, paramLong1, paramLong2, b, a);
    boolean bool = localb.b();
    paramObject = a;
    if (bool) {
      paramI = o(paramI, paramObject, b, c, paramLong1, d);
    } else {
      paramI = p(paramI, paramObject, paramLong1, -9223372036854775807L, d);
    }
    return paramI;
  }
  
  public final long r(I paramI, Object paramObject, int paramInt)
  {
    paramI.h(paramObject, a);
    long l1 = a.f(paramInt);
    if (l1 == Long.MIN_VALUE) {
      return a.d;
    }
    return l1 + a.i(paramInt);
  }
  
  public C0 s(long paramLong, U0 paramU0)
  {
    B0 localB0 = k;
    if (localB0 == null) {
      paramU0 = i(paramU0);
    } else {
      paramU0 = k(a, localB0, paramLong);
    }
    return paramU0;
  }
  
  public B0 t()
  {
    return i;
  }
  
  public B0 u()
  {
    return j;
  }
  
  public C0 v(I paramI, C0 paramC0)
  {
    x.b localb = a;
    boolean bool1 = y(localb);
    boolean bool2 = A(paramI, localb);
    boolean bool3 = z(paramI, localb, bool1);
    paramI.h(a.a, a);
    int i1;
    if (!localb.b())
    {
      i1 = e;
      if (i1 != -1)
      {
        l1 = a.f(i1);
        break label87;
      }
    }
    long l1 = -9223372036854775807L;
    label87:
    if (localb.b()) {}
    for (long l2 = a.b(b, c);; l2 = a.j())
    {
      break;
      if ((l1 != -9223372036854775807L) && (l1 != Long.MIN_VALUE))
      {
        l2 = l1;
        break;
      }
    }
    boolean bool4;
    if (localb.b()) {
      bool4 = a.r(b);
    }
    for (;;)
    {
      break;
      i1 = e;
      if ((i1 != -1) && (a.r(i1))) {
        bool4 = true;
      } else {
        bool4 = false;
      }
    }
    return new C0(localb, b, c, l1, l2, bool4, bool1, bool2, bool3);
  }
  
  public final boolean w(Object paramObject, I paramI)
  {
    int i1 = paramI.h(paramObject, a).c();
    int i2 = a.o();
    if ((i1 > 0) && (a.r(i2)))
    {
      boolean bool1 = true;
      bool2 = bool1;
      if (i1 > 1) {
        break label76;
      }
      if (a.f(i2) != Long.MIN_VALUE)
      {
        bool2 = bool1;
        break label76;
      }
    }
    boolean bool2 = false;
    label76:
    return bool2;
  }
  
  public void x(I paramI)
  {
    if (o.a != -9223372036854775807L)
    {
      B0 localB0 = k;
      if (localB0 != null)
      {
        ArrayList localArrayList = new ArrayList();
        Object localObject = h(paramI, f.a.a, 0L);
        if ((localObject != null) && (!paramI.n(hfirst, a).c, b).f()))
        {
          long l1 = N(first);
          long l2 = l1;
          if (l1 == -1L)
          {
            l2 = f;
            f = (1L + l2);
          }
          C0 localC0 = q(paramI, first, ((Long)second).longValue(), l2);
          localObject = J(localC0);
          paramI = (I)localObject;
          if (localObject == null)
          {
            l1 = localB0.m();
            long l3 = f.e;
            l2 = b;
            paramI = e.a(localC0, l1 + l3 - l2);
          }
          localArrayList.add(paramI);
        }
        G(localArrayList);
        return;
      }
    }
    H();
  }
  
  public final boolean y(x.b paramb)
  {
    boolean bool;
    if ((!paramb.b()) && (e == -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean z(I paramI, x.b paramb, boolean paramBoolean)
  {
    int i1 = paramI.b(a);
    if ((!nfa).c, b).i) && (paramI.r(i1, a, b, g, h)) && (paramBoolean)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
}

/* Location:
 * Qualified Name:     k0.E0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */