package j5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import v5.e0;
import v5.t;

public final class b
{
  public static final byte[] h = { 0, 7, 8, 15 };
  public static final byte[] i = { 0, 119, -120, -1 };
  public static final byte[] j = { 0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1 };
  public final Paint a;
  public final Paint b;
  public final Canvas c;
  public final b d;
  public final a e;
  public final h f;
  public Bitmap g;
  
  public b(int paramInt1, int paramInt2)
  {
    Object localObject = new Paint();
    a = ((Paint)localObject);
    ((Paint)localObject).setStyle(Paint.Style.FILL_AND_STROKE);
    ((Paint)localObject).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    ((Paint)localObject).setPathEffect(null);
    localObject = new Paint();
    b = ((Paint)localObject);
    ((Paint)localObject).setStyle(Paint.Style.FILL);
    ((Paint)localObject).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
    ((Paint)localObject).setPathEffect(null);
    c = new Canvas();
    d = new b(719, 575, 0, 719, 0, 575);
    localObject = a();
    int[] arrayOfInt = b();
    e = new a(0, new int[] { 0, -1, -16777216, -8421505 }, (int[])localObject, arrayOfInt);
    f = new h(paramInt1, paramInt2);
  }
  
  public static int[] a()
  {
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = 0;
    for (int k = 1; k < 16; k++)
    {
      int m;
      int n;
      int i1;
      if (k < 8)
      {
        if ((k & 0x1) != 0) {
          m = 255;
        } else {
          m = 0;
        }
        if ((k & 0x2) != 0) {
          n = 255;
        } else {
          n = 0;
        }
        if ((k & 0x4) != 0) {
          i1 = 255;
        } else {
          i1 = 0;
        }
        arrayOfInt[k] = c(255, m, n, i1);
      }
      else
      {
        i1 = 127;
        if ((k & 0x1) != 0) {
          m = 127;
        } else {
          m = 0;
        }
        if ((k & 0x2) != 0) {
          n = 127;
        } else {
          n = 0;
        }
        if ((k & 0x4) == 0) {
          i1 = 0;
        }
        arrayOfInt[k] = c(255, m, n, i1);
      }
    }
    return arrayOfInt;
  }
  
  public static int[] b()
  {
    int[] arrayOfInt = new int['Ā'];
    arrayOfInt[0] = 0;
    for (int k = 0; k < 256; k++)
    {
      int m = 255;
      int n;
      int i1;
      if (k < 8)
      {
        if ((k & 0x1) != 0) {
          n = 255;
        } else {
          n = 0;
        }
        if ((k & 0x2) != 0) {
          i1 = 255;
        } else {
          i1 = 0;
        }
        if ((k & 0x4) == 0) {
          m = 0;
        }
        arrayOfInt[k] = c(63, n, i1, m);
      }
      else
      {
        m = k & 0x88;
        i1 = 170;
        n = 85;
        int i2;
        int i3;
        int i4;
        if (m != 0)
        {
          if (m != 8)
          {
            i1 = 43;
            if (m != 128)
            {
              if (m == 136)
              {
                if ((k & 0x1) != 0) {
                  m = 43;
                } else {
                  m = 0;
                }
                if ((k & 0x10) != 0) {
                  i2 = 85;
                } else {
                  i2 = 0;
                }
                if ((k & 0x2) != 0) {
                  i3 = 43;
                } else {
                  i3 = 0;
                }
                if ((k & 0x20) != 0) {
                  i4 = 85;
                } else {
                  i4 = 0;
                }
                if ((k & 0x4) == 0) {
                  i1 = 0;
                }
                if ((k & 0x40) == 0) {
                  n = 0;
                }
                arrayOfInt[k] = c(255, m + i2, i3 + i4, i1 + n);
              }
            }
            else
            {
              if ((k & 0x1) != 0) {
                m = 43;
              } else {
                m = 0;
              }
              if ((k & 0x10) != 0) {
                i2 = 85;
              } else {
                i2 = 0;
              }
              if ((k & 0x2) != 0) {
                i3 = 43;
              } else {
                i3 = 0;
              }
              if ((k & 0x20) != 0) {
                i4 = 85;
              } else {
                i4 = 0;
              }
              if ((k & 0x4) == 0) {
                i1 = 0;
              }
              if ((k & 0x40) == 0) {
                n = 0;
              }
              arrayOfInt[k] = c(255, m + 127 + i2, i3 + 127 + i4, i1 + 127 + n);
            }
          }
          else
          {
            if ((k & 0x1) != 0) {
              m = 85;
            } else {
              m = 0;
            }
            if ((k & 0x10) != 0) {
              i2 = 170;
            } else {
              i2 = 0;
            }
            if ((k & 0x2) != 0) {
              i3 = 85;
            } else {
              i3 = 0;
            }
            if ((k & 0x20) != 0) {
              i4 = 170;
            } else {
              i4 = 0;
            }
            if ((k & 0x4) == 0) {
              n = 0;
            }
            if ((k & 0x40) == 0) {
              i1 = 0;
            }
            arrayOfInt[k] = c(127, m + i2, i3 + i4, n + i1);
          }
        }
        else
        {
          if ((k & 0x1) != 0) {
            m = 85;
          } else {
            m = 0;
          }
          if ((k & 0x10) != 0) {
            i2 = 170;
          } else {
            i2 = 0;
          }
          if ((k & 0x2) != 0) {
            i3 = 85;
          } else {
            i3 = 0;
          }
          if ((k & 0x20) != 0) {
            i4 = 170;
          } else {
            i4 = 0;
          }
          if ((k & 0x4) == 0) {
            n = 0;
          }
          if ((k & 0x40) == 0) {
            i1 = 0;
          }
          arrayOfInt[k] = c(255, m + i2, i3 + i4, n + i1);
        }
      }
    }
    return arrayOfInt;
  }
  
  public static int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
  }
  
  public static void d(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint, Canvas paramCanvas)
  {
    t localt = new t(paramArrayOfByte, paramArrayOfByte.length);
    int k = paramInt2;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = null;
    byte[] arrayOfByte3 = null;
    int m = paramInt3;
    paramInt3 = k;
    while (localt.b() != 0)
    {
      int n = localt.g(8);
      if (n != 240)
      {
        int i1 = 2;
        k = 1;
        int i2;
        switch (n)
        {
        default: 
          switch (n)
          {
          }
          break;
        case 18: 
          i1 = 0;
          i2 = paramInt3;
          paramInt3 = i1;
          for (;;)
          {
            i1 = localt.g(8);
            if (i1 != 0)
            {
              n = k;
            }
            else if (!localt.f())
            {
              n = localt.g(7);
              if (n != 0)
              {
                i1 = 0;
              }
              else
              {
                paramInt3 = k;
                i1 = 0;
                n = i1;
              }
            }
            else
            {
              n = localt.g(7);
              i1 = localt.g(8);
            }
            if ((n != 0) && (paramPaint != null))
            {
              paramPaint.setColor(paramArrayOfInt[i1]);
              paramCanvas.drawRect(i2, m, i2 + n, m + 1, paramPaint);
            }
            i2 += n;
            if (paramInt3 != 0)
            {
              paramInt3 = i2;
              break;
            }
          }
        case 17: 
          if (paramInt1 == 3)
          {
            if (arrayOfByte2 == null) {
              paramArrayOfByte = j;
            } else {
              paramArrayOfByte = arrayOfByte2;
            }
          }
          else {
            paramArrayOfByte = null;
          }
          n = 0;
          k = i1;
          i2 = paramInt3;
          paramInt3 = n;
          for (;;)
          {
            i1 = localt.g(4);
            if (i1 != 0)
            {
              n = 1;
            }
            else
            {
              if (!localt.f())
              {
                i1 = localt.g(3);
                if (i1 != 0)
                {
                  i1 += 2;
                  break label495;
                }
                paramInt3 = 1;
              }
              else
              {
                if (!localt.f())
                {
                  i1 = localt.g(k) + 4;
                  break label466;
                }
                i1 = localt.g(k);
                if (i1 == 0) {
                  break label492;
                }
                if (i1 == 1) {
                  break label485;
                }
                if (i1 == k) {
                  break label455;
                }
                if (i1 == 3) {
                  break label440;
                }
              }
              i1 = 0;
              n = i1;
              break label506;
              i1 = localt.g(8) + 25;
              break label466;
              i1 = localt.g(4) + 9;
              i3 = localt.g(4);
              n = i1;
              i1 = i3;
            }
            break label506;
            i1 = k;
            break label495;
            i1 = 1;
            int i3 = 0;
            n = i1;
            i1 = i3;
            if ((n != 0) && (paramPaint != null))
            {
              k = i1;
              if (paramArrayOfByte != null) {
                k = paramArrayOfByte[i1];
              }
              paramPaint.setColor(paramArrayOfInt[k]);
              float f1 = i2;
              float f2 = m;
              float f3 = i2 + n;
              float f4 = m + 1;
              k = 2;
              paramCanvas.drawRect(f1, f2, f3, f4, paramPaint);
            }
            i2 += n;
            if (paramInt3 != 0)
            {
              localt.c();
              paramInt3 = i2;
              break;
            }
          }
        case 16: 
          label440:
          label455:
          label466:
          label485:
          label492:
          label495:
          label506:
          if (paramInt1 == 3)
          {
            if (arrayOfByte1 == null) {
              paramArrayOfByte = i;
            } else {
              paramArrayOfByte = arrayOfByte1;
            }
          }
          else
          {
            if (paramInt1 != 2) {
              break label658;
            }
            if (arrayOfByte3 == null) {
              paramArrayOfByte = h;
            } else {
              paramArrayOfByte = arrayOfByte3;
            }
          }
          break label660;
          label658:
          paramArrayOfByte = null;
          label660:
          k = 0;
          n = paramInt3;
          for (paramInt3 = k;; paramInt3 = k)
          {
            i2 = localt.g(2);
            if (i2 != 0)
            {
              i1 = 1;
              k = paramInt3;
              paramInt3 = i2;
            }
            else
            {
              if (localt.f()) {
                k = localt.g(3) + 3;
              }
              for (;;)
              {
                break;
                if (localt.f())
                {
                  k = 1;
                  break label823;
                }
                k = localt.g(2);
                if (k == 0) {
                  break label841;
                }
                if (k == 1) {
                  break label820;
                }
                if (k != 2)
                {
                  if (k != 3) {
                    break label844;
                  }
                  k = localt.g(8) + 29;
                }
                else
                {
                  k = localt.g(4) + 12;
                }
              }
              i1 = localt.g(2);
              i2 = paramInt3;
              paramInt3 = i1;
              i1 = k;
              k = i2;
              break label855;
              label820:
              k = 2;
              label823:
              i2 = paramInt3;
              paramInt3 = 0;
              i1 = k;
              k = i2;
              break label855;
              label841:
              paramInt3 = 1;
              label844:
              k = paramInt3;
              paramInt3 = 0;
              i1 = paramInt3;
            }
            label855:
            if ((i1 != 0) && (paramPaint != null))
            {
              i2 = paramInt3;
              if (paramArrayOfByte != null) {
                i2 = paramArrayOfByte[paramInt3];
              }
              paramPaint.setColor(paramArrayOfInt[i2]);
              paramCanvas.drawRect(n, m, n + i1, m + 1, paramPaint);
            }
            n += i1;
            if (k != 0)
            {
              localt.c();
              paramInt3 = n;
              break;
            }
          }
          paramArrayOfByte = new byte[16];
          for (k = 0;; k++)
          {
            arrayOfByte2 = paramArrayOfByte;
            if (k >= 16) {
              break;
            }
            paramArrayOfByte[k] = ((byte)(byte)localt.g(8));
          }
          paramArrayOfByte = new byte[4];
          for (k = 0;; k++)
          {
            arrayOfByte1 = paramArrayOfByte;
            if (k >= 4) {
              break;
            }
            paramArrayOfByte[k] = ((byte)(byte)localt.g(8));
          }
          paramArrayOfByte = new byte[4];
          for (k = 0;; k++)
          {
            arrayOfByte3 = paramArrayOfByte;
            if (k >= 4) {
              break;
            }
            paramArrayOfByte[k] = ((byte)(byte)localt.g(4));
          }
        }
      }
      else
      {
        m += 2;
        paramInt3 = paramInt2;
      }
    }
  }
  
  public static a e(t paramt, int paramInt)
  {
    int k = paramt.g(8);
    paramt.m(8);
    paramInt -= 2;
    int[] arrayOfInt1 = new int[4];
    int[] tmp21_20 = arrayOfInt1;
    tmp21_20[0] = 0;
    int[] tmp25_21 = tmp21_20;
    tmp25_21[1] = -1;
    int[] tmp29_25 = tmp25_21;
    tmp29_25[2] = -16777216;
    int[] tmp34_29 = tmp29_25;
    tmp34_29[3] = -8421505;
    tmp34_29;
    int[] arrayOfInt2 = a();
    int[] arrayOfInt3 = b();
    while (paramInt > 0)
    {
      int m = paramt.g(8);
      int n = paramt.g(8);
      paramInt -= 2;
      int[] arrayOfInt4;
      if ((n & 0x80) != 0) {
        arrayOfInt4 = arrayOfInt1;
      } else if ((n & 0x40) != 0) {
        arrayOfInt4 = arrayOfInt2;
      } else {
        arrayOfInt4 = arrayOfInt3;
      }
      if ((n & 0x1) != 0)
      {
        i1 = paramt.g(8);
        i2 = paramt.g(8);
        i3 = paramt.g(8);
        n = paramt.g(8);
        paramInt -= 4;
      }
      else
      {
        i1 = paramt.g(6);
        i2 = paramt.g(4);
        i3 = paramt.g(4);
        n = paramt.g(2);
        paramInt -= 2;
        i2 <<= 4;
        n <<= 6;
        i1 <<= 2;
        i3 <<= 4;
      }
      if (i1 == 0)
      {
        n = 255;
        i2 = 0;
        i3 = 0;
      }
      n = (byte)(255 - (n & 0xFF));
      double d1 = i1;
      double d2 = i2 - 128;
      int i2 = (int)(1.402D * d2 + d1);
      double d3 = i3 - 128;
      int i3 = (int)(d1 - 0.34414D * d3 - d2 * 0.71414D);
      int i1 = (int)(d3 * 1.772D + d1);
      arrayOfInt4[m] = c(n, e0.i(i2, 0, 255), e0.i(i3, 0, 255), e0.i(i1, 0, 255));
    }
    return new a(k, arrayOfInt1, arrayOfInt2, arrayOfInt3);
  }
  
  public static c f(t paramt)
  {
    int k = paramt.g(16);
    paramt.m(4);
    int m = paramt.g(2);
    boolean bool = paramt.f();
    paramt.m(1);
    byte[] arrayOfByte1 = e0.f;
    byte[] arrayOfByte2;
    if (m == 1)
    {
      paramt.m(paramt.g(8) * 16);
      arrayOfByte2 = arrayOfByte1;
    }
    else
    {
      arrayOfByte2 = arrayOfByte1;
      if (m == 0)
      {
        int n = paramt.g(16);
        m = paramt.g(16);
        if (n > 0)
        {
          arrayOfByte1 = new byte[n];
          paramt.i(arrayOfByte1, n);
        }
        arrayOfByte2 = arrayOfByte1;
        if (m > 0)
        {
          arrayOfByte2 = new byte[m];
          paramt.i(arrayOfByte2, m);
          paramt = arrayOfByte2;
          arrayOfByte2 = arrayOfByte1;
          break label133;
        }
      }
    }
    paramt = arrayOfByte2;
    label133:
    return new c(k, bool, arrayOfByte2, paramt);
  }
  
  public static final class a
  {
    public final int a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    
    public a(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
    {
      a = paramInt;
      b = paramArrayOfInt1;
      c = paramArrayOfInt2;
      d = paramArrayOfInt3;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    
    public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      e = paramInt5;
      f = paramInt6;
    }
  }
  
  public static final class c
  {
    public final int a;
    public final boolean b;
    public final byte[] c;
    public final byte[] d;
    
    public c(int paramInt, boolean paramBoolean, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    {
      a = paramInt;
      b = paramBoolean;
      c = paramArrayOfByte1;
      d = paramArrayOfByte2;
    }
  }
  
  public static final class d
  {
    public final int a;
    public final int b;
    public final SparseArray<b.e> c;
    
    public d(int paramInt1, int paramInt2, SparseArray paramSparseArray)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramSparseArray;
    }
  }
  
  public static final class e
  {
    public final int a;
    public final int b;
    
    public e(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
  }
  
  public static final class f
  {
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final SparseArray<b.g> j;
    
    public f(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, SparseArray paramSparseArray)
    {
      a = paramInt1;
      b = paramBoolean;
      c = paramInt2;
      d = paramInt3;
      e = paramInt4;
      f = paramInt5;
      g = paramInt6;
      h = paramInt7;
      i = paramInt8;
      j = paramSparseArray;
    }
  }
  
  public static final class g
  {
    public final int a;
    public final int b;
    
    public g(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
  }
  
  public static final class h
  {
    public final int a;
    public final int b;
    public final SparseArray<b.f> c;
    public final SparseArray<b.a> d;
    public final SparseArray<b.c> e;
    public final SparseArray<b.a> f;
    public final SparseArray<b.c> g;
    public b.b h;
    public b.d i;
    
    public h(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
      c = new SparseArray();
      d = new SparseArray();
      e = new SparseArray();
      f = new SparseArray();
      g = new SparseArray();
    }
  }
}

/* Location:
 * Qualified Name:     j5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */