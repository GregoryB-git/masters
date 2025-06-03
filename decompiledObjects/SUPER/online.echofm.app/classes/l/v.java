package l;

import L.b;
import L.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import e.i;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Locale;
import z.h.b;

public class v
{
  public final TextView a;
  public V b;
  public V c;
  public V d;
  public V e;
  public V f;
  public V g;
  public V h;
  public final x i;
  public int j = 0;
  public int k = -1;
  public Typeface l;
  public boolean m;
  
  public v(TextView paramTextView)
  {
    a = paramTextView;
    i = new x(paramTextView);
  }
  
  public static V d(Context paramContext, e parame, int paramInt)
  {
    paramContext = parame.e(paramContext, paramInt);
    if (paramContext != null)
    {
      parame = new V();
      d = true;
      a = paramContext;
      return parame;
    }
    return null;
  }
  
  public final void A(int paramInt, float paramFloat)
  {
    i.u(paramInt, paramFloat);
  }
  
  public final void B(Context paramContext, X paramX)
  {
    j = paramX.i(i.c2, j);
    int n = Build.VERSION.SDK_INT;
    int i1;
    if (n >= 28)
    {
      i1 = paramX.i(i.e2, -1);
      k = i1;
      if (i1 != -1) {
        j &= 0x2;
      }
    }
    boolean bool1 = paramX.p(i.d2);
    boolean bool2 = true;
    if ((!bool1) && (!paramX.p(i.f2)))
    {
      if (paramX.p(i.b2))
      {
        m = false;
        i1 = paramX.i(i.b2, 1);
        if (i1 != 1) {
          if (i1 != 2)
          {
            if (i1 != 3) {
              break label159;
            }
            paramContext = Typeface.MONOSPACE;
          }
        }
        for (;;)
        {
          l = paramContext;
          break;
          paramContext = Typeface.SERIF;
          continue;
          paramContext = Typeface.SANS_SERIF;
        }
      }
      label159:
      return;
    }
    l = null;
    if (paramX.p(i.f2)) {
      i1 = i.f2;
    } else {
      i1 = i.d2;
    }
    final int i2 = k;
    final int i3 = j;
    if (!paramContext.isRestricted()) {
      paramContext = new a(i2, i3, new WeakReference(a));
    }
    try
    {
      Typeface localTypeface = paramX.h(i1, j, paramContext);
      if (localTypeface != null)
      {
        paramContext = localTypeface;
        if (n >= 28)
        {
          paramContext = localTypeface;
          if (k != -1)
          {
            paramContext = Typeface.create(localTypeface, 0);
            n = k;
            if ((j & 0x2) != 0) {
              bool1 = true;
            } else {
              bool1 = false;
            }
            paramContext = u.a(paramContext, n, bool1);
          }
        }
        l = paramContext;
      }
      if (l == null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      m = bool1;
    }
    catch (UnsupportedOperationException|Resources.NotFoundException paramContext)
    {
      for (;;) {}
    }
    if (l == null)
    {
      paramContext = paramX.m(i1);
      if (paramContext != null)
      {
        if ((Build.VERSION.SDK_INT >= 28) && (k != -1))
        {
          paramContext = Typeface.create(paramContext, 0);
          i1 = k;
          if ((j & 0x2) != 0) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
        for (paramContext = u.a(paramContext, i1, bool1);; paramContext = Typeface.create(paramContext, j))
        {
          l = paramContext;
          break;
        }
      }
    }
  }
  
  public final void a(Drawable paramDrawable, V paramV)
  {
    if ((paramDrawable != null) && (paramV != null)) {
      e.g(paramDrawable, paramV, a.getDrawableState());
    }
  }
  
  public void b()
  {
    Drawable[] arrayOfDrawable;
    if ((b != null) || (c != null) || (d != null) || (e != null))
    {
      arrayOfDrawable = a.getCompoundDrawables();
      a(arrayOfDrawable[0], b);
      a(arrayOfDrawable[1], c);
      a(arrayOfDrawable[2], d);
      a(arrayOfDrawable[3], e);
    }
    if ((f != null) || (g != null))
    {
      arrayOfDrawable = a.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], f);
      a(arrayOfDrawable[2], g);
    }
  }
  
  public void c()
  {
    i.a();
  }
  
  public int e()
  {
    return i.g();
  }
  
  public int f()
  {
    return i.h();
  }
  
  public int g()
  {
    return i.i();
  }
  
  public int[] h()
  {
    return i.j();
  }
  
  public int i()
  {
    return i.k();
  }
  
  public ColorStateList j()
  {
    Object localObject = h;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode k()
  {
    Object localObject = h;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public boolean l()
  {
    return i.o();
  }
  
  public void m(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = a.getContext();
    e locale = e.b();
    Object localObject2 = X.s((Context)localObject1, paramAttributeSet, i.M, paramInt, 0);
    Object localObject3 = a;
    I.s.B((View)localObject3, ((View)localObject3).getContext(), i.M, paramAttributeSet, ((X)localObject2).o(), paramInt, 0);
    int n = ((X)localObject2).l(i.N, -1);
    if (((X)localObject2).p(i.Q)) {
      b = d((Context)localObject1, locale, ((X)localObject2).l(i.Q, 0));
    }
    if (((X)localObject2).p(i.O)) {
      c = d((Context)localObject1, locale, ((X)localObject2).l(i.O, 0));
    }
    if (((X)localObject2).p(i.R)) {
      d = d((Context)localObject1, locale, ((X)localObject2).l(i.R, 0));
    }
    if (((X)localObject2).p(i.P)) {
      e = d((Context)localObject1, locale, ((X)localObject2).l(i.P, 0));
    }
    int i1 = Build.VERSION.SDK_INT;
    if (((X)localObject2).p(i.S)) {
      f = d((Context)localObject1, locale, ((X)localObject2).l(i.S, 0));
    }
    if (((X)localObject2).p(i.T)) {
      g = d((Context)localObject1, locale, ((X)localObject2).l(i.T, 0));
    }
    ((X)localObject2).t();
    boolean bool1 = a.getTransformationMethod() instanceof PasswordTransformationMethod;
    boolean bool2;
    int i2;
    if (n != -1)
    {
      localObject4 = X.q((Context)localObject1, n, i.Z1);
      if ((!bool1) && (((X)localObject4).p(i.h2)))
      {
        bool2 = ((X)localObject4).a(i.h2, false);
        i2 = 1;
      }
      else
      {
        bool2 = false;
        i2 = bool2;
      }
      B((Context)localObject1, (X)localObject4);
      if (((X)localObject4).p(i.i2)) {
        localObject2 = ((X)localObject4).m(i.i2);
      } else {
        localObject2 = null;
      }
      if ((i1 >= 26) && (((X)localObject4).p(i.g2))) {
        localObject3 = ((X)localObject4).m(i.g2);
      } else {
        localObject3 = null;
      }
      ((X)localObject4).t();
    }
    else
    {
      bool2 = false;
      i2 = bool2;
      localObject3 = null;
      localObject2 = null;
    }
    Object localObject5 = X.s((Context)localObject1, paramAttributeSet, i.Z1, paramInt, 0);
    if ((!bool1) && (((X)localObject5).p(i.h2)))
    {
      bool2 = ((X)localObject5).a(i.h2, false);
      i2 = 1;
    }
    if (((X)localObject5).p(i.i2)) {
      localObject2 = ((X)localObject5).m(i.i2);
    }
    Object localObject4 = localObject3;
    if (i1 >= 26)
    {
      localObject4 = localObject3;
      if (((X)localObject5).p(i.g2)) {
        localObject4 = ((X)localObject5).m(i.g2);
      }
    }
    if ((i1 >= 28) && (((X)localObject5).p(i.a2)) && (((X)localObject5).e(i.a2, -1) == 0)) {
      a.setTextSize(0, 0.0F);
    }
    B((Context)localObject1, (X)localObject5);
    ((X)localObject5).t();
    if ((!bool1) && (i2 != 0)) {
      r(bool2);
    }
    localObject3 = l;
    if (localObject3 != null) {
      if (k == -1) {
        a.setTypeface((Typeface)localObject3, j);
      } else {
        a.setTypeface((Typeface)localObject3);
      }
    }
    if (localObject4 != null) {
      o.a(a, (String)localObject4);
    }
    if (localObject2 != null) {
      if (i1 >= 24)
      {
        q.a(a, p.a((String)localObject2));
      }
      else
      {
        localObject3 = ((String)localObject2).substring(0, ((String)localObject2).indexOf(','));
        a.setTextLocale(Locale.forLanguageTag((String)localObject3));
      }
    }
    i.p(paramAttributeSet, paramInt);
    if ((b.b) && (i.k() != 0))
    {
      localObject3 = i.j();
      if (localObject3.length > 0) {
        if (r.a(a) != -1.0F) {
          s.a(a, i.h(), i.g(), i.i(), 0);
        } else {
          t.a(a, (int[])localObject3, 0);
        }
      }
    }
    X localX = X.r((Context)localObject1, paramAttributeSet, i.U);
    paramInt = localX.l(i.c0, -1);
    if (paramInt != -1) {
      paramAttributeSet = locale.c((Context)localObject1, paramInt);
    } else {
      paramAttributeSet = null;
    }
    paramInt = localX.l(i.h0, -1);
    if (paramInt != -1) {
      localObject3 = locale.c((Context)localObject1, paramInt);
    } else {
      localObject3 = null;
    }
    paramInt = localX.l(i.d0, -1);
    if (paramInt != -1) {
      localObject2 = locale.c((Context)localObject1, paramInt);
    } else {
      localObject2 = null;
    }
    paramInt = localX.l(i.a0, -1);
    if (paramInt != -1) {
      localObject4 = locale.c((Context)localObject1, paramInt);
    } else {
      localObject4 = null;
    }
    paramInt = localX.l(i.e0, -1);
    if (paramInt != -1) {
      localObject5 = locale.c((Context)localObject1, paramInt);
    } else {
      localObject5 = null;
    }
    paramInt = localX.l(i.b0, -1);
    if (paramInt != -1) {
      localObject1 = locale.c((Context)localObject1, paramInt);
    } else {
      localObject1 = null;
    }
    x(paramAttributeSet, (Drawable)localObject3, (Drawable)localObject2, (Drawable)localObject4, (Drawable)localObject5, (Drawable)localObject1);
    if (localX.p(i.f0))
    {
      paramAttributeSet = localX.c(i.f0);
      h.f(a, paramAttributeSet);
    }
    if (localX.p(i.g0))
    {
      paramAttributeSet = B.c(localX.i(i.g0, -1), null);
      h.g(a, paramAttributeSet);
    }
    i1 = localX.e(i.i0, -1);
    n = localX.e(i.j0, -1);
    paramInt = localX.e(i.k0, -1);
    localX.t();
    if (i1 != -1) {
      h.h(a, i1);
    }
    if (n != -1) {
      h.i(a, n);
    }
    if (paramInt != -1) {
      h.j(a, paramInt);
    }
  }
  
  public void n(WeakReference paramWeakReference, Typeface paramTypeface)
  {
    if (m)
    {
      l = paramTypeface;
      paramWeakReference = (TextView)paramWeakReference.get();
      if (paramWeakReference != null) {
        paramWeakReference.setTypeface(paramTypeface, j);
      }
    }
  }
  
  public void o(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!b.b) {
      c();
    }
  }
  
  public void p()
  {
    b();
  }
  
  public void q(Context paramContext, int paramInt)
  {
    X localX = X.q(paramContext, paramInt, i.Z1);
    if (localX.p(i.h2)) {
      r(localX.a(i.h2, false));
    }
    paramInt = Build.VERSION.SDK_INT;
    if ((localX.p(i.a2)) && (localX.e(i.a2, -1) == 0)) {
      a.setTextSize(0, 0.0F);
    }
    B(paramContext, localX);
    if ((paramInt >= 26) && (localX.p(i.g2)))
    {
      paramContext = localX.m(i.g2);
      if (paramContext != null) {
        o.a(a, paramContext);
      }
    }
    localX.t();
    paramContext = l;
    if (paramContext != null) {
      a.setTypeface(paramContext, j);
    }
  }
  
  public void r(boolean paramBoolean)
  {
    a.setAllCaps(paramBoolean);
  }
  
  public void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    i.q(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void t(int[] paramArrayOfInt, int paramInt)
  {
    i.r(paramArrayOfInt, paramInt);
  }
  
  public void u(int paramInt)
  {
    i.s(paramInt);
  }
  
  public void v(ColorStateList paramColorStateList)
  {
    if (h == null) {
      h = new V();
    }
    V localV = h;
    a = paramColorStateList;
    boolean bool;
    if (paramColorStateList != null) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
    y();
  }
  
  public void w(PorterDuff.Mode paramMode)
  {
    if (h == null) {
      h = new V();
    }
    V localV = h;
    b = paramMode;
    boolean bool;
    if (paramMode != null) {
      bool = true;
    } else {
      bool = false;
    }
    c = bool;
    y();
  }
  
  public final void x(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4, Drawable paramDrawable5, Drawable paramDrawable6)
  {
    if ((paramDrawable5 == null) && (paramDrawable6 == null))
    {
      if ((paramDrawable1 != null) || (paramDrawable2 != null) || (paramDrawable3 != null) || (paramDrawable4 != null))
      {
        paramDrawable6 = a.getCompoundDrawablesRelative();
        paramDrawable5 = paramDrawable6[0];
        if ((paramDrawable5 == null) && (paramDrawable6[2] == null))
        {
          paramDrawable6 = a.getCompoundDrawables();
          paramDrawable5 = a;
          if (paramDrawable1 == null) {
            paramDrawable1 = paramDrawable6[0];
          }
          if (paramDrawable2 == null) {
            paramDrawable2 = paramDrawable6[1];
          }
          if (paramDrawable3 == null) {
            paramDrawable3 = paramDrawable6[2];
          }
          if (paramDrawable4 == null) {
            paramDrawable4 = paramDrawable6[3];
          }
          paramDrawable5.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
        }
        else
        {
          paramDrawable1 = a;
          if (paramDrawable2 == null) {
            paramDrawable2 = paramDrawable6[1];
          }
          paramDrawable3 = paramDrawable6[2];
          if (paramDrawable4 == null) {
            paramDrawable4 = paramDrawable6[3];
          }
          paramDrawable1.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable5, paramDrawable2, paramDrawable3, paramDrawable4);
        }
      }
    }
    else
    {
      paramDrawable3 = a.getCompoundDrawablesRelative();
      paramDrawable1 = a;
      if (paramDrawable5 == null) {
        paramDrawable5 = paramDrawable3[0];
      }
      if (paramDrawable2 == null) {
        paramDrawable2 = paramDrawable3[1];
      }
      if (paramDrawable6 == null) {
        paramDrawable6 = paramDrawable3[2];
      }
      if (paramDrawable4 == null) {
        paramDrawable4 = paramDrawable3[3];
      }
      paramDrawable1.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable5, paramDrawable2, paramDrawable6, paramDrawable4);
    }
  }
  
  public final void y()
  {
    V localV = h;
    b = localV;
    c = localV;
    d = localV;
    e = localV;
    f = localV;
    g = localV;
  }
  
  public void z(int paramInt, float paramFloat)
  {
    if ((!b.b) && (!l())) {
      A(paramInt, paramFloat);
    }
  }
  
  public class a
    extends h.b
  {
    public a(int paramInt1, int paramInt2, WeakReference paramWeakReference) {}
    
    public void h(int paramInt) {}
    
    public void i(Typeface paramTypeface)
    {
      Typeface localTypeface = paramTypeface;
      if (Build.VERSION.SDK_INT >= 28)
      {
        int i = i2;
        localTypeface = paramTypeface;
        if (i != -1)
        {
          boolean bool;
          if ((i3 & 0x2) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          localTypeface = u.a(paramTypeface, i, bool);
        }
      }
      n(c, localTypeface);
    }
  }
}

/* Location:
 * Qualified Name:     l.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */