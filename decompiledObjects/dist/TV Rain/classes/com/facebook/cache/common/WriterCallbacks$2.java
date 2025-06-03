package com.facebook.cache.common;

import java.io.IOException;
import java.io.OutputStream;

final class WriterCallbacks$2
  implements WriterCallback
{
  public WriterCallbacks$2(byte[] paramArrayOfByte) {}
  
  public void write(OutputStream paramOutputStream)
    throws IOException
  {
    paramOutputStream.write(val$data);
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.WriterCallbacks.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */