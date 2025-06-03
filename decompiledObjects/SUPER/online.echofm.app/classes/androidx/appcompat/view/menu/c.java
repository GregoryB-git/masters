package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class c
  extends BaseAdapter
{
  public d o;
  public int p = -1;
  public boolean q;
  public final boolean r;
  public final LayoutInflater s;
  public final int t;
  
  public c(d paramd, LayoutInflater paramLayoutInflater, boolean paramBoolean, int paramInt)
  {
    r = paramBoolean;
    s = paramLayoutInflater;
    o = paramd;
    t = paramInt;
    a();
  }
  
  public void a()
  {
    e locale = o.t();
    if (locale != null)
    {
      ArrayList localArrayList = o.v();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++) {
        if ((e)localArrayList.get(j) == locale)
        {
          p = j;
          return;
        }
      }
    }
    p = -1;
  }
  
  public d b()
  {
    return o;
  }
  
  public e c(int paramInt)
  {
    ArrayList localArrayList;
    if (r) {
      localArrayList = o.v();
    } else {
      localArrayList = o.A();
    }
    int i = p;
    int j = paramInt;
    if (i >= 0)
    {
      j = paramInt;
      if (paramInt >= i) {
        j = paramInt + 1;
      }
    }
    return (e)localArrayList.get(j);
  }
  
  public void d(boolean paramBoolean)
  {
    q = paramBoolean;
  }
  
  public int getCount()
  {
    ArrayList localArrayList;
    if (r) {
      localArrayList = o.v();
    } else {
      localArrayList = o.A();
    }
    int i = p;
    int j = localArrayList.size();
    if (i < 0) {
      return j;
    }
    return j - 1;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null) {
      localView = s.inflate(t, paramViewGroup, false);
    }
    int i = c(paramInt).getGroupId();
    int j = paramInt - 1;
    if (j >= 0) {
      j = c(j).getGroupId();
    } else {
      j = i;
    }
    paramView = (ListMenuItemView)localView;
    boolean bool;
    if ((o.B()) && (i != j)) {
      bool = true;
    } else {
      bool = false;
    }
    paramView.setGroupDividerEnabled(bool);
    paramViewGroup = (h.a)localView;
    if (q) {
      paramView.setForceShowIcon(true);
    }
    paramViewGroup.d(c(paramInt), 0);
    return localView;
  }
  
  public void notifyDataSetChanged()
  {
    a();
    super.notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */