package com.facebook.share;

import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.internal.CollectionMapper.OnErrorListener;
import com.facebook.internal.CollectionMapper.OnMapValueCompleteListener;
import org.json.JSONObject;

class ShareApi$10
  implements GraphRequest.Callback
{
  public ShareApi$10(ShareApi paramShareApi, CollectionMapper.OnMapValueCompleteListener paramOnMapValueCompleteListener) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    Object localObject1 = paramGraphResponse.getError();
    Object localObject2 = "Error staging Open Graph object.";
    if (localObject1 != null)
    {
      localObject1 = ((FacebookRequestError)localObject1).getErrorMessage();
      if (localObject1 != null) {
        localObject2 = localObject1;
      }
      val$onOpenGraphObjectStagedListener.onError(new FacebookGraphResponseException(paramGraphResponse, (String)localObject2));
      return;
    }
    localObject2 = paramGraphResponse.getJSONObject();
    if (localObject2 == null)
    {
      val$onOpenGraphObjectStagedListener.onError(new FacebookGraphResponseException(paramGraphResponse, "Error staging Open Graph object."));
      return;
    }
    localObject2 = ((JSONObject)localObject2).optString("id");
    if (localObject2 == null)
    {
      val$onOpenGraphObjectStagedListener.onError(new FacebookGraphResponseException(paramGraphResponse, "Error staging Open Graph object."));
      return;
    }
    val$onOpenGraphObjectStagedListener.onComplete(localObject2);
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.ShareApi.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */