package l;

import I.s;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e.i;

public class d
{
  public final View a;
  public final e b;
  public int c = -1;
  public V d;
  public V e;
  public V f;
  
  public d(View paramView)
  {
    a = paramView;
    b = e.b();
  }
  
  public final boolean a(Drawable paramDrawable)
  {
    if (f == null) {
      f = new V();
    }
    V localV = f;
    localV.a();
    Object localObject = s.j(a);
    if (localObject != null)
    {
      d = true;
      a = ((ColorStateList)localObject);
    }
    localObject = s.k(a);
    if (localObject != null)
    {
      c = true;
      b = ((PorterDuff.Mode)localObject);
    }
    if ((!d) && (!c)) {
      return false;
    }
    e.g(paramDrawable, localV, a.getDrawableState());
    return true;
  }
  
  public void b()
  {
    Drawable localDrawable = a.getBackground();
    if (localDrawable != null)
    {
      if ((k()) && (a(localDrawable))) {
        return;
      }
      V localV = e;
      if (localV != null)
      {
        e.g(localDrawable, localV, a.getDrawableState());
      }
      else
      {
        localV = d;
        if (localV != null) {
          e.g(localDrawable, localV, a.getDrawableState());
        }
      }
    }
  }
  
  public ColorStateList c()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode d()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public void e(AttributeSet paramAttributeSet, int paramInt)
  {
    X localX = X.s(a.getContext(), paramAttributeSet, i.O2, paramInt, 0);
    View localView = a;
    s.B(localView, localView.getContext(), i.O2, paramAttributeSet, localX.o(), paramInt, 0);
    try
    {
      if (localX.p(i.P2))
      {
        c = localX.l(i.P2, -1);
        paramAttributeSet = b.e(a.getContext(), c);
        if (paramAttributeSet != null) {
          h(paramAttributeSet);
        }
      }
    }
    finally
    {
      break label158;
    }
    if (localX.p(i.Q2)) {
      s.F(a, localX.c(i.Q2));
    }
    if (localX.p(i.R2)) {
      s.G(a, B.c(localX.i(i.R2, -1), null));
    }
    localX.t();
    return;
    label158:
    localX.t();
    throw paramAttributeSet;
  }
  
  public void f(Drawable paramDrawable)
  {
    c = -1;
    h(null);
    b();
  }
  
  public void g(int paramInt)
  {
    c = paramInt;
    Object localObject = b;
    if (localObject != null) {
      localObject = ((e)localObject).e(a.getContext(), paramInt);
    } else {
      localObject = null;
    }
    h((ColorStateList)localObject);
    b();
  }
  
  public void h(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (d == null) {
        d = new V();
      }
      V localV = d;
      a = paramColorStateList;
      d = true;
    }
    else
    {
      d = null;
    }
    b();
  }
  
  public void i(ColorStateList paramColorStateList)
  {
    if (e == null) {
      e = new V();
    }
    V localV = e;
    a = paramColorStateList;
    d = true;
    b();
  }
  
  public void j(PorterDuff.Mode paramMode)
  {
    if (e == null) {
      e = new V();
    }
    V localV = e;
    b = paramMode;
    c = true;
    b();
  }
  
  public final boolean k()
  {
    boolean bool;
    if (d != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     l.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */