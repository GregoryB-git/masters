package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal;
import z2;

class DefaultSpecialEffectsController$TransitionInfo
  extends DefaultSpecialEffectsController.SpecialEffectsInfo
{
  private final boolean mOverlapAllowed;
  @Nullable
  private final Object mSharedElementTransition;
  @Nullable
  private final Object mTransition;
  
  public DefaultSpecialEffectsController$TransitionInfo(@NonNull SpecialEffectsController.Operation paramOperation, @NonNull CancellationSignal paramCancellationSignal, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramOperation, paramCancellationSignal);
    if (paramOperation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE)
    {
      if (paramBoolean1) {
        paramCancellationSignal = paramOperation.getFragment().getReenterTransition();
      } else {
        paramCancellationSignal = paramOperation.getFragment().getEnterTransition();
      }
      mTransition = paramCancellationSignal;
      boolean bool;
      if (paramBoolean1) {
        bool = paramOperation.getFragment().getAllowReturnTransitionOverlap();
      } else {
        bool = paramOperation.getFragment().getAllowEnterTransitionOverlap();
      }
      mOverlapAllowed = bool;
    }
    else
    {
      if (paramBoolean1) {
        paramCancellationSignal = paramOperation.getFragment().getReturnTransition();
      } else {
        paramCancellationSignal = paramOperation.getFragment().getExitTransition();
      }
      mTransition = paramCancellationSignal;
      mOverlapAllowed = true;
    }
    if (paramBoolean2)
    {
      if (paramBoolean1) {
        mSharedElementTransition = paramOperation.getFragment().getSharedElementReturnTransition();
      } else {
        mSharedElementTransition = paramOperation.getFragment().getSharedElementEnterTransition();
      }
    }
    else {
      mSharedElementTransition = null;
    }
  }
  
  @Nullable
  private FragmentTransitionImpl getHandlingImpl(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    Object localObject = FragmentTransition.PLATFORM_IMPL;
    if ((localObject != null) && (((FragmentTransitionImpl)localObject).canHandle(paramObject))) {
      return (FragmentTransitionImpl)localObject;
    }
    localObject = FragmentTransition.SUPPORT_IMPL;
    if ((localObject != null) && (((FragmentTransitionImpl)localObject).canHandle(paramObject))) {
      return (FragmentTransitionImpl)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Transition ");
    ((StringBuilder)localObject).append(paramObject);
    ((StringBuilder)localObject).append(" for fragment ");
    ((StringBuilder)localObject).append(getOperation().getFragment());
    ((StringBuilder)localObject).append(" is not a valid framework Transition or AndroidX Transition");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  @Nullable
  public FragmentTransitionImpl getHandlingImpl()
  {
    FragmentTransitionImpl localFragmentTransitionImpl = getHandlingImpl(mTransition);
    Object localObject = getHandlingImpl(mSharedElementTransition);
    if ((localFragmentTransitionImpl != null) && (localObject != null) && (localFragmentTransitionImpl != localObject))
    {
      localObject = z2.t("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
      ((StringBuilder)localObject).append(getOperation().getFragment());
      ((StringBuilder)localObject).append(" returned Transition ");
      ((StringBuilder)localObject).append(mTransition);
      ((StringBuilder)localObject).append(" which uses a different Transition  type than its shared element transition ");
      ((StringBuilder)localObject).append(mSharedElementTransition);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    if (localFragmentTransitionImpl != null) {
      localObject = localFragmentTransitionImpl;
    }
    return (FragmentTransitionImpl)localObject;
  }
  
  @Nullable
  public Object getSharedElementTransition()
  {
    return mSharedElementTransition;
  }
  
  @Nullable
  public Object getTransition()
  {
    return mTransition;
  }
  
  public boolean hasSharedElementTransition()
  {
    boolean bool;
    if (mSharedElementTransition != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isOverlapAllowed()
  {
    return mOverlapAllowed;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */