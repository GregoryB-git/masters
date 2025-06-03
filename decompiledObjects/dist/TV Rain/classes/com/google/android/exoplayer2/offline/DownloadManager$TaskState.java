package com.google.android.exoplayer2.offline;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class DownloadManager$TaskState
{
  public static final int STATE_CANCELED = 3;
  public static final int STATE_COMPLETED = 2;
  public static final int STATE_FAILED = 4;
  public static final int STATE_QUEUED = 0;
  public static final int STATE_STARTED = 1;
  public final DownloadAction action;
  public final float downloadPercentage;
  public final long downloadedBytes;
  public final Throwable error;
  public final int state;
  public final int taskId;
  
  private DownloadManager$TaskState(int paramInt1, DownloadAction paramDownloadAction, int paramInt2, float paramFloat, long paramLong, Throwable paramThrowable)
  {
    taskId = paramInt1;
    action = paramDownloadAction;
    state = paramInt2;
    downloadPercentage = paramFloat;
    downloadedBytes = paramLong;
    error = paramThrowable;
  }
  
  public static String getStateString(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 4) {
              return "FAILED";
            }
            throw new IllegalStateException();
          }
          return "CANCELED";
        }
        return "COMPLETED";
      }
      return "STARTED";
    }
    return "QUEUED";
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface State {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadManager.TaskState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */