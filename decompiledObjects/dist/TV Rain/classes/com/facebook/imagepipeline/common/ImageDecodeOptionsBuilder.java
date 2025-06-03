package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import javax.annotation.Nullable;

public class ImageDecodeOptionsBuilder
{
  private Bitmap.Config mBitmapConfig = Bitmap.Config.ARGB_8888;
  @Nullable
  private ImageDecoder mCustomImageDecoder;
  private boolean mDecodeAllFrames;
  private boolean mDecodePreviewFrame;
  private boolean mForceStaticImage;
  private int mMinDecodeIntervalMs = 100;
  private boolean mUseLastFrameForPreview;
  
  public ImageDecodeOptions build()
  {
    return new ImageDecodeOptions(this);
  }
  
  public Bitmap.Config getBitmapConfig()
  {
    return mBitmapConfig;
  }
  
  @Nullable
  public ImageDecoder getCustomImageDecoder()
  {
    return mCustomImageDecoder;
  }
  
  public boolean getDecodeAllFrames()
  {
    return mDecodeAllFrames;
  }
  
  public boolean getDecodePreviewFrame()
  {
    return mDecodePreviewFrame;
  }
  
  public boolean getForceStaticImage()
  {
    return mForceStaticImage;
  }
  
  public int getMinDecodeIntervalMs()
  {
    return mMinDecodeIntervalMs;
  }
  
  public boolean getUseLastFrameForPreview()
  {
    return mUseLastFrameForPreview;
  }
  
  public ImageDecodeOptionsBuilder setBitmapConfig(Bitmap.Config paramConfig)
  {
    mBitmapConfig = paramConfig;
    return this;
  }
  
  public ImageDecodeOptionsBuilder setCustomImageDecoder(@Nullable ImageDecoder paramImageDecoder)
  {
    mCustomImageDecoder = paramImageDecoder;
    return this;
  }
  
  public ImageDecodeOptionsBuilder setDecodeAllFrames(boolean paramBoolean)
  {
    mDecodeAllFrames = paramBoolean;
    return this;
  }
  
  public ImageDecodeOptionsBuilder setDecodePreviewFrame(boolean paramBoolean)
  {
    mDecodePreviewFrame = paramBoolean;
    return this;
  }
  
  public ImageDecodeOptionsBuilder setForceStaticImage(boolean paramBoolean)
  {
    mForceStaticImage = paramBoolean;
    return this;
  }
  
  public ImageDecodeOptionsBuilder setFrom(ImageDecodeOptions paramImageDecodeOptions)
  {
    mDecodePreviewFrame = decodePreviewFrame;
    mUseLastFrameForPreview = useLastFrameForPreview;
    mDecodeAllFrames = decodeAllFrames;
    mForceStaticImage = forceStaticImage;
    mBitmapConfig = bitmapConfig;
    mCustomImageDecoder = customImageDecoder;
    return this;
  }
  
  public ImageDecodeOptionsBuilder setMinDecodeIntervalMs(int paramInt)
  {
    mMinDecodeIntervalMs = paramInt;
    return this;
  }
  
  public ImageDecodeOptionsBuilder setUseLastFrameForPreview(boolean paramBoolean)
  {
    mUseLastFrameForPreview = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */