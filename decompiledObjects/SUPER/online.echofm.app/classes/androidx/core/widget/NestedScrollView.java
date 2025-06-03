package androidx.core.widget;

import I.j;
import I.k;
import I.m;
import I.n;
import I.s;
import J.u;
import J.u.a;
import J.w;
import L.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView
  extends FrameLayout
  implements m
{
  public static final float O = (float)(Math.log(0.78D) / Math.log(0.9D));
  public static final a P = new a();
  public static final int[] Q = { 16843130 };
  public boolean A;
  public boolean B = true;
  public int C;
  public int D;
  public int E;
  public int F = -1;
  public final int[] G = new int[2];
  public final int[] H = new int[2];
  public int I;
  public int J;
  public d K;
  public final n L;
  public final k M;
  public float N;
  public final float o;
  public long p;
  public final Rect q = new Rect();
  public OverScroller r;
  public EdgeEffect s;
  public EdgeEffect t;
  public int u;
  public boolean v = true;
  public boolean w = false;
  public View x = null;
  public boolean y = false;
  public VelocityTracker z;
  
  public NestedScrollView(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, v.a.c);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    s = c.a(paramContext, paramAttributeSet);
    t = c.a(paramContext, paramAttributeSet);
    o = (getResourcesgetDisplayMetricsdensity * 160.0F * 386.0878F * 0.84F);
    A();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Q, paramInt, 0);
    setFillViewport(paramContext.getBoolean(0, false));
    paramContext.recycle();
    L = new n(this);
    M = new k(this);
    setNestedScrollingEnabled(true);
    s.D(this, P);
  }
  
  public static boolean E(View paramView1, View paramView2)
  {
    boolean bool = true;
    if (paramView1 == paramView2) {
      return true;
    }
    paramView1 = paramView1.getParent();
    if ((!(paramView1 instanceof ViewGroup)) || (!E((View)paramView1, paramView2))) {
      bool = false;
    }
    return bool;
  }
  
  private float getVerticalScrollFactorCompat()
  {
    if (N == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (localContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        N = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
      } else {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      }
    }
    return N;
  }
  
  public static int k(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 < paramInt3) && (paramInt1 >= 0))
    {
      if (paramInt2 + paramInt1 > paramInt3) {
        return paramInt3 - paramInt2;
      }
      return paramInt1;
    }
    return 0;
  }
  
  public final void A()
  {
    r = new OverScroller(getContext());
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    C = localViewConfiguration.getScaledTouchSlop();
    D = localViewConfiguration.getScaledMinimumFlingVelocity();
    E = localViewConfiguration.getScaledMaximumFlingVelocity();
  }
  
  public final void B()
  {
    if (z == null) {
      z = VelocityTracker.obtain();
    }
  }
  
  public final void C(int paramInt1, int paramInt2)
  {
    u = paramInt1;
    F = paramInt2;
    W(2, 0);
  }
  
  public final boolean D(View paramView)
  {
    return F(paramView, 0, getHeight()) ^ true;
  }
  
  public final boolean F(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(q);
    offsetDescendantRectToMyCoords(paramView, q);
    boolean bool;
    if ((q.bottom + paramInt1 >= getScrollY()) && (q.top - paramInt1 <= getScrollY() + paramInt2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void G(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i = getScrollY();
    scrollBy(0, paramInt1);
    i = getScrollY() - i;
    if (paramArrayOfInt != null) {
      paramArrayOfInt[1] += i;
    }
    M.d(0, i, 0, paramInt1 - i, null, paramInt2, paramArrayOfInt);
  }
  
  public final void H(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == F)
    {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      u = ((int)paramMotionEvent.getY(i));
      F = paramMotionEvent.getPointerId(i);
      paramMotionEvent = z;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  public boolean I(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    int i = getOverScrollMode();
    int j = computeHorizontalScrollRange();
    int k = computeHorizontalScrollExtent();
    boolean bool1 = false;
    if (j > k) {
      j = 1;
    } else {
      j = 0;
    }
    if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
      k = 1;
    } else {
      k = 0;
    }
    if ((i != 0) && ((i != 1) || (j == 0))) {
      j = 0;
    } else {
      j = 1;
    }
    if ((i != 0) && ((i != 1) || (k == 0))) {
      k = 0;
    } else {
      k = 1;
    }
    paramInt3 += paramInt1;
    if (j == 0) {
      paramInt1 = 0;
    } else {
      paramInt1 = paramInt7;
    }
    paramInt4 += paramInt2;
    if (k == 0) {
      paramInt2 = 0;
    } else {
      paramInt2 = paramInt8;
    }
    paramInt7 = -paramInt1;
    paramInt1 += paramInt5;
    paramInt5 = -paramInt2;
    paramInt2 += paramInt6;
    if (paramInt3 > paramInt1)
    {
      paramBoolean = true;
    }
    else if (paramInt3 < paramInt7)
    {
      paramBoolean = true;
      paramInt1 = paramInt7;
    }
    else
    {
      paramBoolean = false;
      paramInt1 = paramInt3;
    }
    boolean bool2;
    if (paramInt4 > paramInt2)
    {
      bool2 = true;
    }
    else if (paramInt4 < paramInt5)
    {
      bool2 = true;
      paramInt2 = paramInt5;
    }
    else
    {
      bool2 = false;
      paramInt2 = paramInt4;
    }
    if ((bool2) && (!x(1))) {
      r.springBack(paramInt1, paramInt2, 0, 0, 0, getScrollRange());
    }
    onOverScrolled(paramInt1, paramInt2, paramBoolean, bool2);
    if (!paramBoolean)
    {
      paramBoolean = bool1;
      if (!bool2) {}
    }
    else
    {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public boolean J(int paramInt)
  {
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getHeight();
    if (i != 0)
    {
      q.top = (getScrollY() + j);
      i = getChildCount();
      if (i > 0)
      {
        localObject = getChildAt(i - 1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((View)localObject).getLayoutParams();
        i = ((View)localObject).getBottom() + bottomMargin + getPaddingBottom();
        localObject = q;
        if (top + j > i) {
          top = (i - j);
        }
      }
    }
    else
    {
      q.top = (getScrollY() - j);
      localObject = q;
      if (top < 0) {
        top = 0;
      }
    }
    Object localObject = q;
    int i = top;
    j += i;
    bottom = j;
    return N(paramInt, i, j);
  }
  
  public final void K()
  {
    VelocityTracker localVelocityTracker = z;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      z = null;
    }
  }
  
  public final int L(int paramInt, float paramFloat)
  {
    float f1 = paramFloat / getWidth();
    float f2 = paramInt / getHeight();
    float f3 = c.b(s);
    paramFloat = 0.0F;
    EdgeEffect localEdgeEffect;
    if (f3 != 0.0F)
    {
      f1 = -c.d(s, -f2, f1);
      paramFloat = f1;
      if (c.b(s) == 0.0F) {
        localEdgeEffect = s;
      }
    }
    for (paramFloat = f1;; paramFloat = f1)
    {
      localEdgeEffect.onRelease();
      do
      {
        break;
        if (c.b(t) == 0.0F) {
          break;
        }
        f1 = c.d(t, f2, 1.0F - f1);
        paramFloat = f1;
      } while (c.b(t) != 0.0F);
      localEdgeEffect = t;
    }
    paramInt = Math.round(paramFloat * getHeight());
    if (paramInt != 0) {
      invalidate();
    }
    return paramInt;
  }
  
  public final void M(boolean paramBoolean)
  {
    if (paramBoolean) {
      W(2, 1);
    } else {
      Y(1);
    }
    J = getScrollY();
    s.x(this);
  }
  
  public final boolean N(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getHeight();
    int j = getScrollY();
    i += j;
    boolean bool1 = false;
    boolean bool2;
    if (paramInt1 == 33) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    View localView = t(bool2, paramInt2, paramInt3);
    Object localObject = localView;
    if (localView == null) {
      localObject = this;
    }
    if ((paramInt2 >= j) && (paramInt3 <= i))
    {
      bool2 = bool1;
    }
    else
    {
      if (bool2) {
        paramInt2 -= j;
      } else {
        paramInt2 = paramInt3 - i;
      }
      O(paramInt2, 0, 1, true);
      bool2 = true;
    }
    if (localObject != findFocus()) {
      ((View)localObject).requestFocus(paramInt1);
    }
    return bool2;
  }
  
  public final int O(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramInt3 == 1) {
      W(2, paramInt3);
    }
    int i;
    int j;
    if (n(0, paramInt1, H, G, paramInt3))
    {
      i = H[1];
      j = G[1];
      i = paramInt1 - i;
      paramInt1 = j;
      j = i;
    }
    else
    {
      j = paramInt1;
      paramInt1 = 0;
    }
    int k = getScrollY();
    int m = getScrollRange();
    if ((i()) && (!paramBoolean)) {
      i = 1;
    } else {
      i = 0;
    }
    int n;
    if ((I(0, j, 0, k, 0, m, 0, 0, true)) && (!x(paramInt3))) {
      n = 1;
    } else {
      n = 0;
    }
    int i1 = getScrollY() - k;
    Object localObject = H;
    localObject[1] = 0;
    o(0, i1, 0, j - i1, G, paramInt3, (int[])localObject);
    i1 = G[1];
    j -= H[1];
    k += j;
    if (k < 0)
    {
      if (i != 0)
      {
        c.d(s, -j / getHeight(), paramInt2 / getWidth());
        if (t.isFinished()) {}
      }
    }
    else {
      for (localObject = t;; localObject = s)
      {
        ((EdgeEffect)localObject).onRelease();
        break;
        if ((k <= m) || (i == 0)) {
          break;
        }
        c.d(t, j / getHeight(), 1.0F - paramInt2 / getWidth());
        if (s.isFinished()) {
          break;
        }
      }
    }
    if ((s.isFinished()) && (t.isFinished()))
    {
      if ((n != 0) && (paramInt3 == 0)) {
        z.clear();
      }
    }
    else {
      s.x(this);
    }
    if (paramInt3 == 1)
    {
      Y(paramInt3);
      s.onRelease();
      t.onRelease();
    }
    return paramInt1 + i1;
  }
  
  public final void P(View paramView)
  {
    paramView.getDrawingRect(q);
    offsetDescendantRectToMyCoords(paramView, q);
    int i = l(q);
    if (i != 0) {
      scrollBy(0, i);
    }
  }
  
  public final boolean Q(Rect paramRect, boolean paramBoolean)
  {
    int i = l(paramRect);
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
        S(0, i);
      }
    }
    return bool;
  }
  
  public final boolean R(EdgeEffect paramEdgeEffect, int paramInt)
  {
    boolean bool = true;
    if (paramInt > 0) {
      return true;
    }
    float f1 = c.b(paramEdgeEffect);
    float f2 = getHeight();
    if (w(-paramInt) >= f1 * f2) {
      bool = false;
    }
    return bool;
  }
  
  public final void S(int paramInt1, int paramInt2)
  {
    T(paramInt1, paramInt2, 250, false);
  }
  
  public final void T(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - p > 250L)
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
      r.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1, paramInt3);
      M(paramBoolean);
    }
    else
    {
      if (!r.isFinished()) {
        g();
      }
      scrollBy(paramInt1, paramInt2);
    }
    p = AnimationUtils.currentAnimationTimeMillis();
  }
  
  public void U(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    T(paramInt1 - getScrollX(), paramInt2 - getScrollY(), paramInt3, paramBoolean);
  }
  
  public void V(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    U(paramInt1, paramInt2, 250, paramBoolean);
  }
  
  public boolean W(int paramInt1, int paramInt2)
  {
    return M.m(paramInt1, paramInt2);
  }
  
  public final boolean X(MotionEvent paramMotionEvent)
  {
    float f = c.b(s);
    boolean bool1 = true;
    boolean bool2;
    if (f != 0.0F)
    {
      c.d(s, 0.0F, paramMotionEvent.getX() / getWidth());
      bool2 = true;
    }
    else
    {
      bool2 = false;
    }
    if (c.b(t) != 0.0F)
    {
      c.d(t, 0.0F, 1.0F - paramMotionEvent.getX() / getWidth());
      bool2 = bool1;
    }
    return bool2;
  }
  
  public void Y(int paramInt)
  {
    M.n(paramInt);
  }
  
  public void a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    L.c(paramView1, paramView2, paramInt1, paramInt2);
    W(2, paramInt2);
  }
  
  public void addView(View paramView)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void b(View paramView, int paramInt)
  {
    L.d(paramView, paramInt);
    Y(paramInt);
  }
  
  public void c(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    n(paramInt1, paramInt2, paramArrayOfInt, null, paramInt3);
  }
  
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    if (r.isFinished()) {
      return;
    }
    r.computeScrollOffset();
    int i = r.getCurrY();
    int j = m(i - J);
    J = i;
    Object localObject = H;
    localObject[1] = 0;
    n(0, j, (int[])localObject, null, 1);
    i = j - H[1];
    int k = getScrollRange();
    j = i;
    if (i != 0)
    {
      j = getScrollY();
      I(0, i, getScrollX(), j, 0, k, 0, 0, false);
      j = getScrollY() - j;
      i -= j;
      localObject = H;
      localObject[1] = 0;
      o(0, j, 0, i, G, 1, (int[])localObject);
      j = i - H[1];
    }
    if (j != 0)
    {
      i = getOverScrollMode();
      if ((i == 0) || ((i == 1) && (k > 0))) {
        if (j < 0)
        {
          if (!s.isFinished()) {}
        }
        else {
          for (localObject = s;; localObject = t)
          {
            ((EdgeEffect)localObject).onAbsorb((int)r.getCurrVelocity());
            break;
            if (!t.isFinished()) {
              break;
            }
          }
        }
      }
      g();
    }
    if (!r.isFinished()) {
      s.x(this);
    } else {
      Y(1);
    }
  }
  
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange()
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
  
  public void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    G(paramInt4, paramInt5, paramArrayOfInt);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!super.dispatchKeyEvent(paramKeyEvent)) && (!s(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return M.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return M.b(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return n(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return M.e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getScrollY();
    boolean bool = s.isFinished();
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
        m -= getPaddingLeft() + getPaddingRight();
        i2 = getPaddingLeft();
      }
      else
      {
        i2 = 0;
      }
      i3 = n;
      i4 = i1;
      if (b.a(this))
      {
        i3 = n - (getPaddingTop() + getPaddingBottom());
        i4 = i1 + getPaddingTop();
      }
      paramCanvas.translate(i2, i4);
      s.setSize(m, i3);
      if (s.draw(paramCanvas)) {
        s.x(this);
      }
      paramCanvas.restoreToCount(k);
    }
    if (!t.isFinished())
    {
      k = paramCanvas.save();
      i4 = getWidth();
      n = getHeight();
      i1 = Math.max(getScrollRange(), i) + n;
      m = j;
      i2 = i4;
      if (b.a(this))
      {
        i2 = i4 - (getPaddingLeft() + getPaddingRight());
        m = getPaddingLeft();
      }
      i3 = i1;
      i4 = n;
      if (b.a(this))
      {
        i4 = n - (getPaddingTop() + getPaddingBottom());
        i3 = i1 - getPaddingBottom();
      }
      paramCanvas.translate(m - i2, i3);
      paramCanvas.rotate(180.0F, i2, 0.0F);
      t.setSize(i2, i4);
      if (t.draw(paramCanvas)) {
        s.x(this);
      }
      paramCanvas.restoreToCount(k);
    }
  }
  
  public void e(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    G(paramInt4, paramInt5, null);
  }
  
  public boolean f(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void g()
  {
    r.abortAnimation();
    Y(1);
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
    j = localView.getBottom() + bottomMargin - getScrollY() - (j - k);
    if (j < i) {
      return j / i;
    }
    return 1.0F;
  }
  
  public int getMaxScrollAmount()
  {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes()
  {
    return L.a();
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
  
  public boolean h(int paramInt)
  {
    Object localObject1 = findFocus();
    Object localObject2 = localObject1;
    if (localObject1 == this) {
      localObject2 = null;
    }
    localObject1 = FocusFinder.getInstance().findNextFocus(this, (View)localObject2, paramInt);
    int i = getMaxScrollAmount();
    if ((localObject1 != null) && (F((View)localObject1, i, getHeight())))
    {
      ((View)localObject1).getDrawingRect(q);
      offsetDescendantRectToMyCoords((View)localObject1, q);
      O(l(q), 0, 1, true);
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
            j = Math.min(localView.getBottom() + bottomMargin - (getScrollY() + getHeight() - getPaddingBottom()), i);
          }
        }
      }
      if (j == 0) {
        return false;
      }
      if (paramInt != 130) {
        j = -j;
      }
      O(j, 0, 1, true);
    }
    if ((localObject2 != null) && (((View)localObject2).isFocused()) && (D((View)localObject2)))
    {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    }
    return true;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return x(0);
  }
  
  public final boolean i()
  {
    int i = getOverScrollMode();
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 0) {
      if ((i == 1) && (getScrollRange() > 0)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return M.j();
  }
  
  public final boolean j()
  {
    int i = getChildCount();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      bool2 = bool1;
      if (localView.getHeight() + topMargin + bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom()) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public int l(Rect paramRect)
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
      i = Math.min(i, localView.getBottom() + bottomMargin - m);
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
  
  public int m(int paramInt)
  {
    int i = getHeight();
    float f1;
    if ((paramInt > 0) && (c.b(s) != 0.0F))
    {
      f1 = -paramInt * 4.0F / i;
      j = Math.round(-i / 4.0F * c.d(s, f1, 0.5F));
      if (j != paramInt) {
        s.finish();
      }
      return paramInt - j;
    }
    int j = paramInt;
    if (paramInt < 0)
    {
      j = paramInt;
      if (c.b(t) != 0.0F)
      {
        float f2 = paramInt;
        f1 = i;
        f2 = f2 * 4.0F / f1;
        j = Math.round(f1 / 4.0F * c.d(t, f2, 0.5F));
        if (j != paramInt) {
          t.finish();
        }
        j = paramInt - j;
      }
    }
    return j;
  }
  
  public void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  public void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + leftMargin + rightMargin + paramInt2, width), View.MeasureSpec.makeMeasureSpec(topMargin + bottomMargin, 0));
  }
  
  public boolean n(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return M.c(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public void o(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2)
  {
    M.d(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfInt2);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    w = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i == 8)
    {
      bool2 = bool1;
      if (!y)
      {
        float f;
        if (j.a(paramMotionEvent, 2))
        {
          f = paramMotionEvent.getAxisValue(9);
          i = (int)paramMotionEvent.getX();
        }
        else if (j.a(paramMotionEvent, 4194304))
        {
          f = paramMotionEvent.getAxisValue(26);
          i = getWidth() / 2;
        }
        else
        {
          i = 0;
          f = 0.0F;
        }
        bool2 = bool1;
        if (f != 0.0F)
        {
          int j = (int)(f * getVerticalScrollFactorCompat());
          bool1 = j.a(paramMotionEvent, 8194);
          j = -j;
          bool2 = true;
          O(j, i, 1, bool1);
        }
      }
    }
    return bool2;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    boolean bool1 = true;
    boolean bool2 = true;
    if ((i == 2) && (y)) {
      return true;
    }
    i &= 0xFF;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 6) {
              break label407;
            }
            H(paramMotionEvent);
            break label407;
          }
        }
        else
        {
          i = F;
          if (i == -1) {
            break label407;
          }
          int j = paramMotionEvent.findPointerIndex(i);
          if (j == -1)
          {
            paramMotionEvent = new StringBuilder();
            paramMotionEvent.append("Invalid pointerId=");
            paramMotionEvent.append(i);
            paramMotionEvent.append(" in onInterceptTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
            break label407;
          }
          i = (int)paramMotionEvent.getY(j);
          if ((Math.abs(i - u) <= C) || ((0x2 & getNestedScrollAxes()) != 0)) {
            break label407;
          }
          y = true;
          u = i;
          B();
          z.addMovement(paramMotionEvent);
          I = 0;
          paramMotionEvent = getParent();
          if (paramMotionEvent == null) {
            break label407;
          }
          paramMotionEvent.requestDisallowInterceptTouchEvent(true);
          break label407;
        }
      }
      y = false;
      F = -1;
      K();
      if (r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
        s.x(this);
      }
      Y(0);
    }
    else
    {
      i = (int)paramMotionEvent.getY();
      boolean bool3;
      if (!y((int)paramMotionEvent.getX(), i))
      {
        bool3 = bool2;
        if (!X(paramMotionEvent)) {
          if (!r.isFinished()) {
            bool3 = bool2;
          } else {
            bool3 = false;
          }
        }
        y = bool3;
        K();
      }
      else
      {
        u = i;
        F = paramMotionEvent.getPointerId(0);
        z();
        z.addMovement(paramMotionEvent);
        r.computeScrollOffset();
        bool3 = bool1;
        if (!X(paramMotionEvent)) {
          if (!r.isFinished()) {
            bool3 = bool1;
          } else {
            bool3 = false;
          }
        }
        y = bool3;
        W(2, 0);
      }
    }
    label407:
    return y;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = 0;
    v = false;
    View localView = x;
    if ((localView != null) && (E(localView, this))) {
      P(x);
    }
    x = null;
    if (!w)
    {
      if (K != null)
      {
        scrollTo(getScrollX(), K.o);
        K = null;
      }
      if (getChildCount() > 0)
      {
        localView = getChildAt(0);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        paramInt1 = localView.getMeasuredHeight() + topMargin + bottomMargin;
      }
      int i = getPaddingTop();
      int j = getPaddingBottom();
      paramInt3 = getScrollY();
      paramInt1 = k(paramInt3, paramInt4 - paramInt2 - i - j, paramInt1);
      if (paramInt1 != paramInt3) {
        scrollTo(getScrollX(), paramInt1);
      }
    }
    scrollTo(getScrollX(), getScrollY());
    w = true;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!A) {
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
      if (i < paramInt2) {
        localView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + leftMargin + rightMargin, width), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dispatchNestedFling(0.0F, paramFloat2, true);
      u((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    c(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    G(paramInt4, 0, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    a(paramView1, paramView2, paramInt, 0);
  }
  
  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  public boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
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
    if (D((View)localObject)) {
      return false;
    }
    return ((View)localObject).requestFocus(i, paramRect);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof d))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (d)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    K = paramParcelable;
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    d locald = new d(super.onSaveInstanceState());
    o = getScrollY();
    return locald;
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView != null) && (this != localView) && (F(localView, 0, paramInt4)))
    {
      localView.getDrawingRect(q);
      offsetDescendantRectToMyCoords(localView, q);
      p(l(q));
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return f(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView)
  {
    b(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    B();
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      I = 0;
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    localMotionEvent.offsetLocation(0.0F, I);
    ViewParent localViewParent;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 5)
            {
              if (i != 6) {
                break label549;
              }
              H(paramMotionEvent);
              u = ((int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(F)));
              break label549;
            }
            i = paramMotionEvent.getActionIndex();
            u = ((int)paramMotionEvent.getY(i));
            F = paramMotionEvent.getPointerId(i);
            break label549;
          }
          if ((!y) || (getChildCount() <= 0) || (!r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))) {}
        }
      }
      for (;;)
      {
        s.x(this);
        do
        {
          for (;;)
          {
            r();
            break label549;
            int j = paramMotionEvent.findPointerIndex(F);
            if (j == -1)
            {
              paramMotionEvent = new StringBuilder();
              paramMotionEvent.append("Invalid pointerId=");
              paramMotionEvent.append(F);
              paramMotionEvent.append(" in onTouchEvent");
              Log.e("NestedScrollView", paramMotionEvent.toString());
              break label549;
            }
            int k = (int)paramMotionEvent.getY(j);
            i = u - k;
            int m = i - L(i, paramMotionEvent.getX(j));
            i = m;
            if (!y)
            {
              i = m;
              if (Math.abs(m) > C)
              {
                localViewParent = getParent();
                if (localViewParent != null) {
                  localViewParent.requestDisallowInterceptTouchEvent(true);
                }
                y = true;
                i = C;
                if (m > 0) {
                  i = m - i;
                } else {
                  i = m + i;
                }
              }
            }
            if (!y) {
              break label549;
            }
            i = O(i, (int)paramMotionEvent.getX(j), 0, false);
            u = (k - i);
            I += i;
            break label549;
            paramMotionEvent = z;
            paramMotionEvent.computeCurrentVelocity(1000, E);
            i = (int)paramMotionEvent.getYVelocity(F);
            if (Math.abs(i) < D) {
              break;
            }
            if (!q(i))
            {
              i = -i;
              float f = i;
              if (!dispatchNestedPreFling(0.0F, f))
              {
                dispatchNestedFling(0.0F, f, true);
                u(i);
              }
            }
          }
        } while (!r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()));
      }
    }
    else
    {
      if (getChildCount() == 0) {
        return false;
      }
      if (y)
      {
        localViewParent = getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(true);
        }
      }
      if (!r.isFinished()) {
        g();
      }
      C((int)paramMotionEvent.getY(), paramMotionEvent.getPointerId(0));
    }
    label549:
    paramMotionEvent = z;
    if (paramMotionEvent != null) {
      paramMotionEvent.addMovement(localMotionEvent);
    }
    localMotionEvent.recycle();
    return true;
  }
  
  public final void p(int paramInt)
  {
    if (paramInt != 0) {
      if (B) {
        S(0, paramInt);
      } else {
        scrollBy(0, paramInt);
      }
    }
  }
  
  public final boolean q(int paramInt)
  {
    EdgeEffect localEdgeEffect;
    if (c.b(s) != 0.0F) {
      if (R(s, paramInt)) {
        localEdgeEffect = s;
      }
    }
    for (;;)
    {
      localEdgeEffect.onAbsorb(paramInt);
      break;
      paramInt = -paramInt;
      int i;
      do
      {
        u(paramInt);
        break;
        if (c.b(t) == 0.0F) {
          break label95;
        }
        localEdgeEffect = t;
        i = -paramInt;
        paramInt = i;
      } while (!R(localEdgeEffect, i));
      localEdgeEffect = t;
      paramInt = i;
    }
    boolean bool = true;
    break label98;
    label95:
    bool = false;
    label98:
    return bool;
  }
  
  public final void r()
  {
    F = -1;
    y = false;
    K();
    Y(0);
    s.onRelease();
    t.onRelease();
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!v) {
      P(paramView2);
    } else {
      x = paramView2;
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    return Q(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      K();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    v = true;
    super.requestLayout();
  }
  
  public boolean s(KeyEvent paramKeyEvent)
  {
    q.setEmpty();
    boolean bool1 = j();
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 130;
    if (!bool1)
    {
      bool1 = bool3;
      if (isFocused())
      {
        bool1 = bool3;
        if (paramKeyEvent.getKeyCode() != 4)
        {
          View localView = findFocus();
          paramKeyEvent = localView;
          if (localView == this) {
            paramKeyEvent = null;
          }
          paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
          bool1 = bool3;
          if (paramKeyEvent != null)
          {
            bool1 = bool3;
            if (paramKeyEvent != this)
            {
              bool1 = bool3;
              if (paramKeyEvent.requestFocus(130)) {
                bool1 = true;
              }
            }
          }
        }
      }
      return bool1;
    }
    bool1 = bool2;
    if (paramKeyEvent.getAction() == 0)
    {
      int j = paramKeyEvent.getKeyCode();
      if (j != 19)
      {
        if (j != 20)
        {
          if (j != 62)
          {
            bool1 = bool2;
          }
          else
          {
            if (paramKeyEvent.isShiftPressed()) {
              i = 33;
            }
            J(i);
            bool1 = bool2;
          }
        }
        else if (!paramKeyEvent.isAltPressed()) {
          bool1 = h(130);
        } else {
          bool1 = v(130);
        }
      }
      else if (!paramKeyEvent.isAltPressed()) {
        bool1 = h(33);
      } else {
        bool1 = v(33);
      }
    }
    return bool1;
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i = getWidth();
      int j = getPaddingLeft();
      int k = getPaddingRight();
      int m = localView.getWidth();
      int n = leftMargin;
      int i1 = rightMargin;
      int i2 = getHeight();
      int i3 = getPaddingTop();
      int i4 = getPaddingBottom();
      int i5 = localView.getHeight();
      int i6 = topMargin;
      int i7 = bottomMargin;
      paramInt1 = k(paramInt1, i - j - k, m + n + i1);
      paramInt2 = k(paramInt2, i2 - i3 - i4, i5 + i6 + i7);
      if ((paramInt1 != getScrollX()) || (paramInt2 != getScrollY())) {
        super.scrollTo(paramInt1, paramInt2);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != A)
    {
      A = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    M.k(paramBoolean);
  }
  
  public void setOnScrollChangeListener(c paramc) {}
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    B = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return W(paramInt, 0);
  }
  
  public void stopNestedScroll()
  {
    Y(0);
  }
  
  public final View t(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = getFocusables(2);
    int i = localArrayList.size();
    Object localObject1 = null;
    int j = 0;
    int i1;
    for (int k = j; j < i; k = i1)
    {
      View localView = (View)localArrayList.get(j);
      int m = localView.getTop();
      int n = localView.getBottom();
      Object localObject2 = localObject1;
      i1 = k;
      if (paramInt1 < n)
      {
        localObject2 = localObject1;
        i1 = k;
        if (m < paramInt2)
        {
          int i2;
          if ((paramInt1 < m) && (n < paramInt2)) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (localObject1 == null)
          {
            localObject2 = localView;
            i1 = i2;
          }
          else
          {
            if (((paramBoolean) && (m < ((View)localObject1).getTop())) || ((!paramBoolean) && (n > ((View)localObject1).getBottom()))) {
              n = 1;
            } else {
              n = 0;
            }
            if (k != 0)
            {
              localObject2 = localObject1;
              i1 = k;
              if (i2 == 0) {
                break label233;
              }
              localObject2 = localObject1;
              i1 = k;
              if (n == 0) {
                break label233;
              }
            }
            else
            {
              if (i2 != 0)
              {
                localObject2 = localView;
                i1 = 1;
                break label233;
              }
              localObject2 = localObject1;
              i1 = k;
              if (n == 0) {
                break label233;
              }
            }
            localObject2 = localView;
            i1 = k;
          }
        }
      }
      label233:
      j++;
      localObject1 = localObject2;
    }
    return (View)localObject1;
  }
  
  public void u(int paramInt)
  {
    if (getChildCount() > 0)
    {
      r.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
      M(true);
    }
  }
  
  public boolean v(int paramInt)
  {
    int i;
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getHeight();
    Object localObject = q;
    top = 0;
    bottom = j;
    if (i != 0)
    {
      i = getChildCount();
      if (i > 0)
      {
        localObject = getChildAt(i - 1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((View)localObject).getLayoutParams();
        q.bottom = (((View)localObject).getBottom() + bottomMargin + getPaddingBottom());
        localObject = q;
        top = (bottom - j);
      }
    }
    localObject = q;
    return N(paramInt, top, bottom);
  }
  
  public final float w(int paramInt)
  {
    double d1 = Math.log(Math.abs(paramInt) * 0.35F / (o * 0.015F));
    float f = O;
    double d2 = f;
    return (float)(o * 0.015F * Math.exp(f / (d2 - 1.0D) * d1));
  }
  
  public boolean x(int paramInt)
  {
    return M.i(paramInt);
  }
  
  public final boolean y(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0)
    {
      i = getScrollY();
      View localView = getChildAt(0);
      bool2 = bool1;
      if (paramInt2 >= localView.getTop() - i)
      {
        bool2 = bool1;
        if (paramInt2 < localView.getBottom() - i)
        {
          bool2 = bool1;
          if (paramInt1 >= localView.getLeft())
          {
            bool2 = bool1;
            if (paramInt1 < localView.getRight()) {
              bool2 = true;
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public final void z()
  {
    VelocityTracker localVelocityTracker = z;
    if (localVelocityTracker == null) {
      z = VelocityTracker.obtain();
    } else {
      localVelocityTracker.clear();
    }
  }
  
  public static class a
    extends I.a
  {
    public void f(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.f(paramView, paramAccessibilityEvent);
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
      w.a(paramAccessibilityEvent, paramView.getScrollX());
      w.b(paramAccessibilityEvent, paramView.getScrollRange());
    }
    
    public void g(View paramView, u paramu)
    {
      super.g(paramView, paramu);
      paramView = (NestedScrollView)paramView;
      paramu.I(ScrollView.class.getName());
      if (paramView.isEnabled())
      {
        int i = paramView.getScrollRange();
        if (i > 0)
        {
          paramu.M(true);
          if (paramView.getScrollY() > 0)
          {
            paramu.a(u.a.q);
            paramu.a(u.a.B);
          }
          if (paramView.getScrollY() < i)
          {
            paramu.a(u.a.p);
            paramu.a(u.a.D);
          }
        }
      }
    }
    
    public boolean j(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.j(paramView, paramInt, paramBundle)) {
        return true;
      }
      paramBundle = (NestedScrollView)paramView;
      if (!paramBundle.isEnabled()) {
        return false;
      }
      int i = paramBundle.getHeight();
      paramView = new Rect();
      int j = i;
      if (paramBundle.getMatrix().isIdentity())
      {
        j = i;
        if (paramBundle.getGlobalVisibleRect(paramView)) {
          j = paramView.height();
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
          paramInt = paramBundle.getPaddingBottom();
          i = paramBundle.getPaddingTop();
          paramInt = Math.max(paramBundle.getScrollY() - (j - paramInt - i), 0);
          if (paramInt != paramBundle.getScrollY())
          {
            paramBundle.V(0, paramInt, true);
            return true;
          }
          return false;
        }
      }
      paramInt = paramBundle.getPaddingBottom();
      i = paramBundle.getPaddingTop();
      paramInt = Math.min(paramBundle.getScrollY() + (j - paramInt - i), paramBundle.getScrollRange());
      if (paramInt != paramBundle.getScrollY())
      {
        paramBundle.V(0, paramInt, true);
        return true;
      }
      return false;
    }
  }
  
  public static abstract class b
  {
    public static boolean a(ViewGroup paramViewGroup)
    {
      return paramViewGroup.getClipToPadding();
    }
  }
  
  public static abstract interface c {}
  
  public static class d
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public int o;
    
    public d(Parcel paramParcel)
    {
      super();
      o = paramParcel.readInt();
    }
    
    public d(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("HorizontalScrollView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" scrollPosition=");
      localStringBuilder.append(o);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(o);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public NestedScrollView.d a(Parcel paramParcel)
      {
        return new NestedScrollView.d(paramParcel);
      }
      
      public NestedScrollView.d[] b(int paramInt)
      {
        return new NestedScrollView.d[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.NestedScrollView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */