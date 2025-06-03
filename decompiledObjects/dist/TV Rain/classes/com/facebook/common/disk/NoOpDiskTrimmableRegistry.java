package com.facebook.common.disk;

import javax.annotation.Nullable;

public class NoOpDiskTrimmableRegistry
  implements DiskTrimmableRegistry
{
  @Nullable
  private static NoOpDiskTrimmableRegistry sInstance;
  
  public static NoOpDiskTrimmableRegistry getInstance()
  {
    try
    {
      if (sInstance == null)
      {
        localNoOpDiskTrimmableRegistry = new com/facebook/common/disk/NoOpDiskTrimmableRegistry;
        localNoOpDiskTrimmableRegistry.<init>();
        sInstance = localNoOpDiskTrimmableRegistry;
      }
      NoOpDiskTrimmableRegistry localNoOpDiskTrimmableRegistry = sInstance;
      return localNoOpDiskTrimmableRegistry;
    }
    finally {}
  }
  
  public void registerDiskTrimmable(DiskTrimmable paramDiskTrimmable) {}
  
  public void unregisterDiskTrimmable(DiskTrimmable paramDiskTrimmable) {}
}

/* Location:
 * Qualified Name:     com.facebook.common.disk.NoOpDiskTrimmableRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */