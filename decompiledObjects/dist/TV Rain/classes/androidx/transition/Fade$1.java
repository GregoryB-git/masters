package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;

class Fade$1
  extends TransitionListenerAdapter
{
  public Fade$1(Fade paramFade, View paramView) {}
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    ViewUtils.setTransitionAlpha(val$view, 1.0F);
    ViewUtils.clearNonTransitionAlpha(val$view);
    paramTransition.removeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Fade.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */