package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

public class SortedList$BatchedCallback<T2>
  extends SortedList.Callback<T2>
{
  private final BatchingListUpdateCallback mBatchingListUpdateCallback;
  public final SortedList.Callback<T2> mWrappedCallback;
  
  public SortedList$BatchedCallback(SortedList.Callback<T2> paramCallback)
  {
    mWrappedCallback = paramCallback;
    mBatchingListUpdateCallback = new BatchingListUpdateCallback(paramCallback);
  }
  
  public boolean areContentsTheSame(T2 paramT21, T2 paramT22)
  {
    return mWrappedCallback.areContentsTheSame(paramT21, paramT22);
  }
  
  public boolean areItemsTheSame(T2 paramT21, T2 paramT22)
  {
    return mWrappedCallback.areItemsTheSame(paramT21, paramT22);
  }
  
  public int compare(T2 paramT21, T2 paramT22)
  {
    return mWrappedCallback.compare(paramT21, paramT22);
  }
  
  public void dispatchLastEvent()
  {
    mBatchingListUpdateCallback.dispatchLastEvent();
  }
  
  @Nullable
  public Object getChangePayload(T2 paramT21, T2 paramT22)
  {
    return mWrappedCallback.getChangePayload(paramT21, paramT22);
  }
  
  public void onChanged(int paramInt1, int paramInt2)
  {
    mBatchingListUpdateCallback.onChanged(paramInt1, paramInt2, null);
  }
  
  public void onChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    mBatchingListUpdateCallback.onChanged(paramInt1, paramInt2, paramObject);
  }
  
  public void onInserted(int paramInt1, int paramInt2)
  {
    mBatchingListUpdateCallback.onInserted(paramInt1, paramInt2);
  }
  
  public void onMoved(int paramInt1, int paramInt2)
  {
    mBatchingListUpdateCallback.onMoved(paramInt1, paramInt2);
  }
  
  public void onRemoved(int paramInt1, int paramInt2)
  {
    mBatchingListUpdateCallback.onRemoved(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.SortedList.BatchedCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */