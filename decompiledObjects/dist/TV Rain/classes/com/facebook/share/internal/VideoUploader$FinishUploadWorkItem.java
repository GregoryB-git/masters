package com.facebook.share.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class VideoUploader$FinishUploadWorkItem
  extends VideoUploader.UploadWorkItemBase
{
  public static final Set<Integer> transientErrorCodes = new HashSet() {};
  
  public VideoUploader$FinishUploadWorkItem(VideoUploader.UploadContext paramUploadContext, int paramInt)
  {
    super(paramUploadContext, paramInt);
  }
  
  public void enqueueRetry(int paramInt)
  {
    VideoUploader.access$700(uploadContext, paramInt);
  }
  
  public Bundle getParameters()
  {
    Bundle localBundle1 = new Bundle();
    Bundle localBundle2 = uploadContext.params;
    if (localBundle2 != null) {
      localBundle1.putAll(localBundle2);
    }
    localBundle1.putString("upload_phase", "finish");
    localBundle1.putString("upload_session_id", uploadContext.sessionId);
    Utility.putNonEmptyString(localBundle1, "title", uploadContext.title);
    Utility.putNonEmptyString(localBundle1, "description", uploadContext.description);
    Utility.putNonEmptyString(localBundle1, "ref", uploadContext.ref);
    return localBundle1;
  }
  
  public Set<Integer> getTransientErrorCodes()
  {
    return transientErrorCodes;
  }
  
  public void handleError(FacebookException paramFacebookException)
  {
    VideoUploader.access$400(paramFacebookException, "Video '%s' failed to finish uploading", new Object[] { uploadContext.videoId });
    endUploadWithFailure(paramFacebookException);
  }
  
  public void handleSuccess(JSONObject paramJSONObject)
    throws JSONException
  {
    if (paramJSONObject.getBoolean("success")) {
      issueResponseOnMainThread(null, uploadContext.videoId);
    } else {
      handleError(new FacebookException("Unexpected error in server response"));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.VideoUploader.FinishUploadWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */