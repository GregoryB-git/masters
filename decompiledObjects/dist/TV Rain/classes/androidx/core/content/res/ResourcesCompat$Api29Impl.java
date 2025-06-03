package androidx.core.content.res;

import android.content.res.Resources;
import androidx.annotation.DimenRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o3;

@RequiresApi(29)
class ResourcesCompat$Api29Impl
{
  @DoNotInline
  public static float getFloat(@NonNull Resources paramResources, @DimenRes int paramInt)
  {
    return o3.a(paramResources, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */