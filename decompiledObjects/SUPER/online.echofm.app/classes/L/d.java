package L;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

public abstract class d
{
  public static ColorStateList a(ImageView paramImageView)
  {
    return a.a(paramImageView);
  }
  
  public static PorterDuff.Mode b(ImageView paramImageView)
  {
    return a.b(paramImageView);
  }
  
  public static void c(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    a.c(paramImageView, paramColorStateList);
  }
  
  public static void d(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    a.d(paramImageView, paramMode);
  }
  
  public static abstract class a
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
}

/* Location:
 * Qualified Name:     L.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */