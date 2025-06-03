package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class PipelineDraweeControllerFactory
{
  private DrawableFactory mAnimatedDrawableFactory;
  @Nullable
  private Supplier<Boolean> mDebugOverlayEnabledSupplier;
  private DeferredReleaser mDeferredReleaser;
  @Nullable
  private ImmutableList<DrawableFactory> mDrawableFactories;
  private MemoryCache<CacheKey, CloseableImage> mMemoryCache;
  private Resources mResources;
  private Executor mUiThreadExecutor;
  
  public void init(Resources paramResources, DeferredReleaser paramDeferredReleaser, DrawableFactory paramDrawableFactory, Executor paramExecutor, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, @Nullable ImmutableList<DrawableFactory> paramImmutableList, @Nullable Supplier<Boolean> paramSupplier)
  {
    mResources = paramResources;
    mDeferredReleaser = paramDeferredReleaser;
    mAnimatedDrawableFactory = paramDrawableFactory;
    mUiThreadExecutor = paramExecutor;
    mMemoryCache = paramMemoryCache;
    mDrawableFactories = paramImmutableList;
    mDebugOverlayEnabledSupplier = paramSupplier;
  }
  
  public PipelineDraweeController internalCreateController(Resources paramResources, DeferredReleaser paramDeferredReleaser, DrawableFactory paramDrawableFactory, Executor paramExecutor, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, @Nullable ImmutableList<DrawableFactory> paramImmutableList1, @Nullable ImmutableList<DrawableFactory> paramImmutableList2, Supplier<DataSource<CloseableReference<CloseableImage>>> paramSupplier, String paramString, CacheKey paramCacheKey, Object paramObject)
  {
    paramResources = new PipelineDraweeController(paramResources, paramDeferredReleaser, paramDrawableFactory, paramExecutor, paramMemoryCache, paramSupplier, paramString, paramCacheKey, paramObject, paramImmutableList1);
    paramResources.setCustomDrawableFactories(paramImmutableList2);
    return paramResources;
  }
  
  public PipelineDraweeController newController(Supplier<DataSource<CloseableReference<CloseableImage>>> paramSupplier, String paramString, CacheKey paramCacheKey, Object paramObject)
  {
    return newController(paramSupplier, paramString, paramCacheKey, paramObject, null);
  }
  
  public PipelineDraweeController newController(Supplier<DataSource<CloseableReference<CloseableImage>>> paramSupplier, String paramString, CacheKey paramCacheKey, Object paramObject, @Nullable ImmutableList<DrawableFactory> paramImmutableList)
  {
    boolean bool;
    if (mResources != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool, "init() not called");
    paramSupplier = internalCreateController(mResources, mDeferredReleaser, mAnimatedDrawableFactory, mUiThreadExecutor, mMemoryCache, mDrawableFactories, paramImmutableList, paramSupplier, paramString, paramCacheKey, paramObject);
    paramString = mDebugOverlayEnabledSupplier;
    if (paramString != null) {
      paramSupplier.setDrawDebugOverlay(((Boolean)paramString.get()).booleanValue());
    }
    return paramSupplier;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.backends.pipeline.PipelineDraweeControllerFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */