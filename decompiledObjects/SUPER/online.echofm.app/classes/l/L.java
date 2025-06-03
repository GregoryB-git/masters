package l;

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
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import java.lang.reflect.Method;

public class L
  extends I
  implements J
{
  public static Method Y;
  public J X;
  
  static
  {
    try
    {
      if (Build.VERSION.SDK_INT <= 28) {
        Y = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { Boolean.TYPE });
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
    }
  }
  
  public L(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public void E(Object paramObject)
  {
    T.setEnterTransition((Transition)paramObject);
  }
  
  public void F(Object paramObject)
  {
    T.setExitTransition((Transition)paramObject);
  }
  
  public void G(J paramJ)
  {
    X = paramJ;
  }
  
  public void H(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      Method localMethod = Y;
      if (localMethod != null) {
        try
        {
          localMethod.invoke(T, new Object[] { Boolean.valueOf(paramBoolean) });
        }
        catch (Exception localException)
        {
          Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
        }
      }
    }
    else
    {
      K.a(T, paramBoolean);
    }
  }
  
  public void b(d paramd, MenuItem paramMenuItem)
  {
    J localJ = X;
    if (localJ != null) {
      localJ.b(paramd, paramMenuItem);
    }
  }
  
  public void c(d paramd, MenuItem paramMenuItem)
  {
    J localJ = X;
    if (localJ != null) {
      localJ.c(paramd, paramMenuItem);
    }
  }
  
  public C g(Context paramContext, boolean paramBoolean)
  {
    paramContext = new a(paramContext, paramBoolean);
    paramContext.setHoverListener(this);
    return paramContext;
  }
  
  public static class a
    extends C
  {
    public final int B;
    public final int C;
    public J D;
    public MenuItem E;
    
    public a(Context paramContext, boolean paramBoolean)
    {
      super(paramBoolean);
      if (1 == paramContext.getResources().getConfiguration().getLayoutDirection())
      {
        B = 21;
        C = 22;
      }
      else
      {
        B = 22;
        C = 21;
      }
    }
    
    public boolean onHoverEvent(MotionEvent paramMotionEvent)
    {
      if (D != null)
      {
        Object localObject = getAdapter();
        int i;
        if ((localObject instanceof HeaderViewListAdapter))
        {
          localObject = (HeaderViewListAdapter)localObject;
          i = ((HeaderViewListAdapter)localObject).getHeadersCount();
          localObject = (c)((HeaderViewListAdapter)localObject).getWrappedAdapter();
        }
        else
        {
          localObject = (c)localObject;
          i = 0;
        }
        if (paramMotionEvent.getAction() != 10)
        {
          int j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
          if (j != -1)
          {
            i = j - i;
            if ((i >= 0) && (i < ((c)localObject).getCount()))
            {
              locale = ((c)localObject).c(i);
              break label108;
            }
          }
        }
        e locale = null;
        label108:
        MenuItem localMenuItem = E;
        if (localMenuItem != locale)
        {
          localObject = ((c)localObject).b();
          if (localMenuItem != null) {
            D.c((d)localObject, localMenuItem);
          }
          E = locale;
          if (locale != null) {
            D.b((d)localObject, locale);
          }
        }
      }
      return super.onHoverEvent(paramMotionEvent);
    }
    
    public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    {
      ListMenuItemView localListMenuItemView = (ListMenuItemView)getSelectedView();
      if ((localListMenuItemView != null) && (paramInt == B))
      {
        if ((localListMenuItemView.isEnabled()) && (localListMenuItemView.getItemData().hasSubMenu())) {
          performItemClick(localListMenuItemView, getSelectedItemPosition(), getSelectedItemId());
        }
        return true;
      }
      if ((localListMenuItemView != null) && (paramInt == C))
      {
        setSelection(-1);
        ((c)getAdapter()).b().d(false);
        return true;
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    
    public void setHoverListener(J paramJ)
    {
      D = paramJ;
    }
  }
}

/* Location:
 * Qualified Name:     l.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */