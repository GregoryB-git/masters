package androidx.recyclerview.widget;

class ViewBoundsCheck$BoundFlags
{
  public int mBoundFlags = 0;
  public int mChildEnd;
  public int mChildStart;
  public int mRvEnd;
  public int mRvStart;
  
  public void addFlags(int paramInt)
  {
    mBoundFlags = (paramInt | mBoundFlags);
  }
  
  public boolean boundsMatch()
  {
    int i = mBoundFlags;
    if (((i & 0x7) != 0) && ((i & compare(mChildStart, mRvStart) << 0) == 0)) {
      return false;
    }
    i = mBoundFlags;
    if (((i & 0x70) != 0) && ((i & compare(mChildStart, mRvEnd) << 4) == 0)) {
      return false;
    }
    i = mBoundFlags;
    if (((i & 0x700) != 0) && ((i & compare(mChildEnd, mRvStart) << 8) == 0)) {
      return false;
    }
    i = mBoundFlags;
    return ((i & 0x7000) == 0) || ((i & compare(mChildEnd, mRvEnd) << 12) != 0);
  }
  
  public int compare(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2) {
      return 1;
    }
    if (paramInt1 == paramInt2) {
      return 2;
    }
    return 4;
  }
  
  public void resetFlags()
  {
    mBoundFlags = 0;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mRvStart = paramInt1;
    mRvEnd = paramInt2;
    mChildStart = paramInt3;
    mChildEnd = paramInt4;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewBoundsCheck.BoundFlags
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */