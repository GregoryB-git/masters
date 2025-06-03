package androidx.fragment.app;

import android.animation.Animator;
import android.view.View;
import androidx.core.app.SharedElementCallback;
import java.util.ArrayList;

class Fragment$AnimationInfo
{
  public Boolean mAllowEnterTransitionOverlap;
  public Boolean mAllowReturnTransitionOverlap;
  public View mAnimatingAway;
  public Animator mAnimator;
  public int mEnterAnim;
  public Object mEnterTransition = null;
  public SharedElementCallback mEnterTransitionCallback;
  public boolean mEnterTransitionPostponed;
  public int mExitAnim;
  public Object mExitTransition;
  public SharedElementCallback mExitTransitionCallback;
  public View mFocusedView;
  public boolean mIsHideReplaced;
  public boolean mIsPop;
  public int mNextTransition;
  public int mPopEnterAnim;
  public int mPopExitAnim;
  public float mPostOnViewCreatedAlpha;
  public Object mReenterTransition;
  public Object mReturnTransition;
  public Object mSharedElementEnterTransition;
  public Object mSharedElementReturnTransition;
  public ArrayList<String> mSharedElementSourceNames;
  public ArrayList<String> mSharedElementTargetNames;
  public Fragment.OnStartEnterTransitionListener mStartEnterTransitionListener;
  
  public Fragment$AnimationInfo()
  {
    Object localObject = Fragment.USE_DEFAULT_TRANSITION;
    mReturnTransition = localObject;
    mExitTransition = null;
    mReenterTransition = localObject;
    mSharedElementEnterTransition = null;
    mSharedElementReturnTransition = localObject;
    mEnterTransitionCallback = null;
    mExitTransitionCallback = null;
    mPostOnViewCreatedAlpha = 1.0F;
    mFocusedView = null;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.AnimationInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */