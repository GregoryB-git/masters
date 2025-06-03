package l;

import I.s;
import L.d;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import e.i;
import g.a;

public class h
{
  public final ImageView a;
  public V b;
  public V c;
  public V d;
  
  public h(ImageView paramImageView)
  {
    a = paramImageView;
  }
  
  public final boolean a(Drawable paramDrawable)
  {
    if (d == null) {
      d = new V();
    }
    V localV = d;
    localV.a();
    Object localObject = d.a(a);
    if (localObject != null)
    {
      d = true;
      a = ((ColorStateList)localObject);
    }
    localObject = d.b(a);
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
    Drawable localDrawable = a.getDrawable();
    if (localDrawable != null) {
      B.b(localDrawable);
    }
    if (localDrawable != null)
    {
      if ((j()) && (a(localDrawable))) {
        return;
      }
      V localV = c;
      if (localV != null)
      {
        e.g(localDrawable, localV, a.getDrawableState());
      }
      else
      {
        localV = b;
        if (localV != null) {
          e.g(localDrawable, localV, a.getDrawableState());
        }
      }
    }
  }
  
  public ColorStateList c()
  {
    Object localObject = c;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode d()
  {
    Object localObject = c;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public boolean e()
  {
    return !(a.getBackground() instanceof RippleDrawable);
  }
  
  public void f(AttributeSet paramAttributeSet, int paramInt)
  {
    X localX = X.s(a.getContext(), paramAttributeSet, i.H, paramInt, 0);
    Object localObject = a;
    s.B((View)localObject, ((View)localObject).getContext(), i.H, paramAttributeSet, localX.o(), paramInt, 0);
    try
    {
      localObject = a.getDrawable();
      paramAttributeSet = (AttributeSet)localObject;
      if (localObject == null)
      {
        paramInt = localX.l(i.I, -1);
        paramAttributeSet = (AttributeSet)localObject;
        if (paramInt != -1)
        {
          localObject = a.b(a.getContext(), paramInt);
          paramAttributeSet = (AttributeSet)localObject;
          if (localObject != null)
          {
            a.setImageDrawable((Drawable)localObject);
            paramAttributeSet = (AttributeSet)localObject;
          }
        }
      }
    }
    finally
    {
      break label183;
    }
    if (paramAttributeSet != null) {
      B.b(paramAttributeSet);
    }
    if (localX.p(i.J)) {
      d.c(a, localX.c(i.J));
    }
    if (localX.p(i.K)) {
      d.d(a, B.c(localX.i(i.K, -1), null));
    }
    localX.t();
    return;
    label183:
    localX.t();
    throw paramAttributeSet;
  }
  
  public void g(int paramInt)
  {
    if (paramInt != 0)
    {
      Drawable localDrawable = a.b(a.getContext(), paramInt);
      if (localDrawable != null) {
        B.b(localDrawable);
      }
      a.setImageDrawable(localDrawable);
    }
    else
    {
      a.setImageDrawable(null);
    }
    b();
  }
  
  public void h(ColorStateList paramColorStateList)
  {
    if (c == null) {
      c = new V();
    }
    V localV = c;
    a = paramColorStateList;
    d = true;
    b();
  }
  
  public void i(PorterDuff.Mode paramMode)
  {
    if (c == null) {
      c = new V();
    }
    V localV = c;
    b = paramMode;
    c = true;
    b();
  }
  
  public final boolean j()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     l.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */