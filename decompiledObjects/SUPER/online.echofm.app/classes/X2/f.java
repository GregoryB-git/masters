package X2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class f
  implements H
{
  public transient Set o;
  public transient Collection p;
  public transient Map q;
  
  public Map a()
  {
    Map localMap1 = q;
    Map localMap2 = localMap1;
    if (localMap1 == null)
    {
      localMap2 = c();
      q = localMap2;
    }
    return localMap2;
  }
  
  public boolean b(Object paramObject)
  {
    Iterator localIterator = a().values().iterator();
    while (localIterator.hasNext()) {
      if (((Collection)localIterator.next()).contains(paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public abstract Map c();
  
  public abstract Set d();
  
  public abstract Collection e();
  
  public boolean equals(Object paramObject)
  {
    return K.a(this, paramObject);
  }
  
  public Set f()
  {
    Set localSet1 = o;
    Set localSet2 = localSet1;
    if (localSet1 == null)
    {
      localSet2 = d();
      o = localSet2;
    }
    return localSet2;
  }
  
  public abstract Iterator g();
  
  public int hashCode()
  {
    return a().hashCode();
  }
  
  public String toString()
  {
    return a().toString();
  }
  
  public Collection values()
  {
    Collection localCollection1 = p;
    Collection localCollection2 = localCollection1;
    if (localCollection1 == null)
    {
      localCollection2 = e();
      p = localCollection2;
    }
    return localCollection2;
  }
  
  public class a
    extends AbstractCollection
  {
    public a() {}
    
    public void clear()
    {
      f.this.clear();
    }
    
    public boolean contains(Object paramObject)
    {
      return b(paramObject);
    }
    
    public Iterator iterator()
    {
      return g();
    }
    
    public int size()
    {
      return f.this.size();
    }
  }
}

/* Location:
 * Qualified Name:     X2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */