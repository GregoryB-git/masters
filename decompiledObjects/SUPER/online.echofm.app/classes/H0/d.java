package H0;

import g0.M;
import g0.o;
import g0.z;

public final class d
  implements a
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  
  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
    f = paramInt6;
  }
  
  public static d d(z paramz)
  {
    int i = paramz.t();
    paramz.U(12);
    int j = paramz.t();
    int k = paramz.t();
    int m = paramz.t();
    paramz.U(4);
    int n = paramz.t();
    int i1 = paramz.t();
    paramz.U(8);
    return new d(i, j, k, m, n, i1);
  }
  
  public int a()
  {
    return 1752331379;
  }
  
  public long b()
  {
    return M.W0(e, c * 1000000L, d);
  }
  
  public int c()
  {
    int i = a;
    if (i != 1935960438)
    {
      if (i != 1935963489)
      {
        if (i != 1937012852)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Found unsupported streamType fourCC: ");
          localStringBuilder.append(Integer.toHexString(a));
          o.h("AviStreamHeaderChunk", localStringBuilder.toString());
          return -1;
        }
        return 3;
      }
      return 1;
    }
    return 2;
  }
}

/* Location:
 * Qualified Name:     H0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */