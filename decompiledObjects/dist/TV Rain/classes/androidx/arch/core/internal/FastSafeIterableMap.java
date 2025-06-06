package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map.Entry;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FastSafeIterableMap<K, V>
  extends SafeIterableMap<K, V>
{
  private HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap();
  
  public Map.Entry<K, V> ceil(K paramK)
  {
    if (contains(paramK)) {
      return mHashMap.get(paramK)).mPrevious;
    }
    return null;
  }
  
  public boolean contains(K paramK)
  {
    return mHashMap.containsKey(paramK);
  }
  
  public SafeIterableMap.Entry<K, V> get(K paramK)
  {
    return (SafeIterableMap.Entry)mHashMap.get(paramK);
  }
  
  public V putIfAbsent(@NonNull K paramK, @NonNull V paramV)
  {
    SafeIterableMap.Entry localEntry = get(paramK);
    if (localEntry != null) {
      return (V)mValue;
    }
    mHashMap.put(paramK, put(paramK, paramV));
    return null;
  }
  
  public V remove(@NonNull K paramK)
  {
    Object localObject = super.remove(paramK);
    mHashMap.remove(paramK);
    return (V)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.arch.core.internal.FastSafeIterableMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */