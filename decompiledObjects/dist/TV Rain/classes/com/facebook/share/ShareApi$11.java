package com.facebook.share;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.HttpMethod;
import com.facebook.internal.CollectionMapper.OnErrorListener;
import com.facebook.internal.CollectionMapper.OnMapValueCompleteListener;
import com.facebook.internal.CollectionMapper.OnMapperCompleteListener;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;
import z2;

class ShareApi$11
  implements CollectionMapper.OnMapperCompleteListener
{
  public ShareApi$11(ShareApi paramShareApi, JSONObject paramJSONObject, String paramString, GraphRequest.Callback paramCallback, CollectionMapper.OnMapValueCompleteListener paramOnMapValueCompleteListener) {}
  
  public void onComplete()
  {
    Bundle localBundle = z2.d("object", val$stagedObject.toString());
    try
    {
      GraphRequest localGraphRequest = new com/facebook/GraphRequest;
      AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
      localObject2 = this$0;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("objects/");
      localStringBuilder.append(URLEncoder.encode(val$ogType, "UTF-8"));
      localGraphRequest.<init>(localAccessToken, ShareApi.access$100((ShareApi)localObject2, localStringBuilder.toString()), localBundle, HttpMethod.POST, val$requestCallback);
      localGraphRequest.executeAsync();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject2 = localUnsupportedEncodingException.getLocalizedMessage();
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "Error staging Open Graph object.";
      }
      val$onOpenGraphObjectStagedListener.onError(new FacebookException((String)localObject1));
    }
  }
  
  public void onError(FacebookException paramFacebookException)
  {
    val$onOpenGraphObjectStagedListener.onError(paramFacebookException);
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.ShareApi.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */