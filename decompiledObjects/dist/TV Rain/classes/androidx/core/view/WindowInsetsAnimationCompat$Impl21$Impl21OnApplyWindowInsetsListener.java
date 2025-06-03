package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RequiresApi(21)
class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener
  implements View.OnApplyWindowInsetsListener
{
  private static final int COMPAT_ANIMATION_DURATION = 160;
  public final WindowInsetsAnimationCompat.Callback mCallback;
  private WindowInsetsCompat mLastInsets;
  
  public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener(@NonNull View paramView, @NonNull WindowInsetsAnimationCompat.Callback paramCallback)
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

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */