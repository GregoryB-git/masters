package com.facebook.cache.common;

import java.io.IOException;
import java.io.OutputStream;

public abstract interface WriterCallback
{
  public abstract void write(OutputStream paramOutputStream)
    throws IOException;
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.WriterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */