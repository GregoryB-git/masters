package e5;

import b5.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import l3.l;
import v3.i0;
import v5.e0;
import z3.a;
import z3.g;
import z4.b0;
import z4.c0;
import z4.j0;
import z4.w.a;

public final class m
  implements c0
{
  public final int a;
  public final n b;
  public int c;
  
  public m(n paramn, int paramInt)
  {
    b = paramn;
    a = paramInt;
    c = -1;
  }
  
  public final void a()
  {
    int i = c;
    if (i != -2)
    {
      if (i == -1)
      {
        b.D();
      }
      else if (i != -3)
      {
        localn = b;
        localn.D();
        D[i].s();
      }
      return;
    }
    n localn = b;
    localn.b();
    throw new c5.b(Q.a(a).d[0].t);
  }
  
  public final boolean b()
  {
    int i = c;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != -3)
    {
      int j;
      if ((i != -1) && (i != -3) && (i != -2)) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        n localn = b;
        if ((!localn.B()) && (D[i].q(b0))) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0) {
          return bool1;
        }
      }
      bool2 = false;
    }
    return bool2;
  }
  
  public final void c()
  {
    boolean bool;
    if (c == -1) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.q(bool);
    Object localObject = b;
    int i = a;
    ((n)localObject).b();
    S.getClass();
    int j = S[i];
    if (j == -1) {
      if (R.contains(Q.a(i)))
      {
        j = -3;
        break label109;
      }
    }
    do
    {
      j = -2;
      break;
      localObject = V;
    } while (localObject[j] != 0);
    localObject[j] = 1;
    label109:
    c = j;
  }
  
  public final int m(long paramLong)
  {
    int i = c;
    int j = 0;
    int k;
    if ((i != -1) && (i != -3) && (i != -2)) {
      k = 1;
    } else {
      k = 0;
    }
    int m = j;
    if (k != 0)
    {
      Object localObject1 = b;
      if (((n)localObject1).B())
      {
        m = j;
      }
      else
      {
        n.c localc = D[i];
        m = localc.o(paramLong, b0);
        Object localObject2 = v;
        localObject1 = null;
        if ((localObject2 instanceof Collection))
        {
          if (!((ArrayList)localObject2).isEmpty()) {
            localObject1 = ((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
          }
        }
        else
        {
          localObject2 = ((ArrayList)localObject2).iterator();
          if (((Iterator)localObject2).hasNext()) {
            do
            {
              localObject1 = ((Iterator)localObject2).next();
            } while (((Iterator)localObject2).hasNext());
          }
        }
        localObject1 = (j)localObject1;
        k = m;
        if (localObject1 != null)
        {
          k = m;
          if (!K)
          {
            k = q;
            j = s;
            k = Math.min(m, ((j)localObject1).g(i) - (k + j));
          }
        }
        localc.y(k);
        m = k;
      }
    }
    return m;
  }
  
  public final int r(l paraml, g arg2, int paramInt)
  {
    int i = c;
    if (i == -3)
    {
      ???.l(4);
      return -4;
    }
    int j = 0;
    int k;
    if ((i != -1) && (i != -3) && (i != -2)) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0)
    {
      n localn = b;
      if (!localn.B())
      {
        int i1;
        if (!v.isEmpty())
        {
          for (k = 0; k < v.size() - 1; k++)
          {
            int m = v.get(k)).k;
            int n = D.length;
            for (i1 = 0; i1 < n; i1++) {
              if (V[i1] != 0) {
                synchronized (D[i1])
                {
                  int i2 = ((b0)???).n(s);
                  int i3;
                  if (s != p) {
                    i3 = 1;
                  } else {
                    i3 = 0;
                  }
                  if (i3 != 0) {
                    i3 = j[i2];
                  } else {
                    i3 = C;
                  }
                  if (i3 == m) {
                    i1 = 0;
                  }
                }
              }
            }
            i1 = 1;
            if (i1 == 0) {
              break;
            }
          }
          e0.N(0, k, v);
          ??? = (j)v.get(0);
          i0 locali0 = d;
          if (!locali0.equals(O)) {
            s.b(b, locali0, e, f, g);
          }
          O = locali0;
        }
        if ((v.isEmpty()) || (v.get(0)).K))
        {
          i1 = D[i].u(paraml, ???, paramInt, b0);
          paramInt = i1;
          if (i1 != -5) {
            return paramInt;
          }
          ??? = (i0)b;
          ???.getClass();
          ??? = (g)???;
          if (i == J) {
            synchronized (D[i])
            {
              k = ???.n(s);
              if (s != p) {
                paramInt = 1;
              } else {
                paramInt = 0;
              }
              if (paramInt != 0) {
                paramInt = j[k];
              } else {
                paramInt = C;
              }
              for (k = j; (k < v.size()) && (v.get(k)).k != paramInt); k++) {}
              if (k < v.size())
              {
                ??? = v.get(k)).d;
              }
              else
              {
                ??? = N;
                ???.getClass();
              }
              ??? = ((i0)???).d(???);
            }
          }
          b = ???;
          return i1;
        }
      }
    }
    paramInt = -3;
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     e5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */