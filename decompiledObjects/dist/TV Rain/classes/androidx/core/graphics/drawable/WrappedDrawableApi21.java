package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@RequiresApi(21)
class WrappedDrawableApi21
  extends WrappedDrawableApi14
{
  private static final String TAG = "WrappedDrawableApi21";
  private static Method sIsProjectedDrawableMethod;
  
  public WrappedDrawableApi21(Drawable paramDrawable)
  {
    super(paramDrawable);
    findAndCacheIsProjectedDrawableMethod();
  }
  
  public WrappedDrawableApi21(WrappedDrawableState paramWrappedDrawableState, Resources paramResources)
  {
    super(paramWrappedDrawableState, paramResources);
    findAndCacheIsProjectedDrawableMethod();
  }
  
  private void findAndCacheIsProjectedDrawableMethod()
  {
    if (sIsProjectedDrawableMethod == null) {
      try
      {
        sIsProjectedDrawableMethod = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
      }
      catch (Exception localException)
      {
        Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", localException);
      }
    }
  }
  
  @NonNull
  public Rect getDirtyBounds()
  {
    return mDrawable.getDirtyBounds();
  }
  
  public void getOutline(@NonNull Outline paramOutline)
  {
    mDrawable.getOutline(paramOutline);
  }
  
  public boolean isCompatTintEnabled()
  {
    return false;
  }
  
  public boolean isProjected()
  {
    Drawable localDrawable = mDrawable;
    if (localDrawable != null)
    {
      Method localMethod = sIsProjectedDrawableMethod;
      if (localMethod != null) {
        try
        {
          boolean bool = ((Boolean)localMethod.invoke(localDrawable, new Object[0])).booleanValue();
          return bool;
        }
        catch (Exception localException)
        {
          Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", localException);
        }
      }
    }
    return false;
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    mDrawable.setHotspot(paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(@NonNull int[] paramArrayOfInt)
  {
    if (super.setState(paramArrayOfInt))
    {
      invalidateSelf();
      return true;
    }
    return false;
  }
  
  public void setTint(int paramInt)
  {
    if (isCompatTintEnabled()) {
      super.setTint(paramInt);
    } else {
      mDrawable.setTint(paramInt);
    }
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    if (isCompatTintEnabled()) {
      super.setTintList(paramColorStateList);
    } else {
      mDrawable.setTintList(paramColorStateList);
    }
  }
  
  public void setTintMode(@NonNull PorterDuff.Mode paramMode)
  {
    if (isCompatTintEnabled()) {
      super.setTintMode(paramMode);
    } else {
      mDrawable.setTintMode(paramMode);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.WrappedDrawableApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */