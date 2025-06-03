package androidx.core.widget;

import a0.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import e0.a;
import e0.d0;
import e0.d0.d;
import e0.e;
import e0.g;
import e0.j0;
import e0.j0.c;
import e0.p;
import e0.r;
import e0.s;
import e0.x;
import e0.x.a;
import e0.y;
import f0.b;
import f0.b.a;
import j0.d.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class NestedScrollView
  extends FrameLayout
  implements r
{
  public static final float J = (float)(Math.log(0.78D) / Math.log(0.9D));
  public static final a K = new a();
  public static final int[] L = { 16843130 };
  public final int[] A = new int[2];
  public final int[] B = new int[2];
  public int C;
  public int D;
  public e E;
  public final s F;
  public final p G;
  public float H;
  public e0.f I;
  public final float a;
  public long b;
  public final Rect c = new Rect();
  public OverScroller d;
  public EdgeEffect e;
  public EdgeEffect f;
  public int o;
  public boolean p = true;
  public boolean q = false;
  public View r = null;
  public boolean s = false;
  public VelocityTracker t;
  public boolean u;
  public boolean v = true;
  public int w;
  public int x;
  public int y;
  public int z = -1;
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968791);
    Object localObject = new c();
    I = new e0.f(getContext(), (c)localObject);
    int i = Build.VERSION.SDK_INT;
    if (i >= 31) {
      localObject = d.b.a(paramContext, paramAttributeSet);
    } else {
      localObject = new EdgeEffect(paramContext);
    }
    e = ((EdgeEffect)localObject);
    if (i >= 31) {
      localObject = d.b.a(paramContext, paramAttributeSet);
    } else {
      localObject = new EdgeEffect(paramContext);
    }
    f = ((EdgeEffect)localObject);
    a = (getResourcesgetDisplayMetricsdensity * 160.0F * 386.0878F * 0.84F);
    d = new OverScroller(getContext());
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    localObject = ViewConfiguration.get(getContext());
    w = ((ViewConfiguration)localObject).getScaledTouchSlop();
    x = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
    y = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, L, 2130968791, 0);
    setFillViewport(paramContext.getBoolean(0, false));
    paramContext.recycle();
    F = new s();
    G = new p(this);
    setNestedScrollingEnabled(true);
    d0.h(this, K);
  }
  
  public static boolean h(View paramView1, View paramView2)
  {
    boolean bool = true;
    if (paramView1 == paramView2) {
      return true;
    }
    paramView1 = paramView1.getParent();
    if ((!(paramView1 instanceof ViewGroup)) || (!h((View)paramView1, paramView2))) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean a(int paramInt)
  {
    Object localObject1 = findFocus();
    Object localObject2 = localObject1;
    if (localObject1 == this) {
      localObject2 = null;
    }
    localObject1 = FocusFinder.getInstance().findNextFocus(this, (View)localObject2, paramInt);
    int i = getMaxScrollAmount();
    if ((localObject1 != null) && (i((View)localObject1, i, getHeight())))
    {
      ((View)localObject1).getDrawingRect(c);
      offsetDescendantRectToMyCoords((View)localObject1, c);
      o(b(c), 0, 1, true);
      ((View)localObject1).requestFocus(paramInt);
    }
    else
    {
      int j;
      if ((paramInt == 33) && (getScrollY() < i))
      {
        j = getScrollY();
      }
      else
      {
        j = i;
        if (paramInt == 130)
        {
          j = i;
          if (getChildCount() > 0)
          {
            View localView = getChildAt(0);
            localObject1 = (FrameLayout.LayoutParams)localView.getLayoutParams();
            int k = localView.getBottom();
            j = bottomMargin;
            int m = getScrollY();
            j = Math.min(k + j - (getHeight() + m - getPaddingBottom()), i);
          }
        }
      }
      if (j == 0) {
        return false;
      }
      if (paramInt != 130) {
        j = -j;
      }
      o(j, 0, 1, true);
    }
    if ((localObject2 != null) && (((View)localObject2).isFocused()) && ((i((View)localObject2, 0, getHeight()) ^ true)))
    {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    }
    return true;
  }
  
  public final void addView(View paramView)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, int paramInt)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final int b(Rect paramRect)
  {
    int i = getChildCount();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = getHeight();
    i = getScrollY();
    int m = i + k;
    int n = getVerticalFadingEdgeLength();
    int i1 = i;
    if (top > 0) {
      i1 = i + n;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    if (bottom < localView.getHeight() + topMargin + bottomMargin) {
      n = m - n;
    } else {
      n = m;
    }
    int i2 = bottom;
    if ((i2 > n) && (top > i1))
    {
      if (paramRect.height() > k) {
        i = top - i1;
      } else {
        i = bottom - n;
      }
      i = Math.min(i + 0, localView.getBottom() + bottomMargin - m);
    }
    else
    {
      i = j;
      if (top < i1)
      {
        i = j;
        if (i2 < n)
        {
          if (paramRect.height() > k) {
            i = 0 - (n - bottom);
          } else {
            i = 0 - (i1 - top);
          }
          i = Math.max(i, -getScrollY());
        }
      }
    }
    return i;
  }
  
  public final boolean c(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return G.c(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public final int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public final int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public final int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public final void computeScroll()
  {
    if (d.isFinished()) {
      return;
    }
    d.computeScrollOffset();
    int i = d.getCurrY();
    int j = i - D;
    int k = getHeight();
    float f1;
    float f2;
    if ((j > 0) && (j0.d.a(e) != 0.0F))
    {
      f1 = -j * 4.0F / k;
      f2 = -k / 4.0F;
      k = Math.round(j0.d.b(e, f1, 0.5F) * f2);
      m = k;
      if (k != j) {
        localObject = e;
      }
    }
    else
    {
      for (m = k;; m = k)
      {
        ((EdgeEffect)localObject).finish();
        break;
        m = j;
        if (j >= 0) {
          break label214;
        }
        m = j;
        if (j0.d.a(f) == 0.0F) {
          break label214;
        }
        f2 = j;
        f1 = k;
        f2 = f2 * 4.0F / f1;
        f1 /= 4.0F;
        k = Math.round(j0.d.b(f, f2, 0.5F) * f1);
        m = k;
        if (k == j) {
          break;
        }
        localObject = f;
      }
    }
    int m = j - m;
    label214:
    D = i;
    Object localObject = B;
    j = 0;
    localObject[1] = 0;
    c(0, m, (int[])localObject, null, 1);
    k = m - B[1];
    i = getScrollRange();
    m = k;
    if (k != 0)
    {
      m = getScrollY();
      l(k, getScrollX(), m, i);
      m = getScrollY() - m;
      k -= m;
      int[] arrayOfInt = B;
      arrayOfInt[1] = 0;
      localObject = A;
      G.e(0, m, 0, k, (int[])localObject, 1, arrayOfInt);
      m = k - B[1];
    }
    if (m != 0)
    {
      int n = getOverScrollMode();
      if (n != 0)
      {
        k = j;
        if (n == 1)
        {
          k = j;
          if (i <= 0) {}
        }
      }
      else
      {
        k = 1;
      }
      if (k != 0)
      {
        if (m < 0)
        {
          if (!e.isFinished()) {
            break label433;
          }
          localObject = e;
        }
        else
        {
          if (!f.isFinished()) {
            break label433;
          }
          localObject = f;
        }
        ((EdgeEffect)localObject).onAbsorb((int)d.getCurrVelocity());
      }
      label433:
      d.abortAnimation();
      t(1);
    }
    if (!d.isFinished()) {
      postInvalidateOnAnimation();
    } else {
      t(1);
    }
  }
  
  public final int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public final int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public final int computeVerticalScrollRange()
  {
    int i = getChildCount();
    int j = getHeight() - getPaddingBottom() - getPaddingTop();
    if (i == 0) {
      return j;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    i = localView.getBottom() + bottomMargin;
    int k = getScrollY();
    int m = Math.max(0, i - j);
    if (k < 0)
    {
      j = i - k;
    }
    else
    {
      j = i;
      if (k > m) {
        j = i + (k - m);
      }
    }
    return j;
  }
  
  public final void d()
  {
    z = -1;
    s = false;
    VelocityTracker localVelocityTracker = t;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      t = null;
    }
    t(0);
    e.onRelease();
    f.onRelease();
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!super.dispatchKeyEvent(paramKeyEvent)) && (!e(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return G.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public final boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return G.b(paramFloat1, paramFloat2);
  }
  
  public final boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return c(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public final boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return G.e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0, null);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getScrollY();
    boolean bool = e.isFinished();
    int j = 0;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    if (!bool)
    {
      k = paramCanvas.save();
      m = getWidth();
      n = getHeight();
      i1 = Math.min(0, i);
      if (b.a(this))
      {
        i2 = getPaddingLeft();
        m -= getPaddingRight() + i2;
        i2 = getPaddingLeft() + 0;
      }
      else
      {
        i2 = 0;
      }
      i3 = n;
      i4 = i1;
      if (b.a(this))
      {
        i4 = getPaddingTop();
        i3 = n - (getPaddingBottom() + i4);
        i4 = i1 + getPaddingTop();
      }
      paramCanvas.translate(i2, i4);
      e.setSize(m, i3);
      if (e.draw(paramCanvas)) {
        postInvalidateOnAnimation();
      }
      paramCanvas.restoreToCount(k);
    }
    if (!f.isFinished())
    {
      k = paramCanvas.save();
      i4 = getWidth();
      i1 = getHeight();
      n = Math.max(getScrollRange(), i) + i1;
      m = j;
      i2 = i4;
      if (b.a(this))
      {
        i2 = getPaddingLeft();
        i2 = i4 - (getPaddingRight() + i2);
        m = 0 + getPaddingLeft();
      }
      i3 = n;
      i4 = i1;
      if (b.a(this))
      {
        i4 = getPaddingTop();
        i4 = i1 - (getPaddingBottom() + i4);
        i3 = n - getPaddingBottom();
      }
      paramCanvas.translate(m - i2, i3);
      paramCanvas.rotate(180.0F, i2, 0.0F);
      f.setSize(i2, i4);
      if (f.draw(paramCanvas)) {
        postInvalidateOnAnimation();
      }
      paramCanvas.restoreToCount(k);
    }
  }
  
  public final boolean e(KeyEvent paramKeyEvent)
  {
    c.setEmpty();
    int i = getChildCount();
    boolean bool1 = true;
    boolean bool2 = false;
    View localView;
    if (i > 0)
    {
      localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      if (localView.getHeight() + topMargin + bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom())
      {
        i = 1;
        break label79;
      }
    }
    i = 0;
    label79:
    int j = 130;
    if (i == 0)
    {
      if ((isFocused()) && (paramKeyEvent.getKeyCode() != 4))
      {
        localView = findFocus();
        paramKeyEvent = localView;
        if (localView == this) {
          paramKeyEvent = null;
        }
        paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
        if ((paramKeyEvent == null) || (paramKeyEvent == this) || (!paramKeyEvent.requestFocus(130))) {
          bool1 = false;
        }
        return bool1;
      }
      return false;
    }
    bool1 = bool2;
    if (paramKeyEvent.getAction() == 0)
    {
      int k = paramKeyEvent.getKeyCode();
      if (k != 19)
      {
        if (k != 20)
        {
          if (k != 62)
          {
            if (k == 92) {
              break label306;
            }
            if (k == 93) {
              break label277;
            }
            if (k != 122)
            {
              i = j;
              if (k != 123) {
                return bool2;
              }
            }
            else
            {
              m(33);
              return bool2;
            }
          }
          else
          {
            i = j;
            if (paramKeyEvent.isShiftPressed()) {
              i = 33;
            }
          }
          m(i);
          return bool2;
        }
        else
        {
          if (!paramKeyEvent.isAltPressed()) {
            break label288;
          }
        }
        label277:
        return g(130);
        label288:
        return a(130);
      }
      else
      {
        if (!paramKeyEvent.isAltPressed()) {
          break label316;
        }
      }
      label306:
      return g(33);
      label316:
      bool1 = a(33);
    }
    return bool1;
  }
  
  public final void f(int paramInt)
  {
    if (getChildCount() > 0)
    {
      d.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
      r(2, 1);
      D = getScrollY();
      postInvalidateOnAnimation();
    }
  }
  
  public final boolean g(int paramInt)
  {
    int i;
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getHeight();
    Object localObject = c;
    top = 0;
    bottom = j;
    if (i != 0)
    {
      i = getChildCount();
      if (i > 0)
      {
        localObject = getChildAt(i - 1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((View)localObject).getLayoutParams();
        Rect localRect = c;
        i = ((View)localObject).getBottom();
        int k = bottomMargin;
        bottom = (getPaddingBottom() + (i + k));
        localObject = c;
        top = (bottom - j);
      }
    }
    localObject = c;
    return n(paramInt, top, bottom);
  }
  
  public float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    int i = getVerticalFadingEdgeLength();
    int j = getHeight();
    int k = getPaddingBottom();
    k = localView.getBottom() + bottomMargin - getScrollY() - (j - k);
    if (k < i) {
      return k / i;
    }
    return 1.0F;
  }
  
  public int getMaxScrollAmount()
  {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes()
  {
    s locals = F;
    int i = a;
    return b | i;
  }
  
  public int getScrollRange()
  {
    int i = getChildCount();
    int j = 0;
    if (i > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      j = Math.max(0, localView.getHeight() + topMargin + bottomMargin - (getHeight() - getPaddingTop() - getPaddingBottom()));
    }
    return j;
  }
  
  public float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i = getVerticalFadingEdgeLength();
    int j = getScrollY();
    if (j < i) {
      return j / i;
    }
    return 1.0F;
  }
  
  public float getVerticalScrollFactorCompat()
  {
    if (H == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (localContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        H = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
      } else {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      }
    }
    return H;
  }
  
  public final boolean hasNestedScrollingParent()
  {
    p localp = G;
    boolean bool = false;
    if (localp.f(0) != null) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean i(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(c);
    offsetDescendantRectToMyCoords(paramView, c);
    boolean bool;
    if ((c.bottom + paramInt1 >= getScrollY()) && (c.top - paramInt1 <= getScrollY() + paramInt2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isNestedScrollingEnabled()
  {
    return G.d;
  }
  
  public final void j(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i = getScrollY();
    scrollBy(0, paramInt1);
    i = getScrollY() - i;
    if (paramArrayOfInt != null) {
      paramArrayOfInt[1] += i;
    }
    G.d(i, paramInt1 - i, paramInt2, paramArrayOfInt);
  }
  
  public final void k(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == z)
    {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      o = ((int)paramMotionEvent.getY(i));
      z = paramMotionEvent.getPointerId(i);
      paramMotionEvent = t;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  public final boolean l(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    getOverScrollMode();
    computeHorizontalScrollRange();
    computeHorizontalScrollExtent();
    computeVerticalScrollRange();
    computeVerticalScrollExtent();
    boolean bool1 = true;
    paramInt2 += 0;
    paramInt1 = paramInt3 + paramInt1;
    paramInt3 = paramInt4 + 0;
    if (paramInt2 > 0) {}
    while (paramInt2 < 0)
    {
      paramInt2 = 0;
      bool2 = true;
      break;
    }
    boolean bool2 = false;
    if (paramInt1 > paramInt3) {}
    for (paramInt1 = paramInt3;; paramInt1 = 0)
    {
      bool3 = true;
      break label87;
      if (paramInt1 >= 0) {
        break;
      }
    }
    boolean bool3 = false;
    label87:
    if (bool3)
    {
      if (G.f(1) != null) {
        paramInt3 = 1;
      } else {
        paramInt3 = 0;
      }
      if (paramInt3 == 0) {
        d.springBack(paramInt2, paramInt1, 0, 0, 0, getScrollRange());
      }
    }
    onOverScrolled(paramInt2, paramInt1, bool2, bool3);
    boolean bool4 = bool1;
    if (!bool2) {
      if (bool3) {
        bool4 = bool1;
      } else {
        bool4 = false;
      }
    }
    return bool4;
  }
  
  public final void m(int paramInt)
  {
    int i = 0;
    if (paramInt == 130) {
      j = 1;
    } else {
      j = 0;
    }
    int k = getHeight();
    if (j != 0)
    {
      c.top = (getScrollY() + k);
      j = getChildCount();
      if (j <= 0) {
        break label151;
      }
      View localView = getChildAt(j - 1);
      localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
      i = localView.getBottom();
      j = bottomMargin;
      j = getPaddingBottom() + (i + j);
      localObject = c;
      if (top + k <= j) {
        break label151;
      }
      j -= k;
    }
    else
    {
      c.top = (getScrollY() - k);
      localObject = c;
      if (top >= 0) {
        break label151;
      }
      j = i;
    }
    top = j;
    label151:
    Object localObject = c;
    int j = top;
    i = k + j;
    bottom = i;
    n(paramInt, j, i);
  }
  
  public final void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramInt2 = getPaddingLeft();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt2, width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  public final void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt3 = getPaddingLeft();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt3 + leftMargin + rightMargin + paramInt2, width), View.MeasureSpec.makeMeasureSpec(topMargin + bottomMargin, 0));
  }
  
  public final boolean n(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getHeight();
    int j = getScrollY();
    int k = i + j;
    int m;
    if (paramInt1 == 33) {
      m = 1;
    } else {
      m = 0;
    }
    ArrayList localArrayList = getFocusables(2);
    int n = localArrayList.size();
    Object localObject1 = null;
    int i1 = 0;
    int i5;
    for (int i2 = 0; i1 < n; i2 = i5)
    {
      View localView = (View)localArrayList.get(i1);
      int i3 = localView.getTop();
      int i4 = localView.getBottom();
      localObject2 = localObject1;
      i5 = i2;
      if (paramInt2 < i4)
      {
        localObject2 = localObject1;
        i5 = i2;
        if (i3 < paramInt3)
        {
          if ((paramInt2 < i3) && (i4 < paramInt3)) {
            i = 1;
          } else {
            i = 0;
          }
          if (localObject1 == null)
          {
            localObject2 = localView;
            i5 = i;
          }
          else
          {
            if (((m != 0) && (i3 < ((View)localObject1).getTop())) || ((m == 0) && (i4 > ((View)localObject1).getBottom()))) {
              i3 = 1;
            } else {
              i3 = 0;
            }
            if (i2 != 0)
            {
              localObject2 = localObject1;
              i5 = i2;
              if (i == 0) {
                break label268;
              }
              localObject2 = localObject1;
              i5 = i2;
              if (i3 == 0) {
                break label268;
              }
            }
            else
            {
              if (i != 0)
              {
                localObject2 = localView;
                i5 = 1;
                break label268;
              }
              localObject2 = localObject1;
              i5 = i2;
              if (i3 == 0) {
                break label268;
              }
            }
            localObject2 = localView;
            i5 = i2;
          }
        }
      }
      label268:
      i1++;
      localObject1 = localObject2;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = this;
    }
    boolean bool;
    if ((paramInt2 >= j) && (paramInt3 <= k))
    {
      bool = false;
    }
    else
    {
      if (m != 0) {
        paramInt2 -= j;
      } else {
        paramInt2 = paramInt3 - k;
      }
      o(paramInt2, 0, 1, true);
      bool = true;
    }
    if (localObject2 != findFocus()) {
      ((View)localObject2).requestFocus(paramInt1);
    }
    return bool;
  }
  
  public final int o(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramInt3 == 1) {
      r(2, paramInt3);
    }
    int i;
    int j;
    if (c(0, paramInt1, B, A, paramInt3))
    {
      i = paramInt1 - B[1];
      j = A[1] + 0;
    }
    else
    {
      j = 0;
      i = paramInt1;
    }
    int k = getScrollY();
    int m = getScrollRange();
    paramInt1 = getOverScrollMode();
    if ((paramInt1 != 0) && ((paramInt1 != 1) || (getScrollRange() <= 0))) {
      paramInt1 = 0;
    } else {
      paramInt1 = 1;
    }
    int n;
    if ((paramInt1 != 0) && (!paramBoolean)) {
      n = 1;
    } else {
      n = 0;
    }
    if (l(i, 0, k, m))
    {
      if (G.f(paramInt3) != null) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      if (paramInt1 == 0)
      {
        paramInt1 = 1;
        break label163;
      }
    }
    paramInt1 = 0;
    label163:
    int i1 = getScrollY() - k;
    Object localObject = B;
    localObject[1] = 0;
    int[] arrayOfInt = A;
    G.e(0, i1, 0, i - i1, arrayOfInt, paramInt3, (int[])localObject);
    i1 = A[1];
    i -= B[1];
    k += i;
    if (k < 0)
    {
      if (n == 0) {
        break label352;
      }
      j0.d.b(e, -i / getHeight(), paramInt2 / getWidth());
      if (f.isFinished()) {
        break label352;
      }
      localObject = f;
    }
    else
    {
      if ((k <= m) || (n == 0)) {
        break label352;
      }
      j0.d.b(f, i / getHeight(), 1.0F - paramInt2 / getWidth());
      if (e.isFinished()) {
        break label352;
      }
      localObject = e;
    }
    ((EdgeEffect)localObject).onRelease();
    label352:
    if ((!e.isFinished()) || (!f.isFinished()))
    {
      postInvalidateOnAnimation();
      paramInt1 = 0;
    }
    if ((paramInt1 != 0) && (paramInt3 == 0))
    {
      localObject = t;
      if (localObject != null) {
        ((VelocityTracker)localObject).clear();
      }
    }
    if (paramInt3 == 1)
    {
      t(paramInt3);
      e.onRelease();
      f.onRelease();
    }
    return j + i1;
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    q = false;
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 8) && (!s))
    {
      int i;
      if ((paramMotionEvent.getSource() & 0x2) == 2) {
        i = 1;
      } else {
        i = 0;
      }
      int j = 9;
      float f1;
      if (i != 0)
      {
        f1 = paramMotionEvent.getAxisValue(9);
        i = (int)paramMotionEvent.getX();
      }
      else
      {
        if ((paramMotionEvent.getSource() & 0x400000) == 4194304) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          f1 = paramMotionEvent.getAxisValue(26);
          i = getWidth() / 2;
          j = 26;
        }
        else
        {
          f1 = 0.0F;
          j = 0;
          i = 0;
        }
      }
      if (f1 != 0.0F)
      {
        int k = (int)(getVerticalScrollFactorCompat() * f1);
        boolean bool;
        if ((paramMotionEvent.getSource() & 0x2002) == 8194) {
          bool = true;
        } else {
          bool = false;
        }
        o(-k, i, 1, bool);
        if (j != 0)
        {
          e0.f localf = I;
          localf.getClass();
          int m = paramMotionEvent.getSource();
          int n = paramMotionEvent.getDeviceId();
          Object localObject1;
          Object localObject3;
          int i1;
          if ((h == m) && (i == n) && (g == j))
          {
            i = 0;
          }
          else
          {
            localObject1 = c;
            Object localObject2 = a;
            localObject3 = j;
            ((e0.d)localObject1).getClass();
            localObject1 = ViewConfiguration.get((Context)localObject2);
            i = paramMotionEvent.getDeviceId();
            k = paramMotionEvent.getSource();
            i1 = Build.VERSION.SDK_INT;
            Object localObject4;
            if (i1 >= 34)
            {
              localObject4 = j0.a;
              i = j0.c.b((ViewConfiguration)localObject1, i, j, k);
            }
            else
            {
              localObject4 = j0.a;
              localObject4 = InputDevice.getDevice(i);
              if ((localObject4 != null) && (((InputDevice)localObject4).getMotionRange(j, k) != null)) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                localObject4 = ((Context)localObject2).getResources();
                if ((k == 4194304) && (j == 26)) {
                  i = ((Resources)localObject4).getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android");
                } else {
                  i = -1;
                }
                Objects.requireNonNull(localObject1);
                if (i == -1) {
                  break label425;
                }
                if (i != 0)
                {
                  k = ((Resources)localObject4).getDimensionPixelSize(i);
                  i = k;
                  if (k >= 0) {
                    break label437;
                  }
                }
              }
              i = Integer.MAX_VALUE;
              break label437;
              label425:
              i = Integer.valueOf(((ViewConfiguration)localObject1).getScaledMinimumFlingVelocity()).intValue();
            }
            label437:
            localObject3[0] = i;
            i = paramMotionEvent.getDeviceId();
            k = paramMotionEvent.getSource();
            if (i1 >= 34) {
              i = j0.c.a((ViewConfiguration)localObject1, i, j, k);
            }
            for (;;)
            {
              break;
              localObject4 = InputDevice.getDevice(i);
              if ((localObject4 != null) && (((InputDevice)localObject4).getMotionRange(j, k) != null)) {
                i = 1;
              } else {
                i = 0;
              }
              if (i != 0)
              {
                localObject2 = ((Context)localObject2).getResources();
                if ((k == 4194304) && (j == 26)) {
                  i = ((Resources)localObject2).getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                } else {
                  i = -1;
                }
                Objects.requireNonNull(localObject1);
                if (i == -1) {
                  break label588;
                }
                if (i != 0)
                {
                  k = ((Resources)localObject2).getDimensionPixelSize(i);
                  i = k;
                  if (k >= 0) {
                    continue;
                  }
                }
              }
              i = Integer.MIN_VALUE;
              continue;
              label588:
              i = Integer.valueOf(((ViewConfiguration)localObject1).getScaledMaximumFlingVelocity()).intValue();
            }
            localObject3[1] = i;
            h = m;
            i = n;
            g = j;
            i = 1;
          }
          if (j[0] == Integer.MAX_VALUE)
          {
            paramMotionEvent = e;
            if (paramMotionEvent != null)
            {
              paramMotionEvent.recycle();
              e = null;
            }
          }
          else
          {
            if (e == null) {
              e = VelocityTracker.obtain();
            }
            localObject1 = d;
            localObject3 = e;
            ((e)localObject1).getClass();
            localObject1 = x.a;
            ((VelocityTracker)localObject3).addMovement(paramMotionEvent);
            long l1;
            if ((Build.VERSION.SDK_INT < 34) && (paramMotionEvent.getSource() == 4194304))
            {
              if (!x.a.containsKey(localObject3)) {
                x.a.put(localObject3, new y());
              }
              localObject1 = (y)x.a.get(localObject3);
              localObject1.getClass();
              l1 = paramMotionEvent.getEventTime();
              if ((d != 0) && (l1 - b[e] > 40L))
              {
                d = 0;
                c = 0.0F;
              }
              k = (e + 1) % 20;
              e = k;
              n = d;
              if (n != 20) {
                d = (n + 1);
              }
              a[k] = paramMotionEvent.getAxisValue(26);
              b[e] = l1;
            }
            ((VelocityTracker)localObject3).computeCurrentVelocity(1000, Float.MAX_VALUE);
            paramMotionEvent = (y)x.a.get(localObject3);
            if (paramMotionEvent != null)
            {
              k = d;
              long l2;
              if (k >= 2)
              {
                n = e;
                k = (n + 20 - (k - 1)) % 20;
                l2 = b[n];
                for (;;)
                {
                  localObject1 = b;
                  l1 = localObject1[k];
                  if (l2 - l1 <= 100L) {
                    break;
                  }
                  d -= 1;
                  k = (k + 1) % 20;
                }
                n = d;
                if (n >= 2)
                {
                  if (n != 2) {
                    break label1096;
                  }
                  k = (k + 1) % 20;
                  l2 = localObject1[k];
                  if (l1 != l2) {
                    break label1077;
                  }
                }
              }
              f1 = 0.0F;
              break label1295;
              label1077:
              f1 = a[k] / (float)(l2 - l1);
              break label1295;
              label1096:
              f1 = 0.0F;
              n = 0;
              m = 0;
              for (;;)
              {
                i1 = d;
                f2 = -1.0F;
                if (n >= i1 - 1) {
                  break;
                }
                i1 = n + k;
                localObject1 = b;
                l1 = localObject1[(i1 % 20)];
                i1 = (i1 + 1) % 20;
                if (localObject1[i1] != l1)
                {
                  m++;
                  if (f1 >= 0.0F) {
                    f2 = 1.0F;
                  }
                  float f3 = (float)Math.sqrt(Math.abs(f1) * 2.0F);
                  float f4 = a[i1] / (float)(b[i1] - l1);
                  f2 = Math.abs(f4) * (f4 - f2 * f3) + f1;
                  f1 = f2;
                  if (m == 1) {
                    f1 = f2 * 0.5F;
                  }
                }
                n++;
              }
              if (f1 >= 0.0F) {
                f2 = 1.0F;
              }
              f1 = (float)Math.sqrt(Math.abs(f1) * 2.0F) * f2;
              label1295:
              f1 *= 'Ϩ';
              c = f1;
              if (f1 < -Math.abs(Float.MAX_VALUE))
              {
                f1 = -Math.abs(Float.MAX_VALUE);
              }
              else
              {
                if (c <= Math.abs(Float.MAX_VALUE)) {
                  break label1363;
                }
                f1 = Math.abs(Float.MAX_VALUE);
              }
              c = f1;
            }
            label1363:
            if (Build.VERSION.SDK_INT >= 34)
            {
              f1 = x.a.a((VelocityTracker)localObject3, j);
            }
            else if (j == 0)
            {
              f1 = ((VelocityTracker)localObject3).getXVelocity();
            }
            else if (j == 1)
            {
              f1 = ((VelocityTracker)localObject3).getYVelocity();
            }
            else
            {
              paramMotionEvent = (y)x.a.get(localObject3);
              if ((paramMotionEvent != null) && (j == 26)) {
                f1 = c;
              } else {
                f1 = 0.0F;
              }
            }
            f1 *= -b).a.getVerticalScrollFactorCompat();
            float f2 = Math.signum(f1);
            if ((i != 0) || ((f2 != Math.signum(f)) && (f2 != 0.0F))) {
              b).a.d.abortAnimation();
            }
            f2 = Math.abs(f1);
            paramMotionEvent = j;
            if (f2 >= paramMotionEvent[0])
            {
              i = paramMotionEvent[1];
              f1 = Math.max(-i, Math.min(f1, i));
              paramMotionEvent = (c)b;
              if (f1 == 0.0F)
              {
                paramMotionEvent.getClass();
                i = 0;
              }
              else
              {
                a.d.abortAnimation();
                a.f((int)f1);
                i = 1;
              }
              if (i == 0) {
                f1 = 0.0F;
              }
              f = f1;
            }
          }
        }
        return true;
      }
    }
    return false;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    boolean bool1 = true;
    boolean bool2 = true;
    if ((i == 2) && (s)) {
      return true;
    }
    i &= 0xFF;
    int j;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 6) {
              break label537;
            }
            k(paramMotionEvent);
            break label537;
          }
        }
        else
        {
          i = z;
          if (i == -1) {
            break label537;
          }
          j = paramMotionEvent.findPointerIndex(i);
          if (j == -1)
          {
            paramMotionEvent = new StringBuilder();
            paramMotionEvent.append("Invalid pointerId=");
            paramMotionEvent.append(i);
            paramMotionEvent.append(" in onInterceptTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
            break label537;
          }
          i = (int)paramMotionEvent.getY(j);
          if ((Math.abs(i - o) <= w) || ((0x2 & getNestedScrollAxes()) != 0)) {
            break label537;
          }
          s = true;
          o = i;
          if (t == null) {
            t = VelocityTracker.obtain();
          }
          t.addMovement(paramMotionEvent);
          C = 0;
          paramMotionEvent = getParent();
          if (paramMotionEvent == null) {
            break label537;
          }
          paramMotionEvent.requestDisallowInterceptTouchEvent(true);
          break label537;
        }
      }
      s = false;
      z = -1;
      paramMotionEvent = t;
      if (paramMotionEvent != null)
      {
        paramMotionEvent.recycle();
        t = null;
      }
      if (d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
        postInvalidateOnAnimation();
      }
      t(0);
    }
    else
    {
      j = (int)paramMotionEvent.getY();
      i = (int)paramMotionEvent.getX();
      Object localObject;
      if (getChildCount() > 0)
      {
        int k = getScrollY();
        localObject = getChildAt(0);
        if ((j >= ((View)localObject).getTop() - k) && (j < ((View)localObject).getBottom() - k) && (i >= ((View)localObject).getLeft()) && (i < ((View)localObject).getRight()))
        {
          i = 1;
          break label374;
        }
      }
      i = 0;
      label374:
      boolean bool3;
      if (i == 0)
      {
        bool3 = bool2;
        if (!s(paramMotionEvent)) {
          if (!d.isFinished()) {
            bool3 = bool2;
          } else {
            bool3 = false;
          }
        }
        s = bool3;
        paramMotionEvent = t;
        if (paramMotionEvent != null)
        {
          paramMotionEvent.recycle();
          t = null;
        }
      }
      else
      {
        o = j;
        z = paramMotionEvent.getPointerId(0);
        localObject = t;
        if (localObject == null) {
          t = VelocityTracker.obtain();
        } else {
          ((VelocityTracker)localObject).clear();
        }
        t.addMovement(paramMotionEvent);
        d.computeScrollOffset();
        bool3 = bool1;
        if (!s(paramMotionEvent)) {
          if (!d.isFinished()) {
            bool3 = bool1;
          } else {
            bool3 = false;
          }
        }
        s = bool3;
        r(2, 0);
      }
    }
    label537:
    return s;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = 0;
    p = false;
    View localView = r;
    if ((localView != null) && (h(localView, this)))
    {
      localView = r;
      localView.getDrawingRect(c);
      offsetDescendantRectToMyCoords(localView, c);
      paramInt1 = b(c);
      if (paramInt1 != 0) {
        scrollBy(0, paramInt1);
      }
    }
    r = null;
    if (!q)
    {
      if (E != null)
      {
        scrollTo(getScrollX(), E.a);
        E = null;
      }
      if (getChildCount() > 0)
      {
        localView = getChildAt(0);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        paramInt3 = localView.getMeasuredHeight() + topMargin + bottomMargin;
      }
      else
      {
        paramInt3 = 0;
      }
      paramInt4 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      paramInt2 = getScrollY();
      paramInt1 = i;
      if (paramInt4 < paramInt3) {
        if (paramInt2 < 0) {
          paramInt1 = i;
        } else if (paramInt4 + paramInt2 > paramInt3) {
          paramInt1 = paramInt3 - paramInt4;
        } else {
          paramInt1 = paramInt2;
        }
      }
      if (paramInt1 != paramInt2) {
        scrollTo(getScrollX(), paramInt1);
      }
    }
    scrollTo(getScrollX(), getScrollY());
    q = true;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!u) {
      return;
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      return;
    }
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i = localView.getMeasuredHeight();
      paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - topMargin - bottomMargin;
      if (i < paramInt2)
      {
        i = getPaddingLeft();
        localView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + leftMargin + rightMargin, width), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      }
    }
  }
  
  public final boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dispatchNestedFling(0.0F, paramFloat2, true);
      f((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public final boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public final void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public final void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    c(paramInt1, paramInt2, paramArrayOfInt, null, paramInt3);
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    j(paramInt4, 0, null);
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    j(paramInt4, paramInt5, null);
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    j(paramInt4, paramInt5, paramArrayOfInt);
  }
  
  public final void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    onNestedScrollAccepted(paramView1, paramView2, paramInt, 0);
  }
  
  public final void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    paramView1 = F;
    if (paramInt2 == 1) {
      b = paramInt1;
    } else {
      a = paramInt1;
    }
    r(2, paramInt2);
  }
  
  public final void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  public final boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i;
    if (paramInt == 2)
    {
      i = 130;
    }
    else
    {
      i = paramInt;
      if (paramInt == 1) {
        i = 33;
      }
    }
    Object localObject = FocusFinder.getInstance();
    if (paramRect == null) {
      localObject = ((FocusFinder)localObject).findNextFocus(this, null, i);
    } else {
      localObject = ((FocusFinder)localObject).findNextFocusFromRect(this, paramRect, i);
    }
    if (localObject == null) {
      return false;
    }
    if ((true ^ i((View)localObject, 0, getHeight()))) {
      return false;
    }
    return ((View)localObject).requestFocus(i, paramRect);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof e))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (e)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    E = paramParcelable;
    requestLayout();
  }
  
  public final Parcelable onSaveInstanceState()
  {
    e locale = new e(super.onSaveInstanceState());
    a = getScrollY();
    return locale;
  }
  
  public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView != null) && (this != localView) && (i(localView, 0, paramInt4)))
    {
      localView.getDrawingRect(c);
      offsetDescendantRectToMyCoords(localView, c);
      paramInt1 = b(c);
      if (paramInt1 != 0) {
        if (v) {
          q(0, paramInt1, false);
        } else {
          scrollBy(0, paramInt1);
        }
      }
    }
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return onStartNestedScroll(paramView1, paramView2, paramInt, 0);
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void onStopNestedScroll(View paramView)
  {
    onStopNestedScroll(paramView, 0);
  }
  
  public final void onStopNestedScroll(View paramView, int paramInt)
  {
    paramView = F;
    if (paramInt == 1) {
      b = 0;
    } else {
      a = 0;
    }
    t(paramInt);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (t == null) {
      t = VelocityTracker.obtain();
    }
    int i = paramMotionEvent.getActionMasked();
    int j = 0;
    if (i == 0) {
      C = 0;
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    float f1 = C;
    float f2 = 0.0F;
    localMotionEvent.offsetLocation(0.0F, f1);
    Object localObject;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 5)
            {
              if (i != 6) {
                break label816;
              }
              k(paramMotionEvent);
              o = ((int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(z)));
              break label816;
            }
            j = paramMotionEvent.getActionIndex();
            o = ((int)paramMotionEvent.getY(j));
            z = paramMotionEvent.getPointerId(j);
            break label816;
          }
          if ((!s) || (getChildCount() <= 0) || (!d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))) {
            break label723;
          }
        }
        else
        {
          int k = paramMotionEvent.findPointerIndex(z);
          if (k == -1)
          {
            paramMotionEvent = f.l("Invalid pointerId=");
            paramMotionEvent.append(z);
            paramMotionEvent.append(" in onTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
            break label816;
          }
          int m = (int)paramMotionEvent.getY(k);
          i = o - m;
          f1 = paramMotionEvent.getX(k) / getWidth();
          float f3 = i / getHeight();
          if (j0.d.a(e) != 0.0F)
          {
            f1 = -j0.d.b(e, -f3, f1);
            f2 = f1;
            if (j0.d.a(e) == 0.0F)
            {
              localObject = e;
              f2 = f1;
              break label388;
            }
          }
          for (;;)
          {
            break;
            if (j0.d.a(f) == 0.0F) {
              break;
            }
            f1 = j0.d.b(f, f3, 1.0F - f1);
            f2 = f1;
            if (j0.d.a(f) == 0.0F)
            {
              localObject = f;
              f2 = f1;
              label388:
              ((EdgeEffect)localObject).onRelease();
            }
          }
          j = Math.round(f2 * getHeight());
          if (j != 0) {
            invalidate();
          }
          i -= j;
          j = i;
          if (!s)
          {
            j = i;
            if (Math.abs(i) > w)
            {
              localObject = getParent();
              if (localObject != null) {
                ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
              }
              s = true;
              j = w;
              if (i > 0) {
                j = i - j;
              } else {
                j = i + j;
              }
            }
          }
          if (!s) {
            break label816;
          }
          j = o(j, (int)paramMotionEvent.getX(k), 0, false);
          o = (m - j);
          C += j;
          break label816;
        }
      }
      else
      {
        paramMotionEvent = t;
        paramMotionEvent.computeCurrentVelocity(1000, y);
        i = (int)paramMotionEvent.getYVelocity(z);
        if (Math.abs(i) >= x)
        {
          if (j0.d.a(e) != 0.0F)
          {
            if (p(e, i))
            {
              paramMotionEvent = e;
              j = i;
            }
            else
            {
              j = -i;
              break label649;
            }
          }
          else
          {
            if (j0.d.a(f) == 0.0F) {
              break label656;
            }
            paramMotionEvent = f;
            j = -i;
            if (!p(paramMotionEvent, j)) {
              break label649;
            }
            paramMotionEvent = f;
          }
          paramMotionEvent.onAbsorb(j);
          break label654;
          label649:
          f(j);
          label654:
          j = 1;
          label656:
          if (j != 0) {
            break label723;
          }
          j = -i;
          f2 = j;
          if (dispatchNestedPreFling(0.0F, f2)) {
            break label723;
          }
          dispatchNestedFling(0.0F, f2, true);
          f(j);
          break label723;
        }
        if (!d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
          break label723;
        }
      }
      postInvalidateOnAnimation();
      label723:
      d();
    }
    else
    {
      if (getChildCount() == 0) {
        return false;
      }
      if (s)
      {
        localObject = getParent();
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
      }
      if (!d.isFinished())
      {
        d.abortAnimation();
        t(1);
      }
      j = (int)paramMotionEvent.getY();
      i = paramMotionEvent.getPointerId(0);
      o = j;
      z = i;
      r(2, 0);
    }
    label816:
    paramMotionEvent = t;
    if (paramMotionEvent != null) {
      paramMotionEvent.addMovement(localMotionEvent);
    }
    localMotionEvent.recycle();
    return true;
  }
  
  public final boolean p(EdgeEffect paramEdgeEffect, int paramInt)
  {
    boolean bool = true;
    if (paramInt > 0) {
      return true;
    }
    float f1 = j0.d.a(paramEdgeEffect);
    float f2 = getHeight();
    double d1 = Math.log(Math.abs(-paramInt) * 0.35F / (a * 0.015F));
    double d2 = J;
    double d3 = a * 0.015F;
    if ((float)(Math.exp(d2 / (d2 - 1.0D) * d1) * d3) >= f1 * f2) {
      bool = false;
    }
    return bool;
  }
  
  public final void q(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - b > 250L)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i = localView.getHeight();
      int j = topMargin;
      int k = bottomMargin;
      int m = getHeight();
      int n = getPaddingTop();
      int i1 = getPaddingBottom();
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, Math.max(0, i + j + k - (m - n - i1))));
      d.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1, 250);
      if (paramBoolean) {
        r(2, 1);
      } else {
        t(1);
      }
      D = getScrollY();
      postInvalidateOnAnimation();
    }
    else
    {
      if (!d.isFinished())
      {
        d.abortAnimation();
        t(1);
      }
      scrollBy(paramInt1, paramInt2);
    }
    b = AnimationUtils.currentAnimationTimeMillis();
  }
  
  public final boolean r(int paramInt1, int paramInt2)
  {
    return G.g(paramInt1, paramInt2);
  }
  
  public final void requestChildFocus(View paramView1, View paramView2)
  {
    if (!p)
    {
      paramView2.getDrawingRect(c);
      offsetDescendantRectToMyCoords(paramView2, c);
      int i = b(c);
      if (i != 0) {
        scrollBy(0, i);
      }
    }
    else
    {
      r = paramView2;
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public final boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    int i = b(paramRect);
    boolean bool;
    if (i != 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool) {
      if (paramBoolean) {
        scrollBy(0, i);
      } else {
        q(0, i, false);
      }
    }
    return bool;
  }
  
  public final void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      VelocityTracker localVelocityTracker = t;
      if (localVelocityTracker != null)
      {
        localVelocityTracker.recycle();
        t = null;
      }
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public final void requestLayout()
  {
    p = true;
    super.requestLayout();
  }
  
  public final boolean s(MotionEvent paramMotionEvent)
  {
    float f1 = j0.d.a(e);
    boolean bool1 = true;
    boolean bool2;
    if (f1 != 0.0F)
    {
      j0.d.b(e, 0.0F, paramMotionEvent.getX() / getWidth());
      bool2 = true;
    }
    else
    {
      bool2 = false;
    }
    if (j0.d.a(f) != 0.0F)
    {
      j0.d.b(f, 0.0F, 1.0F - paramMotionEvent.getX() / getWidth());
      bool2 = bool1;
    }
    return bool2;
  }
  
  public final void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i = getWidth() - getPaddingLeft() - getPaddingRight();
      int j = localView.getWidth() + leftMargin + rightMargin;
      int k = getHeight() - getPaddingTop() - getPaddingBottom();
      int m = localView.getHeight() + topMargin + bottomMargin;
      int n;
      if ((i < j) && (paramInt1 >= 0))
      {
        n = paramInt1;
        if (i + paramInt1 > j) {
          n = j - i;
        }
      }
      else
      {
        n = 0;
      }
      if ((k < m) && (paramInt2 >= 0))
      {
        paramInt1 = paramInt2;
        if (k + paramInt2 > m) {
          paramInt1 = m - k;
        }
      }
      else
      {
        paramInt1 = 0;
      }
      if ((n != getScrollX()) || (paramInt1 != getScrollY())) {
        super.scrollTo(n, paramInt1);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != u)
    {
      u = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    p localp = G;
    if (d)
    {
      View localView = c;
      WeakHashMap localWeakHashMap = d0.a;
      d0.d.z(localView);
    }
    d = paramBoolean;
  }
  
  public void setOnScrollChangeListener(d paramd) {}
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    v = paramBoolean;
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public final boolean startNestedScroll(int paramInt)
  {
    return r(paramInt, 0);
  }
  
  public final void stopNestedScroll()
  {
    t(0);
  }
  
  public final void t(int paramInt)
  {
    G.h(paramInt);
  }
  
  public static final class a
    extends a
  {
    public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.c(paramView, paramAccessibilityEvent);
      paramView = (NestedScrollView)paramView;
      paramAccessibilityEvent.setClassName(ScrollView.class.getName());
      boolean bool;
      if (paramView.getScrollRange() > 0) {
        bool = true;
      } else {
        bool = false;
      }
      paramAccessibilityEvent.setScrollable(bool);
      paramAccessibilityEvent.setScrollX(paramView.getScrollX());
      paramAccessibilityEvent.setScrollY(paramView.getScrollY());
      paramAccessibilityEvent.setMaxScrollX(paramView.getScrollX());
      paramAccessibilityEvent.setMaxScrollY(paramView.getScrollRange());
    }
    
    public final void d(View paramView, b paramb)
    {
      a.onInitializeAccessibilityNodeInfo(paramView, a);
      paramView = (NestedScrollView)paramView;
      Object localObject = ScrollView.class.getName();
      a.setClassName((CharSequence)localObject);
      if (paramView.isEnabled())
      {
        int i = paramView.getScrollRange();
        if (i > 0)
        {
          a.setScrollable(true);
          if (paramView.getScrollY() > 0)
          {
            localObject = b.a.e;
            a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
            localObject = b.a.f;
            a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
          }
          if (paramView.getScrollY() < i)
          {
            paramView = b.a.d;
            a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
            paramView = b.a.g;
            a.addAction((AccessibilityNodeInfo.AccessibilityAction)a);
          }
        }
      }
    }
    
    public final boolean g(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.g(paramView, paramInt, paramBundle)) {
        return true;
      }
      paramView = (NestedScrollView)paramView;
      if (!paramView.isEnabled()) {
        return false;
      }
      int i = paramView.getHeight();
      paramBundle = new Rect();
      int j = i;
      if (paramView.getMatrix().isIdentity())
      {
        j = i;
        if (paramView.getGlobalVisibleRect(paramBundle)) {
          j = paramBundle.height();
        }
      }
      if (paramInt != 4096) {
        if ((paramInt != 8192) && (paramInt != 16908344))
        {
          if (paramInt != 16908346) {
            return false;
          }
        }
        else
        {
          paramInt = paramView.getPaddingBottom();
          i = paramView.getPaddingTop();
          paramInt = Math.max(paramView.getScrollY() - (j - paramInt - i), 0);
          if (paramInt != paramView.getScrollY())
          {
            paramView.q(0 - paramView.getScrollX(), paramInt - paramView.getScrollY(), true);
            return true;
          }
          return false;
        }
      }
      i = paramView.getPaddingBottom();
      paramInt = paramView.getPaddingTop();
      paramInt = Math.min(paramView.getScrollY() + (j - i - paramInt), paramView.getScrollRange());
      if (paramInt != paramView.getScrollY())
      {
        paramView.q(0 - paramView.getScrollX(), paramInt - paramView.getScrollY(), true);
        return true;
      }
      return false;
    }
  }
  
  public static final class b
  {
    public static boolean a(ViewGroup paramViewGroup)
    {
      return paramViewGroup.getClipToPadding();
    }
  }
  
  public final class c
    implements g
  {
    public c() {}
  }
  
  public static abstract interface d {}
  
  public static final class e
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public int a;
    
    public e(Parcel paramParcel)
    {
      super();
      a = paramParcel.readInt();
    }
    
    public e(Parcelable paramParcelable)
    {
      super();
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("HorizontalScrollView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" scrollPosition=");
      return j.m(localStringBuilder, a, "}");
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(a);
    }
    
    public final class a
      implements Parcelable.Creator<NestedScrollView.e>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new NestedScrollView.e(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new NestedScrollView.e[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.NestedScrollView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */