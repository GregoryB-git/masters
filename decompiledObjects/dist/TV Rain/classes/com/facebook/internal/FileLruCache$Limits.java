package com.facebook.internal;

import java.security.InvalidParameterException;

public final class FileLruCache$Limits
{
  private int byteCount = 1048576;
  private int fileCount = 1024;
  
  public int getByteCount()
  {
    return byteCount;
  }
  
  public int getFileCount()
  {
    return fileCount;
  }
  
  public void setByteCount(int paramInt)
  {
    if (paramInt >= 0)
    {
      byteCount = paramInt;
      return;
    }
    throw new InvalidParameterException("Cache byte-count limit must be >= 0");
  }
  
  public void setFileCount(int paramInt)
  {
    if (paramInt >= 0)
    {
      fileCount = paramInt;
      return;
    }
    throw new InvalidParameterException("Cache file count limit must be >= 0");
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FileLruCache.Limits
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */