package x3;

import java.util.Arrays;
import x6.b;

public final class b0
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
  
  public b0(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3)
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
  
  public static void d(int paramInt1, int paramInt2, short[] paramArrayOfShort1, int paramInt3, short[] paramArrayOfShort2, int paramInt4, short[] paramArrayOfShort3, int paramInt5)
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
  
  public final void a(short[] paramArrayOfShort, int paramInt1, int paramInt2)
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
  
  public final short[] b(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayOfShort.length;
    int i2 = b;
    i1 /= i2;
    if (paramInt1 + paramInt2 <= i1) {
      return paramArrayOfShort;
    }
    return Arrays.copyOf(paramArrayOfShort, (i1 * 3 / 2 + paramInt2) * i2);
  }
  
  public final int c(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
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
  
  public final void e()
  {
    int i1 = m;
    float f1 = c;
    float f2 = d;
    f1 /= f2;
    f2 = e * f2;
    double d1 = f1;
    short[] arrayOfShort1;
    int i2;
    short[] arrayOfShort2;
    int i3;
    if ((d1 <= 1.00001D) && (d1 >= 0.99999D))
    {
      arrayOfShort1 = j;
      i2 = k;
      arrayOfShort2 = b(l, i1, i2);
      l = arrayOfShort2;
      i3 = b;
      System.arraycopy(arrayOfShort1, 0 * i3, arrayOfShort2, m * i3, i3 * i2);
      m += i2;
      k = 0;
    }
    int i4;
    do
    {
      break;
      i4 = k;
    } while (i4 < h);
    for (int i5 = 0;; i5 = i3)
    {
      i3 = r;
      int i6;
      int i7;
      if (i3 > 0)
      {
        i2 = Math.min(h, i3);
        arrayOfShort1 = j;
        arrayOfShort2 = b(l, m, i2);
        l = arrayOfShort2;
        i3 = b;
        System.arraycopy(arrayOfShort1, i5 * i3, arrayOfShort2, m * i3, i3 * i2);
        m += i2;
        r -= i2;
        i3 = i5 + i2;
      }
      else
      {
        arrayOfShort2 = j;
        i3 = a;
        if (i3 > 4000) {
          i3 /= 4000;
        } else {
          i3 = 1;
        }
        if ((b == 1) && (i3 == 1))
        {
          i3 = c(arrayOfShort2, i5, f, g);
        }
        else
        {
          a(arrayOfShort2, i5, i3);
          i2 = c(i, 0, f / i3, g / i3);
          if (i3 != 1)
          {
            i6 = i2 * i3;
            i3 *= 4;
            i2 = i6 - i3;
            i6 += i3;
            i7 = f;
            i3 = i2;
            if (i2 < i7) {
              i3 = i7;
            }
            i7 = g;
            i2 = i6;
            if (i6 > i7) {
              i2 = i7;
            }
            if (b == 1)
            {
              i3 = c(arrayOfShort2, i5, i3, i2);
            }
            else
            {
              a(arrayOfShort2, i5, 1);
              i3 = c(i, 0, i3, i2);
            }
          }
          else
          {
            i3 = i2;
          }
        }
        i6 = u;
        i2 = v;
        if ((i6 != 0) && (s != 0) && (i2 <= i6 * 3) && (i6 * 2 > t * 3)) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if (i2 != 0) {
          i2 = s;
        } else {
          i2 = i3;
        }
        t = i6;
        s = i3;
        arrayOfShort2 = j;
        if (d1 > 1.0D)
        {
          if (f1 >= 2.0F)
          {
            i3 = (int)(i2 / (f1 - 1.0F));
          }
          else
          {
            r = ((int)((2.0F - f1) * i2 / (f1 - 1.0F)));
            i3 = i2;
          }
          arrayOfShort1 = b(l, m, i3);
          l = arrayOfShort1;
          d(i3, b, arrayOfShort1, m, arrayOfShort2, i5, arrayOfShort2, i5 + i2);
          m += i3;
          i3 = i2 + i3 + i5;
        }
        else
        {
          if (f1 < 0.5F)
          {
            i3 = (int)(i2 * f1 / (1.0F - f1));
          }
          else
          {
            r = ((int)((2.0F * f1 - 1.0F) * i2 / (1.0F - f1)));
            i3 = i2;
          }
          arrayOfShort1 = l;
          i7 = m;
          i6 = i2 + i3;
          arrayOfShort1 = b(arrayOfShort1, i7, i6);
          l = arrayOfShort1;
          i7 = b;
          System.arraycopy(arrayOfShort2, i5 * i7, arrayOfShort1, m * i7, i7 * i2);
          d(i3, b, l, m + i2, arrayOfShort2, i5 + i2, arrayOfShort2, i5);
          m += i6;
          i3 = i5 + i3;
        }
      }
      if (h + i3 > i4)
      {
        i5 = k - i3;
        arrayOfShort2 = j;
        i2 = b;
        System.arraycopy(arrayOfShort2, i3 * i2, arrayOfShort2, 0, i2 * i5);
        k = i5;
        break;
        if ((f2 != 1.0F) && (m != i1))
        {
          i2 = a;
          i3 = (int)(i2 / f2);
          for (;;)
          {
            if ((i3 <= 16384) && (i2 <= 16384))
            {
              i5 = m - i1;
              arrayOfShort2 = b(n, o, i5);
              n = arrayOfShort2;
              arrayOfShort1 = l;
              i6 = b;
              System.arraycopy(arrayOfShort1, i1 * i6, arrayOfShort2, o * i6, i6 * i5);
              m = i1;
              o += i5;
              for (i5 = 0;; i5++)
              {
                i6 = o;
                i7 = i6 - 1;
                if (i5 >= i7) {
                  break;
                }
                for (;;)
                {
                  i6 = p + 1;
                  i7 = q;
                  if (i6 * i3 <= i7 * i2) {
                    break;
                  }
                  l = b(l, m, 1);
                  for (i6 = 0;; i6++)
                  {
                    i4 = b;
                    if (i6 >= i4) {
                      break;
                    }
                    arrayOfShort2 = l;
                    i1 = m;
                    arrayOfShort1 = n;
                    int i8 = i5 * i4 + i6;
                    i7 = arrayOfShort1[i8];
                    i8 = arrayOfShort1[(i8 + i4)];
                    int i9 = q;
                    int i10 = p;
                    int i11 = (i10 + 1) * i3;
                    i9 = i11 - i9 * i2;
                    i11 -= i10 * i3;
                    arrayOfShort2[(i1 * i4 + i6)] = ((short)(short)(((i11 - i9) * i8 + i7 * i9) / i11));
                  }
                  q += 1;
                  m += 1;
                }
                p = i6;
                if (i6 == i2)
                {
                  p = 0;
                  boolean bool;
                  if (i7 == i3) {
                    bool = true;
                  } else {
                    bool = false;
                  }
                  b.H(bool);
                  q = 0;
                }
              }
              if (i7 == 0) {
                break;
              }
              arrayOfShort2 = n;
              i3 = b;
              System.arraycopy(arrayOfShort2, i7 * i3, arrayOfShort2, 0, (i6 - i7) * i3);
              o -= i7;
              break;
            }
            i3 /= 2;
            i2 /= 2;
          }
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     x3.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */