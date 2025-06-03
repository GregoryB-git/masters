package o7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class w<K, V>
  extends g<K, V>
  implements Serializable
{
  public final transient u<K, ? extends r<V>> d;
  public final transient int e;
  
  public w(m0 paramm0, int paramInt)
  {
    d = paramm0;
    e = paramInt;
  }
  
  public final boolean b(Object paramObject)
  {
    boolean bool;
    if ((paramObject != null) && (super.b(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Map<K, Collection<V>> c()
  {
    throw new AssertionError("should never be called");
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public final Set<K> d()
  {
    throw new AssertionError("unreachable");
  }
  
  public final Iterator e()
  {
    return new v(this);
  }
  
  public u<K, Collection<V>> f()
  {
    return d;
  }
  
  public final int size()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     o7.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */