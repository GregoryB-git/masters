package androidx.legacy.app;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

@Deprecated
public abstract interface ActionBarDrawerToggle$Delegate
{
  @Nullable
  public abstract Drawable getThemeUpIndicator();
  
  public abstract void setActionBarDescription(@StringRes int paramInt);
  
  public abstract void setActionBarUpIndicator(Drawable paramDrawable, @StringRes int paramInt);
}

/* Location:
 * Qualified Name:     androidx.legacy.app.ActionBarDrawerToggle.Delegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */