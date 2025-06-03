package com.facebook.common.memory;

public class PooledByteBuffer$ClosedException
  extends RuntimeException
{
  public PooledByteBuffer$ClosedException()
  {
    super("Invalid bytebuf. Already closed");
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.PooledByteBuffer.ClosedException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */