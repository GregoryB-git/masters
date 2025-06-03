package com.facebook.cache.disk;

import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.io.File;

@VisibleForTesting
class DefaultDiskStorage$EntryImpl
  implements DiskStorage.Entry
{
  private final String id;
  private final FileBinaryResource resource;
  private long size;
  private long timestamp;
  
  private DefaultDiskStorage$EntryImpl(String paramString, File paramFile)
  {
    Preconditions.checkNotNull(paramFile);
    id = ((String)Preconditions.checkNotNull(paramString));
    resource = FileBinaryResource.createOrNull(paramFile);
    size = -1L;
    timestamp = -1L;
  }
  
  public String getId()
  {
    return id;
  }
  
  public FileBinaryResource getResource()
  {
    return resource;
  }
  
  public long getSize()
  {
    if (size < 0L) {
      size = resource.size();
    }
    return size;
  }
  
  public long getTimestamp()
  {
    if (timestamp < 0L) {
      timestamp = resource.getFile().lastModified();
    }
    return timestamp;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultDiskStorage.EntryImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */