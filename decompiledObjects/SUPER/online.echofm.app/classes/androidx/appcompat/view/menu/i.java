package androidx.appcompat.view.menu;

import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import k.b;
import l.I;
import l.L;

public final class i
  extends b
  implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, g, View.OnKeyListener
{
  public static final int J = e.f.j;
  public View A;
  public View B;
  public g.a C;
  public ViewTreeObserver D;
  public boolean E;
  public boolean F;
  public int G;
  public int H = 0;
  public boolean I;
  public final Context p;
  public final d q;
  public final c r;
  public final boolean s;
  public final int t;
  public final int u;
  public final int v;
  public final L w;
  public final ViewTreeObserver.OnGlobalLayoutListener x = new a();
  public final View.OnAttachStateChangeListener y = new b();
  public PopupWindow.OnDismissListener z;
  
  public i(Context paramContext, d paramd, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    p = paramContext;
    q = paramd;
    s = paramBoolean;
    r = new c(paramd, LayoutInflater.from(paramContext), paramBoolean, J);
    u = paramInt1;
    v = paramInt2;
    Resources localResources = paramContext.getResources();
    t = Math.max(getDisplayMetricswidthPixels / 2, localResources.getDimensionPixelSize(e.c.b));
    A = paramView;
    w = new L(paramContext, null, paramInt1, paramInt2);
    paramd.b(this, paramContext);
  }
  
  public void a()
  {
    if (z()) {
      return;
    }
    throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
  }
  
  public void b(d paramd, boolean paramBoolean)
  {
    if (paramd != q) {
      return;
    }
    dismiss();
    g.a locala = C;
    if (locala != null) {
      locala.b(paramd, paramBoolean);
    }
  }
  
  public ListView d()
  {
    return w.d();
  }
  
  public void dismiss()
  {
    if (i()) {
      w.dismiss();
    }
  }
  
  public boolean e(j paramj)
  {
    if (paramj.hasVisibleItems())
    {
      Object localObject = new f(p, paramj, B, s, u, v);
      ((f)localObject).j(C);
      ((f)localObject).g(b.x(paramj));
      ((f)localObject).i(z);
      z = null;
      q.d(false);
      int i = w.j();
      int j = w.l();
      int k = i;
      if ((Gravity.getAbsoluteGravity(H, s.m(A)) & 0x7) == 5) {
        k = i + A.getWidth();
      }
      if (((f)localObject).n(k, j))
      {
        localObject = C;
        if (localObject != null) {
          ((g.a)localObject).c(paramj);
        }
        return true;
      }
    }
    return false;
  }
  
  public void f(boolean paramBoolean)
  {
    F = false;
    c localc = r;
    if (localc != null) {
      localc.notifyDataSetChanged();
    }
  }
  
  public boolean g()
  {
    return false;
  }
  
  public boolean i()
  {
    boolean bool;
    if ((!E) && (w.i())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void k(g.a parama)
  {
    C = parama;
  }
  
  public void l(d paramd) {}
  
  public void onDismiss()
  {
    E = true;
    q.close();
    Object localObject = D;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        D = B.getViewTreeObserver();
      }
      D.removeGlobalOnLayoutListener(x);
      D = null;
    }
    B.removeOnAttachStateChangeListener(y);
    localObject = z;
    if (localObject != null) {
      ((PopupWindow.OnDismissListener)localObject).onDismiss();
    }
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public void p(View paramView)
  {
    A = paramView;
  }
  
  public void r(boolean paramBoolean)
  {
    r.d(paramBoolean);
  }
  
  public void s(int paramInt)
  {
    H = paramInt;
  }
  
  public void t(int paramInt)
  {
    w.v(paramInt);
  }
  
  public void u(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    z = paramOnDismissListener;
  }
  
  public void v(boolean paramBoolean)
  {
    I = paramBoolean;
  }
  
  public void w(int paramInt)
  {
    w.C(paramInt);
  }
  
  public final boolean z()
  {
    if (i()) {
      return true;
    }
    if (!E)
    {
      Object localObject1 = A;
      if (localObject1 != null)
      {
        B = ((View)localObject1);
        w.y(this);
        w.z(this);
        w.x(true);
        localObject1 = B;
        int i;
        if (D == null) {
          i = 1;
        } else {
          i = 0;
        }
        Object localObject2 = ((View)localObject1).getViewTreeObserver();
        D = ((ViewTreeObserver)localObject2);
        if (i != 0) {
          ((ViewTreeObserver)localObject2).addOnGlobalLayoutListener(x);
        }
        ((View)localObject1).addOnAttachStateChangeListener(y);
        w.q((View)localObject1);
        w.t(H);
        if (!F)
        {
          G = b.o(r, null, p, t);
          F = true;
        }
        w.s(G);
        w.w(2);
        w.u(n());
        w.a();
        localObject1 = w.d();
        ((View)localObject1).setOnKeyListener(this);
        if ((I) && (q.u() != null))
        {
          FrameLayout localFrameLayout = (FrameLayout)LayoutInflater.from(p).inflate(e.f.i, (ViewGroup)localObject1, false);
          localObject2 = (TextView)localFrameLayout.findViewById(16908310);
          if (localObject2 != null) {
            ((TextView)localObject2).setText(q.u());
          }
          localFrameLayout.setEnabled(false);
          ((ListView)localObject1).addHeaderView(localFrameLayout, null, false);
        }
        w.p(r);
        w.a();
        return true;
      }
    }
    return false;
  }
  
  public class a
    implements ViewTreeObserver.OnGlobalLayoutListener
  {
    public a() {}
    
    public void onGlobalLayout()
    {
      if ((i()) && (!w.n()))
      {
        View localView = B;
        if ((localView != null) && (localView.isShown())) {
          w.a();
        } else {
          dismiss();
        }
      }
    }
  }
  
  public class b
    implements View.OnAttachStateChangeListener
  {
    public b() {}
    
    public void onViewAttachedToWindow(View paramView) {}
    
    public void onViewDetachedFromWindow(View paramView)
    {
      Object localObject = D;
      if (localObject != null)
      {
        if (!((ViewTreeObserver)localObject).isAlive()) {
          D = paramView.getViewTreeObserver();
        }
        localObject = i.this;
        D.removeGlobalOnLayoutListener(x);
      }
      paramView.removeOnAttachStateChangeListener(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */