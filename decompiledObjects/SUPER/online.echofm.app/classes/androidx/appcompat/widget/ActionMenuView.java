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
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d.a;
import androidx.appcompat.view.menu.d.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g.a;
import androidx.appcompat.view.menu.h;
import l.d0;

public class ActionMenuView
  extends b
  implements d.b, h
{
  public d D;
  public Context E;
  public int F;
  public boolean G;
  public a H;
  public g.a I;
  public d.a J;
  public boolean K;
  public int L;
  public int M;
  public int N;
  public e O;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = getResourcesgetDisplayMetricsdensity;
    M = ((int)(56.0F * f));
    N = ((int)(f * 4.0F));
    E = paramContext;
    F = 0;
  }
  
  public static int G(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c localc = (c)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    if ((paramView instanceof ActionMenuItemView)) {
      localActionMenuItemView = (ActionMenuItemView)paramView;
    } else {
      localActionMenuItemView = null;
    }
    boolean bool1 = false;
    if ((localActionMenuItemView != null) && (localActionMenuItemView.f())) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    }
    if (paramInt2 > 0)
    {
      paramInt4 = 2;
      if ((paramInt3 == 0) || (paramInt2 >= 2))
      {
        paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt2 * paramInt1, Integer.MIN_VALUE), i);
        int j = paramView.getMeasuredWidth();
        int k = j / paramInt1;
        paramInt2 = k;
        if (j % paramInt1 != 0) {
          paramInt2 = k + 1;
        }
        if ((paramInt3 != 0) && (paramInt2 < 2))
        {
          paramInt2 = paramInt4;
          break label144;
        }
        break label144;
      }
    }
    paramInt2 = 0;
    label144:
    boolean bool2 = bool1;
    if (!c)
    {
      bool2 = bool1;
      if (paramInt3 != 0) {
        bool2 = true;
      }
    }
    f = bool2;
    d = paramInt2;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, 1073741824), i);
    return paramInt2;
  }
  
  public c A(AttributeSet paramAttributeSet)
  {
    return new c(getContext(), paramAttributeSet);
  }
  
  public c B(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      if ((paramLayoutParams instanceof c)) {
        paramLayoutParams = new c((c)paramLayoutParams);
      } else {
        paramLayoutParams = new c(paramLayoutParams);
      }
      if (b <= 0) {
        b = 16;
      }
      return paramLayoutParams;
    }
    return z();
  }
  
  public c C()
  {
    c localc = z();
    c = true;
    return localc;
  }
  
  public boolean D(int paramInt)
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
        bool2 = ((a)localView1).b();
      }
    }
    bool1 = bool2;
    if (paramInt > 0)
    {
      bool1 = bool2;
      if ((localView2 instanceof a)) {
        bool1 = bool2 | ((a)localView2).c();
      }
    }
    return bool1;
  }
  
  public void E(d paramd)
  {
    D = paramd;
  }
  
  public boolean F()
  {
    a locala = H;
    boolean bool;
    if ((locala != null) && (locala.B())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void H(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = getPaddingLeft();
    int m = getPaddingRight();
    int n = getPaddingTop() + getPaddingBottom();
    int i1 = ViewGroup.getChildMeasureSpec(paramInt2, n, -2);
    int i2 = paramInt1 - (k + m);
    paramInt1 = M;
    int i3 = i2 / paramInt1;
    if (i3 == 0)
    {
      setMeasuredDimension(i2, 0);
      return;
    }
    int i4 = paramInt1 + i2 % paramInt1 / i3;
    int i5 = getChildCount();
    k = 0;
    paramInt1 = k;
    int i6 = paramInt1;
    paramInt2 = i6;
    m = paramInt2;
    int i7 = m;
    long l1 = 0L;
    int i8 = m;
    int i9 = paramInt2;
    int i10 = paramInt1;
    paramInt2 = k;
    paramInt1 = i3;
    k = j;
    Object localObject1;
    Object localObject2;
    while (i10 < i5)
    {
      localObject1 = getChildAt(i10);
      if (((View)localObject1).getVisibility() == 8)
      {
        m = i7;
      }
      else
      {
        boolean bool = localObject1 instanceof ActionMenuItemView;
        i9++;
        if (bool)
        {
          m = N;
          ((View)localObject1).setPadding(m, 0, m, 0);
        }
        localObject2 = (c)((View)localObject1).getLayoutParams();
        h = false;
        e = 0;
        d = 0;
        f = false;
        leftMargin = 0;
        rightMargin = 0;
        if ((bool) && (((ActionMenuItemView)localObject1).f())) {
          bool = true;
        } else {
          bool = false;
        }
        g = bool;
        if (c) {
          m = 1;
        } else {
          m = paramInt1;
        }
        j = G((View)localObject1, i4, m, i1, n);
        i8 = Math.max(i8, j);
        m = i7;
        if (f) {
          m = i7 + 1;
        }
        if (c) {
          i6 = 1;
        }
        paramInt1 -= j;
        paramInt2 = Math.max(paramInt2, ((View)localObject1).getMeasuredHeight());
        if (j == 1) {
          l1 |= 1 << i10;
        }
        for (;;)
        {
          break;
        }
      }
      i10++;
      i7 = m;
    }
    if ((i6 != 0) && (i9 == 2)) {
      i10 = 1;
    } else {
      i10 = 0;
    }
    m = 0;
    j = paramInt1;
    i3 = i10;
    i10 = i2;
    while ((i7 > 0) && (j > 0))
    {
      i2 = Integer.MAX_VALUE;
      int i11 = 0;
      n = 0;
      long l3;
      for (long l2 = 0L; n < i5; l2 = l3)
      {
        localObject1 = (c)getChildAt(n).getLayoutParams();
        int i12;
        if (!f)
        {
          paramInt1 = i11;
          i12 = i2;
          l3 = l2;
        }
        else
        {
          int i13 = d;
          if (i13 < i2)
          {
            l3 = 1L << n;
            i12 = i13;
            paramInt1 = 1;
          }
          else
          {
            paramInt1 = i11;
            i12 = i2;
            l3 = l2;
            if (i13 == i2)
            {
              paramInt1 = i11 + 1;
              l3 = l2 | 1L << n;
              i12 = i2;
            }
          }
        }
        n++;
        i11 = paramInt1;
        i2 = i12;
      }
      paramInt1 = m;
      l1 |= l2;
      if (i11 > j) {
        break label754;
      }
      for (paramInt1 = 0; paramInt1 < i5; paramInt1++)
      {
        localObject2 = getChildAt(paramInt1);
        localObject1 = (c)((View)localObject2).getLayoutParams();
        long l4 = 1 << paramInt1;
        if ((l2 & l4) == 0L)
        {
          l3 = l1;
          if (d == i2 + 1) {
            l3 = l1 | l4;
          }
          l1 = l3;
        }
        else
        {
          if ((i3 != 0) && (g) && (j == 1))
          {
            m = N;
            ((View)localObject2).setPadding(m + i4, 0, m, 0);
          }
          d += 1;
          h = true;
          j--;
        }
      }
      m = 1;
    }
    paramInt1 = m;
    label754:
    if ((i6 == 0) && (i9 == 1)) {
      m = 1;
    } else {
      m = 0;
    }
    if ((j <= 0) || (l1 == 0L) || ((j >= i9 - 1) && (m == 0) && (i8 <= 1))) {
      break label1133;
    }
    float f1 = Long.bitCount(l1);
    if (m == 0)
    {
      float f2 = f1;
      if ((l1 & 1L) != 0L)
      {
        f2 = f1;
        if (!getChildAt0getLayoutParamsg) {
          f2 = f1 - 0.5F;
        }
      }
      m = i5 - 1;
      f1 = f2;
      if ((l1 & 1 << m) != 0L)
      {
        f1 = f2;
        if (!getChildAtgetLayoutParamsg) {
          f1 = f2 - 0.5F;
        }
      }
    }
    if (f1 > 0.0F) {
      i6 = (int)(j * i4 / f1);
    } else {
      i6 = 0;
    }
    i7 = 0;
    for (;;)
    {
      m = paramInt1;
      if (i7 >= i5) {
        break;
      }
      if ((l1 & 1 << i7) == 0L)
      {
        m = paramInt1;
      }
      else
      {
        localObject2 = getChildAt(i7);
        localObject1 = (c)((View)localObject2).getLayoutParams();
        if ((localObject2 instanceof ActionMenuItemView))
        {
          e = i6;
          h = true;
          if ((i7 == 0) && (!g)) {
            leftMargin = (-i6 / 2);
          }
          m = 1;
        }
        else if (c)
        {
          e = i6;
          h = true;
          rightMargin = (-i6 / 2);
          m = 1;
        }
        else
        {
          if (i7 != 0) {
            leftMargin = (i6 / 2);
          }
          m = paramInt1;
          if (i7 != i5 - 1)
          {
            rightMargin = (i6 / 2);
            m = paramInt1;
          }
        }
      }
      i7++;
      paramInt1 = m;
    }
    label1133:
    m = paramInt1;
    if (m != 0) {
      for (paramInt1 = 0; paramInt1 < i5; paramInt1++)
      {
        localObject2 = getChildAt(paramInt1);
        localObject1 = (c)((View)localObject2).getLayoutParams();
        if (h) {
          ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(d * i4 + e, 1073741824), i1);
        }
      }
    }
    if (i != 1073741824) {}
    for (paramInt1 = paramInt2;; paramInt1 = k) {
      break;
    }
    setMeasuredDimension(i10, paramInt1);
  }
  
  public d I()
  {
    return D;
  }
  
  public void J(g.a parama, d.a parama1)
  {
    I = parama;
    J = parama1;
  }
  
  public boolean K()
  {
    a locala = H;
    boolean bool;
    if ((locala != null) && (locala.H())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean a(e parame)
  {
    return D.H(parame, 0);
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof c;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public Menu getMenu()
  {
    if (D == null)
    {
      Object localObject1 = getContext();
      Object localObject2 = new d((Context)localObject1);
      D = ((d)localObject2);
      ((d)localObject2).L(new d());
      localObject1 = new a((Context)localObject1);
      H = ((a)localObject1);
      ((a)localObject1).G(true);
      localObject2 = H;
      localObject1 = I;
      if (localObject1 == null) {
        localObject1 = new b();
      }
      ((androidx.appcompat.view.menu.a)localObject2).k((g.a)localObject1);
      D.b(H, E);
      H.E(this);
    }
    return D;
  }
  
  public Drawable getOverflowIcon()
  {
    getMenu();
    return H.y();
  }
  
  public int getPopupTheme()
  {
    return F;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = H;
    if (paramConfiguration != null)
    {
      paramConfiguration.f(false);
      if (H.B())
      {
        H.z();
        H.H();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    y();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!K)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int k = getDividerWidth();
    int m = paramInt3 - paramInt1;
    paramInt1 = m - getPaddingRight() - getPaddingLeft();
    paramBoolean = d0.a(this);
    paramInt2 = 0;
    paramInt4 = 0;
    paramInt3 = 0;
    View localView;
    Object localObject;
    int n;
    int i2;
    while (paramInt2 < i)
    {
      localView = getChildAt(paramInt2);
      if (localView.getVisibility() != 8)
      {
        localObject = (c)localView.getLayoutParams();
        if (c)
        {
          n = localView.getMeasuredWidth();
          paramInt4 = n;
          if (D(paramInt2)) {
            paramInt4 = n + k;
          }
          int i1 = localView.getMeasuredHeight();
          if (paramBoolean)
          {
            n = getPaddingLeft() + leftMargin;
            i2 = n + paramInt4;
          }
          else
          {
            i2 = getWidth() - getPaddingRight() - rightMargin;
            n = i2 - paramInt4;
          }
          int i3 = j - i1 / 2;
          localView.layout(n, i3, i2, i1 + i3);
          paramInt1 -= paramInt4;
          paramInt4 = 1;
        }
        else
        {
          paramInt1 -= localView.getMeasuredWidth() + leftMargin + rightMargin;
          D(paramInt2);
          paramInt3++;
        }
      }
      paramInt2++;
    }
    if ((i == 1) && (paramInt4 == 0))
    {
      localObject = getChildAt(0);
      paramInt1 = ((View)localObject).getMeasuredWidth();
      paramInt2 = ((View)localObject).getMeasuredHeight();
      paramInt3 = m / 2 - paramInt1 / 2;
      paramInt4 = j - paramInt2 / 2;
      ((View)localObject).layout(paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
      return;
    }
    paramInt2 = paramInt3 - (paramInt4 ^ 0x1);
    if (paramInt2 > 0) {
      paramInt1 /= paramInt2;
    }
    for (;;)
    {
      break;
      paramInt1 = 0;
    }
    paramInt4 = Math.max(0, paramInt1);
    if (paramBoolean)
    {
      paramInt3 = getWidth() - getPaddingRight();
      paramInt1 = 0;
      while (paramInt1 < i)
      {
        localView = getChildAt(paramInt1);
        localObject = (c)localView.getLayoutParams();
        paramInt2 = paramInt3;
        if (localView.getVisibility() != 8) {
          if (c)
          {
            paramInt2 = paramInt3;
          }
          else
          {
            paramInt3 -= rightMargin;
            paramInt2 = localView.getMeasuredWidth();
            i2 = localView.getMeasuredHeight();
            n = j - i2 / 2;
            localView.layout(paramInt3 - paramInt2, n, paramInt3, i2 + n);
            paramInt2 = paramInt3 - (paramInt2 + leftMargin + paramInt4);
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
      localView = getChildAt(paramInt1);
      localObject = (c)localView.getLayoutParams();
      paramInt2 = paramInt3;
      if (localView.getVisibility() != 8) {
        if (c)
        {
          paramInt2 = paramInt3;
        }
        else
        {
          n = paramInt3 + leftMargin;
          paramInt2 = localView.getMeasuredWidth();
          i2 = localView.getMeasuredHeight();
          paramInt3 = j - i2 / 2;
          localView.layout(n, paramInt3, n + paramInt2, i2 + paramInt3);
          paramInt2 = n + (paramInt2 + rightMargin + paramInt4);
        }
      }
      paramInt1++;
      paramInt3 = paramInt2;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = K;
    boolean bool2;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    K = bool2;
    if (bool1 != bool2) {
      L = 0;
    }
    int i = View.MeasureSpec.getSize(paramInt1);
    Object localObject;
    if (K)
    {
      localObject = D;
      if ((localObject != null) && (i != L))
      {
        L = i;
        ((d)localObject).G(true);
      }
    }
    int j = getChildCount();
    if ((K) && (j > 0))
    {
      H(paramInt1, paramInt2);
    }
    else
    {
      for (i = 0; i < j; i++)
      {
        localObject = (c)getChildAt(i).getLayoutParams();
        rightMargin = 0;
        leftMargin = 0;
      }
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    H.D(paramBoolean);
  }
  
  public void setOnMenuItemClickListener(e parame)
  {
    O = parame;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    H.F(paramDrawable);
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    G = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (F != paramInt)
    {
      F = paramInt;
      if (paramInt == 0) {
        E = getContext();
      } else {
        E = new ContextThemeWrapper(getContext(), paramInt);
      }
    }
  }
  
  public void setPresenter(a parama)
  {
    H = parama;
    parama.E(this);
  }
  
  public void y()
  {
    a locala = H;
    if (locala != null) {
      locala.w();
    }
  }
  
  public c z()
  {
    c localc = new c(-2, -2);
    b = 16;
    return localc;
  }
  
  public static abstract interface a
  {
    public abstract boolean b();
    
    public abstract boolean c();
  }
  
  public static class b
    implements g.a
  {
    public void b(d paramd, boolean paramBoolean) {}
    
    public boolean c(d paramd)
    {
      return false;
    }
  }
  
  public static class c
    extends b.a
  {
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    
    public c(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      c = false;
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
      c = c;
    }
  }
  
  public class d
    implements d.a
  {
    public d() {}
    
    public boolean a(d paramd, MenuItem paramMenuItem)
    {
      paramd = O;
      boolean bool;
      if ((paramd != null) && (paramd.onMenuItemClick(paramMenuItem))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void b(d paramd)
    {
      d.a locala = J;
      if (locala != null) {
        locala.b(paramd);
      }
    }
  }
  
  public static abstract interface e
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */