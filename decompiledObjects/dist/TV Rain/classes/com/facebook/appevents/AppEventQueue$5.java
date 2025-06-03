package com.facebook.appevents;

import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;

final class AppEventQueue$5
  implements GraphRequest.Callback
{
  public AppEventQueue$5(AccessTokenAppIdPair paramAccessTokenAppIdPair, GraphRequest paramGraphRequest, SessionEventsState paramSessionEventsState, FlushStatistics paramFlushStatistics) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    AppEventQueue.handleResponse(val$accessTokenAppId, val$postRequest, paramGraphResponse, val$appEvents, val$flushState);
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventQueue.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */