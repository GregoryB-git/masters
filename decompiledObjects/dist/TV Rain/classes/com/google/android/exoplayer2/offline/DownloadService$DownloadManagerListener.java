package com.google.android.exoplayer2.offline;

final class DownloadService$DownloadManagerListener
  implements DownloadManager.Listener
{
  private DownloadService$DownloadManagerListener(DownloadService paramDownloadService) {}
  
  public final void onIdle(DownloadManager paramDownloadManager)
  {
    DownloadService.access$400(this$0);
  }
  
  public void onInitialized(DownloadManager paramDownloadManager)
  {
    paramDownloadManager = this$0;
    DownloadService.access$200(paramDownloadManager, paramDownloadManager.getRequirements());
  }
  
  public void onTaskStateChanged(DownloadManager paramDownloadManager, DownloadManager.TaskState paramTaskState)
  {
    this$0.onTaskStateChanged(paramTaskState);
    if (DownloadService.access$300(this$0) != null) {
      if (state == 1) {
        DownloadService.access$300(this$0).startPeriodicUpdates();
      } else {
        DownloadService.access$300(this$0).update();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadService.DownloadManagerListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */