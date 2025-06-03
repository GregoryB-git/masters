package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.core.os.CancellationSignal;
import androidx.core.os.CancellationSignal.OnCancelListener;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.R.animator;
import androidx.fragment.R.id;

class FragmentAnim
{
  public static void animateRemoveFragment(@NonNull final Fragment paramFragment, @NonNull AnimationOrAnimator paramAnimationOrAnimator, @NonNull final FragmentTransition.Callback paramCallback)
  {
    final View localView = mView;
    ViewGroup localViewGroup = mContainer;
    localViewGroup.startViewTransition(localView);
    final CancellationSignal localCancellationSignal = new CancellationSignal();
    localCancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener()
    {
      public void onCancel()
      {
        if (getAnimatingAway() != null)
        {
          View localView = getAnimatingAway();
          setAnimatingAway(null);
          localView.clearAnimation();
        }
        setAnimator(null);
      }
    });
    paramCallback.onStart(paramFragment, localCancellationSignal);
    if (animation != null)
    {
      paramAnimationOrAnimator = new EndViewTransitionAnimation(animation, localViewGroup, localView);
      paramFragment.setAnimatingAway(mView);
      paramAnimationOrAnimator.setAnimationListener(new Animation.AnimationListener()
      {
        public void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          post(new Runnable()
          {
            public void run()
            {
              if (val$fragment.getAnimatingAway() != null)
              {
                val$fragment.setAnimatingAway(null);
                FragmentAnim.2 local2 = FragmentAnim.2.this;
                val$callback.onComplete(val$fragment, val$signal);
              }
            }
          });
        }
        
        public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
        
        public void onAnimationStart(Animation paramAnonymousAnimation) {}
      });
      mView.startAnimation(paramAnimationOrAnimator);
    }
    else
    {
      paramAnimationOrAnimator = animator;
      paramFragment.setAnimator(paramAnimationOrAnimator);
      paramAnimationOrAnimator.addListener(new AnimatorListenerAdapter()
      {
        public void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          endViewTransition(localView);
          paramAnonymousAnimator = paramFragment.getAnimator();
          paramFragment.setAnimator(null);
          if ((paramAnonymousAnimator != null) && (indexOfChild(localView) < 0)) {
            paramCallback.onComplete(paramFragment, localCancellationSignal);
          }
        }
      });
      paramAnimationOrAnimator.setTarget(mView);
      paramAnimationOrAnimator.start();
    }
  }
  
  private static int getNextAnim(Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      if (paramBoolean1) {
        return paramFragment.getPopEnterAnim();
      }
      return paramFragment.getPopExitAnim();
    }
    if (paramBoolean1) {
      return paramFragment.getEnterAnim();
    }
    return paramFragment.getExitAnim();
  }
  
  public static AnimationOrAnimator loadAnimation(@NonNull Context paramContext, @NonNull Fragment paramFragment, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramFragment.getNextTransition();
    j = getNextAnim(paramFragment, paramBoolean1, paramBoolean2);
    k = 0;
    paramFragment.setAnimations(0, 0, 0, 0);
    Object localObject = mContainer;
    if (localObject != null)
    {
      m = R.id.visible_removing_fragment_view_tag;
      if (((View)localObject).getTag(m) != null) {
        mContainer.setTag(m, null);
      }
    }
    localObject = mContainer;
    if ((localObject != null) && (((ViewGroup)localObject).getLayoutTransition() != null)) {
      return null;
    }
    localObject = paramFragment.onCreateAnimation(i, paramBoolean1, j);
    if (localObject != null) {
      return new AnimationOrAnimator((Animation)localObject);
    }
    paramFragment = paramFragment.onCreateAnimator(i, paramBoolean1, j);
    if (paramFragment != null) {
      return new AnimationOrAnimator(paramFragment);
    }
    int m = j;
    if (j == 0)
    {
      m = j;
      if (i != 0) {
        m = transitToAnimResourceId(i, paramBoolean1);
      }
    }
    if (m != 0)
    {
      paramBoolean1 = "anim".equals(paramContext.getResources().getResourceTypeName(m));
      j = k;
      if (!paramBoolean1) {}
    }
    try
    {
      try
      {
        paramFragment = AnimationUtils.loadAnimation(paramContext, m);
        if (paramFragment != null)
        {
          paramFragment = new AnimationOrAnimator(paramFragment);
          return paramFragment;
        }
        j = 1;
      }
      catch (Resources.NotFoundException paramContext)
      {
        throw paramContext;
      }
    }
    catch (RuntimeException paramFragment)
    {
      for (;;)
      {
        j = k;
      }
    }
    if (j == 0) {
      try
      {
        paramFragment = AnimatorInflater.loadAnimator(paramContext, m);
        if (paramFragment != null)
        {
          paramFragment = new AnimationOrAnimator(paramFragment);
          return paramFragment;
        }
      }
      catch (RuntimeException paramFragment)
      {
        if (!paramBoolean1)
        {
          paramContext = AnimationUtils.loadAnimation(paramContext, m);
          if (paramContext != null) {
            return new AnimationOrAnimator(paramContext);
          }
        }
        else
        {
          throw paramFragment;
        }
      }
    }
    return null;
  }
  
  @AnimRes
  private static int transitToAnimResourceId(int paramInt, boolean paramBoolean)
  {
    if (paramInt != 4097)
    {
      if (paramInt != 4099)
      {
        if (paramInt != 8194) {
          paramInt = -1;
        } else if (paramBoolean) {
          paramInt = R.animator.fragment_close_enter;
        } else {
          paramInt = R.animator.fragment_close_exit;
        }
      }
      else if (paramBoolean) {
        paramInt = R.animator.fragment_fade_enter;
      } else {
        paramInt = R.animator.fragment_fade_exit;
      }
    }
    else if (paramBoolean) {
      paramInt = R.animator.fragment_open_enter;
    } else {
      paramInt = R.animator.fragment_open_exit;
    }
    return paramInt;
  }
  
  public static class AnimationOrAnimator
  {
    public final Animation animation;
    public final Animator animator;
    
    public AnimationOrAnimator(Animator paramAnimator)
    {
      animation = null;
      animator = paramAnimator;
      if (paramAnimator != null) {
        return;
      }
      throw new IllegalStateException("Animator cannot be null");
    }
    
    public AnimationOrAnimator(Animation paramAnimation)
    {
      animation = paramAnimation;
      animator = null;
      if (paramAnimation != null) {
        return;
      }
      throw new IllegalStateException("Animation cannot be null");
    }
  }
  
  public static class EndViewTransitionAnimation
    extends AnimationSet
    implements Runnable
  {
    private boolean mAnimating = true;
    private final View mChild;
    private boolean mEnded;
    private final ViewGroup mParent;
    private boolean mTransitionEnded;
    
    public EndViewTransitionAnimation(@NonNull Animation paramAnimation, @NonNull ViewGroup paramViewGroup, @NonNull View paramView)
    {
      super();
      mParent = paramViewGroup;
      mChild = paramView;
      addAnimation(paramAnimation);
      paramViewGroup.post(this);
    }
    
    public boolean getTransformation(long paramLong, @NonNull Transformation paramTransformation)
    {
      mAnimating = true;
      if (mEnded) {
        return mTransitionEnded ^ true;
      }
      if (!super.getTransformation(paramLong, paramTransformation))
      {
        mEnded = true;
        OneShotPreDrawListener.add(mParent, this);
      }
      return true;
    }
    
    public boolean getTransformation(long paramLong, @NonNull Transformation paramTransformation, float paramFloat)
    {
      mAnimating = true;
      if (mEnded) {
        return mTransitionEnded ^ true;
      }
      if (!super.getTransformation(paramLong, paramTransformation, paramFloat))
      {
        mEnded = true;
        OneShotPreDrawListener.add(mParent, this);
      }
      return true;
    }
    
    public void run()
    {
      if ((!mEnded) && (mAnimating))
      {
        mAnimating = false;
        mParent.post(this);
      }
      else
      {
        mParent.endViewTransition(mChild);
        mTransitionEnded = true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentAnim
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */