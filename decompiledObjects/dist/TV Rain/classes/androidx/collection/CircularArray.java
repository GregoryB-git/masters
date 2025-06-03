package androidx.collection;

public final class CircularArray<E>
{
  private int mCapacityBitmask;
  private E[] mElements;
  private int mHead;
  private int mTail;
  
  public CircularArray()
  {
    this(8);
  }
  
  public CircularArray(int paramInt)
  {
    if (paramInt >= 1)
    {
      if (paramInt <= 1073741824)
      {
        int i = paramInt;
        if (Integer.bitCount(paramInt) != 1) {
          i = Integer.highestOneBit(paramInt - 1) << 1;
        }
        mCapacityBitmask = (i - 1);
        mElements = new Object[i];
        return;
      }
      throw new IllegalArgumentException("capacity must be <= 2^30");
    }
    throw new IllegalArgumentException("capacity must be >= 1");
  }
  
  private void doubleCapacity()
  {
    Object[] arrayOfObject1 = mElements;
    int i = arrayOfObject1.length;
    int j = mHead;
    int k = i - j;
    int m = i << 1;
    if (m >= 0)
    {
      Object[] arrayOfObject2 = new Object[m];
      System.arraycopy(arrayOfObject1, j, arrayOfObject2, 0, k);
      System.arraycopy(mElements, 0, arrayOfObject2, k, mHead);
      mElements = arrayOfObject2;
      mHead = 0;
      mTail = i;
      mCapacityBitmask = (m - 1);
      return;
    }
    throw new RuntimeException("Max array capacity exceeded");
  }
  
  public void addFirst(E paramE)
  {
    int i = mHead - 1 & mCapacityBitmask;
    mHead = i;
    mElements[i] = paramE;
    if (i == mTail) {
      doubleCapacity();
    }
  }
  
  public void addLast(E paramE)
  {
    Object[] arrayOfObject = mElements;
    int i = mTail;
    arrayOfObject[i] = paramE;
    i = mCapacityBitmask & i + 1;
    mTail = i;
    if (i == mHead) {
      doubleCapacity();
    }
  }
  
  public void clear()
  {
    removeFromStart(size());
  }
  
  public E get(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < size()))
    {
      Object[] arrayOfObject = mElements;
      int i = mHead;
      return (E)arrayOfObject[(mCapacityBitmask & i + paramInt)];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public E getFirst()
  {
    int i = mHead;
    if (i != mTail) {
      return (E)mElements[i];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public E getLast()
  {
    int i = mHead;
    int j = mTail;
    if (i != j) {
      return (E)mElements[(j - 1 & mCapacityBitmask)];
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (mHead == mTail) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public E popFirst()
  {
    int i = mHead;
    if (i != mTail)
    {
      Object[] arrayOfObject = mElements;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      mHead = (i + 1 & mCapacityBitmask);
      return (E)localObject;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public E popLast()
  {
    int i = mHead;
    int j = mTail;
    if (i != j)
    {
      i = mCapacityBitmask & j - 1;
      Object[] arrayOfObject = mElements;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      mTail = i;
      return (E)localObject;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void removeFromEnd(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    if (paramInt <= size())
    {
      int i = 0;
      int j = mTail;
      if (paramInt < j) {
        i = j - paramInt;
      }
      int k;
      for (j = i;; j++)
      {
        k = mTail;
        if (j >= k) {
          break;
        }
        mElements[j] = null;
      }
      i = k - i;
      paramInt -= i;
      mTail = (k - i);
      if (paramInt > 0)
      {
        i = mElements.length;
        mTail = i;
        i -= paramInt;
        for (paramInt = i; paramInt < mTail; paramInt++) {
          mElements[paramInt] = null;
        }
        mTail = i;
      }
      return;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void removeFromStart(int paramInt)
  {
    if (paramInt <= 0) {
      return;
    }
    if (paramInt <= size())
    {
      int i = mElements.length;
      int j = mHead;
      int k = i;
      int m = j;
      if (paramInt < i - j) {
        k = j + paramInt;
      }
      for (m = j; m < k; m++) {
        mElements[m] = null;
      }
      m = mHead;
      j = k - m;
      k = paramInt - j;
      mHead = (mCapacityBitmask & m + j);
      if (k > 0)
      {
        for (paramInt = 0; paramInt < k; paramInt++) {
          mElements[paramInt] = null;
        }
        mHead = k;
      }
      return;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public int size()
  {
    return mTail - mHead & mCapacityBitmask;
  }
}

/* Location:
 * Qualified Name:     androidx.collection.CircularArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */