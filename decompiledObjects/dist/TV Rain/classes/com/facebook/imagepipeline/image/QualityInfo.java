package com.facebook.imagepipeline.image;

public abstract interface QualityInfo
{
  public abstract int getQuality();
  
  public abstract boolean isOfFullQuality();
  
  public abstract boolean isOfGoodEnoughQuality();
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.image.QualityInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */