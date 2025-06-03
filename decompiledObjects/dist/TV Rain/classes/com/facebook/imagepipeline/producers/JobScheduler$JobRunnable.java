package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;

public abstract interface JobScheduler$JobRunnable
{
  public abstract void run(EncodedImage paramEncodedImage, int paramInt);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.JobScheduler.JobRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */