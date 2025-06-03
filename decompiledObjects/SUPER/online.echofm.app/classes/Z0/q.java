package Z0;

import U0.d;
import d0.x;
import d0.x.b;
import g0.z;

public abstract class q
{
  public static int a(int paramInt1, z paramz, int paramInt2)
  {
    if (paramInt1 == 12) {
      return 240;
    }
    if (paramInt1 == 13) {
      return 120;
    }
    if (paramInt1 != 21) {
      return -2147483647;
    }
    if ((paramz.a() >= 8) && (paramz.f() + 8 <= paramInt2))
    {
      paramInt2 = paramz.p();
      paramInt1 = paramz.p();
      if ((paramInt2 >= 12) && (paramInt1 == 1936877170)) {
        return paramz.H();
      }
    }
    return -2147483647;
  }
  
  public static x b(z paramz, int paramInt)
  {
    paramz.U(12);
    while (paramz.f() < paramInt)
    {
      int i = paramz.f();
      int j = paramz.p();
      if (paramz.p() == 1935766900)
      {
        if (j < 16) {
          return null;
        }
        paramz.U(4);
        int k = -1;
        j = 0;
        i = j;
        while (j < 2)
        {
          int m = paramz.G();
          int n = paramz.G();
          int i1;
          if (m == 0)
          {
            i1 = n;
          }
          else
          {
            i1 = k;
            if (m == 1)
            {
              i = n;
              i1 = k;
            }
          }
          j++;
          k = i1;
        }
        paramInt = a(k, paramz, paramInt);
        if (paramInt == -2147483647) {
          return null;
        }
        return new x(new x.b[] { new d(paramInt, i) });
      }
      paramz.T(i + j);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     Z0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */