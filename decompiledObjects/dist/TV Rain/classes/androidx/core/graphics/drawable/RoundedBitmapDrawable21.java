package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class RoundedBitmapDrawable21
  extends RoundedBitmapDrawable
{
  public RoundedBitmapDrawable21(Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
  }
  
  public void getOutline(@NonNull Outline paramOutline)
  {
    updateDstRect();
    paramOutline.setRoundRect(mDstRect, getCornerRadius());
  }
  
  public void gravityCompatApply(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, 0);
  }
  
  public boolean hasMipMap()
  {
    Bitmap localBitmap = mBitmap;
    boolean bool;
    if ((localBitmap != null) && (localBitmap.hasMipMap())) {
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
      localBitmap.setHasMipMap(paramBoolean);
      invalidateSelf();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.RoundedBitmapDrawable21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */