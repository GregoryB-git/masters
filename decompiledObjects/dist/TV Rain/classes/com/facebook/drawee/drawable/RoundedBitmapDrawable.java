package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import javax.annotation.Nullable;

public class RoundedBitmapDrawable
  extends BitmapDrawable
  implements TransformAwareDrawable, Rounded
{
  @VisibleForTesting
  public final RectF mBitmapBounds = new RectF();
  private int mBorderColor = 0;
  private final Paint mBorderPaint;
  private final Path mBorderPath = new Path();
  @VisibleForTesting
  public final float[] mBorderRadii = new float[8];
  private float mBorderWidth = 0.0F;
  @VisibleForTesting
  public final Matrix mBoundsTransform = new Matrix();
  private final float[] mCornerRadii = new float[8];
  @VisibleForTesting
  public final RectF mDrawableBounds = new RectF();
  @Nullable
  @VisibleForTesting
  public RectF mInsideBorderBounds;
  @Nullable
  @VisibleForTesting
  public float[] mInsideBorderRadii;
  @Nullable
  @VisibleForTesting
  public Matrix mInsideBorderTransform;
  @VisibleForTesting
  public final Matrix mInverseParentTransform = new Matrix();
  private boolean mIsCircle = false;
  private boolean mIsPathDirty = true;
  private boolean mIsShaderTransformDirty;
  private WeakReference<Bitmap> mLastBitmap;
  private float mPadding = 0.0F;
  private final Paint mPaint;
  @VisibleForTesting
  public final Matrix mParentTransform = new Matrix();
  private final Path mPath = new Path();
  @VisibleForTesting
  public final Matrix mPrevBoundsTransform = new Matrix();
  @Nullable
  @VisibleForTesting
  public Matrix mPrevInsideBorderTransform;
  @VisibleForTesting
  public final Matrix mPrevParentTransform = new Matrix();
  @VisibleForTesting
  public final RectF mPrevRootBounds = new RectF();
  private boolean mRadiiNonZero = false;
  @VisibleForTesting
  public final RectF mRootBounds = new RectF();
  private boolean mScaleDownInsideBorders = false;
  @VisibleForTesting
  public final Matrix mTransform = new Matrix();
  @Nullable
  private TransformCallback mTransformCallback;
  
  public RoundedBitmapDrawable(Resources paramResources, Bitmap paramBitmap)
  {
    this(paramResources, paramBitmap, null);
  }
  
  public RoundedBitmapDrawable(Resources paramResources, Bitmap paramBitmap, @Nullable Paint paramPaint)
  {
    super(paramResources, paramBitmap);
    paramBitmap = new Paint();
    mPaint = paramBitmap;
    paramResources = new Paint(1);
    mBorderPaint = paramResources;
    mIsShaderTransformDirty = true;
    if (paramPaint != null) {
      paramBitmap.set(paramPaint);
    }
    paramBitmap.setFlags(1);
    paramResources.setStyle(Paint.Style.STROKE);
  }
  
  public static RoundedBitmapDrawable fromBitmapDrawable(Resources paramResources, BitmapDrawable paramBitmapDrawable)
  {
    return new RoundedBitmapDrawable(paramResources, paramBitmapDrawable.getBitmap(), paramBitmapDrawable.getPaint());
  }
  
  private void updatePaint()
  {
    Bitmap localBitmap = getBitmap();
    Object localObject = mLastBitmap;
    if ((localObject == null) || (((Reference)localObject).get() != localBitmap))
    {
      mLastBitmap = new WeakReference(localBitmap);
      localObject = mPaint;
      Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
      ((Paint)localObject).setShader(new BitmapShader(localBitmap, localTileMode, localTileMode));
      mIsShaderTransformDirty = true;
    }
    if (mIsShaderTransformDirty)
    {
      mPaint.getShader().setLocalMatrix(mTransform);
      mIsShaderTransformDirty = false;
    }
  }
  
  private void updatePath()
  {
    if (mIsPathDirty)
    {
      mBorderPath.reset();
      Object localObject = mRootBounds;
      float f1 = mBorderWidth;
      ((RectF)localObject).inset(f1 / 2.0F, f1 / 2.0F);
      int i;
      if (mIsCircle)
      {
        f1 = Math.min(mRootBounds.width(), mRootBounds.height()) / 2.0F;
        mBorderPath.addCircle(mRootBounds.centerX(), mRootBounds.centerY(), f1, Path.Direction.CW);
      }
      else
      {
        for (i = 0;; i++)
        {
          localObject = mBorderRadii;
          if (i >= localObject.length) {
            break;
          }
          localObject[i] = (mCornerRadii[i] + mPadding - mBorderWidth / 2.0F);
        }
        mBorderPath.addRoundRect(mRootBounds, (float[])localObject, Path.Direction.CW);
      }
      localObject = mRootBounds;
      f1 = mBorderWidth;
      ((RectF)localObject).inset(-f1 / 2.0F, -f1 / 2.0F);
      mPath.reset();
      float f2 = mPadding;
      if (mScaleDownInsideBorders) {
        f1 = mBorderWidth;
      } else {
        f1 = 0.0F;
      }
      f1 = f2 + f1;
      mRootBounds.inset(f1, f1);
      if (mIsCircle)
      {
        mPath.addCircle(mRootBounds.centerX(), mRootBounds.centerY(), Math.min(mRootBounds.width(), mRootBounds.height()) / 2.0F, Path.Direction.CW);
      }
      else if (mScaleDownInsideBorders)
      {
        if (mInsideBorderRadii == null) {
          mInsideBorderRadii = new float[8];
        }
        for (i = 0; i < mBorderRadii.length; i++) {
          mInsideBorderRadii[i] = (mCornerRadii[i] - mBorderWidth);
        }
        mPath.addRoundRect(mRootBounds, mInsideBorderRadii, Path.Direction.CW);
      }
      else
      {
        mPath.addRoundRect(mRootBounds, mCornerRadii, Path.Direction.CW);
      }
      localObject = mRootBounds;
      f1 = -f1;
      ((RectF)localObject).inset(f1, f1);
      mPath.setFillType(Path.FillType.WINDING);
      mIsPathDirty = false;
    }
  }
  
  private void updateTransform()
  {
    Object localObject = mTransformCallback;
    if (localObject != null)
    {
      ((TransformCallback)localObject).getTransform(mParentTransform);
      mTransformCallback.getRootBounds(mRootBounds);
    }
    else
    {
      mParentTransform.reset();
      mRootBounds.set(getBounds());
    }
    mBitmapBounds.set(0.0F, 0.0F, getBitmap().getWidth(), getBitmap().getHeight());
    mDrawableBounds.set(getBounds());
    mBoundsTransform.setRectToRect(mBitmapBounds, mDrawableBounds, Matrix.ScaleToFit.FILL);
    if (mScaleDownInsideBorders)
    {
      localObject = mInsideBorderBounds;
      if (localObject == null) {
        mInsideBorderBounds = new RectF(mRootBounds);
      } else {
        ((RectF)localObject).set(mRootBounds);
      }
      localObject = mInsideBorderBounds;
      float f = mBorderWidth;
      ((RectF)localObject).inset(f, f);
      if (mInsideBorderTransform == null) {
        mInsideBorderTransform = new Matrix();
      }
      mInsideBorderTransform.setRectToRect(mRootBounds, mInsideBorderBounds, Matrix.ScaleToFit.FILL);
    }
    else
    {
      localObject = mInsideBorderTransform;
      if (localObject != null) {
        ((Matrix)localObject).reset();
      }
    }
    if ((mParentTransform.equals(mPrevParentTransform)) && (mBoundsTransform.equals(mPrevBoundsTransform)))
    {
      localObject = mInsideBorderTransform;
      if ((localObject == null) || (((Matrix)localObject).equals(mPrevInsideBorderTransform))) {}
    }
    else
    {
      mIsShaderTransformDirty = true;
      mParentTransform.invert(mInverseParentTransform);
      mTransform.set(mParentTransform);
      if (mScaleDownInsideBorders) {
        mTransform.postConcat(mInsideBorderTransform);
      }
      mTransform.preConcat(mBoundsTransform);
      mPrevParentTransform.set(mParentTransform);
      mPrevBoundsTransform.set(mBoundsTransform);
      if (mScaleDownInsideBorders)
      {
        localObject = mPrevInsideBorderTransform;
        if (localObject == null) {
          mPrevInsideBorderTransform = new Matrix(mInsideBorderTransform);
        } else {
          ((Matrix)localObject).set(mInsideBorderTransform);
        }
      }
      else
      {
        localObject = mPrevInsideBorderTransform;
        if (localObject != null) {
          ((Matrix)localObject).reset();
        }
      }
    }
    if (!mRootBounds.equals(mPrevRootBounds))
    {
      mIsPathDirty = true;
      mPrevRootBounds.set(mRootBounds);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (!shouldRound())
    {
      super.draw(paramCanvas);
      return;
    }
    updateTransform();
    updatePath();
    updatePaint();
    int i = paramCanvas.save();
    paramCanvas.concat(mInverseParentTransform);
    paramCanvas.drawPath(mPath, mPaint);
    float f = mBorderWidth;
    if (f > 0.0F)
    {
      mBorderPaint.setStrokeWidth(f);
      mBorderPaint.setColor(DrawableUtils.multiplyColorAlpha(mBorderColor, mPaint.getAlpha()));
      paramCanvas.drawPath(mBorderPath, mBorderPaint);
    }
    paramCanvas.restoreToCount(i);
  }
  
  public int getBorderColor()
  {
    return mBorderColor;
  }
  
  public float getBorderWidth()
  {
    return mBorderWidth;
  }
  
  public float getPadding()
  {
    return mPadding;
  }
  
  public float[] getRadii()
  {
    return mCornerRadii;
  }
  
  public boolean getScaleDownInsideBorders()
  {
    return mScaleDownInsideBorders;
  }
  
  public boolean isCircle()
  {
    return mIsCircle;
  }
  
  public void setAlpha(int paramInt)
  {
    if (paramInt != mPaint.getAlpha())
    {
      mPaint.setAlpha(paramInt);
      super.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setBorder(int paramInt, float paramFloat)
  {
    if ((mBorderColor != paramInt) || (mBorderWidth != paramFloat))
    {
      mBorderColor = paramInt;
      mBorderWidth = paramFloat;
      mIsPathDirty = true;
      invalidateSelf();
    }
  }
  
  public void setCircle(boolean paramBoolean)
  {
    mIsCircle = paramBoolean;
    mIsPathDirty = true;
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mPaint.setColorFilter(paramColorFilter);
    super.setColorFilter(paramColorFilter);
  }
  
  public void setPadding(float paramFloat)
  {
    if (mPadding != paramFloat)
    {
      mPadding = paramFloat;
      mIsPathDirty = true;
      invalidateSelf();
    }
  }
  
  public void setRadii(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null)
    {
      Arrays.fill(mCornerRadii, 0.0F);
      mRadiiNonZero = false;
    }
    else
    {
      boolean bool1;
      if (paramArrayOfFloat.length == 8) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1, "radii should have exactly 8 values");
      System.arraycopy(paramArrayOfFloat, 0, mCornerRadii, 0, 8);
      mRadiiNonZero = false;
      for (int i = 0; i < 8; i++)
      {
        bool1 = mRadiiNonZero;
        boolean bool2;
        if (paramArrayOfFloat[i] > 0.0F) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        mRadiiNonZero = (bool1 | bool2);
      }
    }
    mIsPathDirty = true;
    invalidateSelf();
  }
  
  public void setRadius(float paramFloat)
  {
    boolean bool1 = paramFloat < 0.0F;
    boolean bool2 = false;
    if (!bool1) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    Preconditions.checkState(bool3);
    Arrays.fill(mCornerRadii, paramFloat);
    boolean bool3 = bool2;
    if (bool1) {
      bool3 = true;
    }
    mRadiiNonZero = bool3;
    mIsPathDirty = true;
    invalidateSelf();
  }
  
  public void setScaleDownInsideBorders(boolean paramBoolean)
  {
    if (mScaleDownInsideBorders != paramBoolean)
    {
      mScaleDownInsideBorders = paramBoolean;
      mIsPathDirty = true;
      invalidateSelf();
    }
  }
  
  public void setTransformCallback(@Nullable TransformCallback paramTransformCallback)
  {
    mTransformCallback = paramTransformCallback;
  }
  
  @VisibleForTesting
  public boolean shouldRound()
  {
    boolean bool;
    if (((mIsCircle) || (mRadiiNonZero) || (mBorderWidth > 0.0F)) && (getBitmap() != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.RoundedBitmapDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */