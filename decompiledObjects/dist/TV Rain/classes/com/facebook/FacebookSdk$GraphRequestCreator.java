package com.facebook;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;

@VisibleForTesting
public abstract interface FacebookSdk$GraphRequestCreator
{
  public abstract GraphRequest createPostRequest(@Nullable AccessToken paramAccessToken, String paramString, JSONObject paramJSONObject, @Nullable GraphRequest.Callback paramCallback);
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.GraphRequestCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */