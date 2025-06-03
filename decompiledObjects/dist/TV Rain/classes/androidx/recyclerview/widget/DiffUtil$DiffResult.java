package androidx.recyclerview.widget;

import a;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DiffUtil$DiffResult
{
  private static final int FLAG_CHANGED = 2;
  private static final int FLAG_MASK = 15;
  private static final int FLAG_MOVED = 12;
  private static final int FLAG_MOVED_CHANGED = 4;
  private static final int FLAG_MOVED_NOT_CHANGED = 8;
  private static final int FLAG_NOT_CHANGED = 1;
  private static final int FLAG_OFFSET = 4;
  public static final int NO_POSITION = -1;
  private final DiffUtil.Callback mCallback;
  private final boolean mDetectMoves;
  private final List<DiffUtil.Diagonal> mDiagonals;
  private final int[] mNewItemStatuses;
  private final int mNewListSize;
  private final int[] mOldItemStatuses;
  private final int mOldListSize;
  
  public DiffUtil$DiffResult(DiffUtil.Callback paramCallback, List<DiffUtil.Diagonal> paramList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
  {
    mDiagonals = paramList;
    mOldItemStatuses = paramArrayOfInt1;
    mNewItemStatuses = paramArrayOfInt2;
    Arrays.fill(paramArrayOfInt1, 0);
    Arrays.fill(paramArrayOfInt2, 0);
    mCallback = paramCallback;
    mOldListSize = paramCallback.getOldListSize();
    mNewListSize = paramCallback.getNewListSize();
    mDetectMoves = paramBoolean;
    addEdgeDiagonals();
    findMatchingItems();
  }
  
  private void addEdgeDiagonals()
  {
    DiffUtil.Diagonal localDiagonal;
    if (mDiagonals.isEmpty()) {
      localDiagonal = null;
    } else {
      localDiagonal = (DiffUtil.Diagonal)mDiagonals.get(0);
    }
    if ((localDiagonal == null) || (x != 0) || (y != 0)) {
      mDiagonals.add(0, new DiffUtil.Diagonal(0, 0, 0));
    }
    mDiagonals.add(new DiffUtil.Diagonal(mOldListSize, mNewListSize, 0));
  }
  
  private void findMatchingAddition(int paramInt)
  {
    int i = mDiagonals.size();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      DiffUtil.Diagonal localDiagonal = (DiffUtil.Diagonal)mDiagonals.get(j);
      while (k < y)
      {
        if ((mNewItemStatuses[k] == 0) && (mCallback.areItemsTheSame(paramInt, k)))
        {
          if (mCallback.areContentsTheSame(paramInt, k)) {
            j = 8;
          } else {
            j = 4;
          }
          mOldItemStatuses[paramInt] = (k << 4 | j);
          mNewItemStatuses[k] = (paramInt << 4 | j);
          return;
        }
        k++;
      }
      k = localDiagonal.endY();
      j++;
    }
  }
  
  private void findMatchingItems()
  {
    Iterator localIterator = mDiagonals.iterator();
    while (localIterator.hasNext())
    {
      DiffUtil.Diagonal localDiagonal = (DiffUtil.Diagonal)localIterator.next();
      for (int i = 0; i < size; i++)
      {
        int j = x + i;
        int k = y + i;
        int m;
        if (mCallback.areContentsTheSame(j, k)) {
          m = 1;
        } else {
          m = 2;
        }
        mOldItemStatuses[j] = (k << 4 | m);
        mNewItemStatuses[k] = (j << 4 | m);
      }
    }
    if (mDetectMoves) {
      findMoveMatches();
    }
  }
  
  private void findMoveMatches()
  {
    Iterator localIterator = mDiagonals.iterator();
    DiffUtil.Diagonal localDiagonal;
    for (int i = 0; localIterator.hasNext(); i = localDiagonal.endX())
    {
      localDiagonal = (DiffUtil.Diagonal)localIterator.next();
      while (i < x)
      {
        if (mOldItemStatuses[i] == 0) {
          findMatchingAddition(i);
        }
        i++;
      }
    }
  }
  
  @Nullable
  private static DiffUtil.PostponedUpdate getPostponedUpdate(Collection<DiffUtil.PostponedUpdate> paramCollection, int paramInt, boolean paramBoolean)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (DiffUtil.PostponedUpdate)localIterator.next();
      if ((posInOwnerList == paramInt) && (removal == paramBoolean))
      {
        localIterator.remove();
        break label53;
      }
    }
    paramCollection = null;
    label53:
    while (localIterator.hasNext())
    {
      DiffUtil.PostponedUpdate localPostponedUpdate = (DiffUtil.PostponedUpdate)localIterator.next();
      if (paramBoolean) {
        currentPos -= 1;
      } else {
        currentPos += 1;
      }
    }
    return paramCollection;
  }
  
  public int convertNewPositionToOld(@IntRange(from=0L) int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < mNewListSize))
    {
      paramInt = mNewItemStatuses[paramInt];
      if ((paramInt & 0xF) == 0) {
        return -1;
      }
      return paramInt >> 4;
    }
    StringBuilder localStringBuilder = a.r("Index out of bounds - passed position = ", paramInt, ", new list size = ");
    localStringBuilder.append(mNewListSize);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public int convertOldPositionToNew(@IntRange(from=0L) int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < mOldListSize))
    {
      paramInt = mOldItemStatuses[paramInt];
      if ((paramInt & 0xF) == 0) {
        return -1;
      }
      return paramInt >> 4;
    }
    StringBuilder localStringBuilder = a.r("Index out of bounds - passed position = ", paramInt, ", old list size = ");
    localStringBuilder.append(mOldListSize);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public void dispatchUpdatesTo(@NonNull ListUpdateCallback paramListUpdateCallback)
  {
    if ((paramListUpdateCallback instanceof BatchingListUpdateCallback)) {
      paramListUpdateCallback = (BatchingListUpdateCallback)paramListUpdateCallback;
    } else {
      paramListUpdateCallback = new BatchingListUpdateCallback(paramListUpdateCallback);
    }
    int i = mOldListSize;
    ArrayDeque localArrayDeque = new ArrayDeque();
    int j = mOldListSize;
    int k = mNewListSize;
    for (int m = mDiagonals.size() - 1; m >= 0; m--)
    {
      DiffUtil.Diagonal localDiagonal = (DiffUtil.Diagonal)mDiagonals.get(m);
      int n = localDiagonal.endX();
      int i1 = localDiagonal.endY();
      int i2 = j;
      j = i;
      int i3;
      int i4;
      DiffUtil.PostponedUpdate localPostponedUpdate;
      for (;;)
      {
        i3 = 0;
        i = j;
        i4 = k;
        if (i2 <= n) {
          break;
        }
        i = i2 - 1;
        i3 = mOldItemStatuses[i];
        if ((i3 & 0xC) != 0)
        {
          int i5 = i3 >> 4;
          localPostponedUpdate = getPostponedUpdate(localArrayDeque, i5, false);
          if (localPostponedUpdate != null)
          {
            i4 = j - currentPos - 1;
            paramListUpdateCallback.onMoved(i, i4);
            i2 = i;
            if ((i3 & 0x4) != 0)
            {
              paramListUpdateCallback.onChanged(i4, 1, mCallback.getChangePayload(i, i5));
              i2 = i;
            }
          }
          else
          {
            localArrayDeque.add(new DiffUtil.PostponedUpdate(i, j - i - 1, true));
            i2 = i;
          }
        }
        else
        {
          paramListUpdateCallback.onRemoved(i, 1);
          j--;
          i2 = i;
        }
      }
      while (i4 > i1)
      {
        k = i4 - 1;
        j = mNewItemStatuses[k];
        if ((j & 0xC) != 0)
        {
          n = j >> 4;
          localPostponedUpdate = getPostponedUpdate(localArrayDeque, n, true);
          if (localPostponedUpdate == null)
          {
            localArrayDeque.add(new DiffUtil.PostponedUpdate(k, i - i2, false));
            i4 = k;
          }
          else
          {
            paramListUpdateCallback.onMoved(i - currentPos - 1, i2);
            i4 = k;
            if ((j & 0x4) != 0)
            {
              paramListUpdateCallback.onChanged(i2, 1, mCallback.getChangePayload(n, k));
              i4 = k;
            }
          }
        }
        else
        {
          paramListUpdateCallback.onInserted(i2, 1);
          i++;
          i4 = k;
        }
      }
      i2 = x;
      j = y;
      for (k = i3; k < size; k++)
      {
        if ((mOldItemStatuses[i2] & 0xF) == 2) {
          paramListUpdateCallback.onChanged(i2, 1, mCallback.getChangePayload(i2, j));
        }
        i2++;
        j++;
      }
      j = x;
      k = y;
    }
    paramListUpdateCallback.dispatchLastEvent();
  }
  
  public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter paramAdapter)
  {
    dispatchUpdatesTo(new AdapterListUpdateCallback(paramAdapter));
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.DiffResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */