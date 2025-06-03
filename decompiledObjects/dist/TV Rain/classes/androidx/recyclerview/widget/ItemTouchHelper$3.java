package androidx.recyclerview.widget;

import android.animation.Animator;
import android.view.View;
import java.util.List;

class ItemTouchHelper$3
  extends ItemTouchHelper.RecoverAnimation
{
  public ItemTouchHelper$3(ItemTouchHelper paramItemTouchHelper, RecyclerView.ViewHolder paramViewHolder1, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt3, RecyclerView.ViewHolder paramViewHolder2)
  {
    super(paramViewHolder1, paramInt1, paramInt2, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
    if (mOverridden) {
      return;
    }
    if (val$swipeDir <= 0)
    {
      paramAnimator = this$0;
      mCallback.clearView(mRecyclerView, val$prevSelected);
    }
    else
    {
      this$0.mPendingCleanup.add(val$prevSelected.itemView);
      mIsPendingCleanup = true;
      int i = val$swipeDir;
      if (i > 0) {
        this$0.postDispatchSwipe(this, i);
      }
    }
    paramAnimator = this$0;
    View localView1 = mOverdrawChild;
    View localView2 = val$prevSelected.itemView;
    if (localView1 == localView2) {
      paramAnimator.removeChildDrawingOrderCallbackIfNecessary(localView2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */