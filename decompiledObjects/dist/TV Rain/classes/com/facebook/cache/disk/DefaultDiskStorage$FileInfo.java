package com.facebook.cache.disk;

import java.io.File;
import java.io.IOException;
import javax.annotation.Nullable;
import z2;

class DefaultDiskStorage$FileInfo
{
  public final String resourceId;
  @DefaultDiskStorage.FileType
  public final String type;
  
  private DefaultDiskStorage$FileInfo(@DefaultDiskStorage.FileType String paramString1, String paramString2)
  {
    type = paramString1;
    resourceId = paramString2;
  }
  
  @Nullable
  public static FileInfo fromFile(File paramFile)
  {
    paramFile = paramFile.getName();
    int i = paramFile.lastIndexOf('.');
    if (i <= 0) {
      return null;
    }
    String str1 = DefaultDiskStorage.access$800(paramFile.substring(i));
    if (str1 == null) {
      return null;
    }
    String str2 = paramFile.substring(0, i);
    paramFile = str2;
    if (str1.equals(".tmp"))
    {
      i = str2.lastIndexOf('.');
      if (i <= 0) {
        return null;
      }
      paramFile = str2.substring(0, i);
    }
    return new FileInfo(str1, paramFile);
  }
  
  public File createTempFile(File paramFile)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(resourceId);
    localStringBuilder.append(".");
    return File.createTempFile(localStringBuilder.toString(), ".tmp", paramFile);
  }
  
  public String toPath(String paramString)
  {
    paramString = z2.t(paramString);
    paramString.append(File.separator);
    paramString.append(resourceId);
    paramString.append(type);
    return paramString.toString();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(type);
    localStringBuilder.append("(");
    return z2.s(localStringBuilder, resourceId, ")");
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultDiskStorage.FileInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */