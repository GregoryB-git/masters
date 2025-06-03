package e7;

import java.util.HashSet;
import r.b;
import r.h;

public final class y6
  extends h6
{
  public String e;
  public HashSet f;
  public b o;
  public Long p;
  public Long q;
  
  public y6(i6 parami6)
  {
    super(parami6);
  }
  
  public final boolean r()
  {
    return false;
  }
  
  public final a7 s(Integer paramInteger)
  {
    if (o.containsKey(paramInteger)) {
      return (a7)o.getOrDefault(paramInteger, null);
    }
    a7 locala7 = new a7(this, e);
    o.put(paramInteger, locala7);
    return locala7;
  }
}

/* Location:
 * Qualified Name:     e7.y6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */