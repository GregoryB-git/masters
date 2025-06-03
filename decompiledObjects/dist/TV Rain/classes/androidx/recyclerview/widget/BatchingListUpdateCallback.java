package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public class BatchingListUpdateCallback
  implements ListUpdateCallback
{
  private static final int TYPE_ADD = 1;
  private static final int TYPE_CHANGE = 3;
  private static final int TYPE_NONE = 0;
  private static final int TYPE_REMOVE = 2;
  public int mLastEventCount = -1;
  public Object mLastEventPayload = null;
  public int mLastEventPosition = -1;
  public int mLastEventType = 0;
  public final ListUpdateCallback mWrapped;
  
  public BatchingListUpdateCallback(@NonNull ListUpdateCallback paramListUpdateCallback)
  {
    mWrapped = paramListUpdateCallback;
  }
  
  public void dispatchLastEvent()
  {
    int i = mLastEventType;
    if (i == 0) {
      return;
    }
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          mWrapped.onChanged(mLastEventPosition, mLastEventCount, mLastEventPayload);
        }
      }
      else {
        mWrapped.onRemoved(mLastEventPosition, mLastEventCount);
      }
    }
    else {
      mWrapped.onInserted(mLastEventPosition, mLastEventCount);
    }
    mLastEventPayload = null;
    mLastEventType = 0;
  }
  
  public void onChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    if (mLastEventType == 3)
    {
      int i = mLastEventPosition;
      int j = mLastEventCount;
      if (paramInt1 <= i + j)
      {
        int k = paramInt1 + paramInt2;
        if ((k >= i) && (mLastEventPayload == paramObject))
        {
          mLastEventPosition = Math.min(paramInt1, i);
          mLastEventCount = (Math.max(j + i, k) - mLastEventPosition);
          return;
        }
      }
    }
    dispatchLastEvent();
    mLastEventPosition = paramInt1;
    mLastEventCount = paramInt2;
    mLastEventPayload = paramObject;
    mLastEventType = 3;
  }
  
  public void onInserted(int paramInt1, int paramInt2)
  {
    if (mLastEventType == 1)
    {
      int i = mLastEventPosition;
      if (paramInt1 >= i)
      {
        int j = mLastEventCount;
        if (paramInt1 <= i + j)
        {
          mLastEventCount = (j + paramInt2);
          mLastEventPosition = Math.min(paramInt1, i);
          return;
        }
      }
    }
    dispatchLastEvent();
    mLastEventPosition = paramInt1;
    mLastEventCount = paramInt2;
    mLastEventType = 1;
  }
  
  public void onMoved(int paramInt1, int paramInt2)
  {
    dispatchLastEvent();
    mWrapped.onMoved(paramInt1, paramInt2);
  }
  
  public void onRemoved(int paramInt1, int paramInt2)
  {
    if (mLastEventType == 2)
    {
      int i = mLastEventPosition;
      if ((i >= paramInt1) && (i <= paramInt1 + paramInt2))
      {
        mLastEventCount += paramInt2;
        mLastEventPosition = paramInt1;
        return;
      }
    }
    dispatchLastEvent();
    mLastEventPosition = paramInt1;
    mLastEventCount = paramInt2;
    mLastEventType = 2;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.BatchingListUpdateCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */