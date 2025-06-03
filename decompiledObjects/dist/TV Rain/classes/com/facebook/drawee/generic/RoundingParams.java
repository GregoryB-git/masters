package com.facebook.drawee.generic;

import androidx.annotation.ColorInt;
import com.facebook.common.internal.Preconditions;
import java.util.Arrays;

public class RoundingParams
{
  private int mBorderColor = 0;
  private float mBorderWidth = 0.0F;
  private float[] mCornersRadii = null;
  private int mOverlayColor = 0;
  private float mPadding = 0.0F;
  private boolean mRoundAsCircle = false;
  private RoundingMethod mRoundingMethod = RoundingMethod.BITMAP_ONLY;
  private boolean mScaleDownInsideBorders = false;
  
  public static RoundingParams asCircle()
  {
    return new RoundingParams().setRoundAsCircle(true);
  }
  
  public static RoundingParams fromCornersRadii(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return new RoundingParams().setCornersRadii(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public static RoundingParams fromCornersRadii(float[] paramArrayOfFloat)
  {
    return new RoundingParams().setCornersRadii(paramArrayOfFloat);
  }
  
  public static RoundingParams fromCornersRadius(float paramFloat)
  {
    return new RoundingParams().setCornersRadius(paramFloat);
  }
  
  private float[] getOrCreateRoundedCornersRadii()
  {
    if (mCornersRadii == null) {
      mCornersRadii = new float[8];
    }
    return mCornersRadii;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (RoundingParams)paramObject;
      if (mRoundAsCircle != mRoundAsCircle) {
        return false;
      }
      if (mOverlayColor != mOverlayColor) {
        return false;
      }
      if (Float.compare(mBorderWidth, mBorderWidth) != 0) {
        return false;
      }
      if (mBorderColor != mBorderColor) {
        return false;
      }
      if (Float.compare(mPadding, mPadding) != 0) {
        return false;
      }
      if (mRoundingMethod != mRoundingMethod) {
        return false;
      }
      if (mScaleDownInsideBorders != mScaleDownInsideBorders) {
        return false;
      }
      return Arrays.equals(mCornersRadii, mCornersRadii);
    }
    return false;
  }
  
  public int getBorderColor()
  {
    return mBorderColor;
  }
  
  public float getBorderWidth()
  {
    return mBorderWidth;
  }
  
  public float[] getCornersRadii()
  {
    return mCornersRadii;
  }
  
  public int getOverlayColor()
  {
    return mOverlayColor;
  }
  
  public float getPadding()
  {
    return mPadding;
  }
  
  public boolean getRoundAsCircle()
  {
    return mRoundAsCircle;
  }
  
  public RoundingMethod getRoundingMethod()
  {
    return mRoundingMethod;
  }
  
  public boolean getScaleDownInsideBorders()
  {
    return mScaleDownInsideBorders;
  }
  
  public int hashCode()
  {
    Object localObject = mRoundingMethod;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    int k = mRoundAsCircle;
    localObject = mCornersRadii;
    int m;
    if (localObject != null) {
      m = Arrays.hashCode((float[])localObject);
    } else {
      m = 0;
    }
    int n = mOverlayColor;
    float f = mBorderWidth;
    int i1;
    if (f != 0.0F) {
      i1 = Float.floatToIntBits(f);
    } else {
      i1 = 0;
    }
    int i2 = mBorderColor;
    f = mPadding;
    if (f != 0.0F) {
      i = Float.floatToIntBits(f);
    }
    return ((((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i) * 31 + mScaleDownInsideBorders;
  }
  
  public RoundingParams setBorder(@ColorInt int paramInt, float paramFloat)
  {
    boolean bool;
    if (paramFloat >= 0.0F) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "the border width cannot be < 0");
    mBorderWidth = paramFloat;
    mBorderColor = paramInt;
    return this;
  }
  
  public RoundingParams setBorderColor(@ColorInt int paramInt)
  {
    mBorderColor = paramInt;
    return this;
  }
  
  public RoundingParams setBorderWidth(float paramFloat)
  {
    boolean bool;
    if (paramFloat >= 0.0F) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "the border width cannot be < 0");
    mBorderWidth = paramFloat;
    return this;
  }
  
  public RoundingParams setCornersRadii(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float[] arrayOfFloat = getOrCreateRoundedCornersRadii();
    arrayOfFloat[1] = paramFloat1;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[3] = paramFloat2;
    arrayOfFloat[2] = paramFloat2;
    arrayOfFloat[5] = paramFloat3;
    arrayOfFloat[4] = paramFloat3;
    arrayOfFloat[7] = paramFloat4;
    arrayOfFloat[6] = paramFloat4;
    return this;
  }
  
  public RoundingParams setCornersRadii(float[] paramArrayOfFloat)
  {
    Preconditions.checkNotNull(paramArrayOfFloat);
    boolean bool;
    if (paramArrayOfFloat.length == 8) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "radii should have exactly 8 values");
    System.arraycopy(paramArrayOfFloat, 0, getOrCreateRoundedCornersRadii(), 0, 8);
    return this;
  }
  
  public RoundingParams setCornersRadius(float paramFloat)
  {
    Arrays.fill(getOrCreateRoundedCornersRadii(), paramFloat);
    return this;
  }
  
  public RoundingParams setOverlayColor(@ColorInt int paramInt)
  {
    mOverlayColor = paramInt;
    mRoundingMethod = RoundingMethod.OVERLAY_COLOR;
    return this;
  }
  
  public RoundingParams setPadding(float paramFloat)
  {
    boolean bool;
    if (paramFloat >= 0.0F) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "the padding cannot be < 0");
    mPadding = paramFloat;
    return this;
  }
  
  public RoundingParams setRoundAsCircle(boolean paramBoolean)
  {
    mRoundAsCircle = paramBoolean;
    return this;
  }
  
  public RoundingParams setRoundingMethod(RoundingMethod paramRoundingMethod)
  {
    mRoundingMethod = paramRoundingMethod;
    return this;
  }
  
  public RoundingParams setScaleDownInsideBorders(boolean paramBoolean)
  {
    mScaleDownInsideBorders = paramBoolean;
    return this;
  }
  
  public static enum RoundingMethod
  {
    static
    {
      RoundingMethod localRoundingMethod1 = new RoundingMethod("OVERLAY_COLOR", 0);
      OVERLAY_COLOR = localRoundingMethod1;
      RoundingMethod localRoundingMethod2 = new RoundingMethod("BITMAP_ONLY", 1);
      BITMAP_ONLY = localRoundingMethod2;
      $VALUES = new RoundingMethod[] { localRoundingMethod1, localRoundingMethod2 };
    }
    
    private RoundingMethod() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.generic.RoundingParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */