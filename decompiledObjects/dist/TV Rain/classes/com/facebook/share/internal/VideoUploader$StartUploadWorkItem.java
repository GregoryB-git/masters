package com.facebook.share.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.GraphRequest.OnProgressCallback;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

class VideoUploader$StartUploadWorkItem
  extends VideoUploader.UploadWorkItemBase
{
  public static final Set<Integer> transientErrorCodes = new HashSet() {};
  
  public VideoUploader$StartUploadWorkItem(VideoUploader.UploadContext paramUploadContext, int paramInt)
  {
    super(paramUploadContext, paramInt);
  }
  
  public void enqueueRetry(int paramInt)
  {
    VideoUploader.access$500(uploadContext, paramInt);
  }
  
  public Bundle getParameters()
  {
    Bundle localBundle = z2.d("upload_phase", "start");
    localBundle.putLong("file_size", uploadContext.videoSize);
    return localBundle;
  }
  
  public Set<Integer> getTransientErrorCodes()
  {
    return transientErrorCodes;
  }
  
  public void handleError(FacebookException paramFacebookException)
  {
    VideoUploader.access$400(paramFacebookException, "Error starting video upload", new Object[0]);
    endUploadWithFailure(paramFacebookException);
  }
  
  public void handleSuccess(JSONObject paramJSONObject)
    throws JSONException
  {
    uploadContext.sessionId = paramJSONObject.getString("upload_session_id");
    uploadContext.videoId = paramJSONObject.getString("video_id");
    String str1 = paramJSONObject.getString("start_offset");
    String str2 = paramJSONObject.getString("end_offset");
    if (uploadContext.progressCallback != null)
    {
      long l = Long.parseLong(str1);
      paramJSONObject = uploadContext;
      progressCallback.onProgress(l, videoSize);
    }
    VideoUploader.access$300(uploadContext, str1, str2, 0);
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.VideoUploader.StartUploadWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */