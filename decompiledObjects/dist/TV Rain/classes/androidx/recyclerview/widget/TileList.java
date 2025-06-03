package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

class TileList<T>
{
  public Tile<T> mLastAccessedTile;
  public final int mTileSize;
  private final SparseArray<Tile<T>> mTiles = new SparseArray(10);
  
  public TileList(int paramInt)
  {
    mTileSize = paramInt;
  }
  
  public Tile<T> addOrReplace(Tile<T> paramTile)
  {
    int i = mTiles.indexOfKey(mStartPosition);
    if (i < 0)
    {
      mTiles.put(mStartPosition, paramTile);
      return null;
    }
    Tile localTile = (Tile)mTiles.valueAt(i);
    mTiles.setValueAt(i, paramTile);
    if (mLastAccessedTile == localTile) {
      mLastAccessedTile = paramTile;
    }
    return localTile;
  }
  
  public void clear()
  {
    mTiles.clear();
  }
  
  public Tile<T> getAtIndex(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < mTiles.size())) {
      return (Tile)mTiles.valueAt(paramInt);
    }
    return null;
  }
  
  public T getItemAt(int paramInt)
  {
    Tile localTile = mLastAccessedTile;
    if ((localTile == null) || (!localTile.containsPosition(paramInt)))
    {
      int i = mTileSize;
      i = mTiles.indexOfKey(paramInt - paramInt % i);
      if (i < 0) {
        return null;
      }
      mLastAccessedTile = ((Tile)mTiles.valueAt(i));
    }
    return (T)mLastAccessedTile.getByPosition(paramInt);
  }
  
  public Tile<T> removeAtPos(int paramInt)
  {
    Tile localTile = (Tile)mTiles.get(paramInt);
    if (mLastAccessedTile == localTile) {
      mLastAccessedTile = null;
    }
    mTiles.delete(paramInt);
    return localTile;
  }
  
  public int size()
  {
    return mTiles.size();
  }
  
  public static class Tile<T>
  {
    public int mItemCount;
    public final T[] mItems;
    public Tile<T> mNext;
    public int mStartPosition;
    
    public Tile(Class<T> paramClass, int paramInt)
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
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.TileList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */