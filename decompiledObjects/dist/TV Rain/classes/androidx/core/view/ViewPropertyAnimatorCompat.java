package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p5;

public final class ViewPropertyAnimatorCompat
{
  public static final int LISTENER_TAG_ID = 2113929216;
  public Runnable mEndAction = null;
  public int mOldLayerType = -1;
  public Runnable mStartAction = null;
  private final WeakReference<View> mView;
  
  public ViewPropertyAnimatorCompat(View paramView)
  {
    mView = new WeakReference(paramView);
  }
  
  private void setListenerInternal(final View paramView, final ViewPropertyAnimatorListener paramViewPropertyAnimatorListener)
  {
    if (paramViewPropertyAnimatorListener != null) {
      paramView.animate().setListener(new AnimatorListenerAdapter()
      {
        public void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          paramViewPropertyAnimatorListener.onAnimationCancel(paramView);
        }
        
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          paramViewPropertyAnimatorListener.onAnimationEnd(paramView);
        }
        
        public void onAnimationStart(Animator paramAnonymousAnimator)
        {
          paramViewPropertyAnimatorListener.onAnimationStart(paramView);
        }
      });
    } else {
      paramView.animate().setListener(null);
    }
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat alpha(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().alpha(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat alphaBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().alphaBy(paramFloat);
    }
    return this;
  }
  
  public void cancel()
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().cancel();
    }
  }
  
  public long getDuration()
  {
    View localView = (View)mView.get();
    if (localView != null) {
      return localView.animate().getDuration();
    }
    return 0L;
  }
  
  @Nullable
  public Interpolator getInterpolator()
  {
    View localView = (View)mView.get();
    if (localView != null) {
      return Api18Impl.getInterpolator(localView.animate());
    }
    return null;
  }
  
  public long getStartDelay()
  {
    View localView = (View)mView.get();
    if (localView != null) {
      return localView.animate().getStartDelay();
    }
    return 0L;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat rotation(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().rotation(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat rotationBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().rotationBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat rotationX(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().rotationX(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat rotationXBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().rotationXBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat rotationY(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().rotationY(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat rotationYBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().rotationYBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat scaleX(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().scaleX(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat scaleXBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().scaleXBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat scaleY(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().scaleY(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat scaleYBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().scaleYBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat setDuration(long paramLong)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().setDuration(paramLong);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat setInterpolator(@Nullable Interpolator paramInterpolator)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().setInterpolator(paramInterpolator);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat setListener(@Nullable ViewPropertyAnimatorListener paramViewPropertyAnimatorListener)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      setListenerInternal(localView, paramViewPropertyAnimatorListener);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat setStartDelay(long paramLong)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().setStartDelay(paramLong);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat setUpdateListener(@Nullable ViewPropertyAnimatorUpdateListener paramViewPropertyAnimatorUpdateListener)
  {
    View localView = (View)mView.get();
    if (localView != null)
    {
      p5 localp5 = null;
      if (paramViewPropertyAnimatorUpdateListener != null) {
        localp5 = new p5(paramViewPropertyAnimatorUpdateListener, localView);
      }
      Api19Impl.setUpdateListener(localView.animate(), localp5);
    }
    return this;
  }
  
  public void start()
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().start();
    }
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat translationX(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().translationX(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat translationXBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().translationXBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat translationY(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().translationY(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat translationYBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().translationYBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat translationZ(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      Api21Impl.translationZ(localView.animate(), paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat translationZBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      Api21Impl.translationZBy(localView.animate(), paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat withEndAction(@NonNull Runnable paramRunnable)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      Api16Impl.withEndAction(localView.animate(), paramRunnable);
    }
    return this;
  }
  
  @SuppressLint({"WrongConstant"})
  @NonNull
  public ViewPropertyAnimatorCompat withLayer()
  {
    View localView = (View)mView.get();
    if (localView != null) {
      Api16Impl.withLayer(localView.animate());
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat withStartAction(@NonNull Runnable paramRunnable)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      Api16Impl.withStartAction(localView.animate(), paramRunnable);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat x(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().x(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat xBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().xBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat y(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().y(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat yBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      localView.animate().yBy(paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat z(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      Api21Impl.z(localView.animate(), paramFloat);
    }
    return this;
  }
  
  @NonNull
  public ViewPropertyAnimatorCompat zBy(float paramFloat)
  {
    View localView = (View)mView.get();
    if (localView != null) {
      Api21Impl.zBy(localView.animate(), paramFloat);
    }
    return this;
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static ViewPropertyAnimator withEndAction(ViewPropertyAnimator paramViewPropertyAnimator, Runnable paramRunnable)
    {
      return paramViewPropertyAnimator.withEndAction(paramRunnable);
    }
    
    @DoNotInline
    public static ViewPropertyAnimator withLayer(ViewPropertyAnimator paramViewPropertyAnimator)
    {
      return paramViewPropertyAnimator.withLayer();
    }
    
    @DoNotInline
    public static ViewPropertyAnimator withStartAction(ViewPropertyAnimator paramViewPropertyAnimator, Runnable paramRunnable)
    {
      return paramViewPropertyAnimator.withStartAction(paramRunnable);
    }
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static Interpolator getInterpolator(ViewPropertyAnimator paramViewPropertyAnimator)
    {
      return (Interpolator)paramViewPropertyAnimator.getInterpolator();
    }
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static ViewPropertyAnimator setUpdateListener(ViewPropertyAnimator paramViewPropertyAnimator, ValueAnimator.AnimatorUpdateListener paramAnimatorUpdateListener)
    {
      return paramViewPropertyAnimator.setUpdateListener(paramAnimatorUpdateListener);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static ViewPropertyAnimator translationZ(ViewPropertyAnimator paramViewPropertyAnimator, float paramFloat)
    {
      return paramViewPropertyAnimator.translationZ(paramFloat);
    }
    
    @DoNotInline
    public static ViewPropertyAnimator translationZBy(ViewPropertyAnimator paramViewPropertyAnimator, float paramFloat)
    {
      return paramViewPropertyAnimator.translationZBy(paramFloat);
    }
    
    @DoNotInline
    public static ViewPropertyAnimator z(ViewPropertyAnimator paramViewPropertyAnimator, float paramFloat)
    {
      return paramViewPropertyAnimator.z(paramFloat);
    }
    
    @DoNotInline
    public static ViewPropertyAnimator zBy(ViewPropertyAnimator paramViewPropertyAnimator, float paramFloat)
    {
      return paramViewPropertyAnimator.zBy(paramFloat);
    }
  }
  
  public static class ViewPropertyAnimatorListenerApi14
    implements ViewPropertyAnimatorListener
  {
    public boolean mAnimEndCalled;
    public ViewPropertyAnimatorCompat mVpa;
    
    public ViewPropertyAnimatorListenerApi14(ViewPropertyAnimatorCompat paramViewPropertyAnimatorCompat)
    {
      mVpa = paramViewPropertyAnimatorCompat;
    }
    
    public void onAnimationCancel(@NonNull View paramView)
    {
      Object localObject = paramView.getTag(2113929216);
      if ((localObject instanceof ViewPropertyAnimatorListener)) {
        localObject = (ViewPropertyAnimatorListener)localObject;
      } else {
        localObject = null;
      }
      if (localObject != null) {
        ((ViewPropertyAnimatorListener)localObject).onAnimationCancel(paramView);
      }
    }
    
    @SuppressLint({"WrongConstant"})
    public void onAnimationEnd(@NonNull View paramView)
    {
      int i = mVpa.mOldLayerType;
      ViewPropertyAnimatorListener localViewPropertyAnimatorListener = null;
      if (i > -1)
      {
        paramView.setLayerType(i, null);
        mVpa.mOldLayerType = -1;
      }
      Object localObject = mVpa;
      Runnable localRunnable = mEndAction;
      if (localRunnable != null)
      {
        mEndAction = null;
        localRunnable.run();
      }
      localObject = paramView.getTag(2113929216);
      if ((localObject instanceof ViewPropertyAnimatorListener)) {
        localViewPropertyAnimatorListener = (ViewPropertyAnimatorListener)localObject;
      }
      if (localViewPropertyAnimatorListener != null) {
        localViewPropertyAnimatorListener.onAnimationEnd(paramView);
      }
      mAnimEndCalled = true;
    }
    
    public void onAnimationStart(@NonNull View paramView)
    {
      mAnimEndCalled = false;
      int i = mVpa.mOldLayerType;
      ViewPropertyAnimatorListener localViewPropertyAnimatorListener = null;
      if (i > -1) {
        paramView.setLayerType(2, null);
      }
      Object localObject = mVpa;
      Runnable localRunnable = mStartAction;
      if (localRunnable != null)
      {
        mStartAction = null;
        localRunnable.run();
      }
      localObject = paramView.getTag(2113929216);
      if ((localObject instanceof ViewPropertyAnimatorListener)) {
        localViewPropertyAnimatorListener = (ViewPropertyAnimatorListener)localObject;
      }
      if (localViewPropertyAnimatorListener != null) {
        localViewPropertyAnimatorListener.onAnimationStart(paramView);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewPropertyAnimatorCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */