package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class dc
{
  private static final int[] a = { 1, 2, 3, 6 };
  private static final int[] b = { 48000, 44100, 32000 };
  private static final int[] c = { 24000, 22050, 16000 };
  private static final int[] d = { 2, 1, 2, 3, 3, 4, 4, 5 };
  private static final int[] e = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
  private static final int[] f = { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
  
  public static int a()
  {
    return 1536;
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    int i = paramInt2 / 2;
    if (paramInt1 >= 0)
    {
      int[] arrayOfInt1 = b;
      if ((paramInt1 < arrayOfInt1.length) && (paramInt2 >= 0))
      {
        int[] arrayOfInt2 = f;
        if (i < arrayOfInt2.length)
        {
          paramInt1 = arrayOfInt1[paramInt1];
          if (paramInt1 == 44100) {
            return (paramInt2 % 2 + arrayOfInt2[i]) * 2;
          }
          paramInt2 = e[i];
          if (paramInt1 == 32000) {
            return paramInt2 * 6;
          }
          return paramInt2 * 4;
        }
      }
    }
    return -1;
  }
  
  public static int a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get(paramByteBuffer.position() + 4);
    int j = 6;
    if ((i & 0xC0) >> 6 != 3) {
      j = a[((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4)];
    }
    return j * 256;
  }
  
  public static int a(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i;
    if ((paramByteBuffer.get(paramByteBuffer.position() + paramInt + 7) & 0xFF) == 187) {
      i = 1;
    } else {
      i = 0;
    }
    int j = paramByteBuffer.position();
    if (i != 0) {
      i = 9;
    } else {
      i = 8;
    }
    return 40 << (paramByteBuffer.get(j + paramInt + i) >> 4 & 0x7);
  }
  
  public static int a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 6) {
      return -1;
    }
    if ((paramArrayOfByte[5] & 0xFF) >> 3 == 16) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      i = paramArrayOfByte[2];
      return (paramArrayOfByte[3] & 0xFF | (i & 0x7) << 8) + 1 << 1;
    }
    int i = paramArrayOfByte[4];
    return a((i & 0xC0) >> 6, i & 0x3F);
  }
  
  public static bw a(vy paramvy, String paramString1, String paramString2, fe paramfe)
  {
    int i = paramvy.e();
    int j = b[((i & 0xC0) >> 6)];
    int k = paramvy.e();
    int m = d[((k & 0x38) >> 3)];
    i = m;
    if ((k & 0x4) != 0) {
      i = m + 1;
    }
    return bw.a(paramString1, "audio/ac3", null, -1, -1, i, j, null, paramfe, 0, paramString2);
  }
  
  public static db a(vz paramvz)
  {
    int i = paramvz.b();
    paramvz.b(40);
    int j;
    if (paramvz.c(5) == 16) {
      j = 1;
    } else {
      j = 0;
    }
    paramvz.a(i);
    i = -1;
    int n;
    int i7;
    int i6;
    int i2;
    if (j != 0)
    {
      paramvz.b(16);
      j = paramvz.c(2);
      if (j != 0)
      {
        if (j != 1)
        {
          if (j != 2) {
            j = i;
          } else {
            j = 2;
          }
        }
        else {
          j = 1;
        }
      }
      else {
        j = 0;
      }
      paramvz.b(3);
      int k = paramvz.c(11);
      int m = paramvz.c(2);
      if (m == 3)
      {
        i = c[paramvz.c(2)];
        n = 6;
        i1 = 3;
      }
      else
      {
        i1 = paramvz.c(2);
        n = a[i1];
        i = b[m];
      }
      int i3 = n * 256;
      int i4 = paramvz.c(3);
      int i5 = paramvz.d();
      i7 = d[i4] + i5;
      paramvz.b(10);
      if (paramvz.d()) {
        paramvz.b(8);
      }
      if (i4 == 0)
      {
        paramvz.b(5);
        if (paramvz.d()) {
          paramvz.b(8);
        }
      }
      if ((j == 1) && (paramvz.d())) {
        paramvz.b(16);
      }
      if (paramvz.d())
      {
        if (i4 > 2) {
          paramvz.b(2);
        }
        if (((i4 & 0x1) != 0) && (i4 > 2)) {
          paramvz.b(6);
        }
        if ((i4 & 0x4) != 0) {
          paramvz.b(6);
        }
        if ((i5 != 0) && (paramvz.d())) {
          paramvz.b(5);
        }
        if (j == 0)
        {
          if (paramvz.d()) {
            paramvz.b(6);
          }
          if ((i4 == 0) && (paramvz.d())) {
            paramvz.b(6);
          }
          if (paramvz.d()) {
            paramvz.b(6);
          }
          i6 = paramvz.c(2);
          if (i6 == 1)
          {
            paramvz.b(5);
          }
          else if (i6 == 2)
          {
            paramvz.b(12);
          }
          else if (i6 == 3)
          {
            i6 = paramvz.c(5);
            if (paramvz.d())
            {
              paramvz.b(5);
              if (paramvz.d()) {
                paramvz.b(4);
              }
              if (paramvz.d()) {
                paramvz.b(4);
              }
              if (paramvz.d()) {
                paramvz.b(4);
              }
              if (paramvz.d()) {
                paramvz.b(4);
              }
              if (paramvz.d()) {
                paramvz.b(4);
              }
              if (paramvz.d()) {
                paramvz.b(4);
              }
              if (paramvz.d()) {
                paramvz.b(4);
              }
              if (paramvz.d())
              {
                if (paramvz.d()) {
                  paramvz.b(4);
                }
                if (paramvz.d()) {
                  paramvz.b(4);
                }
              }
            }
            if (paramvz.d())
            {
              paramvz.b(5);
              if (paramvz.d())
              {
                paramvz.b(7);
                if (paramvz.d()) {
                  paramvz.b(8);
                }
              }
            }
            paramvz.b((i6 + 2) * 8);
            paramvz.e();
          }
          if (i4 < 2)
          {
            if (paramvz.d()) {
              paramvz.b(14);
            }
            if ((i4 == 0) && (paramvz.d())) {
              paramvz.b(14);
            }
          }
          if (paramvz.d()) {
            if (i1 == 0) {
              paramvz.b(5);
            } else {
              for (i6 = 0; i6 < n; i6++) {
                if (paramvz.d()) {
                  paramvz.b(5);
                }
              }
            }
          }
        }
      }
      if (paramvz.d())
      {
        paramvz.b(5);
        if (i4 == 2) {
          paramvz.b(4);
        }
        if (i4 >= 6) {
          paramvz.b(2);
        }
        if (paramvz.d()) {
          paramvz.b(8);
        }
        if ((i4 == 0) && (paramvz.d())) {
          paramvz.b(8);
        }
        if (m < 3) {
          paramvz.c();
        }
      }
      if ((j == 0) && (i1 != 3)) {
        paramvz.c();
      }
      if ((j == 2) && ((i1 == 3) || (paramvz.d()))) {
        paramvz.b(6);
      }
      if ((paramvz.d()) && (paramvz.c(6) == 1) && (paramvz.c(8) == 1)) {
        paramvz = "audio/eac3-joc";
      } else {
        paramvz = "audio/eac3";
      }
      n = k + 1 << 1;
      int i1 = i;
      i6 = i3;
      i = i7;
    }
    else
    {
      paramvz.b(32);
      j = paramvz.c(2);
      String str;
      if (j == 3) {
        str = null;
      } else {
        str = "audio/ac3";
      }
      n = a(j, paramvz.c(6));
      paramvz.b(8);
      i = paramvz.c(3);
      if (((i & 0x1) != 0) && (i != 1)) {
        paramvz.b(2);
      }
      if ((i & 0x4) != 0) {
        paramvz.b(2);
      }
      if (i == 2) {
        paramvz.b(2);
      }
      int[] arrayOfInt = b;
      if (j < arrayOfInt.length) {
        j = arrayOfInt[j];
      } else {
        j = -1;
      }
      i6 = 1536;
      i2 = paramvz.d();
      i = d[i] + i2;
      i7 = -1;
      i2 = j;
      j = i7;
      paramvz = str;
    }
    return new db(paramvz, j, i, i2, n, i6, (byte)0);
  }
  
  public static int b(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    for (int k = i; k <= j - 10; k++) {
      if ((paramByteBuffer.getInt(k + 4) & 0xFEFFFFFF) == -1167101192) {
        return k - i;
      }
    }
    return -1;
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[4];
    int j = 0;
    if ((i == -8) && (paramArrayOfByte[5] == 114) && (paramArrayOfByte[6] == 111))
    {
      i = paramArrayOfByte[7];
      if ((i & 0xFE) == 186)
      {
        if ((i & 0xFF) == 187) {
          j = 1;
        }
        if (j != 0) {
          j = 9;
        } else {
          j = 8;
        }
        return 40 << (paramArrayOfByte[j] >> 4 & 0x7);
      }
    }
    return 0;
  }
  
  public static bw b(vy paramvy, String paramString1, String paramString2, fe paramfe)
  {
    paramvy.d(2);
    int i = paramvy.e();
    int j = b[((i & 0xC0) >> 6)];
    int k = paramvy.e();
    int m = d[((k & 0xE) >> 1)];
    i = m;
    if ((k & 0x1) != 0) {
      i = m + 1;
    }
    m = i;
    if ((paramvy.e() & 0x1E) >> 1 > 0)
    {
      m = i;
      if ((0x2 & paramvy.e()) != 0) {
        m = i + 2;
      }
    }
    if ((paramvy.b() > 0) && ((paramvy.e() & 0x1) != 0)) {
      paramvy = "audio/eac3-joc";
    } else {
      paramvy = "audio/eac3";
    }
    return bw.a(paramString1, paramvy, null, -1, -1, m, j, null, paramfe, 0, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.dc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */