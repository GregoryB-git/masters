package v1;

import android.util.Log;
import ec.i;
import g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a
{
  public static final HashMap e = new HashMap();
  public final boolean a;
  public final File b;
  public final Lock c;
  public FileChannel d;
  
  public a(String paramString, File paramFile, boolean paramBoolean)
  {
    a = paramBoolean;
    paramString = new File(paramFile, g.d(paramString, ".lck"));
    b = paramString;
    String str = paramString.getAbsolutePath();
    i.d(str, "lockFile.absolutePath");
    synchronized (e)
    {
      paramFile = ???.get(str);
      paramString = paramFile;
      if (paramFile == null)
      {
        paramString = new java/util/concurrent/locks/ReentrantLock;
        paramString.<init>();
        ???.put(str, paramString);
      }
      paramString = (Lock)paramString;
      c = paramString;
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    c.lock();
    if (paramBoolean) {
      try
      {
        Object localObject = b.getParentFile();
        if (localObject != null) {
          ((File)localObject).mkdirs();
        }
        localObject = new java/io/FileOutputStream;
        ((FileOutputStream)localObject).<init>(b);
        localObject = ((FileOutputStream)localObject).getChannel();
        ((FileChannel)localObject).lock();
        d = ((FileChannel)localObject);
      }
      catch (IOException localIOException)
      {
        d = null;
        Log.w("SupportSQLiteLock", "Unable to grab file lock.", localIOException);
      }
    }
  }
  
  public final void b()
  {
    try
    {
      FileChannel localFileChannel = d;
      if (localFileChannel != null) {
        localFileChannel.close();
      }
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    c.unlock();
  }
}

/* Location:
 * Qualified Name:     v1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */