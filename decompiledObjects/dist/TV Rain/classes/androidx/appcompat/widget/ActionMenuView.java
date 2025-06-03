package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder.ItemInvoker;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;

public class ActionMenuView
  extends LinearLayoutCompat
  implements MenuBuilder.ItemInvoker, MenuView
{
  public static final int GENERATED_ITEM_PADDING = 4;
  public static final int MIN_CELL_SIZE = 56;
  private static final String TAG = "ActionMenuView";
  private MenuPresenter.Callback mActionMenuPresenterCallback;
  private boolean mFormatItems;
  private int mFormatItemsWidth;
  private int mGeneratedItemPadding;
  private MenuBuilder mMenu;
  public MenuBuilder.Callback mMenuBuilderCallback;
  private int mMinCellSize;
  public OnMenuItemClickListener mOnMenuItemClickListener;
  private Context mPopupContext;
  private int mPopupTheme;
  private ActionMenuPresenter mPresenter;
  private boolean mReserveOverflow;
  
  public ActionMenuView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = getResourcesgetDisplayMetricsdensity;
    mMinCellSize = ((int)(56.0F * f));
    mGeneratedItemPadding = ((int)(f * 4.0F));
    mPopupContext = paramContext;
    mPopupTheme = 0;
  }
  
  public static int measureChildForCells(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    if ((paramView instanceof ActionMenuItemView)) {
      localActionMenuItemView = (ActionMenuItemView)paramView;
    } else {
      localActionMenuItemView = null;
    }
    boolean bool = true;
    if ((localActionMenuItemView != null) && (localActionMenuItemView.hasText())) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    }
    paramInt4 = 2;
    if ((paramInt2 > 0) && ((paramInt3 == 0) || (paramInt2 >= 2)))
    {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt2 * paramInt1, Integer.MIN_VALUE), i);
      int j = paramView.getMeasuredWidth();
      int k = j / paramInt1;
      paramInt2 = k;
      if (j % paramInt1 != 0) {
        paramInt2 = k + 1;
      }
      if ((paramInt3 != 0) && (paramInt2 < 2)) {
        paramInt2 = paramInt4;
      }
    }
    else
    {
      paramInt2 = 0;
    }
    if ((isOverflowButton) || (paramInt3 == 0)) {
      bool = false;
    }
    expandable = bool;
    cellsUsed = paramInt2;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, 1073741824), i);
    return paramInt2;
  }
  
  private void onMeasureExactFormat(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = getPaddingLeft();
    int m = getPaddingRight();
    int n = getPaddingTop();
    int i1 = getPaddingBottom() + n;
    int i2 = ViewGroup.getChildMeasureSpec(paramInt2, i1, -2);
    int i3 = j - (m + paramInt1);
    paramInt1 = mMinCellSize;
    int i4 = i3 / paramInt1;
    if (i4 == 0)
    {
      setMeasuredDimension(i3, 0);
      return;
    }
    int i5 = i3 % paramInt1 / i4 + paramInt1;
    int i6 = getChildCount();
    j = 0;
    paramInt1 = j;
    n = paramInt1;
    paramInt2 = n;
    m = paramInt2;
    int i7 = m;
    long l1 = 0L;
    int i8 = m;
    int i9 = paramInt2;
    int i10 = paramInt1;
    m = j;
    paramInt1 = i4;
    j = k;
    Object localObject1;
    Object localObject2;
    while (i10 < i6)
    {
      localObject1 = getChildAt(i10);
      if (((View)localObject1).getVisibility() == 8)
      {
        paramInt2 = i7;
      }
      else
      {
        boolean bool = localObject1 instanceof ActionMenuItemView;
        i9++;
        if (bool)
        {
          paramInt2 = mGeneratedItemPadding;
          ((View)localObject1).setPadding(paramInt2, 0, paramInt2, 0);
        }
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        expanded = false;
        extraPixels = 0;
        cellsUsed = 0;
        expandable = false;
        leftMargin = 0;
        rightMargin = 0;
        if ((bool) && (((ActionMenuItemView)localObject1).hasText())) {
          bool = true;
        } else {
          bool = false;
        }
        preventEdgeOffset = bool;
        if (isOverflowButton) {
          paramInt2 = 1;
        } else {
          paramInt2 = paramInt1;
        }
        k = measureChildForCells((View)localObject1, i5, paramInt2, i2, i1);
        i8 = Math.max(i8, k);
        paramInt2 = i7;
        if (expandable) {
          paramInt2 = i7 + 1;
        }
        if (isOverflowButton) {
          n = 1;
        }
        paramInt1 -= k;
        m = Math.max(m, ((View)localObject1).getMeasuredHeight());
        if (k == 1) {
          l1 |= 1 << i10;
        }
      }
      i10++;
      i7 = paramInt2;
    }
    if ((n != 0) && (i9 == 2)) {
      i10 = 1;
    } else {
      i10 = 0;
    }
    paramInt2 = 0;
    k = paramInt1;
    i4 = i10;
    i10 = i3;
    i1 = i;
    while ((i7 > 0) && (k > 0))
    {
      i = Integer.MAX_VALUE;
      int i11 = 0;
      i3 = 0;
      long l3;
      for (long l2 = 0L; i3 < i6; l2 = l3)
      {
        localObject1 = (LayoutParams)getChildAt(i3).getLayoutParams();
        int i12;
        if (!expandable)
        {
          paramInt1 = i11;
          i12 = i;
          l3 = l2;
        }
        else
        {
          int i13 = cellsUsed;
          if (i13 < i)
          {
            l3 = 1L << i3;
            i12 = i13;
            paramInt1 = 1;
          }
          else
          {
            paramInt1 = i11;
            i12 = i;
            l3 = l2;
            if (i13 == i)
            {
              paramInt1 = i11 + 1;
              l3 = l2 | 1L << i3;
              i12 = i;
            }
          }
        }
        i3++;
        i11 = paramInt1;
        i = i12;
      }
      paramInt1 = paramInt2;
      paramInt2 = m;
      l1 |= l2;
      if (i11 > k) {
        break label748;
      }
      for (paramInt1 = 0; paramInt1 < i6; paramInt1++)
      {
        localObject1 = getChildAt(paramInt1);
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        long l4 = 1 << paramInt1;
        if ((l2 & l4) == 0L)
        {
          l3 = l1;
          if (cellsUsed == i + 1) {
            l3 = l1 | l4;
          }
          l1 = l3;
        }
        else
        {
          if ((i4 != 0) && (preventEdgeOffset) && (k == 1))
          {
            m = mGeneratedItemPadding;
            ((View)localObject1).setPadding(m + i5, 0, m, 0);
          }
          cellsUsed += 1;
          expanded = true;
          k--;
        }
      }
      m = paramInt2;
      paramInt2 = 1;
    }
    paramInt1 = paramInt2;
    paramInt2 = m;
    label748:
    if ((n == 0) && (i9 == 1)) {
      m = 1;
    } else {
      m = 0;
    }
    if ((k > 0) && (l1 != 0L) && ((k < i9 - 1) || (m != 0) || (i8 > 1)))
    {
      float f1 = Long.bitCount(l1);
      if (m == 0)
      {
        float f2 = f1;
        if ((l1 & 1L) != 0L)
        {
          f2 = f1;
          if (!getChildAt0getLayoutParamspreventEdgeOffset) {
            f2 = f1 - 0.5F;
          }
        }
        m = i6 - 1;
        f1 = f2;
        if ((l1 & 1 << m) != 0L)
        {
          f1 = f2;
          if (!getChildAtgetLayoutParamspreventEdgeOffset) {
            f1 = f2 - 0.5F;
          }
        }
      }
      if (f1 > 0.0F) {
        n = (int)(k * i5 / f1);
      } else {
        n = 0;
      }
      i7 = 0;
      for (;;)
      {
        m = paramInt1;
        if (i7 >= i6) {
          break;
        }
        if ((l1 & 1 << i7) == 0L)
        {
          m = paramInt1;
        }
        else
        {
          localObject2 = getChildAt(i7);
          localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
          if ((localObject2 instanceof ActionMenuItemView))
          {
            extraPixels = n;
            expanded = true;
            if ((i7 == 0) && (!preventEdgeOffset)) {
              leftMargin = (-n / 2);
            }
            m = 1;
          }
          else if (isOverflowButton)
          {
            extraPixels = n;
            expanded = true;
            rightMargin = (-n / 2);
            m = 1;
          }
          else
          {
            if (i7 != 0) {
              leftMargin = (n / 2);
            }
            m = paramInt1;
            if (i7 != i6 - 1)
            {
              rightMargin = (n / 2);
              m = paramInt1;
            }
          }
        }
        i7++;
        paramInt1 = m;
      }
    }
    m = paramInt1;
    if (m != 0) {
      for (paramInt1 = 0; paramInt1 < i6; paramInt1++)
      {
        localObject2 = getChildAt(paramInt1);
        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
        if (expanded) {
          ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(cellsUsed * i5 + extraPixels, 1073741824), i2);
        }
      }
    }
    if (i1 == 1073741824) {
      paramInt2 = j;
    }
    setMeasuredDimension(i10, paramInt2);
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void dismissPopupMenus()
  {
    ActionMenuPresenter localActionMenuPresenter = mPresenter;
    if (localActionMenuPresenter != null) {
      localActionMenuPresenter.dismissPopupMenus();
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public LayoutParams generateDefaultLayoutParams()
  {
    LayoutParams localLayoutParams = new LayoutParams(-2, -2);
    gravity = 16;
    return localLayoutParams;
  }
  
  public LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      if ((paramLayoutParams instanceof LayoutParams)) {
        paramLayoutParams = new LayoutParams((LayoutParams)paramLayoutParams);
      } else {
        paramLayoutParams = new LayoutParams(paramLayoutParams);
      }
      if (gravity <= 0) {
        gravity = 16;
      }
      return paramLayoutParams;
    }
    return generateDefaultLayoutParams();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public LayoutParams generateOverflowButtonLayoutParams()
  {
    LayoutParams localLayoutParams = generateDefaultLayoutParams();
    isOverflowButton = true;
    return localLayoutParams;
  }
  
  public Menu getMenu()
  {
    if (mMenu == null)
    {
      Object localObject1 = getContext();
      Object localObject2 = new MenuBuilder((Context)localObject1);
      mMenu = ((MenuBuilder)localObject2);
      ((MenuBuilder)localObject2).setCallback(new MenuBuilderCallback());
      localObject2 = new ActionMenuPresenter((Context)localObject1);
      mPresenter = ((ActionMenuPresenter)localObject2);
      ((ActionMenuPresenter)localObject2).setReserveOverflow(true);
      localObject1 = mPresenter;
      localObject2 = mActionMenuPresenterCallback;
      if (localObject2 == null) {
        localObject2 = new ActionMenuPresenterCallback();
      }
      ((BaseMenuPresenter)localObject1).setCallback((MenuPresenter.Callback)localObject2);
      mMenu.addMenuPresenter(mPresenter, mPopupContext);
      mPresenter.setMenuView(this);
    }
    return mMenu;
  }
  
  @Nullable
  public Drawable getOverflowIcon()
  {
    getMenu();
    return mPresenter.getOverflowIcon();
  }
  
  public int getPopupTheme()
  {
    return mPopupTheme;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int getWindowAnimations()
  {
    return 0;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean hasSupportDividerBeforeChildAt(int paramInt)
  {
    boolean bool1 = false;
    if (paramInt == 0) {
      return false;
    }
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    boolean bool2 = bool1;
    if (paramInt < getChildCount())
    {
      bool2 = bool1;
      if ((localView1 instanceof ActionMenuChildView)) {
        bool2 = false | ((ActionMenuChildView)localView1).needsDividerAfter();
      }
    }
    bool1 = bool2;
    if (paramInt > 0)
    {
      bool1 = bool2;
      if ((localView2 instanceof ActionMenuChildView)) {
        bool1 = bool2 | ((ActionMenuChildView)localView2).needsDividerBefore();
      }
    }
    return bool1;
  }
  
  public boolean hideOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = mPresenter;
    boolean bool;
    if ((localActionMenuPresenter != null) && (localActionMenuPresenter.hideOverflowMenu())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void initialize(MenuBuilder paramMenuBuilder)
  {
    mMenu = paramMenuBuilder;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean invokeItem(MenuItemImpl paramMenuItemImpl)
  {
    return mMenu.performItemAction(paramMenuItemImpl, 0);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuPresenter localActionMenuPresenter = mPresenter;
    boolean bool;
    if ((localActionMenuPresenter != null) && (localActionMenuPresenter.isOverflowMenuShowPending())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter localActionMenuPresenter = mPresenter;
    boolean bool;
    if ((localActionMenuPresenter != null) && (localActionMenuPresenter.isOverflowMenuShowing())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean isOverflowReserved()
  {
    return mReserveOverflow;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = mPresenter;
    if (paramConfiguration != null)
    {
      paramConfiguration.updateMenuView(false);
      if (mPresenter.isOverflowMenuShowing())
      {
        mPresenter.hideOverflowMenu();
        mPresenter.showOverflowMenu();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    dismissPopupMenus();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!mFormatItems)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int k = getDividerWidth();
    int m = paramInt3 - paramInt1;
    paramInt1 = m - getPaddingRight() - getPaddingLeft();
    paramBoolean = ViewUtils.isLayoutRtl(this);
    paramInt2 = 0;
    paramInt4 = 0;
    paramInt3 = 0;
    Object localObject1;
    Object localObject2;
    int n;
    int i2;
    while (paramInt2 < i)
    {
      localObject1 = getChildAt(paramInt2);
      if (((View)localObject1).getVisibility() != 8)
      {
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        if (isOverflowButton)
        {
          n = ((View)localObject1).getMeasuredWidth();
          paramInt4 = n;
          if (hasSupportDividerBeforeChildAt(paramInt2)) {
            paramInt4 = n + k;
          }
          int i1 = ((View)localObject1).getMeasuredHeight();
          if (paramBoolean)
          {
            n = getPaddingLeft() + leftMargin;
            i2 = n + paramInt4;
          }
          else
          {
            i2 = getWidth() - getPaddingRight() - rightMargin;
            n = i2 - paramInt4;
          }
          int i3 = j - i1 / 2;
          ((View)localObject1).layout(n, i3, i2, i1 + i3);
          paramInt1 -= paramInt4;
          paramInt4 = 1;
        }
        else
        {
          paramInt1 -= ((View)localObject1).getMeasuredWidth() + leftMargin + rightMargin;
          hasSupportDividerBeforeChildAt(paramInt2);
          paramInt3++;
        }
      }
      paramInt2++;
    }
    if ((i == 1) && (paramInt4 == 0))
    {
      localObject1 = getChildAt(0);
      paramInt1 = ((View)localObject1).getMeasuredWidth();
      paramInt2 = ((View)localObject1).getMeasuredHeight();
      paramInt3 = m / 2 - paramInt1 / 2;
      paramInt4 = j - paramInt2 / 2;
      ((View)localObject1).layout(paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
      return;
    }
    paramInt2 = paramInt3 - (paramInt4 ^ 0x1);
    if (paramInt2 > 0) {
      paramInt1 /= paramInt2;
    } else {
      paramInt1 = 0;
    }
    paramInt4 = Math.max(0, paramInt1);
    if (paramBoolean)
    {
      paramInt2 = getWidth() - getPaddingRight();
      paramInt1 = 0;
      while (paramInt1 < i)
      {
        localObject2 = getChildAt(paramInt1);
        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
        paramInt3 = paramInt2;
        if (((View)localObject2).getVisibility() != 8) {
          if (isOverflowButton)
          {
            paramInt3 = paramInt2;
          }
          else
          {
            paramInt3 = paramInt2 - rightMargin;
            paramInt2 = ((View)localObject2).getMeasuredWidth();
            i2 = ((View)localObject2).getMeasuredHeight();
            n = j - i2 / 2;
            ((View)localObject2).layout(paramInt3 - paramInt2, n, paramInt3, i2 + n);
            paramInt3 -= paramInt2 + leftMargin + paramInt4;
          }
        }
        paramInt1++;
        paramInt2 = paramInt3;
      }
    }
    paramInt3 = getPaddingLeft();
    paramInt1 = 0;
    while (paramInt1 < i)
    {
      localObject2 = getChildAt(paramInt1);
      localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
      paramInt2 = paramInt3;
      if (((View)localObject2).getVisibility() != 8) {
        if (isOverflowButton)
        {
          paramInt2 = paramInt3;
        }
        else
        {
          n = paramInt3 + leftMargin;
          i2 = ((View)localObject2).getMeasuredWidth();
          paramInt2 = ((View)localObject2).getMeasuredHeight();
          paramInt3 = j - paramInt2 / 2;
          ((View)localObject2).layout(n, paramInt3, n + i2, paramInt2 + paramInt3);
          paramInt2 = i2 + rightMargin + paramInt4 + n;
        }
      }
      paramInt1++;
      paramInt3 = paramInt2;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = mFormatItems;
    boolean bool2;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    mFormatItems = bool2;
    if (bool1 != bool2) {
      mFormatItemsWidth = 0;
    }
    int i = View.MeasureSpec.getSize(paramInt1);
    Object localObject;
    if (mFormatItems)
    {
      localObject = mMenu;
      if ((localObject != null) && (i != mFormatItemsWidth))
      {
        mFormatItemsWidth = i;
        ((MenuBuilder)localObject).onItemsChanged(true);
      }
    }
    int j = getChildCount();
    if ((mFormatItems) && (j > 0))
    {
      onMeasureExactFormat(paramInt1, paramInt2);
    }
    else
    {
      for (i = 0; i < j; i++)
      {
        localObject = (LayoutParams)getChildAt(i).getLayoutParams();
        rightMargin = 0;
        leftMargin = 0;
      }
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public MenuBuilder peekMenu()
  {
    return mMenu;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    mPresenter.setExpandedActionViewsExclusive(paramBoolean);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setMenuCallbacks(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    mActionMenuPresenterCallback = paramCallback;
    mMenuBuilderCallback = paramCallback1;
  }
  
  public void setOnMenuItemClickListener(OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    mOnMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void setOverflowIcon(@Nullable Drawable paramDrawable)
  {
    getMenu();
    mPresenter.setOverflowIcon(paramDrawable);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setOverflowReserved(boolean paramBoolean)
  {
    mReserveOverflow = paramBoolean;
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
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void setPresenter(ActionMenuPresenter paramActionMenuPresenter)
  {
    mPresenter = paramActionMenuPresenter;
    paramActionMenuPresenter.setMenuView(this);
  }
  
  public boolean showOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = mPresenter;
    boolean bool;
    if ((localActionMenuPresenter != null) && (localActionMenuPresenter.showOverflowMenu())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static abstract interface ActionMenuChildView
  {
    public abstract boolean needsDividerAfter();
    
    public abstract boolean needsDividerBefore();
  }
  
  public static class ActionMenuPresenterCallback
    implements MenuPresenter.Callback
  {
    public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
    
    public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
    {
      return false;
    }
  }
  
  public static class LayoutParams
    extends LinearLayoutCompat.LayoutParams
  {
    @ViewDebug.ExportedProperty
    public int cellsUsed;
    @ViewDebug.ExportedProperty
    public boolean expandable;
    public boolean expanded;
    @ViewDebug.ExportedProperty
    public int extraPixels;
    @ViewDebug.ExportedProperty
    public boolean isOverflowButton;
    @ViewDebug.ExportedProperty
    public boolean preventEdgeOffset;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      isOverflowButton = false;
    }
    
    public LayoutParams(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      super(paramInt2);
      isOverflowButton = paramBoolean;
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      isOverflowButton = isOverflowButton;
    }
  }
  
  public class MenuBuilderCallback
    implements MenuBuilder.Callback
  {
    public MenuBuilderCallback() {}
    
    public boolean onMenuItemSelected(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
    {
      paramMenuBuilder = mOnMenuItemClickListener;
      boolean bool;
      if ((paramMenuBuilder != null) && (paramMenuBuilder.onMenuItemClick(paramMenuItem))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void onMenuModeChange(@NonNull MenuBuilder paramMenuBuilder)
    {
      MenuBuilder.Callback localCallback = mMenuBuilderCallback;
      if (localCallback != null) {
        localCallback.onMenuModeChange(paramMenuBuilder);
      }
    }
  }
  
  public static abstract interface OnMenuItemClickListener
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */