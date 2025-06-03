package com.facebook.drawee.debug;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import javax.annotation.Nullable;

public class DebugControllerOverlayDrawable
  extends Drawable
{
  private static final float IMAGE_SIZE_THRESHOLD_NOT_OK = 0.5F;
  private static final float IMAGE_SIZE_THRESHOLD_OK = 0.1F;
  private static final int MAX_LINE_WIDTH_EM = 7;
  private static final int MAX_NUMBER_OF_LINES = 7;
  private static final int MAX_TEXT_SIZE_PX = 40;
  private static final int MIN_TEXT_SIZE_PX = 12;
  private static final String NO_CONTROLLER_ID = "none";
  private static final int OUTLINE_COLOR = -26624;
  private static final int OUTLINE_STROKE_WIDTH_PX = 2;
  @VisibleForTesting
  public static final int OVERLAY_COLOR_IMAGE_ALMOST_OK = 1728026624;
  @VisibleForTesting
  public static final int OVERLAY_COLOR_IMAGE_NOT_OK = 1727284022;
  @VisibleForTesting
  public static final int OVERLAY_COLOR_IMAGE_OK = 1716301648;
  private static final int TEXT_COLOR = -1;
  private static final int TEXT_LINE_SPACING_PX = 8;
  private static final int TEXT_PADDING_PX = 10;
  private String mControllerId;
  private int mCurrentTextXPx;
  private int mCurrentTextYPx;
  private int mFrameCount;
  private int mHeightPx;
  private String mImageFormat;
  private String mImageId;
  private int mImageSizeBytes;
  private int mLineIncrementPx;
  private int mLoopCount;
  private final Matrix mMatrix = new Matrix();
  private final Paint mPaint = new Paint(1);
  private final Rect mRect = new Rect();
  private final RectF mRectF = new RectF();
  private ScalingUtils.ScaleType mScaleType;
  private int mStartTextXPx;
  private int mStartTextYPx;
  private int mTextGravity = 80;
  private int mWidthPx;
  
  public DebugControllerOverlayDrawable()
  {
    reset();
  }
  
  private void addDebugText(Canvas paramCanvas, String paramString, @Nullable Object... paramVarArgs)
  {
    if (paramVarArgs == null) {
      paramCanvas.drawText(paramString, mCurrentTextXPx, mCurrentTextYPx, mPaint);
    } else {
      paramCanvas.drawText(String.format(paramString, paramVarArgs), mCurrentTextXPx, mCurrentTextYPx, mPaint);
    }
    mCurrentTextYPx += mLineIncrementPx;
  }
  
  private void prepareDebugTextParameters(Rect paramRect, int paramInt1, int paramInt2)
  {
    paramInt1 = Math.min(40, Math.max(12, Math.min(paramRect.width() / paramInt2, paramRect.height() / paramInt1)));
    mPaint.setTextSize(paramInt1);
    paramInt2 = paramInt1 + 8;
    mLineIncrementPx = paramInt2;
    paramInt1 = mTextGravity;
    if (paramInt1 == 80) {
      mLineIncrementPx = (paramInt2 * -1);
    }
    mStartTextXPx = (left + 10);
    if (paramInt1 == 80) {
      paramInt1 = bottom - 10;
    } else {
      paramInt1 = top + 10 + 12;
    }
    mStartTextYPx = paramInt1;
  }
  
  @VisibleForTesting
  public int determineOverlayColor(int paramInt1, int paramInt2, @Nullable ScalingUtils.ScaleType paramScaleType)
  {
    int i = getBounds().width();
    int j = getBounds().height();
    if ((i > 0) && (j > 0) && (paramInt1 > 0) && (paramInt2 > 0))
    {
      int k = i;
      int m = j;
      if (paramScaleType != null)
      {
        Rect localRect = mRect;
        top = 0;
        left = 0;
        right = i;
        bottom = j;
        mMatrix.reset();
        paramScaleType.getTransform(mMatrix, mRect, paramInt1, paramInt2, 0.0F, 0.0F);
        paramScaleType = mRectF;
        top = 0.0F;
        left = 0.0F;
        right = paramInt1;
        bottom = paramInt2;
        mMatrix.mapRect(paramScaleType);
        k = (int)mRectF.width();
        m = (int)mRectF.height();
        k = Math.min(i, k);
        m = Math.min(j, m);
      }
      float f1 = k;
      float f2 = m;
      paramInt1 = Math.abs(paramInt1 - k);
      paramInt2 = Math.abs(paramInt2 - m);
      float f3 = paramInt1;
      if ((f3 < f1 * 0.1F) && (paramInt2 < 0.1F * f2)) {
        return 1716301648;
      }
      if ((f3 < f1 * 0.5F) && (paramInt2 < f2 * 0.5F)) {
        return 1728026624;
      }
    }
    return 1727284022;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    mPaint.setStyle(Paint.Style.STROKE);
    mPaint.setStrokeWidth(2.0F);
    mPaint.setColor(38912);
    paramCanvas.drawRect(left, top, right, bottom, mPaint);
    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(determineOverlayColor(mWidthPx, mHeightPx, mScaleType));
    paramCanvas.drawRect(left, top, right, bottom, mPaint);
    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setStrokeWidth(0.0F);
    mPaint.setColor(-1);
    mCurrentTextXPx = mStartTextXPx;
    mCurrentTextYPx = mStartTextYPx;
    Object localObject = mImageId;
    if (localObject != null) {
      addDebugText(paramCanvas, "IDs: %s, %s", new Object[] { mControllerId, localObject });
    } else {
      addDebugText(paramCanvas, "ID: %s", new Object[] { mControllerId });
    }
    addDebugText(paramCanvas, "D: %dx%d", new Object[] { Integer.valueOf(localRect.width()), Integer.valueOf(localRect.height()) });
    addDebugText(paramCanvas, "I: %dx%d", new Object[] { Integer.valueOf(mWidthPx), Integer.valueOf(mHeightPx) });
    addDebugText(paramCanvas, "I: %d KiB", new Object[] { Integer.valueOf(mImageSizeBytes / 1024) });
    localObject = mImageFormat;
    if (localObject != null) {
      addDebugText(paramCanvas, "i format: %s", new Object[] { localObject });
    }
    int i = mFrameCount;
    if (i > 0) {
      addDebugText(paramCanvas, "anim: f %d, l %d", new Object[] { Integer.valueOf(i), Integer.valueOf(mLoopCount) });
    }
    localObject = mScaleType;
    if (localObject != null) {
      addDebugText(paramCanvas, "scale: %s", new Object[] { localObject });
    }
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    prepareDebugTextParameters(paramRect, 7, 7);
  }
  
  public void reset()
  {
    mWidthPx = -1;
    mHeightPx = -1;
    mImageSizeBytes = -1;
    mFrameCount = -1;
    mLoopCount = -1;
    mImageFormat = null;
    setControllerId(null);
    invalidateSelf();
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setAnimationInfo(int paramInt1, int paramInt2)
  {
    mFrameCount = paramInt1;
    mLoopCount = paramInt2;
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
  
  public void setControllerId(@Nullable String paramString)
  {
    if (paramString == null) {
      paramString = "none";
    }
    mControllerId = paramString;
    invalidateSelf();
  }
  
  public void setDimensions(int paramInt1, int paramInt2)
  {
    mWidthPx = paramInt1;
    mHeightPx = paramInt2;
    invalidateSelf();
  }
  
  public void setImageFormat(@Nullable String paramString)
  {
    mImageFormat = paramString;
  }
  
  public void setImageId(@Nullable String paramString)
  {
    mImageId = paramString;
    invalidateSelf();
  }
  
  public void setImageSize(int paramInt)
  {
    mImageSizeBytes = paramInt;
  }
  
  public void setScaleType(ScalingUtils.ScaleType paramScaleType)
  {
    mScaleType = paramScaleType;
  }
  
  public void setTextGravity(int paramInt)
  {
    mTextGravity = paramInt;
    invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.debug.DebugControllerOverlayDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */