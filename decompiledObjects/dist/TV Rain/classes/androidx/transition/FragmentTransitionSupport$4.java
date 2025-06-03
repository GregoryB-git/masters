package androidx.transition;

import android.graphics.Rect;
import androidx.annotation.NonNull;

class FragmentTransitionSupport$4
  extends Transition.EpicenterCallback
{
  public FragmentTransitionSupport$4(FragmentTransitionSupport paramFragmentTransitionSupport, Rect paramRect) {}
  
  public Rect onGetEpicenter(@NonNull Transition paramTransition)
  {
    paramTransition = val$epicenter;
    if ((paramTransition != null) && (!paramTransition.isEmpty())) {
      return val$epicenter;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.FragmentTransitionSupport.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */