package i0;

import W2.n;
import java.util.Map;

public final class m$b
  implements g.a
{
  public final u a = new u();
  public y b;
  public n c;
  public String d;
  public int e = 8000;
  public int f = 8000;
  public boolean g;
  public boolean h;
  public boolean i;
  
  public m b()
  {
    m localm = new m(d, e, f, g, h, a, c, i, null);
    y localy = b;
    if (localy != null) {
      localm.c(localy);
    }
    return localm;
  }
  
  public b c(boolean paramBoolean)
  {
    g = paramBoolean;
    return this;
  }
  
  public b d(Map paramMap)
  {
    a.a(paramMap);
    return this;
  }
  
  public b e(String paramString)
  {
    d = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     i0.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */