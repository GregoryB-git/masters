package com.facebook.cache.common;

import com.facebook.common.internal.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class WriterCallbacks$1
  implements WriterCallback
{
  public WriterCallbacks$1(InputStream paramInputStream) {}
  
  public void write(OutputStream paramOutputStream)
    throws IOException
  {
    ByteStreams.copy(val$is, paramOutputStream);
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.WriterCallbacks.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */