package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LongSparseArray<E>
  implements Cloneable
{
  private static final Object DELETED = new Object();
  private boolean mGarbage = false;
  private long[] mKeys;
  private int mSize;
  private Object[] mValues;
  
  public LongSparseArray()
  {
    this(10);
  }
  
  public LongSparseArray(int paramInt)
  {
    if (paramInt == 0)
    {
      mKeys = ContainerHelpers.EMPTY_LONGS;
      mValues = ContainerHelpers.EMPTY_OBJECTS;
    }
    else
    {
      paramInt = ContainerHelpers.idealLongArraySize(paramInt);
      mKeys = new long[paramInt];
      mValues = new Object[paramInt];
    }
  }
  
  private void gc()
  {
    int i = mSize;
    long[] arrayOfLong = mKeys;
    Object[] arrayOfObject = mValues;
    int j = 0;
    int m;
    for (int k = j; j < i; k = m)
    {
      Object localObject = arrayOfObject[j];
      m = k;
      if (localObject != DELETED)
      {
        if (j != k)
        {
          arrayOfLong[k] = arrayOfLong[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        m = k + 1;
      }
      j++;
    }
    mGarbage = false;
    mSize = k;
  }
  
  public void append(long paramLong, E paramE)
  {
    int i = mSize;
    if ((i != 0) && (paramLong <= mKeys[(i - 1)]))
    {
      put(paramLong, paramE);
      return;
    }
    if ((mGarbage) && (i >= mKeys.length)) {
      gc();
    }
    int j = mSize;
    if (j >= mKeys.length)
    {
      i = ContainerHelpers.idealLongArraySize(j + 1);
      long[] arrayOfLong = new long[i];
      Object[] arrayOfObject = new Object[i];
      Object localObject = mKeys;
      System.arraycopy(localObject, 0, arrayOfLong, 0, localObject.length);
      localObject = mValues;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      mKeys = arrayOfLong;
      mValues = arrayOfObject;
    }
    mKeys[j] = paramLong;
    mValues[j] = paramE;
    mSize = (j + 1);
  }
  
  public void clear()
  {
    int i = mSize;
    Object[] arrayOfObject = mValues;
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = null;
    }
    mSize = 0;
    mGarbage = false;
  }
  
  public LongSparseArray<E> clone()
  {
    try
    {
      LongSparseArray localLongSparseArray = (LongSparseArray)super.clone();
      mKeys = ((long[])mKeys.clone());
      mValues = ((Object[])mValues.clone());
      return localLongSparseArray;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public boolean containsKey(long paramLong)
  {
    boolean bool;
    if (indexOfKey(paramLong) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsValue(E paramE)
  {
    boolean bool;
    if (indexOfValue(paramE) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public void delete(long paramLong)
  {
    remove(paramLong);
  }
  
  @Nullable
  public E get(long paramLong)
  {
    return (E)get(paramLong, null);
  }
  
  public E get(long paramLong, E paramE)
  {
    int i = ContainerHelpers.binarySearch(mKeys, mSize, paramLong);
    if (i >= 0)
    {
      Object localObject = mValues[i];
      if (localObject != DELETED) {
        return (E)localObject;
      }
    }
    return paramE;
  }
  
  public int indexOfKey(long paramLong)
  {
    if (mGarbage) {
      gc();
    }
    return ContainerHelpers.binarySearch(mKeys, mSize, paramLong);
  }
  
  public int indexOfValue(E paramE)
  {
    if (mGarbage) {
      gc();
    }
    for (int i = 0; i < mSize; i++) {
      if (mValues[i] == paramE) {
        return i;
      }
    }
    return -1;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public long keyAt(int paramInt)
  {
    if (mGarbage) {
      gc();
    }
    return mKeys[paramInt];
  }
  
  public void put(long paramLong, E paramE)
  {
    int i = ContainerHelpers.binarySearch(mKeys, mSize, paramLong);
    if (i >= 0)
    {
      mValues[i] = paramE;
    }
    else
    {
      int j = i;
      int k = mSize;
      Object localObject1;
      if (j < k)
      {
        localObject1 = mValues;
        if (localObject1[j] == DELETED)
        {
          mKeys[j] = paramLong;
          localObject1[j] = paramE;
          return;
        }
      }
      i = j;
      if (mGarbage)
      {
        i = j;
        if (k >= mKeys.length)
        {
          gc();
          i = ContainerHelpers.binarySearch(mKeys, mSize, paramLong);
        }
      }
      j = mSize;
      if (j >= mKeys.length)
      {
        j = ContainerHelpers.idealLongArraySize(j + 1);
        long[] arrayOfLong = new long[j];
        localObject1 = new Object[j];
        Object localObject2 = mKeys;
        System.arraycopy(localObject2, 0, arrayOfLong, 0, localObject2.length);
        localObject2 = mValues;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        mKeys = arrayOfLong;
        mValues = ((Object[])localObject1);
      }
      j = mSize;
      if (j - i != 0)
      {
        localObject1 = mKeys;
        k = i + 1;
        System.arraycopy(localObject1, i, localObject1, k, j - i);
        localObject1 = mValues;
        System.arraycopy(localObject1, i, localObject1, k, mSize - i);
      }
      mKeys[i] = paramLong;
      mValues[i] = paramE;
      mSize += 1;
    }
  }
  
  public void putAll(@NonNull LongSparseArray<? extends E> paramLongSparseArray)
  {
    int i = paramLongSparseArray.size();
    for (int j = 0; j < i; j++) {
      put(paramLongSparseArray.keyAt(j), paramLongSparseArray.valueAt(j));
    }
  }
  
  @Nullable
  public E putIfAbsent(long paramLong, E paramE)
  {
    Object localObject = get(paramLong);
    if (localObject == null) {
      put(paramLong, paramE);
    }
    return (E)localObject;
  }
  
  public void remove(long paramLong)
  {
    int i = ContainerHelpers.binarySearch(mKeys, mSize, paramLong);
    if (i >= 0)
    {
      Object[] arrayOfObject = mValues;
      Object localObject1 = arrayOfObject[i];
      Object localObject2 = DELETED;
      if (localObject1 != localObject2)
      {
        arrayOfObject[i] = localObject2;
        mGarbage = true;
      }
    }
  }
  
  public boolean remove(long paramLong, Object paramObject)
  {
    int i = indexOfKey(paramLong);
    if (i >= 0)
    {
      Object localObject = valueAt(i);
      if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject))))
      {
        removeAt(i);
        return true;
      }
    }
    return false;
  }
  
  public void removeAt(int paramInt)
  {
    Object[] arrayOfObject = mValues;
    Object localObject1 = arrayOfObject[paramInt];
    Object localObject2 = DELETED;
    if (localObject1 != localObject2)
    {
      arrayOfObject[paramInt] = localObject2;
      mGarbage = true;
    }
  }
  
  @Nullable
  public E replace(long paramLong, E paramE)
  {
    int i = indexOfKey(paramLong);
    if (i >= 0)
    {
      Object[] arrayOfObject = mValues;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = paramE;
      return (E)localObject;
    }
    return null;
  }
  
  public boolean replace(long paramLong, E paramE1, E paramE2)
  {
    int i = indexOfKey(paramLong);
    if (i >= 0)
    {
      Object localObject = mValues[i];
      if ((localObject == paramE1) || ((paramE1 != null) && (paramE1.equals(localObject))))
      {
        mValues[i] = paramE2;
        return true;
      }
    }
    return false;
  }
  
  public void setValueAt(int paramInt, E paramE)
  {
    if (mGarbage) {
      gc();
    }
    mValues[paramInt] = paramE;
  }
  
  public int size()
  {
    if (mGarbage) {
      gc();
    }
    return mSize;
  }
  
  public String toString()
  {
    if (size() <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(mSize * 28);
    localStringBuilder.append('{');
    for (int i = 0; i < mSize; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(keyAt(i));
      localStringBuilder.append('=');
      Object localObject = valueAt(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public E valueAt(int paramInt)
  {
    if (mGarbage) {
      gc();
    }
    return (E)mValues[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.collection.LongSparseArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */