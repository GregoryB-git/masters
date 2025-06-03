package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;

public abstract interface DiskStorage$Entry
{
  public abstract String getId();
  
  public abstract BinaryResource getResource();
  
  public abstract long getSize();
  
  public abstract long getTimestamp();
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DiskStorage.Entry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */