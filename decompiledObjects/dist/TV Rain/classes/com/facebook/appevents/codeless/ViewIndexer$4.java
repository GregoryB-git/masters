package com.facebook.appevents.codeless;

import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

final class ViewIndexer$4
  implements GraphRequest.Callback
{
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.access$200(), "App index sent to FB!");
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */