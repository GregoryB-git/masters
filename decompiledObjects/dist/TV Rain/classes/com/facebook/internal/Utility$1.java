package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;

final class Utility$1
  implements GraphRequest.Callback
{
  public Utility$1(Utility.GraphMeRequestWithCacheCallback paramGraphMeRequestWithCacheCallback, String paramString) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (paramGraphResponse.getError() != null)
    {
      val$callback.onFailure(paramGraphResponse.getError().getException());
    }
    else
    {
      ProfileInformationCache.putProfileInformation(val$accessToken, paramGraphResponse.getJSONObject());
      val$callback.onSuccess(paramGraphResponse.getJSONObject());
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.Utility.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */