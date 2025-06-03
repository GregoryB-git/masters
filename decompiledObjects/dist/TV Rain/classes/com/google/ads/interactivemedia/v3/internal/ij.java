package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

public final class ij
  implements ik
{
  private static final byte[] a = { 73, 68, 51 };
  private final boolean b;
  private final vz c = new vz(new byte[7]);
  private final vy d = new vy(Arrays.copyOf(a, 10));
  private final String e;
  private String f;
  private gi g;
  private gi h;
  private int i;
  private int j;
  private int k;
  private boolean l;
  private boolean m;
  private int n;
  private int o;
  private int p;
  private boolean q;
  private long r;
  private int s;
  private long t;
  private gi u;
  private long v;
  
  public ij(boolean paramBoolean)
  {
    this(true, null);
  }
  
  public ij(boolean paramBoolean, String paramString)
  {
    e();
    n = -1;
    o = -1;
    r = -9223372036854775807L;
    b = paramBoolean;
    e = paramString;
  }
  
  private final void a(gi paramgi, long paramLong, int paramInt1, int paramInt2)
  {
    i = 4;
    j = paramInt1;
    u = paramgi;
    v = paramLong;
    s = paramInt2;
  }
  
  private static boolean a(byte paramByte1, byte paramByte2)
  {
    return a((paramByte1 & 0xFF) << 8 | paramByte2 & 0xFF);
  }
  
  public static boolean a(int paramInt)
  {
    return (paramInt & 0xFFF6) == 65520;
  }
  
  private final boolean a(vy paramvy, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = Math.min(paramvy.b(), paramInt - j);
    paramvy.a(paramArrayOfByte, j, i1);
    i1 = j + i1;
    j = i1;
    return i1 == paramInt;
  }
  
  private static boolean b(vy paramvy, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramvy.b() < paramInt) {
      return false;
    }
    paramvy.a(paramArrayOfByte, 0, paramInt);
    return true;
  }
  
  private final void d()
  {
    m = false;
    e();
  }
  
  private final void e()
  {
    i = 0;
    j = 0;
    k = 256;
  }
  
  private final void f()
  {
    i = 3;
    j = 0;
  }
  
  public final void a()
  {
    d();
  }
  
  public final void a(long paramLong, int paramInt)
  {
    t = paramLong;
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    paramjn.a();
    f = paramjn.c();
    g = paramfy.a(paramjn.b(), 1);
    if (b)
    {
      paramjn.a();
      paramfy = paramfy.a(paramjn.b(), 4);
      h = paramfy;
      paramfy.a(bw.a(paramjn.c(), "application/id3", null, -1, null));
      return;
    }
    h = new fx();
  }
  
  public final void a(vy paramvy)
    throws ce
  {
    while (paramvy.b() > 0)
    {
      int i1 = i;
      int i2 = 2;
      int i3;
      Object localObject1;
      Object localObject2;
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 == 4)
              {
                i1 = Math.min(paramvy.b(), s - j);
                u.a(paramvy, i1);
                i1 = j + i1;
                j = i1;
                i3 = s;
                if (i1 == i3)
                {
                  u.a(t, 1, i3, 0, null);
                  t += v;
                  e();
                }
              }
              else
              {
                throw new IllegalStateException();
              }
            }
            else
            {
              if (l) {
                i1 = 7;
              } else {
                i1 = 5;
              }
              if (a(paramvy, c.a, i1))
              {
                c.a(0);
                if (!q)
                {
                  i3 = c.c(2) + 1;
                  i1 = i3;
                  if (i3 != 2)
                  {
                    localObject1 = new StringBuilder(61);
                    ((StringBuilder)localObject1).append("Detected audio object type: ");
                    ((StringBuilder)localObject1).append(i3);
                    ((StringBuilder)localObject1).append(", but assuming AAC LC.");
                    Log.w("AdtsReader", ((StringBuilder)localObject1).toString());
                    i1 = 2;
                  }
                  c.b(5);
                  i3 = c.c(3);
                  localObject1 = vg.a(i1, o, i3);
                  localObject2 = vg.a((byte[])localObject1);
                  localObject1 = bw.a(f, "audio/mp4a-latm", null, -1, -1, ((Integer)second).intValue(), ((Integer)first).intValue(), Collections.singletonList(localObject1), null, 0, e);
                  r = (1024000000L / u);
                  g.a((bw)localObject1);
                  q = true;
                }
                else
                {
                  c.b(10);
                }
                c.b(4);
                i3 = c.c(13) - 2 - 5;
                i1 = i3;
                if (l) {
                  i1 = i3 - 2;
                }
                a(g, r, 0, i1);
              }
            }
          }
          else if (a(paramvy, d.a, 10))
          {
            h.a(d, 10);
            d.c(6);
            a(h, 0L, 10, d.o() + 10);
          }
        }
        else if (paramvy.b() != 0)
        {
          c.a[0] = ((byte)a[paramvy.d()]);
          c.a(2);
          i3 = c.c(4);
          i1 = o;
          if ((i1 != -1) && (i3 != i1))
          {
            d();
          }
          else
          {
            if (!m)
            {
              m = true;
              n = p;
              o = i3;
            }
            f();
          }
        }
      }
      else
      {
        localObject1 = a;
        i1 = paramvy.d();
        int i4 = paramvy.c();
        for (;;)
        {
          i3 = i1;
          if (i1 >= i4) {
            break label1101;
          }
          i3 = i1 + 1;
          int i5 = localObject1[i1] & 0xFF;
          if ((k == 512) && (a((byte)-1, (byte)i5))) {
            if (!m)
            {
              int i6 = i3 - 2;
              paramvy.c(i6 + 1);
              if (b(paramvy, c.a, 1))
              {
                c.a(4);
                i1 = c.c(1);
                int i7 = n;
                if ((i7 == -1) || (i1 == i7))
                {
                  if (o != -1)
                  {
                    if (b(paramvy, c.a, 1))
                    {
                      c.a(i2);
                      if (c.c(4) != o) {
                        break label900;
                      }
                      paramvy.c(i6 + 2);
                    }
                  }
                  else {
                    if (b(paramvy, c.a, 4)) {
                      break label806;
                    }
                  }
                  label806:
                  do
                  {
                    do
                    {
                      i1 = 1;
                      break label902;
                      c.a(14);
                      i2 = c.c(13);
                      if (i2 <= 6) {
                        break;
                      }
                      i6 += i2;
                      i2 = i6 + 1;
                    } while (i2 >= paramvy.c());
                    localObject2 = a;
                  } while ((a(localObject2[i6], localObject2[i2])) && ((n == -1) || ((a[i2] & 0x8) >> 3 == i1)));
                }
              }
              label900:
              i1 = 0;
              label902:
              if (i1 == 0) {}
            }
            else
            {
              p = ((i5 & 0x8) >> 3);
              boolean bool;
              if ((i5 & 0x1) == 0) {
                bool = true;
              } else {
                bool = false;
              }
              l = bool;
              if (!m)
              {
                i = 1;
                j = 0;
              }
              else
              {
                f();
              }
              paramvy.c(i3);
              break;
            }
          }
          i2 = k;
          i1 = i2 | i5;
          if (i1 != 329)
          {
            if (i1 != 511)
            {
              if (i1 != 836)
              {
                if (i1 != 1075)
                {
                  i1 = i3;
                  if (i2 != 256)
                  {
                    k = 256;
                    i1 = i3 - 1;
                  }
                  i2 = 2;
                  continue;
                }
                i = 2;
                j = a.length;
                s = 0;
                d.c(0);
                break label1101;
              }
              k = 1024;
            }
            else
            {
              k = 512;
            }
          }
          else {
            k = 768;
          }
          i1 = i3;
          i2 = 2;
        }
        label1101:
        paramvy.c(i3);
      }
    }
  }
  
  public final void b() {}
  
  public final long c()
  {
    return r;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ij
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */