package o7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class l$e
  extends AbstractCollection<V>
{
  public l$e(l paraml) {}
  
  public final void clear()
  {
    a.clear();
  }
  
  public final Iterator<V> iterator()
  {
    l locall = a;
    Object localObject = locall.b();
    if (localObject != null) {
      localObject = ((Map)localObject).values().iterator();
    } else {
      localObject = new k(locall);
    }
    return (Iterator<V>)localObject;
  }
  
  public final int size()
  {
    return a.size();
  }
}

/* Location:
 * Qualified Name:     o7.l.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */