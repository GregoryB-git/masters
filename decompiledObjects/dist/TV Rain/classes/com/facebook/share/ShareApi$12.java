package com.facebook.share;

import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.internal.CollectionMapper.OnErrorListener;
import com.facebook.internal.CollectionMapper.OnMapValueCompleteListener;
import com.facebook.share.model.SharePhoto;
import org.json.JSONException;
import org.json.JSONObject;

class ShareApi$12
  implements GraphRequest.Callback
{
  public ShareApi$12(ShareApi paramShareApi, CollectionMapper.OnMapValueCompleteListener paramOnMapValueCompleteListener, SharePhoto paramSharePhoto) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    Object localObject1 = paramGraphResponse.getError();
    Object localObject2 = "Error staging photo.";
    if (localObject1 != null)
    {
      localObject1 = ((FacebookRequestError)localObject1).getErrorMessage();
      if (localObject1 != null) {
        localObject2 = localObject1;
      }
      val$onPhotoStagedListener.onError(new FacebookGraphResponseException(paramGraphResponse, (String)localObject2));
      return;
    }
    paramGraphResponse = paramGraphResponse.getJSONObject();
    if (paramGraphResponse == null)
    {
      val$onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
      return;
    }
    localObject1 = paramGraphResponse.optString("uri");
    if (localObject1 == null)
    {
      val$onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
      return;
    }
    paramGraphResponse = new JSONObject();
    try
    {
      paramGraphResponse.put("url", localObject1);
      paramGraphResponse.put("user_generated", val$photo.getUserGenerated());
      val$onPhotoStagedListener.onComplete(paramGraphResponse);
      return;
    }
    catch (JSONException paramGraphResponse)
    {
      paramGraphResponse = paramGraphResponse.getLocalizedMessage();
      if (paramGraphResponse != null) {
        localObject2 = paramGraphResponse;
      }
      val$onPhotoStagedListener.onError(new FacebookException((String)localObject2));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.ShareApi.12
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */