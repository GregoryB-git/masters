package androidx.room;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class InvalidationTracker$ObserverWrapper
{
  public final InvalidationTracker.Observer mObserver;
  private final Set<String> mSingleTableSet;
  public final int[] mTableIds;
  private final String[] mTableNames;
  
  public InvalidationTracker$ObserverWrapper(InvalidationTracker.Observer paramObserver, int[] paramArrayOfInt, String[] paramArrayOfString)
  {
    mObserver = paramObserver;
    mTableIds = paramArrayOfInt;
    mTableNames = paramArrayOfString;
    if (paramArrayOfInt.length == 1)
    {
      paramObserver = new HashSet();
      paramObserver.add(paramArrayOfString[0]);
      mSingleTableSet = Collections.unmodifiableSet(paramObserver);
    }
    else
    {
      mSingleTableSet = null;
    }
  }
  
  public void notifyByTableInvalidStatus(Set<Integer> paramSet)
  {
    int i = mTableIds.length;
    Object localObject1 = null;
    int j = 0;
    while (j < i)
    {
      Object localObject2 = localObject1;
      if (paramSet.contains(Integer.valueOf(mTableIds[j]))) {
        if (i == 1)
        {
          localObject2 = mSingleTableSet;
        }
        else
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new HashSet(i);
          }
          ((Set)localObject2).add(mTableNames[j]);
        }
      }
      j++;
      localObject1 = localObject2;
    }
    if (localObject1 != null) {
      mObserver.onInvalidated((Set)localObject1);
    }
  }
  
  public void notifyByTableNames(String[] paramArrayOfString)
  {
    int i = mTableNames.length;
    Object localObject1 = null;
    int j;
    if (i == 1)
    {
      j = paramArrayOfString.length;
      for (i = 0;; i++)
      {
        localObject2 = localObject1;
        if (i >= j) {
          break;
        }
        if (paramArrayOfString[i].equalsIgnoreCase(mTableNames[0]))
        {
          localObject2 = mSingleTableSet;
          break;
        }
      }
    }
    HashSet localHashSet = new HashSet();
    int k = paramArrayOfString.length;
    for (i = 0; i < k; i++)
    {
      localObject2 = paramArrayOfString[i];
      for (String str : mTableNames) {
        if (str.equalsIgnoreCase((String)localObject2))
        {
          localHashSet.add(str);
          break;
        }
      }
    }
    Object localObject2 = localObject1;
    if (localHashSet.size() > 0) {
      localObject2 = localHashSet;
    }
    if (localObject2 != null) {
      mObserver.onInvalidated((Set)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.InvalidationTracker.ObserverWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */