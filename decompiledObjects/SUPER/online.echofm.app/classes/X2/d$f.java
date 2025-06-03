package X2;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;

public final class d$f
  extends d.i
  implements NavigableSet
{
  public d$f(d paramd, NavigableMap paramNavigableMap)
  {
    super(paramd, paramNavigableMap);
  }
  
  public Object ceiling(Object paramObject)
  {
    return g().ceilingKey(paramObject);
  }
  
  public Iterator descendingIterator()
  {
    return descendingSet().iterator();
  }
  
  public NavigableSet descendingSet()
  {
    return new f(r, g().descendingMap());
  }
  
  public NavigableSet f(Object paramObject)
  {
    return headSet(paramObject, false);
  }
  
  public Object floor(Object paramObject)
  {
    return g().floorKey(paramObject);
  }
  
  public NavigableMap g()
  {
    return (NavigableMap)super.d();
  }
  
  public NavigableSet headSet(Object paramObject, boolean paramBoolean)
  {
    return new f(r, g().headMap(paramObject, paramBoolean));
  }
  
  public Object higher(Object paramObject)
  {
    return g().higherKey(paramObject);
  }
  
  public NavigableSet i(Object paramObject1, Object paramObject2)
  {
    return subSet(paramObject1, true, paramObject2, false);
  }
  
  public NavigableSet k(Object paramObject)
  {
    return tailSet(paramObject, true);
  }
  
  public Object lower(Object paramObject)
  {
    return g().lowerKey(paramObject);
  }
  
  public Object pollFirst()
  {
    return C.p(iterator());
  }
  
  public Object pollLast()
  {
    return C.p(descendingIterator());
  }
  
  public NavigableSet subSet(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    return new f(r, g().subMap(paramObject1, paramBoolean1, paramObject2, paramBoolean2));
  }
  
  public NavigableSet tailSet(Object paramObject, boolean paramBoolean)
  {
    return new f(r, g().tailMap(paramObject, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     X2.d.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */