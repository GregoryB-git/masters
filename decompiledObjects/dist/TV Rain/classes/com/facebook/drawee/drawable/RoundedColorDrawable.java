package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
import javax.annotation.Nullable;

public class RoundedColorDrawable
  extends Drawable
  implements Rounded
{
  private int mAlpha = 255;
  private int mBorderColor = 0;
  @VisibleForTesting
  public final Path mBorderPath = new Path();
  @VisibleForTesting
  public final float[] mBorderRadii = new float[8];
  private float mBorderWidth = 0.0F;
  private int mColor = 0;
  @Nullable
  @VisibleForTesting
  public float[] mInsideBorderRadii;
  private boolean mIsCircle = false;
  private float mPadding = 0.0F;
  @VisibleForTesting
  public final Paint mPaint = new Paint(1);
  @VisibleForTesting
  public final Path mPath = new Path();
  private final float[] mRadii = new float[8];
  private boolean mScaleDownInsideBorders = false;
  private final RectF mTempRect = new RectF();
  
  public RoundedColorDrawable(float paramFloat, int paramInt)
  {
    this(paramInt);
    setRadius(paramFloat);
  }
  
  public RoundedColorDrawable(int paramInt)
  {
    setColor(paramInt);
  }
  
  public RoundedColorDrawable(float[] paramArrayOfFloat, int paramInt)
  {
    this(paramInt);
    setRadii(paramArrayOfFloat);
  }
  
  @TargetApi(11)
  public static RoundedColorDrawable fromColorDrawable(ColorDrawable paramColorDrawable)
  {
    return new RoundedColorDrawable(paramColorDrawable.getColor());
  }
  
  private void updatePath()
  {
    mPath.reset();
    mBorderPath.reset();
    mTempRect.set(getBounds());
    Object localObject = mTempRect;
    float f1 = mBorderWidth;
    ((RectF)localObject).inset(f1 / 2.0F, f1 / 2.0F);
    boolean bool = mIsCircle;
    int i = 0;
    int j;
    if (bool)
    {
      f1 = Math.min(mTempRect.width(), mTempRect.height()) / 2.0F;
      mBorderPath.addCircle(mTempRect.centerX(), mTempRect.centerY(), f1, Path.Direction.CW);
    }
    else
    {
      for (j = 0;; j++)
      {
        localObject = mBorderRadii;
        if (j >= localObject.length) {
          break;
        }
        localObject[j] = (mRadii[j] + mPadding - mBorderWidth / 2.0F);
      }
      mBorderPath.addRoundRect(mTempRect, (float[])localObject, Path.Direction.CW);
    }
    localObject = mTempRect;
    f1 = mBorderWidth;
    ((RectF)localObject).inset(-f1 / 2.0F, -f1 / 2.0F);
    float f2 = mPadding;
    if (mScaleDownInsideBorders) {
      f1 = mBorderWidth;
    } else {
      f1 = 0.0F;
    }
    f1 = f2 + f1;
    mTempRect.inset(f1, f1);
    if (mIsCircle)
    {
      f2 = Math.min(mTempRect.width(), mTempRect.height()) / 2.0F;
      mPath.addCircle(mTempRect.centerX(), mTempRect.centerY(), f2, Path.Direction.CW);
    }
    else if (mScaleDownInsideBorders)
    {
      j = i;
      if (mInsideBorderRadii == null) {
        mInsideBorderRadii = new float[8];
      }
      for (j = i;; j++)
      {
        localObject = mInsideBorderRadii;
        if (j >= localObject.length) {
          break;
        }
        localObject[j] = (mRadii[j] - mBorderWidth);
      }
      mPath.addRoundRect(mTempRect, (float[])localObject, Path.Direction.CW);
    }
    else
    {
      mPath.addRoundRect(mTempRect, mRadii, Path.Direction.CW);
    }
    localObject = mTempRect;
    f1 = -f1;
    ((RectF)localObject).inset(f1, f1);
  }
  
  public void draw(Canvas paramCanvas)
  {
    mPaint.setColor(DrawableUtils.multiplyColorAlpha(mColor, mAlpha));
    mPaint.setStyle(Paint.Style.FILL);
    paramCanvas.drawPath(mPath, mPaint);
    if (mBorderWidth != 0.0F)
    {
      mPaint.setColor(DrawableUtils.multiplyColorAlpha(mBorderColor, mAlpha));
      mPaint.setStyle(Paint.Style.STROKE);
      mPaint.setStrokeWidth(mBorderWidth);
      paramCanvas.drawPath(mBorderPath, mPaint);
    }
  }
  
  public int getAlpha()
  {
    return mAlpha;
  }
  
  public int getBorderColor()
  {
    return mBorderColor;
  }
  
  public float getBorderWidth()
  {
    return mBorderWidth;
  }
  
  public int getColor()
  {
    return mColor;
  }
  
  public int getOpacity()
  {
    return DrawableUtils.getOpacityFromColor(DrawableUtils.multiplyColorAlpha(mColor, mAlpha));
  }
  
  public float getPadding()
  {
    return mPadding;
  }
  
  public float[] getRadii()
  {
    return mRadii;
  }
  
  public boolean getScaleDownInsideBorders()
  {
    return mScaleDownInsideBorders;
  }
  
  public boolean isCircle()
  {
    return mIsCircle;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    updatePath();
  }
  
  public void setAlpha(int paramInt)
  {
    if (paramInt != mAlpha)
    {
      mAlpha = paramInt;
      invalidateSelf();
    }
  }
  
  public void setBorder(int paramInt, float paramFloat)
  {
    if (mBorderColor != paramInt)
    {
      mBorderColor = paramInt;
      invalidateSelf();
    }
    if (mBorderWidth != paramFloat)
    {
      mBorderWidth = paramFloat;
      updatePath();
      invalidateSelf();
    }
  }
  
  public void setCircle(boolean paramBoolean)
  {
    mIsCircle = paramBoolean;
    updatePath();
    invalidateSelf();
  }
  
  public void setColor(int paramInt)
  {
    if (mColor != paramInt)
    {
      mColor = paramInt;
      invalidateSelf();
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
  
  public void setPadding(float paramFloat)
  {
    if (mPadding != paramFloat)
    {
      mPadding = paramFloat;
      updatePath();
      invalidateSelf();
    }
  }
  
  public void setRadii(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null)
    {
      Arrays.fill(mRadii, 0.0F);
    }
    else
    {
      boolean bool;
      if (paramArrayOfFloat.length == 8) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, "radii should have exactly 8 values");
      System.arraycopy(paramArrayOfFloat, 0, mRadii, 0, 8);
    }
    updatePath();
    invalidateSelf();
  }
  
  public void setRadius(float paramFloat)
  {
    boolean bool;
    if (paramFloat >= 0.0F) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "radius should be non negative");
    Arrays.fill(mRadii, paramFloat);
    updatePath();
    invalidateSelf();
  }
  
  public void setScaleDownInsideBorders(boolean paramBoolean)
  {
    if (mScaleDownInsideBorders != paramBoolean)
    {
      mScaleDownInsideBorders = paramBoolean;
      updatePath();
      invalidateSelf();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.RoundedColorDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */