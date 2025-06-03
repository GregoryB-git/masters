package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.b;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.j.a;
import androidx.appcompat.view.menu.k.a;
import androidx.appcompat.view.menu.m;
import java.util.ArrayList;
import k.d;
import l.b1;
import l.l0;
import l.p;

public final class a
  extends androidx.appcompat.view.menu.a
{
  public e A;
  public a B;
  public c C;
  public b D;
  public final f E = new f();
  public d q;
  public Drawable r;
  public boolean s;
  public boolean t;
  public boolean u;
  public int v;
  public int w;
  public int x;
  public boolean y;
  public final SparseBooleanArray z = new SparseBooleanArray();
  
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  public final View a(h paramh, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = paramh.getActionView();
    int i = 0;
    if ((localObject == null) || (paramh.e()))
    {
      if ((paramView instanceof k.a)) {
        paramView = (k.a)paramView;
      } else {
        paramView = (k.a)d.inflate(o, paramViewGroup, false);
      }
      paramView.c(paramh);
      ActionMenuView localActionMenuView = (ActionMenuView)p;
      localObject = (ActionMenuItemView)paramView;
      ((ActionMenuItemView)localObject).setItemInvoker(localActionMenuView);
      if (D == null) {
        D = new b();
      }
      ((ActionMenuItemView)localObject).setPopupCallback(D);
      localObject = (View)paramView;
    }
    if (C) {
      i = 8;
    }
    ((View)localObject).setVisibility(i);
    paramh = (ActionMenuView)paramViewGroup;
    paramView = ((View)localObject).getLayoutParams();
    if (!paramh.checkLayoutParams(paramView)) {
      ((View)localObject).setLayoutParams(ActionMenuView.i(paramView));
    }
    return (View)localObject;
  }
  
  public final void b(androidx.appcompat.view.menu.f paramf, boolean paramBoolean)
  {
    h();
    Object localObject = B;
    if ((localObject != null) && (((i)localObject).b())) {
      j.dismiss();
    }
    localObject = e;
    if (localObject != null) {
      ((j.a)localObject).b(paramf, paramBoolean);
    }
  }
  
  public final boolean c()
  {
    Object localObject1 = this;
    Object localObject2 = c;
    int i;
    if (localObject2 != null)
    {
      localObject2 = ((androidx.appcompat.view.menu.f)localObject2).l();
      i = ((ArrayList)localObject2).size();
    }
    else
    {
      i = 0;
      localObject2 = null;
    }
    int j = x;
    int k = w;
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)p;
    int n = 0;
    int i1 = n;
    int i2 = i1;
    int i3 = i2;
    int i4 = i1;
    int i5;
    for (i1 = j; n < i; i1 = j)
    {
      localObject3 = (h)((ArrayList)localObject2).get(n);
      i5 = y;
      if ((i5 & 0x2) == 2) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        i2++;
      }
      else
      {
        if ((i5 & 0x1) == 1) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0) {
          i3++;
        } else {
          i4 = 1;
        }
      }
      j = i1;
      if (y)
      {
        j = i1;
        if (C) {
          j = 0;
        }
      }
      n++;
    }
    n = i1;
    if (t) {
      if (i4 == 0)
      {
        n = i1;
        if (i3 + i2 <= i1) {}
      }
      else
      {
        n = i1 - 1;
      }
    }
    i1 = n - i2;
    Object localObject3 = z;
    ((SparseBooleanArray)localObject3).clear();
    j = 0;
    i2 = 0;
    for (i4 = k;; i4 = n)
    {
      localObject1 = this;
      if (j >= i) {
        break;
      }
      h localh = (h)((ArrayList)localObject2).get(j);
      n = y;
      if ((n & 0x2) == 2) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if (i3 != 0)
      {
        localObject1 = ((a)localObject1).a(localh, null, localViewGroup);
        ((View)localObject1).measure(m, m);
        k = ((View)localObject1).getMeasuredWidth();
        n = i4 - k;
        i3 = i2;
        if (i2 == 0) {
          i3 = k;
        }
        i2 = b;
        if (i2 != 0) {
          ((SparseBooleanArray)localObject3).put(i2, true);
        }
        localh.f(true);
      }
      for (;;)
      {
        i2 = i3;
        break label699;
        if ((n & 0x1) == 1) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        if (i3 == 0) {
          break;
        }
        i5 = b;
        boolean bool = ((SparseBooleanArray)localObject3).get(i5);
        int i6;
        if (((i1 > 0) || (bool)) && (i4 > 0)) {
          i6 = 1;
        } else {
          i6 = 0;
        }
        n = i4;
        i3 = i2;
        int i7 = i6;
        if (i6 != 0)
        {
          localObject1 = ((a)localObject1).a(localh, null, localViewGroup);
          ((View)localObject1).measure(m, m);
          k = ((View)localObject1).getMeasuredWidth();
          n = i4 - k;
          i3 = i2;
          if (i2 == 0) {
            i3 = k;
          }
          if (n + i3 > 0) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          i7 = i6 & i2;
        }
        if ((i7 != 0) && (i5 != 0))
        {
          ((SparseBooleanArray)localObject3).put(i5, true);
          i2 = i1;
        }
        else
        {
          i2 = i1;
          if (bool)
          {
            ((SparseBooleanArray)localObject3).put(i5, false);
            i4 = 0;
            for (;;)
            {
              i2 = i1;
              if (i4 >= j) {
                break;
              }
              localObject1 = (h)((ArrayList)localObject2).get(i4);
              i2 = i1;
              if (b == i5)
              {
                if ((x & 0x20) == 32) {
                  k = 1;
                } else {
                  k = 0;
                }
                i2 = i1;
                if (k != 0) {
                  i2 = i1 + 1;
                }
                ((h)localObject1).f(false);
              }
              i4++;
              i1 = i2;
            }
          }
        }
        i1 = i2;
        if (i7 != 0) {
          i1 = i2 - 1;
        }
        localh.f(i7);
      }
      localh.f(false);
      n = i4;
      label699:
      j++;
    }
    return true;
  }
  
  public final void f(Context paramContext, androidx.appcompat.view.menu.f paramf)
  {
    b = paramContext;
    LayoutInflater.from(paramContext);
    c = paramf;
    paramf = paramContext.getResources();
    if (!u) {
      t = true;
    }
    int i = getResourcesgetDisplayMetricswidthPixels;
    int j = 2;
    v = (i / 2);
    paramContext = paramContext.getResources().getConfiguration();
    i = screenWidthDp;
    int k = screenHeightDp;
    if ((smallestScreenWidthDp <= 600) && (i <= 600) && ((i <= 960) || (k <= 720)) && ((i <= 720) || (k <= 960)))
    {
      if ((i < 500) && ((i <= 640) || (k <= 480)) && ((i <= 480) || (k <= 640)))
      {
        if (i >= 360) {
          j = 3;
        }
      }
      else {
        j = 4;
      }
    }
    else {
      j = 5;
    }
    x = j;
    j = v;
    if (t)
    {
      if (q == null)
      {
        paramContext = new d(a);
        q = paramContext;
        if (s)
        {
          paramContext.setImageDrawable(r);
          r = null;
          s = false;
        }
        i = View.MeasureSpec.makeMeasureSpec(0, 0);
        q.measure(i, i);
      }
      j -= q.getMeasuredWidth();
    }
    else
    {
      q = null;
    }
    w = j;
    float f = getDisplayMetricsdensity;
  }
  
  public final void g()
  {
    Object localObject1 = (ViewGroup)p;
    int i = 0;
    Object localObject2 = null;
    int n;
    if (localObject1 != null)
    {
      localObject3 = c;
      if (localObject3 != null)
      {
        ((androidx.appcompat.view.menu.f)localObject3).i();
        ArrayList localArrayList = c.l();
        int j = localArrayList.size();
        int k = 0;
        for (m = k;; m = n)
        {
          n = m;
          if (k >= j) {
            break;
          }
          h localh = (h)localArrayList.get(k);
          int i1;
          if ((x & 0x20) == 32) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          n = m;
          if (i1 != 0)
          {
            View localView1 = ((ViewGroup)localObject1).getChildAt(m);
            if ((localView1 instanceof k.a)) {
              localObject3 = ((k.a)localView1).getItemData();
            } else {
              localObject3 = null;
            }
            View localView2 = a(localh, localView1, (ViewGroup)localObject1);
            if (localh != localObject3)
            {
              localView2.setPressed(false);
              localView2.jumpDrawablesToCurrentState();
            }
            if (localView2 != localView1)
            {
              localObject3 = (ViewGroup)localView2.getParent();
              if (localObject3 != null) {
                ((ViewGroup)localObject3).removeView(localView2);
              }
              ((ViewGroup)p).addView(localView2, m);
            }
            n = m + 1;
          }
          k++;
        }
      }
      n = 0;
      while (n < ((ViewGroup)localObject1).getChildCount())
      {
        if (((ViewGroup)localObject1).getChildAt(n) == q)
        {
          m = 0;
        }
        else
        {
          ((ViewGroup)localObject1).removeViewAt(n);
          m = 1;
        }
        if (m == 0) {
          n++;
        }
      }
    }
    ((View)p).requestLayout();
    Object localObject3 = c;
    if (localObject3 != null)
    {
      ((androidx.appcompat.view.menu.f)localObject3).i();
      localObject1 = i;
      n = ((ArrayList)localObject1).size();
      for (m = 0; m < n; m++) {
        localObject3 = getA;
      }
    }
    localObject1 = c;
    localObject3 = localObject2;
    if (localObject1 != null)
    {
      ((androidx.appcompat.view.menu.f)localObject1).i();
      localObject3 = j;
    }
    int m = i;
    boolean bool;
    if (t)
    {
      m = i;
      if (localObject3 != null)
      {
        n = ((ArrayList)localObject3).size();
        if (n == 1)
        {
          bool = get0C ^ true;
        }
        else
        {
          bool = i;
          if (n > 0) {
            bool = true;
          }
        }
      }
    }
    localObject3 = q;
    if (bool)
    {
      if (localObject3 == null) {
        q = new d(a);
      }
      localObject3 = (ViewGroup)q.getParent();
      if (localObject3 != p)
      {
        if (localObject3 != null) {
          ((ViewGroup)localObject3).removeView(q);
        }
        localObject1 = (ActionMenuView)p;
        localObject2 = q;
        localObject1.getClass();
        localObject3 = new ActionMenuView.c();
        gravity = 16;
        a = true;
        ((ViewGroup)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
      }
    }
    else if (localObject3 != null)
    {
      localObject3 = ((View)localObject3).getParent();
      localObject2 = p;
      if (localObject3 == localObject2) {
        ((ViewGroup)localObject2).removeView(q);
      }
    }
    ((ActionMenuView)p).setOverflowReserved(t);
  }
  
  public final boolean h()
  {
    c localc = C;
    if (localc != null)
    {
      localObject = p;
      if (localObject != null)
      {
        ((View)localObject).removeCallbacks(localc);
        C = null;
        return true;
      }
    }
    Object localObject = A;
    if (localObject != null)
    {
      if (((i)localObject).b()) {
        j.dismiss();
      }
      return true;
    }
    return false;
  }
  
  public final boolean i(m paramm)
  {
    boolean bool = paramm.hasVisibleItems();
    int i = 0;
    if (!bool) {
      return false;
    }
    for (Object localObject1 = paramm;; localObject1 = (m)localObject2)
    {
      localObject2 = A;
      if (localObject2 == c) {
        break;
      }
    }
    h localh = B;
    ViewGroup localViewGroup = (ViewGroup)p;
    Object localObject2 = null;
    if (localViewGroup == null)
    {
      localObject1 = localObject2;
    }
    else
    {
      j = localViewGroup.getChildCount();
      for (k = 0;; k++)
      {
        localObject1 = localObject2;
        if (k >= j) {
          break;
        }
        localObject1 = localViewGroup.getChildAt(k);
        if (((localObject1 instanceof k.a)) && (((k.a)localObject1).getItemData() == localh)) {
          break;
        }
      }
    }
    if (localObject1 == null) {
      return false;
    }
    B.getClass();
    int j = paramm.size();
    for (int k = 0; k < j; k++)
    {
      localObject2 = paramm.getItem(k);
      if ((((MenuItem)localObject2).isVisible()) && (((MenuItem)localObject2).getIcon() != null))
      {
        bool = true;
        break label207;
      }
    }
    bool = false;
    label207:
    localObject1 = new a(b, paramm, (View)localObject1);
    B = ((a)localObject1);
    h = bool;
    localObject1 = j;
    if (localObject1 != null) {
      ((d)localObject1).n(bool);
    }
    localObject1 = B;
    if (((i)localObject1).b()) {}
    for (;;)
    {
      k = 1;
      break;
      if (f == null)
      {
        k = i;
        break;
      }
      ((i)localObject1).d(0, 0, false, false);
    }
    if (k != 0)
    {
      localObject1 = e;
      if (localObject1 != null) {
        ((j.a)localObject1).c(paramm);
      }
      return true;
    }
    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }
  
  public final boolean k()
  {
    e locale = A;
    boolean bool;
    if ((locale != null) && (locale.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean l()
  {
    if ((t) && (!k()))
    {
      Object localObject = c;
      if ((localObject != null) && (p != null) && (C == null))
      {
        ((androidx.appcompat.view.menu.f)localObject).i();
        if (!j.isEmpty())
        {
          localObject = new c(new e(b, c, q));
          C = ((c)localObject);
          ((View)p).post((Runnable)localObject);
          return true;
        }
      }
    }
    return false;
  }
  
  public final class a
    extends i
  {
    public a(Context paramContext, m paramm, View paramView)
    {
      super(paramm, paramView, false);
      if ((B.x & 0x20) == 32) {
        i = 1;
      }
      if (i == 0)
      {
        paramm = q;
        paramContext = paramm;
        if (paramm == null) {
          paramContext = (View)p;
        }
        f = paramContext;
      }
      paramContext = E;
      this.i = paramContext;
      this$1 = j;
      if (a.this != null) {
        d(paramContext);
      }
    }
    
    public final void c()
    {
      B = null;
      super.c();
    }
  }
  
  public final class b
    extends ActionMenuItemView.b
  {
    public b() {}
  }
  
  public final class c
    implements Runnable
  {
    public a.e a;
    
    public c(a.e parame)
    {
      a = parame;
    }
    
    public final void run()
    {
      Object localObject = c;
      if (localObject != null)
      {
        f.a locala = e;
        if (locala != null) {
          locala.b((androidx.appcompat.view.menu.f)localObject);
        }
      }
      localObject = (View)p;
      if ((localObject != null) && (((View)localObject).getWindowToken() != null))
      {
        localObject = a;
        boolean bool = ((i)localObject).b();
        int i = 1;
        if (!bool) {
          if (f == null) {
            i = 0;
          } else {
            ((i)localObject).d(0, 0, false, false);
          }
        }
        if (i != 0) {
          A = a;
        }
      }
      C = null;
    }
  }
  
  public final class d
    extends p
    implements ActionMenuView.a
  {
    public d(Context paramContext)
    {
      super(null, 2130968607);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      b1.a(this, getContentDescription());
      setOnTouchListener(new a(this));
    }
    
    public final boolean a()
    {
      return false;
    }
    
    public final boolean b()
    {
      return false;
    }
    
    public final boolean performClick()
    {
      if (super.performClick()) {
        return true;
      }
      playSoundEffect(0);
      l();
      return true;
    }
    
    public final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        paramInt3 = getHeight();
        paramInt1 = Math.max(i, paramInt3) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        paramInt2 = getPaddingTop();
        paramInt4 = getPaddingBottom();
        k = (i + (j - k)) / 2;
        paramInt2 = (paramInt3 + (paramInt2 - paramInt4)) / 2;
        y.a.a.f(localDrawable2, k - paramInt1, paramInt2 - paramInt1, k + paramInt1, paramInt2 + paramInt1);
      }
      return bool;
    }
    
    public final class a
      extends l0
    {
      public a(View paramView)
      {
        super();
      }
      
      public final k.f b()
      {
        a.e locale = A;
        if (locale == null) {
          return null;
        }
        return locale.a();
      }
      
      public final boolean c()
      {
        l();
        return true;
      }
      
      public final boolean d()
      {
        a locala = a.this;
        if (C != null) {
          return false;
        }
        locala.h();
        return true;
      }
    }
  }
  
  public final class e
    extends i
  {
    public e(Context paramContext, androidx.appcompat.view.menu.f paramf, a.d paramd)
    {
      super(paramf, paramd, true);
      g = 8388613;
      this$1 = E;
      i = a.this;
      paramContext = j;
      if (paramContext != null) {
        paramContext.d(a.this);
      }
    }
    
    public final void c()
    {
      androidx.appcompat.view.menu.f localf = c;
      if (localf != null) {
        localf.c(true);
      }
      A = null;
      super.c();
    }
  }
  
  public final class f
    implements j.a
  {
    public f() {}
    
    public final void b(androidx.appcompat.view.menu.f paramf, boolean paramBoolean)
    {
      if ((paramf instanceof m)) {
        paramf.k().c(false);
      }
      j.a locala = e;
      if (locala != null) {
        locala.b(paramf, paramBoolean);
      }
    }
    
    public final boolean c(androidx.appcompat.view.menu.f paramf)
    {
      Object localObject = a.this;
      androidx.appcompat.view.menu.f localf = c;
      boolean bool = false;
      if (paramf == localf) {
        return false;
      }
      B.getClass();
      localObject.getClass();
      localObject = e;
      if (localObject != null) {
        bool = ((j.a)localObject).c(paramf);
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