package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;

class ChangeTransform$GhostListener
  extends TransitionListenerAdapter
{
  private GhostView mGhostView;
  private View mView;
  
  public ChangeTransform$GhostListener(View paramView, GhostView paramGhostView)
  {
    mView = paramView;
    mGhostView = paramGhostView;
  }
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    paramTransition.removeListener(this);
    GhostViewUtils.removeGhost(mView);
    mView.setTag(R.id.transition_transform, null);
    mView.setTag(R.id.parent_matrix, null);
  }
  
  public void onTransitionPause(@NonNull Transition paramTransition)
  {
    mGhostView.setVisibility(4);
  }
  
  public void onTransitionResume(@NonNull Transition paramTransition)
  {
    mGhostView.setVisibility(0);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeTransform.GhostListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */