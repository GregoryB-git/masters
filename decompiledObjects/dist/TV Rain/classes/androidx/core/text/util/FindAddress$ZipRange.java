package androidx.core.text.util;

class FindAddress$ZipRange
{
  public int mException1;
  public int mException2;
  public int mHigh;
  public int mLow;
  
  public FindAddress$ZipRange(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mLow = paramInt1;
    mHigh = paramInt2;
    mException1 = paramInt3;
    mException2 = paramInt4;
  }
  
  public boolean matches(String paramString)
  {
    boolean bool = false;
    int i = Integer.parseInt(paramString.substring(0, 2));
    if (((mLow <= i) && (i <= mHigh)) || (i == mException1) || (i == mException2)) {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.core.text.util.FindAddress.ZipRange
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */