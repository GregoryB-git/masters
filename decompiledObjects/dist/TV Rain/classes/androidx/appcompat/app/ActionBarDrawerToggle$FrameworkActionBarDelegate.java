package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

class ActionBarDrawerToggle$FrameworkActionBarDelegate
  implements ActionBarDrawerToggle.Delegate
{
  private final Activity mActivity;
  private ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;
  
  public ActionBarDrawerToggle$FrameworkActionBarDelegate(Activity paramActivity)
  {
    mActivity = paramActivity;
  }
  
  public Context getActionBarThemedContext()
  {
    ActionBar localActionBar = mActivity.getActionBar();
    if (localActionBar != null) {
      return localActionBar.getThemedContext();
    }
    return mActivity;
  }
  
  public Drawable getThemeUpIndicator()
  {
    TypedArray localTypedArray = getActionBarThemedContext().obtainStyledAttributes(null, new int[] { 16843531 }, 16843470, 0);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }
  
  public boolean isNavigationVisible()
  {
    ActionBar localActionBar = mActivity.getActionBar();
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
    ActionBar localActionBar = mActivity.getActionBar();
    if (localActionBar != null) {
      Api18Impl.setHomeActionContentDescription(localActionBar, paramInt);
    }
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = mActivity.getActionBar();
    if (localActionBar != null)
    {
      Api18Impl.setHomeAsUpIndicator(localActionBar, paramDrawable);
      Api18Impl.setHomeActionContentDescription(localActionBar, paramInt);
    }
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static void setHomeActionContentDescription(ActionBar paramActionBar, int paramInt)
    {
      paramActionBar.setHomeActionContentDescription(paramInt);
    }
    
    @DoNotInline
    public static void setHomeAsUpIndicator(ActionBar paramActionBar, Drawable paramDrawable)
    {
      paramActionBar.setHomeAsUpIndicator(paramDrawable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle.FrameworkActionBarDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */