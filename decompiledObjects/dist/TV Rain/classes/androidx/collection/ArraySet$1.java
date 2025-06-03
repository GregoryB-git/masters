package androidx.collection;

import java.util.Map;

class ArraySet$1
  extends MapCollections<E, E>
{
  public ArraySet$1(ArraySet paramArraySet) {}
  
  public void colClear()
  {
    this$0.clear();
  }
  
  public Object colGetEntry(int paramInt1, int paramInt2)
  {
    return this$0.mArray[paramInt1];
  }
  
  public Map<E, E> colGetMap()
  {
    throw new UnsupportedOperationException("not a map");
  }
  
  public int colGetSize()
  {
    return this$0.mSize;
  }
  
  public int colIndexOfKey(Object paramObject)
  {
    return this$0.indexOf(paramObject);
  }
  
  public int colIndexOfValue(Object paramObject)
  {
    return this$0.indexOf(paramObject);
  }
  
  public void colPut(E paramE1, E paramE2)
  {
    this$0.add(paramE1);
  }
  
  public void colRemoveAt(int paramInt)
  {
    this$0.removeAt(paramInt);
  }
  
  public E colSetValue(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("not a map");
  }
}

/* Location:
 * Qualified Name:     androidx.collection.ArraySet.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */