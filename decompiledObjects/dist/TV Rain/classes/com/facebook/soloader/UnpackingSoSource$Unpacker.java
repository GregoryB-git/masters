package com.facebook.soloader;

import java.io.Closeable;
import java.io.IOException;

public abstract class UnpackingSoSource$Unpacker
  implements Closeable
{
  public void close()
    throws IOException
  {}
  
  public abstract UnpackingSoSource.DsoManifest getDsoManifest()
    throws IOException;
  
  public abstract UnpackingSoSource.InputDsoIterator openDsoIterator()
    throws IOException;
}

/* Location:
 * Qualified Name:     com.facebook.soloader.UnpackingSoSource.Unpacker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */