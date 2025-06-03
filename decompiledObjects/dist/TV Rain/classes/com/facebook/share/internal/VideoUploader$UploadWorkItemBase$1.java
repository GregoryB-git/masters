package com.facebook.share.internal;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class VideoUploader$UploadWorkItemBase$1
  implements Runnable
{
  public VideoUploader$UploadWorkItemBase$1(VideoUploader.UploadWorkItemBase paramUploadWorkItemBase) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      VideoUploader.UploadWorkItemBase localUploadWorkItemBase = this$0;
      localUploadWorkItemBase.enqueueRetry(completedRetries + 1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.VideoUploader.UploadWorkItemBase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */