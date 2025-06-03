package x3;

import v5.t;
import v5.u;

public final class c
{
  public static final int[] a = { 2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048 };
  
  public static void a(int paramInt, u paramu)
  {
    paramu.D(7);
    paramu = a;
    paramu[0] = ((byte)-84);
    paramu[1] = ((byte)64);
    paramu[2] = ((byte)-1);
    paramu[3] = ((byte)-1);
    paramu[4] = ((byte)(byte)(paramInt >> 16 & 0xFF));
    paramu[5] = ((byte)(byte)(paramInt >> 8 & 0xFF));
    paramu[6] = ((byte)(byte)(paramInt & 0xFF));
  }
  
  public static a b(t paramt)
  {
    int i = paramt.g(16);
    int j = paramt.g(16);
    if (j == 65535)
    {
      j = paramt.g(24);
      k = 7;
    }
    else
    {
      k = 4;
    }
    int k = j + k;
    j = k;
    if (i == 44097) {
      j = k + 2;
    }
    k = paramt.g(2);
    int m = 0;
    if (k == 3) {
      do
      {
        paramt.g(2);
      } while (paramt.f());
    }
    int n = paramt.g(10);
    if ((paramt.f()) && (paramt.g(3) > 0)) {
      paramt.m(2);
    }
    if (paramt.f()) {
      i = 48000;
    } else {
      i = 44100;
    }
    int i1 = paramt.g(4);
    if ((i == 44100) && (i1 == 13))
    {
      k = a[i1];
    }
    else
    {
      k = m;
      if (i == 48000)
      {
        paramt = a;
        k = m;
        if (i1 < 14)
        {
          m = paramt[i1];
          k = n % 5;
          if (k != 1) {
            if (k != 2)
            {
              if (k != 3)
              {
                if (k != 4)
                {
                  k = m;
                  break label279;
                }
                if ((i1 == 3) || (i1 == 8)) {
                  break label274;
                }
                k = m;
                if (i1 != 11) {
                  break label279;
                }
                break label274;
              }
            }
            else
            {
              if (i1 == 8) {
                break label274;
              }
              k = m;
              if (i1 != 11) {
                break label279;
              }
              break label274;
            }
          }
          if (i1 != 3)
          {
            k = m;
            if (i1 != 8) {}
          }
          else
          {
            label274:
            k = m + 1;
          }
        }
      }
    }
    label279:
    return new a(i, j, k);
  }
  
  public static final class a
  {
    public final int a;
    public final int b;
    public final int c;
    
    public a(int paramInt1, int paramInt2, int paramInt3)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
    }
  }
}

/* Location:
 * Qualified Name:     x3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */