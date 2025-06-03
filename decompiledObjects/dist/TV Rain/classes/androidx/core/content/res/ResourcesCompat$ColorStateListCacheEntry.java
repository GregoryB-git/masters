package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class ResourcesCompat$ColorStateListCacheEntry
{
  public final Configuration mConfiguration;
  public final int mThemeHash;
  public final ColorStateList mValue;
  
  public ResourcesCompat$ColorStateListCacheEntry(@NonNull ColorStateList paramColorStateList, @NonNull Configuration paramConfiguration, @Nullable Resources.Theme paramTheme)
  {
    mValue = paramColorStateList;
    mConfiguration = paramConfiguration;
    int i;
    if (paramTheme == null) {
      i = 0;
    } else {
      i = paramTheme.hashCode();
    }
    mThemeHash = i;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */