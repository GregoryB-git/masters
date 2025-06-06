package com.facebook.imagepipeline.animated.factory;

import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public abstract interface AnimatedFactory
{
  @Nullable
  public abstract DrawableFactory getAnimatedDrawableFactory(Context paramContext);
  
  @Nullable
  public abstract ImageDecoder getGifDecoder(Bitmap.Config paramConfig);
  
  @Nullable
  public abstract ImageDecoder getWebPDecoder(Bitmap.Config paramConfig);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.animated.factory.AnimatedFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */