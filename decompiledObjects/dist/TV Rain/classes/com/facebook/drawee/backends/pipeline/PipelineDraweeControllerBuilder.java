package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder.CacheLevel;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class PipelineDraweeControllerBuilder
  extends AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<CloseableImage>, ImageInfo>
{
  @Nullable
  private ImmutableList<DrawableFactory> mCustomDrawableFactories;
  private final ImagePipeline mImagePipeline;
  private final PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;
  
  public PipelineDraweeControllerBuilder(Context paramContext, PipelineDraweeControllerFactory paramPipelineDraweeControllerFactory, ImagePipeline paramImagePipeline, Set<ControllerListener> paramSet)
  {
    super(paramContext, paramSet);
    mImagePipeline = paramImagePipeline;
    mPipelineDraweeControllerFactory = paramPipelineDraweeControllerFactory;
  }
  
  public static ImageRequest.RequestLevel convertCacheLevelToRequestLevel(AbstractDraweeControllerBuilder.CacheLevel paramCacheLevel)
  {
    int i = 1.$SwitchMap$com$facebook$drawee$controller$AbstractDraweeControllerBuilder$CacheLevel[paramCacheLevel.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Cache level");
        localStringBuilder.append(paramCacheLevel);
        localStringBuilder.append("is not supported. ");
        throw new RuntimeException(localStringBuilder.toString());
      }
      return ImageRequest.RequestLevel.DISK_CACHE;
    }
    return ImageRequest.RequestLevel.FULL_FETCH;
  }
  
  private CacheKey getCacheKey()
  {
    ImageRequest localImageRequest = (ImageRequest)getImageRequest();
    Object localObject = mImagePipeline.getCacheKeyFactory();
    if ((localObject != null) && (localImageRequest != null))
    {
      if (localImageRequest.getPostprocessor() != null) {
        localObject = ((CacheKeyFactory)localObject).getPostprocessedBitmapCacheKey(localImageRequest, getCallerContext());
      } else {
        localObject = ((CacheKeyFactory)localObject).getBitmapCacheKey(localImageRequest, getCallerContext());
      }
    }
    else {
      localObject = null;
    }
    return (CacheKey)localObject;
  }
  
  public DataSource<CloseableReference<CloseableImage>> getDataSourceForRequest(ImageRequest paramImageRequest, Object paramObject, AbstractDraweeControllerBuilder.CacheLevel paramCacheLevel)
  {
    return mImagePipeline.fetchDecodedImage(paramImageRequest, paramObject, convertCacheLevelToRequestLevel(paramCacheLevel));
  }
  
  public PipelineDraweeController obtainController()
  {
    Object localObject = getOldController();
    if ((localObject instanceof PipelineDraweeController))
    {
      localObject = (PipelineDraweeController)localObject;
      ((PipelineDraweeController)localObject).initialize(obtainDataSourceSupplier(), AbstractDraweeControllerBuilder.generateUniqueControllerId(), getCacheKey(), getCallerContext(), mCustomDrawableFactories);
    }
    else
    {
      localObject = mPipelineDraweeControllerFactory.newController(obtainDataSourceSupplier(), AbstractDraweeControllerBuilder.generateUniqueControllerId(), getCacheKey(), getCallerContext(), mCustomDrawableFactories);
    }
    return (PipelineDraweeController)localObject;
  }
  
  public PipelineDraweeControllerBuilder setCustomDrawableFactories(@Nullable ImmutableList<DrawableFactory> paramImmutableList)
  {
    mCustomDrawableFactories = paramImmutableList;
    return (PipelineDraweeControllerBuilder)getThis();
  }
  
  public PipelineDraweeControllerBuilder setCustomDrawableFactories(DrawableFactory... paramVarArgs)
  {
    Preconditions.checkNotNull(paramVarArgs);
    return setCustomDrawableFactories(ImmutableList.of(paramVarArgs));
  }
  
  public PipelineDraweeControllerBuilder setCustomDrawableFactory(DrawableFactory paramDrawableFactory)
  {
    Preconditions.checkNotNull(paramDrawableFactory);
    return setCustomDrawableFactories(ImmutableList.of(new DrawableFactory[] { paramDrawableFactory }));
  }
  
  public PipelineDraweeControllerBuilder setUri(@Nullable Uri paramUri)
  {
    if (paramUri == null) {
      return (PipelineDraweeControllerBuilder)super.setImageRequest(null);
    }
    return (PipelineDraweeControllerBuilder)super.setImageRequest(ImageRequestBuilder.newBuilderWithSource(paramUri).setRotationOptions(RotationOptions.autoRotateAtRenderTime()).build());
  }
  
  public PipelineDraweeControllerBuilder setUri(@Nullable String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty())) {
      return setUri(Uri.parse(paramString));
    }
    return (PipelineDraweeControllerBuilder)super.setImageRequest(ImageRequest.fromUri(paramString));
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */