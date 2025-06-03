package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import z2;

class RecyclerView$5
  implements ChildHelper.Callback
{
  public RecyclerView$5(RecyclerView paramRecyclerView) {}
  
  public void addView(View paramView, int paramInt)
  {
    this$0.addView(paramView, paramInt);
    this$0.dispatchChildAttached(paramView);
  }
  
  public void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if (localViewHolder != null)
    {
      if ((!localViewHolder.isTmpDetached()) && (!localViewHolder.shouldIgnore()))
      {
        paramView = new StringBuilder();
        paramView.append("Called attach on a child which is not detached: ");
        paramView.append(localViewHolder);
        throw new IllegalArgumentException(z2.m(this$0, paramView));
      }
      localViewHolder.clearTmpDetachFlag();
    }
    RecyclerView.access$000(this$0, paramView, paramInt, paramLayoutParams);
  }
  
  public void detachViewFromParent(int paramInt)
  {
    Object localObject = getChildAt(paramInt);
    if (localObject != null)
    {
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt((View)localObject);
      if (localViewHolder != null)
      {
        if ((localViewHolder.isTmpDetached()) && (!localViewHolder.shouldIgnore()))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("called detach on an already detached child ");
          ((StringBuilder)localObject).append(localViewHolder);
          throw new IllegalArgumentException(z2.m(this$0, (StringBuilder)localObject));
        }
        localViewHolder.addFlags(256);
      }
    }
    RecyclerView.access$100(this$0, paramInt);
  }
  
  public View getChildAt(int paramInt)
  {
    return this$0.getChildAt(paramInt);
  }
  
  public int getChildCount()
  {
    return this$0.getChildCount();
  }
  
  public RecyclerView.ViewHolder getChildViewHolder(View paramView)
  {
    return RecyclerView.getChildViewHolderInt(paramView);
  }
  
  public int indexOfChild(View paramView)
  {
    return this$0.indexOfChild(paramView);
  }
  
  public void onEnteredHiddenState(View paramView)
  {
    paramView = RecyclerView.getChildViewHolderInt(paramView);
    if (paramView != null) {
      paramView.onEnteredHiddenState(this$0);
    }
  }
  
  public void onLeftHiddenState(View paramView)
  {
    paramView = RecyclerView.getChildViewHolderInt(paramView);
    if (paramView != null) {
      paramView.onLeftHiddenState(this$0);
    }
  }
  
  public void removeAllViews()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      this$0.dispatchChildDetached(localView);
      localView.clearAnimation();
    }
    this$0.removeAllViews();
  }
  
  public void removeViewAt(int paramInt)
  {
    View localView = this$0.getChildAt(paramInt);
    if (localView != null)
    {
      this$0.dispatchChildDetached(localView);
      localView.clearAnimation();
    }
    this$0.removeViewAt(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */