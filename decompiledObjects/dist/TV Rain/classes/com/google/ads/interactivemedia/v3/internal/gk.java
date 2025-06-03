package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class gk
  implements fw
{
  private static final int[] a = { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
  private static final int[] b;
  private static final byte[] c = wl.c("#!AMR\n");
  private static final byte[] d = wl.c("#!AMR-WB\n");
  private static final int e = arrayOfInt[8];
  private final byte[] f = new byte[1];
  private final int g = 0;
  private boolean h;
  private long i;
  private int j;
  private int k;
  private boolean l;
  private long m;
  private int n = -1;
  private int o;
  private long p;
  private fy q;
  private gi r;
  private ge s;
  private boolean t;
  
  static
  {
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = 18;
    arrayOfInt[1] = 24;
    arrayOfInt[2] = 33;
    arrayOfInt[3] = 37;
    arrayOfInt[4] = 41;
    arrayOfInt[5] = 47;
    arrayOfInt[6] = 51;
    arrayOfInt[7] = 59;
    arrayOfInt[8] = 61;
    arrayOfInt[9] = 6;
    arrayOfInt[10] = 1;
    arrayOfInt[11] = 1;
    arrayOfInt[12] = 1;
    arrayOfInt[13] = 1;
    arrayOfInt[14] = 1;
    arrayOfInt[15] = 1;
    arrayOfInt;
    b = arrayOfInt;
  }
  
  public gk()
  {
    this(0);
  }
  
  private gk(int paramInt) {}
  
  private static boolean a(fz paramfz, byte[] paramArrayOfByte)
    throws IOException, InterruptedException
  {
    paramfz.a();
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    paramfz.c(arrayOfByte, 0, paramArrayOfByte.length);
    return Arrays.equals(arrayOfByte, paramArrayOfByte);
  }
  
  private final boolean b(fz paramfz)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = c;
    if (a(paramfz, arrayOfByte))
    {
      h = false;
      paramfz.b(arrayOfByte.length);
      return true;
    }
    arrayOfByte = d;
    if (a(paramfz, arrayOfByte))
    {
      h = true;
      paramfz.b(arrayOfByte.length);
      return true;
    }
    return false;
  }
  
  private final int c(fz paramfz)
    throws IOException, InterruptedException
  {
    if (k == 0) {
      try
      {
        paramfz.a();
        paramfz.c(f, 0, 1);
        i1 = f[0];
        label122:
        Object localObject;
        if ((i1 & 0x83) <= 0)
        {
          int i2 = i1 >> 3 & 0xF;
          if ((i2 >= 0) && (i2 <= 15))
          {
            boolean bool = h;
            if ((bool) && ((i2 < 10) || (i2 > 13))) {
              i1 = 1;
            } else {
              i1 = 0;
            }
            if (i1 == 0)
            {
              if ((!bool) && ((i2 < 12) || (i2 > 14))) {
                i1 = 1;
              } else {
                i1 = 0;
              }
              if (i1 == 0) {}
            }
            else
            {
              i1 = 1;
              break label122;
            }
          }
          i1 = 0;
          if (i1 == 0)
          {
            localObject = new com/google/ads/interactivemedia/v3/internal/ce;
            if (h) {
              paramfz = "WB";
            } else {
              paramfz = "NB";
            }
            i1 = paramfz.length();
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i1 + 35);
            localStringBuilder.append("Illegal AMR ");
            localStringBuilder.append(paramfz);
            localStringBuilder.append(" frame type ");
            localStringBuilder.append(i2);
            ((ce)localObject).<init>(localStringBuilder.toString());
            throw ((Throwable)localObject);
          }
          if (h) {
            i1 = b[i2];
          } else {
            i1 = a[i2];
          }
          j = i1;
          k = i1;
          if (n == -1)
          {
            m = paramfz.c();
            n = j;
          }
          if (n == j) {
            o += 1;
          }
        }
        else
        {
          paramfz = new com/google/ads/interactivemedia/v3/internal/ce;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>(42);
          ((StringBuilder)localObject).append("Invalid padding bits for frame header ");
          ((StringBuilder)localObject).append(i1);
          paramfz.<init>(((StringBuilder)localObject).toString());
          throw paramfz;
        }
      }
      catch (EOFException paramfz)
      {
        return -1;
      }
    }
    int i1 = r.a(paramfz, k, true);
    if (i1 == -1) {
      return -1;
    }
    i1 = k - i1;
    k = i1;
    if (i1 > 0) {
      return 0;
    }
    paramfz = r;
    long l1 = p;
    paramfz.a(i + l1, 1, j, 0, null);
    i += 20000L;
    return 0;
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    if ((paramfz.c() == 0L) && (!b(paramfz))) {
      throw new ce("Could not find AMR header.");
    }
    if (!t)
    {
      t = true;
      boolean bool = h;
      if (bool) {
        paramgf = "audio/amr-wb";
      } else {
        paramgf = "audio/3gpp";
      }
      if (bool) {
        i1 = 16000;
      } else {
        i1 = 8000;
      }
      r.a(bw.a(null, paramgf, null, -1, e, 1, i1, -1, null, null, 0, null));
    }
    int i1 = c(paramfz);
    long l1 = paramfz.d();
    if (!l)
    {
      if (((g & 0x1) != 0) && (l1 != -1L))
      {
        int i2 = n;
        if ((i2 == -1) || (i2 == j))
        {
          if ((o < 20) && (i1 != -1)) {
            break label269;
          }
          int i3 = (int)((i2 << 3) * 1000000L / 20000L);
          paramfz = new fu(l1, m, i3, i2);
          s = paramfz;
          q.a(paramfz);
          l = true;
          break label269;
        }
      }
      paramfz = new gg(-9223372036854775807L);
      s = paramfz;
      q.a(paramfz);
      l = true;
    }
    label269:
    return i1;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    i = 0L;
    j = 0;
    k = 0;
    if (paramLong1 != 0L)
    {
      ge localge = s;
      if ((localge instanceof fu))
      {
        p = ((fu)localge).a_(paramLong1);
        return;
      }
    }
    p = 0L;
  }
  
  public final void a(fy paramfy)
  {
    q = paramfy;
    r = paramfy.a(0, 1);
    paramfy.a();
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    return b(paramfz);
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */