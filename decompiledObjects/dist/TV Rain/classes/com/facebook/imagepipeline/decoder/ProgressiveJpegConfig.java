package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.QualityInfo;

public abstract interface ProgressiveJpegConfig
{
  public abstract int getNextScanNumberToDecode(int paramInt);
  
  public abstract QualityInfo getQualityInfo(int paramInt);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.decoder.ProgressiveJpegConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */