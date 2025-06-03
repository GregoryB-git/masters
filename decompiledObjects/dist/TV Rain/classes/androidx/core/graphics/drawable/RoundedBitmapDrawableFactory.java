package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;
import java.io.InputStream;
import z2;

public final class RoundedBitmapDrawableFactory
{
  private static final String TAG = "RoundedBitmapDrawableFa";
  
  @NonNull
  public static RoundedBitmapDrawable create(@NonNull Resources paramResources, @Nullable Bitmap paramBitmap)
  {
    return new RoundedBitmapDrawable21(paramResources, paramBitmap);
  }
  
  @NonNull
  public static RoundedBitmapDrawable create(@NonNull Resources paramResources, @NonNull InputStream paramInputStream)
  {
    paramResources = create(paramResources, BitmapFactory.decodeStream(paramInputStream));
    if (paramResources.getBitmap() == null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RoundedBitmapDrawable cannot decode ");
      localStringBuilder.append(paramInputStream);
      Log.w("RoundedBitmapDrawableFa", localStringBuilder.toString());
    }
    return paramResources;
  }
  
  @NonNull
  public static RoundedBitmapDrawable create(@NonNull Resources paramResources, @NonNull String paramString)
  {
    paramResources = create(paramResources, BitmapFactory.decodeFile(paramString));
    if (paramResources.getBitmap() == null) {
      z2.A("RoundedBitmapDrawable cannot decode ", paramString, "RoundedBitmapDrawableFa");
    }
    return paramResources;
  }
  
  public static class DefaultRoundedBitmapDrawable
    extends RoundedBitmapDrawable
  {
    public DefaultRoundedBitmapDrawable(Resources paramResources, Bitmap paramBitmap)
    {
      super(paramBitmap);
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
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */