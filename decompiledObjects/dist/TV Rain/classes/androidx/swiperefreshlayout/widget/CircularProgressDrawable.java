package androidx.swiperefreshlayout.widget;

import a;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable
  extends Drawable
  implements Animatable
{
  private static final int ANIMATION_DURATION = 1332;
  private static final int ARROW_HEIGHT = 5;
  private static final int ARROW_HEIGHT_LARGE = 6;
  private static final int ARROW_WIDTH = 10;
  private static final int ARROW_WIDTH_LARGE = 12;
  private static final float CENTER_RADIUS = 7.5F;
  private static final float CENTER_RADIUS_LARGE = 11.0F;
  private static final int[] COLORS = { -16777216 };
  private static final float COLOR_CHANGE_OFFSET = 0.75F;
  public static final int DEFAULT = 1;
  private static final float GROUP_FULL_ROTATION = 216.0F;
  public static final int LARGE = 0;
  private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
  private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
  private static final float MAX_PROGRESS_ARC = 0.8F;
  private static final float MIN_PROGRESS_ARC = 0.01F;
  private static final float RING_ROTATION = 0.20999998F;
  private static final float SHRINK_OFFSET = 0.5F;
  private static final float STROKE_WIDTH = 2.5F;
  private static final float STROKE_WIDTH_LARGE = 3.0F;
  private Animator mAnimator;
  public boolean mFinishing;
  private Resources mResources;
  private final Ring mRing;
  private float mRotation;
  public float mRotationCount;
  
  public CircularProgressDrawable(@NonNull Context paramContext)
  {
    mResources = ((Context)Preconditions.checkNotNull(paramContext)).getResources();
    paramContext = new Ring();
    mRing = paramContext;
    paramContext.setColors(COLORS);
    setStrokeWidth(2.5F);
    setupAnimators();
  }
  
  private void applyFinishTranslation(float paramFloat, Ring paramRing)
  {
    updateRingColor(paramFloat, paramRing);
    float f1 = (float)(Math.floor(paramRing.getStartingRotation() / 0.8F) + 1.0D);
    float f2 = paramRing.getStartingStartTrim();
    paramRing.setStartTrim(a.a(paramRing.getStartingEndTrim() - 0.01F, paramRing.getStartingStartTrim(), paramFloat, f2));
    paramRing.setEndTrim(paramRing.getStartingEndTrim());
    f2 = paramRing.getStartingRotation();
    paramRing.setRotation(a.a(f1, paramRing.getStartingRotation(), paramFloat, f2));
  }
  
  private int evaluateColorChange(float paramFloat, int paramInt1, int paramInt2)
  {
    int i = paramInt1 >> 24 & 0xFF;
    int j = paramInt1 >> 16 & 0xFF;
    int k = paramInt1 >> 8 & 0xFF;
    paramInt1 &= 0xFF;
    return i + (int)(((paramInt2 >> 24 & 0xFF) - i) * paramFloat) << 24 | j + (int)(((paramInt2 >> 16 & 0xFF) - j) * paramFloat) << 16 | k + (int)(((paramInt2 >> 8 & 0xFF) - k) * paramFloat) << 8 | paramInt1 + (int)(paramFloat * ((paramInt2 & 0xFF) - paramInt1));
  }
  
  private float getRotation()
  {
    return mRotation;
  }
  
  private void setRotation(float paramFloat)
  {
    mRotation = paramFloat;
  }
  
  private void setSizeParameters(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Ring localRing = mRing;
    float f = mResources.getDisplayMetrics().density;
    localRing.setStrokeWidth(paramFloat2 * f);
    localRing.setCenterRadius(paramFloat1 * f);
    localRing.setColorIndex(0);
    localRing.setArrowDimensions(paramFloat3 * f, paramFloat4 * f);
  }
  
  private void setupAnimators()
  {
    final Ring localRing = mRing;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        float f = ((Float)paramAnonymousValueAnimator.getAnimatedValue()).floatValue();
        updateRingColor(f, localRing);
        applyTransformation(f, localRing, false);
        invalidateSelf();
      }
    });
    localValueAnimator.setRepeatCount(-1);
    localValueAnimator.setRepeatMode(1);
    localValueAnimator.setInterpolator(LINEAR_INTERPOLATOR);
    localValueAnimator.addListener(new Animator.AnimatorListener()
    {
      public void onAnimationCancel(Animator paramAnonymousAnimator) {}
      
      public void onAnimationEnd(Animator paramAnonymousAnimator) {}
      
      public void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
        applyTransformation(1.0F, localRing, true);
        localRing.storeOriginals();
        localRing.goToNextColor();
        CircularProgressDrawable localCircularProgressDrawable = CircularProgressDrawable.this;
        if (mFinishing)
        {
          mFinishing = false;
          paramAnonymousAnimator.cancel();
          paramAnonymousAnimator.setDuration(1332L);
          paramAnonymousAnimator.start();
          localRing.setShowArrow(false);
        }
        else
        {
          mRotationCount += 1.0F;
        }
      }
      
      public void onAnimationStart(Animator paramAnonymousAnimator)
      {
        mRotationCount = 0.0F;
      }
    });
    mAnimator = localValueAnimator;
  }
  
  public void applyTransformation(float paramFloat, Ring paramRing, boolean paramBoolean)
  {
    if (mFinishing)
    {
      applyFinishTranslation(paramFloat, paramRing);
    }
    else if ((paramFloat != 1.0F) || (paramBoolean))
    {
      float f1 = paramRing.getStartingRotation();
      float f2;
      float f3;
      if (paramFloat < 0.5F)
      {
        f2 = paramFloat / 0.5F;
        f3 = paramRing.getStartingStartTrim();
        f2 = MATERIAL_INTERPOLATOR.getInterpolation(f2) * 0.79F + 0.01F + f3;
      }
      else
      {
        f3 = (paramFloat - 0.5F) / 0.5F;
        f2 = paramRing.getStartingStartTrim() + 0.79F;
        f3 = f2 - ((1.0F - MATERIAL_INTERPOLATOR.getInterpolation(f3)) * 0.79F + 0.01F);
      }
      float f4 = mRotationCount;
      paramRing.setStartTrim(f3);
      paramRing.setEndTrim(f2);
      paramRing.setRotation(0.20999998F * paramFloat + f1);
      setRotation((paramFloat + f4) * 216.0F);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    paramCanvas.save();
    paramCanvas.rotate(mRotation, localRect.exactCenterX(), localRect.exactCenterY());
    mRing.draw(paramCanvas, localRect);
    paramCanvas.restore();
  }
  
  public int getAlpha()
  {
    return mRing.getAlpha();
  }
  
  public boolean getArrowEnabled()
  {
    return mRing.getShowArrow();
  }
  
  public float getArrowHeight()
  {
    return mRing.getArrowHeight();
  }
  
  public float getArrowScale()
  {
    return mRing.getArrowScale();
  }
  
  public float getArrowWidth()
  {
    return mRing.getArrowWidth();
  }
  
  public int getBackgroundColor()
  {
    return mRing.getBackgroundColor();
  }
  
  public float getCenterRadius()
  {
    return mRing.getCenterRadius();
  }
  
  @NonNull
  public int[] getColorSchemeColors()
  {
    return mRing.getColors();
  }
  
  public float getEndTrim()
  {
    return mRing.getEndTrim();
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public float getProgressRotation()
  {
    return mRing.getRotation();
  }
  
  public float getStartTrim()
  {
    return mRing.getStartTrim();
  }
  
  @NonNull
  public Paint.Cap getStrokeCap()
  {
    return mRing.getStrokeCap();
  }
  
  public float getStrokeWidth()
  {
    return mRing.getStrokeWidth();
  }
  
  public boolean isRunning()
  {
    return mAnimator.isRunning();
  }
  
  public void setAlpha(int paramInt)
  {
    mRing.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setArrowDimensions(float paramFloat1, float paramFloat2)
  {
    mRing.setArrowDimensions(paramFloat1, paramFloat2);
    invalidateSelf();
  }
  
  public void setArrowEnabled(boolean paramBoolean)
  {
    mRing.setShowArrow(paramBoolean);
    invalidateSelf();
  }
  
  public void setArrowScale(float paramFloat)
  {
    mRing.setArrowScale(paramFloat);
    invalidateSelf();
  }
  
  public void setBackgroundColor(int paramInt)
  {
    mRing.setBackgroundColor(paramInt);
    invalidateSelf();
  }
  
  public void setCenterRadius(float paramFloat)
  {
    mRing.setCenterRadius(paramFloat);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mRing.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setColorSchemeColors(@NonNull int... paramVarArgs)
  {
    mRing.setColors(paramVarArgs);
    mRing.setColorIndex(0);
    invalidateSelf();
  }
  
  public void setProgressRotation(float paramFloat)
  {
    mRing.setRotation(paramFloat);
    invalidateSelf();
  }
  
  public void setStartEndTrim(float paramFloat1, float paramFloat2)
  {
    mRing.setStartTrim(paramFloat1);
    mRing.setEndTrim(paramFloat2);
    invalidateSelf();
  }
  
  public void setStrokeCap(@NonNull Paint.Cap paramCap)
  {
    mRing.setStrokeCap(paramCap);
    invalidateSelf();
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    mRing.setStrokeWidth(paramFloat);
    invalidateSelf();
  }
  
  public void setStyle(int paramInt)
  {
    if (paramInt == 0) {
      setSizeParameters(11.0F, 3.0F, 12.0F, 6.0F);
    } else {
      setSizeParameters(7.5F, 2.5F, 10.0F, 5.0F);
    }
    invalidateSelf();
  }
  
  public void start()
  {
    mAnimator.cancel();
    mRing.storeOriginals();
    if (mRing.getEndTrim() != mRing.getStartTrim())
    {
      mFinishing = true;
      mAnimator.setDuration(666L);
      mAnimator.start();
    }
    else
    {
      mRing.setColorIndex(0);
      mRing.resetOriginals();
      mAnimator.setDuration(1332L);
      mAnimator.start();
    }
  }
  
  public void stop()
  {
    mAnimator.cancel();
    setRotation(0.0F);
    mRing.setShowArrow(false);
    mRing.setColorIndex(0);
    mRing.resetOriginals();
    invalidateSelf();
  }
  
  public void updateRingColor(float paramFloat, Ring paramRing)
  {
    if (paramFloat > 0.75F) {
      paramRing.setColor(evaluateColorChange((paramFloat - 0.75F) / 0.25F, paramRing.getStartingColor(), paramRing.getNextColor()));
    } else {
      paramRing.setColor(paramRing.getStartingColor());
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static @interface ProgressDrawableSize {}
  
  public static class Ring
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
    
    public Ring()
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
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircularProgressDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */