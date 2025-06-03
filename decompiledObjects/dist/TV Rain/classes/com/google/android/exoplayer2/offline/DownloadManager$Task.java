package com.google.android.exoplayer2.offline;

import android.os.Handler;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

final class DownloadManager$Task
  implements Runnable
{
  public static final int STATE_QUEUED_CANCELING = 5;
  public static final int STATE_STARTED_CANCELING = 6;
  public static final int STATE_STARTED_STOPPING = 7;
  private final DownloadAction action;
  private volatile int currentState;
  private final DownloadManager downloadManager;
  private volatile Downloader downloader;
  private Throwable error;
  private final int id;
  private final int minRetryCount;
  private Thread thread;
  
  private DownloadManager$Task(int paramInt1, DownloadManager paramDownloadManager, DownloadAction paramDownloadAction, int paramInt2)
  {
    id = paramInt1;
    downloadManager = paramDownloadManager;
    action = paramDownloadAction;
    currentState = 0;
    minRetryCount = paramInt2;
  }
  
  private boolean canStart()
  {
    boolean bool;
    if (currentState == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void cancel()
  {
    if (changeStateAndNotify(0, 5)) {
      DownloadManager.access$900(downloadManager).post(new c(this, 0));
    } else if (changeStateAndNotify(1, 6)) {
      cancelDownload();
    }
  }
  
  private void cancelDownload()
  {
    if (downloader != null) {
      downloader.cancel();
    }
    thread.interrupt();
  }
  
  private boolean changeStateAndNotify(int paramInt1, int paramInt2)
  {
    return changeStateAndNotify(paramInt1, paramInt2, null);
  }
  
  private boolean changeStateAndNotify(int paramInt1, int paramInt2, Throwable paramThrowable)
  {
    int i = currentState;
    int j = 0;
    if (i != paramInt1) {
      return false;
    }
    currentState = paramInt2;
    error = paramThrowable;
    paramInt1 = j;
    if (currentState != getExternalState()) {
      paramInt1 = 1;
    }
    if (paramInt1 == 0) {
      DownloadManager.access$1100(downloadManager, this);
    }
    return true;
  }
  
  private int getExternalState()
  {
    int i = currentState;
    if (i != 5)
    {
      if ((i != 6) && (i != 7)) {
        return currentState;
      }
      return 1;
    }
    return 0;
  }
  
  private int getRetryDelayMillis(int paramInt)
  {
    return Math.min((paramInt - 1) * 1000, 5000);
  }
  
  private String getStateString()
  {
    int i = currentState;
    if ((i != 5) && (i != 6))
    {
      if (i != 7) {
        return DownloadManager.TaskState.getStateString(currentState);
      }
      return "STOPPING";
    }
    return "CANCELING";
  }
  
  private void start()
  {
    if (changeStateAndNotify(0, 1))
    {
      Thread localThread = new Thread(this);
      thread = localThread;
      localThread.start();
    }
  }
  
  private void stop()
  {
    if (changeStateAndNotify(1, 7))
    {
      DownloadManager.access$1000("Stopping", this);
      cancelDownload();
    }
  }
  
  private static String toString(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length > 100) {
      return "<data is too long>";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('\'');
    localStringBuilder.append(Util.fromUtf8Bytes(paramArrayOfByte));
    localStringBuilder.append('\'');
    return localStringBuilder.toString();
  }
  
  public float getDownloadPercentage()
  {
    float f;
    if (downloader != null) {
      f = downloader.getDownloadPercentage();
    } else {
      f = -1.0F;
    }
    return f;
  }
  
  public DownloadManager.TaskState getDownloadState()
  {
    int i = getExternalState();
    return new DownloadManager.TaskState(id, action, i, getDownloadPercentage(), getDownloadedBytes(), error, null);
  }
  
  public long getDownloadedBytes()
  {
    long l;
    if (downloader != null) {
      l = downloader.getDownloadedBytes();
    } else {
      l = 0L;
    }
    return l;
  }
  
  public boolean isActive()
  {
    int i = currentState;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 5)
    {
      bool2 = bool1;
      if (currentState != 1)
      {
        bool2 = bool1;
        if (currentState != 7) {
          if (currentState == 6) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
      }
    }
    return bool2;
  }
  
  public boolean isFinished()
  {
    boolean bool;
    if ((currentState != 4) && (currentState != 2) && (currentState != 3)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void run()
  {
    DownloadManager.access$1000("Task is started", this);
    try
    {
      downloader = action.createDownloader(DownloadManager.access$1200(downloadManager));
      if (action.isRemoveAction)
      {
        downloader.remove();
      }
      else
      {
        long l1 = -1L;
        int i = 0;
        for (;;)
        {
          boolean bool = Thread.interrupted();
          if (!bool) {
            try
            {
              downloader.download();
            }
            catch (IOException localIOException)
            {
              long l2 = downloader.getDownloadedBytes();
              long l3 = l1;
              if (l2 != l1)
              {
                localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                localStringBuilder.append("Reset error count. downloadedBytes = ");
                localStringBuilder.append(l2);
                DownloadManager.access$1000(localStringBuilder.toString(), this);
                i = 0;
                l3 = l2;
              }
              if (currentState == 1)
              {
                i++;
                if (i <= minRetryCount)
                {
                  localStringBuilder = new java/lang/StringBuilder;
                  localStringBuilder.<init>();
                  localStringBuilder.append("Download error. Retry ");
                  localStringBuilder.append(i);
                  DownloadManager.access$1000(localStringBuilder.toString(), this);
                  Thread.sleep(getRetryDelayMillis(i));
                  l1 = l3;
                  continue;
                }
              }
              throw localIOException;
            }
          }
        }
      }
      StringBuilder localStringBuilder = null;
    }
    finally {}
    DownloadManager.access$900(downloadManager).post(new a(1, localObject, this));
  }
  
  public String toString()
  {
    return super.toString();
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface InternalState {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadManager.Task
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */