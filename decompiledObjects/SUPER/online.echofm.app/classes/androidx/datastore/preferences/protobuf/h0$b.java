package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class h0$b
  implements Iterator
{
  public int o;
  public Iterator p;
  
  public h0$b(h0 paramh0)
  {
    o = h0.b(paramh0).size();
  }
  
  public final Iterator b()
  {
    if (p == null) {
      p = h0.e(q).entrySet().iterator();
    }
    return p;
  }
  
  public Map.Entry d()
  {
    if (b().hasNext()) {}
    int i;
    for (Object localObject = b().next();; localObject = ((List)localObject).get(i))
    {
      return (Map.Entry)localObject;
      localObject = h0.b(q);
      i = o - 1;
      o = i;
    }
  }
  
  public boolean hasNext()
  {
    int i = o;
    boolean bool;
    if (((i > 0) && (i <= h0.b(q).size())) || (b().hasNext())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.h0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */