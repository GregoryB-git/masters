package com.facebook.common.file;

import java.io.IOException;

public class FileUtils$RenameException
  extends IOException
{
  public FileUtils$RenameException(String paramString)
  {
    super(paramString);
  }
  
  public FileUtils$RenameException(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    initCause(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.file.FileUtils.RenameException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */