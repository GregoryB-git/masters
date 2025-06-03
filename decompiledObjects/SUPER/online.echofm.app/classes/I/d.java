package I;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.DisplayCutout;
import java.util.List;

public final class d
{
  public final DisplayCutout a;
  
  public d(DisplayCutout paramDisplayCutout)
  {
    a = paramDisplayCutout;
  }
  
  public static d e(DisplayCutout paramDisplayCutout)
  {
    if (paramDisplayCutout == null) {
      paramDisplayCutout = null;
    } else {
      paramDisplayCutout = new d(paramDisplayCutout);
    }
    return paramDisplayCutout;
  }
  
  public int a()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return a.c(a);
    }
    return 0;
  }
  
  public int b()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return a.d(a);
    }
    return 0;
  }
  
  public int c()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return a.e(a);
    }
    return 0;
  }
  
  public int d()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return a.f(a);
    }
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      return H.c.a(a, a);
    }
    return false;
  }
  
  public int hashCode()
  {
    DisplayCutout localDisplayCutout = a;
    int i;
    if (localDisplayCutout == null) {
      i = 0;
    } else {
      i = c.a(localDisplayCutout);
    }
    return i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DisplayCutoutCompat{");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static abstract class a
  {
    public static DisplayCutout a(Rect paramRect, List<Rect> paramList)
    {
      return new DisplayCutout(paramRect, paramList);
    }
    
    public static List<Rect> b(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getBoundingRects();
    }
    
    public static int c(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getSafeInsetBottom();
    }
    
    public static int d(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getSafeInsetLeft();
    }
    
    public static int e(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getSafeInsetRight();
    }
    
    public static int f(DisplayCutout paramDisplayCutout)
    {
      return paramDisplayCutout.getSafeInsetTop();
    }
  }
}

/* Location:
 * Qualified Name:     I.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */