package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import e0.d0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.d;
import l.j0;
import l.n0;
import l.o0;
import l.p0;
import l.p0.a;
import l.p0.b;

public final class b
  extends d
  implements View.OnKeyListener, PopupWindow.OnDismissListener
{
  public boolean A;
  public int B;
  public int C;
  public boolean D;
  public boolean E;
  public j.a F;
  public ViewTreeObserver G;
  public PopupWindow.OnDismissListener H;
  public boolean I;
  public final Context b;
  public final int c;
  public final int d;
  public final int e;
  public final boolean f;
  public final Handler o;
  public final ArrayList p = new ArrayList();
  public final ArrayList q = new ArrayList();
  public final a r = new a();
  public final b s = new b();
  public final c t = new c();
  public int u;
  public int v;
  public View w;
  public View x;
  public int y;
  public boolean z;
  
  public b(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    u = 0;
    v = 0;
    b = paramContext;
    w = paramView;
    d = paramInt1;
    e = paramInt2;
    f = paramBoolean;
    D = false;
    WeakHashMap localWeakHashMap = d0.a;
    if (paramView.getLayoutDirection() == 1) {
      paramInt1 = i;
    } else {
      paramInt1 = 1;
    }
    y = paramInt1;
    paramContext = paramContext.getResources();
    c = Math.max(getDisplayMetricswidthPixels / 2, paramContext.getDimensionPixelSize(2131165207));
    o = new Handler();
  }
  
  public final boolean a()
  {
    int i = q.size();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0)
    {
      bool2 = bool1;
      if (q.get(0)).a.a()) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final void b(f paramf, boolean paramBoolean)
  {
    int i = q.size();
    for (int j = 0; j < i; j++) {
      if (paramf == q.get(j)).b) {
        break label48;
      }
    }
    j = -1;
    label48:
    if (j < 0) {
      return;
    }
    i = j + 1;
    if (i < q.size()) {
      q.get(i)).b.c(false);
    }
    Object localObject = (d)q.remove(j);
    b.r(this);
    if (I)
    {
      p0.a.b(a.G, null);
      a.G.setAnimationStyle(0);
    }
    a.dismiss();
    i = q.size();
    if (i > 0)
    {
      j = q.get(i - 1)).c;
    }
    else
    {
      localObject = w;
      WeakHashMap localWeakHashMap = d0.a;
      if (((View)localObject).getLayoutDirection() == 1) {
        j = 0;
      } else {
        j = 1;
      }
    }
    y = j;
    if (i == 0)
    {
      dismiss();
      localObject = F;
      if (localObject != null) {
        ((j.a)localObject).b(paramf, true);
      }
      paramf = G;
      if (paramf != null)
      {
        if (paramf.isAlive()) {
          G.removeGlobalOnLayoutListener(r);
        }
        G = null;
      }
      x.removeOnAttachStateChangeListener(s);
      H.onDismiss();
    }
    else if (paramBoolean)
    {
      q.get(0)).b.c(false);
    }
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final void d(j.a parama)
  {
    F = parama;
  }
  
  public final void dismiss()
  {
    int i = q.size();
    if (i > 0)
    {
      d[] arrayOfd = (d[])q.toArray(new d[i]);
      for (;;)
      {
        int j = i - 1;
        if (j < 0) {
          break;
        }
        d locald = arrayOfd[j];
        i = j;
        if (a.a())
        {
          a.dismiss();
          i = j;
        }
      }
    }
  }
  
  public final void g()
  {
    Iterator localIterator = q.iterator();
    while (localIterator.hasNext())
    {
      ListAdapter localListAdapter1 = nexta.c.getAdapter();
      ListAdapter localListAdapter2 = localListAdapter1;
      if ((localListAdapter1 instanceof HeaderViewListAdapter)) {
        localListAdapter2 = ((HeaderViewListAdapter)localListAdapter1).getWrappedAdapter();
      }
      ((e)localListAdapter2).notifyDataSetChanged();
    }
  }
  
  public final j0 h()
  {
    Object localObject;
    if (q.isEmpty())
    {
      localObject = null;
    }
    else
    {
      localObject = q;
      localObject = getsize1a.c;
    }
    return (j0)localObject;
  }
  
  public final boolean i(m paramm)
  {
    Iterator localIterator = q.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (d)localIterator.next();
      if (paramm == b)
      {
        a.c.requestFocus();
        return true;
      }
    }
    if (paramm.hasVisibleItems())
    {
      k(paramm);
      localObject = F;
      if (localObject != null) {
        ((j.a)localObject).c(paramm);
      }
      return true;
    }
    return false;
  }
  
  public final void k(f paramf)
  {
    paramf.b(this, b);
    if (a()) {
      u(paramf);
    } else {
      p.add(paramf);
    }
  }
  
  public final void m(View paramView)
  {
    if (w != paramView)
    {
      w = paramView;
      int i = u;
      WeakHashMap localWeakHashMap = d0.a;
      v = Gravity.getAbsoluteGravity(i, paramView.getLayoutDirection());
    }
  }
  
  public final void n(boolean paramBoolean)
  {
    D = paramBoolean;
  }
  
  public final void o(int paramInt)
  {
    if (u != paramInt)
    {
      u = paramInt;
      View localView = w;
      WeakHashMap localWeakHashMap = d0.a;
      v = Gravity.getAbsoluteGravity(paramInt, localView.getLayoutDirection());
    }
  }
  
  public final void onDismiss()
  {
    int i = q.size();
    for (int j = 0; j < i; j++)
    {
      locald = (d)q.get(j);
      if (!a.a()) {
        break label48;
      }
    }
    d locald = null;
    label48:
    if (locald != null) {
      b.c(false);
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
    z = true;
    B = paramInt;
  }
  
  public final void q(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    H = paramOnDismissListener;
  }
  
  public final void r(boolean paramBoolean)
  {
    E = paramBoolean;
  }
  
  public final void s(int paramInt)
  {
    A = true;
    C = paramInt;
  }
  
  public final void show()
  {
    if (a()) {
      return;
    }
    Object localObject = p.iterator();
    while (((Iterator)localObject).hasNext()) {
      u((f)((Iterator)localObject).next());
    }
    p.clear();
    localObject = w;
    x = ((View)localObject);
    if (localObject != null)
    {
      int i;
      if (G == null) {
        i = 1;
      } else {
        i = 0;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      G = ((ViewTreeObserver)localObject);
      if (i != 0) {
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(r);
      }
      x.addOnAttachStateChangeListener(s);
    }
  }
  
  public final void u(f paramf)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(b);
    Object localObject1 = new e(paramf, localLayoutInflater, f, 2131558411);
    if ((!a()) && (D)) {
      c = true;
    } else if (a()) {
      c = d.t(paramf);
    }
    int i = d.l((e)localObject1, b, c);
    p0 localp0 = new p0(b, d, e);
    K = t;
    x = this;
    G.setOnDismissListener(this);
    w = w;
    t = v;
    F = true;
    G.setFocusable(true);
    G.setInputMethodMode(2);
    localp0.o((ListAdapter)localObject1);
    localp0.q(i);
    t = v;
    Object localObject3;
    int j;
    int k;
    label277:
    Object localObject5;
    int m;
    if (q.size() > 0)
    {
      localObject1 = q;
      localObject2 = (d)((ArrayList)localObject1).get(((ArrayList)localObject1).size() - 1);
      localObject3 = b;
      j = ((f)localObject3).size();
      for (k = 0; k < j; k++)
      {
        localObject1 = ((f)localObject3).getItem(k);
        if ((((MenuItem)localObject1).hasSubMenu()) && (paramf == ((MenuItem)localObject1).getSubMenu())) {
          break label277;
        }
      }
      localObject1 = null;
      if (localObject1 == null)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject5 = a.c;
        localObject3 = ((ListView)localObject5).getAdapter();
        if ((localObject3 instanceof HeaderViewListAdapter))
        {
          localObject3 = (HeaderViewListAdapter)localObject3;
          j = ((HeaderViewListAdapter)localObject3).getHeadersCount();
          localObject3 = (e)((HeaderViewListAdapter)localObject3).getWrappedAdapter();
        }
        else
        {
          localObject3 = (e)localObject3;
          j = 0;
        }
        m = ((e)localObject3).getCount();
        for (k = 0; k < m; k++) {
          if (localObject1 == ((e)localObject3).c(k)) {
            break label389;
          }
        }
        k = -1;
        label389:
        if (k == -1)
        {
          localObject1 = localObject2;
        }
        else
        {
          k = k + j - ((AdapterView)localObject5).getFirstVisiblePosition();
          localObject1 = localObject2;
          if (k >= 0) {
            if (k >= ((ViewGroup)localObject5).getChildCount())
            {
              localObject1 = localObject2;
            }
            else
            {
              localObject3 = ((ViewGroup)localObject5).getChildAt(k);
              localObject1 = localObject2;
              localObject2 = localObject3;
              break label462;
            }
          }
        }
      }
    }
    else
    {
      localObject1 = null;
    }
    Object localObject2 = null;
    label462:
    Object localObject4;
    if (localObject2 != null)
    {
      if (Build.VERSION.SDK_INT <= 28)
      {
        localObject3 = p0.L;
        if (localObject3 != null) {
          try
          {
            ((Method)localObject3).invoke(G, new Object[] { Boolean.FALSE });
          }
          catch (Exception localException)
          {
            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
          }
        }
      }
      else
      {
        p0.b.a(G, false);
      }
      p0.a.a(G, null);
      localObject4 = q;
      localObject4 = getsize1a.c;
      localObject5 = new int[2];
      ((View)localObject4).getLocationOnScreen((int[])localObject5);
      Rect localRect = new Rect();
      x.getWindowVisibleDisplayFrame(localRect);
      if (y == 1)
      {
        k = localObject5[0];
        if (((View)localObject4).getWidth() + k + i > right) {
          break label653;
        }
      }
      else
      {
        if (localObject5[0] - i >= 0) {
          break label653;
        }
      }
      j = 1;
      break label656;
      label653:
      j = 0;
      label656:
      if (j == 1) {
        k = 1;
      } else {
        k = 0;
      }
      y = j;
      if (Build.VERSION.SDK_INT >= 26)
      {
        w = ((View)localObject2);
        j = 0;
        m = j;
      }
      else
      {
        localObject4 = new int[2];
        w.getLocationOnScreen((int[])localObject4);
        localObject5 = new int[2];
        ((View)localObject2).getLocationOnScreen((int[])localObject5);
        if ((v & 0x7) == 5)
        {
          j = localObject4[0];
          localObject4[0] = (w.getWidth() + j);
          j = localObject5[0];
          localObject5[0] = (((View)localObject2).getWidth() + j);
        }
        m = localObject5[0] - localObject4[0];
        j = localObject5[1] - localObject4[1];
      }
      if ((v & 0x5) == 5)
      {
        if (k != 0)
        {
          k = m + i;
          break label859;
        }
        i = ((View)localObject2).getWidth();
      }
      else if (k != 0)
      {
        k = m + ((View)localObject2).getWidth();
        break label859;
      }
      k = m - i;
      label859:
      f = k;
      s = true;
      r = true;
      localp0.k(j);
    }
    else
    {
      if (z) {
        f = B;
      }
      if (A) {
        localp0.k(C);
      }
      localObject2 = a;
      if (localObject2 != null) {
        localObject2 = new Rect((Rect)localObject2);
      } else {
        localObject2 = null;
      }
      E = ((Rect)localObject2);
    }
    localObject2 = new d(localp0, paramf, y);
    q.add(localObject2);
    localp0.show();
    localObject2 = c;
    ((View)localObject2).setOnKeyListener(this);
    if ((localObject1 == null) && (E) && (m != null))
    {
      localObject4 = (FrameLayout)localLayoutInflater.inflate(2131558418, (ViewGroup)localObject2, false);
      localObject1 = (TextView)((View)localObject4).findViewById(16908310);
      ((View)localObject4).setEnabled(false);
      ((TextView)localObject1).setText(m);
      ((ListView)localObject2).addHeaderView((View)localObject4, null, false);
      localp0.show();
    }
  }
  
  public final class a
    implements ViewTreeObserver.OnGlobalLayoutListener
  {
    public a() {}
    
    public final void onGlobalLayout()
    {
      if ((a()) && (q.size() > 0) && (!q.get(0)).a.F))
      {
        Object localObject = x;
        if ((localObject != null) && (((View)localObject).isShown())) {
          localObject = q.iterator();
        }
        while (((Iterator)localObject).hasNext())
        {
          nexta.show();
          continue;
          dismiss();
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
      Object localObject = G;
      if (localObject != null)
      {
        if (!((ViewTreeObserver)localObject).isAlive()) {
          G = paramView.getViewTreeObserver();
        }
        localObject = b.this;
        G.removeGlobalOnLayoutListener(r);
      }
      paramView.removeOnAttachStateChangeListener(this);
    }
  }
  
  public final class c
    implements o0
  {
    public c() {}
    
    public final void c(f paramf, h paramh)
    {
      Handler localHandler = o;
      b.d locald = null;
      localHandler.removeCallbacksAndMessages(null);
      int i = q.size();
      for (int j = 0; j < i; j++) {
        if (paramf == q.get(j)).b) {
          break label72;
        }
      }
      j = -1;
      label72:
      if (j == -1) {
        return;
      }
      j++;
      if (j < q.size()) {
        locald = (b.d)q.get(j);
      }
      paramh = new c(this, locald, paramh, paramf);
      long l = SystemClock.uptimeMillis();
      o.postAtTime(paramh, paramf, l + 200L);
    }
    
    public final void f(f paramf, MenuItem paramMenuItem)
    {
      o.removeCallbacksAndMessages(paramf);
    }
  }
  
  public static final class d
  {
    public final p0 a;
    public final f b;
    public final int c;
    
    public d(p0 paramp0, f paramf, int paramInt)
    {
      a = paramp0;
      b = paramf;
      c = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */