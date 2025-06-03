package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.State;

final class FragmentTransaction$Op
{
  public int mCmd;
  public Lifecycle.State mCurrentMaxState;
  public int mEnterAnim;
  public int mExitAnim;
  public Fragment mFragment;
  public Lifecycle.State mOldMaxState;
  public int mPopEnterAnim;
  public int mPopExitAnim;
  
  public FragmentTransaction$Op() {}
  
  public FragmentTransaction$Op(int paramInt, Fragment paramFragment)
  {
    mCmd = paramInt;
    mFragment = paramFragment;
    paramFragment = Lifecycle.State.RESUMED;
    mOldMaxState = paramFragment;
    mCurrentMaxState = paramFragment;
  }
  
  public FragmentTransaction$Op(int paramInt, @NonNull Fragment paramFragment, Lifecycle.State paramState)
  {
    mCmd = paramInt;
    mFragment = paramFragment;
    mOldMaxState = mMaxState;
    mCurrentMaxState = paramState;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransaction.Op
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */