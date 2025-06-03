package androidx.fragment.app;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal;

class DefaultSpecialEffectsController$AnimationInfo
  extends DefaultSpecialEffectsController.SpecialEffectsInfo
{
  @Nullable
  private FragmentAnim.AnimationOrAnimator mAnimation;
  private boolean mIsPop;
  private boolean mLoadedAnim = false;
  
  public DefaultSpecialEffectsController$AnimationInfo(@NonNull SpecialEffectsController.Operation paramOperation, @NonNull CancellationSignal paramCancellationSignal, boolean paramBoolean)
  {
    super(paramOperation, paramCancellationSignal);
    mIsPop = paramBoolean;
  }
  
  @Nullable
  public FragmentAnim.AnimationOrAnimator getAnimation(@NonNull Context paramContext)
  {
    if (mLoadedAnim) {
      return mAnimation;
    }
    Fragment localFragment = getOperation().getFragment();
    boolean bool;
    if (getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
      bool = true;
    } else {
      bool = false;
    }
    paramContext = FragmentAnim.loadAnimation(paramContext, localFragment, bool, mIsPop);
    mAnimation = paramContext;
    mLoadedAnim = true;
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */