package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.components.DeferredReleaser.Releasable;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.DraweeEventTracker.Event;
import com.facebook.drawee.components.RetryManager;
import com.facebook.drawee.gestures.GestureDetector;
import com.facebook.drawee.gestures.GestureDetector.ClickListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.interfaces.SettableDraweeHierarchy;
import com.facebook.infer.annotation.ReturnsOwnership;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public abstract class AbstractDraweeController<T, INFO>
  implements DraweeController, DeferredReleaser.Releasable, GestureDetector.ClickListener
{
  private static final Class<?> TAG = AbstractDraweeController.class;
  private Object mCallerContext;
  @Nullable
  private String mContentDescription;
  @Nullable
  private ControllerListener<INFO> mControllerListener;
  @Nullable
  private Drawable mControllerOverlay;
  @Nullable
  private ControllerViewportVisibilityListener mControllerViewportVisibilityListener;
  @Nullable
  private DataSource<T> mDataSource;
  private final DeferredReleaser mDeferredReleaser;
  @Nullable
  private Drawable mDrawable;
  private final DraweeEventTracker mEventTracker = DraweeEventTracker.newInstance();
  @Nullable
  private T mFetchedImage;
  @Nullable
  private GestureDetector mGestureDetector;
  private boolean mHasFetchFailed;
  private String mId;
  private boolean mIsAttached;
  private boolean mIsRequestSubmitted;
  private boolean mIsVisibleInViewportHint;
  private boolean mRetainImageOnFailure;
  @Nullable
  private RetryManager mRetryManager;
  @Nullable
  private SettableDraweeHierarchy mSettableDraweeHierarchy;
  private final Executor mUiThreadImmediateExecutor;
  
  public AbstractDraweeController(DeferredReleaser paramDeferredReleaser, Executor paramExecutor, String paramString, Object paramObject)
  {
    mDeferredReleaser = paramDeferredReleaser;
    mUiThreadImmediateExecutor = paramExecutor;
    init(paramString, paramObject, true);
  }
  
  private void init(String paramString, Object paramObject, boolean paramBoolean)
  {
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
    if (!paramBoolean)
    {
      localObject = mDeferredReleaser;
      if (localObject != null) {
        ((DeferredReleaser)localObject).cancelDeferredRelease(this);
      }
    }
    mIsAttached = false;
    mIsVisibleInViewportHint = false;
    releaseFetch();
    mRetainImageOnFailure = false;
    Object localObject = mRetryManager;
    if (localObject != null) {
      ((RetryManager)localObject).init();
    }
    localObject = mGestureDetector;
    if (localObject != null)
    {
      ((GestureDetector)localObject).init();
      mGestureDetector.setClickListener(this);
    }
    localObject = mControllerListener;
    if ((localObject instanceof InternalForwardingListener)) {
      ((InternalForwardingListener)localObject).clearListeners();
    } else {
      mControllerListener = null;
    }
    mControllerViewportVisibilityListener = null;
    localObject = mSettableDraweeHierarchy;
    if (localObject != null)
    {
      ((SettableDraweeHierarchy)localObject).reset();
      mSettableDraweeHierarchy.setControllerOverlay(null);
      mSettableDraweeHierarchy = null;
    }
    mControllerOverlay = null;
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), mId, paramString);
    }
    mId = paramString;
    mCallerContext = paramObject;
  }
  
  private boolean isExpectedDataSource(String paramString, DataSource<T> paramDataSource)
  {
    boolean bool = true;
    if ((paramDataSource == null) && (mDataSource == null)) {
      return true;
    }
    if ((!paramString.equals(mId)) || (paramDataSource != mDataSource) || (!mIsRequestSubmitted)) {
      bool = false;
    }
    return bool;
  }
  
  private void logMessageAndFailure(String paramString, Throwable paramThrowable)
  {
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), mId, paramString, paramThrowable);
    }
  }
  
  private void logMessageAndImage(String paramString, T paramT)
  {
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x %s: %s: image: %s %x", new Object[] { Integer.valueOf(System.identityHashCode(this)), mId, paramString, getImageClass(paramT), Integer.valueOf(getImageHash(paramT)) });
    }
  }
  
  private void onFailureInternal(String paramString, DataSource<T> paramDataSource, Throwable paramThrowable, boolean paramBoolean)
  {
    if (!isExpectedDataSource(paramString, paramDataSource))
    {
      logMessageAndFailure("ignore_old_datasource @ onFailure", paramThrowable);
      paramDataSource.close();
      return;
    }
    paramDataSource = mEventTracker;
    if (paramBoolean) {
      paramString = DraweeEventTracker.Event.ON_DATASOURCE_FAILURE;
    } else {
      paramString = DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT;
    }
    paramDataSource.recordEvent(paramString);
    if (paramBoolean)
    {
      logMessageAndFailure("final_failed @ onFailure", paramThrowable);
      mDataSource = null;
      mHasFetchFailed = true;
      if (mRetainImageOnFailure)
      {
        paramString = mDrawable;
        if (paramString != null)
        {
          mSettableDraweeHierarchy.setImage(paramString, 1.0F, true);
          break label133;
        }
      }
      if (shouldRetryOnTap()) {
        mSettableDraweeHierarchy.setRetry(paramThrowable);
      } else {
        mSettableDraweeHierarchy.setFailure(paramThrowable);
      }
      label133:
      getControllerListener().onFailure(mId, paramThrowable);
    }
    else
    {
      logMessageAndFailure("intermediate_failed @ onFailure", paramThrowable);
      getControllerListener().onIntermediateImageFailed(mId, paramThrowable);
    }
  }
  
  private void onNewResultInternal(String paramString, DataSource<T> paramDataSource, @Nullable T paramT, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!isExpectedDataSource(paramString, paramDataSource))
    {
      logMessageAndImage("ignore_old_datasource @ onNewResult", paramT);
      releaseImage(paramT);
      paramDataSource.close();
      return;
    }
    Object localObject1 = mEventTracker;
    Object localObject2;
    if (paramBoolean1) {
      localObject2 = DraweeEventTracker.Event.ON_DATASOURCE_RESULT;
    } else {
      localObject2 = DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT;
    }
    ((DraweeEventTracker)localObject1).recordEvent((DraweeEventTracker.Event)localObject2);
    try
    {
      localObject2 = createDrawable(paramT);
      paramDataSource = mFetchedImage;
      localObject1 = mDrawable;
      mFetchedImage = paramT;
      mDrawable = ((Drawable)localObject2);
      if (paramBoolean1) {}
      try
      {
        logMessageAndImage("set_final_result @ onNewResult", paramT);
        mDataSource = null;
        mSettableDraweeHierarchy.setImage((Drawable)localObject2, 1.0F, paramBoolean2);
        getControllerListener().onFinalImageSet(paramString, getImageInfo(paramT), getAnimatable());
        break label182;
        logMessageAndImage("set_intermediate_result @ onNewResult", paramT);
        mSettableDraweeHierarchy.setImage((Drawable)localObject2, paramFloat, paramBoolean2);
        getControllerListener().onIntermediateImageSet(paramString, getImageInfo(paramT));
        label182:
        return;
      }
      finally
      {
        if ((localObject1 != null) && (localObject1 != localObject2)) {
          releaseDrawable((Drawable)localObject1);
        }
        if ((paramDataSource != null) && (paramDataSource != paramT))
        {
          logMessageAndImage("release_previous_result @ onNewResult", paramDataSource);
          releaseImage(paramDataSource);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      logMessageAndImage("drawable_failed @ onNewResult", paramT);
      releaseImage(paramT);
      onFailureInternal(paramString, paramDataSource, localException, paramBoolean1);
    }
  }
  
  private void onProgressUpdateInternal(String paramString, DataSource<T> paramDataSource, float paramFloat, boolean paramBoolean)
  {
    if (!isExpectedDataSource(paramString, paramDataSource))
    {
      logMessageAndFailure("ignore_old_datasource @ onProgress", null);
      paramDataSource.close();
      return;
    }
    if (!paramBoolean) {
      mSettableDraweeHierarchy.setProgress(paramFloat, false);
    }
  }
  
  private void releaseFetch()
  {
    boolean bool = mIsRequestSubmitted;
    mIsRequestSubmitted = false;
    mHasFetchFailed = false;
    Object localObject = mDataSource;
    if (localObject != null)
    {
      ((DataSource)localObject).close();
      mDataSource = null;
    }
    localObject = mDrawable;
    if (localObject != null) {
      releaseDrawable((Drawable)localObject);
    }
    if (mContentDescription != null) {
      mContentDescription = null;
    }
    mDrawable = null;
    localObject = mFetchedImage;
    if (localObject != null)
    {
      logMessageAndImage("release", localObject);
      releaseImage(mFetchedImage);
      mFetchedImage = null;
    }
    if (bool) {
      getControllerListener().onRelease(mId);
    }
  }
  
  private boolean shouldRetryOnTap()
  {
    if (mHasFetchFailed)
    {
      RetryManager localRetryManager = mRetryManager;
      if ((localRetryManager != null) && (localRetryManager.shouldRetryOnTap())) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void addControllerListener(ControllerListener<? super INFO> paramControllerListener)
  {
    Preconditions.checkNotNull(paramControllerListener);
    ControllerListener localControllerListener = mControllerListener;
    if ((localControllerListener instanceof InternalForwardingListener))
    {
      ((InternalForwardingListener)localControllerListener).addListener(paramControllerListener);
      return;
    }
    if (localControllerListener != null)
    {
      mControllerListener = InternalForwardingListener.createInternal(localControllerListener, paramControllerListener);
      return;
    }
    mControllerListener = paramControllerListener;
  }
  
  public abstract Drawable createDrawable(T paramT);
  
  @Nullable
  public Animatable getAnimatable()
  {
    Object localObject = mDrawable;
    if ((localObject instanceof Animatable)) {
      localObject = (Animatable)localObject;
    } else {
      localObject = null;
    }
    return (Animatable)localObject;
  }
  
  public T getCachedImage()
  {
    return null;
  }
  
  public Object getCallerContext()
  {
    return mCallerContext;
  }
  
  @Nullable
  public String getContentDescription()
  {
    return mContentDescription;
  }
  
  public ControllerListener<INFO> getControllerListener()
  {
    ControllerListener localControllerListener1 = mControllerListener;
    ControllerListener localControllerListener2 = localControllerListener1;
    if (localControllerListener1 == null) {
      localControllerListener2 = BaseControllerListener.getNoOpListener();
    }
    return localControllerListener2;
  }
  
  @Nullable
  public Drawable getControllerOverlay()
  {
    return mControllerOverlay;
  }
  
  public abstract DataSource<T> getDataSource();
  
  @Nullable
  public GestureDetector getGestureDetector()
  {
    return mGestureDetector;
  }
  
  @Nullable
  public DraweeHierarchy getHierarchy()
  {
    return mSettableDraweeHierarchy;
  }
  
  public String getId()
  {
    return mId;
  }
  
  public String getImageClass(@Nullable T paramT)
  {
    if (paramT != null) {
      paramT = paramT.getClass().getSimpleName();
    } else {
      paramT = "<null>";
    }
    return paramT;
  }
  
  public int getImageHash(@Nullable T paramT)
  {
    return System.identityHashCode(paramT);
  }
  
  @Nullable
  public abstract INFO getImageInfo(T paramT);
  
  @ReturnsOwnership
  public RetryManager getRetryManager()
  {
    if (mRetryManager == null) {
      mRetryManager = new RetryManager();
    }
    return mRetryManager;
  }
  
  public void initialize(String paramString, Object paramObject)
  {
    init(paramString, paramObject, false);
  }
  
  public void onAttach()
  {
    if (FLog.isLoggable(2))
    {
      Class localClass = TAG;
      int i = System.identityHashCode(this);
      String str1 = mId;
      String str2;
      if (mIsRequestSubmitted) {
        str2 = "request already submitted";
      } else {
        str2 = "request needs submit";
      }
      FLog.v(localClass, "controller %x %s: onAttach: %s", Integer.valueOf(i), str1, str2);
    }
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
    Preconditions.checkNotNull(mSettableDraweeHierarchy);
    mDeferredReleaser.cancelDeferredRelease(this);
    mIsAttached = true;
    if (!mIsRequestSubmitted) {
      submitRequest();
    }
  }
  
  public boolean onClick()
  {
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), mId);
    }
    if (shouldRetryOnTap())
    {
      mRetryManager.notifyTapToRetry();
      mSettableDraweeHierarchy.reset();
      submitRequest();
      return true;
    }
    return false;
  }
  
  public void onDetach()
  {
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), mId);
    }
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
    mIsAttached = false;
    mDeferredReleaser.scheduleDeferredRelease(this);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), mId, paramMotionEvent);
    }
    GestureDetector localGestureDetector = mGestureDetector;
    if (localGestureDetector == null) {
      return false;
    }
    if ((!localGestureDetector.isCapturingGesture()) && (!shouldHandleGesture())) {
      return false;
    }
    mGestureDetector.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void onViewportVisibilityHint(boolean paramBoolean)
  {
    ControllerViewportVisibilityListener localControllerViewportVisibilityListener = mControllerViewportVisibilityListener;
    if (localControllerViewportVisibilityListener != null) {
      if ((paramBoolean) && (!mIsVisibleInViewportHint)) {
        localControllerViewportVisibilityListener.onDraweeViewportEntry(mId);
      } else if ((!paramBoolean) && (mIsVisibleInViewportHint)) {
        localControllerViewportVisibilityListener.onDraweeViewportExit(mId);
      }
    }
    mIsVisibleInViewportHint = paramBoolean;
  }
  
  public void release()
  {
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
    Object localObject = mRetryManager;
    if (localObject != null) {
      ((RetryManager)localObject).reset();
    }
    localObject = mGestureDetector;
    if (localObject != null) {
      ((GestureDetector)localObject).reset();
    }
    localObject = mSettableDraweeHierarchy;
    if (localObject != null) {
      ((SettableDraweeHierarchy)localObject).reset();
    }
    releaseFetch();
  }
  
  public abstract void releaseDrawable(@Nullable Drawable paramDrawable);
  
  public abstract void releaseImage(@Nullable T paramT);
  
  public void removeControllerListener(ControllerListener<? super INFO> paramControllerListener)
  {
    Preconditions.checkNotNull(paramControllerListener);
    ControllerListener localControllerListener = mControllerListener;
    if ((localControllerListener instanceof InternalForwardingListener))
    {
      ((InternalForwardingListener)localControllerListener).removeListener(paramControllerListener);
      return;
    }
    if (localControllerListener == paramControllerListener) {
      mControllerListener = null;
    }
  }
  
  public void setContentDescription(@Nullable String paramString)
  {
    mContentDescription = paramString;
  }
  
  public void setControllerOverlay(@Nullable Drawable paramDrawable)
  {
    mControllerOverlay = paramDrawable;
    SettableDraweeHierarchy localSettableDraweeHierarchy = mSettableDraweeHierarchy;
    if (localSettableDraweeHierarchy != null) {
      localSettableDraweeHierarchy.setControllerOverlay(paramDrawable);
    }
  }
  
  public void setControllerViewportVisibilityListener(@Nullable ControllerViewportVisibilityListener paramControllerViewportVisibilityListener)
  {
    mControllerViewportVisibilityListener = paramControllerViewportVisibilityListener;
  }
  
  public void setGestureDetector(@Nullable GestureDetector paramGestureDetector)
  {
    mGestureDetector = paramGestureDetector;
    if (paramGestureDetector != null) {
      paramGestureDetector.setClickListener(this);
    }
  }
  
  public void setHierarchy(@Nullable DraweeHierarchy paramDraweeHierarchy)
  {
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), mId, paramDraweeHierarchy);
    }
    DraweeEventTracker localDraweeEventTracker = mEventTracker;
    if (paramDraweeHierarchy != null) {
      localObject = DraweeEventTracker.Event.ON_SET_HIERARCHY;
    } else {
      localObject = DraweeEventTracker.Event.ON_CLEAR_HIERARCHY;
    }
    localDraweeEventTracker.recordEvent((DraweeEventTracker.Event)localObject);
    if (mIsRequestSubmitted)
    {
      mDeferredReleaser.cancelDeferredRelease(this);
      release();
    }
    Object localObject = mSettableDraweeHierarchy;
    if (localObject != null)
    {
      ((SettableDraweeHierarchy)localObject).setControllerOverlay(null);
      mSettableDraweeHierarchy = null;
    }
    if (paramDraweeHierarchy != null)
    {
      Preconditions.checkArgument(paramDraweeHierarchy instanceof SettableDraweeHierarchy);
      paramDraweeHierarchy = (SettableDraweeHierarchy)paramDraweeHierarchy;
      mSettableDraweeHierarchy = paramDraweeHierarchy;
      paramDraweeHierarchy.setControllerOverlay(mControllerOverlay);
    }
  }
  
  public void setRetainImageOnFailure(boolean paramBoolean)
  {
    mRetainImageOnFailure = paramBoolean;
  }
  
  public boolean shouldHandleGesture()
  {
    return shouldRetryOnTap();
  }
  
  public void submitRequest()
  {
    Object localObject = getCachedImage();
    if (localObject != null)
    {
      mDataSource = null;
      mIsRequestSubmitted = true;
      mHasFetchFailed = false;
      mEventTracker.recordEvent(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
      getControllerListener().onSubmit(mId, mCallerContext);
      onNewResultInternal(mId, mDataSource, localObject, 1.0F, true, true);
      return;
    }
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
    getControllerListener().onSubmit(mId, mCallerContext);
    mSettableDraweeHierarchy.setProgress(0.0F, true);
    mIsRequestSubmitted = true;
    mHasFetchFailed = false;
    mDataSource = getDataSource();
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), mId, Integer.valueOf(System.identityHashCode(mDataSource)));
    }
    localObject = new BaseDataSubscriber()
    {
      public void onFailureImpl(DataSource<T> paramAnonymousDataSource)
      {
        AbstractDraweeController.access$100(AbstractDraweeController.this, val$id, paramAnonymousDataSource, paramAnonymousDataSource.getFailureCause(), true);
      }
      
      public void onNewResultImpl(DataSource<T> paramAnonymousDataSource)
      {
        boolean bool = paramAnonymousDataSource.isFinished();
        float f = paramAnonymousDataSource.getProgress();
        Object localObject = paramAnonymousDataSource.getResult();
        if (localObject != null) {
          AbstractDraweeController.access$000(AbstractDraweeController.this, val$id, paramAnonymousDataSource, localObject, f, bool, val$wasImmediate);
        } else if (bool) {
          AbstractDraweeController.access$100(AbstractDraweeController.this, val$id, paramAnonymousDataSource, new NullPointerException(), true);
        }
      }
      
      public void onProgressUpdate(DataSource<T> paramAnonymousDataSource)
      {
        boolean bool = paramAnonymousDataSource.isFinished();
        float f = paramAnonymousDataSource.getProgress();
        AbstractDraweeController.access$200(AbstractDraweeController.this, val$id, paramAnonymousDataSource, f, bool);
      }
    };
    mDataSource.subscribe((DataSubscriber)localObject, mUiThreadImmediateExecutor);
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("isAttached", mIsAttached).add("isRequestSubmitted", mIsRequestSubmitted).add("hasFetchFailed", mHasFetchFailed).add("fetchedImage", getImageHash(mFetchedImage)).add("events", mEventTracker.toString()).toString();
  }
  
  public static class InternalForwardingListener<INFO>
    extends ForwardingControllerListener<INFO>
  {
    public static <INFO> InternalForwardingListener<INFO> createInternal(ControllerListener<? super INFO> paramControllerListener1, ControllerListener<? super INFO> paramControllerListener2)
    {
      InternalForwardingListener localInternalForwardingListener = new InternalForwardingListener();
      localInternalForwardingListener.addListener(paramControllerListener1);
      localInternalForwardingListener.addListener(paramControllerListener2);
      return localInternalForwardingListener;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.controller.AbstractDraweeController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */