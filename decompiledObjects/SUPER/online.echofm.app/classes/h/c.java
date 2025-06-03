package h;

import B.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

public abstract class c
  extends Drawable
  implements Drawable.Callback
{
  public Drawable o;
  
  public c(Drawable paramDrawable)
  {
    b(paramDrawable);
  }
  
  public Drawable a()
  {
    return o;
  }
  
  public void b(Drawable paramDrawable)
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    o = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    o.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    return o.getChangingConfigurations();
  }
  
  public Drawable getCurrent()
  {
    return o.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return o.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return o.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return o.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return o.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return o.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return o.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return o.getState();
  }
  
  public Region getTransparentRegion()
  {
    return o.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored()
  {
    return a.g(o);
  }
  
  public boolean isStateful()
  {
    return o.isStateful();
  }
  
  public void jumpToCurrentState()
  {
    o.jumpToCurrentState();
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    o.setBounds(paramRect);
  }
  
  public boolean onLevelChange(int paramInt)
  {
    return o.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    o.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    a.i(o, paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    o.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    o.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    o.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    o.setFilterBitmap(paramBoolean);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    a.j(o, paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.k(o, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    return o.setState(paramArrayOfInt);
  }
  
  public void setTint(int paramInt)
  {
    a.l(o, paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    a.m(o, paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    a.n(o, paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!super.setVisible(paramBoolean1, paramBoolean2)) && (!o.setVisible(paramBoolean1, paramBoolean2))) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    return paramBoolean1;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     h.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */