package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public abstract class ItemTouchHelper$SimpleCallback
  extends ItemTouchHelper.Callback
{
  private int mDefaultDragDirs;
  private int mDefaultSwipeDirs;
  
  public ItemTouchHelper$SimpleCallback(int paramInt1, int paramInt2)
  {
    mDefaultSwipeDirs = paramInt2;
    mDefaultDragDirs = paramInt1;
  }
  
  public int getDragDirs(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    return mDefaultDragDirs;
  }
  
  public int getMovementFlags(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    return ItemTouchHelper.Callback.makeMovementFlags(getDragDirs(paramRecyclerView, paramViewHolder), getSwipeDirs(paramRecyclerView, paramViewHolder));
  }
  
  public int getSwipeDirs(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.ViewHolder paramViewHolder)
  {
    return mDefaultSwipeDirs;
  }
  
  public void setDefaultDragDirs(int paramInt)
  {
    mDefaultDragDirs = paramInt;
  }
  
  public void setDefaultSwipeDirs(int paramInt)
  {
    mDefaultSwipeDirs = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */