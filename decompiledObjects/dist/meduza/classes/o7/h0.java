package o7;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import n7.q;

public final class h0<K, V>
  extends c<K, V>
{
  public transient q<? extends List<V>> f;
  
  public h0(TreeMap paramTreeMap, g0 paramg0)
  {
    super(paramTreeMap);
    f = paramg0;
  }
  
  public final Map<K, Collection<V>> c()
  {
    Object localObject = d;
    if ((localObject instanceof NavigableMap)) {
      localObject = new d.e(this, (NavigableMap)d);
    } else if ((localObject instanceof SortedMap)) {
      localObject = new d.h(this, (SortedMap)d);
    } else {
      localObject = new d.b(this, d);
    }
    return (Map<K, Collection<V>>)localObject;
  }
  
  public final Set<K> d()
  {
    Object localObject = d;
    if ((localObject instanceof NavigableMap)) {
      localObject = new d.f(this, (NavigableMap)d);
    } else if ((localObject instanceof SortedMap)) {
      localObject = new d.i(this, (SortedMap)d);
    } else {
      localObject = new d.d(this, d);
    }
    return (Set<K>)localObject;
  }
}

/* Location:
 * Qualified Name:     o7.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */