package androidx.transition;

import android.view.View;

class Transition$AnimationInfo
{
  public String mName;
  public Transition mTransition;
  public TransitionValues mValues;
  public View mView;
  public WindowIdImpl mWindowId;
  
  public Transition$AnimationInfo(View paramView, String paramString, Transition paramTransition, WindowIdImpl paramWindowIdImpl, TransitionValues paramTransitionValues)
  {
    mView = paramView;
    mName = paramString;
    mValues = paramTransitionValues;
    mWindowId = paramWindowIdImpl;
    mTransition = paramTransition;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Transition.AnimationInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */