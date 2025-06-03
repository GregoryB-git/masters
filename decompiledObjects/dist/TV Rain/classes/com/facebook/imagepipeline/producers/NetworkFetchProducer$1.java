package com.facebook.imagepipeline.producers;

import java.io.IOException;
import java.io.InputStream;

class NetworkFetchProducer$1
  implements NetworkFetcher.Callback
{
  public NetworkFetchProducer$1(NetworkFetchProducer paramNetworkFetchProducer, FetchState paramFetchState) {}
  
  public void onCancellation()
  {
    NetworkFetchProducer.access$100(this$0, val$fetchState);
  }
  
  public void onFailure(Throwable paramThrowable)
  {
    NetworkFetchProducer.access$000(this$0, val$fetchState, paramThrowable);
  }
  
  public void onResponse(InputStream paramInputStream, int paramInt)
    throws IOException
  {
    this$0.onResponse(val$fetchState, paramInputStream, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.NetworkFetchProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */