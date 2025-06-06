package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;

public abstract interface ItemTouchUIUtil
{
  public abstract void clearView(View paramView);
  
  public abstract void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean);
  
  public abstract void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, View paramView, float paramFloat1, float paramFloat2, int paramInt, boolean paramBoolean);
  
  public abstract void onSelected(View paramView);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchUIUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */