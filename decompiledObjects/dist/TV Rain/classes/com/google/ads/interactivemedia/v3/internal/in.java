package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

public final class in
  implements ik
{
  private static final double[] c = { 23.976023976023978D, 24.0D, 25.0D, 29.97002997002997D, 30.0D, 50.0D, 59.94005994005994D, 60.0D };
  private String a;
  private gi b;
  private boolean d;
  private long e;
  private final jm f;
  private final vy g;
  private final boolean[] h;
  private final im i;
  private final ix j;
  private long k;
  private boolean l;
  private long m;
  private long n;
  private long o;
  private boolean p;
  private boolean q;
  
  public in()
  {
    this(null);
  }
  
  public in(jm paramjm)
  {
    f = paramjm;
    h = new boolean[4];
    i = new im(128);
    if (paramjm != null)
    {
      j = new ix(178, 128);
      g = new vy();
      return;
    }
    j = null;
    g = null;
  }
  
  public final void a()
  {
    vu.a(h);
    i.a();
    if (f != null) {
      j.a();
    }
    k = 0L;
    l = false;
  }
  
  public final void a(long paramLong, int paramInt)
  {
    m = paramLong;
  }
  
  public final void a(fy paramfy, jn paramjn)
  {
    paramjn.a();
    a = paramjn.c();
    b = paramfy.a(paramjn.b(), 2);
    jm localjm = f;
    if (localjm != null) {
      localjm.a(paramfy, paramjn);
    }
  }
  
  public final void a(vy paramvy)
  {
    int i1 = paramvy.d();
    int i3 = paramvy.c();
    byte[] arrayOfByte1 = a;
    k += paramvy.b();
    b.a(paramvy, paramvy.b());
    for (;;)
    {
      int i4 = vu.a(arrayOfByte1, i1, i3, h);
      if (i4 == i3)
      {
        if (!d) {
          i.a(arrayOfByte1, i1, i3);
        }
        if (f != null) {
          j.a(arrayOfByte1, i1, i3);
        }
        return;
      }
      Object localObject1 = a;
      int i5 = i4 + 3;
      int i6 = localObject1[i5] & 0xFF;
      int i7 = i4 - i1;
      int i8;
      label359:
      long l1;
      if (!d)
      {
        if (i7 > 0) {
          i.a(arrayOfByte1, i1, i4);
        }
        if (i7 < 0) {
          i8 = -i7;
        } else {
          i8 = 0;
        }
        if (i.a(i6, i8))
        {
          localObject1 = i;
          Object localObject2 = a;
          byte[] arrayOfByte2 = Arrays.copyOf(c, a);
          int i9 = arrayOfByte2[4];
          i8 = arrayOfByte2[5] & 0xFF;
          int i10 = arrayOfByte2[6];
          i9 = (i9 & 0xFF) << 4 | i8 >> 4;
          i10 = (i8 & 0xF) << 8 | i10 & 0xFF;
          i8 = (arrayOfByte2[7] & 0xF0) >> 4;
          float f1;
          if (i8 != 2)
          {
            if (i8 != 3)
            {
              if (i8 != 4)
              {
                f1 = 1.0F;
                break label359;
              }
              f1 = i10 * 121;
              i8 = i9 * 100;
            }
            else
            {
              f1 = i10 * 16;
              i8 = i9 * 9;
            }
          }
          else
          {
            f1 = i10 * 4;
            i8 = i9 * 3;
          }
          f1 /= i8;
          bw localbw = bw.a((String)localObject2, "video/mpeg2", null, -1, -1, i9, i10, -1.0F, Collections.singletonList(arrayOfByte2), -1, f1, null);
          i8 = (arrayOfByte2[7] & 0xF) - 1;
          if (i8 >= 0)
          {
            localObject2 = c;
            if (i8 < localObject2.length)
            {
              double d1 = localObject2[i8];
              i9 = arrayOfByte2[(b + 9)];
              i8 = (i9 & 0x60) >> 5;
              i9 &= 0x1F;
              double d2 = d1;
              if (i8 != i9) {
                d2 = d1 * ((i8 + 1.0D) / (i9 + 1));
              }
              l1 = (1000000.0D / d2);
              break label494;
            }
          }
          l1 = 0L;
          label494:
          localObject1 = Pair.create(localbw, Long.valueOf(l1));
          b.a((bw)first);
          e = ((Long)second).longValue();
          d = true;
        }
      }
      if (f != null)
      {
        if (i7 > 0)
        {
          j.a(arrayOfByte1, i1, i4);
          i8 = 0;
        }
        else
        {
          i8 = -i7;
        }
        if (j.b(i8))
        {
          localObject1 = j;
          i8 = vu.a(a, b);
          g.a(j.a, i8);
          f.a(o, g);
        }
        if ((i6 == 178) && (a[(i4 + 2)] == 1)) {
          j.a(i6);
        }
      }
      if ((i6 != 0) && (i6 != 179))
      {
        if (i6 == 184) {
          p = true;
        }
      }
      else
      {
        i4 = i3 - i4;
        if ((l) && (q) && (d))
        {
          i2 = p;
          i8 = (int)(k - n);
          b.a(o, i2, i8 - i4, i4, null);
        }
        boolean bool = l;
        if ((bool) && (!q)) {
          break label869;
        }
        n = (k - i4);
        l1 = m;
        if (l1 == -9223372036854775807L) {
          if (bool) {
            l1 = o + e;
          } else {
            l1 = 0L;
          }
        }
        o = l1;
        p = false;
        m = -9223372036854775807L;
        l = true;
        label869:
        if (i6 == 0) {
          bool = true;
        } else {
          bool = false;
        }
        q = bool;
      }
      int i2 = i5;
    }
  }
  
  public final void b() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.in
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */