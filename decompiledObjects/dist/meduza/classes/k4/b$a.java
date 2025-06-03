package k4;

import v5.u;
import x6.b;

public final class b$a
{
  public final int a;
  public int b;
  public int c;
  public long d;
  public final boolean e;
  public final u f;
  public final u g;
  public int h;
  public int i;
  
  public b$a(u paramu1, u paramu2, boolean paramBoolean)
  {
    g = paramu1;
    f = paramu2;
    e = paramBoolean;
    paramu2.G(12);
    a = paramu2.y();
    paramu1.G(12);
    i = paramu1.y();
    int j = paramu1.f();
    paramBoolean = true;
    if (j != 1) {
      paramBoolean = false;
    }
    b.u("first_chunk must be 1", paramBoolean);
    b = -1;
  }
  
  public final boolean a()
  {
    int j = b + 1;
    b = j;
    if (j == a) {
      return false;
    }
    long l;
    if (e) {
      l = f.z();
    } else {
      l = f.w();
    }
    d = l;
    if (b == h)
    {
      c = g.y();
      g.H(4);
      j = i - 1;
      i = j;
      if (j > 0) {
        j = g.y() - 1;
      } else {
        j = -1;
      }
      h = j;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     k4.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */