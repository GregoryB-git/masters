package com.facebook.share.internal;

import android.os.Bundle;
import android.os.Handler;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

abstract class VideoUploader$UploadWorkItemBase
  implements Runnable
{
  public int completedRetries;
  public GraphResponse response;
  public VideoUploader.UploadContext uploadContext;
  
  public VideoUploader$UploadWorkItemBase(VideoUploader.UploadContext paramUploadContext, int paramInt)
  {
    uploadContext = paramUploadContext;
    completedRetries = paramInt;
  }
  
  private boolean attemptRetry(int paramInt)
  {
    if ((completedRetries < 2) && (getTransientErrorCodes().contains(Integer.valueOf(paramInt))))
    {
      paramInt = (int)Math.pow(3.0D, completedRetries);
      VideoUploader.access$800().postDelayed(new Runnable()
      {
        public void run()
        {
          if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
          }
          try
          {
            VideoUploader.UploadWorkItemBase localUploadWorkItemBase = VideoUploader.UploadWorkItemBase.this;
            localUploadWorkItemBase.enqueueRetry(completedRetries + 1);
            return;
          }
          finally
          {
            CrashShieldHandler.handleThrowable(localThrowable, this);
          }
        }
      }, paramInt * 5000);
      return true;
    }
    return false;
  }
  
  public void endUploadWithFailure(FacebookException paramFacebookException)
  {
    issueResponseOnMainThread(paramFacebookException, null);
  }
  
  public abstract void enqueueRetry(int paramInt);
  
  public void executeGraphRequestSynchronously(Bundle paramBundle)
  {
    Object localObject = uploadContext;
    paramBundle = new GraphRequest(accessToken, String.format(Locale.ROOT, "%s/videos", new Object[] { graphNode }), paramBundle, HttpMethod.POST, null).executeAndWait();
    response = paramBundle;
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getError();
      localObject = response.getJSONObject();
      if (paramBundle != null)
      {
        if (!attemptRetry(paramBundle.getSubErrorCode())) {
          handleError(new FacebookGraphResponseException(response, "Video upload failed"));
        }
      }
      else if (localObject != null) {
        try
        {
          handleSuccess((JSONObject)localObject);
        }
        catch (JSONException paramBundle)
        {
          endUploadWithFailure(new FacebookException("Unexpected error in server response", paramBundle));
        }
      } else {
        handleError(new FacebookException("Unexpected error in server response"));
      }
    }
    else
    {
      handleError(new FacebookException("Unexpected error in server response"));
    }
  }
  
  public abstract Bundle getParameters()
    throws Exception;
  
  public abstract Set<Integer> getTransientErrorCodes();
  
  public abstract void handleError(FacebookException paramFacebookException);
  
  public abstract void handleSuccess(JSONObject paramJSONObject)
    throws JSONException;
  
  public void issueResponseOnMainThread(final FacebookException paramFacebookException, final String paramString)
  {
    VideoUploader.access$800().post(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          VideoUploader.UploadWorkItemBase localUploadWorkItemBase = VideoUploader.UploadWorkItemBase.this;
          VideoUploader.access$900(uploadContext, paramFacebookException, response, paramString);
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    });
  }
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      boolean bool = uploadContext.isCanceled;
      if (!bool) {
        try
        {
          executeGraphRequestSynchronously(getParameters());
        }
        catch (Exception localException)
        {
          FacebookException localFacebookException2 = new com/facebook/FacebookException;
          localFacebookException2.<init>("Video upload failed", localException);
          endUploadWithFailure(localFacebookException2);
        }
        catch (FacebookException localFacebookException1)
        {
          endUploadWithFailure(localFacebookException1);
        }
      } else {
        endUploadWithFailure(null);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.VideoUploader.UploadWorkItemBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */