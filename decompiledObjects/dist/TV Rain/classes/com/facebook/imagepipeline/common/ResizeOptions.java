package com.facebook.imagepipeline.common;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.util.HashCodeUtil;
import javax.annotation.Nullable;

public class ResizeOptions
{
  public static final float DEFAULT_ROUNDUP_FRACTION = 0.6666667F;
  public final int height;
  public final float maxBitmapSize;
  public final float roundUpFraction;
  public final int width;
  
  public ResizeOptions(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, 2048.0F);
  }
  
  public ResizeOptions(int paramInt1, int paramInt2, float paramFloat)
  {
    this(paramInt1, paramInt2, paramFloat, 0.6666667F);
  }
  
  public ResizeOptions(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt2 > 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    width = paramInt1;
    height = paramInt2;
    maxBitmapSize = paramFloat1;
    roundUpFraction = paramFloat2;
  }
  
  @Nullable
  public static ResizeOptions forDimensions(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0)) {
      return new ResizeOptions(paramInt1, paramInt2);
    }
    return null;
  }
  
  @Nullable
  public static ResizeOptions forSquareSize(int paramInt)
  {
    if (paramInt <= 0) {
      return null;
    }
    return new ResizeOptions(paramInt, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ResizeOptions)) {
      return false;
    }
    paramObject = (ResizeOptions)paramObject;
    if ((width != width) || (height != height)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return HashCodeUtil.hashCode(width, height);
  }
  
  public String toString()
  {
    return String.format(null, "%dx%d", new Object[] { Integer.valueOf(width), Integer.valueOf(height) });
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.common.ResizeOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */