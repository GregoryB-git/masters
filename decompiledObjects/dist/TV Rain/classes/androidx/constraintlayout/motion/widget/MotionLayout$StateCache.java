package androidx.constraintlayout.motion.widget;

import android.os.BaseBundle;
import android.os.Bundle;

class MotionLayout$StateCache
{
  public final String KeyEndState = "motion.EndState";
  public final String KeyProgress = "motion.progress";
  public final String KeyStartState = "motion.StartState";
  public final String KeyVelocity = "motion.velocity";
  public int endState = -1;
  public float mProgress = NaN.0F;
  public float mVelocity = NaN.0F;
  public int startState = -1;
  
  public MotionLayout$StateCache(MotionLayout paramMotionLayout) {}
  
  public void apply()
  {
    int i = startState;
    if ((i != -1) || (endState != -1))
    {
      if (i == -1)
      {
        this$0.transitionToState(endState);
      }
      else
      {
        int j = endState;
        if (j == -1) {
          this$0.setState(i, -1, -1);
        } else {
          this$0.setTransition(i, j);
        }
      }
      this$0.setState(MotionLayout.TransitionState.SETUP);
    }
    if (Float.isNaN(mVelocity))
    {
      if (Float.isNaN(mProgress)) {
        return;
      }
      this$0.setProgress(mProgress);
      return;
    }
    this$0.setProgress(mProgress, mVelocity);
    mProgress = NaN.0F;
    mVelocity = NaN.0F;
    startState = -1;
    endState = -1;
  }
  
  public Bundle getTransitionState()
  {
    Bundle localBundle = new Bundle();
    localBundle.putFloat("motion.progress", mProgress);
    localBundle.putFloat("motion.velocity", mVelocity);
    localBundle.putInt("motion.StartState", startState);
    localBundle.putInt("motion.EndState", endState);
    return localBundle;
  }
  
  public void recordState()
  {
    endState = MotionLayout.access$100(this$0);
    startState = MotionLayout.access$200(this$0);
    mVelocity = this$0.getVelocity();
    mProgress = this$0.getProgress();
  }
  
  public void setEndState(int paramInt)
  {
    endState = paramInt;
  }
  
  public void setProgress(float paramFloat)
  {
    mProgress = paramFloat;
  }
  
  public void setStartState(int paramInt)
  {
    startState = paramInt;
  }
  
  public void setTransitionState(Bundle paramBundle)
  {
    mProgress = paramBundle.getFloat("motion.progress");
    mVelocity = paramBundle.getFloat("motion.velocity");
    startState = paramBundle.getInt("motion.StartState");
    endState = paramBundle.getInt("motion.EndState");
  }
  
  public void setVelocity(float paramFloat)
  {
    mVelocity = paramFloat;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.StateCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */