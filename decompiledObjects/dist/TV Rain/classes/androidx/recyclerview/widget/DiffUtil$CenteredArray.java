package androidx.recyclerview.widget;

import java.util.Arrays;

class DiffUtil$CenteredArray
{
  private final int[] mData;
  private final int mMid;
  
  public DiffUtil$CenteredArray(int paramInt)
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

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.CenteredArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */