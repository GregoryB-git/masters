package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.ProducerListener;
import com.facebook.imagepipeline.request.ImageRequest;

public abstract interface RequestListener
  extends ProducerListener
{
  public abstract void onRequestCancellation(String paramString);
  
  public abstract void onRequestFailure(ImageRequest paramImageRequest, String paramString, Throwable paramThrowable, boolean paramBoolean);
  
  public abstract void onRequestStart(ImageRequest paramImageRequest, Object paramObject, String paramString, boolean paramBoolean);
  
  public abstract void onRequestSuccess(ImageRequest paramImageRequest, String paramString, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.listener.RequestListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */