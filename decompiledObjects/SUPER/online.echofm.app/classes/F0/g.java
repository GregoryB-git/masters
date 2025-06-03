package F0;

import g0.a;
import g0.o;
import g0.z;

public abstract class g
{
  public static void a(long paramLong, z paramz, T[] paramArrayOfT)
  {
    for (;;)
    {
      int i = paramz.a();
      int j = 1;
      if (i <= 1) {
        break;
      }
      int k = c(paramz);
      int m = c(paramz);
      int n = paramz.f() + m;
      if ((m != -1) && (m <= paramz.a()))
      {
        i = n;
        if (k == 4)
        {
          i = n;
          if (m >= 8)
          {
            i = paramz.G();
            int i1 = paramz.M();
            if (i1 == 49) {
              k = paramz.p();
            } else {
              k = 0;
            }
            m = paramz.G();
            if (i1 == 47) {
              paramz.U(1);
            }
            if ((i == 181) && ((i1 == 49) || (i1 == 47)) && (m == 3)) {
              i = 1;
            } else {
              i = 0;
            }
            m = i;
            if (i1 == 49)
            {
              if (k == 1195456820) {
                k = j;
              } else {
                k = 0;
              }
              m = i & k;
            }
            i = n;
            if (m != 0)
            {
              b(paramLong, paramz, paramArrayOfT);
              i = n;
            }
          }
        }
      }
      else
      {
        o.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
        i = paramz.g();
      }
      paramz.T(i);
    }
  }
  
  public static void b(long paramLong, z paramz, T[] paramArrayOfT)
  {
    int i = paramz.G();
    if ((i & 0x40) != 0)
    {
      paramz.U(1);
      int j = (i & 0x1F) * 3;
      int k = paramz.f();
      int m = paramArrayOfT.length;
      for (i = 0; i < m; i++)
      {
        T localT = paramArrayOfT[i];
        paramz.T(k);
        localT.e(paramz, j);
        boolean bool;
        if (paramLong != -9223372036854775807L) {
          bool = true;
        } else {
          bool = false;
        }
        a.f(bool);
        localT.b(paramLong, 1, j, 0, null);
      }
    }
  }
  
  public static int c(z paramz)
  {
    int i = 0;
    int j;
    int k;
    do
    {
      if (paramz.a() == 0) {
        return -1;
      }
      j = paramz.G();
      k = i + j;
      i = k;
    } while (j == 255);
    return k;
  }
}

/* Location:
 * Qualified Name:     F0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */