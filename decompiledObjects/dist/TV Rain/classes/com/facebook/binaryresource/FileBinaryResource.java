package com.facebook.binaryresource;

import com.facebook.common.internal.Files;
import com.facebook.common.internal.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileBinaryResource
  implements BinaryResource
{
  private final File mFile;
  
  private FileBinaryResource(File paramFile)
  {
    mFile = ((File)Preconditions.checkNotNull(paramFile));
  }
  
  public static FileBinaryResource createOrNull(File paramFile)
  {
    if (paramFile != null) {
      paramFile = new FileBinaryResource(paramFile);
    } else {
      paramFile = null;
    }
    return paramFile;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof FileBinaryResource)))
    {
      paramObject = (FileBinaryResource)paramObject;
      return mFile.equals(mFile);
    }
    return false;
  }
  
  public File getFile()
  {
    return mFile;
  }
  
  public int hashCode()
  {
    return mFile.hashCode();
  }
  
  public InputStream openStream()
    throws IOException
  {
    return new FileInputStream(mFile);
  }
  
  public byte[] read()
    throws IOException
  {
    return Files.toByteArray(mFile);
  }
  
  public long size()
  {
    return mFile.length();
  }
}

/* Location:
 * Qualified Name:     com.facebook.binaryresource.FileBinaryResource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */