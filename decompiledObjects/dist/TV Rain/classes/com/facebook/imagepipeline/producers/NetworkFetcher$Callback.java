package com.facebook.imagepipeline.producers;

import java.io.IOException;
import java.io.InputStream;

public abstract interface NetworkFetcher$Callback
{
  public abstract void onCancellation();
  
  public abstract void onFailure(Throwable paramThrowable);
  
  public abstract void onResponse(InputStream paramInputStream, int paramInt)
    throws IOException;
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.NetworkFetcher.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */