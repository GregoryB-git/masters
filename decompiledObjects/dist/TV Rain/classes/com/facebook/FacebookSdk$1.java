package com.facebook;

import androidx.annotation.Nullable;
import org.json.JSONObject;

final class FacebookSdk$1
  implements FacebookSdk.GraphRequestCreator
{
  public GraphRequest createPostRequest(@Nullable AccessToken paramAccessToken, String paramString, JSONObject paramJSONObject, @Nullable GraphRequest.Callback paramCallback)
  {
    return GraphRequest.newPostRequest(paramAccessToken, paramString, paramJSONObject, paramCallback);
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */