package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map.Entry;

abstract class SafeIterableMap$ListIterator<K, V>
  implements Iterator<Map.Entry<K, V>>, SafeIterableMap.SupportRemove<K, V>
{
  public SafeIterableMap.Entry<K, V> mExpectedEnd;
  public SafeIterableMap.Entry<K, V> mNext;
  
  public SafeIterableMap$ListIterator(SafeIterableMap.Entry<K, V> paramEntry1, SafeIterableMap.Entry<K, V> paramEntry2)
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

/* Location:
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap.ListIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */