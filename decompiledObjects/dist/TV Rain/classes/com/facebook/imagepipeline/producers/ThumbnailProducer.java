package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;

public abstract interface ThumbnailProducer<T>
  extends Producer<T>
{
  public abstract boolean canProvideImageForSize(ResizeOptions paramResizeOptions);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThumbnailProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */