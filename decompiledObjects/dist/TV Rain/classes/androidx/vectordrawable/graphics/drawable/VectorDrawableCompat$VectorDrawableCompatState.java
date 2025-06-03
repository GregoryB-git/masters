package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.annotation.NonNull;

class VectorDrawableCompat$VectorDrawableCompatState
  extends Drawable.ConstantState
{
  public boolean mAutoMirrored;
  public boolean mCacheDirty;
  public boolean mCachedAutoMirrored;
  public Bitmap mCachedBitmap;
  public int mCachedRootAlpha;
  public int[] mCachedThemeAttrs;
  public ColorStateList mCachedTint;
  public PorterDuff.Mode mCachedTintMode;
  public int mChangingConfigurations;
  public Paint mTempPaint;
  public ColorStateList mTint = null;
  public PorterDuff.Mode mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
  public VectorDrawableCompat.VPathRenderer mVPathRenderer;
  
  public VectorDrawableCompat$VectorDrawableCompatState()
  {
    mVPathRenderer = new VectorDrawableCompat.VPathRenderer();
  }
  
  public VectorDrawableCompat$VectorDrawableCompatState(VectorDrawableCompatState paramVectorDrawableCompatState)
  {
    if (paramVectorDrawableCompatState != null)
    {
      mChangingConfigurations = mChangingConfigurations;
      VectorDrawableCompat.VPathRenderer localVPathRenderer = new VectorDrawableCompat.VPathRenderer(mVPathRenderer);
      mVPathRenderer = localVPathRenderer;
      if (mVPathRenderer.mFillPaint != null) {
        mFillPaint = new Paint(mVPathRenderer.mFillPaint);
      }
      if (mVPathRenderer.mStrokePaint != null) {
        mVPathRenderer.mStrokePaint = new Paint(mVPathRenderer.mStrokePaint);
      }
      mTint = mTint;
      mTintMode = mTintMode;
      mAutoMirrored = mAutoMirrored;
    }
  }
  
  public boolean canReuseBitmap(int paramInt1, int paramInt2)
  {
    return (paramInt1 == mCachedBitmap.getWidth()) && (paramInt2 == mCachedBitmap.getHeight());
  }
  
  public boolean canReuseCache()
  {
    return (!mCacheDirty) && (mCachedTint == mTint) && (mCachedTintMode == mTintMode) && (mCachedAutoMirrored == mAutoMirrored) && (mCachedRootAlpha == mVPathRenderer.getRootAlpha());
  }
  
  public void createCachedBitmapIfNeeded(int paramInt1, int paramInt2)
  {
    if ((mCachedBitmap == null) || (!canReuseBitmap(paramInt1, paramInt2)))
    {
      mCachedBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      mCacheDirty = true;
    }
  }
  
  public void drawCachedBitmapWithRootAlpha(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
  {
    paramColorFilter = getPaint(paramColorFilter);
    paramCanvas.drawBitmap(mCachedBitmap, null, paramRect, paramColorFilter);
  }
  
  public int getChangingConfigurations()
  {
    return mChangingConfigurations;
  }
  
  public Paint getPaint(ColorFilter paramColorFilter)
  {
    if ((!hasTranslucentRoot()) && (paramColorFilter == null)) {
      return null;
    }
    if (mTempPaint == null)
    {
      Paint localPaint = new Paint();
      mTempPaint = localPaint;
      localPaint.setFilterBitmap(true);
    }
    mTempPaint.setAlpha(mVPathRenderer.getRootAlpha());
    mTempPaint.setColorFilter(paramColorFilter);
    return mTempPaint;
  }
  
  public boolean hasTranslucentRoot()
  {
    boolean bool;
    if (mVPathRenderer.getRootAlpha() < 255) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStateful()
  {
    return mVPathRenderer.isStateful();
  }
  
  @NonNull
  public Drawable newDrawable()
  {
    return new VectorDrawableCompat(this);
  }
  
  @NonNull
  public Drawable newDrawable(Resources paramResources)
  {
    return new VectorDrawableCompat(this);
  }
  
  public boolean onStateChanged(int[] paramArrayOfInt)
  {
    boolean bool = mVPathRenderer.onStateChanged(paramArrayOfInt);
    mCacheDirty |= bool;
    return bool;
  }
  
  public void updateCacheStates()
  {
    mCachedTint = mTint;
    mCachedTintMode = mTintMode;
    mCachedRootAlpha = mVPathRenderer.getRootAlpha();
    mCachedAutoMirrored = mAutoMirrored;
    mCacheDirty = false;
  }
  
  public void updateCachedBitmap(int paramInt1, int paramInt2)
  {
    mCachedBitmap.eraseColor(0);
    Canvas localCanvas = new Canvas(mCachedBitmap);
    mVPathRenderer.draw(localCanvas, paramInt1, paramInt2, null);
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */