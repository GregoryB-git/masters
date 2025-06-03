package androidx.arch.core.internal;

class SafeIterableMap$DescendingIterator<K, V>
  extends SafeIterableMap.ListIterator<K, V>
{
  public SafeIterableMap$DescendingIterator(SafeIterableMap.Entry<K, V> paramEntry1, SafeIterableMap.Entry<K, V> paramEntry2)
  {
    super(paramEntry1, paramEntry2);
  }
  
  public SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> paramEntry)
  {
    return mNext;
  }
  
  public SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> paramEntry)
  {
    return mPrevious;
  }
}

/* Location:
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap.DescendingIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */