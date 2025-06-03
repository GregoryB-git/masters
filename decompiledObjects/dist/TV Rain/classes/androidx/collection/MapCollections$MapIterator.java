package androidx.collection;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class MapCollections$MapIterator
  implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
{
  public int mEnd;
  public boolean mEntryValid = false;
  public int mIndex;
  
  public MapCollections$MapIterator(MapCollections paramMapCollections)
  {
    mEnd = (paramMapCollections.colGetSize() - 1);
    mIndex = -1;
  }
  
  public boolean equals(Object paramObject)
  {
    if (mEntryValid)
    {
      boolean bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      bool1 = bool2;
      if (ContainerHelpers.equal(((Map.Entry)paramObject).getKey(), this$0.colGetEntry(mIndex, 0)))
      {
        bool1 = bool2;
        if (ContainerHelpers.equal(((Map.Entry)paramObject).getValue(), this$0.colGetEntry(mIndex, 1))) {
          bool1 = true;
        }
      }
      return bool1;
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public K getKey()
  {
    if (mEntryValid) {
      return (K)this$0.colGetEntry(mIndex, 0);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public V getValue()
  {
    if (mEntryValid) {
      return (V)this$0.colGetEntry(mIndex, 1);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (mIndex < mEnd) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    if (mEntryValid)
    {
      Object localObject1 = this$0;
      int i = mIndex;
      int j = 0;
      Object localObject2 = ((MapCollections)localObject1).colGetEntry(i, 0);
      localObject1 = this$0.colGetEntry(mIndex, 1);
      if (localObject2 == null) {
        i = 0;
      } else {
        i = localObject2.hashCode();
      }
      if (localObject1 != null) {
        j = localObject1.hashCode();
      }
      return i ^ j;
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public Map.Entry<K, V> next()
  {
    if (hasNext())
    {
      mIndex += 1;
      mEntryValid = true;
      return this;
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    if (mEntryValid)
    {
      this$0.colRemoveAt(mIndex);
      mIndex -= 1;
      mEnd -= 1;
      mEntryValid = false;
      return;
    }
    throw new IllegalStateException();
  }
  
  public V setValue(V paramV)
  {
    if (mEntryValid) {
      return (V)this$0.colSetValue(mIndex, paramV);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getKey());
    localStringBuilder.append("=");
    localStringBuilder.append(getValue());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.collection.MapCollections.MapIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */