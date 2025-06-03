package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.view.menu.f.b;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.j.a;
import androidx.appcompat.view.menu.k;
import e0.m;
import e0.o;
import g.u;
import g.u.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.f1;
import l.p;

public class ActionMenuView
  extends b
  implements f.b, k
{
  public boolean A;
  public a B;
  public j.a C;
  public f.a D;
  public boolean E;
  public int F;
  public int G;
  public int H;
  public e I;
  public androidx.appcompat.view.menu.f x;
  public Context y;
  public int z;
  
  public ActionMenuView() {}
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = getResourcesgetDisplayMetricsdensity;
    G = ((int)(56.0F * f));
    H = ((int)(f * 4.0F));
    y = paramContext;
    z = 0;
  }
  
  public static c i(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      if ((paramLayoutParams instanceof c)) {
        paramLayoutParams = new c((c)paramLayoutParams);
      } else {
        paramLayoutParams = new c(paramLayoutParams);
      }
      if (gravity <= 0) {
        gravity = 16;
      }
      return paramLayoutParams;
    }
    paramLayoutParams = new c();
    gravity = 16;
    return paramLayoutParams;
  }
  
  public final boolean a(h paramh)
  {
    return x.q(paramh, null, 0);
  }
  
  public final void b(androidx.appcompat.view.menu.f paramf)
  {
    x = paramf;
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof c;
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public final b.a e()
  {
    c localc = new c();
    gravity = 16;
    return localc;
  }
  
  public final b.a f(AttributeSet paramAttributeSet)
  {
    return new c(getContext(), paramAttributeSet);
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    c localc = new c();
    gravity = 16;
    return localc;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new c(getContext(), paramAttributeSet);
  }
  
  public Menu getMenu()
  {
    if (x == null)
    {
      Object localObject1 = getContext();
      Object localObject2 = new androidx.appcompat.view.menu.f((Context)localObject1);
      x = ((androidx.appcompat.view.menu.f)localObject2);
      e = new d();
      localObject2 = new a((Context)localObject1);
      B = ((a)localObject2);
      t = true;
      u = true;
      localObject1 = C;
      if (localObject1 == null) {
        localObject1 = new b();
      }
      e = ((j.a)localObject1);
      x.b((j)localObject2, y);
      localObject1 = B;
      p = this;
      x = c;
    }
    return x;
  }
  
  public Drawable getOverflowIcon()
  {
    getMenu();
    Object localObject = B;
    a.d locald = q;
    if (locald != null) {
      localObject = locald.getDrawable();
    } else if (s) {
      localObject = r;
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public int getPopupTheme()
  {
    return z;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public final boolean j(int paramInt)
  {
    boolean bool1 = false;
    if (paramInt == 0) {
      return false;
    }
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    boolean bool2 = bool1;
    if (paramInt < getChildCount())
    {
      bool2 = bool1;
      if ((localView1 instanceof a)) {
        bool2 = false | ((a)localView1).a();
      }
    }
    bool1 = bool2;
    if (paramInt > 0)
    {
      bool1 = bool2;
      if ((localView2 instanceof a)) {
        bool1 = bool2 | ((a)localView2).b();
      }
    }
    return bool1;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = B;
    if (paramConfiguration != null)
    {
      paramConfiguration.g();
      if (B.k())
      {
        B.h();
        B.l();
      }
    }
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = B;
    if (localObject != null)
    {
      ((a)localObject).h();
      localObject = B;
      if ((localObject != null) && (((i)localObject).b())) {
        j.dismiss();
      }
    }
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!E)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int k = getDividerWidth();
    int m = paramInt3 - paramInt1;
    paramInt1 = m - getPaddingRight() - getPaddingLeft();
    paramBoolean = f1.a(this);
    paramInt2 = 0;
    paramInt4 = 0;
    paramInt3 = 0;
    Object localObject1;
    Object localObject2;
    int n;
    int i2;
    while (paramInt2 < i)
    {
      localObject1 = getChildAt(paramInt2);
      if (((View)localObject1).getVisibility() != 8)
      {
        localObject2 = (c)((View)localObject1).getLayoutParams();
        if (a)
        {
          n = ((View)localObject1).getMeasuredWidth();
          paramInt4 = n;
          if (j(paramInt2)) {
            paramInt4 = n + k;
          }
          int i1 = ((View)localObject1).getMeasuredHeight();
          if (paramBoolean)
          {
            i2 = getPaddingLeft() + leftMargin;
            n = i2 + paramInt4;
          }
          else
          {
            n = getWidth() - getPaddingRight() - rightMargin;
            i2 = n - paramInt4;
          }
          int i3 = j - i1 / 2;
          ((View)localObject1).layout(i2, i3, n, i1 + i3);
          paramInt1 -= paramInt4;
          paramInt4 = 1;
        }
        else
        {
          paramInt1 -= ((View)localObject1).getMeasuredWidth() + leftMargin + rightMargin;
          j(paramInt2);
          paramInt3++;
        }
      }
      paramInt2++;
    }
    if ((i == 1) && (paramInt4 == 0))
    {
      localObject2 = getChildAt(0);
      paramInt1 = ((View)localObject2).getMeasuredWidth();
      paramInt2 = ((View)localObject2).getMeasuredHeight();
      paramInt3 = m / 2 - paramInt1 / 2;
      paramInt4 = j - paramInt2 / 2;
      ((View)localObject2).layout(paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
      return;
    }
    paramInt2 = paramInt3 - (paramInt4 ^ 0x1);
    if (paramInt2 > 0) {
      paramInt1 /= paramInt2;
    } else {
      paramInt1 = 0;
    }
    paramInt4 = Math.max(0, paramInt1);
    if (paramBoolean)
    {
      paramInt3 = getWidth() - getPaddingRight();
      paramInt1 = 0;
      while (paramInt1 < i)
      {
        localObject2 = getChildAt(paramInt1);
        localObject1 = (c)((View)localObject2).getLayoutParams();
        paramInt2 = paramInt3;
        if (((View)localObject2).getVisibility() != 8) {
          if (a)
          {
            paramInt2 = paramInt3;
          }
          else
          {
            i2 = paramInt3 - rightMargin;
            paramInt2 = ((View)localObject2).getMeasuredWidth();
            n = ((View)localObject2).getMeasuredHeight();
            paramInt3 = j - n / 2;
            ((View)localObject2).layout(i2 - paramInt2, paramInt3, i2, n + paramInt3);
            paramInt2 = i2 - (paramInt2 + leftMargin + paramInt4);
          }
        }
        paramInt1++;
        paramInt3 = paramInt2;
      }
    }
    paramInt3 = getPaddingLeft();
    paramInt1 = 0;
    while (paramInt1 < i)
    {
      localObject2 = getChildAt(paramInt1);
      localObject1 = (c)((View)localObject2).getLayoutParams();
      paramInt2 = paramInt3;
      if (((View)localObject2).getVisibility() != 8) {
        if (a)
        {
          paramInt2 = paramInt3;
        }
        else
        {
          paramInt3 += leftMargin;
          n = ((View)localObject2).getMeasuredWidth();
          i2 = ((View)localObject2).getMeasuredHeight();
          paramInt2 = j - i2 / 2;
          ((View)localObject2).layout(paramInt3, paramInt2, paramInt3 + n, i2 + paramInt2);
          paramInt2 = n + rightMargin + paramInt4 + paramInt3;
        }
      }
      paramInt1++;
      paramInt3 = paramInt2;
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = E;
    boolean bool2;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    E = bool2;
    if (bool1 != bool2) {
      F = 0;
    }
    int i = View.MeasureSpec.getSize(paramInt1);
    Object localObject1;
    if (E)
    {
      localObject1 = x;
      if ((localObject1 != null) && (i != F))
      {
        F = i;
        ((androidx.appcompat.view.menu.f)localObject1).p(true);
      }
    }
    int j = getChildCount();
    if ((E) && (j > 0))
    {
      int k = View.MeasureSpec.getMode(paramInt2);
      i = View.MeasureSpec.getSize(paramInt1);
      int m = View.MeasureSpec.getSize(paramInt2);
      j = getPaddingLeft();
      paramInt1 = getPaddingRight();
      int n = getPaddingTop();
      int i1 = getPaddingBottom() + n;
      int i2 = ViewGroup.getChildMeasureSpec(paramInt2, i1, -2);
      int i3 = i - (paramInt1 + j);
      paramInt1 = G;
      int i4 = i3 / paramInt1;
      if (i4 == 0)
      {
        setMeasuredDimension(i3, 0);
      }
      else
      {
        int i5 = i3 % paramInt1 / i4 + paramInt1;
        int i6 = getChildCount();
        int i7 = 0;
        paramInt1 = i7;
        paramInt2 = paramInt1;
        i = paramInt2;
        j = i;
        n = j;
        long l1 = 0L;
        int i8 = i;
        int i9 = paramInt2;
        int i10 = paramInt1;
        paramInt1 = i4;
        paramInt2 = m;
        i = i7;
        Object localObject2;
        int i11;
        int i12;
        long l2;
        while (i8 < i6)
        {
          localObject2 = getChildAt(i8);
          if (((View)localObject2).getVisibility() != 8)
          {
            bool1 = localObject2 instanceof ActionMenuItemView;
            i4 = i10 + 1;
            if (bool1)
            {
              i7 = H;
              ((View)localObject2).setPadding(i7, 0, i7, 0);
            }
            c localc1 = (c)((View)localObject2).getLayoutParams();
            f = false;
            c = 0;
            b = 0;
            d = false;
            leftMargin = 0;
            rightMargin = 0;
            if ((bool1) && (((ActionMenuItemView)localObject2).l())) {
              bool2 = true;
            } else {
              bool2 = false;
            }
            e = bool2;
            if (a) {
              i7 = 1;
            } else {
              i7 = paramInt1;
            }
            c localc2 = (c)((View)localObject2).getLayoutParams();
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - i1, View.MeasureSpec.getMode(i2));
            if (bool1) {
              localObject1 = (ActionMenuItemView)localObject2;
            } else {
              localObject1 = null;
            }
            if ((localObject1 != null) && (((ActionMenuItemView)localObject1).l())) {
              i10 = 1;
            } else {
              i10 = 0;
            }
            if ((i7 > 0) && ((i10 == 0) || (i7 >= 2)))
            {
              ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(i7 * i5, Integer.MIN_VALUE), i11);
              i12 = ((View)localObject2).getMeasuredWidth();
              i7 = i12 / i5;
              m = i7;
              if (i12 % i5 != 0) {
                m = i7 + 1;
              }
              i7 = m;
              if (i10 != 0)
              {
                i7 = m;
                if (m < 2) {
                  i7 = 2;
                }
              }
            }
            else
            {
              i7 = 0;
            }
            if ((!a) && (i10 != 0)) {
              bool2 = true;
            } else {
              bool2 = false;
            }
            d = bool2;
            b = i7;
            ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(i5 * i7, 1073741824), i11);
            i9 = Math.max(i9, i7);
            m = n;
            if (d) {
              m = n + 1;
            }
            if (a) {
              j = 1;
            }
            paramInt1 -= i7;
            i = Math.max(i, ((View)localObject2).getMeasuredHeight());
            l2 = l1;
            if (i7 == 1) {
              l2 = l1 | 1 << i8;
            }
            i10 = i4;
            n = m;
            l1 = l2;
          }
          i8++;
        }
        if ((j != 0) && (i10 == 2)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        m = 0;
        i4 = paramInt1;
        i7 = i6;
        i8 = i2;
        for (paramInt1 = m;; paramInt1 = 1)
        {
          l2 = l1;
          long l3;
          if (n > 0)
          {
            l2 = l1;
            if (i4 > 0)
            {
              i2 = Integer.MAX_VALUE;
              i11 = 0;
              i6 = 0;
              for (l3 = 0L; i6 < i7; l3 = l2)
              {
                localObject1 = (c)getChildAt(i6).getLayoutParams();
                if (!d)
                {
                  i12 = i2;
                  m = i11;
                  l2 = l3;
                }
                else
                {
                  int i13 = b;
                  if (i13 < i2)
                  {
                    l2 = 1L << i6;
                    i12 = i13;
                    m = 1;
                  }
                  else
                  {
                    i12 = i2;
                    m = i11;
                    l2 = l3;
                    if (i13 == i2)
                    {
                      m = i11 + 1;
                      l2 = l3 | 1L << i6;
                      i12 = i2;
                    }
                  }
                }
                i6++;
                i2 = i12;
                i11 = m;
              }
              l1 |= l3;
              if (i11 <= i4) {
                break label938;
              }
              l2 = l1;
            }
          }
          break;
          label938:
          paramInt1 = 0;
          while (paramInt1 < i7)
          {
            localObject1 = getChildAt(paramInt1);
            localObject2 = (c)((View)localObject1).getLayoutParams();
            long l4 = 1 << paramInt1;
            if ((l3 & l4) == 0L)
            {
              m = i4;
              l2 = l1;
              if (b == i2 + 1)
              {
                l2 = l1 | l4;
                m = i4;
              }
            }
            else
            {
              if ((i1 != 0) && (e) && (i4 == 1))
              {
                m = H;
                ((View)localObject1).setPadding(m + i5, 0, m, 0);
              }
              b += 1;
              f = true;
              m = i4 - 1;
              l2 = l1;
            }
            paramInt1++;
            i4 = m;
            l1 = l2;
          }
        }
        if ((j == 0) && (i10 == 1)) {
          j = 1;
        } else {
          j = 0;
        }
        if ((i4 > 0) && (l2 != 0L) && ((i4 < i10 - 1) || (j != 0) || (i9 > 1)))
        {
          float f1 = Long.bitCount(l2);
          float f2 = f1;
          if (j == 0)
          {
            float f3 = f1;
            if ((l2 & 1L) != 0L)
            {
              f3 = f1;
              if (!getChildAt0getLayoutParamse) {
                f3 = f1 - 0.5F;
              }
            }
            j = i7 - 1;
            f2 = f3;
            if ((l2 & 1 << j) != 0L)
            {
              f2 = f3;
              if (!getChildAtgetLayoutParamse) {
                f2 = f3 - 0.5F;
              }
            }
          }
          if (f2 > 0.0F) {
            n = (int)(i4 * i5 / f2);
          } else {
            n = 0;
          }
          i9 = i7;
          m = 0;
          while (m < i9)
          {
            if ((l2 & 1 << m) != 0L)
            {
              localObject2 = getChildAt(m);
              localObject1 = (c)((View)localObject2).getLayoutParams();
              if ((localObject2 instanceof ActionMenuItemView))
              {
                c = n;
                f = true;
                if ((m == 0) && (!e)) {
                  leftMargin = (-n / 2);
                }
                paramInt1 = 1;
              }
            }
            else
            {
              j = paramInt1;
              break label1466;
            }
            if (a)
            {
              c = n;
              f = true;
              rightMargin = (-n / 2);
              j = 1;
            }
            else
            {
              if (m != 0) {
                leftMargin = (n / 2);
              }
              j = paramInt1;
              if (m != i9 - 1)
              {
                rightMargin = (n / 2);
                j = paramInt1;
              }
            }
            label1466:
            m++;
            paramInt1 = j;
          }
        }
        if (paramInt1 != 0) {
          for (paramInt1 = 0; paramInt1 < i7; paramInt1++)
          {
            localObject2 = getChildAt(paramInt1);
            localObject1 = (c)((View)localObject2).getLayoutParams();
            if (f) {
              ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(b * i5 + c, 1073741824), i8);
            }
          }
        }
        if (k != 1073741824) {
          paramInt2 = i;
        }
        setMeasuredDimension(i3, paramInt2);
      }
    }
    else
    {
      for (i = 0; i < j; i++)
      {
        localObject1 = (c)getChildAt(i).getLayoutParams();
        rightMargin = 0;
        leftMargin = 0;
      }
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    B.y = paramBoolean;
  }
  
  public void setOnMenuItemClickListener(e parame)
  {
    I = parame;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    a locala = B;
    a.d locald = q;
    if (locald != null)
    {
      locald.setImageDrawable(paramDrawable);
    }
    else
    {
      s = true;
      r = paramDrawable;
    }
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    A = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (z != paramInt)
    {
      z = paramInt;
      if (paramInt == 0) {
        y = getContext();
      } else {
        y = new ContextThemeWrapper(getContext(), paramInt);
      }
    }
  }
  
  public void setPresenter(a parama)
  {
    B = parama;
    p = this;
    x = c;
  }
  
  public static abstract interface a
  {
    public abstract boolean a();
    
    public abstract boolean b();
  }
  
  public static final class b
    implements j.a
  {
    public final void b(androidx.appcompat.view.menu.f paramf, boolean paramBoolean) {}
    
    public final boolean c(androidx.appcompat.view.menu.f paramf)
    {
      return false;
    }
  }
  
  public static final class c
    extends b.a
  {
    @ViewDebug.ExportedProperty
    public boolean a;
    @ViewDebug.ExportedProperty
    public int b;
    @ViewDebug.ExportedProperty
    public int c;
    @ViewDebug.ExportedProperty
    public boolean d;
    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;
    
    public c()
    {
      super(-2);
      a = false;
    }
    
    public c(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public c(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public c(c paramc)
    {
      super();
      a = a;
    }
  }
  
  public final class d
    implements f.a
  {
    public d() {}
    
    public final boolean a(androidx.appcompat.view.menu.f paramf, MenuItem paramMenuItem)
    {
      paramf = I;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (paramf != null)
      {
        paramf = (Toolbar.a)paramf;
        Iterator localIterator = a.O.b.iterator();
        while (localIterator.hasNext()) {
          if (((o)localIterator.next()).a(paramMenuItem))
          {
            i = 1;
            break label75;
          }
        }
        int i = 0;
        label75:
        boolean bool3;
        if (i != 0)
        {
          bool3 = true;
        }
        else
        {
          paramf = a.Q;
          if (paramf != null) {
            bool3 = a.b.onMenuItemSelected(0, paramMenuItem);
          } else {
            bool3 = false;
          }
        }
        bool2 = bool1;
        if (bool3) {
          bool2 = true;
        }
      }
      return bool2;
    }
    
    public final void b(androidx.appcompat.view.menu.f paramf)
    {
      f.a locala = D;
      if (locala != null) {
        locala.b(paramf);
      }
    }
  }
  
  public static abstract interface e {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */