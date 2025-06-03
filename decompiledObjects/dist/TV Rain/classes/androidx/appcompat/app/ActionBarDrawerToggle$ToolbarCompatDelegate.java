package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;

class ActionBarDrawerToggle$ToolbarCompatDelegate
  implements ActionBarDrawerToggle.Delegate
{
  public final CharSequence mDefaultContentDescription;
  public final Drawable mDefaultUpIndicator;
  public final Toolbar mToolbar;
  
  public ActionBarDrawerToggle$ToolbarCompatDelegate(Toolbar paramToolbar)
  {
    mToolbar = paramToolbar;
    mDefaultUpIndicator = paramToolbar.getNavigationIcon();
    mDefaultContentDescription = paramToolbar.getNavigationContentDescription();
  }
  
  public Context getActionBarThemedContext()
  {
    return mToolbar.getContext();
  }
  
  public Drawable getThemeUpIndicator()
  {
    return mDefaultUpIndicator;
  }
  
  public boolean isNavigationVisible()
  {
    return true;
  }
  
  public void setActionBarDescription(@StringRes int paramInt)
  {
    if (paramInt == 0) {
      mToolbar.setNavigationContentDescription(mDefaultContentDescription);
    } else {
      mToolbar.setNavigationContentDescription(paramInt);
    }
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, @StringRes int paramInt)
  {
    mToolbar.setNavigationIcon(paramDrawable);
    setActionBarDescription(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle.ToolbarCompatDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */