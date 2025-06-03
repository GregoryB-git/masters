package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R.attr;
import androidx.appcompat.widget.TintTypedArray;

class AppCompatDelegateImpl$ActionBarDrawableToggleImpl
  implements ActionBarDrawerToggle.Delegate
{
  public AppCompatDelegateImpl$ActionBarDrawableToggleImpl(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public Context getActionBarThemedContext()
  {
    return this$0.getActionBarThemedContext();
  }
  
  public Drawable getThemeUpIndicator()
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), null, new int[] { R.attr.homeAsUpIndicator });
    Drawable localDrawable = localTintTypedArray.getDrawable(0);
    localTintTypedArray.recycle();
    return localDrawable;
  }
  
  public boolean isNavigationVisible()
  {
    ActionBar localActionBar = this$0.getSupportActionBar();
    boolean bool;
    if ((localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setActionBarDescription(int paramInt)
  {
    ActionBar localActionBar = this$0.getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this$0.getSupportActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ActionBarDrawableToggleImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */