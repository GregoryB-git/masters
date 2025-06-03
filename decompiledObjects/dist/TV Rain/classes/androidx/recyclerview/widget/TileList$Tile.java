package androidx.recyclerview.widget;

import java.lang.reflect.Array;

public class TileList$Tile<T>
{
  public int mItemCount;
  public final T[] mItems;
  public Tile<T> mNext;
  public int mStartPosition;
  
  public TileList$Tile(Class<T> paramClass, int paramInt)
  {
    mItems = ((Object[])Array.newInstance(paramClass, paramInt));
  }
  
  public boolean containsPosition(int paramInt)
  {
    int i = mStartPosition;
    boolean bool;
    if ((i <= paramInt) && (paramInt < i + mItemCount)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public T getByPosition(int paramInt)
  {
    return (T)mItems[(paramInt - mStartPosition)];
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.TileList.Tile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */