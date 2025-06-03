package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import g.a.a;
import j.b;
import java.util.ArrayList;

public final class Toolbar$f
  implements j
{
  public f a;
  public h b;
  
  public Toolbar$f(Toolbar paramToolbar) {}
  
  public final void b(f paramf, boolean paramBoolean) {}
  
  public final boolean c()
  {
    return false;
  }
  
  public final boolean e(h paramh)
  {
    Object localObject = c.q;
    if ((localObject instanceof b)) {
      ((b)localObject).onActionViewCollapsed();
    }
    localObject = c;
    ((ViewGroup)localObject).removeView(q);
    localObject = c;
    ((ViewGroup)localObject).removeView(p);
    localObject = c;
    q = null;
    int i = M.size();
    for (;;)
    {
      i--;
      if (i < 0) {
        break;
      }
      ((ViewGroup)localObject).addView((View)M.get(i));
    }
    M.clear();
    b = null;
    c.requestLayout();
    C = false;
    n.p(false);
    c.r();
    return true;
  }
  
  public final void f(Context paramContext, f paramf)
  {
    paramContext = a;
    if (paramContext != null)
    {
      h localh = b;
      if (localh != null) {
        paramContext.d(localh);
      }
    }
    a = paramf;
  }
  
  public final void g()
  {
    if (b != null)
    {
      f localf = a;
      int i = 0;
      int j = i;
      if (localf != null)
      {
        int k = localf.size();
        for (int m = 0;; m++)
        {
          j = i;
          if (m >= k) {
            break;
          }
          if (a.getItem(m) == b)
          {
            j = 1;
            break;
          }
        }
      }
      if (j == 0) {
        e(b);
      }
    }
  }
  
  public final boolean i(m paramm)
  {
    return false;
  }
  
  public final boolean j(h paramh)
  {
    c.c();
    Object localObject1 = c.p.getParent();
    Object localObject2 = c;
    if (localObject1 != localObject2)
    {
      if ((localObject1 instanceof ViewGroup)) {
        ((ViewGroup)localObject1).removeView(p);
      }
      localObject2 = c;
      ((ViewGroup)localObject2).addView(p);
    }
    c.q = paramh.getActionView();
    b = paramh;
    localObject2 = c.q.getParent();
    localObject1 = c;
    if (localObject2 != localObject1)
    {
      if ((localObject2 instanceof ViewGroup)) {
        ((ViewGroup)localObject2).removeView(q);
      }
      c.getClass();
      localObject1 = new Toolbar.g();
      localObject2 = c;
      a = (0x800003 | v & 0x70);
      b = 2;
      q.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject2 = c;
      ((ViewGroup)localObject2).addView(q);
    }
    localObject2 = c;
    int i = ((ViewGroup)localObject2).getChildCount();
    for (;;)
    {
      int j = i - 1;
      if (j < 0) {
        break;
      }
      localObject1 = ((ViewGroup)localObject2).getChildAt(j);
      i = j;
      if (getLayoutParamsb != 2)
      {
        i = j;
        if (localObject1 != a)
        {
          ((ViewGroup)localObject2).removeViewAt(j);
          M.add(localObject1);
          i = j;
        }
      }
    }
    c.requestLayout();
    C = true;
    n.p(false);
    paramh = c.q;
    if ((paramh instanceof b)) {
      ((b)paramh).onActionViewExpanded();
    }
    c.r();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */