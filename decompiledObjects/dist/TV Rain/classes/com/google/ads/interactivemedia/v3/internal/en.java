package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class en
{
  private static final int[] a = { 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8 };
  private static final int[] b = { -1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1 };
  private static final int[] c = { 64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680 };
  
  public static int a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.get(i);
    if (j != -2)
    {
      if (j != -1)
      {
        if (j != 31)
        {
          j = (paramByteBuffer.get(i + 4) & 0x1) << 6;
          i = paramByteBuffer.get(i + 5);
          break label128;
        }
        j = (paramByteBuffer.get(i + 5) & 0x7) << 4;
        i = paramByteBuffer.get(i + 6);
      }
      else
      {
        j = (paramByteBuffer.get(i + 4) & 0x7) << 4;
        i = paramByteBuffer.get(i + 7);
      }
      i &= 0x3C;
      break label134;
    }
    else
    {
      j = (paramByteBuffer.get(i + 5) & 0x1) << 6;
      i = paramByteBuffer.get(i + 4);
    }
    label128:
    i &= 0xFC;
    label134:
    return (i >> 2 | j) + 1 << 5;
  }
  
  public static int a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0];
    int j;
    if (i != -2)
    {
      if (i != -1)
      {
        if (i != 31)
        {
          i = (paramArrayOfByte[4] & 0x1) << 6;
          j = paramArrayOfByte[5];
          break label89;
        }
        i = (paramArrayOfByte[5] & 0x7) << 4;
        j = paramArrayOfByte[6];
      }
      else
      {
        i = (paramArrayOfByte[4] & 0x7) << 4;
        j = paramArrayOfByte[7];
      }
      j &= 0x3C;
      break label95;
    }
    else
    {
      i = (paramArrayOfByte[5] & 0x1) << 6;
      j = paramArrayOfByte[4];
    }
    label89:
    j &= 0xFC;
    label95:
    return (j >> 2 | i) + 1 << 5;
  }
  
  public static bw a(byte[] paramArrayOfByte, String paramString1, String paramString2, fe paramfe)
  {
    int i = 0;
    int j = paramArrayOfByte[0];
    int k = -1;
    if (j == 127)
    {
      paramArrayOfByte = new vz(paramArrayOfByte);
    }
    else
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
      j = arrayOfByte[0];
      if ((j != -2) && (j != -1)) {
        j = 0;
      } else {
        j = 1;
      }
      if (j != 0) {
        for (j = 0; j < arrayOfByte.length - 1; j += 2)
        {
          m = arrayOfByte[j];
          n = j + 1;
          arrayOfByte[j] = ((byte)arrayOfByte[n]);
          arrayOfByte[n] = ((byte)m);
        }
      }
      paramArrayOfByte = new vz(arrayOfByte);
      if (arrayOfByte[0] == 31)
      {
        paramfe = new vz(arrayOfByte);
        while (paramfe.a() >= 16)
        {
          paramfe.b(2);
          paramArrayOfByte.a(paramfe.c(14), 14);
        }
      }
      paramArrayOfByte.a(arrayOfByte, arrayOfByte.length);
    }
    paramArrayOfByte.b(60);
    j = paramArrayOfByte.c(6);
    int m = a[j];
    j = paramArrayOfByte.c(4);
    int n = b[j];
    j = paramArrayOfByte.c(5);
    paramfe = c;
    if (j >= paramfe.length) {
      j = k;
    } else {
      j = paramfe[j] * 1000 / 2;
    }
    paramArrayOfByte.b(10);
    if (paramArrayOfByte.c(2) > 0) {
      i = 1;
    }
    return bw.a(paramString1, "audio/vnd.dts", null, j, -1, m + i, n, null, null, 0, paramString2);
  }
  
  public static boolean a(int paramInt)
  {
    return (paramInt == 2147385345) || (paramInt == -25230976) || (paramInt == 536864768) || (paramInt == -14745368);
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte[0];
    if (j != -2)
    {
      if (j != -1)
      {
        if (j != 31)
        {
          k = (paramArrayOfByte[5] & 0x3) << 12 | (paramArrayOfByte[6] & 0xFF) << 4;
          j = paramArrayOfByte[7];
          break label147;
        }
        k = (paramArrayOfByte[6] & 0x3) << 12 | (paramArrayOfByte[7] & 0xFF) << 4;
        j = paramArrayOfByte[8];
      }
      else
      {
        k = (paramArrayOfByte[7] & 0x3) << 12 | (paramArrayOfByte[6] & 0xFF) << 4;
        j = paramArrayOfByte[9];
      }
      j = ((j & 0x3C) >> 2 | k) + 1;
      k = 1;
      break label161;
    }
    else
    {
      k = (paramArrayOfByte[4] & 0x3) << 12 | (paramArrayOfByte[7] & 0xFF) << 4;
      j = paramArrayOfByte[6];
    }
    label147:
    j = ((j & 0xF0) >> 4 | k) + 1;
    int k = i;
    label161:
    i = j;
    if (k != 0) {
      i = (j << 4) / 14;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.en
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */