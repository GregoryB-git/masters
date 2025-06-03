package o7;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

public abstract class e0$d<K, V>
  extends AbstractMap<K, V>
{
  public transient d.b.a a;
  public transient e0.c b;
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    d.b.a locala1 = a;
    d.b.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new d.b.a((d.b)this);
      a = locala2;
    }
    return locala2;
  }
  
  public final Collection<V> values()
  {
    e0.c localc1 = b;
    e0.c localc2 = localc1;
    if (localc1 == null)
    {
      localc2 = new e0.c(this);
      b = localc2;
    }
    return localc2;
  }
}

/* Location:
 * Qualified Name:     o7.e0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */