package L0;

import F0.T;
import d0.q.b;
import g0.z;

public final class f
  extends e
{
  public final z b = new z(h0.d.a);
  public final z c = new z(4);
  public int d;
  public boolean e;
  public boolean f;
  public int g;
  
  public f(T paramT)
  {
    super(paramT);
  }
  
  public boolean b(z paramz)
  {
    int i = paramz.G();
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
    paramz = new StringBuilder();
    paramz.append("Video format not supported: ");
    paramz.append(i);
    throw new e.a(paramz.toString());
  }
  
  public boolean c(z paramz, long paramLong)
  {
    int i = paramz.G();
    long l = paramz.q();
    Object localObject;
    if ((i == 0) && (!e))
    {
      localObject = new z(new byte[paramz.a()]);
      paramz.l(((z)localObject).e(), 0, paramz.a());
      paramz = F0.d.b((z)localObject);
      d = b;
      paramz = new q.b().o0("video/avc").O(l).v0(c).Y(d).k0(k).b0(a).K();
      a.d(paramz);
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
      localObject = c.e();
      localObject[0] = ((byte)0);
      localObject[1] = ((byte)0);
      localObject[2] = ((byte)0);
      int j = d;
      int m;
      for (int k = 0; paramz.a() > 0; k = k + 4 + m)
      {
        paramz.l(c.e(), 4 - j, d);
        c.T(0);
        m = c.K();
        b.T(0);
        a.e(b, 4);
        a.e(paramz, m);
      }
      a.b(paramLong + l * 1000L, i, k, 0, null);
      f = true;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     L0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */