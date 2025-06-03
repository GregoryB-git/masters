package androidx.core.content.res;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(15)
class ResourcesCompat$Api15Impl
{
  @DoNotInline
  public static Drawable getDrawableForDensity(Resources paramResources, int paramInt1, int paramInt2)
  {
    return paramResources.getDrawableForDensity(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.Api15Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */