package com.facebook.internal;

import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

class WebDialog$UploadStagingResourcesTask$1
  implements GraphRequest.Callback
{
  public WebDialog$UploadStagingResourcesTask$1(WebDialog.UploadStagingResourcesTask paramUploadStagingResourcesTask, String[] paramArrayOfString, int paramInt, CountDownLatch paramCountDownLatch) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    try
    {
      Object localObject1 = paramGraphResponse.getError();
      Object localObject2 = "Error staging photo.";
      if (localObject1 != null)
      {
        localObject1 = ((FacebookRequestError)localObject1).getErrorMessage();
        if (localObject1 != null) {
          localObject2 = localObject1;
        }
        localObject1 = new com/facebook/FacebookGraphResponseException;
        ((FacebookGraphResponseException)localObject1).<init>(paramGraphResponse, (String)localObject2);
        throw ((Throwable)localObject1);
      }
      paramGraphResponse = paramGraphResponse.getJSONObject();
      if (paramGraphResponse != null)
      {
        paramGraphResponse = paramGraphResponse.optString("uri");
        if (paramGraphResponse != null)
        {
          val$results[val$writeIndex] = paramGraphResponse;
        }
        else
        {
          paramGraphResponse = new com/facebook/FacebookException;
          paramGraphResponse.<init>("Error staging photo.");
          throw paramGraphResponse;
        }
      }
      else
      {
        paramGraphResponse = new com/facebook/FacebookException;
        paramGraphResponse.<init>("Error staging photo.");
        throw paramGraphResponse;
      }
    }
    catch (Exception paramGraphResponse)
    {
      WebDialog.UploadStagingResourcesTask.access$800(this$1)[val$writeIndex] = paramGraphResponse;
      val$latch.countDown();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.WebDialog.UploadStagingResourcesTask.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */