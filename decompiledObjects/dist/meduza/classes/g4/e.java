package g4;

import c4.v;
import f;
import v3.i0;
import v3.i0.a;
import v5.q;
import v5.u;
import w5.a;

public final class e
  extends d
{
  public final u b = new u(q.a);
  public final u c = new u(4);
  public int d;
  public boolean e;
  public boolean f;
  public int g;
  
  public e(v paramv)
  {
    super(paramv);
  }
  
  public final boolean a(u paramu)
  {
    int i = paramu.v();
    int j = i >> 4 & 0xF;
    i &= 0xF;
    if (i == 7)
    {
      g = j;
      boolean bool;
      if (j != 5) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    throw new d.a(f.h("Video format not supported: ", i));
  }
  
  public final boolean b(long paramLong, u paramu)
  {
    int i = paramu.v();
    Object localObject = a;
    int j = b;
    int k = j + 1;
    int m = localObject[j];
    j = k + 1;
    k = localObject[k];
    b = (j + 1);
    long l = localObject[j] & 0xFF | (m & 0xFF) << 24 >> 8 | (k & 0xFF) << 8;
    if ((i == 0) && (!e))
    {
      localObject = new u(new byte[c - b]);
      paramu.d(a, 0, c - b);
      localObject = a.a((u)localObject);
      d = b;
      paramu = new i0.a();
      k = "video/avc";
      h = f;
      p = c;
      q = d;
      t = e;
      m = a;
      paramu = new i0(paramu);
      a.d(paramu);
      e = true;
      return false;
    }
    if ((i == 1) && (e))
    {
      if (g == 1) {
        i = 1;
      } else {
        i = 0;
      }
      if ((!f) && (i == 0)) {
        return false;
      }
      localObject = c.a;
      localObject[0] = ((byte)0);
      localObject[1] = ((byte)0);
      localObject[2] = ((byte)0);
      j = d;
      for (k = 0; c - b > 0; k = k + 4 + m)
      {
        paramu.d(c.a, 4 - j, d);
        c.G(0);
        m = c.y();
        b.G(0);
        a.b(4, b);
        a.b(m, paramu);
      }
      a.c(l * 1000L + paramLong, i, k, 0, null);
      f = true;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     g4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */