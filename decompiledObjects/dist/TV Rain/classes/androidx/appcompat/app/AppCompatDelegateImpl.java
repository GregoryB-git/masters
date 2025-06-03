package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewManager;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.color;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportActionModeWrapper.CallbackWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout.OnAttachListener;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat.ThemeCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class AppCompatDelegateImpl
  extends AppCompatDelegate
  implements MenuBuilder.Callback, LayoutInflater.Factory2
{
  public static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
  private static final boolean IS_PRE_LOLLIPOP;
  private static final boolean sCanApplyOverrideConfiguration = true;
  private static final boolean sCanReturnDifferentContext;
  private static boolean sInstalledExceptionHandler;
  private static final SimpleArrayMap<String, Integer> sLocalNightModes = new SimpleArrayMap();
  private static final int[] sWindowBackgroundStyleable;
  public ActionBar mActionBar;
  private ActionMenuPresenterCallback mActionMenuPresenterCallback;
  public androidx.appcompat.view.ActionMode mActionMode;
  public PopupWindow mActionModePopup;
  public ActionBarContextView mActionModeView;
  private boolean mActivityHandlesUiMode;
  private boolean mActivityHandlesUiModeChecked;
  public final AppCompatCallback mAppCompatCallback;
  private AppCompatViewInflater mAppCompatViewInflater;
  private AppCompatWindowCallback mAppCompatWindowCallback;
  private AutoNightModeManager mAutoBatteryNightModeManager;
  private AutoNightModeManager mAutoTimeNightModeManager;
  private boolean mBaseContextAttached;
  private boolean mClosingActionMenu;
  public final Context mContext;
  private boolean mCreated;
  private DecorContentParent mDecorContentParent;
  public boolean mDestroyed;
  private Configuration mEffectiveConfiguration;
  private boolean mEnableDefaultActionBarUp;
  public ViewPropertyAnimatorCompat mFadeAnim = null;
  private boolean mFeatureIndeterminateProgress;
  private boolean mFeatureProgress;
  private boolean mHandleNativeActionModes = true;
  public boolean mHasActionBar;
  public final Object mHost;
  public int mInvalidatePanelMenuFeatures;
  public boolean mInvalidatePanelMenuPosted;
  private final Runnable mInvalidatePanelMenuRunnable = new Runnable()
  {
    public void run()
    {
      AppCompatDelegateImpl localAppCompatDelegateImpl = AppCompatDelegateImpl.this;
      if ((mInvalidatePanelMenuFeatures & 0x1) != 0) {
        localAppCompatDelegateImpl.doInvalidatePanelMenu(0);
      }
      localAppCompatDelegateImpl = AppCompatDelegateImpl.this;
      if ((mInvalidatePanelMenuFeatures & 0x1000) != 0) {
        localAppCompatDelegateImpl.doInvalidatePanelMenu(108);
      }
      localAppCompatDelegateImpl = AppCompatDelegateImpl.this;
      mInvalidatePanelMenuPosted = false;
      mInvalidatePanelMenuFeatures = 0;
    }
  };
  public boolean mIsFloating;
  private LayoutIncludeDetector mLayoutIncludeDetector;
  private int mLocalNightMode = -100;
  private boolean mLongPressBackDown;
  public MenuInflater mMenuInflater;
  public boolean mOverlayActionBar;
  public boolean mOverlayActionMode;
  private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
  private PanelFeatureState[] mPanels;
  private PanelFeatureState mPreparedPanel;
  public Runnable mShowActionModePopup;
  private View mStatusGuard;
  public ViewGroup mSubDecor;
  private boolean mSubDecorInstalled;
  private Rect mTempRect1;
  private Rect mTempRect2;
  private int mThemeResId;
  private CharSequence mTitle;
  private TextView mTitleView;
  public Window mWindow;
  public boolean mWindowNoTitle;
  
  static
  {
    IS_PRE_LOLLIPOP = false;
    sWindowBackgroundStyleable = new int[] { 16842836 };
    sCanReturnDifferentContext = "robolectric".equals(Build.FINGERPRINT) ^ true;
  }
  
  public AppCompatDelegateImpl(Activity paramActivity, AppCompatCallback paramAppCompatCallback)
  {
    this(paramActivity, null, paramAppCompatCallback, paramActivity);
  }
  
  public AppCompatDelegateImpl(Dialog paramDialog, AppCompatCallback paramAppCompatCallback)
  {
    this(paramDialog.getContext(), paramDialog.getWindow(), paramAppCompatCallback, paramDialog);
  }
  
  public AppCompatDelegateImpl(Context paramContext, Activity paramActivity, AppCompatCallback paramAppCompatCallback)
  {
    this(paramContext, null, paramAppCompatCallback, paramActivity);
  }
  
  public AppCompatDelegateImpl(Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback)
  {
    this(paramContext, paramWindow, paramAppCompatCallback, paramContext);
  }
  
  private AppCompatDelegateImpl(Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback, Object paramObject)
  {
    mContext = paramContext;
    mAppCompatCallback = paramAppCompatCallback;
    mHost = paramObject;
    if ((mLocalNightMode == -100) && ((paramObject instanceof Dialog)))
    {
      paramContext = tryUnwrapContext();
      if (paramContext != null) {
        mLocalNightMode = paramContext.getDelegate().getLocalNightMode();
      }
    }
    if (mLocalNightMode == -100)
    {
      paramContext = sLocalNightModes;
      paramAppCompatCallback = (Integer)paramContext.get(paramObject.getClass().getName());
      if (paramAppCompatCallback != null)
      {
        mLocalNightMode = paramAppCompatCallback.intValue();
        paramContext.remove(paramObject.getClass().getName());
      }
    }
    if (paramWindow != null) {
      attachToWindow(paramWindow);
    }
    AppCompatDrawableManager.preload();
  }
  
  private boolean applyDayNight(boolean paramBoolean)
  {
    if (mDestroyed) {
      return false;
    }
    int i = calculateNightMode();
    paramBoolean = updateForNightMode(mapNightMode(mContext, i), paramBoolean);
    AutoNightModeManager localAutoNightModeManager;
    if (i == 0)
    {
      getAutoTimeNightModeManager(mContext).setup();
    }
    else
    {
      localAutoNightModeManager = mAutoTimeNightModeManager;
      if (localAutoNightModeManager != null) {
        localAutoNightModeManager.cleanup();
      }
    }
    if (i == 3)
    {
      getAutoBatteryNightModeManager(mContext).setup();
    }
    else
    {
      localAutoNightModeManager = mAutoBatteryNightModeManager;
      if (localAutoNightModeManager != null) {
        localAutoNightModeManager.cleanup();
      }
    }
    return paramBoolean;
  }
  
  private void applyFixedSizeWindow()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)mSubDecor.findViewById(16908290);
    Object localObject = mWindow.getDecorView();
    localContentFrameLayout.setDecorPadding(((View)localObject).getPaddingLeft(), ((View)localObject).getPaddingTop(), ((View)localObject).getPaddingRight(), ((View)localObject).getPaddingBottom());
    localObject = mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
    ((TypedArray)localObject).getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, localContentFrameLayout.getMinWidthMajor());
    ((TypedArray)localObject).getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, localContentFrameLayout.getMinWidthMinor());
    int i = R.styleable.AppCompatTheme_windowFixedWidthMajor;
    if (((TypedArray)localObject).hasValue(i)) {
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.getFixedWidthMajor());
    }
    i = R.styleable.AppCompatTheme_windowFixedWidthMinor;
    if (((TypedArray)localObject).hasValue(i)) {
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.getFixedWidthMinor());
    }
    i = R.styleable.AppCompatTheme_windowFixedHeightMajor;
    if (((TypedArray)localObject).hasValue(i)) {
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.getFixedHeightMajor());
    }
    i = R.styleable.AppCompatTheme_windowFixedHeightMinor;
    if (((TypedArray)localObject).hasValue(i)) {
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.getFixedHeightMinor());
    }
    ((TypedArray)localObject).recycle();
    localContentFrameLayout.requestLayout();
  }
  
  private void attachToWindow(@NonNull Window paramWindow)
  {
    if (mWindow == null)
    {
      Object localObject = paramWindow.getCallback();
      if (!(localObject instanceof AppCompatWindowCallback))
      {
        localObject = new AppCompatWindowCallback((Window.Callback)localObject);
        mAppCompatWindowCallback = ((AppCompatWindowCallback)localObject);
        paramWindow.setCallback((Window.Callback)localObject);
        TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(mContext, null, sWindowBackgroundStyleable);
        localObject = localTintTypedArray.getDrawableIfKnown(0);
        if (localObject != null) {
          paramWindow.setBackgroundDrawable((Drawable)localObject);
        }
        localTintTypedArray.recycle();
        mWindow = paramWindow;
        return;
      }
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    throw new IllegalStateException("AppCompat has already installed itself into the Window");
  }
  
  private int calculateNightMode()
  {
    int i = mLocalNightMode;
    if (i == -100) {
      i = AppCompatDelegate.getDefaultNightMode();
    }
    return i;
  }
  
  private void cleanupAutoManagers()
  {
    AutoNightModeManager localAutoNightModeManager = mAutoTimeNightModeManager;
    if (localAutoNightModeManager != null) {
      localAutoNightModeManager.cleanup();
    }
    localAutoNightModeManager = mAutoBatteryNightModeManager;
    if (localAutoNightModeManager != null) {
      localAutoNightModeManager.cleanup();
    }
  }
  
  @NonNull
  private Configuration createOverrideConfigurationForDayNight(@NonNull Context paramContext, int paramInt, @Nullable Configuration paramConfiguration, boolean paramBoolean)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramBoolean) {
          paramInt = 0;
        } else {
          paramInt = getApplicationContextgetResourcesgetConfigurationuiMode & 0x30;
        }
      }
      else {
        paramInt = 32;
      }
    }
    else {
      paramInt = 16;
    }
    paramContext = new Configuration();
    fontScale = 0.0F;
    if (paramConfiguration != null) {
      paramContext.setTo(paramConfiguration);
    }
    uiMode = (paramInt | uiMode & 0xFFFFFFCF);
    return paramContext;
  }
  
  private ViewGroup createSubDecor()
  {
    Object localObject = mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
    int i = R.styleable.AppCompatTheme_windowActionBar;
    if (((TypedArray)localObject).hasValue(i))
    {
      if (((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
        requestWindowFeature(1);
      } else if (((TypedArray)localObject).getBoolean(i, false)) {
        requestWindowFeature(108);
      }
      if (((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
        requestWindowFeature(109);
      }
      if (((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
        requestWindowFeature(10);
      }
      mIsFloating = ((TypedArray)localObject).getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
      ((TypedArray)localObject).recycle();
      ensureWindow();
      mWindow.getDecorView();
      localObject = LayoutInflater.from(mContext);
      ViewGroup localViewGroup;
      if (!mWindowNoTitle)
      {
        if (mIsFloating)
        {
          localObject = (ViewGroup)((LayoutInflater)localObject).inflate(R.layout.abc_dialog_title_material, null);
          mOverlayActionBar = false;
          mHasActionBar = false;
        }
        else if (mHasActionBar)
        {
          localObject = new TypedValue();
          mContext.getTheme().resolveAttribute(R.attr.actionBarTheme, (TypedValue)localObject, true);
          if (resourceId != 0) {
            localObject = new androidx.appcompat.view.ContextThemeWrapper(mContext, resourceId);
          } else {
            localObject = mContext;
          }
          localViewGroup = (ViewGroup)LayoutInflater.from((Context)localObject).inflate(R.layout.abc_screen_toolbar, null);
          localObject = (DecorContentParent)localViewGroup.findViewById(R.id.decor_content_parent);
          mDecorContentParent = ((DecorContentParent)localObject);
          ((DecorContentParent)localObject).setWindowCallback(getWindowCallback());
          if (mOverlayActionBar) {
            mDecorContentParent.initFeature(109);
          }
          if (mFeatureProgress) {
            mDecorContentParent.initFeature(2);
          }
          localObject = localViewGroup;
          if (mFeatureIndeterminateProgress)
          {
            mDecorContentParent.initFeature(5);
            localObject = localViewGroup;
          }
        }
        else
        {
          localObject = null;
        }
      }
      else if (mOverlayActionMode) {
        localObject = (ViewGroup)((LayoutInflater)localObject).inflate(R.layout.abc_screen_simple_overlay_action_mode, null);
      } else {
        localObject = (ViewGroup)((LayoutInflater)localObject).inflate(R.layout.abc_screen_simple, null);
      }
      if (localObject != null)
      {
        ViewCompat.setOnApplyWindowInsetsListener((View)localObject, new OnApplyWindowInsetsListener()
        {
          public WindowInsetsCompat onApplyWindowInsets(View paramAnonymousView, WindowInsetsCompat paramAnonymousWindowInsetsCompat)
          {
            int i = paramAnonymousWindowInsetsCompat.getSystemWindowInsetTop();
            int j = updateStatusGuard(paramAnonymousWindowInsetsCompat, null);
            WindowInsetsCompat localWindowInsetsCompat = paramAnonymousWindowInsetsCompat;
            if (i != j) {
              localWindowInsetsCompat = paramAnonymousWindowInsetsCompat.replaceSystemWindowInsets(paramAnonymousWindowInsetsCompat.getSystemWindowInsetLeft(), j, paramAnonymousWindowInsetsCompat.getSystemWindowInsetRight(), paramAnonymousWindowInsetsCompat.getSystemWindowInsetBottom());
            }
            return ViewCompat.onApplyWindowInsets(paramAnonymousView, localWindowInsetsCompat);
          }
        });
        if (mDecorContentParent == null) {
          mTitleView = ((TextView)((View)localObject).findViewById(R.id.title));
        }
        ViewUtils.makeOptionalFitsSystemWindows((View)localObject);
        ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)((View)localObject).findViewById(R.id.action_bar_activity_content);
        localViewGroup = (ViewGroup)mWindow.findViewById(16908290);
        if (localViewGroup != null)
        {
          while (localViewGroup.getChildCount() > 0)
          {
            View localView = localViewGroup.getChildAt(0);
            localViewGroup.removeViewAt(0);
            localContentFrameLayout.addView(localView);
          }
          localViewGroup.setId(-1);
          localContentFrameLayout.setId(16908290);
          if ((localViewGroup instanceof FrameLayout)) {
            ((FrameLayout)localViewGroup).setForeground(null);
          }
        }
        mWindow.setContentView((View)localObject);
        localContentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener()
        {
          public void onAttachedFromWindow() {}
          
          public void onDetachedFromWindow()
          {
            dismissPopups();
          }
        });
        return (ViewGroup)localObject;
      }
      localObject = z2.t("AppCompat does not support the current theme features: { windowActionBar: ");
      ((StringBuilder)localObject).append(mHasActionBar);
      ((StringBuilder)localObject).append(", windowActionBarOverlay: ");
      ((StringBuilder)localObject).append(mOverlayActionBar);
      ((StringBuilder)localObject).append(", android:windowIsFloating: ");
      ((StringBuilder)localObject).append(mIsFloating);
      ((StringBuilder)localObject).append(", windowActionModeOverlay: ");
      ((StringBuilder)localObject).append(mOverlayActionMode);
      ((StringBuilder)localObject).append(", windowNoTitle: ");
      ((StringBuilder)localObject).append(mWindowNoTitle);
      ((StringBuilder)localObject).append(" }");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    ((TypedArray)localObject).recycle();
    throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
  }
  
  private void ensureSubDecor()
  {
    if (!mSubDecorInstalled)
    {
      mSubDecor = createSubDecor();
      Object localObject1 = getTitle();
      if (!TextUtils.isEmpty((CharSequence)localObject1))
      {
        Object localObject2 = mDecorContentParent;
        if (localObject2 != null)
        {
          ((DecorContentParent)localObject2).setWindowTitle((CharSequence)localObject1);
        }
        else if (peekSupportActionBar() != null)
        {
          peekSupportActionBar().setWindowTitle((CharSequence)localObject1);
        }
        else
        {
          localObject2 = mTitleView;
          if (localObject2 != null) {
            ((TextView)localObject2).setText((CharSequence)localObject1);
          }
        }
      }
      applyFixedSizeWindow();
      onSubDecorInstalled(mSubDecor);
      mSubDecorInstalled = true;
      localObject1 = getPanelState(0, false);
      if ((!mDestroyed) && ((localObject1 == null) || (menu == null))) {
        invalidatePanelMenu(108);
      }
    }
  }
  
  private void ensureWindow()
  {
    if (mWindow == null)
    {
      Object localObject = mHost;
      if ((localObject instanceof Activity)) {
        attachToWindow(((Activity)localObject).getWindow());
      }
    }
    if (mWindow != null) {
      return;
    }
    throw new IllegalStateException("We have not been given a Window");
  }
  
  @NonNull
  private static Configuration generateConfigDelta(@NonNull Configuration paramConfiguration1, @Nullable Configuration paramConfiguration2)
  {
    Configuration localConfiguration = new Configuration();
    fontScale = 0.0F;
    if ((paramConfiguration2 != null) && (paramConfiguration1.diff(paramConfiguration2) != 0))
    {
      float f1 = fontScale;
      float f2 = fontScale;
      if (f1 != f2) {
        fontScale = f2;
      }
      int i = mcc;
      int j = mcc;
      if (i != j) {
        mcc = j;
      }
      j = mnc;
      i = mnc;
      if (j != i) {
        mnc = i;
      }
      i = Build.VERSION.SDK_INT;
      Api24Impl.generateConfigDelta_locale(paramConfiguration1, paramConfiguration2, localConfiguration);
      int k = touchscreen;
      j = touchscreen;
      if (k != j) {
        touchscreen = j;
      }
      k = keyboard;
      j = keyboard;
      if (k != j) {
        keyboard = j;
      }
      j = keyboardHidden;
      k = keyboardHidden;
      if (j != k) {
        keyboardHidden = k;
      }
      j = navigation;
      k = navigation;
      if (j != k) {
        navigation = k;
      }
      j = navigationHidden;
      k = navigationHidden;
      if (j != k) {
        navigationHidden = k;
      }
      k = orientation;
      j = orientation;
      if (k != j) {
        orientation = j;
      }
      j = screenLayout;
      k = screenLayout;
      if ((j & 0xF) != (k & 0xF)) {
        screenLayout |= k & 0xF;
      }
      j = screenLayout;
      k = screenLayout;
      if ((j & 0xC0) != (k & 0xC0)) {
        screenLayout |= k & 0xC0;
      }
      j = screenLayout;
      k = screenLayout;
      if ((j & 0x30) != (k & 0x30)) {
        screenLayout |= k & 0x30;
      }
      j = screenLayout;
      k = screenLayout;
      if ((j & 0x300) != (k & 0x300)) {
        screenLayout |= k & 0x300;
      }
      if (i >= 26) {
        Api26Impl.generateConfigDelta_colorMode(paramConfiguration1, paramConfiguration2, localConfiguration);
      }
      j = uiMode;
      i = uiMode;
      if ((j & 0xF) != (i & 0xF)) {
        uiMode |= i & 0xF;
      }
      j = uiMode;
      i = uiMode;
      if ((j & 0x30) != (i & 0x30)) {
        uiMode |= i & 0x30;
      }
      j = screenWidthDp;
      i = screenWidthDp;
      if (j != i) {
        screenWidthDp = i;
      }
      j = screenHeightDp;
      i = screenHeightDp;
      if (j != i) {
        screenHeightDp = i;
      }
      i = smallestScreenWidthDp;
      j = smallestScreenWidthDp;
      if (i != j) {
        smallestScreenWidthDp = j;
      }
      Api17Impl.generateConfigDelta_densityDpi(paramConfiguration1, paramConfiguration2, localConfiguration);
    }
    return localConfiguration;
  }
  
  private AutoNightModeManager getAutoBatteryNightModeManager(@NonNull Context paramContext)
  {
    if (mAutoBatteryNightModeManager == null) {
      mAutoBatteryNightModeManager = new AutoBatteryNightModeManager(paramContext);
    }
    return mAutoBatteryNightModeManager;
  }
  
  private AutoNightModeManager getAutoTimeNightModeManager(@NonNull Context paramContext)
  {
    if (mAutoTimeNightModeManager == null) {
      mAutoTimeNightModeManager = new AutoTimeNightModeManager(TwilightManager.getInstance(paramContext));
    }
    return mAutoTimeNightModeManager;
  }
  
  private void initWindowDecorActionBar()
  {
    ensureSubDecor();
    if ((mHasActionBar) && (mActionBar == null))
    {
      Object localObject = mHost;
      if ((localObject instanceof Activity)) {
        mActionBar = new WindowDecorActionBar((Activity)mHost, mOverlayActionBar);
      } else if ((localObject instanceof Dialog)) {
        mActionBar = new WindowDecorActionBar((Dialog)mHost);
      }
      localObject = mActionBar;
      if (localObject != null) {
        ((ActionBar)localObject).setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
      }
    }
  }
  
  private boolean initializePanelContent(PanelFeatureState paramPanelFeatureState)
  {
    View localView = createdPanelView;
    boolean bool = true;
    if (localView != null)
    {
      shownPanelView = localView;
      return true;
    }
    if (menu == null) {
      return false;
    }
    if (mPanelMenuPresenterCallback == null) {
      mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
    }
    localView = (View)paramPanelFeatureState.getListMenuView(mPanelMenuPresenterCallback);
    shownPanelView = localView;
    if (localView == null) {
      bool = false;
    }
    return bool;
  }
  
  private boolean initializePanelDecor(PanelFeatureState paramPanelFeatureState)
  {
    paramPanelFeatureState.setStyle(getActionBarThemedContext());
    decorView = new ListMenuDecorView(listPresenterContext);
    gravity = 81;
    return true;
  }
  
  private boolean initializePanelMenu(PanelFeatureState paramPanelFeatureState)
  {
    Context localContext = mContext;
    int i = featureId;
    if (i != 0)
    {
      localObject1 = localContext;
      if (i != 108) {}
    }
    else
    {
      localObject1 = localContext;
      if (mDecorContentParent != null)
      {
        TypedValue localTypedValue = new TypedValue();
        Resources.Theme localTheme = localContext.getTheme();
        localTheme.resolveAttribute(R.attr.actionBarTheme, localTypedValue, true);
        localObject1 = null;
        if (resourceId != 0)
        {
          localObject1 = localContext.getResources().newTheme();
          ((Resources.Theme)localObject1).setTo(localTheme);
          ((Resources.Theme)localObject1).applyStyle(resourceId, true);
          ((Resources.Theme)localObject1).resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
        }
        else
        {
          localTheme.resolveAttribute(R.attr.actionBarWidgetTheme, localTypedValue, true);
        }
        Object localObject2 = localObject1;
        if (resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(resourceId, true);
        }
        localObject1 = localContext;
        if (localObject2 != null)
        {
          localObject1 = new androidx.appcompat.view.ContextThemeWrapper(localContext, 0);
          ((androidx.appcompat.view.ContextThemeWrapper)localObject1).getTheme().setTo((Resources.Theme)localObject2);
        }
      }
    }
    Object localObject1 = new MenuBuilder((Context)localObject1);
    ((MenuBuilder)localObject1).setCallback(this);
    paramPanelFeatureState.setMenu((MenuBuilder)localObject1);
    return true;
  }
  
  private void invalidatePanelMenu(int paramInt)
  {
    mInvalidatePanelMenuFeatures = (1 << paramInt | mInvalidatePanelMenuFeatures);
    if (!mInvalidatePanelMenuPosted)
    {
      ViewCompat.postOnAnimation(mWindow.getDecorView(), mInvalidatePanelMenuRunnable);
      mInvalidatePanelMenuPosted = true;
    }
  }
  
  private boolean isActivityManifestHandlingUiMode(Context paramContext)
  {
    if ((!mActivityHandlesUiModeChecked) && ((mHost instanceof Activity)))
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null) {
        return false;
      }
      try
      {
        int i;
        if (Build.VERSION.SDK_INT >= 29) {
          i = 269221888;
        } else {
          i = 786432;
        }
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, mHost.getClass());
        paramContext = localPackageManager.getActivityInfo(localComponentName, i);
        boolean bool;
        if ((paramContext != null) && ((configChanges & 0x200) != 0)) {
          bool = true;
        } else {
          bool = false;
        }
        mActivityHandlesUiMode = bool;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", paramContext);
        mActivityHandlesUiMode = false;
      }
    }
    mActivityHandlesUiModeChecked = true;
    return mActivityHandlesUiMode;
  }
  
  private boolean onKeyDownPanel(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getRepeatCount() == 0)
    {
      PanelFeatureState localPanelFeatureState = getPanelState(paramInt, true);
      if (!isOpen) {
        return preparePanel(localPanelFeatureState, paramKeyEvent);
      }
    }
    return false;
  }
  
  private boolean onKeyUpPanel(int paramInt, KeyEvent paramKeyEvent)
  {
    if (mActionMode != null) {
      return false;
    }
    boolean bool1 = true;
    PanelFeatureState localPanelFeatureState = getPanelState(paramInt, true);
    if (paramInt == 0)
    {
      DecorContentParent localDecorContentParent = mDecorContentParent;
      if ((localDecorContentParent != null) && (localDecorContentParent.canShowOverflowMenu()) && (!ViewConfiguration.get(mContext).hasPermanentMenuKey()))
      {
        if (!mDecorContentParent.isOverflowMenuShowing())
        {
          if ((mDestroyed) || (!preparePanel(localPanelFeatureState, paramKeyEvent))) {
            break label192;
          }
          bool2 = mDecorContentParent.showOverflowMenu();
          break label205;
        }
        bool2 = mDecorContentParent.hideOverflowMenu();
        break label205;
      }
    }
    boolean bool2 = isOpen;
    if ((!bool2) && (!isHandled))
    {
      if (isPrepared)
      {
        if (refreshMenuContent)
        {
          isPrepared = false;
          bool2 = preparePanel(localPanelFeatureState, paramKeyEvent);
        }
        else
        {
          bool2 = true;
        }
        if (bool2)
        {
          openPanel(localPanelFeatureState, paramKeyEvent);
          bool2 = bool1;
          break label205;
        }
      }
      label192:
      bool2 = false;
    }
    else
    {
      closePanel(localPanelFeatureState, true);
    }
    label205:
    if (bool2)
    {
      paramKeyEvent = (AudioManager)mContext.getApplicationContext().getSystemService("audio");
      if (paramKeyEvent != null) {
        paramKeyEvent.playSoundEffect(0);
      } else {
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
      }
    }
    return bool2;
  }
  
  private void openPanel(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if ((!isOpen) && (!mDestroyed))
    {
      if (featureId == 0)
      {
        if ((mContext.getResources().getConfiguration().screenLayout & 0xF) == 4) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0) {
          return;
        }
      }
      Object localObject = getWindowCallback();
      if ((localObject != null) && (!((Window.Callback)localObject).onMenuOpened(featureId, menu)))
      {
        closePanel(paramPanelFeatureState, true);
        return;
      }
      WindowManager localWindowManager = (WindowManager)mContext.getSystemService("window");
      if (localWindowManager == null) {
        return;
      }
      if (!preparePanel(paramPanelFeatureState, paramKeyEvent)) {
        return;
      }
      paramKeyEvent = decorView;
      if ((paramKeyEvent != null) && (!refreshDecorView))
      {
        paramKeyEvent = createdPanelView;
        if (paramKeyEvent != null)
        {
          paramKeyEvent = paramKeyEvent.getLayoutParams();
          if ((paramKeyEvent != null) && (width == -1))
          {
            i = -1;
            break label336;
          }
        }
      }
      else
      {
        if (paramKeyEvent == null)
        {
          if ((initializePanelDecor(paramPanelFeatureState)) && (decorView != null)) {}
        }
        else if ((refreshDecorView) && (paramKeyEvent.getChildCount() > 0)) {
          decorView.removeAllViews();
        }
        if ((!initializePanelContent(paramPanelFeatureState)) || (!paramPanelFeatureState.hasPanelItems())) {
          break label402;
        }
        localObject = shownPanelView.getLayoutParams();
        paramKeyEvent = (KeyEvent)localObject;
        if (localObject == null) {
          paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
        }
        i = background;
        decorView.setBackgroundResource(i);
        localObject = shownPanelView.getParent();
        if ((localObject instanceof ViewGroup)) {
          ((ViewGroup)localObject).removeView(shownPanelView);
        }
        decorView.addView(shownPanelView, paramKeyEvent);
        if (!shownPanelView.hasFocus()) {
          shownPanelView.requestFocus();
        }
      }
      int i = -2;
      label336:
      isHandled = false;
      paramKeyEvent = new WindowManager.LayoutParams(i, -2, x, y, 1002, 8519680, -3);
      gravity = gravity;
      windowAnimations = windowAnimations;
      localWindowManager.addView(decorView, paramKeyEvent);
      isOpen = true;
      return;
      label402:
      refreshDecorView = true;
    }
  }
  
  private boolean performPanelShortcut(PanelFeatureState paramPanelFeatureState, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool1 = paramKeyEvent.isSystem();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (!isPrepared)
    {
      bool1 = bool2;
      if (!preparePanel(paramPanelFeatureState, paramKeyEvent)) {}
    }
    else
    {
      MenuBuilder localMenuBuilder = menu;
      bool1 = bool2;
      if (localMenuBuilder != null) {
        bool1 = localMenuBuilder.performShortcut(paramInt1, paramKeyEvent, paramInt2);
      }
    }
    if ((bool1) && ((paramInt2 & 0x1) == 0) && (mDecorContentParent == null)) {
      closePanel(paramPanelFeatureState, true);
    }
    return bool1;
  }
  
  private boolean preparePanel(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (mDestroyed) {
      return false;
    }
    if (isPrepared) {
      return true;
    }
    Object localObject1 = mPreparedPanel;
    if ((localObject1 != null) && (localObject1 != paramPanelFeatureState)) {
      closePanel((PanelFeatureState)localObject1, false);
    }
    localObject1 = getWindowCallback();
    if (localObject1 != null) {
      createdPanelView = ((Window.Callback)localObject1).onCreatePanelView(featureId);
    }
    int i = featureId;
    if ((i != 0) && (i != 108)) {
      i = 0;
    } else {
      i = 1;
    }
    Object localObject2;
    if (i != 0)
    {
      localObject2 = mDecorContentParent;
      if (localObject2 != null) {
        ((DecorContentParent)localObject2).setMenuPrepared();
      }
    }
    if ((createdPanelView == null) && ((i == 0) || (!(peekSupportActionBar() instanceof ToolbarActionBar))))
    {
      localObject2 = menu;
      if ((localObject2 == null) || (refreshMenuContent))
      {
        if ((localObject2 == null) && ((!initializePanelMenu(paramPanelFeatureState)) || (menu == null))) {
          return false;
        }
        if ((i != 0) && (mDecorContentParent != null))
        {
          if (mActionMenuPresenterCallback == null) {
            mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
          }
          mDecorContentParent.setMenu(menu, mActionMenuPresenterCallback);
        }
        menu.stopDispatchingItemsChanged();
        if (!((Window.Callback)localObject1).onCreatePanelMenu(featureId, menu))
        {
          paramPanelFeatureState.setMenu(null);
          if (i != 0)
          {
            paramPanelFeatureState = mDecorContentParent;
            if (paramPanelFeatureState != null) {
              paramPanelFeatureState.setMenu(null, mActionMenuPresenterCallback);
            }
          }
          return false;
        }
        refreshMenuContent = false;
      }
      menu.stopDispatchingItemsChanged();
      localObject2 = frozenActionViewState;
      if (localObject2 != null)
      {
        menu.restoreActionViewStates((Bundle)localObject2);
        frozenActionViewState = null;
      }
      if (!((Window.Callback)localObject1).onPreparePanel(0, createdPanelView, menu))
      {
        if (i != 0)
        {
          paramKeyEvent = mDecorContentParent;
          if (paramKeyEvent != null) {
            paramKeyEvent.setMenu(null, mActionMenuPresenterCallback);
          }
        }
        menu.startDispatchingItemsChanged();
        return false;
      }
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      }
      boolean bool;
      if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
        bool = true;
      } else {
        bool = false;
      }
      qwertyMode = bool;
      menu.setQwertyMode(bool);
      menu.startDispatchingItemsChanged();
    }
    isPrepared = true;
    isHandled = false;
    mPreparedPanel = paramPanelFeatureState;
    return true;
  }
  
  private void reopenMenu(boolean paramBoolean)
  {
    Object localObject = mDecorContentParent;
    if ((localObject != null) && (((DecorContentParent)localObject).canShowOverflowMenu()) && ((!ViewConfiguration.get(mContext).hasPermanentMenuKey()) || (mDecorContentParent.isOverflowMenuShowPending())))
    {
      localObject = getWindowCallback();
      if ((mDecorContentParent.isOverflowMenuShowing()) && (paramBoolean))
      {
        mDecorContentParent.hideOverflowMenu();
        if (!mDestroyed) {
          ((Window.Callback)localObject).onPanelClosed(108, getPanelState0menu);
        }
      }
      else if ((localObject != null) && (!mDestroyed))
      {
        if ((mInvalidatePanelMenuPosted) && ((mInvalidatePanelMenuFeatures & 0x1) != 0))
        {
          mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
          mInvalidatePanelMenuRunnable.run();
        }
        PanelFeatureState localPanelFeatureState = getPanelState(0, true);
        MenuBuilder localMenuBuilder = menu;
        if ((localMenuBuilder != null) && (!refreshMenuContent) && (((Window.Callback)localObject).onPreparePanel(0, createdPanelView, localMenuBuilder)))
        {
          ((Window.Callback)localObject).onMenuOpened(108, menu);
          mDecorContentParent.showOverflowMenu();
        }
      }
      return;
    }
    localObject = getPanelState(0, true);
    refreshDecorView = true;
    closePanel((PanelFeatureState)localObject, false);
    openPanel((PanelFeatureState)localObject, null);
  }
  
  private int sanitizeWindowFeatureId(int paramInt)
  {
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      return 108;
    }
    int i = paramInt;
    if (paramInt == 9)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
      i = 109;
    }
    return i;
  }
  
  private boolean shouldInheritContext(ViewParent paramViewParent)
  {
    if (paramViewParent == null) {
      return false;
    }
    View localView = mWindow.getDecorView();
    for (;;)
    {
      if (paramViewParent == null) {
        return true;
      }
      if ((paramViewParent == localView) || (!(paramViewParent instanceof View)) || (ViewCompat.isAttachedToWindow((View)paramViewParent))) {
        break;
      }
      paramViewParent = paramViewParent.getParent();
    }
    return false;
  }
  
  private void throwFeatureRequestIfSubDecorInstalled()
  {
    if (!mSubDecorInstalled) {
      return;
    }
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
  
  @Nullable
  private AppCompatActivity tryUnwrapContext()
  {
    for (Context localContext = mContext; localContext != null; localContext = ((ContextWrapper)localContext).getBaseContext())
    {
      if ((localContext instanceof AppCompatActivity)) {
        return (AppCompatActivity)localContext;
      }
      if (!(localContext instanceof ContextWrapper)) {
        break;
      }
    }
    return null;
  }
  
  private boolean updateForNightMode(int paramInt, boolean paramBoolean)
  {
    Object localObject = mContext;
    boolean bool1 = false;
    Configuration localConfiguration1 = createOverrideConfigurationForDayNight((Context)localObject, paramInt, null, false);
    boolean bool2 = isActivityManifestHandlingUiMode(mContext);
    Configuration localConfiguration2 = mEffectiveConfiguration;
    localObject = localConfiguration2;
    if (localConfiguration2 == null) {
      localObject = mContext.getResources().getConfiguration();
    }
    int i = uiMode & 0x30;
    int j = uiMode & 0x30;
    boolean bool3 = true;
    boolean bool4 = bool1;
    if (i != j)
    {
      bool4 = bool1;
      if (paramBoolean)
      {
        bool4 = bool1;
        if (!bool2)
        {
          bool4 = bool1;
          if (mBaseContextAttached) {
            if (!sCanReturnDifferentContext)
            {
              bool4 = bool1;
              if (!mCreated) {}
            }
            else
            {
              localObject = mHost;
              bool4 = bool1;
              if ((localObject instanceof Activity))
              {
                bool4 = bool1;
                if (!((Activity)localObject).isChild())
                {
                  ActivityCompat.recreate((Activity)mHost);
                  bool4 = true;
                }
              }
            }
          }
        }
      }
    }
    if ((!bool4) && (i != j))
    {
      updateResourcesConfigurationForNightMode(j, bool2, null);
      paramBoolean = bool3;
    }
    else
    {
      paramBoolean = bool4;
    }
    if (paramBoolean)
    {
      localObject = mHost;
      if ((localObject instanceof AppCompatActivity)) {
        ((AppCompatActivity)localObject).onNightModeChanged(paramInt);
      }
    }
    return paramBoolean;
  }
  
  private void updateResourcesConfigurationForNightMode(int paramInt, boolean paramBoolean, @Nullable Configuration paramConfiguration)
  {
    Resources localResources = mContext.getResources();
    Configuration localConfiguration = new Configuration(localResources.getConfiguration());
    if (paramConfiguration != null) {
      localConfiguration.updateFrom(paramConfiguration);
    }
    uiMode = (paramInt | getConfigurationuiMode & 0xFFFFFFCF);
    localResources.updateConfiguration(localConfiguration, null);
    if (Build.VERSION.SDK_INT < 26) {
      ResourcesFlusher.flush(localResources);
    }
    paramInt = mThemeResId;
    if (paramInt != 0)
    {
      mContext.setTheme(paramInt);
      mContext.getTheme().applyStyle(mThemeResId, true);
    }
    if (paramBoolean)
    {
      paramConfiguration = mHost;
      if ((paramConfiguration instanceof Activity))
      {
        paramConfiguration = (Activity)paramConfiguration;
        if ((paramConfiguration instanceof LifecycleOwner))
        {
          if (((LifecycleOwner)paramConfiguration).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            paramConfiguration.onConfigurationChanged(localConfiguration);
          }
        }
        else if ((mCreated) && (!mDestroyed)) {
          paramConfiguration.onConfigurationChanged(localConfiguration);
        }
      }
    }
  }
  
  private void updateStatusGuardColor(View paramView)
  {
    int i;
    if ((ViewCompat.getWindowSystemUiVisibility(paramView) & 0x2000) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      i = ContextCompat.getColor(mContext, R.color.abc_decor_view_status_guard_light);
    } else {
      i = ContextCompat.getColor(mContext, R.color.abc_decor_view_status_guard);
    }
    paramView.setBackgroundColor(i);
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ((ViewGroup)mSubDecor.findViewById(16908290)).addView(paramView, paramLayoutParams);
    mAppCompatWindowCallback.bypassOnContentChanged(mWindow.getCallback());
  }
  
  public boolean applyDayNight()
  {
    return applyDayNight(true);
  }
  
  @CallSuper
  @NonNull
  public Context attachBaseContext2(@NonNull Context paramContext)
  {
    i = 1;
    mBaseContextAttached = true;
    int j = mapNightMode(paramContext, calculateNightMode());
    boolean bool = sCanApplyOverrideConfiguration;
    Object localObject = null;
    k = 0;
    if ((bool) && ((paramContext instanceof android.view.ContextThemeWrapper))) {
      localConfiguration1 = createOverrideConfigurationForDayNight(paramContext, j, null, false);
    }
    try
    {
      ContextThemeWrapperCompatApi17Impl.applyOverrideConfiguration((android.view.ContextThemeWrapper)paramContext, localConfiguration1);
      return paramContext;
    }
    catch (IllegalStateException localIllegalStateException1)
    {
      for (;;) {}
    }
    if ((paramContext instanceof androidx.appcompat.view.ContextThemeWrapper)) {
      localConfiguration1 = createOverrideConfigurationForDayNight(paramContext, j, null, false);
    }
    try
    {
      ((androidx.appcompat.view.ContextThemeWrapper)paramContext).applyOverrideConfiguration(localConfiguration1);
      return paramContext;
    }
    catch (IllegalStateException localIllegalStateException2)
    {
      Configuration localConfiguration2;
      for (;;) {}
    }
    if (!sCanReturnDifferentContext) {
      return super.attachBaseContext2(paramContext);
    }
    Configuration localConfiguration1 = new Configuration();
    uiMode = -1;
    fontScale = 0.0F;
    localConfiguration1 = Api17Impl.createConfigurationContext(paramContext, localConfiguration1).getResources().getConfiguration();
    localConfiguration2 = paramContext.getResources().getConfiguration();
    uiMode = uiMode;
    if (!localConfiguration1.equals(localConfiguration2)) {
      localObject = generateConfigDelta(localConfiguration1, localConfiguration2);
    }
    localConfiguration1 = createOverrideConfigurationForDayNight(paramContext, j, (Configuration)localObject, true);
    localObject = new androidx.appcompat.view.ContextThemeWrapper(paramContext, R.style.Theme_AppCompat_Empty);
    ((androidx.appcompat.view.ContextThemeWrapper)localObject).applyOverrideConfiguration(localConfiguration1);
    try
    {
      paramContext = paramContext.getTheme();
      if (paramContext == null) {
        i = 0;
      }
    }
    catch (NullPointerException paramContext)
    {
      for (;;)
      {
        i = k;
      }
    }
    if (i != 0) {
      ResourcesCompat.ThemeCompat.rebase(((androidx.appcompat.view.ContextThemeWrapper)localObject).getTheme());
    }
    return super.attachBaseContext2((Context)localObject);
  }
  
  public void callOnPanelClosed(int paramInt, PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    Object localObject1 = paramPanelFeatureState;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      PanelFeatureState localPanelFeatureState = paramPanelFeatureState;
      if (paramPanelFeatureState == null)
      {
        localPanelFeatureState = paramPanelFeatureState;
        if (paramInt >= 0)
        {
          localObject2 = mPanels;
          localPanelFeatureState = paramPanelFeatureState;
          if (paramInt < localObject2.length) {
            localPanelFeatureState = localObject2[paramInt];
          }
        }
      }
      localObject1 = localPanelFeatureState;
      localObject2 = paramMenu;
      if (localPanelFeatureState != null)
      {
        localObject2 = menu;
        localObject1 = localPanelFeatureState;
      }
    }
    if ((localObject1 != null) && (!isOpen)) {
      return;
    }
    if (!mDestroyed) {
      mAppCompatWindowCallback.bypassOnPanelClosed(mWindow.getCallback(), paramInt, (Menu)localObject2);
    }
  }
  
  public void checkCloseActionMenu(@NonNull MenuBuilder paramMenuBuilder)
  {
    if (mClosingActionMenu) {
      return;
    }
    mClosingActionMenu = true;
    mDecorContentParent.dismissPopups();
    Window.Callback localCallback = getWindowCallback();
    if ((localCallback != null) && (!mDestroyed)) {
      localCallback.onPanelClosed(108, paramMenuBuilder);
    }
    mClosingActionMenu = false;
  }
  
  public void closePanel(int paramInt)
  {
    closePanel(getPanelState(paramInt, true), true);
  }
  
  public void closePanel(PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (featureId == 0))
    {
      localObject = mDecorContentParent;
      if ((localObject != null) && (((DecorContentParent)localObject).isOverflowMenuShowing()))
      {
        checkCloseActionMenu(menu);
        return;
      }
    }
    Object localObject = (WindowManager)mContext.getSystemService("window");
    if ((localObject != null) && (isOpen))
    {
      ViewGroup localViewGroup = decorView;
      if (localViewGroup != null)
      {
        ((ViewManager)localObject).removeView(localViewGroup);
        if (paramBoolean) {
          callOnPanelClosed(featureId, paramPanelFeatureState, null);
        }
      }
    }
    isPrepared = false;
    isHandled = false;
    isOpen = false;
    shownPanelView = null;
    refreshDecorView = true;
    if (mPreparedPanel == paramPanelFeatureState) {
      mPreparedPanel = null;
    }
  }
  
  /* Error */
  public View createView(View paramView, String paramString, @NonNull Context paramContext, @NonNull AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 1355	androidx/appcompat/app/AppCompatDelegateImpl:mAppCompatViewInflater	Landroidx/appcompat/app/AppCompatViewInflater;
    //   4: astore 5
    //   6: iconst_0
    //   7: istore 6
    //   9: aload 5
    //   11: ifnonnull +138 -> 149
    //   14: aload_0
    //   15: getfield 239	androidx/appcompat/app/AppCompatDelegateImpl:mContext	Landroid/content/Context;
    //   18: getstatic 363	androidx/appcompat/R$styleable:AppCompatTheme	[I
    //   21: invokevirtual 369	android/content/Context:obtainStyledAttributes	([I)Landroid/content/res/TypedArray;
    //   24: getstatic 1358	androidx/appcompat/R$styleable:AppCompatTheme_viewInflaterClass	I
    //   27: invokevirtual 1362	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   30: astore 5
    //   32: aload 5
    //   34: ifnonnull +17 -> 51
    //   37: aload_0
    //   38: new 1364	androidx/appcompat/app/AppCompatViewInflater
    //   41: dup
    //   42: invokespecial 1365	androidx/appcompat/app/AppCompatViewInflater:<init>	()V
    //   45: putfield 1355	androidx/appcompat/app/AppCompatDelegateImpl:mAppCompatViewInflater	Landroidx/appcompat/app/AppCompatViewInflater;
    //   48: goto +101 -> 149
    //   51: aload_0
    //   52: aload_0
    //   53: getfield 239	androidx/appcompat/app/AppCompatDelegateImpl:mContext	Landroid/content/Context;
    //   56: invokevirtual 1369	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   59: aload 5
    //   61: invokevirtual 1375	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   64: iconst_0
    //   65: anewarray 265	java/lang/Class
    //   68: invokevirtual 1379	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   71: iconst_0
    //   72: anewarray 259	java/lang/Object
    //   75: invokevirtual 1385	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   78: checkcast 1364	androidx/appcompat/app/AppCompatViewInflater
    //   81: putfield 1355	androidx/appcompat/app/AppCompatDelegateImpl:mAppCompatViewInflater	Landroidx/appcompat/app/AppCompatViewInflater;
    //   84: goto +65 -> 149
    //   87: astore 7
    //   89: new 666	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 1386	java/lang/StringBuilder:<init>	()V
    //   96: astore 8
    //   98: aload 8
    //   100: ldc_w 1388
    //   103: invokevirtual 674	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload 8
    //   109: aload 5
    //   111: invokevirtual 674	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload 8
    //   117: ldc_w 1390
    //   120: invokevirtual 674	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: ldc_w 931
    //   127: aload 8
    //   129: invokevirtual 687	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: aload 7
    //   134: invokestatic 1392	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   137: pop
    //   138: aload_0
    //   139: new 1364	androidx/appcompat/app/AppCompatViewInflater
    //   142: dup
    //   143: invokespecial 1365	androidx/appcompat/app/AppCompatViewInflater:<init>	()V
    //   146: putfield 1355	androidx/appcompat/app/AppCompatDelegateImpl:mAppCompatViewInflater	Landroidx/appcompat/app/AppCompatViewInflater;
    //   149: getstatic 187	androidx/appcompat/app/AppCompatDelegateImpl:IS_PRE_LOLLIPOP	Z
    //   152: istore 9
    //   154: iconst_1
    //   155: istore 10
    //   157: iload 6
    //   159: istore 11
    //   161: iload 9
    //   163: ifeq +82 -> 245
    //   166: aload_0
    //   167: getfield 1394	androidx/appcompat/app/AppCompatDelegateImpl:mLayoutIncludeDetector	Landroidx/appcompat/app/LayoutIncludeDetector;
    //   170: ifnonnull +14 -> 184
    //   173: aload_0
    //   174: new 1396	androidx/appcompat/app/LayoutIncludeDetector
    //   177: dup
    //   178: invokespecial 1397	androidx/appcompat/app/LayoutIncludeDetector:<init>	()V
    //   181: putfield 1394	androidx/appcompat/app/AppCompatDelegateImpl:mLayoutIncludeDetector	Landroidx/appcompat/app/LayoutIncludeDetector;
    //   184: aload_0
    //   185: getfield 1394	androidx/appcompat/app/AppCompatDelegateImpl:mLayoutIncludeDetector	Landroidx/appcompat/app/LayoutIncludeDetector;
    //   188: aload 4
    //   190: invokevirtual 1401	androidx/appcompat/app/LayoutIncludeDetector:detect	(Landroid/util/AttributeSet;)Z
    //   193: ifeq +9 -> 202
    //   196: iconst_1
    //   197: istore 11
    //   199: goto +46 -> 245
    //   202: aload 4
    //   204: instanceof 1403
    //   207: ifeq +28 -> 235
    //   210: iload 6
    //   212: istore 11
    //   214: aload 4
    //   216: checkcast 1403	org/xmlpull/v1/XmlPullParser
    //   219: invokeinterface 1406 1 0
    //   224: iconst_1
    //   225: if_icmple +20 -> 245
    //   228: iload 10
    //   230: istore 11
    //   232: goto +13 -> 245
    //   235: aload_0
    //   236: aload_1
    //   237: checkcast 1188	android/view/ViewParent
    //   240: invokespecial 1408	androidx/appcompat/app/AppCompatDelegateImpl:shouldInheritContext	(Landroid/view/ViewParent;)Z
    //   243: istore 11
    //   245: aload_0
    //   246: getfield 1355	androidx/appcompat/app/AppCompatDelegateImpl:mAppCompatViewInflater	Landroidx/appcompat/app/AppCompatViewInflater;
    //   249: aload_1
    //   250: aload_2
    //   251: aload_3
    //   252: aload 4
    //   254: iload 11
    //   256: iload 9
    //   258: iconst_1
    //   259: invokestatic 1413	androidx/appcompat/widget/VectorEnabledTintResources:shouldBeUsed	()Z
    //   262: invokevirtual 1416	androidx/appcompat/app/AppCompatViewInflater:createView	(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;
    //   265: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	this	AppCompatDelegateImpl
    //   0	266	1	paramView	View
    //   0	266	2	paramString	String
    //   0	266	3	paramContext	Context
    //   0	266	4	paramAttributeSet	AttributeSet
    //   4	106	5	localObject	Object
    //   7	204	6	bool1	boolean
    //   87	46	7	localThrowable	Throwable
    //   96	32	8	localStringBuilder	StringBuilder
    //   152	105	9	bool2	boolean
    //   155	74	10	bool3	boolean
    //   159	96	11	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   51	84	87	finally
  }
  
  public void dismissPopups()
  {
    Object localObject = mDecorContentParent;
    if (localObject != null) {
      ((DecorContentParent)localObject).dismissPopups();
    }
    if (mActionModePopup != null)
    {
      mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
      if (!mActionModePopup.isShowing()) {}
    }
    try
    {
      mActionModePopup.dismiss();
      mActionModePopup = null;
      endOnGoingFadeAnimation();
      localObject = getPanelState(0, false);
      if (localObject != null)
      {
        localObject = menu;
        if (localObject != null) {
          ((MenuBuilder)localObject).close();
        }
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    Object localObject = mHost;
    boolean bool = localObject instanceof KeyEventDispatcher.Component;
    int i = 1;
    if ((bool) || ((localObject instanceof AppCompatDialog)))
    {
      localObject = mWindow.getDecorView();
      if ((localObject != null) && (KeyEventDispatcher.dispatchBeforeHierarchy((View)localObject, paramKeyEvent))) {
        return true;
      }
    }
    if ((paramKeyEvent.getKeyCode() == 82) && (mAppCompatWindowCallback.bypassDispatchKeyEvent(mWindow.getCallback(), paramKeyEvent))) {
      return true;
    }
    int j = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() != 0) {
      i = 0;
    }
    if (i != 0) {
      bool = onKeyDown(j, paramKeyEvent);
    } else {
      bool = onKeyUp(j, paramKeyEvent);
    }
    return bool;
  }
  
  public void doInvalidatePanelMenu(int paramInt)
  {
    PanelFeatureState localPanelFeatureState = getPanelState(paramInt, true);
    Object localObject;
    if (menu != null)
    {
      localObject = new Bundle();
      menu.saveActionViewStates((Bundle)localObject);
      if (((BaseBundle)localObject).size() > 0) {
        frozenActionViewState = ((Bundle)localObject);
      }
      menu.stopDispatchingItemsChanged();
      menu.clear();
    }
    refreshMenuContent = true;
    refreshDecorView = true;
    if (((paramInt == 108) || (paramInt == 0)) && (mDecorContentParent != null))
    {
      localObject = getPanelState(0, false);
      if (localObject != null)
      {
        isPrepared = false;
        preparePanel((PanelFeatureState)localObject, null);
      }
    }
  }
  
  public void endOnGoingFadeAnimation()
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = mFadeAnim;
    if (localViewPropertyAnimatorCompat != null) {
      localViewPropertyAnimatorCompat.cancel();
    }
  }
  
  public PanelFeatureState findMenuPanel(Menu paramMenu)
  {
    PanelFeatureState[] arrayOfPanelFeatureState = mPanels;
    int i = 0;
    int j;
    if (arrayOfPanelFeatureState != null) {
      j = arrayOfPanelFeatureState.length;
    } else {
      j = 0;
    }
    while (i < j)
    {
      PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[i];
      if ((localPanelFeatureState != null) && (menu == paramMenu)) {
        return localPanelFeatureState;
      }
      i++;
    }
    return null;
  }
  
  @Nullable
  public <T extends View> T findViewById(@IdRes int paramInt)
  {
    ensureSubDecor();
    return mWindow.findViewById(paramInt);
  }
  
  public final Context getActionBarThemedContext()
  {
    Object localObject1 = getSupportActionBar();
    if (localObject1 != null) {
      localObject1 = ((ActionBar)localObject1).getThemedContext();
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = mContext;
    }
    return (Context)localObject2;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  @VisibleForTesting
  public final AutoNightModeManager getAutoTimeNightModeManager()
  {
    return getAutoTimeNightModeManager(mContext);
  }
  
  public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
  {
    return new ActionBarDrawableToggleImpl();
  }
  
  public int getLocalNightMode()
  {
    return mLocalNightMode;
  }
  
  public MenuInflater getMenuInflater()
  {
    if (mMenuInflater == null)
    {
      initWindowDecorActionBar();
      Object localObject = mActionBar;
      if (localObject != null) {
        localObject = ((ActionBar)localObject).getThemedContext();
      } else {
        localObject = mContext;
      }
      mMenuInflater = new SupportMenuInflater((Context)localObject);
    }
    return mMenuInflater;
  }
  
  public PanelFeatureState getPanelState(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = mPanels;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (localObject1.length > paramInt) {}
    }
    else
    {
      localObject2 = new PanelFeatureState[paramInt + 1];
      if (localObject1 != null) {
        System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
      }
      mPanels = ((PanelFeatureState[])localObject2);
    }
    Object localObject3 = localObject2[paramInt];
    localObject1 = localObject3;
    if (localObject3 == null)
    {
      localObject1 = new PanelFeatureState(paramInt);
      localObject2[paramInt] = localObject1;
    }
    return (PanelFeatureState)localObject1;
  }
  
  public ViewGroup getSubDecor()
  {
    return mSubDecor;
  }
  
  public ActionBar getSupportActionBar()
  {
    initWindowDecorActionBar();
    return mActionBar;
  }
  
  public final CharSequence getTitle()
  {
    Object localObject = mHost;
    if ((localObject instanceof Activity)) {
      return ((Activity)localObject).getTitle();
    }
    return mTitle;
  }
  
  public final Window.Callback getWindowCallback()
  {
    return mWindow.getCallback();
  }
  
  public boolean hasWindowFeature(int paramInt)
  {
    int i = sanitizeWindowFeatureId(paramInt);
    boolean bool1 = true;
    boolean bool2;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 5)
        {
          if (i != 10)
          {
            if (i != 108)
            {
              if (i != 109) {
                bool2 = false;
              } else {
                bool2 = mOverlayActionBar;
              }
            }
            else {
              bool2 = mHasActionBar;
            }
          }
          else {
            bool2 = mOverlayActionMode;
          }
        }
        else {
          bool2 = mFeatureIndeterminateProgress;
        }
      }
      else {
        bool2 = mFeatureProgress;
      }
    }
    else {
      bool2 = mWindowNoTitle;
    }
    boolean bool3 = bool1;
    if (!bool2) {
      if (mWindow.hasFeature(paramInt)) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  public void installViewFactory()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(mContext);
    if (localLayoutInflater.getFactory() == null) {
      LayoutInflaterCompat.setFactory2(localLayoutInflater, this);
    } else if (!(localLayoutInflater.getFactory2() instanceof AppCompatDelegateImpl)) {
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
    }
  }
  
  public void invalidateOptionsMenu()
  {
    if ((peekSupportActionBar() != null) && (!getSupportActionBar().invalidateOptionsMenu())) {
      invalidatePanelMenu(0);
    }
  }
  
  public boolean isHandleNativeActionModesEnabled()
  {
    return mHandleNativeActionModes;
  }
  
  public int mapNightMode(@NonNull Context paramContext, int paramInt)
  {
    if (paramInt != -100)
    {
      if (paramInt != -1) {
        if (paramInt != 0)
        {
          if ((paramInt != 1) && (paramInt != 2))
          {
            if (paramInt == 3) {
              return getAutoBatteryNightModeManager(paramContext).getApplyableNightMode();
            }
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
          }
        }
        else
        {
          if (((UiModeManager)paramContext.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
            return -1;
          }
          return getAutoTimeNightModeManager(paramContext).getApplyableNightMode();
        }
      }
      return paramInt;
    }
    return -1;
  }
  
  public boolean onBackPressed()
  {
    Object localObject = mActionMode;
    if (localObject != null)
    {
      ((androidx.appcompat.view.ActionMode)localObject).finish();
      return true;
    }
    localObject = getSupportActionBar();
    return (localObject != null) && (((ActionBar)localObject).collapseActionView());
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((mHasActionBar) && (mSubDecorInstalled))
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.onConfigurationChanged(paramConfiguration);
      }
    }
    AppCompatDrawableManager.get().onConfigurationChanged(mContext);
    mEffectiveConfiguration = new Configuration(mContext.getResources().getConfiguration());
    applyDayNight(false);
    paramConfiguration.updateFrom(mContext.getResources().getConfiguration());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    mBaseContextAttached = true;
    applyDayNight(false);
    ensureWindow();
    Object localObject = mHost;
    if ((localObject instanceof Activity)) {
      paramBundle = null;
    }
    try
    {
      localObject = NavUtils.getParentActivityName((Activity)localObject);
      paramBundle = (Bundle)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    if (paramBundle != null)
    {
      paramBundle = peekSupportActionBar();
      if (paramBundle == null) {
        mEnableDefaultActionBarUp = true;
      } else {
        paramBundle.setDefaultDisplayHomeAsUpEnabled(true);
      }
    }
    AppCompatDelegate.addActiveDelegate(this);
    mEffectiveConfiguration = new Configuration(mContext.getResources().getConfiguration());
    mCreated = true;
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return createView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public void onDestroy()
  {
    if ((mHost instanceof Activity)) {
      AppCompatDelegate.removeActivityDelegate(this);
    }
    if (mInvalidatePanelMenuPosted) {
      mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
    }
    mDestroyed = true;
    if (mLocalNightMode != -100)
    {
      localObject = mHost;
      if (((localObject instanceof Activity)) && (((Activity)localObject).isChangingConfigurations()))
      {
        sLocalNightModes.put(mHost.getClass().getName(), Integer.valueOf(mLocalNightMode));
        break label116;
      }
    }
    sLocalNightModes.remove(mHost.getClass().getName());
    label116:
    Object localObject = mActionBar;
    if (localObject != null) {
      ((ActionBar)localObject).onDestroy();
    }
    cleanupAutoManagers();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt != 4)
    {
      if (paramInt == 82)
      {
        onKeyDownPanel(0, paramKeyEvent);
        return true;
      }
    }
    else
    {
      if ((paramKeyEvent.getFlags() & 0x80) == 0) {
        bool = false;
      }
      mLongPressBackDown = bool;
    }
    return false;
  }
  
  public boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = getSupportActionBar();
    if ((localObject != null) && (((ActionBar)localObject).onKeyShortcut(paramInt, paramKeyEvent))) {
      return true;
    }
    localObject = mPreparedPanel;
    if ((localObject != null) && (performPanelShortcut((PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1)))
    {
      paramKeyEvent = mPreparedPanel;
      if (paramKeyEvent != null) {
        isHandled = true;
      }
      return true;
    }
    if (mPreparedPanel == null)
    {
      localObject = getPanelState(0, true);
      preparePanel((PanelFeatureState)localObject, paramKeyEvent);
      boolean bool = performPanelShortcut((PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
      isPrepared = false;
      if (bool) {
        return true;
      }
    }
    return false;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt != 4)
    {
      if (paramInt == 82)
      {
        onKeyUpPanel(0, paramKeyEvent);
        return true;
      }
    }
    else
    {
      boolean bool = mLongPressBackDown;
      mLongPressBackDown = false;
      paramKeyEvent = getPanelState(0, false);
      if ((paramKeyEvent != null) && (isOpen))
      {
        if (!bool) {
          closePanel(paramKeyEvent, true);
        }
        return true;
      }
      if (onBackPressed()) {
        return true;
      }
    }
    return false;
  }
  
  public boolean onMenuItemSelected(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
  {
    Window.Callback localCallback = getWindowCallback();
    if ((localCallback != null) && (!mDestroyed))
    {
      paramMenuBuilder = findMenuPanel(paramMenuBuilder.getRootMenu());
      if (paramMenuBuilder != null) {
        return localCallback.onMenuItemSelected(featureId, paramMenuItem);
      }
    }
    return false;
  }
  
  public void onMenuModeChange(@NonNull MenuBuilder paramMenuBuilder)
  {
    reopenMenu(true);
  }
  
  public void onMenuOpened(int paramInt)
  {
    if (paramInt == 108)
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.dispatchMenuVisibilityChanged(true);
      }
    }
  }
  
  public void onPanelClosed(int paramInt)
  {
    Object localObject;
    if (paramInt == 108)
    {
      localObject = getSupportActionBar();
      if (localObject != null) {
        ((ActionBar)localObject).dispatchMenuVisibilityChanged(false);
      }
    }
    else if (paramInt == 0)
    {
      localObject = getPanelState(paramInt, true);
      if (isOpen) {
        closePanel((PanelFeatureState)localObject, false);
      }
    }
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    ensureSubDecor();
  }
  
  public void onPostResume()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setShowHideAnimationEnabled(true);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart()
  {
    applyDayNight();
  }
  
  public void onStop()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setShowHideAnimationEnabled(false);
    }
  }
  
  public void onSubDecorInstalled(ViewGroup paramViewGroup) {}
  
  public final ActionBar peekSupportActionBar()
  {
    return mActionBar;
  }
  
  public boolean requestWindowFeature(int paramInt)
  {
    paramInt = sanitizeWindowFeatureId(paramInt);
    if ((mWindowNoTitle) && (paramInt == 108)) {
      return false;
    }
    if ((mHasActionBar) && (paramInt == 1)) {
      mHasActionBar = false;
    }
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 5)
        {
          if (paramInt != 10)
          {
            if (paramInt != 108)
            {
              if (paramInt != 109) {
                return mWindow.requestFeature(paramInt);
              }
              throwFeatureRequestIfSubDecorInstalled();
              mOverlayActionBar = true;
              return true;
            }
            throwFeatureRequestIfSubDecorInstalled();
            mHasActionBar = true;
            return true;
          }
          throwFeatureRequestIfSubDecorInstalled();
          mOverlayActionMode = true;
          return true;
        }
        throwFeatureRequestIfSubDecorInstalled();
        mFeatureIndeterminateProgress = true;
        return true;
      }
      throwFeatureRequestIfSubDecorInstalled();
      mFeatureProgress = true;
      return true;
    }
    throwFeatureRequestIfSubDecorInstalled();
    mWindowNoTitle = true;
    return true;
  }
  
  public void setContentView(int paramInt)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(mContext).inflate(paramInt, localViewGroup);
    mAppCompatWindowCallback.bypassOnContentChanged(mWindow.getCallback());
  }
  
  public void setContentView(View paramView)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    mAppCompatWindowCallback.bypassOnContentChanged(mWindow.getCallback());
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    mAppCompatWindowCallback.bypassOnContentChanged(mWindow.getCallback());
  }
  
  public void setHandleNativeActionModesEnabled(boolean paramBoolean)
  {
    mHandleNativeActionModes = paramBoolean;
  }
  
  @RequiresApi(17)
  public void setLocalNightMode(int paramInt)
  {
    if (mLocalNightMode != paramInt)
    {
      mLocalNightMode = paramInt;
      if (mBaseContextAttached) {
        applyDayNight();
      }
    }
  }
  
  public void setSupportActionBar(Toolbar paramToolbar)
  {
    if (!(mHost instanceof Activity)) {
      return;
    }
    ActionBar localActionBar = getSupportActionBar();
    if (!(localActionBar instanceof WindowDecorActionBar))
    {
      mMenuInflater = null;
      if (localActionBar != null) {
        localActionBar.onDestroy();
      }
      mActionBar = null;
      if (paramToolbar != null)
      {
        paramToolbar = new ToolbarActionBar(paramToolbar, getTitle(), mAppCompatWindowCallback);
        mActionBar = paramToolbar;
        mAppCompatWindowCallback.setActionBarCallback(mMenuCallback);
      }
      else
      {
        mAppCompatWindowCallback.setActionBarCallback(null);
      }
      invalidateOptionsMenu();
      return;
    }
    throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
  }
  
  public void setTheme(@StyleRes int paramInt)
  {
    mThemeResId = paramInt;
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    mTitle = paramCharSequence;
    Object localObject = mDecorContentParent;
    if (localObject != null)
    {
      ((DecorContentParent)localObject).setWindowTitle(paramCharSequence);
    }
    else if (peekSupportActionBar() != null)
    {
      peekSupportActionBar().setWindowTitle(paramCharSequence);
    }
    else
    {
      localObject = mTitleView;
      if (localObject != null) {
        ((TextView)localObject).setText(paramCharSequence);
      }
    }
  }
  
  public final boolean shouldAnimateActionModeView()
  {
    if (mSubDecorInstalled)
    {
      ViewGroup localViewGroup = mSubDecor;
      if ((localViewGroup != null) && (ViewCompat.isLaidOut(localViewGroup))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public androidx.appcompat.view.ActionMode startSupportActionMode(@NonNull androidx.appcompat.view.ActionMode.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      Object localObject = mActionMode;
      if (localObject != null) {
        ((androidx.appcompat.view.ActionMode)localObject).finish();
      }
      paramCallback = new ActionModeCallbackWrapperV9(paramCallback);
      localObject = getSupportActionBar();
      if (localObject != null)
      {
        androidx.appcompat.view.ActionMode localActionMode = ((ActionBar)localObject).startActionMode(paramCallback);
        mActionMode = localActionMode;
        if (localActionMode != null)
        {
          localObject = mAppCompatCallback;
          if (localObject != null) {
            ((AppCompatCallback)localObject).onSupportActionModeStarted(localActionMode);
          }
        }
      }
      if (mActionMode == null) {
        mActionMode = startSupportActionModeFromWindow(paramCallback);
      }
      return mActionMode;
    }
    throw new IllegalArgumentException("ActionMode callback can not be null.");
  }
  
  public androidx.appcompat.view.ActionMode startSupportActionModeFromWindow(@NonNull androidx.appcompat.view.ActionMode.Callback paramCallback)
  {
    endOnGoingFadeAnimation();
    Object localObject1 = mActionMode;
    if (localObject1 != null) {
      ((androidx.appcompat.view.ActionMode)localObject1).finish();
    }
    localObject1 = paramCallback;
    if (!(paramCallback instanceof ActionModeCallbackWrapperV9)) {
      localObject1 = new ActionModeCallbackWrapperV9(paramCallback);
    }
    paramCallback = mAppCompatCallback;
    if ((paramCallback != null) && (!mDestroyed)) {}
    try
    {
      paramCallback = paramCallback.onWindowStartingSupportActionMode((androidx.appcompat.view.ActionMode.Callback)localObject1);
    }
    catch (AbstractMethodError paramCallback)
    {
      boolean bool;
      Object localObject2;
      Object localObject3;
      int i;
      for (;;) {}
    }
    paramCallback = null;
    if (paramCallback != null)
    {
      mActionMode = paramCallback;
    }
    else
    {
      paramCallback = mActionModeView;
      bool = true;
      if (paramCallback == null) {
        if (mIsFloating)
        {
          localObject2 = new TypedValue();
          paramCallback = mContext.getTheme();
          paramCallback.resolveAttribute(R.attr.actionBarTheme, (TypedValue)localObject2, true);
          if (resourceId != 0)
          {
            localObject3 = mContext.getResources().newTheme();
            ((Resources.Theme)localObject3).setTo(paramCallback);
            ((Resources.Theme)localObject3).applyStyle(resourceId, true);
            paramCallback = new androidx.appcompat.view.ContextThemeWrapper(mContext, 0);
            paramCallback.getTheme().setTo((Resources.Theme)localObject3);
          }
          else
          {
            paramCallback = mContext;
          }
          mActionModeView = new ActionBarContextView(paramCallback);
          localObject3 = new PopupWindow(paramCallback, null, R.attr.actionModePopupWindowStyle);
          mActionModePopup = ((PopupWindow)localObject3);
          PopupWindowCompat.setWindowLayoutType((PopupWindow)localObject3, 2);
          mActionModePopup.setContentView(mActionModeView);
          mActionModePopup.setWidth(-1);
          paramCallback.getTheme().resolveAttribute(R.attr.actionBarSize, (TypedValue)localObject2, true);
          i = TypedValue.complexToDimensionPixelSize(data, paramCallback.getResources().getDisplayMetrics());
          mActionModeView.setContentHeight(i);
          mActionModePopup.setHeight(-2);
          mShowActionModePopup = new Runnable()
          {
            public void run()
            {
              AppCompatDelegateImpl localAppCompatDelegateImpl = AppCompatDelegateImpl.this;
              mActionModePopup.showAtLocation(mActionModeView, 55, 0, 0);
              endOnGoingFadeAnimation();
              if (shouldAnimateActionModeView())
              {
                mActionModeView.setAlpha(0.0F);
                localAppCompatDelegateImpl = AppCompatDelegateImpl.this;
                mFadeAnim = ViewCompat.animate(mActionModeView).alpha(1.0F);
                mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter()
                {
                  public void onAnimationEnd(View paramAnonymous2View)
                  {
                    mActionModeView.setAlpha(1.0F);
                    mFadeAnim.setListener(null);
                    mFadeAnim = null;
                  }
                  
                  public void onAnimationStart(View paramAnonymous2View)
                  {
                    mActionModeView.setVisibility(0);
                  }
                });
              }
              else
              {
                mActionModeView.setAlpha(1.0F);
                mActionModeView.setVisibility(0);
              }
            }
          };
        }
        else
        {
          paramCallback = (ViewStubCompat)mSubDecor.findViewById(R.id.action_mode_bar_stub);
          if (paramCallback != null)
          {
            paramCallback.setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
            mActionModeView = ((ActionBarContextView)paramCallback.inflate());
          }
        }
      }
      if (mActionModeView != null)
      {
        endOnGoingFadeAnimation();
        mActionModeView.killMode();
        localObject2 = mActionModeView.getContext();
        paramCallback = mActionModeView;
        if (mActionModePopup != null) {
          bool = false;
        }
        paramCallback = new StandaloneActionMode((Context)localObject2, paramCallback, (androidx.appcompat.view.ActionMode.Callback)localObject1, bool);
        if (((androidx.appcompat.view.ActionMode.Callback)localObject1).onCreateActionMode(paramCallback, paramCallback.getMenu()))
        {
          paramCallback.invalidate();
          mActionModeView.initForMode(paramCallback);
          mActionMode = paramCallback;
          if (shouldAnimateActionModeView())
          {
            mActionModeView.setAlpha(0.0F);
            paramCallback = ViewCompat.animate(mActionModeView).alpha(1.0F);
            mFadeAnim = paramCallback;
            paramCallback.setListener(new ViewPropertyAnimatorListenerAdapter()
            {
              public void onAnimationEnd(View paramAnonymousView)
              {
                mActionModeView.setAlpha(1.0F);
                mFadeAnim.setListener(null);
                mFadeAnim = null;
              }
              
              public void onAnimationStart(View paramAnonymousView)
              {
                mActionModeView.setVisibility(0);
                if ((mActionModeView.getParent() instanceof View)) {
                  ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
                }
              }
            });
          }
          else
          {
            mActionModeView.setAlpha(1.0F);
            mActionModeView.setVisibility(0);
            if ((mActionModeView.getParent() instanceof View)) {
              ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
            }
          }
          if (mActionModePopup != null) {
            mWindow.getDecorView().post(mShowActionModePopup);
          }
        }
        else
        {
          mActionMode = null;
        }
      }
    }
    paramCallback = mActionMode;
    if (paramCallback != null)
    {
      localObject1 = mAppCompatCallback;
      if (localObject1 != null) {
        ((AppCompatCallback)localObject1).onSupportActionModeStarted(paramCallback);
      }
    }
    return mActionMode;
  }
  
  public final int updateStatusGuard(@Nullable WindowInsetsCompat paramWindowInsetsCompat, @Nullable Rect paramRect)
  {
    int i = 0;
    int j;
    if (paramWindowInsetsCompat != null) {
      j = paramWindowInsetsCompat.getSystemWindowInsetTop();
    } else if (paramRect != null) {
      j = top;
    } else {
      j = 0;
    }
    Object localObject = mActionModeView;
    int m;
    int i3;
    if ((localObject != null) && ((((View)localObject).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)))
    {
      localObject = (ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams();
      boolean bool = mActionModeView.isShown();
      int k = 1;
      m = 1;
      int i1;
      if (bool)
      {
        if (mTempRect1 == null)
        {
          mTempRect1 = new Rect();
          mTempRect2 = new Rect();
        }
        Rect localRect1 = mTempRect1;
        Rect localRect2 = mTempRect2;
        if (paramWindowInsetsCompat == null) {
          localRect1.set(paramRect);
        } else {
          localRect1.set(paramWindowInsetsCompat.getSystemWindowInsetLeft(), paramWindowInsetsCompat.getSystemWindowInsetTop(), paramWindowInsetsCompat.getSystemWindowInsetRight(), paramWindowInsetsCompat.getSystemWindowInsetBottom());
        }
        ViewUtils.computeFitSystemWindows(mSubDecor, localRect1, localRect2);
        int n = top;
        i1 = left;
        int i2 = right;
        paramWindowInsetsCompat = ViewCompat.getRootWindowInsets(mSubDecor);
        if (paramWindowInsetsCompat == null) {
          k = 0;
        } else {
          k = paramWindowInsetsCompat.getSystemWindowInsetLeft();
        }
        if (paramWindowInsetsCompat == null) {
          i3 = 0;
        } else {
          i3 = paramWindowInsetsCompat.getSystemWindowInsetRight();
        }
        if ((topMargin == n) && (leftMargin == i1) && (rightMargin == i2))
        {
          i1 = 0;
        }
        else
        {
          topMargin = n;
          leftMargin = i1;
          rightMargin = i2;
          i1 = 1;
        }
        if ((n > 0) && (mStatusGuard == null))
        {
          paramWindowInsetsCompat = new View(mContext);
          mStatusGuard = paramWindowInsetsCompat;
          paramWindowInsetsCompat.setVisibility(8);
          paramWindowInsetsCompat = new FrameLayout.LayoutParams(-1, topMargin, 51);
          leftMargin = k;
          rightMargin = i3;
          mSubDecor.addView(mStatusGuard, -1, paramWindowInsetsCompat);
        }
        else
        {
          paramWindowInsetsCompat = mStatusGuard;
          if (paramWindowInsetsCompat != null)
          {
            paramWindowInsetsCompat = (ViewGroup.MarginLayoutParams)paramWindowInsetsCompat.getLayoutParams();
            i2 = height;
            n = topMargin;
            if ((i2 != n) || (leftMargin != k) || (rightMargin != i3))
            {
              height = n;
              leftMargin = k;
              rightMargin = i3;
              mStatusGuard.setLayoutParams(paramWindowInsetsCompat);
            }
          }
        }
        paramWindowInsetsCompat = mStatusGuard;
        if (paramWindowInsetsCompat != null) {
          i3 = m;
        } else {
          i3 = 0;
        }
        if ((i3 != 0) && (paramWindowInsetsCompat.getVisibility() != 0)) {
          updateStatusGuardColor(mStatusGuard);
        }
        k = j;
        if (!mOverlayActionMode)
        {
          k = j;
          if (i3 != 0) {
            k = 0;
          }
        }
        j = k;
        k = i1;
        i1 = i3;
      }
      else if (topMargin != 0)
      {
        topMargin = 0;
        i1 = 0;
      }
      else
      {
        i1 = 0;
        k = i1;
      }
      i3 = j;
      m = i1;
      if (k != 0)
      {
        mActionModeView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        i3 = j;
        m = i1;
      }
    }
    else
    {
      m = 0;
      i3 = j;
    }
    paramWindowInsetsCompat = mStatusGuard;
    if (paramWindowInsetsCompat != null)
    {
      if (m != 0) {
        j = i;
      } else {
        j = 8;
      }
      paramWindowInsetsCompat.setVisibility(j);
    }
    return i3;
  }
  
  public class ActionBarDrawableToggleImpl
    implements ActionBarDrawerToggle.Delegate
  {
    public ActionBarDrawableToggleImpl() {}
    
    public Context getActionBarThemedContext()
    {
      return AppCompatDelegateImpl.this.getActionBarThemedContext();
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
      ActionBar localActionBar = getSupportActionBar();
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
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.setHomeActionContentDescription(paramInt);
      }
    }
    
    public void setActionBarUpIndicator(Drawable paramDrawable, int paramInt)
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null)
      {
        localActionBar.setHomeAsUpIndicator(paramDrawable);
        localActionBar.setHomeActionContentDescription(paramInt);
      }
    }
  }
  
  public static abstract interface ActionBarMenuCallback
  {
    @Nullable
    public abstract View onCreatePanelView(int paramInt);
    
    public abstract boolean onPreparePanel(int paramInt);
  }
  
  public final class ActionMenuPresenterCallback
    implements MenuPresenter.Callback
  {
    public ActionMenuPresenterCallback() {}
    
    public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean)
    {
      checkCloseActionMenu(paramMenuBuilder);
    }
    
    public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
    {
      Window.Callback localCallback = getWindowCallback();
      if (localCallback != null) {
        localCallback.onMenuOpened(108, paramMenuBuilder);
      }
      return true;
    }
  }
  
  public class ActionModeCallbackWrapperV9
    implements androidx.appcompat.view.ActionMode.Callback
  {
    private androidx.appcompat.view.ActionMode.Callback mWrapped;
    
    public ActionModeCallbackWrapperV9(androidx.appcompat.view.ActionMode.Callback paramCallback)
    {
      mWrapped = paramCallback;
    }
    
    public boolean onActionItemClicked(androidx.appcompat.view.ActionMode paramActionMode, MenuItem paramMenuItem)
    {
      return mWrapped.onActionItemClicked(paramActionMode, paramMenuItem);
    }
    
    public boolean onCreateActionMode(androidx.appcompat.view.ActionMode paramActionMode, Menu paramMenu)
    {
      return mWrapped.onCreateActionMode(paramActionMode, paramMenu);
    }
    
    public void onDestroyActionMode(androidx.appcompat.view.ActionMode paramActionMode)
    {
      mWrapped.onDestroyActionMode(paramActionMode);
      paramActionMode = AppCompatDelegateImpl.this;
      if (mActionModePopup != null) {
        mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
      }
      paramActionMode = AppCompatDelegateImpl.this;
      if (mActionModeView != null)
      {
        paramActionMode.endOnGoingFadeAnimation();
        paramActionMode = AppCompatDelegateImpl.this;
        mFadeAnim = ViewCompat.animate(mActionModeView).alpha(0.0F);
        mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter()
        {
          public void onAnimationEnd(View paramAnonymousView)
          {
            mActionModeView.setVisibility(8);
            paramAnonymousView = AppCompatDelegateImpl.this;
            PopupWindow localPopupWindow = mActionModePopup;
            if (localPopupWindow != null) {
              localPopupWindow.dismiss();
            } else if ((mActionModeView.getParent() instanceof View)) {
              ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
            }
            mActionModeView.killMode();
            mFadeAnim.setListener(null);
            paramAnonymousView = AppCompatDelegateImpl.this;
            mFadeAnim = null;
            ViewCompat.requestApplyInsets(mSubDecor);
          }
        });
      }
      paramActionMode = AppCompatDelegateImpl.this;
      AppCompatCallback localAppCompatCallback = mAppCompatCallback;
      if (localAppCompatCallback != null) {
        localAppCompatCallback.onSupportActionModeFinished(mActionMode);
      }
      paramActionMode = AppCompatDelegateImpl.this;
      mActionMode = null;
      ViewCompat.requestApplyInsets(mSubDecor);
    }
    
    public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode paramActionMode, Menu paramMenu)
    {
      ViewCompat.requestApplyInsets(mSubDecor);
      return mWrapped.onPrepareActionMode(paramActionMode, paramMenu);
    }
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    public static Context createConfigurationContext(@NonNull Context paramContext, @NonNull Configuration paramConfiguration)
    {
      return paramContext.createConfigurationContext(paramConfiguration);
    }
    
    public static void generateConfigDelta_densityDpi(@NonNull Configuration paramConfiguration1, @NonNull Configuration paramConfiguration2, @NonNull Configuration paramConfiguration3)
    {
      int i = densityDpi;
      int j = densityDpi;
      if (i != j) {
        densityDpi = j;
      }
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    public static boolean isPowerSaveMode(PowerManager paramPowerManager)
    {
      return paramPowerManager.isPowerSaveMode();
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    public static void generateConfigDelta_locale(@NonNull Configuration paramConfiguration1, @NonNull Configuration paramConfiguration2, @NonNull Configuration paramConfiguration3)
    {
      LocaleList localLocaleList = paramConfiguration1.getLocales();
      paramConfiguration1 = paramConfiguration2.getLocales();
      if (!localLocaleList.equals(paramConfiguration1))
      {
        paramConfiguration3.setLocales(paramConfiguration1);
        locale = locale;
      }
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    public static void generateConfigDelta_colorMode(@NonNull Configuration paramConfiguration1, @NonNull Configuration paramConfiguration2, @NonNull Configuration paramConfiguration3)
    {
      int i = colorMode;
      int j = colorMode;
      if ((i & 0x3) != (j & 0x3)) {
        colorMode |= j & 0x3;
      }
      i = colorMode;
      j = colorMode;
      if ((i & 0xC) != (j & 0xC)) {
        colorMode |= j & 0xC;
      }
    }
  }
  
  public class AppCompatWindowCallback
    extends WindowCallbackWrapper
  {
    private AppCompatDelegateImpl.ActionBarMenuCallback mActionBarCallback;
    private boolean mDispatchKeyEventBypassEnabled;
    private boolean mOnContentChangedBypassEnabled;
    private boolean mOnPanelClosedBypassEnabled;
    
    public AppCompatWindowCallback(Window.Callback paramCallback)
    {
      super();
    }
    
    public boolean bypassDispatchKeyEvent(Window.Callback paramCallback, KeyEvent paramKeyEvent)
    {
      try
      {
        mDispatchKeyEventBypassEnabled = true;
        boolean bool = paramCallback.dispatchKeyEvent(paramKeyEvent);
        return bool;
      }
      finally
      {
        mDispatchKeyEventBypassEnabled = false;
      }
    }
    
    public void bypassOnContentChanged(Window.Callback paramCallback)
    {
      try
      {
        mOnContentChangedBypassEnabled = true;
        paramCallback.onContentChanged();
        return;
      }
      finally
      {
        mOnContentChangedBypassEnabled = false;
      }
    }
    
    public void bypassOnPanelClosed(Window.Callback paramCallback, int paramInt, Menu paramMenu)
    {
      try
      {
        mOnPanelClosedBypassEnabled = true;
        paramCallback.onPanelClosed(paramInt, paramMenu);
        return;
      }
      finally
      {
        mOnPanelClosedBypassEnabled = false;
      }
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      if (mDispatchKeyEventBypassEnabled) {
        return getWrapped().dispatchKeyEvent(paramKeyEvent);
      }
      boolean bool;
      if ((!AppCompatDelegateImpl.this.dispatchKeyEvent(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
    {
      boolean bool;
      if ((!super.dispatchKeyShortcutEvent(paramKeyEvent)) && (!onKeyShortcut(paramKeyEvent.getKeyCode(), paramKeyEvent))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void onContentChanged()
    {
      if (mOnContentChangedBypassEnabled) {
        getWrapped().onContentChanged();
      }
    }
    
    public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
    {
      if ((paramInt == 0) && (!(paramMenu instanceof MenuBuilder))) {
        return false;
      }
      return super.onCreatePanelMenu(paramInt, paramMenu);
    }
    
    public View onCreatePanelView(int paramInt)
    {
      Object localObject = mActionBarCallback;
      if (localObject != null)
      {
        localObject = ((AppCompatDelegateImpl.ActionBarMenuCallback)localObject).onCreatePanelView(paramInt);
        if (localObject != null) {
          return (View)localObject;
        }
      }
      return super.onCreatePanelView(paramInt);
    }
    
    public boolean onMenuOpened(int paramInt, Menu paramMenu)
    {
      super.onMenuOpened(paramInt, paramMenu);
      onMenuOpened(paramInt);
      return true;
    }
    
    public void onPanelClosed(int paramInt, Menu paramMenu)
    {
      if (mOnPanelClosedBypassEnabled)
      {
        getWrapped().onPanelClosed(paramInt, paramMenu);
        return;
      }
      super.onPanelClosed(paramInt, paramMenu);
      onPanelClosed(paramInt);
    }
    
    public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      MenuBuilder localMenuBuilder;
      if ((paramMenu instanceof MenuBuilder)) {
        localMenuBuilder = (MenuBuilder)paramMenu;
      } else {
        localMenuBuilder = null;
      }
      if ((paramInt == 0) && (localMenuBuilder == null)) {
        return false;
      }
      boolean bool1 = true;
      if (localMenuBuilder != null) {
        localMenuBuilder.setOverrideVisibleItems(true);
      }
      AppCompatDelegateImpl.ActionBarMenuCallback localActionBarMenuCallback = mActionBarCallback;
      if ((localActionBarMenuCallback == null) || (!localActionBarMenuCallback.onPreparePanel(paramInt))) {
        bool1 = false;
      }
      boolean bool2 = bool1;
      if (!bool1) {
        bool2 = super.onPreparePanel(paramInt, paramView, paramMenu);
      }
      if (localMenuBuilder != null) {
        localMenuBuilder.setOverrideVisibleItems(false);
      }
      return bool2;
    }
    
    @RequiresApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
    {
      Object localObject = getPanelState(0, true);
      if (localObject != null)
      {
        localObject = menu;
        if (localObject != null)
        {
          super.onProvideKeyboardShortcuts(paramList, (Menu)localObject, paramInt);
          return;
        }
      }
      super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
    }
    
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback paramCallback)
    {
      return null;
    }
    
    @RequiresApi(23)
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback paramCallback, int paramInt)
    {
      if ((isHandleNativeActionModesEnabled()) && (paramInt == 0)) {
        return startAsSupportActionMode(paramCallback);
      }
      return super.onWindowStartingActionMode(paramCallback, paramInt);
    }
    
    public void setActionBarCallback(@Nullable AppCompatDelegateImpl.ActionBarMenuCallback paramActionBarMenuCallback)
    {
      mActionBarCallback = paramActionBarMenuCallback;
    }
    
    public final android.view.ActionMode startAsSupportActionMode(android.view.ActionMode.Callback paramCallback)
    {
      SupportActionModeWrapper.CallbackWrapper localCallbackWrapper = new SupportActionModeWrapper.CallbackWrapper(mContext, paramCallback);
      paramCallback = startSupportActionMode(localCallbackWrapper);
      if (paramCallback != null) {
        return localCallbackWrapper.getActionModeWrapper(paramCallback);
      }
      return null;
    }
  }
  
  public class AutoBatteryNightModeManager
    extends AppCompatDelegateImpl.AutoNightModeManager
  {
    private final PowerManager mPowerManager;
    
    public AutoBatteryNightModeManager(Context paramContext)
    {
      super();
      mPowerManager = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
    }
    
    public IntentFilter createIntentFilterForBroadcastReceiver()
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
      return localIntentFilter;
    }
    
    public int getApplyableNightMode()
    {
      int i;
      if (AppCompatDelegateImpl.Api21Impl.isPowerSaveMode(mPowerManager)) {
        i = 2;
      } else {
        i = 1;
      }
      return i;
    }
    
    public void onChange()
    {
      applyDayNight();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  @VisibleForTesting
  public abstract class AutoNightModeManager
  {
    private BroadcastReceiver mReceiver;
    
    public AutoNightModeManager() {}
    
    public void cleanup()
    {
      BroadcastReceiver localBroadcastReceiver = mReceiver;
      if (localBroadcastReceiver != null) {}
      try
      {
        mContext.unregisterReceiver(localBroadcastReceiver);
        mReceiver = null;
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
    
    @Nullable
    public abstract IntentFilter createIntentFilterForBroadcastReceiver();
    
    public abstract int getApplyableNightMode();
    
    public boolean isListening()
    {
      boolean bool;
      if (mReceiver != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public abstract void onChange();
    
    public void setup()
    {
      cleanup();
      IntentFilter localIntentFilter = createIntentFilterForBroadcastReceiver();
      if ((localIntentFilter != null) && (localIntentFilter.countActions() != 0))
      {
        if (mReceiver == null) {
          mReceiver = new BroadcastReceiver()
          {
            public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
            {
              onChange();
            }
          };
        }
        mContext.registerReceiver(mReceiver, localIntentFilter);
      }
    }
  }
  
  public class AutoTimeNightModeManager
    extends AppCompatDelegateImpl.AutoNightModeManager
  {
    private final TwilightManager mTwilightManager;
    
    public AutoTimeNightModeManager(TwilightManager paramTwilightManager)
    {
      super();
      mTwilightManager = paramTwilightManager;
    }
    
    public IntentFilter createIntentFilterForBroadcastReceiver()
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.TIME_SET");
      localIntentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
      localIntentFilter.addAction("android.intent.action.TIME_TICK");
      return localIntentFilter;
    }
    
    public int getApplyableNightMode()
    {
      int i;
      if (mTwilightManager.isNight()) {
        i = 2;
      } else {
        i = 1;
      }
      return i;
    }
    
    public void onChange()
    {
      applyDayNight();
    }
  }
  
  @RequiresApi(17)
  public static class ContextThemeWrapperCompatApi17Impl
  {
    public static void applyOverrideConfiguration(android.view.ContextThemeWrapper paramContextThemeWrapper, Configuration paramConfiguration)
    {
      paramContextThemeWrapper.applyOverrideConfiguration(paramConfiguration);
    }
  }
  
  public class ListMenuDecorView
    extends ContentFrameLayout
  {
    public ListMenuDecorView(Context paramContext)
    {
      super();
    }
    
    private boolean isOutOfBounds(int paramInt1, int paramInt2)
    {
      boolean bool;
      if ((paramInt1 >= -5) && (paramInt2 >= -5) && (paramInt1 <= getWidth() + 5) && (paramInt2 <= getHeight() + 5)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      boolean bool;
      if ((!AppCompatDelegateImpl.this.dispatchKeyEvent(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if ((paramMotionEvent.getAction() == 0) && (isOutOfBounds((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())))
      {
        closePanel(0);
        return true;
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    public void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), paramInt));
    }
  }
  
  public static final class PanelFeatureState
  {
    public int background;
    public View createdPanelView;
    public ViewGroup decorView;
    public int featureId;
    public Bundle frozenActionViewState;
    public Bundle frozenMenuState;
    public int gravity;
    public boolean isHandled;
    public boolean isOpen;
    public boolean isPrepared;
    public ListMenuPresenter listMenuPresenter;
    public Context listPresenterContext;
    public MenuBuilder menu;
    public boolean qwertyMode;
    public boolean refreshDecorView;
    public boolean refreshMenuContent;
    public View shownPanelView;
    public boolean wasLastOpen;
    public int windowAnimations;
    public int x;
    public int y;
    
    public PanelFeatureState(int paramInt)
    {
      featureId = paramInt;
      refreshDecorView = false;
    }
    
    public void applyFrozenState()
    {
      MenuBuilder localMenuBuilder = menu;
      if (localMenuBuilder != null)
      {
        Bundle localBundle = frozenMenuState;
        if (localBundle != null)
        {
          localMenuBuilder.restorePresenterStates(localBundle);
          frozenMenuState = null;
        }
      }
    }
    
    public void clearMenuPresenters()
    {
      MenuBuilder localMenuBuilder = menu;
      if (localMenuBuilder != null) {
        localMenuBuilder.removeMenuPresenter(listMenuPresenter);
      }
      listMenuPresenter = null;
    }
    
    public MenuView getListMenuView(MenuPresenter.Callback paramCallback)
    {
      if (menu == null) {
        return null;
      }
      if (listMenuPresenter == null)
      {
        ListMenuPresenter localListMenuPresenter = new ListMenuPresenter(listPresenterContext, R.layout.abc_list_menu_item_layout);
        listMenuPresenter = localListMenuPresenter;
        localListMenuPresenter.setCallback(paramCallback);
        menu.addMenuPresenter(listMenuPresenter);
      }
      return listMenuPresenter.getMenuView(decorView);
    }
    
    public boolean hasPanelItems()
    {
      View localView = shownPanelView;
      boolean bool = false;
      if (localView == null) {
        return false;
      }
      if (createdPanelView != null) {
        return true;
      }
      if (listMenuPresenter.getAdapter().getCount() > 0) {
        bool = true;
      }
      return bool;
    }
    
    public void onRestoreInstanceState(Parcelable paramParcelable)
    {
      paramParcelable = (SavedState)paramParcelable;
      featureId = featureId;
      wasLastOpen = isOpen;
      frozenMenuState = menuState;
      shownPanelView = null;
      decorView = null;
    }
    
    public Parcelable onSaveInstanceState()
    {
      SavedState localSavedState = new SavedState();
      featureId = featureId;
      isOpen = isOpen;
      if (menu != null)
      {
        Bundle localBundle = new Bundle();
        menuState = localBundle;
        menu.savePresenterStates(localBundle);
      }
      return localSavedState;
    }
    
    public void setMenu(MenuBuilder paramMenuBuilder)
    {
      Object localObject = menu;
      if (paramMenuBuilder == localObject) {
        return;
      }
      if (localObject != null) {
        ((MenuBuilder)localObject).removeMenuPresenter(listMenuPresenter);
      }
      menu = paramMenuBuilder;
      if (paramMenuBuilder != null)
      {
        localObject = listMenuPresenter;
        if (localObject != null) {
          paramMenuBuilder.addMenuPresenter((MenuPresenter)localObject);
        }
      }
    }
    
    public void setStyle(Context paramContext)
    {
      TypedValue localTypedValue = new TypedValue();
      Resources.Theme localTheme = paramContext.getResources().newTheme();
      localTheme.setTo(paramContext.getTheme());
      localTheme.resolveAttribute(R.attr.actionBarPopupTheme, localTypedValue, true);
      int i = resourceId;
      if (i != 0) {
        localTheme.applyStyle(i, true);
      }
      localTheme.resolveAttribute(R.attr.panelMenuListTheme, localTypedValue, true);
      i = resourceId;
      if (i != 0) {
        localTheme.applyStyle(i, true);
      } else {
        localTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
      }
      paramContext = new androidx.appcompat.view.ContextThemeWrapper(paramContext, 0);
      paramContext.getTheme().setTo(localTheme);
      listPresenterContext = paramContext;
      paramContext = paramContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
      background = paramContext.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
      windowAnimations = paramContext.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
      paramContext.recycle();
    }
    
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState
      implements Parcelable
    {
      public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
      {
        public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel paramAnonymousParcel)
        {
          return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(paramAnonymousParcel, null);
        }
        
        public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
        {
          return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(paramAnonymousParcel, paramAnonymousClassLoader);
        }
        
        public AppCompatDelegateImpl.PanelFeatureState.SavedState[] newArray(int paramAnonymousInt)
        {
          return new AppCompatDelegateImpl.PanelFeatureState.SavedState[paramAnonymousInt];
        }
      };
      public int featureId;
      public boolean isOpen;
      public Bundle menuState;
      
      public static SavedState readFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        SavedState localSavedState = new SavedState();
        featureId = paramParcel.readInt();
        int i = paramParcel.readInt();
        boolean bool = true;
        if (i != 1) {
          bool = false;
        }
        isOpen = bool;
        if (bool) {
          menuState = paramParcel.readBundle(paramClassLoader);
        }
        return localSavedState;
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(featureId);
        paramParcel.writeInt(isOpen);
        if (isOpen) {
          paramParcel.writeBundle(menuState);
        }
      }
    }
  }
  
  public final class PanelMenuPresenterCallback
    implements MenuPresenter.Callback
  {
    public PanelMenuPresenterCallback() {}
    
    public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean)
    {
      MenuBuilder localMenuBuilder = paramMenuBuilder.getRootMenu();
      int i;
      if (localMenuBuilder != paramMenuBuilder) {
        i = 1;
      } else {
        i = 0;
      }
      AppCompatDelegateImpl localAppCompatDelegateImpl = AppCompatDelegateImpl.this;
      if (i != 0) {
        paramMenuBuilder = localMenuBuilder;
      }
      paramMenuBuilder = localAppCompatDelegateImpl.findMenuPanel(paramMenuBuilder);
      if (paramMenuBuilder != null) {
        if (i != 0)
        {
          callOnPanelClosed(featureId, paramMenuBuilder, localMenuBuilder);
          closePanel(paramMenuBuilder, true);
        }
        else
        {
          closePanel(paramMenuBuilder, paramBoolean);
        }
      }
    }
    
    public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
    {
      if (paramMenuBuilder == paramMenuBuilder.getRootMenu())
      {
        Object localObject = AppCompatDelegateImpl.this;
        if (mHasActionBar)
        {
          localObject = ((AppCompatDelegateImpl)localObject).getWindowCallback();
          if ((localObject != null) && (!mDestroyed)) {
            ((Window.Callback)localObject).onMenuOpened(108, paramMenuBuilder);
          }
        }
      }
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */