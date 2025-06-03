package X2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

public class d$h
  extends d.b
  implements SortedMap
{
  public SortedSet s;
  
  public d$h(d paramd, SortedMap paramSortedMap)
  {
    super(paramd, paramSortedMap);
  }
  
  public Comparator comparator()
  {
    return h().comparator();
  }
  
  public SortedSet f()
  {
    return new d.i(t, h());
  }
  
  public Object firstKey()
  {
    return h().firstKey();
  }
  
  public SortedSet g()
  {
    SortedSet localSortedSet1 = s;
    SortedSet localSortedSet2 = localSortedSet1;
    if (localSortedSet1 == null)
    {
      localSortedSet2 = f();
      s = localSortedSet2;
    }
    return localSortedSet2;
  }
  
  public SortedMap h()
  {
    return (SortedMap)q;
  }
  
  public SortedMap headMap(Object paramObject)
  {
    return new h(t, h().headMap(paramObject));
  }
  
  public Object lastKey()
  {
    return h().lastKey();
  }
  
  public SortedMap subMap(Object paramObject1, Object paramObject2)
  {
    return new h(t, h().subMap(paramObject1, paramObject2));
  }
  
  public SortedMap tailMap(Object paramObject)
  {
    return new h(t, h().tailMap(paramObject));
  }
}

/* Location:
 * Qualified Name:     X2.d.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */