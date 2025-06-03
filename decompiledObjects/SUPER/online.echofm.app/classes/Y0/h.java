package Y0;

import F0.I.a;
import F0.M.a;
import F0.N;
import g0.M;
import g0.o;
import g0.z;

public final class h
  implements g
{
  public final long[] a;
  public final long[] b;
  public final long c;
  public final long d;
  public final int e;
  
  public h(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong1, long paramLong2, int paramInt)
  {
    a = paramArrayOfLong1;
    b = paramArrayOfLong2;
    c = paramLong1;
    d = paramLong2;
    e = paramInt;
  }
  
  public static h a(long paramLong1, long paramLong2, I.a parama, z paramz)
  {
    paramz.U(10);
    int i = paramz.p();
    if (i <= 0) {
      return null;
    }
    int j = d;
    long l1 = i;
    if (j >= 32000) {
      i = 1152;
    } else {
      i = 576;
    }
    long l2 = M.W0(l1, i * 1000000L, j);
    int k = paramz.M();
    j = paramz.M();
    int m = paramz.M();
    paramz.U(2);
    long l3 = paramLong2 + c;
    long[] arrayOfLong1 = new long[k];
    long[] arrayOfLong2 = new long[k];
    int n = 0;
    l1 = paramLong2;
    paramLong2 = l3;
    while (n < k)
    {
      arrayOfLong1[n] = (n * l2 / k);
      arrayOfLong2[n] = Math.max(l1, paramLong2);
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 4) {
              return null;
            }
            i = paramz.K();
          }
          else
          {
            i = paramz.J();
          }
        }
        else {
          i = paramz.M();
        }
      }
      else {
        i = paramz.G();
      }
      l1 += i * j;
      n++;
    }
    if ((paramLong1 != -1L) && (paramLong1 != l1))
    {
      paramz = new StringBuilder();
      paramz.append("VBRI data size mismatch: ");
      paramz.append(paramLong1);
      paramz.append(", ");
      paramz.append(l1);
      o.h("VbriSeeker", paramz.toString());
    }
    return new h(arrayOfLong1, arrayOfLong2, l2, l1, f);
  }
  
  public long c(long paramLong)
  {
    return a[M.h(b, paramLong, true, true)];
  }
  
  public long f()
  {
    return d;
  }
  
  public boolean h()
  {
    return true;
  }
  
  public M.a j(long paramLong)
  {
    int i = M.h(a, paramLong, true, true);
    N localN = new N(a[i], b[i]);
    if ((a < paramLong) && (i != a.length - 1))
    {
      long[] arrayOfLong = a;
      i++;
      return new M.a(localN, new N(arrayOfLong[i], b[i]));
    }
    return new M.a(localN);
  }
  
  public int k()
  {
    return e;
  }
  
  public long l()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     Y0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */