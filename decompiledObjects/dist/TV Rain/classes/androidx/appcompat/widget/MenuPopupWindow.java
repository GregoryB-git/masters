package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import e;
import java.lang.reflect.Method;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow
  extends ListPopupWindow
  implements MenuItemHoverListener
{
  private static final String TAG = "MenuPopupWindow";
  private static Method sSetTouchModalMethod;
  private MenuItemHoverListener mHoverListener;
  
  static
  {
    try
    {
      if (Build.VERSION.SDK_INT <= 28) {
        sSetTouchModalMethod = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { Boolean.TYPE });
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
    }
  }
  
  public MenuPopupWindow(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  @NonNull
  public DropDownListView createDropDownListView(Context paramContext, boolean paramBoolean)
  {
    paramContext = new MenuDropDownListView(paramContext, paramBoolean);
    paramContext.setHoverListener(this);
    return paramContext;
  }
  
  public void onItemHoverEnter(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
  {
    MenuItemHoverListener localMenuItemHoverListener = mHoverListener;
    if (localMenuItemHoverListener != null) {
      localMenuItemHoverListener.onItemHoverEnter(paramMenuBuilder, paramMenuItem);
    }
  }
  
  public void onItemHoverExit(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
  {
    MenuItemHoverListener localMenuItemHoverListener = mHoverListener;
    if (localMenuItemHoverListener != null) {
      localMenuItemHoverListener.onItemHoverExit(paramMenuBuilder, paramMenuItem);
    }
  }
  
  public void setEnterTransition(Object paramObject)
  {
    Api23Impl.setEnterTransition(mPopup, (Transition)paramObject);
  }
  
  public void setExitTransition(Object paramObject)
  {
    Api23Impl.setExitTransition(mPopup, (Transition)paramObject);
  }
  
  public void setHoverListener(MenuItemHoverListener paramMenuItemHoverListener)
  {
    mHoverListener = paramMenuItemHoverListener;
  }
  
  public void setTouchModal(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      Method localMethod = sSetTouchModalMethod;
      if (localMethod != null) {
        try
        {
          localMethod.invoke(mPopup, new Object[] { Boolean.valueOf(paramBoolean) });
        }
        catch (Exception localException)
        {
          Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
        }
      }
    }
    else
    {
      Api29Impl.setTouchModal(mPopup, paramBoolean);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @DoNotInline
    public static void setEnterTransition(PopupWindow paramPopupWindow, Transition paramTransition)
    {
      paramPopupWindow.setEnterTransition(paramTransition);
    }
    
    @DoNotInline
    public static void setExitTransition(PopupWindow paramPopupWindow, Transition paramTransition)
    {
      paramPopupWindow.setExitTransition(paramTransition);
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static void setTouchModal(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      e.D(paramPopupWindow, paramBoolean);
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static class MenuDropDownListView
    extends DropDownListView
  {
    public final int mAdvanceKey;
    private MenuItemHoverListener mHoverListener;
    private MenuItem mHoveredMenuItem;
    public final int mRetreatKey;
    
    public MenuDropDownListView(Context paramContext, boolean paramBoolean)
    {
      super(paramBoolean);
      if (1 == Api17Impl.getLayoutDirection(paramContext.getResources().getConfiguration()))
      {
        mAdvanceKey = 21;
        mRetreatKey = 22;
      }
      else
      {
        mAdvanceKey = 22;
        mRetreatKey = 21;
      }
    }
    
    public void clearSelection()
    {
      setSelection(-1);
    }
    
    public boolean onHoverEvent(MotionEvent paramMotionEvent)
    {
      if (mHoverListener != null)
      {
        Object localObject1 = getAdapter();
        int i;
        Object localObject2;
        if ((localObject1 instanceof HeaderViewListAdapter))
        {
          localObject1 = (HeaderViewListAdapter)localObject1;
          i = ((HeaderViewListAdapter)localObject1).getHeadersCount();
          localObject2 = (MenuAdapter)((HeaderViewListAdapter)localObject1).getWrappedAdapter();
        }
        else
        {
          i = 0;
          localObject2 = (MenuAdapter)localObject1;
        }
        MenuItem localMenuItem = null;
        localObject1 = localMenuItem;
        if (paramMotionEvent.getAction() != 10)
        {
          int j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
          localObject1 = localMenuItem;
          if (j != -1)
          {
            i = j - i;
            localObject1 = localMenuItem;
            if (i >= 0)
            {
              localObject1 = localMenuItem;
              if (i < ((MenuAdapter)localObject2).getCount()) {
                localObject1 = ((MenuAdapter)localObject2).getItem(i);
              }
            }
          }
        }
        localMenuItem = mHoveredMenuItem;
        if (localMenuItem != localObject1)
        {
          localObject2 = ((MenuAdapter)localObject2).getAdapterMenu();
          if (localMenuItem != null) {
            mHoverListener.onItemHoverExit((MenuBuilder)localObject2, localMenuItem);
          }
          mHoveredMenuItem = ((MenuItem)localObject1);
          if (localObject1 != null) {
            mHoverListener.onItemHoverEnter((MenuBuilder)localObject2, (MenuItem)localObject1);
          }
        }
      }
      return super.onHoverEvent(paramMotionEvent);
    }
    
    public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    {
      ListMenuItemView localListMenuItemView = (ListMenuItemView)getSelectedView();
      if ((localListMenuItemView != null) && (paramInt == mAdvanceKey))
      {
        if ((localListMenuItemView.isEnabled()) && (localListMenuItemView.getItemData().hasSubMenu())) {
          performItemClick(localListMenuItemView, getSelectedItemPosition(), getSelectedItemId());
        }
        return true;
      }
      if ((localListMenuItemView != null) && (paramInt == mRetreatKey))
      {
        setSelection(-1);
        paramKeyEvent = getAdapter();
        if ((paramKeyEvent instanceof HeaderViewListAdapter)) {
          paramKeyEvent = (MenuAdapter)((HeaderViewListAdapter)paramKeyEvent).getWrappedAdapter();
        } else {
          paramKeyEvent = (MenuAdapter)paramKeyEvent;
        }
        paramKeyEvent.getAdapterMenu().close(false);
        return true;
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    
    public void setHoverListener(MenuItemHoverListener paramMenuItemHoverListener)
    {
      mHoverListener = paramMenuItemHoverListener;
    }
    
    @RequiresApi(17)
    public static class Api17Impl
    {
      @DoNotInline
      public static int getLayoutDirection(Configuration paramConfiguration)
      {
        return paramConfiguration.getLayoutDirection();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.MenuPopupWindow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */