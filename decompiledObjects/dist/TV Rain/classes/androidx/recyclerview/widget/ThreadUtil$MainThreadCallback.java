package androidx.recyclerview.widget;

public abstract interface ThreadUtil$MainThreadCallback<T>
{
  public abstract void addTile(int paramInt, TileList.Tile<T> paramTile);
  
  public abstract void removeTile(int paramInt1, int paramInt2);
  
  public abstract void updateItemCount(int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */