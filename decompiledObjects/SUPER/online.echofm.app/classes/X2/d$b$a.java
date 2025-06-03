package X2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class d$b$a
  extends G.c
{
  public d$b$a(d.b paramb) {}
  
  public Map a()
  {
    return o;
  }
  
  public boolean contains(Object paramObject)
  {
    return j.c(o.q.entrySet(), paramObject);
  }
  
  public Iterator iterator()
  {
    return new d.b.b(o);
  }
  
  public boolean remove(Object paramObject)
  {
    if (!contains(paramObject)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    Objects.requireNonNull(paramObject);
    paramObject = (Map.Entry)paramObject;
    d.n(o.r, ((Map.Entry)paramObject).getKey());
    return true;
  }
}

/* Location:
 * Qualified Name:     X2.d.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */