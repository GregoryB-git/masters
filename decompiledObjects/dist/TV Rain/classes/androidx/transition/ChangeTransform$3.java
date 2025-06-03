package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;

class ChangeTransform$3
  extends AnimatorListenerAdapter
{
  private boolean mIsCanceled;
  private Matrix mTempMatrix = new Matrix();
  
  public ChangeTransform$3(ChangeTransform paramChangeTransform, boolean paramBoolean, Matrix paramMatrix, View paramView, ChangeTransform.Transforms paramTransforms, ChangeTransform.PathAnimatorMatrix paramPathAnimatorMatrix) {}
  
  private void setCurrentMatrix(Matrix paramMatrix)
  {
    mTempMatrix.set(paramMatrix);
    val$view.setTag(R.id.transition_transform, mTempMatrix);
    val$transforms.restore(val$view);
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    mIsCanceled = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!mIsCanceled) {
      if ((val$handleParentChange) && (this$0.mUseOverlay))
      {
        setCurrentMatrix(val$finalEndMatrix);
      }
      else
      {
        val$view.setTag(R.id.transition_transform, null);
        val$view.setTag(R.id.parent_matrix, null);
      }
    }
    ViewUtils.setAnimationMatrix(val$view, null);
    val$transforms.restore(val$view);
  }
  
  public void onAnimationPause(Animator paramAnimator)
  {
    setCurrentMatrix(val$pathAnimatorMatrix.getMatrix());
  }
  
  public void onAnimationResume(Animator paramAnimator)
  {
    ChangeTransform.setIdentityTransforms(val$view);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeTransform.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */