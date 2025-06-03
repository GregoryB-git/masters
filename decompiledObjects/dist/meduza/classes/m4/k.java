package m4;

import android.util.Pair;
import c4.v;
import java.util.Arrays;
import java.util.Collections;
import v3.i0;
import v3.i0.a;
import v5.q;
import v5.u;
import x6.b;

public final class k
  implements j
{
  public static final double[] q = { 23.976023976023978D, 24.0D, 25.0D, 29.97002997002997D, 30.0D, 50.0D, 59.94005994005994D, 60.0D };
  public String a;
  public v b;
  public final e0 c;
  public final u d;
  public final r e;
  public final boolean[] f;
  public final a g;
  public long h;
  public boolean i;
  public boolean j;
  public long k;
  public long l;
  public long m;
  public long n;
  public boolean o;
  public boolean p;
  
  public k(e0 parame0)
  {
    c = parame0;
    f = new boolean[4];
    g = new a();
    if (parame0 != null)
    {
      e = new r(178);
      parame0 = new u();
    }
    else
    {
      parame0 = null;
      e = null;
    }
    d = parame0;
    l = -9223372036854775807L;
    n = -9223372036854775807L;
  }
  
  public final void a(u paramu)
  {
    b.K(b);
    int i1 = b;
    int i2 = c;
    byte[] arrayOfByte1 = a;
    long l1 = h;
    int i3 = i2 - i1;
    h = (l1 + i3);
    b.b(i3, paramu);
    for (;;)
    {
      int i4 = q.b(arrayOfByte1, i1, i2, f);
      if (i4 == i2)
      {
        if (!j) {
          g.a(arrayOfByte1, i1, i2);
        }
        paramu = e;
        if (paramu != null) {
          paramu.a(arrayOfByte1, i1, i2);
        }
        return;
      }
      Object localObject1 = a;
      int i6 = i4 + 3;
      int i7 = localObject1[i6] & 0xFF;
      int i8 = i4 - i1;
      if (!j)
      {
        if (i8 > 0) {
          g.a(arrayOfByte1, i1, i4);
        }
        if (i8 < 0) {
          i3 = -i8;
        } else {
          i3 = 0;
        }
        localObject1 = g;
        if (a)
        {
          i3 = b - i3;
          b = i3;
          if ((c == 0) && (i7 == 181))
          {
            c = i3;
          }
          else
          {
            a = false;
            i3 = 1;
            break label276;
          }
        }
        else if (i7 == 179)
        {
          a = true;
        }
        ((a)localObject1).a(a.e, 0, 3);
        i3 = 0;
        label276:
        if (i3 != 0)
        {
          localObject1 = g;
          Object localObject2 = a;
          localObject2.getClass();
          byte[] arrayOfByte2 = Arrays.copyOf(d, b);
          int i9 = arrayOfByte2[4];
          i3 = arrayOfByte2[5] & 0xFF;
          int i10 = arrayOfByte2[6];
          i9 = (i9 & 0xFF) << 4 | i3 >> 4;
          i10 = (i3 & 0xF) << 8 | i10 & 0xFF;
          i3 = (arrayOfByte2[7] & 0xF0) >> 4;
          float f1;
          if (i3 != 2)
          {
            if (i3 != 3)
            {
              if (i3 != 4)
              {
                f1 = 1.0F;
                break label463;
              }
              f1 = i10 * 121;
              i3 = i9 * 100;
            }
            else
            {
              f1 = i10 * 16;
              i3 = i9 * 9;
            }
          }
          else
          {
            f1 = i10 * 4;
            i3 = i9 * 3;
          }
          f1 /= i3;
          label463:
          Object localObject3 = new i0.a();
          a = ((String)localObject2);
          k = "video/mpeg2";
          p = i9;
          q = i10;
          t = f1;
          m = Collections.singletonList(arrayOfByte2);
          localObject2 = new i0((i0.a)localObject3);
          i3 = (arrayOfByte2[7] & 0xF) - 1;
          if (i3 >= 0)
          {
            localObject3 = q;
            if (i3 < 8)
            {
              double d1 = localObject3[i3];
              i9 = arrayOfByte2[(c + 9)];
              i3 = (i9 & 0x60) >> 5;
              i9 &= 0x1F;
              if (i3 != i9) {
                d1 *= (i3 + 1.0D) / (i9 + 1);
              }
              l1 = (1000000.0D / d1);
              break label634;
            }
          }
          l1 = 0L;
          label634:
          localObject1 = Pair.create(localObject2, Long.valueOf(l1));
          b.d((i0)first);
          k = ((Long)second).longValue();
          j = true;
        }
      }
      i3 = i7;
      localObject1 = e;
      if (localObject1 != null)
      {
        if (i8 > 0)
        {
          ((r)localObject1).a(arrayOfByte1, i1, i4);
          i1 = 0;
        }
        else
        {
          i1 = -i8;
        }
        if (e.b(i1))
        {
          localObject1 = e;
          i1 = q.e(d, e);
          localObject1 = d;
          i7 = v5.e0.a;
          ((u)localObject1).E(e.d, i1);
          c.a(n, d);
        }
        i1 = i3;
        if ((i1 == 178) && (a[(i4 + 2)] == 1)) {
          e.d(i1);
        }
      }
      if ((i3 != 0) && (i3 != 179))
      {
        if (i3 == 184) {
          o = true;
        }
      }
      else
      {
        i7 = i2 - i4;
        if ((p) && (j))
        {
          l1 = n;
          if (l1 != -9223372036854775807L)
          {
            int i5 = o;
            i1 = (int)(h - m);
            b.c(l1, i5, i1 - i7, i7, null);
          }
        }
        if ((i) && (!p)) {
          break label1038;
        }
        m = (h - i7);
        l1 = l;
        if (l1 == -9223372036854775807L)
        {
          l1 = n;
          if (l1 != -9223372036854775807L) {
            l1 += k;
          } else {
            l1 = -9223372036854775807L;
          }
        }
        n = l1;
        o = false;
        l = -9223372036854775807L;
        i = true;
        label1038:
        boolean bool = false;
        if (i3 == 0) {
          bool = true;
        }
        p = bool;
      }
      i1 = i6;
    }
  }
  
  public final void b()
  {
    q.a(f);
    Object localObject = g;
    a = false;
    b = 0;
    c = 0;
    localObject = e;
    if (localObject != null) {
      ((r)localObject).c();
    }
    h = 0L;
    i = false;
    l = -9223372036854775807L;
    n = -9223372036854775807L;
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    l = paramLong;
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    a = e;
    paramd.b();
    b = paramj.r(d, 2);
    e0 locale0 = c;
    if (locale0 != null) {
      locale0.b(paramj, paramd);
    }
  }
  
  public static final class a
  {
    public static final byte[] e = { 0, 0, 1 };
    public boolean a;
    public int b;
    public int c;
    public byte[] d = new byte[''];
    
    public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!a) {
        return;
      }
      int i = paramInt2 - paramInt1;
      byte[] arrayOfByte = d;
      paramInt2 = arrayOfByte.length;
      int j = b;
      if (paramInt2 < j + i) {
        d = Arrays.copyOf(arrayOfByte, (j + i) * 2);
      }
      System.arraycopy(paramArrayOfByte, paramInt1, d, b, i);
      b += i;
    }
  }
}

/* Location:
 * Qualified Name:     m4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */