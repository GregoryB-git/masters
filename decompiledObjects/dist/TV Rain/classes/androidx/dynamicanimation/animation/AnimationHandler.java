package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

class AnimationHandler
{
  private static final long FRAME_DELAY_MS = 10L;
  public static final ThreadLocal<AnimationHandler> sAnimatorHandler = new ThreadLocal();
  public final ArrayList<AnimationFrameCallback> mAnimationCallbacks = new ArrayList();
  private final AnimationCallbackDispatcher mCallbackDispatcher = new AnimationCallbackDispatcher();
  public long mCurrentFrameTime = 0L;
  private final SimpleArrayMap<AnimationFrameCallback, Long> mDelayedCallbackStartTime = new SimpleArrayMap();
  private boolean mListDirty = false;
  private AnimationFrameCallbackProvider mProvider;
  
  private void cleanUpList()
  {
    if (mListDirty)
    {
      for (int i = mAnimationCallbacks.size() - 1; i >= 0; i--) {
        if (mAnimationCallbacks.get(i) == null) {
          mAnimationCallbacks.remove(i);
        }
      }
      mListDirty = false;
    }
  }
  
  public static long getFrameTime()
  {
    ThreadLocal localThreadLocal = sAnimatorHandler;
    if (localThreadLocal.get() == null) {
      return 0L;
    }
    return getmCurrentFrameTime;
  }
  
  public static AnimationHandler getInstance()
  {
    ThreadLocal localThreadLocal = sAnimatorHandler;
    if (localThreadLocal.get() == null) {
      localThreadLocal.set(new AnimationHandler());
    }
    return (AnimationHandler)localThreadLocal.get();
  }
  
  private boolean isCallbackDue(AnimationFrameCallback paramAnimationFrameCallback, long paramLong)
  {
    Long localLong = (Long)mDelayedCallbackStartTime.get(paramAnimationFrameCallback);
    if (localLong == null) {
      return true;
    }
    if (localLong.longValue() < paramLong)
    {
      mDelayedCallbackStartTime.remove(paramAnimationFrameCallback);
      return true;
    }
    return false;
  }
  
  public void addAnimationFrameCallback(AnimationFrameCallback paramAnimationFrameCallback, long paramLong)
  {
    if (mAnimationCallbacks.size() == 0) {
      getProvider().postFrameCallback();
    }
    if (!mAnimationCallbacks.contains(paramAnimationFrameCallback)) {
      mAnimationCallbacks.add(paramAnimationFrameCallback);
    }
    if (paramLong > 0L) {
      mDelayedCallbackStartTime.put(paramAnimationFrameCallback, Long.valueOf(SystemClock.uptimeMillis() + paramLong));
    }
  }
  
  public void doAnimationFrame(long paramLong)
  {
    long l = SystemClock.uptimeMillis();
    for (int i = 0; i < mAnimationCallbacks.size(); i++)
    {
      AnimationFrameCallback localAnimationFrameCallback = (AnimationFrameCallback)mAnimationCallbacks.get(i);
      if ((localAnimationFrameCallback != null) && (isCallbackDue(localAnimationFrameCallback, l))) {
        localAnimationFrameCallback.doAnimationFrame(paramLong);
      }
    }
    cleanUpList();
  }
  
  public AnimationFrameCallbackProvider getProvider()
  {
    if (mProvider == null) {
      mProvider = new FrameCallbackProvider16(mCallbackDispatcher);
    }
    return mProvider;
  }
  
  public void removeCallback(AnimationFrameCallback paramAnimationFrameCallback)
  {
    mDelayedCallbackStartTime.remove(paramAnimationFrameCallback);
    int i = mAnimationCallbacks.indexOf(paramAnimationFrameCallback);
    if (i >= 0)
    {
      mAnimationCallbacks.set(i, null);
      mListDirty = true;
    }
  }
  
  public void setProvider(AnimationFrameCallbackProvider paramAnimationFrameCallbackProvider)
  {
    mProvider = paramAnimationFrameCallbackProvider;
  }
  
  public class AnimationCallbackDispatcher
  {
    public AnimationCallbackDispatcher() {}
    
    public void dispatchAnimationFrame()
    {
      mCurrentFrameTime = SystemClock.uptimeMillis();
      AnimationHandler localAnimationHandler = AnimationHandler.this;
      localAnimationHandler.doAnimationFrame(mCurrentFrameTime);
      if (mAnimationCallbacks.size() > 0) {
        getProvider().postFrameCallback();
      }
    }
  }
  
  public static abstract interface AnimationFrameCallback
  {
    public abstract boolean doAnimationFrame(long paramLong);
  }
  
  public static abstract class AnimationFrameCallbackProvider
  {
    public final AnimationHandler.AnimationCallbackDispatcher mDispatcher;
    
    public AnimationFrameCallbackProvider(AnimationHandler.AnimationCallbackDispatcher paramAnimationCallbackDispatcher)
    {
      mDispatcher = paramAnimationCallbackDispatcher;
    }
    
    public abstract void postFrameCallback();
  }
  
  public static class FrameCallbackProvider14
    extends AnimationHandler.AnimationFrameCallbackProvider
  {
    private final Handler mHandler = new Handler(Looper.myLooper());
    public long mLastFrameTime = -1L;
    private final Runnable mRunnable = new Runnable()
    {
      public void run()
      {
        mLastFrameTime = SystemClock.uptimeMillis();
        mDispatcher.dispatchAnimationFrame();
      }
    };
    
    public FrameCallbackProvider14(AnimationHandler.AnimationCallbackDispatcher paramAnimationCallbackDispatcher)
    {
      super();
    }
    
    public void postFrameCallback()
    {
      long l = Math.max(10L - (SystemClock.uptimeMillis() - mLastFrameTime), 0L);
      mHandler.postDelayed(mRunnable, l);
    }
  }
  
  @RequiresApi(16)
  public static class FrameCallbackProvider16
    extends AnimationHandler.AnimationFrameCallbackProvider
  {
    private final Choreographer mChoreographer = Choreographer.getInstance();
    private final Choreographer.FrameCallback mChoreographerCallback = new Choreographer.FrameCallback()
    {
      public void doFrame(long paramAnonymousLong)
      {
        mDispatcher.dispatchAnimationFrame();
      }
    };
    
    public FrameCallbackProvider16(AnimationHandler.AnimationCallbackDispatcher paramAnimationCallbackDispatcher)
    {
      super();
    }
    
    public void postFrameCallback()
    {
      mChoreographer.postFrameCallback(mChoreographerCallback);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.AnimationHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */