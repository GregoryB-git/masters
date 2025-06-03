package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

public abstract class b
  implements c, g, AdapterView.OnItemClickListener
{
  public Rect o;
  
  public static int o(ListAdapter paramListAdapter, ViewGroup paramViewGroup, Context paramContext, int paramInt)
  {
    int i = 0;
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = paramListAdapter.getCount();
    int n = 0;
    int i1 = n;
    Object localObject1 = null;
    Object localObject2 = paramViewGroup;
    paramViewGroup = (ViewGroup)localObject1;
    while (i < m)
    {
      int i2 = paramListAdapter.getItemViewType(i);
      int i3 = i1;
      if (i2 != i1)
      {
        paramViewGroup = null;
        i3 = i2;
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new FrameLayout(paramContext);
      }
      paramViewGroup = paramListAdapter.getView(i, paramViewGroup, (ViewGroup)localObject1);
      paramViewGroup.measure(j, k);
      i2 = paramViewGroup.getMeasuredWidth();
      if (i2 >= paramInt) {
        return paramInt;
      }
      i1 = n;
      if (i2 > n) {
        i1 = i2;
      }
      i++;
      n = i1;
      i1 = i3;
      localObject2 = localObject1;
    }
    return n;
  }
  
  public static boolean x(d paramd)
  {
    int i = paramd.size();
    boolean bool1 = false;
    boolean bool2;
    for (int j = 0;; j++)
    {
      bool2 = bool1;
      if (j >= i) {
        break;
      }
      MenuItem localMenuItem = paramd.getItem(j);
      if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null))
      {
        bool2 = true;
        break;
      }
    }
    return bool2;
  }
  
  public static androidx.appcompat.view.menu.c y(ListAdapter paramListAdapter)
  {
    if ((paramListAdapter instanceof HeaderViewListAdapter)) {
      return (androidx.appcompat.view.menu.c)((HeaderViewListAdapter)paramListAdapter).getWrappedAdapter();
    }
    return (androidx.appcompat.view.menu.c)paramListAdapter;
  }
  
  public void c(Context paramContext, d paramd) {}
  
  public boolean h(d paramd, e parame)
  {
    return false;
  }
  
  public boolean j(d paramd, e parame)
  {
    return false;
  }
  
  public abstract void l(d paramd);
  
  public boolean m()
  {
    return true;
  }
  
  public Rect n()
  {
    return o;
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = (ListAdapter)paramAdapterView.getAdapter();
    paramAdapterView = yo;
    paramView = (MenuItem)paramView.getItem(paramInt);
    if (m()) {
      paramInt = 0;
    } else {
      paramInt = 4;
    }
    paramAdapterView.I(paramView, this, paramInt);
  }
  
  public abstract void p(View paramView);
  
  public void q(Rect paramRect)
  {
    o = paramRect;
  }
  
  public abstract void r(boolean paramBoolean);
  
  public abstract void s(int paramInt);
  
  public abstract void t(int paramInt);
  
  public abstract void u(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void v(boolean paramBoolean);
  
  public abstract void w(int paramInt);
}

/* Location:
 * Qualified Name:     k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */