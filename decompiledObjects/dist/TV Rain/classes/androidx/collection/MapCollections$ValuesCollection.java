package androidx.collection;

import java.util.Collection;
import java.util.Iterator;

final class MapCollections$ValuesCollection
  implements Collection<V>
{
  public MapCollections$ValuesCollection(MapCollections paramMapCollections) {}
  
  public boolean add(V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean addAll(Collection<? extends V> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public void clear()
  {
    this$0.colClear();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (this$0.colIndexOfValue(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (this$0.colGetSize() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator<V> iterator()
  {
    return new MapCollections.ArrayIterator(this$0, 1);
  }
  
  public boolean remove(Object paramObject)
  {
    int i = this$0.colIndexOfValue(paramObject);
    if (i >= 0)
    {
      this$0.colRemoveAt(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    int i = this$0.colGetSize();
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      int k = i;
      int m = j;
      if (paramCollection.contains(this$0.colGetEntry(j, 1)))
      {
        this$0.colRemoveAt(j);
        m = j - 1;
        k = i - 1;
        bool = true;
      }
      j = m + 1;
      i = k;
    }
    return bool;
  }
  
  public boolean retainAll(Collection<?> paramCollection)
  {
    int i = this$0.colGetSize();
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      int k = i;
      int m = j;
      if (!paramCollection.contains(this$0.colGetEntry(j, 1)))
      {
        this$0.colRemoveAt(j);
        m = j - 1;
        k = i - 1;
        bool = true;
      }
      j = m + 1;
      i = k;
    }
    return bool;
  }
  
  public int size()
  {
    return this$0.colGetSize();
  }
  
  public Object[] toArray()
  {
    return this$0.toArrayHelper(1);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    return this$0.toArrayHelper(paramArrayOfT, 1);
  }
}

/* Location:
 * Qualified Name:     androidx.collection.MapCollections.ValuesCollection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */