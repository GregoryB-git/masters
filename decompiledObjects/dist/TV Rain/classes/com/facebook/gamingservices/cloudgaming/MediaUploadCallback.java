package com.facebook.gamingservices.cloudgaming;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import org.json.JSONObject;

class MediaUploadCallback
  implements GraphRequest.Callback
{
  private String body;
  public GraphRequest.Callback callback;
  @Nullable
  private String payload;
  private int timeInterval;
  private String title;
  
  public MediaUploadCallback(String paramString1, String paramString2, int paramInt, @Nullable String paramString3, GraphRequest.Callback paramCallback)
  {
    title = paramString1;
    body = paramString2;
    timeInterval = paramInt;
    payload = paramString3;
    callback = paramCallback;
  }
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (paramGraphResponse.getError() == null)
    {
      String str1 = paramGraphResponse.getJSONObject().optString("id");
      paramGraphResponse = AccessToken.getCurrentAccessToken();
      Bundle localBundle = new Bundle();
      localBundle.putString("title", title);
      localBundle.putString("body", body);
      localBundle.putInt("time_interval", timeInterval);
      String str2 = payload;
      if (str2 != null) {
        localBundle.putString("payload:", str2);
      }
      localBundle.putString("media_id", str1);
      new GraphRequest(paramGraphResponse, "me/schedule_gaming_app_to_user_update", localBundle, HttpMethod.POST, callback).executeAsync();
      return;
    }
    throw new FacebookException(paramGraphResponse.getError().getErrorMessage());
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.MediaUploadCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */