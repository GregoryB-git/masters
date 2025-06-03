package F0;

import d0.A;
import d0.m;
import d0.q;
import d0.q.b;
import g0.M;
import g0.y;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class p
{
  public static final int[] a = { 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8 };
  public static final int[] b = { -1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1 };
  public static final int[] c = { 64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680 };
  public static final int[] d = { 8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000 };
  public static final int[] e = { 5, 8, 10, 12 };
  public static final int[] f = { 6, 9, 12, 15 };
  public static final int[] g = { 2, 4, 6, 8 };
  public static final int[] h = { 9, 11, 13, 16 };
  public static final int[] i = { 5, 8, 10, 12 };
  
  public static void a(byte[] paramArrayOfByte, int paramInt)
  {
    int j = paramInt - 2;
    int k = paramArrayOfByte[j];
    if ((paramArrayOfByte[(paramInt - 1)] & 0xFF | k << 8 & 0xFFFF) == M.v(paramArrayOfByte, 0, j, 65535)) {
      return;
    }
    throw A.a("CRC check failed", null);
  }
  
  public static int b(byte[] paramArrayOfByte)
  {
    int j = 0;
    int k = paramArrayOfByte[0];
    if (k != -2) {
      if (k != -1) {
        if (k != 31) {
          k = (paramArrayOfByte[5] & 0x3) << 12 | (paramArrayOfByte[6] & 0xFF) << 4;
        }
      }
    }
    for (int m = paramArrayOfByte[7];; m = paramArrayOfByte[6])
    {
      k = ((m & 0xF0) >> 4 | k) + 1;
      m = j;
      break;
      k = (paramArrayOfByte[6] & 0x3) << 12 | (paramArrayOfByte[7] & 0xFF) << 4;
      for (m = paramArrayOfByte[8];; m = paramArrayOfByte[9])
      {
        k = ((m & 0x3C) >> 2 | k) + 1;
        m = 1;
        break;
        k = (paramArrayOfByte[7] & 0x3) << 12 | (paramArrayOfByte[6] & 0xFF) << 4;
      }
      k = (paramArrayOfByte[4] & 0x3) << 12 | (paramArrayOfByte[7] & 0xFF) << 4;
    }
    j = k;
    if (m != 0) {
      j = k * 16 / 14;
    }
    return j;
  }
  
  public static int c(int paramInt)
  {
    if ((paramInt != 2147385345) && (paramInt != -25230976) && (paramInt != 536864768) && (paramInt != -14745368))
    {
      if ((paramInt != 1683496997) && (paramInt != 622876772))
      {
        if ((paramInt != 1078008818) && (paramInt != -233094848))
        {
          if ((paramInt != 1908687592) && (paramInt != -398277519)) {
            return 0;
          }
          return 4;
        }
        return 3;
      }
      return 2;
    }
    return 1;
  }
  
  public static y d(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte[0];
    if ((j != 127) && (j != 100) && (j != 64) && (j != 113))
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte, paramArrayOfByte.length);
      if (e(arrayOfByte)) {
        for (j = 0; j < arrayOfByte.length - 1; j += 2)
        {
          int k = arrayOfByte[j];
          int m = j + 1;
          arrayOfByte[j] = ((byte)arrayOfByte[m]);
          arrayOfByte[m] = ((byte)k);
        }
      }
      paramArrayOfByte = new y(arrayOfByte);
      if (arrayOfByte[0] == 31)
      {
        y localy = new y(arrayOfByte);
        while (localy.b() >= 16)
        {
          localy.r(2);
          paramArrayOfByte.f(localy.h(14), 14);
        }
      }
      paramArrayOfByte.n(arrayOfByte);
      return paramArrayOfByte;
    }
    return new y(paramArrayOfByte);
  }
  
  public static boolean e(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    int j = paramArrayOfByte[0];
    if ((j == -2) || (j == -1) || (j == 37) || (j == -14) || (j == -24)) {
      bool = true;
    }
    return bool;
  }
  
  public static int f(ByteBuffer paramByteBuffer)
  {
    if ((paramByteBuffer.getInt(0) != -233094848) && (paramByteBuffer.getInt(0) != -398277519))
    {
      if (paramByteBuffer.getInt(0) == 622876772) {
        return 4096;
      }
      int j = paramByteBuffer.position();
      int k = paramByteBuffer.get(j);
      if (k != -2) {
        if (k != -1) {
          if (k != 31)
          {
            k = (paramByteBuffer.get(j + 4) & 0x1) << 6;
            j += 5;
          }
        }
      }
      for (;;)
      {
        j = paramByteBuffer.get(j) & 0xFC;
        break;
        k = (paramByteBuffer.get(j + 5) & 0x7) << 4;
        j += 6;
        for (;;)
        {
          j = paramByteBuffer.get(j) & 0x3C;
          break;
          k = (paramByteBuffer.get(j + 4) & 0x7) << 4;
          j += 7;
        }
        k = (paramByteBuffer.get(j + 5) & 0x1) << 6;
        j += 4;
      }
      return ((j >> 2 | k) + 1) * 32;
    }
    return 1024;
  }
  
  public static int g(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte[0];
    if (j != -2) {
      if (j != -1) {
        if (j != 31) {
          j = (paramArrayOfByte[4] & 0x1) << 6;
        }
      }
    }
    for (int k = paramArrayOfByte[5];; k = paramArrayOfByte[4])
    {
      k &= 0xFC;
      break;
      j = (paramArrayOfByte[5] & 0x7) << 4;
      for (k = paramArrayOfByte[6];; k = paramArrayOfByte[7])
      {
        k &= 0x3C;
        break;
        j = (paramArrayOfByte[4] & 0x7) << 4;
      }
      j = (paramArrayOfByte[5] & 0x1) << 6;
    }
    return ((k >> 2 | j) + 1) * 32;
  }
  
  public static q h(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt, m paramm)
  {
    paramArrayOfByte = d(paramArrayOfByte);
    paramArrayOfByte.r(60);
    int j = paramArrayOfByte.h(6);
    int k = a[j];
    j = paramArrayOfByte.h(4);
    int m = b[j];
    j = paramArrayOfByte.h(5);
    int[] arrayOfInt = c;
    if (j >= arrayOfInt.length) {
      j = -1;
    } else {
      j = arrayOfInt[j] * 1000 / 2;
    }
    paramArrayOfByte.r(10);
    int n;
    if (paramArrayOfByte.h(2) > 0) {
      n = 1;
    } else {
      n = 0;
    }
    return new q.b().a0(paramString1).o0("audio/vnd.dts").M(j).N(k + n).p0(m).U(paramm).e0(paramString2).m0(paramInt).K();
  }
  
  public static b i(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = d(paramArrayOfByte);
    paramArrayOfByte.r(40);
    int j = paramArrayOfByte.h(2);
    int k;
    if (!paramArrayOfByte.g())
    {
      k = 16;
      m = 8;
    }
    else
    {
      k = 20;
      m = 12;
    }
    paramArrayOfByte.r(m);
    int n = paramArrayOfByte.h(k);
    boolean bool = paramArrayOfByte.g();
    int m = 0;
    int i1 = 0;
    int i2;
    int i3;
    if (bool)
    {
      i2 = paramArrayOfByte.h(2);
      i3 = paramArrayOfByte.h(3);
      if (paramArrayOfByte.g()) {
        paramArrayOfByte.r(36);
      }
      m = paramArrayOfByte.h(3);
      int i4 = paramArrayOfByte.h(3);
      if ((m + 1 == 1) && (i4 + 1 == 1))
      {
        i4 = j + 1;
        j = paramArrayOfByte.h(i4);
        for (m = 0; m < i4; m++) {
          if ((j >> m & 0x1) == 1) {
            paramArrayOfByte.r(8);
          }
        }
        if (paramArrayOfByte.g())
        {
          paramArrayOfByte.r(2);
          j = paramArrayOfByte.h(2);
          i4 = paramArrayOfByte.h(2);
          for (m = i1; m < i4 + 1; m++) {
            paramArrayOfByte.r(j + 1 << 2);
          }
        }
        m = (i3 + 1) * 512;
      }
      else
      {
        throw A.d("Multiple audio presentations or assets not supported");
      }
    }
    else
    {
      i2 = -1;
    }
    paramArrayOfByte.r(k);
    paramArrayOfByte.r(12);
    if (bool)
    {
      if (paramArrayOfByte.g()) {
        paramArrayOfByte.r(4);
      }
      if (paramArrayOfByte.g()) {
        paramArrayOfByte.r(24);
      }
      if (paramArrayOfByte.g()) {
        paramArrayOfByte.s(paramArrayOfByte.h(10) + 1);
      }
      paramArrayOfByte.r(5);
      i3 = d[paramArrayOfByte.h(4)];
      i1 = paramArrayOfByte.h(8) + 1;
    }
    else
    {
      i3 = -2147483647;
      i1 = -1;
    }
    if (bool) {
      if (i2 != 0)
      {
        if (i2 != 1)
        {
          if (i2 == 2)
          {
            k = 48000;
          }
          else
          {
            paramArrayOfByte = new StringBuilder();
            paramArrayOfByte.append("Unsupported reference clock code in DTS HD header: ");
            paramArrayOfByte.append(i2);
            throw A.a(paramArrayOfByte.toString(), null);
          }
        }
        else {
          k = 44100;
        }
      }
      else {
        k = 32000;
      }
    }
    for (long l = M.W0(m, 1000000L, k);; l = -9223372036854775807L) {
      break;
    }
    return new b("audio/vnd.dts.hd;profile=lbr", i1, i3, n + 1, l, 0, null);
  }
  
  public static int j(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = d(paramArrayOfByte);
    paramArrayOfByte.r(42);
    int j;
    if (paramArrayOfByte.g()) {
      j = 12;
    } else {
      j = 8;
    }
    return paramArrayOfByte.h(j) + 1;
  }
  
  public static b k(byte[] paramArrayOfByte, AtomicInteger paramAtomicInteger)
  {
    y localy = d(paramArrayOfByte);
    int j = localy.h(32);
    int k = 0;
    if (j == 1078008818) {
      m = 1;
    } else {
      m = 0;
    }
    int n = m(localy, e, true) + 1;
    long l;
    if (m != 0) {
      if (localy.g())
      {
        a(paramArrayOfByte, n);
        j = localy.h(2);
        if (j != 0)
        {
          if (j != 1)
          {
            if (j == 2)
            {
              j = 384;
            }
            else
            {
              paramArrayOfByte = new StringBuilder();
              paramArrayOfByte.append("Unsupported base duration index in DTS UHD header: ");
              paramArrayOfByte.append(j);
              throw A.a(paramArrayOfByte.toString(), null);
            }
          }
          else {
            j = 480;
          }
        }
        else {
          j = 512;
        }
        int i1 = localy.h(3);
        i2 = localy.h(2);
        if (i2 != 0)
        {
          if (i2 != 1)
          {
            if (i2 == 2)
            {
              i2 = 48000;
            }
            else
            {
              paramArrayOfByte = new StringBuilder();
              paramArrayOfByte.append("Unsupported clock rate index in DTS UHD header: ");
              paramArrayOfByte.append(i2);
              throw A.a(paramArrayOfByte.toString(), null);
            }
          }
          else {
            i2 = 44100;
          }
        }
        else {
          i2 = 32000;
        }
        if (localy.g()) {
          localy.r(36);
        }
        i3 = (1 << localy.h(2)) * i2;
        l = M.W0(j * (i1 + 1), 1000000L, i2);
        j = i3;
      }
    }
    for (;;)
    {
      break;
      throw A.d("Only supports full channel mask-based audio presentation");
      j = -2147483647;
      l = -9223372036854775807L;
    }
    int i3 = 0;
    int i2 = i3;
    while (i3 < m)
    {
      i2 += m(localy, f, true);
      i3++;
    }
    if (m != 0) {
      paramAtomicInteger.set(m(localy, g, true));
    }
    int m = k;
    if (paramAtomicInteger.get() != 0) {
      m = m(localy, h, true);
    }
    return new b("audio/vnd.dts.uhd;profile=p2", 2, j, n + (i2 + m), l, 0, null);
  }
  
  public static int l(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = d(paramArrayOfByte);
    paramArrayOfByte.r(32);
    return m(paramArrayOfByte, i, true) + 1;
  }
  
  public static int m(y paramy, int[] paramArrayOfInt, boolean paramBoolean)
  {
    int j = 0;
    int k = 0;
    int m = 0;
    int n = m;
    while ((m < 3) && (paramy.g()))
    {
      n++;
      m++;
    }
    m = j;
    if (paramBoolean)
    {
      m = 0;
      while (k < n)
      {
        m += (1 << paramArrayOfInt[k]);
        k++;
      }
    }
    return m + paramy.h(paramArrayOfInt[n]);
  }
  
  public static final class b
  {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    
    public b(String paramString, int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4)
    {
      a = paramString;
      c = paramInt1;
      b = paramInt2;
      d = paramInt3;
      e = paramLong;
      f = paramInt4;
    }
  }
}

/* Location:
 * Qualified Name:     F0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */