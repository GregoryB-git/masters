package androidx.recyclerview.widget;

import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class AdapterHelper
  implements OpReorderer.Callback
{
  private static final boolean DEBUG = false;
  public static final int POSITION_TYPE_INVISIBLE = 0;
  public static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
  private static final String TAG = "AHT";
  public final Callback mCallback;
  public final boolean mDisableRecycler;
  private int mExistingUpdateTypes = 0;
  public Runnable mOnItemProcessedCallback;
  public final OpReorderer mOpReorderer;
  public final ArrayList<UpdateOp> mPendingUpdates = new ArrayList();
  public final ArrayList<UpdateOp> mPostponedList = new ArrayList();
  private Pools.Pool<UpdateOp> mUpdateOpPool = new Pools.SimplePool(30);
  
  public AdapterHelper(Callback paramCallback)
  {
    this(paramCallback, false);
  }
  
  public AdapterHelper(Callback paramCallback, boolean paramBoolean)
  {
    mCallback = paramCallback;
    mDisableRecycler = paramBoolean;
    mOpReorderer = new OpReorderer(this);
  }
  
  private void applyAdd(UpdateOp paramUpdateOp)
  {
    postponeAndUpdateViewHolders(paramUpdateOp);
  }
  
  private void applyMove(UpdateOp paramUpdateOp)
  {
    postponeAndUpdateViewHolders(paramUpdateOp);
  }
  
  private void applyRemove(UpdateOp paramUpdateOp)
  {
    int i = positionStart;
    int j = itemCount + i;
    int k = -1;
    int m = i;
    int i2;
    for (int n = 0; m < j; n = i2)
    {
      if ((mCallback.findViewHolder(m) == null) && (!canFindInPreLayout(m)))
      {
        if (k == 1)
        {
          postponeAndUpdateViewHolders(obtainUpdateOp(2, i, n, null));
          k = 1;
        }
        else
        {
          k = 0;
        }
        int i1 = 0;
        i2 = k;
        k = i1;
      }
      else
      {
        if (k == 0)
        {
          dispatchAndUpdateViewHolders(obtainUpdateOp(2, i, n, null));
          i2 = 1;
        }
        else
        {
          i2 = 0;
        }
        k = 1;
      }
      if (i2 != 0)
      {
        m -= n;
        j -= n;
        i2 = 1;
      }
      else
      {
        i2 = n + 1;
      }
      m++;
    }
    UpdateOp localUpdateOp = paramUpdateOp;
    if (n != itemCount)
    {
      recycleUpdateOp(paramUpdateOp);
      localUpdateOp = obtainUpdateOp(2, i, n, null);
    }
    if (k == 0) {
      dispatchAndUpdateViewHolders(localUpdateOp);
    } else {
      postponeAndUpdateViewHolders(localUpdateOp);
    }
  }
  
  private void applyUpdate(UpdateOp paramUpdateOp)
  {
    int i = positionStart;
    int j = itemCount;
    int k = 0;
    int m = -1;
    int n = i;
    int i1 = i;
    while (i1 < j + i)
    {
      int i2;
      if ((mCallback.findViewHolder(i1) == null) && (!canFindInPreLayout(i1)))
      {
        i2 = n;
        i3 = k;
        if (m == 1)
        {
          postponeAndUpdateViewHolders(obtainUpdateOp(4, n, k, payload));
          i2 = i1;
          i3 = 0;
        }
        k = 0;
        n = i2;
        i2 = i3;
      }
      else
      {
        i3 = n;
        i2 = k;
        if (m == 0)
        {
          dispatchAndUpdateViewHolders(obtainUpdateOp(4, n, k, payload));
          i3 = i1;
          i2 = 0;
        }
        k = 1;
        n = i3;
      }
      int i3 = i2 + 1;
      i1++;
      m = k;
      k = i3;
    }
    Object localObject = paramUpdateOp;
    if (k != itemCount)
    {
      localObject = payload;
      recycleUpdateOp(paramUpdateOp);
      localObject = obtainUpdateOp(4, n, k, localObject);
    }
    if (m == 0) {
      dispatchAndUpdateViewHolders((UpdateOp)localObject);
    } else {
      postponeAndUpdateViewHolders((UpdateOp)localObject);
    }
  }
  
  private boolean canFindInPreLayout(int paramInt)
  {
    int i = mPostponedList.size();
    for (int j = 0; j < i; j++)
    {
      UpdateOp localUpdateOp = (UpdateOp)mPostponedList.get(j);
      int k = cmd;
      if (k == 8)
      {
        if (findPositionOffset(itemCount, j + 1) == paramInt) {
          return true;
        }
      }
      else if (k == 1)
      {
        int m = positionStart;
        int n = itemCount;
        for (k = m; k < n + m; k++) {
          if (findPositionOffset(k, j + 1) == paramInt) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private void dispatchAndUpdateViewHolders(UpdateOp paramUpdateOp)
  {
    int i = cmd;
    if ((i != 1) && (i != 8))
    {
      int j = updatePositionWithPostponed(positionStart, i);
      i = positionStart;
      int k = cmd;
      int m;
      if (k != 2)
      {
        if (k == 4)
        {
          m = 1;
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("op should be remove or update.");
          ((StringBuilder)localObject).append(paramUpdateOp);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else {
        m = 0;
      }
      int n = 1;
      k = n;
      while (n < itemCount)
      {
        int i1 = updatePositionWithPostponed(m * n + positionStart, cmd);
        int i2 = cmd;
        int i3;
        if (i2 != 2)
        {
          if (i2 != 4) {}
          while (i1 != j + 1)
          {
            i3 = 0;
            break;
          }
        }
        for (;;)
        {
          i3 = 1;
          break label178;
          if (i1 != j) {
            break;
          }
        }
        label178:
        if (i3 != 0)
        {
          k++;
        }
        else
        {
          localObject = obtainUpdateOp(i2, j, k, payload);
          dispatchFirstPassAndUpdateViewHolders((UpdateOp)localObject, i);
          recycleUpdateOp((UpdateOp)localObject);
          j = i;
          if (cmd == 4) {
            j = i + k;
          }
          k = 1;
          i3 = i1;
          i = j;
          j = i3;
        }
        n++;
      }
      Object localObject = payload;
      recycleUpdateOp(paramUpdateOp);
      if (k > 0)
      {
        paramUpdateOp = obtainUpdateOp(cmd, j, k, localObject);
        dispatchFirstPassAndUpdateViewHolders(paramUpdateOp, i);
        recycleUpdateOp(paramUpdateOp);
      }
      return;
    }
    throw new IllegalArgumentException("should not dispatch add or move for pre layout");
  }
  
  private void postponeAndUpdateViewHolders(UpdateOp paramUpdateOp)
  {
    mPostponedList.add(paramUpdateOp);
    int i = cmd;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 4)
        {
          if (i == 8)
          {
            mCallback.offsetPositionsForMove(positionStart, itemCount);
          }
          else
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Unknown update op type for ");
            localStringBuilder.append(paramUpdateOp);
            throw new IllegalArgumentException(localStringBuilder.toString());
          }
        }
        else {
          mCallback.markViewHoldersUpdated(positionStart, itemCount, payload);
        }
      }
      else {
        mCallback.offsetPositionsForRemovingLaidOutOrNewView(positionStart, itemCount);
      }
    }
    else {
      mCallback.offsetPositionsForAdd(positionStart, itemCount);
    }
  }
  
  private int updatePositionWithPostponed(int paramInt1, int paramInt2)
  {
    int i = mPostponedList.size() - 1;
    UpdateOp localUpdateOp;
    for (int j = paramInt1; i >= 0; j = paramInt1)
    {
      localUpdateOp = (UpdateOp)mPostponedList.get(i);
      int k = cmd;
      int m;
      if (k == 8)
      {
        m = positionStart;
        k = itemCount;
        int n;
        if (m < k)
        {
          n = m;
          paramInt1 = k;
        }
        else
        {
          paramInt1 = m;
          n = k;
        }
        if ((j >= n) && (j <= paramInt1))
        {
          if (n == m)
          {
            if (paramInt2 == 1) {
              itemCount = (k + 1);
            } else if (paramInt2 == 2) {
              itemCount = (k - 1);
            }
            paramInt1 = j + 1;
          }
          else
          {
            if (paramInt2 == 1) {
              positionStart = (m + 1);
            } else if (paramInt2 == 2) {
              positionStart = (m - 1);
            }
            paramInt1 = j - 1;
          }
        }
        else
        {
          paramInt1 = j;
          if (j < m) {
            if (paramInt2 == 1)
            {
              positionStart = (m + 1);
              itemCount = (k + 1);
              paramInt1 = j;
            }
            else
            {
              paramInt1 = j;
              if (paramInt2 == 2)
              {
                positionStart = (m - 1);
                itemCount = (k - 1);
                paramInt1 = j;
              }
            }
          }
        }
      }
      else
      {
        m = positionStart;
        if (m <= j)
        {
          if (k == 1)
          {
            paramInt1 = j - itemCount;
          }
          else
          {
            paramInt1 = j;
            if (k == 2) {
              paramInt1 = j + itemCount;
            }
          }
        }
        else if (paramInt2 == 1)
        {
          positionStart = (m + 1);
          paramInt1 = j;
        }
        else
        {
          paramInt1 = j;
          if (paramInt2 == 2)
          {
            positionStart = (m - 1);
            paramInt1 = j;
          }
        }
      }
      i--;
    }
    for (paramInt1 = mPostponedList.size() - 1; paramInt1 >= 0; paramInt1--)
    {
      localUpdateOp = (UpdateOp)mPostponedList.get(paramInt1);
      if (cmd == 8)
      {
        paramInt2 = itemCount;
        if ((paramInt2 == positionStart) || (paramInt2 < 0))
        {
          mPostponedList.remove(paramInt1);
          recycleUpdateOp(localUpdateOp);
        }
      }
      else if (itemCount <= 0)
      {
        mPostponedList.remove(paramInt1);
        recycleUpdateOp(localUpdateOp);
      }
    }
    return j;
  }
  
  public AdapterHelper addUpdateOp(UpdateOp... paramVarArgs)
  {
    Collections.addAll(mPendingUpdates, paramVarArgs);
    return this;
  }
  
  public int applyPendingUpdatesToPosition(int paramInt)
  {
    int i = mPendingUpdates.size();
    int j = 0;
    for (int k = paramInt; j < i; k = paramInt)
    {
      UpdateOp localUpdateOp = (UpdateOp)mPendingUpdates.get(j);
      paramInt = cmd;
      if (paramInt != 1)
      {
        int m;
        if (paramInt != 2)
        {
          if (paramInt != 8)
          {
            paramInt = k;
          }
          else
          {
            paramInt = positionStart;
            if (paramInt == k)
            {
              paramInt = itemCount;
            }
            else
            {
              m = k;
              if (paramInt < k) {
                m = k - 1;
              }
              paramInt = m;
              if (itemCount <= m) {
                paramInt = m + 1;
              }
            }
          }
        }
        else
        {
          m = positionStart;
          paramInt = k;
          if (m <= k)
          {
            paramInt = itemCount;
            if (m + paramInt > k) {
              return -1;
            }
            paramInt = k - paramInt;
          }
        }
      }
      else
      {
        paramInt = k;
        if (positionStart <= k) {
          paramInt = k + itemCount;
        }
      }
      j++;
    }
    return k;
  }
  
  public void consumePostponedUpdates()
  {
    int i = mPostponedList.size();
    for (int j = 0; j < i; j++) {
      mCallback.onDispatchSecondPass((UpdateOp)mPostponedList.get(j));
    }
    recycleUpdateOpsAndClearList(mPostponedList);
    mExistingUpdateTypes = 0;
  }
  
  public void consumeUpdatesInOnePass()
  {
    consumePostponedUpdates();
    int i = mPendingUpdates.size();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (UpdateOp)mPendingUpdates.get(j);
      int k = cmd;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 4)
          {
            if (k == 8)
            {
              mCallback.onDispatchSecondPass((UpdateOp)localObject);
              mCallback.offsetPositionsForMove(positionStart, itemCount);
            }
          }
          else
          {
            mCallback.onDispatchSecondPass((UpdateOp)localObject);
            mCallback.markViewHoldersUpdated(positionStart, itemCount, payload);
          }
        }
        else
        {
          mCallback.onDispatchSecondPass((UpdateOp)localObject);
          mCallback.offsetPositionsForRemovingInvisible(positionStart, itemCount);
        }
      }
      else
      {
        mCallback.onDispatchSecondPass((UpdateOp)localObject);
        mCallback.offsetPositionsForAdd(positionStart, itemCount);
      }
      localObject = mOnItemProcessedCallback;
      if (localObject != null) {
        ((Runnable)localObject).run();
      }
    }
    recycleUpdateOpsAndClearList(mPendingUpdates);
    mExistingUpdateTypes = 0;
  }
  
  public void dispatchFirstPassAndUpdateViewHolders(UpdateOp paramUpdateOp, int paramInt)
  {
    mCallback.onDispatchFirstPass(paramUpdateOp);
    int i = cmd;
    if (i != 2)
    {
      if (i == 4) {
        mCallback.markViewHoldersUpdated(paramInt, itemCount, payload);
      } else {
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
      }
    }
    else {
      mCallback.offsetPositionsForRemovingInvisible(paramInt, itemCount);
    }
  }
  
  public int findPositionOffset(int paramInt)
  {
    return findPositionOffset(paramInt, 0);
  }
  
  public int findPositionOffset(int paramInt1, int paramInt2)
  {
    int i = mPostponedList.size();
    int j = paramInt2;
    for (paramInt2 = paramInt1; j < i; paramInt2 = paramInt1)
    {
      UpdateOp localUpdateOp = (UpdateOp)mPostponedList.get(j);
      int k = cmd;
      int m;
      if (k == 8)
      {
        paramInt1 = positionStart;
        if (paramInt1 == paramInt2)
        {
          paramInt1 = itemCount;
        }
        else
        {
          m = paramInt2;
          if (paramInt1 < paramInt2) {
            m = paramInt2 - 1;
          }
          paramInt1 = m;
          if (itemCount <= m) {
            paramInt1 = m + 1;
          }
        }
      }
      else
      {
        m = positionStart;
        paramInt1 = paramInt2;
        if (m <= paramInt2) {
          if (k == 2)
          {
            paramInt1 = itemCount;
            if (paramInt2 < m + paramInt1) {
              return -1;
            }
            paramInt1 = paramInt2 - paramInt1;
          }
          else
          {
            paramInt1 = paramInt2;
            if (k == 1) {
              paramInt1 = paramInt2 + itemCount;
            }
          }
        }
      }
      j++;
    }
    return paramInt2;
  }
  
  public boolean hasAnyUpdateTypes(int paramInt)
  {
    boolean bool;
    if ((paramInt & mExistingUpdateTypes) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasPendingUpdates()
  {
    boolean bool;
    if (mPendingUpdates.size() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasUpdates()
  {
    boolean bool;
    if ((!mPostponedList.isEmpty()) && (!mPendingUpdates.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public UpdateOp obtainUpdateOp(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    UpdateOp localUpdateOp = (UpdateOp)mUpdateOpPool.acquire();
    if (localUpdateOp == null)
    {
      paramObject = new UpdateOp(paramInt1, paramInt2, paramInt3, paramObject);
    }
    else
    {
      cmd = paramInt1;
      positionStart = paramInt2;
      itemCount = paramInt3;
      payload = paramObject;
      paramObject = localUpdateOp;
    }
    return (UpdateOp)paramObject;
  }
  
  public boolean onItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    boolean bool = false;
    if (paramInt2 < 1) {
      return false;
    }
    mPendingUpdates.add(obtainUpdateOp(4, paramInt1, paramInt2, paramObject));
    mExistingUpdateTypes |= 0x4;
    if (mPendingUpdates.size() == 1) {
      bool = true;
    }
    return bool;
  }
  
  public boolean onItemRangeInserted(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (paramInt2 < 1) {
      return false;
    }
    mPendingUpdates.add(obtainUpdateOp(1, paramInt1, paramInt2, null));
    mExistingUpdateTypes |= 0x1;
    if (mPendingUpdates.size() == 1) {
      bool = true;
    }
    return bool;
  }
  
  public boolean onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    if (paramInt1 == paramInt2) {
      return false;
    }
    if (paramInt3 == 1)
    {
      mPendingUpdates.add(obtainUpdateOp(8, paramInt1, paramInt2, null));
      mExistingUpdateTypes |= 0x8;
      if (mPendingUpdates.size() == 1) {
        bool = true;
      }
      return bool;
    }
    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
  }
  
  public boolean onItemRangeRemoved(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (paramInt2 < 1) {
      return false;
    }
    mPendingUpdates.add(obtainUpdateOp(2, paramInt1, paramInt2, null));
    mExistingUpdateTypes |= 0x2;
    if (mPendingUpdates.size() == 1) {
      bool = true;
    }
    return bool;
  }
  
  public void preProcess()
  {
    mOpReorderer.reorderOps(mPendingUpdates);
    int i = mPendingUpdates.size();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (UpdateOp)mPendingUpdates.get(j);
      int k = cmd;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 4)
          {
            if (k == 8) {
              applyMove((UpdateOp)localObject);
            }
          }
          else {
            applyUpdate((UpdateOp)localObject);
          }
        }
        else {
          applyRemove((UpdateOp)localObject);
        }
      }
      else {
        applyAdd((UpdateOp)localObject);
      }
      localObject = mOnItemProcessedCallback;
      if (localObject != null) {
        ((Runnable)localObject).run();
      }
    }
    mPendingUpdates.clear();
  }
  
  public void recycleUpdateOp(UpdateOp paramUpdateOp)
  {
    if (!mDisableRecycler)
    {
      payload = null;
      mUpdateOpPool.release(paramUpdateOp);
    }
  }
  
  public void recycleUpdateOpsAndClearList(List<UpdateOp> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      recycleUpdateOp((UpdateOp)paramList.get(j));
    }
    paramList.clear();
  }
  
  public void reset()
  {
    recycleUpdateOpsAndClearList(mPendingUpdates);
    recycleUpdateOpsAndClearList(mPostponedList);
    mExistingUpdateTypes = 0;
  }
  
  public static abstract interface Callback
  {
    public abstract RecyclerView.ViewHolder findViewHolder(int paramInt);
    
    public abstract void markViewHoldersUpdated(int paramInt1, int paramInt2, Object paramObject);
    
    public abstract void offsetPositionsForAdd(int paramInt1, int paramInt2);
    
    public abstract void offsetPositionsForMove(int paramInt1, int paramInt2);
    
    public abstract void offsetPositionsForRemovingInvisible(int paramInt1, int paramInt2);
    
    public abstract void offsetPositionsForRemovingLaidOutOrNewView(int paramInt1, int paramInt2);
    
    public abstract void onDispatchFirstPass(AdapterHelper.UpdateOp paramUpdateOp);
    
    public abstract void onDispatchSecondPass(AdapterHelper.UpdateOp paramUpdateOp);
  }
  
  public static final class UpdateOp
  {
    public static final int ADD = 1;
    public static final int MOVE = 8;
    public static final int POOL_SIZE = 30;
    public static final int REMOVE = 2;
    public static final int UPDATE = 4;
    public int cmd;
    public int itemCount;
    public Object payload;
    public int positionStart;
    
    public UpdateOp(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
    {
      cmd = paramInt1;
      positionStart = paramInt2;
      itemCount = paramInt3;
      payload = paramObject;
    }
    
    public String cmdToString()
    {
      int i = cmd;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 4)
          {
            if (i != 8) {
              return "??";
            }
            return "mv";
          }
          return "up";
        }
        return "rm";
      }
      return "add";
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof UpdateOp)) {
        return false;
      }
      paramObject = (UpdateOp)paramObject;
      int i = cmd;
      if (i != cmd) {
        return false;
      }
      if ((i == 8) && (Math.abs(itemCount - positionStart) == 1) && (itemCount == positionStart) && (positionStart == itemCount)) {
        return true;
      }
      if (itemCount != itemCount) {
        return false;
      }
      if (positionStart != positionStart) {
        return false;
      }
      Object localObject = payload;
      if (localObject != null)
      {
        if (!localObject.equals(payload)) {
          return false;
        }
      }
      else if (payload != null) {
        return false;
      }
      return true;
    }
    
    public int hashCode()
    {
      return (cmd * 31 + positionStart) * 31 + itemCount;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append("[");
      localStringBuilder.append(cmdToString());
      localStringBuilder.append(",s:");
      localStringBuilder.append(positionStart);
      localStringBuilder.append("c:");
      localStringBuilder.append(itemCount);
      localStringBuilder.append(",p:");
      localStringBuilder.append(payload);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AdapterHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */