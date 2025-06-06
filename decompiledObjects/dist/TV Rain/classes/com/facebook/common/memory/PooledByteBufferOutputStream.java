package com.facebook.common.memory;

import com.facebook.common.internal.Throwables;
import java.io.IOException;
import java.io.OutputStream;

public abstract class PooledByteBufferOutputStream
  extends OutputStream
{
  public void close()
  {
    try
    {
      super.close();
    }
    catch (IOException localIOException)
    {
      Throwables.propagate(localIOException);
    }
  }
  
  public abstract int size();
  
  public abstract PooledByteBuffer toByteBuffer();
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.PooledByteBufferOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */