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
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

public abstract class d
  implements f, j, AdapterView.OnItemClickListener
{
  public Rect a;
  
  public static int l(e parame, Context paramContext, int paramInt)
  {
    int i = 0;
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = parame.getCount();
    int n = 0;
    int i1 = n;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    while (i < m)
    {
      int i2 = parame.getItemViewType(i);
      int i3 = i1;
      if (i2 != i1)
      {
        localObject2 = null;
        i3 = i2;
      }
      Object localObject3 = localObject1;
      if (localObject1 == null) {
        localObject3 = new FrameLayout(paramContext);
      }
      localObject2 = parame.getView(i, (View)localObject2, (ViewGroup)localObject3);
      ((View)localObject2).measure(j, k);
      i2 = ((View)localObject2).getMeasuredWidth();
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
      localObject1 = localObject3;
    }
    return n;
  }
  
  public static boolean t(androidx.appcompat.view.menu.f paramf)
  {
    int i = paramf.size();
    boolean bool1 = false;
    boolean bool2;
    for (int j = 0;; j++)
    {
      bool2 = bool1;
      if (j >= i) {
        break;
      }
      MenuItem localMenuItem = paramf.getItem(j);
      if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null))
      {
        bool2 = true;
        break;
      }
    }
    return bool2;
  }
  
  public final boolean e(h paramh)
  {
    return false;
  }
  
  public final void f(Context paramContext, androidx.appcompat.view.menu.f paramf) {}
  
  public final boolean j(h paramh)
  {
    return false;
  }
  
  public abstract void k(androidx.appcompat.view.menu.f paramf);
  
  public abstract void m(View paramView);
  
  public abstract void n(boolean paramBoolean);
  
  public abstract void o(int paramInt);
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramView = (ListAdapter)paramAdapterView.getAdapter();
    if ((paramView instanceof HeaderViewListAdapter)) {
      paramAdapterView = (e)((HeaderViewListAdapter)paramView).getWrappedAdapter();
    } else {
      paramAdapterView = (e)paramView;
    }
    paramAdapterView = a;
    paramView = (MenuItem)paramView.getItem(paramInt);
    if ((this instanceof b ^ true)) {
      paramInt = 0;
    } else {
      paramInt = 4;
    }
    paramAdapterView.q(paramView, this, paramInt);
  }
  
  public abstract void p(int paramInt);
  
  public abstract void q(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void r(boolean paramBoolean);
  
  public abstract void s(int paramInt);
}

/* Location:
 * Qualified Name:     k.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */