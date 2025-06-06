package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

public abstract class AsyncListUtil$DataCallback<T>
{
  @WorkerThread
  public abstract void fillData(@NonNull T[] paramArrayOfT, int paramInt1, int paramInt2);
  
  @WorkerThread
  public int getMaxCachedTiles()
  {
    return 10;
  }
  
  @WorkerThread
  public void recycleData(@NonNull T[] paramArrayOfT, int paramInt) {}
  
  @WorkerThread
  public abstract int refreshData();
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListUtil.DataCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */