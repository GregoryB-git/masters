package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.WriterCallback;
import java.io.IOException;

public abstract interface DiskStorage$Inserter
{
  public abstract boolean cleanUp();
  
  public abstract BinaryResource commit(Object paramObject)
    throws IOException;
  
  public abstract void writeData(WriterCallback paramWriterCallback, Object paramObject)
    throws IOException;
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DiskStorage.Inserter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */