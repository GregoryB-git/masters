package X2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public abstract class d$c
  implements Iterator
{
  public final Iterator o;
  public Object p;
  public Collection q;
  public Iterator r;
  
  public d$c(d paramd)
  {
    o = d.h(paramd).entrySet().iterator();
    p = null;
    q = null;
    r = C.h();
  }
  
  public abstract Object b(Object paramObject1, Object paramObject2);
  
  public boolean hasNext()
  {
    boolean bool;
    if ((!o.hasNext()) && (!r.hasNext())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Object next()
  {
    if (!r.hasNext())
    {
      Object localObject = (Map.Entry)o.next();
      p = ((Map.Entry)localObject).getKey();
      localObject = (Collection)((Map.Entry)localObject).getValue();
      q = ((Collection)localObject);
      r = ((Collection)localObject).iterator();
    }
    return b(N.a(p), r.next());
  }
  
  public void remove()
  {
    r.remove();
    Collection localCollection = q;
    Objects.requireNonNull(localCollection);
    if (((Collection)localCollection).isEmpty()) {
      o.remove();
    }
    d.k(s);
  }
}

/* Location:
 * Qualified Name:     X2.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */