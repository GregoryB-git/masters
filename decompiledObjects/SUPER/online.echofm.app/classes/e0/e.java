package e0;

import g0.a;
import java.nio.Buffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

public final class e
{
  public final int a;
  public final int b;
  public final float c;
  public final float d;
  public final float e;
  public final int f;
  public final int g;
  public final int h;
  public final short[] i;
  public short[] j;
  public int k;
  public short[] l;
  public int m;
  public short[] n;
  public int o;
  public int p;
  public int q;
  public int r;
  public int s;
  public int t;
  public int u;
  public int v;
  
  public e(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3)
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
  
  public static void p(int paramInt1, int paramInt2, short[] paramArrayOfShort1, int paramInt3, short[] paramArrayOfShort2, int paramInt4, short[] paramArrayOfShort3, int paramInt5)
  {
    for (int i1 = 0; i1 < paramInt2; i1++)
    {
      int i2 = paramInt3 * paramInt2 + i1;
      int i3 = paramInt5 * paramInt2 + i1;
      int i4 = paramInt4 * paramInt2 + i1;
      for (int i5 = 0; i5 < paramInt1; i5++)
      {
        paramArrayOfShort1[i2] = ((short)(short)((paramArrayOfShort2[i4] * (paramInt1 - i5) + paramArrayOfShort3[i3] * i5) / paramInt1));
        i2 += paramInt2;
        i4 += paramInt2;
        i3 += paramInt2;
      }
    }
  }
  
  public final void a(float paramFloat, int paramInt)
  {
    if (m == paramInt) {
      return;
    }
    int i1 = a;
    int i2 = (int)(i1 / paramFloat);
    for (;;)
    {
      if ((i2 <= 16384) && (i1 <= 16384))
      {
        o(paramInt);
        int i3;
        for (paramInt = 0;; paramInt++)
        {
          i3 = o;
          boolean bool = true;
          if (paramInt >= i3 - 1) {
            break;
          }
          int i4;
          for (;;)
          {
            i4 = p;
            i3 = q;
            if ((i4 + 1) * i2 <= i3 * i1) {
              break;
            }
            l = f(l, m, 1);
            for (i3 = 0;; i3++)
            {
              i4 = b;
              if (i3 >= i4) {
                break;
              }
              l[(m * i4 + i3)] = n(n, i4 * paramInt + i3, i1, i2);
            }
            q += 1;
            m += 1;
          }
          i4++;
          p = i4;
          if (i4 == i1)
          {
            p = 0;
            if (i3 != i2) {
              bool = false;
            }
            a.f(bool);
            q = 0;
          }
        }
        u(i3 - 1);
        return;
      }
      i2 /= 2;
      i1 /= 2;
    }
  }
  
  public final void b(float paramFloat)
  {
    int i1 = k;
    if (i1 < h) {
      return;
    }
    int i2 = 0;
    int i3;
    do
    {
      if (r > 0) {
        i3 = c(i2);
      }
      for (;;)
      {
        i3 = i2 + i3;
        break;
        i3 = g(j, i2);
        if (paramFloat > 1.0D) {
          i3 += w(j, i2, paramFloat, i3);
        } else {
          i3 = m(j, i2, paramFloat, i3);
        }
      }
      i2 = i3;
    } while (h + i3 <= i1);
    v(i3);
  }
  
  public final int c(int paramInt)
  {
    int i1 = Math.min(h, r);
    d(j, paramInt, i1);
    r -= i1;
    return i1;
  }
  
  public final void d(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    short[] arrayOfShort = f(l, m, paramInt2);
    l = arrayOfShort;
    int i1 = b;
    System.arraycopy(paramArrayOfShort, paramInt1 * i1, arrayOfShort, m * i1, i1 * paramInt2);
    m += paramInt2;
  }
  
  public final void e(short[] paramArrayOfShort, int paramInt1, int paramInt2)
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
  
  public final short[] f(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayOfShort.length;
    int i2 = b;
    i1 /= i2;
    if (paramInt1 + paramInt2 <= i1) {
      return paramArrayOfShort;
    }
    return Arrays.copyOf(paramArrayOfShort, (i1 * 3 / 2 + paramInt2) * i2);
  }
  
  public final int g(short[] paramArrayOfShort, int paramInt)
  {
    int i1 = a;
    if (i1 > 4000) {
      i1 /= 4000;
    } else {
      i1 = 1;
    }
    if ((b == 1) && (i1 == 1))
    {
      paramInt = h(paramArrayOfShort, paramInt, f, g);
    }
    else
    {
      e(paramArrayOfShort, paramInt, i1);
      int i2 = h(i, 0, f / i1, g / i1);
      if (i1 != 1)
      {
        int i3 = i2 * i1;
        i1 *= 4;
        i2 = i3 - i1;
        i3 += i1;
        int i4 = f;
        i1 = i2;
        if (i2 < i4) {
          i1 = i4;
        }
        i4 = g;
        i2 = i3;
        if (i3 > i4) {
          i2 = i4;
        }
        if (b == 1)
        {
          paramInt = h(paramArrayOfShort, paramInt, i1, i2);
        }
        else
        {
          e(paramArrayOfShort, paramInt, 1);
          paramInt = h(i, 0, i1, i2);
        }
      }
      else
      {
        paramInt = i2;
      }
    }
    if (q(u, v)) {
      i1 = s;
    } else {
      i1 = paramInt;
    }
    t = u;
    s = paramInt;
    return i1;
  }
  
  public final int h(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramInt1 * b;
    int i2 = 255;
    int i3 = 1;
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
      int i7 = i3;
      i6 = i4;
      if (paramInt1 * i4 < i3 * paramInt2)
      {
        i6 = paramInt2;
        i7 = paramInt1;
      }
      i4 = i2;
      i8 = i5;
      if (paramInt1 * i2 > i5 * paramInt2)
      {
        i4 = paramInt2;
        i8 = paramInt1;
      }
      paramInt2++;
      i2 = i4;
      i3 = i7;
      i4 = i6;
    }
    u = (i3 / i4);
    v = (i5 / i2);
    return i4;
  }
  
  public void i()
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
  
  public void j(ShortBuffer paramShortBuffer)
  {
    int i1 = Math.min(paramShortBuffer.remaining() / b, m);
    paramShortBuffer.put(l, 0, b * i1);
    int i2 = m - i1;
    m = i2;
    paramShortBuffer = l;
    int i3 = b;
    System.arraycopy(paramShortBuffer, i1 * i3, paramShortBuffer, 0, i2 * i3);
  }
  
  public int k()
  {
    return m * b * 2;
  }
  
  public int l()
  {
    return k * b * 2;
  }
  
  public final int m(short[] paramArrayOfShort, int paramInt1, float paramFloat, int paramInt2)
  {
    int i1;
    if (paramFloat < 0.5F)
    {
      i1 = (int)(paramInt2 * paramFloat / (1.0F - paramFloat));
    }
    else
    {
      r = ((int)(paramInt2 * (2.0F * paramFloat - 1.0F) / (1.0F - paramFloat)));
      i1 = paramInt2;
    }
    short[] arrayOfShort = l;
    int i2 = m;
    int i3 = paramInt2 + i1;
    arrayOfShort = f(arrayOfShort, i2, i3);
    l = arrayOfShort;
    i2 = b;
    System.arraycopy(paramArrayOfShort, paramInt1 * i2, arrayOfShort, m * i2, i2 * paramInt2);
    p(i1, b, l, m + paramInt2, paramArrayOfShort, paramInt1 + paramInt2, paramArrayOfShort, paramInt1);
    m += i3;
    return i1;
  }
  
  public final short n(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramArrayOfShort[paramInt1];
    paramInt1 = paramArrayOfShort[(paramInt1 + b)];
    int i2 = q;
    int i3 = p;
    int i4 = (i3 + 1) * paramInt3;
    paramInt2 = i4 - i2 * paramInt2;
    paramInt3 = i4 - i3 * paramInt3;
    return (short)((i1 * paramInt2 + (paramInt3 - paramInt2) * paramInt1) / paramInt3);
  }
  
  public final void o(int paramInt)
  {
    int i1 = m - paramInt;
    short[] arrayOfShort1 = f(n, o, i1);
    n = arrayOfShort1;
    short[] arrayOfShort2 = l;
    int i2 = b;
    System.arraycopy(arrayOfShort2, paramInt * i2, arrayOfShort1, o * i2, i2 * i1);
    m = paramInt;
    o += i1;
  }
  
  public final boolean q(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) && (s != 0))
    {
      if (paramInt2 > paramInt1 * 3) {
        return false;
      }
      return paramInt1 * 2 > t * 3;
    }
    return false;
  }
  
  public final void r()
  {
    int i1 = m;
    float f1 = c;
    float f2 = d;
    f1 /= f2;
    f2 = e * f2;
    double d1 = f1;
    if ((d1 <= 1.00001D) && (d1 >= 0.99999D))
    {
      d(j, 0, k);
      k = 0;
    }
    else
    {
      b(f1);
    }
    if (f2 != 1.0F) {
      a(f2, i1);
    }
  }
  
  public void s()
  {
    int i1 = k;
    float f1 = c;
    float f2 = d;
    float f3 = f1 / f2;
    f1 = e;
    int i2 = m + (int)((i1 / f3 + o) / (f1 * f2) + 0.5F);
    j = f(j, i1, h * 2 + i1);
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
    k += i4 * 2;
    r();
    if (m > i2) {
      m = i2;
    }
    k = 0;
    r = 0;
    o = 0;
  }
  
  public void t(ShortBuffer paramShortBuffer)
  {
    int i1 = paramShortBuffer.remaining();
    int i2 = b;
    i1 /= i2;
    short[] arrayOfShort = f(j, k, i1);
    j = arrayOfShort;
    paramShortBuffer.get(arrayOfShort, k * b, i2 * i1 * 2 / 2);
    k += i1;
    r();
  }
  
  public final void u(int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    short[] arrayOfShort = n;
    int i1 = b;
    System.arraycopy(arrayOfShort, paramInt * i1, arrayOfShort, 0, (o - paramInt) * i1);
    o -= paramInt;
  }
  
  public final void v(int paramInt)
  {
    int i1 = k - paramInt;
    short[] arrayOfShort = j;
    int i2 = b;
    System.arraycopy(arrayOfShort, paramInt * i2, arrayOfShort, 0, i2 * i1);
    k = i1;
  }
  
  public final int w(short[] paramArrayOfShort, int paramInt1, float paramFloat, int paramInt2)
  {
    int i1;
    if (paramFloat >= 2.0F)
    {
      i1 = (int)(paramInt2 / (paramFloat - 1.0F));
    }
    else
    {
      r = ((int)(paramInt2 * (2.0F - paramFloat) / (paramFloat - 1.0F)));
      i1 = paramInt2;
    }
    short[] arrayOfShort = f(l, m, i1);
    l = arrayOfShort;
    p(i1, b, arrayOfShort, m, paramArrayOfShort, paramInt1, paramArrayOfShort, paramInt1 + paramInt2);
    m += i1;
    return i1;
  }
}

/* Location:
 * Qualified Name:     e0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */