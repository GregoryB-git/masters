package androidx.collection;

import java.util.Map;

class ArrayMap$1
  extends MapCollections<K, V>
{
  public ArrayMap$1(ArrayMap paramArrayMap) {}
  
  public void colClear()
  {
    this$0.clear();
  }
  
  public Object colGetEntry(int paramInt1, int paramInt2)
  {
    return this$0.mArray[((paramInt1 << 1) + paramInt2)];
  }
  
  public Map<K, V> colGetMap()
  {
    return this$0;
  }
  
  public int colGetSize()
  {
    return this$0.mSize;
  }
  
  public int colIndexOfKey(Object paramObject)
  {
    return this$0.indexOfKey(paramObject);
  }
  
  public int colIndexOfValue(Object paramObject)
  {
    return this$0.indexOfValue(paramObject);
  }
  
  public void colPut(K paramK, V paramV)
  {
    this$0.put(paramK, paramV);
  }
  
  public void colRemoveAt(int paramInt)
  {
    this$0.removeAt(paramInt);
  }
  
  public V colSetValue(int paramInt, V paramV)
  {
    return (V)this$0.setValueAt(paramInt, paramV);
  }
}

/* Location:
 * Qualified Name:     androidx.collection.ArrayMap.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */