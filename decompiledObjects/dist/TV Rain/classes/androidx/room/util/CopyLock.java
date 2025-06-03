package androidx.room.util;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class CopyLock
{
  private static final Map<String, Lock> sThreadLocks = new HashMap();
  private final File mCopyLockFile;
  private final boolean mFileLevelLock;
  private FileChannel mLockChannel;
  private final Lock mThreadLock;
  
  public CopyLock(@NonNull String paramString, @NonNull File paramFile, boolean paramBoolean)
  {
    paramString = new File(paramFile, z2.o(paramString, ".lck"));
    mCopyLockFile = paramString;
    mThreadLock = getThreadLock(paramString.getAbsolutePath());
    mFileLevelLock = paramBoolean;
  }
  
  private static Lock getThreadLock(String paramString)
  {
    synchronized (sThreadLocks)
    {
      Lock localLock = (Lock)???.get(paramString);
      Object localObject = localLock;
      if (localLock == null)
      {
        localObject = new java/util/concurrent/locks/ReentrantLock;
        ((ReentrantLock)localObject).<init>();
        ???.put(paramString, localObject);
      }
      return (Lock)localObject;
    }
  }
  
  public void lock()
  {
    mThreadLock.lock();
    if (mFileLevelLock) {
      try
      {
        Object localObject = new java/io/FileOutputStream;
        ((FileOutputStream)localObject).<init>(mCopyLockFile);
        localObject = ((FileOutputStream)localObject).getChannel();
        mLockChannel = ((FileChannel)localObject);
        ((FileChannel)localObject).lock();
      }
      catch (IOException localIOException)
      {
        throw new IllegalStateException("Unable to grab copy lock.", localIOException);
      }
    }
  }
  
  public void unlock()
  {
    FileChannel localFileChannel = mLockChannel;
    if (localFileChannel != null) {}
    try
    {
      localFileChannel.close();
      mThreadLock.unlock();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.CopyLock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */