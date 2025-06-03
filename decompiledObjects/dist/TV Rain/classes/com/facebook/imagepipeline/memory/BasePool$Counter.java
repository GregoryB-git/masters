package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import javax.annotation.concurrent.NotThreadSafe;

@VisibleForTesting
@NotThreadSafe
class BasePool$Counter
{
  private static final String TAG = "com.facebook.imagepipeline.memory.BasePool.Counter";
  public int mCount;
  public int mNumBytes;
  
  public void decrement(int paramInt)
  {
    int i = mNumBytes;
    if (i >= paramInt)
    {
      int j = mCount;
      if (j > 0)
      {
        mCount = (j - 1);
        mNumBytes = (i - paramInt);
        return;
      }
    }
    FLog.wtf("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(mNumBytes), Integer.valueOf(mCount) });
  }
  
  public void increment(int paramInt)
  {
    mCount += 1;
    mNumBytes += paramInt;
  }
  
  public void reset()
  {
    mCount = 0;
    mNumBytes = 0;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.BasePool.Counter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */