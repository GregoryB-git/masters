package com.facebook.common.memory;

import java.io.IOException;
import java.io.InputStream;

public abstract interface PooledByteBufferFactory
{
  public abstract PooledByteBuffer newByteBuffer(int paramInt);
  
  public abstract PooledByteBuffer newByteBuffer(InputStream paramInputStream)
    throws IOException;
  
  public abstract PooledByteBuffer newByteBuffer(InputStream paramInputStream, int paramInt)
    throws IOException;
  
  public abstract PooledByteBuffer newByteBuffer(byte[] paramArrayOfByte);
  
  public abstract PooledByteBufferOutputStream newOutputStream();
  
  public abstract PooledByteBufferOutputStream newOutputStream(int paramInt);
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.PooledByteBufferFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */