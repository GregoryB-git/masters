package androidx.core.graphics.drawable;

import android.graphics.drawable.Icon;
import android.net.Uri;

public abstract class IconCompat$c
{
  public static int a(Object paramObject)
  {
    return ((Icon)paramObject).getResId();
  }
  
  public static String b(Object paramObject)
  {
    return ((Icon)paramObject).getResPackage();
  }
  
  public static int c(Object paramObject)
  {
    return ((Icon)paramObject).getType();
  }
  
  public static Uri d(Object paramObject)
  {
    return ((Icon)paramObject).getUri();
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */