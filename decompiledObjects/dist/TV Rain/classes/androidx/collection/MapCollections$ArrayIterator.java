package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class MapCollections$ArrayIterator<T>
  implements Iterator<T>
{
  public boolean mCanRemove = false;
  public int mIndex;
  public final int mOffset;
  public int mSize;
  
  public MapCollections$ArrayIterator(MapCollections paramMapCollections, int paramInt)
  {
    mOffset = paramInt;
    mSize = paramMapCollections.colGetSize();
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (mIndex < mSize) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public T next()
  {
    if (hasNext())
    {
      Object localObject = this$0.colGetEntry(mIndex, mOffset);
      mIndex += 1;
      mCanRemove = true;
      return (T)localObject;
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    if (mCanRemove)
    {
      int i = mIndex - 1;
      mIndex = i;
      mSize -= 1;
      mCanRemove = false;
      this$0.colRemoveAt(i);
      return;
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     androidx.collection.MapCollections.ArrayIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */