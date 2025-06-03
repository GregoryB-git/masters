package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.layout;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import androidx.core.view.ActionProvider.SubUiVisibilityListener;
import java.util.ArrayList;

class ActionMenuPresenter
  extends BaseMenuPresenter
  implements ActionProvider.SubUiVisibilityListener
{
  private static final String TAG = "ActionMenuPresenter";
  private final SparseBooleanArray mActionButtonGroups = new SparseBooleanArray();
  public ActionButtonSubmenu mActionButtonPopup;
  private int mActionItemWidthLimit;
  private boolean mExpandedActionViewsExclusive;
  private int mMaxItems;
  private boolean mMaxItemsSet;
  private int mMinCellSize;
  public int mOpenSubMenuId;
  public OverflowMenuButton mOverflowButton;
  public OverflowPopup mOverflowPopup;
  private Drawable mPendingOverflowIcon;
  private boolean mPendingOverflowIconSet;
  private ActionMenuPopupCallback mPopupCallback;
  public final PopupPresenterCallback mPopupPresenterCallback = new PopupPresenterCallback();
  public OpenOverflowRunnable mPostedOpenRunnable;
  private boolean mReserveOverflow;
  private boolean mReserveOverflowSet;
  private boolean mStrictWidthLimit;
  private int mWidthLimit;
  private boolean mWidthLimitSet;
  
  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
  }
  
  private View findViewForItem(MenuItem paramMenuItem)
  {
    ViewGroup localViewGroup = (ViewGroup)mMenuView;
    if (localViewGroup == null) {
      return null;
    }
    int i = localViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = localViewGroup.getChildAt(j);
      if (((localView instanceof MenuView.ItemView)) && (((MenuView.ItemView)localView).getItemData() == paramMenuItem)) {
        return localView;
      }
    }
    return null;
  }
  
  public void bindItemView(MenuItemImpl paramMenuItemImpl, MenuView.ItemView paramItemView)
  {
    paramItemView.initialize(paramMenuItemImpl, 0);
    paramMenuItemImpl = (ActionMenuView)mMenuView;
    paramItemView = (ActionMenuItemView)paramItemView;
    paramItemView.setItemInvoker(paramMenuItemImpl);
    if (mPopupCallback == null) {
      mPopupCallback = new ActionMenuPopupCallback();
    }
    paramItemView.setPopupCallback(mPopupCallback);
  }
  
  public boolean dismissPopupMenus()
  {
    return hideOverflowMenu() | hideSubMenus();
  }
  
  public boolean filterLeftoverView(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == mOverflowButton) {
      return false;
    }
    return super.filterLeftoverView(paramViewGroup, paramInt);
  }
  
  public boolean flagActionItems()
  {
    Object localObject1 = this;
    Object localObject2 = mMenu;
    int i = 0;
    if (localObject2 != null)
    {
      localObject2 = ((MenuBuilder)localObject2).getVisibleItems();
      j = ((ArrayList)localObject2).size();
    }
    else
    {
      localObject2 = null;
      j = 0;
    }
    int k = mMaxItems;
    int m = mActionItemWidthLimit;
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)mMenuView;
    int i1 = 0;
    int i2 = i1;
    int i4 = i2;
    int i6 = i4;
    int i8 = i4;
    int i10 = i2;
    i4 = i1;
    int i11;
    for (i2 = k; i4 < j; i2 = i1)
    {
      localObject3 = (MenuItemImpl)((ArrayList)localObject2).get(i4);
      if (((MenuItemImpl)localObject3).requiresActionButton()) {
        i8++;
      } else if (((MenuItemImpl)localObject3).requestsActionButton()) {
        i6++;
      } else {
        i11 = 1;
      }
      i1 = i2;
      if (mExpandedActionViewsExclusive)
      {
        i1 = i2;
        if (((MenuItemImpl)localObject3).isActionViewExpanded()) {
          i1 = 0;
        }
      }
      i4++;
    }
    i4 = i2;
    int i5;
    if (mReserveOverflow) {
      if (i11 == 0)
      {
        i4 = i2;
        if (i6 + i8 <= i2) {}
      }
      else
      {
        i5 = i2 - 1;
      }
    }
    int i7 = i5 - i8;
    Object localObject3 = mActionButtonGroups;
    ((SparseBooleanArray)localObject3).clear();
    if (mStrictWidthLimit)
    {
      i3 = mMinCellSize;
      i5 = m / i3;
      k = m % i3 / i5 + i3;
    }
    else
    {
      i5 = 0;
      k = i5;
    }
    int i13 = 0;
    int i3 = i13;
    i8 = m;
    m = j;
    int j = i;
    for (;;)
    {
      localObject1 = this;
      if (i13 >= m) {
        break;
      }
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)((ArrayList)localObject2).get(i13);
      View localView;
      int i9;
      int i12;
      if (localMenuItemImpl.requiresActionButton())
      {
        localView = ((ActionMenuPresenter)localObject1).getItemView(localMenuItemImpl, null, localViewGroup);
        if (mStrictWidthLimit) {
          i5 -= ActionMenuView.measureChildForCells(localView, k, i5, n, j);
        } else {
          localView.measure(n, n);
        }
        i1 = localView.getMeasuredWidth();
        i8 -= i1;
        i11 = i3;
        if (i3 == 0) {
          i11 = i1;
        }
        i3 = localMenuItemImpl.getGroupId();
        if (i3 != 0) {
          ((SparseBooleanArray)localObject3).put(i3, true);
        }
        localMenuItemImpl.setIsActionButton(true);
        i3 = j;
      }
      else if (localMenuItemImpl.requestsActionButton())
      {
        i = localMenuItemImpl.getGroupId();
        boolean bool1 = ((SparseBooleanArray)localObject3).get(i);
        int i14;
        if (((i7 > 0) || (bool1)) && (i9 > 0) && ((!mStrictWidthLimit) || (i5 > 0))) {
          i14 = 1;
        } else {
          i14 = 0;
        }
        int i15 = i14;
        boolean bool2 = i14;
        i1 = i9;
        i11 = i5;
        j = i3;
        if (i14 != 0)
        {
          localView = ((ActionMenuPresenter)localObject1).getItemView(localMenuItemImpl, null, localViewGroup);
          if (mStrictWidthLimit)
          {
            i11 = ActionMenuView.measureChildForCells(localView, k, i5, n, 0);
            j = i5 - i11;
            i5 = j;
            if (i11 == 0)
            {
              i15 = 0;
              i5 = j;
            }
          }
          else
          {
            localView.measure(n, n);
          }
          i12 = localView.getMeasuredWidth();
          i1 = i9 - i12;
          j = i3;
          if (i3 == 0) {
            j = i12;
          }
          if (mStrictWidthLimit ? i1 >= 0 : i1 + j > 0) {
            i3 = 1;
          } else {
            i3 = 0;
          }
          bool2 = i15 & i3;
          i12 = i5;
        }
        if ((bool2) && (i != 0))
        {
          ((SparseBooleanArray)localObject3).put(i, true);
          i3 = i7;
        }
        else
        {
          i3 = i7;
          if (bool1)
          {
            ((SparseBooleanArray)localObject3).put(i, false);
            i5 = 0;
            for (;;)
            {
              i3 = i7;
              if (i5 >= i13) {
                break;
              }
              localObject1 = (MenuItemImpl)((ArrayList)localObject2).get(i5);
              i3 = i7;
              if (((MenuItemImpl)localObject1).getGroupId() == i)
              {
                i3 = i7;
                if (((MenuItemImpl)localObject1).isActionButton()) {
                  i3 = i7 + 1;
                }
                ((MenuItemImpl)localObject1).setIsActionButton(false);
              }
              i5++;
              i7 = i3;
            }
          }
        }
        i5 = i3;
        if (bool2) {
          i5 = i3 - 1;
        }
        localMenuItemImpl.setIsActionButton(bool2);
        i3 = 0;
        i7 = i5;
        i9 = i1;
        i5 = i12;
        i12 = j;
      }
      else
      {
        localMenuItemImpl.setIsActionButton(j);
        i12 = i3;
        i3 = j;
      }
      i13++;
      j = i3;
      i3 = i12;
    }
    return true;
  }
  
  public View getItemView(MenuItemImpl paramMenuItemImpl, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramMenuItemImpl.getActionView();
    if ((localView == null) || (paramMenuItemImpl.hasCollapsibleActionView())) {
      localView = super.getItemView(paramMenuItemImpl, paramView, paramViewGroup);
    }
    int i;
    if (paramMenuItemImpl.isActionViewExpanded()) {
      i = 8;
    } else {
      i = 0;
    }
    localView.setVisibility(i);
    paramView = (ActionMenuView)paramViewGroup;
    paramMenuItemImpl = localView.getLayoutParams();
    if (!paramView.checkLayoutParams(paramMenuItemImpl)) {
      localView.setLayoutParams(paramView.generateLayoutParams(paramMenuItemImpl));
    }
    return localView;
  }
  
  public MenuView getMenuView(ViewGroup paramViewGroup)
  {
    MenuView localMenuView = mMenuView;
    paramViewGroup = super.getMenuView(paramViewGroup);
    if (localMenuView != paramViewGroup) {
      ((ActionMenuView)paramViewGroup).setPresenter(this);
    }
    return paramViewGroup;
  }
  
  public Drawable getOverflowIcon()
  {
    OverflowMenuButton localOverflowMenuButton = mOverflowButton;
    if (localOverflowMenuButton != null) {
      return localOverflowMenuButton.getDrawable();
    }
    if (mPendingOverflowIconSet) {
      return mPendingOverflowIcon;
    }
    return null;
  }
  
  public boolean hideOverflowMenu()
  {
    OpenOverflowRunnable localOpenOverflowRunnable = mPostedOpenRunnable;
    if (localOpenOverflowRunnable != null)
    {
      localObject = mMenuView;
      if (localObject != null)
      {
        ((View)localObject).removeCallbacks(localOpenOverflowRunnable);
        mPostedOpenRunnable = null;
        return true;
      }
    }
    Object localObject = mOverflowPopup;
    if (localObject != null)
    {
      ((MenuPopupHelper)localObject).dismiss();
      return true;
    }
    return false;
  }
  
  public boolean hideSubMenus()
  {
    ActionButtonSubmenu localActionButtonSubmenu = mActionButtonPopup;
    if (localActionButtonSubmenu != null)
    {
      localActionButtonSubmenu.dismiss();
      return true;
    }
    return false;
  }
  
  public void initForMenu(@NonNull Context paramContext, @Nullable MenuBuilder paramMenuBuilder)
  {
    super.initForMenu(paramContext, paramMenuBuilder);
    paramMenuBuilder = paramContext.getResources();
    paramContext = ActionBarPolicy.get(paramContext);
    if (!mReserveOverflowSet) {
      mReserveOverflow = paramContext.showsOverflowMenuButton();
    }
    if (!mWidthLimitSet) {
      mWidthLimit = paramContext.getEmbeddedMenuWidthLimit();
    }
    if (!mMaxItemsSet) {
      mMaxItems = paramContext.getMaxActionButtons();
    }
    int i = mWidthLimit;
    if (mReserveOverflow)
    {
      if (mOverflowButton == null)
      {
        paramContext = new OverflowMenuButton(mSystemContext);
        mOverflowButton = paramContext;
        if (mPendingOverflowIconSet)
        {
          paramContext.setImageDrawable(mPendingOverflowIcon);
          mPendingOverflowIcon = null;
          mPendingOverflowIconSet = false;
        }
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        mOverflowButton.measure(j, j);
      }
      i -= mOverflowButton.getMeasuredWidth();
    }
    else
    {
      mOverflowButton = null;
    }
    mActionItemWidthLimit = i;
    mMinCellSize = ((int)(getDisplayMetricsdensity * 56.0F));
  }
  
  public boolean isOverflowMenuShowPending()
  {
    boolean bool;
    if ((mPostedOpenRunnable == null) && (!isOverflowMenuShowing())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isOverflowMenuShowing()
  {
    OverflowPopup localOverflowPopup = mOverflowPopup;
    boolean bool;
    if ((localOverflowPopup != null) && (localOverflowPopup.isShowing())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isOverflowReserved()
  {
    return mReserveOverflow;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    dismissPopupMenus();
    super.onCloseMenu(paramMenuBuilder, paramBoolean);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (!mMaxItemsSet) {
      mMaxItems = ActionBarPolicy.get(mContext).getMaxActionButtons();
    }
    paramConfiguration = mMenu;
    if (paramConfiguration != null) {
      paramConfiguration.onItemsChanged(true);
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {
      return;
    }
    int i = openSubMenuId;
    if (i > 0)
    {
      paramParcelable = mMenu.findItem(i);
      if (paramParcelable != null) {
        onSubMenuSelected((SubMenuBuilder)paramParcelable.getSubMenu());
      }
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState();
    openSubMenuId = mOpenSubMenuId;
    return localSavedState;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    boolean bool1 = paramSubMenuBuilder.hasVisibleItems();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    for (Object localObject = paramSubMenuBuilder; ((SubMenuBuilder)localObject).getParentMenu() != mMenu; localObject = (SubMenuBuilder)((SubMenuBuilder)localObject).getParentMenu()) {}
    localObject = findViewForItem(((SubMenuBuilder)localObject).getItem());
    if (localObject == null) {
      return false;
    }
    mOpenSubMenuId = paramSubMenuBuilder.getItem().getItemId();
    int i = paramSubMenuBuilder.size();
    for (int j = 0;; j++)
    {
      bool1 = bool2;
      if (j >= i) {
        break;
      }
      MenuItem localMenuItem = paramSubMenuBuilder.getItem(j);
      if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null))
      {
        bool1 = true;
        break;
      }
    }
    localObject = new ActionButtonSubmenu(mContext, paramSubMenuBuilder, (View)localObject);
    mActionButtonPopup = ((ActionButtonSubmenu)localObject);
    ((MenuPopupHelper)localObject).setForceShowIcon(bool1);
    mActionButtonPopup.show();
    super.onSubMenuSelected(paramSubMenuBuilder);
    return true;
  }
  
  public void onSubUiVisibilityChanged(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.onSubMenuSelected(null);
    }
    else
    {
      MenuBuilder localMenuBuilder = mMenu;
      if (localMenuBuilder != null) {
        localMenuBuilder.close(false);
      }
    }
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    mExpandedActionViewsExclusive = paramBoolean;
  }
  
  public void setItemLimit(int paramInt)
  {
    mMaxItems = paramInt;
    mMaxItemsSet = true;
  }
  
  public void setMenuView(ActionMenuView paramActionMenuView)
  {
    mMenuView = paramActionMenuView;
    paramActionMenuView.initialize(mMenu);
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    OverflowMenuButton localOverflowMenuButton = mOverflowButton;
    if (localOverflowMenuButton != null)
    {
      localOverflowMenuButton.setImageDrawable(paramDrawable);
    }
    else
    {
      mPendingOverflowIconSet = true;
      mPendingOverflowIcon = paramDrawable;
    }
  }
  
  public void setReserveOverflow(boolean paramBoolean)
  {
    mReserveOverflow = paramBoolean;
    mReserveOverflowSet = true;
  }
  
  public void setWidthLimit(int paramInt, boolean paramBoolean)
  {
    mWidthLimit = paramInt;
    mStrictWidthLimit = paramBoolean;
    mWidthLimitSet = true;
  }
  
  public boolean shouldIncludeItem(int paramInt, MenuItemImpl paramMenuItemImpl)
  {
    return paramMenuItemImpl.isActionButton();
  }
  
  public boolean showOverflowMenu()
  {
    if ((mReserveOverflow) && (!isOverflowMenuShowing()))
    {
      Object localObject = mMenu;
      if ((localObject != null) && (mMenuView != null) && (mPostedOpenRunnable == null) && (!((MenuBuilder)localObject).getNonActionItems().isEmpty()))
      {
        localObject = new OpenOverflowRunnable(new OverflowPopup(mContext, mMenu, mOverflowButton, true));
        mPostedOpenRunnable = ((OpenOverflowRunnable)localObject);
        ((View)mMenuView).post((Runnable)localObject);
        return true;
      }
    }
    return false;
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    super.updateMenuView(paramBoolean);
    ((View)mMenuView).requestLayout();
    Object localObject1 = mMenu;
    int i = 0;
    int j;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = ((MenuBuilder)localObject1).getActionItems();
      j = ((ArrayList)localObject1).size();
      for (k = 0; k < j; k++)
      {
        localObject2 = ((MenuItemImpl)((ArrayList)localObject1).get(k)).getSupportActionProvider();
        if (localObject2 != null) {
          ((ActionProvider)localObject2).setSubUiVisibilityListener(this);
        }
      }
    }
    localObject1 = mMenu;
    if (localObject1 != null) {
      localObject1 = ((MenuBuilder)localObject1).getNonActionItems();
    } else {
      localObject1 = null;
    }
    int k = i;
    boolean bool;
    if (mReserveOverflow)
    {
      k = i;
      if (localObject1 != null)
      {
        j = ((ArrayList)localObject1).size();
        if (j == 1)
        {
          bool = ((MenuItemImpl)((ArrayList)localObject1).get(0)).isActionViewExpanded() ^ true;
        }
        else
        {
          bool = i;
          if (j > 0) {
            bool = true;
          }
        }
      }
    }
    if (bool)
    {
      if (mOverflowButton == null) {
        mOverflowButton = new OverflowMenuButton(mSystemContext);
      }
      localObject1 = (ViewGroup)mOverflowButton.getParent();
      if (localObject1 != mMenuView)
      {
        if (localObject1 != null) {
          ((ViewGroup)localObject1).removeView(mOverflowButton);
        }
        localObject1 = (ActionMenuView)mMenuView;
        ((ViewGroup)localObject1).addView(mOverflowButton, ((ActionMenuView)localObject1).generateOverflowButtonLayoutParams());
      }
    }
    else
    {
      localObject1 = mOverflowButton;
      if (localObject1 != null)
      {
        localObject1 = ((View)localObject1).getParent();
        localObject2 = mMenuView;
        if (localObject1 == localObject2) {
          ((ViewGroup)localObject2).removeView(mOverflowButton);
        }
      }
    }
    ((ActionMenuView)mMenuView).setOverflowReserved(mReserveOverflow);
  }
  
  public class ActionButtonSubmenu
    extends MenuPopupHelper
  {
    public ActionButtonSubmenu(Context paramContext, SubMenuBuilder paramSubMenuBuilder, View paramView)
    {
      super(paramSubMenuBuilder, paramView, false, R.attr.actionOverflowMenuStyle);
      if (!((MenuItemImpl)paramSubMenuBuilder.getItem()).isActionButton())
      {
        paramSubMenuBuilder = mOverflowButton;
        paramContext = paramSubMenuBuilder;
        if (paramSubMenuBuilder == null) {
          paramContext = (View)ActionMenuPresenter.access$200(ActionMenuPresenter.this);
        }
        setAnchorView(paramContext);
      }
      setPresenterCallback(mPopupPresenterCallback);
    }
    
    public void onDismiss()
    {
      ActionMenuPresenter localActionMenuPresenter = ActionMenuPresenter.this;
      mActionButtonPopup = null;
      mOpenSubMenuId = 0;
      super.onDismiss();
    }
  }
  
  public class ActionMenuPopupCallback
    extends ActionMenuItemView.PopupCallback
  {
    public ActionMenuPopupCallback() {}
    
    public ShowableListMenu getPopup()
    {
      Object localObject = mActionButtonPopup;
      if (localObject != null) {
        localObject = ((MenuPopupHelper)localObject).getPopup();
      } else {
        localObject = null;
      }
      return (ShowableListMenu)localObject;
    }
  }
  
  public class OpenOverflowRunnable
    implements Runnable
  {
    private ActionMenuPresenter.OverflowPopup mPopup;
    
    public OpenOverflowRunnable(ActionMenuPresenter.OverflowPopup paramOverflowPopup)
    {
      mPopup = paramOverflowPopup;
    }
    
    public void run()
    {
      if (ActionMenuPresenter.access$400(ActionMenuPresenter.this) != null) {
        ActionMenuPresenter.access$500(ActionMenuPresenter.this).changeMenuMode();
      }
      View localView = (View)ActionMenuPresenter.access$600(ActionMenuPresenter.this);
      if ((localView != null) && (localView.getWindowToken() != null) && (mPopup.tryShow())) {
        mOverflowPopup = mPopup;
      }
      mPostedOpenRunnable = null;
    }
  }
  
  public class OverflowMenuButton
    extends AppCompatImageView
    implements ActionMenuView.ActionMenuChildView
  {
    public OverflowMenuButton(Context paramContext)
    {
      super(null, R.attr.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      TooltipCompat.setTooltipText(this, getContentDescription());
      setOnTouchListener(new ForwardingListener(this)
      {
        public ShowableListMenu getPopup()
        {
          ActionMenuPresenter.OverflowPopup localOverflowPopup = mOverflowPopup;
          if (localOverflowPopup == null) {
            return null;
          }
          return localOverflowPopup.getPopup();
        }
        
        public boolean onForwardingStarted()
        {
          showOverflowMenu();
          return true;
        }
        
        public boolean onForwardingStopped()
        {
          ActionMenuPresenter localActionMenuPresenter = ActionMenuPresenter.this;
          if (mPostedOpenRunnable != null) {
            return false;
          }
          localActionMenuPresenter.hideOverflowMenu();
          return true;
        }
      });
    }
    
    public boolean needsDividerAfter()
    {
      return false;
    }
    
    public boolean needsDividerBefore()
    {
      return false;
    }
    
    public boolean performClick()
    {
      if (super.performClick()) {
        return true;
      }
      playSoundEffect(0);
      showOverflowMenu();
      return true;
    }
    
    public boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        paramInt2 = getHeight();
        paramInt1 = Math.max(i, paramInt2) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        paramInt4 = getPaddingTop();
        paramInt3 = getPaddingBottom();
        k = (i + (j - k)) / 2;
        paramInt2 = (paramInt2 + (paramInt4 - paramInt3)) / 2;
        DrawableCompat.setHotspotBounds(localDrawable2, k - paramInt1, paramInt2 - paramInt1, k + paramInt1, paramInt2 + paramInt1);
      }
      return bool;
    }
  }
  
  public class OverflowPopup
    extends MenuPopupHelper
  {
    public OverflowPopup(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, boolean paramBoolean)
    {
      super(paramMenuBuilder, paramView, paramBoolean, R.attr.actionOverflowMenuStyle);
      setGravity(8388613);
      setPresenterCallback(mPopupPresenterCallback);
    }
    
    public void onDismiss()
    {
      if (ActionMenuPresenter.access$000(ActionMenuPresenter.this) != null) {
        ActionMenuPresenter.access$100(ActionMenuPresenter.this).close();
      }
      mOverflowPopup = null;
      super.onDismiss();
    }
  }
  
  public class PopupPresenterCallback
    implements MenuPresenter.Callback
  {
    public PopupPresenterCallback() {}
    
    public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean)
    {
      if ((paramMenuBuilder instanceof SubMenuBuilder)) {
        paramMenuBuilder.getRootMenu().close(false);
      }
      MenuPresenter.Callback localCallback = getCallback();
      if (localCallback != null) {
        localCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
      }
    }
    
    public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
    {
      Object localObject = ActionMenuPresenter.access$300(ActionMenuPresenter.this);
      boolean bool = false;
      if (paramMenuBuilder == localObject) {
        return false;
      }
      mOpenSubMenuId = ((SubMenuBuilder)paramMenuBuilder).getItem().getItemId();
      localObject = getCallback();
      if (localObject != null) {
        bool = ((MenuPresenter.Callback)localObject).onOpenSubMenu(paramMenuBuilder);
      }
      return bool;
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public ActionMenuPresenter.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new ActionMenuPresenter.SavedState(paramAnonymousParcel);
      }
      
      public ActionMenuPresenter.SavedState[] newArray(int paramAnonymousInt)
      {
        return new ActionMenuPresenter.SavedState[paramAnonymousInt];
      }
    };
    public int openSubMenuId;
    
    public SavedState() {}
    
    public SavedState(Parcel paramParcel)
    {
      openSubMenuId = paramParcel.readInt();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(openSubMenuId);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */