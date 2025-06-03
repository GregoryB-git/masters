package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import java.util.Map.Entry;

class SafeIterableMap$Entry<K, V>
  implements Map.Entry<K, V>
{
  @NonNull
  public final K mKey;
  public Entry<K, V> mNext;
  public Entry<K, V> mPrevious;
  @NonNull
  public final V mValue;
  
  public SafeIterableMap$Entry(@NonNull K paramK, @NonNull V paramV)
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

/* Location:
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap.Entry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */