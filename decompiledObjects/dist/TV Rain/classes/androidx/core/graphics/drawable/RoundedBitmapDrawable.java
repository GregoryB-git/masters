package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class RoundedBitmapDrawable
  extends Drawable
{
  private static final int DEFAULT_PAINT_FLAGS = 3;
  private boolean mApplyGravity = true;
  public final Bitmap mBitmap;
  private int mBitmapHeight;
  private final BitmapShader mBitmapShader;
  private int mBitmapWidth;
  private float mCornerRadius;
  public final Rect mDstRect = new Rect();
  private final RectF mDstRectF = new RectF();
  private int mGravity = 119;
  private boolean mIsCircular;
  private final Paint mPaint = new Paint(3);
  private final Matrix mShaderMatrix = new Matrix();
  private int mTargetDensity = 160;
  
  public RoundedBitmapDrawable(Resources paramResources, Bitmap paramBitmap)
  {
    if (paramResources != null) {
      mTargetDensity = getDisplayMetricsdensityDpi;
    }
    mBitmap = paramBitmap;
    if (paramBitmap != null)
    {
      computeBitmapSize();
      paramResources = Shader.TileMode.CLAMP;
      mBitmapShader = new BitmapShader(paramBitmap, paramResources, paramResources);
    }
    else
    {
      mBitmapHeight = -1;
      mBitmapWidth = -1;
      mBitmapShader = null;
    }
  }
  
  private void computeBitmapSize()
  {
    mBitmapWidth = mBitmap.getScaledWidth(mTargetDensity);
    mBitmapHeight = mBitmap.getScaledHeight(mTargetDensity);
  }
  
  private static boolean isGreaterThanZero(float paramFloat)
  {
    boolean bool;
    if (paramFloat > 0.05F) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void updateCircularCornerRadius()
  {
    mCornerRadius = (Math.min(mBitmapHeight, mBitmapWidth) / 2);
  }
  
  public void draw(@NonNull Canvas paramCanvas)
  {
    Object localObject = mBitmap;
    if (localObject == null) {
      return;
    }
    updateDstRect();
    if (mPaint.getShader() == null)
    {
      paramCanvas.drawBitmap((Bitmap)localObject, null, mDstRect, mPaint);
    }
    else
    {
      localObject = mDstRectF;
      float f = mCornerRadius;
      paramCanvas.drawRoundRect((RectF)localObject, f, f, mPaint);
    }
  }
  
  public int getAlpha()
  {
    return mPaint.getAlpha();
  }
  
  @Nullable
  public final Bitmap getBitmap()
  {
    return mBitmap;
  }
  
  public ColorFilter getColorFilter()
  {
    return mPaint.getColorFilter();
  }
  
  public float getCornerRadius()
  {
    return mCornerRadius;
  }
  
  public int getGravity()
  {
    return mGravity;
  }
  
  public int getIntrinsicHeight()
  {
    return mBitmapHeight;
  }
  
  public int getIntrinsicWidth()
  {
    return mBitmapWidth;
  }
  
  public int getOpacity()
  {
    int i = mGravity;
    int j = -3;
    int k = j;
    if (i == 119) {
      if (mIsCircular)
      {
        k = j;
      }
      else
      {
        Bitmap localBitmap = mBitmap;
        k = j;
        if (localBitmap != null)
        {
          k = j;
          if (!localBitmap.hasAlpha())
          {
            k = j;
            if (mPaint.getAlpha() >= 255) {
              if (isGreaterThanZero(mCornerRadius)) {
                k = j;
              } else {
                k = -1;
              }
            }
          }
        }
      }
    }
    return k;
  }
  
  @NonNull
  public final Paint getPaint()
  {
    return mPaint;
  }
  
  public void gravityCompatApply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean hasAntiAlias()
  {
    return mPaint.isAntiAlias();
  }
  
  public boolean hasMipMap()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean isCircular()
  {
    return mIsCircular;
  }
  
  public void onBoundsChange(@NonNull Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    if (mIsCircular) {
      updateCircularCornerRadius();
    }
    mApplyGravity = true;
  }
  
  public void setAlpha(int paramInt)
  {
    if (paramInt != mPaint.getAlpha())
    {
      mPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setAntiAlias(boolean paramBoolean)
  {
    mPaint.setAntiAlias(paramBoolean);
    invalidateSelf();
  }
  
  public void setCircular(boolean paramBoolean)
  {
    mIsCircular = paramBoolean;
    mApplyGravity = true;
    if (paramBoolean)
    {
      updateCircularCornerRadius();
      mPaint.setShader(mBitmapShader);
      invalidateSelf();
    }
    else
    {
      setCornerRadius(0.0F);
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setCornerRadius(float paramFloat)
  {
    if (mCornerRadius == paramFloat) {
      return;
    }
    mIsCircular = false;
    if (isGreaterThanZero(paramFloat)) {
      mPaint.setShader(mBitmapShader);
    } else {
      mPaint.setShader(null);
    }
    mCornerRadius = paramFloat;
    invalidateSelf();
  }
  
  public void setDither(boolean paramBoolean)
  {
    mPaint.setDither(paramBoolean);
    invalidateSelf();
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    mPaint.setFilterBitmap(paramBoolean);
    invalidateSelf();
  }
  
  public void setGravity(int paramInt)
  {
    if (mGravity != paramInt)
    {
      mGravity = paramInt;
      mApplyGravity = true;
      invalidateSelf();
    }
  }
  
  public void setMipMap(boolean paramBoolean)
  {
    throw new UnsupportedOperationException();
  }
  
  public void setTargetDensity(int paramInt)
  {
    if (mTargetDensity != paramInt)
    {
      int i = paramInt;
      if (paramInt == 0) {
        i = 160;
      }
      mTargetDensity = i;
      if (mBitmap != null) {
        computeBitmapSize();
      }
      invalidateSelf();
    }
  }
  
  public void setTargetDensity(@NonNull Canvas paramCanvas)
  {
    setTargetDensity(paramCanvas.getDensity());
  }
  
  public void setTargetDensity(@NonNull DisplayMetrics paramDisplayMetrics)
  {
    setTargetDensity(densityDpi);
  }
  
  public void updateDstRect()
  {
    if (mApplyGravity)
    {
      if (mIsCircular)
      {
        int i = Math.min(mBitmapWidth, mBitmapHeight);
        gravityCompatApply(mGravity, i, i, getBounds(), mDstRect);
        i = Math.min(mDstRect.width(), mDstRect.height());
        int j = Math.max(0, (mDstRect.width() - i) / 2);
        int k = Math.max(0, (mDstRect.height() - i) / 2);
        mDstRect.inset(j, k);
        mCornerRadius = (i * 0.5F);
      }
      else
      {
        gravityCompatApply(mGravity, mBitmapWidth, mBitmapHeight, getBounds(), mDstRect);
      }
      mDstRectF.set(mDstRect);
      if (mBitmapShader != null)
      {
        Matrix localMatrix = mShaderMatrix;
        RectF localRectF = mDstRectF;
        localMatrix.setTranslate(left, top);
        mShaderMatrix.preScale(mDstRectF.width() / mBitmap.getWidth(), mDstRectF.height() / mBitmap.getHeight());
        mBitmapShader.setLocalMatrix(mShaderMatrix);
        mPaint.setShader(mBitmapShader);
      }
      mApplyGravity = false;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.RoundedBitmapDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */