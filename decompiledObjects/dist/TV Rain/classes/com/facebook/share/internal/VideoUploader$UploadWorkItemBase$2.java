package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class VideoUploader$UploadWorkItemBase$2
  implements Runnable
{
  public VideoUploader$UploadWorkItemBase$2(VideoUploader.UploadWorkItemBase paramUploadWorkItemBase, FacebookException paramFacebookException, String paramString) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      VideoUploader.UploadWorkItemBase localUploadWorkItemBase = this$0;
      VideoUploader.access$900(uploadContext, val$error, response, val$videoId);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.VideoUploader.UploadWorkItemBase.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */