package com.facebook.imagepipeline.producers;

import java.util.concurrent.Future;

class HttpUrlConnectionNetworkFetcher$2
  extends BaseProducerContextCallbacks
{
  public HttpUrlConnectionNetworkFetcher$2(HttpUrlConnectionNetworkFetcher paramHttpUrlConnectionNetworkFetcher, Future paramFuture, NetworkFetcher.Callback paramCallback) {}
  
  public void onCancellationRequested()
  {
    if (val$future.cancel(false)) {
      val$callback.onCancellation();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */