package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;

class FragmentManager$LifecycleAwareResultListener
  implements FragmentResultListener
{
  private final Lifecycle mLifecycle;
  private final FragmentResultListener mListener;
  private final LifecycleEventObserver mObserver;
  
  public FragmentManager$LifecycleAwareResultListener(@NonNull Lifecycle paramLifecycle, @NonNull FragmentResultListener paramFragmentResultListener, @NonNull LifecycleEventObserver paramLifecycleEventObserver)
  {
    mLifecycle = paramLifecycle;
    mListener = paramFragmentResultListener;
    mObserver = paramLifecycleEventObserver;
  }
  
  public boolean isAtLeast(Lifecycle.State paramState)
  {
    return mLifecycle.getCurrentState().isAtLeast(paramState);
  }
  
  public void onFragmentResult(@NonNull String paramString, @NonNull Bundle paramBundle)
  {
    mListener.onFragmentResult(paramString, paramBundle);
  }
  
  public void removeObserver()
  {
    mLifecycle.removeObserver(mObserver);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.LifecycleAwareResultListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */