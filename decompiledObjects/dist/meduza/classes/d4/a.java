package d4;

import c4.d;
import c4.h;
import c4.i;
import c4.j;
import c4.s;
import c4.t;
import c4.t.b;
import c4.v;
import f;
import java.io.EOFException;
import java.util.Arrays;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;
import x6.b;

public final class a
  implements h
{
  public static final int[] p = { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
  public static final int[] q;
  public static final byte[] r = e0.B("#!AMR\n");
  public static final byte[] s = e0.B("#!AMR-WB\n");
  public static final int t = arrayOfInt[8];
  public final byte[] a;
  public final int b;
  public boolean c;
  public long d;
  public int e;
  public int f;
  public boolean g;
  public long h;
  public int i;
  public int j;
  public long k;
  public j l;
  public v m;
  public t n;
  public boolean o;
  
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
    q = arrayOfInt;
  }
  
  public a(int paramInt)
  {
    int i1 = paramInt;
    if ((paramInt & 0x2) != 0) {
      i1 = paramInt | 0x1;
    }
    b = i1;
    a = new byte[1];
    i = -1;
  }
  
  public final int a(i parami)
  {
    parami.i();
    Object localObject = a;
    int i1 = 0;
    parami.m((byte[])localObject, 0, 1);
    int i2 = a[0];
    if ((i2 & 0x83) <= 0)
    {
      int i3 = i2 >> 3 & 0xF;
      int i4 = i1;
      if (i3 >= 0)
      {
        i4 = i1;
        if (i3 <= 15)
        {
          boolean bool = c;
          if ((bool) && ((i3 < 10) || (i3 > 13))) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 == 0)
          {
            if ((!bool) && ((i3 < 12) || (i3 > 14))) {
              i2 = 1;
            } else {
              i2 = 0;
            }
            i4 = i1;
            if (i2 == 0) {}
          }
          else
          {
            i4 = 1;
          }
        }
      }
      if (i4 == 0)
      {
        localObject = f.l("Illegal AMR ");
        if (c) {
          parami = "WB";
        } else {
          parami = "NB";
        }
        ((StringBuilder)localObject).append(parami);
        ((StringBuilder)localObject).append(" frame type ");
        ((StringBuilder)localObject).append(i3);
        throw a1.a(((StringBuilder)localObject).toString(), null);
      }
      if (c) {
        i2 = q[i3];
      } else {
        i2 = p[i3];
      }
      return i2;
    }
    parami = new StringBuilder();
    parami.append("Invalid padding bits for frame header ");
    parami.append(i2);
    throw a1.a(parami.toString(), null);
  }
  
  public final void b(j paramj)
  {
    l = paramj;
    m = paramj.r(0, 1);
    paramj.m();
  }
  
  public final boolean c(i parami)
  {
    byte[] arrayOfByte1 = r;
    parami.i();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    parami.m(arrayOfByte2, 0, arrayOfByte1.length);
    int i1;
    if (Arrays.equals(arrayOfByte2, arrayOfByte1))
    {
      c = false;
      i1 = arrayOfByte1.length;
    }
    else
    {
      arrayOfByte2 = s;
      parami.i();
      arrayOfByte1 = new byte[arrayOfByte2.length];
      parami.m(arrayOfByte1, 0, arrayOfByte2.length);
      if (!Arrays.equals(arrayOfByte1, arrayOfByte2)) {
        break label97;
      }
      c = true;
      i1 = arrayOfByte2.length;
    }
    parami.j(i1);
    return true;
    label97:
    return false;
  }
  
  public final int d(i parami, s params)
  {
    b.K(m);
    int i1 = e0.a;
    if ((parami.getPosition() == 0L) && (!c(parami))) {
      throw a1.a("Could not find AMR header.", null);
    }
    boolean bool;
    if (!o)
    {
      o = true;
      bool = c;
      if (bool) {
        params = "audio/amr-wb";
      } else {
        params = "audio/3gpp";
      }
      if (bool) {
        i1 = 16000;
      } else {
        i1 = 8000;
      }
      v localv = m;
      i0.a locala = new i0.a();
      k = params;
      l = t;
      x = 1;
      y = i1;
      localv.d(new i0(locala));
    }
    if (f == 0) {}
    try
    {
      i1 = a(parami);
      e = i1;
      f = i1;
      if (i == -1)
      {
        h = parami.getPosition();
        i = e;
      }
      if (i == e) {
        j += 1;
      }
      i1 = m.e(parami, f, true);
      if (i1 != -1) {
        break label241;
      }
    }
    catch (EOFException params)
    {
      long l1;
      int i2;
      int i3;
      for (;;) {}
    }
    i1 = -1;
    break label299;
    label241:
    i1 = f - i1;
    f = i1;
    if (i1 <= 0)
    {
      m.c(k + d, 1, e, 0, null);
      d += 20000L;
    }
    i1 = 0;
    label299:
    l1 = parami.getLength();
    if (!g)
    {
      i2 = b;
      if (((i2 & 0x1) != 0) && (l1 != -1L))
      {
        i3 = i;
        if ((i3 == -1) || (i3 == e))
        {
          if ((j < 20) && (i1 != -1)) {
            break label461;
          }
          if ((i2 & 0x2) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          parami = new d((int)(i3 * 8L * 1000000L / 20000L), i3, l1, h, bool);
          break label441;
        }
      }
      parami = new t.b(-9223372036854775807L);
      label441:
      n = parami;
      l.t(parami);
      g = true;
    }
    label461:
    return i1;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    d = 0L;
    e = 0;
    f = 0;
    if (paramLong1 != 0L)
    {
      Object localObject = n;
      if ((localObject instanceof d))
      {
        localObject = (d)localObject;
        paramLong2 = b;
        int i1 = e;
        k = (Math.max(0L, paramLong1 - paramLong2) * 8L * 1000000L / i1);
        return;
      }
    }
    k = 0L;
  }
  
  public final boolean i(i parami)
  {
    return c(parami);
  }
  
  public final void release() {}
}

/* Location:
 * Qualified Name:     d4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */