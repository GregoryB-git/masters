package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class SimpleArrayMap<K, V>
{
  private static final int BASE_SIZE = 4;
  private static final int CACHE_SIZE = 10;
  private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
  private static final boolean DEBUG = false;
  private static final String TAG = "ArrayMap";
  @Nullable
  public static Object[] mBaseCache;
  public static int mBaseCacheSize;
  @Nullable
  public static Object[] mTwiceBaseCache;
  public static int mTwiceBaseCacheSize;
  public Object[] mArray;
  public int[] mHashes;
  public int mSize;
  
  public SimpleArrayMap()
  {
    mHashes = ContainerHelpers.EMPTY_INTS;
    mArray = ContainerHelpers.EMPTY_OBJECTS;
    mSize = 0;
  }
  
  public SimpleArrayMap(int paramInt)
  {
    if (paramInt == 0)
    {
      mHashes = ContainerHelpers.EMPTY_INTS;
      mArray = ContainerHelpers.EMPTY_OBJECTS;
    }
    else
    {
      allocArrays(paramInt);
    }
    mSize = 0;
  }
  
  public SimpleArrayMap(SimpleArrayMap<K, V> paramSimpleArrayMap)
  {
    this();
    if (paramSimpleArrayMap != null) {
      putAll(paramSimpleArrayMap);
    }
  }
  
  private void allocArrays(int paramInt)
  {
    if (paramInt == 8) {
      try
      {
        Object[] arrayOfObject1 = mTwiceBaseCache;
        if (arrayOfObject1 != null)
        {
          mArray = arrayOfObject1;
          mTwiceBaseCache = (Object[])arrayOfObject1[0];
          mHashes = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          mTwiceBaseCacheSize -= 1;
          return;
        }
      }
      finally {}
    }
    if (paramInt == 4) {
      try
      {
        Object[] arrayOfObject2 = mBaseCache;
        if (arrayOfObject2 != null)
        {
          mArray = arrayOfObject2;
          mBaseCache = (Object[])arrayOfObject2[0];
          mHashes = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          mBaseCacheSize -= 1;
          return;
        }
      }
      finally {}
    }
    mHashes = new int[paramInt];
    mArray = new Object[paramInt << 1];
  }
  
  private static int binarySearchHashes(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = ContainerHelpers.binarySearch(paramArrayOfInt, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfInt)
    {
      throw new ConcurrentModificationException();
    }
  }
  
  private static void freeArrays(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (mTwiceBaseCacheSize < 10)
        {
          paramArrayOfObject[0] = mTwiceBaseCache;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
          mTwiceBaseCache = paramArrayOfObject;
          mTwiceBaseCacheSize += 1;
        }
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (mBaseCacheSize < 10)
        {
          paramArrayOfObject[0] = mBaseCache;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
          mBaseCache = paramArrayOfObject;
          mBaseCacheSize += 1;
        }
      }
      finally {}
    }
  }
  
  public void clear()
  {
    int i = mSize;
    if (i > 0)
    {
      int[] arrayOfInt = mHashes;
      Object[] arrayOfObject = mArray;
      mHashes = ContainerHelpers.EMPTY_INTS;
      mArray = ContainerHelpers.EMPTY_OBJECTS;
      mSize = 0;
      freeArrays(arrayOfInt, arrayOfObject, i);
    }
    if (mSize <= 0) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public boolean containsKey(@Nullable Object paramObject)
  {
    boolean bool;
    if (indexOfKey(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsValue(Object paramObject)
  {
    boolean bool;
    if (indexOfValue(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void ensureCapacity(int paramInt)
  {
    int i = mSize;
    int[] arrayOfInt = mHashes;
    if (arrayOfInt.length < paramInt)
    {
      Object[] arrayOfObject = mArray;
      allocArrays(paramInt);
      if (mSize > 0)
      {
        System.arraycopy(arrayOfInt, 0, mHashes, 0, i);
        System.arraycopy(arrayOfObject, 0, mArray, 0, i << 1);
      }
      freeArrays(arrayOfInt, arrayOfObject, i);
    }
    if (mSize == i) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    int i;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    boolean bool;
    if ((paramObject instanceof SimpleArrayMap))
    {
      paramObject = (SimpleArrayMap)paramObject;
      if (size() != ((SimpleArrayMap)paramObject).size()) {
        return false;
      }
      i = 0;
      try
      {
        while (i < mSize)
        {
          localObject1 = keyAt(i);
          localObject2 = valueAt(i);
          localObject3 = ((SimpleArrayMap)paramObject).get(localObject1);
          if (localObject2 == null)
          {
            if ((localObject3 != null) || (!((SimpleArrayMap)paramObject).containsKey(localObject1))) {
              return false;
            }
          }
          else
          {
            bool = localObject2.equals(localObject3);
            if (!bool) {
              return false;
            }
          }
          i++;
        }
        return true;
      }
      catch (NullPointerException|ClassCastException paramObject)
      {
        return false;
      }
    }
    if ((paramObject instanceof Map))
    {
      localObject1 = (Map)paramObject;
      if (size() != ((Map)localObject1).size()) {
        return false;
      }
      i = 0;
    }
    try
    {
      while (i < mSize)
      {
        localObject3 = keyAt(i);
        localObject2 = valueAt(i);
        paramObject = ((Map)localObject1).get(localObject3);
        if (localObject2 == null)
        {
          if ((paramObject != null) || (!((Map)localObject1).containsKey(localObject3))) {
            return false;
          }
        }
        else
        {
          bool = localObject2.equals(paramObject);
          if (!bool) {
            return false;
          }
        }
        i++;
      }
      return true;
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  @Nullable
  public V get(Object paramObject)
  {
    return (V)getOrDefault(paramObject, null);
  }
  
  public V getOrDefault(Object paramObject, V paramV)
  {
    int i = indexOfKey(paramObject);
    if (i >= 0) {
      paramV = mArray[((i << 1) + 1)];
    }
    return paramV;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = mHashes;
    Object[] arrayOfObject = mArray;
    int i = mSize;
    int j = 1;
    int k = 0;
    int m = k;
    while (k < i)
    {
      Object localObject = arrayOfObject[j];
      int n = arrayOfInt[k];
      int i1;
      if (localObject == null) {
        i1 = 0;
      } else {
        i1 = localObject.hashCode();
      }
      m += (i1 ^ n);
      k++;
      j += 2;
    }
    return m;
  }
  
  public int indexOf(Object paramObject, int paramInt)
  {
    int i = mSize;
    if (i == 0) {
      return -1;
    }
    int j = binarySearchHashes(mHashes, i, paramInt);
    if (j < 0) {
      return j;
    }
    if (paramObject.equals(mArray[(j << 1)])) {
      return j;
    }
    for (int k = j + 1; (k < i) && (mHashes[k] == paramInt); k++) {
      if (paramObject.equals(mArray[(k << 1)])) {
        return k;
      }
    }
    j--;
    while ((j >= 0) && (mHashes[j] == paramInt))
    {
      if (paramObject.equals(mArray[(j << 1)])) {
        return j;
      }
      j--;
    }
    return k;
  }
  
  public int indexOfKey(@Nullable Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = indexOfNull();
    } else {
      i = indexOf(paramObject, paramObject.hashCode());
    }
    return i;
  }
  
  public int indexOfNull()
  {
    int i = mSize;
    if (i == 0) {
      return -1;
    }
    int j = binarySearchHashes(mHashes, i, 0);
    if (j < 0) {
      return j;
    }
    if (mArray[(j << 1)] == null) {
      return j;
    }
    for (int k = j + 1; (k < i) && (mHashes[k] == 0); k++) {
      if (mArray[(k << 1)] == null) {
        return k;
      }
    }
    j--;
    while ((j >= 0) && (mHashes[j] == 0))
    {
      if (mArray[(j << 1)] == null) {
        return j;
      }
      j--;
    }
    return k;
  }
  
  int indexOfValue(Object paramObject)
  {
    int i = mSize * 2;
    Object[] arrayOfObject = mArray;
    if (paramObject == null) {
      for (j = 1; j < i; j += 2) {
        if (arrayOfObject[j] == null) {
          return j >> 1;
        }
      }
    }
    for (int j = 1; j < i; j += 2) {
      if (paramObject.equals(arrayOfObject[j])) {
        return j >> 1;
      }
    }
    return -1;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (mSize <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public K keyAt(int paramInt)
  {
    return (K)mArray[(paramInt << 1)];
  }
  
  @Nullable
  public V put(K paramK, V paramV)
  {
    int i = mSize;
    int k;
    if (paramK == null)
    {
      j = indexOfNull();
      k = 0;
    }
    else
    {
      k = paramK.hashCode();
      j = indexOf(paramK, k);
    }
    Object localObject;
    if (j >= 0)
    {
      j = (j << 1) + 1;
      localObject = mArray;
      paramK = localObject[j];
      localObject[j] = paramV;
      return paramK;
    }
    int m = j;
    int[] arrayOfInt1 = mHashes;
    if (i >= arrayOfInt1.length)
    {
      j = 4;
      if (i >= 8) {
        j = (i >> 1) + i;
      } else if (i >= 4) {
        j = 8;
      }
      localObject = mArray;
      allocArrays(j);
      if (i == mSize)
      {
        int[] arrayOfInt2 = mHashes;
        if (arrayOfInt2.length > 0)
        {
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
          System.arraycopy(localObject, 0, mArray, 0, localObject.length);
        }
        freeArrays(arrayOfInt1, (Object[])localObject, i);
      }
      else
      {
        throw new ConcurrentModificationException();
      }
    }
    if (m < i)
    {
      localObject = mHashes;
      j = m + 1;
      System.arraycopy(localObject, m, localObject, j, i - m);
      localObject = mArray;
      System.arraycopy(localObject, m << 1, localObject, j << 1, mSize - m << 1);
    }
    int j = mSize;
    if (i == j)
    {
      localObject = mHashes;
      if (m < localObject.length)
      {
        localObject[m] = k;
        localObject = mArray;
        k = m << 1;
        localObject[k] = paramK;
        localObject[(k + 1)] = paramV;
        mSize = (j + 1);
        return null;
      }
    }
    throw new ConcurrentModificationException();
  }
  
  public void putAll(@NonNull SimpleArrayMap<? extends K, ? extends V> paramSimpleArrayMap)
  {
    int i = mSize;
    ensureCapacity(mSize + i);
    int j = mSize;
    int k = 0;
    if (j == 0)
    {
      if (i > 0)
      {
        System.arraycopy(mHashes, 0, mHashes, 0, i);
        System.arraycopy(mArray, 0, mArray, 0, i << 1);
        mSize = i;
      }
    }
    else {
      while (k < i)
      {
        put(paramSimpleArrayMap.keyAt(k), paramSimpleArrayMap.valueAt(k));
        k++;
      }
    }
  }
  
  @Nullable
  public V putIfAbsent(K paramK, V paramV)
  {
    Object localObject1 = get(paramK);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = put(paramK, paramV);
    }
    return (V)localObject2;
  }
  
  @Nullable
  public V remove(Object paramObject)
  {
    int i = indexOfKey(paramObject);
    if (i >= 0) {
      return (V)removeAt(i);
    }
    return null;
  }
  
  public boolean remove(Object paramObject1, Object paramObject2)
  {
    int i = indexOfKey(paramObject1);
    if (i >= 0)
    {
      paramObject1 = valueAt(i);
      if ((paramObject2 == paramObject1) || ((paramObject2 != null) && (paramObject2.equals(paramObject1))))
      {
        removeAt(i);
        return true;
      }
    }
    return false;
  }
  
  public V removeAt(int paramInt)
  {
    Object[] arrayOfObject = mArray;
    int i = paramInt << 1;
    Object localObject1 = arrayOfObject[(i + 1)];
    int j = mSize;
    int k = 0;
    if (j <= 1)
    {
      freeArrays(mHashes, arrayOfObject, j);
      mHashes = ContainerHelpers.EMPTY_INTS;
      mArray = ContainerHelpers.EMPTY_OBJECTS;
      paramInt = k;
    }
    else
    {
      int m = j - 1;
      int[] arrayOfInt = mHashes;
      int n = arrayOfInt.length;
      k = 8;
      Object localObject2;
      if ((n > 8) && (j < arrayOfInt.length / 3))
      {
        if (j > 8) {
          k = j + (j >> 1);
        }
        allocArrays(k);
        if (j == mSize)
        {
          if (paramInt > 0)
          {
            System.arraycopy(arrayOfInt, 0, mHashes, 0, paramInt);
            System.arraycopy(arrayOfObject, 0, mArray, 0, i);
          }
          if (paramInt < m)
          {
            k = paramInt + 1;
            localObject2 = mHashes;
            n = m - paramInt;
            System.arraycopy(arrayOfInt, k, localObject2, paramInt, n);
            System.arraycopy(arrayOfObject, k << 1, mArray, i, n << 1);
          }
        }
        else
        {
          throw new ConcurrentModificationException();
        }
      }
      else
      {
        if (paramInt < m)
        {
          n = paramInt + 1;
          k = m - paramInt;
          System.arraycopy(arrayOfInt, n, arrayOfInt, paramInt, k);
          localObject2 = mArray;
          System.arraycopy(localObject2, n << 1, localObject2, i, k << 1);
        }
        localObject2 = mArray;
        paramInt = m << 1;
        localObject2[paramInt] = null;
        localObject2[(paramInt + 1)] = null;
      }
      paramInt = m;
    }
    if (j == mSize)
    {
      mSize = paramInt;
      return (V)localObject1;
    }
    throw new ConcurrentModificationException();
  }
  
  @Nullable
  public V replace(K paramK, V paramV)
  {
    int i = indexOfKey(paramK);
    if (i >= 0) {
      return (V)setValueAt(i, paramV);
    }
    return null;
  }
  
  public boolean replace(K paramK, V paramV1, V paramV2)
  {
    int i = indexOfKey(paramK);
    if (i >= 0)
    {
      paramK = valueAt(i);
      if ((paramK == paramV1) || ((paramV1 != null) && (paramV1.equals(paramK))))
      {
        setValueAt(i, paramV2);
        return true;
      }
    }
    return false;
  }
  
  public V setValueAt(int paramInt, V paramV)
  {
    paramInt = (paramInt << 1) + 1;
    Object[] arrayOfObject = mArray;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramV;
    return (V)localObject;
  }
  
  public int size()
  {
    return mSize;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(mSize * 28);
    localStringBuilder.append('{');
    for (int i = 0; i < mSize; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = keyAt(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
      localStringBuilder.append('=');
      localObject = valueAt(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public V valueAt(int paramInt)
  {
    return (V)mArray[((paramInt << 1) + 1)];
  }
}

/* Location:
 * Qualified Name:     androidx.collection.SimpleArrayMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */