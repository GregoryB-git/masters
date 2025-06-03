package A0;

import X2.P;
import X2.v;
import X2.v.a;
import d0.J;
import d0.K;
import d0.q;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.List;
import k0.Z0;

public final class n$h
  extends n.i
  implements Comparable
{
  public final boolean A;
  public final int s;
  public final boolean t;
  public final boolean u;
  public final boolean v;
  public final int w;
  public final int x;
  public final int y;
  public final int z;
  
  public n$h(int paramInt1, J paramJ, int paramInt2, n.e parame, int paramInt3, String paramString)
  {
    super(paramInt1, paramJ, paramInt2);
    int i = 0;
    t = Z0.k(paramInt3, false);
    paramInt1 = r.e & v;
    boolean bool;
    if ((paramInt1 & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    u = bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    v = bool;
    if (t.isEmpty()) {
      paramJ = v.Z("");
    } else {
      paramJ = t;
    }
    for (paramInt1 = 0; paramInt1 < paramJ.size(); paramInt1++)
    {
      paramInt2 = n.G(r, (String)paramJ.get(paramInt1), w);
      if (paramInt2 > 0) {
        break label153;
      }
    }
    paramInt1 = Integer.MAX_VALUE;
    paramInt2 = 0;
    label153:
    w = paramInt1;
    x = paramInt2;
    paramInt1 = n.y(r.f, u);
    y = paramInt1;
    if ((r.f & 0x440) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    A = bool;
    if (n.X(paramString) == null) {
      bool = true;
    } else {
      bool = false;
    }
    int j = n.G(r, paramString, bool);
    z = j;
    if ((paramInt2 <= 0) && ((!t.isEmpty()) || (paramInt1 <= 0)) && (!u) && ((!v) || (j <= 0))) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    paramInt2 = i;
    if (Z0.k(paramInt3, u0))
    {
      paramInt2 = i;
      if (paramInt1 != 0) {
        paramInt2 = 1;
      }
    }
    s = paramInt2;
  }
  
  public static int h(List paramList1, List paramList2)
  {
    return ((h)paramList1.get(0)).j((h)paramList2.get(0));
  }
  
  public static v l(int paramInt, J paramJ, n.e parame, int[] paramArrayOfInt, String paramString)
  {
    v.a locala = v.M();
    for (int i = 0; i < a; i++) {
      locala.h(new h(paramInt, paramJ, i, parame, paramArrayOfInt[i], paramString));
    }
    return locala.k();
  }
  
  public int c()
  {
    return s;
  }
  
  public int j(h paramh)
  {
    X2.n localn = X2.n.j().g(t, t).f(Integer.valueOf(w), Integer.valueOf(w), P.d().g()).d(x, x).d(y, y).g(u, u);
    boolean bool1 = v;
    boolean bool2 = v;
    if (x == 0) {
      localObject = P.d();
    } else {
      localObject = P.d().g();
    }
    localn = localn.f(Boolean.valueOf(bool1), Boolean.valueOf(bool2), (Comparator)localObject).d(z, z);
    Object localObject = localn;
    if (y == 0) {
      localObject = localn.h(A, A);
    }
    return ((X2.n)localObject).i();
  }
  
  public boolean m(h paramh)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     A0.n.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */