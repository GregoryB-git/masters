package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

public final class p0$c
  extends j0
{
  public final int u;
  public final int v;
  public o0 w;
  public h x;
  
  public p0$c(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, paramBoolean);
    if (1 == a.a(paramContext.getResources().getConfiguration()))
    {
      u = 21;
      v = 22;
    }
    else
    {
      u = 22;
      v = 21;
    }
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    if (w != null)
    {
      Object localObject1 = getAdapter();
      int i;
      if ((localObject1 instanceof HeaderViewListAdapter))
      {
        localObject1 = (HeaderViewListAdapter)localObject1;
        i = ((HeaderViewListAdapter)localObject1).getHeadersCount();
        localObject1 = ((HeaderViewListAdapter)localObject1).getWrappedAdapter();
      }
      else
      {
        i = 0;
      }
      Object localObject2 = (e)localObject1;
      h localh = null;
      localObject1 = localh;
      if (paramMotionEvent.getAction() != 10)
      {
        int j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
        localObject1 = localh;
        if (j != -1)
        {
          i = j - i;
          localObject1 = localh;
          if (i >= 0)
          {
            localObject1 = localh;
            if (i < ((e)localObject2).getCount()) {
              localObject1 = ((e)localObject2).c(i);
            }
          }
        }
      }
      localh = x;
      if (localh != localObject1)
      {
        localObject2 = a;
        if (localh != null) {
          w.f((f)localObject2, localh);
        }
        x = ((h)localObject1);
        if (localObject1 != null) {
          w.c((f)localObject2, (h)localObject1);
        }
      }
    }
    return super.onHoverEvent(paramMotionEvent);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = (ListMenuItemView)getSelectedView();
    if ((localObject != null) && (paramInt == u))
    {
      if ((((View)localObject).isEnabled()) && (((ListMenuItemView)localObject).getItemData().hasSubMenu())) {
        performItemClick((View)localObject, getSelectedItemPosition(), getSelectedItemId());
      }
      return true;
    }
    if ((localObject != null) && (paramInt == v))
    {
      setSelection(-1);
      localObject = getAdapter();
      paramKeyEvent = (KeyEvent)localObject;
      if ((localObject instanceof HeaderViewListAdapter)) {
        paramKeyEvent = ((HeaderViewListAdapter)localObject).getWrappedAdapter();
      }
      a.c(false);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void setHoverListener(o0 paramo0)
  {
    w = paramo0;
  }
  
  public static final class a
  {
    public static int a(Configuration paramConfiguration)
    {
      return paramConfiguration.getLayoutDirection();
    }
  }
}

/* Location:
 * Qualified Name:     l.p0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */