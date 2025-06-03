package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;

class RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable
  extends RoundedBitmapDrawable
{
  public RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable(Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
  }
  
  public void gravityCompatApply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    GravityCompat.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, 0);
  }
  
  public boolean hasMipMap()
  {
    Bitmap localBitmap = mBitmap;
    boolean bool;
    if ((localBitmap != null) && (BitmapCompat.hasMipMap(localBitmap))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setMipMap(boolean paramBoolean)
  {
    Bitmap localBitmap = mBitmap;
    if (localBitmap != null)
    {
      BitmapCompat.setHasMipMap(localBitmap, paramBoolean);
      invalidateSelf();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.RoundedBitmapDrawableFactory.DefaultRoundedBitmapDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */