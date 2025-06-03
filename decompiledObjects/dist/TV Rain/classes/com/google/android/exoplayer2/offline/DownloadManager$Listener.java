package com.google.android.exoplayer2.offline;

public abstract interface DownloadManager$Listener
{
  public abstract void onIdle(DownloadManager paramDownloadManager);
  
  public abstract void onInitialized(DownloadManager paramDownloadManager);
  
  public abstract void onTaskStateChanged(DownloadManager paramDownloadManager, DownloadManager.TaskState paramTaskState);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadManager.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */