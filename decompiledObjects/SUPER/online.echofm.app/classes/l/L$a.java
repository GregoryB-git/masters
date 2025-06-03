package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;

public class L$a
  extends C
{
  public final int B;
  public final int C;
  public J D;
  public MenuItem E;
  
  public L$a(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, paramBoolean);
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

/* Location:
 * Qualified Name:     l.L.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */