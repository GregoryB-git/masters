package androidx.appcompat.view.menu;

import I.e;
import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class f
{
  public final Context a;
  public final d b;
  public final boolean c;
  public final int d;
  public final int e;
  public View f;
  public int g = 8388611;
  public boolean h;
  public g.a i;
  public k.b j;
  public PopupWindow.OnDismissListener k;
  public final PopupWindow.OnDismissListener l = new a();
  
  public f(Context paramContext, d paramd, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramd, paramView, paramBoolean, paramInt, 0);
  }
  
  public f(Context paramContext, d paramd, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    a = paramContext;
    b = paramd;
    f = paramView;
    c = paramBoolean;
    d = paramInt1;
    e = paramInt2;
  }
  
  public final k.b a()
  {
    Object localObject = ((WindowManager)a.getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    ((Display)localObject).getRealSize(localPoint);
    if (Math.min(x, y) >= a.getResources().getDimensionPixelSize(e.c.a)) {
      localObject = new b(a, f, d, e, c);
    } else {
      localObject = new i(a, b, f, d, e, c);
    }
    ((k.b)localObject).l(b);
    ((k.b)localObject).u(l);
    ((k.b)localObject).p(f);
    ((g)localObject).k(i);
    ((k.b)localObject).r(h);
    ((k.b)localObject).s(g);
    return (k.b)localObject;
  }
  
  public void b()
  {
    if (d()) {
      j.dismiss();
    }
  }
  
  public k.b c()
  {
    if (j == null) {
      j = a();
    }
    return j;
  }
  
  public boolean d()
  {
    k.b localb = j;
    boolean bool;
    if ((localb != null) && (localb.i())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void e()
  {
    j = null;
    PopupWindow.OnDismissListener localOnDismissListener = k;
    if (localOnDismissListener != null) {
      localOnDismissListener.onDismiss();
    }
  }
  
  public void f(View paramView)
  {
    f = paramView;
  }
  
  public void g(boolean paramBoolean)
  {
    h = paramBoolean;
    k.b localb = j;
    if (localb != null) {
      localb.r(paramBoolean);
    }
  }
  
  public void h(int paramInt)
  {
    g = paramInt;
  }
  
  public void i(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    k = paramOnDismissListener;
  }
  
  public void j(g.a parama)
  {
    i = parama;
    k.b localb = j;
    if (localb != null) {
      localb.k(parama);
    }
  }
  
  public void k()
  {
    if (m()) {
      return;
    }
    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }
  
  public final void l(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    k.b localb = c();
    localb.v(paramBoolean2);
    if (paramBoolean1)
    {
      int m = paramInt1;
      if ((e.a(g, s.m(f)) & 0x7) == 5) {
        m = paramInt1 - f.getWidth();
      }
      localb.t(m);
      localb.w(paramInt2);
      paramInt1 = (int)(a.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
      localb.q(new Rect(m - paramInt1, paramInt2 - paramInt1, m + paramInt1, paramInt2 + paramInt1));
    }
    localb.a();
  }
  
  public boolean m()
  {
    if (d()) {
      return true;
    }
    if (f == null) {
      return false;
    }
    l(0, 0, false, false);
    return true;
  }
  
  public boolean n(int paramInt1, int paramInt2)
  {
    if (d()) {
      return true;
    }
    if (f == null) {
      return false;
    }
    l(paramInt1, paramInt2, true, true);
    return true;
  }
  
  public class a
    implements PopupWindow.OnDismissListener
  {
    public a() {}
    
    public void onDismiss()
    {
      e();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */