package F0;

import d0.q.b;
import g0.a;
import g0.z;

public final class O
  implements r
{
  public final int a;
  public final int b;
  public final String c;
  public int d;
  public int e;
  public t f;
  public T g;
  
  public O(int paramInt1, int paramInt2, String paramString)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramString;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) || (e == 1))
    {
      e = 1;
      d = 0;
    }
  }
  
  public void b(t paramt)
  {
    f = paramt;
    c(c);
  }
  
  public final void c(String paramString)
  {
    T localT = f.a(1024, 4);
    g = localT;
    localT.d(new q.b().o0(paramString).K());
    f.j();
    f.e(new P(-9223372036854775807L));
    e = 1;
  }
  
  public boolean e(s params)
  {
    int i = a;
    boolean bool1 = true;
    boolean bool2;
    if ((i != -1) && (b != -1)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.f(bool2);
    z localz = new z(b);
    params.n(localz.e(), 0, b);
    if (localz.M() == a) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public final void f(s params)
  {
    int i = ((T)a.e(g)).f(params, 1024, true);
    if (i == -1)
    {
      e = 2;
      g.b(0L, 1, d, 0, null);
      d = 0;
    }
    else
    {
      d += i;
    }
  }
  
  public int i(s params, L paramL)
  {
    int i = e;
    if (i != 1)
    {
      if (i == 2) {
        return -1;
      }
      throw new IllegalStateException();
    }
    f(params);
    return 0;
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     F0.O
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */