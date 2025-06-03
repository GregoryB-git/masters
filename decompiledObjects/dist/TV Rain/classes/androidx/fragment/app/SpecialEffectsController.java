package androidx.fragment.app;

import a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal;
import androidx.core.os.CancellationSignal.OnCancelListener;
import androidx.core.view.ViewCompat;
import androidx.fragment.R.id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import z2;

abstract class SpecialEffectsController
{
  private final ViewGroup mContainer;
  public boolean mIsContainerPostponed = false;
  public boolean mOperationDirectionIsPop = false;
  public final ArrayList<Operation> mPendingOperations = new ArrayList();
  public final ArrayList<Operation> mRunningOperations = new ArrayList();
  
  public SpecialEffectsController(@NonNull ViewGroup paramViewGroup)
  {
    mContainer = paramViewGroup;
  }
  
  private void enqueue(@NonNull SpecialEffectsController.Operation.State paramState, @NonNull SpecialEffectsController.Operation.LifecycleImpact paramLifecycleImpact, @NonNull FragmentStateManager paramFragmentStateManager)
  {
    synchronized (mPendingOperations)
    {
      CancellationSignal localCancellationSignal = new androidx/core/os/CancellationSignal;
      localCancellationSignal.<init>();
      Object localObject = findPendingOperation(paramFragmentStateManager.getFragment());
      if (localObject != null)
      {
        ((Operation)localObject).mergeWith(paramState, paramLifecycleImpact);
        return;
      }
      localObject = new androidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;
      ((FragmentStateManagerOperation)localObject).<init>(paramState, paramLifecycleImpact, paramFragmentStateManager, localCancellationSignal);
      mPendingOperations.add(localObject);
      paramState = new androidx/fragment/app/SpecialEffectsController$1;
      paramState.<init>(this, (FragmentStateManagerOperation)localObject);
      ((Operation)localObject).addCompletionListener(paramState);
      paramState = new androidx/fragment/app/SpecialEffectsController$2;
      paramState.<init>(this, (FragmentStateManagerOperation)localObject);
      ((Operation)localObject).addCompletionListener(paramState);
      return;
    }
  }
  
  @Nullable
  private Operation findPendingOperation(@NonNull Fragment paramFragment)
  {
    Iterator localIterator = mPendingOperations.iterator();
    while (localIterator.hasNext())
    {
      Operation localOperation = (Operation)localIterator.next();
      if ((localOperation.getFragment().equals(paramFragment)) && (!localOperation.isCanceled())) {
        return localOperation;
      }
    }
    return null;
  }
  
  @Nullable
  private Operation findRunningOperation(@NonNull Fragment paramFragment)
  {
    Iterator localIterator = mRunningOperations.iterator();
    while (localIterator.hasNext())
    {
      Operation localOperation = (Operation)localIterator.next();
      if ((localOperation.getFragment().equals(paramFragment)) && (!localOperation.isCanceled())) {
        return localOperation;
      }
    }
    return null;
  }
  
  @NonNull
  public static SpecialEffectsController getOrCreateController(@NonNull ViewGroup paramViewGroup, @NonNull FragmentManager paramFragmentManager)
  {
    return getOrCreateController(paramViewGroup, paramFragmentManager.getSpecialEffectsControllerFactory());
  }
  
  @NonNull
  public static SpecialEffectsController getOrCreateController(@NonNull ViewGroup paramViewGroup, @NonNull SpecialEffectsControllerFactory paramSpecialEffectsControllerFactory)
  {
    int i = R.id.special_effects_controller_view_tag;
    Object localObject = paramViewGroup.getTag(i);
    if ((localObject instanceof SpecialEffectsController)) {
      return (SpecialEffectsController)localObject;
    }
    paramSpecialEffectsControllerFactory = paramSpecialEffectsControllerFactory.createController(paramViewGroup);
    paramViewGroup.setTag(i, paramSpecialEffectsControllerFactory);
    return paramSpecialEffectsControllerFactory;
  }
  
  private void updateFinalState()
  {
    Iterator localIterator = mPendingOperations.iterator();
    while (localIterator.hasNext())
    {
      Operation localOperation = (Operation)localIterator.next();
      if (localOperation.getLifecycleImpact() == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
        localOperation.mergeWith(SpecialEffectsController.Operation.State.from(localOperation.getFragment().requireView().getVisibility()), SpecialEffectsController.Operation.LifecycleImpact.NONE);
      }
    }
  }
  
  public void enqueueAdd(@NonNull SpecialEffectsController.Operation.State paramState, @NonNull FragmentStateManager paramFragmentStateManager)
  {
    if (FragmentManager.isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = z2.t("SpecialEffectsController: Enqueuing add operation for fragment ");
      localStringBuilder.append(paramFragmentStateManager.getFragment());
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    enqueue(paramState, SpecialEffectsController.Operation.LifecycleImpact.ADDING, paramFragmentStateManager);
  }
  
  public void enqueueHide(@NonNull FragmentStateManager paramFragmentStateManager)
  {
    if (FragmentManager.isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = z2.t("SpecialEffectsController: Enqueuing hide operation for fragment ");
      localStringBuilder.append(paramFragmentStateManager.getFragment());
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    enqueue(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, paramFragmentStateManager);
  }
  
  public void enqueueRemove(@NonNull FragmentStateManager paramFragmentStateManager)
  {
    if (FragmentManager.isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = z2.t("SpecialEffectsController: Enqueuing remove operation for fragment ");
      localStringBuilder.append(paramFragmentStateManager.getFragment());
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    enqueue(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, paramFragmentStateManager);
  }
  
  public void enqueueShow(@NonNull FragmentStateManager paramFragmentStateManager)
  {
    if (FragmentManager.isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = z2.t("SpecialEffectsController: Enqueuing show operation for fragment ");
      localStringBuilder.append(paramFragmentStateManager.getFragment());
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    enqueue(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, paramFragmentStateManager);
  }
  
  public abstract void executeOperations(@NonNull List<Operation> paramList, boolean paramBoolean);
  
  public void executePendingOperations()
  {
    if (mIsContainerPostponed) {
      return;
    }
    if (!ViewCompat.isAttachedToWindow(mContainer))
    {
      forceCompleteAllOperations();
      mOperationDirectionIsPop = false;
      return;
    }
    synchronized (mPendingOperations)
    {
      if (!mPendingOperations.isEmpty())
      {
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(mRunningOperations);
        mRunningOperations.clear();
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (Operation)localIterator.next();
          if (FragmentManager.isLoggingEnabled(2))
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("SpecialEffectsController: Cancelling operation ");
            localStringBuilder.append(localObject1);
            Log.v("FragmentManager", localStringBuilder.toString());
          }
          ((Operation)localObject1).cancel();
          if (!((Operation)localObject1).isComplete()) {
            mRunningOperations.add(localObject1);
          }
        }
        updateFinalState();
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>(mPendingOperations);
        mPendingOperations.clear();
        mRunningOperations.addAll((Collection)localObject1);
        localIterator = ((ArrayList)localObject1).iterator();
        while (localIterator.hasNext()) {
          ((Operation)localIterator.next()).onStart();
        }
        executeOperations((List)localObject1, mOperationDirectionIsPop);
        mOperationDirectionIsPop = false;
      }
      return;
    }
  }
  
  public void forceCompleteAllOperations()
  {
    boolean bool = ViewCompat.isAttachedToWindow(mContainer);
    synchronized (mPendingOperations)
    {
      updateFinalState();
      Object localObject1 = mPendingOperations.iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((Operation)((Iterator)localObject1).next()).onStart();
      }
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(mRunningOperations);
      Object localObject3 = ((ArrayList)localObject1).iterator();
      Object localObject4;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (Operation)((Iterator)localObject3).next();
        if (FragmentManager.isLoggingEnabled(2))
        {
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          ((StringBuilder)localObject5).append("SpecialEffectsController: ");
          if (bool)
          {
            localObject1 = "";
          }
          else
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append("Container ");
            ((StringBuilder)localObject1).append(mContainer);
            ((StringBuilder)localObject1).append(" is not attached to window. ");
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("Cancelling running operation ");
          ((StringBuilder)localObject5).append(localObject4);
          Log.v("FragmentManager", ((StringBuilder)localObject5).toString());
        }
        ((Operation)localObject4).cancel();
      }
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(mPendingOperations);
      Object localObject5 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject3 = (Operation)((Iterator)localObject5).next();
        if (FragmentManager.isLoggingEnabled(2))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append("SpecialEffectsController: ");
          if (bool)
          {
            localObject1 = "";
          }
          else
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append("Container ");
            ((StringBuilder)localObject1).append(mContainer);
            ((StringBuilder)localObject1).append(" is not attached to window. ");
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          ((StringBuilder)localObject4).append((String)localObject1);
          ((StringBuilder)localObject4).append("Cancelling pending operation ");
          ((StringBuilder)localObject4).append(localObject3);
          Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
        }
        ((Operation)localObject3).cancel();
      }
      return;
    }
  }
  
  public void forcePostponedExecutePendingOperations()
  {
    if (mIsContainerPostponed)
    {
      mIsContainerPostponed = false;
      executePendingOperations();
    }
  }
  
  @Nullable
  public SpecialEffectsController.Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@NonNull FragmentStateManager paramFragmentStateManager)
  {
    Object localObject = findPendingOperation(paramFragmentStateManager.getFragment());
    if (localObject != null) {
      localObject = ((Operation)localObject).getLifecycleImpact();
    } else {
      localObject = null;
    }
    paramFragmentStateManager = findRunningOperation(paramFragmentStateManager.getFragment());
    if ((paramFragmentStateManager != null) && ((localObject == null) || (localObject == SpecialEffectsController.Operation.LifecycleImpact.NONE))) {
      return paramFragmentStateManager.getLifecycleImpact();
    }
    return (SpecialEffectsController.Operation.LifecycleImpact)localObject;
  }
  
  @NonNull
  public ViewGroup getContainer()
  {
    return mContainer;
  }
  
  public void markPostponedState()
  {
    synchronized (mPendingOperations)
    {
      updateFinalState();
      mIsContainerPostponed = false;
      for (int i = mPendingOperations.size() - 1; i >= 0; i--)
      {
        Operation localOperation = (Operation)mPendingOperations.get(i);
        SpecialEffectsController.Operation.State localState1 = SpecialEffectsController.Operation.State.from(getFragmentmView);
        SpecialEffectsController.Operation.State localState2 = localOperation.getFinalState();
        SpecialEffectsController.Operation.State localState3 = SpecialEffectsController.Operation.State.VISIBLE;
        if ((localState2 == localState3) && (localState1 != localState3))
        {
          mIsContainerPostponed = localOperation.getFragment().isPostponed();
          break;
        }
      }
      return;
    }
  }
  
  public void updateOperationDirection(boolean paramBoolean)
  {
    mOperationDirectionIsPop = paramBoolean;
  }
  
  public static class FragmentStateManagerOperation
    extends SpecialEffectsController.Operation
  {
    @NonNull
    private final FragmentStateManager mFragmentStateManager;
    
    public FragmentStateManagerOperation(@NonNull SpecialEffectsController.Operation.State paramState, @NonNull SpecialEffectsController.Operation.LifecycleImpact paramLifecycleImpact, @NonNull FragmentStateManager paramFragmentStateManager, @NonNull CancellationSignal paramCancellationSignal)
    {
      super(paramLifecycleImpact, paramFragmentStateManager.getFragment(), paramCancellationSignal);
      mFragmentStateManager = paramFragmentStateManager;
    }
    
    public void complete()
    {
      super.complete();
      mFragmentStateManager.moveToExpectedState();
    }
    
    public void onStart()
    {
      if (getLifecycleImpact() == SpecialEffectsController.Operation.LifecycleImpact.ADDING)
      {
        Fragment localFragment = mFragmentStateManager.getFragment();
        View localView = mView.findFocus();
        if (localView != null)
        {
          localFragment.setFocusedView(localView);
          if (FragmentManager.isLoggingEnabled(2))
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("requestFocus: Saved focused view ");
            ((StringBuilder)localObject).append(localView);
            ((StringBuilder)localObject).append(" for Fragment ");
            ((StringBuilder)localObject).append(localFragment);
            Log.v("FragmentManager", ((StringBuilder)localObject).toString());
          }
        }
        Object localObject = getFragment().requireView();
        if (((View)localObject).getParent() == null)
        {
          mFragmentStateManager.addViewToContainer();
          ((View)localObject).setAlpha(0.0F);
        }
        if ((((View)localObject).getAlpha() == 0.0F) && (((View)localObject).getVisibility() == 0)) {
          ((View)localObject).setVisibility(4);
        }
        ((View)localObject).setAlpha(localFragment.getPostOnViewCreatedAlpha());
      }
    }
  }
  
  public static class Operation
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
    
    public Operation(@NonNull State paramState, @NonNull LifecycleImpact paramLifecycleImpact, @NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal)
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
}

/* Location:
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */