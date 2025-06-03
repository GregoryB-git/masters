package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class de
{
  private static final int[] a = { 2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048 };
  
  public static int a(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[16];
    int i = paramByteBuffer.position();
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer.position(i);
    return avzd;
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = 7;
    if (i < 7) {
      return -1;
    }
    i = (paramArrayOfByte[2] & 0xFF) << 8 | paramArrayOfByte[3] & 0xFF;
    if (i == 65535) {
      i = (paramArrayOfByte[4] & 0xFF) << 16 | (paramArrayOfByte[5] & 0xFF) << 8 | paramArrayOfByte[6] & 0xFF;
    } else {
      j = 4;
    }
    int k = j;
    if (paramInt == 44097) {
      k = j + 2;
    }
    return i + k;
  }
  
  public static bw a(vy paramvy, String paramString1, String paramString2, fe paramfe)
  {
    paramvy.d(1);
    int i;
    if ((paramvy.e() & 0x20) >> 5 == 1) {
      i = 48000;
    } else {
      i = 44100;
    }
    return bw.a(paramString1, "audio/ac4", null, -1, -1, 2, i, null, paramfe, 0, paramString2);
  }
  
  public static dd a(vz paramvz)
  {
    int i = paramvz.c(16);
    int j = paramvz.c(16);
    if (j == 65535)
    {
      j = paramvz.c(24);
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
    int m = paramvz.c(2);
    int n = 0;
    i = m;
    if (m == 3)
    {
      for (k = 0;; k = k + 1 << 2)
      {
        k = paramvz.c(2) + k;
        if (!paramvz.d()) {
          break;
        }
      }
      i = m + k;
    }
    int i1 = paramvz.c(10);
    if ((paramvz.d()) && (paramvz.c(3) > 0)) {
      paramvz.b(2);
    }
    if (paramvz.d()) {
      m = 48000;
    } else {
      m = 44100;
    }
    int i2 = paramvz.c(4);
    if ((m == 44100) && (i2 == 13))
    {
      k = a[i2];
    }
    else
    {
      k = n;
      if (m == 48000)
      {
        paramvz = a;
        k = n;
        if (i2 < paramvz.length)
        {
          n = paramvz[i2];
          k = i1 % 5;
          if (k != 1)
          {
            if (k != 2)
            {
              if (k == 3) {
                break label285;
              }
              if (k != 4)
              {
                k = n;
                break label306;
              }
              if ((i2 == 3) || (i2 == 8)) {
                break label301;
              }
              k = n;
              if (i2 != 11) {
                break label306;
              }
            }
            else
            {
              if (i2 == 8) {
                break label301;
              }
              k = n;
              if (i2 != 11) {
                break label306;
              }
            }
            break label301;
          }
          label285:
          if (i2 != 3)
          {
            k = n;
            if (i2 != 8) {}
          }
          else
          {
            label301:
            k = n + 1;
          }
        }
      }
    }
    label306:
    return new dd(i, 2, m, j, k, (byte)0);
  }
  
  public static void a(int paramInt, vy paramvy)
  {
    paramvy.a(7);
    paramvy = a;
    paramvy[0] = ((byte)-84);
    paramvy[1] = ((byte)64);
    paramvy[2] = ((byte)-1);
    paramvy[3] = ((byte)-1);
    paramvy[4] = ((byte)(byte)(paramInt >> 16));
    paramvy[5] = ((byte)(byte)(paramInt >> 8));
    paramvy[6] = ((byte)(byte)paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.de
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */