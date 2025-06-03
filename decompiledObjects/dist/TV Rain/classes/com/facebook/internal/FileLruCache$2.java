package com.facebook.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;

class FileLruCache$2
  implements Runnable
{
  public FileLruCache$2(FileLruCache paramFileLruCache, File[] paramArrayOfFile) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      File[] arrayOfFile = val$filesToDelete;
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++) {
        arrayOfFile[j].delete();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FileLruCache.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */