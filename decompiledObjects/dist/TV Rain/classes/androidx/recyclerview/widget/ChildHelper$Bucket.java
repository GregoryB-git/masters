package androidx.recyclerview.widget;

class ChildHelper$Bucket
{
  public static final int BITS_PER_WORD = 64;
  public static final long LAST_BIT = Long.MIN_VALUE;
  public long mData = 0L;
  public Bucket mNext;
  
  private void ensureNext()
  {
    if (mNext == null) {
      mNext = new Bucket();
    }
  }
  
  public void clear(int paramInt)
  {
    if (paramInt >= 64)
    {
      Bucket localBucket = mNext;
      if (localBucket != null) {
        localBucket.clear(paramInt - 64);
      }
    }
    else
    {
      mData &= 1L << paramInt;
    }
  }
  
  public int countOnesBefore(int paramInt)
  {
    Bucket localBucket = mNext;
    if (localBucket == null)
    {
      if (paramInt >= 64) {
        return Long.bitCount(mData);
      }
      return Long.bitCount(mData & (1L << paramInt) - 1L);
    }
    if (paramInt < 64) {
      return Long.bitCount(mData & (1L << paramInt) - 1L);
    }
    paramInt = localBucket.countOnesBefore(paramInt - 64);
    return Long.bitCount(mData) + paramInt;
  }
  
  public boolean get(int paramInt)
  {
    if (paramInt >= 64)
    {
      ensureNext();
      return mNext.get(paramInt - 64);
    }
    boolean bool;
    if ((mData & 1L << paramInt) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void insert(int paramInt, boolean paramBoolean)
  {
    if (paramInt >= 64)
    {
      ensureNext();
      mNext.insert(paramInt - 64, paramBoolean);
    }
    else
    {
      long l1 = mData;
      boolean bool;
      if ((0x8000000000000000 & l1) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      long l2 = (1L << paramInt) - 1L;
      mData = ((l1 & l2) << 1 | l1 & l2);
      if (paramBoolean) {
        set(paramInt);
      } else {
        clear(paramInt);
      }
      if ((bool) || (mNext != null))
      {
        ensureNext();
        mNext.insert(0, bool);
      }
    }
  }
  
  public boolean remove(int paramInt)
  {
    if (paramInt >= 64)
    {
      ensureNext();
      return mNext.remove(paramInt - 64);
    }
    long l1 = 1L << paramInt;
    long l2 = mData;
    boolean bool;
    if ((l2 & l1) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    l2 &= l1;
    mData = l2;
    l1 -= 1L;
    mData = (l2 & l1 | Long.rotateRight(l1 & l2, 1));
    Bucket localBucket = mNext;
    if (localBucket != null)
    {
      if (localBucket.get(0)) {
        set(63);
      }
      mNext.remove(0);
    }
    return bool;
  }
  
  public void reset()
  {
    mData = 0L;
    Bucket localBucket = mNext;
    if (localBucket != null) {
      localBucket.reset();
    }
  }
  
  public void set(int paramInt)
  {
    if (paramInt >= 64)
    {
      ensureNext();
      mNext.set(paramInt - 64);
    }
    else
    {
      mData |= 1L << paramInt;
    }
  }
  
  public String toString()
  {
    Object localObject;
    if (mNext == null)
    {
      localObject = Long.toBinaryString(mData);
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(mNext.toString());
      ((StringBuilder)localObject).append("xx");
      ((StringBuilder)localObject).append(Long.toBinaryString(mData));
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ChildHelper.Bucket
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */