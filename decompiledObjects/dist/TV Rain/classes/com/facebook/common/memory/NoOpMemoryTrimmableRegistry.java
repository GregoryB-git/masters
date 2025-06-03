package com.facebook.common.memory;

public class NoOpMemoryTrimmableRegistry
  implements MemoryTrimmableRegistry
{
  private static NoOpMemoryTrimmableRegistry sInstance;
  
  public static NoOpMemoryTrimmableRegistry getInstance()
  {
    try
    {
      if (sInstance == null)
      {
        localNoOpMemoryTrimmableRegistry = new com/facebook/common/memory/NoOpMemoryTrimmableRegistry;
        localNoOpMemoryTrimmableRegistry.<init>();
        sInstance = localNoOpMemoryTrimmableRegistry;
      }
      NoOpMemoryTrimmableRegistry localNoOpMemoryTrimmableRegistry = sInstance;
      return localNoOpMemoryTrimmableRegistry;
    }
    finally {}
  }
  
  public void registerMemoryTrimmable(MemoryTrimmable paramMemoryTrimmable) {}
  
  public void unregisterMemoryTrimmable(MemoryTrimmable paramMemoryTrimmable) {}
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.NoOpMemoryTrimmableRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */