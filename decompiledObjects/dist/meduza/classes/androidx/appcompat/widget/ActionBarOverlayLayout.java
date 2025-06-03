package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import e0.d0;
import e0.d0.c;
import e0.d0.d;
import e0.q;
import e0.r;
import e0.s;
import e0.s0;
import e0.s0.b;
import e0.s0.c;
import e0.s0.d;
import e0.s0.e;
import e0.s0.k;
import g.g.d;
import g.x;
import j.g;
import java.util.WeakHashMap;
import l.g0;
import l.h0;
import x.b;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements g0, q, r
{
  public static final int[] J = { 2130968579, 16842841 };
  public s0 A;
  public s0 B;
  public d C;
  public OverScroller D;
  public ViewPropertyAnimator E;
  public final a F;
  public final b G;
  public final c H;
  public final s I;
  public int a;
  public int b = 0;
  public ContentFrameLayout c;
  public ActionBarContainer d;
  public h0 e;
  public Drawable f;
  public boolean o;
  public boolean p;
  public boolean q;
  public boolean r;
  public boolean s;
  public int t;
  public int u;
  public final Rect v = new Rect();
  public final Rect w = new Rect();
  public final Rect x = new Rect();
  public s0 y;
  public s0 z;
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    new Rect();
    new Rect();
    new Rect();
    new Rect();
    paramAttributeSet = s0.b;
    y = paramAttributeSet;
    z = paramAttributeSet;
    A = paramAttributeSet;
    B = paramAttributeSet;
    F = new a();
    G = new b();
    H = new c();
    l(paramContext);
    I = new s();
  }
  
  public static boolean j(FrameLayout paramFrameLayout, Rect paramRect, boolean paramBoolean)
  {
    paramFrameLayout = (e)paramFrameLayout.getLayoutParams();
    int i = leftMargin;
    int j = left;
    boolean bool1 = true;
    boolean bool2;
    if (i != j)
    {
      leftMargin = j;
      bool2 = true;
    }
    else
    {
      bool2 = false;
    }
    i = topMargin;
    j = top;
    if (i != j)
    {
      topMargin = j;
      bool2 = true;
    }
    i = rightMargin;
    j = right;
    if (i != j)
    {
      rightMargin = j;
      bool2 = true;
    }
    if (paramBoolean)
    {
      i = bottomMargin;
      j = bottom;
      if (i != j)
      {
        bottomMargin = j;
        return bool1;
      }
    }
    paramBoolean = bool2;
    return paramBoolean;
  }
  
  public final boolean a()
  {
    m();
    return e.a();
  }
  
  public final void b()
  {
    m();
    e.b();
  }
  
  public final boolean c()
  {
    m();
    return e.c();
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof e;
  }
  
  public final void d(androidx.appcompat.view.menu.f paramf, g.d paramd)
  {
    m();
    e.d(paramf, paramd);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((f != null) && (!o))
    {
      int i;
      if (d.getVisibility() == 0)
      {
        float f1 = d.getBottom();
        i = (int)(d.getTranslationY() + f1 + 0.5F);
      }
      else
      {
        i = 0;
      }
      f.setBounds(0, i, getWidth(), f.getIntrinsicHeight() + i);
      f.draw(paramCanvas);
    }
  }
  
  public final boolean e()
  {
    m();
    return e.e();
  }
  
  public final boolean f()
  {
    m();
    return e.f();
  }
  
  public final boolean fitSystemWindows(Rect paramRect)
  {
    return super.fitSystemWindows(paramRect);
  }
  
  public final boolean g()
  {
    m();
    return e.g();
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new e();
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new e(getContext(), paramAttributeSet);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new e(paramLayoutParams);
  }
  
  public int getActionBarHideOffset()
  {
    ActionBarContainer localActionBarContainer = d;
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
    s locals = I;
    int i = a;
    return b | i;
  }
  
  public CharSequence getTitle()
  {
    m();
    return e.getTitle();
  }
  
  public final void h(int paramInt)
  {
    m();
    if (paramInt != 2)
    {
      if (paramInt != 5)
      {
        if (paramInt == 109) {
          setOverlayMode(true);
        }
      }
      else {
        e.s();
      }
    }
    else {
      e.r();
    }
  }
  
  public final void i()
  {
    m();
    e.h();
  }
  
  public final void k()
  {
    removeCallbacks(G);
    removeCallbacks(H);
    ViewPropertyAnimator localViewPropertyAnimator = E;
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.cancel();
    }
  }
  
  public final void l(Context paramContext)
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(J);
    boolean bool1 = false;
    a = localTypedArray.getDimensionPixelSize(0, 0);
    Drawable localDrawable = localTypedArray.getDrawable(1);
    f = localDrawable;
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
    o = bool2;
    D = new OverScroller(paramContext);
  }
  
  public final void m()
  {
    if (c == null)
    {
      c = ((ContentFrameLayout)findViewById(2131361833));
      d = ((ActionBarContainer)findViewById(2131361834));
      Object localObject = findViewById(2131361832);
      if ((localObject instanceof h0))
      {
        localObject = (h0)localObject;
      }
      else
      {
        if (!(localObject instanceof Toolbar)) {
          break label81;
        }
        localObject = ((Toolbar)localObject).getWrapper();
      }
      e = ((h0)localObject);
      return;
      label81:
      StringBuilder localStringBuilder = f.l("Can't make a decor toolbar out of ");
      localStringBuilder.append(localObject.getClass().getSimpleName());
      throw new IllegalStateException(localStringBuilder.toString());
    }
  }
  
  public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    m();
    paramWindowInsets = s0.c(paramWindowInsets, this);
    Object localObject = new Rect(a.g().a, a.g().b, a.g().c, a.g().d);
    boolean bool1 = j(d, (Rect)localObject, false);
    localObject = v;
    WeakHashMap localWeakHashMap = d0.a;
    d0.d.b(this, paramWindowInsets, (Rect)localObject);
    localObject = v;
    int i = left;
    int j = top;
    int k = right;
    int m = bottom;
    localObject = a.h(i, j, k, m);
    y = ((s0)localObject);
    boolean bool2 = z.equals(localObject);
    boolean bool3 = true;
    if (!bool2)
    {
      z = y;
      bool1 = true;
    }
    if (!w.equals(v))
    {
      w.set(v);
      bool1 = bool3;
    }
    if (bool1) {
      requestLayout();
    }
    return a.a().a.c().a.b().b();
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    l(getContext());
    paramConfiguration = d0.a;
    d0.c.c(this);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    k();
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt4 = getPaddingLeft();
    paramInt3 = getPaddingTop();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        e locale = (e)localView.getLayoutParams();
        int i = localView.getMeasuredWidth();
        int j = localView.getMeasuredHeight();
        int k = leftMargin + paramInt4;
        int m = topMargin + paramInt3;
        localView.layout(k, m, i + k, j + m);
      }
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    m();
    measureChildWithMargins(d, paramInt1, 0, paramInt2, 0);
    Object localObject1 = (e)d.getLayoutParams();
    int i = Math.max(0, d.getMeasuredWidth() + leftMargin + rightMargin);
    int j = Math.max(0, d.getMeasuredHeight() + topMargin + bottomMargin);
    int k = View.combineMeasuredStates(0, d.getMeasuredState());
    localObject1 = d0.a;
    if ((getWindowSystemUiVisibility() & 0x100) != 0) {
      m = 1;
    } else {
      m = 0;
    }
    if (m != 0)
    {
      n = a;
      i1 = n;
      if (q)
      {
        i1 = n;
        if (d.getTabContainer() != null) {
          i1 = n + a;
        }
      }
    }
    else if (d.getVisibility() != 8)
    {
      i1 = d.getMeasuredHeight();
    }
    else
    {
      i1 = 0;
    }
    x.set(v);
    Object localObject2 = y;
    A = ((s0)localObject2);
    if ((!p) && (m == 0))
    {
      localObject1 = x;
      top += i1;
      bottom += 0;
      localObject1 = a.h(0, i1, 0, 0);
    }
    else
    {
      localObject2 = b.a(a.g().a, A.a.g().b + i1, A.a.g().c, A.a.g().d + 0);
      localObject1 = A;
      i1 = Build.VERSION.SDK_INT;
      if (i1 >= 30) {
        localObject1 = new s0.d((s0)localObject1);
      } else if (i1 >= 29) {
        localObject1 = new s0.c((s0)localObject1);
      } else {
        localObject1 = new s0.b((s0)localObject1);
      }
      ((s0.e)localObject1).d((b)localObject2);
      localObject1 = ((s0.e)localObject1).b();
    }
    A = ((s0)localObject1);
    j(c, x, true);
    if (!B.equals(A))
    {
      localObject2 = A;
      B = ((s0)localObject2);
      localObject1 = c;
      localObject2 = ((s0)localObject2).b();
      if (localObject2 != null)
      {
        WindowInsets localWindowInsets = d0.c.a((View)localObject1, (WindowInsets)localObject2);
        if (!localWindowInsets.equals(localObject2)) {
          s0.c(localWindowInsets, (View)localObject1);
        }
      }
    }
    measureChildWithMargins(c, paramInt1, 0, paramInt2, 0);
    localObject1 = (e)c.getLayoutParams();
    int i1 = Math.max(i, c.getMeasuredWidth() + leftMargin + rightMargin);
    int n = Math.max(j, c.getMeasuredHeight() + topMargin + bottomMargin);
    j = View.combineMeasuredStates(k, c.getMeasuredState());
    int m = getPaddingLeft();
    k = getPaddingRight();
    i = getPaddingTop();
    n = Math.max(getPaddingBottom() + i + n, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(k + m + i1, getSuggestedMinimumWidth()), paramInt1, j), View.resolveSizeAndState(n, paramInt2, j << 16));
  }
  
  public final boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool = r;
    int i = 0;
    if ((bool) && (paramBoolean))
    {
      D.fling(0, 0, 0, (int)paramFloat2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
      if (D.getFinalY() > d.getHeight()) {
        i = 1;
      }
      if (i != 0)
      {
        k();
        H.run();
      }
      else
      {
        k();
        G.run();
      }
      s = true;
      return true;
    }
    return false;
  }
  
  public final boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public final void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public final void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (paramInt3 == 0) {
      onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = t + paramInt2;
    t = paramInt1;
    setActionBarHideOffset(paramInt1);
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public final void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    I.a = paramInt;
    t = getActionBarHideOffset();
    k();
    paramView1 = C;
    if (paramView1 != null)
    {
      paramView1 = (x)paramView1;
      paramView2 = u;
      if (paramView2 != null)
      {
        paramView2.a();
        u = null;
      }
    }
  }
  
  public final void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      onNestedScrollAccepted(paramView1, paramView2, paramInt1);
    }
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) != 0) && (d.getVisibility() == 0)) {
      return r;
    }
    return false;
  }
  
  public final boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt2 == 0) && (onStartNestedScroll(paramView1, paramView2, paramInt1))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void onStopNestedScroll(View paramView)
  {
    if ((r) && (!s)) {
      if (t <= d.getHeight())
      {
        k();
        postDelayed(G, 600L);
      }
      else
      {
        k();
        postDelayed(H, 600L);
      }
    }
  }
  
  public final void onStopNestedScroll(View paramView, int paramInt)
  {
    if (paramInt == 0) {
      onStopNestedScroll(paramView);
    }
  }
  
  @Deprecated
  public final void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    super.onWindowSystemUiVisibilityChanged(paramInt);
    m();
    int i = u;
    u = paramInt;
    int j;
    if ((paramInt & 0x4) == 0) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if ((paramInt & 0x100) != 0) {
      k = 1;
    } else {
      k = 0;
    }
    Object localObject = C;
    if (localObject != null)
    {
      p = (k ^ 0x1);
      if ((j == 0) && (k != 0))
      {
        localObject = (x)localObject;
        if (!r)
        {
          r = true;
          ((x)localObject).y(true);
        }
      }
      else
      {
        localObject = (x)localObject;
        if (r)
        {
          r = false;
          ((x)localObject).y(true);
        }
      }
    }
    if ((((i ^ paramInt) & 0x100) != 0) && (C != null))
    {
      localObject = d0.a;
      d0.c.c(this);
    }
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    b = paramInt;
    d locald = C;
    if (locald != null) {
      o = paramInt;
    }
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    k();
    paramInt = Math.max(0, Math.min(paramInt, d.getHeight()));
    d.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(d paramd)
  {
    C = paramd;
    if (getWindowToken() != null)
    {
      paramd = C;
      int i = b;
      o = i;
      i = u;
      if (i != 0)
      {
        onWindowSystemUiVisibilityChanged(i);
        paramd = d0.a;
        d0.c.c(this);
      }
    }
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    q = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != r)
    {
      r = paramBoolean;
      if (!paramBoolean)
      {
        k();
        setActionBarHideOffset(0);
      }
    }
  }
  
  public void setIcon(int paramInt)
  {
    m();
    e.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    m();
    e.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    m();
    e.m(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean)
  {
    p = paramBoolean;
    if ((paramBoolean) && (getContextgetApplicationInfotargetSdkVersion < 19)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    o = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    m();
    e.setWindowCallback(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    m();
    e.setWindowTitle(paramCharSequence);
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public final class a
    extends AnimatorListenerAdapter
  {
    public a() {}
    
    public final void onAnimationCancel(Animator paramAnimator)
    {
      paramAnimator = ActionBarOverlayLayout.this;
      E = null;
      s = false;
    }
    
    public final void onAnimationEnd(Animator paramAnimator)
    {
      paramAnimator = ActionBarOverlayLayout.this;
      E = null;
      s = false;
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      k();
      ActionBarOverlayLayout localActionBarOverlayLayout = ActionBarOverlayLayout.this;
      E = d.animate().translationY(0.0F).setListener(F);
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      k();
      ActionBarOverlayLayout localActionBarOverlayLayout = ActionBarOverlayLayout.this;
      E = d.animate().translationY(-d.getHeight()).setListener(F);
    }
  }
  
  public static abstract interface d {}
  
  public static final class e
    extends ViewGroup.MarginLayoutParams
  {
    public e()
    {
      super(-1);
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