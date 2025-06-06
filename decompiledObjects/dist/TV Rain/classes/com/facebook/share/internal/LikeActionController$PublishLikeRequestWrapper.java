package com.facebook.share.internal;

import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.share.widget.LikeView.ObjectType;
import z2;

class LikeActionController$PublishLikeRequestWrapper
  extends LikeActionController.AbstractRequestWrapper
{
  public String unlikeToken;
  
  public LikeActionController$PublishLikeRequestWrapper(LikeActionController paramLikeActionController, String paramString, LikeView.ObjectType paramObjectType)
  {
    super(paramLikeActionController, paramString, paramObjectType);
    paramLikeActionController = z2.d("object", paramString);
    setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", paramLikeActionController, HttpMethod.POST));
  }
  
  public void processError(FacebookRequestError paramFacebookRequestError)
  {
    if (paramFacebookRequestError.getErrorCode() == 3501)
    {
      error = null;
    }
    else
    {
      Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error liking object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
      LikeActionController.access$2400(this$0, "publish_like", paramFacebookRequestError);
    }
  }
  
  public void processSuccess(GraphResponse paramGraphResponse)
  {
    unlikeToken = Utility.safeGetStringFromResponse(paramGraphResponse.getJSONObject(), "id");
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.PublishLikeRequestWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */