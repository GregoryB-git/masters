package androidx.fragment.app;

import a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.core.os.CancellationSignal;
import androidx.core.os.CancellationSignal.OnCancelListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import z2;

class SpecialEffectsController$Operation
{
  @NonNull
  private final List<Runnable> mCompletionListeners = new ArrayList();
  @NonNull
  private State mFinalState;
  @NonNull
  private final Fragment mFragment;
  private boolean mIsCanceled = false;
  private boolean mIsComplete = false;
  @NonNull
  private LifecycleImpact mLifecycleImpact;
  @NonNull
  private final HashSet<CancellationSignal> mSpecialEffectsSignals = new HashSet();
  
  public SpecialEffectsController$Operation(@NonNull State paramState, @NonNull LifecycleImpact paramLifecycleImpact, @NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal)
  {
    mFinalState = paramState;
    mLifecycleImpact = paramLifecycleImpact;
    mFragment = paramFragment;
    paramCancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener()
    {
      public void onCancel()
      {
        cancel();
      }
    });
  }
  
  public final void addCompletionListener(@NonNull Runnable paramRunnable)
  {
    mCompletionListeners.add(paramRunnable);
  }
  
  public final void cancel()
  {
    if (isCanceled()) {
      return;
    }
    mIsCanceled = true;
    if (mSpecialEffectsSignals.isEmpty())
    {
      complete();
    }
    else
    {
      Iterator localIterator = new ArrayList(mSpecialEffectsSignals).iterator();
      while (localIterator.hasNext()) {
        ((CancellationSignal)localIterator.next()).cancel();
      }
    }
  }
  
  @CallSuper
  public void complete()
  {
    if (mIsComplete) {
      return;
    }
    if (FragmentManager.isLoggingEnabled(2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("SpecialEffectsController: ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" has called complete.");
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    mIsComplete = true;
    Object localObject = mCompletionListeners.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Runnable)((Iterator)localObject).next()).run();
    }
  }
  
  public final void completeSpecialEffect(@NonNull CancellationSignal paramCancellationSignal)
  {
    if ((mSpecialEffectsSignals.remove(paramCancellationSignal)) && (mSpecialEffectsSignals.isEmpty())) {
      complete();
    }
  }
  
  @NonNull
  public State getFinalState()
  {
    return mFinalState;
  }
  
  @NonNull
  public final Fragment getFragment()
  {
    return mFragment;
  }
  
  @NonNull
  public LifecycleImpact getLifecycleImpact()
  {
    return mLifecycleImpact;
  }
  
  public final boolean isCanceled()
  {
    return mIsCanceled;
  }
  
  public final boolean isComplete()
  {
    return mIsComplete;
  }
  
  public final void markStartedSpecialEffect(@NonNull CancellationSignal paramCancellationSignal)
  {
    onStart();
    mSpecialEffectsSignals.add(paramCancellationSignal);
  }
  
  public final void mergeWith(@NonNull State paramState, @NonNull LifecycleImpact paramLifecycleImpact)
  {
    int i = SpecialEffectsController.3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$LifecycleImpact[paramLifecycleImpact.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if ((i == 3) && (mFinalState != State.REMOVED))
        {
          if (FragmentManager.isLoggingEnabled(2))
          {
            paramLifecycleImpact = z2.t("SpecialEffectsController: For fragment ");
            paramLifecycleImpact.append(mFragment);
            paramLifecycleImpact.append(" mFinalState = ");
            paramLifecycleImpact.append(mFinalState);
            paramLifecycleImpact.append(" -> ");
            paramLifecycleImpact.append(paramState);
            paramLifecycleImpact.append(". ");
            Log.v("FragmentManager", paramLifecycleImpact.toString());
          }
          mFinalState = paramState;
        }
      }
      else
      {
        if (FragmentManager.isLoggingEnabled(2))
        {
          paramState = z2.t("SpecialEffectsController: For fragment ");
          paramState.append(mFragment);
          paramState.append(" mFinalState = ");
          paramState.append(mFinalState);
          paramState.append(" -> REMOVED. mLifecycleImpact  = ");
          paramState.append(mLifecycleImpact);
          paramState.append(" to REMOVING.");
          Log.v("FragmentManager", paramState.toString());
        }
        mFinalState = State.REMOVED;
        mLifecycleImpact = LifecycleImpact.REMOVING;
      }
    }
    else if (mFinalState == State.REMOVED)
    {
      if (FragmentManager.isLoggingEnabled(2))
      {
        paramState = z2.t("SpecialEffectsController: For fragment ");
        paramState.append(mFragment);
        paramState.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
        paramState.append(mLifecycleImpact);
        paramState.append(" to ADDING.");
        Log.v("FragmentManager", paramState.toString());
      }
      mFinalState = State.VISIBLE;
      mLifecycleImpact = LifecycleImpact.ADDING;
    }
  }
  
  public void onStart() {}
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("Operation ", "{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("} ");
    localStringBuilder.append("{");
    localStringBuilder.append("mFinalState = ");
    localStringBuilder.append(mFinalState);
    localStringBuilder.append("} ");
    localStringBuilder.append("{");
    localStringBuilder.append("mLifecycleImpact = ");
    localStringBuilder.append(mLifecycleImpact);
    localStringBuilder.append("} ");
    localStringBuilder.append("{");
    localStringBuilder.append("mFragment = ");
    localStringBuilder.append(mFragment);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static enum LifecycleImpact
  {
    static
    {
      LifecycleImpact localLifecycleImpact1 = new LifecycleImpact("NONE", 0);
      NONE = localLifecycleImpact1;
      LifecycleImpact localLifecycleImpact2 = new LifecycleImpact("ADDING", 1);
      ADDING = localLifecycleImpact2;
      LifecycleImpact localLifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
      REMOVING = localLifecycleImpact3;
      $VALUES = new LifecycleImpact[] { localLifecycleImpact1, localLifecycleImpact2, localLifecycleImpact3 };
    }
    
    private LifecycleImpact() {}
  }
  
  public static enum State
  {
    static
    {
      State localState1 = new State("REMOVED", 0);
      REMOVED = localState1;
      State localState2 = new State("VISIBLE", 1);
      VISIBLE = localState2;
      State localState3 = new State("GONE", 2);
      GONE = localState3;
      State localState4 = new State("INVISIBLE", 3);
      INVISIBLE = localState4;
      $VALUES = new State[] { localState1, localState2, localState3, localState4 };
    }
    
    private State() {}
    
    @NonNull
    public static State from(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 4)
        {
          if (paramInt == 8) {
            return GONE;
          }
          throw new IllegalArgumentException(a.f("Unknown visibility ", paramInt));
        }
        return INVISIBLE;
      }
      return VISIBLE;
    }
    
    @NonNull
    public static State from(@NonNull View paramView)
    {
      if ((paramView.getAlpha() == 0.0F) && (paramView.getVisibility() == 0)) {
        return INVISIBLE;
      }
      return from(paramView.getVisibility());
    }
    
    public void applyState(@NonNull View paramView)
    {
      int i = SpecialEffectsController.3.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[ordinal()];
      StringBuilder localStringBuilder;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4)
            {
              if (FragmentManager.isLoggingEnabled(2))
              {
                localStringBuilder = new StringBuilder();
                localStringBuilder.append("SpecialEffectsController: Setting view ");
                localStringBuilder.append(paramView);
                localStringBuilder.append(" to INVISIBLE");
                Log.v("FragmentManager", localStringBuilder.toString());
              }
              paramView.setVisibility(4);
            }
          }
          else
          {
            if (FragmentManager.isLoggingEnabled(2))
            {
              localStringBuilder = new StringBuilder();
              localStringBuilder.append("SpecialEffectsController: Setting view ");
              localStringBuilder.append(paramView);
              localStringBuilder.append(" to GONE");
              Log.v("FragmentManager", localStringBuilder.toString());
            }
            paramView.setVisibility(8);
          }
        }
        else
        {
          if (FragmentManager.isLoggingEnabled(2))
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("SpecialEffectsController: Setting view ");
            localStringBuilder.append(paramView);
            localStringBuilder.append(" to VISIBLE");
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          paramView.setVisibility(0);
        }
      }
      else
      {
        ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
        if (localViewGroup != null)
        {
          if (FragmentManager.isLoggingEnabled(2))
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("SpecialEffectsController: Removing view ");
            localStringBuilder.append(paramView);
            localStringBuilder.append(" from container ");
            localStringBuilder.append(localViewGroup);
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          localViewGroup.removeView(paramView);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.Operation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */