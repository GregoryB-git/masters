package o7;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public abstract class c<K, V>
  extends d<K, V>
{
  public c(TreeMap paramTreeMap)
  {
    super(paramTreeMap);
  }
  
  public final Map<K, Collection<V>> a()
  {
    Map localMap1 = c;
    Map localMap2 = localMap1;
    if (localMap1 == null)
    {
      localMap2 = c();
      c = localMap2;
    }
    return localMap2;
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
}

/* Location:
 * Qualified Name:     o7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */