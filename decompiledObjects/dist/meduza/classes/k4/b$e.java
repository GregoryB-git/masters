package k4;

import v3.i0;
import v5.e0;
import v5.m;
import v5.u;

public final class b$e
  implements b.c
{
  public final int a;
  public final int b;
  public final u c;
  
  public b$e(a.b paramb, i0 parami0)
  {
    paramb = b;
    c = paramb;
    paramb.G(12);
    int i = paramb.y();
    int j = i;
    if ("audio/raw".equals(t))
    {
      int k = e0.w(I, G);
      if (i != 0)
      {
        j = i;
        if (i % k == 0) {}
      }
      else
      {
        parami0 = new StringBuilder();
        parami0.append("Audio sample size mismatch. stsd sample size: ");
        parami0.append(k);
        parami0.append(", stsz sample size: ");
        parami0.append(i);
        m.f("AtomParsers", parami0.toString());
        j = k;
      }
    }
    i = j;
    if (j == 0) {
      i = -1;
    }
    a = i;
    b = paramb.y();
  }
  
  public final int a()
  {
    return a;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final int c()
  {
    int i = a;
    int j = i;
    if (i == -1) {
      j = c.y();
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     k4.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */