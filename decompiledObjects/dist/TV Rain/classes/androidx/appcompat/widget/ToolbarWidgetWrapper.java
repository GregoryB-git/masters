package androidx.appcompat.widget;

import a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.drawable;
import androidx.appcompat.R.id;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.app.ActionBar.LayoutParams;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ToolbarWidgetWrapper
  implements DecorToolbar
{
  private static final int AFFECTS_LOGO_MASK = 3;
  private static final long DEFAULT_FADE_DURATION_MS = 200L;
  private static final String TAG = "ToolbarWidgetWrapper";
  private ActionMenuPresenter mActionMenuPresenter;
  private View mCustomView;
  private int mDefaultNavigationContentDescription = 0;
  private Drawable mDefaultNavigationIcon;
  private int mDisplayOpts;
  private CharSequence mHomeDescription;
  private Drawable mIcon;
  private Drawable mLogo;
  public boolean mMenuPrepared;
  private Drawable mNavIcon;
  private int mNavigationMode = 0;
  private Spinner mSpinner;
  private CharSequence mSubtitle;
  private View mTabView;
  public CharSequence mTitle;
  private boolean mTitleSet;
  public Toolbar mToolbar;
  public Window.Callback mWindowCallback;
  
  public ToolbarWidgetWrapper(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
  }
  
  public ToolbarWidgetWrapper(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    mToolbar = paramToolbar;
    mTitle = paramToolbar.getTitle();
    mSubtitle = paramToolbar.getSubtitle();
    boolean bool;
    if (mTitle != null) {
      bool = true;
    } else {
      bool = false;
    }
    mTitleSet = bool;
    mNavIcon = paramToolbar.getNavigationIcon();
    paramToolbar = TintTypedArray.obtainStyledAttributes(paramToolbar.getContext(), null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
    mDefaultNavigationIcon = paramToolbar.getDrawable(R.styleable.ActionBar_homeAsUpIndicator);
    if (paramBoolean)
    {
      Object localObject = paramToolbar.getText(R.styleable.ActionBar_title);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        setTitle((CharSequence)localObject);
      }
      localObject = paramToolbar.getText(R.styleable.ActionBar_subtitle);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        setSubtitle((CharSequence)localObject);
      }
      localObject = paramToolbar.getDrawable(R.styleable.ActionBar_logo);
      if (localObject != null) {
        setLogo((Drawable)localObject);
      }
      localObject = paramToolbar.getDrawable(R.styleable.ActionBar_icon);
      if (localObject != null) {
        setIcon((Drawable)localObject);
      }
      if (mNavIcon == null)
      {
        localObject = mDefaultNavigationIcon;
        if (localObject != null) {
          setNavigationIcon((Drawable)localObject);
        }
      }
      setDisplayOptions(paramToolbar.getInt(R.styleable.ActionBar_displayOptions, 0));
      paramInt2 = paramToolbar.getResourceId(R.styleable.ActionBar_customNavigationLayout, 0);
      if (paramInt2 != 0)
      {
        setCustomView(LayoutInflater.from(mToolbar.getContext()).inflate(paramInt2, mToolbar, false));
        setDisplayOptions(mDisplayOpts | 0x10);
      }
      paramInt2 = paramToolbar.getLayoutDimension(R.styleable.ActionBar_height, 0);
      if (paramInt2 > 0)
      {
        localObject = mToolbar.getLayoutParams();
        height = paramInt2;
        mToolbar.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      paramInt2 = paramToolbar.getDimensionPixelOffset(R.styleable.ActionBar_contentInsetStart, -1);
      int i = paramToolbar.getDimensionPixelOffset(R.styleable.ActionBar_contentInsetEnd, -1);
      if ((paramInt2 >= 0) || (i >= 0)) {
        mToolbar.setContentInsetsRelative(Math.max(paramInt2, 0), Math.max(i, 0));
      }
      paramInt2 = paramToolbar.getResourceId(R.styleable.ActionBar_titleTextStyle, 0);
      if (paramInt2 != 0)
      {
        localObject = mToolbar;
        ((Toolbar)localObject).setTitleTextAppearance(((View)localObject).getContext(), paramInt2);
      }
      paramInt2 = paramToolbar.getResourceId(R.styleable.ActionBar_subtitleTextStyle, 0);
      if (paramInt2 != 0)
      {
        localObject = mToolbar;
        ((Toolbar)localObject).setSubtitleTextAppearance(((View)localObject).getContext(), paramInt2);
      }
      paramInt2 = paramToolbar.getResourceId(R.styleable.ActionBar_popupTheme, 0);
      if (paramInt2 != 0) {
        mToolbar.setPopupTheme(paramInt2);
      }
    }
    else
    {
      mDisplayOpts = detectDisplayOptions();
    }
    paramToolbar.recycle();
    setDefaultNavigationContentDescription(paramInt1);
    mHomeDescription = mToolbar.getNavigationContentDescription();
    mToolbar.setNavigationOnClickListener(new View.OnClickListener()
    {
      public final ActionMenuItem mNavItem = new ActionMenuItem(mToolbar.getContext(), 0, 16908332, 0, 0, mTitle);
      
      public void onClick(View paramAnonymousView)
      {
        paramAnonymousView = ToolbarWidgetWrapper.this;
        Window.Callback localCallback = mWindowCallback;
        if ((localCallback != null) && (mMenuPrepared)) {
          localCallback.onMenuItemSelected(0, mNavItem);
        }
      }
    });
  }
  
  private int detectDisplayOptions()
  {
    int i;
    if (mToolbar.getNavigationIcon() != null)
    {
      i = 15;
      mDefaultNavigationIcon = mToolbar.getNavigationIcon();
    }
    else
    {
      i = 11;
    }
    return i;
  }
  
  private void ensureSpinner()
  {
    if (mSpinner == null)
    {
      mSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
      Toolbar.LayoutParams localLayoutParams = new Toolbar.LayoutParams(-2, -2, 8388627);
      mSpinner.setLayoutParams(localLayoutParams);
    }
  }
  
  private void setTitleInt(CharSequence paramCharSequence)
  {
    mTitle = paramCharSequence;
    if ((mDisplayOpts & 0x8) != 0)
    {
      mToolbar.setTitle(paramCharSequence);
      if (mTitleSet) {
        ViewCompat.setAccessibilityPaneTitle(mToolbar.getRootView(), paramCharSequence);
      }
    }
  }
  
  private void updateHomeAccessibility()
  {
    if ((mDisplayOpts & 0x4) != 0) {
      if (TextUtils.isEmpty(mHomeDescription)) {
        mToolbar.setNavigationContentDescription(mDefaultNavigationContentDescription);
      } else {
        mToolbar.setNavigationContentDescription(mHomeDescription);
      }
    }
  }
  
  private void updateNavigationIcon()
  {
    if ((mDisplayOpts & 0x4) != 0)
    {
      Toolbar localToolbar = mToolbar;
      Drawable localDrawable = mNavIcon;
      if (localDrawable == null) {
        localDrawable = mDefaultNavigationIcon;
      }
      localToolbar.setNavigationIcon(localDrawable);
    }
    else
    {
      mToolbar.setNavigationIcon(null);
    }
  }
  
  private void updateToolbarLogo()
  {
    int i = mDisplayOpts;
    Drawable localDrawable;
    if ((i & 0x2) != 0)
    {
      if ((i & 0x1) != 0)
      {
        localDrawable = mLogo;
        if (localDrawable == null) {
          localDrawable = mIcon;
        }
      }
      else
      {
        localDrawable = mIcon;
      }
    }
    else {
      localDrawable = null;
    }
    mToolbar.setLogo(localDrawable);
  }
  
  public void animateToVisibility(int paramInt)
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = setupAnimatorToVisibility(paramInt, 200L);
    if (localViewPropertyAnimatorCompat != null) {
      localViewPropertyAnimatorCompat.start();
    }
  }
  
  public boolean canShowOverflowMenu()
  {
    return mToolbar.canShowOverflowMenu();
  }
  
  public void collapseActionView()
  {
    mToolbar.collapseActionView();
  }
  
  public void dismissPopupMenus()
  {
    mToolbar.dismissPopupMenus();
  }
  
  public Context getContext()
  {
    return mToolbar.getContext();
  }
  
  public View getCustomView()
  {
    return mCustomView;
  }
  
  public int getDisplayOptions()
  {
    return mDisplayOpts;
  }
  
  public int getDropdownItemCount()
  {
    Spinner localSpinner = mSpinner;
    int i;
    if (localSpinner != null) {
      i = localSpinner.getCount();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getDropdownSelectedPosition()
  {
    Spinner localSpinner = mSpinner;
    int i;
    if (localSpinner != null) {
      i = localSpinner.getSelectedItemPosition();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getHeight()
  {
    return mToolbar.getHeight();
  }
  
  public Menu getMenu()
  {
    return mToolbar.getMenu();
  }
  
  public int getNavigationMode()
  {
    return mNavigationMode;
  }
  
  public CharSequence getSubtitle()
  {
    return mToolbar.getSubtitle();
  }
  
  public CharSequence getTitle()
  {
    return mToolbar.getTitle();
  }
  
  public ViewGroup getViewGroup()
  {
    return mToolbar;
  }
  
  public int getVisibility()
  {
    return mToolbar.getVisibility();
  }
  
  public boolean hasEmbeddedTabs()
  {
    boolean bool;
    if (mTabView != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasExpandedActionView()
  {
    return mToolbar.hasExpandedActionView();
  }
  
  public boolean hasIcon()
  {
    boolean bool;
    if (mIcon != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasLogo()
  {
    boolean bool;
    if (mLogo != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hideOverflowMenu()
  {
    return mToolbar.hideOverflowMenu();
  }
  
  public void initIndeterminateProgress()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void initProgress()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public boolean isOverflowMenuShowPending()
  {
    return mToolbar.isOverflowMenuShowPending();
  }
  
  public boolean isOverflowMenuShowing()
  {
    return mToolbar.isOverflowMenuShowing();
  }
  
  public boolean isTitleTruncated()
  {
    return mToolbar.isTitleTruncated();
  }
  
  public void restoreHierarchyState(SparseArray<Parcelable> paramSparseArray)
  {
    mToolbar.restoreHierarchyState(paramSparseArray);
  }
  
  public void saveHierarchyState(SparseArray<Parcelable> paramSparseArray)
  {
    mToolbar.saveHierarchyState(paramSparseArray);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    ViewCompat.setBackground(mToolbar, paramDrawable);
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    mToolbar.setCollapsible(paramBoolean);
  }
  
  public void setCustomView(View paramView)
  {
    View localView = mCustomView;
    if ((localView != null) && ((mDisplayOpts & 0x10) != 0)) {
      mToolbar.removeView(localView);
    }
    mCustomView = paramView;
    if ((paramView != null) && ((mDisplayOpts & 0x10) != 0)) {
      mToolbar.addView(paramView);
    }
  }
  
  public void setDefaultNavigationContentDescription(int paramInt)
  {
    if (paramInt == mDefaultNavigationContentDescription) {
      return;
    }
    mDefaultNavigationContentDescription = paramInt;
    if (TextUtils.isEmpty(mToolbar.getNavigationContentDescription())) {
      setNavigationContentDescription(mDefaultNavigationContentDescription);
    }
  }
  
  public void setDefaultNavigationIcon(Drawable paramDrawable)
  {
    if (mDefaultNavigationIcon != paramDrawable)
    {
      mDefaultNavigationIcon = paramDrawable;
      updateNavigationIcon();
    }
  }
  
  public void setDisplayOptions(int paramInt)
  {
    int i = mDisplayOpts ^ paramInt;
    mDisplayOpts = paramInt;
    if (i != 0)
    {
      if ((i & 0x4) != 0)
      {
        if ((paramInt & 0x4) != 0) {
          updateHomeAccessibility();
        }
        updateNavigationIcon();
      }
      if ((i & 0x3) != 0) {
        updateToolbarLogo();
      }
      if ((i & 0x8) != 0) {
        if ((paramInt & 0x8) != 0)
        {
          mToolbar.setTitle(mTitle);
          mToolbar.setSubtitle(mSubtitle);
        }
        else
        {
          mToolbar.setTitle(null);
          mToolbar.setSubtitle(null);
        }
      }
      if ((i & 0x10) != 0)
      {
        View localView = mCustomView;
        if (localView != null) {
          if ((paramInt & 0x10) != 0) {
            mToolbar.addView(localView);
          } else {
            mToolbar.removeView(localView);
          }
        }
      }
    }
  }
  
  public void setDropdownParams(SpinnerAdapter paramSpinnerAdapter, AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    ensureSpinner();
    mSpinner.setAdapter(paramSpinnerAdapter);
    mSpinner.setOnItemSelectedListener(paramOnItemSelectedListener);
  }
  
  public void setDropdownSelectedPosition(int paramInt)
  {
    Spinner localSpinner = mSpinner;
    if (localSpinner != null)
    {
      localSpinner.setSelection(paramInt);
      return;
    }
    throw new IllegalStateException("Can't set dropdown selected position without an adapter");
  }
  
  public void setEmbeddedTabView(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    Object localObject = mTabView;
    if (localObject != null)
    {
      localObject = ((View)localObject).getParent();
      Toolbar localToolbar = mToolbar;
      if (localObject == localToolbar) {
        localToolbar.removeView(mTabView);
      }
    }
    mTabView = paramScrollingTabContainerView;
    if ((paramScrollingTabContainerView != null) && (mNavigationMode == 2))
    {
      mToolbar.addView(paramScrollingTabContainerView, 0);
      localObject = (Toolbar.LayoutParams)mTabView.getLayoutParams();
      width = -2;
      height = -2;
      gravity = 8388691;
      paramScrollingTabContainerView.setAllowCollapse(true);
    }
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean) {}
  
  public void setIcon(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setIcon(localDrawable);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    mIcon = paramDrawable;
    updateToolbarLogo();
  }
  
  public void setLogo(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setLogo(localDrawable);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    mLogo = paramDrawable;
    updateToolbarLogo();
  }
  
  public void setMenu(Menu paramMenu, MenuPresenter.Callback paramCallback)
  {
    if (mActionMenuPresenter == null)
    {
      ActionMenuPresenter localActionMenuPresenter = new ActionMenuPresenter(mToolbar.getContext());
      mActionMenuPresenter = localActionMenuPresenter;
      localActionMenuPresenter.setId(R.id.action_menu_presenter);
    }
    mActionMenuPresenter.setCallback(paramCallback);
    mToolbar.setMenu((MenuBuilder)paramMenu, mActionMenuPresenter);
  }
  
  public void setMenuCallbacks(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    mToolbar.setMenuCallbacks(paramCallback, paramCallback1);
  }
  
  public void setMenuPrepared()
  {
    mMenuPrepared = true;
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    String str;
    if (paramInt == 0) {
      str = null;
    } else {
      str = getContext().getString(paramInt);
    }
    setNavigationContentDescription(str);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    mHomeDescription = paramCharSequence;
    updateHomeAccessibility();
  }
  
  public void setNavigationIcon(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setNavigationIcon(localDrawable);
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    mNavIcon = paramDrawable;
    updateNavigationIcon();
  }
  
  public void setNavigationMode(int paramInt)
  {
    int i = mNavigationMode;
    if (paramInt != i)
    {
      Object localObject1;
      Object localObject2;
      if (i != 1)
      {
        if (i == 2)
        {
          localObject1 = mTabView;
          if (localObject1 != null)
          {
            localObject1 = ((View)localObject1).getParent();
            localObject2 = mToolbar;
            if (localObject1 == localObject2) {
              ((ViewGroup)localObject2).removeView(mTabView);
            }
          }
        }
      }
      else
      {
        localObject1 = mSpinner;
        if (localObject1 != null)
        {
          localObject2 = ((View)localObject1).getParent();
          localObject1 = mToolbar;
          if (localObject2 == localObject1) {
            ((ViewGroup)localObject1).removeView(mSpinner);
          }
        }
      }
      mNavigationMode = paramInt;
      if (paramInt != 0) {
        if (paramInt != 1)
        {
          if (paramInt == 2)
          {
            localObject1 = mTabView;
            if (localObject1 != null)
            {
              mToolbar.addView((View)localObject1, 0);
              localObject1 = (Toolbar.LayoutParams)mTabView.getLayoutParams();
              width = -2;
              height = -2;
              gravity = 8388691;
            }
          }
          else
          {
            throw new IllegalArgumentException(a.f("Invalid navigation mode ", paramInt));
          }
        }
        else
        {
          ensureSpinner();
          mToolbar.addView(mSpinner, 0);
        }
      }
    }
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    mSubtitle = paramCharSequence;
    if ((mDisplayOpts & 0x8) != 0) {
      mToolbar.setSubtitle(paramCharSequence);
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    mTitleSet = true;
    setTitleInt(paramCharSequence);
  }
  
  public void setVisibility(int paramInt)
  {
    mToolbar.setVisibility(paramInt);
  }
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    mWindowCallback = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    if (!mTitleSet) {
      setTitleInt(paramCharSequence);
    }
  }
  
  public ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int paramInt, long paramLong)
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = ViewCompat.animate(mToolbar);
    float f;
    if (paramInt == 0) {
      f = 1.0F;
    } else {
      f = 0.0F;
    }
    localViewPropertyAnimatorCompat.alpha(f).setDuration(paramLong).setListener(new ViewPropertyAnimatorListenerAdapter()
    {
      private boolean mCanceled = false;
      
      public void onAnimationCancel(View paramAnonymousView)
      {
        mCanceled = true;
      }
      
      public void onAnimationEnd(View paramAnonymousView)
      {
        if (!mCanceled) {
          mToolbar.setVisibility(paramInt);
        }
      }
      
      public void onAnimationStart(View paramAnonymousView)
      {
        mToolbar.setVisibility(0);
      }
    });
  }
  
  public boolean showOverflowMenu()
  {
    return mToolbar.showOverflowMenu();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ToolbarWidgetWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */