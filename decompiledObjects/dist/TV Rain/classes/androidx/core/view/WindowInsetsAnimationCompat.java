package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R.id;
import androidx.core.graphics.Insets;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import l4;
import z2;

public final class WindowInsetsAnimationCompat
{
  private static final boolean DEBUG = false;
  private static final String TAG = "WindowInsetsAnimCompat";
  private Impl mImpl;
  
  public WindowInsetsAnimationCompat(int paramInt, @Nullable Interpolator paramInterpolator, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      mImpl = new Impl30(paramInt, paramInterpolator, paramLong);
    } else {
      mImpl = new Impl21(paramInt, paramInterpolator, paramLong);
    }
  }
  
  @RequiresApi(30)
  private WindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    this(0, null, 0L);
    if (Build.VERSION.SDK_INT >= 30) {
      mImpl = new Impl30(paramWindowInsetsAnimation);
    }
  }
  
  public static void setCallback(@NonNull View paramView, @Nullable Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      Impl30.setCallback(paramView, paramCallback);
    } else {
      Impl21.setCallback(paramView, paramCallback);
    }
  }
  
  @RequiresApi(30)
  public static WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    return new WindowInsetsAnimationCompat(paramWindowInsetsAnimation);
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getAlpha()
  {
    return mImpl.getAlpha();
  }
  
  public long getDurationMillis()
  {
    return mImpl.getDurationMillis();
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getFraction()
  {
    return mImpl.getFraction();
  }
  
  public float getInterpolatedFraction()
  {
    return mImpl.getInterpolatedFraction();
  }
  
  @Nullable
  public Interpolator getInterpolator()
  {
    return mImpl.getInterpolator();
  }
  
  public int getTypeMask()
  {
    return mImpl.getTypeMask();
  }
  
  public void setAlpha(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    mImpl.setAlpha(paramFloat);
  }
  
  public void setFraction(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    mImpl.setFraction(paramFloat);
  }
  
  public static final class BoundsCompat
  {
    private final Insets mLowerBound;
    private final Insets mUpperBound;
    
    @RequiresApi(30)
    private BoundsCompat(@NonNull WindowInsetsAnimation.Bounds paramBounds)
    {
      mLowerBound = WindowInsetsAnimationCompat.Impl30.getLowerBounds(paramBounds);
      mUpperBound = WindowInsetsAnimationCompat.Impl30.getHigherBounds(paramBounds);
    }
    
    public BoundsCompat(@NonNull Insets paramInsets1, @NonNull Insets paramInsets2)
    {
      mLowerBound = paramInsets1;
      mUpperBound = paramInsets2;
    }
    
    @NonNull
    @RequiresApi(30)
    public static BoundsCompat toBoundsCompat(@NonNull WindowInsetsAnimation.Bounds paramBounds)
    {
      return new BoundsCompat(paramBounds);
    }
    
    @NonNull
    public Insets getLowerBound()
    {
      return mLowerBound;
    }
    
    @NonNull
    public Insets getUpperBound()
    {
      return mUpperBound;
    }
    
    @NonNull
    public BoundsCompat inset(@NonNull Insets paramInsets)
    {
      return new BoundsCompat(WindowInsetsCompat.insetInsets(mLowerBound, left, top, right, bottom), WindowInsetsCompat.insetInsets(mUpperBound, left, top, right, bottom));
    }
    
    @NonNull
    @RequiresApi(30)
    public WindowInsetsAnimation.Bounds toBounds()
    {
      return WindowInsetsAnimationCompat.Impl30.createPlatformBounds(this);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("Bounds{lower=");
      localStringBuilder.append(mLowerBound);
      localStringBuilder.append(" upper=");
      localStringBuilder.append(mUpperBound);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class Callback
  {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    public WindowInsets mDispachedInsets;
    private final int mDispatchMode;
    
    public Callback(int paramInt)
    {
      mDispatchMode = paramInt;
    }
    
    public final int getDispatchMode()
    {
      return mDispatchMode;
    }
    
    public void onEnd(@NonNull WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat) {}
    
    public void onPrepare(@NonNull WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat) {}
    
    @NonNull
    public abstract WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> paramList);
    
    @NonNull
    public WindowInsetsAnimationCompat.BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
    {
      return paramBoundsCompat;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static @interface DispatchMode {}
  }
  
  public static class Impl
  {
    private float mAlpha;
    private final long mDurationMillis;
    private float mFraction;
    @Nullable
    private final Interpolator mInterpolator;
    private final int mTypeMask;
    
    public Impl(int paramInt, @Nullable Interpolator paramInterpolator, long paramLong)
    {
      mTypeMask = paramInt;
      mInterpolator = paramInterpolator;
      mDurationMillis = paramLong;
    }
    
    public float getAlpha()
    {
      return mAlpha;
    }
    
    public long getDurationMillis()
    {
      return mDurationMillis;
    }
    
    public float getFraction()
    {
      return mFraction;
    }
    
    public float getInterpolatedFraction()
    {
      Interpolator localInterpolator = mInterpolator;
      if (localInterpolator != null) {
        return localInterpolator.getInterpolation(mFraction);
      }
      return mFraction;
    }
    
    @Nullable
    public Interpolator getInterpolator()
    {
      return mInterpolator;
    }
    
    public int getTypeMask()
    {
      return mTypeMask;
    }
    
    public void setAlpha(float paramFloat)
    {
      mAlpha = paramFloat;
    }
    
    public void setFraction(float paramFloat)
    {
      mFraction = paramFloat;
    }
  }
  
  @RequiresApi(21)
  public static class Impl21
    extends WindowInsetsAnimationCompat.Impl
  {
    public Impl21(int paramInt, @Nullable Interpolator paramInterpolator, long paramLong)
    {
      super(paramInterpolator, paramLong);
    }
    
    @SuppressLint({"WrongConstant"})
    public static int buildAnimationMask(@NonNull WindowInsetsCompat paramWindowInsetsCompat1, @NonNull WindowInsetsCompat paramWindowInsetsCompat2)
    {
      int i = 1;
      int k;
      for (int j = 0; i <= 256; j = k)
      {
        k = j;
        if (!paramWindowInsetsCompat1.getInsets(i).equals(paramWindowInsetsCompat2.getInsets(i))) {
          k = j | i;
        }
        i <<= 1;
      }
      return j;
    }
    
    @NonNull
    public static WindowInsetsAnimationCompat.BoundsCompat computeAnimationBounds(@NonNull WindowInsetsCompat paramWindowInsetsCompat1, @NonNull WindowInsetsCompat paramWindowInsetsCompat2, int paramInt)
    {
      paramWindowInsetsCompat1 = paramWindowInsetsCompat1.getInsets(paramInt);
      paramWindowInsetsCompat2 = paramWindowInsetsCompat2.getInsets(paramInt);
      return new WindowInsetsAnimationCompat.BoundsCompat(Insets.of(Math.min(left, left), Math.min(top, top), Math.min(right, right), Math.min(bottom, bottom)), Insets.of(Math.max(left, left), Math.max(top, top), Math.max(right, right), Math.max(bottom, bottom)));
    }
    
    @NonNull
    private static View.OnApplyWindowInsetsListener createProxyListener(@NonNull View paramView, @NonNull WindowInsetsAnimationCompat.Callback paramCallback)
    {
      return new Impl21OnApplyWindowInsetsListener(paramView, paramCallback);
    }
    
    public static void dispatchOnEnd(@NonNull View paramView, @NonNull WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat)
    {
      WindowInsetsAnimationCompat.Callback localCallback = getCallback(paramView);
      if (localCallback != null)
      {
        localCallback.onEnd(paramWindowInsetsAnimationCompat);
        if (localCallback.getDispatchMode() == 0) {
          return;
        }
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++) {
          dispatchOnEnd(paramView.getChildAt(i), paramWindowInsetsAnimationCompat);
        }
      }
    }
    
    public static void dispatchOnPrepare(View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsets paramWindowInsets, boolean paramBoolean)
    {
      WindowInsetsAnimationCompat.Callback localCallback = getCallback(paramView);
      int i = 0;
      boolean bool = paramBoolean;
      if (localCallback != null)
      {
        mDispachedInsets = paramWindowInsets;
        bool = paramBoolean;
        if (!paramBoolean)
        {
          localCallback.onPrepare(paramWindowInsetsAnimationCompat);
          if (localCallback.getDispatchMode() == 0) {
            bool = true;
          } else {
            bool = false;
          }
        }
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        while (i < paramView.getChildCount())
        {
          dispatchOnPrepare(paramView.getChildAt(i), paramWindowInsetsAnimationCompat, paramWindowInsets, bool);
          i++;
        }
      }
    }
    
    public static void dispatchOnProgress(@NonNull View paramView, @NonNull WindowInsetsCompat paramWindowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> paramList)
    {
      WindowInsetsAnimationCompat.Callback localCallback = getCallback(paramView);
      WindowInsetsCompat localWindowInsetsCompat = paramWindowInsetsCompat;
      if (localCallback != null)
      {
        localWindowInsetsCompat = localCallback.onProgress(paramWindowInsetsCompat, paramList);
        if (localCallback.getDispatchMode() == 0) {
          return;
        }
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++) {
          dispatchOnProgress(paramView.getChildAt(i), localWindowInsetsCompat, paramList);
        }
      }
    }
    
    public static void dispatchOnStart(View paramView, WindowInsetsAnimationCompat paramWindowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
    {
      WindowInsetsAnimationCompat.Callback localCallback = getCallback(paramView);
      if (localCallback != null)
      {
        localCallback.onStart(paramWindowInsetsAnimationCompat, paramBoundsCompat);
        if (localCallback.getDispatchMode() == 0) {
          return;
        }
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        for (int i = 0; i < paramView.getChildCount(); i++) {
          dispatchOnStart(paramView.getChildAt(i), paramWindowInsetsAnimationCompat, paramBoundsCompat);
        }
      }
    }
    
    @NonNull
    public static WindowInsets forwardToViewIfNeeded(@NonNull View paramView, @NonNull WindowInsets paramWindowInsets)
    {
      if (paramView.getTag(R.id.tag_on_apply_window_listener) != null) {
        return paramWindowInsets;
      }
      return paramView.onApplyWindowInsets(paramWindowInsets);
    }
    
    @Nullable
    public static WindowInsetsAnimationCompat.Callback getCallback(View paramView)
    {
      paramView = paramView.getTag(R.id.tag_window_insets_animation_callback);
      if ((paramView instanceof Impl21OnApplyWindowInsetsListener)) {
        paramView = mCallback;
      } else {
        paramView = null;
      }
      return paramView;
    }
    
    @SuppressLint({"WrongConstant"})
    public static WindowInsetsCompat interpolateInsets(WindowInsetsCompat paramWindowInsetsCompat1, WindowInsetsCompat paramWindowInsetsCompat2, float paramFloat, int paramInt)
    {
      WindowInsetsCompat.Builder localBuilder = new WindowInsetsCompat.Builder(paramWindowInsetsCompat1);
      int i = 1;
      while (i <= 256)
      {
        if ((paramInt & i) == 0)
        {
          localBuilder.setInsets(i, paramWindowInsetsCompat1.getInsets(i));
        }
        else
        {
          Insets localInsets1 = paramWindowInsetsCompat1.getInsets(i);
          Insets localInsets2 = paramWindowInsetsCompat2.getInsets(i);
          float f1 = left - left;
          float f2 = 1.0F - paramFloat;
          localBuilder.setInsets(i, WindowInsetsCompat.insetInsets(localInsets1, (int)(f1 * f2 + 0.5D), (int)((top - top) * f2 + 0.5D), (int)((right - right) * f2 + 0.5D), (int)((bottom - bottom) * f2 + 0.5D)));
        }
        i <<= 1;
      }
      return localBuilder.build();
    }
    
    public static void setCallback(@NonNull View paramView, @Nullable WindowInsetsAnimationCompat.Callback paramCallback)
    {
      Object localObject = paramView.getTag(R.id.tag_on_apply_window_listener);
      if (paramCallback == null)
      {
        paramView.setTag(R.id.tag_window_insets_animation_callback, null);
        if (localObject == null) {
          paramView.setOnApplyWindowInsetsListener(null);
        }
      }
      else
      {
        paramCallback = createProxyListener(paramView, paramCallback);
        paramView.setTag(R.id.tag_window_insets_animation_callback, paramCallback);
        if (localObject == null) {
          paramView.setOnApplyWindowInsetsListener(paramCallback);
        }
      }
    }
    
    @RequiresApi(21)
    public static class Impl21OnApplyWindowInsetsListener
      implements View.OnApplyWindowInsetsListener
    {
      private static final int COMPAT_ANIMATION_DURATION = 160;
      public final WindowInsetsAnimationCompat.Callback mCallback;
      private WindowInsetsCompat mLastInsets;
      
      public Impl21OnApplyWindowInsetsListener(@NonNull View paramView, @NonNull WindowInsetsAnimationCompat.Callback paramCallback)
      {
        mCallback = paramCallback;
        paramView = ViewCompat.getRootWindowInsets(paramView);
        if (paramView != null) {
          paramView = new WindowInsetsCompat.Builder(paramView).build();
        } else {
          paramView = null;
        }
        mLastInsets = paramView;
      }
      
      public WindowInsets onApplyWindowInsets(final View paramView, WindowInsets paramWindowInsets)
      {
        if (!paramView.isLaidOut())
        {
          mLastInsets = WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets, paramView);
          return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
        }
        final WindowInsetsCompat localWindowInsetsCompat1 = WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets, paramView);
        if (mLastInsets == null) {
          mLastInsets = ViewCompat.getRootWindowInsets(paramView);
        }
        if (mLastInsets == null)
        {
          mLastInsets = localWindowInsetsCompat1;
          return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
        }
        final Object localObject = WindowInsetsAnimationCompat.Impl21.getCallback(paramView);
        if ((localObject != null) && (Objects.equals(mDispachedInsets, paramWindowInsets))) {
          return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
        }
        final int i = WindowInsetsAnimationCompat.Impl21.buildAnimationMask(localWindowInsetsCompat1, mLastInsets);
        if (i == 0) {
          return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
        }
        final WindowInsetsCompat localWindowInsetsCompat2 = mLastInsets;
        final WindowInsetsAnimationCompat localWindowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i, new DecelerateInterpolator(), 160L);
        localWindowInsetsAnimationCompat.setFraction(0.0F);
        localObject = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(localWindowInsetsAnimationCompat.getDurationMillis());
        final WindowInsetsAnimationCompat.BoundsCompat localBoundsCompat = WindowInsetsAnimationCompat.Impl21.computeAnimationBounds(localWindowInsetsCompat1, localWindowInsetsCompat2, i);
        WindowInsetsAnimationCompat.Impl21.dispatchOnPrepare(paramView, localWindowInsetsAnimationCompat, paramWindowInsets, false);
        ((ValueAnimator)localObject).addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
          public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
          {
            localWindowInsetsAnimationCompat.setFraction(paramAnonymousValueAnimator.getAnimatedFraction());
            paramAnonymousValueAnimator = WindowInsetsAnimationCompat.Impl21.interpolateInsets(localWindowInsetsCompat1, localWindowInsetsCompat2, localWindowInsetsAnimationCompat.getInterpolatedFraction(), i);
            List localList = Collections.singletonList(localWindowInsetsAnimationCompat);
            WindowInsetsAnimationCompat.Impl21.dispatchOnProgress(paramView, paramAnonymousValueAnimator, localList);
          }
        });
        ((Animator)localObject).addListener(new AnimatorListenerAdapter()
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            localWindowInsetsAnimationCompat.setFraction(1.0F);
            WindowInsetsAnimationCompat.Impl21.dispatchOnEnd(paramView, localWindowInsetsAnimationCompat);
          }
        });
        OneShotPreDrawListener.add(paramView, new Runnable()
        {
          public void run()
          {
            WindowInsetsAnimationCompat.Impl21.dispatchOnStart(paramView, localWindowInsetsAnimationCompat, localBoundsCompat);
            localObject.start();
          }
        });
        mLastInsets = localWindowInsetsCompat1;
        return WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(paramView, paramWindowInsets);
      }
    }
  }
  
  @RequiresApi(30)
  public static class Impl30
    extends WindowInsetsAnimationCompat.Impl
  {
    @NonNull
    private final WindowInsetsAnimation mWrapped;
    
    public Impl30(int paramInt, Interpolator paramInterpolator, long paramLong)
    {
      this(new WindowInsetsAnimation(paramInt, paramInterpolator, paramLong));
    }
    
    public Impl30(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
    {
      super(null, 0L);
      mWrapped = paramWindowInsetsAnimation;
    }
    
    @NonNull
    public static WindowInsetsAnimation.Bounds createPlatformBounds(@NonNull WindowInsetsAnimationCompat.BoundsCompat paramBoundsCompat)
    {
      return new WindowInsetsAnimation.Bounds(paramBoundsCompat.getLowerBound().toPlatformInsets(), paramBoundsCompat.getUpperBound().toPlatformInsets());
    }
    
    @NonNull
    public static Insets getHigherBounds(@NonNull WindowInsetsAnimation.Bounds paramBounds)
    {
      return Insets.toCompatInsets(paramBounds.getUpperBound());
    }
    
    @NonNull
    public static Insets getLowerBounds(@NonNull WindowInsetsAnimation.Bounds paramBounds)
    {
      return Insets.toCompatInsets(paramBounds.getLowerBound());
    }
    
    public static void setCallback(@NonNull View paramView, @Nullable WindowInsetsAnimationCompat.Callback paramCallback)
    {
      if (paramCallback != null) {
        paramCallback = new ProxyCallback(paramCallback);
      } else {
        paramCallback = null;
      }
      l4.j(paramView, paramCallback);
    }
    
    public long getDurationMillis()
    {
      return mWrapped.getDurationMillis();
    }
    
    public float getFraction()
    {
      return mWrapped.getFraction();
    }
    
    public float getInterpolatedFraction()
    {
      return mWrapped.getInterpolatedFraction();
    }
    
    @Nullable
    public Interpolator getInterpolator()
    {
      return mWrapped.getInterpolator();
    }
    
    public int getTypeMask()
    {
      return mWrapped.getTypeMask();
    }
    
    public void setFraction(float paramFloat)
    {
      mWrapped.setFraction(paramFloat);
    }
    
    @RequiresApi(30)
    public static class ProxyCallback
      extends WindowInsetsAnimation.Callback
    {
      private final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> mAnimations = new HashMap();
      private final WindowInsetsAnimationCompat.Callback mCompat;
      private List<WindowInsetsAnimationCompat> mRORunningAnimations;
      private ArrayList<WindowInsetsAnimationCompat> mTmpRunningAnimations;
      
      public ProxyCallback(@NonNull WindowInsetsAnimationCompat.Callback paramCallback)
      {
        super();
        mCompat = paramCallback;
      }
      
      @NonNull
      private WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
      {
        WindowInsetsAnimationCompat localWindowInsetsAnimationCompat1 = (WindowInsetsAnimationCompat)mAnimations.get(paramWindowInsetsAnimation);
        WindowInsetsAnimationCompat localWindowInsetsAnimationCompat2 = localWindowInsetsAnimationCompat1;
        if (localWindowInsetsAnimationCompat1 == null)
        {
          localWindowInsetsAnimationCompat2 = WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(paramWindowInsetsAnimation);
          mAnimations.put(paramWindowInsetsAnimation, localWindowInsetsAnimationCompat2);
        }
        return localWindowInsetsAnimationCompat2;
      }
      
      public void onEnd(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
      {
        mCompat.onEnd(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation));
        mAnimations.remove(paramWindowInsetsAnimation);
      }
      
      public void onPrepare(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation)
      {
        mCompat.onPrepare(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation));
      }
      
      @NonNull
      public WindowInsets onProgress(@NonNull WindowInsets paramWindowInsets, @NonNull List<WindowInsetsAnimation> paramList)
      {
        Object localObject = mTmpRunningAnimations;
        if (localObject == null)
        {
          localObject = new ArrayList(paramList.size());
          mTmpRunningAnimations = ((ArrayList)localObject);
          mRORunningAnimations = Collections.unmodifiableList((List)localObject);
        }
        else
        {
          ((ArrayList)localObject).clear();
        }
        for (int i = paramList.size() - 1; i >= 0; i--)
        {
          WindowInsetsAnimation localWindowInsetsAnimation = (WindowInsetsAnimation)paramList.get(i);
          localObject = getWindowInsetsAnimationCompat(localWindowInsetsAnimation);
          ((WindowInsetsAnimationCompat)localObject).setFraction(localWindowInsetsAnimation.getFraction());
          mTmpRunningAnimations.add(localObject);
        }
        return mCompat.onProgress(WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets), mRORunningAnimations).toWindowInsets();
      }
      
      @NonNull
      public WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation paramWindowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds paramBounds)
      {
        return mCompat.onStart(getWindowInsetsAnimationCompat(paramWindowInsetsAnimation), WindowInsetsAnimationCompat.BoundsCompat.toBoundsCompat(paramBounds)).toBounds();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */