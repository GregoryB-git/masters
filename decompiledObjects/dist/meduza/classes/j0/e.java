package j0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

public final class e
{
  public static ColorStateList a(ImageView paramImageView)
  {
    return paramImageView.getImageTintList();
  }
  
  public static PorterDuff.Mode b(ImageView paramImageView)
  {
    return paramImageView.getImageTintMode();
  }
  
  public static void c(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    paramImageView.setImageTintList(paramColorStateList);
  }
  
  public static void d(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    paramImageView.setImageTintMode(paramMode);
  }
}

/* Location:
 * Qualified Name:     j0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */