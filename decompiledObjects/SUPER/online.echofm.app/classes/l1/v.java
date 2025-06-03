package l1;

import Z2.d;
import Z2.e;
import d0.A;
import g0.a;
import g0.y;

public abstract class v
{
  public static int a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if ((paramInt != 2) && (paramInt != 3))
        {
          if (paramInt == 4) {
            return 4096;
          }
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unsupported coreSbrFrameLengthIndex ");
          localStringBuilder.append(paramInt);
          throw A.d(localStringBuilder.toString());
        }
        return 2048;
      }
      return 1024;
    }
    return 768;
  }
  
  public static double b(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unsupported sampling rate ");
      localStringBuilder.append(paramInt);
      throw A.d(localStringBuilder.toString());
    case 44100: 
    case 48000: 
    case 88200: 
    case 96000: 
      return 1.0D;
    case 29400: 
    case 32000: 
    case 58800: 
    case 64000: 
      return 1.5D;
    case 22050: 
    case 24000: 
      return 2.0D;
    }
    return 3.0D;
  }
  
  public static int c(int paramInt)
  {
    switch (paramInt)
    {
    case 13: 
    case 14: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unsupported sampling rate index ");
      localStringBuilder.append(paramInt);
      throw A.d(localStringBuilder.toString());
    case 27: 
      return 9600;
    case 26: 
      return 12800;
    case 25: 
      return 14400;
    case 24: 
      return 17075;
    case 23: 
      return 19200;
    case 22: 
      return 20000;
    case 21: 
      return 25600;
    case 20: 
      return 28800;
    case 19: 
      return 34150;
    case 18: 
      return 38400;
    case 17: 
      return 40000;
    case 16: 
      return 51200;
    case 15: 
      return 57600;
    case 12: 
      return 7350;
    case 11: 
      return 8000;
    case 10: 
      return 11025;
    case 9: 
      return 12000;
    case 8: 
      return 16000;
    case 7: 
      return 22050;
    case 6: 
      return 24000;
    case 5: 
      return 32000;
    case 4: 
      return 44100;
    case 3: 
      return 48000;
    case 2: 
      return 64000;
    case 1: 
      return 88200;
    }
    return 96000;
  }
  
  public static int d(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
    {
      int i = 2;
      if (paramInt != 2)
      {
        i = 3;
        if (paramInt != 3)
        {
          if (paramInt == 4) {
            return 1;
          }
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unsupported coreSbrFrameLengthIndex ");
          localStringBuilder.append(paramInt);
          throw A.d(localStringBuilder.toString());
        }
      }
      return i;
    }
    return 0;
  }
  
  public static boolean e(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0xFFFFFF) == 12583333) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int f(y paramy)
  {
    if (paramy.g())
    {
      paramy.r(2);
      return paramy.h(13);
    }
    return 0;
  }
  
  public static boolean g(y paramy, b paramb)
  {
    paramy.d();
    int i = k(paramy, 3, 8, 8);
    a = i;
    boolean bool = false;
    if (i == -1) {
      return false;
    }
    long l = l(paramy, 2, 8, 32);
    b = l;
    if (l == -1L) {
      return false;
    }
    if (l <= 16L)
    {
      if (l == 0L)
      {
        i = a;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 17) {
              throw A.a("AudioTruncation packet with invalid packet label 0", null);
            }
          }
          else {
            throw A.a("Mpegh3daFrame packet with invalid packet label 0", null);
          }
        }
        else {
          throw A.a("Mpegh3daConfig packet with invalid packet label 0", null);
        }
      }
      i = k(paramy, 11, 24, 24);
      c = i;
      if (i != -1) {
        bool = true;
      }
      return bool;
    }
    paramy = new StringBuilder();
    paramy.append("Contains sub-stream with an invalid packet label ");
    paramy.append(b);
    throw A.d(paramy.toString());
  }
  
  public static c h(y paramy)
  {
    int i = paramy.h(8);
    int j = paramy.h(5);
    if (j == 31) {
      j = paramy.h(24);
    } else {
      j = c(j);
    }
    int k = paramy.h(3);
    int m = a(k);
    k = d(k);
    paramy.r(2);
    p(paramy);
    m(paramy, j(paramy), k);
    boolean bool = paramy.g();
    Object localObject = null;
    byte[] arrayOfByte = null;
    if (bool)
    {
      int n = k(paramy, 2, 4, 8);
      for (k = 0;; k++)
      {
        localObject = arrayOfByte;
        if (k >= n + 1) {
          break;
        }
        int i1 = k(paramy, 4, 8, 16);
        int i2 = k(paramy, 4, 8, 16);
        if (i1 == 7)
        {
          i1 = paramy.h(4) + 1;
          paramy.r(4);
          arrayOfByte = new byte[i1];
          for (i2 = 0; i2 < i1; i2++) {
            arrayOfByte[i2] = ((byte)(byte)paramy.h(8));
          }
        }
        else
        {
          paramy.r(i2 * 8);
        }
      }
    }
    double d = b(j);
    return new c(i, (int)(j * d), (int)(m * d), (byte[])localObject, null);
  }
  
  public static boolean i(y paramy)
  {
    paramy.r(3);
    boolean bool = paramy.g();
    if (bool) {
      paramy.r(13);
    }
    return bool;
  }
  
  public static int j(y paramy)
  {
    int i = paramy.h(5);
    int j = 0;
    int k = 0;
    while (j < i + 1)
    {
      int m = paramy.h(3);
      k += k(paramy, 5, 8, 16) + 1;
      if (((m == 0) || (m == 2)) && (paramy.g())) {
        p(paramy);
      }
      j++;
    }
    return k;
  }
  
  public static int k(y paramy, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool;
    if (Math.max(Math.max(paramInt1, paramInt2), paramInt3) <= 31) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    int i = (1 << paramInt1) - 1;
    int j = (1 << paramInt2) - 1;
    d.a(d.a(i, j), 1 << paramInt3);
    if (paramy.b() < paramInt1) {
      return -1;
    }
    int k = paramy.h(paramInt1);
    paramInt1 = k;
    if (k == i)
    {
      if (paramy.b() < paramInt2) {
        return -1;
      }
      i = paramy.h(paramInt2);
      paramInt2 = k + i;
      paramInt1 = paramInt2;
      if (i == j)
      {
        if (paramy.b() < paramInt3) {
          return -1;
        }
        paramInt1 = paramInt2 + paramy.h(paramInt3);
      }
    }
    return paramInt1;
  }
  
  public static long l(y paramy, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool;
    if (Math.max(Math.max(paramInt1, paramInt2), paramInt3) <= 63) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    long l1 = (1L << paramInt1) - 1L;
    long l2 = (1L << paramInt2) - 1L;
    e.a(e.a(l1, l2), 1L << paramInt3);
    if (paramy.b() < paramInt1) {
      return -1L;
    }
    long l3 = paramy.j(paramInt1);
    long l4 = l3;
    if (l3 == l1)
    {
      if (paramy.b() < paramInt2) {
        return -1L;
      }
      l1 = paramy.j(paramInt2);
      l3 += l1;
      l4 = l3;
      if (l1 == l2)
      {
        if (paramy.b() < paramInt3) {
          return -1L;
        }
        l4 = l3 + paramy.j(paramInt3);
      }
    }
    return l4;
  }
  
  public static void m(y paramy, int paramInt1, int paramInt2)
  {
    int i = k(paramy, 4, 8, 16);
    paramy.q();
    for (int j = 0; j < i + 1; j++)
    {
      int k = paramy.h(2);
      if (k != 0)
      {
        if (k != 1)
        {
          if (k == 3)
          {
            k(paramy, 4, 8, 16);
            k = k(paramy, 4, 8, 16);
            if (paramy.g()) {
              k(paramy, 8, 16, 0);
            }
            paramy.q();
            if (k > 0) {
              paramy.r(k * 8);
            }
          }
        }
        else
        {
          if (i(paramy)) {
            paramy.q();
          }
          if (paramInt2 > 0)
          {
            o(paramy);
            k = paramy.h(2);
          }
          else
          {
            k = 0;
          }
          if (k > 0)
          {
            paramy.r(6);
            m = paramy.h(2);
            paramy.r(4);
            if (paramy.g()) {
              paramy.r(5);
            }
            if ((k == 2) || (k == 3)) {
              paramy.r(6);
            }
            if (m == 2) {
              paramy.q();
            }
          }
          int m = (int)Math.floor(Math.log(paramInt1 - 1) / Math.log(2.0D)) + 1;
          k = paramy.h(2);
          if ((k > 0) && (paramy.g())) {
            paramy.r(m);
          }
          if (paramy.g()) {
            paramy.r(m);
          }
          if ((paramInt2 == 0) && (k == 0)) {
            paramy.q();
          }
        }
      }
      else
      {
        i(paramy);
        if (paramInt2 > 0) {
          o(paramy);
        }
      }
    }
  }
  
  public static void n(y paramy, int paramInt)
  {
    boolean bool = paramy.g();
    int i = 5;
    int j;
    if (bool) {
      j = 1;
    } else {
      j = 5;
    }
    if (bool) {
      i = 7;
    }
    int k;
    if (bool) {
      k = 8;
    } else {
      k = 6;
    }
    int i1;
    for (int m = 0; m < paramInt; m = i1 + 1)
    {
      int n;
      if (paramy.g())
      {
        paramy.r(7);
        n = 0;
      }
      else
      {
        if ((paramy.h(2) == 3) && (paramy.h(i) * j != 0)) {
          paramy.q();
        }
        n = paramy.h(k) * j;
        if ((n != 0) && (n != 180)) {
          paramy.q();
        }
        paramy.q();
      }
      i1 = m;
      if (n != 0)
      {
        i1 = m;
        if (n != 180)
        {
          i1 = m;
          if (paramy.g()) {
            i1 = m + 1;
          }
        }
      }
    }
  }
  
  public static void o(y paramy)
  {
    paramy.r(3);
    paramy.r(8);
    boolean bool1 = paramy.g();
    boolean bool2 = paramy.g();
    if (bool1) {
      paramy.r(5);
    }
    if (bool2) {
      paramy.r(6);
    }
  }
  
  public static void p(y paramy)
  {
    int i = paramy.h(2);
    if (i == 0)
    {
      paramy.r(6);
      return;
    }
    int j = k(paramy, 5, 8, 16) + 1;
    if (i == 1) {
      paramy.r(j * 7);
    } else if (i == 2) {
      n(paramy, j);
    }
  }
  
  public static class b
  {
    public int a;
    public long b;
    public int c;
  }
  
  public static class c
  {
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    
    public c(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     l1.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */