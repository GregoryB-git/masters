package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;

abstract class VectorDrawableCommon
  extends Drawable
  implements TintAwareDrawable
{
  public Drawable mDelegateDrawable;
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      DrawableCompat.applyTheme(localDrawable, paramTheme);
    }
  }
  
  public void clearColorFilter()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.clearColorFilter();
      return;
    }
    super.clearColorFilter();
  }
  
  public Drawable getCurrent()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getCurrent();
    }
    return super.getCurrent();
  }
  
  public int getMinimumHeight()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getMinimumHeight();
    }
    return super.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getMinimumWidth();
    }
    return super.getMinimumWidth();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getPadding(paramRect);
    }
    return super.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getState();
    }
    return super.getState();
  }
  
  public Region getTransparentRegion()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.getTransparentRegion();
    }
    return super.getTransparentRegion();
  }
  
  public void jumpToCurrentState()
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      DrawableCompat.jumpToCurrentState(localDrawable);
    }
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.setBounds(paramRect);
      return;
    }
    super.onBoundsChange(paramRect);
  }
  
  public boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return super.onLevelChange(paramInt);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.setChangingConfigurations(paramInt);
      return;
    }
    super.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null)
    {
      localDrawable.setColorFilter(paramInt, paramMode);
      return;
    }
    super.setColorFilter(paramInt, paramMode);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      localDrawable.setFilterBitmap(paramBoolean);
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      DrawableCompat.setHotspot(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      DrawableCompat.setHotspotBounds(localDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    Drawable localDrawable = mDelegateDrawable;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    return super.setState(paramArrayOfInt);
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCommon
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */