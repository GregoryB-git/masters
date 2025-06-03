package androidx.room;

import androidx.annotation.Nullable;
import java.util.Arrays;

class InvalidationTracker$ObservedTableTracker
{
  public static final int ADD = 1;
  public static final int NO_OP = 0;
  public static final int REMOVE = 2;
  public boolean mNeedsSync;
  public boolean mPendingSync;
  public final long[] mTableObservers;
  public final int[] mTriggerStateChanges;
  public final boolean[] mTriggerStates;
  
  public InvalidationTracker$ObservedTableTracker(int paramInt)
  {
    long[] arrayOfLong = new long[paramInt];
    mTableObservers = arrayOfLong;
    boolean[] arrayOfBoolean = new boolean[paramInt];
    mTriggerStates = arrayOfBoolean;
    mTriggerStateChanges = new int[paramInt];
    Arrays.fill(arrayOfLong, 0L);
    Arrays.fill(arrayOfBoolean, false);
  }
  
  @Nullable
  public int[] getTablesToSync()
  {
    try
    {
      if ((mNeedsSync) && (!mPendingSync))
      {
        int i = mTableObservers.length;
        for (int j = 0;; j++)
        {
          int k = 1;
          if (j >= i) {
            break;
          }
          int m;
          if (mTableObservers[j] > 0L) {
            m = 1;
          } else {
            m = 0;
          }
          localObject1 = mTriggerStates;
          if (m != localObject1[j])
          {
            int[] arrayOfInt = mTriggerStateChanges;
            if (m == 0) {
              k = 2;
            }
            arrayOfInt[j] = k;
          }
          else
          {
            mTriggerStateChanges[j] = 0;
          }
          localObject1[j] = m;
        }
        mPendingSync = true;
        mNeedsSync = false;
        Object localObject1 = mTriggerStateChanges;
        return (int[])localObject1;
      }
      return null;
    }
    finally {}
  }
  
  public boolean onAdded(int... paramVarArgs)
  {
    try
    {
      int i = paramVarArgs.length;
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = paramVarArgs[j];
        long[] arrayOfLong = mTableObservers;
        long l = arrayOfLong[k];
        arrayOfLong[k] = (1L + l);
        if (l == 0L)
        {
          mNeedsSync = true;
          bool = true;
        }
        j++;
      }
      return bool;
    }
    finally {}
  }
  
  public boolean onRemoved(int... paramVarArgs)
  {
    try
    {
      int i = paramVarArgs.length;
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = paramVarArgs[j];
        long[] arrayOfLong = mTableObservers;
        long l = arrayOfLong[k];
        arrayOfLong[k] = (l - 1L);
        if (l == 1L)
        {
          mNeedsSync = true;
          bool = true;
        }
        j++;
      }
      return bool;
    }
    finally {}
  }
  
  public void onSyncCompleted()
  {
    try
    {
      mPendingSync = false;
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     androidx.room.InvalidationTracker.ObservedTableTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */