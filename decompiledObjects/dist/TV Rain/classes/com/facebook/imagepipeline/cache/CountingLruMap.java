package com.facebook.imagepipeline.cache;

import com.android.internal.util.Predicate;
import com.facebook.common.internal.VisibleForTesting;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class CountingLruMap<K, V>
{
  @GuardedBy("this")
  private final LinkedHashMap<K, V> mMap = new LinkedHashMap();
  @GuardedBy("this")
  private int mSizeInBytes = 0;
  private final ValueDescriptor<V> mValueDescriptor;
  
  public CountingLruMap(ValueDescriptor<V> paramValueDescriptor)
  {
    mValueDescriptor = paramValueDescriptor;
  }
  
  private int getValueSizeInBytes(V paramV)
  {
    int i;
    if (paramV == null) {
      i = 0;
    } else {
      i = mValueDescriptor.getSizeInBytes(paramV);
    }
    return i;
  }
  
  public ArrayList<V> clear()
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(mMap.values());
      mMap.clear();
      mSizeInBytes = 0;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean contains(K paramK)
  {
    try
    {
      boolean bool = mMap.containsKey(paramK);
      return bool;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  @Nullable
  public V get(K paramK)
  {
    try
    {
      paramK = mMap.get(paramK);
      return paramK;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  public int getCount()
  {
    try
    {
      int i = mMap.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Nullable
  public K getFirstKey()
  {
    try
    {
      Object localObject1;
      if (mMap.isEmpty()) {
        localObject1 = null;
      } else {
        localObject1 = mMap.keySet().iterator().next();
      }
      return (K)localObject1;
    }
    finally {}
  }
  
  @VisibleForTesting
  public ArrayList<K> getKeys()
  {
    try
    {
      ArrayList localArrayList = new ArrayList(mMap.keySet());
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public ArrayList<Map.Entry<K, V>> getMatchingEntries(@Nullable Predicate<K> paramPredicate)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(mMap.entrySet().size());
      Iterator localIterator = mMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((paramPredicate == null) || (paramPredicate.apply(localEntry.getKey()))) {
          localArrayList.add(localEntry);
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  public int getSizeInBytes()
  {
    try
    {
      int i = mSizeInBytes;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @VisibleForTesting
  public ArrayList<V> getValues()
  {
    try
    {
      ArrayList localArrayList = new ArrayList(mMap.values());
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Nullable
  public V put(K paramK, V paramV)
  {
    try
    {
      Object localObject = mMap.remove(paramK);
      mSizeInBytes -= getValueSizeInBytes(localObject);
      mMap.put(paramK, paramV);
      mSizeInBytes += getValueSizeInBytes(paramV);
      return (V)localObject;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  @Nullable
  public V remove(K paramK)
  {
    try
    {
      paramK = mMap.remove(paramK);
      mSizeInBytes -= getValueSizeInBytes(paramK);
      return paramK;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  public ArrayList<V> removeAll(@Nullable Predicate<K> paramPredicate)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = mMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((paramPredicate == null) || (paramPredicate.apply(localEntry.getKey())))
        {
          localArrayList.add(localEntry.getValue());
          mSizeInBytes -= getValueSizeInBytes(localEntry.getValue());
          localIterator.remove();
        }
      }
      return localArrayList;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.CountingLruMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */