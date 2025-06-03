package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.atomic.AtomicLong;
import z2;

class FileLruCache$BufferFile
{
  private static final String FILE_NAME_PREFIX = "buffer";
  private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter()
  {
    public boolean accept(File paramAnonymousFile, String paramAnonymousString)
    {
      return paramAnonymousString.startsWith("buffer") ^ true;
    }
  };
  private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter()
  {
    public boolean accept(File paramAnonymousFile, String paramAnonymousString)
    {
      return paramAnonymousString.startsWith("buffer");
    }
  };
  
  public static void deleteAll(File paramFile)
  {
    paramFile = paramFile.listFiles(excludeNonBufferFiles());
    if (paramFile != null)
    {
      int i = paramFile.length;
      for (int j = 0; j < i; j++) {
        paramFile[j].delete();
      }
    }
  }
  
  public static FilenameFilter excludeBufferFiles()
  {
    return filterExcludeBufferFiles;
  }
  
  public static FilenameFilter excludeNonBufferFiles()
  {
    return filterExcludeNonBufferFiles;
  }
  
  public static File newFile(File paramFile)
  {
    StringBuilder localStringBuilder = z2.t("buffer");
    localStringBuilder.append(Long.valueOf(FileLruCache.access$300().incrementAndGet()).toString());
    return new File(paramFile, localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FileLruCache.BufferFile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */