package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;

class CircularProgressDrawable$Ring
{
  public int mAlpha;
  public Path mArrow;
  public int mArrowHeight;
  public final Paint mArrowPaint;
  public float mArrowScale;
  public int mArrowWidth;
  public final Paint mCirclePaint;
  public int mColorIndex;
  public int[] mColors;
  public int mCurrentColor;
  public float mEndTrim;
  public final Paint mPaint;
  public float mRingCenterRadius;
  public float mRotation;
  public boolean mShowArrow;
  public float mStartTrim;
  public float mStartingEndTrim;
  public float mStartingRotation;
  public float mStartingStartTrim;
  public float mStrokeWidth;
  public final RectF mTempBounds = new RectF();
  
  public CircularProgressDrawable$Ring()
  {
    Paint localPaint1 = new Paint();
    mPaint = localPaint1;
    Paint localPaint2 = new Paint();
    mArrowPaint = localPaint2;
    Paint localPaint3 = new Paint();
    mCirclePaint = localPaint3;
    mStartTrim = 0.0F;
    mEndTrim = 0.0F;
    mRotation = 0.0F;
    mStrokeWidth = 5.0F;
    mArrowScale = 1.0F;
    mAlpha = 255;
    localPaint1.setStrokeCap(Paint.Cap.SQUARE);
    localPaint1.setAntiAlias(true);
    localPaint1.setStyle(Paint.Style.STROKE);
    localPaint2.setStyle(Paint.Style.FILL);
    localPaint2.setAntiAlias(true);
    localPaint3.setColor(0);
  }
  
  public void draw(Canvas paramCanvas, Rect paramRect)
  {
    RectF localRectF = mTempBounds;
    float f1 = mRingCenterRadius;
    float f2 = mStrokeWidth / 2.0F + f1;
    if (f1 <= 0.0F) {
      f2 = Math.min(paramRect.width(), paramRect.height()) / 2.0F - Math.max(mArrowWidth * mArrowScale / 2.0F, mStrokeWidth / 2.0F);
    }
    localRectF.set(paramRect.centerX() - f2, paramRect.centerY() - f2, paramRect.centerX() + f2, paramRect.centerY() + f2);
    f2 = mStartTrim;
    f1 = mRotation;
    f2 = (f2 + f1) * 360.0F;
    f1 = (mEndTrim + f1) * 360.0F - f2;
    mPaint.setColor(mCurrentColor);
    mPaint.setAlpha(mAlpha);
    float f3 = mStrokeWidth / 2.0F;
    localRectF.inset(f3, f3);
    paramCanvas.drawCircle(localRectF.centerX(), localRectF.centerY(), localRectF.width() / 2.0F, mCirclePaint);
    f3 = -f3;
    localRectF.inset(f3, f3);
    paramCanvas.drawArc(localRectF, f2, f1, false, mPaint);
    drawTriangle(paramCanvas, f2, f1, localRectF);
  }
  
  public void drawTriangle(Canvas paramCanvas, float paramFloat1, float paramFloat2, RectF paramRectF)
  {
    if (mShowArrow)
    {
      Path localPath = mArrow;
      if (localPath == null)
      {
        localPath = new Path();
        mArrow = localPath;
        localPath.setFillType(Path.FillType.EVEN_ODD);
      }
      else
      {
        localPath.reset();
      }
      float f1 = Math.min(paramRectF.width(), paramRectF.height()) / 2.0F;
      float f2 = mArrowWidth * mArrowScale / 2.0F;
      mArrow.moveTo(0.0F, 0.0F);
      mArrow.lineTo(mArrowWidth * mArrowScale, 0.0F);
      localPath = mArrow;
      float f3 = mArrowWidth;
      float f4 = mArrowScale;
      localPath.lineTo(f3 * f4 / 2.0F, mArrowHeight * f4);
      localPath = mArrow;
      f4 = paramRectF.centerX();
      f3 = paramRectF.centerY();
      localPath.offset(f4 + f1 - f2, mStrokeWidth / 2.0F + f3);
      mArrow.close();
      mArrowPaint.setColor(mCurrentColor);
      mArrowPaint.setAlpha(mAlpha);
      paramCanvas.save();
      paramCanvas.rotate(paramFloat1 + paramFloat2, paramRectF.centerX(), paramRectF.centerY());
      paramCanvas.drawPath(mArrow, mArrowPaint);
      paramCanvas.restore();
    }
  }
  
  public int getAlpha()
  {
    return mAlpha;
  }
  
  public float getArrowHeight()
  {
    return mArrowHeight;
  }
  
  public float getArrowScale()
  {
    return mArrowScale;
  }
  
  public float getArrowWidth()
  {
    return mArrowWidth;
  }
  
  public int getBackgroundColor()
  {
    return mCirclePaint.getColor();
  }
  
  public float getCenterRadius()
  {
    return mRingCenterRadius;
  }
  
  public int[] getColors()
  {
    return mColors;
  }
  
  public float getEndTrim()
  {
    return mEndTrim;
  }
  
  public int getNextColor()
  {
    return mColors[getNextColorIndex()];
  }
  
  public int getNextColorIndex()
  {
    return (mColorIndex + 1) % mColors.length;
  }
  
  public float getRotation()
  {
    return mRotation;
  }
  
  public boolean getShowArrow()
  {
    return mShowArrow;
  }
  
  public float getStartTrim()
  {
    return mStartTrim;
  }
  
  public int getStartingColor()
  {
    return mColors[mColorIndex];
  }
  
  public float getStartingEndTrim()
  {
    return mStartingEndTrim;
  }
  
  public float getStartingRotation()
  {
    return mStartingRotation;
  }
  
  public float getStartingStartTrim()
  {
    return mStartingStartTrim;
  }
  
  public Paint.Cap getStrokeCap()
  {
    return mPaint.getStrokeCap();
  }
  
  public float getStrokeWidth()
  {
    return mStrokeWidth;
  }
  
  public void goToNextColor()
  {
    setColorIndex(getNextColorIndex());
  }
  
  public void resetOriginals()
  {
    mStartingStartTrim = 0.0F;
    mStartingEndTrim = 0.0F;
    mStartingRotation = 0.0F;
    setStartTrim(0.0F);
    setEndTrim(0.0F);
    setRotation(0.0F);
  }
  
  public void setAlpha(int paramInt)
  {
    mAlpha = paramInt;
  }
  
  public void setArrowDimensions(float paramFloat1, float paramFloat2)
  {
    mArrowWidth = ((int)paramFloat1);
    mArrowHeight = ((int)paramFloat2);
  }
  
  public void setArrowScale(float paramFloat)
  {
    if (paramFloat != mArrowScale) {
      mArrowScale = paramFloat;
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    mCirclePaint.setColor(paramInt);
  }
  
  public void setCenterRadius(float paramFloat)
  {
    mRingCenterRadius = paramFloat;
  }
  
  public void setColor(int paramInt)
  {
    mCurrentColor = paramInt;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mPaint.setColorFilter(paramColorFilter);
  }
  
  public void setColorIndex(int paramInt)
  {
    mColorIndex = paramInt;
    mCurrentColor = mColors[paramInt];
  }
  
  public void setColors(@NonNull int[] paramArrayOfInt)
  {
    mColors = paramArrayOfInt;
    setColorIndex(0);
  }
  
  public void setEndTrim(float paramFloat)
  {
    mEndTrim = paramFloat;
  }
  
  public void setRotation(float paramFloat)
  {
    mRotation = paramFloat;
  }
  
  public void setShowArrow(boolean paramBoolean)
  {
    if (mShowArrow != paramBoolean) {
      mShowArrow = paramBoolean;
    }
  }
  
  public void setStartTrim(float paramFloat)
  {
    mStartTrim = paramFloat;
  }
  
  public void setStrokeCap(Paint.Cap paramCap)
  {
    mPaint.setStrokeCap(paramCap);
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    mStrokeWidth = paramFloat;
    mPaint.setStrokeWidth(paramFloat);
  }
  
  public void storeOriginals()
  {
    mStartingStartTrim = mStartTrim;
    mStartingEndTrim = mEndTrim;
    mStartingRotation = mRotation;
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */