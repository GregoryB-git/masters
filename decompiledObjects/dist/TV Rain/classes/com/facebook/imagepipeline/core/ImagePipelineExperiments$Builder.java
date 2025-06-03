package com.facebook.imagepipeline.core;

import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpBitmapFactory.WebpErrorLogger;

public class ImagePipelineExperiments$Builder
{
  public boolean mBitmapPrepareToDrawForPrefetch = false;
  private int mBitmapPrepareToDrawMaxSizeBytes = 0;
  private int mBitmapPrepareToDrawMinSizeBytes = 0;
  private final ImagePipelineConfig.Builder mConfigBuilder;
  private boolean mDecodeCancellationEnabled = false;
  private boolean mExternalCreatedBitmapLogEnabled = false;
  private Supplier<Boolean> mMediaVariationsIndexEnabled = null;
  private boolean mPartialImageCachingEnabled = false;
  private ImagePipelineExperiments.ProducerFactoryMethod mProducerFactoryMethod;
  private Supplier<Boolean> mSmartResizingEnabled = Suppliers.BOOLEAN_FALSE;
  private boolean mSuppressBitmapPrefetching = false;
  private boolean mUseBitmapPrepareToDraw = false;
  private boolean mUseDownsamplingRatioForResizing = false;
  private WebpBitmapFactory mWebpBitmapFactory;
  private WebpBitmapFactory.WebpErrorLogger mWebpErrorLogger;
  private boolean mWebpSupportEnabled = false;
  
  public ImagePipelineExperiments$Builder(ImagePipelineConfig.Builder paramBuilder)
  {
    mConfigBuilder = paramBuilder;
  }
  
  public ImagePipelineExperiments build()
  {
    return new ImagePipelineExperiments(this, null);
  }
  
  public boolean isPartialImageCachingEnabled()
  {
    return mPartialImageCachingEnabled;
  }
  
  public ImagePipelineConfig.Builder setBitmapPrepareToDraw(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
  {
    mUseBitmapPrepareToDraw = paramBoolean1;
    mBitmapPrepareToDrawMinSizeBytes = paramInt1;
    mBitmapPrepareToDrawMaxSizeBytes = paramInt2;
    mBitmapPrepareToDrawForPrefetch = paramBoolean2;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setDecodeCancellationEnabled(boolean paramBoolean)
  {
    mDecodeCancellationEnabled = paramBoolean;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setExternalCreatedBitmapLogEnabled(boolean paramBoolean)
  {
    mExternalCreatedBitmapLogEnabled = paramBoolean;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setMediaVariationsIndexEnabled(Supplier<Boolean> paramSupplier)
  {
    mMediaVariationsIndexEnabled = paramSupplier;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setPartialImageCachingEnabled(boolean paramBoolean)
  {
    mPartialImageCachingEnabled = paramBoolean;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setProducerFactoryMethod(ImagePipelineExperiments.ProducerFactoryMethod paramProducerFactoryMethod)
  {
    mProducerFactoryMethod = paramProducerFactoryMethod;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setSmartResizingEnabled(Supplier<Boolean> paramSupplier)
  {
    mSmartResizingEnabled = paramSupplier;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setSuppressBitmapPrefetching(boolean paramBoolean)
  {
    mSuppressBitmapPrefetching = paramBoolean;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setUseDownsampligRatioForResizing(boolean paramBoolean)
  {
    mUseDownsamplingRatioForResizing = paramBoolean;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setWebpBitmapFactory(WebpBitmapFactory paramWebpBitmapFactory)
  {
    mWebpBitmapFactory = paramWebpBitmapFactory;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setWebpErrorLogger(WebpBitmapFactory.WebpErrorLogger paramWebpErrorLogger)
  {
    mWebpErrorLogger = paramWebpErrorLogger;
    return mConfigBuilder;
  }
  
  public ImagePipelineConfig.Builder setWebpSupportEnabled(boolean paramBoolean)
  {
    mWebpSupportEnabled = paramBoolean;
    return mConfigBuilder;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipelineExperiments.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */