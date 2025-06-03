package androidx.core.graphics.drawable;

import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import c;

@RequiresApi(28)
class IconCompat$Api28Impl
{
  @DoNotInline
  public static int getResId(Object paramObject)
  {
    return c.a((Icon)paramObject);
  }
  
  @DoNotInline
  public static String getResPackage(Object paramObject)
  {
    return c.l((Icon)paramObject);
  }
  
  @DoNotInline
  public static int getType(Object paramObject)
  {
    return c.w((Icon)paramObject);
  }
  
  @DoNotInline
  public static Uri getUri(Object paramObject)
  {
    return c.f((Icon)paramObject);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */