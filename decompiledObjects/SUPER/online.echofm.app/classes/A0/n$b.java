package A0;

import X2.P;
import X2.v;
import X2.v.a;
import android.text.TextUtils;
import d0.J;
import d0.K;
import d0.K.b;
import d0.q;
import g0.M;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.List;
import k0.Z0;

public final class n$b
  extends n.i
  implements Comparable
{
  public final boolean A;
  public final boolean B;
  public final int C;
  public final int D;
  public final boolean E;
  public final int F;
  public final int G;
  public final int H;
  public final int I;
  public final boolean J;
  public final boolean K;
  public final int s;
  public final boolean t;
  public final String u;
  public final n.e v;
  public final boolean w;
  public final int x;
  public final int y;
  public final int z;
  
  public n$b(int paramInt1, J paramJ, int paramInt2, n.e parame, int paramInt3, boolean paramBoolean, W2.n paramn, int paramInt4)
  {
    super(paramInt1, paramJ, paramInt2);
    v = parame;
    if (s0) {
      paramInt2 = 24;
    } else {
      paramInt2 = 16;
    }
    boolean bool1 = o0;
    boolean bool2 = true;
    if ((bool1) && ((paramInt4 & paramInt2) != 0)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    A = bool1;
    u = n.X(r.d);
    w = Z0.k(paramInt3, false);
    int i;
    int j;
    for (paramInt1 = 0;; paramInt1++)
    {
      paramInt4 = n.size();
      i = Integer.MAX_VALUE;
      if (paramInt1 >= paramInt4) {
        break;
      }
      j = n.G(r, (String)n.get(paramInt1), false);
      if (j > 0)
      {
        paramInt4 = paramInt1;
        paramInt1 = j;
        break label163;
      }
    }
    paramInt1 = 0;
    paramInt4 = Integer.MAX_VALUE;
    label163:
    y = paramInt4;
    x = paramInt1;
    z = n.y(r.f, o);
    paramJ = r;
    paramInt1 = f;
    if ((paramInt1 != 0) && ((paramInt1 & 0x1) == 0)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    B = bool1;
    if ((e & 0x1) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    E = bool1;
    paramInt4 = B;
    F = paramInt4;
    G = C;
    paramInt1 = i;
    H = paramInt1;
    if (((paramInt1 == -1) || (paramInt1 <= q)) && ((paramInt4 == -1) || (paramInt4 <= p)) && (paramn.apply(paramJ))) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    t = bool1;
    paramJ = M.l0();
    for (paramInt1 = 0; paramInt1 < paramJ.length; paramInt1++)
    {
      j = n.G(r, paramJ[paramInt1], false);
      if (j > 0)
      {
        paramInt4 = paramInt1;
        paramInt1 = j;
        break label392;
      }
    }
    paramInt1 = 0;
    paramInt4 = Integer.MAX_VALUE;
    label392:
    C = paramInt4;
    D = paramInt1;
    for (paramInt1 = 0;; paramInt1++)
    {
      paramInt4 = i;
      if (paramInt1 >= r.size()) {
        break;
      }
      paramJ = r.n;
      if ((paramJ != null) && (paramJ.equals(r.get(paramInt1))))
      {
        paramInt4 = paramInt1;
        break;
      }
    }
    I = paramInt4;
    if (Z0.g(paramInt3) == 128) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    J = bool1;
    if (Z0.i(paramInt3) == 64) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    K = bool1;
    s = m(paramInt3, paramBoolean, paramInt2);
  }
  
  public static int h(List paramList1, List paramList2)
  {
    return ((b)Collections.max(paramList1)).j((b)Collections.max(paramList2));
  }
  
  public static v l(int paramInt1, J paramJ, n.e parame, int[] paramArrayOfInt, boolean paramBoolean, W2.n paramn, int paramInt2)
  {
    v.a locala = v.M();
    for (int i = 0; i < a; i++) {
      locala.h(new b(paramInt1, paramJ, i, parame, paramArrayOfInt[i], paramBoolean, paramn, paramInt2));
    }
    return locala.k();
  }
  
  public int c()
  {
    return s;
  }
  
  public int j(b paramb)
  {
    P localP;
    if ((t) && (w)) {
      localP = n.A();
    } else {
      localP = n.A().g();
    }
    X2.n localn1 = X2.n.j().g(w, w).f(Integer.valueOf(y), Integer.valueOf(y), P.d().g()).d(x, x).d(z, z).g(E, E).g(B, B).f(Integer.valueOf(C), Integer.valueOf(C), P.d().g()).d(D, D).g(t, t).f(Integer.valueOf(I), Integer.valueOf(I), P.d().g());
    X2.n localn2 = localn1;
    if (v.y) {
      localn2 = localn1.f(Integer.valueOf(H), Integer.valueOf(H), n.A().g());
    }
    localn1 = localn2.g(J, J).g(K, K).f(Integer.valueOf(F), Integer.valueOf(F), localP).f(Integer.valueOf(G), Integer.valueOf(G), localP);
    localn2 = localn1;
    if (M.c(u, u)) {
      localn2 = localn1.f(Integer.valueOf(H), Integer.valueOf(H), localP);
    }
    return localn2.i();
  }
  
  public final int m(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if (!Z0.k(paramInt1, v.u0)) {
      return 0;
    }
    if ((!t) && (!v.n0)) {
      return 0;
    }
    n.e locale = v;
    int i = s.a;
    int j = 2;
    if ((i == 2) && (!n.B(locale, paramInt1, r))) {
      return 0;
    }
    if ((Z0.k(paramInt1, false)) && (t) && (r.i != -1))
    {
      locale = v;
      if ((!z) && (!y) && ((w0) || (!paramBoolean)) && (s.a != 2) && ((paramInt1 & paramInt2) != 0)) {
        return j;
      }
    }
    paramInt1 = 1;
    return paramInt1;
  }
  
  public boolean n(b paramb)
  {
    int i;
    if (!v.q0)
    {
      i = r.B;
      if ((i == -1) || (i != r.B)) {}
    }
    else
    {
      Object localObject;
      if (!A)
      {
        localObject = r.n;
        if ((localObject == null) || (!TextUtils.equals((CharSequence)localObject, r.n))) {}
      }
      else
      {
        localObject = v;
        if (!p0)
        {
          i = r.C;
          if ((i == -1) || (i != r.C)) {}
        }
        else
        {
          if ((r0) || ((J == J) && (K == K))) {
            break label141;
          }
        }
      }
    }
    boolean bool = false;
    break label144;
    label141:
    bool = true;
    label144:
    return bool;
  }
}

/* Location:
 * Qualified Name:     A0.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */