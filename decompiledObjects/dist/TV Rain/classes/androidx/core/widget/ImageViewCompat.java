package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class ImageViewCompat
{
  @Nullable
  public static ColorStateList getImageTintList(@NonNull ImageView paramImageView)
  {
    return Api21Impl.getImageTintList(paramImageView);
  }
  
  @Nullable
  public static PorterDuff.Mode getImageTintMode(@NonNull ImageView paramImageView)
  {
    return Api21Impl.getImageTintMode(paramImageView);
  }
  
  public static void setImageTintList(@NonNull ImageView paramImageView, @Nullable ColorStateList paramColorStateList)
  {
    Api21Impl.setImageTintList(paramImageView, paramColorStateList);
  }
  
  public static void setImageTintMode(@NonNull ImageView paramImageView, @Nullable PorterDuff.Mode paramMode)
  {
    Api21Impl.setImageTintMode(paramImageView, paramMode);
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static ColorStateList getImageTintList(ImageView paramImageView)
    {
      return paramImageView.getImageTintList();
    }
    
    @DoNotInline
    public static PorterDuff.Mode getImageTintMode(ImageView paramImageView)
    {
      return paramImageView.getImageTintMode();
    }
    
    @DoNotInline
    public static void setImageTintList(ImageView paramImageView, ColorStateList paramColorStateList)
    {
      paramImageView.setImageTintList(paramColorStateList);
    }
    
    @DoNotInline
    public static void setImageTintMode(ImageView paramImageView, PorterDuff.Mode paramMode)
    {
      paramImageView.setImageTintMode(paramMode);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.ImageViewCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */