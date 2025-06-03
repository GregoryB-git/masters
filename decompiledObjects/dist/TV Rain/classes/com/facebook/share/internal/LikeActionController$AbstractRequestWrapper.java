package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.share.widget.LikeView.ObjectType;

abstract class LikeActionController$AbstractRequestWrapper
  implements LikeActionController.RequestWrapper
{
  public FacebookRequestError error;
  public String objectId;
  public LikeView.ObjectType objectType;
  private GraphRequest request;
  
  public LikeActionController$AbstractRequestWrapper(LikeActionController paramLikeActionController, String paramString, LikeView.ObjectType paramObjectType)
  {
    objectId = paramString;
    objectType = paramObjectType;
  }
  
  public void addToBatch(GraphRequestBatch paramGraphRequestBatch)
  {
    paramGraphRequestBatch.add(request);
  }
  
  public FacebookRequestError getError()
  {
    return error;
  }
  
  public void processError(FacebookRequestError paramFacebookRequestError)
  {
    Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error running request for object '%s' with type '%s' : %s", new Object[] { objectId, objectType, paramFacebookRequestError });
  }
  
  public abstract void processSuccess(GraphResponse paramGraphResponse);
  
  public void setRequest(GraphRequest paramGraphRequest)
  {
    request = paramGraphRequest;
    paramGraphRequest.setVersion(FacebookSdk.getGraphApiVersion());
    paramGraphRequest.setCallback(new GraphRequest.Callback()
    {
      public void onCompleted(GraphResponse paramAnonymousGraphResponse)
      {
        error = paramAnonymousGraphResponse.getError();
        LikeActionController.AbstractRequestWrapper localAbstractRequestWrapper = LikeActionController.AbstractRequestWrapper.this;
        FacebookRequestError localFacebookRequestError = error;
        if (localFacebookRequestError != null) {
          localAbstractRequestWrapper.processError(localFacebookRequestError);
        } else {
          localAbstractRequestWrapper.processSuccess(paramAnonymousGraphResponse);
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.AbstractRequestWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */