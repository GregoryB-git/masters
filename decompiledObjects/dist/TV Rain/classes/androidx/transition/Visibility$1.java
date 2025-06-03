package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

class Visibility$1
  extends TransitionListenerAdapter
{
  public Visibility$1(Visibility paramVisibility, ViewGroup paramViewGroup, View paramView1, View paramView2) {}
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    val$startView.setTag(R.id.save_overlay_view, null);
    ViewGroupUtils.getOverlay(val$overlayHost).remove(val$finalOverlayView);
    paramTransition.removeListener(this);
  }
  
  public void onTransitionPause(@NonNull Transition paramTransition)
  {
    ViewGroupUtils.getOverlay(val$overlayHost).remove(val$finalOverlayView);
  }
  
  public void onTransitionResume(@NonNull Transition paramTransition)
  {
    if (val$finalOverlayView.getParent() == null) {
      ViewGroupUtils.getOverlay(val$overlayHost).add(val$finalOverlayView);
    } else {
      this$0.cancel();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Visibility.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */