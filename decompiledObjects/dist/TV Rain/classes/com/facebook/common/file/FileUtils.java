package com.facebook.common.file;

import com.facebook.common.internal.Preconditions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import z2;

public class FileUtils
{
  public static void mkdirs(File paramFile)
    throws FileUtils.CreateDirectoryException
  {
    if (paramFile.exists())
    {
      if (paramFile.isDirectory()) {
        return;
      }
      if (!paramFile.delete()) {
        throw new CreateDirectoryException(paramFile.getAbsolutePath(), new FileDeleteException(paramFile.getAbsolutePath()));
      }
    }
    if ((!paramFile.mkdirs()) && (!paramFile.isDirectory())) {
      throw new CreateDirectoryException(paramFile.getAbsolutePath());
    }
  }
  
  public static void rename(File paramFile1, File paramFile2)
    throws FileUtils.RenameException
  {
    Preconditions.checkNotNull(paramFile1);
    Preconditions.checkNotNull(paramFile2);
    paramFile2.delete();
    if (paramFile1.renameTo(paramFile2)) {
      return;
    }
    Object localObject = null;
    if (!paramFile2.exists())
    {
      if (paramFile1.getParentFile().exists())
      {
        if (!paramFile1.exists()) {
          localObject = new FileNotFoundException(paramFile1.getAbsolutePath());
        }
      }
      else {
        localObject = new ParentDirNotFoundException(paramFile1.getAbsolutePath());
      }
    }
    else {
      localObject = new FileDeleteException(paramFile2.getAbsolutePath());
    }
    StringBuilder localStringBuilder = z2.t("Unknown error renaming ");
    localStringBuilder.append(paramFile1.getAbsolutePath());
    localStringBuilder.append(" to ");
    localStringBuilder.append(paramFile2.getAbsolutePath());
    throw new RenameException(localStringBuilder.toString(), (Throwable)localObject);
  }
  
  public static class CreateDirectoryException
    extends IOException
  {
    public CreateDirectoryException(String paramString)
    {
      super();
    }
    
    public CreateDirectoryException(String paramString, Throwable paramThrowable)
    {
      super();
      initCause(paramThrowable);
    }
  }
  
  public static class FileDeleteException
    extends IOException
  {
    public FileDeleteException(String paramString)
    {
      super();
    }
  }
  
  public static class ParentDirNotFoundException
    extends FileNotFoundException
  {
    public ParentDirNotFoundException(String paramString)
    {
      super();
    }
  }
  
  public static class RenameException
    extends IOException
  {
    public RenameException(String paramString)
    {
      super();
    }
    
    public RenameException(String paramString, Throwable paramThrowable)
    {
      super();
      initCause(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.file.FileUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */