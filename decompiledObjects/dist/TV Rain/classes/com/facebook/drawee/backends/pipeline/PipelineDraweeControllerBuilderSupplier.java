package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.executors.UiThreadImmediateExecutorService;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import java.util.Set;
import javax.annotation.Nullable;

public class PipelineDraweeControllerBuilderSupplier
  implements Supplier<PipelineDraweeControllerBuilder>
{
  private final Set<ControllerListener> mBoundControllerListeners;
  private final Context mContext;
  private final ImagePipeline mImagePipeline;
  private final PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;
  
  public PipelineDraweeControllerBuilderSupplier(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PipelineDraweeControllerBuilderSupplier(Context paramContext, @Nullable DraweeConfig paramDraweeConfig)
  {
    this(paramContext, ImagePipelineFactory.getInstance(), paramDraweeConfig);
  }
  
  public PipelineDraweeControllerBuilderSupplier(Context paramContext, ImagePipelineFactory paramImagePipelineFactory, @Nullable DraweeConfig paramDraweeConfig)
  {
    this(paramContext, paramImagePipelineFactory, null, paramDraweeConfig);
  }
  
  public PipelineDraweeControllerBuilderSupplier(Context paramContext, ImagePipelineFactory paramImagePipelineFactory, Set<ControllerListener> paramSet, @Nullable DraweeConfig paramDraweeConfig)
  {
    mContext = paramContext;
    Object localObject = paramImagePipelineFactory.getImagePipeline();
    mImagePipeline = ((ImagePipeline)localObject);
    if ((paramDraweeConfig != null) && (paramDraweeConfig.getPipelineDraweeControllerFactory() != null)) {
      mPipelineDraweeControllerFactory = paramDraweeConfig.getPipelineDraweeControllerFactory();
    } else {
      mPipelineDraweeControllerFactory = new PipelineDraweeControllerFactory();
    }
    PipelineDraweeControllerFactory localPipelineDraweeControllerFactory = mPipelineDraweeControllerFactory;
    Resources localResources = paramContext.getResources();
    DeferredReleaser localDeferredReleaser = DeferredReleaser.getInstance();
    DrawableFactory localDrawableFactory = paramImagePipelineFactory.getAnimatedDrawableFactory(paramContext);
    UiThreadImmediateExecutorService localUiThreadImmediateExecutorService = UiThreadImmediateExecutorService.getInstance();
    localObject = ((ImagePipeline)localObject).getBitmapMemoryCache();
    paramImagePipelineFactory = null;
    if (paramDraweeConfig != null) {
      paramContext = paramDraweeConfig.getCustomDrawableFactories();
    } else {
      paramContext = null;
    }
    if (paramDraweeConfig != null) {
      paramImagePipelineFactory = paramDraweeConfig.getDebugOverlayEnabledSupplier();
    }
    localPipelineDraweeControllerFactory.init(localResources, localDeferredReleaser, localDrawableFactory, localUiThreadImmediateExecutorService, (MemoryCache)localObject, paramContext, paramImagePipelineFactory);
    mBoundControllerListeners = paramSet;
  }
  
  public PipelineDraweeControllerBuilder get()
  {
    return new PipelineDraweeControllerBuilder(mContext, mPipelineDraweeControllerFactory, mImagePipeline, mBoundControllerListeners);
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilderSupplier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */