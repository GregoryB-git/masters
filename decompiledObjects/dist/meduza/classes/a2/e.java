package a2;

import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import y.a.a;

public abstract class e
  extends Drawable
{
  public Drawable a;
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      a.a.a(localDrawable, paramTheme);
    }
  }
  
  public final void clearColorFilter()
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.clearColorFilter();
      return;
    }
    super.clearColorFilter();
  }
  
  public final Drawable getCurrent()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getCurrent();
    }
    return super.getCurrent();
  }
  
  public final int getMinimumHeight()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getMinimumHeight();
    }
    return super.getMinimumHeight();
  }
  
  public final int getMinimumWidth()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getMinimumWidth();
    }
    return super.getMinimumWidth();
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getPadding(paramRect);
    }
    return super.getPadding(paramRect);
  }
  
  public final int[] getState()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getState();
    }
    return super.getState();
  }
  
  public final Region getTransparentRegion()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getTransparentRegion();
    }
    return super.getTransparentRegion();
  }
  
  public final void jumpToCurrentState()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return super.onLevelChange(paramInt);
  }
  
  public final void setChangingConfigurations(int paramInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setChangingConfigurations(paramInt);
      return;
    }
    super.setChangingConfigurations(paramInt);
  }
  
  public final void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setColorFilter(paramInt, paramMode);
      return;
    }
    super.setColorFilter(paramInt, paramMode);
  }
  
  public final void setFilterBitmap(boolean paramBoolean)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      localDrawable.setFilterBitmap(paramBoolean);
    }
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      a.a.e(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      a.a.f(localDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final boolean setState(int[] paramArrayOfInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    return super.setState(paramArrayOfInt);
  }
}

/* Location:
 * Qualified Name:     a2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */