package androidx.appcompat.view.menu;

import I.e;
import I.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
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
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import e.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.I;
import l.J;
import l.L;

public final class b
  extends k.b
  implements g, View.OnKeyListener, PopupWindow.OnDismissListener
{
  public static final int P = f.e;
  public int A = 0;
  public int B = 0;
  public View C;
  public View D;
  public int E;
  public boolean F;
  public boolean G;
  public int H;
  public int I;
  public boolean J;
  public boolean K;
  public g.a L;
  public ViewTreeObserver M;
  public PopupWindow.OnDismissListener N;
  public boolean O;
  public final Context p;
  public final int q;
  public final int r;
  public final int s;
  public final boolean t;
  public final Handler u;
  public final List v = new ArrayList();
  public final List w = new ArrayList();
  public final ViewTreeObserver.OnGlobalLayoutListener x = new a();
  public final View.OnAttachStateChangeListener y = new b();
  public final J z = new c();
  
  public b(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    p = paramContext;
    C = paramView;
    r = paramInt1;
    s = paramInt2;
    t = paramBoolean;
    J = false;
    E = D();
    paramContext = paramContext.getResources();
    q = Math.max(getDisplayMetricswidthPixels / 2, paramContext.getDimensionPixelSize(e.c.b));
    u = new Handler();
  }
  
  public final int A(d paramd)
  {
    int i = w.size();
    for (int j = 0; j < i; j++) {
      if (paramd == w.get(j)).b) {
        return j;
      }
    }
    return -1;
  }
  
  public final MenuItem B(d paramd1, d paramd2)
  {
    int i = paramd1.size();
    for (int j = 0; j < i; j++)
    {
      MenuItem localMenuItem = paramd1.getItem(j);
      if ((localMenuItem.hasSubMenu()) && (paramd2 == localMenuItem.getSubMenu())) {
        return localMenuItem;
      }
    }
    return null;
  }
  
  public final View C(d paramd, d paramd1)
  {
    paramd1 = B(b, paramd1);
    if (paramd1 == null) {
      return null;
    }
    ListView localListView = paramd.a();
    paramd = localListView.getAdapter();
    boolean bool = paramd instanceof HeaderViewListAdapter;
    int i = 0;
    int j;
    if (bool)
    {
      paramd = (HeaderViewListAdapter)paramd;
      j = paramd.getHeadersCount();
      paramd = (c)paramd.getWrappedAdapter();
    }
    else
    {
      paramd = (c)paramd;
      j = 0;
    }
    int k = paramd.getCount();
    while (i < k)
    {
      if (paramd1 == paramd.c(i)) {
        break label105;
      }
      i++;
    }
    i = -1;
    label105:
    if (i == -1) {
      return null;
    }
    i = i + j - localListView.getFirstVisiblePosition();
    if ((i >= 0) && (i < localListView.getChildCount())) {
      return localListView.getChildAt(i);
    }
    return null;
  }
  
  public final int D()
  {
    int i = s.m(C);
    int j = 1;
    if (i == 1) {
      j = 0;
    }
    return j;
  }
  
  public final int E(int paramInt)
  {
    Object localObject = w;
    localObject = ((d)((List)localObject).get(((List)localObject).size() - 1)).a();
    int[] arrayOfInt = new int[2];
    ((View)localObject).getLocationOnScreen(arrayOfInt);
    Rect localRect = new Rect();
    D.getWindowVisibleDisplayFrame(localRect);
    if (E == 1)
    {
      if (arrayOfInt[0] + ((View)localObject).getWidth() + paramInt > right) {
        return 0;
      }
      return 1;
    }
    if (arrayOfInt[0] - paramInt < 0) {
      return 1;
    }
    return 0;
  }
  
  public final void F(d paramd)
  {
    Object localObject1 = LayoutInflater.from(p);
    Object localObject2 = new c(paramd, (LayoutInflater)localObject1, t, P);
    if ((!i()) && (J)) {
      ((c)localObject2).d(true);
    } else if (i()) {
      ((c)localObject2).d(k.b.x(paramd));
    }
    int i = k.b.o((ListAdapter)localObject2, null, p, q);
    L localL = z();
    localL.p((ListAdapter)localObject2);
    localL.s(i);
    localL.t(B);
    if (w.size() > 0)
    {
      localObject2 = w;
      localObject2 = (d)((List)localObject2).get(((List)localObject2).size() - 1);
      localObject3 = C((d)localObject2, paramd);
    }
    else
    {
      localObject2 = null;
      localObject3 = localObject2;
    }
    if (localObject3 != null)
    {
      localL.H(false);
      localL.E(null);
      int j = E(i);
      int k;
      if (j == 1) {
        k = 1;
      } else {
        k = 0;
      }
      E = j;
      int m;
      if (Build.VERSION.SDK_INT >= 26)
      {
        localL.q((View)localObject3);
        j = 0;
        m = j;
      }
      else
      {
        int[] arrayOfInt1 = new int[2];
        C.getLocationOnScreen(arrayOfInt1);
        int[] arrayOfInt2 = new int[2];
        ((View)localObject3).getLocationOnScreen(arrayOfInt2);
        if ((B & 0x7) == 5)
        {
          arrayOfInt1[0] += C.getWidth();
          arrayOfInt2[0] += ((View)localObject3).getWidth();
        }
        m = arrayOfInt2[0] - arrayOfInt1[0];
        j = arrayOfInt2[1] - arrayOfInt1[1];
      }
      if ((B & 0x5) == 5) {
        if (k == 0) {}
      }
      for (;;)
      {
        i = m + i;
        break;
        i = ((View)localObject3).getWidth();
        do
        {
          i = m - i;
          break;
        } while (k == 0);
        i = ((View)localObject3).getWidth();
      }
      localL.v(i);
      localL.A(true);
      localL.C(j);
    }
    else
    {
      if (F) {
        localL.v(H);
      }
      if (G) {
        localL.C(I);
      }
      localL.u(n());
    }
    Object localObject3 = new d(localL, paramd, E);
    w.add(localObject3);
    localL.a();
    localObject3 = localL.d();
    ((View)localObject3).setOnKeyListener(this);
    if ((localObject2 == null) && (K) && (paramd.u() != null))
    {
      localObject2 = (FrameLayout)((LayoutInflater)localObject1).inflate(f.i, (ViewGroup)localObject3, false);
      localObject1 = (TextView)((View)localObject2).findViewById(16908310);
      ((View)localObject2).setEnabled(false);
      ((TextView)localObject1).setText(paramd.u());
      ((ListView)localObject3).addHeaderView((View)localObject2, null, false);
      localL.a();
    }
  }
  
  public void a()
  {
    if (i()) {
      return;
    }
    Object localObject = v.iterator();
    while (((Iterator)localObject).hasNext()) {
      F((d)((Iterator)localObject).next());
    }
    v.clear();
    localObject = C;
    D = ((View)localObject);
    if (localObject != null)
    {
      int i;
      if (M == null) {
        i = 1;
      } else {
        i = 0;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      M = ((ViewTreeObserver)localObject);
      if (i != 0) {
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(x);
      }
      D.addOnAttachStateChangeListener(y);
    }
  }
  
  public void b(d paramd, boolean paramBoolean)
  {
    int i = A(paramd);
    if (i < 0) {
      return;
    }
    int j = i + 1;
    if (j < w.size()) {
      w.get(j)).b.d(false);
    }
    Object localObject = (d)w.remove(i);
    b.K(this);
    if (O)
    {
      a.F(null);
      a.r(0);
    }
    a.dismiss();
    j = w.size();
    if (j > 0) {}
    for (i = w.get(j - 1)).c;; i = D())
    {
      E = i;
      break;
    }
    if (j == 0)
    {
      dismiss();
      localObject = L;
      if (localObject != null) {
        ((g.a)localObject).b(paramd, true);
      }
      paramd = M;
      if (paramd != null)
      {
        if (paramd.isAlive()) {
          M.removeGlobalOnLayoutListener(x);
        }
        M = null;
      }
      D.removeOnAttachStateChangeListener(y);
      N.onDismiss();
    }
    else if (paramBoolean)
    {
      w.get(0)).b.d(false);
    }
  }
  
  public ListView d()
  {
    Object localObject;
    if (w.isEmpty())
    {
      localObject = null;
    }
    else
    {
      localObject = w;
      localObject = ((d)((List)localObject).get(((List)localObject).size() - 1)).a();
    }
    return (ListView)localObject;
  }
  
  public void dismiss()
  {
    int i = w.size();
    if (i > 0)
    {
      d[] arrayOfd = (d[])w.toArray(new d[i]);
      i--;
      while (i >= 0)
      {
        d locald = arrayOfd[i];
        if (a.i()) {
          a.dismiss();
        }
        i--;
      }
    }
  }
  
  public boolean e(j paramj)
  {
    Object localObject = w.iterator();
    while (((Iterator)localObject).hasNext())
    {
      d locald = (d)((Iterator)localObject).next();
      if (paramj == b)
      {
        locald.a().requestFocus();
        return true;
      }
    }
    if (paramj.hasVisibleItems())
    {
      l(paramj);
      localObject = L;
      if (localObject != null) {
        ((g.a)localObject).c(paramj);
      }
      return true;
    }
    return false;
  }
  
  public void f(boolean paramBoolean)
  {
    Iterator localIterator = w.iterator();
    while (localIterator.hasNext()) {
      k.b.y(((d)localIterator.next()).a().getAdapter()).notifyDataSetChanged();
    }
  }
  
  public boolean g()
  {
    return false;
  }
  
  public boolean i()
  {
    int i = w.size();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0)
    {
      bool2 = bool1;
      if (w.get(0)).a.i()) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public void k(g.a parama)
  {
    L = parama;
  }
  
  public void l(d paramd)
  {
    paramd.b(this, p);
    if (i()) {
      F(paramd);
    } else {
      v.add(paramd);
    }
  }
  
  public boolean m()
  {
    return false;
  }
  
  public void onDismiss()
  {
    int i = w.size();
    for (int j = 0; j < i; j++)
    {
      locald = (d)w.get(j);
      if (!a.i()) {
        break label52;
      }
    }
    d locald = null;
    label52:
    if (locald != null) {
      b.d(false);
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
    if (C != paramView)
    {
      C = paramView;
      B = e.a(A, s.m(paramView));
    }
  }
  
  public void r(boolean paramBoolean)
  {
    J = paramBoolean;
  }
  
  public void s(int paramInt)
  {
    if (A != paramInt)
    {
      A = paramInt;
      B = e.a(paramInt, s.m(C));
    }
  }
  
  public void t(int paramInt)
  {
    F = true;
    H = paramInt;
  }
  
  public void u(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    N = paramOnDismissListener;
  }
  
  public void v(boolean paramBoolean)
  {
    K = paramBoolean;
  }
  
  public void w(int paramInt)
  {
    G = true;
    I = paramInt;
  }
  
  public final L z()
  {
    L localL = new L(p, null, r, s);
    localL.G(z);
    localL.z(this);
    localL.y(this);
    localL.q(C);
    localL.t(B);
    localL.x(true);
    localL.w(2);
    return localL;
  }
  
  public class a
    implements ViewTreeObserver.OnGlobalLayoutListener
  {
    public a() {}
    
    public void onGlobalLayout()
    {
      if ((i()) && (w.size() > 0) && (!w.get(0)).a.n()))
      {
        Object localObject = D;
        if ((localObject != null) && (((View)localObject).isShown())) {
          localObject = w.iterator();
        }
        while (((Iterator)localObject).hasNext())
        {
          nexta.a();
          continue;
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
      Object localObject = M;
      if (localObject != null)
      {
        if (!((ViewTreeObserver)localObject).isAlive()) {
          M = paramView.getViewTreeObserver();
        }
        localObject = b.this;
        M.removeGlobalOnLayoutListener(x);
      }
      paramView.removeOnAttachStateChangeListener(this);
    }
  }
  
  public class c
    implements J
  {
    public c() {}
    
    public void b(final d paramd, final MenuItem paramMenuItem)
    {
      Handler localHandler = u;
      final b.d locald = null;
      localHandler.removeCallbacksAndMessages(null);
      int i = w.size();
      for (int j = 0; j < i; j++) {
        if (paramd == w.get(j)).b) {
          break label76;
        }
      }
      j = -1;
      label76:
      if (j == -1) {
        return;
      }
      j++;
      if (j < w.size()) {
        locald = (b.d)w.get(j);
      }
      paramMenuItem = new a(locald, paramMenuItem, paramd);
      long l = SystemClock.uptimeMillis();
      u.postAtTime(paramMenuItem, paramd, l + 200L);
    }
    
    public void c(d paramd, MenuItem paramMenuItem)
    {
      u.removeCallbacksAndMessages(paramd);
    }
    
    public class a
      implements Runnable
    {
      public a(b.d paramd, MenuItem paramMenuItem, d paramd1) {}
      
      public void run()
      {
        b.d locald = locald;
        if (locald != null)
        {
          O = true;
          b.d(false);
          O = false;
        }
        if ((paramMenuItem.isEnabled()) && (paramMenuItem.hasSubMenu())) {
          paramd.H(paramMenuItem, 4);
        }
      }
    }
  }
  
  public static class d
  {
    public final L a;
    public final d b;
    public final int c;
    
    public d(L paramL, d paramd, int paramInt)
    {
      a = paramL;
      b = paramd;
      c = paramInt;
    }
    
    public ListView a()
    {
      return a.d();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */