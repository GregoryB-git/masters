package Z0;

import F0.u;
import g0.z;

public final class b$a
{
  public final int a;
  public int b;
  public int c;
  public long d;
  public final boolean e;
  public final z f;
  public final z g;
  public int h;
  public int i;
  
  public b$a(z paramz1, z paramz2, boolean paramBoolean)
  {
    g = paramz1;
    f = paramz2;
    e = paramBoolean;
    paramz2.T(12);
    a = paramz2.K();
    paramz1.T(12);
    i = paramz1.K();
    int j = paramz1.p();
    paramBoolean = true;
    if (j != 1) {
      paramBoolean = false;
    }
    u.a(paramBoolean, "first_chunk must be 1");
    b = -1;
  }
  
  public boolean a()
  {
    int j = b + 1;
    b = j;
    if (j == a) {
      return false;
    }
    long l;
    if (e) {
      l = f.L();
    } else {
      l = f.I();
    }
    d = l;
    if (b == h)
    {
      c = g.K();
      g.U(4);
      j = i - 1;
      i = j;
      if (j > 0) {
        j = g.K() - 1;
      } else {
        j = -1;
      }
      h = j;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     Z0.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */