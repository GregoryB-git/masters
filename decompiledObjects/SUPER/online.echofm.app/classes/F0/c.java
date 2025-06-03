package F0;

import d0.m;
import d0.q;
import d0.q.b;
import g0.y;
import g0.z;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class c
{
  public static final int[] a = { 2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048 };
  
  public static void a(int paramInt, z paramz)
  {
    paramz.P(7);
    paramz = paramz.e();
    paramz[0] = ((byte)-84);
    paramz[1] = ((byte)64);
    paramz[2] = ((byte)-1);
    paramz[3] = ((byte)-1);
    paramz[4] = ((byte)(byte)(paramInt >> 16 & 0xFF));
    paramz[5] = ((byte)(byte)(paramInt >> 8 & 0xFF));
    paramz[6] = ((byte)(byte)(paramInt & 0xFF));
  }
  
  public static q b(z paramz, String paramString1, String paramString2, m paramm)
  {
    paramz.U(1);
    int i;
    if ((paramz.G() & 0x20) >> 5 == 1) {
      i = 48000;
    } else {
      i = 44100;
    }
    return new q.b().a0(paramString1).o0("audio/ac4").N(2).p0(i).U(paramm).e0(paramString2).K();
  }
  
  public static int c(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = new byte[16];
    int i = paramByteBuffer.position();
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer.position(i);
    return dye;
  }
  
  public static b d(y paramy)
  {
    int i = paramy.h(16);
    int j = paramy.h(16);
    if (j == 65535)
    {
      j = paramy.h(24);
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
    k = paramy.h(2);
    i = k;
    if (k == 3) {
      i = k + f(paramy, 2);
    }
    k = paramy.h(10);
    if ((paramy.g()) && (paramy.h(3) > 0)) {
      paramy.r(2);
    }
    int m;
    if (paramy.g()) {
      m = 48000;
    } else {
      m = 44100;
    }
    int n = paramy.h(4);
    if ((m == 44100) && (n == 13))
    {
      k = a[n];
    }
    else
    {
      if (m == 48000)
      {
        paramy = a;
        if (n < paramy.length)
        {
          int i1 = paramy[n];
          k %= 5;
          if (k != 1) {
            if (k != 2)
            {
              if (k == 3) {
                break label253;
              }
              if (k != 4)
              {
                k = i1;
              }
              else if ((n != 3) && (n != 8))
              {
                k = i1;
                if (n != 11) {
                  break label230;
                }
                break label230;
              }
            }
          }
          for (;;)
          {
            k = i1 + 1;
            label230:
            break label274;
            if (n != 8)
            {
              k = i1;
              if (n != 11) {
                break;
              }
              continue;
              label253:
              if (n != 3)
              {
                k = i1;
                if (n != 8) {
                  break;
                }
              }
            }
          }
        }
      }
      k = 0;
    }
    label274:
    return new b(i, 2, m, j, k, null);
  }
  
  public static int e(byte[] paramArrayOfByte, int paramInt)
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
  
  public static int f(y paramy, int paramInt)
  {
    for (int i = 0;; i = i + 1 << paramInt)
    {
      i += paramy.h(paramInt);
      if (!paramy.g()) {
        return i;
      }
    }
  }
  
  public static final class b
  {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      a = paramInt1;
      c = paramInt2;
      b = paramInt3;
      d = paramInt4;
      e = paramInt5;
    }
  }
}

/* Location:
 * Qualified Name:     F0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */