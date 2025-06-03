package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class vu
{
  public static final byte[] a = { 0, 0, 0, 1 };
  public static final float[] b = { 1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 2.1818182F, 1.8181819F, 2.909091F, 2.4242425F, 1.6363636F, 1.3636364F, 1.939394F, 1.6161616F, 1.3333334F, 1.5F, 2.0F };
  private static final Object c = new Object();
  private static int[] d = new int[10];
  
  public static int a(byte[] paramArrayOfByte, int paramInt)
  {
    localObject = c;
    int i = 0;
    int j = i;
    for (;;)
    {
      int k;
      if (i < paramInt)
      {
        while (i < paramInt - 2)
        {
          if ((paramArrayOfByte[i] == 0) && (paramArrayOfByte[(i + 1)] == 0) && (paramArrayOfByte[(i + 2)] == 3))
          {
            k = i;
            break label61;
          }
          i++;
        }
        k = paramInt;
        label61:
        i = k;
        if (k >= paramInt) {
          continue;
        }
      }
      int m;
      int n;
      try
      {
        int[] arrayOfInt = d;
        if (arrayOfInt.length <= j) {
          d = Arrays.copyOf(arrayOfInt, arrayOfInt.length << 1);
        }
        d[j] = k;
        i = k + 3;
        j++;
      }
      finally {}
    }
    m = paramInt - j;
    n = 0;
    paramInt = n;
    i = paramInt;
    k = paramInt;
    for (paramInt = n; paramInt < j; paramInt++)
    {
      n = d[paramInt] - i;
      System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, n);
      k += n;
      int i1 = k + 1;
      paramArrayOfByte[k] = ((byte)0);
      k = i1 + 1;
      paramArrayOfByte[i1] = ((byte)0);
      i += n + 3;
    }
    System.arraycopy(paramArrayOfByte, i, paramArrayOfByte, k, m - k);
    return m;
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean[] paramArrayOfBoolean)
  {
    int i = paramInt2 - paramInt1;
    boolean bool1 = false;
    boolean bool2;
    if (i >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    rp.c(bool2);
    if (i == 0) {
      return paramInt2;
    }
    if (paramArrayOfBoolean != null)
    {
      if (paramArrayOfBoolean[0] != 0)
      {
        a(paramArrayOfBoolean);
        return paramInt1 - 3;
      }
      if ((i > 1) && (paramArrayOfBoolean[1] != 0) && (paramArrayOfByte[paramInt1] == 1))
      {
        a(paramArrayOfBoolean);
        return paramInt1 - 2;
      }
      if ((i > 2) && (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[paramInt1] == 0) && (paramArrayOfByte[(paramInt1 + 1)] == 1))
      {
        a(paramArrayOfBoolean);
        return paramInt1 - 1;
      }
    }
    int j = paramInt2 - 1;
    paramInt1 += 2;
    while (paramInt1 < j)
    {
      int k = paramArrayOfByte[paramInt1];
      int m = paramInt1;
      if ((k & 0xFE) == 0)
      {
        m = paramInt1 - 2;
        if ((paramArrayOfByte[m] == 0) && (paramArrayOfByte[(paramInt1 - 1)] == 0) && (k == 1))
        {
          if (paramArrayOfBoolean != null) {
            a(paramArrayOfBoolean);
          }
          return m;
        }
        m = paramInt1 - 2;
      }
      paramInt1 = m + 3;
    }
    if (paramArrayOfBoolean != null)
    {
      if (i > 2)
      {
        if ((paramArrayOfByte[(paramInt2 - 3)] == 0) && (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[j] == 1)) {}
      }
      else {
        while (i == 2 ? (paramArrayOfBoolean[2] == 0) || (paramArrayOfByte[(paramInt2 - 2)] != 0) || (paramArrayOfByte[j] != 1) : (paramArrayOfBoolean[1] == 0) || (paramArrayOfByte[j] != 1))
        {
          bool2 = false;
          break;
        }
      }
      bool2 = true;
      paramArrayOfBoolean[0] = bool2;
      if (i > 1 ? (paramArrayOfByte[(paramInt2 - 2)] == 0) && (paramArrayOfByte[j] == 0) : (paramArrayOfBoolean[2] != 0) && (paramArrayOfByte[j] == 0)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      paramArrayOfBoolean[1] = bool2;
      bool2 = bool1;
      if (paramArrayOfByte[j] == 0) {
        bool2 = true;
      }
      paramArrayOfBoolean[2] = bool2;
    }
    return paramInt2;
  }
  
  public static vw a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new wb(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte.a(8);
    int i = paramArrayOfByte.c(8);
    int j = paramArrayOfByte.c(8);
    int k = paramArrayOfByte.c(8);
    int m = paramArrayOfByte.d();
    int n = 1;
    int i1 = 1;
    int i2;
    boolean bool1;
    if ((i != 100) && (i != 110) && (i != 122) && (i != 244) && (i != 44) && (i != 83) && (i != 86) && (i != 118) && (i != 128) && (i != 138))
    {
      i2 = 1;
      bool1 = false;
    }
    else
    {
      i3 = paramArrayOfByte.d();
      if (i3 == 3) {
        bool2 = paramArrayOfByte.b();
      } else {
        bool2 = false;
      }
      paramArrayOfByte.d();
      paramArrayOfByte.d();
      paramArrayOfByte.a();
      i2 = i3;
      bool1 = bool2;
      if (paramArrayOfByte.b())
      {
        if (i3 != 3) {
          paramInt2 = 8;
        } else {
          paramInt2 = 12;
        }
        for (i4 = 0;; i4++)
        {
          i2 = i3;
          bool1 = bool2;
          if (i4 >= paramInt2) {
            break;
          }
          if (paramArrayOfByte.b())
          {
            if (i4 < 6) {
              i2 = 16;
            } else {
              i2 = 64;
            }
            i5 = 8;
            i6 = i5;
            i7 = 0;
            while (i7 < i2)
            {
              paramInt1 = i5;
              if (i5 != 0) {
                paramInt1 = (paramArrayOfByte.e() + i6 + 256) % 256;
              }
              if (paramInt1 != 0) {
                i6 = paramInt1;
              }
              i7++;
              i5 = paramInt1;
            }
          }
        }
      }
    }
    int i5 = paramArrayOfByte.d();
    int i3 = paramArrayOfByte.d();
    if (i3 == 0)
    {
      paramInt1 = paramArrayOfByte.d() + 4;
    }
    else
    {
      if (i3 == 1)
      {
        bool2 = paramArrayOfByte.b();
        paramArrayOfByte.e();
        paramArrayOfByte.e();
        long l = paramArrayOfByte.d();
        for (paramInt1 = 0; paramInt1 < l; paramInt1++) {
          paramArrayOfByte.d();
        }
        paramInt2 = 0;
        break label393;
      }
      paramInt1 = 0;
    }
    boolean bool2 = false;
    paramInt2 = paramInt1;
    label393:
    paramArrayOfByte.d();
    paramArrayOfByte.a();
    int i4 = paramArrayOfByte.d();
    paramInt1 = paramArrayOfByte.d();
    boolean bool3 = paramArrayOfByte.b();
    if (!bool3) {
      paramArrayOfByte.a();
    }
    paramArrayOfByte.a();
    int i6 = i4 + 1 << 4;
    int i7 = (true - bool3) * (paramInt1 + 1) << 4;
    i4 = i6;
    paramInt1 = i7;
    if (paramArrayOfByte.b())
    {
      int i8 = paramArrayOfByte.d();
      int i9 = paramArrayOfByte.d();
      int i10 = paramArrayOfByte.d();
      int i11 = paramArrayOfByte.d();
      if (i2 == 0)
      {
        paramInt1 = true - bool3;
        i2 = n;
      }
      else
      {
        if (i2 == 3) {
          paramInt1 = 1;
        } else {
          paramInt1 = 2;
        }
        i4 = i1;
        if (i2 == 1) {
          i4 = 2;
        }
        i4 = (true - bool3) * i4;
        i2 = paramInt1;
        paramInt1 = i4;
      }
      i4 = i6 - (i8 + i9) * i2;
      paramInt1 = i7 - (i10 + i11) * paramInt1;
    }
    float f1 = 1.0F;
    float f2 = f1;
    if (paramArrayOfByte.b())
    {
      f2 = f1;
      if (paramArrayOfByte.b())
      {
        i2 = paramArrayOfByte.c(8);
        if (i2 == 255)
        {
          i2 = paramArrayOfByte.c(16);
          i6 = paramArrayOfByte.c(16);
          f2 = f1;
          if (i2 != 0)
          {
            f2 = f1;
            if (i6 != 0) {
              f2 = i2 / i6;
            }
          }
        }
        else
        {
          paramArrayOfByte = b;
          if (i2 < paramArrayOfByte.length)
          {
            f2 = paramArrayOfByte[i2];
          }
          else
          {
            paramArrayOfByte = new StringBuilder(46);
            paramArrayOfByte.append("Unexpected aspect_ratio_idc value: ");
            paramArrayOfByte.append(i2);
            Log.w("NalUnitUtil", paramArrayOfByte.toString());
            f2 = f1;
          }
        }
      }
    }
    return new vw(i, j, k, m, i4, paramInt1, f2, bool1, bool3, i5 + 4, i3, paramInt2, bool2);
  }
  
  public static void a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = 0;
    int k = j;
    for (;;)
    {
      int m = j + 1;
      if (m >= i) {
        break;
      }
      int n = paramByteBuffer.get(j) & 0xFF;
      int i1;
      if (k == 3)
      {
        i1 = k;
        if (n == 1)
        {
          i1 = k;
          if ((paramByteBuffer.get(m) & 0x1F) == 7)
          {
            ByteBuffer localByteBuffer = paramByteBuffer.duplicate();
            localByteBuffer.position(j - 3);
            localByteBuffer.limit(i);
            paramByteBuffer.position(0);
            paramByteBuffer.put(localByteBuffer);
          }
        }
      }
      else
      {
        i1 = k;
        if (n == 0) {
          i1 = k + 1;
        }
      }
      k = i1;
      if (n != 0) {
        k = 0;
      }
      j = m;
    }
    paramByteBuffer.clear();
  }
  
  public static void a(boolean[] paramArrayOfBoolean)
  {
    paramArrayOfBoolean[0] = false;
    paramArrayOfBoolean[1] = false;
    paramArrayOfBoolean[2] = false;
  }
  
  public static boolean a(String paramString, byte paramByte)
  {
    return (("video/avc".equals(paramString)) && ((paramByte & 0x1F) == 6)) || (("video/hevc".equals(paramString)) && ((paramByte & 0x7E) >> 1 == 39));
  }
  
  public static int b(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 3)] & 0x1F;
  }
  
  public static vx b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new wb(paramArrayOfByte, 3, paramInt2);
    paramArrayOfByte.a(8);
    paramInt2 = paramArrayOfByte.d();
    paramInt1 = paramArrayOfByte.d();
    paramArrayOfByte.a();
    return new vx(paramInt2, paramInt1, paramArrayOfByte.b());
  }
  
  public static int c(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[(paramInt + 3)] & 0x7E) >> 1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */