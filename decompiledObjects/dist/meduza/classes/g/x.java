package g;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.d;
import androidx.appcompat.widget.Toolbar;
import b.a0;
import e0.d0;
import e0.d0.c;
import e0.d0.d;
import e0.m0;
import e0.o0;
import e0.p0;
import e0.q0;
import e0.r0;
import j.a.a;
import j.g;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.h0;

public final class x
  extends a
  implements ActionBarOverlayLayout.d
{
  public static final AccelerateInterpolator A = new AccelerateInterpolator();
  public static final DecelerateInterpolator B = new DecelerateInterpolator();
  public Context a;
  public Context b;
  public ActionBarOverlayLayout c;
  public ActionBarContainer d;
  public h0 e;
  public ActionBarContextView f;
  public View g;
  public boolean h;
  public d i;
  public d j;
  public a.a k;
  public boolean l;
  public ArrayList<a.b> m;
  public boolean n;
  public int o;
  public boolean p;
  public boolean q;
  public boolean r;
  public boolean s;
  public boolean t;
  public g u;
  public boolean v;
  public boolean w;
  public final a x;
  public final b y;
  public final c z;
  
  public x(Activity paramActivity, boolean paramBoolean)
  {
    new ArrayList();
    m = new ArrayList();
    o = 0;
    p = true;
    t = true;
    x = new a();
    y = new b();
    z = new c();
    paramActivity = paramActivity.getWindow().getDecorView();
    w(paramActivity);
    if (!paramBoolean) {
      g = paramActivity.findViewById(16908290);
    }
  }
  
  public x(Dialog paramDialog)
  {
    new ArrayList();
    m = new ArrayList();
    o = 0;
    p = true;
    t = true;
    x = new a();
    y = new b();
    z = new c();
    w(paramDialog.getWindow().getDecorView());
  }
  
  public final boolean b()
  {
    h0 localh0 = e;
    if ((localh0 != null) && (localh0.j()))
    {
      e.collapseActionView();
      return true;
    }
    return false;
  }
  
  public final void c(boolean paramBoolean)
  {
    if (paramBoolean == l) {
      return;
    }
    l = paramBoolean;
    int i1 = m.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((a.b)m.get(i2)).a();
    }
  }
  
  public final int d()
  {
    return e.q();
  }
  
  public final Context e()
  {
    if (b == null)
    {
      TypedValue localTypedValue = new TypedValue();
      a.getTheme().resolveAttribute(2130968586, localTypedValue, true);
      int i1 = resourceId;
      if (i1 != 0) {
        b = new ContextThemeWrapper(a, i1);
      } else {
        b = a;
      }
    }
    return b;
  }
  
  public final void f()
  {
    if (!q)
    {
      q = true;
      y(false);
    }
  }
  
  public final boolean h()
  {
    int i1 = d.getHeight();
    boolean bool;
    if ((t) && ((i1 == 0) || (c.getActionBarHideOffset() < i1))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void i()
  {
    x(a.getResources().getBoolean(2131034112));
  }
  
  public final boolean k(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = i;
    if (localObject == null) {
      return false;
    }
    localObject = d;
    if (localObject != null)
    {
      if (paramKeyEvent != null) {
        i1 = paramKeyEvent.getDeviceId();
      } else {
        i1 = -1;
      }
      int i1 = KeyCharacterMap.load(i1).getKeyboardType();
      boolean bool = true;
      if (i1 == 1) {
        bool = false;
      }
      ((androidx.appcompat.view.menu.f)localObject).setQwertyMode(bool);
      return ((androidx.appcompat.view.menu.f)localObject).performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public final void n(ColorDrawable paramColorDrawable)
  {
    d.setPrimaryBackground(paramColorDrawable);
  }
  
  public final void o(boolean paramBoolean)
  {
    if (!h)
    {
      int i1;
      if (paramBoolean) {
        i1 = 4;
      } else {
        i1 = 0;
      }
      int i2 = e.q();
      h = true;
      e.k(i1 & 0x4 | 0xFFFFFFFB & i2);
    }
  }
  
  public final void p(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      i1 = 8;
    } else {
      i1 = 0;
    }
    int i2 = e.q();
    e.k(i1 & 0x8 | 0xFFFFFFF7 & i2);
  }
  
  public final void q(boolean paramBoolean)
  {
    v = paramBoolean;
    if (!paramBoolean)
    {
      g localg = u;
      if (localg != null) {
        localg.a();
      }
    }
  }
  
  public final void r(CharSequence paramCharSequence)
  {
    e.setTitle(paramCharSequence);
  }
  
  public final void s(CharSequence paramCharSequence)
  {
    e.setWindowTitle(paramCharSequence);
  }
  
  public final void t()
  {
    if (q)
    {
      q = false;
      y(false);
    }
  }
  
  public final j.a u(g.e parame)
  {
    d locald = i;
    if (locald != null) {
      locald.c();
    }
    c.setHideOnContentScrollEnabled(false);
    f.h();
    parame = new d(f.getContext(), parame);
    d.w();
    try
    {
      boolean bool = e.a(parame, d);
      d.v();
      if (bool)
      {
        i = parame;
        parame.i();
        f.f(parame);
        v(true);
        return parame;
      }
      return null;
    }
    finally
    {
      d.v();
    }
  }
  
  public final void v(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (!s)
      {
        s = true;
        localObject1 = c;
        if (localObject1 != null) {
          ((ActionBarOverlayLayout)localObject1).setShowingForActionMode(true);
        }
        y(false);
      }
    }
    else if (s)
    {
      s = false;
      localObject1 = c;
      if (localObject1 != null) {
        ((ActionBarOverlayLayout)localObject1).setShowingForActionMode(false);
      }
      y(false);
    }
    Object localObject2 = d;
    Object localObject1 = d0.a;
    if (((View)localObject2).isLaidOut())
    {
      if (paramBoolean)
      {
        localObject2 = e.o(4, 100L);
        localObject1 = f.e(0, 200L);
      }
      else
      {
        localObject1 = e.o(0, 200L);
        localObject2 = f.e(8, 100L);
      }
      g localg = new g();
      a.add(localObject2);
      localObject2 = (View)a.get();
      long l1;
      if (localObject2 != null) {
        l1 = ((View)localObject2).animate().getDuration();
      } else {
        l1 = 0L;
      }
      localObject2 = (View)a.get();
      if (localObject2 != null) {
        ((View)localObject2).animate().setStartDelay(l1);
      }
      a.add(localObject1);
      localg.b();
    }
    else if (paramBoolean)
    {
      e.p(4);
      f.setVisibility(0);
    }
    else
    {
      e.p(0);
      f.setVisibility(8);
    }
  }
  
  public final void w(View paramView)
  {
    Object localObject1 = (ActionBarOverlayLayout)paramView.findViewById(2131361891);
    c = ((ActionBarOverlayLayout)localObject1);
    if (localObject1 != null) {
      ((ActionBarOverlayLayout)localObject1).setActionBarVisibilityCallback(this);
    }
    Object localObject2 = paramView.findViewById(2131361832);
    if ((localObject2 instanceof h0))
    {
      localObject1 = (h0)localObject2;
    }
    else
    {
      if (!(localObject2 instanceof Toolbar)) {
        break label336;
      }
      localObject1 = ((Toolbar)localObject2).getWrapper();
    }
    e = ((h0)localObject1);
    f = ((ActionBarContextView)paramView.findViewById(2131361841));
    paramView = (ActionBarContainer)paramView.findViewById(2131361834);
    d = paramView;
    localObject1 = e;
    if ((localObject1 != null) && (f != null) && (paramView != null))
    {
      a = ((h0)localObject1).getContext();
      if ((e.q() & 0x4) != 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        h = true;
      }
      paramView = a;
      int i1 = getApplicationInfotargetSdkVersion;
      e.i();
      x(paramView.getResources().getBoolean(2131034112));
      paramView = a.obtainStyledAttributes(null, a0.f, 2130968581, 0);
      if (paramView.getBoolean(14, false))
      {
        localObject1 = c;
        if (p)
        {
          w = true;
          ((ActionBarOverlayLayout)localObject1).setHideOnContentScrollEnabled(true);
        }
        else
        {
          throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
      }
      i1 = paramView.getDimensionPixelSize(12, 0);
      if (i1 != 0)
      {
        float f1 = i1;
        localObject1 = d;
        localObject2 = d0.a;
        d0.d.s((View)localObject1, f1);
      }
      paramView.recycle();
      return;
    }
    paramView = new StringBuilder();
    paramView.append(x.class.getSimpleName());
    paramView.append(" can only be used with a compatible window decor layout");
    throw new IllegalStateException(paramView.toString());
    label336:
    localObject1 = f.l("Can't make a decor toolbar out of ");
    if (localObject2 != null) {
      paramView = localObject2.getClass().getSimpleName();
    } else {
      paramView = "null";
    }
    ((StringBuilder)localObject1).append(paramView);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public final void x(boolean paramBoolean)
  {
    n = paramBoolean;
    if (!paramBoolean)
    {
      e.l();
      d.setTabContainer(null);
    }
    else
    {
      d.setTabContainer(null);
      e.l();
    }
    e.n();
    Object localObject = e;
    paramBoolean = n;
    ((h0)localObject).t(false);
    localObject = c;
    paramBoolean = n;
    ((ActionBarOverlayLayout)localObject).setHasNonEmbeddedTabs(false);
  }
  
  public final void y(boolean paramBoolean)
  {
    boolean bool1 = q;
    boolean bool2 = r;
    if (s) {}
    while ((!bool1) && (!bool2))
    {
      i1 = 1;
      break;
    }
    int i1 = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    float f1;
    float f2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (i1 != 0)
    {
      if (!t)
      {
        t = true;
        localObject1 = u;
        if (localObject1 != null) {
          ((g)localObject1).a();
        }
        d.setVisibility(0);
        if ((o == 0) && ((v) || (paramBoolean)))
        {
          d.setTranslationY(0.0F);
          f1 = -d.getHeight();
          f2 = f1;
          if (paramBoolean)
          {
            localObject1 = new int[2];
            Object tmp133_131 = localObject1;
            tmp133_131[0] = 0;
            Object tmp137_133 = tmp133_131;
            tmp137_133[1] = 0;
            tmp137_133;
            d.getLocationInWindow((int[])localObject1);
            f2 = f1 - localObject1[1];
          }
          d.setTranslationY(f2);
          localObject1 = new g();
          localObject3 = d0.a(d);
          ((o0)localObject3).e(0.0F);
          localObject4 = z;
          localObject5 = (View)a.get();
          if (localObject5 != null)
          {
            if (localObject4 != null) {
              localObject2 = new m0((c)localObject4, (View)localObject5);
            }
            ((View)localObject5).animate().setUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
          }
          if (!e) {
            a.add(localObject3);
          }
          if (p)
          {
            localObject2 = g;
            if (localObject2 != null)
            {
              ((View)localObject2).setTranslationY(f2);
              localObject2 = d0.a(g);
              ((o0)localObject2).e(0.0F);
              if (!e) {
                a.add(localObject2);
              }
            }
          }
          localObject2 = B;
          paramBoolean = e;
          if (!paramBoolean) {
            c = ((Interpolator)localObject2);
          }
          if (!paramBoolean) {
            b = 250L;
          }
          localObject2 = y;
          if (!paramBoolean) {
            d = ((p0)localObject2);
          }
          u = ((g)localObject1);
          ((g)localObject1).b();
        }
        else
        {
          d.setAlpha(1.0F);
          d.setTranslationY(0.0F);
          if (p)
          {
            localObject2 = g;
            if (localObject2 != null) {
              ((View)localObject2).setTranslationY(0.0F);
            }
          }
          y.c();
        }
        localObject1 = c;
        if (localObject1 != null)
        {
          localObject2 = d0.a;
          d0.c.c((View)localObject1);
        }
      }
    }
    else if (t)
    {
      t = false;
      localObject2 = u;
      if (localObject2 != null) {
        ((g)localObject2).a();
      }
      if ((o == 0) && ((v) || (paramBoolean)))
      {
        d.setAlpha(1.0F);
        d.setTransitioning(true);
        localObject5 = new g();
        f1 = -d.getHeight();
        f2 = f1;
        if (paramBoolean)
        {
          localObject2 = new int[2];
          Object tmp558_556 = localObject2;
          tmp558_556[0] = 0;
          Object tmp562_558 = tmp558_556;
          tmp562_558[1] = 0;
          tmp562_558;
          d.getLocationInWindow((int[])localObject2);
          f2 = f1 - localObject2[1];
        }
        localObject4 = d0.a(d);
        ((o0)localObject4).e(f2);
        c localc = z;
        localObject3 = (View)a.get();
        if (localObject3 != null)
        {
          localObject2 = localObject1;
          if (localc != null) {
            localObject2 = new m0(localc, (View)localObject3);
          }
          ((View)localObject3).animate().setUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
        }
        if (!e) {
          a.add(localObject4);
        }
        if (p)
        {
          localObject2 = g;
          if (localObject2 != null)
          {
            localObject2 = d0.a((View)localObject2);
            ((o0)localObject2).e(f2);
            if (!e) {
              a.add(localObject2);
            }
          }
        }
        localObject2 = A;
        paramBoolean = e;
        if (!paramBoolean) {
          c = ((Interpolator)localObject2);
        }
        if (!paramBoolean) {
          b = 250L;
        }
        localObject2 = x;
        if (!paramBoolean) {
          d = ((p0)localObject2);
        }
        u = ((g)localObject5);
        ((g)localObject5).b();
      }
      else
      {
        x.c();
      }
    }
  }
  
  public final class a
    extends q0
  {
    public a()
    {
      super();
    }
    
    public final void c()
    {
      Object localObject1 = x.this;
      if (p)
      {
        localObject1 = g;
        if (localObject1 != null)
        {
          ((View)localObject1).setTranslationY(0.0F);
          d.setTranslationY(0.0F);
        }
      }
      d.setVisibility(8);
      d.setTransitioning(false);
      Object localObject2 = x.this;
      u = null;
      localObject1 = k;
      if (localObject1 != null)
      {
        ((a.a)localObject1).b(j);
        j = null;
        k = null;
      }
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject1 = d0.a;
        d0.c.c((View)localObject2);
      }
    }
  }
  
  public final class b
    extends q0
  {
    public b()
    {
      super();
    }
    
    public final void c()
    {
      x localx = x.this;
      u = null;
      d.requestLayout();
    }
  }
  
  public final class c
    implements r0
  {
    public c() {}
  }
  
  public final class d
    extends j.a
    implements f.a
  {
    public final Context c;
    public final androidx.appcompat.view.menu.f d;
    public a.a e;
    public WeakReference<View> f;
    
    public d(Context paramContext, g.e parame)
    {
      c = paramContext;
      e = parame;
      this$1 = new androidx.appcompat.view.menu.f(paramContext);
      l = 1;
      d = x.this;
      e = this;
    }
    
    public final boolean a(androidx.appcompat.view.menu.f paramf, MenuItem paramMenuItem)
    {
      paramf = e;
      if (paramf != null) {
        return paramf.d(this, paramMenuItem);
      }
      return false;
    }
    
    public final void b(androidx.appcompat.view.menu.f paramf)
    {
      if (e == null) {
        return;
      }
      i();
      paramf = f.d;
      if (paramf != null) {
        paramf.l();
      }
    }
    
    public final void c()
    {
      Object localObject = x.this;
      if (i != this) {
        return;
      }
      boolean bool1 = q;
      boolean bool2 = r;
      int i = 1;
      if ((bool1) || (bool2)) {
        i = 0;
      }
      if (i == 0)
      {
        j = this;
        k = e;
      }
      else
      {
        e.b(this);
      }
      e = null;
      v(false);
      localObject = f;
      if (s == null) {
        ((ActionBarContextView)localObject).h();
      }
      localObject = x.this;
      c.setHideOnContentScrollEnabled(w);
      x.this.i = null;
    }
    
    public final View d()
    {
      Object localObject = f;
      if (localObject != null) {
        localObject = (View)((Reference)localObject).get();
      } else {
        localObject = null;
      }
      return (View)localObject;
    }
    
    public final androidx.appcompat.view.menu.f e()
    {
      return d;
    }
    
    public final MenuInflater f()
    {
      return new j.f(c);
    }
    
    public final CharSequence g()
    {
      return f.getSubtitle();
    }
    
    public final CharSequence h()
    {
      return f.getTitle();
    }
    
    public final void i()
    {
      if (i != this) {
        return;
      }
      d.w();
      try
      {
        e.c(this, d);
        return;
      }
      finally
      {
        d.v();
      }
    }
    
    public final boolean j()
    {
      return f.A;
    }
    
    public final void k(View paramView)
    {
      f.setCustomView(paramView);
      f = new WeakReference(paramView);
    }
    
    public final void l(int paramInt)
    {
      m(a.getResources().getString(paramInt));
    }
    
    public final void m(CharSequence paramCharSequence)
    {
      f.setSubtitle(paramCharSequence);
    }
    
    public final void n(int paramInt)
    {
      o(a.getResources().getString(paramInt));
    }
    
    public final void o(CharSequence paramCharSequence)
    {
      f.setTitle(paramCharSequence);
    }
    
    public final void p(boolean paramBoolean)
    {
      b = paramBoolean;
      f.setTitleOptional(paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     g.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */