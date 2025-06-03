package X2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

public class d$i
  extends d.d
  implements SortedSet
{
  public d$i(d paramd, SortedMap paramSortedMap)
  {
    super(paramd, paramSortedMap);
  }
  
  public Comparator comparator()
  {
    return d().comparator();
  }
  
  public SortedMap d()
  {
    return (SortedMap)super.a();
  }
  
  public Object first()
  {
    return d().firstKey();
  }
  
  public SortedSet headSet(Object paramObject)
  {
    return new i(q, d().headMap(paramObject));
  }
  
  public Object last()
  {
    return d().lastKey();
  }
  
  public SortedSet subSet(Object paramObject1, Object paramObject2)
  {
    return new i(q, d().subMap(paramObject1, paramObject2));
  }
  
  public SortedSet tailSet(Object paramObject)
  {
    return new i(q, d().tailMap(paramObject));
  }
}

/* Location:
 * Qualified Name:     X2.d.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */