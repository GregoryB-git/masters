package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;

public class ActionBarDrawerToggle
  implements DrawerLayout.DrawerListener
{
  private final Delegate mActivityImpl;
  private final int mCloseDrawerContentDescRes;
  public boolean mDrawerIndicatorEnabled = true;
  private final DrawerLayout mDrawerLayout;
  private boolean mDrawerSlideAnimationEnabled = true;
  private boolean mHasCustomUpIndicator;
  private Drawable mHomeAsUpIndicator;
  private final int mOpenDrawerContentDescRes;
  private DrawerArrowDrawable mSlider;
  public View.OnClickListener mToolbarNavigationClickListener;
  private boolean mWarnedForDisplayHomeAsUp = false;
  
  public ActionBarDrawerToggle(Activity paramActivity, Toolbar paramToolbar, DrawerLayout paramDrawerLayout, DrawerArrowDrawable paramDrawerArrowDrawable, @StringRes int paramInt1, @StringRes int paramInt2)
  {
    if (paramToolbar != null)
    {
      mActivityImpl = new ToolbarCompatDelegate(paramToolbar);
      paramToolbar.setNavigationOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Object localObject = ActionBarDrawerToggle.this;
          if (mDrawerIndicatorEnabled)
          {
            ((ActionBarDrawerToggle)localObject).toggle();
          }
          else
          {
            localObject = mToolbarNavigationClickListener;
            if (localObject != null) {
              ((View.OnClickListener)localObject).onClick(paramAnonymousView);
            }
          }
        }
      });
    }
    else if ((paramActivity instanceof DelegateProvider))
    {
      mActivityImpl = ((DelegateProvider)paramActivity).getDrawerToggleDelegate();
    }
    else
    {
      mActivityImpl = new FrameworkActionBarDelegate(paramActivity);
    }
    mDrawerLayout = paramDrawerLayout;
    mOpenDrawerContentDescRes = paramInt1;
    mCloseDrawerContentDescRes = paramInt2;
    if (paramDrawerArrowDrawable == null) {
      mSlider = new DrawerArrowDrawable(mActivityImpl.getActionBarThemedContext());
    } else {
      mSlider = paramDrawerArrowDrawable;
    }
    mHomeAsUpIndicator = getThemeUpIndicator();
  }
  
  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, @StringRes int paramInt1, @StringRes int paramInt2)
  {
    this(paramActivity, null, paramDrawerLayout, null, paramInt1, paramInt2);
  }
  
  public ActionBarDrawerToggle(Activity paramActivity, DrawerLayout paramDrawerLayout, Toolbar paramToolbar, @StringRes int paramInt1, @StringRes int paramInt2)
  {
    this(paramActivity, paramToolbar, paramDrawerLayout, null, paramInt1, paramInt2);
  }
  
  private void setPosition(float paramFloat)
  {
    if (paramFloat == 1.0F) {
      mSlider.setVerticalMirror(true);
    } else if (paramFloat == 0.0F) {
      mSlider.setVerticalMirror(false);
    }
    mSlider.setProgress(paramFloat);
  }
  
  @NonNull
  public DrawerArrowDrawable getDrawerArrowDrawable()
  {
    return mSlider;
  }
  
  public Drawable getThemeUpIndicator()
  {
    return mActivityImpl.getThemeUpIndicator();
  }
  
  public View.OnClickListener getToolbarNavigationClickListener()
  {
    return mToolbarNavigationClickListener;
  }
  
  public boolean isDrawerIndicatorEnabled()
  {
    return mDrawerIndicatorEnabled;
  }
  
  public boolean isDrawerSlideAnimationEnabled()
  {
    return mDrawerSlideAnimationEnabled;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (!mHasCustomUpIndicator) {
      mHomeAsUpIndicator = getThemeUpIndicator();
    }
    syncState();
  }
  
  public void onDrawerClosed(View paramView)
  {
    setPosition(0.0F);
    if (mDrawerIndicatorEnabled) {
      setActionBarDescription(mOpenDrawerContentDescRes);
    }
  }
  
  public void onDrawerOpened(View paramView)
  {
    setPosition(1.0F);
    if (mDrawerIndicatorEnabled) {
      setActionBarDescription(mCloseDrawerContentDescRes);
    }
  }
  
  public void onDrawerSlide(View paramView, float paramFloat)
  {
    if (mDrawerSlideAnimationEnabled) {
      setPosition(Math.min(1.0F, Math.max(0.0F, paramFloat)));
    } else {
      setPosition(0.0F);
    }
  }
  
  public void onDrawerStateChanged(int paramInt) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if ((paramMenuItem != null) && (paramMenuItem.getItemId() == 16908332) && (mDrawerIndicatorEnabled))
    {
      toggle();
      return true;
    }
    return false;
  }
  
  public void setActionBarDescription(int paramInt)
  {
    mActivityImpl.setActionBarDescription(paramInt);
  }
  
  public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
  {
    if ((!mWarnedForDisplayHomeAsUp) && (!mActivityImpl.isNavigationVisible()))
    {
      Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
      mWarnedForDisplayHomeAsUp = true;
    }
    mActivityImpl.setActionBarUpIndicator(paramDrawable, paramInt);
  }
  
  public void setDrawerArrowDrawable(@NonNull DrawerArrowDrawable paramDrawerArrowDrawable)
  {
    mSlider = paramDrawerArrowDrawable;
    syncState();
  }
  
  public void setDrawerIndicatorEnabled(boolean paramBoolean)
  {
    if (paramBoolean != mDrawerIndicatorEnabled)
    {
      if (paramBoolean)
      {
        DrawerArrowDrawable localDrawerArrowDrawable = mSlider;
        int i;
        if (mDrawerLayout.isDrawerOpen(8388611)) {
          i = mCloseDrawerContentDescRes;
        } else {
          i = mOpenDrawerContentDescRes;
        }
        setActionBarUpIndicator(localDrawerArrowDrawable, i);
      }
      else
      {
        setActionBarUpIndicator(mHomeAsUpIndicator, 0);
      }
      mDrawerIndicatorEnabled = paramBoolean;
    }
  }
  
  public void setDrawerSlideAnimationEnabled(boolean paramBoolean)
  {
    mDrawerSlideAnimationEnabled = paramBoolean;
    if (!paramBoolean) {
      setPosition(0.0F);
    }
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = mDrawerLayout.getResources().getDrawable(paramInt);
    } else {
      localDrawable = null;
    }
    setHomeAsUpIndicator(localDrawable);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      mHomeAsUpIndicator = getThemeUpIndicator();
      mHasCustomUpIndicator = false;
    }
    else
    {
      mHomeAsUpIndicator = paramDrawable;
      mHasCustomUpIndicator = true;
    }
    if (!mDrawerIndicatorEnabled) {
      setActionBarUpIndicator(mHomeAsUpIndicator, 0);
    }
  }
  
  public void setToolbarNavigationClickListener(View.OnClickListener paramOnClickListener)
  {
    mToolbarNavigationClickListener = paramOnClickListener;
  }
  
  public void syncState()
  {
    if (mDrawerLayout.isDrawerOpen(8388611)) {
      setPosition(1.0F);
    } else {
      setPosition(0.0F);
    }
    if (mDrawerIndicatorEnabled)
    {
      DrawerArrowDrawable localDrawerArrowDrawable = mSlider;
      int i;
      if (mDrawerLayout.isDrawerOpen(8388611)) {
        i = mCloseDrawerContentDescRes;
      } else {
        i = mOpenDrawerContentDescRes;
      }
      setActionBarUpIndicator(localDrawerArrowDrawable, i);
    }
  }
  
  public void toggle()
  {
    int i = mDrawerLayout.getDrawerLockMode(8388611);
    if ((mDrawerLayout.isDrawerVisible(8388611)) && (i != 2)) {
      mDrawerLayout.closeDrawer(8388611);
    } else if (i != 1) {
      mDrawerLayout.openDrawer(8388611);
    }
  }
  
  public static abstract interface Delegate
  {
    public abstract Context getActionBarThemedContext();
    
    public abstract Drawable getThemeUpIndicator();
    
    public abstract boolean isNavigationVisible();
    
    public abstract void setActionBarDescription(@StringRes int paramInt);
    
    public abstract void setActionBarUpIndicator(Drawable paramDrawable, @StringRes int paramInt);
  }
  
  public static abstract interface DelegateProvider
  {
    @Nullable
    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
  }
  
  public static class FrameworkActionBarDelegate
    implements ActionBarDrawerToggle.Delegate
  {
    private final Activity mActivity;
    private ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;
    
    public FrameworkActionBarDelegate(Activity paramActivity)
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
  
  public static class ToolbarCompatDelegate
    implements ActionBarDrawerToggle.Delegate
  {
    public final CharSequence mDefaultContentDescription;
    public final Drawable mDefaultUpIndicator;
    public final Toolbar mToolbar;
    
    public ToolbarCompatDelegate(Toolbar paramToolbar)
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
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */