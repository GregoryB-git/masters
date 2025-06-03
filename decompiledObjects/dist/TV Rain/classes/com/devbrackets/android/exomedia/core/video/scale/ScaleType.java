package com.devbrackets.android.exomedia.core.video.scale;

import androidx.annotation.NonNull;

public enum ScaleType
{
  static
  {
    ScaleType localScaleType1 = new ScaleType("CENTER", 0);
    CENTER = localScaleType1;
    ScaleType localScaleType2 = new ScaleType("CENTER_CROP", 1);
    CENTER_CROP = localScaleType2;
    ScaleType localScaleType3 = new ScaleType("CENTER_INSIDE", 2);
    CENTER_INSIDE = localScaleType3;
    ScaleType localScaleType4 = new ScaleType("FIT_CENTER", 3);
    FIT_CENTER = localScaleType4;
    ScaleType localScaleType5 = new ScaleType("FIT_XY", 4);
    FIT_XY = localScaleType5;
    ScaleType localScaleType6 = new ScaleType("NONE", 5);
    NONE = localScaleType6;
    $VALUES = new ScaleType[] { localScaleType1, localScaleType2, localScaleType3, localScaleType4, localScaleType5, localScaleType6 };
  }
  
  private ScaleType() {}
  
  @NonNull
  public static ScaleType fromOrdinal(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= NONE.ordinal())) {
      return values()[paramInt];
    }
    return NONE;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.scale.ScaleType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */