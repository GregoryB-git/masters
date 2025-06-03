package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.dimen;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupHelper
  implements MenuHelper
{
  private static final int TOUCH_EPICENTER_SIZE_DP = 48;
  private View mAnchorView;
  private final Context mContext;
  private int mDropDownGravity = 8388611;
  private boolean mForceShowIcon;
  private final PopupWindow.OnDismissListener mInternalOnDismissListener = new PopupWindow.OnDismissListener()
  {
    public void onDismiss()
    {
      MenuPopupHelper.this.onDismiss();
    }
  };
  private final MenuBuilder mMenu;
  private PopupWindow.OnDismissListener mOnDismissListener;
  private final boolean mOverflowOnly;
  private MenuPopup mPopup;
  private final int mPopupStyleAttr;
  private final int mPopupStyleRes;
  private MenuPresenter.Callback mPresenterCallback;
  
  public MenuPopupHelper(@NonNull Context paramContext, @NonNull MenuBuilder paramMenuBuilder)
  {
    this(paramContext, paramMenuBuilder, null, false, R.attr.popupMenuStyle, 0);
  }
  
  public MenuPopupHelper(@NonNull Context paramContext, @NonNull MenuBuilder paramMenuBuilder, @NonNull View paramView)
  {
    this(paramContext, paramMenuBuilder, paramView, false, R.attr.popupMenuStyle, 0);
  }
  
  public MenuPopupHelper(@NonNull Context paramContext, @NonNull MenuBuilder paramMenuBuilder, @NonNull View paramView, boolean paramBoolean, @AttrRes int paramInt)
  {
    this(paramContext, paramMenuBuilder, paramView, paramBoolean, paramInt, 0);
  }
  
  public MenuPopupHelper(@NonNull Context paramContext, @NonNull MenuBuilder paramMenuBuilder, @NonNull View paramView, boolean paramBoolean, @AttrRes int paramInt1, @StyleRes int paramInt2)
  {
    mContext = paramContext;
    mMenu = paramMenuBuilder;
    mAnchorView = paramView;
    mOverflowOnly = paramBoolean;
    mPopupStyleAttr = paramInt1;
    mPopupStyleRes = paramInt2;
  }
  
  @NonNull
  private MenuPopup createPopup()
  {
    Object localObject = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    Api17Impl.getRealSize((Display)localObject, localPoint);
    int i;
    if (Math.min(x, y) >= mContext.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject = new CascadingMenuPopup(mContext, mAnchorView, mPopupStyleAttr, mPopupStyleRes, mOverflowOnly);
    } else {
      localObject = new StandardMenuPopup(mContext, mMenu, mAnchorView, mPopupStyleAttr, mPopupStyleRes, mOverflowOnly);
    }
    ((MenuPopup)localObject).addMenu(mMenu);
    ((MenuPopup)localObject).setOnDismissListener(mInternalOnDismissListener);
    ((MenuPopup)localObject).setAnchorView(mAnchorView);
    ((MenuPresenter)localObject).setCallback(mPresenterCallback);
    ((MenuPopup)localObject).setForceShowIcon(mForceShowIcon);
    ((MenuPopup)localObject).setGravity(mDropDownGravity);
    return (MenuPopup)localObject;
  }
  
  private void showPopup(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    MenuPopup localMenuPopup = getPopup();
    localMenuPopup.setShowTitle(paramBoolean2);
    if (paramBoolean1)
    {
      int i = paramInt1;
      if ((GravityCompat.getAbsoluteGravity(mDropDownGravity, ViewCompat.getLayoutDirection(mAnchorView)) & 0x7) == 5) {
        i = paramInt1 - mAnchorView.getWidth();
      }
      localMenuPopup.setHorizontalOffset(i);
      localMenuPopup.setVerticalOffset(paramInt2);
      paramInt1 = (int)(mContext.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
      localMenuPopup.setEpicenterBounds(new Rect(i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1));
    }
    localMenuPopup.show();
  }
  
  public void dismiss()
  {
    if (isShowing()) {
      mPopup.dismiss();
    }
  }
  
  public int getGravity()
  {
    return mDropDownGravity;
  }
  
  public ListView getListView()
  {
    return getPopup().getListView();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public MenuPopup getPopup()
  {
    if (mPopup == null) {
      mPopup = createPopup();
    }
    return mPopup;
  }
  
  public boolean isShowing()
  {
    MenuPopup localMenuPopup = mPopup;
    boolean bool;
    if ((localMenuPopup != null) && (localMenuPopup.isShowing())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onDismiss()
  {
    mPopup = null;
    PopupWindow.OnDismissListener localOnDismissListener = mOnDismissListener;
    if (localOnDismissListener != null) {
      localOnDismissListener.onDismiss();
    }
  }
  
  public void setAnchorView(@NonNull View paramView)
  {
    mAnchorView = paramView;
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    mForceShowIcon = paramBoolean;
    MenuPopup localMenuPopup = mPopup;
    if (localMenuPopup != null) {
      localMenuPopup.setForceShowIcon(paramBoolean);
    }
  }
  
  public void setGravity(int paramInt)
  {
    mDropDownGravity = paramInt;
  }
  
  public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener paramOnDismissListener)
  {
    mOnDismissListener = paramOnDismissListener;
  }
  
  public void setPresenterCallback(@Nullable MenuPresenter.Callback paramCallback)
  {
    mPresenterCallback = paramCallback;
    MenuPopup localMenuPopup = mPopup;
    if (localMenuPopup != null) {
      localMenuPopup.setCallback(paramCallback);
    }
  }
  
  public void show()
  {
    if (tryShow()) {
      return;
    }
    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }
  
  public void show(int paramInt1, int paramInt2)
  {
    if (tryShow(paramInt1, paramInt2)) {
      return;
    }
    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }
  
  public boolean tryShow()
  {
    if (isShowing()) {
      return true;
    }
    if (mAnchorView == null) {
      return false;
    }
    showPopup(0, 0, false, false);
    return true;
  }
  
  public boolean tryShow(int paramInt1, int paramInt2)
  {
    if (isShowing()) {
      return true;
    }
    if (mAnchorView == null) {
      return false;
    }
    showPopup(paramInt1, paramInt2, true, true);
    return true;
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    @DoNotInline
    public static void getRealSize(Display paramDisplay, Point paramPoint)
    {
      paramDisplay.getRealSize(paramPoint);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuPopupHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */