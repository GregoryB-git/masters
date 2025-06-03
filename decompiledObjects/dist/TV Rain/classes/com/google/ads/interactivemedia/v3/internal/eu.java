package com.google.ads.interactivemedia.v3.internal;

import java.nio.Buffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class eu
{
  private final int a;
  private final int b;
  private final float c;
  private final float d;
  private final float e;
  private final int f;
  private final int g;
  private final int h;
  private final short[] i;
  private short[] j;
  private int k;
  private short[] l;
  private int m;
  private short[] n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  
  public eu(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramFloat1;
    d = paramFloat2;
    e = (paramInt1 / paramInt3);
    f = (paramInt1 / 400);
    paramInt1 /= 65;
    g = paramInt1;
    paramInt1 *= 2;
    h = paramInt1;
    i = new short[paramInt1];
    j = new short[paramInt1 * paramInt2];
    l = new short[paramInt1 * paramInt2];
    n = new short[paramInt1 * paramInt2];
  }
  
  private final int a(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramInt1 * b;
    int i2 = 1;
    int i3 = 255;
    int i4 = 0;
    int i8;
    for (int i5 = i4; paramInt2 <= paramInt3; i5 = i8)
    {
      int i6 = 0;
      paramInt1 = i6;
      while (i6 < paramInt2)
      {
        paramInt1 += Math.abs(paramArrayOfShort[(i1 + i6)] - paramArrayOfShort[(i1 + paramInt2 + i6)]);
        i6++;
      }
      int i7 = i2;
      i6 = i4;
      if (paramInt1 * i4 < i2 * paramInt2)
      {
        i6 = paramInt2;
        i7 = paramInt1;
      }
      i4 = i3;
      i8 = i5;
      if (paramInt1 * i3 > i5 * paramInt2)
      {
        i4 = paramInt2;
        i8 = paramInt1;
      }
      paramInt2++;
      i2 = i7;
      i3 = i4;
      i4 = i6;
    }
    u = (i2 / i4);
    v = (i5 / i3);
    return i4;
  }
  
  private static void a(int paramInt1, int paramInt2, short[] paramArrayOfShort1, int paramInt3, short[] paramArrayOfShort2, int paramInt4, short[] paramArrayOfShort3, int paramInt5)
  {
    for (int i1 = 0; i1 < paramInt2; i1++)
    {
      int i2 = paramInt3 * paramInt2 + i1;
      int i3 = paramInt5 * paramInt2 + i1;
      int i4 = paramInt4 * paramInt2 + i1;
      for (int i5 = 0; i5 < paramInt1; i5++)
      {
        int i6 = paramArrayOfShort2[i4];
        paramArrayOfShort1[i2] = ((short)(short)((paramArrayOfShort3[i3] * i5 + (paramInt1 - i5) * i6) / paramInt1));
        i2 += paramInt2;
        i4 += paramInt2;
        i3 += paramInt2;
      }
    }
  }
  
  private final short[] a(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayOfShort.length;
    int i2 = b;
    i1 /= i2;
    if (paramInt1 + paramInt2 <= i1) {
      return paramArrayOfShort;
    }
    return Arrays.copyOf(paramArrayOfShort, (i1 * 3 / 2 + paramInt2) * i2);
  }
  
  private final void b(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    short[] arrayOfShort = a(l, m, paramInt2);
    l = arrayOfShort;
    int i1 = b;
    System.arraycopy(paramArrayOfShort, paramInt1 * i1, arrayOfShort, m * i1, i1 * paramInt2);
    m += paramInt2;
  }
  
  private final void c(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int i1 = h / paramInt2;
    int i2 = b;
    int i3 = paramInt2 * i2;
    for (paramInt2 = 0; paramInt2 < i1; paramInt2++)
    {
      int i4 = 0;
      int i5 = i4;
      while (i4 < i3)
      {
        i5 += paramArrayOfShort[(paramInt2 * i3 + paramInt1 * i2 + i4)];
        i4++;
      }
      i4 = i5 / i3;
      i[paramInt2] = ((short)(short)i4);
    }
  }
  
  private final void d()
  {
    int i1 = m;
    float f1 = c;
    float f2 = d;
    f1 /= f2;
    f2 = e * f2;
    double d1 = f1;
    int i2;
    int i3;
    int i4;
    short[] arrayOfShort1;
    int i5;
    int i6;
    int i7;
    short[] arrayOfShort2;
    if ((d1 <= 1.00001D) && (d1 >= 0.99999D))
    {
      b(j, 0, k);
      k = 0;
    }
    else
    {
      i2 = k;
      if (i2 >= h) {
        for (i3 = 0;; i3 = i4)
        {
          i4 = r;
          if (i4 > 0)
          {
            i4 = Math.min(h, i4);
            b(j, i3, i4);
            r -= i4;
            i4 = i3 + i4;
          }
          else
          {
            arrayOfShort1 = j;
            i4 = a;
            if (i4 > 4000) {
              i4 /= 4000;
            } else {
              i4 = 1;
            }
            if ((b == 1) && (i4 == 1))
            {
              i4 = a(arrayOfShort1, i3, f, g);
            }
            else
            {
              c(arrayOfShort1, i3, i4);
              i5 = a(i, 0, f / i4, g / i4);
              if (i4 != 1)
              {
                i6 = i5 * i4;
                i4 <<= 2;
                i5 = i6 - i4;
                i6 += i4;
                i7 = f;
                i4 = i5;
                if (i5 < i7) {
                  i4 = i7;
                }
                i7 = g;
                i5 = i6;
                if (i6 > i7) {
                  i5 = i7;
                }
                if (b == 1)
                {
                  i4 = a(arrayOfShort1, i3, i4, i5);
                }
                else
                {
                  c(arrayOfShort1, i3, 1);
                  i4 = a(i, 0, i4, i5);
                }
              }
              else
              {
                i4 = i5;
              }
            }
            i6 = u;
            i5 = v;
            if ((i6 != 0) && (s != 0) && (i5 <= i6 * 3) && (i6 << 1 > t * 3)) {
              i5 = 1;
            } else {
              i5 = 0;
            }
            if (i5 != 0) {
              i5 = s;
            } else {
              i5 = i4;
            }
            t = i6;
            s = i4;
            if (d1 > 1.0D)
            {
              arrayOfShort2 = j;
              if (f1 >= 2.0F)
              {
                i4 = (int)(i5 / (f1 - 1.0F));
              }
              else
              {
                r = ((int)((2.0F - f1) * i5 / (f1 - 1.0F)));
                i4 = i5;
              }
              arrayOfShort1 = a(l, m, i4);
              l = arrayOfShort1;
              a(i4, b, arrayOfShort1, m, arrayOfShort2, i3, arrayOfShort2, i3 + i5);
              m += i4;
              i4 = i5 + i4 + i3;
            }
            else
            {
              arrayOfShort1 = j;
              if (f1 < 0.5F)
              {
                i4 = (int)(i5 * f1 / (1.0F - f1));
              }
              else
              {
                r = ((int)((2.0F * f1 - 1.0F) * i5 / (1.0F - f1)));
                i4 = i5;
              }
              arrayOfShort2 = l;
              i7 = m;
              i6 = i5 + i4;
              arrayOfShort2 = a(arrayOfShort2, i7, i6);
              l = arrayOfShort2;
              i7 = b;
              System.arraycopy(arrayOfShort1, i3 * i7, arrayOfShort2, m * i7, i7 * i5);
              a(i4, b, l, m + i5, arrayOfShort1, i3 + i5, arrayOfShort1, i3);
              m += i6;
              i4 = i3 + i4;
            }
          }
          if (h + i4 > i2)
          {
            i3 = k - i4;
            arrayOfShort1 = j;
            i5 = b;
            System.arraycopy(arrayOfShort1, i4 * i5, arrayOfShort1, 0, i5 * i3);
            k = i3;
            break;
          }
        }
      }
    }
    if ((f2 != 1.0F) && (m != i1))
    {
      i4 = a;
      i5 = (int)(i4 / f2);
      for (;;)
      {
        if ((i5 <= 16384) && (i4 <= 16384))
        {
          i6 = m - i1;
          arrayOfShort2 = a(n, o, i6);
          n = arrayOfShort2;
          arrayOfShort1 = l;
          i3 = b;
          System.arraycopy(arrayOfShort1, i1 * i3, arrayOfShort2, o * i3, i3 * i6);
          m = i1;
          o += i6;
          for (i3 = 0;; i3++)
          {
            i6 = o;
            if (i3 >= i6 - 1) {
              break;
            }
            for (;;)
            {
              i7 = p;
              i6 = q;
              if ((i7 + 1) * i5 <= i6 * i4) {
                break;
              }
              l = a(l, m, 1);
              for (i6 = 0;; i6++)
              {
                i2 = b;
                if (i6 >= i2) {
                  break;
                }
                arrayOfShort1 = l;
                i1 = m;
                arrayOfShort2 = n;
                int i8 = i3 * i2 + i6;
                i7 = arrayOfShort2[i8];
                i8 = arrayOfShort2[(i8 + i2)];
                int i9 = q;
                int i10 = p;
                int i11 = (i10 + 1) * i5;
                i9 = i11 - i9 * i4;
                i11 -= i10 * i5;
                arrayOfShort1[(i1 * i2 + i6)] = ((short)(short)(((i11 - i9) * i8 + i7 * i9) / i11));
              }
              q += 1;
              m += 1;
            }
            i7++;
            p = i7;
            if (i7 == i4)
            {
              p = 0;
              boolean bool;
              if (i6 == i5) {
                bool = true;
              } else {
                bool = false;
              }
              rp.c(bool);
              q = 0;
            }
          }
          i5 = i6 - 1;
          if (i5 == 0) {
            break;
          }
          arrayOfShort1 = n;
          i4 = b;
          System.arraycopy(arrayOfShort1, i5 * i4, arrayOfShort1, 0, (i6 - i5) * i4);
          o -= i5;
          break;
        }
        i5 /= 2;
        i4 /= 2;
      }
    }
  }
  
  public final void a()
  {
    int i1 = k;
    float f1 = c;
    float f2 = d;
    float f3 = f1 / f2;
    f1 = e;
    int i2 = m + (int)((i1 / f3 + o) / (f1 * f2) + 0.5F);
    j = a(j, i1, h * 2 + i1);
    int i4;
    for (int i3 = 0;; i3++)
    {
      i4 = h;
      int i5 = b;
      if (i3 >= i4 * 2 * i5) {
        break;
      }
      j[(i5 * i1 + i3)] = ((short)0);
    }
    k = (i4 * 2 + k);
    d();
    if (m > i2) {
      m = i2;
    }
    k = 0;
    r = 0;
    o = 0;
  }
  
  public final void a(ShortBuffer paramShortBuffer)
  {
    int i1 = paramShortBuffer.remaining();
    int i2 = b;
    i1 /= i2;
    short[] arrayOfShort = a(j, k, i1);
    j = arrayOfShort;
    paramShortBuffer.get(arrayOfShort, k * b, (i2 * i1 << 1) / 2);
    k += i1;
    d();
  }
  
  public final void b()
  {
    k = 0;
    m = 0;
    o = 0;
    p = 0;
    q = 0;
    r = 0;
    s = 0;
    t = 0;
    u = 0;
    v = 0;
  }
  
  public final void b(ShortBuffer paramShortBuffer)
  {
    int i1 = Math.min(paramShortBuffer.remaining() / b, m);
    paramShortBuffer.put(l, 0, b * i1);
    int i2 = m - i1;
    m = i2;
    paramShortBuffer = l;
    int i3 = b;
    System.arraycopy(paramShortBuffer, i1 * i3, paramShortBuffer, 0, i2 * i3);
  }
  
  public final int c()
  {
    return m * b << 1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.eu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */