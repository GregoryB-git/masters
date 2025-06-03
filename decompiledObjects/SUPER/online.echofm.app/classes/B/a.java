package B;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public abstract class a
{
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    b.a(paramDrawable, paramTheme);
  }
  
  public static boolean b(Drawable paramDrawable)
  {
    return b.b(paramDrawable);
  }
  
  public static int c(Drawable paramDrawable)
  {
    return a.a(paramDrawable);
  }
  
  public static ColorFilter d(Drawable paramDrawable)
  {
    return b.c(paramDrawable);
  }
  
  public static int e(Drawable paramDrawable)
  {
    return c.a(paramDrawable);
  }
  
  public static void f(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    b.d(paramDrawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public static boolean g(Drawable paramDrawable)
  {
    return a.d(paramDrawable);
  }
  
  public static void h(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public static void i(Drawable paramDrawable, boolean paramBoolean)
  {
    a.e(paramDrawable, paramBoolean);
  }
  
  public static void j(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    b.e(paramDrawable, paramFloat1, paramFloat2);
  }
  
  public static void k(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b.f(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void l(Drawable paramDrawable, int paramInt)
  {
    b.g(paramDrawable, paramInt);
  }
  
  public static void m(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    b.h(paramDrawable, paramColorStateList);
  }
  
  public static void n(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    b.i(paramDrawable, paramMode);
  }
  
  public static Drawable o(Drawable paramDrawable)
  {
    return paramDrawable;
  }
  
  public static abstract class a
  {
    public static int a(Drawable paramDrawable)
    {
      return paramDrawable.getAlpha();
    }
    
    public static Drawable b(DrawableContainer.DrawableContainerState paramDrawableContainerState, int paramInt)
    {
      return paramDrawableContainerState.getChild(paramInt);
    }
    
    public static Drawable c(InsetDrawable paramInsetDrawable)
    {
      return paramInsetDrawable.getDrawable();
    }
    
    public static boolean d(Drawable paramDrawable)
    {
      return paramDrawable.isAutoMirrored();
    }
    
    public static void e(Drawable paramDrawable, boolean paramBoolean)
    {
      paramDrawable.setAutoMirrored(paramBoolean);
    }
  }
  
  public static abstract class b
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
  
  public static abstract class c
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
 * Qualified Name:     B.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */