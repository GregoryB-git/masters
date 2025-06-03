package com.facebook.binaryresource;

import java.io.IOException;
import java.io.InputStream;

public abstract interface BinaryResource
{
  public abstract InputStream openStream()
    throws IOException;
  
  public abstract byte[] read()
    throws IOException;
  
  public abstract long size();
}

/* Location:
 * Qualified Name:     com.facebook.binaryresource.BinaryResource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */