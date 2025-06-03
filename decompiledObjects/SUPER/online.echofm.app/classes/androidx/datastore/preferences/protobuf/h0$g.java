package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class h0$g
  extends AbstractSet
{
  public h0$g(h0 paramh0) {}
  
  public boolean a(Map.Entry paramEntry)
  {
    if (!contains(paramEntry))
    {
      o.r((Comparable)paramEntry.getKey(), paramEntry.getValue());
      return true;
    }
    return false;
  }
  
  public void clear()
  {
    o.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    Object localObject = (Map.Entry)paramObject;
    paramObject = o.get(((Map.Entry)localObject).getKey());
    localObject = ((Map.Entry)localObject).getValue();
    boolean bool;
    if ((paramObject != localObject) && ((paramObject == null) || (!paramObject.equals(localObject)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Iterator iterator()
  {
    return new h0.f(o, null);
  }
  
  public boolean remove(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    if (contains(paramObject))
    {
      o.remove(((Map.Entry)paramObject).getKey());
      return true;
    }
    return false;
  }
  
  public int size()
  {
    return o.size();
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.h0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */