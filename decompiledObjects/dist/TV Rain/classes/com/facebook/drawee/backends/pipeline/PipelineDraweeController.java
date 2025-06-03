package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.debug.DebugControllerOverlayDrawable;
import com.facebook.drawee.drawable.OrientedDrawable;
import com.facebook.drawee.drawable.ScaleTypeDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class PipelineDraweeController
  extends AbstractDraweeController<CloseableReference<CloseableImage>, ImageInfo>
{
  private static final Class<?> TAG = PipelineDraweeController.class;
  private final DrawableFactory mAnimatedDrawableFactory;
  private CacheKey mCacheKey;
  @Nullable
  private ImmutableList<DrawableFactory> mCustomDrawableFactories;
  private Supplier<DataSource<CloseableReference<CloseableImage>>> mDataSourceSupplier;
  private final DrawableFactory mDefaultDrawableFactory = new DrawableFactory()
  {
    public Drawable createDrawable(CloseableImage paramAnonymousCloseableImage)
    {
      if ((paramAnonymousCloseableImage instanceof CloseableStaticBitmap))
      {
        paramAnonymousCloseableImage = (CloseableStaticBitmap)paramAnonymousCloseableImage;
        BitmapDrawable localBitmapDrawable = new BitmapDrawable(PipelineDraweeController.access$000(PipelineDraweeController.this), paramAnonymousCloseableImage.getUnderlyingBitmap());
        if ((!PipelineDraweeController.access$100(paramAnonymousCloseableImage)) && (!PipelineDraweeController.access$200(paramAnonymousCloseableImage))) {
          return localBitmapDrawable;
        }
        return new OrientedDrawable(localBitmapDrawable, paramAnonymousCloseableImage.getRotationAngle(), paramAnonymousCloseableImage.getExifOrientation());
      }
      if ((PipelineDraweeController.access$300(PipelineDraweeController.this) != null) && (PipelineDraweeController.access$300(PipelineDraweeController.this).supportsImageType(paramAnonymousCloseableImage))) {
        return PipelineDraweeController.access$300(PipelineDraweeController.this).createDrawable(paramAnonymousCloseableImage);
      }
      return null;
    }
    
    public boolean supportsImageType(CloseableImage paramAnonymousCloseableImage)
    {
      return true;
    }
  };
  private boolean mDrawDebugOverlay;
  @Nullable
  private final ImmutableList<DrawableFactory> mGlobalDrawableFactories;
  @Nullable
  private MemoryCache<CacheKey, CloseableImage> mMemoryCache;
  private final Resources mResources;
  
  public PipelineDraweeController(Resources paramResources, DeferredReleaser paramDeferredReleaser, DrawableFactory paramDrawableFactory, Executor paramExecutor, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, Supplier<DataSource<CloseableReference<CloseableImage>>> paramSupplier, String paramString, CacheKey paramCacheKey, Object paramObject)
  {
    this(paramResources, paramDeferredReleaser, paramDrawableFactory, paramExecutor, paramMemoryCache, paramSupplier, paramString, paramCacheKey, paramObject, null);
  }
  
  public PipelineDraweeController(Resources paramResources, DeferredReleaser paramDeferredReleaser, DrawableFactory paramDrawableFactory, Executor paramExecutor, MemoryCache<CacheKey, CloseableImage> paramMemoryCache, Supplier<DataSource<CloseableReference<CloseableImage>>> paramSupplier, String paramString, CacheKey paramCacheKey, Object paramObject, @Nullable ImmutableList<DrawableFactory> paramImmutableList)
  {
    super(paramDeferredReleaser, paramExecutor, paramString, paramObject);
    mResources = paramResources;
    mAnimatedDrawableFactory = paramDrawableFactory;
    mMemoryCache = paramMemoryCache;
    mCacheKey = paramCacheKey;
    mGlobalDrawableFactories = paramImmutableList;
    init(paramSupplier);
  }
  
  private static boolean hasTransformableExifOrientation(CloseableStaticBitmap paramCloseableStaticBitmap)
  {
    int i = paramCloseableStaticBitmap.getExifOrientation();
    boolean bool = true;
    if ((i == 1) || (paramCloseableStaticBitmap.getExifOrientation() == 0)) {
      bool = false;
    }
    return bool;
  }
  
  private static boolean hasTransformableRotationAngle(CloseableStaticBitmap paramCloseableStaticBitmap)
  {
    boolean bool;
    if ((paramCloseableStaticBitmap.getRotationAngle() != 0) && (paramCloseableStaticBitmap.getRotationAngle() != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void init(Supplier<DataSource<CloseableReference<CloseableImage>>> paramSupplier)
  {
    mDataSourceSupplier = paramSupplier;
    maybeUpdateDebugOverlay(null);
  }
  
  private Drawable maybeCreateDrawableFromFactories(@Nullable ImmutableList<DrawableFactory> paramImmutableList, CloseableImage paramCloseableImage)
  {
    if (paramImmutableList == null) {
      return null;
    }
    paramImmutableList = paramImmutableList.iterator();
    while (paramImmutableList.hasNext())
    {
      Object localObject = (DrawableFactory)paramImmutableList.next();
      if (((DrawableFactory)localObject).supportsImageType(paramCloseableImage))
      {
        localObject = ((DrawableFactory)localObject).createDrawable(paramCloseableImage);
        if (localObject != null) {
          return (Drawable)localObject;
        }
      }
    }
    return null;
  }
  
  private void maybeUpdateDebugOverlay(@Nullable CloseableImage paramCloseableImage)
  {
    if (!mDrawDebugOverlay) {
      return;
    }
    Drawable localDrawable = getControllerOverlay();
    Object localObject1 = localDrawable;
    if (localDrawable == null)
    {
      localObject1 = new DebugControllerOverlayDrawable();
      setControllerOverlay((Drawable)localObject1);
    }
    if ((localObject1 instanceof DebugControllerOverlayDrawable))
    {
      DebugControllerOverlayDrawable localDebugControllerOverlayDrawable = (DebugControllerOverlayDrawable)localObject1;
      localDebugControllerOverlayDrawable.setControllerId(getId());
      Object localObject2 = getHierarchy();
      localDrawable = null;
      localObject1 = localDrawable;
      if (localObject2 != null)
      {
        localObject2 = ScalingUtils.getActiveScaleTypeDrawable(((DraweeHierarchy)localObject2).getTopLevelDrawable());
        localObject1 = localDrawable;
        if (localObject2 != null) {
          localObject1 = ((ScaleTypeDrawable)localObject2).getScaleType();
        }
      }
      localDebugControllerOverlayDrawable.setScaleType((ScalingUtils.ScaleType)localObject1);
      if (paramCloseableImage != null)
      {
        localDebugControllerOverlayDrawable.setDimensions(paramCloseableImage.getWidth(), paramCloseableImage.getHeight());
        localDebugControllerOverlayDrawable.setImageSize(paramCloseableImage.getSizeInBytes());
      }
      else
      {
        localDebugControllerOverlayDrawable.reset();
      }
    }
  }
  
  public Drawable createDrawable(CloseableReference<CloseableImage> paramCloseableReference)
  {
    Preconditions.checkState(CloseableReference.isValid(paramCloseableReference));
    paramCloseableReference = (CloseableImage)paramCloseableReference.get();
    maybeUpdateDebugOverlay(paramCloseableReference);
    Object localObject = maybeCreateDrawableFromFactories(mCustomDrawableFactories, paramCloseableReference);
    if (localObject != null) {
      return (Drawable)localObject;
    }
    localObject = maybeCreateDrawableFromFactories(mGlobalDrawableFactories, paramCloseableReference);
    if (localObject != null) {
      return (Drawable)localObject;
    }
    localObject = mDefaultDrawableFactory.createDrawable(paramCloseableReference);
    if (localObject != null) {
      return (Drawable)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unrecognized image class: ");
    ((StringBuilder)localObject).append(paramCloseableReference);
    throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
  }
  
  public CacheKey getCacheKey()
  {
    return mCacheKey;
  }
  
  public CloseableReference<CloseableImage> getCachedImage()
  {
    MemoryCache localMemoryCache = mMemoryCache;
    if (localMemoryCache != null)
    {
      Object localObject = mCacheKey;
      if (localObject != null)
      {
        localObject = localMemoryCache.get(localObject);
        if ((localObject != null) && (!((CloseableImage)((CloseableReference)localObject).get()).getQualityInfo().isOfFullQuality()))
        {
          ((CloseableReference)localObject).close();
          return null;
        }
        return (CloseableReference<CloseableImage>)localObject;
      }
    }
    return null;
  }
  
  public DataSource<CloseableReference<CloseableImage>> getDataSource()
  {
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
    }
    return (DataSource)mDataSourceSupplier.get();
  }
  
  public int getImageHash(@Nullable CloseableReference<CloseableImage> paramCloseableReference)
  {
    int i;
    if (paramCloseableReference != null) {
      i = paramCloseableReference.getValueHash();
    } else {
      i = 0;
    }
    return i;
  }
  
  public ImageInfo getImageInfo(CloseableReference<CloseableImage> paramCloseableReference)
  {
    Preconditions.checkState(CloseableReference.isValid(paramCloseableReference));
    return (ImageInfo)paramCloseableReference.get();
  }
  
  public Resources getResources()
  {
    return mResources;
  }
  
  public void initialize(Supplier<DataSource<CloseableReference<CloseableImage>>> paramSupplier, String paramString, CacheKey paramCacheKey, Object paramObject, @Nullable ImmutableList<DrawableFactory> paramImmutableList)
  {
    super.initialize(paramString, paramObject);
    init(paramSupplier);
    mCacheKey = paramCacheKey;
    setCustomDrawableFactories(paramImmutableList);
  }
  
  public void releaseDrawable(@Nullable Drawable paramDrawable)
  {
    if ((paramDrawable instanceof DrawableWithCaches)) {
      ((DrawableWithCaches)paramDrawable).dropCaches();
    }
  }
  
  public void releaseImage(@Nullable CloseableReference<CloseableImage> paramCloseableReference)
  {
    CloseableReference.closeSafely(paramCloseableReference);
  }
  
  public void setCustomDrawableFactories(@Nullable ImmutableList<DrawableFactory> paramImmutableList)
  {
    mCustomDrawableFactories = paramImmutableList;
  }
  
  public void setDrawDebugOverlay(boolean paramBoolean)
  {
    mDrawDebugOverlay = paramBoolean;
  }
  
  public void setHierarchy(@Nullable DraweeHierarchy paramDraweeHierarchy)
  {
    super.setHierarchy(paramDraweeHierarchy);
    maybeUpdateDebugOverlay(null);
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("super", super.toString()).add("dataSourceSupplier", mDataSourceSupplier).toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.backends.pipeline.PipelineDraweeController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */