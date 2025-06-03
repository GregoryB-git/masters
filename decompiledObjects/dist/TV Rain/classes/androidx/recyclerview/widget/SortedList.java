package androidx.recyclerview.widget;

import a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SortedList<T>
{
  private static final int CAPACITY_GROWTH = 10;
  private static final int DELETION = 2;
  private static final int INSERTION = 1;
  public static final int INVALID_POSITION = -1;
  private static final int LOOKUP = 4;
  private static final int MIN_CAPACITY = 10;
  private BatchedCallback mBatchedCallback;
  private Callback mCallback;
  public T[] mData;
  private int mNewDataStart;
  private T[] mOldData;
  private int mOldDataSize;
  private int mOldDataStart;
  private int mSize;
  private final Class<T> mTClass;
  
  public SortedList(@NonNull Class<T> paramClass, @NonNull Callback<T> paramCallback)
  {
    this(paramClass, paramCallback, 10);
  }
  
  public SortedList(@NonNull Class<T> paramClass, @NonNull Callback<T> paramCallback, int paramInt)
  {
    mTClass = paramClass;
    mData = ((Object[])Array.newInstance(paramClass, paramInt));
    mCallback = paramCallback;
    mSize = 0;
  }
  
  private int add(T paramT, boolean paramBoolean)
  {
    int i = findIndexOf(paramT, mData, 0, mSize, 1);
    int j;
    if (i == -1)
    {
      j = 0;
    }
    else
    {
      j = i;
      if (i < mSize)
      {
        Object localObject = mData[i];
        j = i;
        if (mCallback.areItemsTheSame(localObject, paramT))
        {
          if (mCallback.areContentsTheSame(localObject, paramT))
          {
            mData[i] = paramT;
            return i;
          }
          mData[i] = paramT;
          Callback localCallback = mCallback;
          localCallback.onChanged(i, 1, localCallback.getChangePayload(localObject, paramT));
          return i;
        }
      }
    }
    addToData(j, paramT);
    if (paramBoolean) {
      mCallback.onInserted(j, 1);
    }
    return j;
  }
  
  private void addAllInternal(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length < 1) {
      return;
    }
    int i = sortAndDedup(paramArrayOfT);
    if (mSize == 0)
    {
      mData = paramArrayOfT;
      mSize = i;
      mCallback.onInserted(0, i);
    }
    else
    {
      merge(paramArrayOfT, i);
    }
  }
  
  private void addToData(int paramInt, T paramT)
  {
    int i = mSize;
    if (paramInt <= i)
    {
      Object[] arrayOfObject = mData;
      if (i == arrayOfObject.length)
      {
        arrayOfObject = (Object[])Array.newInstance(mTClass, arrayOfObject.length + 10);
        System.arraycopy(mData, 0, arrayOfObject, 0, paramInt);
        arrayOfObject[paramInt] = paramT;
        System.arraycopy(mData, paramInt, arrayOfObject, paramInt + 1, mSize - paramInt);
        mData = arrayOfObject;
      }
      else
      {
        System.arraycopy(arrayOfObject, paramInt, arrayOfObject, paramInt + 1, i - paramInt);
        mData[paramInt] = paramT;
      }
      mSize += 1;
      return;
    }
    paramT = a.r("cannot add item to ", paramInt, " because size is ");
    paramT.append(mSize);
    throw new IndexOutOfBoundsException(paramT.toString());
  }
  
  private T[] copyArray(T[] paramArrayOfT)
  {
    Object[] arrayOfObject = (Object[])Array.newInstance(mTClass, paramArrayOfT.length);
    System.arraycopy(paramArrayOfT, 0, arrayOfObject, 0, paramArrayOfT.length);
    return arrayOfObject;
  }
  
  private int findIndexOf(T paramT, T[] paramArrayOfT, int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt1 < paramInt2)
    {
      int i = (paramInt1 + paramInt2) / 2;
      T ? = paramArrayOfT[i];
      int j = mCallback.compare(?, paramT);
      if (j < 0)
      {
        paramInt1 = i + 1;
      }
      else
      {
        if (j == 0)
        {
          if (mCallback.areItemsTheSame(?, paramT)) {
            return i;
          }
          paramInt1 = linearEqualitySearch(paramT, i, paramInt1, paramInt2);
          if (paramInt3 == 1)
          {
            if (paramInt1 == -1) {
              paramInt1 = i;
            }
            return paramInt1;
          }
          return paramInt1;
        }
        paramInt2 = i;
      }
    }
    if (paramInt3 != 1) {
      paramInt1 = -1;
    }
    return paramInt1;
  }
  
  private int findSameItem(T paramT, T[] paramArrayOfT, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      if (mCallback.areItemsTheSame(paramArrayOfT[paramInt1], paramT)) {
        return paramInt1;
      }
      paramInt1++;
    }
    return -1;
  }
  
  private int linearEqualitySearch(T paramT, int paramInt1, int paramInt2, int paramInt3)
  {
    int j;
    Object localObject;
    for (int i = paramInt1 - 1;; i--)
    {
      j = paramInt1;
      if (i < paramInt2) {
        break;
      }
      localObject = mData[i];
      if (mCallback.compare(localObject, paramT) != 0)
      {
        j = paramInt1;
        break;
      }
      if (mCallback.areItemsTheSame(localObject, paramT)) {
        return i;
      }
    }
    do
    {
      paramInt1 = j + 1;
      if (paramInt1 >= paramInt3) {
        break;
      }
      localObject = mData[paramInt1];
      if (mCallback.compare(localObject, paramT) != 0) {
        break;
      }
      j = paramInt1;
    } while (!mCallback.areItemsTheSame(localObject, paramT));
    return paramInt1;
    return -1;
  }
  
  private void merge(T[] paramArrayOfT, int paramInt)
  {
    boolean bool = mCallback instanceof BatchedCallback ^ true;
    if (bool) {
      beginBatchedUpdates();
    }
    mOldData = mData;
    int i = 0;
    mOldDataStart = 0;
    int j = mSize;
    mOldDataSize = j;
    mData = ((Object[])Array.newInstance(mTClass, j + paramInt + 10));
    mNewDataStart = 0;
    for (;;)
    {
      j = mOldDataStart;
      int k = mOldDataSize;
      if ((j < k) || (i < paramInt)) {
        if (j == k)
        {
          paramInt -= i;
          System.arraycopy(paramArrayOfT, i, mData, mNewDataStart, paramInt);
          i = mNewDataStart + paramInt;
          mNewDataStart = i;
          mSize += paramInt;
          mCallback.onInserted(i - paramInt, paramInt);
        }
        else
        {
          if (i != paramInt) {
            break label219;
          }
          paramInt = k - j;
          System.arraycopy(mOldData, j, mData, mNewDataStart, paramInt);
          mNewDataStart += paramInt;
        }
      }
      mOldData = null;
      if (bool) {
        endBatchedUpdates();
      }
      return;
      label219:
      Object localObject1 = mOldData[j];
      Object localObject2 = paramArrayOfT[i];
      j = mCallback.compare(localObject1, localObject2);
      if (j > 0)
      {
        localObject1 = mData;
        k = mNewDataStart;
        j = k + 1;
        mNewDataStart = j;
        localObject1[k] = localObject2;
        mSize += 1;
        i++;
        mCallback.onInserted(j - 1, 1);
      }
      else if ((j == 0) && (mCallback.areItemsTheSame(localObject1, localObject2)))
      {
        Object localObject3 = mData;
        j = mNewDataStart;
        mNewDataStart = (j + 1);
        localObject3[j] = localObject2;
        j = i + 1;
        mOldDataStart += 1;
        i = j;
        if (!mCallback.areContentsTheSame(localObject1, localObject2))
        {
          localObject3 = mCallback;
          ((Callback)localObject3).onChanged(mNewDataStart - 1, 1, ((Callback)localObject3).getChangePayload(localObject1, localObject2));
          i = j;
        }
      }
      else
      {
        localObject2 = mData;
        j = mNewDataStart;
        mNewDataStart = (j + 1);
        localObject2[j] = localObject1;
        mOldDataStart += 1;
      }
    }
  }
  
  private boolean remove(T paramT, boolean paramBoolean)
  {
    int i = findIndexOf(paramT, mData, 0, mSize, 2);
    if (i == -1) {
      return false;
    }
    removeItemAtIndex(i, paramBoolean);
    return true;
  }
  
  private void removeItemAtIndex(int paramInt, boolean paramBoolean)
  {
    Object[] arrayOfObject = mData;
    System.arraycopy(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, mSize - paramInt - 1);
    int i = mSize - 1;
    mSize = i;
    mData[i] = null;
    if (paramBoolean) {
      mCallback.onRemoved(paramInt, 1);
    }
  }
  
  private void replaceAllInsert(T paramT)
  {
    Object[] arrayOfObject = mData;
    int i = mNewDataStart;
    arrayOfObject[i] = paramT;
    i++;
    mNewDataStart = i;
    mSize += 1;
    mCallback.onInserted(i - 1, 1);
  }
  
  private void replaceAllInternal(@NonNull T[] paramArrayOfT)
  {
    boolean bool = mCallback instanceof BatchedCallback ^ true;
    if (bool) {
      beginBatchedUpdates();
    }
    mOldDataStart = 0;
    mOldDataSize = mSize;
    mOldData = mData;
    mNewDataStart = 0;
    int i = sortAndDedup(paramArrayOfT);
    mData = ((Object[])Array.newInstance(mTClass, i));
    for (;;)
    {
      int j = mNewDataStart;
      int k;
      if ((j < i) || (mOldDataStart < mOldDataSize))
      {
        k = mOldDataStart;
        int m = mOldDataSize;
        if (k >= m)
        {
          i -= j;
          System.arraycopy(paramArrayOfT, j, mData, j, i);
          mNewDataStart += i;
          mSize += i;
          mCallback.onInserted(j, i);
        }
        else
        {
          if (j < i) {
            break label208;
          }
          i = m - k;
          mSize -= i;
          mCallback.onRemoved(j, i);
        }
      }
      mOldData = null;
      if (bool) {
        endBatchedUpdates();
      }
      return;
      label208:
      Object localObject1 = mOldData[k];
      T ? = paramArrayOfT[j];
      j = mCallback.compare(localObject1, ?);
      if (j < 0)
      {
        replaceAllRemove();
      }
      else if (j > 0)
      {
        replaceAllInsert(?);
      }
      else if (!mCallback.areItemsTheSame(localObject1, ?))
      {
        replaceAllRemove();
        replaceAllInsert(?);
      }
      else
      {
        Object localObject2 = mData;
        j = mNewDataStart;
        localObject2[j] = ?;
        mOldDataStart += 1;
        mNewDataStart = (j + 1);
        if (!mCallback.areContentsTheSame(localObject1, ?))
        {
          localObject2 = mCallback;
          ((Callback)localObject2).onChanged(mNewDataStart - 1, 1, ((Callback)localObject2).getChangePayload(localObject1, ?));
        }
      }
    }
  }
  
  private void replaceAllRemove()
  {
    mSize -= 1;
    mOldDataStart += 1;
    mCallback.onRemoved(mNewDataStart, 1);
  }
  
  private int sortAndDedup(@NonNull T[] paramArrayOfT)
  {
    if (paramArrayOfT.length == 0) {
      return 0;
    }
    Arrays.sort(paramArrayOfT, mCallback);
    int i = 1;
    int j = 0;
    int k = 1;
    while (i < paramArrayOfT.length)
    {
      T ? = paramArrayOfT[i];
      if (mCallback.compare(paramArrayOfT[j], ?) == 0)
      {
        int m = findSameItem(?, paramArrayOfT, j, k);
        if (m != -1)
        {
          paramArrayOfT[m] = ?;
        }
        else
        {
          if (k != i) {
            paramArrayOfT[k] = ?;
          }
          k++;
        }
      }
      else
      {
        if (k != i) {
          paramArrayOfT[k] = ?;
        }
        j = k;
        k++;
      }
      i++;
    }
    return k;
  }
  
  private void throwIfInMutationOperation()
  {
    if (mOldData == null) {
      return;
    }
    throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
  }
  
  public int add(T paramT)
  {
    throwIfInMutationOperation();
    return add(paramT, true);
  }
  
  public void addAll(@NonNull Collection<T> paramCollection)
  {
    addAll(paramCollection.toArray((Object[])Array.newInstance(mTClass, paramCollection.size())), true);
  }
  
  public void addAll(@NonNull T... paramVarArgs)
  {
    addAll(paramVarArgs, false);
  }
  
  public void addAll(@NonNull T[] paramArrayOfT, boolean paramBoolean)
  {
    throwIfInMutationOperation();
    if (paramArrayOfT.length == 0) {
      return;
    }
    if (paramBoolean) {
      addAllInternal(paramArrayOfT);
    } else {
      addAllInternal(copyArray(paramArrayOfT));
    }
  }
  
  public void beginBatchedUpdates()
  {
    throwIfInMutationOperation();
    Callback localCallback = mCallback;
    if ((localCallback instanceof BatchedCallback)) {
      return;
    }
    if (mBatchedCallback == null) {
      mBatchedCallback = new BatchedCallback(localCallback);
    }
    mCallback = mBatchedCallback;
  }
  
  public void clear()
  {
    throwIfInMutationOperation();
    int i = mSize;
    if (i == 0) {
      return;
    }
    Arrays.fill(mData, 0, i, null);
    mSize = 0;
    mCallback.onRemoved(0, i);
  }
  
  public void endBatchedUpdates()
  {
    throwIfInMutationOperation();
    Object localObject = mCallback;
    if ((localObject instanceof BatchedCallback)) {
      ((BatchedCallback)localObject).dispatchLastEvent();
    }
    Callback localCallback = mCallback;
    localObject = mBatchedCallback;
    if (localCallback == localObject) {
      mCallback = mWrappedCallback;
    }
  }
  
  public T get(int paramInt)
    throws IndexOutOfBoundsException
  {
    if ((paramInt < mSize) && (paramInt >= 0))
    {
      localObject = mOldData;
      if (localObject != null)
      {
        int i = mNewDataStart;
        if (paramInt >= i) {
          return localObject[(paramInt - i + mOldDataStart)];
        }
      }
      return (T)mData[paramInt];
    }
    Object localObject = a.r("Asked to get item at ", paramInt, " but size is ");
    ((StringBuilder)localObject).append(mSize);
    throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
  }
  
  public int indexOf(T paramT)
  {
    if (mOldData != null)
    {
      int i = findIndexOf(paramT, mData, 0, mNewDataStart, 4);
      if (i != -1) {
        return i;
      }
      i = findIndexOf(paramT, mOldData, mOldDataStart, mOldDataSize, 4);
      if (i != -1) {
        return i - mOldDataStart + mNewDataStart;
      }
      return -1;
    }
    return findIndexOf(paramT, mData, 0, mSize, 4);
  }
  
  public void recalculatePositionOfItemAt(int paramInt)
  {
    throwIfInMutationOperation();
    Object localObject = get(paramInt);
    removeItemAtIndex(paramInt, false);
    int i = add(localObject, false);
    if (paramInt != i) {
      mCallback.onMoved(paramInt, i);
    }
  }
  
  public boolean remove(T paramT)
  {
    throwIfInMutationOperation();
    return remove(paramT, true);
  }
  
  public T removeItemAt(int paramInt)
  {
    throwIfInMutationOperation();
    Object localObject = get(paramInt);
    removeItemAtIndex(paramInt, true);
    return (T)localObject;
  }
  
  public void replaceAll(@NonNull Collection<T> paramCollection)
  {
    replaceAll(paramCollection.toArray((Object[])Array.newInstance(mTClass, paramCollection.size())), true);
  }
  
  public void replaceAll(@NonNull T... paramVarArgs)
  {
    replaceAll(paramVarArgs, false);
  }
  
  public void replaceAll(@NonNull T[] paramArrayOfT, boolean paramBoolean)
  {
    throwIfInMutationOperation();
    if (paramBoolean) {
      replaceAllInternal(paramArrayOfT);
    } else {
      replaceAllInternal(copyArray(paramArrayOfT));
    }
  }
  
  public int size()
  {
    return mSize;
  }
  
  public void updateItemAt(int paramInt, T paramT)
  {
    throwIfInMutationOperation();
    Object localObject = get(paramInt);
    if ((localObject != paramT) && (mCallback.areContentsTheSame(localObject, paramT))) {
      i = 0;
    } else {
      i = 1;
    }
    Callback localCallback;
    if ((localObject != paramT) && (mCallback.compare(localObject, paramT) == 0))
    {
      mData[paramInt] = paramT;
      if (i != 0)
      {
        localCallback = mCallback;
        localCallback.onChanged(paramInt, 1, localCallback.getChangePayload(localObject, paramT));
      }
      return;
    }
    if (i != 0)
    {
      localCallback = mCallback;
      localCallback.onChanged(paramInt, 1, localCallback.getChangePayload(localObject, paramT));
    }
    removeItemAtIndex(paramInt, false);
    int i = add(paramT, false);
    if (paramInt != i) {
      mCallback.onMoved(paramInt, i);
    }
  }
  
  public static class BatchedCallback<T2>
    extends SortedList.Callback<T2>
  {
    private final BatchingListUpdateCallback mBatchingListUpdateCallback;
    public final SortedList.Callback<T2> mWrappedCallback;
    
    public BatchedCallback(SortedList.Callback<T2> paramCallback)
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
  
  public static abstract class Callback<T2>
    implements Comparator<T2>, ListUpdateCallback
  {
    public abstract boolean areContentsTheSame(T2 paramT21, T2 paramT22);
    
    public abstract boolean areItemsTheSame(T2 paramT21, T2 paramT22);
    
    public abstract int compare(T2 paramT21, T2 paramT22);
    
    @Nullable
    public Object getChangePayload(T2 paramT21, T2 paramT22)
    {
      return null;
    }
    
    public abstract void onChanged(int paramInt1, int paramInt2);
    
    public void onChanged(int paramInt1, int paramInt2, Object paramObject)
    {
      onChanged(paramInt1, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.SortedList
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */