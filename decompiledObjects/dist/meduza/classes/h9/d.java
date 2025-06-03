package h9;

import j9.i;
import n9.o;

public abstract class d
  implements Comparable<d>
{
  public final int compareTo(Object paramObject)
  {
    paramObject = (d)paramObject;
    int i = Integer.compare(i(), ((d)paramObject).i());
    if (i == 0)
    {
      i = h().f(((d)paramObject).h());
      if (i == 0)
      {
        i = o.b(f(), ((d)paramObject).f());
        if (i == 0) {
          i = o.b(g(), ((d)paramObject).g());
        }
      }
    }
    return i;
  }
  
  public abstract byte[] f();
  
  public abstract byte[] g();
  
  public abstract i h();
  
  public abstract int i();
}

/* Location:
 * Qualified Name:     h9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */