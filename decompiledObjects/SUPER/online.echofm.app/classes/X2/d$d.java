package X2;

import W2.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class d$d
  extends G.d
{
  public d$d(d paramd, Map paramMap)
  {
    super(paramMap);
  }
  
  public void clear()
  {
    C.c(iterator());
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return a().keySet().containsAll(paramCollection);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if ((this != paramObject) && (!a().keySet().equals(paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return a().keySet().hashCode();
  }
  
  public Iterator iterator()
  {
    return new a(a().entrySet().iterator());
  }
  
  public boolean remove(Object paramObject)
  {
    paramObject = (Collection)a().remove(paramObject);
    if (paramObject != null)
    {
      int i = ((Collection)paramObject).size();
      ((Collection)paramObject).clear();
      d.m(p, i);
      if (i > 0) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public class a
    implements Iterator
  {
    public Map.Entry o;
    
    public a(Iterator paramIterator) {}
    
    public boolean hasNext()
    {
      return p.hasNext();
    }
    
    public Object next()
    {
      Map.Entry localEntry = (Map.Entry)p.next();
      o = localEntry;
      return localEntry.getKey();
    }
    
    public void remove()
    {
      boolean bool;
      if (o != null) {
        bool = true;
      } else {
        bool = false;
      }
      m.p(bool, "no calls to next() since the last call to remove()");
      Collection localCollection = (Collection)o.getValue();
      p.remove();
      d.m(p, localCollection.size());
      localCollection.clear();
      o = null;
    }
  }
}

/* Location:
 * Qualified Name:     X2.d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */