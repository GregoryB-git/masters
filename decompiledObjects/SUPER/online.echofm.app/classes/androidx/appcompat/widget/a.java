package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.b;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g.a;
import androidx.appcompat.view.menu.h.a;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;
import k.c;
import l.E;
import l.Z;

public class a
  extends androidx.appcompat.view.menu.a
{
  public boolean A;
  public boolean B;
  public int C;
  public int D;
  public int E;
  public boolean F;
  public boolean G;
  public boolean H;
  public boolean I;
  public int J;
  public final SparseBooleanArray K = new SparseBooleanArray();
  public e L;
  public a M;
  public c N;
  public b O;
  public final f P = new f();
  public int Q;
  public d x;
  public Drawable y;
  public boolean z;
  
  public a(Context paramContext)
  {
    super(paramContext, e.f.c, e.f.b);
  }
  
  public boolean A()
  {
    a locala = M;
    if (locala != null)
    {
      locala.b();
      return true;
    }
    return false;
  }
  
  public boolean B()
  {
    e locale = L;
    boolean bool;
    if ((locale != null) && (locale.d())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void C(Configuration paramConfiguration)
  {
    if (!F) {
      E = j.a.a(p).c();
    }
    paramConfiguration = q;
    if (paramConfiguration != null) {
      paramConfiguration.G(true);
    }
  }
  
  public void D(boolean paramBoolean)
  {
    I = paramBoolean;
  }
  
  public void E(ActionMenuView paramActionMenuView)
  {
    w = paramActionMenuView;
    paramActionMenuView.E(q);
  }
  
  public void F(Drawable paramDrawable)
  {
    d locald = x;
    if (locald != null)
    {
      locald.setImageDrawable(paramDrawable);
    }
    else
    {
      z = true;
      y = paramDrawable;
    }
  }
  
  public void G(boolean paramBoolean)
  {
    A = paramBoolean;
    B = true;
  }
  
  public boolean H()
  {
    if ((A) && (!B()))
    {
      Object localObject = q;
      if ((localObject != null) && (w != null) && (N == null) && (!((d)localObject).v().isEmpty()))
      {
        localObject = new c(new e(p, q, x, true));
        N = ((c)localObject);
        ((View)w).post((Runnable)localObject);
        return true;
      }
    }
    return false;
  }
  
  public void b(d paramd, boolean paramBoolean)
  {
    w();
    super.b(paramd, paramBoolean);
  }
  
  public void c(Context paramContext, d paramd)
  {
    super.c(paramContext, paramd);
    paramd = paramContext.getResources();
    paramContext = j.a.a(paramContext);
    if (!B) {
      A = paramContext.d();
    }
    if (!H) {
      C = paramContext.b();
    }
    if (!F) {
      E = paramContext.c();
    }
    int i = C;
    if (A)
    {
      if (x == null)
      {
        paramContext = new d(o);
        x = paramContext;
        if (z)
        {
          paramContext.setImageDrawable(y);
          y = null;
          z = false;
        }
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        x.measure(j, j);
      }
      i -= x.getMeasuredWidth();
    }
    else
    {
      x = null;
    }
    D = i;
    J = ((int)(getDisplayMetricsdensity * 56.0F));
  }
  
  public void d(e parame, h.a parama)
  {
    parama.d(parame, 0);
    parame = (ActionMenuView)w;
    parama = (ActionMenuItemView)parama;
    parama.setItemInvoker(parame);
    if (O == null) {
      O = new b();
    }
    parama.setPopupCallback(O);
  }
  
  public boolean e(j paramj)
  {
    boolean bool1 = paramj.hasVisibleItems();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    for (Object localObject = paramj; ((j)localObject).W() != q; localObject = (j)((j)localObject).W()) {}
    localObject = x(((j)localObject).getItem());
    if (localObject == null) {
      return false;
    }
    Q = paramj.getItem().getItemId();
    int i = paramj.size();
    for (int j = 0;; j++)
    {
      bool1 = bool2;
      if (j >= i) {
        break;
      }
      MenuItem localMenuItem = paramj.getItem(j);
      if ((localMenuItem.isVisible()) && (localMenuItem.getIcon() != null))
      {
        bool1 = true;
        break;
      }
    }
    localObject = new a(p, paramj, (View)localObject);
    M = ((a)localObject);
    ((androidx.appcompat.view.menu.f)localObject).g(bool1);
    M.k();
    super.e(paramj);
    return true;
  }
  
  public void f(boolean paramBoolean)
  {
    super.f(paramBoolean);
    ((View)w).requestLayout();
    Object localObject = q;
    int j;
    if (localObject != null)
    {
      localObject = ((d)localObject).r();
      int i = ((ArrayList)localObject).size();
      for (j = 0; j < i; j++) {
        ((e)((ArrayList)localObject).get(j)).g();
      }
    }
    localObject = q;
    if (localObject != null) {
      localObject = ((d)localObject).v();
    } else {
      localObject = null;
    }
    if ((A) && (localObject != null))
    {
      j = ((ArrayList)localObject).size();
      if (j == 1 ? (((e)((ArrayList)localObject).get(0)).isActionViewExpanded() ^ true) : j > 0)
      {
        if (x == null) {
          x = new d(o);
        }
        localObject = (ViewGroup)x.getParent();
        if (localObject == w) {
          break label242;
        }
        if (localObject != null) {
          ((ViewGroup)localObject).removeView(x);
        }
        localObject = (ActionMenuView)w;
        ((ViewGroup)localObject).addView(x, ((ActionMenuView)localObject).C());
        break label242;
      }
    }
    localObject = x;
    if (localObject != null)
    {
      ViewParent localViewParent = ((View)localObject).getParent();
      localObject = w;
      if (localViewParent == localObject) {
        ((ViewGroup)localObject).removeView(x);
      }
    }
    label242:
    ((ActionMenuView)w).setOverflowReserved(A);
  }
  
  public boolean g()
  {
    Object localObject1 = this;
    Object localObject2 = q;
    int i = 0;
    if (localObject2 != null)
    {
      localObject2 = ((d)localObject2).A();
      j = ((ArrayList)localObject2).size();
    }
    else
    {
      localObject2 = null;
      j = 0;
    }
    int k = E;
    int m = D;
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)w;
    int i1 = 0;
    int i2 = i1;
    int i3 = i2;
    int i5 = i3;
    int i7 = i3;
    int i9 = i2;
    i3 = i1;
    for (i2 = k; i3 < j; i2 = i1)
    {
      localObject3 = (e)((ArrayList)localObject2).get(i3);
      if (((e)localObject3).n()) {
        i7++;
      } else if (((e)localObject3).m()) {
        i5++;
      } else {
        i9 = 1;
      }
      i1 = i2;
      if (I)
      {
        i1 = i2;
        if (((e)localObject3).isActionViewExpanded()) {
          i1 = 0;
        }
      }
      i3++;
    }
    i3 = i2;
    int i4;
    if (A) {
      if (i9 == 0)
      {
        i3 = i2;
        if (i5 + i7 <= i2) {}
      }
      else
      {
        i4 = i2 - 1;
      }
    }
    int i6 = i4 - i7;
    Object localObject3 = K;
    ((SparseBooleanArray)localObject3).clear();
    if (G)
    {
      i2 = J;
      i4 = m / i2;
      k = i2 + m % i2 / i4;
    }
    else
    {
      k = 0;
      i4 = k;
    }
    int i11 = 0;
    i2 = i11;
    i9 = m;
    m = j;
    int j = i;
    for (;;)
    {
      localObject1 = this;
      if (i11 >= m) {
        break;
      }
      e locale = (e)((ArrayList)localObject2).get(i11);
      View localView;
      int i10;
      int i8;
      if (locale.n())
      {
        localView = ((a)localObject1).n(locale, null, localViewGroup);
        if (G) {
          i4 -= ActionMenuView.G(localView, k, i4, n, j);
        } else {
          localView.measure(n, n);
        }
        i1 = localView.getMeasuredWidth();
        i9 -= i1;
        i7 = i2;
        if (i2 == 0) {
          i7 = i1;
        }
        i2 = locale.getGroupId();
        if (i2 != 0) {
          ((SparseBooleanArray)localObject3).put(i2, true);
        }
        locale.t(true);
        i2 = j;
      }
      else if (locale.m())
      {
        i = locale.getGroupId();
        boolean bool1 = ((SparseBooleanArray)localObject3).get(i);
        int i12;
        if (((i6 > 0) || (bool1)) && (i10 > 0) && ((!G) || (i4 > 0))) {
          i12 = 1;
        } else {
          i12 = 0;
        }
        int i13 = i12;
        boolean bool2 = i12;
        i1 = i10;
        j = i4;
        i7 = i2;
        if (i12 != 0)
        {
          localView = ((a)localObject1).n(locale, null, localViewGroup);
          if (G)
          {
            i8 = ActionMenuView.G(localView, k, i4, n, 0);
            j = i4 - i8;
            i4 = j;
            if (i8 == 0)
            {
              i13 = 0;
              i4 = j;
            }
          }
          for (;;)
          {
            break;
            localView.measure(n, n);
          }
          j = localView.getMeasuredWidth();
          i1 = i10 - j;
          i8 = i2;
          if (i2 == 0) {
            i8 = j;
          }
          if (G) {
            if (i1 < 0) {}
          }
          for (;;)
          {
            i2 = 1;
            do
            {
              i2 = 0;
              bool2 = i13 & i2;
              j = i4;
              break;
            } while (i1 + i8 <= 0);
          }
        }
        if ((bool2) && (i != 0))
        {
          ((SparseBooleanArray)localObject3).put(i, true);
          i2 = i6;
        }
        else
        {
          i2 = i6;
          if (bool1)
          {
            ((SparseBooleanArray)localObject3).put(i, false);
            i4 = 0;
            for (;;)
            {
              i2 = i6;
              if (i4 >= i11) {
                break;
              }
              localObject1 = (e)((ArrayList)localObject2).get(i4);
              i2 = i6;
              if (((e)localObject1).getGroupId() == i)
              {
                i2 = i6;
                if (((e)localObject1).k()) {
                  i2 = i6 + 1;
                }
                ((e)localObject1).t(false);
              }
              i4++;
              i6 = i2;
            }
          }
        }
        i4 = i2;
        if (bool2) {
          i4 = i2 - 1;
        }
        locale.t(bool2);
        i2 = 0;
        i6 = i4;
        i10 = i1;
        i4 = j;
      }
      else
      {
        locale.t(j);
        i8 = i2;
        i2 = j;
      }
      i11++;
      j = i2;
      i2 = i8;
    }
    return true;
  }
  
  public boolean l(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == x) {
      return false;
    }
    return super.l(paramViewGroup, paramInt);
  }
  
  public View n(e parame, View paramView, ViewGroup paramViewGroup)
  {
    View localView = parame.getActionView();
    if ((localView == null) || (parame.i())) {
      localView = super.n(parame, paramView, paramViewGroup);
    }
    int i;
    if (parame.isActionViewExpanded()) {
      i = 8;
    } else {
      i = 0;
    }
    localView.setVisibility(i);
    parame = (ActionMenuView)paramViewGroup;
    paramView = localView.getLayoutParams();
    if (!parame.checkLayoutParams(paramView)) {
      localView.setLayoutParams(parame.B(paramView));
    }
    return localView;
  }
  
  public boolean o(int paramInt, e parame)
  {
    return parame.k();
  }
  
  public boolean w()
  {
    return z() | A();
  }
  
  public final View x(MenuItem paramMenuItem)
  {
    ViewGroup localViewGroup = (ViewGroup)w;
    if (localViewGroup == null) {
      return null;
    }
    int i = localViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = localViewGroup.getChildAt(j);
      if (((localView instanceof h.a)) && (((h.a)localView).getItemData() == paramMenuItem)) {
        return localView;
      }
    }
    return null;
  }
  
  public Drawable y()
  {
    d locald = x;
    if (locald != null) {
      return locald.getDrawable();
    }
    if (z) {
      return y;
    }
    return null;
  }
  
  public boolean z()
  {
    c localc = N;
    if (localc != null)
    {
      localObject = w;
      if (localObject != null)
      {
        ((View)localObject).removeCallbacks(localc);
        N = null;
        return true;
      }
    }
    Object localObject = L;
    if (localObject != null)
    {
      ((androidx.appcompat.view.menu.f)localObject).b();
      return true;
    }
    return false;
  }
  
  public class a
    extends androidx.appcompat.view.menu.f
  {
    public a(Context paramContext, j paramj, View paramView)
    {
      super(paramj, paramView, false, e.a.f);
      if (!((e)paramj.getItem()).k())
      {
        paramj = x;
        paramContext = paramj;
        if (paramj == null) {
          paramContext = (View)a.r(a.this);
        }
        f(paramContext);
      }
      j(P);
    }
    
    public void e()
    {
      a locala = a.this;
      M = null;
      Q = 0;
      super.e();
    }
  }
  
  public class b
    extends ActionMenuItemView.b
  {
    public b() {}
    
    public c a()
    {
      Object localObject = M;
      if (localObject != null) {
        localObject = ((androidx.appcompat.view.menu.f)localObject).c();
      } else {
        localObject = null;
      }
      return (c)localObject;
    }
  }
  
  public class c
    implements Runnable
  {
    public a.e o;
    
    public c(a.e parame)
    {
      o = parame;
    }
    
    public void run()
    {
      if (a.t(a.this) != null) {
        a.u(a.this).c();
      }
      View localView = (View)a.v(a.this);
      if ((localView != null) && (localView.getWindowToken() != null) && (o.m())) {
        L = o;
      }
      N = null;
    }
  }
  
  public class d
    extends AppCompatImageView
    implements ActionMenuView.a
  {
    public d(Context paramContext)
    {
      super(null, e.a.e);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      Z.a(this, getContentDescription());
      setOnTouchListener(new a(this, a.this));
    }
    
    public boolean b()
    {
      return false;
    }
    
    public boolean c()
    {
      return false;
    }
    
    public boolean performClick()
    {
      if (super.performClick()) {
        return true;
      }
      playSoundEffect(0);
      H();
      return true;
    }
    
    public boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        paramInt2 = getHeight();
        paramInt1 = Math.max(i, paramInt2) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        paramInt4 = getPaddingTop();
        paramInt3 = getPaddingBottom();
        j = (i + (j - k)) / 2;
        paramInt2 = (paramInt2 + (paramInt4 - paramInt3)) / 2;
        B.a.k(localDrawable2, j - paramInt1, paramInt2 - paramInt1, j + paramInt1, paramInt2 + paramInt1);
      }
      return bool;
    }
    
    public class a
      extends E
    {
      public a(View paramView, a parama)
      {
        super();
      }
      
      public c b()
      {
        a.e locale = L;
        if (locale == null) {
          return null;
        }
        return locale.c();
      }
      
      public boolean c()
      {
        H();
        return true;
      }
      
      public boolean d()
      {
        a locala = a.this;
        if (N != null) {
          return false;
        }
        locala.z();
        return true;
      }
    }
  }
  
  public class e
    extends androidx.appcompat.view.menu.f
  {
    public e(Context paramContext, d paramd, View paramView, boolean paramBoolean)
    {
      super(paramd, paramView, paramBoolean, e.a.f);
      h(8388613);
      j(P);
    }
    
    public void e()
    {
      if (a.p(a.this) != null) {
        a.q(a.this).close();
      }
      L = null;
      super.e();
    }
  }
  
  public class f
    implements g.a
  {
    public f() {}
    
    public void b(d paramd, boolean paramBoolean)
    {
      if ((paramd instanceof j)) {
        paramd.z().d(false);
      }
      g.a locala = m();
      if (locala != null) {
        locala.b(paramd, paramBoolean);
      }
    }
    
    public boolean c(d paramd)
    {
      Object localObject = a.s(a.this);
      boolean bool = false;
      if (paramd == localObject) {
        return false;
      }
      Q = ((j)paramd).getItem().getItemId();
      localObject = m();
      if (localObject != null) {
        bool = ((g.a)localObject).c(paramd);
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */