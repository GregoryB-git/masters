package m4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c4.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v5.e0;
import v5.t;
import v5.u;

public final class c0$b
  implements x
{
  public final t a = new t(new byte[5], 5);
  public final SparseArray<d0> b = new SparseArray();
  public final SparseIntArray c = new SparseIntArray();
  public final int d;
  
  public c0$b(c0 paramc0, int paramInt)
  {
    d = paramInt;
  }
  
  public final void a(u paramu)
  {
    if (paramu.v() != 2) {
      return;
    }
    Object localObject1 = e;
    int i = a;
    v5.c0 localc0;
    if ((i != 1) && (i != 2) && (l != 1))
    {
      localc0 = new v5.c0(((v5.c0)b.get(0)).c());
      e.b.add(localc0);
    }
    else
    {
      localc0 = (v5.c0)b.get(0);
    }
    if ((paramu.v() & 0x80) == 0) {
      return;
    }
    paramu.H(1);
    int j = paramu.A();
    paramu.H(3);
    localObject1 = a;
    paramu.d(a, 0, 2);
    ((t)localObject1).k(0);
    a.m(3);
    e.r = a.g(13);
    localObject1 = a;
    paramu.d(a, 0, 2);
    ((t)localObject1).k(0);
    localObject1 = a;
    i = 4;
    ((t)localObject1).m(4);
    paramu.H(a.g(12));
    localObject1 = e;
    int k = a;
    int m = 21;
    Object localObject2;
    if ((k == 2) && (p == null))
    {
      localObject1 = new d0.b(21, null, null, e0.f);
      localObject2 = e;
      p = e.a(21, (d0.b)localObject1);
      localObject1 = e;
      localObject2 = p;
      if (localObject2 != null) {
        ((d0)localObject2).c(localc0, k, new d0.d(j, 21, 8192));
      }
    }
    b.clear();
    c.clear();
    int n = c - b;
    while (n > 0)
    {
      localObject1 = a;
      paramu.d(a, 0, 5);
      ((t)localObject1).k(0);
      int i1 = a.g(8);
      a.m(3);
      int i2 = a.g(13);
      a.m(i);
      int i3 = a.g(12);
      int i4 = b;
      int i5 = i3 + i4;
      int i6 = -1;
      localObject1 = null;
      localObject2 = null;
      k = m;
      m = i;
      i = i6;
      while (b < i5)
      {
        int i7 = paramu.v();
        m = paramu.v();
        i6 = b + m;
        if (i6 > i5)
        {
          m = 4;
          break;
        }
        m = 172;
        if (i7 == 5)
        {
          long l = paramu.w();
          if (l != 1094921523L)
          {
            if (l == 1161904947L) {
              break label587;
            }
            if (l == 1094921524L) {
              break label610;
            }
            if (l != 1212503619L) {
              break label616;
            }
            i = 36;
            break label616;
          }
        }
        else
        {
          if (i7 != 106) {
            break label580;
          }
        }
        label580:
        label587:
        label610:
        for (i = 129;; i = m)
        {
          break;
          if (i7 == 122)
          {
            i = 135;
            break;
          }
          if (i7 != 127) {
            break label619;
          }
          if (paramu.v() != k) {
            break;
          }
        }
        for (;;)
        {
          label616:
          break;
          label619:
          if (i7 == 123)
          {
            i = 138;
          }
          else
          {
            if (i7 != 10) {
              break label659;
            }
            localObject1 = paramu.s(3).trim();
          }
        }
        Object localObject3 = localObject1;
        Object localObject4 = localObject2;
        break label766;
        label659:
        if (i7 == 89)
        {
          localObject4 = new ArrayList();
          while (b < i6)
          {
            localObject2 = paramu.s(3).trim();
            paramu.v();
            localObject3 = new byte[4];
            paramu.d((byte[])localObject3, 0, 4);
            ((ArrayList)localObject4).add(new d0.a((String)localObject2, (byte[])localObject3));
          }
          i = 89;
          localObject3 = localObject1;
        }
        else
        {
          localObject3 = localObject1;
          localObject4 = localObject2;
          if (i7 == 111)
          {
            i = 257;
            localObject4 = localObject2;
            localObject3 = localObject1;
          }
        }
        label766:
        paramu.H(i6 - b);
        m = 4;
        k = 21;
        localObject1 = localObject3;
        localObject2 = localObject4;
      }
      paramu.G(i5);
      localObject1 = new d0.b(i, (String)localObject1, (ArrayList)localObject2, Arrays.copyOfRange(a, i4, i5));
      if (i1 != 6)
      {
        k = i1;
        if (i1 != 5) {}
      }
      else
      {
        k = i;
      }
      n -= i3 + 5;
      localObject2 = e;
      if (a == 2) {
        i = k;
      } else {
        i = i2;
      }
      if (!g.get(i))
      {
        localObject2 = e;
        if ((a == 2) && (k == 21)) {
          localObject1 = p;
        } else {
          localObject1 = e.a(k, (d0.b)localObject1);
        }
        if ((e.a != 2) || (i2 < c.get(i, 8192)))
        {
          c.put(i, i2);
          b.put(i, localObject1);
        }
      }
      i = m;
      m = 21;
    }
    m = c.size();
    for (i = 0; i < m; i++)
    {
      n = c.keyAt(i);
      k = c.valueAt(i);
      e.g.put(n, true);
      e.h.put(k, true);
      localObject1 = (d0)b.valueAt(i);
      if (localObject1 != null)
      {
        paramu = e;
        if (localObject1 != p) {
          ((d0)localObject1).c(localc0, k, new d0.d(j, n, 8192));
        }
        e.f.put(k, localObject1);
      }
    }
    paramu = e;
    if (a == 2)
    {
      if (m) {
        return;
      }
      k.m();
      paramu = e;
      l = 0;
    }
    else
    {
      f.remove(d);
      paramu = e;
      if (a == 1) {
        i = 0;
      } else {
        i = l - 1;
      }
      l = i;
      if (i != 0) {
        return;
      }
      k.m();
      paramu = e;
    }
    m = true;
  }
  
  public final void c(v5.c0 paramc0, j paramj, d0.d paramd) {}
}

/* Location:
 * Qualified Name:     m4.c0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */