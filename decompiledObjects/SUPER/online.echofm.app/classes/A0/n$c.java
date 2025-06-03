package A0;

import X2.v;
import X2.v.a;
import d0.J;
import d0.q;
import java.util.List;
import k0.Z0;

public final class n$c
  extends n.i
  implements Comparable
{
  public final int s;
  public final int t;
  
  public n$c(int paramInt1, J paramJ, int paramInt2, n.e parame, int paramInt3)
  {
    super(paramInt1, paramJ, paramInt2);
    s = Z0.k(paramInt3, u0);
    t = r.d();
  }
  
  public static int h(List paramList1, List paramList2)
  {
    return ((c)paramList1.get(0)).j((c)paramList2.get(0));
  }
  
  public static v l(int paramInt, J paramJ, n.e parame, int[] paramArrayOfInt)
  {
    v.a locala = v.M();
    for (int i = 0; i < a; i++) {
      locala.h(new c(paramInt, paramJ, i, parame, paramArrayOfInt[i]));
    }
    return locala.k();
  }
  
  public int c()
  {
    return s;
  }
  
  public int j(c paramc)
  {
    return Integer.compare(t, t);
  }
  
  public boolean m(c paramc)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     A0.n.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */