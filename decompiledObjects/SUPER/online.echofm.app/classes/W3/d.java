package W3;

import V3.k;
import d4.b;

public abstract class d
{
  public final a a;
  public final e b;
  public final k c;
  
  public d(a parama, e parame, k paramk)
  {
    a = parama;
    b = parame;
    c = paramk;
  }
  
  public k a()
  {
    return c;
  }
  
  public e b()
  {
    return b;
  }
  
  public a c()
  {
    return a;
  }
  
  public abstract d d(b paramb);
  
  public static enum a
  {
    static
    {
      a locala1 = new a("Overwrite", 0);
      o = locala1;
      a locala2 = new a("Merge", 1);
      p = locala2;
      a locala3 = new a("AckUserWrite", 2);
      q = locala3;
      a locala4 = new a("ListenComplete", 3);
      r = locala4;
      s = new a[] { locala1, locala2, locala3, locala4 };
    }
  }
}

/* Location:
 * Qualified Name:     W3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */