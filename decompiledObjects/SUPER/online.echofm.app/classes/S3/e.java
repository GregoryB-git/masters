package S3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class e
  implements Iterable
{
  public final c o;
  
  public e(c paramc)
  {
    o = paramc;
  }
  
  public e(List paramList, Comparator paramComparator)
  {
    o = c.a.b(paramList, Collections.emptyMap(), c.a.e(), paramComparator);
  }
  
  public Iterator P()
  {
    return new a(o.P());
  }
  
  public Object a()
  {
    return o.g();
  }
  
  public Object d()
  {
    return o.i();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    return o.equals(o);
  }
  
  public Object f(Object paramObject)
  {
    return o.k(paramObject);
  }
  
  public e g(Object paramObject)
  {
    return new e(o.s(paramObject, null));
  }
  
  public int hashCode()
  {
    return o.hashCode();
  }
  
  public e i(Object paramObject)
  {
    paramObject = o.D(paramObject);
    if (paramObject == o) {
      paramObject = this;
    } else {
      paramObject = new e((c)paramObject);
    }
    return (e)paramObject;
  }
  
  public Iterator iterator()
  {
    return new a(o.iterator());
  }
  
  public static class a
    implements Iterator
  {
    public final Iterator o;
    
    public a(Iterator paramIterator)
    {
      o = paramIterator;
    }
    
    public boolean hasNext()
    {
      return o.hasNext();
    }
    
    public Object next()
    {
      return ((Map.Entry)o.next()).getKey();
    }
    
    public void remove()
    {
      o.remove();
    }
  }
}

/* Location:
 * Qualified Name:     S3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */