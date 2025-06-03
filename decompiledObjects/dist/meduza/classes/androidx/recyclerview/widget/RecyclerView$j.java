package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import b.a0;
import e0.d0;
import java.util.ArrayList;

public abstract class RecyclerView$j
{
  public b a;
  public RecyclerView b;
  public p c;
  public p d;
  public boolean e;
  public int f;
  public int g;
  
  public RecyclerView$j()
  {
    a locala = new a();
    b localb = new b();
    c = new p(locala);
    d = new p(localb);
    e = false;
  }
  
  public static int e(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i != Integer.MIN_VALUE)
    {
      if (i != 1073741824) {
        paramInt1 = Math.max(paramInt2, paramInt3);
      }
      return paramInt1;
    }
    return Math.min(paramInt1, Math.max(paramInt2, paramInt3));
  }
  
  public static void r(View paramView, Rect paramRect)
  {
    Object localObject = RecyclerView.s0;
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    localObject = a;
    paramRect.set(paramView.getLeft() - left - leftMargin, paramView.getTop() - top - topMargin, paramView.getRight() + right + rightMargin, paramView.getBottom() + bottom + bottomMargin);
  }
  
  public static void w(View paramView)
  {
    ((RecyclerView.k)paramView.getLayoutParams()).getClass();
    throw null;
  }
  
  public static c x(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    c localc = new c();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a0.Q, paramInt1, paramInt2);
    a = paramContext.getInt(0, 1);
    b = paramContext.getInt(10, 1);
    c = paramContext.getBoolean(9, false);
    d = paramContext.getBoolean(11, false);
    paramContext.recycle();
    return localc;
  }
  
  public void A() {}
  
  public void B(RecyclerView paramRecyclerView) {}
  
  public void C(AccessibilityEvent paramAccessibilityEvent)
  {
    RecyclerView localRecyclerView = b;
    Object localObject = a;
    localObject = i0;
    if ((localRecyclerView != null) && (paramAccessibilityEvent != null))
    {
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (!localRecyclerView.canScrollVertically(1))
      {
        bool2 = bool1;
        if (!b.canScrollVertically(-1))
        {
          bool2 = bool1;
          if (!b.canScrollHorizontally(-1)) {
            if (b.canScrollHorizontally(1)) {
              bool2 = bool1;
            } else {
              bool2 = false;
            }
          }
        }
      }
      paramAccessibilityEvent.setScrollable(bool2);
      b.getClass();
    }
  }
  
  public Parcelable D()
  {
    return null;
  }
  
  public void E(int paramInt) {}
  
  public final void F(RecyclerView.p paramp)
  {
    int i = p() - 1;
    if (i < 0) {
      return;
    }
    RecyclerView.p(o(i));
    throw null;
  }
  
  public final void G(RecyclerView.p paramp)
  {
    int i = a.size();
    int j = i - 1;
    if (j < 0)
    {
      a.clear();
      paramp = b;
      if (paramp != null) {
        paramp.clear();
      }
      if (i > 0) {
        b.invalidate();
      }
      return;
    }
    ((RecyclerView.v)a.get(j)).getClass();
    RecyclerView.p(null);
    throw null;
  }
  
  public final boolean H(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = t();
    int j = v();
    int k = f;
    int m = u();
    int n = g;
    int i1 = s();
    int i2 = paramView.getLeft() + left - paramView.getScrollX();
    int i3 = paramView.getTop() + top - paramView.getScrollY();
    int i4 = paramRect.width();
    int i5 = paramRect.height();
    int i6 = i2 - i;
    i = Math.min(0, i6);
    int i7 = i3 - j;
    j = Math.min(0, i7);
    i2 = i4 + i2 - (k - m);
    i4 = Math.max(0, i2);
    i3 = Math.max(0, i5 + i3 - (n - i1));
    paramView = b;
    paramRect = d0.a;
    if (paramView.getLayoutDirection() == 1)
    {
      if (i4 != 0) {
        i = i4;
      } else {
        i = Math.max(i, i2);
      }
    }
    else if (i == 0) {
      i = Math.min(i6, i4);
    }
    if (j == 0) {
      j = Math.min(i7, i3);
    }
    if (paramBoolean2)
    {
      paramRect = paramRecyclerView.getFocusedChild();
      if (paramRect != null)
      {
        i3 = t();
        n = v();
        i1 = f;
        i7 = u();
        i4 = g;
        i5 = s();
        paramView = b.o;
        r(paramRect, paramView);
        if ((left - i < i1 - i7) && (right - i > i3) && (top - j < i4 - i5) && (bottom - j > n))
        {
          i4 = 1;
          break label355;
        }
      }
      i4 = 0;
      label355:
      if (i4 == 0) {}
    }
    else
    {
      if ((i != 0) || (j != 0)) {
        break label375;
      }
    }
    return false;
    label375:
    if (paramBoolean1) {
      paramRecyclerView.scrollBy(i, j);
    } else {
      paramRecyclerView.x(i, j, false);
    }
    return true;
  }
  
  public final void I()
  {
    RecyclerView localRecyclerView = b;
    if (localRecyclerView != null) {
      localRecyclerView.requestLayout();
    }
  }
  
  public final void J(RecyclerView paramRecyclerView)
  {
    int i;
    if (paramRecyclerView == null)
    {
      b = null;
      a = null;
      i = 0;
      f = 0;
    }
    else
    {
      b = paramRecyclerView;
      a = d;
      f = paramRecyclerView.getWidth();
      i = paramRecyclerView.getHeight();
    }
    g = i;
  }
  
  public void a(String paramString)
  {
    RecyclerView localRecyclerView = b;
    if (localRecyclerView != null) {
      localRecyclerView.b(paramString);
    }
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d(RecyclerView.k paramk)
  {
    boolean bool;
    if (paramk != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int f(RecyclerView.s params)
  {
    return 0;
  }
  
  public void g(RecyclerView.s params) {}
  
  public int h(RecyclerView.s params)
  {
    return 0;
  }
  
  public int i(RecyclerView.s params)
  {
    return 0;
  }
  
  public void j(RecyclerView.s params) {}
  
  public int k(RecyclerView.s params)
  {
    return 0;
  }
  
  public abstract RecyclerView.k l();
  
  public RecyclerView.k m(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new RecyclerView.k(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.k n(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof RecyclerView.k)) {
      return new RecyclerView.k((RecyclerView.k)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new RecyclerView.k((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new RecyclerView.k(paramLayoutParams);
  }
  
  public final View o(int paramInt)
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = ((b)localObject).a(paramInt);
    } else {
      localObject = null;
    }
    return (View)localObject;
  }
  
  public final int p()
  {
    b localb = a;
    int i;
    if (localb != null) {
      i = localb.b();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int q(RecyclerView.p paramp, RecyclerView.s params)
  {
    return -1;
  }
  
  public final int s()
  {
    RecyclerView localRecyclerView = b;
    int i;
    if (localRecyclerView != null) {
      i = localRecyclerView.getPaddingBottom();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final int t()
  {
    RecyclerView localRecyclerView = b;
    int i;
    if (localRecyclerView != null) {
      i = localRecyclerView.getPaddingLeft();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final int u()
  {
    RecyclerView localRecyclerView = b;
    int i;
    if (localRecyclerView != null) {
      i = localRecyclerView.getPaddingRight();
    } else {
      i = 0;
    }
    return i;
  }
  
  public final int v()
  {
    RecyclerView localRecyclerView = b;
    int i;
    if (localRecyclerView != null) {
      i = localRecyclerView.getPaddingTop();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int y(RecyclerView.p paramp, RecyclerView.s params)
  {
    return -1;
  }
  
  public boolean z()
  {
    return false;
  }
  
  public final class a
    implements p.b
  {
    public a() {}
    
    public final int a(View paramView)
    {
      RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
      getClass();
      return paramView.getLeft() - getLayoutParamsa.left - leftMargin;
    }
    
    public final int b()
    {
      return t();
    }
    
    public final int c()
    {
      RecyclerView.j localj = RecyclerView.j.this;
      return f - localj.u();
    }
    
    public final View d(int paramInt)
    {
      return o(paramInt);
    }
    
    public final int e(View paramView)
    {
      RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
      getClass();
      return paramView.getRight() + getLayoutParamsa.right + rightMargin;
    }
  }
  
  public final class b
    implements p.b
  {
    public b() {}
    
    public final int a(View paramView)
    {
      RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
      getClass();
      return paramView.getTop() - getLayoutParamsa.top - topMargin;
    }
    
    public final int b()
    {
      return v();
    }
    
    public final int c()
    {
      RecyclerView.j localj = RecyclerView.j.this;
      return g - localj.s();
    }
    
    public final View d(int paramInt)
    {
      return o(paramInt);
    }
    
    public final int e(View paramView)
    {
      RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
      getClass();
      return paramView.getBottom() + getLayoutParamsa.bottom + bottomMargin;
    }
  }
  
  public static final class c
  {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */