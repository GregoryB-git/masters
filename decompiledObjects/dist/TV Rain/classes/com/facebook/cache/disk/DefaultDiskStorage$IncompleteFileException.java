package com.facebook.cache.disk;

import java.io.IOException;

class DefaultDiskStorage$IncompleteFileException
  extends IOException
{
  public final long actual;
  public final long expected;
  
  public DefaultDiskStorage$IncompleteFileException(long paramLong1, long paramLong2)
  {
    super(localStringBuilder.toString());
    expected = paramLong1;
    actual = paramLong2;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultDiskStorage.IncompleteFileException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */