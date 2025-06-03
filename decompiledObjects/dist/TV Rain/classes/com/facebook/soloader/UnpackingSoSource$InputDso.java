package com.facebook.soloader;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public final class UnpackingSoSource$InputDso
  implements Closeable
{
  public final InputStream content;
  public final UnpackingSoSource.Dso dso;
  
  public UnpackingSoSource$InputDso(UnpackingSoSource.Dso paramDso, InputStream paramInputStream)
  {
    dso = paramDso;
    content = paramInputStream;
  }
  
  public void close()
    throws IOException
  {
    content.close();
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.UnpackingSoSource.InputDso
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */