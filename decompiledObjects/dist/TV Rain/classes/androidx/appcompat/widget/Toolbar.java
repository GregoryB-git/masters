package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.appcompat.app.ActionBar.LayoutParams;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Toolbar
  extends ViewGroup
  implements MenuHost
{
  private static final String TAG = "Toolbar";
  private MenuPresenter.Callback mActionMenuPresenterCallback;
  public int mButtonGravity;
  public ImageButton mCollapseButtonView;
  private CharSequence mCollapseDescription;
  private Drawable mCollapseIcon;
  private boolean mCollapsible;
  private int mContentInsetEndWithActions;
  private int mContentInsetStartWithNavigation;
  private RtlSpacingHelper mContentInsets;
  private boolean mEatingHover;
  private boolean mEatingTouch;
  public View mExpandedActionView;
  private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
  private int mGravity = 8388627;
  private final ArrayList<View> mHiddenViews = new ArrayList();
  private ImageView mLogoView;
  private int mMaxButtonHeight;
  private MenuBuilder.Callback mMenuBuilderCallback;
  public final MenuHostHelper mMenuHostHelper = new MenuHostHelper(new a(this, 2));
  private ActionMenuView mMenuView;
  private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener = new ActionMenuView.OnMenuItemClickListener()
  {
    public boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
    {
      if (mMenuHostHelper.onMenuItemSelected(paramAnonymousMenuItem)) {
        return true;
      }
      Toolbar.OnMenuItemClickListener localOnMenuItemClickListener = mOnMenuItemClickListener;
      if (localOnMenuItemClickListener != null) {
        return localOnMenuItemClickListener.onMenuItemClick(paramAnonymousMenuItem);
      }
      return false;
    }
  };
  private ImageButton mNavButtonView;
  public OnMenuItemClickListener mOnMenuItemClickListener;
  private ActionMenuPresenter mOuterActionMenuPresenter;
  private Context mPopupContext;
  private int mPopupTheme;
  private ArrayList<MenuItem> mProvidedMenuItems = new ArrayList();
  private final Runnable mShowOverflowMenuRunnable = new Runnable()
  {
    public void run()
    {
      showOverflowMenu();
    }
  };
  private CharSequence mSubtitleText;
  private int mSubtitleTextAppearance;
  private ColorStateList mSubtitleTextColor;
  private TextView mSubtitleTextView;
  private final int[] mTempMargins = new int[2];
  private final ArrayList<View> mTempViews = new ArrayList();
  private int mTitleMarginBottom;
  private int mTitleMarginEnd;
  private int mTitleMarginStart;
  private int mTitleMarginTop;
  private CharSequence mTitleText;
  private int mTitleTextAppearance;
  private ColorStateList mTitleTextColor;
  private TextView mTitleTextView;
  private ToolbarWidgetWrapper mWrapper;
  
  public Toolbar(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Toolbar(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.toolbarStyle);
  }
  
  public Toolbar(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = getContext();
    int[] arrayOfInt = R.styleable.Toolbar;
    localObject = TintTypedArray.obtainStyledAttributes((Context)localObject, paramAttributeSet, arrayOfInt, paramInt, 0);
    ViewCompat.saveAttributeDataForStyleable(this, paramContext, arrayOfInt, paramAttributeSet, ((TintTypedArray)localObject).getWrappedTypeArray(), paramInt, 0);
    mTitleTextAppearance = ((TintTypedArray)localObject).getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
    mSubtitleTextAppearance = ((TintTypedArray)localObject).getResourceId(R.styleable.Toolbar_subtitleTextAppearance, 0);
    mGravity = ((TintTypedArray)localObject).getInteger(R.styleable.Toolbar_android_gravity, mGravity);
    mButtonGravity = ((TintTypedArray)localObject).getInteger(R.styleable.Toolbar_buttonGravity, 48);
    int i = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_titleMargin, 0);
    int j = R.styleable.Toolbar_titleMargins;
    paramInt = i;
    if (((TintTypedArray)localObject).hasValue(j)) {
      paramInt = ((TintTypedArray)localObject).getDimensionPixelOffset(j, i);
    }
    mTitleMarginBottom = paramInt;
    mTitleMarginTop = paramInt;
    mTitleMarginEnd = paramInt;
    mTitleMarginStart = paramInt;
    paramInt = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0) {
      mTitleMarginStart = paramInt;
    }
    paramInt = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0) {
      mTitleMarginEnd = paramInt;
    }
    paramInt = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0) {
      mTitleMarginTop = paramInt;
    }
    paramInt = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0) {
      mTitleMarginBottom = paramInt;
    }
    mMaxButtonHeight = ((TintTypedArray)localObject).getDimensionPixelSize(R.styleable.Toolbar_maxButtonHeight, -1);
    int k = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
    j = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
    i = ((TintTypedArray)localObject).getDimensionPixelSize(R.styleable.Toolbar_contentInsetLeft, 0);
    paramInt = ((TintTypedArray)localObject).getDimensionPixelSize(R.styleable.Toolbar_contentInsetRight, 0);
    ensureContentInsets();
    mContentInsets.setAbsolute(i, paramInt);
    if ((k != Integer.MIN_VALUE) || (j != Integer.MIN_VALUE)) {
      mContentInsets.setRelative(k, j);
    }
    mContentInsetStartWithNavigation = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
    mContentInsetEndWithActions = ((TintTypedArray)localObject).getDimensionPixelOffset(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
    mCollapseIcon = ((TintTypedArray)localObject).getDrawable(R.styleable.Toolbar_collapseIcon);
    mCollapseDescription = ((TintTypedArray)localObject).getText(R.styleable.Toolbar_collapseContentDescription);
    paramContext = ((TintTypedArray)localObject).getText(R.styleable.Toolbar_title);
    if (!TextUtils.isEmpty(paramContext)) {
      setTitle(paramContext);
    }
    paramContext = ((TintTypedArray)localObject).getText(R.styleable.Toolbar_subtitle);
    if (!TextUtils.isEmpty(paramContext)) {
      setSubtitle(paramContext);
    }
    mPopupContext = getContext();
    setPopupTheme(((TintTypedArray)localObject).getResourceId(R.styleable.Toolbar_popupTheme, 0));
    paramContext = ((TintTypedArray)localObject).getDrawable(R.styleable.Toolbar_navigationIcon);
    if (paramContext != null) {
      setNavigationIcon(paramContext);
    }
    paramContext = ((TintTypedArray)localObject).getText(R.styleable.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(paramContext)) {
      setNavigationContentDescription(paramContext);
    }
    paramContext = ((TintTypedArray)localObject).getDrawable(R.styleable.Toolbar_logo);
    if (paramContext != null) {
      setLogo(paramContext);
    }
    paramContext = ((TintTypedArray)localObject).getText(R.styleable.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(paramContext)) {
      setLogoDescription(paramContext);
    }
    paramInt = R.styleable.Toolbar_titleTextColor;
    if (((TintTypedArray)localObject).hasValue(paramInt)) {
      setTitleTextColor(((TintTypedArray)localObject).getColorStateList(paramInt));
    }
    paramInt = R.styleable.Toolbar_subtitleTextColor;
    if (((TintTypedArray)localObject).hasValue(paramInt)) {
      setSubtitleTextColor(((TintTypedArray)localObject).getColorStateList(paramInt));
    }
    paramInt = R.styleable.Toolbar_menu;
    if (((TintTypedArray)localObject).hasValue(paramInt)) {
      inflateMenu(((TintTypedArray)localObject).getResourceId(paramInt, 0));
    }
    ((TintTypedArray)localObject).recycle();
  }
  
  private void addCustomViewsWithGravity(List<View> paramList, int paramInt)
  {
    int i = ViewCompat.getLayoutDirection(this);
    int j = 0;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    }
    int k = getChildCount();
    int m = GravityCompat.getAbsoluteGravity(paramInt, ViewCompat.getLayoutDirection(this));
    paramList.clear();
    paramInt = j;
    Object localObject1;
    Object localObject2;
    if (i != 0) {
      for (paramInt = k - 1; paramInt >= 0; paramInt--)
      {
        localObject1 = getChildAt(paramInt);
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        if ((mViewType == 0) && (shouldLayout((View)localObject1)) && (getChildHorizontalGravity(gravity) == m)) {
          paramList.add(localObject1);
        }
      }
    }
    while (paramInt < k)
    {
      localObject2 = getChildAt(paramInt);
      localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
      if ((mViewType == 0) && (shouldLayout((View)localObject2)) && (getChildHorizontalGravity(gravity) == m)) {
        paramList.add(localObject2);
      }
      paramInt++;
    }
  }
  
  private void addSystemView(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = generateDefaultLayoutParams();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
      localObject = generateLayoutParams((ViewGroup.LayoutParams)localObject);
    } else {
      localObject = (LayoutParams)localObject;
    }
    mViewType = 1;
    if ((paramBoolean) && (mExpandedActionView != null))
    {
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      mHiddenViews.add(paramView);
    }
    else
    {
      addView(paramView, (ViewGroup.LayoutParams)localObject);
    }
  }
  
  private void ensureContentInsets()
  {
    if (mContentInsets == null) {
      mContentInsets = new RtlSpacingHelper();
    }
  }
  
  private void ensureLogoView()
  {
    if (mLogoView == null) {
      mLogoView = new AppCompatImageView(getContext());
    }
  }
  
  private void ensureMenu()
  {
    ensureMenuView();
    if (mMenuView.peekMenu() == null)
    {
      MenuBuilder localMenuBuilder = (MenuBuilder)mMenuView.getMenu();
      if (mExpandedMenuPresenter == null) {
        mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
      }
      mMenuView.setExpandedActionViewsExclusive(true);
      localMenuBuilder.addMenuPresenter(mExpandedMenuPresenter, mPopupContext);
    }
  }
  
  private void ensureMenuView()
  {
    if (mMenuView == null)
    {
      Object localObject = new ActionMenuView(getContext());
      mMenuView = ((ActionMenuView)localObject);
      ((ActionMenuView)localObject).setPopupTheme(mPopupTheme);
      mMenuView.setOnMenuItemClickListener(mMenuViewItemClickListener);
      mMenuView.setMenuCallbacks(mActionMenuPresenterCallback, mMenuBuilderCallback);
      localObject = generateDefaultLayoutParams();
      gravity = (0x800005 | mButtonGravity & 0x70);
      mMenuView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      addSystemView(mMenuView, false);
    }
  }
  
  private void ensureNavButtonView()
  {
    if (mNavButtonView == null)
    {
      mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
      LayoutParams localLayoutParams = generateDefaultLayoutParams();
      gravity = (0x800003 | mButtonGravity & 0x70);
      mNavButtonView.setLayoutParams(localLayoutParams);
    }
  }
  
  private int getChildHorizontalGravity(int paramInt)
  {
    int i = ViewCompat.getLayoutDirection(this);
    int j = GravityCompat.getAbsoluteGravity(paramInt, i) & 0x7;
    if (j != 1)
    {
      paramInt = 3;
      if ((j != 3) && (j != 5))
      {
        if (i == 1) {
          paramInt = 5;
        }
        return paramInt;
      }
    }
    return j;
  }
  
  private int getChildTop(View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (i - paramInt) / 2;
    } else {
      paramInt = 0;
    }
    int j = getChildVerticalGravity(gravity);
    if (j != 48)
    {
      if (j != 80)
      {
        int k = getPaddingTop();
        int m = getPaddingBottom();
        int n = getHeight();
        j = (n - k - m - i) / 2;
        paramInt = topMargin;
        if (j >= paramInt)
        {
          n = n - m - i - j - k;
          i = bottomMargin;
          paramInt = j;
          if (n < i) {
            paramInt = Math.max(0, j - (i - n));
          }
        }
        return k + paramInt;
      }
      return getHeight() - getPaddingBottom() - i - bottomMargin - paramInt;
    }
    return getPaddingTop() - paramInt;
  }
  
  private int getChildVerticalGravity(int paramInt)
  {
    int i = paramInt & 0x70;
    paramInt = i;
    if (i != 16)
    {
      paramInt = i;
      if (i != 48)
      {
        paramInt = i;
        if (i != 80) {
          paramInt = mGravity & 0x70;
        }
      }
    }
    return paramInt;
  }
  
  private ArrayList<MenuItem> getCurrentMenuItems()
  {
    ArrayList localArrayList = new ArrayList();
    Menu localMenu = getMenu();
    for (int i = 0; i < localMenu.size(); i++) {
      localArrayList.add(localMenu.getItem(i));
    }
    return localArrayList;
  }
  
  private int getHorizontalMargins(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = MarginLayoutParamsCompat.getMarginStart(paramView);
    return MarginLayoutParamsCompat.getMarginEnd(paramView) + i;
  }
  
  private MenuInflater getMenuInflater()
  {
    return new SupportMenuInflater(getContext());
  }
  
  private int getVerticalMargins(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return topMargin + bottomMargin;
  }
  
  private int getViewListMeasuredWidth(List<View> paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = paramList.size();
    int m = 0;
    int n = m;
    while (m < k)
    {
      paramArrayOfInt = (View)paramList.get(m);
      LayoutParams localLayoutParams = (LayoutParams)paramArrayOfInt.getLayoutParams();
      i = leftMargin - i;
      j = rightMargin - j;
      int i1 = Math.max(0, i);
      int i2 = Math.max(0, j);
      i = Math.max(0, -i);
      j = Math.max(0, -j);
      n += paramArrayOfInt.getMeasuredWidth() + i1 + i2;
      m++;
    }
    return n;
  }
  
  private boolean isChildOrHidden(View paramView)
  {
    boolean bool;
    if ((paramView.getParent() != this) && (!mHiddenViews.contains(paramView))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private int layoutChildLeft(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i);
    paramInt2 = getChildTop(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i, paramView.getMeasuredHeight() + paramInt2);
    return i + rightMargin + paramInt1;
  }
  
  private int layoutChildRight(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfInt[1] = Math.max(0, -i);
    i = getChildTop(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - paramInt2, i, paramInt1, paramView.getMeasuredHeight() + i);
    return paramInt1 - (paramInt2 + leftMargin);
  }
  
  private int measureChildCollapseMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = leftMargin - paramArrayOfInt[0];
    int j = rightMargin - paramArrayOfInt[1];
    int k = Math.max(0, i);
    k = Math.max(0, j) + k;
    paramArrayOfInt[0] = Math.max(0, -i);
    paramArrayOfInt[1] = Math.max(0, -j);
    i = getPaddingLeft();
    paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + k + paramInt2, width);
    paramInt2 = getPaddingTop();
    paramView.measure(paramInt1, ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt2 + topMargin + bottomMargin + paramInt4, height));
    return paramView.getMeasuredWidth() + k;
  }
  
  private void measureChildConstrained(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getPaddingLeft();
    i = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + leftMargin + rightMargin + paramInt2, width);
    paramInt1 = getPaddingTop();
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt1 + topMargin + bottomMargin + paramInt4, height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0)
      {
        paramInt1 = paramInt5;
        if (paramInt3 != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5);
        }
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i, paramInt1);
  }
  
  private void onCreateMenu()
  {
    Menu localMenu = getMenu();
    ArrayList localArrayList1 = getCurrentMenuItems();
    mMenuHostHelper.onCreateMenu(localMenu, getMenuInflater());
    ArrayList localArrayList2 = getCurrentMenuItems();
    localArrayList2.removeAll(localArrayList1);
    mProvidedMenuItems = localArrayList2;
    mMenuHostHelper.onPrepareMenu(localMenu);
  }
  
  private void postShowOverflowMenu()
  {
    removeCallbacks(mShowOverflowMenuRunnable);
    post(mShowOverflowMenuRunnable);
  }
  
  private boolean shouldCollapse()
  {
    if (!mCollapsible) {
      return false;
    }
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if ((shouldLayout(localView)) && (localView.getMeasuredWidth() > 0) && (localView.getMeasuredHeight() > 0)) {
        return false;
      }
    }
    return true;
  }
  
  private boolean shouldLayout(View paramView)
  {
    boolean bool;
    if ((paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void addChildrenForExpandedActionView()
  {
    for (int i = mHiddenViews.size() - 1; i >= 0; i--) {
      addView((View)mHiddenViews.get(i));
    }
    mHiddenViews.clear();
  }
  
  @MainThread
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider)
  {
    mMenuHostHelper.addMenuProvider(paramMenuProvider);
  }
  
  @MainThread
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider, @NonNull LifecycleOwner paramLifecycleOwner)
  {
    mMenuHostHelper.addMenuProvider(paramMenuProvider, paramLifecycleOwner);
  }
  
  @SuppressLint({"LambdaLast"})
  @MainThread
  public void addMenuProvider(@NonNull MenuProvider paramMenuProvider, @NonNull LifecycleOwner paramLifecycleOwner, @NonNull Lifecycle.State paramState)
  {
    mMenuHostHelper.addMenuProvider(paramMenuProvider, paramLifecycleOwner, paramState);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean canShowOverflowMenu()
  {
    if (getVisibility() == 0)
    {
      ActionMenuView localActionMenuView = mMenuView;
      if ((localActionMenuView != null) && (localActionMenuView.isOverflowReserved())) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if ((super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof LayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void collapseActionView()
  {
    Object localObject = mExpandedMenuPresenter;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = mCurrentExpandedItem;
    }
    if (localObject != null) {
      ((MenuItemImpl)localObject).collapseActionView();
    }
  }
  
  public void dismissPopupMenus()
  {
    ActionMenuView localActionMenuView = mMenuView;
    if (localActionMenuView != null) {
      localActionMenuView.dismissPopupMenus();
    }
  }
  
  public void ensureCollapseButtonView()
  {
    if (mCollapseButtonView == null)
    {
      Object localObject = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
      mCollapseButtonView = ((ImageButton)localObject);
      ((ImageView)localObject).setImageDrawable(mCollapseIcon);
      mCollapseButtonView.setContentDescription(mCollapseDescription);
      localObject = generateDefaultLayoutParams();
      gravity = (0x800003 | mButtonGravity & 0x70);
      mViewType = 2;
      mCollapseButtonView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      mCollapseButtonView.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          collapseActionView();
        }
      });
    }
  }
  
  public LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams(-2, -2);
  }
  
  public LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LayoutParams)) {
      return new LayoutParams((LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ActionBar.LayoutParams)) {
      return new LayoutParams((ActionBar.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  @Nullable
  public CharSequence getCollapseContentDescription()
  {
    Object localObject = mCollapseButtonView;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  @Nullable
  public Drawable getCollapseIcon()
  {
    Object localObject = mCollapseButtonView;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public int getContentInsetEnd()
  {
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    int i;
    if (localRtlSpacingHelper != null) {
      i = localRtlSpacingHelper.getEnd();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetEndWithActions()
  {
    int i = mContentInsetEndWithActions;
    if (i == Integer.MIN_VALUE) {
      i = getContentInsetEnd();
    }
    return i;
  }
  
  public int getContentInsetLeft()
  {
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    int i;
    if (localRtlSpacingHelper != null) {
      i = localRtlSpacingHelper.getLeft();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetRight()
  {
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    int i;
    if (localRtlSpacingHelper != null) {
      i = localRtlSpacingHelper.getRight();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetStart()
  {
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    int i;
    if (localRtlSpacingHelper != null) {
      i = localRtlSpacingHelper.getStart();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getContentInsetStartWithNavigation()
  {
    int i = mContentInsetStartWithNavigation;
    if (i == Integer.MIN_VALUE) {
      i = getContentInsetStart();
    }
    return i;
  }
  
  public int getCurrentContentInsetEnd()
  {
    Object localObject = mMenuView;
    if (localObject != null)
    {
      localObject = ((ActionMenuView)localObject).peekMenu();
      if ((localObject != null) && (((MenuBuilder)localObject).hasVisibleItems()))
      {
        i = 1;
        break label32;
      }
    }
    int i = 0;
    label32:
    if (i != 0) {
      i = Math.max(getContentInsetEnd(), Math.max(mContentInsetEndWithActions, 0));
    } else {
      i = getContentInsetEnd();
    }
    return i;
  }
  
  public int getCurrentContentInsetLeft()
  {
    int i;
    if (ViewCompat.getLayoutDirection(this) == 1) {
      i = getCurrentContentInsetEnd();
    } else {
      i = getCurrentContentInsetStart();
    }
    return i;
  }
  
  public int getCurrentContentInsetRight()
  {
    int i;
    if (ViewCompat.getLayoutDirection(this) == 1) {
      i = getCurrentContentInsetStart();
    } else {
      i = getCurrentContentInsetEnd();
    }
    return i;
  }
  
  public int getCurrentContentInsetStart()
  {
    int i;
    if (getNavigationIcon() != null) {
      i = Math.max(getContentInsetStart(), Math.max(mContentInsetStartWithNavigation, 0));
    } else {
      i = getContentInsetStart();
    }
    return i;
  }
  
  public Drawable getLogo()
  {
    Object localObject = mLogoView;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public CharSequence getLogoDescription()
  {
    Object localObject = mLogoView;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Menu getMenu()
  {
    ensureMenu();
    return mMenuView.getMenu();
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public View getNavButtonView()
  {
    return mNavButtonView;
  }
  
  @Nullable
  public CharSequence getNavigationContentDescription()
  {
    Object localObject = mNavButtonView;
    if (localObject != null) {
      localObject = ((View)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  @Nullable
  public Drawable getNavigationIcon()
  {
    Object localObject = mNavButtonView;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public ActionMenuPresenter getOuterActionMenuPresenter()
  {
    return mOuterActionMenuPresenter;
  }
  
  @Nullable
  public Drawable getOverflowIcon()
  {
    ensureMenu();
    return mMenuView.getOverflowIcon();
  }
  
  Context getPopupContext()
  {
    return mPopupContext;
  }
  
  @StyleRes
  public int getPopupTheme()
  {
    return mPopupTheme;
  }
  
  public CharSequence getSubtitle()
  {
    return mSubtitleText;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public final TextView getSubtitleTextView()
  {
    return mSubtitleTextView;
  }
  
  public CharSequence getTitle()
  {
    return mTitleText;
  }
  
  public int getTitleMarginBottom()
  {
    return mTitleMarginBottom;
  }
  
  public int getTitleMarginEnd()
  {
    return mTitleMarginEnd;
  }
  
  public int getTitleMarginStart()
  {
    return mTitleMarginStart;
  }
  
  public int getTitleMarginTop()
  {
    return mTitleMarginTop;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
  public final TextView getTitleTextView()
  {
    return mTitleTextView;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public DecorToolbar getWrapper()
  {
    if (mWrapper == null) {
      mWrapper = new ToolbarWidgetWrapper(this, true);
    }
    return mWrapper;
  }
  
  public boolean hasExpandedActionView()
  {
    ExpandedActionViewMenuPresenter localExpandedActionViewMenuPresenter = mExpandedMenuPresenter;
    boolean bool;
    if ((localExpandedActionViewMenuPresenter != null) && (mCurrentExpandedItem != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hideOverflowMenu()
  {
    ActionMenuView localActionMenuView = mMenuView;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.hideOverflowMenu())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void inflateMenu(@MenuRes int paramInt)
  {
    getMenuInflater().inflate(paramInt, getMenu());
  }
  
  @MainThread
  public void invalidateMenu()
  {
    Iterator localIterator = mProvidedMenuItems.iterator();
    while (localIterator.hasNext())
    {
      MenuItem localMenuItem = (MenuItem)localIterator.next();
      getMenu().removeItem(localMenuItem.getItemId());
    }
    onCreateMenu();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuView localActionMenuView = mMenuView;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.isOverflowMenuShowPending())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuView localActionMenuView = mMenuView;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.isOverflowMenuShowing())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean isTitleTruncated()
  {
    Object localObject = mTitleTextView;
    if (localObject == null) {
      return false;
    }
    localObject = ((TextView)localObject).getLayout();
    if (localObject == null) {
      return false;
    }
    int i = ((Layout)localObject).getLineCount();
    for (int j = 0; j < i; j++) {
      if (((Layout)localObject).getEllipsisCount(j) > 0) {
        return true;
      }
    }
    return false;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(mShowOverflowMenuRunnable);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9) {
      mEatingHover = false;
    }
    if (!mEatingHover)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        mEatingHover = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      mEatingHover = false;
    }
    return true;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (ViewCompat.getLayoutDirection(this) == 1) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getWidth();
    int k = getHeight();
    int m = getPaddingLeft();
    int n = getPaddingRight();
    int i1 = getPaddingTop();
    int i2 = getPaddingBottom();
    int i3 = j - n;
    int[] arrayOfInt = mTempMargins;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    paramInt1 = ViewCompat.getMinimumHeight(this);
    if (paramInt1 >= 0) {
      paramInt4 = Math.min(paramInt1, paramInt4 - paramInt2);
    } else {
      paramInt4 = 0;
    }
    if (shouldLayout(mNavButtonView))
    {
      if (i != 0)
      {
        paramInt3 = layoutChildRight(mNavButtonView, i3, arrayOfInt, paramInt4);
        i4 = m;
        break label167;
      }
      i4 = layoutChildLeft(mNavButtonView, m, arrayOfInt, paramInt4);
    }
    else
    {
      i4 = m;
    }
    paramInt3 = i3;
    label167:
    paramInt2 = i4;
    paramInt1 = paramInt3;
    if (shouldLayout(mCollapseButtonView)) {
      if (i != 0)
      {
        paramInt1 = layoutChildRight(mCollapseButtonView, paramInt3, arrayOfInt, paramInt4);
        paramInt2 = i4;
      }
      else
      {
        paramInt2 = layoutChildLeft(mCollapseButtonView, i4, arrayOfInt, paramInt4);
        paramInt1 = paramInt3;
      }
    }
    int i4 = paramInt2;
    paramInt3 = paramInt1;
    if (shouldLayout(mMenuView)) {
      if (i != 0)
      {
        i4 = layoutChildLeft(mMenuView, paramInt2, arrayOfInt, paramInt4);
        paramInt3 = paramInt1;
      }
      else
      {
        paramInt3 = layoutChildRight(mMenuView, paramInt1, arrayOfInt, paramInt4);
        i4 = paramInt2;
      }
    }
    paramInt2 = getCurrentContentInsetLeft();
    paramInt1 = getCurrentContentInsetRight();
    arrayOfInt[0] = Math.max(0, paramInt2 - i4);
    arrayOfInt[1] = Math.max(0, paramInt1 - (i3 - paramInt3));
    paramInt2 = Math.max(i4, paramInt2);
    paramInt3 = Math.min(paramInt3, i3 - paramInt1);
    paramInt1 = paramInt2;
    i4 = paramInt3;
    if (shouldLayout(mExpandedActionView)) {
      if (i != 0)
      {
        i4 = layoutChildRight(mExpandedActionView, paramInt3, arrayOfInt, paramInt4);
        paramInt1 = paramInt2;
      }
      else
      {
        paramInt1 = layoutChildLeft(mExpandedActionView, paramInt2, arrayOfInt, paramInt4);
        i4 = paramInt3;
      }
    }
    paramInt3 = paramInt1;
    paramInt2 = i4;
    if (shouldLayout(mLogoView)) {
      if (i != 0)
      {
        paramInt2 = layoutChildRight(mLogoView, i4, arrayOfInt, paramInt4);
        paramInt3 = paramInt1;
      }
      else
      {
        paramInt3 = layoutChildLeft(mLogoView, paramInt1, arrayOfInt, paramInt4);
        paramInt2 = i4;
      }
    }
    paramBoolean = shouldLayout(mTitleTextView);
    boolean bool = shouldLayout(mSubtitleTextView);
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = (LayoutParams)mTitleTextView.getLayoutParams();
      paramInt1 = topMargin;
      paramInt1 = mTitleTextView.getMeasuredHeight() + paramInt1 + bottomMargin + 0;
    }
    else
    {
      paramInt1 = 0;
    }
    if (bool)
    {
      localObject1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
      i4 = topMargin;
      paramInt1 += mSubtitleTextView.getMeasuredHeight() + i4 + bottomMargin;
    }
    if ((!paramBoolean) && (!bool)) {}
    for (paramInt1 = paramInt3;; paramInt1 = paramInt3)
    {
      paramInt3 = paramInt2;
      break label1315;
      if (paramBoolean) {
        localObject1 = mTitleTextView;
      } else {
        localObject1 = mSubtitleTextView;
      }
      if (bool) {
        localObject2 = mSubtitleTextView;
      } else {
        localObject2 = mTitleTextView;
      }
      localObject1 = (LayoutParams)((View)localObject1).getLayoutParams();
      Object localObject2 = (LayoutParams)((View)localObject2).getLayoutParams();
      if (((paramBoolean) && (mTitleTextView.getMeasuredWidth() > 0)) || ((bool) && (mSubtitleTextView.getMeasuredWidth() > 0))) {
        i4 = 1;
      } else {
        i4 = 0;
      }
      i3 = mGravity & 0x70;
      if (i3 != 48)
      {
        if (i3 != 80)
        {
          i3 = (k - i1 - i2 - paramInt1) / 2;
          int i5 = topMargin;
          int i6 = mTitleMarginTop;
          if (i3 < i5 + i6)
          {
            paramInt1 = i5 + i6;
          }
          else
          {
            k = k - i2 - paramInt1 - i3 - i1;
            i5 = bottomMargin;
            i2 = mTitleMarginBottom;
            paramInt1 = i3;
            if (k < i5 + i2) {
              paramInt1 = Math.max(0, i3 - (bottomMargin + i2 - k));
            }
          }
          paramInt1 = i1 + paramInt1;
        }
        else
        {
          paramInt1 = k - i2 - bottomMargin - mTitleMarginBottom - paramInt1;
        }
      }
      else {
        paramInt1 = getPaddingTop() + topMargin + mTitleMarginTop;
      }
      if (i == 0) {
        break;
      }
      if (i4 != 0) {
        i = mTitleMarginStart;
      } else {
        i = 0;
      }
      i -= arrayOfInt[1];
      paramInt2 -= Math.max(0, i);
      arrayOfInt[1] = Math.max(0, -i);
      if (paramBoolean)
      {
        localObject1 = (LayoutParams)mTitleTextView.getLayoutParams();
        i3 = paramInt2 - mTitleTextView.getMeasuredWidth();
        i = mTitleTextView.getMeasuredHeight() + paramInt1;
        mTitleTextView.layout(i3, paramInt1, paramInt2, i);
        paramInt1 = i3 - mTitleMarginEnd;
        i += bottomMargin;
      }
      else
      {
        i3 = paramInt2;
        i = paramInt1;
        paramInt1 = i3;
      }
      if (bool)
      {
        i += mSubtitleTextView.getLayoutParams()).topMargin;
        i1 = mSubtitleTextView.getMeasuredWidth();
        i3 = mSubtitleTextView.getMeasuredHeight();
        mSubtitleTextView.layout(paramInt2 - i1, i, paramInt2, i3 + i);
        i = paramInt2 - mTitleMarginEnd;
      }
      else
      {
        i = paramInt2;
      }
      if (i4 != 0) {
        paramInt2 = Math.min(paramInt1, i);
      }
    }
    if (i4 != 0) {
      i = mTitleMarginStart;
    } else {
      i = 0;
    }
    i -= arrayOfInt[0];
    paramInt3 = Math.max(0, i) + paramInt3;
    arrayOfInt[0] = Math.max(0, -i);
    if (paramBoolean)
    {
      localObject1 = (LayoutParams)mTitleTextView.getLayoutParams();
      i = mTitleTextView.getMeasuredWidth() + paramInt3;
      i3 = mTitleTextView.getMeasuredHeight() + paramInt1;
      mTitleTextView.layout(paramInt3, paramInt1, i, i3);
      i += mTitleMarginEnd;
      paramInt1 = i3 + bottomMargin;
    }
    else
    {
      i = paramInt3;
    }
    if (bool)
    {
      paramInt1 += mSubtitleTextView.getLayoutParams()).topMargin;
      i3 = mSubtitleTextView.getMeasuredWidth() + paramInt3;
      i1 = mSubtitleTextView.getMeasuredHeight();
      mSubtitleTextView.layout(paramInt3, paramInt1, i3, i1 + paramInt1);
      i3 += mTitleMarginEnd;
    }
    else
    {
      i3 = paramInt3;
    }
    paramInt1 = paramInt3;
    paramInt3 = paramInt2;
    if (i4 != 0)
    {
      paramInt1 = Math.max(i, i3);
      paramInt3 = paramInt2;
    }
    label1315:
    i4 = m;
    m = 0;
    addCustomViewsWithGravity(mTempViews, 3);
    int i = mTempViews.size();
    for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
      paramInt1 = layoutChildLeft((View)mTempViews.get(paramInt2), paramInt1, arrayOfInt, paramInt4);
    }
    addCustomViewsWithGravity(mTempViews, 5);
    i = mTempViews.size();
    for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
      paramInt3 = layoutChildRight((View)mTempViews.get(paramInt2), paramInt3, arrayOfInt, paramInt4);
    }
    addCustomViewsWithGravity(mTempViews, 1);
    i = getViewListMeasuredWidth(mTempViews, arrayOfInt);
    paramInt2 = (j - i4 - n) / 2 + i4 - i / 2;
    i4 = i + paramInt2;
    if (paramInt2 >= paramInt1) {
      if (i4 > paramInt3) {
        paramInt1 = paramInt2 - (i4 - paramInt3);
      } else {
        paramInt1 = paramInt2;
      }
    }
    paramInt3 = mTempViews.size();
    paramInt2 = paramInt1;
    for (paramInt1 = m; paramInt1 < paramInt3; paramInt1++) {
      paramInt2 = layoutChildLeft((View)mTempViews.get(paramInt1), paramInt2, arrayOfInt, paramInt4);
    }
    mTempViews.clear();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = mTempMargins;
    boolean bool = ViewUtils.isLayoutRtl(this);
    int j = 0;
    if (shouldLayout(mNavButtonView))
    {
      measureChildConstrained(mNavButtonView, paramInt1, 0, paramInt2, 0, mMaxButtonHeight);
      k = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(mNavButtonView);
      m = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(mNavButtonView));
      n = View.combineMeasuredStates(0, mNavButtonView.getMeasuredState());
    }
    else
    {
      k = 0;
      m = k;
      n = m;
    }
    int i1 = k;
    int i2 = m;
    int k = n;
    if (shouldLayout(mCollapseButtonView))
    {
      measureChildConstrained(mCollapseButtonView, paramInt1, 0, paramInt2, 0, mMaxButtonHeight);
      i1 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(mCollapseButtonView);
      i2 = Math.max(m, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(mCollapseButtonView));
      k = View.combineMeasuredStates(n, mCollapseButtonView.getMeasuredState());
    }
    int n = getCurrentContentInsetStart();
    int m = Math.max(n, i1) + 0;
    arrayOfInt[bool] = Math.max(0, n - i1);
    if (shouldLayout(mMenuView))
    {
      measureChildConstrained(mMenuView, paramInt1, m, paramInt2, 0, mMaxButtonHeight);
      n = mMenuView.getMeasuredWidth() + getHorizontalMargins(mMenuView);
      i2 = Math.max(i2, mMenuView.getMeasuredHeight() + getVerticalMargins(mMenuView));
      k = View.combineMeasuredStates(k, mMenuView.getMeasuredState());
    }
    else
    {
      n = 0;
    }
    i1 = getCurrentContentInsetEnd();
    m = Math.max(i1, n) + m;
    arrayOfInt[(bool ^ true)] = Math.max(0, i1 - n);
    bool = m;
    i1 = i2;
    n = k;
    if (shouldLayout(mExpandedActionView))
    {
      i = m + measureChildCollapseMargins(mExpandedActionView, paramInt1, m, paramInt2, 0, arrayOfInt);
      i1 = Math.max(i2, mExpandedActionView.getMeasuredHeight() + getVerticalMargins(mExpandedActionView));
      n = View.combineMeasuredStates(k, mExpandedActionView.getMeasuredState());
    }
    m = i;
    i2 = i1;
    k = n;
    if (shouldLayout(mLogoView))
    {
      m = i + measureChildCollapseMargins(mLogoView, paramInt1, i, paramInt2, 0, arrayOfInt);
      i2 = Math.max(i1, mLogoView.getMeasuredHeight() + getVerticalMargins(mLogoView));
      k = View.combineMeasuredStates(n, mLogoView.getMeasuredState());
    }
    int i3 = getChildCount();
    n = 0;
    i1 = i2;
    while (n < i3)
    {
      View localView = getChildAt(n);
      i4 = m;
      i = i1;
      i2 = k;
      if (getLayoutParamsmViewType == 0) {
        if (!shouldLayout(localView))
        {
          i4 = m;
          i = i1;
          i2 = k;
        }
        else
        {
          i4 = m + measureChildCollapseMargins(localView, paramInt1, m, paramInt2, 0, arrayOfInt);
          i = Math.max(i1, localView.getMeasuredHeight() + getVerticalMargins(localView));
          i2 = View.combineMeasuredStates(k, localView.getMeasuredState());
        }
      }
      n++;
      m = i4;
      i1 = i;
      k = i2;
    }
    int i = mTitleMarginTop + mTitleMarginBottom;
    int i4 = mTitleMarginStart + mTitleMarginEnd;
    if (shouldLayout(mTitleTextView))
    {
      measureChildCollapseMargins(mTitleTextView, paramInt1, m + i4, paramInt2, i, arrayOfInt);
      i3 = mTitleTextView.getMeasuredWidth();
      i2 = getHorizontalMargins(mTitleTextView);
      int i5 = mTitleTextView.getMeasuredHeight();
      n = getVerticalMargins(mTitleTextView);
      k = View.combineMeasuredStates(k, mTitleTextView.getMeasuredState());
      n = i5 + n;
      i2 = i3 + i2;
    }
    else
    {
      n = 0;
      i2 = n;
    }
    if (shouldLayout(mSubtitleTextView))
    {
      i2 = Math.max(i2, measureChildCollapseMargins(mSubtitleTextView, paramInt1, m + i4, paramInt2, n + i, arrayOfInt));
      n += mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(mSubtitleTextView);
      k = View.combineMeasuredStates(k, mSubtitleTextView.getMeasuredState());
    }
    i1 = Math.max(i1, n);
    i3 = getPaddingLeft();
    i4 = getPaddingRight();
    n = getPaddingTop();
    i = getPaddingBottom();
    i2 = View.resolveSizeAndState(Math.max(i4 + i3 + (m + i2), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & k);
    paramInt1 = View.resolveSizeAndState(Math.max(i + n + i1, getSuggestedMinimumHeight()), paramInt2, k << 16);
    if (shouldCollapse()) {
      paramInt1 = j;
    }
    setMeasuredDimension(i2, paramInt1);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    paramParcelable = mMenuView;
    if (paramParcelable != null) {
      paramParcelable = paramParcelable.peekMenu();
    } else {
      paramParcelable = null;
    }
    int i = expandedMenuItemId;
    if ((i != 0) && (mExpandedMenuPresenter != null) && (paramParcelable != null))
    {
      paramParcelable = paramParcelable.findItem(i);
      if (paramParcelable != null) {
        paramParcelable.expandActionView();
      }
    }
    if (isOverflowOpen) {
      postShowOverflowMenu();
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    ensureContentInsets();
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    boolean bool = true;
    if (paramInt != 1) {
      bool = false;
    }
    localRtlSpacingHelper.setDirection(bool);
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    Object localObject = mExpandedMenuPresenter;
    if (localObject != null)
    {
      localObject = mCurrentExpandedItem;
      if (localObject != null) {
        expandedMenuItemId = ((MenuItemImpl)localObject).getItemId();
      }
    }
    isOverflowOpen = isOverflowMenuShowing();
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      mEatingTouch = false;
    }
    if (!mEatingTouch)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        mEatingTouch = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      mEatingTouch = false;
    }
    return true;
  }
  
  public void removeChildrenForExpandedActionView()
  {
    for (int i = getChildCount() - 1; i >= 0; i--)
    {
      View localView = getChildAt(i);
      if ((getLayoutParamsmViewType != 2) && (localView != mMenuView))
      {
        removeViewAt(i);
        mHiddenViews.add(localView);
      }
    }
  }
  
  @MainThread
  public void removeMenuProvider(@NonNull MenuProvider paramMenuProvider)
  {
    mMenuHostHelper.removeMenuProvider(paramMenuProvider);
  }
  
  public void setCollapseContentDescription(@StringRes int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0) {
      localCharSequence = getContext().getText(paramInt);
    } else {
      localCharSequence = null;
    }
    setCollapseContentDescription(localCharSequence);
  }
  
  public void setCollapseContentDescription(@Nullable CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      ensureCollapseButtonView();
    }
    ImageButton localImageButton = mCollapseButtonView;
    if (localImageButton != null) {
      localImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setCollapseIcon(@DrawableRes int paramInt)
  {
    setCollapseIcon(AppCompatResources.getDrawable(getContext(), paramInt));
  }
  
  public void setCollapseIcon(@Nullable Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ensureCollapseButtonView();
      mCollapseButtonView.setImageDrawable(paramDrawable);
    }
    else
    {
      paramDrawable = mCollapseButtonView;
      if (paramDrawable != null) {
        paramDrawable.setImageDrawable(mCollapseIcon);
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setCollapsible(boolean paramBoolean)
  {
    mCollapsible = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = Integer.MIN_VALUE;
    }
    if (i != mContentInsetEndWithActions)
    {
      mContentInsetEndWithActions = i;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetStartWithNavigation(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = Integer.MIN_VALUE;
    }
    if (i != mContentInsetStartWithNavigation)
    {
      mContentInsetStartWithNavigation = i;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetsAbsolute(int paramInt1, int paramInt2)
  {
    ensureContentInsets();
    mContentInsets.setAbsolute(paramInt1, paramInt2);
  }
  
  public void setContentInsetsRelative(int paramInt1, int paramInt2)
  {
    ensureContentInsets();
    mContentInsets.setRelative(paramInt1, paramInt2);
  }
  
  public void setLogo(@DrawableRes int paramInt)
  {
    setLogo(AppCompatResources.getDrawable(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ensureLogoView();
      if (!isChildOrHidden(mLogoView)) {
        addSystemView(mLogoView, true);
      }
    }
    else
    {
      localImageView = mLogoView;
      if ((localImageView != null) && (isChildOrHidden(localImageView)))
      {
        removeView(mLogoView);
        mHiddenViews.remove(mLogoView);
      }
    }
    ImageView localImageView = mLogoView;
    if (localImageView != null) {
      localImageView.setImageDrawable(paramDrawable);
    }
  }
  
  public void setLogoDescription(@StringRes int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      ensureLogoView();
    }
    ImageView localImageView = mLogoView;
    if (localImageView != null) {
      localImageView.setContentDescription(paramCharSequence);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void setMenu(MenuBuilder paramMenuBuilder, ActionMenuPresenter paramActionMenuPresenter)
  {
    if ((paramMenuBuilder == null) && (mMenuView == null)) {
      return;
    }
    ensureMenuView();
    MenuBuilder localMenuBuilder = mMenuView.peekMenu();
    if (localMenuBuilder == paramMenuBuilder) {
      return;
    }
    if (localMenuBuilder != null)
    {
      localMenuBuilder.removeMenuPresenter(mOuterActionMenuPresenter);
      localMenuBuilder.removeMenuPresenter(mExpandedMenuPresenter);
    }
    if (mExpandedMenuPresenter == null) {
      mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
    }
    paramActionMenuPresenter.setExpandedActionViewsExclusive(true);
    if (paramMenuBuilder != null)
    {
      paramMenuBuilder.addMenuPresenter(paramActionMenuPresenter, mPopupContext);
      paramMenuBuilder.addMenuPresenter(mExpandedMenuPresenter, mPopupContext);
    }
    else
    {
      paramActionMenuPresenter.initForMenu(mPopupContext, null);
      mExpandedMenuPresenter.initForMenu(mPopupContext, null);
      paramActionMenuPresenter.updateMenuView(true);
      mExpandedMenuPresenter.updateMenuView(true);
    }
    mMenuView.setPopupTheme(mPopupTheme);
    mMenuView.setPresenter(paramActionMenuPresenter);
    mOuterActionMenuPresenter = paramActionMenuPresenter;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setMenuCallbacks(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    mActionMenuPresenterCallback = paramCallback;
    mMenuBuilderCallback = paramCallback1;
    ActionMenuView localActionMenuView = mMenuView;
    if (localActionMenuView != null) {
      localActionMenuView.setMenuCallbacks(paramCallback, paramCallback1);
    }
  }
  
  public void setNavigationContentDescription(@StringRes int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0) {
      localCharSequence = getContext().getText(paramInt);
    } else {
      localCharSequence = null;
    }
    setNavigationContentDescription(localCharSequence);
  }
  
  public void setNavigationContentDescription(@Nullable CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      ensureNavButtonView();
    }
    ImageButton localImageButton = mNavButtonView;
    if (localImageButton != null)
    {
      localImageButton.setContentDescription(paramCharSequence);
      TooltipCompat.setTooltipText(mNavButtonView, paramCharSequence);
    }
  }
  
  public void setNavigationIcon(@DrawableRes int paramInt)
  {
    setNavigationIcon(AppCompatResources.getDrawable(getContext(), paramInt));
  }
  
  public void setNavigationIcon(@Nullable Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ensureNavButtonView();
      if (!isChildOrHidden(mNavButtonView)) {
        addSystemView(mNavButtonView, true);
      }
    }
    else
    {
      localImageButton = mNavButtonView;
      if ((localImageButton != null) && (isChildOrHidden(localImageButton)))
      {
        removeView(mNavButtonView);
        mHiddenViews.remove(mNavButtonView);
      }
    }
    ImageButton localImageButton = mNavButtonView;
    if (localImageButton != null) {
      localImageButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    ensureNavButtonView();
    mNavButtonView.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    mOnMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void setOverflowIcon(@Nullable Drawable paramDrawable)
  {
    ensureMenu();
    mMenuView.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(@StyleRes int paramInt)
  {
    if (mPopupTheme != paramInt)
    {
      mPopupTheme = paramInt;
      if (paramInt == 0) {
        mPopupContext = getContext();
      } else {
        mPopupContext = new ContextThemeWrapper(getContext(), paramInt);
      }
    }
  }
  
  public void setSubtitle(@StringRes int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (mSubtitleTextView == null)
      {
        Context localContext = getContext();
        localObject = new AppCompatTextView(localContext);
        mSubtitleTextView = ((TextView)localObject);
        ((TextView)localObject).setSingleLine();
        mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i = mSubtitleTextAppearance;
        if (i != 0) {
          mSubtitleTextView.setTextAppearance(localContext, i);
        }
        localObject = mSubtitleTextColor;
        if (localObject != null) {
          mSubtitleTextView.setTextColor((ColorStateList)localObject);
        }
      }
      if (!isChildOrHidden(mSubtitleTextView)) {
        addSystemView(mSubtitleTextView, true);
      }
    }
    else
    {
      localObject = mSubtitleTextView;
      if ((localObject != null) && (isChildOrHidden((View)localObject)))
      {
        removeView(mSubtitleTextView);
        mHiddenViews.remove(mSubtitleTextView);
      }
    }
    Object localObject = mSubtitleTextView;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    mSubtitleText = paramCharSequence;
  }
  
  public void setSubtitleTextAppearance(Context paramContext, @StyleRes int paramInt)
  {
    mSubtitleTextAppearance = paramInt;
    TextView localTextView = mSubtitleTextView;
    if (localTextView != null) {
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public void setSubtitleTextColor(@ColorInt int paramInt)
  {
    setSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setSubtitleTextColor(@NonNull ColorStateList paramColorStateList)
  {
    mSubtitleTextColor = paramColorStateList;
    TextView localTextView = mSubtitleTextView;
    if (localTextView != null) {
      localTextView.setTextColor(paramColorStateList);
    }
  }
  
  public void setTitle(@StringRes int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (mTitleTextView == null)
      {
        localObject = getContext();
        AppCompatTextView localAppCompatTextView = new AppCompatTextView((Context)localObject);
        mTitleTextView = localAppCompatTextView;
        localAppCompatTextView.setSingleLine();
        mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i = mTitleTextAppearance;
        if (i != 0) {
          mTitleTextView.setTextAppearance((Context)localObject, i);
        }
        localObject = mTitleTextColor;
        if (localObject != null) {
          mTitleTextView.setTextColor((ColorStateList)localObject);
        }
      }
      if (!isChildOrHidden(mTitleTextView)) {
        addSystemView(mTitleTextView, true);
      }
    }
    else
    {
      localObject = mTitleTextView;
      if ((localObject != null) && (isChildOrHidden((View)localObject)))
      {
        removeView(mTitleTextView);
        mHiddenViews.remove(mTitleTextView);
      }
    }
    Object localObject = mTitleTextView;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    mTitleText = paramCharSequence;
  }
  
  public void setTitleMargin(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mTitleMarginStart = paramInt1;
    mTitleMarginTop = paramInt2;
    mTitleMarginEnd = paramInt3;
    mTitleMarginBottom = paramInt4;
    requestLayout();
  }
  
  public void setTitleMarginBottom(int paramInt)
  {
    mTitleMarginBottom = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt)
  {
    mTitleMarginEnd = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt)
  {
    mTitleMarginStart = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt)
  {
    mTitleMarginTop = paramInt;
    requestLayout();
  }
  
  public void setTitleTextAppearance(Context paramContext, @StyleRes int paramInt)
  {
    mTitleTextAppearance = paramInt;
    TextView localTextView = mTitleTextView;
    if (localTextView != null) {
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public void setTitleTextColor(@ColorInt int paramInt)
  {
    setTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setTitleTextColor(@NonNull ColorStateList paramColorStateList)
  {
    mTitleTextColor = paramColorStateList;
    TextView localTextView = mTitleTextView;
    if (localTextView != null) {
      localTextView.setTextColor(paramColorStateList);
    }
  }
  
  public boolean showOverflowMenu()
  {
    ActionMenuView localActionMenuView = mMenuView;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.showOverflowMenu())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public class ExpandedActionViewMenuPresenter
    implements MenuPresenter
  {
    public MenuItemImpl mCurrentExpandedItem;
    public MenuBuilder mMenu;
    
    public ExpandedActionViewMenuPresenter() {}
    
    public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
    {
      paramMenuBuilder = mExpandedActionView;
      if ((paramMenuBuilder instanceof CollapsibleActionView)) {
        ((CollapsibleActionView)paramMenuBuilder).onActionViewCollapsed();
      }
      paramMenuBuilder = Toolbar.this;
      paramMenuBuilder.removeView(mExpandedActionView);
      paramMenuBuilder = Toolbar.this;
      paramMenuBuilder.removeView(mCollapseButtonView);
      paramMenuBuilder = Toolbar.this;
      mExpandedActionView = null;
      paramMenuBuilder.addChildrenForExpandedActionView();
      mCurrentExpandedItem = null;
      requestLayout();
      paramMenuItemImpl.setActionViewExpanded(false);
      return true;
    }
    
    public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
    {
      ensureCollapseButtonView();
      Object localObject = mCollapseButtonView.getParent();
      paramMenuBuilder = Toolbar.this;
      if (localObject != paramMenuBuilder)
      {
        if ((localObject instanceof ViewGroup)) {
          ((ViewGroup)localObject).removeView(mCollapseButtonView);
        }
        paramMenuBuilder = Toolbar.this;
        paramMenuBuilder.addView(mCollapseButtonView);
      }
      mExpandedActionView = paramMenuItemImpl.getActionView();
      mCurrentExpandedItem = paramMenuItemImpl;
      paramMenuBuilder = mExpandedActionView.getParent();
      localObject = Toolbar.this;
      if (paramMenuBuilder != localObject)
      {
        if ((paramMenuBuilder instanceof ViewGroup)) {
          ((ViewGroup)paramMenuBuilder).removeView(mExpandedActionView);
        }
        paramMenuBuilder = generateDefaultLayoutParams();
        localObject = Toolbar.this;
        gravity = (0x800003 | mButtonGravity & 0x70);
        mViewType = 2;
        mExpandedActionView.setLayoutParams(paramMenuBuilder);
        paramMenuBuilder = Toolbar.this;
        paramMenuBuilder.addView(mExpandedActionView);
      }
      removeChildrenForExpandedActionView();
      requestLayout();
      paramMenuItemImpl.setActionViewExpanded(true);
      paramMenuBuilder = mExpandedActionView;
      if ((paramMenuBuilder instanceof CollapsibleActionView)) {
        ((CollapsibleActionView)paramMenuBuilder).onActionViewExpanded();
      }
      return true;
    }
    
    public boolean flagActionItems()
    {
      return false;
    }
    
    public int getId()
    {
      return 0;
    }
    
    public MenuView getMenuView(ViewGroup paramViewGroup)
    {
      return null;
    }
    
    public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
    {
      MenuBuilder localMenuBuilder = mMenu;
      if (localMenuBuilder != null)
      {
        paramContext = mCurrentExpandedItem;
        if (paramContext != null) {
          localMenuBuilder.collapseItemActionView(paramContext);
        }
      }
      mMenu = paramMenuBuilder;
    }
    
    public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
    
    public void onRestoreInstanceState(Parcelable paramParcelable) {}
    
    public Parcelable onSaveInstanceState()
    {
      return null;
    }
    
    public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
    {
      return false;
    }
    
    public void setCallback(MenuPresenter.Callback paramCallback) {}
    
    public void updateMenuView(boolean paramBoolean)
    {
      if (mCurrentExpandedItem != null)
      {
        MenuBuilder localMenuBuilder = mMenu;
        int i = 0;
        int j = i;
        if (localMenuBuilder != null)
        {
          int k = localMenuBuilder.size();
          for (int m = 0;; m++)
          {
            j = i;
            if (m >= k) {
              break;
            }
            if (mMenu.getItem(m) == mCurrentExpandedItem)
            {
              j = 1;
              break;
            }
          }
        }
        if (j == 0) {
          collapseItemActionView(mMenu, mCurrentExpandedItem);
        }
      }
    }
  }
  
  public static class LayoutParams
    extends ActionBar.LayoutParams
  {
    public static final int CUSTOM = 0;
    public static final int EXPANDED = 2;
    public static final int SYSTEM = 1;
    public int mViewType = 0;
    
    public LayoutParams(int paramInt)
    {
      this(-2, -1, paramInt);
    }
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      gravity = 8388627;
    }
    
    public LayoutParams(int paramInt1, int paramInt2, int paramInt3)
    {
      super(paramInt2);
      gravity = paramInt3;
    }
    
    public LayoutParams(@NonNull Context paramContext, AttributeSet paramAttributeSet)
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
      copyMarginsFromCompat(paramMarginLayoutParams);
    }
    
    public LayoutParams(ActionBar.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      mViewType = mViewType;
    }
    
    public void copyMarginsFromCompat(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      leftMargin = leftMargin;
      topMargin = topMargin;
      rightMargin = rightMargin;
      bottomMargin = bottomMargin;
    }
  }
  
  public static abstract interface OnMenuItemClickListener
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public Toolbar.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new Toolbar.SavedState(paramAnonymousParcel, null);
      }
      
      public Toolbar.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new Toolbar.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public Toolbar.SavedState[] newArray(int paramAnonymousInt)
      {
        return new Toolbar.SavedState[paramAnonymousInt];
      }
    };
    public int expandedMenuItemId;
    public boolean isOverflowOpen;
    
    public SavedState(Parcel paramParcel)
    {
      this(paramParcel, null);
    }
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      expandedMenuItemId = paramParcel.readInt();
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      isOverflowOpen = bool;
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(expandedMenuItemId);
      paramParcel.writeInt(isOverflowOpen);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */