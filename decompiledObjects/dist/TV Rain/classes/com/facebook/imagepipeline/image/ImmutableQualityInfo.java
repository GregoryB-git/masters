package com.facebook.imagepipeline.image;

public class ImmutableQualityInfo
  implements QualityInfo
{
  public static final QualityInfo FULL_QUALITY = of(Integer.MAX_VALUE, true, true);
  public boolean mIsOfFullQuality;
  public boolean mIsOfGoodEnoughQuality;
  public int mQuality;
  
  private ImmutableQualityInfo(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    mQuality = paramInt;
    mIsOfGoodEnoughQuality = paramBoolean1;
    mIsOfFullQuality = paramBoolean2;
  }
  
  public static QualityInfo of(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new ImmutableQualityInfo(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ImmutableQualityInfo)) {
      return false;
    }
    paramObject = (ImmutableQualityInfo)paramObject;
    if ((mQuality != mQuality) || (mIsOfGoodEnoughQuality != mIsOfGoodEnoughQuality) || (mIsOfFullQuality != mIsOfFullQuality)) {
      bool = false;
    }
    return bool;
  }
  
  public int getQuality()
  {
    return mQuality;
  }
  
  public int hashCode()
  {
    int i = mQuality;
    boolean bool = mIsOfGoodEnoughQuality;
    int j = 0;
    int k;
    if (bool) {
      k = 4194304;
    } else {
      k = 0;
    }
    if (mIsOfFullQuality) {
      j = 8388608;
    }
    return i ^ k ^ j;
  }
  
  public boolean isOfFullQuality()
  {
    return mIsOfFullQuality;
  }
  
  public boolean isOfGoodEnoughQuality()
  {
    return mIsOfGoodEnoughQuality;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.image.ImmutableQualityInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */