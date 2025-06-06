package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.ViewPropertyAnimatorCompatSet;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class WindowDecorActionBar
  extends ActionBar
  implements ActionBarOverlayLayout.ActionBarVisibilityCallback
{
  private static final long FADE_IN_DURATION_MS = 200L;
  private static final long FADE_OUT_DURATION_MS = 100L;
  private static final int INVALID_POSITION = -1;
  private static final String TAG = "WindowDecorActionBar";
  private static final Interpolator sHideInterpolator = new AccelerateInterpolator();
  private static final Interpolator sShowInterpolator = new DecelerateInterpolator();
  public ActionModeImpl mActionMode;
  private Activity mActivity;
  public ActionBarContainer mContainerView;
  public boolean mContentAnimations = true;
  public View mContentView;
  public Context mContext;
  public ActionBarContextView mContextView;
  private int mCurWindowVisibility = 0;
  public ViewPropertyAnimatorCompatSet mCurrentShowAnim;
  public DecorToolbar mDecorToolbar;
  public ActionMode mDeferredDestroyActionMode;
  public ActionMode.Callback mDeferredModeDestroyCallback;
  private boolean mDisplayHomeAsUpSet;
  private boolean mHasEmbeddedTabs;
  public boolean mHiddenByApp;
  public boolean mHiddenBySystem;
  public final ViewPropertyAnimatorListener mHideListener = new ViewPropertyAnimatorListenerAdapter()
  {
    public void onAnimationEnd(View paramAnonymousView)
    {
      paramAnonymousView = WindowDecorActionBar.this;
      if (mContentAnimations)
      {
        paramAnonymousView = mContentView;
        if (paramAnonymousView != null)
        {
          paramAnonymousView.setTranslationY(0.0F);
          mContainerView.setTranslationY(0.0F);
        }
      }
      mContainerView.setVisibility(8);
      mContainerView.setTransitioning(false);
      paramAnonymousView = WindowDecorActionBar.this;
      mCurrentShowAnim = null;
      paramAnonymousView.completeDeferredDestroyActionMode();
      paramAnonymousView = mOverlayLayout;
      if (paramAnonymousView != null) {
        ViewCompat.requestApplyInsets(paramAnonymousView);
      }
    }
  };
  public boolean mHideOnContentScroll;
  private boolean mLastMenuVisibility;
  private ArrayList<ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners = new ArrayList();
  private boolean mNowShowing = true;
  public ActionBarOverlayLayout mOverlayLayout;
  private int mSavedTabPosition = -1;
  private TabImpl mSelectedTab;
  private boolean mShowHideAnimationEnabled;
  public final ViewPropertyAnimatorListener mShowListener = new ViewPropertyAnimatorListenerAdapter()
  {
    public void onAnimationEnd(View paramAnonymousView)
    {
      paramAnonymousView = WindowDecorActionBar.this;
      mCurrentShowAnim = null;
      mContainerView.requestLayout();
    }
  };
  private boolean mShowingForMode;
  public ScrollingTabContainerView mTabScrollView;
  private ArrayList<TabImpl> mTabs = new ArrayList();
  private Context mThemedContext;
  public final ViewPropertyAnimatorUpdateListener mUpdateListener = new ViewPropertyAnimatorUpdateListener()
  {
    public void onAnimationUpdate(View paramAnonymousView)
    {
      ((View)mContainerView.getParent()).invalidate();
    }
  };
  
  public WindowDecorActionBar(Activity paramActivity, boolean paramBoolean)
  {
    mActivity = paramActivity;
    paramActivity = paramActivity.getWindow().getDecorView();
    init(paramActivity);
    if (!paramBoolean) {
      mContentView = paramActivity.findViewById(16908290);
    }
  }
  
  public WindowDecorActionBar(Dialog paramDialog)
  {
    init(paramDialog.getWindow().getDecorView());
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public WindowDecorActionBar(View paramView)
  {
    init(paramView);
  }
  
  public static boolean checkShowingFlags(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {
      return true;
    }
    return (!paramBoolean1) && (!paramBoolean2);
  }
  
  private void cleanupTabs()
  {
    if (mSelectedTab != null) {
      selectTab(null);
    }
    mTabs.clear();
    ScrollingTabContainerView localScrollingTabContainerView = mTabScrollView;
    if (localScrollingTabContainerView != null) {
      localScrollingTabContainerView.removeAllTabs();
    }
    mSavedTabPosition = -1;
  }
  
  private void configureTab(ActionBar.Tab paramTab, int paramInt)
  {
    paramTab = (TabImpl)paramTab;
    if (paramTab.getCallback() != null)
    {
      paramTab.setPosition(paramInt);
      mTabs.add(paramInt, paramTab);
      int i = mTabs.size();
      for (;;)
      {
        paramInt++;
        if (paramInt >= i) {
          break;
        }
        ((TabImpl)mTabs.get(paramInt)).setPosition(paramInt);
      }
      return;
    }
    throw new IllegalStateException("Action Bar Tab must have a Callback");
  }
  
  private void ensureTabsExist()
  {
    if (mTabScrollView != null) {
      return;
    }
    ScrollingTabContainerView localScrollingTabContainerView = new ScrollingTabContainerView(mContext);
    if (mHasEmbeddedTabs)
    {
      localScrollingTabContainerView.setVisibility(0);
      mDecorToolbar.setEmbeddedTabView(localScrollingTabContainerView);
    }
    else
    {
      if (getNavigationMode() == 2)
      {
        localScrollingTabContainerView.setVisibility(0);
        ActionBarOverlayLayout localActionBarOverlayLayout = mOverlayLayout;
        if (localActionBarOverlayLayout != null) {
          ViewCompat.requestApplyInsets(localActionBarOverlayLayout);
        }
      }
      else
      {
        localScrollingTabContainerView.setVisibility(8);
      }
      mContainerView.setTabContainer(localScrollingTabContainerView);
    }
    mTabScrollView = localScrollingTabContainerView;
  }
  
  private DecorToolbar getDecorToolbar(View paramView)
  {
    if ((paramView instanceof DecorToolbar)) {
      return (DecorToolbar)paramView;
    }
    if ((paramView instanceof Toolbar)) {
      return ((Toolbar)paramView).getWrapper();
    }
    StringBuilder localStringBuilder = z2.t("Can't make a decor toolbar out of ");
    if (paramView != null) {
      paramView = paramView.getClass().getSimpleName();
    } else {
      paramView = "null";
    }
    localStringBuilder.append(paramView);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private void hideForActionMode()
  {
    if (mShowingForMode)
    {
      mShowingForMode = false;
      ActionBarOverlayLayout localActionBarOverlayLayout = mOverlayLayout;
      if (localActionBarOverlayLayout != null) {
        localActionBarOverlayLayout.setShowingForActionMode(false);
      }
      updateVisibility(false);
    }
  }
  
  private void init(View paramView)
  {
    Object localObject = (ActionBarOverlayLayout)paramView.findViewById(R.id.decor_content_parent);
    mOverlayLayout = ((ActionBarOverlayLayout)localObject);
    if (localObject != null) {
      ((ActionBarOverlayLayout)localObject).setActionBarVisibilityCallback(this);
    }
    mDecorToolbar = getDecorToolbar(paramView.findViewById(R.id.action_bar));
    mContextView = ((ActionBarContextView)paramView.findViewById(R.id.action_context_bar));
    localObject = (ActionBarContainer)paramView.findViewById(R.id.action_bar_container);
    mContainerView = ((ActionBarContainer)localObject);
    paramView = mDecorToolbar;
    if ((paramView != null) && (mContextView != null) && (localObject != null))
    {
      mContext = paramView.getContext();
      if ((mDecorToolbar.getDisplayOptions() & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        mDisplayHomeAsUpSet = true;
      }
      paramView = ActionBarPolicy.get(mContext);
      boolean bool;
      if ((!paramView.enableHomeButtonByDefault()) && (i == 0)) {
        bool = false;
      } else {
        bool = true;
      }
      setHomeButtonEnabled(bool);
      setHasEmbeddedTabs(paramView.hasEmbeddedTabs());
      paramView = mContext.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
      if (paramView.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
        setHideOnContentScrollEnabled(true);
      }
      int i = paramView.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
      if (i != 0) {
        setElevation(i);
      }
      paramView.recycle();
      return;
    }
    paramView = new StringBuilder();
    paramView.append(getClass().getSimpleName());
    paramView.append(" can only be used with a compatible window decor layout");
    throw new IllegalStateException(paramView.toString());
  }
  
  private void setHasEmbeddedTabs(boolean paramBoolean)
  {
    mHasEmbeddedTabs = paramBoolean;
    if (!paramBoolean)
    {
      mDecorToolbar.setEmbeddedTabView(null);
      mContainerView.setTabContainer(mTabScrollView);
    }
    else
    {
      mContainerView.setTabContainer(null);
      mDecorToolbar.setEmbeddedTabView(mTabScrollView);
    }
    int i = getNavigationMode();
    boolean bool = true;
    if (i == 2) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject = mTabScrollView;
    if (localObject != null) {
      if (i != 0)
      {
        ((View)localObject).setVisibility(0);
        localObject = mOverlayLayout;
        if (localObject != null) {
          ViewCompat.requestApplyInsets((View)localObject);
        }
      }
      else
      {
        ((View)localObject).setVisibility(8);
      }
    }
    localObject = mDecorToolbar;
    if ((!mHasEmbeddedTabs) && (i != 0)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    ((DecorToolbar)localObject).setCollapsible(paramBoolean);
    localObject = mOverlayLayout;
    if ((!mHasEmbeddedTabs) && (i != 0)) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    }
    ((ActionBarOverlayLayout)localObject).setHasNonEmbeddedTabs(paramBoolean);
  }
  
  private boolean shouldAnimateContextView()
  {
    return ViewCompat.isLaidOut(mContainerView);
  }
  
  private void showForActionMode()
  {
    if (!mShowingForMode)
    {
      mShowingForMode = true;
      ActionBarOverlayLayout localActionBarOverlayLayout = mOverlayLayout;
      if (localActionBarOverlayLayout != null) {
        localActionBarOverlayLayout.setShowingForActionMode(true);
      }
      updateVisibility(false);
    }
  }
  
  private void updateVisibility(boolean paramBoolean)
  {
    if (checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
    {
      if (!mNowShowing)
      {
        mNowShowing = true;
        doShow(paramBoolean);
      }
    }
    else if (mNowShowing)
    {
      mNowShowing = false;
      doHide(paramBoolean);
    }
  }
  
  public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    mMenuVisibilityListeners.add(paramOnMenuVisibilityListener);
  }
  
  public void addTab(ActionBar.Tab paramTab)
  {
    addTab(paramTab, mTabs.isEmpty());
  }
  
  public void addTab(ActionBar.Tab paramTab, int paramInt)
  {
    addTab(paramTab, paramInt, mTabs.isEmpty());
  }
  
  public void addTab(ActionBar.Tab paramTab, int paramInt, boolean paramBoolean)
  {
    ensureTabsExist();
    mTabScrollView.addTab(paramTab, paramInt, paramBoolean);
    configureTab(paramTab, paramInt);
    if (paramBoolean) {
      selectTab(paramTab);
    }
  }
  
  public void addTab(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    ensureTabsExist();
    mTabScrollView.addTab(paramTab, paramBoolean);
    configureTab(paramTab, mTabs.size());
    if (paramBoolean) {
      selectTab(paramTab);
    }
  }
  
  public void animateToMode(boolean paramBoolean)
  {
    if (paramBoolean) {
      showForActionMode();
    } else {
      hideForActionMode();
    }
    if (shouldAnimateContextView())
    {
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat1;
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat2;
      if (paramBoolean)
      {
        localViewPropertyAnimatorCompat1 = mDecorToolbar.setupAnimatorToVisibility(4, 100L);
        localViewPropertyAnimatorCompat2 = mContextView.setupAnimatorToVisibility(0, 200L);
      }
      else
      {
        localViewPropertyAnimatorCompat2 = mDecorToolbar.setupAnimatorToVisibility(0, 200L);
        localViewPropertyAnimatorCompat1 = mContextView.setupAnimatorToVisibility(8, 100L);
      }
      ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
      localViewPropertyAnimatorCompatSet.playSequentially(localViewPropertyAnimatorCompat1, localViewPropertyAnimatorCompat2);
      localViewPropertyAnimatorCompatSet.start();
    }
    else if (paramBoolean)
    {
      mDecorToolbar.setVisibility(4);
      mContextView.setVisibility(0);
    }
    else
    {
      mDecorToolbar.setVisibility(0);
      mContextView.setVisibility(8);
    }
  }
  
  public boolean collapseActionView()
  {
    DecorToolbar localDecorToolbar = mDecorToolbar;
    if ((localDecorToolbar != null) && (localDecorToolbar.hasExpandedActionView()))
    {
      mDecorToolbar.collapseActionView();
      return true;
    }
    return false;
  }
  
  public void completeDeferredDestroyActionMode()
  {
    ActionMode.Callback localCallback = mDeferredModeDestroyCallback;
    if (localCallback != null)
    {
      localCallback.onDestroyActionMode(mDeferredDestroyActionMode);
      mDeferredDestroyActionMode = null;
      mDeferredModeDestroyCallback = null;
    }
  }
  
  public void dispatchMenuVisibilityChanged(boolean paramBoolean)
  {
    if (paramBoolean == mLastMenuVisibility) {
      return;
    }
    mLastMenuVisibility = paramBoolean;
    int i = mMenuVisibilityListeners.size();
    for (int j = 0; j < i; j++) {
      ((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(j)).onMenuVisibilityChanged(paramBoolean);
    }
  }
  
  public void doHide(boolean paramBoolean)
  {
    ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = mCurrentShowAnim;
    if (localViewPropertyAnimatorCompatSet != null) {
      localViewPropertyAnimatorCompatSet.cancel();
    }
    if ((mCurWindowVisibility == 0) && ((mShowHideAnimationEnabled) || (paramBoolean)))
    {
      mContainerView.setAlpha(1.0F);
      mContainerView.setTransitioning(true);
      localViewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
      float f1 = -mContainerView.getHeight();
      float f2 = f1;
      if (paramBoolean)
      {
        localObject = new int[2];
        Object tmp79_77 = localObject;
        tmp79_77[0] = 0;
        Object tmp83_79 = tmp79_77;
        tmp83_79[1] = 0;
        tmp83_79;
        mContainerView.getLocationInWindow((int[])localObject);
        f2 = f1 - localObject[1];
      }
      Object localObject = ViewCompat.animate(mContainerView).translationY(f2);
      ((ViewPropertyAnimatorCompat)localObject).setUpdateListener(mUpdateListener);
      localViewPropertyAnimatorCompatSet.play((ViewPropertyAnimatorCompat)localObject);
      if (mContentAnimations)
      {
        localObject = mContentView;
        if (localObject != null) {
          localViewPropertyAnimatorCompatSet.play(ViewCompat.animate((View)localObject).translationY(f2));
        }
      }
      localViewPropertyAnimatorCompatSet.setInterpolator(sHideInterpolator);
      localViewPropertyAnimatorCompatSet.setDuration(250L);
      localViewPropertyAnimatorCompatSet.setListener(mHideListener);
      mCurrentShowAnim = localViewPropertyAnimatorCompatSet;
      localViewPropertyAnimatorCompatSet.start();
    }
    else
    {
      mHideListener.onAnimationEnd(null);
    }
  }
  
  public void doShow(boolean paramBoolean)
  {
    Object localObject1 = mCurrentShowAnim;
    if (localObject1 != null) {
      ((ViewPropertyAnimatorCompatSet)localObject1).cancel();
    }
    mContainerView.setVisibility(0);
    if ((mCurWindowVisibility == 0) && ((mShowHideAnimationEnabled) || (paramBoolean)))
    {
      mContainerView.setTranslationY(0.0F);
      float f1 = -mContainerView.getHeight();
      float f2 = f1;
      if (paramBoolean)
      {
        localObject1 = new int[2];
        Object tmp69_68 = localObject1;
        tmp69_68[0] = 0;
        Object tmp73_69 = tmp69_68;
        tmp73_69[1] = 0;
        tmp73_69;
        mContainerView.getLocationInWindow((int[])localObject1);
        f2 = f1 - localObject1[1];
      }
      mContainerView.setTranslationY(f2);
      localObject1 = new ViewPropertyAnimatorCompatSet();
      Object localObject2 = ViewCompat.animate(mContainerView).translationY(0.0F);
      ((ViewPropertyAnimatorCompat)localObject2).setUpdateListener(mUpdateListener);
      ((ViewPropertyAnimatorCompatSet)localObject1).play((ViewPropertyAnimatorCompat)localObject2);
      if (mContentAnimations)
      {
        localObject2 = mContentView;
        if (localObject2 != null)
        {
          ((View)localObject2).setTranslationY(f2);
          ((ViewPropertyAnimatorCompatSet)localObject1).play(ViewCompat.animate(mContentView).translationY(0.0F));
        }
      }
      ((ViewPropertyAnimatorCompatSet)localObject1).setInterpolator(sShowInterpolator);
      ((ViewPropertyAnimatorCompatSet)localObject1).setDuration(250L);
      ((ViewPropertyAnimatorCompatSet)localObject1).setListener(mShowListener);
      mCurrentShowAnim = ((ViewPropertyAnimatorCompatSet)localObject1);
      ((ViewPropertyAnimatorCompatSet)localObject1).start();
    }
    else
    {
      mContainerView.setAlpha(1.0F);
      mContainerView.setTranslationY(0.0F);
      if (mContentAnimations)
      {
        localObject1 = mContentView;
        if (localObject1 != null) {
          ((View)localObject1).setTranslationY(0.0F);
        }
      }
      mShowListener.onAnimationEnd(null);
    }
    localObject1 = mOverlayLayout;
    if (localObject1 != null) {
      ViewCompat.requestApplyInsets((View)localObject1);
    }
  }
  
  public void enableContentAnimations(boolean paramBoolean)
  {
    mContentAnimations = paramBoolean;
  }
  
  public View getCustomView()
  {
    return mDecorToolbar.getCustomView();
  }
  
  public int getDisplayOptions()
  {
    return mDecorToolbar.getDisplayOptions();
  }
  
  public float getElevation()
  {
    return ViewCompat.getElevation(mContainerView);
  }
  
  public int getHeight()
  {
    return mContainerView.getHeight();
  }
  
  public int getHideOffset()
  {
    return mOverlayLayout.getActionBarHideOffset();
  }
  
  public int getNavigationItemCount()
  {
    int i = mDecorToolbar.getNavigationMode();
    if (i != 1)
    {
      if (i != 2) {
        return 0;
      }
      return mTabs.size();
    }
    return mDecorToolbar.getDropdownItemCount();
  }
  
  public int getNavigationMode()
  {
    return mDecorToolbar.getNavigationMode();
  }
  
  public int getSelectedNavigationIndex()
  {
    int i = mDecorToolbar.getNavigationMode();
    if (i != 1)
    {
      int j = -1;
      if (i != 2) {
        return -1;
      }
      TabImpl localTabImpl = mSelectedTab;
      if (localTabImpl != null) {
        j = localTabImpl.getPosition();
      }
      return j;
    }
    return mDecorToolbar.getDropdownSelectedPosition();
  }
  
  public ActionBar.Tab getSelectedTab()
  {
    return mSelectedTab;
  }
  
  public CharSequence getSubtitle()
  {
    return mDecorToolbar.getSubtitle();
  }
  
  public ActionBar.Tab getTabAt(int paramInt)
  {
    return (ActionBar.Tab)mTabs.get(paramInt);
  }
  
  public int getTabCount()
  {
    return mTabs.size();
  }
  
  public Context getThemedContext()
  {
    if (mThemedContext == null)
    {
      TypedValue localTypedValue = new TypedValue();
      mContext.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
      int i = resourceId;
      if (i != 0) {
        mThemedContext = new ContextThemeWrapper(mContext, i);
      } else {
        mThemedContext = mContext;
      }
    }
    return mThemedContext;
  }
  
  public CharSequence getTitle()
  {
    return mDecorToolbar.getTitle();
  }
  
  public boolean hasIcon()
  {
    return mDecorToolbar.hasIcon();
  }
  
  public boolean hasLogo()
  {
    return mDecorToolbar.hasLogo();
  }
  
  public void hide()
  {
    if (!mHiddenByApp)
    {
      mHiddenByApp = true;
      updateVisibility(false);
    }
  }
  
  public void hideForSystem()
  {
    if (!mHiddenBySystem)
    {
      mHiddenBySystem = true;
      updateVisibility(true);
    }
  }
  
  public boolean isHideOnContentScrollEnabled()
  {
    return mOverlayLayout.isHideOnContentScrollEnabled();
  }
  
  public boolean isShowing()
  {
    int i = getHeight();
    boolean bool;
    if ((mNowShowing) && ((i == 0) || (getHideOffset() < i))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isTitleTruncated()
  {
    DecorToolbar localDecorToolbar = mDecorToolbar;
    boolean bool;
    if ((localDecorToolbar != null) && (localDecorToolbar.isTitleTruncated())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public ActionBar.Tab newTab()
  {
    return new TabImpl();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
  }
  
  public void onContentScrollStarted()
  {
    ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = mCurrentShowAnim;
    if (localViewPropertyAnimatorCompatSet != null)
    {
      localViewPropertyAnimatorCompatSet.cancel();
      mCurrentShowAnim = null;
    }
  }
  
  public void onContentScrollStopped() {}
  
  public boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = mActionMode;
    if (localObject == null) {
      return false;
    }
    localObject = ((ActionModeImpl)localObject).getMenu();
    if (localObject != null)
    {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      }
      int i = KeyCharacterMap.load(i).getKeyboardType();
      boolean bool = true;
      if (i == 1) {
        bool = false;
      }
      ((Menu)localObject).setQwertyMode(bool);
      return ((Menu)localObject).performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    mCurWindowVisibility = paramInt;
  }
  
  public void removeAllTabs()
  {
    cleanupTabs();
  }
  
  public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener paramOnMenuVisibilityListener)
  {
    mMenuVisibilityListeners.remove(paramOnMenuVisibilityListener);
  }
  
  public void removeTab(ActionBar.Tab paramTab)
  {
    removeTabAt(paramTab.getPosition());
  }
  
  public void removeTabAt(int paramInt)
  {
    if (mTabScrollView == null) {
      return;
    }
    Object localObject = mSelectedTab;
    int i;
    if (localObject != null) {
      i = ((TabImpl)localObject).getPosition();
    } else {
      i = mSavedTabPosition;
    }
    mTabScrollView.removeTabAt(paramInt);
    localObject = (TabImpl)mTabs.remove(paramInt);
    if (localObject != null) {
      ((TabImpl)localObject).setPosition(-1);
    }
    int j = mTabs.size();
    for (int k = paramInt; k < j; k++) {
      ((TabImpl)mTabs.get(k)).setPosition(k);
    }
    if (i == paramInt)
    {
      if (mTabs.isEmpty()) {
        localObject = null;
      } else {
        localObject = (ActionBar.Tab)mTabs.get(Math.max(0, paramInt - 1));
      }
      selectTab((ActionBar.Tab)localObject);
    }
  }
  
  public boolean requestFocus()
  {
    ViewGroup localViewGroup = mDecorToolbar.getViewGroup();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
  }
  
  public void selectTab(ActionBar.Tab paramTab)
  {
    int i = getNavigationMode();
    int j = -1;
    if (i != 2)
    {
      if (paramTab != null) {
        j = paramTab.getPosition();
      }
      mSavedTabPosition = j;
      return;
    }
    FragmentTransaction localFragmentTransaction;
    if (((mActivity instanceof FragmentActivity)) && (!mDecorToolbar.getViewGroup().isInEditMode())) {
      localFragmentTransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
    } else {
      localFragmentTransaction = null;
    }
    Object localObject = mSelectedTab;
    if (localObject == paramTab)
    {
      if (localObject != null)
      {
        ((TabImpl)localObject).getCallback().onTabReselected(mSelectedTab, localFragmentTransaction);
        mTabScrollView.animateToTab(paramTab.getPosition());
      }
    }
    else
    {
      localObject = mTabScrollView;
      if (paramTab != null) {
        j = paramTab.getPosition();
      }
      ((ScrollingTabContainerView)localObject).setTabSelected(j);
      localObject = mSelectedTab;
      if (localObject != null) {
        ((TabImpl)localObject).getCallback().onTabUnselected(mSelectedTab, localFragmentTransaction);
      }
      paramTab = (TabImpl)paramTab;
      mSelectedTab = paramTab;
      if (paramTab != null) {
        paramTab.getCallback().onTabSelected(mSelectedTab, localFragmentTransaction);
      }
    }
    if ((localFragmentTransaction != null) && (!localFragmentTransaction.isEmpty())) {
      localFragmentTransaction.commit();
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    mContainerView.setPrimaryBackground(paramDrawable);
  }
  
  public void setCustomView(int paramInt)
  {
    setCustomView(LayoutInflater.from(getThemedContext()).inflate(paramInt, mDecorToolbar.getViewGroup(), false));
  }
  
  public void setCustomView(View paramView)
  {
    mDecorToolbar.setCustomView(paramView);
  }
  
  public void setCustomView(View paramView, ActionBar.LayoutParams paramLayoutParams)
  {
    paramView.setLayoutParams(paramLayoutParams);
    mDecorToolbar.setCustomView(paramView);
  }
  
  public void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (!mDisplayHomeAsUpSet) {
      setDisplayHomeAsUpEnabled(paramBoolean);
    }
  }
  
  public void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 4;
    } else {
      i = 0;
    }
    setDisplayOptions(i, 4);
  }
  
  public void setDisplayOptions(int paramInt)
  {
    if ((paramInt & 0x4) != 0) {
      mDisplayHomeAsUpSet = true;
    }
    mDecorToolbar.setDisplayOptions(paramInt);
  }
  
  public void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = mDecorToolbar.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0) {
      mDisplayHomeAsUpSet = true;
    }
    mDecorToolbar.setDisplayOptions(paramInt1 & paramInt2 | paramInt2 & i);
  }
  
  public void setDisplayShowCustomEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 16;
    } else {
      i = 0;
    }
    setDisplayOptions(i, 16);
  }
  
  public void setDisplayShowHomeEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 2;
    } else {
      i = 0;
    }
    setDisplayOptions(i, 2);
  }
  
  public void setDisplayShowTitleEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 8;
    } else {
      i = 0;
    }
    setDisplayOptions(i, 8);
  }
  
  public void setDisplayUseLogoEnabled(boolean paramBoolean)
  {
    setDisplayOptions(paramBoolean, 1);
  }
  
  public void setElevation(float paramFloat)
  {
    ViewCompat.setElevation(mContainerView, paramFloat);
  }
  
  public void setHideOffset(int paramInt)
  {
    if ((paramInt != 0) && (!mOverlayLayout.isInOverlayMode())) {
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
    }
    mOverlayLayout.setActionBarHideOffset(paramInt);
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if ((paramBoolean) && (!mOverlayLayout.isInOverlayMode())) {
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    mHideOnContentScroll = paramBoolean;
    mOverlayLayout.setHideOnContentScrollEnabled(paramBoolean);
  }
  
  public void setHomeActionContentDescription(int paramInt)
  {
    mDecorToolbar.setNavigationContentDescription(paramInt);
  }
  
  public void setHomeActionContentDescription(CharSequence paramCharSequence)
  {
    mDecorToolbar.setNavigationContentDescription(paramCharSequence);
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    mDecorToolbar.setNavigationIcon(paramInt);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    mDecorToolbar.setNavigationIcon(paramDrawable);
  }
  
  public void setHomeButtonEnabled(boolean paramBoolean)
  {
    mDecorToolbar.setHomeButtonEnabled(paramBoolean);
  }
  
  public void setIcon(int paramInt)
  {
    mDecorToolbar.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    mDecorToolbar.setIcon(paramDrawable);
  }
  
  public void setListNavigationCallbacks(SpinnerAdapter paramSpinnerAdapter, ActionBar.OnNavigationListener paramOnNavigationListener)
  {
    mDecorToolbar.setDropdownParams(paramSpinnerAdapter, new NavItemSelectedListener(paramOnNavigationListener));
  }
  
  public void setLogo(int paramInt)
  {
    mDecorToolbar.setLogo(paramInt);
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    mDecorToolbar.setLogo(paramDrawable);
  }
  
  public void setNavigationMode(int paramInt)
  {
    int i = mDecorToolbar.getNavigationMode();
    if (i == 2)
    {
      mSavedTabPosition = getSelectedNavigationIndex();
      selectTab(null);
      mTabScrollView.setVisibility(8);
    }
    if ((i != paramInt) && (!mHasEmbeddedTabs))
    {
      localObject = mOverlayLayout;
      if (localObject != null) {
        ViewCompat.requestApplyInsets((View)localObject);
      }
    }
    mDecorToolbar.setNavigationMode(paramInt);
    boolean bool1 = false;
    if (paramInt == 2)
    {
      ensureTabsExist();
      mTabScrollView.setVisibility(0);
      i = mSavedTabPosition;
      if (i != -1)
      {
        setSelectedNavigationItem(i);
        mSavedTabPosition = -1;
      }
    }
    Object localObject = mDecorToolbar;
    if ((paramInt == 2) && (!mHasEmbeddedTabs)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    ((DecorToolbar)localObject).setCollapsible(bool2);
    localObject = mOverlayLayout;
    boolean bool2 = bool1;
    if (paramInt == 2)
    {
      bool2 = bool1;
      if (!mHasEmbeddedTabs) {
        bool2 = true;
      }
    }
    ((ActionBarOverlayLayout)localObject).setHasNonEmbeddedTabs(bool2);
  }
  
  public void setSelectedNavigationItem(int paramInt)
  {
    int i = mDecorToolbar.getNavigationMode();
    if (i != 1)
    {
      if (i == 2) {
        selectTab((ActionBar.Tab)mTabs.get(paramInt));
      } else {
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
      }
    }
    else {
      mDecorToolbar.setDropdownSelectedPosition(paramInt);
    }
  }
  
  public void setShowHideAnimationEnabled(boolean paramBoolean)
  {
    mShowHideAnimationEnabled = paramBoolean;
    if (!paramBoolean)
    {
      ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = mCurrentShowAnim;
      if (localViewPropertyAnimatorCompatSet != null) {
        localViewPropertyAnimatorCompatSet.cancel();
      }
    }
  }
  
  public void setSplitBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setStackedBackgroundDrawable(Drawable paramDrawable)
  {
    mContainerView.setStackedBackground(paramDrawable);
  }
  
  public void setSubtitle(int paramInt)
  {
    setSubtitle(mContext.getString(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    mDecorToolbar.setSubtitle(paramCharSequence);
  }
  
  public void setTitle(int paramInt)
  {
    setTitle(mContext.getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    mDecorToolbar.setTitle(paramCharSequence);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    mDecorToolbar.setWindowTitle(paramCharSequence);
  }
  
  public void show()
  {
    if (mHiddenByApp)
    {
      mHiddenByApp = false;
      updateVisibility(false);
    }
  }
  
  public void showForSystem()
  {
    if (mHiddenBySystem)
    {
      mHiddenBySystem = false;
      updateVisibility(true);
    }
  }
  
  public ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    ActionModeImpl localActionModeImpl = mActionMode;
    if (localActionModeImpl != null) {
      localActionModeImpl.finish();
    }
    mOverlayLayout.setHideOnContentScrollEnabled(false);
    mContextView.killMode();
    paramCallback = new ActionModeImpl(mContextView.getContext(), paramCallback);
    if (paramCallback.dispatchOnCreate())
    {
      mActionMode = paramCallback;
      paramCallback.invalidate();
      mContextView.initForMode(paramCallback);
      animateToMode(true);
      return paramCallback;
    }
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public class ActionModeImpl
    extends ActionMode
    implements MenuBuilder.Callback
  {
    private final Context mActionModeContext;
    private ActionMode.Callback mCallback;
    private WeakReference<View> mCustomView;
    private final MenuBuilder mMenu;
    
    public ActionModeImpl(Context paramContext, ActionMode.Callback paramCallback)
    {
      mActionModeContext = paramContext;
      mCallback = paramCallback;
      this$1 = new MenuBuilder(paramContext).setDefaultShowAsAction(1);
      mMenu = WindowDecorActionBar.this;
      setCallback(this);
    }
    
    public boolean dispatchOnCreate()
    {
      mMenu.stopDispatchingItemsChanged();
      try
      {
        boolean bool = mCallback.onCreateActionMode(this, mMenu);
        return bool;
      }
      finally
      {
        mMenu.startDispatchingItemsChanged();
      }
    }
    
    public void finish()
    {
      WindowDecorActionBar localWindowDecorActionBar = WindowDecorActionBar.this;
      if (mActionMode != this) {
        return;
      }
      if (!WindowDecorActionBar.checkShowingFlags(mHiddenByApp, mHiddenBySystem, false))
      {
        localWindowDecorActionBar = WindowDecorActionBar.this;
        mDeferredDestroyActionMode = this;
        mDeferredModeDestroyCallback = mCallback;
      }
      else
      {
        mCallback.onDestroyActionMode(this);
      }
      mCallback = null;
      animateToMode(false);
      mContextView.closeMode();
      localWindowDecorActionBar = WindowDecorActionBar.this;
      mOverlayLayout.setHideOnContentScrollEnabled(mHideOnContentScroll);
      mActionMode = null;
    }
    
    public View getCustomView()
    {
      Object localObject = mCustomView;
      if (localObject != null) {
        localObject = (View)((Reference)localObject).get();
      } else {
        localObject = null;
      }
      return (View)localObject;
    }
    
    public Menu getMenu()
    {
      return mMenu;
    }
    
    public MenuInflater getMenuInflater()
    {
      return new SupportMenuInflater(mActionModeContext);
    }
    
    public CharSequence getSubtitle()
    {
      return mContextView.getSubtitle();
    }
    
    public CharSequence getTitle()
    {
      return mContextView.getTitle();
    }
    
    public void invalidate()
    {
      if (mActionMode != this) {
        return;
      }
      mMenu.stopDispatchingItemsChanged();
      try
      {
        mCallback.onPrepareActionMode(this, mMenu);
        return;
      }
      finally
      {
        mMenu.startDispatchingItemsChanged();
      }
    }
    
    public boolean isTitleOptional()
    {
      return mContextView.isTitleOptional();
    }
    
    public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
    
    public void onCloseSubMenu(SubMenuBuilder paramSubMenuBuilder) {}
    
    public boolean onMenuItemSelected(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
    {
      paramMenuBuilder = mCallback;
      if (paramMenuBuilder != null) {
        return paramMenuBuilder.onActionItemClicked(this, paramMenuItem);
      }
      return false;
    }
    
    public void onMenuModeChange(@NonNull MenuBuilder paramMenuBuilder)
    {
      if (mCallback == null) {
        return;
      }
      invalidate();
      mContextView.showOverflowMenu();
    }
    
    public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
    {
      if (mCallback == null) {
        return false;
      }
      if (!paramSubMenuBuilder.hasVisibleItems()) {
        return true;
      }
      new MenuPopupHelper(getThemedContext(), paramSubMenuBuilder).show();
      return true;
    }
    
    public void setCustomView(View paramView)
    {
      mContextView.setCustomView(paramView);
      mCustomView = new WeakReference(paramView);
    }
    
    public void setSubtitle(int paramInt)
    {
      setSubtitle(mContext.getResources().getString(paramInt));
    }
    
    public void setSubtitle(CharSequence paramCharSequence)
    {
      mContextView.setSubtitle(paramCharSequence);
    }
    
    public void setTitle(int paramInt)
    {
      setTitle(mContext.getResources().getString(paramInt));
    }
    
    public void setTitle(CharSequence paramCharSequence)
    {
      mContextView.setTitle(paramCharSequence);
    }
    
    public void setTitleOptionalHint(boolean paramBoolean)
    {
      super.setTitleOptionalHint(paramBoolean);
      mContextView.setTitleOptional(paramBoolean);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public class TabImpl
    extends ActionBar.Tab
  {
    private ActionBar.TabListener mCallback;
    private CharSequence mContentDesc;
    private View mCustomView;
    private Drawable mIcon;
    private int mPosition = -1;
    private Object mTag;
    private CharSequence mText;
    
    public TabImpl() {}
    
    public ActionBar.TabListener getCallback()
    {
      return mCallback;
    }
    
    public CharSequence getContentDescription()
    {
      return mContentDesc;
    }
    
    public View getCustomView()
    {
      return mCustomView;
    }
    
    public Drawable getIcon()
    {
      return mIcon;
    }
    
    public int getPosition()
    {
      return mPosition;
    }
    
    public Object getTag()
    {
      return mTag;
    }
    
    public CharSequence getText()
    {
      return mText;
    }
    
    public void select()
    {
      selectTab(this);
    }
    
    public ActionBar.Tab setContentDescription(int paramInt)
    {
      return setContentDescription(mContext.getResources().getText(paramInt));
    }
    
    public ActionBar.Tab setContentDescription(CharSequence paramCharSequence)
    {
      mContentDesc = paramCharSequence;
      int i = mPosition;
      if (i >= 0) {
        mTabScrollView.updateTab(i);
      }
      return this;
    }
    
    public ActionBar.Tab setCustomView(int paramInt)
    {
      return setCustomView(LayoutInflater.from(getThemedContext()).inflate(paramInt, null));
    }
    
    public ActionBar.Tab setCustomView(View paramView)
    {
      mCustomView = paramView;
      int i = mPosition;
      if (i >= 0) {
        mTabScrollView.updateTab(i);
      }
      return this;
    }
    
    public ActionBar.Tab setIcon(int paramInt)
    {
      return setIcon(AppCompatResources.getDrawable(mContext, paramInt));
    }
    
    public ActionBar.Tab setIcon(Drawable paramDrawable)
    {
      mIcon = paramDrawable;
      int i = mPosition;
      if (i >= 0) {
        mTabScrollView.updateTab(i);
      }
      return this;
    }
    
    public void setPosition(int paramInt)
    {
      mPosition = paramInt;
    }
    
    public ActionBar.Tab setTabListener(ActionBar.TabListener paramTabListener)
    {
      mCallback = paramTabListener;
      return this;
    }
    
    public ActionBar.Tab setTag(Object paramObject)
    {
      mTag = paramObject;
      return this;
    }
    
    public ActionBar.Tab setText(int paramInt)
    {
      return setText(mContext.getResources().getText(paramInt));
    }
    
    public ActionBar.Tab setText(CharSequence paramCharSequence)
    {
      mText = paramCharSequence;
      int i = mPosition;
      if (i >= 0) {
        mTabScrollView.updateTab(i);
      }
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.WindowDecorActionBar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */