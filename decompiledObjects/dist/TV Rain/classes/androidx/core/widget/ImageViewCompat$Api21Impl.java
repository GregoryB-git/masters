package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class ImageViewCompat$Api21Impl
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

/* Location:
 * Qualified Name:     androidx.core.widget.ImageViewCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */