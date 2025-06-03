package com.facebook.soloader;

import java.io.Closeable;
import java.io.IOException;

public abstract class UnpackingSoSource$InputDsoIterator
  implements Closeable
{
  public void close()
    throws IOException
  {}
  
  public abstract boolean hasNext();
  
  public abstract UnpackingSoSource.InputDso next()
    throws IOException;
}

/* Location:
 * Qualified Name:     com.facebook.soloader.UnpackingSoSource.InputDsoIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */