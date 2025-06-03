package l1;

import F0.t;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import g0.E;
import g0.M;
import g0.y;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J$b
  implements D
{
  public final y a = new y(new byte[5]);
  public final SparseArray b = new SparseArray();
  public final SparseIntArray c = new SparseIntArray();
  public final int d;
  
  public J$b(J paramJ, int paramInt)
  {
    d = paramInt;
  }
  
  public void a(z paramz)
  {
    if (paramz.G() != 2) {
      return;
    }
    E localE;
    if ((J.n(e) != 1) && (J.n(e) != 2) && (J.h(e) != 1))
    {
      localE = new E(((E)J.o(e).get(0)).d());
      J.o(e).add(localE);
    }
    else
    {
      localE = (E)J.o(e).get(0);
    }
    if ((paramz.G() & 0x80) == 0) {
      return;
    }
    paramz.U(1);
    int i = paramz.M();
    paramz.U(3);
    paramz.k(a, 2);
    a.r(3);
    J.p(e, a.h(13));
    paramz.k(a, 2);
    a.r(4);
    paramz.U(a.h(12));
    Object localObject;
    if ((J.n(e) == 2) && (J.q(e) == null))
    {
      K.b localb = new K.b(21, null, 0, null, M.f);
      localObject = e;
      J.r((J)localObject, J.s((J)localObject).b(21, localb));
      if (J.q(e) != null) {
        J.q(e).c(localE, J.t(e), new K.d(i, 21, 8192));
      }
    }
    b.clear();
    c.clear();
    int k;
    int m;
    for (int j = paramz.a(); j > 0; j = k)
    {
      paramz.k(a, 5);
      k = a.h(8);
      a.r(3);
      m = a.h(13);
      a.r(4);
      int n = a.h(12);
      localObject = b(paramz, n);
      if (k != 6)
      {
        i1 = k;
        if (k != 5) {}
      }
      else
      {
        i1 = a;
      }
      k = j - (n + 5);
      if (J.n(e) == 2) {
        j = i1;
      } else {
        j = m;
      }
      if (!J.u(e).get(j))
      {
        if ((J.n(e) == 2) && (i1 == 21)) {
          localObject = J.q(e);
        } else {
          localObject = J.s(e).b(i1, (K.b)localObject);
        }
        if ((J.n(e) != 2) || (m < c.get(j, 8192)))
        {
          c.put(j, m);
          b.put(j, localObject);
        }
      }
    }
    j = c.size();
    for (int i1 = 0; i1 < j; i1++)
    {
      m = c.keyAt(i1);
      k = c.valueAt(i1);
      J.u(e).put(m, true);
      J.v(e).put(k, true);
      paramz = (K)b.valueAt(i1);
      if (paramz != null)
      {
        if (paramz != J.q(e)) {
          paramz.c(localE, J.t(e), new K.d(i, m, 8192));
        }
        J.f(e).put(k, paramz);
      }
    }
    if (J.n(e) == 2)
    {
      if (!J.j(e))
      {
        J.t(e).j();
        J.l(e, 0);
      }
    }
    else {
      for (;;)
      {
        J.k(e, true);
        break;
        J.f(e).remove(d);
        paramz = e;
        if (J.n(paramz) == 1) {
          i1 = 0;
        } else {
          i1 = J.h(e) - 1;
        }
        J.l(paramz, i1);
        if (J.h(e) != 0) {
          break;
        }
        J.t(e).j();
      }
    }
  }
  
  public final K.b b(z paramz, int paramInt)
  {
    int i = paramz.f();
    int j = i + paramInt;
    paramInt = -1;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    int k = 0;
    while (paramz.f() < j)
    {
      int m = paramz.G();
      int n = paramz.G();
      int i1 = paramz.f() + n;
      if (i1 > j) {
        break;
      }
      long l;
      if (m == 5)
      {
        l = paramz.I();
        if (l == 1094921523L) {
          break label172;
        }
        if (l == 1161904947L) {
          break label198;
        }
        if (l != 1094921524L) {}
      }
      Object localObject3;
      Object localObject4;
      label172:
      label198:
      do
      {
        paramInt = 172;
        localObject3 = localObject1;
        n = k;
        localObject4 = localObject2;
        break label476;
        localObject3 = localObject1;
        n = k;
        localObject4 = localObject2;
        if (l != 1212503619L) {
          break label476;
        }
        paramInt = 36;
        localObject3 = localObject1;
        n = k;
        localObject4 = localObject2;
        break label476;
        if (m == 106)
        {
          paramInt = 129;
          localObject3 = localObject1;
          n = k;
          localObject4 = localObject2;
          break label476;
        }
        if (m == 122)
        {
          paramInt = 135;
          localObject3 = localObject1;
          n = k;
          localObject4 = localObject2;
          break label476;
        }
        if (m != 127) {
          break;
        }
        m = paramz.G();
      } while (m == 21);
      if (m == 14)
      {
        paramInt = 136;
        localObject3 = localObject1;
        n = k;
        localObject4 = localObject2;
      }
      else
      {
        localObject3 = localObject1;
        n = k;
        localObject4 = localObject2;
        if (m == 33)
        {
          paramInt = 139;
          localObject3 = localObject1;
          n = k;
          localObject4 = localObject2;
          break label476;
          if (m == 123) {}
          for (paramInt = 138;; paramInt = 257)
          {
            localObject3 = localObject1;
            n = k;
            localObject4 = localObject2;
            break;
            if (m == 10)
            {
              localObject3 = paramz.D(3).trim();
              n = paramz.G();
              localObject4 = localObject2;
              break;
            }
            if (m == 89)
            {
              localObject4 = new ArrayList();
              while (paramz.f() < i1)
              {
                localObject3 = paramz.D(3).trim();
                paramInt = paramz.G();
                localObject2 = new byte[4];
                paramz.l((byte[])localObject2, 0, 4);
                ((List)localObject4).add(new K.a((String)localObject3, paramInt, (byte[])localObject2));
              }
              paramInt = 89;
              localObject3 = localObject1;
              n = k;
              break;
            }
            localObject3 = localObject1;
            n = k;
            localObject4 = localObject2;
            if (m != 111) {
              break;
            }
          }
        }
      }
      label476:
      paramz.U(i1 - paramz.f());
      localObject1 = localObject3;
      k = n;
      localObject2 = localObject4;
    }
    paramz.T(j);
    return new K.b(paramInt, (String)localObject1, k, (List)localObject2, Arrays.copyOfRange(paramz.e(), i, j));
  }
  
  public void c(E paramE, t paramt, K.d paramd) {}
}

/* Location:
 * Qualified Name:     l1.J.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */