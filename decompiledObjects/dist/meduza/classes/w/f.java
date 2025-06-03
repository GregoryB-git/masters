package w;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

public final class f
{
  public static final ThreadLocal<TypedValue> a = new ThreadLocal();
  public static final WeakHashMap<d, SparseArray<c>> b = new WeakHashMap(0);
  public static final Object c = new Object();
  
  public static final class a
  {
    public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    {
      return paramResources.getDrawable(paramInt, paramTheme);
    }
    
    public static Drawable b(Resources paramResources, int paramInt1, int paramInt2, Resources.Theme paramTheme)
    {
      return paramResources.getDrawableForDensity(paramInt1, paramInt2, paramTheme);
    }
  }
  
  public static final class b
  {
    public static int a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    {
      return paramResources.getColor(paramInt, paramTheme);
    }
    
    public static ColorStateList b(Resources paramResources, int paramInt, Resources.Theme paramTheme)
    {
      return paramResources.getColorStateList(paramInt, paramTheme);
    }
  }
  
  public static final class c
  {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;
    
    public c(ColorStateList paramColorStateList, Configuration paramConfiguration, Resources.Theme paramTheme)
    {
      a = paramColorStateList;
      b = paramConfiguration;
      int i;
      if (paramTheme == null) {
        i = 0;
      } else {
        i = paramTheme.hashCode();
      }
      c = i;
    }
  }
  
  public static final class d
  {
    public final Resources a;
    public final Resources.Theme b;
    
    public d(Resources paramResources, Resources.Theme paramTheme)
    {
      a = paramResources;
      b = paramTheme;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (d.class == paramObject.getClass()))
      {
        paramObject = (d)paramObject;
        if ((!a.equals(a)) || (!Objects.equals(b, b))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Objects.hash(new Object[] { a, b });
    }
  }
  
  public static abstract class e
  {
    public final void a()
    {
      new Handler(Looper.getMainLooper()).post(new h(this));
    }
    
    public final void b(Typeface paramTypeface)
    {
      new Handler(Looper.getMainLooper()).post(new g(0, this, paramTypeface));
    }
    
    public abstract void c(Typeface paramTypeface);
  }
}

/* Location:
 * Qualified Name:     w.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */