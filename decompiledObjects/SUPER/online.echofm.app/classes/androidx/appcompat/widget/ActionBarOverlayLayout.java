package androidx.appcompat.widget;

import A.f;
import I.l;
import I.m;
import I.n;
import I.s;
import I.x;
import I.x.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import e.a;
import e.e;
import l.A;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout
  extends ViewGroup
  implements l, m
{
  public static final int[] S = { a.b, 16842841 };
  public int A;
  public final Rect B = new Rect();
  public final Rect C = new Rect();
  public final Rect D = new Rect();
  public final Rect E = new Rect();
  public final Rect F = new Rect();
  public final Rect G = new Rect();
  public final Rect H = new Rect();
  public x I;
  public x J;
  public x K;
  public x L;
  public OverScroller M;
  public ViewPropertyAnimator N;
  public final AnimatorListenerAdapter O;
  public final Runnable P;
  public final Runnable Q;
  public final n R;
  public int o;
  public int p = 0;
  public ContentFrameLayout q;
  public ActionBarContainer r;
  public A s;
  public Drawable t;
  public boolean u;
  public boolean v;
  public boolean w;
  public boolean x;
  public boolean y;
  public int z;
  
  public ActionBarOverlayLayout(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = x.b;
    I = paramAttributeSet;
    J = paramAttributeSet;
    K = paramAttributeSet;
    L = paramAttributeSet;
    O = new a();
    P = new b();
    Q = new c();
    m(paramContext);
    R = new n(this);
  }
  
  public void a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      onNestedScrollAccepted(paramView1, paramView2, paramInt1);
    }
  }
  
  public void b(View paramView, int paramInt)
  {
    if (paramInt == 0) {
      onStopNestedScroll(paramView);
    }
  }
  
  public void c(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (paramInt3 == 0) {
      onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof e;
  }
  
  public void d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    e(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((t != null) && (!u))
    {
      int i;
      if (r.getVisibility() == 0) {
        i = (int)(r.getBottom() + r.getTranslationY() + 0.5F);
      } else {
        i = 0;
      }
      t.setBounds(0, i, getWidth(), t.getIntrinsicHeight() + i);
      t.draw(paramCanvas);
    }
  }
  
  public void e(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean f(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt2 == 0) && (onStartNestedScroll(paramView1, paramView2, paramInt1))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean fitSystemWindows(Rect paramRect)
  {
    return super.fitSystemWindows(paramRect);
  }
  
  public final void g()
  {
    l();
    Q.run();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new e(paramLayoutParams);
  }
  
  public int getActionBarHideOffset()
  {
    ActionBarContainer localActionBarContainer = r;
    int i;
    if (localActionBarContainer != null) {
      i = -(int)localActionBarContainer.getTranslationY();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getNestedScrollAxes()
  {
    return R.a();
  }
  
  public CharSequence getTitle()
  {
    p();
    return s.getTitle();
  }
  
  public final boolean h(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    paramView = (e)paramView.getLayoutParams();
    boolean bool1 = true;
    int i;
    int j;
    if (paramBoolean1)
    {
      i = leftMargin;
      j = left;
      if (i != j)
      {
        leftMargin = j;
        bool2 = true;
        break label49;
      }
    }
    boolean bool2 = false;
    label49:
    paramBoolean1 = bool2;
    if (paramBoolean2)
    {
      i = topMargin;
      j = top;
      paramBoolean1 = bool2;
      if (i != j)
      {
        topMargin = j;
        paramBoolean1 = true;
      }
    }
    paramBoolean2 = paramBoolean1;
    if (paramBoolean4)
    {
      i = rightMargin;
      j = right;
      paramBoolean2 = paramBoolean1;
      if (i != j)
      {
        rightMargin = j;
        paramBoolean2 = true;
      }
    }
    if (paramBoolean3)
    {
      i = bottomMargin;
      j = bottom;
      if (i != j)
      {
        bottomMargin = j;
        return bool1;
      }
    }
    paramBoolean1 = paramBoolean2;
    return paramBoolean1;
  }
  
  public e i()
  {
    return new e(-1, -1);
  }
  
  public e j(AttributeSet paramAttributeSet)
  {
    return new e(getContext(), paramAttributeSet);
  }
  
  public final A k(View paramView)
  {
    if ((paramView instanceof A)) {
      return (A)paramView;
    }
    if ((paramView instanceof Toolbar)) {
      return ((Toolbar)paramView).getWrapper();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Can't make a decor toolbar out of ");
    localStringBuilder.append(paramView.getClass().getSimpleName());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void l()
  {
    removeCallbacks(P);
    removeCallbacks(Q);
    ViewPropertyAnimator localViewPropertyAnimator = N;
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.cancel();
    }
  }
  
  public final void m(Context paramContext)
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(S);
    boolean bool1 = false;
    o = localTypedArray.getDimensionPixelSize(0, 0);
    Drawable localDrawable = localTypedArray.getDrawable(1);
    t = localDrawable;
    if (localDrawable == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    setWillNotDraw(bool2);
    localTypedArray.recycle();
    boolean bool2 = bool1;
    if (getApplicationInfotargetSdkVersion < 19) {
      bool2 = true;
    }
    u = bool2;
    M = new OverScroller(paramContext);
  }
  
  public final void n()
  {
    l();
    postDelayed(Q, 600L);
  }
  
  public final void o()
  {
    l();
    postDelayed(P, 600L);
  }
  
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    p();
    paramWindowInsets = x.s(paramWindowInsets);
    Object localObject = new Rect(paramWindowInsets.i(), paramWindowInsets.k(), paramWindowInsets.j(), paramWindowInsets.h());
    boolean bool = h(r, (Rect)localObject, true, true, false, true);
    s.b(this, paramWindowInsets, B);
    localObject = B;
    localObject = paramWindowInsets.l(left, top, right, bottom);
    I = ((x)localObject);
    if (!J.equals(localObject))
    {
      J = I;
      bool = true;
    }
    if (!C.equals(B)) {
      C.set(B);
    } else {
      if (!bool) {
        break label145;
      }
    }
    requestLayout();
    label145:
    return paramWindowInsets.a().c().b().r();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    m(getContext());
    s.A(this);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    l();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt4 = getChildCount();
    paramInt2 = getPaddingLeft();
    paramInt3 = getPaddingTop();
    for (paramInt1 = 0; paramInt1 < paramInt4; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        e locale = (e)localView.getLayoutParams();
        int i = localView.getMeasuredWidth();
        int j = localView.getMeasuredHeight();
        int k = leftMargin + paramInt2;
        int m = topMargin + paramInt3;
        localView.layout(k, m, i + k, j + m);
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    p();
    measureChildWithMargins(r, paramInt1, 0, paramInt2, 0);
    Object localObject = (e)r.getLayoutParams();
    int i = Math.max(0, r.getMeasuredWidth() + leftMargin + rightMargin);
    int j = Math.max(0, r.getMeasuredHeight() + topMargin + bottomMargin);
    int k = View.combineMeasuredStates(0, r.getMeasuredState());
    if ((s.r(this) & 0x100) != 0) {
      m = 1;
    } else {
      m = 0;
    }
    if (m != 0)
    {
      n = o;
      i1 = n;
      if (w)
      {
        i1 = n;
        if (r.getTabContainer() != null) {
          i1 = n + o;
        }
      }
    }
    else if (r.getVisibility() != 8)
    {
      i1 = r.getMeasuredHeight();
    }
    else
    {
      i1 = 0;
    }
    D.set(B);
    localObject = I;
    K = ((x)localObject);
    if ((!v) && (m == 0))
    {
      Rect localRect = D;
      top += i1;
      bottom = bottom;
    }
    for (localObject = ((x)localObject).l(0, i1, 0, 0);; localObject = new x.b(K).c((f)localObject).a())
    {
      K = ((x)localObject);
      break;
      localObject = f.b(((x)localObject).i(), K.k() + i1, K.j(), K.h());
    }
    h(q, D, true, true, true, true);
    if (!L.equals(K))
    {
      localObject = K;
      L = ((x)localObject);
      s.c(q, (x)localObject);
    }
    measureChildWithMargins(q, paramInt1, 0, paramInt2, 0);
    localObject = (e)q.getLayoutParams();
    int i1 = Math.max(i, q.getMeasuredWidth() + leftMargin + rightMargin);
    j = Math.max(j, q.getMeasuredHeight() + topMargin + bottomMargin);
    int m = View.combineMeasuredStates(k, q.getMeasuredState());
    int n = getPaddingLeft();
    k = getPaddingRight();
    j = Math.max(j + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(i1 + (n + k), getSuggestedMinimumWidth()), paramInt1, m), View.resolveSizeAndState(j, paramInt2, m << 16));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((x) && (paramBoolean))
    {
      if (r(paramFloat2)) {
        g();
      } else {
        q();
      }
      y = true;
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = z + paramInt2;
    z = paramInt1;
    setActionBarHideOffset(paramInt1);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    R.b(paramView1, paramView2, paramInt);
    z = getActionBarHideOffset();
    l();
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) != 0) && (r.getVisibility() == 0)) {
      return x;
    }
    return false;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    if ((x) && (!y)) {
      if (z <= r.getHeight()) {
        o();
      } else {
        n();
      }
    }
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    super.onWindowSystemUiVisibilityChanged(paramInt);
    p();
    A = paramInt;
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    p = paramInt;
  }
  
  public void p()
  {
    if (q == null)
    {
      q = ((ContentFrameLayout)findViewById(e.b));
      r = ((ActionBarContainer)findViewById(e.c));
      s = k(findViewById(e.a));
    }
  }
  
  public final void q()
  {
    l();
    P.run();
  }
  
  public final boolean r(float paramFloat)
  {
    M.fling(0, 0, 0, (int)paramFloat, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    boolean bool;
    if (M.getFinalY() > r.getHeight()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    l();
    paramInt = Math.max(0, Math.min(paramInt, r.getHeight()));
    r.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(d paramd)
  {
    if (getWindowToken() == null) {
      return;
    }
    throw null;
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    w = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != x)
    {
      x = paramBoolean;
      if (!paramBoolean)
      {
        l();
        setActionBarHideOffset(0);
      }
    }
  }
  
  public void setIcon(int paramInt)
  {
    p();
    s.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    p();
    s.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    p();
    s.c(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean)
  {
    v = paramBoolean;
    if ((paramBoolean) && (getContextgetApplicationInfotargetSdkVersion < 19)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    u = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    p();
    s.b(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    p();
    s.a(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public class a
    extends AnimatorListenerAdapter
  {
    public a() {}
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      paramAnimator = ActionBarOverlayLayout.this;
      N = null;
      y = false;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      paramAnimator = ActionBarOverlayLayout.this;
      N = null;
      y = false;
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      l();
      ActionBarOverlayLayout localActionBarOverlayLayout = ActionBarOverlayLayout.this;
      N = r.animate().translationY(0.0F).setListener(O);
    }
  }
  
  public class c
    implements Runnable
  {
    public c() {}
    
    public void run()
    {
      l();
      ActionBarOverlayLayout localActionBarOverlayLayout = ActionBarOverlayLayout.this;
      N = r.animate().translationY(-r.getHeight()).setListener(O);
    }
  }
  
  public static abstract interface d {}
  
  public static class e
    extends ViewGroup.MarginLayoutParams
  {
    public e(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public e(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public e(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */