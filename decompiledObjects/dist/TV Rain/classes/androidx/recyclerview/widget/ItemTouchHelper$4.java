package androidx.recyclerview.widget;

import android.view.View;

class ItemTouchHelper$4
  implements Runnable
{
  public ItemTouchHelper$4(ItemTouchHelper paramItemTouchHelper, ItemTouchHelper.RecoverAnimation paramRecoverAnimation, int paramInt) {}
  
  public void run()
  {
    Object localObject = this$0.mRecyclerView;
    if ((localObject != null) && (((RecyclerView)localObject).isAttachedToWindow()))
    {
      localObject = val$anim;
      if ((!mOverridden) && (mViewHolder.getAbsoluteAdapterPosition() != -1))
      {
        localObject = this$0.mRecyclerView.getItemAnimator();
        if (((localObject == null) || (!((RecyclerView.ItemAnimator)localObject).isRunning(null))) && (!this$0.hasRunningRecoverAnim())) {
          this$0.mCallback.onSwiped(val$anim.mViewHolder, val$swipeDir);
        } else {
          this$0.mRecyclerView.post(this);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */