package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.util.Arrays;

public class FadeDrawable
  extends ArrayDrawable
{
  @VisibleForTesting
  public static final int TRANSITION_NONE = 2;
  @VisibleForTesting
  public static final int TRANSITION_RUNNING = 1;
  @VisibleForTesting
  public static final int TRANSITION_STARTING = 0;
  @VisibleForTesting
  public int mAlpha;
  @VisibleForTesting
  public int[] mAlphas;
  @VisibleForTesting
  public int mDurationMs;
  @VisibleForTesting
  public boolean[] mIsLayerOn;
  private final Drawable[] mLayers;
  @VisibleForTesting
  public int mPreventInvalidateCount;
  @VisibleForTesting
  public int[] mStartAlphas;
  @VisibleForTesting
  public long mStartTimeMs;
  @VisibleForTesting
  public int mTransitionState;
  
  public FadeDrawable(Drawable[] paramArrayOfDrawable)
  {
    super(paramArrayOfDrawable);
    int i = paramArrayOfDrawable.length;
    boolean bool = true;
    if (i < 1) {
      bool = false;
    }
    Preconditions.checkState(bool, "At least one layer required!");
    mLayers = paramArrayOfDrawable;
    mStartAlphas = new int[paramArrayOfDrawable.length];
    mAlphas = new int[paramArrayOfDrawable.length];
    mAlpha = 255;
    mIsLayerOn = new boolean[paramArrayOfDrawable.length];
    mPreventInvalidateCount = 0;
    resetInternal();
  }
  
  private void drawDrawableWithAlpha(Canvas paramCanvas, Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable != null) && (paramInt > 0))
    {
      mPreventInvalidateCount += 1;
      paramDrawable.mutate().setAlpha(paramInt);
      mPreventInvalidateCount -= 1;
      paramDrawable.draw(paramCanvas);
    }
  }
  
  private void resetInternal()
  {
    mTransitionState = 2;
    Arrays.fill(mStartAlphas, 0);
    mStartAlphas[0] = 255;
    Arrays.fill(mAlphas, 0);
    mAlphas[0] = 255;
    Arrays.fill(mIsLayerOn, false);
    mIsLayerOn[0] = true;
  }
  
  private boolean updateAlphas(float paramFloat)
  {
    boolean bool1 = true;
    for (int i = 0; i < mLayers.length; i++)
    {
      int j = mIsLayerOn[i];
      if (j != 0) {
        k = 1;
      } else {
        k = -1;
      }
      int[] arrayOfInt = mAlphas;
      float f = mStartAlphas[i];
      int k = (int)(k * 255 * paramFloat + f);
      arrayOfInt[i] = k;
      if (k < 0) {
        arrayOfInt[i] = 0;
      }
      if (arrayOfInt[i] > 255) {
        arrayOfInt[i] = 255;
      }
      boolean bool2 = bool1;
      if (j != 0)
      {
        bool2 = bool1;
        if (arrayOfInt[i] < 255) {
          bool2 = false;
        }
      }
      bool1 = bool2;
      if (j == 0)
      {
        bool1 = bool2;
        if (arrayOfInt[i] > 0) {
          bool1 = false;
        }
      }
    }
    return bool1;
  }
  
  public void beginBatchMode()
  {
    mPreventInvalidateCount += 1;
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i = mTransitionState;
    int j = 2;
    int k = 0;
    boolean bool = true;
    if (i != 0)
    {
      if (i != 1)
      {
        j = k;
        break label157;
      }
      if (mDurationMs > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      bool = updateAlphas((float)(getCurrentTimeMs() - mStartTimeMs) / mDurationMs);
      if (!bool) {
        j = 1;
      }
      mTransitionState = j;
    }
    else
    {
      System.arraycopy(mAlphas, 0, mStartAlphas, 0, mLayers.length);
      mStartTimeMs = getCurrentTimeMs();
      float f;
      if (mDurationMs == 0) {
        f = 1.0F;
      } else {
        f = 0.0F;
      }
      bool = updateAlphas(f);
      if (!bool) {
        j = 1;
      }
      mTransitionState = j;
    }
    for (j = k;; j++)
    {
      label157:
      Drawable[] arrayOfDrawable = mLayers;
      if (j >= arrayOfDrawable.length) {
        break;
      }
      drawDrawableWithAlpha(paramCanvas, arrayOfDrawable[j], mAlphas[j] * mAlpha / 255);
    }
    if (!bool) {
      invalidateSelf();
    }
  }
  
  public void endBatchMode()
  {
    mPreventInvalidateCount -= 1;
    invalidateSelf();
  }
  
  public void fadeInAllLayers()
  {
    mTransitionState = 0;
    Arrays.fill(mIsLayerOn, true);
    invalidateSelf();
  }
  
  public void fadeInLayer(int paramInt)
  {
    mTransitionState = 0;
    mIsLayerOn[paramInt] = true;
    invalidateSelf();
  }
  
  public void fadeOutAllLayers()
  {
    mTransitionState = 0;
    Arrays.fill(mIsLayerOn, false);
    invalidateSelf();
  }
  
  public void fadeOutLayer(int paramInt)
  {
    mTransitionState = 0;
    mIsLayerOn[paramInt] = false;
    invalidateSelf();
  }
  
  public void fadeToLayer(int paramInt)
  {
    mTransitionState = 0;
    Arrays.fill(mIsLayerOn, false);
    mIsLayerOn[paramInt] = true;
    invalidateSelf();
  }
  
  public void fadeUpToLayer(int paramInt)
  {
    mTransitionState = 0;
    boolean[] arrayOfBoolean = mIsLayerOn;
    paramInt++;
    Arrays.fill(arrayOfBoolean, 0, paramInt, true);
    Arrays.fill(mIsLayerOn, paramInt, mLayers.length, false);
    invalidateSelf();
  }
  
  public void finishTransitionImmediately()
  {
    mTransitionState = 2;
    for (int i = 0; i < mLayers.length; i++)
    {
      int[] arrayOfInt = mAlphas;
      int j;
      if (mIsLayerOn[i] != 0) {
        j = 255;
      } else {
        j = 0;
      }
      arrayOfInt[i] = j;
    }
    invalidateSelf();
  }
  
  public int getAlpha()
  {
    return mAlpha;
  }
  
  public long getCurrentTimeMs()
  {
    return SystemClock.uptimeMillis();
  }
  
  public int getTransitionDuration()
  {
    return mDurationMs;
  }
  
  @VisibleForTesting
  public int getTransitionState()
  {
    return mTransitionState;
  }
  
  public void invalidateSelf()
  {
    if (mPreventInvalidateCount == 0) {
      super.invalidateSelf();
    }
  }
  
  public boolean isLayerOn(int paramInt)
  {
    return mIsLayerOn[paramInt];
  }
  
  public void reset()
  {
    resetInternal();
    invalidateSelf();
  }
  
  public void setAlpha(int paramInt)
  {
    if (mAlpha != paramInt)
    {
      mAlpha = paramInt;
      invalidateSelf();
    }
  }
  
  public void setTransitionDuration(int paramInt)
  {
    mDurationMs = paramInt;
    if (mTransitionState == 1) {
      mTransitionState = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.FadeDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */