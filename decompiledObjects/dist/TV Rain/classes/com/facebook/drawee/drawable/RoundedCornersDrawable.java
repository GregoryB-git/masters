package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;
import javax.annotation.Nullable;

public class RoundedCornersDrawable
  extends ForwardingDrawable
  implements Rounded
{
  private int mBorderColor = 0;
  private final Path mBorderPath = new Path();
  @VisibleForTesting
  public final float[] mBorderRadii = new float[8];
  private float mBorderWidth = 0.0F;
  private final RectF mBounds = new RectF();
  @Nullable
  private RectF mInsideBorderBounds;
  @Nullable
  private Matrix mInsideBorderTransform;
  private boolean mIsCircle = false;
  private int mOverlayColor = 0;
  private float mPadding = 0.0F;
  @VisibleForTesting
  public final Paint mPaint = new Paint(1);
  private final Path mPath = new Path();
  private final float[] mRadii = new float[8];
  private boolean mScaleDownInsideBorders = false;
  private final RectF mTempRectangle = new RectF();
  @VisibleForTesting
  public Type mType = Type.OVERLAY_COLOR;
  
  public RoundedCornersDrawable(Drawable paramDrawable)
  {
    super((Drawable)Preconditions.checkNotNull(paramDrawable));
  }
  
  private void updatePath()
  {
    mPath.reset();
    mBorderPath.reset();
    mTempRectangle.set(getBounds());
    Object localObject = mTempRectangle;
    float f = mPadding;
    ((RectF)localObject).inset(f, f);
    if (mIsCircle) {
      mPath.addCircle(mTempRectangle.centerX(), mTempRectangle.centerY(), Math.min(mTempRectangle.width(), mTempRectangle.height()) / 2.0F, Path.Direction.CW);
    } else {
      mPath.addRoundRect(mTempRectangle, mRadii, Path.Direction.CW);
    }
    localObject = mTempRectangle;
    f = mPadding;
    ((RectF)localObject).inset(-f, -f);
    localObject = mTempRectangle;
    f = mBorderWidth;
    ((RectF)localObject).inset(f / 2.0F, f / 2.0F);
    if (mIsCircle)
    {
      f = Math.min(mTempRectangle.width(), mTempRectangle.height()) / 2.0F;
      mBorderPath.addCircle(mTempRectangle.centerX(), mTempRectangle.centerY(), f, Path.Direction.CW);
    }
    else
    {
      for (int i = 0;; i++)
      {
        localObject = mBorderRadii;
        if (i >= localObject.length) {
          break;
        }
        localObject[i] = (mRadii[i] + mPadding - mBorderWidth / 2.0F);
      }
      mBorderPath.addRoundRect(mTempRectangle, (float[])localObject, Path.Direction.CW);
    }
    localObject = mTempRectangle;
    f = mBorderWidth;
    ((RectF)localObject).inset(-f / 2.0F, -f / 2.0F);
  }
  
  public void draw(Canvas paramCanvas)
  {
    mBounds.set(getBounds());
    int i = 1.$SwitchMap$com$facebook$drawee$drawable$RoundedCornersDrawable$Type[mType.ordinal()];
    if (i != 1)
    {
      if (i == 2)
      {
        RectF localRectF;
        float f1;
        if (mScaleDownInsideBorders)
        {
          localRectF = mInsideBorderBounds;
          if (localRectF == null)
          {
            mInsideBorderBounds = new RectF(mBounds);
            mInsideBorderTransform = new Matrix();
          }
          else
          {
            localRectF.set(mBounds);
          }
          localRectF = mInsideBorderBounds;
          f1 = mBorderWidth;
          localRectF.inset(f1, f1);
          mInsideBorderTransform.setRectToRect(mBounds, mInsideBorderBounds, Matrix.ScaleToFit.FILL);
          i = paramCanvas.save();
          paramCanvas.clipRect(mBounds);
          paramCanvas.concat(mInsideBorderTransform);
          super.draw(paramCanvas);
          paramCanvas.restoreToCount(i);
        }
        else
        {
          super.draw(paramCanvas);
        }
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(mOverlayColor);
        mPaint.setStrokeWidth(0.0F);
        mPath.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        paramCanvas.drawPath(mPath, mPaint);
        if (mIsCircle)
        {
          float f2 = (mBounds.width() - mBounds.height() + mBorderWidth) / 2.0F;
          f1 = (mBounds.height() - mBounds.width() + mBorderWidth) / 2.0F;
          float f3;
          if (f2 > 0.0F)
          {
            localRectF = mBounds;
            f3 = left;
            paramCanvas.drawRect(f3, top, f3 + f2, bottom, mPaint);
            localRectF = mBounds;
            f3 = right;
            paramCanvas.drawRect(f3 - f2, top, f3, bottom, mPaint);
          }
          if (f1 > 0.0F)
          {
            localRectF = mBounds;
            f3 = left;
            f2 = top;
            paramCanvas.drawRect(f3, f2, right, f2 + f1, mPaint);
            localRectF = mBounds;
            f3 = left;
            f2 = bottom;
            paramCanvas.drawRect(f3, f2 - f1, right, f2, mPaint);
          }
        }
      }
    }
    else
    {
      i = paramCanvas.save();
      mPath.setFillType(Path.FillType.EVEN_ODD);
      paramCanvas.clipPath(mPath);
      super.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
    }
    if (mBorderColor != 0)
    {
      mPaint.setStyle(Paint.Style.STROKE);
      mPaint.setColor(mBorderColor);
      mPaint.setStrokeWidth(mBorderWidth);
      mPath.setFillType(Path.FillType.EVEN_ODD);
      paramCanvas.drawPath(mBorderPath, mPaint);
    }
  }
  
  public int getBorderColor()
  {
    return mBorderColor;
  }
  
  public float getBorderWidth()
  {
    return mBorderWidth;
  }
  
  public int getOverlayColor()
  {
    return mOverlayColor;
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
  
  public void setBorder(int paramInt, float paramFloat)
  {
    mBorderColor = paramInt;
    mBorderWidth = paramFloat;
    updatePath();
    invalidateSelf();
  }
  
  public void setCircle(boolean paramBoolean)
  {
    mIsCircle = paramBoolean;
    updatePath();
    invalidateSelf();
  }
  
  public void setOverlayColor(int paramInt)
  {
    mOverlayColor = paramInt;
    invalidateSelf();
  }
  
  public void setPadding(float paramFloat)
  {
    mPadding = paramFloat;
    updatePath();
    invalidateSelf();
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
    Arrays.fill(mRadii, paramFloat);
    updatePath();
    invalidateSelf();
  }
  
  public void setScaleDownInsideBorders(boolean paramBoolean)
  {
    mScaleDownInsideBorders = paramBoolean;
    updatePath();
    invalidateSelf();
  }
  
  public void setType(Type paramType)
  {
    mType = paramType;
    invalidateSelf();
  }
  
  public static enum Type
  {
    static
    {
      Type localType1 = new Type("OVERLAY_COLOR", 0);
      OVERLAY_COLOR = localType1;
      Type localType2 = new Type("CLIPPING", 1);
      CLIPPING = localType2;
      $VALUES = new Type[] { localType1, localType2 };
    }
    
    private Type() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.RoundedCornersDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */