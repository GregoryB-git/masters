package com.facebook.drawee.generic;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import javax.annotation.Nullable;

public class RootDrawable
  extends ForwardingDrawable
  implements VisibilityAwareDrawable
{
  @Nullable
  @VisibleForTesting
  public Drawable mControllerOverlay = null;
  @Nullable
  private VisibilityCallback mVisibilityCallback;
  
  public RootDrawable(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  @SuppressLint({"WrongCall"})
  public void draw(Canvas paramCanvas)
  {
    if (!isVisible()) {
      return;
    }
    Object localObject = mVisibilityCallback;
    if (localObject != null) {
      ((VisibilityCallback)localObject).onDraw();
    }
    super.draw(paramCanvas);
    localObject = mControllerOverlay;
    if (localObject != null)
    {
      ((Drawable)localObject).setBounds(getBounds());
      mControllerOverlay.draw(paramCanvas);
    }
  }
  
  public int getIntrinsicHeight()
  {
    return -1;
  }
  
  public int getIntrinsicWidth()
  {
    return -1;
  }
  
  public void setControllerOverlay(@Nullable Drawable paramDrawable)
  {
    mControllerOverlay = paramDrawable;
    invalidateSelf();
  }
  
  public void setVisibilityCallback(@Nullable VisibilityCallback paramVisibilityCallback)
  {
    mVisibilityCallback = paramVisibilityCallback;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    VisibilityCallback localVisibilityCallback = mVisibilityCallback;
    if (localVisibilityCallback != null) {
      localVisibilityCallback.onVisibilityChange(paramBoolean1);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.generic.RootDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */