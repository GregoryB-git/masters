package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class ResourcesCompat$Api23Impl
{
  @DoNotInline
  public static int getColor(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    return paramResources.getColor(paramInt, paramTheme);
  }
  
  @DoNotInline
  @NonNull
  public static ColorStateList getColorStateList(@NonNull Resources paramResources, @ColorRes int paramInt, @Nullable Resources.Theme paramTheme)
  {
    return paramResources.getColorStateList(paramInt, paramTheme);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */