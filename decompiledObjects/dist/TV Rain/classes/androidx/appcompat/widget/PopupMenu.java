package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

public class PopupMenu
{
  private final View mAnchor;
  private final Context mContext;
  private View.OnTouchListener mDragListener;
  private final MenuBuilder mMenu;
  public OnMenuItemClickListener mMenuItemClickListener;
  public OnDismissListener mOnDismissListener;
  public final MenuPopupHelper mPopup;
  
  public PopupMenu(@NonNull Context paramContext, @NonNull View paramView)
  {
    this(paramContext, paramView, 0);
  }
  
  public PopupMenu(@NonNull Context paramContext, @NonNull View paramView, int paramInt)
  {
    this(paramContext, paramView, paramInt, R.attr.popupMenuStyle, 0);
  }
  
  public PopupMenu(@NonNull Context paramContext, @NonNull View paramView, int paramInt1, @AttrRes int paramInt2, @StyleRes int paramInt3)
  {
    mContext = paramContext;
    mAnchor = paramView;
    MenuBuilder localMenuBuilder = new MenuBuilder(paramContext);
    mMenu = localMenuBuilder;
    localMenuBuilder.setCallback(new MenuBuilder.Callback()
    {
      public boolean onMenuItemSelected(@NonNull MenuBuilder paramAnonymousMenuBuilder, @NonNull MenuItem paramAnonymousMenuItem)
      {
        paramAnonymousMenuBuilder = mMenuItemClickListener;
        if (paramAnonymousMenuBuilder != null) {
          return paramAnonymousMenuBuilder.onMenuItemClick(paramAnonymousMenuItem);
        }
        return false;
      }
      
      public void onMenuModeChange(@NonNull MenuBuilder paramAnonymousMenuBuilder) {}
    });
    paramContext = new MenuPopupHelper(paramContext, localMenuBuilder, paramView, false, paramInt2, paramInt3);
    mPopup = paramContext;
    paramContext.setGravity(paramInt1);
    paramContext.setOnDismissListener(new PopupWindow.OnDismissListener()
    {
      public void onDismiss()
      {
        PopupMenu localPopupMenu = PopupMenu.this;
        PopupMenu.OnDismissListener localOnDismissListener = mOnDismissListener;
        if (localOnDismissListener != null) {
          localOnDismissListener.onDismiss(localPopupMenu);
        }
      }
    });
  }
  
  public void dismiss()
  {
    mPopup.dismiss();
  }
  
  @NonNull
  public View.OnTouchListener getDragToOpenListener()
  {
    if (mDragListener == null) {
      mDragListener = new ForwardingListener(mAnchor)
      {
        public ShowableListMenu getPopup()
        {
          return mPopup.getPopup();
        }
        
        public boolean onForwardingStarted()
        {
          show();
          return true;
        }
        
        public boolean onForwardingStopped()
        {
          dismiss();
          return true;
        }
      };
    }
    return mDragListener;
  }
  
  public int getGravity()
  {
    return mPopup.getGravity();
  }
  
  @NonNull
  public Menu getMenu()
  {
    return mMenu;
  }
  
  @NonNull
  public MenuInflater getMenuInflater()
  {
    return new SupportMenuInflater(mContext);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ListView getMenuListView()
  {
    if (!mPopup.isShowing()) {
      return null;
    }
    return mPopup.getListView();
  }
  
  public void inflate(@MenuRes int paramInt)
  {
    getMenuInflater().inflate(paramInt, mMenu);
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    mPopup.setForceShowIcon(paramBoolean);
  }
  
  public void setGravity(int paramInt)
  {
    mPopup.setGravity(paramInt);
  }
  
  public void setOnDismissListener(@Nullable OnDismissListener paramOnDismissListener)
  {
    mOnDismissListener = paramOnDismissListener;
  }
  
  public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    mMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void show()
  {
    mPopup.show();
  }
  
  public static abstract interface OnDismissListener
  {
    public abstract void onDismiss(PopupMenu paramPopupMenu);
  }
  
  public static abstract interface OnMenuItemClickListener
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.PopupMenu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */