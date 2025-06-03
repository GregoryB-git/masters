package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;

public class OrientedDrawable
  extends ForwardingDrawable
{
  private int mExifOrientation;
  private int mRotationAngle;
  @VisibleForTesting
  public final Matrix mRotationMatrix;
  private final Matrix mTempMatrix = new Matrix();
  private final RectF mTempRectF = new RectF();
  
  public OrientedDrawable(Drawable paramDrawable, int paramInt)
  {
    this(paramDrawable, paramInt, 0);
  }
  
  public OrientedDrawable(Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    super(paramDrawable);
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 % 90 == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if ((paramInt2 >= 0) && (paramInt2 <= 8)) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    mRotationMatrix = new Matrix();
    mRotationAngle = paramInt1;
    mExifOrientation = paramInt2;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (mRotationAngle <= 0)
    {
      i = mExifOrientation;
      if ((i == 0) || (i == 1))
      {
        super.draw(paramCanvas);
        return;
      }
    }
    int i = paramCanvas.save();
    paramCanvas.concat(mRotationMatrix);
    super.draw(paramCanvas);
    paramCanvas.restoreToCount(i);
  }
  
  public int getIntrinsicHeight()
  {
    int i = mExifOrientation;
    if ((i != 5) && (i != 7) && (mRotationAngle % 180 == 0)) {
      return super.getIntrinsicHeight();
    }
    return super.getIntrinsicWidth();
  }
  
  public int getIntrinsicWidth()
  {
    int i = mExifOrientation;
    if ((i != 5) && (i != 7) && (mRotationAngle % 180 == 0)) {
      return super.getIntrinsicWidth();
    }
    return super.getIntrinsicHeight();
  }
  
  public void getTransform(Matrix paramMatrix)
  {
    getParentTransform(paramMatrix);
    if (!mRotationMatrix.isIdentity()) {
      paramMatrix.preConcat(mRotationMatrix);
    }
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = getCurrent();
    int i = mRotationAngle;
    if (i <= 0)
    {
      j = mExifOrientation;
      if ((j == 0) || (j == 1))
      {
        localDrawable.setBounds(paramRect);
        return;
      }
    }
    int j = mExifOrientation;
    if (j != 2)
    {
      if (j != 7)
      {
        if (j != 4)
        {
          if (j != 5)
          {
            mRotationMatrix.setRotate(i, paramRect.centerX(), paramRect.centerY());
          }
          else
          {
            mRotationMatrix.setRotate(270.0F, paramRect.centerX(), paramRect.centerY());
            mRotationMatrix.postScale(1.0F, -1.0F);
          }
        }
        else {
          mRotationMatrix.setScale(1.0F, -1.0F);
        }
      }
      else
      {
        mRotationMatrix.setRotate(270.0F, paramRect.centerX(), paramRect.centerY());
        mRotationMatrix.postScale(-1.0F, 1.0F);
      }
    }
    else {
      mRotationMatrix.setScale(-1.0F, 1.0F);
    }
    mTempMatrix.reset();
    mRotationMatrix.invert(mTempMatrix);
    mTempRectF.set(paramRect);
    mTempMatrix.mapRect(mTempRectF);
    paramRect = mTempRectF;
    localDrawable.setBounds((int)left, (int)top, (int)right, (int)bottom);
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.OrientedDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */