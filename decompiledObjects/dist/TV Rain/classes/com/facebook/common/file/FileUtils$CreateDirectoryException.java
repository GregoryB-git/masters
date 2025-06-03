package com.facebook.common.file;

import java.io.IOException;

public class FileUtils$CreateDirectoryException
  extends IOException
{
  public FileUtils$CreateDirectoryException(String paramString)
  {
    super(paramString);
  }
  
  public FileUtils$CreateDirectoryException(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    initCause(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.file.FileUtils.CreateDirectoryException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */