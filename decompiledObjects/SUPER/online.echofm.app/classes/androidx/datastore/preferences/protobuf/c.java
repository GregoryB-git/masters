package androidx.datastore.preferences.protobuf;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class c
  extends AbstractList
  implements y.b
{
  public boolean o = true;
  
  public void a()
  {
    if (o) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public boolean add(Object paramObject)
  {
    a();
    return super.add(paramObject);
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    a();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    a();
    return super.addAll(paramCollection);
  }
  
  public void clear()
  {
    a();
    super.clear();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    if (!(paramObject instanceof RandomAccess)) {
      return super.equals(paramObject);
    }
    paramObject = (List)paramObject;
    int i = size();
    if (i != ((List)paramObject).size()) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      if (!get(j).equals(((List)paramObject).get(j))) {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    int i = size();
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + get(k).hashCode();
    }
    return j;
  }
  
  public final void j()
  {
    o = false;
  }
  
  public boolean p()
  {
    return o;
  }
  
  public boolean remove(Object paramObject)
  {
    a();
    return super.remove(paramObject);
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    a();
    return super.removeAll(paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    a();
    return super.retainAll(paramCollection);
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */