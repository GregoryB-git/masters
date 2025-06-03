package z;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;

public abstract class h$a
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

/* Location:
 * Qualified Name:     z.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */