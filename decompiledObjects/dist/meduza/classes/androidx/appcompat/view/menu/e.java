package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class e
  extends BaseAdapter
{
  public f a;
  public int b = -1;
  public boolean c;
  public final boolean d;
  public final LayoutInflater e;
  public final int f;
  
  public e(f paramf, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt)
  {
    d = paramBoolean;
    e = paramLayoutInflater;
    a = paramf;
    f = paramInt;
    b();
  }
  
  public final void b()
  {
    Object localObject = a;
    h localh = w;
    if (localh != null)
    {
      ((f)localObject).i();
      localObject = j;
      int i = ((ArrayList)localObject).size();
      for (int j = 0; j < i; j++) {
        if ((h)((ArrayList)localObject).get(j) == localh)
        {
          b = j;
          return;
        }
      }
    }
    b = -1;
  }
  
  public final h c(int paramInt)
  {
    Object localObject;
    if (d)
    {
      localObject = a;
      ((f)localObject).i();
      localObject = j;
    }
    else
    {
      localObject = a.l();
    }
    int i = b;
    int j = paramInt;
    if (i >= 0)
    {
      j = paramInt;
      if (paramInt >= i) {
        j = paramInt + 1;
      }
    }
    return (h)((ArrayList)localObject).get(j);
  }
  
  public final int getCount()
  {
    Object localObject;
    if (d)
    {
      localObject = a;
      ((f)localObject).i();
      localObject = j;
    }
    else
    {
      localObject = a.l();
    }
    int i = b;
    int j = ((ArrayList)localObject).size();
    if (i < 0) {
      return j;
    }
    return j - 1;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool1 = false;
    View localView = paramView;
    if (paramView == null) {
      localView = e.inflate(f, paramViewGroup, false);
    }
    int i = cb;
    int j = paramInt - 1;
    if (j >= 0) {
      j = cb;
    } else {
      j = i;
    }
    paramView = (ListMenuItemView)localView;
    boolean bool2 = bool1;
    if (a.m())
    {
      bool2 = bool1;
      if (i != j) {
        bool2 = true;
      }
    }
    paramView.setGroupDividerEnabled(bool2);
    paramViewGroup = (k.a)localView;
    if (c) {
      paramView.setForceShowIcon(true);
    }
    paramViewGroup.c(c(paramInt));
    return localView;
  }
  
  public final void notifyDataSetChanged()
  {
    b();
    super.notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */