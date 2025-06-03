package c4;

import v5.m;
import v5.u;

public final class b
{
  public static void a(long paramLong, u paramu, v[] paramArrayOfv)
  {
    for (;;)
    {
      int i = c;
      int j = b;
      int k = 1;
      if (i - j <= 1) {
        break;
      }
      i = 0;
      do
      {
        if (c - b == 0)
        {
          i = -1;
          break;
        }
        m = paramu.v();
        j = i + m;
        i = j;
      } while (m == 255);
      i = j;
      int m = 0;
      int n;
      do
      {
        if (c - b == 0)
        {
          j = -1;
          break;
        }
        n = paramu.v();
        j = m + n;
        m = j;
      } while (n == 255);
      m = b;
      int i1 = m + j;
      if ((j != -1) && (j <= c - m))
      {
        n = i1;
        if (i == 4)
        {
          n = i1;
          if (j >= 8)
          {
            i = paramu.v();
            n = paramu.A();
            if (n == 49) {
              j = paramu.f();
            } else {
              j = 0;
            }
            m = paramu.v();
            if (n == 47) {
              paramu.H(1);
            }
            if ((i == 181) && ((n == 49) || (n == 47)) && (m == 3)) {
              i = 1;
            } else {
              i = 0;
            }
            m = i;
            if (n == 49)
            {
              if (j == 1195456820) {
                j = k;
              } else {
                j = 0;
              }
              m = i & j;
            }
            n = i1;
            if (m != 0)
            {
              b(paramLong, paramu, paramArrayOfv);
              n = i1;
            }
          }
        }
      }
      else
      {
        m.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
        n = c;
      }
      paramu.G(n);
    }
  }
  
  public static void b(long paramLong, u paramu, v[] paramArrayOfv)
  {
    int i = paramu.v();
    int j = 0;
    if ((i & 0x40) != 0) {
      k = 1;
    } else {
      k = 0;
    }
    if (k == 0) {
      return;
    }
    paramu.H(1);
    int m = (i & 0x1F) * 3;
    int n = b;
    i = paramArrayOfv.length;
    for (int k = j; k < i; k++)
    {
      v localv = paramArrayOfv[k];
      paramu.G(n);
      localv.b(m, paramu);
      if (paramLong != -9223372036854775807L) {
        localv.c(paramLong, 1, m, 0, null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     c4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */