package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;

public class AutoRotateDrawable
  extends ForwardingDrawable
  implements Runnable, CloneableDrawable
{
  private static final int DEGREES_IN_FULL_ROTATION = 360;
  private static final int FRAME_INTERVAL_MS = 20;
  private boolean mClockwise;
  private int mInterval;
  private boolean mIsScheduled = false;
  @VisibleForTesting
  public float mRotationAngle = 0.0F;
  
  public AutoRotateDrawable(Drawable paramDrawable, int paramInt)
  {
    this(paramDrawable, paramInt, true);
  }
  
  public AutoRotateDrawable(Drawable paramDrawable, int paramInt, boolean paramBoolean)
  {
    super((Drawable)Preconditions.checkNotNull(paramDrawable));
    mInterval = paramInt;
    mClockwise = paramBoolean;
  }
  
  private int getIncrement()
  {
    return (int)(20.0F / mInterval * 360.0F);
  }
  
  private void scheduleNextFrame()
  {
    if (!mIsScheduled)
    {
      mIsScheduled = true;
      scheduleSelf(this, SystemClock.uptimeMillis() + 20L);
    }
  }
  
  public AutoRotateDrawable cloneDrawable()
  {
    return new AutoRotateDrawable(DrawableUtils.cloneDrawable(getDrawable()), mInterval, mClockwise);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i = paramCanvas.save();
    Rect localRect = getBounds();
    int j = right;
    int k = left;
    int m = bottom;
    int n = top;
    float f1 = mRotationAngle;
    float f2 = f1;
    if (!mClockwise) {
      f2 = 360.0F - f1;
    }
    paramCanvas.rotate(f2, (j - k) / 2 + k, (m - n) / 2 + n);
    super.draw(paramCanvas);
    paramCanvas.restoreToCount(i);
    scheduleNextFrame();
  }
  
  public void reset()
  {
    mRotationAngle = 0.0F;
    mIsScheduled = false;
    unscheduleSelf(this);
    invalidateSelf();
  }
  
  public void run()
  {
    mIsScheduled = false;
    mRotationAngle += getIncrement();
    invalidateSelf();
  }
  
  public void setClockwise(boolean paramBoolean)
  {
    mClockwise = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.AutoRotateDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */