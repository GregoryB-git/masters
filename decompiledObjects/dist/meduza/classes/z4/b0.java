package z4;

import a4.d;
import a4.g.a;
import a4.h.b;
import android.util.SparseArray;
import c4.v;
import c4.v.a;
import f;
import java.io.EOFException;
import l3.l;
import r3.j;
import t5.o;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.m;
import v5.p;
import v5.u;
import z3.g;

public class b0
  implements v
{
  public i0 A;
  public i0 B;
  public int C;
  public boolean D;
  public boolean E;
  public long F;
  public boolean G;
  public final a0 a;
  public final a b;
  public final h0<b> c;
  public final a4.h d;
  public final g.a e;
  public c f;
  public i0 g;
  public a4.e h;
  public int i;
  public int[] j;
  public long[] k;
  public int[] l;
  public int[] m;
  public long[] n;
  public v.a[] o;
  public int p;
  public int q;
  public int r;
  public int s;
  public long t;
  public long u;
  public long v;
  public boolean w;
  public boolean x;
  public boolean y;
  public boolean z;
  
  public b0(t5.b paramb, a4.h paramh, g.a parama)
  {
    d = paramh;
    e = parama;
    a = new a0(paramb);
    b = new a();
    i = 1000;
    j = new int['Ϩ'];
    k = new long['Ϩ'];
    n = new long['Ϩ'];
    m = new int['Ϩ'];
    l = new int['Ϩ'];
    o = new v.a['Ϩ'];
    c = new h0(new j(12));
    t = Long.MIN_VALUE;
    u = Long.MIN_VALUE;
    v = Long.MIN_VALUE;
    y = true;
    x = true;
  }
  
  public final void a(int paramInt, u paramu)
  {
    a0 locala0 = a;
    while (paramInt > 0)
    {
      int i1 = locala0.c(paramInt);
      a0.a locala = f;
      t5.a locala1 = c;
      paramu.d(a, (int)(g - a) + b, i1);
      int i2 = paramInt - i1;
      long l1 = g + i1;
      g = l1;
      locala = f;
      paramInt = i2;
      if (l1 == b)
      {
        f = d;
        paramInt = i2;
      }
    }
    locala0.getClass();
  }
  
  public final void b(int paramInt, u paramu)
  {
    a(paramInt, paramu);
  }
  
  public void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
  {
    Object localObject1;
    if (z)
    {
      localObject1 = A;
      x6.b.K(localObject1);
      d((i0)localObject1);
    }
    int i1 = paramInt1 & 0x1;
    int i2;
    if (i1 != 0) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (x)
    {
      if (i2 == 0) {
        return;
      }
      x = false;
    }
    paramLong += F;
    if (D)
    {
      if (paramLong < t) {
        return;
      }
      if (i1 == 0)
      {
        if (!E)
        {
          localObject1 = f.l("Overriding unexpected non-sync sample for format: ");
          ((StringBuilder)localObject1).append(B);
          m.f("SampleQueue", ((StringBuilder)localObject1).toString());
          E = true;
        }
        i1 = paramInt1 | 0x1;
        break label140;
      }
    }
    i1 = paramInt1;
    label140:
    if (G) {
      if (i2 != 0) {
        try
        {
          if (p == 0)
          {
            l1 = u;
            if (paramLong > l1) {
              paramInt1 = 1;
            } else {
              paramInt1 = 0;
            }
          }
          int i3;
          int i4;
          return;
        }
        finally
        {
          try
          {
            l1 = Math.max(u, m(s));
            if (l1 >= paramLong)
            {
              paramInt1 = 0;
            }
            else
            {
              i2 = p;
              paramInt1 = n(i2 - 1);
              while ((i2 > s) && (n[paramInt1] >= paramLong))
              {
                i3 = i2 - 1;
                i4 = paramInt1 - 1;
                i2 = i3;
                paramInt1 = i4;
                if (i4 == -1)
                {
                  paramInt1 = i - 1;
                  i2 = i3;
                }
              }
              i(q + i2);
              paramInt1 = 1;
            }
            if (paramInt1 == 0) {
              break label339;
            }
            G = false;
          }
          finally {}
        }
      }
    }
    label339:
    long l1 = a.g - paramInt2 - paramInt3;
    try
    {
      paramInt1 = p;
      boolean bool;
      if (paramInt1 > 0)
      {
        paramInt1 = n(paramInt1 - 1);
        if (k[paramInt1] + l[paramInt1] <= l1) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.q(bool);
      }
      if ((0x20000000 & i1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      w = bool;
      v = Math.max(v, paramLong);
      paramInt1 = n(p);
      n[paramInt1] = paramLong;
      k[paramInt1] = l1;
      l[paramInt1] = paramInt2;
      m[paramInt1] = i1;
      o[paramInt1] = parama;
      j[paramInt1] = C;
      if (c.b.size() == 0) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      Object localObject2;
      Object localObject3;
      if (paramInt1 == 0)
      {
        parama = c.b;
        if (valueAtsize1a.equals(B)) {}
      }
      else
      {
        parama = d;
        if (parama != null) {
          parama = parama.b(e, B);
        } else {
          parama = h.b.h;
        }
        localObject2 = c;
        paramInt1 = q;
        paramInt2 = p;
        localObject1 = new z4/b0$b;
        localObject3 = B;
        localObject3.getClass();
        ((b)localObject1).<init>((i0)localObject3, parama);
        ((h0)localObject2).a(paramInt1 + paramInt2, (b)localObject1);
      }
      paramInt1 = p + 1;
      p = paramInt1;
      paramInt2 = i;
      if (paramInt1 == paramInt2)
      {
        paramInt1 = paramInt2 + 1000;
        parama = new int[paramInt1];
        long[] arrayOfLong = new long[paramInt1];
        localObject3 = new long[paramInt1];
        localObject1 = new int[paramInt1];
        int[] arrayOfInt = new int[paramInt1];
        localObject2 = new v.a[paramInt1];
        paramInt3 = r;
        paramInt2 -= paramInt3;
        System.arraycopy(k, paramInt3, arrayOfLong, 0, paramInt2);
        System.arraycopy(n, r, localObject3, 0, paramInt2);
        System.arraycopy(m, r, localObject1, 0, paramInt2);
        System.arraycopy(l, r, arrayOfInt, 0, paramInt2);
        System.arraycopy(o, r, localObject2, 0, paramInt2);
        System.arraycopy(j, r, parama, 0, paramInt2);
        paramInt3 = r;
        System.arraycopy(k, 0, arrayOfLong, paramInt2, paramInt3);
        System.arraycopy(n, 0, localObject3, paramInt2, paramInt3);
        System.arraycopy(m, 0, localObject1, paramInt2, paramInt3);
        System.arraycopy(l, 0, arrayOfInt, paramInt2, paramInt3);
        System.arraycopy(o, 0, localObject2, paramInt2, paramInt3);
        System.arraycopy(j, 0, parama, paramInt2, paramInt3);
        k = arrayOfLong;
        n = ((long[])localObject3);
        m = ((int[])localObject1);
        l = arrayOfInt;
        o = ((v.a[])localObject2);
        j = parama;
        r = 0;
        i = paramInt1;
      }
      return;
    }
    finally {}
  }
  
  public final void d(i0 parami0)
  {
    i0 locali0 = l(parami0);
    int i1 = 0;
    z = false;
    A = parami0;
    try
    {
      y = false;
      if (!e0.a(locali0, B))
      {
        if (c.b.size() == 0) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        parami0 = locali0;
        if (i1 == 0)
        {
          SparseArray localSparseArray = c.b;
          parami0 = locali0;
          if (valueAtsize1a.equals(locali0))
          {
            parami0 = c.b;
            parami0 = valueAtsize1a;
          }
        }
        B = parami0;
        D = p.a(t, q);
        E = false;
        i1 = 1;
      }
      parami0 = f;
      if ((parami0 != null) && (i1 != 0)) {
        parami0.a();
      }
      return;
    }
    finally {}
  }
  
  public final int e(t5.h paramh, int paramInt, boolean paramBoolean)
  {
    return w(paramh, paramInt, paramBoolean);
  }
  
  public final long f(int paramInt)
  {
    u = Math.max(u, m(paramInt));
    p -= paramInt;
    int i1 = q + paramInt;
    q = i1;
    int i2 = r + paramInt;
    r = i2;
    int i3 = i;
    if (i2 >= i3) {
      r = (i2 - i3);
    }
    i3 = s - paramInt;
    s = i3;
    paramInt = 0;
    if (i3 < 0) {
      s = 0;
    }
    h0 localh0 = c;
    while (paramInt < b.size() - 1)
    {
      SparseArray localSparseArray = b;
      i3 = paramInt + 1;
      if (i1 < localSparseArray.keyAt(i3)) {
        break;
      }
      c.accept(b.valueAt(paramInt));
      b.removeAt(paramInt);
      paramInt = a;
      if (paramInt > 0) {
        a = (paramInt - 1);
      }
      paramInt = i3;
    }
    if (p == 0)
    {
      i3 = r;
      paramInt = i3;
      if (i3 == 0) {
        paramInt = i;
      }
      paramInt--;
      return k[paramInt] + l[paramInt];
    }
    return k[r];
  }
  
  public final void g(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    a0 locala0 = a;
    try
    {
      int i1 = p;
      long l1 = -1L;
      long l2 = l1;
      if (i1 != 0)
      {
        long[] arrayOfLong = n;
        int i2 = r;
        if (paramLong < arrayOfLong[i2])
        {
          l2 = l1;
        }
        else
        {
          int i3 = i1;
          if (paramBoolean2)
          {
            int i4 = s;
            i3 = i1;
            if (i4 != i1) {
              i3 = i4 + 1;
            }
          }
          i3 = k(i2, i3, paramLong, paramBoolean1);
          if (i3 == -1) {
            l2 = l1;
          } else {
            l2 = f(i3);
          }
        }
      }
      locala0.b(l2);
      return;
    }
    finally {}
  }
  
  public final void h()
  {
    a0 locala0 = a;
    try
    {
      int i1 = p;
      if (i1 == 0) {}
      for (long l1 = -1L;; l1 = f(i1)) {
        break;
      }
      locala0.b(l1);
      return;
    }
    finally {}
  }
  
  public final long i(int paramInt)
  {
    int i1 = q;
    int i2 = p;
    i1 = i1 + i2 - paramInt;
    boolean bool1 = false;
    if ((i1 >= 0) && (i1 <= i2 - s)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    x6.b.q(bool2);
    i2 = p - i1;
    p = i2;
    v = Math.max(u, m(i2));
    boolean bool2 = bool1;
    if (i1 == 0)
    {
      bool2 = bool1;
      if (w) {
        bool2 = true;
      }
    }
    w = bool2;
    h0 localh0 = c;
    i2 = b.size();
    i1 = -1;
    i2--;
    while ((i2 >= 0) && (paramInt < b.keyAt(i2)))
    {
      c.accept(b.valueAt(i2));
      b.removeAt(i2);
      i2--;
    }
    paramInt = i1;
    if (b.size() > 0) {
      paramInt = Math.min(a, b.size() - 1);
    }
    a = paramInt;
    paramInt = p;
    if (paramInt != 0)
    {
      paramInt = n(paramInt - 1);
      return k[paramInt] + l[paramInt];
    }
    return 0L;
  }
  
  public final void j(int paramInt)
  {
    a0 locala0 = a;
    long l1 = i(paramInt);
    boolean bool;
    if (l1 <= g) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.q(bool);
    g = l1;
    if (l1 != 0L)
    {
      Object localObject1 = d;
      localObject2 = localObject1;
      if (l1 != a)
      {
        while (g > b) {
          localObject2 = d;
        }
        a0.a locala1 = d;
        locala1.getClass();
        locala0.a(locala1);
        l1 = b;
        a0.a locala2 = new a0.a(b, l1);
        d = locala2;
        localObject1 = localObject2;
        if (g == b) {
          localObject1 = locala2;
        }
        f = ((a0.a)localObject1);
        if (e != locala1) {
          return;
        }
        e = locala2;
        return;
      }
    }
    locala0.a(d);
    l1 = g;
    Object localObject2 = new a0.a(b, l1);
    d = ((a0.a)localObject2);
    e = ((a0.a)localObject2);
    f = ((a0.a)localObject2);
  }
  
  public final int k(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    int i1 = -1;
    int i2 = 0;
    int i3 = paramInt1;
    for (paramInt1 = i2;; paramInt1++)
    {
      i2 = i1;
      if (paramInt1 >= paramInt2) {
        break;
      }
      long l1 = n[i3];
      i2 = i1;
      if (l1 > paramLong) {
        break;
      }
      if ((!paramBoolean) || ((m[i3] & 0x1) != 0))
      {
        if (l1 == paramLong)
        {
          i2 = paramInt1;
          break;
        }
        i1 = paramInt1;
      }
      i2 = i3 + 1;
      i3 = i2;
      if (i2 == i) {
        i3 = 0;
      }
    }
    return i2;
  }
  
  public i0 l(i0 parami0)
  {
    Object localObject = parami0;
    if (F != 0L)
    {
      localObject = parami0;
      if (x != Long.MAX_VALUE)
      {
        localObject = parami0.a();
        o = (x + F);
        localObject = ((i0.a)localObject).a();
      }
    }
    return (i0)localObject;
  }
  
  public final long m(int paramInt)
  {
    long l1 = Long.MIN_VALUE;
    if (paramInt == 0) {
      return Long.MIN_VALUE;
    }
    int i1 = n(paramInt - 1);
    long l2;
    for (int i2 = 0;; i2++)
    {
      l2 = l1;
      if (i2 >= paramInt) {
        break;
      }
      l1 = Math.max(l1, n[i1]);
      if ((m[i1] & 0x1) != 0)
      {
        l2 = l1;
        break;
      }
      int i3 = i1 - 1;
      i1 = i3;
      if (i3 == -1) {
        i1 = i - 1;
      }
    }
    return l2;
  }
  
  public final int n(int paramInt)
  {
    paramInt = r + paramInt;
    int i1 = i;
    if (paramInt >= i1) {
      paramInt -= i1;
    }
    return paramInt;
  }
  
  public final int o(long paramLong, boolean paramBoolean)
  {
    try
    {
      int i1 = n(s);
      int i2 = s;
      int i3 = p;
      int i4;
      if (i2 != i3) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      if ((i4 != 0) && (paramLong >= n[i1]))
      {
        long l1 = v;
        if ((paramLong > l1) && (paramBoolean)) {
          return i3 - i2;
        }
        i4 = k(i1, i3 - i2, paramLong, true);
        if (i4 == -1) {
          return 0;
        }
        return i4;
      }
      return 0;
    }
    finally {}
  }
  
  public final i0 p()
  {
    try
    {
      i0 locali0;
      if (y) {
        locali0 = null;
      } else {
        locali0 = B;
      }
      return locali0;
    }
    finally {}
  }
  
  public final boolean q(boolean paramBoolean)
  {
    try
    {
      int i1 = s;
      int i2 = p;
      boolean bool1 = true;
      if (i1 != i2) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if (i2 == 0)
      {
        boolean bool2 = bool1;
        if (!paramBoolean)
        {
          bool2 = bool1;
          if (!w)
          {
            locali01 = B;
            if (locali01 != null)
            {
              locali02 = g;
              if (locali01 != locali02)
              {
                bool2 = bool1;
                break label84;
              }
            }
            bool2 = false;
          }
        }
        label84:
        return bool2;
      }
      i0 locali01 = c.b(q + i1)).a;
      i0 locali02 = g;
      if (locali01 != locali02) {
        return true;
      }
      paramBoolean = r(n(s));
      return paramBoolean;
    }
    finally {}
  }
  
  public final boolean r(int paramInt)
  {
    a4.e locale = h;
    boolean bool;
    if ((locale != null) && (locale.e() != 4) && (((m[paramInt] & 0x40000000) != 0) || (!h.i()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void s()
  {
    Object localObject = h;
    if ((localObject != null) && (((a4.e)localObject).e() == 1))
    {
      localObject = h.k();
      localObject.getClass();
      throw ((Throwable)localObject);
    }
  }
  
  public final void t(i0 parami0, l paraml)
  {
    Object localObject1 = g;
    int i1;
    if (localObject1 == null) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0) {
      localObject1 = null;
    } else {
      localObject1 = w;
    }
    g = parami0;
    d locald = w;
    Object localObject2 = d;
    if (localObject2 != null) {
      localObject2 = parami0.b(((a4.h)localObject2).e(parami0));
    } else {
      localObject2 = parami0;
    }
    b = localObject2;
    a = h;
    if (d == null) {
      return;
    }
    if ((i1 == 0) && (e0.a(localObject1, locald))) {
      return;
    }
    localObject1 = h;
    parami0 = d.d(e, parami0);
    h = parami0;
    a = parami0;
    if (localObject1 != null) {
      ((a4.e)localObject1).f(e);
    }
  }
  
  public final int u(l paraml, g paramg, int paramInt, boolean paramBoolean)
  {
    int i1 = 0;
    int i2;
    if ((paramInt & 0x2) != 0) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    a locala = b;
    try
    {
      d = false;
      int i3 = s;
      int i4;
      if (i3 != p) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      int i5 = -5;
      Object localObject;
      if (i4 == 0)
      {
        if ((!paramBoolean) && (!w))
        {
          localObject = B;
          if ((localObject != null) && ((i2 != 0) || (localObject != g)))
          {
            t((i0)localObject, paraml);
            break label320;
          }
        }
        else
        {
          a = 4;
          break label304;
        }
      }
      else
      {
        localObject = c.b(q + i3)).a;
        if ((i2 != 0) || (localObject != g)) {
          break label313;
        }
        i2 = n(s);
        if (r(i2)) {
          break label194;
        }
        d = true;
      }
      i2 = -3;
      break label326;
      label194:
      a = m[i2];
      if ((s == p - 1) && ((paramBoolean) || (w))) {
        paramg.l(536870912);
      }
      long l1 = n[i2];
      e = l1;
      if (l1 < t) {
        paramg.l(Integer.MIN_VALUE);
      }
      a = l[i2];
      b = k[i2];
      c = o[i2];
      label304:
      i2 = -4;
      break label326;
      label313:
      t((i0)localObject, paraml);
      label320:
      i2 = i5;
      label326:
      if ((i2 == -4) && (!paramg.m(4)))
      {
        i4 = i1;
        if ((paramInt & 0x1) != 0) {
          i4 = 1;
        }
        if ((paramInt & 0x4) == 0)
        {
          paraml = a;
          localObject = b;
          if (i4 != 0) {
            a0.f(e, paramg, (a)localObject, c);
          } else {
            e = a0.f(e, paramg, (a)localObject, c);
          }
        }
        if (i4 == 0) {
          s += 1;
        }
      }
      return i2;
    }
    finally {}
  }
  
  public final void v(boolean paramBoolean)
  {
    Object localObject1 = a;
    ((a0)localObject1).a(d);
    a0.a locala = d;
    int i1 = b;
    Object localObject2 = c;
    int i2 = 0;
    boolean bool;
    if (localObject2 == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    a = 0L;
    b = (i1 + 0L);
    localObject2 = d;
    e = ((a0.a)localObject2);
    f = ((a0.a)localObject2);
    g = 0L;
    ((o)a).a();
    p = 0;
    q = 0;
    r = 0;
    s = 0;
    x = true;
    t = Long.MIN_VALUE;
    u = Long.MIN_VALUE;
    v = Long.MIN_VALUE;
    w = false;
    localObject1 = c;
    while (i2 < b.size())
    {
      c.accept(b.valueAt(i2));
      i2++;
    }
    a = -1;
    b.clear();
    if (paramBoolean)
    {
      A = null;
      B = null;
      y = true;
    }
  }
  
  public final int w(t5.h paramh, int paramInt, boolean paramBoolean)
  {
    a0 locala0 = a;
    paramInt = locala0.c(paramInt);
    a0.a locala = f;
    t5.a locala1 = c;
    int i1 = paramh.read(a, (int)(g - a) + b, paramInt);
    if (i1 == -1)
    {
      if (paramBoolean) {
        paramInt = -1;
      } else {
        throw new EOFException();
      }
    }
    else
    {
      long l1 = g + i1;
      g = l1;
      paramh = f;
      paramInt = i1;
      if (l1 == b)
      {
        f = d;
        paramInt = i1;
      }
    }
    return paramInt;
  }
  
  /* Error */
  public final boolean x(long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 209	z4/b0:s	I
    //   9: aload_0
    //   10: getfield 76	z4/b0:a	Lz4/a0;
    //   13: astore 4
    //   15: aload 4
    //   17: aload 4
    //   19: getfield 334	z4/a0:d	Lz4/a0$a;
    //   22: putfield 343	z4/a0:e	Lz4/a0$a;
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_0
    //   28: iconst_0
    //   29: invokevirtual 220	z4/b0:n	(I)I
    //   32: istore 5
    //   34: aload_0
    //   35: getfield 209	z4/b0:s	I
    //   38: istore 6
    //   40: aload_0
    //   41: getfield 207	z4/b0:p	I
    //   44: istore 7
    //   46: iload 6
    //   48: iload 7
    //   50: if_icmpeq +9 -> 59
    //   53: iconst_1
    //   54: istore 8
    //   56: goto +6 -> 62
    //   59: iconst_0
    //   60: istore 8
    //   62: iload 8
    //   64: ifeq +76 -> 140
    //   67: lload_1
    //   68: aload_0
    //   69: getfield 87	z4/b0:n	[J
    //   72: iload 5
    //   74: laload
    //   75: lcmp
    //   76: iflt +64 -> 140
    //   79: lload_1
    //   80: aload_0
    //   81: getfield 115	z4/b0:v	J
    //   84: lcmp
    //   85: ifle +10 -> 95
    //   88: iload_3
    //   89: ifne +6 -> 95
    //   92: goto +48 -> 140
    //   95: aload_0
    //   96: iload 5
    //   98: iload 7
    //   100: iload 6
    //   102: isub
    //   103: lload_1
    //   104: iconst_1
    //   105: invokevirtual 324	z4/b0:k	(IIJZ)I
    //   108: istore 8
    //   110: iload 8
    //   112: iconst_m1
    //   113: if_icmpne +7 -> 120
    //   116: aload_0
    //   117: monitorexit
    //   118: iconst_0
    //   119: ireturn
    //   120: aload_0
    //   121: lload_1
    //   122: putfield 111	z4/b0:t	J
    //   125: aload_0
    //   126: aload_0
    //   127: getfield 209	z4/b0:s	I
    //   130: iload 8
    //   132: iadd
    //   133: putfield 209	z4/b0:s	I
    //   136: aload_0
    //   137: monitorexit
    //   138: iconst_1
    //   139: ireturn
    //   140: aload_0
    //   141: monitorexit
    //   142: iconst_0
    //   143: ireturn
    //   144: astore 4
    //   146: goto +10 -> 156
    //   149: astore 4
    //   151: aload_0
    //   152: monitorexit
    //   153: aload 4
    //   155: athrow
    //   156: aload_0
    //   157: monitorexit
    //   158: aload 4
    //   160: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	this	b0
    //   0	161	1	paramLong	long
    //   0	161	3	paramBoolean	boolean
    //   13	5	4	locala0	a0
    //   144	1	4	localObject1	Object
    //   149	10	4	localObject2	Object
    //   32	65	5	i1	int
    //   38	65	6	i2	int
    //   44	59	7	i3	int
    //   54	79	8	i4	int
    // Exception table:
    //   from	to	target	type
    //   2	4	144	finally
    //   25	46	144	finally
    //   67	88	144	finally
    //   95	110	144	finally
    //   120	136	144	finally
    //   151	156	144	finally
    //   4	25	149	finally
  }
  
  public final void y(int paramInt)
  {
    if (paramInt >= 0) {
      try
      {
        if (s + paramInt <= p) {
          bool = true;
        }
      }
      finally
      {
        break label47;
      }
    }
    boolean bool = false;
    x6.b.q(bool);
    s += paramInt;
    return;
    label47:
    throw ((Throwable)localObject);
  }
  
  public static final class a
  {
    public int a;
    public long b;
    public v.a c;
  }
  
  public static final class b
  {
    public final i0 a;
    public final h.b b;
    
    public b(i0 parami0, h.b paramb)
    {
      a = parami0;
      b = paramb;
    }
  }
  
  public static abstract interface c
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     z4.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */