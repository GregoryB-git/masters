package A0;

import X2.n;
import d0.q;
import k0.Z0;

public final class n$d
  implements Comparable
{
  public final boolean o;
  public final boolean p;
  
  public n$d(q paramq, int paramInt)
  {
    int i = e;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    o = bool;
    p = Z0.k(paramInt, false);
  }
  
  public int c(d paramd)
  {
    return n.j().g(p, p).g(o, o).i();
  }
}

/* Location:
 * Qualified Name:     A0.n.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */