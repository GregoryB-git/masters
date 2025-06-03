package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import z2;

public final class vg
{
  private static final byte[] a = { 0, 0, 0, 1 };
  private static final int[] b = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  private static final int[] c = { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
  
  private static int a(vz paramvz)
  {
    int i = paramvz.c(5);
    int j = i;
    if (i == 31) {
      j = paramvz.c(6) + 32;
    }
    return j;
  }
  
  public static Pair<Integer, Integer> a(vz paramvz, boolean paramBoolean)
    throws ce
  {
    int i = a(paramvz);
    int j = b(paramvz);
    int k = paramvz.c(4);
    int m;
    if (i != 5)
    {
      m = i;
      n = k;
      if (i != 29) {}
    }
    else
    {
      i = b(paramvz);
      int i1 = a(paramvz);
      m = i1;
      j = i;
      n = k;
      if (i1 == 22)
      {
        n = paramvz.c(4);
        j = i;
        m = i1;
      }
    }
    boolean bool = true;
    if (paramBoolean)
    {
      if ((m != 1) && (m != 2) && (m != 3) && (m != 4) && (m != 6) && (m != 7) && (m != 17)) {
        switch (m)
        {
        default: 
          throw new ce(z2.k(42, "Unsupported audio object type: ", m));
        }
      }
      paramvz.b(1);
      if (paramvz.d()) {
        paramvz.b(14);
      }
      paramBoolean = paramvz.d();
      if (n != 0)
      {
        if ((m == 6) || (m == 20)) {
          paramvz.b(3);
        }
        if (paramBoolean)
        {
          if (m == 22) {
            paramvz.b(16);
          }
          if ((m == 17) || (m == 19) || (m == 20) || (m == 23)) {
            paramvz.b(3);
          }
          paramvz.b(1);
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
          m = paramvz.c(2);
          if ((m != 2) && (m != 3)) {
            break;
          }
          throw new ce(z2.k(33, "Unsupported epConfig: ", m));
        }
      }
      else
      {
        throw new UnsupportedOperationException();
      }
    }
    int n = c[n];
    if (n != -1) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    rp.b(paramBoolean);
    return Pair.create(Integer.valueOf(j), Integer.valueOf(n));
  }
  
  public static Pair<Integer, Integer> a(byte[] paramArrayOfByte)
    throws ce
  {
    return a(new vz(paramArrayOfByte), false);
  }
  
  public static byte[] a(int paramInt1, int paramInt2, int paramInt3)
  {
    return new byte[] { (byte)(paramInt1 << 3 & 0xF8 | paramInt2 >> 1 & 0x7), (byte)(paramInt2 << 7 & 0x80 | paramInt3 << 3 & 0x78) };
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramInt2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte2, arrayOfByte1.length, paramInt2);
    return arrayOfByte2;
  }
  
  private static int b(vz paramvz)
  {
    int i = paramvz.c(4);
    if (i == 15)
    {
      i = paramvz.c(24);
    }
    else
    {
      boolean bool;
      if (i < 13) {
        bool = true;
      } else {
        bool = false;
      }
      rp.b(bool);
      i = b[i];
    }
    return i;
  }
  
  public static String b(int paramInt1, int paramInt2, int paramInt3)
  {
    return String.format("avc1.%02X%02X%02X", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */