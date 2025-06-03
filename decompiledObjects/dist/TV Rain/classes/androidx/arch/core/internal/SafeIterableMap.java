package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class SafeIterableMap<K, V>
  implements Iterable<Map.Entry<K, V>>
{
  private Entry<K, V> mEnd;
  private WeakHashMap<SupportRemove<K, V>, Boolean> mIterators = new WeakHashMap();
  private int mSize = 0;
  public Entry<K, V> mStart;
  
  public Iterator<Map.Entry<K, V>> descendingIterator()
  {
    DescendingIterator localDescendingIterator = new DescendingIterator(mEnd, mStart);
    mIterators.put(localDescendingIterator, Boolean.FALSE);
    return localDescendingIterator;
  }
  
  public Map.Entry<K, V> eldest()
  {
    return mStart;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof SafeIterableMap)) {
      return false;
    }
    Object localObject = (SafeIterableMap)paramObject;
    if (size() != ((SafeIterableMap)localObject).size()) {
      return false;
    }
    paramObject = iterator();
    Iterator localIterator = ((SafeIterableMap)localObject).iterator();
    while ((((Iterator)paramObject).hasNext()) && (localIterator.hasNext()))
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)paramObject).next();
      localObject = localIterator.next();
      if (((localEntry == null) && (localObject != null)) || ((localEntry != null) && (!localEntry.equals(localObject)))) {
        return false;
      }
    }
    if ((((Iterator)paramObject).hasNext()) || (localIterator.hasNext())) {
      bool = false;
    }
    return bool;
  }
  
  public Entry<K, V> get(K paramK)
  {
    for (Entry localEntry = mStart; (localEntry != null) && (!mKey.equals(paramK)); localEntry = mNext) {}
    return localEntry;
  }
  
  public int hashCode()
  {
    Iterator localIterator = iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      i += ((Map.Entry)localIterator.next()).hashCode();
    }
    return i;
  }
  
  @NonNull
  public Iterator<Map.Entry<K, V>> iterator()
  {
    AscendingIterator localAscendingIterator = new AscendingIterator(mStart, mEnd);
    mIterators.put(localAscendingIterator, Boolean.FALSE);
    return localAscendingIterator;
  }
  
  public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions()
  {
    IteratorWithAdditions localIteratorWithAdditions = new IteratorWithAdditions();
    mIterators.put(localIteratorWithAdditions, Boolean.FALSE);
    return localIteratorWithAdditions;
  }
  
  public Map.Entry<K, V> newest()
  {
    return mEnd;
  }
  
  public Entry<K, V> put(@NonNull K paramK, @NonNull V paramV)
  {
    paramV = new Entry(paramK, paramV);
    mSize += 1;
    paramK = mEnd;
    if (paramK == null)
    {
      mStart = paramV;
      mEnd = paramV;
      return paramV;
    }
    mNext = paramV;
    mPrevious = paramK;
    mEnd = paramV;
    return paramV;
  }
  
  public V putIfAbsent(@NonNull K paramK, @NonNull V paramV)
  {
    Entry localEntry = get(paramK);
    if (localEntry != null) {
      return (V)mValue;
    }
    put(paramK, paramV);
    return null;
  }
  
  public V remove(@NonNull K paramK)
  {
    paramK = get(paramK);
    if (paramK == null) {
      return null;
    }
    mSize -= 1;
    if (!mIterators.isEmpty())
    {
      localObject = mIterators.keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((SupportRemove)((Iterator)localObject).next()).supportRemove(paramK);
      }
    }
    Object localObject = mPrevious;
    if (localObject != null) {
      mNext = mNext;
    } else {
      mStart = mNext;
    }
    Entry localEntry = mNext;
    if (localEntry != null) {
      mPrevious = ((Entry)localObject);
    } else {
      mEnd = ((Entry)localObject);
    }
    mNext = null;
    mPrevious = null;
    return (V)mValue;
  }
  
  public int size()
  {
    return mSize;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("[");
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append(((Map.Entry)localIterator.next()).toString());
      if (localIterator.hasNext()) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static class AscendingIterator<K, V>
    extends SafeIterableMap.ListIterator<K, V>
  {
    public AscendingIterator(SafeIterableMap.Entry<K, V> paramEntry1, SafeIterableMap.Entry<K, V> paramEntry2)
    {
      super(paramEntry2);
    }
    
    public SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> paramEntry)
    {
      return mPrevious;
    }
    
    public SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> paramEntry)
    {
      return mNext;
    }
  }
  
  public static class DescendingIterator<K, V>
    extends SafeIterableMap.ListIterator<K, V>
  {
    public DescendingIterator(SafeIterableMap.Entry<K, V> paramEntry1, SafeIterableMap.Entry<K, V> paramEntry2)
    {
      super(paramEntry2);
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
  
  public static class Entry<K, V>
    implements Map.Entry<K, V>
  {
    @NonNull
    public final K mKey;
    public Entry<K, V> mNext;
    public Entry<K, V> mPrevious;
    @NonNull
    public final V mValue;
    
    public Entry(@NonNull K paramK, @NonNull V paramV)
    {
      mKey = paramK;
      mValue = paramV;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof Entry)) {
        return false;
      }
      paramObject = (Entry)paramObject;
      if ((!mKey.equals(mKey)) || (!mValue.equals(mValue))) {
        bool = false;
      }
      return bool;
    }
    
    @NonNull
    public K getKey()
    {
      return (K)mKey;
    }
    
    @NonNull
    public V getValue()
    {
      return (V)mValue;
    }
    
    public int hashCode()
    {
      return mKey.hashCode() ^ mValue.hashCode();
    }
    
    public V setValue(V paramV)
    {
      throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(mKey);
      localStringBuilder.append("=");
      localStringBuilder.append(mValue);
      return localStringBuilder.toString();
    }
  }
  
  public class IteratorWithAdditions
    implements Iterator<Map.Entry<K, V>>, SafeIterableMap.SupportRemove<K, V>
  {
    private boolean mBeforeStart = true;
    private SafeIterableMap.Entry<K, V> mCurrent;
    
    public IteratorWithAdditions() {}
    
    public boolean hasNext()
    {
      boolean bool1 = mBeforeStart;
      boolean bool2 = true;
      boolean bool3 = true;
      if (bool1)
      {
        if (mStart == null) {
          bool3 = false;
        }
        return bool3;
      }
      SafeIterableMap.Entry localEntry = mCurrent;
      if ((localEntry != null) && (mNext != null)) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    
    public Map.Entry<K, V> next()
    {
      if (mBeforeStart)
      {
        mBeforeStart = false;
        mCurrent = mStart;
      }
      else
      {
        SafeIterableMap.Entry localEntry = mCurrent;
        if (localEntry != null) {
          localEntry = mNext;
        } else {
          localEntry = null;
        }
        mCurrent = localEntry;
      }
      return mCurrent;
    }
    
    public void supportRemove(@NonNull SafeIterableMap.Entry<K, V> paramEntry)
    {
      SafeIterableMap.Entry localEntry = mCurrent;
      if (paramEntry == localEntry)
      {
        paramEntry = mPrevious;
        mCurrent = paramEntry;
        boolean bool;
        if (paramEntry == null) {
          bool = true;
        } else {
          bool = false;
        }
        mBeforeStart = bool;
      }
    }
  }
  
  public static abstract class ListIterator<K, V>
    implements Iterator<Map.Entry<K, V>>, SafeIterableMap.SupportRemove<K, V>
  {
    public SafeIterableMap.Entry<K, V> mExpectedEnd;
    public SafeIterableMap.Entry<K, V> mNext;
    
    public ListIterator(SafeIterableMap.Entry<K, V> paramEntry1, SafeIterableMap.Entry<K, V> paramEntry2)
    {
      mExpectedEnd = paramEntry2;
      mNext = paramEntry1;
    }
    
    private SafeIterableMap.Entry<K, V> nextNode()
    {
      SafeIterableMap.Entry localEntry1 = mNext;
      SafeIterableMap.Entry localEntry2 = mExpectedEnd;
      if ((localEntry1 != localEntry2) && (localEntry2 != null)) {
        return forward(localEntry1);
      }
      return null;
    }
    
    public abstract SafeIterableMap.Entry<K, V> backward(SafeIterableMap.Entry<K, V> paramEntry);
    
    public abstract SafeIterableMap.Entry<K, V> forward(SafeIterableMap.Entry<K, V> paramEntry);
    
    public boolean hasNext()
    {
      boolean bool;
      if (mNext != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Map.Entry<K, V> next()
    {
      SafeIterableMap.Entry localEntry = mNext;
      mNext = nextNode();
      return localEntry;
    }
    
    public void supportRemove(@NonNull SafeIterableMap.Entry<K, V> paramEntry)
    {
      if ((mExpectedEnd == paramEntry) && (paramEntry == mNext))
      {
        mNext = null;
        mExpectedEnd = null;
      }
      SafeIterableMap.Entry localEntry = mExpectedEnd;
      if (localEntry == paramEntry) {
        mExpectedEnd = backward(localEntry);
      }
      if (mNext == paramEntry) {
        mNext = nextNode();
      }
    }
  }
  
  public static abstract interface SupportRemove<K, V>
  {
    public abstract void supportRemove(@NonNull SafeIterableMap.Entry<K, V> paramEntry);
  }
}

/* Location:
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */