package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.cardview.R.color;
import androidx.cardview.R.dimen;

class RoundRectDrawableWithShadow
  extends Drawable
{
  private static final double COS_45 = Math.cos(Math.toRadians(45.0D));
  private static final float SHADOW_MULTIPLIER = 1.5F;
  public static RoundRectHelper sRoundRectHelper;
  private boolean mAddPaddingForCorners = true;
  private ColorStateList mBackground;
  private final RectF mCardBounds;
  private float mCornerRadius;
  private Paint mCornerShadowPaint;
  private Path mCornerShadowPath;
  private boolean mDirty = true;
  private Paint mEdgeShadowPaint;
  private final int mInsetShadow;
  private Paint mPaint;
  private boolean mPrintedShadowClipWarning = false;
  private float mRawMaxShadowSize;
  private float mRawShadowSize;
  private final int mShadowEndColor;
  private float mShadowSize;
  private final int mShadowStartColor;
  
  public RoundRectDrawableWithShadow(Resources paramResources, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    mShadowStartColor = paramResources.getColor(R.color.cardview_shadow_start_color);
    mShadowEndColor = paramResources.getColor(R.color.cardview_shadow_end_color);
    mInsetShadow = paramResources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
    mPaint = new Paint(5);
    setBackground(paramColorStateList);
    paramResources = new Paint(5);
    mCornerShadowPaint = paramResources;
    paramResources.setStyle(Paint.Style.FILL);
    mCornerRadius = ((int)(paramFloat1 + 0.5F));
    mCardBounds = new RectF();
    paramResources = new Paint(mCornerShadowPaint);
    mEdgeShadowPaint = paramResources;
    paramResources.setAntiAlias(false);
    setShadowSize(paramFloat2, paramFloat3);
  }
  
  private void buildComponents(Rect paramRect)
  {
    float f1 = mRawMaxShadowSize;
    float f2 = 1.5F * f1;
    mCardBounds.set(left + f1, top + f2, right - f1, bottom - f2);
    buildShadowCorners();
  }
  
  private void buildShadowCorners()
  {
    float f1 = mCornerRadius;
    RectF localRectF = new RectF(-f1, -f1, f1, f1);
    Object localObject1 = new RectF(localRectF);
    f1 = mShadowSize;
    ((RectF)localObject1).inset(-f1, -f1);
    Object localObject2 = mCornerShadowPath;
    if (localObject2 == null) {
      mCornerShadowPath = new Path();
    } else {
      ((Path)localObject2).reset();
    }
    mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
    mCornerShadowPath.moveTo(-mCornerRadius, 0.0F);
    mCornerShadowPath.rLineTo(-mShadowSize, 0.0F);
    mCornerShadowPath.arcTo((RectF)localObject1, 180.0F, 90.0F, false);
    mCornerShadowPath.arcTo(localRectF, 270.0F, -90.0F, false);
    mCornerShadowPath.close();
    f1 = mCornerRadius;
    float f2 = f1 / (mShadowSize + f1);
    localObject1 = mCornerShadowPaint;
    float f3 = mCornerRadius;
    f1 = mShadowSize;
    int i = mShadowStartColor;
    int j = mShadowEndColor;
    localObject2 = Shader.TileMode.CLAMP;
    ((Paint)localObject1).setShader(new RadialGradient(0.0F, 0.0F, f3 + f1, new int[] { i, i, j }, new float[] { 0.0F, f2, 1.0F }, (Shader.TileMode)localObject2));
    localObject1 = mEdgeShadowPaint;
    f2 = mCornerRadius;
    f1 = -f2;
    f3 = mShadowSize;
    f2 = -f2;
    j = mShadowStartColor;
    i = mShadowEndColor;
    localObject2 = Shader.TileMode.CLAMP;
    ((Paint)localObject1).setShader(new LinearGradient(0.0F, f1 + f3, 0.0F, f2 - f3, new int[] { j, j, i }, new float[] { 0.0F, 0.5F, 1.0F }, (Shader.TileMode)localObject2));
    mEdgeShadowPaint.setAntiAlias(false);
  }
  
  public static float calculateHorizontalPadding(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = paramFloat1;
    if (paramBoolean)
    {
      double d = paramFloat1;
      f = (float)((1.0D - COS_45) * paramFloat2 + d);
    }
    return f;
  }
  
  public static float calculateVerticalPadding(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      double d = paramFloat1 * 1.5F;
      return (float)((1.0D - COS_45) * paramFloat2 + d);
    }
    return paramFloat1 * 1.5F;
  }
  
  private void drawShadow(Canvas paramCanvas)
  {
    float f1 = mCornerRadius;
    float f2 = -f1 - mShadowSize;
    float f3 = mInsetShadow;
    float f4 = mRawShadowSize / 2.0F + (f1 + f3);
    f1 = mCardBounds.width();
    f3 = f4 * 2.0F;
    if (f1 - f3 > 0.0F) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (mCardBounds.height() - f3 > 0.0F) {
      j = 1;
    } else {
      j = 0;
    }
    int k = paramCanvas.save();
    RectF localRectF = mCardBounds;
    paramCanvas.translate(left + f4, top + f4);
    paramCanvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
    if (i != 0) {
      paramCanvas.drawRect(0.0F, f2, mCardBounds.width() - f3, -mCornerRadius, mEdgeShadowPaint);
    }
    paramCanvas.restoreToCount(k);
    k = paramCanvas.save();
    localRectF = mCardBounds;
    paramCanvas.translate(right - f4, bottom - f4);
    paramCanvas.rotate(180.0F);
    paramCanvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
    if (i != 0) {
      paramCanvas.drawRect(0.0F, f2, mCardBounds.width() - f3, -mCornerRadius + mShadowSize, mEdgeShadowPaint);
    }
    paramCanvas.restoreToCount(k);
    int i = paramCanvas.save();
    localRectF = mCardBounds;
    paramCanvas.translate(left + f4, bottom - f4);
    paramCanvas.rotate(270.0F);
    paramCanvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
    if (j != 0) {
      paramCanvas.drawRect(0.0F, f2, mCardBounds.height() - f3, -mCornerRadius, mEdgeShadowPaint);
    }
    paramCanvas.restoreToCount(i);
    i = paramCanvas.save();
    localRectF = mCardBounds;
    paramCanvas.translate(right - f4, top + f4);
    paramCanvas.rotate(90.0F);
    paramCanvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
    if (j != 0) {
      paramCanvas.drawRect(0.0F, f2, mCardBounds.height() - f3, -mCornerRadius, mEdgeShadowPaint);
    }
    paramCanvas.restoreToCount(i);
  }
  
  private void setBackground(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = paramColorStateList;
    if (paramColorStateList == null) {
      localColorStateList = ColorStateList.valueOf(0);
    }
    mBackground = localColorStateList;
    mPaint.setColor(localColorStateList.getColorForState(getState(), mBackground.getDefaultColor()));
  }
  
  private void setShadowSize(float paramFloat1, float paramFloat2)
  {
    if (paramFloat1 >= 0.0F)
    {
      if (paramFloat2 >= 0.0F)
      {
        float f = toEven(paramFloat1);
        paramFloat2 = toEven(paramFloat2);
        paramFloat1 = f;
        if (f > paramFloat2)
        {
          if (!mPrintedShadowClipWarning) {
            mPrintedShadowClipWarning = true;
          }
          paramFloat1 = paramFloat2;
        }
        if ((mRawShadowSize == paramFloat1) && (mRawMaxShadowSize == paramFloat2)) {
          return;
        }
        mRawShadowSize = paramFloat1;
        mRawMaxShadowSize = paramFloat2;
        mShadowSize = ((int)(paramFloat1 * 1.5F + mInsetShadow + 0.5F));
        mDirty = true;
        invalidateSelf();
        return;
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Invalid max shadow size ");
      localStringBuilder.append(paramFloat2);
      localStringBuilder.append(". Must be >= 0");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid shadow size ");
    localStringBuilder.append(paramFloat1);
    localStringBuilder.append(". Must be >= 0");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  private int toEven(float paramFloat)
  {
    int i = (int)(paramFloat + 0.5F);
    int j = i;
    if (i % 2 == 1) {
      j = i - 1;
    }
    return j;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (mDirty)
    {
      buildComponents(getBounds());
      mDirty = false;
    }
    paramCanvas.translate(0.0F, mRawShadowSize / 2.0F);
    drawShadow(paramCanvas);
    paramCanvas.translate(0.0F, -mRawShadowSize / 2.0F);
    sRoundRectHelper.drawRoundRect(paramCanvas, mCardBounds, mCornerRadius, mPaint);
  }
  
  public ColorStateList getColor()
  {
    return mBackground;
  }
  
  public float getCornerRadius()
  {
    return mCornerRadius;
  }
  
  public void getMaxShadowAndCornerPadding(Rect paramRect)
  {
    getPadding(paramRect);
  }
  
  public float getMaxShadowSize()
  {
    return mRawMaxShadowSize;
  }
  
  public float getMinHeight()
  {
    float f1 = mRawMaxShadowSize;
    float f2 = mCornerRadius;
    float f3 = mInsetShadow;
    f1 = Math.max(f1, f1 * 1.5F / 2.0F + (f2 + f3));
    return (mRawMaxShadowSize * 1.5F + mInsetShadow) * 2.0F + f1 * 2.0F;
  }
  
  public float getMinWidth()
  {
    float f1 = mRawMaxShadowSize;
    float f2 = mCornerRadius;
    float f3 = mInsetShadow;
    f1 = Math.max(f1, f1 / 2.0F + (f2 + f3));
    return (mRawMaxShadowSize + mInsetShadow) * 2.0F + f1 * 2.0F;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    int i = (int)Math.ceil(calculateVerticalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
    int j = (int)Math.ceil(calculateHorizontalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
    paramRect.set(j, i, j, i);
    return true;
  }
  
  public float getShadowSize()
  {
    return mRawShadowSize;
  }
  
  public boolean isStateful()
  {
    ColorStateList localColorStateList = mBackground;
    boolean bool;
    if (((localColorStateList != null) && (localColorStateList.isStateful())) || (super.isStateful())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    mDirty = true;
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    ColorStateList localColorStateList = mBackground;
    int i = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
    if (mPaint.getColor() == i) {
      return false;
    }
    mPaint.setColor(i);
    mDirty = true;
    invalidateSelf();
    return true;
  }
  
  public void setAddPaddingForCorners(boolean paramBoolean)
  {
    mAddPaddingForCorners = paramBoolean;
    invalidateSelf();
  }
  
  public void setAlpha(int paramInt)
  {
    mPaint.setAlpha(paramInt);
    mCornerShadowPaint.setAlpha(paramInt);
    mEdgeShadowPaint.setAlpha(paramInt);
  }
  
  public void setColor(@Nullable ColorStateList paramColorStateList)
  {
    setBackground(paramColorStateList);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mPaint.setColorFilter(paramColorFilter);
  }
  
  public void setCornerRadius(float paramFloat)
  {
    if (paramFloat >= 0.0F)
    {
      paramFloat = (int)(paramFloat + 0.5F);
      if (mCornerRadius == paramFloat) {
        return;
      }
      mCornerRadius = paramFloat;
      mDirty = true;
      invalidateSelf();
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid radius ");
    localStringBuilder.append(paramFloat);
    localStringBuilder.append(". Must be >= 0");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void setMaxShadowSize(float paramFloat)
  {
    setShadowSize(mRawShadowSize, paramFloat);
  }
  
  public void setShadowSize(float paramFloat)
  {
    setShadowSize(paramFloat, mRawMaxShadowSize);
  }
  
  public static abstract interface RoundRectHelper
  {
    public abstract void drawRoundRect(Canvas paramCanvas, RectF paramRectF, float paramFloat, Paint paramPaint);
  }
}

/* Location:
 * Qualified Name:     androidx.cardview.widget.RoundRectDrawableWithShadow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */