package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.layout;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;

final class StandardMenuPopup
  extends MenuPopup
  implements PopupWindow.OnDismissListener, View.OnKeyListener
{
  private static final int ITEM_LAYOUT = R.layout.abc_popup_menu_item_layout;
  private final MenuAdapter mAdapter;
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
        localObject = StandardMenuPopup.this;
        mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
      }
      paramAnonymousView.removeOnAttachStateChangeListener(this);
    }
  };
  private int mContentWidth;
  private final Context mContext;
  private int mDropDownGravity = 0;
  public final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public void onGlobalLayout()
    {
      if ((isShowing()) && (!mPopup.isModal()))
      {
        View localView = mShownAnchorView;
        if ((localView != null) && (localView.isShown())) {
          mPopup.show();
        } else {
          dismiss();
        }
      }
    }
  };
  private boolean mHasContentWidth;
  private final MenuBuilder mMenu;
  private PopupWindow.OnDismissListener mOnDismissListener;
  private final boolean mOverflowOnly;
  public final MenuPopupWindow mPopup;
  private final int mPopupMaxWidth;
  private final int mPopupStyleAttr;
  private final int mPopupStyleRes;
  private MenuPresenter.Callback mPresenterCallback;
  private boolean mShowTitle;
  public View mShownAnchorView;
  public ViewTreeObserver mTreeObserver;
  private boolean mWasDismissed;
  
  public StandardMenuPopup(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    mContext = paramContext;
    mMenu = paramMenuBuilder;
    mOverflowOnly = paramBoolean;
    mAdapter = new MenuAdapter(paramMenuBuilder, LayoutInflater.from(paramContext), paramBoolean, ITEM_LAYOUT);
    mPopupStyleAttr = paramInt1;
    mPopupStyleRes = paramInt2;
    Resources localResources = paramContext.getResources();
    mPopupMaxWidth = Math.max(getDisplayMetricswidthPixels / 2, localResources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    mAnchorView = paramView;
    mPopup = new MenuPopupWindow(paramContext, null, paramInt1, paramInt2);
    paramMenuBuilder.addMenuPresenter(this, paramContext);
  }
  
  private boolean tryShow()
  {
    if (isShowing()) {
      return true;
    }
    if (!mWasDismissed)
    {
      Object localObject1 = mAnchorView;
      if (localObject1 != null)
      {
        mShownAnchorView = ((View)localObject1);
        mPopup.setOnDismissListener(this);
        mPopup.setOnItemClickListener(this);
        mPopup.setModal(true);
        Object localObject2 = mShownAnchorView;
        int i;
        if (mTreeObserver == null) {
          i = 1;
        } else {
          i = 0;
        }
        localObject1 = ((View)localObject2).getViewTreeObserver();
        mTreeObserver = ((ViewTreeObserver)localObject1);
        if (i != 0) {
          ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener(mGlobalLayoutListener);
        }
        ((View)localObject2).addOnAttachStateChangeListener(mAttachStateChangeListener);
        mPopup.setAnchorView((View)localObject2);
        mPopup.setDropDownGravity(mDropDownGravity);
        if (!mHasContentWidth)
        {
          mContentWidth = MenuPopup.measureIndividualMenuWidth(mAdapter, null, mContext, mPopupMaxWidth);
          mHasContentWidth = true;
        }
        mPopup.setContentWidth(mContentWidth);
        mPopup.setInputMethodMode(2);
        mPopup.setEpicenterBounds(getEpicenterBounds());
        mPopup.show();
        localObject1 = mPopup.getListView();
        ((View)localObject1).setOnKeyListener(this);
        if ((mShowTitle) && (mMenu.getHeaderTitle() != null))
        {
          FrameLayout localFrameLayout = (FrameLayout)LayoutInflater.from(mContext).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup)localObject1, false);
          localObject2 = (TextView)localFrameLayout.findViewById(16908310);
          if (localObject2 != null) {
            ((TextView)localObject2).setText(mMenu.getHeaderTitle());
          }
          localFrameLayout.setEnabled(false);
          ((ListView)localObject1).addHeaderView(localFrameLayout, null, false);
        }
        mPopup.setAdapter(mAdapter);
        mPopup.show();
        return true;
      }
    }
    return false;
  }
  
  public void addMenu(MenuBuilder paramMenuBuilder) {}
  
  public void dismiss()
  {
    if (isShowing()) {
      mPopup.dismiss();
    }
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public ListView getListView()
  {
    return mPopup.getListView();
  }
  
  public boolean isShowing()
  {
    boolean bool;
    if ((!mWasDismissed) && (mPopup.isShowing())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if (paramMenuBuilder != mMenu) {
      return;
    }
    dismiss();
    MenuPresenter.Callback localCallback = mPresenterCallback;
    if (localCallback != null) {
      localCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public void onDismiss()
  {
    mWasDismissed = true;
    mMenu.close();
    Object localObject = mTreeObserver;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        mTreeObserver = mShownAnchorView.getViewTreeObserver();
      }
      mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
      mTreeObserver = null;
    }
    mShownAnchorView.removeOnAttachStateChangeListener(mAttachStateChangeListener);
    localObject = mOnDismissListener;
    if (localObject != null) {
      ((PopupWindow.OnDismissListener)localObject).onDismiss();
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
    if (paramSubMenuBuilder.hasVisibleItems())
    {
      Object localObject = new MenuPopupHelper(mContext, paramSubMenuBuilder, mShownAnchorView, mOverflowOnly, mPopupStyleAttr, mPopupStyleRes);
      ((MenuPopupHelper)localObject).setPresenterCallback(mPresenterCallback);
      ((MenuPopupHelper)localObject).setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(paramSubMenuBuilder));
      ((MenuPopupHelper)localObject).setOnDismissListener(mOnDismissListener);
      mOnDismissListener = null;
      mMenu.close(false);
      int i = mPopup.getHorizontalOffset();
      int j = mPopup.getVerticalOffset();
      int k = i;
      if ((Gravity.getAbsoluteGravity(mDropDownGravity, ViewCompat.getLayoutDirection(mAnchorView)) & 0x7) == 5) {
        k = i + mAnchorView.getWidth();
      }
      if (((MenuPopupHelper)localObject).tryShow(k, j))
      {
        localObject = mPresenterCallback;
        if (localObject != null) {
          ((MenuPresenter.Callback)localObject).onOpenSubMenu(paramSubMenuBuilder);
        }
        return true;
      }
    }
    return false;
  }
  
  public void setAnchorView(View paramView)
  {
    mAnchorView = paramView;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    mPresenterCallback = paramCallback;
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    mAdapter.setForceShowIcon(paramBoolean);
  }
  
  public void setGravity(int paramInt)
  {
    mDropDownGravity = paramInt;
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    mPopup.setHorizontalOffset(paramInt);
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
    mPopup.setVerticalOffset(paramInt);
  }
  
  public void show()
  {
    if (tryShow()) {
      return;
    }
    throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    mHasContentWidth = false;
    MenuAdapter localMenuAdapter = mAdapter;
    if (localMenuAdapter != null) {
      localMenuAdapter.notifyDataSetChanged();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.StandardMenuPopup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */