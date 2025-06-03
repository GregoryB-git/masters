package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SparseArrayCompat<E>
  implements Cloneable
{
  private static final Object DELETED = new Object();
  private boolean mGarbage = false;
  private int[] mKeys;
  private int mSize;
  private Object[] mValues;
  
  public SparseArrayCompat()
  {
    this(10);
  }
  
  public SparseArrayCompat(int paramInt)
  {
    if (paramInt == 0)
    {
      mKeys = ContainerHelpers.EMPTY_INTS;
      mValues = ContainerHelpers.EMPTY_OBJECTS;
    }
    else
    {
      paramInt = ContainerHelpers.idealIntArraySize(paramInt);
      mKeys = new int[paramInt];
      mValues = new Object[paramInt];
    }
  }
  
  private void gc()
  {
    int i = mSize;
    int[] arrayOfInt = mKeys;
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
          arrayOfInt[k] = arrayOfInt[j];
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
  
  public void append(int paramInt, E paramE)
  {
    int i = mSize;
    if ((i != 0) && (paramInt <= mKeys[(i - 1)]))
    {
      put(paramInt, paramE);
      return;
    }
    if ((mGarbage) && (i >= mKeys.length)) {
      gc();
    }
    int j = mSize;
    if (j >= mKeys.length)
    {
      i = ContainerHelpers.idealIntArraySize(j + 1);
      int[] arrayOfInt = new int[i];
      Object[] arrayOfObject = new Object[i];
      Object localObject = mKeys;
      System.arraycopy(localObject, 0, arrayOfInt, 0, localObject.length);
      localObject = mValues;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      mKeys = arrayOfInt;
      mValues = arrayOfObject;
    }
    mKeys[j] = paramInt;
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
  
  public SparseArrayCompat<E> clone()
  {
    try
    {
      SparseArrayCompat localSparseArrayCompat = (SparseArrayCompat)super.clone();
      mKeys = ((int[])mKeys.clone());
      mValues = ((Object[])mValues.clone());
      return localSparseArrayCompat;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public boolean containsKey(int paramInt)
  {
    boolean bool;
    if (indexOfKey(paramInt) >= 0) {
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
  public void delete(int paramInt)
  {
    remove(paramInt);
  }
  
  @Nullable
  public E get(int paramInt)
  {
    return (E)get(paramInt, null);
  }
  
  public E get(int paramInt, E paramE)
  {
    paramInt = ContainerHelpers.binarySearch(mKeys, mSize, paramInt);
    if (paramInt >= 0)
    {
      Object localObject = mValues[paramInt];
      if (localObject != DELETED) {
        return (E)localObject;
      }
    }
    return paramE;
  }
  
  public int indexOfKey(int paramInt)
  {
    if (mGarbage) {
      gc();
    }
    return ContainerHelpers.binarySearch(mKeys, mSize, paramInt);
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
  
  public int keyAt(int paramInt)
  {
    if (mGarbage) {
      gc();
    }
    return mKeys[paramInt];
  }
  
  public void put(int paramInt, E paramE)
  {
    int i = ContainerHelpers.binarySearch(mKeys, mSize, paramInt);
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
          mKeys[j] = paramInt;
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
          i = ContainerHelpers.binarySearch(mKeys, mSize, paramInt);
        }
      }
      j = mSize;
      if (j >= mKeys.length)
      {
        j = ContainerHelpers.idealIntArraySize(j + 1);
        localObject1 = new int[j];
        Object[] arrayOfObject = new Object[j];
        Object localObject2 = mKeys;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        localObject2 = mValues;
        System.arraycopy(localObject2, 0, arrayOfObject, 0, localObject2.length);
        mKeys = ((int[])localObject1);
        mValues = arrayOfObject;
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
      mKeys[i] = paramInt;
      mValues[i] = paramE;
      mSize += 1;
    }
  }
  
  public void putAll(@NonNull SparseArrayCompat<? extends E> paramSparseArrayCompat)
  {
    int i = paramSparseArrayCompat.size();
    for (int j = 0; j < i; j++) {
      put(paramSparseArrayCompat.keyAt(j), paramSparseArrayCompat.valueAt(j));
    }
  }
  
  @Nullable
  public E putIfAbsent(int paramInt, E paramE)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      put(paramInt, paramE);
    }
    return (E)localObject;
  }
  
  public void remove(int paramInt)
  {
    paramInt = ContainerHelpers.binarySearch(mKeys, mSize, paramInt);
    if (paramInt >= 0)
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
  }
  
  public boolean remove(int paramInt, Object paramObject)
  {
    paramInt = indexOfKey(paramInt);
    if (paramInt >= 0)
    {
      Object localObject = valueAt(paramInt);
      if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject))))
      {
        removeAt(paramInt);
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
  
  public void removeAtRange(int paramInt1, int paramInt2)
  {
    paramInt2 = Math.min(mSize, paramInt2 + paramInt1);
    while (paramInt1 < paramInt2)
    {
      removeAt(paramInt1);
      paramInt1++;
    }
  }
  
  @Nullable
  public E replace(int paramInt, E paramE)
  {
    paramInt = indexOfKey(paramInt);
    if (paramInt >= 0)
    {
      Object[] arrayOfObject = mValues;
      Object localObject = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramE;
      return (E)localObject;
    }
    return null;
  }
  
  public boolean replace(int paramInt, E paramE1, E paramE2)
  {
    paramInt = indexOfKey(paramInt);
    if (paramInt >= 0)
    {
      Object localObject = mValues[paramInt];
      if ((localObject == paramE1) || ((paramE1 != null) && (paramE1.equals(localObject))))
      {
        mValues[paramInt] = paramE2;
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
 * Qualified Name:     androidx.collection.SparseArrayCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */