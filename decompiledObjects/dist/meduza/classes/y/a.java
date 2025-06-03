package y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class a
{
  public static void a(Drawable paramDrawable, int paramInt)
  {
    a.g(paramDrawable, paramInt);
  }
  
  public static void b(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    a.h(paramDrawable, paramColorStateList);
  }
  
  public static void c(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    a.i(paramDrawable, paramMode);
  }
  
  public static final class a
  {
    public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
    {
      paramDrawable.applyTheme(paramTheme);
    }
    
    public static boolean b(Drawable paramDrawable)
    {
      return paramDrawable.canApplyTheme();
    }
    
    public static ColorFilter c(Drawable paramDrawable)
    {
      return paramDrawable.getColorFilter();
    }
    
    public static void d(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    
    public static void e(Drawable paramDrawable, float paramFloat1, float paramFloat2)
    {
      paramDrawable.setHotspot(paramFloat1, paramFloat2);
    }
    
    public static void f(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public static void g(Drawable paramDrawable, int paramInt)
    {
      paramDrawable.setTint(paramInt);
    }
    
    public static void h(Drawable paramDrawable, ColorStateList paramColorStateList)
    {
      paramDrawable.setTintList(paramColorStateList);
    }
    
    public static void i(Drawable paramDrawable, PorterDuff.Mode paramMode)
    {
      paramDrawable.setTintMode(paramMode);
    }
  }
  
  public static final class b
  {
    public static int a(Drawable paramDrawable)
    {
      return paramDrawable.getLayoutDirection();
    }
    
    public static boolean b(Drawable paramDrawable, int paramInt)
    {
      return paramDrawable.setLayoutDirection(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     y.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */