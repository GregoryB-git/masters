package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import b.a0;
import e0.o0;
import e0.q0;
import g.g.d;
import l.a1;
import l.h0;
import l.s0;
import l.z0;
import x6.b;

public final class d
  implements h0
{
  public Toolbar a;
  public int b;
  public c c;
  public View d;
  public Drawable e;
  public Drawable f;
  public Drawable g;
  public boolean h;
  public CharSequence i;
  public CharSequence j;
  public CharSequence k;
  public Window.Callback l;
  public boolean m;
  public a n;
  public int o = 0;
  public Drawable p;
  
  public d(Toolbar paramToolbar, boolean paramBoolean)
  {
    a = paramToolbar;
    i = paramToolbar.getTitle();
    j = paramToolbar.getSubtitle();
    boolean bool;
    if (i != null) {
      bool = true;
    } else {
      bool = false;
    }
    h = bool;
    g = paramToolbar.getNavigationIcon();
    Object localObject1 = paramToolbar.getContext();
    paramToolbar = a0.f;
    Object localObject2 = null;
    z0 localz0 = z0.m((Context)localObject1, null, paramToolbar, 2130968581);
    int i1 = 15;
    p = localz0.e(15);
    if (paramBoolean)
    {
      paramToolbar = localz0.k(27);
      if (!TextUtils.isEmpty(paramToolbar)) {
        setTitle(paramToolbar);
      }
      paramToolbar = localz0.k(25);
      if (!TextUtils.isEmpty(paramToolbar))
      {
        j = paramToolbar;
        if ((b & 0x8) != 0) {
          a.setSubtitle(paramToolbar);
        }
      }
      paramToolbar = localz0.e(20);
      if (paramToolbar != null)
      {
        f = paramToolbar;
        v();
      }
      paramToolbar = localz0.e(17);
      if (paramToolbar != null) {
        setIcon(paramToolbar);
      }
      if (g == null)
      {
        localObject1 = p;
        if (localObject1 != null)
        {
          g = ((Drawable)localObject1);
          if ((b & 0x4) != 0)
          {
            paramToolbar = a;
          }
          else
          {
            paramToolbar = a;
            localObject1 = null;
          }
          paramToolbar.setNavigationIcon((Drawable)localObject1);
        }
      }
      k(localz0.h(10, 0));
      i1 = localz0.i(9, 0);
      if (i1 != 0)
      {
        localObject1 = LayoutInflater.from(a.getContext()).inflate(i1, a, false);
        paramToolbar = d;
        if ((paramToolbar != null) && ((b & 0x10) != 0)) {
          a.removeView(paramToolbar);
        }
        d = ((View)localObject1);
        if ((localObject1 != null) && ((b & 0x10) != 0)) {
          a.addView((View)localObject1);
        }
        k(b | 0x10);
      }
      i1 = b.getLayoutDimension(13, 0);
      if (i1 > 0)
      {
        paramToolbar = a.getLayoutParams();
        height = i1;
        a.setLayoutParams(paramToolbar);
      }
      int i2 = localz0.c(7, -1);
      i1 = localz0.c(3, -1);
      if ((i2 >= 0) || (i1 >= 0))
      {
        paramToolbar = a;
        i2 = Math.max(i2, 0);
        i1 = Math.max(i1, 0);
        if (B == null) {
          B = new s0();
        }
        B.a(i2, i1);
      }
      i1 = localz0.i(28, 0);
      if (i1 != 0)
      {
        localObject1 = a;
        paramToolbar = ((View)localObject1).getContext();
        t = i1;
        localObject1 = b;
        if (localObject1 != null) {
          ((l.d0)localObject1).setTextAppearance(paramToolbar, i1);
        }
      }
      i1 = localz0.i(26, 0);
      if (i1 != 0)
      {
        localObject1 = a;
        paramToolbar = ((View)localObject1).getContext();
        u = i1;
        localObject1 = c;
        if (localObject1 != null) {
          ((l.d0)localObject1).setTextAppearance(paramToolbar, i1);
        }
      }
      i1 = localz0.i(22, 0);
      if (i1 != 0) {
        a.setPopupTheme(i1);
      }
    }
    else
    {
      if (a.getNavigationIcon() != null) {
        p = a.getNavigationIcon();
      } else {
        i1 = 11;
      }
      b = i1;
    }
    localz0.n();
    if (2131886081 != o)
    {
      o = 2131886081;
      if (TextUtils.isEmpty(a.getNavigationContentDescription()))
      {
        i1 = o;
        if (i1 == 0) {
          paramToolbar = (Toolbar)localObject2;
        } else {
          paramToolbar = getContext().getString(i1);
        }
        k = paramToolbar;
        u();
      }
    }
    k = a.getNavigationContentDescription();
    a.setNavigationOnClickListener(new a1(this));
  }
  
  public final boolean a()
  {
    Object localObject = a.a;
    boolean bool = true;
    if (localObject != null)
    {
      localObject = B;
      int i1;
      if ((localObject != null) && (((a)localObject).k())) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final void b()
  {
    m = true;
  }
  
  public final boolean c()
  {
    Object localObject = a;
    if (((View)localObject).getVisibility() == 0)
    {
      localObject = a;
      if ((localObject != null) && (A)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final void collapseActionView()
  {
    Object localObject = a.U;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = b;
    }
    if (localObject != null) {
      ((h)localObject).collapseActionView();
    }
  }
  
  public final void d(androidx.appcompat.view.menu.f paramf, g.d paramd)
  {
    if (n == null) {
      n = new a(a.getContext());
    }
    a locala = n;
    e = paramd;
    Toolbar localToolbar = a;
    if ((paramf != null) || (a != null))
    {
      localToolbar.e();
      paramd = a.x;
      if (paramd != paramf)
      {
        if (paramd != null)
        {
          paramd.r(T);
          paramd.r(U);
        }
        if (U == null) {
          U = new Toolbar.f(localToolbar);
        }
        y = true;
        if (paramf != null)
        {
          paramf.b(locala, r);
          paramf.b(U, r);
        }
        else
        {
          locala.f(r, null);
          U.f(r, null);
          locala.g();
          U.g();
        }
        a.setPopupTheme(s);
        a.setPresenter(locala);
        T = locala;
        localToolbar.r();
      }
    }
  }
  
  public final boolean e()
  {
    Object localObject = a.a;
    boolean bool = true;
    if (localObject != null)
    {
      localObject = B;
      if (localObject != null)
      {
        if ((C == null) && (!((a)localObject).k())) {
          i1 = 0;
        } else {
          i1 = 1;
        }
        if (i1 != 0)
        {
          i1 = 1;
          break label58;
        }
      }
      int i1 = 0;
      label58:
      if (i1 != 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final boolean f()
  {
    Object localObject = a.a;
    boolean bool = true;
    if (localObject != null)
    {
      localObject = B;
      int i1;
      if ((localObject != null) && (((a)localObject).h())) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final boolean g()
  {
    Object localObject = a.a;
    boolean bool = true;
    if (localObject != null)
    {
      localObject = B;
      int i1;
      if ((localObject != null) && (((a)localObject).l())) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final Context getContext()
  {
    return a.getContext();
  }
  
  public final CharSequence getTitle()
  {
    return a.getTitle();
  }
  
  public final void h()
  {
    Object localObject = a.a;
    if (localObject != null)
    {
      localObject = B;
      if (localObject != null)
      {
        ((a)localObject).h();
        localObject = B;
        if ((localObject != null) && (((i)localObject).b())) {
          j.dismiss();
        }
      }
    }
  }
  
  public final void i() {}
  
  public final boolean j()
  {
    Toolbar.f localf = a.U;
    boolean bool;
    if ((localf != null) && (b != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void k(int paramInt)
  {
    int i1 = b ^ paramInt;
    b = paramInt;
    if (i1 != 0)
    {
      Object localObject1 = null;
      Object localObject2;
      Object localObject3;
      if ((i1 & 0x4) != 0)
      {
        if ((paramInt & 0x4) != 0) {
          u();
        }
        if ((b & 0x4) != 0)
        {
          localObject2 = a;
          localObject3 = g;
          if (localObject3 == null) {
            localObject3 = p;
          }
        }
        else
        {
          localObject2 = a;
          localObject3 = null;
        }
        ((Toolbar)localObject2).setNavigationIcon((Drawable)localObject3);
      }
      if ((i1 & 0x3) != 0) {
        v();
      }
      if ((i1 & 0x8) != 0)
      {
        if ((paramInt & 0x8) != 0)
        {
          a.setTitle(i);
          localObject3 = a;
          localObject2 = j;
        }
        else
        {
          a.setTitle(null);
          localObject3 = a;
          localObject2 = localObject1;
        }
        ((Toolbar)localObject3).setSubtitle((CharSequence)localObject2);
      }
      if ((i1 & 0x10) != 0)
      {
        localObject3 = d;
        if (localObject3 != null) {
          if ((paramInt & 0x10) != 0) {
            a.addView((View)localObject3);
          } else {
            a.removeView((View)localObject3);
          }
        }
      }
    }
  }
  
  public final void l()
  {
    Object localObject = c;
    if (localObject != null)
    {
      ViewParent localViewParent = ((View)localObject).getParent();
      localObject = a;
      if (localViewParent == localObject) {
        ((ViewGroup)localObject).removeView(c);
      }
    }
    c = null;
  }
  
  public final void m(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = b.X(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    f = localDrawable;
    v();
  }
  
  public final void n() {}
  
  public final o0 o(final int paramInt, long paramLong)
  {
    o0 localo0 = e0.d0.a(a);
    float f1;
    if (paramInt == 0) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    localo0.a(f1);
    localo0.c(paramLong);
    localo0.d(new a(paramInt));
    return localo0;
  }
  
  public final void p(int paramInt)
  {
    a.setVisibility(paramInt);
  }
  
  public final int q()
  {
    return b;
  }
  
  public final void r()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public final void s()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public final void setIcon(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = b.X(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setIcon(localDrawable);
  }
  
  public final void setIcon(Drawable paramDrawable)
  {
    e = paramDrawable;
    v();
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    h = true;
    i = paramCharSequence;
    if ((b & 0x8) != 0)
    {
      a.setTitle(paramCharSequence);
      if (h) {
        e0.d0.i(a.getRootView(), paramCharSequence);
      }
    }
  }
  
  public final void setWindowCallback(Window.Callback paramCallback)
  {
    l = paramCallback;
  }
  
  public final void setWindowTitle(CharSequence paramCharSequence)
  {
    if (!h)
    {
      i = paramCharSequence;
      if ((b & 0x8) != 0)
      {
        a.setTitle(paramCharSequence);
        if (h) {
          e0.d0.i(a.getRootView(), paramCharSequence);
        }
      }
    }
  }
  
  public final void t(boolean paramBoolean)
  {
    a.setCollapsible(paramBoolean);
  }
  
  public final void u()
  {
    if ((b & 0x4) != 0) {
      if (TextUtils.isEmpty(k)) {
        a.setNavigationContentDescription(o);
      } else {
        a.setNavigationContentDescription(k);
      }
    }
  }
  
  public final void v()
  {
    int i1 = b;
    Drawable localDrawable;
    if ((i1 & 0x2) != 0)
    {
      if ((i1 & 0x1) != 0)
      {
        localDrawable = f;
        if (localDrawable != null) {}
      }
      else
      {
        localDrawable = e;
      }
    }
    else {
      localDrawable = null;
    }
    a.setLogo(localDrawable);
  }
  
  public final class a
    extends q0
  {
    public boolean b = false;
    
    public a(int paramInt)
    {
      super();
    }
    
    public final void a()
    {
      b = true;
    }
    
    public final void b()
    {
      a.setVisibility(0);
    }
    
    public final void c()
    {
      if (!b) {
        a.setVisibility(paramInt);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */