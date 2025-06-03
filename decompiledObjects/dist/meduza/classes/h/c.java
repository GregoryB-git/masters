package h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import y.a.a;

public class c
  extends Drawable
  implements Drawable.Callback
{
  public Drawable a;
  
  public c(Drawable paramDrawable)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    a = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    a.draw(paramCanvas);
  }
  
  public final int getChangingConfigurations()
  {
    return a.getChangingConfigurations();
  }
  
  public final Drawable getCurrent()
  {
    return a.getCurrent();
  }
  
  public final int getIntrinsicHeight()
  {
    return a.getIntrinsicHeight();
  }
  
  public final int getIntrinsicWidth()
  {
    return a.getIntrinsicWidth();
  }
  
  public final int getMinimumHeight()
  {
    return a.getMinimumHeight();
  }
  
  public final int getMinimumWidth()
  {
    return a.getMinimumWidth();
  }
  
  public final int getOpacity()
  {
    return a.getOpacity();
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    return a.getPadding(paramRect);
  }
  
  public final int[] getState()
  {
    return a.getState();
  }
  
  public final Region getTransparentRegion()
  {
    return a.getTransparentRegion();
  }
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public final boolean isAutoMirrored()
  {
    return a.isAutoMirrored();
  }
  
  public final boolean isStateful()
  {
    return a.isStateful();
  }
  
  public final void jumpToCurrentState()
  {
    a.jumpToCurrentState();
  }
  
  public final void onBoundsChange(Rect paramRect)
  {
    a.setBounds(paramRect);
  }
  
  public final boolean onLevelChange(int paramInt)
  {
    return a.setLevel(paramInt);
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void setAlpha(int paramInt)
  {
    a.setAlpha(paramInt);
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    a.setAutoMirrored(paramBoolean);
  }
  
  public final void setChangingConfigurations(int paramInt)
  {
    a.setChangingConfigurations(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    a.setColorFilter(paramColorFilter);
  }
  
  public final void setDither(boolean paramBoolean)
  {
    a.setDither(paramBoolean);
  }
  
  public final void setFilterBitmap(boolean paramBoolean)
  {
    a.setFilterBitmap(paramBoolean);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    a.a.e(a, paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a.f(a, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    return a.setState(paramArrayOfInt);
  }
  
  public final void setTint(int paramInt)
  {
    a.a.g(a, paramInt);
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    a.a.h(a, paramColorStateList);
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    a.a.i(a, paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!super.setVisible(paramBoolean1, paramBoolean2)) && (!a.setVisible(paramBoolean1, paramBoolean2))) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    return paramBoolean1;
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     h.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */