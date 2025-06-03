package F0;

import d0.A;
import g0.o;
import g0.y;

public abstract class a
{
  public static final int[] a = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  public static final int[] b = { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
  
  public static byte[] a(int paramInt1, int paramInt2, int paramInt3)
  {
    return new byte[] { (byte)(paramInt1 << 3 & 0xF8 | paramInt2 >> 1 & 0x7), (byte)(paramInt2 << 7 & 0x80 | paramInt3 << 3 & 0x78) };
  }
  
  public static int b(y paramy)
  {
    int i = paramy.h(5);
    int j = i;
    if (i == 31) {
      j = paramy.h(6) + 32;
    }
    return j;
  }
  
  public static int c(y paramy)
  {
    int i = paramy.h(4);
    if (i == 15)
    {
      if (paramy.b() >= 24) {
        i = paramy.h(24);
      } else {
        throw A.a("AAC header insufficient data", null);
      }
    }
    else
    {
      if (i >= 13) {
        break label52;
      }
      i = a[i];
    }
    return i;
    label52:
    throw A.a("AAC header wrong Sampling Frequency Index", null);
  }
  
  public static b d(y paramy, boolean paramBoolean)
  {
    int i = b(paramy);
    int j = c(paramy);
    int k = paramy.h(4);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("mp4a.40.");
    ((StringBuilder)localObject).append(i);
    localObject = ((StringBuilder)localObject).toString();
    int m;
    if (i != 5)
    {
      m = i;
      n = k;
      if (i != 29) {}
    }
    else
    {
      int i1 = c(paramy);
      i = b(paramy);
      m = i;
      j = i1;
      n = k;
      if (i == 22)
      {
        n = paramy.h(4);
        j = i1;
        m = i;
      }
    }
    if (paramBoolean)
    {
      if ((m != 1) && (m != 2) && (m != 3) && (m != 4) && (m != 6) && (m != 7) && (m != 17)) {
        switch (m)
        {
        default: 
          paramy = new StringBuilder();
          paramy.append("Unsupported audio object type: ");
          paramy.append(m);
          throw A.d(paramy.toString());
        }
      }
      f(paramy, m, n);
      switch (m)
      {
      case 18: 
      default: 
        break;
      case 17: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
        m = paramy.h(2);
        if ((m == 2) || (m == 3))
        {
          paramy = new StringBuilder();
          paramy.append("Unsupported epConfig: ");
          paramy.append(m);
          throw A.d(paramy.toString());
        }
        break;
      }
    }
    int n = b[n];
    if (n != -1) {
      return new b(j, n, (String)localObject, null);
    }
    throw A.a(null, null);
  }
  
  public static b e(byte[] paramArrayOfByte)
  {
    return d(new y(paramArrayOfByte), false);
  }
  
  public static void f(y paramy, int paramInt1, int paramInt2)
  {
    if (paramy.g()) {
      o.h("AacUtil", "Unexpected frameLengthFlag = 1");
    }
    if (paramy.g()) {
      paramy.r(14);
    }
    boolean bool = paramy.g();
    if (paramInt2 != 0)
    {
      if ((paramInt1 == 6) || (paramInt1 == 20)) {
        paramy.r(3);
      }
      if (bool)
      {
        if (paramInt1 == 22) {
          paramy.r(16);
        }
        if ((paramInt1 == 17) || (paramInt1 == 19) || (paramInt1 == 20) || (paramInt1 == 23)) {
          paramy.r(3);
        }
        paramy.r(1);
      }
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public static final class b
  {
    public final int a;
    public final int b;
    public final String c;
    
    public b(int paramInt1, int paramInt2, String paramString)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     F0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */