package A0;

import X2.P;
import X2.v.a;
import d0.J;
import d0.K;
import d0.q;
import g0.M;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.List;
import k0.Z0;

public final class n$j
  extends n.i
{
  public final int A;
  public final boolean B;
  public final boolean C;
  public final int D;
  public final boolean E;
  public final boolean F;
  public final int G;
  public final boolean s;
  public final n.e t;
  public final boolean u;
  public final boolean v;
  public final boolean w;
  public final int x;
  public final int y;
  public final int z;
  
  public n$j(int paramInt1, J paramJ, int paramInt2, n.e parame, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    super(paramInt1, paramJ, paramInt2);
    t = parame;
    if (l0) {
      paramInt2 = 24;
    } else {
      paramInt2 = 16;
    }
    boolean bool1 = k0;
    boolean bool2 = true;
    if ((bool1) && ((paramInt4 & paramInt2) != 0)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    C = bool1;
    if (paramBoolean)
    {
      paramJ = r;
      paramInt1 = t;
      if ((paramInt1 == -1) || (paramInt1 <= a))
      {
        paramInt1 = u;
        if ((paramInt1 == -1) || (paramInt1 <= b))
        {
          f = v;
          if ((f == -1.0F) || (f <= c))
          {
            paramInt1 = i;
            if ((paramInt1 == -1) || (paramInt1 <= d))
            {
              bool1 = true;
              break label169;
            }
          }
        }
      }
    }
    bool1 = false;
    label169:
    s = bool1;
    if (paramBoolean)
    {
      paramJ = r;
      paramInt1 = t;
      if ((paramInt1 == -1) || (paramInt1 >= e))
      {
        paramInt1 = u;
        if ((paramInt1 == -1) || (paramInt1 >= f))
        {
          f = v;
          if ((f == -1.0F) || (f >= g))
          {
            paramInt1 = i;
            if ((paramInt1 == -1) || (paramInt1 >= h))
            {
              paramBoolean = true;
              break label277;
            }
          }
        }
      }
    }
    paramBoolean = false;
    label277:
    u = paramBoolean;
    v = Z0.k(paramInt3, false);
    paramJ = r;
    float f = v;
    if ((f != -1.0F) && (f >= 10.0F)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    w = paramBoolean;
    x = i;
    y = paramJ.d();
    A = n.y(r.f, m);
    paramInt1 = r.f;
    if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    B = paramBoolean;
    for (paramInt1 = 0; paramInt1 < l.size(); paramInt1++)
    {
      paramJ = r.n;
      if ((paramJ != null) && (paramJ.equals(l.get(paramInt1)))) {
        break label462;
      }
    }
    paramInt1 = Integer.MAX_VALUE;
    label462:
    z = paramInt1;
    if (Z0.g(paramInt3) == 128) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    E = paramBoolean;
    if (Z0.i(paramInt3) == 64) {
      paramBoolean = bool2;
    } else {
      paramBoolean = false;
    }
    F = paramBoolean;
    G = n.z(r.n);
    D = p(paramInt3, paramInt2);
  }
  
  public static int l(j paramj1, j paramj2)
  {
    X2.n localn1 = X2.n.j().g(v, v).d(A, A).g(B, B).g(w, w).g(s, s).g(u, u).f(Integer.valueOf(z), Integer.valueOf(z), P.d().g()).g(E, E).g(F, F);
    X2.n localn2 = localn1;
    if (E)
    {
      localn2 = localn1;
      if (F) {
        localn2 = localn1.d(G, G);
      }
    }
    return localn2.i();
  }
  
  public static int m(j paramj1, j paramj2)
  {
    P localP;
    if ((s) && (v)) {
      localP = n.A();
    } else {
      localP = n.A().g();
    }
    X2.n localn1 = X2.n.j();
    X2.n localn2 = localn1;
    if (t.y) {
      localn2 = localn1.f(Integer.valueOf(x), Integer.valueOf(x), n.A().g());
    }
    return localn2.f(Integer.valueOf(y), Integer.valueOf(y), localP).f(Integer.valueOf(x), Integer.valueOf(x), localP).i();
  }
  
  public static int n(List paramList1, List paramList2)
  {
    return X2.n.j().f((j)Collections.max(paramList1, new v()), (j)Collections.max(paramList2, new v()), new v()).d(paramList1.size(), paramList2.size()).f((j)Collections.max(paramList1, new w()), (j)Collections.max(paramList2, new w()), new w()).i();
  }
  
  public static X2.v o(int paramInt1, J paramJ, n.e parame, int[] paramArrayOfInt, int paramInt2)
  {
    int i = n.x(paramJ, i, j, k);
    v.a locala = X2.v.M();
    for (int j = 0; j < a; j++)
    {
      int k = paramJ.a(j).d();
      boolean bool;
      if ((i != Integer.MAX_VALUE) && ((k == -1) || (k > i))) {
        bool = false;
      } else {
        bool = true;
      }
      locala.h(new j(paramInt1, paramJ, j, parame, paramArrayOfInt[j], paramInt2, bool));
    }
    return locala.k();
  }
  
  public int c()
  {
    return D;
  }
  
  public final int p(int paramInt1, int paramInt2)
  {
    if ((r.f & 0x4000) != 0) {
      return 0;
    }
    if (!Z0.k(paramInt1, t.u0)) {
      return 0;
    }
    if ((!s) && (!t.j0)) {
      return 0;
    }
    if ((Z0.k(paramInt1, false)) && (u) && (s) && (r.i != -1))
    {
      n.e locale = t;
      if ((!z) && (!y) && ((paramInt1 & paramInt2) != 0)) {
        return 2;
      }
    }
    paramInt1 = 1;
    return paramInt1;
  }
  
  public boolean r(j paramj)
  {
    boolean bool;
    if (((!C) && (!M.c(r.n, r.n))) || ((!t.m0) && ((E != E) || (F != F)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     A0.n.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */