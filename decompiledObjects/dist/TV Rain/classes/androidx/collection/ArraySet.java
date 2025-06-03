package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ArraySet<E>
  implements Collection<E>, Set<E>
{
  private static final int BASE_SIZE = 4;
  private static final int CACHE_SIZE = 10;
  private static final boolean DEBUG = false;
  private static final int[] INT = new int[0];
  private static final Object[] OBJECT = new Object[0];
  private static final String TAG = "ArraySet";
  @Nullable
  private static Object[] sBaseCache;
  private static int sBaseCacheSize;
  @Nullable
  private static Object[] sTwiceBaseCache;
  private static int sTwiceBaseCacheSize;
  public Object[] mArray;
  private MapCollections<E, E> mCollections;
  private int[] mHashes;
  public int mSize;
  
  public ArraySet()
  {
    this(0);
  }
  
  public ArraySet(int paramInt)
  {
    if (paramInt == 0)
    {
      mHashes = INT;
      mArray = OBJECT;
    }
    else
    {
      allocArrays(paramInt);
    }
    mSize = 0;
  }
  
  public ArraySet(@Nullable ArraySet<E> paramArraySet)
  {
    this();
    if (paramArraySet != null) {
      addAll(paramArraySet);
    }
  }
  
  public ArraySet(@Nullable Collection<E> paramCollection)
  {
    this();
    if (paramCollection != null) {
      addAll(paramCollection);
    }
  }
  
  private void allocArrays(int paramInt)
  {
    if (paramInt == 8) {
      try
      {
        Object[] arrayOfObject1 = sTwiceBaseCache;
        if (arrayOfObject1 != null)
        {
          mArray = arrayOfObject1;
          sTwiceBaseCache = (Object[])arrayOfObject1[0];
          mHashes = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          sTwiceBaseCacheSize -= 1;
          return;
        }
      }
      finally {}
    }
    if (paramInt == 4) {
      try
      {
        Object[] arrayOfObject2 = sBaseCache;
        if (arrayOfObject2 != null)
        {
          mArray = arrayOfObject2;
          sBaseCache = (Object[])arrayOfObject2[0];
          mHashes = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          sBaseCacheSize -= 1;
          return;
        }
      }
      finally {}
    }
    mHashes = new int[paramInt];
    mArray = new Object[paramInt];
  }
  
  private static void freeArrays(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (sTwiceBaseCacheSize < 10)
        {
          paramArrayOfObject[0] = sTwiceBaseCache;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          while (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
          }
          sTwiceBaseCache = paramArrayOfObject;
          sTwiceBaseCacheSize += 1;
        }
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (sBaseCacheSize < 10)
        {
          paramArrayOfObject[0] = sBaseCache;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          while (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
          }
          sBaseCache = paramArrayOfObject;
          sBaseCacheSize += 1;
        }
      }
      finally {}
    }
  }
  
  private MapCollections<E, E> getCollection()
  {
    if (mCollections == null) {
      mCollections = new MapCollections()
      {
        public void colClear()
        {
          clear();
        }
        
        public Object colGetEntry(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return mArray[paramAnonymousInt1];
        }
        
        public Map<E, E> colGetMap()
        {
          throw new UnsupportedOperationException("not a map");
        }
        
        public int colGetSize()
        {
          return mSize;
        }
        
        public int colIndexOfKey(Object paramAnonymousObject)
        {
          return indexOf(paramAnonymousObject);
        }
        
        public int colIndexOfValue(Object paramAnonymousObject)
        {
          return indexOf(paramAnonymousObject);
        }
        
        public void colPut(E paramAnonymousE1, E paramAnonymousE2)
        {
          add(paramAnonymousE1);
        }
        
        public void colRemoveAt(int paramAnonymousInt)
        {
          removeAt(paramAnonymousInt);
        }
        
        public E colSetValue(int paramAnonymousInt, E paramAnonymousE)
        {
          throw new UnsupportedOperationException("not a map");
        }
      };
    }
    return mCollections;
  }
  
  private int indexOf(Object paramObject, int paramInt)
  {
    int i = mSize;
    if (i == 0) {
      return -1;
    }
    int j = ContainerHelpers.binarySearch(mHashes, i, paramInt);
    if (j < 0) {
      return j;
    }
    if (paramObject.equals(mArray[j])) {
      return j;
    }
    for (int k = j + 1; (k < i) && (mHashes[k] == paramInt); k++) {
      if (paramObject.equals(mArray[k])) {
        return k;
      }
    }
    j--;
    while ((j >= 0) && (mHashes[j] == paramInt))
    {
      if (paramObject.equals(mArray[j])) {
        return j;
      }
      j--;
    }
    return k;
  }
  
  private int indexOfNull()
  {
    int i = mSize;
    if (i == 0) {
      return -1;
    }
    int j = ContainerHelpers.binarySearch(mHashes, i, 0);
    if (j < 0) {
      return j;
    }
    if (mArray[j] == null) {
      return j;
    }
    for (int k = j + 1; (k < i) && (mHashes[k] == 0); k++) {
      if (mArray[k] == null) {
        return k;
      }
    }
    for (i = j - 1; (i >= 0) && (mHashes[i] == 0); i--) {
      if (mArray[i] == null) {
        return i;
      }
    }
    return k;
  }
  
  public boolean add(@Nullable E paramE)
  {
    int i;
    int j;
    if (paramE == null)
    {
      i = indexOfNull();
      j = 0;
    }
    else
    {
      j = paramE.hashCode();
      i = indexOf(paramE, j);
    }
    if (i >= 0) {
      return false;
    }
    int k = i;
    int m = mSize;
    Object localObject = mHashes;
    if (m >= localObject.length)
    {
      i = 4;
      if (m >= 8) {
        i = (m >> 1) + m;
      } else if (m >= 4) {
        i = 8;
      }
      Object[] arrayOfObject = mArray;
      allocArrays(i);
      int[] arrayOfInt = mHashes;
      if (arrayOfInt.length > 0)
      {
        System.arraycopy(localObject, 0, arrayOfInt, 0, localObject.length);
        System.arraycopy(arrayOfObject, 0, mArray, 0, arrayOfObject.length);
      }
      freeArrays((int[])localObject, arrayOfObject, mSize);
    }
    m = mSize;
    if (k < m)
    {
      localObject = mHashes;
      i = k + 1;
      System.arraycopy(localObject, k, localObject, i, m - k);
      localObject = mArray;
      System.arraycopy(localObject, k, localObject, i, mSize - k);
    }
    mHashes[k] = j;
    mArray[k] = paramE;
    mSize += 1;
    return true;
  }
  
  public void addAll(@NonNull ArraySet<? extends E> paramArraySet)
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
        System.arraycopy(mArray, 0, mArray, 0, i);
        mSize = i;
      }
    }
    else {
      while (k < i)
      {
        add(paramArraySet.valueAt(k));
        k++;
      }
    }
  }
  
  public boolean addAll(@NonNull Collection<? extends E> paramCollection)
  {
    int i = mSize;
    ensureCapacity(paramCollection.size() + i);
    paramCollection = paramCollection.iterator();
    boolean bool = false;
    while (paramCollection.hasNext()) {
      bool |= add(paramCollection.next());
    }
    return bool;
  }
  
  public void clear()
  {
    int i = mSize;
    if (i != 0)
    {
      freeArrays(mHashes, mArray, i);
      mHashes = INT;
      mArray = OBJECT;
      mSize = 0;
    }
  }
  
  public boolean contains(@Nullable Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsAll(@NonNull Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public void ensureCapacity(int paramInt)
  {
    int[] arrayOfInt = mHashes;
    if (arrayOfInt.length < paramInt)
    {
      Object[] arrayOfObject = mArray;
      allocArrays(paramInt);
      paramInt = mSize;
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, mHashes, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, mArray, 0, mSize);
      }
      freeArrays(arrayOfInt, arrayOfObject, mSize);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    int i;
    if ((paramObject instanceof Set))
    {
      paramObject = (Set)paramObject;
      if (size() != ((Set)paramObject).size()) {
        return false;
      }
      i = 0;
    }
    try
    {
      while (i < mSize)
      {
        boolean bool = ((Set)paramObject).contains(valueAt(i));
        if (!bool) {
          return false;
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
  
  public int hashCode()
  {
    int[] arrayOfInt = mHashes;
    int i = mSize;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfInt[j];
      j++;
    }
    return k;
  }
  
  public int indexOf(@Nullable Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = indexOfNull();
    } else {
      i = indexOf(paramObject, paramObject.hashCode());
    }
    return i;
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
  
  public Iterator<E> iterator()
  {
    return getCollection().getKeySet().iterator();
  }
  
  public boolean remove(@Nullable Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i >= 0)
    {
      removeAt(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(@NonNull ArraySet<? extends E> paramArraySet)
  {
    int i = mSize;
    int j = mSize;
    boolean bool = false;
    for (int k = 0; k < i; k++) {
      remove(paramArraySet.valueAt(k));
    }
    if (j != mSize) {
      bool = true;
    }
    return bool;
  }
  
  public boolean removeAll(@NonNull Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    boolean bool = false;
    while (paramCollection.hasNext()) {
      bool |= remove(paramCollection.next());
    }
    return bool;
  }
  
  public E removeAt(int paramInt)
  {
    Object[] arrayOfObject = mArray;
    Object localObject1 = arrayOfObject[paramInt];
    int i = mSize;
    if (i <= 1)
    {
      freeArrays(mHashes, arrayOfObject, i);
      mHashes = INT;
      mArray = OBJECT;
      mSize = 0;
    }
    else
    {
      Object localObject2 = mHashes;
      int j = localObject2.length;
      int k = 8;
      if ((j > 8) && (i < localObject2.length / 3))
      {
        if (i > 8) {
          k = i + (i >> 1);
        }
        allocArrays(k);
        mSize -= 1;
        if (paramInt > 0)
        {
          System.arraycopy(localObject2, 0, mHashes, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, mArray, 0, paramInt);
        }
        k = mSize;
        if (paramInt < k)
        {
          i = paramInt + 1;
          System.arraycopy(localObject2, i, mHashes, paramInt, k - paramInt);
          System.arraycopy(arrayOfObject, i, mArray, paramInt, mSize - paramInt);
        }
      }
      else
      {
        k = i - 1;
        mSize = k;
        if (paramInt < k)
        {
          i = paramInt + 1;
          System.arraycopy(localObject2, i, localObject2, paramInt, k - paramInt);
          localObject2 = mArray;
          System.arraycopy(localObject2, i, localObject2, paramInt, mSize - paramInt);
        }
        mArray[mSize] = null;
      }
    }
    return (E)localObject1;
  }
  
  public boolean retainAll(@NonNull Collection<?> paramCollection)
  {
    int i = mSize - 1;
    boolean bool = false;
    while (i >= 0)
    {
      if (!paramCollection.contains(mArray[i]))
      {
        removeAt(i);
        bool = true;
      }
      i--;
    }
    return bool;
  }
  
  public int size()
  {
    return mSize;
  }
  
  @NonNull
  public Object[] toArray()
  {
    int i = mSize;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(mArray, 0, arrayOfObject, 0, i);
    return arrayOfObject;
  }
  
  @NonNull
  public <T> T[] toArray(@NonNull T[] paramArrayOfT)
  {
    Object localObject = paramArrayOfT;
    if (paramArrayOfT.length < mSize) {
      localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), mSize);
    }
    System.arraycopy(mArray, 0, localObject, 0, mSize);
    int i = localObject.length;
    int j = mSize;
    if (i > j) {
      localObject[j] = null;
    }
    return (T[])localObject;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(mSize * 14);
    localStringBuilder.append('{');
    for (int i = 0; i < mSize; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = valueAt(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Set)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  @Nullable
  public E valueAt(int paramInt)
  {
    return (E)mArray[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.collection.ArraySet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */