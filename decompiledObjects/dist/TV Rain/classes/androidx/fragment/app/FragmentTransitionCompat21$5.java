package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

class FragmentTransitionCompat21$5
  extends Transition.EpicenterCallback
{
  public FragmentTransitionCompat21$5(FragmentTransitionCompat21 paramFragmentTransitionCompat21, Rect paramRect) {}
  
  public Rect onGetEpicenter(Transition paramTransition)
  {
    paramTransition = val$epicenter;
    if ((paramTransition != null) && (!paramTransition.isEmpty())) {
      return val$epicenter;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */