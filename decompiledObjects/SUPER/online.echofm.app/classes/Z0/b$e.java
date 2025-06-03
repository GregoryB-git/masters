package Z0;

import d0.q;
import g0.M;
import g0.o;
import g0.z;

public final class b$e
  implements b.c
{
  public final int a;
  public final int b;
  public final z c;
  
  public b$e(a.b paramb, q paramq)
  {
    paramb = b;
    c = paramb;
    paramb.T(12);
    int i = paramb.K();
    int j = i;
    if ("audio/raw".equals(n))
    {
      int k = M.g0(D, B);
      if (i != 0)
      {
        j = i;
        if (i % k == 0) {}
      }
      else
      {
        paramq = new StringBuilder();
        paramq.append("Audio sample size mismatch. stsd sample size: ");
        paramq.append(k);
        paramq.append(", stsz sample size: ");
        paramq.append(i);
        o.h("AtomParsers", paramq.toString());
        j = k;
      }
    }
    i = j;
    if (j == 0) {
      i = -1;
    }
    a = i;
    b = paramb.K();
  }
  
  public int a()
  {
    return a;
  }
  
  public int b()
  {
    return b;
  }
  
  public int c()
  {
    int i = a;
    int j = i;
    if (i == -1) {
      j = c.K();
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     Z0.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */