package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;

class LikeActionController$AbstractRequestWrapper$1
  implements GraphRequest.Callback
{
  public LikeActionController$AbstractRequestWrapper$1(LikeActionController.AbstractRequestWrapper paramAbstractRequestWrapper) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    this$1.error = paramGraphResponse.getError();
    LikeActionController.AbstractRequestWrapper localAbstractRequestWrapper = this$1;
    FacebookRequestError localFacebookRequestError = error;
    if (localFacebookRequestError != null) {
      localAbstractRequestWrapper.processError(localFacebookRequestError);
    } else {
      localAbstractRequestWrapper.processSuccess(paramGraphResponse);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeActionController.AbstractRequestWrapper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */