package m0;

import Z2.d;
import a3.f;
import g0.M;
import java.math.RoundingMode;

public class a0
  implements N.e
{
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  
  public a0(a parama)
  {
    b = a.a(parama);
    c = a.b(parama);
    d = a.c(parama);
    e = a.d(parama);
    f = a.e(parama);
    g = a.f(parama);
    h = a.g(parama);
  }
  
  public static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    return f.d(paramInt1 * paramInt2 * paramInt3 / 1000000L);
  }
  
  public static int d(int paramInt)
  {
    if (paramInt != 20)
    {
      if (paramInt != 30) {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            throw new IllegalArgumentException();
          case 17: 
            return 336000;
          case 16: 
            return 256000;
          case 15: 
            return 8000;
          case 14: 
            return 3062500;
          }
        case 12: 
          return 7000;
        case 11: 
          return 16000;
        case 10: 
          return 100000;
        case 9: 
          return 40000;
        case 7: 
          return 192000;
        case 6: 
          return 768000;
        case 5: 
          return 80000;
        }
      }
      return 2250000;
    }
    return 63750;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble)
  {
    return (Math.max(paramInt1, (int)(c(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6) * paramDouble)) + paramInt4 - 1) / paramInt4 * paramInt4;
  }
  
  public int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if (paramInt3 != 0)
    {
      if (paramInt3 != 1)
      {
        if (paramInt3 == 2) {
          return f(paramInt2, paramInt6);
        }
        throw new IllegalArgumentException();
      }
      return e(paramInt2);
    }
    return g(paramInt1, paramInt5, paramInt4);
  }
  
  public int e(int paramInt)
  {
    paramInt = d(paramInt);
    return f.d(f * paramInt / 1000000L);
  }
  
  public int f(int paramInt1, int paramInt2)
  {
    int i = e;
    if (paramInt1 == 5) {}
    for (int j = g;; j = h)
    {
      j = i * j;
      break;
      j = i;
      if (paramInt1 != 8) {
        break;
      }
    }
    if (paramInt2 != -1) {
      paramInt1 = d.b(paramInt2, 8, RoundingMode.CEILING);
    } else {
      paramInt1 = d(paramInt1);
    }
    return f.d(j * paramInt1 / 1000000L);
  }
  
  public int g(int paramInt1, int paramInt2, int paramInt3)
  {
    return M.p(paramInt1 * d, b(b, paramInt2, paramInt3), b(c, paramInt2, paramInt3));
  }
  
  public static class a
  {
    public int a = 250000;
    public int b = 750000;
    public int c = 4;
    public int d = 250000;
    public int e = 50000000;
    public int f = 2;
    public int g = 4;
    
    public a0 h()
    {
      return new a0(this);
    }
  }
}

/* Location:
 * Qualified Name:     m0.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */