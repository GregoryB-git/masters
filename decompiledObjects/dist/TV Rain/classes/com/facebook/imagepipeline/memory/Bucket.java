package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@VisibleForTesting
@NotThreadSafe
class Bucket<V>
{
  private static final String TAG = "BUCKET";
  public final Queue mFreeList;
  private int mInUseLength;
  public final int mItemSize;
  public final int mMaxLength;
  
  public Bucket(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkState(bool2);
    if (paramInt2 >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkState(bool2);
    if (paramInt3 >= 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkState(bool2);
    mItemSize = paramInt1;
    mMaxLength = paramInt2;
    mFreeList = new LinkedList();
    mInUseLength = paramInt3;
  }
  
  public void addToFreeList(V paramV)
  {
    mFreeList.add(paramV);
  }
  
  public void decrementInUseCount()
  {
    boolean bool;
    if (mInUseLength > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
    mInUseLength -= 1;
  }
  
  @Nullable
  public V get()
  {
    Object localObject = pop();
    if (localObject != null) {
      mInUseLength += 1;
    }
    return (V)localObject;
  }
  
  public int getFreeListSize()
  {
    return mFreeList.size();
  }
  
  public int getInUseCount()
  {
    return mInUseLength;
  }
  
  public void incrementInUseCount()
  {
    mInUseLength += 1;
  }
  
  public boolean isMaxLengthExceeded()
  {
    boolean bool;
    if (mInUseLength + getFreeListSize() > mMaxLength) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  public V pop()
  {
    return (V)mFreeList.poll();
  }
  
  public void release(V paramV)
  {
    Preconditions.checkNotNull(paramV);
    int i = mInUseLength;
    if (i > 0)
    {
      mInUseLength = (i - 1);
      addToFreeList(paramV);
    }
    else
    {
      FLog.e("BUCKET", "Tried to release value %s from an empty bucket!", new Object[] { paramV });
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.Bucket
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */