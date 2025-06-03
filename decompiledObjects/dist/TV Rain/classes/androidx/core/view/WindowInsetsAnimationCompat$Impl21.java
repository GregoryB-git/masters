package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.R.id;
import androidx.core.graphics.Insets;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RequiresApi(21)
class WindowInsetsAnimationCompat$Impl21
  extends WindowInsetsAnimationCompat.Impl
{
  public WindowInsetsAnimationCompat$Impl21(int paramInt, @Nullable Interpolator paramInterpolator, long paramLong)
  {
    super(paramInt, paramInterpolator, paramLong);
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

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */