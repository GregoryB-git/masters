package X0;

import F0.s;
import g0.z;

public final class f
{
  public final z a = new z(8);
  public int b;
  
  public final long a(s params)
  {
    byte[] arrayOfByte = a.e();
    int i = 0;
    params.n(arrayOfByte, 0, 1);
    int j = a.e()[0] & 0xFF;
    if (j == 0) {
      return Long.MIN_VALUE;
    }
    int k = 128;
    for (int m = 0; (j & k) == 0; m++) {
      k >>= 1;
    }
    k = j & k;
    params.n(a.e(), 1, m);
    while (i < m)
    {
      params = a.e();
      i++;
      k = (params[i] & 0xFF) + (k << 8);
    }
    b += m + 1;
    return k;
  }
  
  public boolean b(s params)
  {
    long l1 = params.a();
    boolean bool1 = l1 < -1L;
    long l2 = 1024L;
    long l3 = l2;
    if (bool1) {
      if (l1 > 1024L) {
        l3 = l2;
      } else {
        l3 = l1;
      }
    }
    int i = (int)l3;
    byte[] arrayOfByte = a.e();
    boolean bool3 = false;
    params.n(arrayOfByte, 0, 4);
    l3 = a.I();
    b = 4;
    while (l3 != 440786851L)
    {
      int k = b + 1;
      b = k;
      if (k == i) {
        return false;
      }
      params.n(a.e(), 0, 1);
      l3 = l3 << 8 & 0xFFFFFFFFFFFFFF00 | a.e()[0] & 0xFF;
    }
    l3 = a(params);
    l2 = b;
    boolean bool4 = bool3;
    if (l3 != Long.MIN_VALUE) {
      if ((bool1) && (l2 + l3 >= l1))
      {
        bool4 = bool3;
      }
      else
      {
        int j;
        for (;;)
        {
          i = b;
          long l4 = i;
          l1 = l2 + l3;
          if (l4 >= l1) {
            break label310;
          }
          if (a(params) == Long.MIN_VALUE) {
            return false;
          }
          l1 = a(params);
          boolean bool2 = l1 < 0L;
          if ((bool2) || (l1 > 2147483647L)) {
            break;
          }
          if (bool2)
          {
            j = (int)l1;
            params.o(j);
            b += j;
          }
        }
        return false;
        label310:
        bool4 = bool3;
        if (j == l1) {
          bool4 = true;
        }
      }
    }
    return bool4;
  }
}

/* Location:
 * Qualified Name:     X0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */