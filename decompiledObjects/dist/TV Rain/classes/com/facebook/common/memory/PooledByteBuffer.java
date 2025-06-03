package com.facebook.common.memory;

import java.io.Closeable;

public abstract interface PooledByteBuffer
  extends Closeable
{
  public abstract void close();
  
  public abstract long getNativePtr();
  
  public abstract boolean isClosed();
  
  public abstract byte read(int paramInt);
  
  public abstract void read(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  
  public abstract int size();
  
  public static class ClosedException
    extends RuntimeException
  {
    public ClosedException()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.PooledByteBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */