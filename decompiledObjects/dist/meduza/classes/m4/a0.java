package m4;

import c4.a;
import c4.a.b;
import c4.a.e;
import c4.a.f;
import c4.i;
import v5.c0;
import v5.e0;
import v5.u;

public final class a0
  extends a
{
  public a0(c0 paramc0, long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    super(new a.b(), new a(paramInt1, paramc0, paramInt2), paramLong1, paramLong1 + 1L, 0L, paramLong2, 188L, 940);
  }
  
  public static final class a
    implements a.f
  {
    public final c0 a;
    public final u b;
    public final int c;
    public final int d;
    
    public a(int paramInt1, c0 paramc0, int paramInt2)
    {
      c = paramInt1;
      a = paramc0;
      d = paramInt2;
      b = new u();
    }
    
    public final void a()
    {
      u localu = b;
      byte[] arrayOfByte = e0.f;
      localu.getClass();
      localu.E(arrayOfByte, arrayOfByte.length);
    }
    
    public final a.e b(i parami, long paramLong)
    {
      long l1 = parami.getPosition();
      int i = (int)Math.min(d, parami.getLength() - l1);
      b.D(i);
      parami.m(b.a, 0, i);
      parami = b;
      int j = c;
      long l2 = -1L;
      long l3 = -1L;
      long l6;
      for (long l4 = -9223372036854775807L;; l4 = l6)
      {
        int k = c;
        i = b;
        if (k - i < 188) {
          break;
        }
        byte[] arrayOfByte = a;
        while ((i < j) && (arrayOfByte[i] != 71)) {
          i++;
        }
        k = i + 188;
        if (k > j) {
          break;
        }
        l2 = b.a0.A(i, c, parami);
        long l5 = l3;
        l6 = l4;
        if (l2 != -9223372036854775807L)
        {
          l6 = a.b(l2);
          if (l6 > paramLong)
          {
            if (l4 == -9223372036854775807L) {
              return new a.e(-1, l6, l1);
            }
            paramLong = l1 + l3;
          }
          else
          {
            if (100000L + l6 <= paramLong) {
              break label256;
            }
            paramLong = l1 + i;
          }
          return a.e.a(paramLong);
          label256:
          l5 = i;
        }
        parami.G(k);
        l2 = k;
        l3 = l5;
      }
      if (l4 != -9223372036854775807L) {
        parami = new a.e(-2, l4, l1 + l2);
      } else {
        parami = a.e.d;
      }
      return parami;
    }
  }
}

/* Location:
 * Qualified Name:     m4.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */