package com.facebook.imagepipeline.memory;

public class NoOpPoolStatsTracker
  implements PoolStatsTracker
{
  private static NoOpPoolStatsTracker sInstance;
  
  public static NoOpPoolStatsTracker getInstance()
  {
    try
    {
      if (sInstance == null)
      {
        localNoOpPoolStatsTracker = new com/facebook/imagepipeline/memory/NoOpPoolStatsTracker;
        localNoOpPoolStatsTracker.<init>();
        sInstance = localNoOpPoolStatsTracker;
      }
      NoOpPoolStatsTracker localNoOpPoolStatsTracker = sInstance;
      return localNoOpPoolStatsTracker;
    }
    finally {}
  }
  
  public void onAlloc(int paramInt) {}
  
  public void onFree(int paramInt) {}
  
  public void onHardCapReached() {}
  
  public void onSoftCapReached() {}
  
  public void onValueRelease(int paramInt) {}
  
  public void onValueReuse(int paramInt) {}
  
  public void setBasePool(BasePool paramBasePool) {}
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.NoOpPoolStatsTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */