package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map.Entry;

class SafeIterableMap$IteratorWithAdditions
  implements Iterator<Map.Entry<K, V>>, SafeIterableMap.SupportRemove<K, V>
{
  private boolean mBeforeStart = true;
  private SafeIterableMap.Entry<K, V> mCurrent;
  
  public SafeIterableMap$IteratorWithAdditions(SafeIterableMap paramSafeIterableMap) {}
  
  public boolean hasNext()
  {
    boolean bool1 = mBeforeStart;
    boolean bool2 = true;
    boolean bool3 = true;
    if (bool1)
    {
      if (this$0.mStart == null) {
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
      mCurrent = this$0.mStart;
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

/* Location:
 * Qualified Name:     androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */