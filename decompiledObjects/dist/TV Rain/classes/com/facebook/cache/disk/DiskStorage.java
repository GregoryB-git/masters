package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.WriterCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract interface DiskStorage
{
  public abstract void clearAll()
    throws IOException;
  
  public abstract boolean contains(String paramString, Object paramObject)
    throws IOException;
  
  public abstract DiskDumpInfo getDumpInfo()
    throws IOException;
  
  public abstract Collection<Entry> getEntries()
    throws IOException;
  
  public abstract BinaryResource getResource(String paramString, Object paramObject)
    throws IOException;
  
  public abstract String getStorageName();
  
  public abstract Inserter insert(String paramString, Object paramObject)
    throws IOException;
  
  public abstract boolean isEnabled();
  
  public abstract boolean isExternal();
  
  public abstract void purgeUnexpectedResources();
  
  public abstract long remove(Entry paramEntry)
    throws IOException;
  
  public abstract long remove(String paramString)
    throws IOException;
  
  public abstract boolean touch(String paramString, Object paramObject)
    throws IOException;
  
  public static class DiskDumpInfo
  {
    public List<DiskStorage.DiskDumpInfoEntry> entries = new ArrayList();
    public Map<String, Integer> typeCounts = new HashMap();
  }
  
  public static class DiskDumpInfoEntry
  {
    public final String firstBits;
    public final String path;
    public final float size;
    public final String type;
    
    public DiskDumpInfoEntry(String paramString1, String paramString2, float paramFloat, String paramString3)
    {
      path = paramString1;
      type = paramString2;
      size = paramFloat;
      firstBits = paramString3;
    }
  }
  
  public static abstract interface Entry
  {
    public abstract String getId();
    
    public abstract BinaryResource getResource();
    
    public abstract long getSize();
    
    public abstract long getTimestamp();
  }
  
  public static abstract interface Inserter
  {
    public abstract boolean cleanUp();
    
    public abstract BinaryResource commit(Object paramObject)
      throws IOException;
    
    public abstract void writeData(WriterCallback paramWriterCallback, Object paramObject)
      throws IOException;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DiskStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */