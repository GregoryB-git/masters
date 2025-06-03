package x3;

import f;
import v3.a1;
import v5.m;
import v5.t;

public final class a
{
  public static final int[] a = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  public static final int[] b = { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
  
  public static byte[] a(int paramInt1, int paramInt2, int paramInt3)
  {
    return new byte[] { (byte)(paramInt1 << 3 & 0xF8 | paramInt2 >> 1 & 0x7), (byte)(paramInt2 << 7 & 0x80 | paramInt3 << 3 & 0x78) };
  }
  
  public static int b(t paramt)
  {
    int i = paramt.g(4);
    if (i == 15)
    {
      if (paramt.b() >= 24) {
        i = paramt.g(24);
      } else {
        throw a1.a("AAC header insufficient data", null);
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
    throw a1.a("AAC header wrong Sampling Frequency Index", null);
  }
  
  public static a c(t paramt, boolean paramBoolean)
  {
    int i = paramt.g(5);
    int j = i;
    if (i == 31) {
      j = paramt.g(6) + 32;
    }
    i = b(paramt);
    int k = paramt.g(4);
    String str = f.h("mp4a.40.", j);
    int m;
    int n;
    if (j != 5)
    {
      m = j;
      n = k;
      if (j != 29) {}
    }
    else
    {
      int i1 = b(paramt);
      i = paramt.g(5);
      j = i;
      if (i == 31) {
        j = paramt.g(6) + 32;
      }
      m = j;
      i = i1;
      n = k;
      if (j == 22)
      {
        n = paramt.g(4);
        i = i1;
        m = j;
      }
    }
    if (paramBoolean)
    {
      if ((m != 1) && (m != 2) && (m != 3) && (m != 4) && (m != 6) && (m != 7) && (m != 17)) {
        switch (m)
        {
        default: 
          paramt = new StringBuilder();
          paramt.append("Unsupported audio object type: ");
          paramt.append(m);
          throw a1.c(paramt.toString());
        }
      }
      if (paramt.f()) {
        m.f("AacUtil", "Unexpected frameLengthFlag = 1");
      }
      if (paramt.f()) {
        paramt.m(14);
      }
      paramBoolean = paramt.f();
      if (n != 0)
      {
        if ((m == 6) || (m == 20)) {
          paramt.m(3);
        }
        if (paramBoolean)
        {
          if (m == 22) {
            paramt.m(16);
          }
          if ((m == 17) || (m == 19) || (m == 20) || (m == 23)) {
            paramt.m(3);
          }
          paramt.m(1);
        }
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
          j = paramt.g(2);
          if ((j != 2) && (j != 3)) {
            break;
          }
          paramt = new StringBuilder();
          paramt.append("Unsupported epConfig: ");
          paramt.append(j);
          throw a1.c(paramt.toString());
        }
      }
      else
      {
        throw new UnsupportedOperationException();
      }
    }
    j = b[n];
    if (j != -1) {
      return new a(i, j, str);
    }
    throw a1.a(null, null);
  }
  
  public static final class a
  {
    public final int a;
    public final int b;
    public final String c;
    
    public a(int paramInt1, int paramInt2, String paramString)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     x3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */