package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import e.g;
import e.i;
import l.A;
import l.X;

public class d
  implements A
{
  public Toolbar a;
  public int b;
  public View c;
  public Drawable d;
  public Drawable e;
  public Drawable f;
  public boolean g;
  public CharSequence h;
  public CharSequence i;
  public CharSequence j;
  public Window.Callback k;
  public boolean l;
  public int m = 0;
  public int n = 0;
  public Drawable o;
  
  public d(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, g.a, e.d.n);
  }
  
  public d(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    a = paramToolbar;
    h = paramToolbar.getTitle();
    i = paramToolbar.getSubtitle();
    boolean bool;
    if (h != null) {
      bool = true;
    } else {
      bool = false;
    }
    g = bool;
    f = paramToolbar.getNavigationIcon();
    paramToolbar = X.s(paramToolbar.getContext(), null, i.a, e.a.c, 0);
    o = paramToolbar.f(i.j);
    if (paramBoolean)
    {
      Object localObject = paramToolbar.n(i.p);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        n((CharSequence)localObject);
      }
      localObject = paramToolbar.n(i.n);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        m((CharSequence)localObject);
      }
      localObject = paramToolbar.f(i.l);
      if (localObject != null) {
        i((Drawable)localObject);
      }
      localObject = paramToolbar.f(i.k);
      if (localObject != null) {
        setIcon((Drawable)localObject);
      }
      if (f == null)
      {
        localObject = o;
        if (localObject != null) {
          l((Drawable)localObject);
        }
      }
      h(paramToolbar.i(i.h, 0));
      paramInt2 = paramToolbar.l(i.g, 0);
      if (paramInt2 != 0)
      {
        f(LayoutInflater.from(a.getContext()).inflate(paramInt2, a, false));
        h(b | 0x10);
      }
      paramInt2 = paramToolbar.k(i.i, 0);
      if (paramInt2 > 0)
      {
        localObject = a.getLayoutParams();
        height = paramInt2;
        a.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      paramInt2 = paramToolbar.d(i.f, -1);
      int i1 = paramToolbar.d(i.e, -1);
      if ((paramInt2 >= 0) || (i1 >= 0)) {
        a.C(Math.max(paramInt2, 0), Math.max(i1, 0));
      }
      paramInt2 = paramToolbar.l(i.q, 0);
      if (paramInt2 != 0)
      {
        localObject = a;
        ((Toolbar)localObject).E(((View)localObject).getContext(), paramInt2);
      }
      paramInt2 = paramToolbar.l(i.o, 0);
      if (paramInt2 != 0)
      {
        localObject = a;
        ((Toolbar)localObject).D(((View)localObject).getContext(), paramInt2);
      }
      paramInt2 = paramToolbar.l(i.m, 0);
      if (paramInt2 != 0) {
        a.setPopupTheme(paramInt2);
      }
    }
    else
    {
      b = d();
    }
    paramToolbar.t();
    g(paramInt1);
    j = a.getNavigationContentDescription();
    a.setNavigationOnClickListener(new a());
  }
  
  public void a(CharSequence paramCharSequence)
  {
    if (!g) {
      o(paramCharSequence);
    }
  }
  
  public void b(Window.Callback paramCallback)
  {
    k = paramCallback;
  }
  
  public void c(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = g.a.b(e(), paramInt);
    } else {
      localDrawable = null;
    }
    i(localDrawable);
  }
  
  public final int d()
  {
    int i1;
    if (a.getNavigationIcon() != null)
    {
      o = a.getNavigationIcon();
      i1 = 15;
    }
    else
    {
      i1 = 11;
    }
    return i1;
  }
  
  public Context e()
  {
    return a.getContext();
  }
  
  public void f(View paramView)
  {
    View localView = c;
    if ((localView != null) && ((b & 0x10) != 0)) {
      a.removeView(localView);
    }
    c = paramView;
    if ((paramView != null) && ((b & 0x10) != 0)) {
      a.addView(paramView);
    }
  }
  
  public void g(int paramInt)
  {
    if (paramInt == n) {
      return;
    }
    n = paramInt;
    if (TextUtils.isEmpty(a.getNavigationContentDescription())) {
      j(n);
    }
  }
  
  public CharSequence getTitle()
  {
    return a.getTitle();
  }
  
  public void h(int paramInt)
  {
    int i1 = b ^ paramInt;
    b = paramInt;
    if (i1 != 0)
    {
      if ((i1 & 0x4) != 0)
      {
        if ((paramInt & 0x4) != 0) {
          p();
        }
        q();
      }
      if ((i1 & 0x3) != 0) {
        r();
      }
      Object localObject;
      if ((i1 & 0x8) != 0)
      {
        CharSequence localCharSequence;
        if ((paramInt & 0x8) != 0)
        {
          a.setTitle(h);
          localObject = a;
          localCharSequence = i;
        }
        for (;;)
        {
          ((Toolbar)localObject).setSubtitle(localCharSequence);
          break;
          localObject = a;
          localCharSequence = null;
          ((Toolbar)localObject).setTitle(null);
          localObject = a;
        }
      }
      if ((i1 & 0x10) != 0)
      {
        localObject = c;
        if (localObject != null) {
          if ((paramInt & 0x10) != 0) {
            a.addView((View)localObject);
          } else {
            a.removeView((View)localObject);
          }
        }
      }
    }
  }
  
  public void i(Drawable paramDrawable)
  {
    e = paramDrawable;
    r();
  }
  
  public void j(int paramInt)
  {
    String str;
    if (paramInt == 0) {
      str = null;
    } else {
      str = e().getString(paramInt);
    }
    k(str);
  }
  
  public void k(CharSequence paramCharSequence)
  {
    j = paramCharSequence;
    p();
  }
  
  public void l(Drawable paramDrawable)
  {
    f = paramDrawable;
    q();
  }
  
  public void m(CharSequence paramCharSequence)
  {
    i = paramCharSequence;
    if ((b & 0x8) != 0) {
      a.setSubtitle(paramCharSequence);
    }
  }
  
  public void n(CharSequence paramCharSequence)
  {
    g = true;
    o(paramCharSequence);
  }
  
  public final void o(CharSequence paramCharSequence)
  {
    h = paramCharSequence;
    if ((b & 0x8) != 0) {
      a.setTitle(paramCharSequence);
    }
  }
  
  public final void p()
  {
    if ((b & 0x4) != 0) {
      if (TextUtils.isEmpty(j)) {
        a.setNavigationContentDescription(n);
      } else {
        a.setNavigationContentDescription(j);
      }
    }
  }
  
  public final void q()
  {
    Toolbar localToolbar;
    if ((b & 0x4) != 0)
    {
      localToolbar = a;
      localDrawable = f;
      if (localDrawable != null) {}
    }
    for (Drawable localDrawable = o;; localDrawable = null)
    {
      localToolbar.setNavigationIcon(localDrawable);
      break;
      localToolbar = a;
    }
  }
  
  public final void r()
  {
    int i1 = b;
    Drawable localDrawable;
    if ((i1 & 0x2) != 0)
    {
      if ((i1 & 0x1) != 0)
      {
        localDrawable = e;
        if (localDrawable != null) {}
      }
      else
      {
        localDrawable = d;
      }
    }
    else {
      localDrawable = null;
    }
    a.setLogo(localDrawable);
  }
  
  public void setIcon(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = g.a.b(e(), paramInt);
    } else {
      localDrawable = null;
    }
    setIcon(localDrawable);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    d = paramDrawable;
    r();
  }
  
  public class a
    implements View.OnClickListener
  {
    public final k.a o = new k.a(a.getContext(), 0, 16908332, 0, 0, h);
    
    public a() {}
    
    public void onClick(View paramView)
    {
      paramView = d.this;
      Window.Callback localCallback = k;
      if ((localCallback != null) && (l)) {
        localCallback.onMenuItemSelected(0, o);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */