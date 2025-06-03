package X2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

public abstract class G$f
  extends AbstractMap
{
  public transient Set o;
  public transient Collection p;
  
  public abstract Set a();
  
  public Collection b()
  {
    return new G.e(this);
  }
  
  public Set entrySet()
  {
    Set localSet1 = o;
    Set localSet2 = localSet1;
    if (localSet1 == null)
    {
      localSet2 = a();
      o = localSet2;
    }
    return localSet2;
  }
  
  public Collection values()
  {
    Collection localCollection1 = p;
    Collection localCollection2 = localCollection1;
    if (localCollection1 == null)
    {
      localCollection2 = b();
      p = localCollection2;
    }
    return localCollection2;
  }
}

/* Location:
 * Qualified Name:     X2.G.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */