package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.layout;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class CascadingMenuPopup
  extends MenuPopup
  implements View.OnKeyListener, PopupWindow.OnDismissListener
{
  public static final int HORIZ_POSITION_LEFT = 0;
  public static final int HORIZ_POSITION_RIGHT = 1;
  private static final int ITEM_LAYOUT = R.layout.abc_cascading_menu_item_layout;
  public static final int SUBMENU_TIMEOUT_MS = 200;
  private View mAnchorView;
  private final View.OnAttachStateChangeListener mAttachStateChangeListener = new View.OnAttachStateChangeListener()
  {
    public void onViewAttachedToWindow(View paramAnonymousView) {}
    
    public void onViewDetachedFromWindow(View paramAnonymousView)
    {
      Object localObject = mTreeObserver;
      if (localObject != null)
      {
        if (!((ViewTreeObserver)localObject).isAlive()) {
          mTreeObserver = paramAnonymousView.getViewTreeObserver();
        }
        localObject = CascadingMenuPopup.this;
        mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
      }
      paramAnonymousView.removeOnAttachStateChangeListener(this);
    }
  };
  private final Context mContext;
  private int mDropDownGravity = 0;
  private boolean mForceShowIcon;
  public final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public void onGlobalLayout()
    {
      if ((isShowing()) && (mShowingMenus.size() > 0) && (!mShowingMenus.get(0)).window.isModal()))
      {
        Object localObject = mShownAnchorView;
        if ((localObject != null) && (((View)localObject).isShown())) {
          localObject = mShowingMenus.iterator();
        }
        while (((Iterator)localObject).hasNext())
        {
          nextwindow.show();
          continue;
          dismiss();
        }
      }
    }
  };
  private boolean mHasXOffset;
  private boolean mHasYOffset;
  private int mLastPosition;
  private final MenuItemHoverListener mMenuItemHoverListener = new MenuItemHoverListener()
  {
    public void onItemHoverEnter(@NonNull final MenuBuilder paramAnonymousMenuBuilder, @NonNull final MenuItem paramAnonymousMenuItem)
    {
      Handler localHandler = mSubMenuHoverHandler;
      final CascadingMenuPopup.CascadingMenuInfo localCascadingMenuInfo = null;
      localHandler.removeCallbacksAndMessages(null);
      int i = mShowingMenus.size();
      for (int j = 0; j < i; j++) {
        if (paramAnonymousMenuBuilder == mShowingMenus.get(j)).menu) {
          break label76;
        }
      }
      j = -1;
      label76:
      if (j == -1) {
        return;
      }
      j++;
      if (j < mShowingMenus.size()) {
        localCascadingMenuInfo = (CascadingMenuPopup.CascadingMenuInfo)mShowingMenus.get(j);
      }
      paramAnonymousMenuItem = new Runnable()
      {
        public void run()
        {
          CascadingMenuPopup.CascadingMenuInfo localCascadingMenuInfo = localCascadingMenuInfo;
          if (localCascadingMenuInfo != null)
          {
            mShouldCloseImmediately = true;
            menu.close(false);
            mShouldCloseImmediately = false;
          }
          if ((paramAnonymousMenuItem.isEnabled()) && (paramAnonymousMenuItem.hasSubMenu())) {
            paramAnonymousMenuBuilder.performItemAction(paramAnonymousMenuItem, 4);
          }
        }
      };
      long l = SystemClock.uptimeMillis();
      mSubMenuHoverHandler.postAtTime(paramAnonymousMenuItem, paramAnonymousMenuBuilder, l + 200L);
    }
    
    public void onItemHoverExit(@NonNull MenuBuilder paramAnonymousMenuBuilder, @NonNull MenuItem paramAnonymousMenuItem)
    {
      mSubMenuHoverHandler.removeCallbacksAndMessages(paramAnonymousMenuBuilder);
    }
  };
  private final int mMenuMaxWidth;
  private PopupWindow.OnDismissListener mOnDismissListener;
  private final boolean mOverflowOnly;
  private final List<MenuBuilder> mPendingMenus = new ArrayList();
  private final int mPopupStyleAttr;
  private final int mPopupStyleRes;
  private MenuPresenter.Callback mPresenterCallback;
  private int mRawDropDownGravity = 0;
  public boolean mShouldCloseImmediately;
  private boolean mShowTitle;
  public final List<CascadingMenuInfo> mShowingMenus = new ArrayList();
  public View mShownAnchorView;
  public final Handler mSubMenuHoverHandler;
  public ViewTreeObserver mTreeObserver;
  private int mXOffset;
  private int mYOffset;
  
  public CascadingMenuPopup(@NonNull Context paramContext, @NonNull View paramView, @AttrRes int paramInt1, @StyleRes int paramInt2, boolean paramBoolean)
  {
    mContext = paramContext;
    mAnchorView = paramView;
    mPopupStyleAttr = paramInt1;
    mPopupStyleRes = paramInt2;
    mOverflowOnly = paramBoolean;
    mForceShowIcon = false;
    mLastPosition = getInitialMenuPosition();
    paramContext = paramContext.getResources();
    mMenuMaxWidth = Math.max(getDisplayMetricswidthPixels / 2, paramContext.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    mSubMenuHoverHandler = new Handler();
  }
  
  private MenuPopupWindow createPopupWindow()
  {
    MenuPopupWindow localMenuPopupWindow = new MenuPopupWindow(mContext, null, mPopupStyleAttr, mPopupStyleRes);
    localMenuPopupWindow.setHoverListener(mMenuItemHoverListener);
    localMenuPopupWindow.setOnItemClickListener(this);
    localMenuPopupWindow.setOnDismissListener(this);
    localMenuPopupWindow.setAnchorView(mAnchorView);
    localMenuPopupWindow.setDropDownGravity(mDropDownGravity);
    localMenuPopupWindow.setModal(true);
    localMenuPopupWindow.setInputMethodMode(2);
    return localMenuPopupWindow;
  }
  
  private int findIndexOfAddedMenu(@NonNull MenuBuilder paramMenuBuilder)
  {
    int i = mShowingMenus.size();
    for (int j = 0; j < i; j++) {
      if (paramMenuBuilder == mShowingMenus.get(j)).menu) {
        return j;
      }
    }
    return -1;
  }
  
  private MenuItem findMenuItemForSubmenu(@NonNull MenuBuilder paramMenuBuilder1, @NonNull MenuBuilder paramMenuBuilder2)
  {
    int i = paramMenuBuilder1.size();
    for (int j = 0; j < i; j++)
    {
      MenuItem localMenuItem = paramMenuBuilder1.getItem(j);
      if ((localMenuItem.hasSubMenu()) && (paramMenuBuilder2 == localMenuItem.getSubMenu())) {
        return localMenuItem;
      }
    }
    return null;
  }
  
  @Nullable
  private View findParentViewForSubmenu(@NonNull CascadingMenuInfo paramCascadingMenuInfo, @NonNull MenuBuilder paramMenuBuilder)
  {
    paramMenuBuilder = findMenuItemForSubmenu(menu, paramMenuBuilder);
    if (paramMenuBuilder == null) {
      return null;
    }
    ListView localListView = paramCascadingMenuInfo.getListView();
    paramCascadingMenuInfo = localListView.getAdapter();
    boolean bool = paramCascadingMenuInfo instanceof HeaderViewListAdapter;
    int i = 0;
    int j;
    if (bool)
    {
      paramCascadingMenuInfo = (HeaderViewListAdapter)paramCascadingMenuInfo;
      j = paramCascadingMenuInfo.getHeadersCount();
      paramCascadingMenuInfo = (MenuAdapter)paramCascadingMenuInfo.getWrappedAdapter();
    }
    else
    {
      paramCascadingMenuInfo = (MenuAdapter)paramCascadingMenuInfo;
      j = 0;
    }
    int k = paramCascadingMenuInfo.getCount();
    while (i < k)
    {
      if (paramMenuBuilder == paramCascadingMenuInfo.getItem(i)) {
        break label105;
      }
      i++;
    }
    i = -1;
    label105:
    if (i == -1) {
      return null;
    }
    i = i + j - localListView.getFirstVisiblePosition();
    if ((i >= 0) && (i < localListView.getChildCount())) {
      return localListView.getChildAt(i);
    }
    return null;
  }
  
  private int getInitialMenuPosition()
  {
    int i = ViewCompat.getLayoutDirection(mAnchorView);
    int j = 1;
    if (i == 1) {
      j = 0;
    }
    return j;
  }
  
  private int getNextMenuPosition(int paramInt)
  {
    Object localObject = mShowingMenus;
    ListView localListView = ((CascadingMenuInfo)((List)localObject).get(((List)localObject).size() - 1)).getListView();
    localObject = new int[2];
    localListView.getLocationOnScreen((int[])localObject);
    Rect localRect = new Rect();
    mShownAnchorView.getWindowVisibleDisplayFrame(localRect);
    if (mLastPosition == 1)
    {
      int i = localObject[0];
      if (localListView.getWidth() + i + paramInt > right) {
        return 0;
      }
      return 1;
    }
    if (localObject[0] - paramInt < 0) {
      return 1;
    }
    return 0;
  }
  
  private void showMenu(@NonNull MenuBuilder paramMenuBuilder)
  {
    Object localObject1 = LayoutInflater.from(mContext);
    Object localObject2 = new MenuAdapter(paramMenuBuilder, (LayoutInflater)localObject1, mOverflowOnly, ITEM_LAYOUT);
    if ((!isShowing()) && (mForceShowIcon)) {
      ((MenuAdapter)localObject2).setForceShowIcon(true);
    } else if (isShowing()) {
      ((MenuAdapter)localObject2).setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(paramMenuBuilder));
    }
    int i = MenuPopup.measureIndividualMenuWidth((ListAdapter)localObject2, null, mContext, mMenuMaxWidth);
    MenuPopupWindow localMenuPopupWindow = createPopupWindow();
    localMenuPopupWindow.setAdapter((ListAdapter)localObject2);
    localMenuPopupWindow.setContentWidth(i);
    localMenuPopupWindow.setDropDownGravity(mDropDownGravity);
    if (mShowingMenus.size() > 0)
    {
      localObject2 = mShowingMenus;
      localObject2 = (CascadingMenuInfo)((List)localObject2).get(((List)localObject2).size() - 1);
      localObject3 = findParentViewForSubmenu((CascadingMenuInfo)localObject2, paramMenuBuilder);
    }
    else
    {
      localObject2 = null;
      localObject3 = localObject2;
    }
    if (localObject3 != null)
    {
      localMenuPopupWindow.setTouchModal(false);
      localMenuPopupWindow.setEnterTransition(null);
      int j = getNextMenuPosition(i);
      if (j == 1) {
        k = 1;
      } else {
        k = 0;
      }
      mLastPosition = j;
      int m;
      if (Build.VERSION.SDK_INT >= 26)
      {
        localMenuPopupWindow.setAnchorView((View)localObject3);
        j = 0;
        m = j;
      }
      else
      {
        int[] arrayOfInt1 = new int[2];
        mAnchorView.getLocationOnScreen(arrayOfInt1);
        int[] arrayOfInt2 = new int[2];
        ((View)localObject3).getLocationOnScreen(arrayOfInt2);
        if ((mDropDownGravity & 0x7) == 5)
        {
          j = arrayOfInt1[0];
          arrayOfInt1[0] = (mAnchorView.getWidth() + j);
          j = arrayOfInt2[0];
          arrayOfInt2[0] = (((View)localObject3).getWidth() + j);
        }
        m = arrayOfInt2[0] - arrayOfInt1[0];
        j = arrayOfInt2[1] - arrayOfInt1[1];
      }
      if ((mDropDownGravity & 0x5) == 5)
      {
        if (k != 0)
        {
          k = m + i;
          break label384;
        }
        i = ((View)localObject3).getWidth();
      }
      else if (k != 0)
      {
        k = m + ((View)localObject3).getWidth();
        break label384;
      }
      int k = m - i;
      label384:
      localMenuPopupWindow.setHorizontalOffset(k);
      localMenuPopupWindow.setOverlapAnchor(true);
      localMenuPopupWindow.setVerticalOffset(j);
    }
    else
    {
      if (mHasXOffset) {
        localMenuPopupWindow.setHorizontalOffset(mXOffset);
      }
      if (mHasYOffset) {
        localMenuPopupWindow.setVerticalOffset(mYOffset);
      }
      localMenuPopupWindow.setEpicenterBounds(getEpicenterBounds());
    }
    Object localObject3 = new CascadingMenuInfo(localMenuPopupWindow, paramMenuBuilder, mLastPosition);
    mShowingMenus.add(localObject3);
    localMenuPopupWindow.show();
    localObject3 = localMenuPopupWindow.getListView();
    ((View)localObject3).setOnKeyListener(this);
    if ((localObject2 == null) && (mShowTitle) && (paramMenuBuilder.getHeaderTitle() != null))
    {
      localObject2 = (FrameLayout)((LayoutInflater)localObject1).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup)localObject3, false);
      localObject1 = (TextView)((View)localObject2).findViewById(16908310);
      ((View)localObject2).setEnabled(false);
      ((TextView)localObject1).setText(paramMenuBuilder.getHeaderTitle());
      ((ListView)localObject3).addHeaderView((View)localObject2, null, false);
      localMenuPopupWindow.show();
    }
  }
  
  public void addMenu(MenuBuilder paramMenuBuilder)
  {
    paramMenuBuilder.addMenuPresenter(this, mContext);
    if (isShowing()) {
      showMenu(paramMenuBuilder);
    } else {
      mPendingMenus.add(paramMenuBuilder);
    }
  }
  
  public boolean closeMenuOnSubMenuOpened()
  {
    return false;
  }
  
  public void dismiss()
  {
    int i = mShowingMenus.size();
    if (i > 0)
    {
      CascadingMenuInfo[] arrayOfCascadingMenuInfo = (CascadingMenuInfo[])mShowingMenus.toArray(new CascadingMenuInfo[i]);
      i--;
      while (i >= 0)
      {
        CascadingMenuInfo localCascadingMenuInfo = arrayOfCascadingMenuInfo[i];
        if (window.isShowing()) {
          window.dismiss();
        }
        i--;
      }
    }
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public ListView getListView()
  {
    Object localObject;
    if (mShowingMenus.isEmpty())
    {
      localObject = null;
    }
    else
    {
      localObject = mShowingMenus;
      localObject = ((CascadingMenuInfo)((List)localObject).get(((List)localObject).size() - 1)).getListView();
    }
    return (ListView)localObject;
  }
  
  public boolean isShowing()
  {
    int i = mShowingMenus.size();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0)
    {
      bool2 = bool1;
      if (mShowingMenus.get(0)).window.isShowing()) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    int i = findIndexOfAddedMenu(paramMenuBuilder);
    if (i < 0) {
      return;
    }
    int j = i + 1;
    if (j < mShowingMenus.size()) {
      mShowingMenus.get(j)).menu.close(false);
    }
    Object localObject = (CascadingMenuInfo)mShowingMenus.remove(i);
    menu.removeMenuPresenter(this);
    if (mShouldCloseImmediately)
    {
      window.setExitTransition(null);
      window.setAnimationStyle(0);
    }
    window.dismiss();
    i = mShowingMenus.size();
    if (i > 0) {
      mLastPosition = mShowingMenus.get(i - 1)).position;
    } else {
      mLastPosition = getInitialMenuPosition();
    }
    if (i == 0)
    {
      dismiss();
      localObject = mPresenterCallback;
      if (localObject != null) {
        ((MenuPresenter.Callback)localObject).onCloseMenu(paramMenuBuilder, true);
      }
      paramMenuBuilder = mTreeObserver;
      if (paramMenuBuilder != null)
      {
        if (paramMenuBuilder.isAlive()) {
          mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
        }
        mTreeObserver = null;
      }
      mShownAnchorView.removeOnAttachStateChangeListener(mAttachStateChangeListener);
      mOnDismissListener.onDismiss();
    }
    else if (paramBoolean)
    {
      mShowingMenus.get(0)).menu.close(false);
    }
  }
  
  public void onDismiss()
  {
    int i = mShowingMenus.size();
    for (int j = 0; j < i; j++)
    {
      localCascadingMenuInfo = (CascadingMenuInfo)mShowingMenus.get(j);
      if (!window.isShowing()) {
        break label52;
      }
    }
    CascadingMenuInfo localCascadingMenuInfo = null;
    label52:
    if (localCascadingMenuInfo != null) {
      menu.close(false);
    }
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    Object localObject = mShowingMenus.iterator();
    while (((Iterator)localObject).hasNext())
    {
      CascadingMenuInfo localCascadingMenuInfo = (CascadingMenuInfo)((Iterator)localObject).next();
      if (paramSubMenuBuilder == menu)
      {
        localCascadingMenuInfo.getListView().requestFocus();
        return true;
      }
    }
    if (paramSubMenuBuilder.hasVisibleItems())
    {
      addMenu(paramSubMenuBuilder);
      localObject = mPresenterCallback;
      if (localObject != null) {
        ((MenuPresenter.Callback)localObject).onOpenSubMenu(paramSubMenuBuilder);
      }
      return true;
    }
    return false;
  }
  
  public void setAnchorView(@NonNull View paramView)
  {
    if (mAnchorView != paramView)
    {
      mAnchorView = paramView;
      mDropDownGravity = GravityCompat.getAbsoluteGravity(mRawDropDownGravity, ViewCompat.getLayoutDirection(paramView));
    }
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    mPresenterCallback = paramCallback;
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    mForceShowIcon = paramBoolean;
  }
  
  public void setGravity(int paramInt)
  {
    if (mRawDropDownGravity != paramInt)
    {
      mRawDropDownGravity = paramInt;
      mDropDownGravity = GravityCompat.getAbsoluteGravity(paramInt, ViewCompat.getLayoutDirection(mAnchorView));
    }
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    mHasXOffset = true;
    mXOffset = paramInt;
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    mOnDismissListener = paramOnDismissListener;
  }
  
  public void setShowTitle(boolean paramBoolean)
  {
    mShowTitle = paramBoolean;
  }
  
  public void setVerticalOffset(int paramInt)
  {
    mHasYOffset = true;
    mYOffset = paramInt;
  }
  
  public void show()
  {
    if (isShowing()) {
      return;
    }
    Object localObject = mPendingMenus.iterator();
    while (((Iterator)localObject).hasNext()) {
      showMenu((MenuBuilder)((Iterator)localObject).next());
    }
    mPendingMenus.clear();
    localObject = mAnchorView;
    mShownAnchorView = ((View)localObject);
    if (localObject != null)
    {
      int i;
      if (mTreeObserver == null) {
        i = 1;
      } else {
        i = 0;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      mTreeObserver = ((ViewTreeObserver)localObject);
      if (i != 0) {
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(mGlobalLayoutListener);
      }
      mShownAnchorView.addOnAttachStateChangeListener(mAttachStateChangeListener);
    }
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    Iterator localIterator = mShowingMenus.iterator();
    while (localIterator.hasNext()) {
      MenuPopup.toMenuAdapter(((CascadingMenuInfo)localIterator.next()).getListView().getAdapter()).notifyDataSetChanged();
    }
  }
  
  public static class CascadingMenuInfo
  {
    public final MenuBuilder menu;
    public final int position;
    public final MenuPopupWindow window;
    
    public CascadingMenuInfo(@NonNull MenuPopupWindow paramMenuPopupWindow, @NonNull MenuBuilder paramMenuBuilder, int paramInt)
    {
      window = paramMenuPopupWindow;
      menu = paramMenuBuilder;
      position = paramInt;
    }
    
    public ListView getListView()
    {
      return window.getListView();
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface HorizPosition {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */