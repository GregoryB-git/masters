package androidx.recyclerview.widget;

import java.util.List;

class OpReorderer
{
  public final Callback mCallback;
  
  public OpReorderer(Callback paramCallback)
  {
    mCallback = paramCallback;
  }
  
  private int getLastMoveOutOfOrder(List<AdapterHelper.UpdateOp> paramList)
  {
    int i = paramList.size() - 1;
    int k;
    for (int j = 0; i >= 0; j = k)
    {
      if (getcmd == 8)
      {
        k = j;
        if (j != 0) {
          return i;
        }
      }
      else
      {
        k = 1;
      }
      i--;
    }
    return -1;
  }
  
  private void swapMoveAdd(List<AdapterHelper.UpdateOp> paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = itemCount;
    int j = positionStart;
    if (i < j) {
      k = -1;
    } else {
      k = 0;
    }
    int m = positionStart;
    int n = k;
    if (m < j) {
      n = k + 1;
    }
    if (j <= m) {
      positionStart = (m + itemCount);
    }
    int k = positionStart;
    if (k <= i) {
      itemCount = (i + itemCount);
    }
    positionStart = (k + n);
    paramList.set(paramInt1, paramUpdateOp2);
    paramList.set(paramInt2, paramUpdateOp1);
  }
  
  private void swapMoveOp(List<AdapterHelper.UpdateOp> paramList, int paramInt1, int paramInt2)
  {
    AdapterHelper.UpdateOp localUpdateOp1 = (AdapterHelper.UpdateOp)paramList.get(paramInt1);
    AdapterHelper.UpdateOp localUpdateOp2 = (AdapterHelper.UpdateOp)paramList.get(paramInt2);
    int i = cmd;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 4) {
          swapMoveUpdate(paramList, paramInt1, localUpdateOp1, paramInt2, localUpdateOp2);
        }
      }
      else {
        swapMoveRemove(paramList, paramInt1, localUpdateOp1, paramInt2, localUpdateOp2);
      }
    }
    else {
      swapMoveAdd(paramList, paramInt1, localUpdateOp1, paramInt2, localUpdateOp2);
    }
  }
  
  public void reorderOps(List<AdapterHelper.UpdateOp> paramList)
  {
    for (;;)
    {
      int i = getLastMoveOutOfOrder(paramList);
      if (i == -1) {
        break;
      }
      swapMoveOp(paramList, i, i + 1);
    }
  }
  
  public void swapMoveRemove(List<AdapterHelper.UpdateOp> paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = positionStart;
    int j = itemCount;
    int k = 0;
    if (i < j)
    {
      if ((positionStart == i) && (itemCount == j - i))
      {
        i = 0;
        k = 1;
      }
      else
      {
        i = 0;
      }
    }
    else if ((positionStart == j + 1) && (itemCount == i - j))
    {
      i = 1;
      k = i;
    }
    else
    {
      i = 1;
    }
    int m = positionStart;
    int n;
    if (j < m)
    {
      positionStart = (m - 1);
    }
    else
    {
      n = itemCount;
      if (j < m + n)
      {
        itemCount = (n - 1);
        cmd = 2;
        itemCount = 1;
        if (itemCount == 0)
        {
          paramList.remove(paramInt2);
          mCallback.recycleUpdateOp(paramUpdateOp2);
        }
        return;
      }
    }
    j = positionStart;
    m = positionStart;
    AdapterHelper.UpdateOp localUpdateOp = null;
    if (j <= m)
    {
      positionStart = (m + 1);
    }
    else
    {
      n = itemCount;
      if (j < m + n)
      {
        localUpdateOp = mCallback.obtainUpdateOp(2, j + 1, m + n - j, null);
        itemCount = (positionStart - positionStart);
      }
    }
    if (k != 0)
    {
      paramList.set(paramInt1, paramUpdateOp2);
      paramList.remove(paramInt2);
      mCallback.recycleUpdateOp(paramUpdateOp1);
      return;
    }
    if (i != 0)
    {
      if (localUpdateOp != null)
      {
        i = positionStart;
        if (i > positionStart) {
          positionStart = (i - itemCount);
        }
        i = itemCount;
        if (i > positionStart) {
          itemCount = (i - itemCount);
        }
      }
      i = positionStart;
      if (i > positionStart) {
        positionStart = (i - itemCount);
      }
      i = itemCount;
      if (i > positionStart) {
        itemCount = (i - itemCount);
      }
    }
    else
    {
      if (localUpdateOp != null)
      {
        i = positionStart;
        if (i >= positionStart) {
          positionStart = (i - itemCount);
        }
        i = itemCount;
        if (i >= positionStart) {
          itemCount = (i - itemCount);
        }
      }
      i = positionStart;
      if (i >= positionStart) {
        positionStart = (i - itemCount);
      }
      i = itemCount;
      if (i >= positionStart) {
        itemCount = (i - itemCount);
      }
    }
    paramList.set(paramInt1, paramUpdateOp2);
    if (positionStart != itemCount) {
      paramList.set(paramInt2, paramUpdateOp1);
    } else {
      paramList.remove(paramInt2);
    }
    if (localUpdateOp != null) {
      paramList.add(paramInt1, localUpdateOp);
    }
  }
  
  public void swapMoveUpdate(List<AdapterHelper.UpdateOp> paramList, int paramInt1, AdapterHelper.UpdateOp paramUpdateOp1, int paramInt2, AdapterHelper.UpdateOp paramUpdateOp2)
  {
    int i = itemCount;
    int j = positionStart;
    AdapterHelper.UpdateOp localUpdateOp1 = null;
    if (i < j)
    {
      positionStart = (j - 1);
    }
    else
    {
      k = itemCount;
      if (i < j + k)
      {
        itemCount = (k - 1);
        localUpdateOp2 = mCallback.obtainUpdateOp(4, positionStart, 1, payload);
        break label89;
      }
    }
    AdapterHelper.UpdateOp localUpdateOp2 = null;
    label89:
    int k = positionStart;
    i = positionStart;
    if (k <= i)
    {
      positionStart = (i + 1);
    }
    else
    {
      j = itemCount;
      if (k < i + j)
      {
        j = i + j - k;
        localUpdateOp1 = mCallback.obtainUpdateOp(4, k + 1, j, payload);
        itemCount -= j;
      }
    }
    paramList.set(paramInt2, paramUpdateOp1);
    if (itemCount > 0)
    {
      paramList.set(paramInt1, paramUpdateOp2);
    }
    else
    {
      paramList.remove(paramInt1);
      mCallback.recycleUpdateOp(paramUpdateOp2);
    }
    if (localUpdateOp2 != null) {
      paramList.add(paramInt1, localUpdateOp2);
    }
    if (localUpdateOp1 != null) {
      paramList.add(paramInt1, localUpdateOp1);
    }
  }
  
  public static abstract interface Callback
  {
    public abstract AdapterHelper.UpdateOp obtainUpdateOp(int paramInt1, int paramInt2, int paramInt3, Object paramObject);
    
    public abstract void recycleUpdateOp(AdapterHelper.UpdateOp paramUpdateOp);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.OpReorderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */