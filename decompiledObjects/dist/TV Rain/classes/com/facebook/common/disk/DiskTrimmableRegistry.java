package com.facebook.common.disk;

public abstract interface DiskTrimmableRegistry
{
  public abstract void registerDiskTrimmable(DiskTrimmable paramDiskTrimmable);
  
  public abstract void unregisterDiskTrimmable(DiskTrimmable paramDiskTrimmable);
}

/* Location:
 * Qualified Name:     com.facebook.common.disk.DiskTrimmableRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */