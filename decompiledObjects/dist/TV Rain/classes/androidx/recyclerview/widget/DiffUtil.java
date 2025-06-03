package androidx.recyclerview.widget;

import a;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DiffUtil
{
  private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator()
  {
    public int compare(DiffUtil.Diagonal paramAnonymousDiagonal1, DiffUtil.Diagonal paramAnonymousDiagonal2)
    {
      return x - x;
    }
  };
  
  @Nullable
  private static Snake backward(Range paramRange, Callback paramCallback, CenteredArray paramCenteredArray1, CenteredArray paramCenteredArray2, int paramInt)
  {
    int i;
    if ((paramRange.oldSize() - paramRange.newSize()) % 2 == 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j = paramRange.oldSize();
    int k = paramRange.newSize();
    int m = -paramInt;
    for (int n = m; n <= paramInt; n += 2)
    {
      int i1;
      int i2;
      if ((n != m) && ((n == paramInt) || (paramCenteredArray2.get(n + 1) >= paramCenteredArray2.get(n - 1))))
      {
        i1 = paramCenteredArray2.get(n - 1);
        i2 = i1 - 1;
      }
      else
      {
        i1 = paramCenteredArray2.get(n + 1);
        i2 = i1;
      }
      int i3 = newListEnd - (oldListEnd - i2 - n);
      int i4;
      if ((paramInt != 0) && (i2 == i1)) {
        i4 = i3 + 1;
      } else {
        i4 = i3;
      }
      while ((i2 > oldListStart) && (i3 > newListStart) && (paramCallback.areItemsTheSame(i2 - 1, i3 - 1)))
      {
        i2--;
        i3--;
      }
      paramCenteredArray2.set(n, i2);
      if (i != 0)
      {
        int i5 = j - k - n;
        if ((i5 >= m) && (i5 <= paramInt) && (paramCenteredArray1.get(i5) >= i2))
        {
          paramRange = new Snake();
          startX = i2;
          startY = i3;
          endX = i1;
          endY = i4;
          reverse = true;
          return paramRange;
        }
      }
    }
    return null;
  }
  
  @NonNull
  public static DiffResult calculateDiff(@NonNull Callback paramCallback)
  {
    return calculateDiff(paramCallback, true);
  }
  
  @NonNull
  public static DiffResult calculateDiff(@NonNull Callback paramCallback, boolean paramBoolean)
  {
    int i = paramCallback.getOldListSize();
    int j = paramCallback.getNewListSize();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.add(new Range(0, i, 0, j));
    i = (i + j + 1) / 2 * 2 + 1;
    CenteredArray localCenteredArray1 = new CenteredArray(i);
    CenteredArray localCenteredArray2 = new CenteredArray(i);
    ArrayList localArrayList3 = new ArrayList();
    while (!localArrayList2.isEmpty())
    {
      Range localRange1 = (Range)localArrayList2.remove(localArrayList2.size() - 1);
      Snake localSnake = midPoint(localRange1, paramCallback, localCenteredArray1, localCenteredArray2);
      if (localSnake != null)
      {
        if (localSnake.diagonalSize() > 0) {
          localArrayList1.add(localSnake.toDiagonal());
        }
        Range localRange2;
        if (localArrayList3.isEmpty()) {
          localRange2 = new Range();
        } else {
          localRange2 = (Range)localArrayList3.remove(localArrayList3.size() - 1);
        }
        oldListStart = oldListStart;
        newListStart = newListStart;
        oldListEnd = startX;
        newListEnd = startY;
        localArrayList2.add(localRange2);
        oldListEnd = oldListEnd;
        newListEnd = newListEnd;
        oldListStart = endX;
        newListStart = endY;
        localArrayList2.add(localRange1);
      }
      else
      {
        localArrayList3.add(localRange1);
      }
    }
    Collections.sort(localArrayList1, DIAGONAL_COMPARATOR);
    return new DiffResult(paramCallback, localArrayList1, localCenteredArray1.backingData(), localCenteredArray2.backingData(), paramBoolean);
  }
  
  @Nullable
  private static Snake forward(Range paramRange, Callback paramCallback, CenteredArray paramCenteredArray1, CenteredArray paramCenteredArray2, int paramInt)
  {
    int i = Math.abs(paramRange.oldSize() - paramRange.newSize());
    int j = 1;
    if (i % 2 != 1) {
      j = 0;
    }
    int k = paramRange.oldSize();
    int m = paramRange.newSize();
    int n = -paramInt;
    for (int i1 = n; i1 <= paramInt; i1 += 2)
    {
      int i2;
      if ((i1 != n) && ((i1 == paramInt) || (paramCenteredArray1.get(i1 + 1) <= paramCenteredArray1.get(i1 - 1))))
      {
        i2 = paramCenteredArray1.get(i1 - 1);
        i = i2 + 1;
      }
      else
      {
        i2 = paramCenteredArray1.get(i1 + 1);
        i = i2;
      }
      int i3 = newListStart;
      int i4 = i - oldListStart + i3 - i1;
      if ((paramInt != 0) && (i == i2)) {
        i3 = i4 - 1;
      } else {
        i3 = i4;
      }
      while ((i < oldListEnd) && (i4 < newListEnd) && (paramCallback.areItemsTheSame(i, i4)))
      {
        i++;
        i4++;
      }
      paramCenteredArray1.set(i1, i);
      if (j != 0)
      {
        int i5 = k - m - i1;
        if ((i5 >= n + 1) && (i5 <= paramInt - 1) && (paramCenteredArray2.get(i5) <= i))
        {
          paramRange = new Snake();
          startX = i2;
          startY = i3;
          endX = i;
          endY = i4;
          reverse = false;
          return paramRange;
        }
      }
    }
    return null;
  }
  
  @Nullable
  private static Snake midPoint(Range paramRange, Callback paramCallback, CenteredArray paramCenteredArray1, CenteredArray paramCenteredArray2)
  {
    if ((paramRange.oldSize() >= 1) && (paramRange.newSize() >= 1))
    {
      int i = (paramRange.oldSize() + paramRange.newSize() + 1) / 2;
      paramCenteredArray1.set(1, oldListStart);
      paramCenteredArray2.set(1, oldListEnd);
      for (int j = 0; j < i; j++)
      {
        Snake localSnake = forward(paramRange, paramCallback, paramCenteredArray1, paramCenteredArray2, j);
        if (localSnake != null) {
          return localSnake;
        }
        localSnake = backward(paramRange, paramCallback, paramCenteredArray1, paramCenteredArray2, j);
        if (localSnake != null) {
          return localSnake;
        }
      }
    }
    return null;
  }
  
  public static abstract class Callback
  {
    public abstract boolean areContentsTheSame(int paramInt1, int paramInt2);
    
    public abstract boolean areItemsTheSame(int paramInt1, int paramInt2);
    
    @Nullable
    public Object getChangePayload(int paramInt1, int paramInt2)
    {
      return null;
    }
    
    public abstract int getNewListSize();
    
    public abstract int getOldListSize();
  }
  
  public static class CenteredArray
  {
    private final int[] mData;
    private final int mMid;
    
    public CenteredArray(int paramInt)
    {
      int[] arrayOfInt = new int[paramInt];
      mData = arrayOfInt;
      mMid = (arrayOfInt.length / 2);
    }
    
    public int[] backingData()
    {
      return mData;
    }
    
    public void fill(int paramInt)
    {
      Arrays.fill(mData, paramInt);
    }
    
    public int get(int paramInt)
    {
      return mData[(paramInt + mMid)];
    }
    
    public void set(int paramInt1, int paramInt2)
    {
      mData[(paramInt1 + mMid)] = paramInt2;
    }
  }
  
  public static class Diagonal
  {
    public final int size;
    public final int x;
    public final int y;
    
    public Diagonal(int paramInt1, int paramInt2, int paramInt3)
    {
      x = paramInt1;
      y = paramInt2;
      size = paramInt3;
    }
    
    public int endX()
    {
      return x + size;
    }
    
    public int endY()
    {
      return y + size;
    }
  }
  
  public static class DiffResult
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
    
    public DiffResult(DiffUtil.Callback paramCallback, List<DiffUtil.Diagonal> paramList, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean)
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
  
  public static abstract class ItemCallback<T>
  {
    public abstract boolean areContentsTheSame(@NonNull T paramT1, @NonNull T paramT2);
    
    public abstract boolean areItemsTheSame(@NonNull T paramT1, @NonNull T paramT2);
    
    @Nullable
    public Object getChangePayload(@NonNull T paramT1, @NonNull T paramT2)
    {
      return null;
    }
  }
  
  public static class PostponedUpdate
  {
    public int currentPos;
    public int posInOwnerList;
    public boolean removal;
    
    public PostponedUpdate(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      posInOwnerList = paramInt1;
      currentPos = paramInt2;
      removal = paramBoolean;
    }
  }
  
  public static class Range
  {
    public int newListEnd;
    public int newListStart;
    public int oldListEnd;
    public int oldListStart;
    
    public Range() {}
    
    public Range(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      oldListStart = paramInt1;
      oldListEnd = paramInt2;
      newListStart = paramInt3;
      newListEnd = paramInt4;
    }
    
    public int newSize()
    {
      return newListEnd - newListStart;
    }
    
    public int oldSize()
    {
      return oldListEnd - oldListStart;
    }
  }
  
  public static class Snake
  {
    public int endX;
    public int endY;
    public boolean reverse;
    public int startX;
    public int startY;
    
    public int diagonalSize()
    {
      return Math.min(endX - startX, endY - startY);
    }
    
    public boolean hasAdditionOrRemoval()
    {
      boolean bool;
      if (endY - startY != endX - startX) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isAddition()
    {
      boolean bool;
      if (endY - startY > endX - startX) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @NonNull
    public DiffUtil.Diagonal toDiagonal()
    {
      if (hasAdditionOrRemoval())
      {
        if (reverse) {
          return new DiffUtil.Diagonal(startX, startY, diagonalSize());
        }
        if (isAddition()) {
          return new DiffUtil.Diagonal(startX, startY + 1, diagonalSize());
        }
        return new DiffUtil.Diagonal(startX + 1, startY, diagonalSize());
      }
      int i = startX;
      return new DiffUtil.Diagonal(i, startY, endX - i);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */