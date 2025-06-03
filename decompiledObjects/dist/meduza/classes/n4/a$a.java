package n4;

import c4.i;
import c4.j;
import c4.v;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.u;

public final class a$a
  implements a.b
{
  public static final int[] m = { -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8 };
  public static final int[] n = { 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
  public final j a;
  public final v b;
  public final b c;
  public final int d;
  public final byte[] e;
  public final u f;
  public final int g;
  public final i0 h;
  public int i;
  public long j;
  public int k;
  public long l;
  
  public a$a(j paramj, v paramv, b paramb)
  {
    a = paramj;
    b = paramv;
    c = paramb;
    int i1 = Math.max(1, b / 10);
    g = i1;
    paramj = new u(e);
    paramj.n();
    int i2 = paramj.n();
    d = i2;
    int i3 = a;
    int i4 = c;
    int i5 = (i4 - i3 * 4) * 8 / (d * i3) + 1;
    if (i2 == i5)
    {
      i5 = e0.a;
      i5 = (i1 + i2 - 1) / i2;
      e = new byte[i4 * i5];
      f = new u(i2 * 2 * i3 * i5);
      i4 = b;
      i2 = c * i4 * 8 / i2;
      paramj = new i0.a();
      k = "audio/raw";
      f = i2;
      g = i2;
      l = (i1 * 2 * i3);
      x = a;
      y = i4;
      z = 2;
      h = new i0(paramj);
      return;
    }
    paramj = new StringBuilder();
    paramj.append("Expected frames per block: ");
    paramj.append(i5);
    paramj.append("; got: ");
    paramj.append(i2);
    throw a1.a(paramj.toString(), null);
  }
  
  public final void a(long paramLong)
  {
    i = 0;
    j = paramLong;
    k = 0;
    l = 0L;
  }
  
  public final boolean b(i parami, long paramLong)
  {
    int i1 = g;
    int i2 = k;
    Object localObject1 = c;
    i2 /= a * 2;
    int i3 = d;
    int i4 = e0.a;
    i1 = (i1 - i2 + i3 - 1) / i3 * c;
    boolean bool;
    if (paramLong != 0L) {
      bool = false;
    }
    while (!bool)
    {
      i2 = i;
      if (i2 >= i1) {
        break;
      }
      i2 = (int)Math.min(i1 - i2, paramLong);
      i2 = parami.read(e, i, i2);
      if (i2 == -1) {
        bool = true;
      } else {
        i += i2;
      }
    }
    int i5 = i / c.c;
    if (i5 > 0)
    {
      parami = e;
      localObject1 = f;
      for (i1 = 0; i1 < i5; i1++) {
        for (i2 = 0;; i2++)
        {
          Object localObject2 = c;
          int i6 = a;
          if (i2 >= i6) {
            break;
          }
          byte[] arrayOfByte = a;
          i4 = c;
          int i7 = i2 * 4 + i1 * i4;
          i4 = i4 / i6 - 4;
          i3 = parami[(i7 + 1)];
          int i8 = (short)(parami[i7] & 0xFF | (i3 & 0xFF) << 8);
          i3 = Math.min(parami[(i7 + 2)] & 0xFF, 88);
          int i9 = n[i3];
          int i10 = (d * i1 * i6 + i2) * 2;
          arrayOfByte[i10] = ((byte)(byte)(i8 & 0xFF));
          arrayOfByte[(i10 + 1)] = ((byte)(byte)(i8 >> 8));
          for (int i11 = 0; i11 < i4 * 2; i11++)
          {
            int i12 = parami[(i11 / 8 * i6 * 4 + (i6 * 4 + i7) + i11 / 2 % 4)] & 0xFF;
            if (i11 % 2 == 0) {
              i12 &= 0xF;
            } else {
              i12 >>= 4;
            }
            int i13 = ((i12 & 0x7) * 2 + 1) * i9 >> 3;
            i9 = i13;
            if ((i12 & 0x8) != 0) {
              i9 = -i13;
            }
            i8 = e0.i(i8 + i9, 32768, 32767);
            i10 += i6 * 2;
            arrayOfByte[i10] = ((byte)(byte)(i8 & 0xFF));
            arrayOfByte[(i10 + 1)] = ((byte)(byte)(i8 >> 8));
            i9 = m[i12];
            localObject2 = n;
            i3 = e0.i(i3 + i9, 0, 88);
            i9 = localObject2[i3];
          }
        }
      }
      i2 = d;
      i1 = c.a;
      ((u)localObject1).G(0);
      ((u)localObject1).F(i2 * i5 * 2 * i1);
      i -= i5 * c.c;
      parami = f;
      i1 = c;
      b.b(i1, parami);
      i1 = k + i1;
      k = i1;
      i1 /= c.a * 2;
      i2 = g;
      if (i1 >= i2) {
        d(i2);
      }
    }
    if (bool)
    {
      i1 = k / (c.a * 2);
      if (i1 > 0) {
        d(i1);
      }
    }
    return bool;
  }
  
  public final void c(int paramInt, long paramLong)
  {
    a.t(new d(c, d, paramInt, paramLong));
    b.d(h);
  }
  
  public final void d(int paramInt)
  {
    long l1 = j;
    long l2 = e0.O(l, 1000000L, c.b);
    int i1 = paramInt * 2 * c.a;
    int i2 = k;
    b.c(l1 + l2, 1, i1, i2 - i1, null);
    l += paramInt;
    k -= i1;
  }
}

/* Location:
 * Qualified Name:     n4.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */