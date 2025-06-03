package androidx.appcompat.graphics.drawable;

import a;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DrawerArrowDrawable
  extends Drawable
{
  public static final int ARROW_DIRECTION_END = 3;
  public static final int ARROW_DIRECTION_LEFT = 0;
  public static final int ARROW_DIRECTION_RIGHT = 1;
  public static final int ARROW_DIRECTION_START = 2;
  private static final float ARROW_HEAD_ANGLE = (float)Math.toRadians(45.0D);
  private float mArrowHeadLength;
  private float mArrowShaftLength;
  private float mBarGap;
  private float mBarLength;
  private int mDirection;
  private float mMaxCutForBarSize;
  private final Paint mPaint;
  private final Path mPath;
  private float mProgress;
  private final int mSize;
  private boolean mSpin;
  private boolean mVerticalMirror;
  
  public DrawerArrowDrawable(Context paramContext)
  {
    Paint localPaint = new Paint();
    mPaint = localPaint;
    mPath = new Path();
    mVerticalMirror = false;
    mDirection = 2;
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeJoin(Paint.Join.MITER);
    localPaint.setStrokeCap(Paint.Cap.BUTT);
    localPaint.setAntiAlias(true);
    paramContext = paramContext.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
    setColor(paramContext.getColor(R.styleable.DrawerArrowToggle_color, 0));
    setBarThickness(paramContext.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0F));
    setSpinEnabled(paramContext.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
    setGapSize(Math.round(paramContext.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0F)));
    mSize = paramContext.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
    mBarLength = Math.round(paramContext.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0F));
    mArrowHeadLength = Math.round(paramContext.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0F));
    mArrowShaftLength = paramContext.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0F);
    paramContext.recycle();
  }
  
  private static float lerp(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return a.a(paramFloat2, paramFloat1, paramFloat3, paramFloat1);
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i = mDirection;
    int j = 0;
    int k = j;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 3)
        {
          k = j;
          if (DrawableCompat.getLayoutDirection(this) != 1) {
            break label60;
          }
        }
        else
        {
          k = j;
          if (DrawableCompat.getLayoutDirection(this) != 0) {
            break label60;
          }
        }
      }
      k = 1;
    }
    label60:
    float f1 = mArrowHeadLength;
    f1 = (float)Math.sqrt(f1 * f1 * 2.0F);
    float f2 = lerp(mBarLength, f1, mProgress);
    float f3 = lerp(mBarLength, mArrowShaftLength, mProgress);
    float f4 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
    float f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
    if (k != 0) {
      f1 = 0.0F;
    } else {
      f1 = -180.0F;
    }
    if (k != 0) {
      f6 = 180.0F;
    } else {
      f6 = 0.0F;
    }
    f1 = lerp(f1, f6, mProgress);
    double d1 = f2;
    double d2 = f5;
    f5 = (float)Math.round(Math.cos(d2) * d1);
    float f6 = (float)Math.round(Math.sin(d2) * d1);
    mPath.rewind();
    f2 = mBarGap;
    float f7 = lerp(mPaint.getStrokeWidth() + f2, -mMaxCutForBarSize, mProgress);
    f2 = -f3 / 2.0F;
    mPath.moveTo(f2 + f4, 0.0F);
    mPath.rLineTo(f3 - f4 * 2.0F, 0.0F);
    mPath.moveTo(f2, f7);
    mPath.rLineTo(f5, f6);
    mPath.moveTo(f2, -f7);
    mPath.rLineTo(f5, -f6);
    mPath.close();
    paramCanvas.save();
    f6 = mPaint.getStrokeWidth();
    f3 = localRect.height();
    f4 = mBarGap;
    f3 = (int)(f3 - 3.0F * f6 - 2.0F * f4) / 4 * 2;
    paramCanvas.translate(localRect.centerX(), f6 * 1.5F + f4 + f3);
    if (mSpin)
    {
      if ((mVerticalMirror ^ k)) {
        k = -1;
      } else {
        k = 1;
      }
      paramCanvas.rotate(f1 * k);
    }
    else if (k != 0)
    {
      paramCanvas.rotate(180.0F);
    }
    paramCanvas.drawPath(mPath, mPaint);
    paramCanvas.restore();
  }
  
  public float getArrowHeadLength()
  {
    return mArrowHeadLength;
  }
  
  public float getArrowShaftLength()
  {
    return mArrowShaftLength;
  }
  
  public float getBarLength()
  {
    return mBarLength;
  }
  
  public float getBarThickness()
  {
    return mPaint.getStrokeWidth();
  }
  
  @ColorInt
  public int getColor()
  {
    return mPaint.getColor();
  }
  
  public int getDirection()
  {
    return mDirection;
  }
  
  public float getGapSize()
  {
    return mBarGap;
  }
  
  public int getIntrinsicHeight()
  {
    return mSize;
  }
  
  public int getIntrinsicWidth()
  {
    return mSize;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public final Paint getPaint()
  {
    return mPaint;
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getProgress()
  {
    return mProgress;
  }
  
  public boolean isSpinEnabled()
  {
    return mSpin;
  }
  
  public void setAlpha(int paramInt)
  {
    if (paramInt != mPaint.getAlpha())
    {
      mPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setArrowHeadLength(float paramFloat)
  {
    if (mArrowHeadLength != paramFloat)
    {
      mArrowHeadLength = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setArrowShaftLength(float paramFloat)
  {
    if (mArrowShaftLength != paramFloat)
    {
      mArrowShaftLength = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setBarLength(float paramFloat)
  {
    if (mBarLength != paramFloat)
    {
      mBarLength = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setBarThickness(float paramFloat)
  {
    if (mPaint.getStrokeWidth() != paramFloat)
    {
      mPaint.setStrokeWidth(paramFloat);
      double d = paramFloat / 2.0F;
      mMaxCutForBarSize = ((float)(Math.cos(ARROW_HEAD_ANGLE) * d));
      invalidateSelf();
    }
  }
  
  public void setColor(@ColorInt int paramInt)
  {
    if (paramInt != mPaint.getColor())
    {
      mPaint.setColor(paramInt);
      invalidateSelf();
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setDirection(int paramInt)
  {
    if (paramInt != mDirection)
    {
      mDirection = paramInt;
      invalidateSelf();
    }
  }
  
  public void setGapSize(float paramFloat)
  {
    if (paramFloat != mBarGap)
    {
      mBarGap = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setProgress(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    if (mProgress != paramFloat)
    {
      mProgress = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setSpinEnabled(boolean paramBoolean)
  {
    if (mSpin != paramBoolean)
    {
      mSpin = paramBoolean;
      invalidateSelf();
    }
  }
  
  public void setVerticalMirror(boolean paramBoolean)
  {
    if (mVerticalMirror != paramBoolean)
    {
      mVerticalMirror = paramBoolean;
      invalidateSelf();
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface ArrowDirection {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawerArrowDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */