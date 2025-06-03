package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import javax.annotation.Nullable;

public final class FileLocker
  implements Closeable
{
  @Nullable
  private final FileLock mLock;
  private final FileOutputStream mLockFileOutputStream;
  
  private FileLocker(File paramFile)
    throws IOException
  {
    FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
    mLockFileOutputStream = localFileOutputStream;
    try
    {
      paramFile = localFileOutputStream.getChannel().lock();
      if (paramFile == null) {
        localFileOutputStream.close();
      }
      mLock = paramFile;
      return;
    }
    finally
    {
      mLockFileOutputStream.close();
    }
  }
  
  public static FileLocker lock(File paramFile)
    throws IOException
  {
    return new FileLocker(paramFile);
  }
  
  public void close()
    throws IOException
  {
    try
    {
      FileLock localFileLock = mLock;
      if (localFileLock != null) {
        localFileLock.release();
      }
      return;
    }
    finally
    {
      mLockFileOutputStream.close();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.FileLocker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */