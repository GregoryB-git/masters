package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat.Builder;
import z2;

@SuppressLint({"UnknownNullness"})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout
  extends ViewGroup
  implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3
{
  private static final int ACTION_BAR_ANIMATE_DELAY = 600;
  public static final int[] ATTRS = { R.attr.actionBarSize, 16842841 };
  private static final String TAG = "ActionBarOverlayLayout";
  private int mActionBarHeight;
  public ActionBarContainer mActionBarTop;
  private ActionBarVisibilityCallback mActionBarVisibilityCallback;
  private final Runnable mAddActionBarHideOffset;
  public boolean mAnimatingForFling;
  private final Rect mBaseContentInsets = new Rect();
  @NonNull
  private WindowInsetsCompat mBaseInnerInsets;
  private final Rect mBaseInnerInsetsRect = new Rect();
  private ContentFrameLayout mContent;
  private final Rect mContentInsets = new Rect();
  public ViewPropertyAnimator mCurrentActionBarTopAnimator;
  private DecorToolbar mDecorToolbar;
  private OverScroller mFlingEstimator;
  private boolean mHasNonEmbeddedTabs;
  private boolean mHideOnContentScroll;
  private int mHideOnContentScrollReference;
  private boolean mIgnoreWindowContentOverlay;
  @NonNull
  private WindowInsetsCompat mInnerInsets;
  private final Rect mInnerInsetsRect = new Rect();
  private final Rect mLastBaseContentInsets = new Rect();
  @NonNull
  private WindowInsetsCompat mLastBaseInnerInsets;
  private final Rect mLastBaseInnerInsetsRect = new Rect();
  @NonNull
  private WindowInsetsCompat mLastInnerInsets;
  private final Rect mLastInnerInsetsRect = new Rect();
  private int mLastSystemUiVisibility;
  private boolean mOverlayMode;
  private final NestedScrollingParentHelper mParentHelper;
  private final Runnable mRemoveActionBarHideOffset;
  public final AnimatorListenerAdapter mTopAnimatorListener;
  private Drawable mWindowContentOverlay;
  private int mWindowVisibility = 0;
  
  public ActionBarOverlayLayout(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = WindowInsetsCompat.CONSUMED;
    mBaseInnerInsets = paramAttributeSet;
    mLastBaseInnerInsets = paramAttributeSet;
    mInnerInsets = paramAttributeSet;
    mLastInnerInsets = paramAttributeSet;
    mTopAnimatorListener = new AnimatorListenerAdapter()
    {
      public void onAnimationCancel(Animator paramAnonymousAnimator)
      {
        paramAnonymousAnimator = ActionBarOverlayLayout.this;
        mCurrentActionBarTopAnimator = null;
        mAnimatingForFling = false;
      }
      
      public void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        paramAnonymousAnimator = ActionBarOverlayLayout.this;
        mCurrentActionBarTopAnimator = null;
        mAnimatingForFling = false;
      }
    };
    mRemoveActionBarHideOffset = new Runnable()
    {
      public void run()
      {
        haltActionBarHideOffsetAnimations();
        ActionBarOverlayLayout localActionBarOverlayLayout = ActionBarOverlayLayout.this;
        mCurrentActionBarTopAnimator = mActionBarTop.animate().translationY(0.0F).setListener(mTopAnimatorListener);
      }
    };
    mAddActionBarHideOffset = new Runnable()
    {
      public void run()
      {
        haltActionBarHideOffsetAnimations();
        ActionBarOverlayLayout localActionBarOverlayLayout = ActionBarOverlayLayout.this;
        mCurrentActionBarTopAnimator = mActionBarTop.animate().translationY(-mActionBarTop.getHeight()).setListener(mTopAnimatorListener);
      }
    };
    init(paramContext);
    mParentHelper = new NestedScrollingParentHelper(this);
  }
  
  private void addActionBarHideOffset()
  {
    haltActionBarHideOffsetAnimations();
    mAddActionBarHideOffset.run();
  }
  
  private boolean applyInsets(@NonNull View paramView, @NonNull Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    paramView = (LayoutParams)paramView.getLayoutParams();
    boolean bool1 = true;
    int i;
    int j;
    if (paramBoolean1)
    {
      i = leftMargin;
      j = left;
      if (i != j)
      {
        leftMargin = j;
        bool2 = true;
        break label49;
      }
    }
    boolean bool2 = false;
    label49:
    paramBoolean1 = bool2;
    if (paramBoolean2)
    {
      j = topMargin;
      i = top;
      paramBoolean1 = bool2;
      if (j != i)
      {
        topMargin = i;
        paramBoolean1 = true;
      }
    }
    paramBoolean2 = paramBoolean1;
    if (paramBoolean4)
    {
      i = rightMargin;
      j = right;
      paramBoolean2 = paramBoolean1;
      if (i != j)
      {
        rightMargin = j;
        paramBoolean2 = true;
      }
    }
    if (paramBoolean3)
    {
      j = bottomMargin;
      i = bottom;
      if (j != i)
      {
        bottomMargin = i;
        paramBoolean2 = bool1;
      }
    }
    return paramBoolean2;
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
    localStringBuilder.append(paramView.getClass().getSimpleName());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private void init(Context paramContext)
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(ATTRS);
    boolean bool1 = false;
    mActionBarHeight = localTypedArray.getDimensionPixelSize(0, 0);
    Drawable localDrawable = localTypedArray.getDrawable(1);
    mWindowContentOverlay = localDrawable;
    if (localDrawable == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    setWillNotDraw(bool2);
    localTypedArray.recycle();
    boolean bool2 = bool1;
    if (getApplicationInfotargetSdkVersion < 19) {
      bool2 = true;
    }
    mIgnoreWindowContentOverlay = bool2;
    mFlingEstimator = new OverScroller(paramContext);
  }
  
  private void postAddActionBarHideOffset()
  {
    haltActionBarHideOffsetAnimations();
    postDelayed(mAddActionBarHideOffset, 600L);
  }
  
  private void postRemoveActionBarHideOffset()
  {
    haltActionBarHideOffsetAnimations();
    postDelayed(mRemoveActionBarHideOffset, 600L);
  }
  
  private void removeActionBarHideOffset()
  {
    haltActionBarHideOffsetAnimations();
    mRemoveActionBarHideOffset.run();
  }
  
  private boolean shouldHideActionBarOnFling(float paramFloat)
  {
    mFlingEstimator.fling(0, 0, 0, (int)paramFloat, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    boolean bool;
    if (mFlingEstimator.getFinalY() > mActionBarTop.getHeight()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean canShowOverflowMenu()
  {
    pullChildren();
    return mDecorToolbar.canShowOverflowMenu();
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void dismissPopups()
  {
    pullChildren();
    mDecorToolbar.dismissPopupMenus();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((mWindowContentOverlay != null) && (!mIgnoreWindowContentOverlay))
    {
      int i;
      if (mActionBarTop.getVisibility() == 0)
      {
        float f = mActionBarTop.getBottom();
        i = (int)(mActionBarTop.getTranslationY() + f + 0.5F);
      }
      else
      {
        i = 0;
      }
      mWindowContentOverlay.setBounds(0, i, getWidth(), mWindowContentOverlay.getIntrinsicHeight() + i);
      mWindowContentOverlay.draw(paramCanvas);
    }
  }
  
  public boolean fitSystemWindows(Rect paramRect)
  {
    return super.fitSystemWindows(paramRect);
  }
  
  public LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }
  
  public LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public int getActionBarHideOffset()
  {
    ActionBarContainer localActionBarContainer = mActionBarTop;
    int i;
    if (localActionBarContainer != null) {
      i = -(int)localActionBarContainer.getTranslationY();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getNestedScrollAxes()
  {
    return mParentHelper.getNestedScrollAxes();
  }
  
  public CharSequence getTitle()
  {
    pullChildren();
    return mDecorToolbar.getTitle();
  }
  
  public void haltActionBarHideOffsetAnimations()
  {
    removeCallbacks(mRemoveActionBarHideOffset);
    removeCallbacks(mAddActionBarHideOffset);
    ViewPropertyAnimator localViewPropertyAnimator = mCurrentActionBarTopAnimator;
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.cancel();
    }
  }
  
  public boolean hasIcon()
  {
    pullChildren();
    return mDecorToolbar.hasIcon();
  }
  
  public boolean hasLogo()
  {
    pullChildren();
    return mDecorToolbar.hasLogo();
  }
  
  public boolean hideOverflowMenu()
  {
    pullChildren();
    return mDecorToolbar.hideOverflowMenu();
  }
  
  public void initFeature(int paramInt)
  {
    pullChildren();
    if (paramInt != 2)
    {
      if (paramInt != 5)
      {
        if (paramInt == 109) {
          setOverlayMode(true);
        }
      }
      else {
        mDecorToolbar.initIndeterminateProgress();
      }
    }
    else {
      mDecorToolbar.initProgress();
    }
  }
  
  public boolean isHideOnContentScrollEnabled()
  {
    return mHideOnContentScroll;
  }
  
  public boolean isInOverlayMode()
  {
    return mOverlayMode;
  }
  
  public boolean isOverflowMenuShowPending()
  {
    pullChildren();
    return mDecorToolbar.isOverflowMenuShowPending();
  }
  
  public boolean isOverflowMenuShowing()
  {
    pullChildren();
    return mDecorToolbar.isOverflowMenuShowing();
  }
  
  @RequiresApi(21)
  public WindowInsets onApplyWindowInsets(@NonNull WindowInsets paramWindowInsets)
  {
    pullChildren();
    paramWindowInsets = WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets, this);
    Object localObject = new Rect(paramWindowInsets.getSystemWindowInsetLeft(), paramWindowInsets.getSystemWindowInsetTop(), paramWindowInsets.getSystemWindowInsetRight(), paramWindowInsets.getSystemWindowInsetBottom());
    boolean bool1 = applyInsets(mActionBarTop, (Rect)localObject, true, true, false, true);
    ViewCompat.computeSystemWindowInsets(this, paramWindowInsets, mBaseContentInsets);
    localObject = mBaseContentInsets;
    localObject = paramWindowInsets.inset(left, top, right, bottom);
    mBaseInnerInsets = ((WindowInsetsCompat)localObject);
    boolean bool2 = mLastBaseInnerInsets.equals(localObject);
    boolean bool3 = true;
    if (!bool2)
    {
      mLastBaseInnerInsets = mBaseInnerInsets;
      bool1 = true;
    }
    if (!mLastBaseContentInsets.equals(mBaseContentInsets))
    {
      mLastBaseContentInsets.set(mBaseContentInsets);
      bool1 = bool3;
    }
    if (bool1) {
      requestLayout();
    }
    return paramWindowInsets.consumeDisplayCutout().consumeSystemWindowInsets().consumeStableInsets().toWindowInsets();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    init(getContext());
    ViewCompat.requestApplyInsets(this);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    haltActionBarHideOffsetAnimations();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        int i = localView.getMeasuredWidth();
        int j = localView.getMeasuredHeight();
        int k = leftMargin + paramInt3;
        int m = topMargin + paramInt4;
        localView.layout(k, m, i + k, j + m);
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    pullChildren();
    measureChildWithMargins(mActionBarTop, paramInt1, 0, paramInt2, 0);
    Object localObject = (LayoutParams)mActionBarTop.getLayoutParams();
    int i = Math.max(0, mActionBarTop.getMeasuredWidth() + leftMargin + rightMargin);
    int j = Math.max(0, mActionBarTop.getMeasuredHeight() + topMargin + bottomMargin);
    int k = View.combineMeasuredStates(0, mActionBarTop.getMeasuredState());
    if ((ViewCompat.getWindowSystemUiVisibility(this) & 0x100) != 0) {
      m = 1;
    } else {
      m = 0;
    }
    if (m != 0)
    {
      n = mActionBarHeight;
      i1 = n;
      if (mHasNonEmbeddedTabs)
      {
        i1 = n;
        if (mActionBarTop.getTabContainer() != null) {
          i1 = n + mActionBarHeight;
        }
      }
    }
    else if (mActionBarTop.getVisibility() != 8)
    {
      i1 = mActionBarTop.getMeasuredHeight();
    }
    else
    {
      i1 = 0;
    }
    mContentInsets.set(mBaseContentInsets);
    localObject = mBaseInnerInsets;
    mInnerInsets = ((WindowInsetsCompat)localObject);
    if ((!mOverlayMode) && (m == 0))
    {
      Rect localRect = mContentInsets;
      top += i1;
      bottom += 0;
      mInnerInsets = ((WindowInsetsCompat)localObject).inset(0, i1, 0, 0);
    }
    else
    {
      localObject = Insets.of(((WindowInsetsCompat)localObject).getSystemWindowInsetLeft(), mInnerInsets.getSystemWindowInsetTop() + i1, mInnerInsets.getSystemWindowInsetRight(), mInnerInsets.getSystemWindowInsetBottom() + 0);
      mInnerInsets = new WindowInsetsCompat.Builder(mInnerInsets).setSystemWindowInsets((Insets)localObject).build();
    }
    applyInsets(mContent, mContentInsets, true, true, true, true);
    if (!mLastInnerInsets.equals(mInnerInsets))
    {
      localObject = mInnerInsets;
      mLastInnerInsets = ((WindowInsetsCompat)localObject);
      ViewCompat.dispatchApplyWindowInsets(mContent, (WindowInsetsCompat)localObject);
    }
    measureChildWithMargins(mContent, paramInt1, 0, paramInt2, 0);
    localObject = (LayoutParams)mContent.getLayoutParams();
    int i1 = Math.max(i, mContent.getMeasuredWidth() + leftMargin + rightMargin);
    j = Math.max(j, mContent.getMeasuredHeight() + topMargin + bottomMargin);
    int m = View.combineMeasuredStates(k, mContent.getMeasuredState());
    k = getPaddingLeft();
    int n = getPaddingRight();
    i = getPaddingTop();
    j = Math.max(getPaddingBottom() + i + j, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(n + k + i1, getSuggestedMinimumWidth()), paramInt1, m), View.resolveSizeAndState(j, paramInt2, m << 16));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((mHideOnContentScroll) && (paramBoolean))
    {
      if (shouldHideActionBarOnFling(paramFloat2)) {
        addActionBarHideOffset();
      } else {
        removeActionBarHideOffset();
      }
      mAnimatingForFling = true;
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (paramInt3 == 0) {
      onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = mHideOnContentScrollReference + paramInt2;
    mHideOnContentScrollReference = paramInt1;
    setActionBarHideOffset(paramInt1);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    mParentHelper.onNestedScrollAccepted(paramView1, paramView2, paramInt);
    mHideOnContentScrollReference = getActionBarHideOffset();
    haltActionBarHideOffsetAnimations();
    paramView1 = mActionBarVisibilityCallback;
    if (paramView1 != null) {
      paramView1.onContentScrollStarted();
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      onNestedScrollAccepted(paramView1, paramView2, paramInt1);
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) != 0) && (mActionBarTop.getVisibility() == 0)) {
      return mHideOnContentScroll;
    }
    return false;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt2 == 0) && (onStartNestedScroll(paramView1, paramView2, paramInt1))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    if ((mHideOnContentScroll) && (!mAnimatingForFling)) {
      if (mHideOnContentScrollReference <= mActionBarTop.getHeight()) {
        postRemoveActionBarHideOffset();
      } else {
        postAddActionBarHideOffset();
      }
    }
    paramView = mActionBarVisibilityCallback;
    if (paramView != null) {
      paramView.onContentScrollStopped();
    }
  }
  
  public void onStopNestedScroll(View paramView, int paramInt)
  {
    if (paramInt == 0) {
      onStopNestedScroll(paramView);
    }
  }
  
  @Deprecated
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    super.onWindowSystemUiVisibilityChanged(paramInt);
    pullChildren();
    int i = mLastSystemUiVisibility;
    mLastSystemUiVisibility = paramInt;
    int j = 0;
    int k;
    if ((paramInt & 0x4) == 0) {
      k = 1;
    } else {
      k = 0;
    }
    if ((paramInt & 0x100) != 0) {
      j = 1;
    }
    ActionBarVisibilityCallback localActionBarVisibilityCallback = mActionBarVisibilityCallback;
    if (localActionBarVisibilityCallback != null)
    {
      localActionBarVisibilityCallback.enableContentAnimations(j ^ 0x1);
      if ((k == 0) && (j != 0)) {
        mActionBarVisibilityCallback.hideForSystem();
      } else {
        mActionBarVisibilityCallback.showForSystem();
      }
    }
    if ((((i ^ paramInt) & 0x100) != 0) && (mActionBarVisibilityCallback != null)) {
      ViewCompat.requestApplyInsets(this);
    }
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    mWindowVisibility = paramInt;
    ActionBarVisibilityCallback localActionBarVisibilityCallback = mActionBarVisibilityCallback;
    if (localActionBarVisibilityCallback != null) {
      localActionBarVisibilityCallback.onWindowVisibilityChanged(paramInt);
    }
  }
  
  public void pullChildren()
  {
    if (mContent == null)
    {
      mContent = ((ContentFrameLayout)findViewById(R.id.action_bar_activity_content));
      mActionBarTop = ((ActionBarContainer)findViewById(R.id.action_bar_container));
      mDecorToolbar = getDecorToolbar(findViewById(R.id.action_bar));
    }
  }
  
  public void restoreToolbarHierarchyState(SparseArray<Parcelable> paramSparseArray)
  {
    pullChildren();
    mDecorToolbar.restoreHierarchyState(paramSparseArray);
  }
  
  public void saveToolbarHierarchyState(SparseArray<Parcelable> paramSparseArray)
  {
    pullChildren();
    mDecorToolbar.saveHierarchyState(paramSparseArray);
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    haltActionBarHideOffsetAnimations();
    paramInt = Math.max(0, Math.min(paramInt, mActionBarTop.getHeight()));
    mActionBarTop.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(ActionBarVisibilityCallback paramActionBarVisibilityCallback)
  {
    mActionBarVisibilityCallback = paramActionBarVisibilityCallback;
    if (getWindowToken() != null)
    {
      mActionBarVisibilityCallback.onWindowVisibilityChanged(mWindowVisibility);
      int i = mLastSystemUiVisibility;
      if (i != 0)
      {
        onWindowSystemUiVisibilityChanged(i);
        ViewCompat.requestApplyInsets(this);
      }
    }
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    mHasNonEmbeddedTabs = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != mHideOnContentScroll)
    {
      mHideOnContentScroll = paramBoolean;
      if (!paramBoolean)
      {
        haltActionBarHideOffsetAnimations();
        setActionBarHideOffset(0);
      }
    }
  }
  
  public void setIcon(int paramInt)
  {
    pullChildren();
    mDecorToolbar.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    pullChildren();
    mDecorToolbar.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    pullChildren();
    mDecorToolbar.setLogo(paramInt);
  }
  
  public void setMenu(Menu paramMenu, MenuPresenter.Callback paramCallback)
  {
    pullChildren();
    mDecorToolbar.setMenu(paramMenu, paramCallback);
  }
  
  public void setMenuPrepared()
  {
    pullChildren();
    mDecorToolbar.setMenuPrepared();
  }
  
  public void setOverlayMode(boolean paramBoolean)
  {
    mOverlayMode = paramBoolean;
    if ((paramBoolean) && (getContextgetApplicationInfotargetSdkVersion < 19)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    mIgnoreWindowContentOverlay = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    pullChildren();
    mDecorToolbar.setWindowCallback(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    pullChildren();
    mDecorToolbar.setWindowTitle(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public boolean showOverflowMenu()
  {
    pullChildren();
    return mDecorToolbar.showOverflowMenu();
  }
  
  public static abstract interface ActionBarVisibilityCallback
  {
    public abstract void enableContentAnimations(boolean paramBoolean);
    
    public abstract void hideForSystem();
    
    public abstract void onContentScrollStarted();
    
    public abstract void onContentScrollStopped();
    
    public abstract void onWindowVisibilityChanged(int paramInt);
    
    public abstract void showForSystem();
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */