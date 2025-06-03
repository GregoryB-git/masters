package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
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
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import e0.d0;
import k.d;
import l.j0;
import l.n0;
import l.p0;

public final class l
  extends d
  implements PopupWindow.OnDismissListener, View.OnKeyListener
{
  public int A;
  public int B = 0;
  public boolean C;
  public final Context b;
  public final f c;
  public final e d;
  public final boolean e;
  public final int f;
  public final int o;
  public final int p;
  public final p0 q;
  public final a r = new a();
  public final b s = new b();
  public PopupWindow.OnDismissListener t;
  public View u;
  public View v;
  public j.a w;
  public ViewTreeObserver x;
  public boolean y;
  public boolean z;
  
  public l(int paramInt1, int paramInt2, Context paramContext, View paramView, f paramf, boolean paramBoolean)
  {
    b = paramContext;
    c = paramf;
    e = paramBoolean;
    d = new e(paramf, LayoutInflater.from(paramContext), paramBoolean, 2131558419);
    o = paramInt1;
    p = paramInt2;
    Resources localResources = paramContext.getResources();
    f = Math.max(getDisplayMetricswidthPixels / 2, localResources.getDimensionPixelSize(2131165207));
    u = paramView;
    q = new p0(paramContext, paramInt1, paramInt2);
    paramf.b(this, paramContext);
  }
  
  public final boolean a()
  {
    boolean bool;
    if ((!y) && (q.a())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b(f paramf, boolean paramBoolean)
  {
    if (paramf != c) {
      return;
    }
    dismiss();
    j.a locala = w;
    if (locala != null) {
      locala.b(paramf, paramBoolean);
    }
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final void d(j.a parama)
  {
    w = parama;
  }
  
  public final void dismiss()
  {
    if (a()) {
      q.dismiss();
    }
  }
  
  public final void g()
  {
    z = false;
    e locale = d;
    if (locale != null) {
      locale.notifyDataSetChanged();
    }
  }
  
  public final j0 h()
  {
    return q.c;
  }
  
  public final boolean i(m paramm)
  {
    if (paramm.hasVisibleItems())
    {
      Object localObject1 = b;
      Object localObject2 = v;
      boolean bool = e;
      localObject2 = new i(o, p, (Context)localObject1, (View)localObject2, paramm, bool);
      Object localObject3 = w;
      i = ((j.a)localObject3);
      localObject1 = j;
      if (localObject1 != null) {
        ((j)localObject1).d((j.a)localObject3);
      }
      bool = d.t(paramm);
      h = bool;
      localObject1 = j;
      if (localObject1 != null) {
        ((d)localObject1).n(bool);
      }
      k = t;
      t = null;
      c.c(false);
      localObject1 = q;
      int i = f;
      int j = ((n0)localObject1).n();
      int k = B;
      localObject3 = u;
      localObject1 = d0.a;
      int m = i;
      if ((Gravity.getAbsoluteGravity(k, ((View)localObject3).getLayoutDirection()) & 0x7) == 5) {
        m = i + u.getWidth();
      }
      if (!((i)localObject2).b())
      {
        if (f == null) {
          m = 0;
        } else {
          ((i)localObject2).d(m, j, true, true);
        }
      }
      else {
        m = 1;
      }
      if (m != 0)
      {
        localObject2 = w;
        if (localObject2 != null) {
          ((j.a)localObject2).c(paramm);
        }
        return true;
      }
    }
    return false;
  }
  
  public final void k(f paramf) {}
  
  public final void m(View paramView)
  {
    u = paramView;
  }
  
  public final void n(boolean paramBoolean)
  {
    d.c = paramBoolean;
  }
  
  public final void o(int paramInt)
  {
    B = paramInt;
  }
  
  public final void onDismiss()
  {
    y = true;
    c.c(true);
    Object localObject = x;
    if (localObject != null)
    {
      if (!((ViewTreeObserver)localObject).isAlive()) {
        x = v.getViewTreeObserver();
      }
      x.removeGlobalOnLayoutListener(r);
      x = null;
    }
    v.removeOnAttachStateChangeListener(s);
    localObject = t;
    if (localObject != null) {
      ((PopupWindow.OnDismissListener)localObject).onDismiss();
    }
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public final void p(int paramInt)
  {
    q.f = paramInt;
  }
  
  public final void q(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    t = paramOnDismissListener;
  }
  
  public final void r(boolean paramBoolean)
  {
    C = paramBoolean;
  }
  
  public final void s(int paramInt)
  {
    q.k(paramInt);
  }
  
  public final void show()
  {
    boolean bool = a();
    int i = 1;
    int j;
    if (bool)
    {
      j = i;
    }
    else
    {
      if (!y)
      {
        Object localObject1 = u;
        if (localObject1 != null)
        {
          v = ((View)localObject1);
          q.G.setOnDismissListener(this);
          localObject1 = q;
          x = this;
          F = true;
          G.setFocusable(true);
          localObject1 = v;
          if (x == null) {
            j = 1;
          } else {
            j = 0;
          }
          Object localObject2 = ((View)localObject1).getViewTreeObserver();
          x = ((ViewTreeObserver)localObject2);
          if (j != 0) {
            ((ViewTreeObserver)localObject2).addOnGlobalLayoutListener(r);
          }
          ((View)localObject1).addOnAttachStateChangeListener(s);
          localObject2 = q;
          w = ((View)localObject1);
          t = B;
          if (!z)
          {
            A = d.l(d, b, f);
            z = true;
          }
          q.q(A);
          q.G.setInputMethodMode(2);
          localObject2 = q;
          localObject1 = a;
          if (localObject1 != null)
          {
            localObject2.getClass();
            localObject1 = new Rect((Rect)localObject1);
          }
          else
          {
            localObject1 = null;
          }
          E = ((Rect)localObject1);
          q.show();
          localObject1 = q.c;
          ((View)localObject1).setOnKeyListener(this);
          if ((C) && (c.m != null))
          {
            FrameLayout localFrameLayout = (FrameLayout)LayoutInflater.from(b).inflate(2131558418, (ViewGroup)localObject1, false);
            localObject2 = (TextView)localFrameLayout.findViewById(16908310);
            if (localObject2 != null) {
              ((TextView)localObject2).setText(c.m);
            }
            localFrameLayout.setEnabled(false);
            ((ListView)localObject1).addHeaderView(localFrameLayout, null, false);
          }
          q.o(d);
          q.show();
          j = i;
          break label388;
        }
      }
      j = 0;
    }
    label388:
    if (j != 0) {
      return;
    }
    throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
  }
  
  public final class a
    implements ViewTreeObserver.OnGlobalLayoutListener
  {
    public a() {}
    
    public final void onGlobalLayout()
    {
      if (a())
      {
        Object localObject = l.this;
        if (!q.F)
        {
          localObject = v;
          if ((localObject != null) && (((View)localObject).isShown())) {
            q.show();
          } else {
            dismiss();
          }
        }
      }
    }
  }
  
  public final class b
    implements View.OnAttachStateChangeListener
  {
    public b() {}
    
    public final void onViewAttachedToWindow(View paramView) {}
    
    public final void onViewDetachedFromWindow(View paramView)
    {
      Object localObject = x;
      if (localObject != null)
      {
        if (!((ViewTreeObserver)localObject).isAlive()) {
          x = paramView.getViewTreeObserver();
        }
        localObject = l.this;
        x.removeGlobalOnLayoutListener(r);
      }
      paramView.removeOnAttachStateChangeListener(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */