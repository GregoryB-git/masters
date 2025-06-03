package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

class FragmentTransitionCompat21$1
  extends Transition.EpicenterCallback
{
  public FragmentTransitionCompat21$1(FragmentTransitionCompat21 paramFragmentTransitionCompat21, Rect paramRect) {}
  
  public Rect onGetEpicenter(Transition paramTransition)
  {
    return val$epicenter;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */