package F0;

import d0.m;
import d0.q;
import d0.q.b;
import g0.M;
import g0.y;
import g0.z;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class b
{
  public static final int[] a = { 1, 2, 3, 6 };
  public static final int[] b = { 48000, 44100, 32000 };
  public static final int[] c = { 24000, 22050, 16000 };
  public static final int[] d = { 2, 1, 2, 3, 3, 4, 4, 5 };
  public static final int[] e = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
  public static final int[] f = { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return paramInt1 * paramInt2 / (paramInt3 * 32);
  }
  
  public static int b(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    for (int k = i; k <= j - 10; k++) {
      if ((M.O(paramByteBuffer, k + 4) & 0xFFFFFFFE) == -126718022) {
        return k - i;
      }
    }
    return -1;
  }
  
  public static int c(int paramInt1, int paramInt2)
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
            return (arrayOfInt2[i] + paramInt2 % 2) * 2;
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
  
  public static q d(z paramz, String paramString1, String paramString2, m paramm)
  {
    y localy = new y();
    localy.m(paramz);
    int i = localy.h(2);
    int j = b[i];
    localy.r(8);
    int k = d[localy.h(3)];
    i = k;
    if (localy.h(1) != 0) {
      i = k + 1;
    }
    k = localy.h(5);
    k = e[k] * 1000;
    localy.c();
    paramz.T(localy.d());
    return new q.b().a0(paramString1).o0("audio/ac3").N(i).p0(j).U(paramm).e0(paramString2).M(k).j0(k).K();
  }
  
  public static int e(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get(paramByteBuffer.position() + 5);
    int j = 3;
    if ((i & 0xF8) >> 3 > 10)
    {
      if ((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0xC0) >> 6 != 3) {
        j = (paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4;
      }
      return a[j] * 256;
    }
    return 1536;
  }
  
  public static b f(y paramy)
  {
    int i = paramy.e();
    paramy.r(40);
    int j;
    if (paramy.h(5) > 10) {
      j = 1;
    } else {
      j = 0;
    }
    paramy.p(i);
    i = -1;
    int k;
    int n;
    int i1;
    int i8;
    if (j != 0)
    {
      paramy.r(16);
      j = paramy.h(2);
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
      paramy.r(3);
      k = (paramy.h(11) + 1) * 2;
      int m = paramy.h(2);
      if (m == 3)
      {
        i = c[paramy.h(2)];
        n = 3;
        i1 = 6;
      }
      else
      {
        n = paramy.h(2);
        i1 = a[n];
        i = b[m];
      }
      int i2 = a(k, i, i1);
      int i3 = paramy.h(3);
      int i4 = paramy.g();
      i8 = d[i3] + i4;
      paramy.r(10);
      if (paramy.g()) {
        paramy.r(8);
      }
      if (i3 == 0)
      {
        paramy.r(5);
        if (paramy.g()) {
          paramy.r(8);
        }
      }
      if ((j == 1) && (paramy.g())) {
        paramy.r(16);
      }
      if (paramy.g())
      {
        if (i3 > 2) {
          paramy.r(2);
        }
        if (((i3 & 0x1) != 0) && (i3 > 2)) {
          paramy.r(6);
        }
        if ((i3 & 0x4) != 0) {
          paramy.r(6);
        }
        if ((i4 != 0) && (paramy.g())) {
          paramy.r(5);
        }
        if (j == 0)
        {
          if (paramy.g()) {
            paramy.r(6);
          }
          if ((i3 == 0) && (paramy.g())) {
            paramy.r(6);
          }
          if (paramy.g()) {
            paramy.r(6);
          }
          i5 = paramy.h(2);
          if (i5 == 1)
          {
            paramy.r(5);
          }
          else if (i5 == 2)
          {
            paramy.r(12);
          }
          else if (i5 == 3)
          {
            i5 = paramy.h(5);
            if (paramy.g())
            {
              paramy.r(5);
              if (paramy.g()) {
                paramy.r(4);
              }
              if (paramy.g()) {
                paramy.r(4);
              }
              if (paramy.g()) {
                paramy.r(4);
              }
              if (paramy.g()) {
                paramy.r(4);
              }
              if (paramy.g()) {
                paramy.r(4);
              }
              if (paramy.g()) {
                paramy.r(4);
              }
              if (paramy.g()) {
                paramy.r(4);
              }
              if (paramy.g())
              {
                if (paramy.g()) {
                  paramy.r(4);
                }
                if (paramy.g()) {
                  paramy.r(4);
                }
              }
            }
            if (paramy.g())
            {
              paramy.r(5);
              if (paramy.g())
              {
                paramy.r(7);
                if (paramy.g()) {
                  paramy.r(8);
                }
              }
            }
            paramy.r((i5 + 2) * 8);
            paramy.c();
          }
          if (i3 < 2)
          {
            if (paramy.g()) {
              paramy.r(14);
            }
            if ((i3 == 0) && (paramy.g())) {
              paramy.r(14);
            }
          }
          if (paramy.g()) {
            if (n == 0) {
              paramy.r(5);
            } else {
              for (i5 = 0; i5 < i1; i5++) {
                if (paramy.g()) {
                  paramy.r(5);
                }
              }
            }
          }
        }
      }
      if (paramy.g())
      {
        paramy.r(5);
        if (i3 == 2) {
          paramy.r(4);
        }
        if (i3 >= 6) {
          paramy.r(2);
        }
        if (paramy.g()) {
          paramy.r(8);
        }
        if ((i3 == 0) && (paramy.g())) {
          paramy.r(8);
        }
        if (m < 3) {
          paramy.q();
        }
      }
      if ((j == 0) && (n != 3)) {
        paramy.q();
      }
      if ((j != 2) || ((n == 3) || (!paramy.g()))) {
        break label801;
      }
      paramy.r(6);
      label801:
      if ((paramy.g()) && (paramy.h(6) == 1) && (paramy.h(8) == 1)) {
        paramy = "audio/eac3-joc";
      } else {
        paramy = "audio/eac3";
      }
      m = i1 * 256;
      n = k;
      i1 = i;
      int i5 = i2;
      k = m;
      i = n;
      n = i8;
    }
    int i7;
    for (;;)
    {
      break;
      paramy.r(32);
      j = paramy.h(2);
      if (j == 3) {}
      for (String str = null;; str = "audio/ac3") {
        break;
      }
      i = paramy.h(6);
      i1 = e[(i / 2)];
      i = c(j, i);
      paramy.r(8);
      n = paramy.h(3);
      if (((n & 0x1) != 0) && (n != 1)) {
        paramy.r(2);
      }
      if ((n & 0x4) != 0) {
        paramy.r(2);
      }
      if (n == 2) {
        paramy.r(2);
      }
      int[] arrayOfInt = b;
      if (j < arrayOfInt.length) {
        j = arrayOfInt[j];
      } else {
        j = -1;
      }
      int i6 = paramy.g();
      n = d[n] + i6;
      i8 = -1;
      k = 1536;
      i7 = i1 * 1000;
      i1 = j;
      paramy = str;
      j = i8;
    }
    return new b(paramy, j, n, i1, i, k, i7, null);
  }
  
  public static int g(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 6) {
      return -1;
    }
    if ((paramArrayOfByte[5] & 0xF8) >> 3 > 10)
    {
      i = paramArrayOfByte[2];
      return ((paramArrayOfByte[3] & 0xFF | (i & 0x7) << 8) + 1) * 2;
    }
    int i = paramArrayOfByte[4];
    return c((i & 0xC0) >> 6, i & 0x3F);
  }
  
  public static q h(z paramz, String paramString1, String paramString2, m paramm)
  {
    y localy = new y();
    localy.m(paramz);
    int i = localy.h(13);
    localy.r(3);
    int j = localy.h(2);
    int k = b[j];
    localy.r(10);
    int m = d[localy.h(3)];
    j = m;
    if (localy.h(1) != 0) {
      j = m + 1;
    }
    localy.r(3);
    int n = localy.h(4);
    localy.r(1);
    m = j;
    if (n > 0)
    {
      localy.r(6);
      m = j;
      if (localy.h(1) != 0) {
        m = j + 2;
      }
      localy.r(1);
    }
    if (localy.b() > 7)
    {
      localy.r(7);
      if (localy.h(1) != 0)
      {
        str = "audio/eac3-joc";
        break label182;
      }
    }
    String str = "audio/eac3";
    label182:
    localy.c();
    paramz.T(localy.d());
    return new q.b().a0(paramString1).o0(str).N(m).p0(k).U(paramm).e0(paramString2).j0(i * 1000).K();
  }
  
  public static int i(ByteBuffer paramByteBuffer, int paramInt)
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
  
  public static int j(byte[] paramArrayOfByte)
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
  
  public static final class b
  {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    
    public b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      a = paramString;
      b = paramInt1;
      d = paramInt2;
      c = paramInt3;
      e = paramInt4;
      f = paramInt5;
      g = paramInt6;
    }
  }
}

/* Location:
 * Qualified Name:     F0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */