package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSources;
import com.facebook.datasource.FirstAvailableDataSourceSupplier;
import com.facebook.datasource.IncreasingQualityDataSourceSupplier;
import com.facebook.drawee.components.RetryManager;
import com.facebook.drawee.gestures.GestureDetector;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO>
  implements SimpleDraweeControllerBuilder
{
  private static final NullPointerException NO_REQUEST_EXCEPTION = new NullPointerException("No image request was specified!");
  private static final ControllerListener<Object> sAutoPlayAnimationsListener = new BaseControllerListener()
  {
    public void onFinalImageSet(String paramAnonymousString, @Nullable Object paramAnonymousObject, @Nullable Animatable paramAnonymousAnimatable)
    {
      if (paramAnonymousAnimatable != null) {
        paramAnonymousAnimatable.start();
      }
    }
  };
  private static final AtomicLong sIdCounter = new AtomicLong();
  private boolean mAutoPlayAnimations;
  private final Set<ControllerListener> mBoundControllerListeners;
  @Nullable
  private Object mCallerContext;
  private String mContentDescription;
  private final Context mContext;
  @Nullable
  private ControllerListener<? super INFO> mControllerListener;
  @Nullable
  private ControllerViewportVisibilityListener mControllerViewportVisibilityListener;
  @Nullable
  private Supplier<DataSource<IMAGE>> mDataSourceSupplier;
  @Nullable
  private REQUEST mImageRequest;
  @Nullable
  private REQUEST mLowResImageRequest;
  @Nullable
  private REQUEST[] mMultiImageRequests;
  @Nullable
  private DraweeController mOldController;
  private boolean mRetainImageOnFailure;
  private boolean mTapToRetryEnabled;
  private boolean mTryCacheOnlyFirst;
  
  public AbstractDraweeControllerBuilder(Context paramContext, Set<ControllerListener> paramSet)
  {
    mContext = paramContext;
    mBoundControllerListeners = paramSet;
    init();
  }
  
  public static String generateUniqueControllerId()
  {
    return String.valueOf(sIdCounter.getAndIncrement());
  }
  
  private void init()
  {
    mCallerContext = null;
    mImageRequest = null;
    mLowResImageRequest = null;
    mMultiImageRequests = null;
    mTryCacheOnlyFirst = true;
    mControllerListener = null;
    mControllerViewportVisibilityListener = null;
    mTapToRetryEnabled = false;
    mAutoPlayAnimations = false;
    mOldController = null;
    mContentDescription = null;
  }
  
  public AbstractDraweeController build()
  {
    validate();
    if ((mImageRequest == null) && (mMultiImageRequests == null))
    {
      Object localObject = mLowResImageRequest;
      if (localObject != null)
      {
        mImageRequest = localObject;
        mLowResImageRequest = null;
      }
    }
    return buildController();
  }
  
  public AbstractDraweeController buildController()
  {
    AbstractDraweeController localAbstractDraweeController = obtainController();
    localAbstractDraweeController.setRetainImageOnFailure(getRetainImageOnFailure());
    localAbstractDraweeController.setContentDescription(getContentDescription());
    localAbstractDraweeController.setControllerViewportVisibilityListener(getControllerViewportVisibilityListener());
    maybeBuildAndSetRetryManager(localAbstractDraweeController);
    maybeAttachListeners(localAbstractDraweeController);
    return localAbstractDraweeController;
  }
  
  public boolean getAutoPlayAnimations()
  {
    return mAutoPlayAnimations;
  }
  
  @Nullable
  public Object getCallerContext()
  {
    return mCallerContext;
  }
  
  @Nullable
  public String getContentDescription()
  {
    return mContentDescription;
  }
  
  public Context getContext()
  {
    return mContext;
  }
  
  @Nullable
  public ControllerListener<? super INFO> getControllerListener()
  {
    return mControllerListener;
  }
  
  @Nullable
  public ControllerViewportVisibilityListener getControllerViewportVisibilityListener()
  {
    return mControllerViewportVisibilityListener;
  }
  
  public abstract DataSource<IMAGE> getDataSourceForRequest(REQUEST paramREQUEST, Object paramObject, CacheLevel paramCacheLevel);
  
  @Nullable
  public Supplier<DataSource<IMAGE>> getDataSourceSupplier()
  {
    return mDataSourceSupplier;
  }
  
  public Supplier<DataSource<IMAGE>> getDataSourceSupplierForRequest(REQUEST paramREQUEST)
  {
    return getDataSourceSupplierForRequest(paramREQUEST, CacheLevel.FULL_FETCH);
  }
  
  public Supplier<DataSource<IMAGE>> getDataSourceSupplierForRequest(final REQUEST paramREQUEST, final CacheLevel paramCacheLevel)
  {
    new Supplier()
    {
      public DataSource<IMAGE> get()
      {
        return getDataSourceForRequest(paramREQUEST, val$callerContext, paramCacheLevel);
      }
      
      public String toString()
      {
        return Objects.toStringHelper(this).add("request", paramREQUEST.toString()).toString();
      }
    };
  }
  
  public Supplier<DataSource<IMAGE>> getFirstAvailableDataSourceSupplier(REQUEST[] paramArrayOfREQUEST, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(paramArrayOfREQUEST.length * 2);
    int i = 0;
    int j = i;
    if (paramBoolean) {
      for (int k = 0;; k++)
      {
        j = i;
        if (k >= paramArrayOfREQUEST.length) {
          break;
        }
        localArrayList.add(getDataSourceSupplierForRequest(paramArrayOfREQUEST[k], CacheLevel.BITMAP_MEMORY_CACHE));
      }
    }
    while (j < paramArrayOfREQUEST.length)
    {
      localArrayList.add(getDataSourceSupplierForRequest(paramArrayOfREQUEST[j]));
      j++;
    }
    return FirstAvailableDataSourceSupplier.create(localArrayList);
  }
  
  @Nullable
  public REQUEST[] getFirstAvailableImageRequests()
  {
    return mMultiImageRequests;
  }
  
  @Nullable
  public REQUEST getImageRequest()
  {
    return (REQUEST)mImageRequest;
  }
  
  @Nullable
  public REQUEST getLowResImageRequest()
  {
    return (REQUEST)mLowResImageRequest;
  }
  
  @Nullable
  public DraweeController getOldController()
  {
    return mOldController;
  }
  
  public boolean getRetainImageOnFailure()
  {
    return mRetainImageOnFailure;
  }
  
  public boolean getTapToRetryEnabled()
  {
    return mTapToRetryEnabled;
  }
  
  public final BUILDER getThis()
  {
    return this;
  }
  
  public void maybeAttachListeners(AbstractDraweeController paramAbstractDraweeController)
  {
    Object localObject = mBoundControllerListeners;
    if (localObject != null)
    {
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramAbstractDraweeController.addControllerListener((ControllerListener)((Iterator)localObject).next());
      }
    }
    localObject = mControllerListener;
    if (localObject != null) {
      paramAbstractDraweeController.addControllerListener((ControllerListener)localObject);
    }
    if (mAutoPlayAnimations) {
      paramAbstractDraweeController.addControllerListener(sAutoPlayAnimationsListener);
    }
  }
  
  public void maybeBuildAndSetGestureDetector(AbstractDraweeController paramAbstractDraweeController)
  {
    if (paramAbstractDraweeController.getGestureDetector() == null) {
      paramAbstractDraweeController.setGestureDetector(GestureDetector.newInstance(mContext));
    }
  }
  
  public void maybeBuildAndSetRetryManager(AbstractDraweeController paramAbstractDraweeController)
  {
    if (!mTapToRetryEnabled) {
      return;
    }
    paramAbstractDraweeController.getRetryManager().setTapToRetryEnabled(mTapToRetryEnabled);
    maybeBuildAndSetGestureDetector(paramAbstractDraweeController);
  }
  
  @ReturnsOwnership
  public abstract AbstractDraweeController obtainController();
  
  public Supplier<DataSource<IMAGE>> obtainDataSourceSupplier()
  {
    Object localObject1 = mDataSourceSupplier;
    if (localObject1 != null) {
      return (Supplier<DataSource<IMAGE>>)localObject1;
    }
    localObject1 = null;
    Object localObject2 = mImageRequest;
    if (localObject2 != null)
    {
      localObject1 = getDataSourceSupplierForRequest(localObject2);
    }
    else
    {
      localObject2 = mMultiImageRequests;
      if (localObject2 != null) {
        localObject1 = getFirstAvailableDataSourceSupplier((Object[])localObject2, mTryCacheOnlyFirst);
      }
    }
    localObject2 = localObject1;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (mLowResImageRequest != null)
      {
        localObject2 = new ArrayList(2);
        ((ArrayList)localObject2).add(localObject1);
        ((ArrayList)localObject2).add(getDataSourceSupplierForRequest(mLowResImageRequest));
        localObject2 = IncreasingQualityDataSourceSupplier.create((List)localObject2);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = DataSources.getFailedDataSourceSupplier(NO_REQUEST_EXCEPTION);
    }
    return (Supplier<DataSource<IMAGE>>)localObject1;
  }
  
  public BUILDER reset()
  {
    init();
    return getThis();
  }
  
  public BUILDER setAutoPlayAnimations(boolean paramBoolean)
  {
    mAutoPlayAnimations = paramBoolean;
    return getThis();
  }
  
  public BUILDER setCallerContext(Object paramObject)
  {
    mCallerContext = paramObject;
    return getThis();
  }
  
  public BUILDER setContentDescription(String paramString)
  {
    mContentDescription = paramString;
    return getThis();
  }
  
  public BUILDER setControllerListener(ControllerListener<? super INFO> paramControllerListener)
  {
    mControllerListener = paramControllerListener;
    return getThis();
  }
  
  public BUILDER setControllerViewportVisibilityListener(@Nullable ControllerViewportVisibilityListener paramControllerViewportVisibilityListener)
  {
    mControllerViewportVisibilityListener = paramControllerViewportVisibilityListener;
    return getThis();
  }
  
  public BUILDER setDataSourceSupplier(@Nullable Supplier<DataSource<IMAGE>> paramSupplier)
  {
    mDataSourceSupplier = paramSupplier;
    return getThis();
  }
  
  public BUILDER setFirstAvailableImageRequests(REQUEST[] paramArrayOfREQUEST)
  {
    return setFirstAvailableImageRequests(paramArrayOfREQUEST, true);
  }
  
  public BUILDER setFirstAvailableImageRequests(REQUEST[] paramArrayOfREQUEST, boolean paramBoolean)
  {
    boolean bool;
    if ((paramArrayOfREQUEST != null) && (paramArrayOfREQUEST.length <= 0)) {
      bool = false;
    } else {
      bool = true;
    }
    Preconditions.checkArgument(bool, "No requests specified!");
    mMultiImageRequests = paramArrayOfREQUEST;
    mTryCacheOnlyFirst = paramBoolean;
    return getThis();
  }
  
  public BUILDER setImageRequest(REQUEST paramREQUEST)
  {
    mImageRequest = paramREQUEST;
    return getThis();
  }
  
  public BUILDER setLowResImageRequest(REQUEST paramREQUEST)
  {
    mLowResImageRequest = paramREQUEST;
    return getThis();
  }
  
  public BUILDER setOldController(@Nullable DraweeController paramDraweeController)
  {
    mOldController = paramDraweeController;
    return getThis();
  }
  
  public BUILDER setRetainImageOnFailure(boolean paramBoolean)
  {
    mRetainImageOnFailure = paramBoolean;
    return getThis();
  }
  
  public BUILDER setTapToRetryEnabled(boolean paramBoolean)
  {
    mTapToRetryEnabled = paramBoolean;
    return getThis();
  }
  
  public void validate()
  {
    Object[] arrayOfObject = mMultiImageRequests;
    boolean bool1 = false;
    boolean bool2;
    if ((arrayOfObject != null) && (mImageRequest != null)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    Preconditions.checkState(bool2, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
    if (mDataSourceSupplier != null)
    {
      bool2 = bool1;
      if (mMultiImageRequests == null)
      {
        bool2 = bool1;
        if (mImageRequest == null)
        {
          bool2 = bool1;
          if (mLowResImageRequest != null) {}
        }
      }
    }
    else
    {
      bool2 = true;
    }
    Preconditions.checkState(bool2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
  }
  
  public static enum CacheLevel
  {
    static
    {
      CacheLevel localCacheLevel1 = new CacheLevel("FULL_FETCH", 0);
      FULL_FETCH = localCacheLevel1;
      CacheLevel localCacheLevel2 = new CacheLevel("DISK_CACHE", 1);
      DISK_CACHE = localCacheLevel2;
      CacheLevel localCacheLevel3 = new CacheLevel("BITMAP_MEMORY_CACHE", 2);
      BITMAP_MEMORY_CACHE = localCacheLevel3;
      $VALUES = new CacheLevel[] { localCacheLevel1, localCacheLevel2, localCacheLevel3 };
    }
    
    private CacheLevel() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.controller.AbstractDraweeControllerBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */