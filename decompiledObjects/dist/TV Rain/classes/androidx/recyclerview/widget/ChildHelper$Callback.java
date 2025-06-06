package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

abstract interface ChildHelper$Callback
{
  public abstract void addView(View paramView, int paramInt);
  
  public abstract void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void detachViewFromParent(int paramInt);
  
  public abstract View getChildAt(int paramInt);
  
  public abstract int getChildCount();
  
  public abstract RecyclerView.ViewHolder getChildViewHolder(View paramView);
  
  public abstract int indexOfChild(View paramView);
  
  public abstract void onEnteredHiddenState(View paramView);
  
  public abstract void onLeftHiddenState(View paramView);
  
  public abstract void removeAllViews();
  
  public abstract void removeViewAt(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ChildHelper.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */