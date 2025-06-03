package F0;

import d0.A;
import g0.M;
import g0.z;

public abstract class y
{
  public static boolean a(z paramz, B paramB, int paramInt)
  {
    paramInt = j(paramz, paramInt);
    boolean bool;
    if ((paramInt != -1) && (paramInt <= b)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean b(z paramz, int paramInt)
  {
    int i = paramz.G();
    int j = paramz.f();
    paramz = paramz.e();
    boolean bool = true;
    if (i != M.y(paramz, paramInt, j - 1, 0)) {
      bool = false;
    }
    return bool;
  }
  
  public static boolean c(z paramz, B paramB, boolean paramBoolean, a parama)
  {
    try
    {
      long l = paramz.N();
      if (!paramBoolean) {
        l *= b;
      }
      a = l;
      return true;
    }
    catch (NumberFormatException paramz) {}
    return false;
  }
  
  public static boolean d(z paramz, B paramB, int paramInt, a parama)
  {
    int i = paramz.f();
    long l1 = paramz.I();
    long l2 = l1 >>> 16;
    long l3 = paramInt;
    boolean bool1 = false;
    if (l2 != l3) {
      return false;
    }
    boolean bool2;
    if ((l2 & 1L) == 1L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    int j = (int)(l1 >> 12 & 0xF);
    int k = (int)(l1 >> 8 & 0xF);
    int m = (int)(l1 >> 4 & 0xF);
    int n = (int)(l1 >> 1 & 0x7);
    if ((l1 & 1L) == 1L) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    boolean bool3 = bool1;
    if (g(m, paramB))
    {
      bool3 = bool1;
      if (f(n, paramB))
      {
        bool3 = bool1;
        if (paramInt == 0)
        {
          bool3 = bool1;
          if (c(paramz, paramB, bool2, parama))
          {
            bool3 = bool1;
            if (a(paramz, paramB, j))
            {
              bool3 = bool1;
              if (e(paramz, paramB, k))
              {
                bool3 = bool1;
                if (b(paramz, i)) {
                  bool3 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool3;
  }
  
  public static boolean e(z paramz, B paramB, int paramInt)
  {
    int i = e;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    if (paramInt == 0) {
      return true;
    }
    if (paramInt <= 11)
    {
      if (paramInt != f) {
        bool3 = false;
      }
      return bool3;
    }
    if (paramInt == 12)
    {
      if (paramz.G() * 1000 == i) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    if (paramInt <= 14)
    {
      int j = paramz.M();
      int k = j;
      if (paramInt == 14) {
        k = j * 10;
      }
      if (k == i) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    return false;
  }
  
  public static boolean f(int paramInt, B paramB)
  {
    boolean bool = true;
    if (paramInt == 0) {
      return true;
    }
    if (paramInt != i) {
      bool = false;
    }
    return bool;
  }
  
  public static boolean g(int paramInt, B paramB)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramInt <= 7)
    {
      if (paramInt == g - 1) {
        bool2 = true;
      }
      return bool2;
    }
    bool2 = bool1;
    if (paramInt <= 10)
    {
      bool2 = bool1;
      if (g == 2) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public static boolean h(s params, B paramB, int paramInt, a parama)
  {
    long l = params.m();
    byte[] arrayOfByte = new byte[2];
    params.n(arrayOfByte, 0, 2);
    if (((arrayOfByte[0] & 0xFF) << 8 | arrayOfByte[1] & 0xFF) != paramInt)
    {
      params.h();
      params.o((int)(l - params.p()));
      return false;
    }
    z localz = new z(16);
    System.arraycopy(arrayOfByte, 0, localz.e(), 0, 2);
    localz.S(u.c(params, localz.e(), 2, 14));
    params.h();
    params.o((int)(l - params.p()));
    return d(localz, paramB, paramInt, parama);
  }
  
  public static long i(s params, B paramB)
  {
    params.h();
    boolean bool = true;
    params.o(1);
    Object localObject = new byte[1];
    params.n((byte[])localObject, 0, 1);
    if ((localObject[0] & 0x1) != 1) {
      bool = false;
    }
    params.o(2);
    int i;
    if (bool) {
      i = 7;
    } else {
      i = 6;
    }
    localObject = new z(i);
    ((z)localObject).S(u.c(params, ((z)localObject).e(), 0, i));
    params.h();
    params = new a();
    if (c((z)localObject, paramB, bool, params)) {
      return a;
    }
    throw A.a(null, null);
  }
  
  public static int j(z paramz, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
      return 256 << paramInt - 8;
    case 7: 
      return paramz.M() + 1;
    case 6: 
      return paramz.G() + 1;
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return 576 << paramInt - 2;
    }
    return 192;
  }
  
  public static final class a
  {
    public long a;
  }
}

/* Location:
 * Qualified Name:     F0.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */