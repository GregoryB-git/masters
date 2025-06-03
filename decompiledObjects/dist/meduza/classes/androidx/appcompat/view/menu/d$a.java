package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class d$a
  extends BaseAdapter
{
  public int a = -1;
  
  public d$a(d paramd)
  {
    b();
  }
  
  public final void b()
  {
    Object localObject = b.c;
    h localh = w;
    if (localh != null)
    {
      ((f)localObject).i();
      localObject = j;
      int i = ((ArrayList)localObject).size();
      for (int j = 0; j < i; j++) {
        if ((h)((ArrayList)localObject).get(j) == localh)
        {
          a = j;
          return;
        }
      }
    }
    a = -1;
  }
  
  public final h c(int paramInt)
  {
    Object localObject = b.c;
    ((f)localObject).i();
    localObject = j;
    b.getClass();
    int i = paramInt + 0;
    int j = a;
    paramInt = i;
    if (j >= 0)
    {
      paramInt = i;
      if (i >= j) {
        paramInt = i + 1;
      }
    }
    return (h)((ArrayList)localObject).get(paramInt);
  }
  
  public final int getCount()
  {
    f localf = b.c;
    localf.i();
    int i = j.size();
    b.getClass();
    i += 0;
    if (a < 0) {
      return i;
    }
    return i - 1;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null) {
      localView = b.b.inflate(2131558416, paramViewGroup, false);
    }
    ((k.a)localView).c(c(paramInt));
    return localView;
  }
  
  public final void notifyDataSetChanged()
  {
    b();
    super.notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */