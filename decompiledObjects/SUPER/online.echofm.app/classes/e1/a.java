package e1;

import X2.v;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c1.e;
import c1.t;
import c1.t.b;
import g0.M;
import g0.g;
import g0.o;
import g0.y;
import g0.z;
import java.util.ArrayList;
import java.util.List;

public final class a
  implements t
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
  
  public a(List paramList)
  {
    paramList = new z((byte[])paramList.get(0));
    int k = paramList.M();
    int m = paramList.M();
    paramList = new Paint();
    a = paramList;
    paramList.setStyle(Paint.Style.FILL_AND_STROKE);
    paramList.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    paramList.setPathEffect(null);
    paramList = new Paint();
    b = paramList;
    paramList.setStyle(Paint.Style.FILL);
    paramList.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
    paramList.setPathEffect(null);
    c = new Canvas();
    d = new b(719, 575, 0, 719, 0, 575);
    e = new a(0, f(), g(), h());
    f = new h(k, m);
  }
  
  public static byte[] e(int paramInt1, int paramInt2, y paramy)
  {
    byte[] arrayOfByte = new byte[paramInt1];
    for (int k = 0; k < paramInt1; k++) {
      arrayOfByte[k] = ((byte)(byte)paramy.h(paramInt2));
    }
    return arrayOfByte;
  }
  
  public static int[] f()
  {
    return new int[] { 0, -1, -16777216, -8421505 };
  }
  
  public static int[] g()
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
        arrayOfInt[k] = i(255, m, n, i1);
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
        arrayOfInt[k] = i(255, m, n, i1);
      }
    }
    return arrayOfInt;
  }
  
  public static int[] h()
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
        arrayOfInt[k] = i(63, n, i1, m);
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
                arrayOfInt[k] = i(255, m + i2, i3 + i4, i1 + n);
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
              arrayOfInt[k] = i(255, m + 127 + i2, i3 + 127 + i4, i1 + 127 + n);
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
            arrayOfInt[k] = i(127, m + i2, i3 + i4, n + i1);
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
          arrayOfInt[k] = i(255, m + i2, i3 + i4, n + i1);
        }
      }
    }
    return arrayOfInt;
  }
  
  public static int i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
  }
  
  public static int j(y paramy, int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas)
  {
    int k = 0;
    int m = paramInt1;
    for (paramInt1 = k;; paramInt1 = k)
    {
      int n = paramy.h(2);
      int i1;
      if (n != 0)
      {
        k = paramInt1;
        i1 = 1;
        paramInt1 = n;
      }
      else if (paramy.g())
      {
        k = paramy.h(3) + 3;
        int i2 = paramy.h(2);
        i1 = paramInt1;
        n = k;
        paramInt1 = i2;
        k = i1;
        i1 = n;
      }
      else if (paramy.g())
      {
        i1 = 1;
        label87:
        k = paramInt1;
        paramInt1 = 0;
      }
      else
      {
        k = paramy.h(2);
        if (k != 0) {
          if (k != 1) {
            if (k != 2) {
              if (k == 3) {}
            }
          }
        }
        for (k = paramInt1;; k = 1)
        {
          paramInt1 = 0;
          i1 = paramInt1;
          break label175;
          k = paramy.h(8) + 29;
          break;
          k = paramy.h(4) + 12;
          break;
          i1 = 2;
          break label87;
        }
      }
      label175:
      if ((i1 != 0) && (paramPaint != null))
      {
        n = paramInt1;
        if (paramArrayOfByte != null) {
          n = paramArrayOfByte[paramInt1];
        }
        paramPaint.setColor(paramArrayOfInt[n]);
        paramCanvas.drawRect(m, paramInt2, m + i1, paramInt2 + 1, paramPaint);
      }
      m += i1;
      if (k != 0) {
        return m;
      }
    }
  }
  
  public static int k(y paramy, int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas)
  {
    int k = 0;
    int m = paramInt1;
    for (paramInt1 = k;; paramInt1 = k)
    {
      int n = paramy.h(4);
      int i1;
      if (n != 0)
      {
        k = paramInt1;
        i1 = 1;
        paramInt1 = n;
      }
      else
      {
        if (!paramy.g())
        {
          k = paramy.h(3);
          if (k != 0) {
            i1 = k + 2;
          }
        }
        for (;;)
        {
          k = paramInt1;
          paramInt1 = 0;
          break;
          k = 1;
          paramInt1 = 0;
          i1 = paramInt1;
          break;
          if (!paramy.g()) {
            k = paramy.h(2) + 4;
          }
          for (;;)
          {
            int i2 = paramy.h(4);
            i1 = paramInt1;
            n = k;
            paramInt1 = i2;
            k = i1;
            i1 = n;
            break label196;
            k = paramy.h(2);
            if (k == 0) {
              break label190;
            }
            if (k == 1) {
              break label184;
            }
            if (k != 2)
            {
              if (k != 3)
              {
                k = paramInt1;
                break;
              }
              k = paramy.h(8) + 25;
              continue;
            }
            k = paramy.h(4) + 9;
          }
          label184:
          i1 = 2;
          continue;
          label190:
          i1 = 1;
        }
      }
      label196:
      if ((i1 != 0) && (paramPaint != null))
      {
        n = paramInt1;
        if (paramArrayOfByte != null) {
          n = paramArrayOfByte[paramInt1];
        }
        paramPaint.setColor(paramArrayOfInt[n]);
        paramCanvas.drawRect(m, paramInt2, m + i1, paramInt2 + 1, paramPaint);
      }
      m += i1;
      if (k != 0) {
        return m;
      }
    }
  }
  
  public static int l(y paramy, int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas)
  {
    int k = 0;
    int m = paramInt1;
    for (paramInt1 = k;; paramInt1 = k)
    {
      int n = paramy.h(8);
      int i1;
      if (n != 0)
      {
        k = paramInt1;
        i1 = 1;
        paramInt1 = n;
      }
      else if (!paramy.g())
      {
        i1 = paramy.h(7);
        if (i1 != 0)
        {
          k = paramInt1;
          paramInt1 = 0;
        }
        else
        {
          k = 1;
          paramInt1 = 0;
          i1 = paramInt1;
        }
      }
      else
      {
        i1 = paramy.h(7);
        n = paramy.h(8);
        k = paramInt1;
        paramInt1 = n;
      }
      if ((i1 != 0) && (paramPaint != null))
      {
        n = paramInt1;
        if (paramArrayOfByte != null) {
          n = paramArrayOfByte[paramInt1];
        }
        paramPaint.setColor(paramArrayOfInt[n]);
        paramCanvas.drawRect(m, paramInt2, m + i1, paramInt2 + 1, paramPaint);
      }
      m += i1;
      if (k != 0) {
        return m;
      }
    }
  }
  
  public static void m(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint, Canvas paramCanvas)
  {
    y localy = new y(paramArrayOfByte);
    int k = paramInt2;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = arrayOfByte1;
    byte[] arrayOfByte3 = arrayOfByte2;
    int m = paramInt3;
    paramInt3 = k;
    while (localy.b() != 0)
    {
      k = localy.h(8);
      if (k != 240)
      {
        switch (k)
        {
        default: 
          switch (k)
          {
          default: 
            break;
          case 34: 
            arrayOfByte2 = e(16, 8, localy);
            break;
          case 33: 
            arrayOfByte1 = e(4, 8, localy);
            break;
          case 32: 
            arrayOfByte3 = e(4, 4, localy);
          }
          break;
        case 18: 
          paramInt3 = l(localy, paramArrayOfInt, null, paramInt3, m, paramPaint, paramCanvas);
          break;
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
        case 16: 
          for (paramInt3 = k(localy, paramArrayOfInt, paramArrayOfByte, paramInt3, m, paramPaint, paramCanvas);; paramInt3 = j(localy, paramArrayOfInt, paramArrayOfByte, paramInt3, m, paramPaint, paramCanvas))
          {
            localy.c();
            break;
            if (paramInt1 == 3) {
              if (arrayOfByte1 == null) {
                paramArrayOfByte = i;
              } else {
                paramArrayOfByte = arrayOfByte1;
              }
            }
            for (;;)
            {
              break;
              if (paramInt1 == 2)
              {
                if (arrayOfByte3 == null) {
                  paramArrayOfByte = h;
                } else {
                  paramArrayOfByte = arrayOfByte3;
                }
              }
              else {
                paramArrayOfByte = null;
              }
            }
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
  
  public static void n(c paramc, a parama, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint, Canvas paramCanvas)
  {
    if (paramInt1 == 3) {
      parama = d;
    } else if (paramInt1 == 2) {
      parama = c;
    } else {
      parama = b;
    }
    m(c, parama, paramInt1, paramInt2, paramInt3, paramPaint, paramCanvas);
    m(d, parama, paramInt1, paramInt2, paramInt3 + 1, paramPaint, paramCanvas);
  }
  
  public static a p(y paramy, int paramInt)
  {
    int k = paramy.h(8);
    paramy.r(8);
    paramInt -= 2;
    int[] arrayOfInt1 = f();
    int[] arrayOfInt2 = g();
    int[] arrayOfInt3 = h();
    while (paramInt > 0)
    {
      int m = paramy.h(8);
      int n = paramy.h(8);
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
        i1 = paramy.h(8);
        i2 = paramy.h(8);
        i3 = paramy.h(8);
        n = paramy.h(8);
        paramInt -= 6;
      }
      else
      {
        i1 = paramy.h(6);
        i2 = paramy.h(4);
        i3 = paramy.h(4) << 4;
        n = paramy.h(2);
        paramInt -= 4;
        n <<= 6;
        i1 <<= 2;
        i2 <<= 4;
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
      int i2 = (int)(d1 + 1.402D * d2);
      double d3 = i3 - 128;
      int i1 = (int)(d1 - 0.34414D * d3 - d2 * 0.71414D);
      int i3 = (int)(d1 + d3 * 1.772D);
      arrayOfInt4[m] = i(n, M.p(i2, 0, 255), M.p(i1, 0, 255), M.p(i3, 0, 255));
    }
    return new a(k, arrayOfInt1, arrayOfInt2, arrayOfInt3);
  }
  
  public static b q(y paramy)
  {
    paramy.r(4);
    boolean bool = paramy.g();
    paramy.r(3);
    int k = paramy.h(16);
    int m = paramy.h(16);
    int n;
    int i1;
    int i2;
    int i3;
    if (bool)
    {
      n = paramy.h(16);
      i1 = paramy.h(16);
      i2 = paramy.h(16);
      i3 = paramy.h(16);
    }
    else
    {
      n = 0;
      i2 = n;
      i1 = k;
      i3 = m;
    }
    return new b(k, m, n, i1, i2, i3);
  }
  
  public static c r(y paramy)
  {
    int k = paramy.h(16);
    paramy.r(4);
    int m = paramy.h(2);
    boolean bool = paramy.g();
    paramy.r(1);
    Object localObject1 = M.f;
    Object localObject2;
    if (m == 1)
    {
      paramy.r(paramy.h(8) * 16);
      localObject2 = localObject1;
    }
    else
    {
      localObject2 = localObject1;
      if (m == 0)
      {
        m = paramy.h(16);
        int n = paramy.h(16);
        if (m > 0)
        {
          localObject1 = new byte[m];
          paramy.k((byte[])localObject1, 0, m);
        }
        localObject2 = localObject1;
        if (n > 0)
        {
          localObject2 = new byte[n];
          paramy.k((byte[])localObject2, 0, n);
          paramy = (y)localObject2;
          break label135;
        }
      }
    }
    paramy = (y)localObject2;
    localObject1 = localObject2;
    label135:
    return new c(k, bool, (byte[])localObject1, paramy);
  }
  
  public static d s(y paramy, int paramInt)
  {
    int k = paramy.h(8);
    int m = paramy.h(4);
    int n = paramy.h(2);
    paramy.r(2);
    paramInt -= 2;
    SparseArray localSparseArray = new SparseArray();
    while (paramInt > 0)
    {
      int i1 = paramy.h(8);
      paramy.r(8);
      int i2 = paramy.h(16);
      int i3 = paramy.h(16);
      paramInt -= 6;
      localSparseArray.put(i1, new e(i2, i3));
    }
    return new d(k, m, n, localSparseArray);
  }
  
  public static f t(y paramy, int paramInt)
  {
    int k = paramy.h(8);
    paramy.r(4);
    boolean bool = paramy.g();
    paramy.r(3);
    int m = paramy.h(16);
    int n = paramy.h(16);
    int i1 = paramy.h(3);
    int i2 = paramy.h(3);
    int i3 = 2;
    paramy.r(2);
    int i4 = paramy.h(8);
    int i5 = paramy.h(8);
    int i6 = paramy.h(4);
    int i7 = paramy.h(2);
    paramy.r(2);
    paramInt -= 10;
    SparseArray localSparseArray = new SparseArray();
    while (paramInt > 0)
    {
      int i8 = paramy.h(16);
      int i9 = paramy.h(i3);
      int i10 = paramy.h(i3);
      int i11 = paramy.h(12);
      paramy.r(4);
      int i12 = paramy.h(12);
      if (i9 != 1)
      {
        if (i9 == 2) {}
      }
      else {
        for (;;)
        {
          i13 = 0;
          i3 = i13;
          paramInt -= 6;
          break;
        }
      }
      int i13 = paramy.h(8);
      i3 = paramy.h(8);
      int i14 = paramInt - 8;
      paramInt = i13;
      i13 = paramInt;
      paramInt = i14;
      localSparseArray.put(i8, new g(i9, i10, i11, i12, i13, i3));
      i3 = 2;
    }
    return new f(k, bool, m, n, i1, i2, i4, i5, i6, i7, localSparseArray);
  }
  
  public static void u(y paramy, h paramh)
  {
    int k = paramy.h(8);
    int m = paramy.h(16);
    int n = paramy.h(16);
    int i1 = paramy.d();
    if (n * 8 > paramy.b())
    {
      o.h("DvbParser", "Data field length exceeds limit");
      paramy.r(paramy.b());
      return;
    }
    Object localObject1;
    Object localObject2;
    switch (k)
    {
    default: 
      break;
    case 20: 
      if (m == a) {
        h = q(paramy);
      }
      break;
    case 19: 
      if (m == a)
      {
        localObject1 = r(paramy);
        localObject2 = e;
        paramh = (h)localObject1;
      }
      for (;;)
      {
        k = a;
        localObject1 = paramh;
        ((SparseArray)localObject2).put(k, localObject1);
        break;
        if (m != b) {
          break;
        }
        localObject2 = r(paramy);
        localObject1 = g;
        paramh = (h)localObject2;
        localObject2 = localObject1;
      }
    case 18: 
      if (m == a) {
        localObject2 = p(paramy, n);
      }
      for (paramh = d;; paramh = f)
      {
        k = a;
        localObject1 = localObject2;
        localObject2 = paramh;
        break;
        if (m != b) {
          break label412;
        }
        localObject2 = p(paramy, n);
      }
    case 17: 
      localObject1 = i;
      if ((m == a) && (localObject1 != null))
      {
        localObject2 = t(paramy, n);
        if (c == 0)
        {
          localObject1 = (f)c.get(a);
          if (localObject1 != null) {
            ((f)localObject2).a((f)localObject1);
          }
        }
        c.put(a, localObject2);
      }
      break;
    case 16: 
      if (m == a)
      {
        localObject2 = i;
        localObject1 = s(paramy, n);
        if (c != 0)
        {
          i = ((d)localObject1);
          c.clear();
          d.clear();
          e.clear();
        }
        else if ((localObject2 != null) && (b != b))
        {
          i = ((d)localObject1);
        }
      }
      break;
    }
    label412:
    paramy.s(i1 + n - paramy.d());
  }
  
  public void b()
  {
    f.a();
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, t.b paramb, g paramg)
  {
    paramArrayOfByte = new y(paramArrayOfByte, paramInt2 + paramInt1);
    paramArrayOfByte.p(paramInt1);
    paramg.accept(o(paramArrayOfByte));
  }
  
  public int d()
  {
    return 2;
  }
  
  public final e o(y paramy)
  {
    while ((paramy.b() >= 48) && (paramy.h(8) == 15)) {
      u(paramy, f);
    }
    Object localObject1 = f;
    paramy = i;
    if (paramy == null) {
      return new e(v.Y(), -9223372036854775807L, -9223372036854775807L);
    }
    localObject1 = h;
    if (localObject1 == null) {
      localObject1 = d;
    }
    Object localObject2 = g;
    if ((localObject2 == null) || (a + 1 != ((Bitmap)localObject2).getWidth()) || (b + 1 != g.getHeight()))
    {
      localObject2 = Bitmap.createBitmap(a + 1, b + 1, Bitmap.Config.ARGB_8888);
      g = ((Bitmap)localObject2);
      c.setBitmap((Bitmap)localObject2);
    }
    ArrayList localArrayList = new ArrayList();
    SparseArray localSparseArray = d;
    for (int k = 0; k < localSparseArray.size(); k++)
    {
      c.save();
      paramy = (e)localSparseArray.valueAt(k);
      int m = localSparseArray.keyAt(k);
      f localf = (f)f.c.get(m);
      int n = a + c;
      int i1 = b + e;
      int i2 = Math.min(c + n, d);
      m = Math.min(d + i1, f);
      c.clipRect(n, i1, i2, m);
      localObject2 = (a)f.d.get(g);
      paramy = (y)localObject2;
      if (localObject2 == null)
      {
        localObject2 = (a)f.f.get(g);
        paramy = (y)localObject2;
        if (localObject2 == null) {
          paramy = e;
        }
      }
      localObject2 = k;
      for (m = 0; m < ((SparseArray)localObject2).size(); m++)
      {
        i2 = ((SparseArray)localObject2).keyAt(m);
        g localg = (g)((SparseArray)localObject2).valueAt(m);
        c localc = (c)f.e.get(i2);
        if (localc == null) {
          localc = (c)f.g.get(i2);
        }
        if (localc != null)
        {
          if (b) {}
          for (Paint localPaint = null;; localPaint = a) {
            break;
          }
          n(localc, paramy, f, c + n, i1 + d, localPaint, c);
        }
      }
      if (b)
      {
        m = f;
        if (m == 3) {
          m = d[h];
        } else if (m == 2) {
          m = c[i];
        } else {
          m = b[j];
        }
        b.setColor(m);
        c.drawRect(n, i1, c + n, d + i1, b);
      }
      localArrayList.add(new f0.a.b().f(Bitmap.createBitmap(g, n, i1, c, d)).k(n / a).l(0).h(i1 / b, 0).i(0).n(c / a).g(d / b).a());
      c.drawColor(0, PorterDuff.Mode.CLEAR);
      c.restore();
    }
    return new e(localArrayList, -9223372036854775807L, -9223372036854775807L);
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
    public final int c;
    public final SparseArray d;
    
    public d(int paramInt1, int paramInt2, int paramInt3, SparseArray paramSparseArray)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramSparseArray;
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
    public final int j;
    public final SparseArray k;
    
    public f(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, SparseArray paramSparseArray)
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
      j = paramInt9;
      k = paramSparseArray;
    }
    
    public void a(f paramf)
    {
      paramf = k;
      for (int m = 0; m < paramf.size(); m++) {
        k.put(paramf.keyAt(m), (a.g)paramf.valueAt(m));
      }
    }
  }
  
  public static final class g
  {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    
    public g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      e = paramInt5;
      f = paramInt6;
    }
  }
  
  public static final class h
  {
    public final int a;
    public final int b;
    public final SparseArray c;
    public final SparseArray d;
    public final SparseArray e;
    public final SparseArray f;
    public final SparseArray g;
    public a.b h;
    public a.d i;
    
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
    
    public void a()
    {
      c.clear();
      d.clear();
      e.clear();
      f.clear();
      g.clear();
      h = null;
      i = null;
    }
  }
}

/* Location:
 * Qualified Name:     e1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */