package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;

final class ResourcesCompat$ColorStateListCacheKey
{
  public final Resources mResources;
  public final Resources.Theme mTheme;
  
  public ResourcesCompat$ColorStateListCacheKey(@NonNull Resources paramResources, @Nullable Resources.Theme paramTheme)
  {
    mResources = paramResources;
    mTheme = paramTheme;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ColorStateListCacheKey.class == paramObject.getClass()))
    {
      paramObject = (ColorStateListCacheKey)paramObject;
      if ((!mResources.equals(mResources)) || (!ObjectsCompat.equals(mTheme, mTheme))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ObjectsCompat.hash(new Object[] { mResources, mTheme });
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */