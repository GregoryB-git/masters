package ma;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class c<E>
  extends AbstractList<E>
  implements a0.d<E>
{
  public boolean a;
  
  public c(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public final void a()
  {
    if (a) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public boolean add(E paramE)
  {
    a();
    return super.add(paramE);
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    a();
    return super.addAll(paramInt, paramCollection);
  }
  
  public boolean addAll(Collection<? extends E> paramCollection)
  {
    a();
    return super.addAll(paramCollection);
  }
  
  public final void b()
  {
    if (a) {
      a = false;
    }
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
  
  public final boolean g()
  {
    return a;
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
  
  public abstract E remove(int paramInt);
  
  public final boolean remove(Object paramObject)
  {
    a();
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    remove(i);
    return true;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    a();
    return super.removeAll(paramCollection);
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    a();
    return super.retainAll(paramCollection);
  }
}

/* Location:
 * Qualified Name:     ma.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */