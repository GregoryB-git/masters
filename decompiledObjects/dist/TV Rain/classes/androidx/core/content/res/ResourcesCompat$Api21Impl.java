package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class ResourcesCompat$Api21Impl
{
  @DoNotInline
  public static Drawable getDrawable(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    return paramResources.getDrawable(paramInt, paramTheme);
  }
  
  @DoNotInline
  public static Drawable getDrawableForDensity(Resources paramResources, int paramInt1, int paramInt2, Resources.Theme paramTheme)
  {
    return paramResources.getDrawableForDensity(paramInt1, paramInt2, paramTheme);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */