package androidx.datastore.preferences.protobuf;

import java.util.Map.Entry;

public class h0$e
  implements Map.Entry, Comparable
{
  public final Comparable o;
  public Object p;
  
  public h0$e(h0 paramh0, Comparable paramComparable, Object paramObject)
  {
    o = paramComparable;
    p = paramObject;
  }
  
  public h0$e(h0 paramh0, Map.Entry paramEntry)
  {
    this(paramh0, (Comparable)paramEntry.getKey(), paramEntry.getValue());
  }
  
  public int c(e parame)
  {
    return h().compareTo(parame.h());
  }
  
  public final boolean e(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null)
    {
      if (paramObject2 == null) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else {
      bool = paramObject1.equals(paramObject2);
    }
    return bool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    if ((!e(o, ((Map.Entry)paramObject).getKey())) || (!e(p, ((Map.Entry)paramObject).getValue()))) {
      bool = false;
    }
    return bool;
  }
  
  public Object getValue()
  {
    return p;
  }
  
  public Comparable h()
  {
    return o;
  }
  
  public int hashCode()
  {
    Object localObject = o;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = p;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public Object setValue(Object paramObject)
  {
    h0.a(q);
    Object localObject = p;
    p = paramObject;
    return localObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append("=");
    localStringBuilder.append(p);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.h0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */