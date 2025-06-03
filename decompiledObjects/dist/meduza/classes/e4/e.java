package e4;

import c4.t.a;
import c4.u;
import c4.v;
import v5.e0;
import x6.b;

public final class e
{
  public final v a;
  public final int b;
  public final int c;
  public final long d;
  public final int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public long[] k;
  public int[] l;
  
  public e(int paramInt1, int paramInt2, long paramLong, int paramInt3, v paramv)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt2 != 1) {
      if (paramInt2 == 2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    b.q(bool2);
    d = paramLong;
    e = paramInt3;
    a = paramv;
    if (paramInt2 == 2) {
      paramInt3 = 1667497984;
    } else {
      paramInt3 = 1651965952;
    }
    paramInt1 = paramInt1 % 10 + 48 << 8 | paramInt1 / 10 + 48;
    b = (paramInt3 | paramInt1);
    if (paramInt2 == 2) {
      paramInt1 |= 0x62640000;
    } else {
      paramInt1 = -1;
    }
    c = paramInt1;
    k = new long['Ȁ'];
    l = new int['Ȁ'];
  }
  
  public final u a(int paramInt)
  {
    long l1 = l[paramInt];
    return new u(d * 1 / e * l1, k[paramInt]);
  }
  
  public final t.a b(long paramLong)
  {
    int m = (int)(paramLong / (d * 1 / e));
    int n = e0.e(l, m, true, true);
    if (l[n] == m)
    {
      localu = a(n);
      return new t.a(localu, localu);
    }
    u localu = a(n);
    m = n + 1;
    if (m < k.length) {
      return new t.a(localu, a(m));
    }
    return new t.a(localu, localu);
  }
}

/* Location:
 * Qualified Name:     e4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */