package androidx.palette.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import java.util.Arrays;

public final class Palette$Swatch
{
  private final int mBlue;
  private int mBodyTextColor;
  private boolean mGeneratedTextColors;
  private final int mGreen;
  @Nullable
  private float[] mHsl;
  private final int mPopulation;
  private final int mRed;
  private final int mRgb;
  private int mTitleTextColor;
  
  public Palette$Swatch(@ColorInt int paramInt1, int paramInt2)
  {
    mRed = Color.red(paramInt1);
    mGreen = Color.green(paramInt1);
    mBlue = Color.blue(paramInt1);
    mRgb = paramInt1;
    mPopulation = paramInt2;
  }
  
  public Palette$Swatch(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mRed = paramInt1;
    mGreen = paramInt2;
    mBlue = paramInt3;
    mRgb = Color.rgb(paramInt1, paramInt2, paramInt3);
    mPopulation = paramInt4;
  }
  
  public Palette$Swatch(float[] paramArrayOfFloat, int paramInt)
  {
    this(ColorUtils.HSLToColor(paramArrayOfFloat), paramInt);
    mHsl = paramArrayOfFloat;
  }
  
  private void ensureTextColorsGenerated()
  {
    if (!mGeneratedTextColors)
    {
      int i = ColorUtils.calculateMinimumAlpha(-1, mRgb, 4.5F);
      int j = ColorUtils.calculateMinimumAlpha(-1, mRgb, 3.0F);
      if ((i != -1) && (j != -1))
      {
        mBodyTextColor = ColorUtils.setAlphaComponent(-1, i);
        mTitleTextColor = ColorUtils.setAlphaComponent(-1, j);
        mGeneratedTextColors = true;
        return;
      }
      int k = ColorUtils.calculateMinimumAlpha(-16777216, mRgb, 4.5F);
      int m = ColorUtils.calculateMinimumAlpha(-16777216, mRgb, 3.0F);
      if ((k != -1) && (m != -1))
      {
        mBodyTextColor = ColorUtils.setAlphaComponent(-16777216, k);
        mTitleTextColor = ColorUtils.setAlphaComponent(-16777216, m);
        mGeneratedTextColors = true;
        return;
      }
      if (i != -1) {
        k = ColorUtils.setAlphaComponent(-1, i);
      } else {
        k = ColorUtils.setAlphaComponent(-16777216, k);
      }
      mBodyTextColor = k;
      if (j != -1) {
        k = ColorUtils.setAlphaComponent(-1, j);
      } else {
        k = ColorUtils.setAlphaComponent(-16777216, m);
      }
      mTitleTextColor = k;
      mGeneratedTextColors = true;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Swatch.class == paramObject.getClass()))
    {
      paramObject = (Swatch)paramObject;
      if ((mPopulation != mPopulation) || (mRgb != mRgb)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  @ColorInt
  public int getBodyTextColor()
  {
    ensureTextColorsGenerated();
    return mBodyTextColor;
  }
  
  @NonNull
  public float[] getHsl()
  {
    if (mHsl == null) {
      mHsl = new float[3];
    }
    ColorUtils.RGBToHSL(mRed, mGreen, mBlue, mHsl);
    return mHsl;
  }
  
  public int getPopulation()
  {
    return mPopulation;
  }
  
  @ColorInt
  public int getRgb()
  {
    return mRgb;
  }
  
  @ColorInt
  public int getTitleTextColor()
  {
    ensureTextColorsGenerated();
    return mTitleTextColor;
  }
  
  public int hashCode()
  {
    return mRgb * 31 + mPopulation;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(Swatch.class.getSimpleName());
    localStringBuilder.append(" [RGB: #");
    localStringBuilder.append(Integer.toHexString(getRgb()));
    localStringBuilder.append(']');
    localStringBuilder.append(" [HSL: ");
    localStringBuilder.append(Arrays.toString(getHsl()));
    localStringBuilder.append(']');
    localStringBuilder.append(" [Population: ");
    localStringBuilder.append(mPopulation);
    localStringBuilder.append(']');
    localStringBuilder.append(" [Title Text: #");
    localStringBuilder.append(Integer.toHexString(getTitleTextColor()));
    localStringBuilder.append(']');
    localStringBuilder.append(" [Body Text: #");
    localStringBuilder.append(Integer.toHexString(getBodyTextColor()));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.Palette.Swatch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */