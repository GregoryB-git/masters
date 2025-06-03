package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class a
  implements g
{
  public Context o;
  public Context p;
  public d q;
  public LayoutInflater r;
  public LayoutInflater s;
  public g.a t;
  public int u;
  public int v;
  public h w;
  
  public a(Context paramContext, int paramInt1, int paramInt2)
  {
    o = paramContext;
    r = LayoutInflater.from(paramContext);
    u = paramInt1;
    v = paramInt2;
  }
  
  public void a(View paramView, int paramInt)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    if (localViewGroup != null) {
      localViewGroup.removeView(paramView);
    }
    ((ViewGroup)w).addView(paramView, paramInt);
  }
  
  public void b(d paramd, boolean paramBoolean)
  {
    g.a locala = t;
    if (locala != null) {
      locala.b(paramd, paramBoolean);
    }
  }
  
  public void c(Context paramContext, d paramd)
  {
    p = paramContext;
    s = LayoutInflater.from(paramContext);
    q = paramd;
  }
  
  public abstract void d(e parame, h.a parama);
  
  public boolean e(j paramj)
  {
    g.a locala = t;
    if (locala != null)
    {
      if (paramj == null) {
        paramj = q;
      }
      return locala.c(paramj);
    }
    return false;
  }
  
  public void f(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)w;
    if (localViewGroup == null) {
      return;
    }
    Object localObject = q;
    int i = 0;
    if (localObject != null)
    {
      ((d)localObject).q();
      ArrayList localArrayList = q.A();
      int j = localArrayList.size();
      int k = 0;
      int m;
      for (i = k; k < j; i = m)
      {
        e locale = (e)localArrayList.get(k);
        m = i;
        if (o(i, locale))
        {
          View localView1 = localViewGroup.getChildAt(i);
          if ((localView1 instanceof h.a)) {
            localObject = ((h.a)localView1).getItemData();
          } else {
            localObject = null;
          }
          View localView2 = n(locale, localView1, localViewGroup);
          if (locale != localObject)
          {
            localView2.setPressed(false);
            localView2.jumpDrawablesToCurrentState();
          }
          if (localView2 != localView1) {
            a(localView2, i);
          }
          m = i + 1;
        }
        k++;
      }
    }
    while (i < localViewGroup.getChildCount()) {
      if (!l(localViewGroup, i)) {
        i++;
      }
    }
  }
  
  public boolean h(d paramd, e parame)
  {
    return false;
  }
  
  public h.a i(ViewGroup paramViewGroup)
  {
    return (h.a)r.inflate(v, paramViewGroup, false);
  }
  
  public boolean j(d paramd, e parame)
  {
    return false;
  }
  
  public void k(g.a parama)
  {
    t = parama;
  }
  
  public boolean l(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public g.a m()
  {
    return t;
  }
  
  public View n(e parame, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof h.a)) {
      paramView = (h.a)paramView;
    } else {
      paramView = i(paramViewGroup);
    }
    d(parame, paramView);
    return (View)paramView;
  }
  
  public abstract boolean o(int paramInt, e parame);
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */