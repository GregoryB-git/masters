package k0;

import g0.M;

public final class t0$d
  implements Comparable
{
  public final V0 o;
  public int p;
  public long q;
  public Object r;
  
  public t0$d(V0 paramV0)
  {
    o = paramV0;
  }
  
  public int c(d paramd)
  {
    Object localObject = r;
    int i = 1;
    if (localObject == null) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if (r == null) {
      k = 1;
    } else {
      k = 0;
    }
    if (j != k)
    {
      j = i;
      if (localObject != null) {
        j = -1;
      }
      return j;
    }
    if (localObject == null) {
      return 0;
    }
    int j = p - p;
    if (j != 0) {
      return j;
    }
    return M.n(q, q);
  }
  
  public void e(int paramInt, long paramLong, Object paramObject)
  {
    p = paramInt;
    q = paramLong;
    r = paramObject;
  }
}

/* Location:
 * Qualified Name:     k0.t0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */