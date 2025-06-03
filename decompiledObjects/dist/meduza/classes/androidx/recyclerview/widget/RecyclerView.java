package androidx.recyclerview.widget;

import a0.j;
import a0.n;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b.a0;
import e0.d0;
import e0.d0.d;
import e0.d0.f;
import e0.j0;
import e0.j0.a;
import f;
import g;
import j0.d.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r.h;

public class RecyclerView
  extends ViewGroup
{
  public static final int[] s0 = { 16843830 };
  public static final Class<?>[] t0;
  public static final b u0 = new b();
  public boolean A;
  public boolean B;
  public boolean C;
  public int D;
  public final AccessibilityManager E;
  public boolean F;
  public boolean G;
  public int H;
  public int I;
  public f J;
  public EdgeEffect K;
  public EdgeEffect L;
  public EdgeEffect M;
  public EdgeEffect N;
  public g O;
  public int P;
  public int Q;
  public VelocityTracker R;
  public int S;
  public int T;
  public int U;
  public int V;
  public int W;
  public final p a = new p();
  public final int a0;
  public r b;
  public final int b0;
  public a c;
  public float c0;
  public b d;
  public float d0;
  public final q e = new q();
  public boolean e0;
  public boolean f;
  public final u f0;
  public e g0;
  public e.b h0;
  public final s i0;
  public ArrayList j0;
  public h k0;
  public m l0;
  public e0.p m0;
  public final int[] n0;
  public final Rect o = new Rect();
  public final int[] o0;
  public final Rect p = new Rect();
  public final int[] p0;
  public j q;
  public final ArrayList q0;
  public q r;
  public a r0;
  public final ArrayList s;
  public final ArrayList<i> t;
  public final ArrayList<m> u;
  public m v;
  public boolean w;
  public boolean x;
  public boolean y;
  public int z;
  
  static
  {
    Class localClass = Integer.TYPE;
    t0 = new Class[] { Context.class, AttributeSet.class, localClass, localClass };
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968819);
    new RectF();
    s = new ArrayList();
    t = new ArrayList();
    u = new ArrayList();
    z = 0;
    F = false;
    G = false;
    H = 0;
    I = 0;
    J = new f();
    O = new c();
    P = 0;
    Q = -1;
    c0 = Float.MIN_VALUE;
    d0 = Float.MIN_VALUE;
    e0 = true;
    f0 = new u();
    h0 = new e.b();
    i0 = new s();
    k0 = new h();
    n0 = new int[2];
    o0 = new int[2];
    p0 = new int[2];
    q0 = new ArrayList();
    r0 = new a();
    new c();
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    Object localObject1 = ViewConfiguration.get(paramContext);
    W = ((ViewConfiguration)localObject1).getScaledTouchSlop();
    int i = Build.VERSION.SDK_INT;
    float f1;
    if (i >= 26)
    {
      localObject2 = j0.a;
      f1 = j0.a.a((ViewConfiguration)localObject1);
    }
    else
    {
      f1 = j0.a((ViewConfiguration)localObject1, paramContext);
    }
    c0 = f1;
    if (i >= 26) {
      f1 = j0.a.b((ViewConfiguration)localObject1);
    } else {
      f1 = j0.a((ViewConfiguration)localObject1, paramContext);
    }
    d0 = f1;
    a0 = ((ViewConfiguration)localObject1).getScaledMinimumFlingVelocity();
    b0 = ((ViewConfiguration)localObject1).getScaledMaximumFlingVelocity();
    if (getOverScrollMode() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    setWillNotDraw(bool);
    O.a = k0;
    c = new a(new l(this));
    d = new b(new k(this));
    localObject1 = d0.a;
    int j;
    if (i >= 26) {
      j = d0.f.c(this);
    } else {
      j = 0;
    }
    if ((j == 0) && (i >= 26)) {
      d0.f.m(this, 8);
    }
    if (getImportantForAccessibility() == 0) {
      setImportantForAccessibility(1);
    }
    E = ((AccessibilityManager)getContext().getSystemService("accessibility"));
    setAccessibilityDelegateCompat(new m(this));
    Object localObject2 = a0.Q;
    localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, 2130968819, 0);
    d0.g(this, paramContext, (int[])localObject2, paramAttributeSet, (TypedArray)localObject1, 2130968819);
    String str = ((TypedArray)localObject1).getString(8);
    if (((TypedArray)localObject1).getInt(2, -1) == -1) {
      setDescendantFocusability(262144);
    }
    f = ((TypedArray)localObject1).getBoolean(1, true);
    Object localObject4;
    Object localObject5;
    if (((TypedArray)localObject1).getBoolean(3, false))
    {
      localObject4 = (StateListDrawable)((TypedArray)localObject1).getDrawable(6);
      localObject2 = ((TypedArray)localObject1).getDrawable(7);
      localObject5 = (StateListDrawable)((TypedArray)localObject1).getDrawable(4);
      Drawable localDrawable = ((TypedArray)localObject1).getDrawable(5);
      if ((localObject4 != null) && (localObject2 != null) && (localObject5 != null) && (localDrawable != null))
      {
        Resources localResources = getContext().getResources();
        new d(this, (StateListDrawable)localObject4, (Drawable)localObject2, (StateListDrawable)localObject5, localDrawable, localResources.getDimensionPixelSize(2131165311), localResources.getDimensionPixelSize(2131165313), localResources.getDimensionPixelOffset(2131165312));
      }
      else
      {
        paramContext = f.l("Trying to set fast scroller without both required drawables.");
        paramContext.append(l());
        throw new IllegalArgumentException(paramContext.toString());
      }
    }
    ((TypedArray)localObject1).recycle();
    if (str != null)
    {
      localObject2 = str.trim();
      if (!((String)localObject2).isEmpty())
      {
        if (((String)localObject2).charAt(0) == '.')
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(paramContext.getPackageName());
        }
        else if (!((String)localObject2).contains(".")) {}
        for (localObject1 = localObject2;; localObject1 = ((StringBuilder)localObject1).toString())
        {
          break;
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(RecyclerView.class.getPackage().getName());
          ((StringBuilder)localObject1).append('.');
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        try
        {
          if (isInEditMode()) {
            localObject2 = getClass().getClassLoader();
          } else {
            localObject2 = paramContext.getClassLoader();
          }
          localObject5 = Class.forName((String)localObject1, false, (ClassLoader)localObject2).asSubclass(j.class);
          localObject4 = null;
          try
          {
            localObject2 = ((Class)localObject5).getConstructor(t0);
            localObject4 = new Object[] { paramContext, paramAttributeSet, Integer.valueOf(2130968819), Integer.valueOf(0) };
          }
          catch (NoSuchMethodException localNoSuchMethodException) {}
          try
          {
            localObject2 = ((Class)localObject5).getConstructor(new Class[0]);
            ((AccessibleObject)localObject2).setAccessible(true);
            setLayoutManager((j)((Constructor)localObject2).newInstance((Object[])localObject4));
          }
          catch (NoSuchMethodException paramContext)
          {
            paramContext.initCause(localNoSuchMethodException);
            localObject2 = new java/lang/IllegalStateException;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append(paramAttributeSet.getPositionDescription());
            ((StringBuilder)localObject4).append(": Error creating LayoutManager ");
            ((StringBuilder)localObject4).append((String)localObject1);
            ((IllegalStateException)localObject2).<init>(((StringBuilder)localObject4).toString(), paramContext);
            throw ((Throwable)localObject2);
          }
          localObject1 = s0;
        }
        catch (ClassCastException localClassCastException)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Class is not a LayoutManager ");
          paramContext.append((String)localObject1);
          throw new IllegalStateException(paramContext.toString(), localClassCastException);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          paramContext = new StringBuilder();
          paramContext.append(paramAttributeSet.getPositionDescription());
          paramContext.append(": Cannot access non-public constructor ");
          paramContext.append((String)localObject1);
          throw new IllegalStateException(paramContext.toString(), localIllegalAccessException);
        }
        catch (InstantiationException paramContext)
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append(paramAttributeSet.getPositionDescription());
          ((StringBuilder)localObject3).append(": Could not instantiate the LayoutManager: ");
          ((StringBuilder)localObject3).append((String)localObject1);
          throw new IllegalStateException(((StringBuilder)localObject3).toString(), paramContext);
        }
        catch (InvocationTargetException paramContext)
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append(paramAttributeSet.getPositionDescription());
          ((StringBuilder)localObject3).append(": Could not instantiate the LayoutManager: ");
          ((StringBuilder)localObject3).append((String)localObject1);
          throw new IllegalStateException(((StringBuilder)localObject3).toString(), paramContext);
        }
        catch (ClassNotFoundException paramContext)
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append(paramAttributeSet.getPositionDescription());
          ((StringBuilder)localObject3).append(": Unable to find LayoutManager ");
          ((StringBuilder)localObject3).append((String)localObject1);
          throw new IllegalStateException(((StringBuilder)localObject3).toString(), paramContext);
        }
      }
    }
    Object localObject3 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, 2130968819, 0);
    d0.g(this, paramContext, (int[])localObject1, paramAttributeSet, (TypedArray)localObject3, 2130968819);
    boolean bool = ((TypedArray)localObject3).getBoolean(0, true);
    ((TypedArray)localObject3).recycle();
    setNestedScrollingEnabled(bool);
  }
  
  private e0.p getScrollingChildHelper()
  {
    if (m0 == null) {
      m0 = new e0.p(this);
    }
    return m0;
  }
  
  public static v p(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    ((k)paramView.getLayoutParams()).getClass();
    return null;
  }
  
  public final void A(int paramInt)
  {
    getScrollingChildHelper().h(paramInt);
  }
  
  public final void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    j localj = q;
    if (localj != null) {
      localj.getClass();
    }
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }
  
  public final void b(String paramString)
  {
    int i;
    if (H > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (paramString == null)
      {
        paramString = f.l("Cannot call this method while RecyclerView is computing a layout or scrolling");
        paramString.append(l());
        throw new IllegalStateException(paramString.toString());
      }
      throw new IllegalStateException(paramString);
    }
    if (I > 0)
    {
      paramString = f.l("");
      paramString.append(l());
      Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(paramString.toString()));
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    Object localObject = K;
    if ((localObject != null) && (!((EdgeEffect)localObject).isFinished()) && (paramInt1 > 0))
    {
      K.onRelease();
      bool1 = K.isFinished();
    }
    else
    {
      bool1 = false;
    }
    localObject = M;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (!((EdgeEffect)localObject).isFinished())
      {
        bool2 = bool1;
        if (paramInt1 < 0)
        {
          M.onRelease();
          bool2 = bool1 | M.isFinished();
        }
      }
    }
    localObject = L;
    boolean bool1 = bool2;
    if (localObject != null)
    {
      bool1 = bool2;
      if (!((EdgeEffect)localObject).isFinished())
      {
        bool1 = bool2;
        if (paramInt2 > 0)
        {
          L.onRelease();
          bool1 = bool2 | L.isFinished();
        }
      }
    }
    localObject = N;
    bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (!((EdgeEffect)localObject).isFinished())
      {
        bool2 = bool1;
        if (paramInt2 < 0)
        {
          N.onRelease();
          bool2 = bool1 | N.isFinished();
        }
      }
    }
    if (bool2)
    {
      localObject = d0.a;
      postInvalidateOnAnimation();
    }
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof k)) && (q.d((k)paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int computeHorizontalScrollExtent()
  {
    j localj = q;
    int i = 0;
    if (localj == null) {
      return 0;
    }
    if (localj.b()) {
      i = q.f(i0);
    }
    return i;
  }
  
  public final int computeHorizontalScrollOffset()
  {
    j localj = q;
    if (localj == null) {
      return 0;
    }
    if (localj.b()) {
      q.g(i0);
    }
    return 0;
  }
  
  public final int computeHorizontalScrollRange()
  {
    j localj = q;
    int i = 0;
    if (localj == null) {
      return 0;
    }
    if (localj.b()) {
      i = q.h(i0);
    }
    return i;
  }
  
  public final int computeVerticalScrollExtent()
  {
    j localj = q;
    int i = 0;
    if (localj == null) {
      return 0;
    }
    if (localj.c()) {
      i = q.i(i0);
    }
    return i;
  }
  
  public final int computeVerticalScrollOffset()
  {
    j localj = q;
    if (localj == null) {
      return 0;
    }
    if (localj.c()) {
      q.j(i0);
    }
    return 0;
  }
  
  public final int computeVerticalScrollRange()
  {
    j localj = q;
    int i = 0;
    if (localj == null) {
      return 0;
    }
    if (localj.c()) {
      i = q.k(i0);
    }
    return i;
  }
  
  public final void d()
  {
    if ((y) && (!F))
    {
      i = c.b.size();
      int j = 1;
      if (i > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        return;
      }
      c.getClass();
      if (c.b.size() > 0) {
        i = j;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        i = n.a;
        Trace.beginSection("RV FullInvalidate");
        Log.w("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
      }
      return;
    }
    int i = n.a;
    Trace.beginSection("RV FullInvalidate");
    Log.w("RecyclerView", "No adapter attached; skipping layout");
    Trace.endSection();
  }
  
  public final boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public final boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return getScrollingChildHelper().b(paramFloat1, paramFloat2);
  }
  
  public final boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return getScrollingChildHelper().c(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public final boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return getScrollingChildHelper().e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0, null);
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    onPopulateAccessibilityEvent(paramAccessibilityEvent);
    return true;
  }
  
  public final void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  public final void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = t.size();
    int j = 0;
    for (int k = 0; k < i; k++) {
      ((i)t.get(k)).d(paramCanvas);
    }
    EdgeEffect localEdgeEffect = K;
    int m = 1;
    int n;
    if ((localEdgeEffect != null) && (!localEdgeEffect.isFinished()))
    {
      n = paramCanvas.save();
      if (f) {
        k = getPaddingBottom();
      } else {
        k = 0;
      }
      paramCanvas.rotate(270.0F);
      paramCanvas.translate(-getHeight() + k, 0.0F);
      localEdgeEffect = K;
      if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
        i = 1;
      } else {
        i = 0;
      }
      paramCanvas.restoreToCount(n);
    }
    else
    {
      i = 0;
    }
    localEdgeEffect = L;
    k = i;
    if (localEdgeEffect != null)
    {
      k = i;
      if (!localEdgeEffect.isFinished())
      {
        n = paramCanvas.save();
        if (f) {
          paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        }
        localEdgeEffect = L;
        if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
          k = 1;
        } else {
          k = 0;
        }
        k = i | k;
        paramCanvas.restoreToCount(n);
      }
    }
    localEdgeEffect = M;
    i = k;
    if (localEdgeEffect != null)
    {
      i = k;
      if (!localEdgeEffect.isFinished())
      {
        n = paramCanvas.save();
        int i1 = getWidth();
        if (f) {
          i = getPaddingTop();
        } else {
          i = 0;
        }
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(i, -i1);
        localEdgeEffect = M;
        if ((localEdgeEffect != null) && (localEdgeEffect.draw(paramCanvas))) {
          i = 1;
        } else {
          i = 0;
        }
        i = k | i;
        paramCanvas.restoreToCount(n);
      }
    }
    localEdgeEffect = N;
    k = i;
    if (localEdgeEffect != null)
    {
      k = i;
      if (!localEdgeEffect.isFinished())
      {
        n = paramCanvas.save();
        paramCanvas.rotate(180.0F);
        float f1;
        float f2;
        if (f)
        {
          k = -getWidth();
          f1 = getPaddingRight() + k;
          k = -getHeight();
          f2 = getPaddingBottom() + k;
        }
        else
        {
          f1 = -getWidth();
          f2 = -getHeight();
        }
        paramCanvas.translate(f1, f2);
        localEdgeEffect = N;
        k = j;
        if (localEdgeEffect != null)
        {
          k = j;
          if (localEdgeEffect.draw(paramCanvas)) {
            k = 1;
          }
        }
        k = i | k;
        paramCanvas.restoreToCount(n);
      }
    }
    if ((k == 0) && (O != null) && (t.size() > 0) && (O.d())) {
      k = m;
    }
    if (k != 0)
    {
      paramCanvas = d0.a;
      postInvalidateOnAnimation();
    }
  }
  
  public final boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft();
    int j = getPaddingRight();
    WeakHashMap localWeakHashMap = d0.a;
    i = j.e(paramInt1, j + i, getMinimumWidth());
    paramInt1 = getPaddingTop();
    setMeasuredDimension(i, j.e(paramInt2, getPaddingBottom() + paramInt1, getMinimumHeight()));
  }
  
  public final boolean f(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return getScrollingChildHelper().c(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public final View focusSearch(View paramView, int paramInt)
  {
    q.getClass();
    View localView = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
    if ((localView != null) && (!localView.hasFocusable()))
    {
      if (getFocusedChild() == null) {
        return super.focusSearch(paramView, paramInt);
      }
      u(localView, null);
      return paramView;
    }
    int i = 0;
    int j = i;
    if (localView != null)
    {
      j = i;
      if (localView != this) {
        if (localView == paramView)
        {
          j = i;
        }
        else if (m(localView) == null)
        {
          j = i;
        }
        else
        {
          if ((paramView != null) && (m(paramView) != null))
          {
            o.set(0, 0, paramView.getWidth(), paramView.getHeight());
            p.set(0, 0, localView.getWidth(), localView.getHeight());
            offsetDescendantRectToMyCoords(paramView, o);
            offsetDescendantRectToMyCoords(localView, p);
            Object localObject1 = q.b;
            Object localObject2 = d0.a;
            int k = ((View)localObject1).getLayoutDirection();
            int m = -1;
            int n;
            if (k == 1) {
              n = -1;
            } else {
              n = 1;
            }
            localObject2 = o;
            int i1 = left;
            localObject1 = p;
            j = left;
            int i2;
            if (((i1 < j) || (right <= j)) && (right < right))
            {
              k = 1;
            }
            else
            {
              k = right;
              i2 = right;
              if (((k > i2) || (i1 >= i2)) && (i1 > j)) {
                k = -1;
              } else {
                k = 0;
              }
            }
            j = top;
            i1 = top;
            if (((j < i1) || (bottom <= i1)) && (bottom < bottom))
            {
              m = 1;
            }
            else
            {
              i2 = bottom;
              int i3 = bottom;
              if (((i2 <= i3) && (j < i3)) || (j <= i1)) {
                m = 0;
              }
            }
            if (paramInt != 1)
            {
              if (paramInt != 2)
              {
                if (paramInt != 17)
                {
                  if (paramInt != 33)
                  {
                    if (paramInt != 66)
                    {
                      if (paramInt == 130)
                      {
                        j = i;
                        if (m <= 0) {
                          break label588;
                        }
                      }
                      else
                      {
                        paramView = new StringBuilder();
                        paramView.append("Invalid direction: ");
                        paramView.append(paramInt);
                        paramView.append(l());
                        throw new IllegalArgumentException(paramView.toString());
                      }
                    }
                    else
                    {
                      j = i;
                      if (k <= 0) {
                        break label588;
                      }
                    }
                  }
                  else
                  {
                    j = i;
                    if (m >= 0) {
                      break label588;
                    }
                  }
                }
                else
                {
                  j = i;
                  if (k >= 0) {
                    break label588;
                  }
                }
              }
              else if (m <= 0)
              {
                j = i;
                if (m != 0) {
                  break label588;
                }
                j = i;
                if (k * n <= 0) {
                  break label588;
                }
              }
            }
            else if (m >= 0)
            {
              j = i;
              if (m != 0) {
                break label588;
              }
              j = i;
              if (k * n >= 0) {
                break label588;
              }
            }
          }
          j = 1;
        }
      }
    }
    label588:
    if (j != 0) {
      paramView = localView;
    } else {
      paramView = super.focusSearch(paramView, paramInt);
    }
    return paramView;
  }
  
  public final void g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2)
  {
    getScrollingChildHelper().e(0, 0, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfInt2);
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    Object localObject = q;
    if (localObject != null) {
      return ((j)localObject).l();
    }
    localObject = f.l("RecyclerView has no LayoutManager");
    ((StringBuilder)localObject).append(l());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    j localj = q;
    if (localj != null) {
      return localj.m(getContext(), paramAttributeSet);
    }
    paramAttributeSet = f.l("RecyclerView has no LayoutManager");
    paramAttributeSet.append(l());
    throw new IllegalStateException(paramAttributeSet.toString());
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    j localj = q;
    if (localj != null) {
      return localj.n(paramLayoutParams);
    }
    paramLayoutParams = f.l("RecyclerView has no LayoutManager");
    paramLayoutParams.append(l());
    throw new IllegalStateException(paramLayoutParams.toString());
  }
  
  public CharSequence getAccessibilityClassName()
  {
    return "androidx.recyclerview.widget.RecyclerView";
  }
  
  public d getAdapter()
  {
    return null;
  }
  
  public int getBaseline()
  {
    j localj = q;
    if (localj != null)
    {
      localj.getClass();
      return -1;
    }
    return super.getBaseline();
  }
  
  public final int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    return super.getChildDrawingOrder(paramInt1, paramInt2);
  }
  
  public boolean getClipToPadding()
  {
    return f;
  }
  
  public m getCompatAccessibilityDelegate()
  {
    return l0;
  }
  
  public f getEdgeEffectFactory()
  {
    return J;
  }
  
  public g getItemAnimator()
  {
    return O;
  }
  
  public int getItemDecorationCount()
  {
    return t.size();
  }
  
  public j getLayoutManager()
  {
    return q;
  }
  
  public int getMaxFlingVelocity()
  {
    return b0;
  }
  
  public int getMinFlingVelocity()
  {
    return a0;
  }
  
  public long getNanoTime()
  {
    return System.nanoTime();
  }
  
  public l getOnFlingListener()
  {
    return null;
  }
  
  public boolean getPreserveFocusAfterLayout()
  {
    return e0;
  }
  
  public o getRecycledViewPool()
  {
    p localp = a;
    if (g == null) {
      g = new o();
    }
    return g;
  }
  
  public int getScrollState()
  {
    return P;
  }
  
  public final void h()
  {
    if (N != null) {
      return;
    }
    J.getClass();
    EdgeEffect localEdgeEffect = new EdgeEffect(getContext());
    N = localEdgeEffect;
    int i;
    int j;
    if (f)
    {
      i = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      j = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    }
    else
    {
      i = getMeasuredWidth();
      j = getMeasuredHeight();
    }
    localEdgeEffect.setSize(i, j);
  }
  
  public final boolean hasNestedScrollingParent()
  {
    e0.p localp = getScrollingChildHelper();
    boolean bool = false;
    if (localp.f(0) != null) {
      bool = true;
    }
    return bool;
  }
  
  public final void i()
  {
    if (K != null) {
      return;
    }
    J.getClass();
    EdgeEffect localEdgeEffect = new EdgeEffect(getContext());
    K = localEdgeEffect;
    int i;
    int j;
    if (f)
    {
      i = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
      j = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }
    else
    {
      i = getMeasuredHeight();
      j = getMeasuredWidth();
    }
    localEdgeEffect.setSize(i, j);
  }
  
  public final boolean isAttachedToWindow()
  {
    return w;
  }
  
  public final boolean isLayoutSuppressed()
  {
    return B;
  }
  
  public final boolean isNestedScrollingEnabled()
  {
    return getScrollingChildHelperd;
  }
  
  public final void j()
  {
    if (M != null) {
      return;
    }
    J.getClass();
    EdgeEffect localEdgeEffect = new EdgeEffect(getContext());
    M = localEdgeEffect;
    int i;
    int j;
    if (f)
    {
      i = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
      j = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }
    else
    {
      i = getMeasuredHeight();
      j = getMeasuredWidth();
    }
    localEdgeEffect.setSize(i, j);
  }
  
  public final void k()
  {
    if (L != null) {
      return;
    }
    J.getClass();
    EdgeEffect localEdgeEffect = new EdgeEffect(getContext());
    L = localEdgeEffect;
    int i;
    int j;
    if (f)
    {
      i = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
      j = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    }
    else
    {
      i = getMeasuredWidth();
      j = getMeasuredHeight();
    }
    localEdgeEffect.setSize(i, j);
  }
  
  public final String l()
  {
    StringBuilder localStringBuilder = f.l(" ");
    localStringBuilder.append(super.toString());
    localStringBuilder.append(", adapter:");
    localStringBuilder.append(null);
    localStringBuilder.append(", layout:");
    localStringBuilder.append(q);
    localStringBuilder.append(", context:");
    localStringBuilder.append(getContext());
    return localStringBuilder.toString();
  }
  
  public final View m(View paramView)
  {
    ViewParent localViewParent;
    for (;;)
    {
      localViewParent = paramView.getParent();
      if ((localViewParent == null) || (localViewParent == this) || (!(localViewParent instanceof View))) {
        break;
      }
      paramView = (View)localViewParent;
    }
    if (localViewParent != this) {
      paramView = null;
    }
    return paramView;
  }
  
  public final boolean n(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = u.size();
    for (int k = 0; k < j; k++)
    {
      m localm = (m)u.get(k);
      if ((localm.c(paramMotionEvent)) && (i != 3))
      {
        v = localm;
        return true;
      }
    }
    return false;
  }
  
  public final int o(v paramv)
  {
    int i = f;
    int j = 0;
    int k = 1;
    int m;
    if ((i & 0x20C) != 0) {
      m = 1;
    } else {
      m = 0;
    }
    if (m == 0)
    {
      if ((i & 0x1) != 0) {
        m = k;
      } else {
        m = 0;
      }
      if (m != 0)
      {
        a locala = c;
        k = a;
        i = b.size();
        for (m = j;; m++)
        {
          j = k;
          if (m >= i) {
            break;
          }
          ((a.a)b.get(m)).getClass();
        }
      }
    }
    j = -1;
    return j;
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    boolean bool1 = false;
    H = 0;
    w = true;
    boolean bool2 = bool1;
    if (y)
    {
      bool2 = bool1;
      if (!isLayoutRequested()) {
        bool2 = true;
      }
    }
    y = bool2;
    Object localObject1 = q;
    if (localObject1 != null) {
      e = true;
    }
    localObject1 = e.e;
    Object localObject2 = (e)((ThreadLocal)localObject1).get();
    g0 = ((e)localObject2);
    if (localObject2 == null)
    {
      g0 = new e();
      localObject2 = d0.a;
      localObject2 = getDisplay();
      float f1 = 60.0F;
      float f2 = f1;
      if (!isInEditMode())
      {
        f2 = f1;
        if (localObject2 != null)
        {
          float f3 = ((Display)localObject2).getRefreshRate();
          f2 = f1;
          if (f3 >= 30.0F) {
            f2 = f3;
          }
        }
      }
      localObject2 = g0;
      c = ((1.0E9F / f2));
      ((ThreadLocal)localObject1).set(localObject2);
    }
    g0.a.add(this);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = O;
    if (localObject != null) {
      ((g)localObject).c();
    }
    setScrollState(0);
    localObject = f0;
    o.removeCallbacks((Runnable)localObject);
    c.abortAnimation();
    w = false;
    localObject = q;
    if (localObject != null)
    {
      e = false;
      ((j)localObject).B(this);
    }
    q0.clear();
    removeCallbacks(r0);
    e.getClass();
    while (q.a.a.a() != null) {}
    localObject = g0;
    if (localObject != null)
    {
      a.remove(this);
      g0 = null;
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = t.size();
    for (int j = 0; j < i; j++) {
      ((i)t.get(j)).getClass();
    }
  }
  
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (q == null) {
      return false;
    }
    if (B) {
      return false;
    }
    if (paramMotionEvent.getAction() == 8)
    {
      if ((paramMotionEvent.getSource() & 0x2) != 0)
      {
        if (q.c()) {
          f1 = -paramMotionEvent.getAxisValue(9);
        } else {
          f1 = 0.0F;
        }
        f2 = f1;
        if (q.b())
        {
          f2 = paramMotionEvent.getAxisValue(10);
          break label142;
        }
      }
      else
      {
        if ((paramMotionEvent.getSource() & 0x400000) == 0) {
          break label138;
        }
        f2 = paramMotionEvent.getAxisValue(26);
        if (!q.c()) {
          break label123;
        }
        f2 = -f2;
      }
      float f3 = 0.0F;
      float f1 = f2;
      float f2 = f3;
      break label142;
      label123:
      if (q.b())
      {
        f1 = 0.0F;
      }
      else
      {
        label138:
        f1 = 0.0F;
        f2 = f1;
      }
      label142:
      if ((f1 != 0.0F) || (f2 != 0.0F))
      {
        int i = (int)(f2 * c0);
        int j = (int)(f1 * d0);
        j localj = q;
        if (localj == null)
        {
          Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        }
        else if (!B)
        {
          int[] arrayOfInt = p0;
          arrayOfInt[0] = 0;
          arrayOfInt[1] = 0;
          int k = localj.b();
          boolean bool = q.c();
          if (bool) {
            m = k | 0x2;
          } else {
            m = k;
          }
          getScrollingChildHelper().g(m, 1);
          int n;
          if (k != 0) {
            n = i;
          } else {
            n = 0;
          }
          int i1;
          if (bool) {
            i1 = j;
          } else {
            i1 = 0;
          }
          int i2 = j;
          int m = i;
          if (f(n, i1, p0, n0, 1))
          {
            arrayOfInt = p0;
            m = i - arrayOfInt[0];
            i2 = j - arrayOfInt[1];
          }
          if (k != 0) {
            j = m;
          } else {
            j = 0;
          }
          if (bool) {
            i = i2;
          } else {
            i = 0;
          }
          w(j, i, paramMotionEvent, 1);
          paramMotionEvent = g0;
          if ((paramMotionEvent != null) && ((m != 0) || (i2 != 0))) {
            paramMotionEvent.a(this, m, i2);
          }
          A(1);
        }
      }
    }
    return false;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = B;
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    v = null;
    if (n(paramMotionEvent))
    {
      v();
      setScrollState(0);
      return true;
    }
    j localj = q;
    if (localj == null) {
      return false;
    }
    boolean bool3 = localj.b();
    bool1 = q.c();
    if (R == null) {
      R = VelocityTracker.obtain();
    }
    R.addMovement(paramMotionEvent);
    int j = paramMotionEvent.getActionMasked();
    int k = paramMotionEvent.getActionIndex();
    int i;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 5)
            {
              if (j == 6) {
                t(paramMotionEvent);
              }
            }
            else
            {
              Q = paramMotionEvent.getPointerId(k);
              i = (int)(paramMotionEvent.getX(k) + 0.5F);
              U = i;
              S = i;
              k = (int)(paramMotionEvent.getY(k) + 0.5F);
              V = k;
              T = k;
            }
          }
          else
          {
            v();
            setScrollState(0);
          }
        }
        else
        {
          j = paramMotionEvent.findPointerIndex(Q);
          if (j < 0)
          {
            paramMotionEvent = f.l("Error processing scroll; pointer index for id ");
            paramMotionEvent.append(Q);
            paramMotionEvent.append(" not found. Did any MotionEvents get skipped?");
            Log.e("RecyclerView", paramMotionEvent.toString());
            return false;
          }
          k = (int)(paramMotionEvent.getX(j) + 0.5F);
          j = (int)(paramMotionEvent.getY(j) + 0.5F);
          if (P != 1)
          {
            int m = S;
            int n = T;
            if ((i != 0) && (Math.abs(k - m) > W))
            {
              U = k;
              k = 1;
            }
            else
            {
              k = 0;
            }
            i = k;
            if (bool1)
            {
              i = k;
              if (Math.abs(j - n) > W)
              {
                V = j;
                i = 1;
              }
            }
            if (i != 0) {
              setScrollState(1);
            }
          }
        }
      }
      else
      {
        R.clear();
        A(0);
      }
    }
    else
    {
      if (C) {
        C = false;
      }
      Q = paramMotionEvent.getPointerId(0);
      k = (int)(paramMotionEvent.getX() + 0.5F);
      U = k;
      S = k;
      k = (int)(paramMotionEvent.getY() + 0.5F);
      V = k;
      T = k;
      if (P == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
        A(1);
      }
      paramMotionEvent = o0;
      paramMotionEvent[1] = 0;
      paramMotionEvent[0] = 0;
      k = i;
      if (bool1) {
        k = i | 0x2;
      }
      getScrollingChildHelper().g(k, 0);
    }
    if (P == 1) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = n.a;
    Trace.beginSection("RV OnLayout");
    Log.w("RecyclerView", "No adapter attached; skipping layout");
    Trace.endSection();
    y = true;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = q;
    if (localObject == null)
    {
      e(paramInt1, paramInt2);
      return;
    }
    if (((j)localObject).z())
    {
      View.MeasureSpec.getMode(paramInt1);
      View.MeasureSpec.getMode(paramInt2);
      q.b.e(paramInt1, paramInt2);
      return;
    }
    if (x)
    {
      q.b.e(paramInt1, paramInt2);
      return;
    }
    localObject = i0;
    if (f)
    {
      setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
      return;
    }
    localObject.getClass();
    y();
    q.b.e(paramInt1, paramInt2);
    z(false);
    i0.d = false;
  }
  
  public final boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i;
    if (H > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return false;
    }
    return super.onRequestFocusInDescendants(paramInt, paramRect);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof r))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (r)paramParcelable;
    b = paramParcelable;
    super.onRestoreInstanceState(a);
    requestLayout();
  }
  
  public final Parcelable onSaveInstanceState()
  {
    r localr = new r(super.onSaveInstanceState());
    Object localObject = b;
    if (localObject != null)
    {
      c = c;
    }
    else
    {
      localObject = q;
      if (localObject != null) {
        localObject = ((j)localObject).D();
      } else {
        localObject = null;
      }
      c = ((Parcelable)localObject);
    }
    return localr;
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
    {
      N = null;
      L = null;
      M = null;
      K = null;
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = B;
    int i = 0;
    if ((!bool1) && (!C))
    {
      Object localObject1 = v;
      if (localObject1 == null)
      {
        if (paramMotionEvent.getAction() == 0) {
          bool1 = false;
        } else {
          bool1 = n(paramMotionEvent);
        }
      }
      else
      {
        ((m)localObject1).a(paramMotionEvent);
        j = paramMotionEvent.getAction();
        if ((j == 3) || (j == 1)) {
          v = null;
        }
        bool1 = true;
      }
      if (bool1)
      {
        v();
        setScrollState(0);
        return true;
      }
      localObject1 = q;
      if (localObject1 == null) {
        return false;
      }
      int k = ((j)localObject1).b();
      bool1 = q.c();
      if (R == null) {
        R = VelocityTracker.obtain();
      }
      int m = paramMotionEvent.getActionMasked();
      int j = paramMotionEvent.getActionIndex();
      if (m == 0)
      {
        localObject1 = o0;
        localObject1[1] = 0;
        localObject1[0] = 0;
      }
      localObject1 = MotionEvent.obtain(paramMotionEvent);
      Object localObject2 = o0;
      ((MotionEvent)localObject1).offsetLocation(localObject2[0], localObject2[1]);
      int n;
      if (m != 0)
      {
        int i5;
        label516:
        Object localObject3;
        if (m != 1)
        {
          if (m != 2)
          {
            if (m != 3)
            {
              if (m != 5)
              {
                if (m != 6)
                {
                  n = i;
                }
                else
                {
                  t(paramMotionEvent);
                  n = i;
                }
              }
              else
              {
                Q = paramMotionEvent.getPointerId(j);
                m = (int)(paramMotionEvent.getX(j) + 0.5F);
                U = m;
                S = m;
                j = (int)(paramMotionEvent.getY(j) + 0.5F);
                V = j;
                T = j;
                n = i;
              }
            }
            else
            {
              v();
              setScrollState(0);
              n = i;
            }
          }
          else
          {
            j = paramMotionEvent.findPointerIndex(Q);
            if (j < 0)
            {
              paramMotionEvent = f.l("Error processing scroll; pointer index for id ");
              paramMotionEvent.append(Q);
              paramMotionEvent.append(" not found. Did any MotionEvents get skipped?");
              Log.e("RecyclerView", paramMotionEvent.toString());
              return false;
            }
            int i1 = (int)(paramMotionEvent.getX(j) + 0.5F);
            int i2 = (int)(paramMotionEvent.getY(j) + 0.5F);
            j = U - i1;
            n = V - i2;
            m = j;
            int i3 = n;
            int i6;
            if (P != 1)
            {
              i5 = j;
              if (k != 0)
              {
                m = W;
                if (j > 0) {
                  j = Math.max(0, j - m);
                } else {
                  j = Math.min(0, j + m);
                }
                i5 = j;
                if (j != 0)
                {
                  m = 1;
                  break label516;
                }
              }
              m = 0;
              j = i5;
              i5 = n;
              i6 = m;
              if (bool1)
              {
                i5 = W;
                if (n > 0) {
                  i3 = Math.max(0, n - i5);
                } else {
                  i3 = Math.min(0, n + i5);
                }
                i5 = i3;
                i6 = m;
                if (i3 != 0)
                {
                  i6 = 1;
                  i5 = i3;
                }
              }
              m = j;
              i3 = i5;
              if (i6 != 0)
              {
                setScrollState(1);
                i3 = i5;
                m = j;
              }
            }
            i5 = m;
            n = i;
            if (P == 1)
            {
              localObject2 = p0;
              localObject2[0] = 0;
              localObject2[1] = 0;
              if (k != 0) {
                n = i5;
              } else {
                n = 0;
              }
              if (bool1) {
                i6 = i3;
              } else {
                i6 = 0;
              }
              m = i5;
              j = i3;
              if (f(n, i6, (int[])localObject2, n0, 0))
              {
                localObject2 = p0;
                m = i5 - localObject2[0];
                j = i3 - localObject2[1];
                localObject3 = o0;
                i5 = localObject3[0];
                localObject2 = n0;
                localObject3[0] = (i5 + localObject2[0]);
                localObject3[1] += localObject2[1];
                getParent().requestDisallowInterceptTouchEvent(true);
              }
              localObject2 = n0;
              U = (i1 - localObject2[0]);
              V = (i2 - localObject2[1]);
              if (k != 0) {
                i5 = m;
              } else {
                i5 = 0;
              }
              if (bool1) {
                i3 = j;
              } else {
                i3 = 0;
              }
              if (w(i5, i3, paramMotionEvent, 0)) {
                getParent().requestDisallowInterceptTouchEvent(true);
              }
              paramMotionEvent = g0;
              n = i;
              if (paramMotionEvent != null) {
                if (m == 0)
                {
                  n = i;
                  if (j == 0) {}
                }
                else
                {
                  paramMotionEvent.a(this, m, j);
                  n = i;
                }
              }
            }
          }
        }
        else
        {
          R.addMovement((MotionEvent)localObject1);
          R.computeCurrentVelocity(1000, b0);
          float f1;
          if (k != 0) {
            f1 = -R.getXVelocity(Q);
          } else {
            f1 = 0.0F;
          }
          float f2;
          if (bool1) {
            f2 = -R.getYVelocity(Q);
          } else {
            f2 = 0.0F;
          }
          if ((f1 != 0.0F) || (f2 != 0.0F))
          {
            m = (int)f1;
            i5 = (int)f2;
            paramMotionEvent = q;
            if (paramMotionEvent == null)
            {
              Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            }
            else if (!B)
            {
              int i4 = paramMotionEvent.b();
              boolean bool2 = q.c();
              if (i4 != 0)
              {
                j = m;
                if (Math.abs(m) >= a0) {}
              }
              else
              {
                j = 0;
              }
              if (bool2)
              {
                m = i5;
                if (Math.abs(i5) >= a0) {}
              }
              else
              {
                m = 0;
              }
              if ((j != 0) || (m != 0))
              {
                f1 = j;
                f2 = m;
                if (!dispatchNestedPreFling(f1, f2))
                {
                  if ((i4 == 0) && (!bool2)) {
                    bool1 = false;
                  } else {
                    bool1 = true;
                  }
                  dispatchNestedFling(f1, f2, bool1);
                  if (bool1)
                  {
                    i5 = i4;
                    if (bool2) {
                      i5 = i4 | 0x2;
                    }
                    getScrollingChildHelper().g(i5, 1);
                    i5 = b0;
                    j = Math.max(-i5, Math.min(j, i5));
                    i5 = b0;
                    m = Math.max(-i5, Math.min(m, i5));
                    paramMotionEvent = f0;
                    o.setScrollState(2);
                    b = 0;
                    a = 0;
                    localObject3 = d;
                    localObject2 = u0;
                    if (localObject3 != localObject2)
                    {
                      d = ((Interpolator)localObject2);
                      c = new OverScroller(o.getContext(), (Interpolator)localObject2);
                    }
                    c.fling(0, 0, j, m, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    if (e)
                    {
                      f = true;
                    }
                    else
                    {
                      o.removeCallbacks(paramMotionEvent);
                      localObject2 = o;
                      localObject3 = d0.a;
                      ((View)localObject2).postOnAnimation(paramMotionEvent);
                    }
                    j = 1;
                    break label1362;
                  }
                }
              }
            }
            j = 0;
            label1362:
            if (j != 0) {}
          }
          else
          {
            setScrollState(0);
          }
          v();
          n = 1;
        }
      }
      else
      {
        Q = paramMotionEvent.getPointerId(0);
        j = (int)(paramMotionEvent.getX() + 0.5F);
        U = j;
        S = j;
        j = (int)(paramMotionEvent.getY() + 0.5F);
        V = j;
        T = j;
        j = k;
        if (bool1) {
          j = k | 0x2;
        }
        getScrollingChildHelper().g(j, 0);
        n = i;
      }
      if (n == 0) {
        R.addMovement((MotionEvent)localObject1);
      }
      ((MotionEvent)localObject1).recycle();
      return true;
    }
    return false;
  }
  
  public final void q()
  {
    int i = d.e();
    for (int j = 0; j < i; j++) {
      d.d(j).getLayoutParams()).b = true;
    }
    p localp = a;
    if (c.size() <= 0) {
      return;
    }
    ((v)c.get(0)).getClass();
    throw null;
  }
  
  public final void r()
  {
    H += 1;
  }
  
  public final void removeDetachedView(View paramView, boolean paramBoolean)
  {
    p(paramView);
    paramView.clearAnimation();
    p(paramView);
    super.removeDetachedView(paramView, paramBoolean);
  }
  
  public final void requestChildFocus(View paramView1, View paramView2)
  {
    q.getClass();
    int i;
    if (H > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) && (paramView2 != null)) {
      u(paramView1, paramView2);
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public final boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return q.H(this, paramView, paramRect, paramBoolean, false);
  }
  
  public final void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i = u.size();
    for (int j = 0; j < i; j++) {
      ((m)u.get(j)).b();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public final void requestLayout()
  {
    if ((z == 0) && (!B)) {
      super.requestLayout();
    } else {
      A = true;
    }
  }
  
  public final void s(boolean paramBoolean)
  {
    int i = H;
    int j = 1;
    i--;
    H = i;
    if (i < 1)
    {
      H = 0;
      if (paramBoolean)
      {
        i = D;
        D = 0;
        if (i != 0)
        {
          Object localObject = E;
          if ((localObject == null) || (!((AccessibilityManager)localObject).isEnabled())) {
            j = 0;
          }
          if (j != 0)
          {
            localObject = AccessibilityEvent.obtain();
            ((AccessibilityEvent)localObject).setEventType(2048);
            ((AccessibilityEvent)localObject).setContentChangeTypes(i);
            sendAccessibilityEventUnchecked((AccessibilityEvent)localObject);
          }
        }
        j = q0.size() - 1;
        if (j < 0)
        {
          q0.clear();
        }
        else
        {
          ((v)q0.get(j)).getClass();
          throw null;
        }
      }
    }
  }
  
  public final void scrollBy(int paramInt1, int paramInt2)
  {
    j localj = q;
    if (localj == null)
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    if (B) {
      return;
    }
    boolean bool1 = localj.b();
    boolean bool2 = q.c();
    if ((bool1) || (bool2))
    {
      if (!bool1) {
        paramInt1 = 0;
      }
      if (!bool2) {
        paramInt2 = 0;
      }
      w(paramInt1, paramInt2, null, 0);
    }
  }
  
  public final void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public final void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = H;
    int j = 1;
    int k = 0;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (paramAccessibilityEvent != null) {
        i = paramAccessibilityEvent.getContentChangeTypes();
      } else {
        i = 0;
      }
      if (i == 0) {
        i = k;
      }
      D |= i;
      i = j;
    }
    else
    {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(m paramm)
  {
    l0 = paramm;
    d0.h(this, paramm);
  }
  
  public void setAdapter(d paramd)
  {
    int i = 0;
    setLayoutFrozen(false);
    paramd = O;
    if (paramd != null) {
      paramd.c();
    }
    paramd = q;
    if (paramd != null)
    {
      paramd.F(a);
      q.G(a);
    }
    paramd = a;
    a.clear();
    paramd.b();
    paramd = c;
    paramd.b(b);
    paramd.b(c);
    paramd = q;
    if (paramd != null) {
      paramd.A();
    }
    paramd = a;
    a.clear();
    paramd.b();
    if (g == null) {
      g = new o();
    }
    paramd = g;
    if (b == 0) {
      for (j = 0; j < a.size(); j++) {
        a.valueAt(j)).a.clear();
      }
    }
    i0.c = true;
    G |= false;
    F = true;
    int k = d.e();
    for (int j = 0; j < k; j++) {
      p(d.d(j));
    }
    q();
    p localp = a;
    k = c.size();
    for (j = i; j < k; j++)
    {
      paramd = (v)c.get(j);
      if (paramd != null)
      {
        paramd.b(6);
        paramd.a(null);
      }
    }
    h.getClass();
    localp.b();
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(e parame)
  {
    if (parame == null) {
      return;
    }
    boolean bool;
    if (parame != null) {
      bool = true;
    } else {
      bool = false;
    }
    setChildrenDrawingOrderEnabled(bool);
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != f)
    {
      N = null;
      L = null;
      M = null;
      K = null;
    }
    f = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (y) {
      requestLayout();
    }
  }
  
  public void setEdgeEffectFactory(f paramf)
  {
    paramf.getClass();
    J = paramf;
    N = null;
    L = null;
    M = null;
    K = null;
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    x = paramBoolean;
  }
  
  public void setItemAnimator(g paramg)
  {
    g localg = O;
    if (localg != null)
    {
      localg.c();
      O.a = null;
    }
    O = paramg;
    if (paramg != null) {
      a = k0;
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    p localp = a;
    e = paramInt;
    localp.g();
  }
  
  @Deprecated
  public void setLayoutFrozen(boolean paramBoolean)
  {
    suppressLayout(paramBoolean);
  }
  
  public void setLayoutManager(j paramj)
  {
    if (paramj == q) {
      return;
    }
    int i = 0;
    setScrollState(0);
    Object localObject1 = f0;
    o.removeCallbacks((Runnable)localObject1);
    c.abortAnimation();
    if (q != null)
    {
      localObject1 = O;
      if (localObject1 != null) {
        ((g)localObject1).c();
      }
      q.F(a);
      q.G(a);
      localObject1 = a;
      a.clear();
      ((p)localObject1).b();
      if (w)
      {
        localObject1 = q;
        e = false;
        ((j)localObject1).B(this);
      }
      q.J(null);
      q = null;
    }
    else
    {
      localObject1 = a;
      a.clear();
      ((p)localObject1).b();
    }
    localObject1 = d;
    b.e();
    int j = c.size();
    for (;;)
    {
      j--;
      if (j < 0) {
        break;
      }
      b.b localb = a;
      localObject2 = (View)c.get(j);
      ((k)localb).getClass();
      p((View)localObject2);
      c.remove(j);
    }
    Object localObject2 = (k)a;
    int k = ((k)localObject2).a();
    for (j = i; j < k; j++)
    {
      localObject1 = a.getChildAt(j);
      a.getClass();
      p((View)localObject1);
      ((View)localObject1).clearAnimation();
    }
    a.removeAllViews();
    q = paramj;
    if (paramj != null) {
      if (b == null)
      {
        paramj.J(this);
        if (w) {
          q.e = true;
        }
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("LayoutManager ");
        ((StringBuilder)localObject1).append(paramj);
        ((StringBuilder)localObject1).append(" is already attached to a RecyclerView:");
        ((StringBuilder)localObject1).append(b.l());
        throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
      }
    }
    a.g();
    requestLayout();
  }
  
  @Deprecated
  public void setLayoutTransition(LayoutTransition paramLayoutTransition)
  {
    if (paramLayoutTransition == null)
    {
      super.setLayoutTransition(null);
      return;
    }
    throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    e0.p localp = getScrollingChildHelper();
    if (d)
    {
      View localView = c;
      WeakHashMap localWeakHashMap = d0.a;
      d0.d.z(localView);
    }
    d = paramBoolean;
  }
  
  public void setOnFlingListener(l paraml) {}
  
  @Deprecated
  public void setOnScrollListener(n paramn) {}
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean)
  {
    e0 = paramBoolean;
  }
  
  public void setRecycledViewPool(o paramo)
  {
    p localp = a;
    o localo = g;
    if (localo != null) {
      b -= 1;
    }
    g = paramo;
    if (paramo != null) {
      h.getAdapter();
    }
  }
  
  @Deprecated
  public void setRecyclerListener(q paramq)
  {
    r = paramq;
  }
  
  public void setScrollState(int paramInt)
  {
    if (paramInt == P) {
      return;
    }
    P = paramInt;
    if (paramInt != 2)
    {
      localObject = f0;
      o.removeCallbacks((Runnable)localObject);
      c.abortAnimation();
    }
    Object localObject = q;
    if (localObject != null) {
      ((j)localObject).E(paramInt);
    }
    localObject = j0;
    if (localObject != null)
    {
      paramInt = ((ArrayList)localObject).size();
      for (;;)
      {
        paramInt--;
        if (paramInt < 0) {
          break;
        }
        ((n)j0.get(paramInt)).getClass();
      }
    }
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    if (paramInt != 0) {
      if (paramInt != 1)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("setScrollingTouchSlop(): bad argument constant ");
        localStringBuilder.append(paramInt);
        localStringBuilder.append("; using default value");
        Log.w("RecyclerView", localStringBuilder.toString());
      }
      else
      {
        paramInt = localViewConfiguration.getScaledPagingTouchSlop();
        break label74;
      }
    }
    paramInt = localViewConfiguration.getScaledTouchSlop();
    label74:
    W = paramInt;
  }
  
  public void setViewCacheExtension(t paramt)
  {
    a.getClass();
  }
  
  public final boolean startNestedScroll(int paramInt)
  {
    return getScrollingChildHelper().g(paramInt, 0);
  }
  
  public final void stopNestedScroll()
  {
    getScrollingChildHelper().h(0);
  }
  
  public final void suppressLayout(boolean paramBoolean)
  {
    if (paramBoolean != B)
    {
      b("Do not suppressLayout in layout or scroll");
      if (!paramBoolean)
      {
        B = false;
        A = false;
      }
      else
      {
        long l = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
        B = true;
        C = true;
        setScrollState(0);
        u localu = f0;
        o.removeCallbacks(localu);
        c.abortAnimation();
      }
    }
  }
  
  public final void t(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == Q)
    {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      Q = paramMotionEvent.getPointerId(i);
      int j = (int)(paramMotionEvent.getX(i) + 0.5F);
      U = j;
      S = j;
      i = (int)(paramMotionEvent.getY(i) + 0.5F);
      V = i;
      T = i;
    }
  }
  
  public final void u(View paramView1, View paramView2)
  {
    if (paramView2 != null) {
      localObject = paramView2;
    } else {
      localObject = paramView1;
    }
    o.set(0, 0, ((View)localObject).getWidth(), ((View)localObject).getHeight());
    Object localObject = ((View)localObject).getLayoutParams();
    if ((localObject instanceof k))
    {
      localObject = (k)localObject;
      if (!b)
      {
        localObject = a;
        localRect = o;
        left -= left;
        right += right;
        top -= top;
        bottom += bottom;
      }
    }
    if (paramView2 != null)
    {
      offsetDescendantRectToMyCoords(paramView2, o);
      offsetRectIntoDescendantCoords(paramView1, o);
    }
    localObject = q;
    Rect localRect = o;
    boolean bool1 = y;
    boolean bool2;
    if (paramView2 == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    ((j)localObject).H(this, paramView1, localRect, bool1 ^ true, bool2);
  }
  
  public final void v()
  {
    Object localObject = R;
    if (localObject != null) {
      ((VelocityTracker)localObject).clear();
    }
    boolean bool1 = false;
    A(0);
    localObject = K;
    if (localObject != null)
    {
      ((EdgeEffect)localObject).onRelease();
      bool1 = K.isFinished();
    }
    localObject = L;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      ((EdgeEffect)localObject).onRelease();
      bool2 = bool1 | L.isFinished();
    }
    localObject = M;
    bool1 = bool2;
    if (localObject != null)
    {
      ((EdgeEffect)localObject).onRelease();
      bool1 = bool2 | M.isFinished();
    }
    localObject = N;
    bool2 = bool1;
    if (localObject != null)
    {
      ((EdgeEffect)localObject).onRelease();
      bool2 = bool1 | N.isFinished();
    }
    if (bool2)
    {
      localObject = d0.a;
      postInvalidateOnAnimation();
    }
  }
  
  public final boolean w(int paramInt1, int paramInt2, MotionEvent paramMotionEvent, int paramInt3)
  {
    d();
    if (!t.isEmpty()) {
      invalidate();
    }
    int[] arrayOfInt = p0;
    int i = 0;
    arrayOfInt[0] = 0;
    int j = 1;
    arrayOfInt[1] = 0;
    g(0, 0, 0, 0, n0, paramInt3, arrayOfInt);
    arrayOfInt = p0;
    int k = arrayOfInt[0];
    int m = arrayOfInt[1];
    boolean bool;
    if ((k == 0) && (m == 0)) {
      bool = false;
    } else {
      bool = true;
    }
    int n = U;
    arrayOfInt = n0;
    paramInt3 = arrayOfInt[0];
    U = (n - paramInt3);
    int i1 = V;
    n = arrayOfInt[1];
    V = (i1 - n);
    arrayOfInt = o0;
    arrayOfInt[0] += paramInt3;
    arrayOfInt[1] += n;
    if (getOverScrollMode() != 2)
    {
      if (paramMotionEvent != null)
      {
        if ((paramMotionEvent.getSource() & 0x2002) == 8194) {
          paramInt3 = 1;
        } else {
          paramInt3 = 0;
        }
        if (paramInt3 == 0)
        {
          float f1 = paramMotionEvent.getX();
          float f2 = 0 - k;
          float f3 = paramMotionEvent.getY();
          float f4 = 0 - m;
          float f5;
          if (f2 < 0.0F)
          {
            i();
            paramMotionEvent = K;
            f5 = -f2 / getWidth();
            f3 = 1.0F - f3 / getHeight();
          }
          else
          {
            paramInt3 = i;
            if (f2 <= 0.0F) {
              break label331;
            }
            j();
            paramMotionEvent = M;
            f5 = f2 / getWidth();
            f3 /= getHeight();
          }
          d.a.a(paramMotionEvent, f5, f3);
          paramInt3 = 1;
          label331:
          if (f4 < 0.0F)
          {
            k();
            d.a.a(L, -f4 / getHeight(), f1 / getWidth());
            paramInt3 = j;
          }
          else if (f4 > 0.0F)
          {
            h();
            d.a.a(N, f4 / getHeight(), 1.0F - f1 / getWidth());
            paramInt3 = j;
          }
          if ((paramInt3 != 0) || (f2 != 0.0F) || (f4 != 0.0F))
          {
            paramMotionEvent = d0.a;
            postInvalidateOnAnimation();
          }
        }
      }
      c(paramInt1, paramInt2);
    }
    if (!awakenScrollBars()) {
      invalidate();
    }
    return bool;
  }
  
  public final void x(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject1 = q;
    if (localObject1 == null)
    {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    if (B) {
      return;
    }
    int i;
    if (!((j)localObject1).b()) {
      i = 0;
    } else {
      i = paramInt1;
    }
    if (!q.c()) {
      paramInt2 = 0;
    }
    if ((i != 0) || (paramInt2 != 0))
    {
      int j;
      if (paramBoolean)
      {
        if (i != 0) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        }
        j = paramInt1;
        if (paramInt2 != 0) {
          j = paramInt1 | 0x2;
        }
        getScrollingChildHelper().g(j, 1);
      }
      localObject1 = f0;
      localObject1.getClass();
      int k = Math.abs(i);
      int m = Math.abs(paramInt2);
      if (k > m) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      Object localObject2 = o;
      if (paramInt1 != 0) {
        j = ((View)localObject2).getWidth();
      } else {
        j = ((View)localObject2).getHeight();
      }
      if (paramInt1 != 0) {
        paramInt1 = k;
      } else {
        paramInt1 = m;
      }
      paramInt1 = Math.min((int)((paramInt1 / j + 1.0F) * 300.0F), 2000);
      localObject2 = u0;
      if (d != localObject2)
      {
        d = ((Interpolator)localObject2);
        c = new OverScroller(o.getContext(), (Interpolator)localObject2);
      }
      b = 0;
      a = 0;
      o.setScrollState(2);
      c.startScroll(0, 0, i, paramInt2, paramInt1);
      if (e)
      {
        f = true;
      }
      else
      {
        o.removeCallbacks((Runnable)localObject1);
        RecyclerView localRecyclerView = o;
        localObject2 = d0.a;
        localRecyclerView.postOnAnimation((Runnable)localObject1);
      }
    }
  }
  
  public final void y()
  {
    int i = z + 1;
    z = i;
    if ((i == 1) && (!B)) {
      A = false;
    }
  }
  
  public final void z(boolean paramBoolean)
  {
    if (z < 1) {
      z = 1;
    }
    if ((!paramBoolean) && (!B)) {
      A = false;
    }
    int i = z;
    if (i == 1)
    {
      if ((paramBoolean) && (A) && (!B)) {
        j localj = q;
      }
      if (!B) {
        A = false;
      }
    }
    z = (i - 1);
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      Object localObject1 = O;
      if (localObject1 != null)
      {
        localObject1 = (c)localObject1;
        boolean bool1 = e.isEmpty() ^ true;
        boolean bool2 = g.isEmpty() ^ true;
        boolean bool3 = h.isEmpty() ^ true;
        boolean bool4 = f.isEmpty() ^ true;
        if ((bool1) || (bool2) || (bool4) || (bool3))
        {
          Iterator localIterator = e.iterator();
          if (!localIterator.hasNext())
          {
            e.clear();
            Object localObject2;
            if (bool2)
            {
              localObject2 = new ArrayList();
              ((ArrayList)localObject2).addAll(g);
              j.add(localObject2);
              g.clear();
              if (!bool1)
              {
                localIterator = ((ArrayList)localObject2).iterator();
                if (!localIterator.hasNext())
                {
                  ((ArrayList)localObject2).clear();
                  j.remove(localObject2);
                }
                else
                {
                  ((c.b)localIterator.next()).getClass();
                  throw null;
                }
              }
              else
              {
                ((c.b)((ArrayList)localObject2).get(0)).getClass();
                throw null;
              }
            }
            if (bool3)
            {
              ArrayList localArrayList = new ArrayList();
              localArrayList.addAll(h);
              k.add(localArrayList);
              h.clear();
              if (!bool1)
              {
                localIterator = localArrayList.iterator();
                while (localIterator.hasNext()) {
                  localObject2 = nexta;
                }
                localArrayList.clear();
                k.remove(localArrayList);
              }
              else
              {
                get0a.getClass();
                localObject1 = d0.a;
                throw null;
              }
            }
            if (bool4)
            {
              localObject2 = new ArrayList();
              ((ArrayList)localObject2).addAll(f);
              i.add(localObject2);
              f.clear();
              if ((!bool1) && (!bool2) && (!bool3))
              {
                localIterator = ((ArrayList)localObject2).iterator();
                if (!localIterator.hasNext())
                {
                  ((ArrayList)localObject2).clear();
                  i.remove(localObject2);
                }
                else
                {
                  ((RecyclerView.v)localIterator.next()).getClass();
                  throw null;
                }
              }
              else
              {
                long l1 = 0L;
                long l2;
                if (bool2) {
                  l2 = c;
                } else {
                  l2 = 0L;
                }
                if (bool3) {
                  l1 = d;
                }
                Math.max(l2, l1);
                ((RecyclerView.v)((ArrayList)localObject2).get(0)).getClass();
                localObject1 = d0.a;
                throw null;
              }
            }
          }
          else
          {
            ((RecyclerView.v)localIterator.next()).getClass();
            throw null;
          }
        }
      }
      getClass();
    }
  }
  
  public final class b
    implements Interpolator
  {
    public final float getInterpolation(float paramFloat)
    {
      paramFloat -= 1.0F;
      return paramFloat * paramFloat * paramFloat * paramFloat * paramFloat + 1.0F;
    }
  }
  
  public final class c
  {
    public c() {}
  }
  
  public static abstract class d<VH extends RecyclerView.v> {}
  
  public static abstract interface e
  {
    public abstract int a();
  }
  
  public static final class f {}
  
  public static abstract class g
  {
    public b a = null;
    public ArrayList<a> b = new ArrayList();
    public long c = 250L;
    public long d = 250L;
    
    public final void a(RecyclerView.v paramv)
    {
      Object localObject = a;
      if (localObject != null)
      {
        RecyclerView.h localh = (RecyclerView.h)localObject;
        int i = 1;
        paramv.h(true);
        if (e != null) {
          e = null;
        }
        int j;
        if ((f & 0x10) != 0) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0)
        {
          RecyclerView localRecyclerView = a;
          localRecyclerView.y();
          localObject = d;
          j = a).a.indexOfChild(null);
          if (j == -1)
          {
            ((b)localObject).f(null);
            j = i;
          }
          else if (b.c(j))
          {
            b.d(j);
            ((b)localObject).f(null);
            ((k)a).b(j);
            j = i;
          }
          else
          {
            j = 0;
          }
          if (j == 0)
          {
            localRecyclerView.z(j ^ 0x1);
            if ((j == 0) && (paramv.g())) {
              a.removeDetachedView(null, false);
            }
          }
          else
          {
            RecyclerView.p(null);
            a.f(null);
            throw null;
          }
        }
      }
    }
    
    public final void b()
    {
      int i = b.size();
      for (int j = 0; j < i; j++) {
        ((a)b.get(j)).a();
      }
      b.clear();
    }
    
    public abstract void c();
    
    public abstract boolean d();
    
    public static abstract interface a
    {
      public abstract void a();
    }
    
    public static abstract interface b {}
  }
  
  public final class h
    implements RecyclerView.g.b
  {
    public h() {}
  }
  
  public static abstract class i
  {
    public void d(Canvas paramCanvas) {}
  }
  
  public static abstract class j
  {
    public b a;
    public RecyclerView b;
    public p c;
    public p d;
    public boolean e;
    public int f;
    public int g;
    
    public j()
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
  
  public static class k
    extends ViewGroup.MarginLayoutParams
  {
    public final Rect a = new Rect();
    public boolean b = true;
    
    public k(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public k(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public k(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public k(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public k(k paramk)
    {
      super();
    }
  }
  
  public static abstract class l {}
  
  public static abstract interface m
  {
    public abstract void a(MotionEvent paramMotionEvent);
    
    public abstract void b();
    
    public abstract boolean c(MotionEvent paramMotionEvent);
  }
  
  public static abstract class n {}
  
  public static final class o
  {
    public SparseArray<a> a = new SparseArray();
    public int b = 0;
    
    public static final class a
    {
      public final ArrayList<RecyclerView.v> a = new ArrayList();
      public int b = 5;
      public long c = 0L;
    }
  }
  
  public final class p
  {
    public final ArrayList<RecyclerView.v> a;
    public ArrayList<RecyclerView.v> b;
    public final ArrayList<RecyclerView.v> c;
    public final List<RecyclerView.v> d;
    public int e;
    public int f;
    public RecyclerView.o g;
    
    public p()
    {
      this$1 = new ArrayList();
      a = RecyclerView.this;
      b = null;
      c = new ArrayList();
      d = Collections.unmodifiableList(RecyclerView.this);
      e = 2;
      f = 2;
    }
    
    public static void d(RecyclerView.v paramv)
    {
      if (!paramv.f()) {
        throw null;
      }
      paramv = new java/lang/IllegalArgumentException;
      throw null;
    }
    
    public final int a(int paramInt)
    {
      if ((paramInt >= 0) && (paramInt < i0.a()))
      {
        localObject = RecyclerView.this;
        if (!i0.d) {
          return paramInt;
        }
        return c.a(paramInt, 0);
      }
      Object localObject = j.n("invalid position ", paramInt, ". State item count is ");
      ((StringBuilder)localObject).append(i0.a());
      ((StringBuilder)localObject).append(l());
      throw new IndexOutOfBoundsException(((StringBuilder)localObject).toString());
    }
    
    public final void b()
    {
      int i = c.size();
      for (;;)
      {
        i--;
        if (i < 0) {
          break;
        }
        c(i);
      }
      c.clear();
      Object localObject = RecyclerView.s0;
      localObject = h0;
      localObject.getClass();
      c = 0;
    }
    
    public final void c(int paramInt)
    {
      RecyclerView.v localv = (RecyclerView.v)c.get(paramInt);
      Object localObject1 = RecyclerView.s0;
      localv.getClass();
      localObject1 = l0;
      if (localObject1 != null)
      {
        localObject1 = e;
        if ((localObject1 instanceof m.a)) {
          localObject1 = (e0.a)e.remove(null);
        } else {
          localObject1 = null;
        }
        d0.h(null, (e0.a)localObject1);
      }
      localObject1 = r;
      if (localObject1 != null) {
        ((RecyclerView.q)localObject1).a();
      }
      int i = s.size();
      for (int j = 0; j < i; j++) {
        ((RecyclerView.q)s.get(j)).a();
      }
      getClass();
      localObject1 = RecyclerView.this;
      if (i0 != null)
      {
        localObject1 = e;
        localObject2 = b;
        if (a) {
          ((r.e)localObject2).c();
        }
        for (j = d - 1; j >= 0; j--)
        {
          localObject2 = b;
          if (a) {
            ((r.e)localObject2).c();
          }
          if (localv == c[j])
          {
            r.e locale = b;
            localObject3 = c;
            localObject2 = localObject3[j];
            Object localObject4 = r.e.e;
            if (localObject2 == localObject4) {
              break;
            }
            localObject3[j] = localObject4;
            a = true;
            break;
          }
        }
        localObject1 = (q.a)a.remove(localv);
        if (localObject1 != null) {
          q.a.a.c(localObject1);
        }
      }
      l = null;
      if (g == null) {
        g = new RecyclerView.o();
      }
      Object localObject3 = g;
      localObject3.getClass();
      Object localObject2 = (RecyclerView.o.a)a.get(0);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = new RecyclerView.o.a();
        a.put(0, localObject1);
      }
      localObject1 = a;
      if (a.get(0)).b > ((ArrayList)localObject1).size())
      {
        f = 0;
        a = -1;
        b = -1;
        c = -1L;
        d = -1;
        i = 0;
        e = null;
        localObject2 = g;
        if (localObject2 != null) {
          ((ArrayList)localObject2).clear();
        }
        f &= 0xFBFF;
        localv.getClass();
        localv.getClass();
        localObject2 = RecyclerView.s0;
        ((ArrayList)localObject1).add(localv);
      }
      c.remove(paramInt);
    }
    
    public final void e(int paramInt, long paramLong)
    {
      if ((paramInt >= 0) && (paramInt < i0.a()))
      {
        boolean bool = i0.d;
        int i = 0;
        int j = 0;
        int k;
        if (bool)
        {
          localObject1 = b;
          if (localObject1 != null)
          {
            k = ((ArrayList)localObject1).size();
            if (k != 0)
            {
              for (m = 0; m < k; m++)
              {
                localObject1 = (RecyclerView.v)b.get(m);
                if ((f & 0x20) != 0) {
                  n = 1;
                } else {
                  n = 0;
                }
                if ((n == 0) && (((RecyclerView.v)localObject1).c() == paramInt))
                {
                  ((RecyclerView.v)localObject1).b(32);
                  break label154;
                }
              }
              getClass();
              throw null;
            }
          }
          localObject1 = null;
          label154:
          localObject2 = localObject1;
          if (localObject1 != null)
          {
            m = 1;
            break label179;
          }
        }
        else
        {
          localObject2 = null;
        }
        int m = 0;
        localObject1 = localObject2;
        label179:
        int n = m;
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          int i1 = a.size();
          for (n = 0; n < i1; n++)
          {
            localObject1 = (RecyclerView.v)a.get(n);
            if ((f & 0x20) != 0) {
              k = 1;
            } else {
              k = 0;
            }
            if ((k == 0) && (((RecyclerView.v)localObject1).c() == paramInt) && (!((RecyclerView.v)localObject1).d()) && ((i0.d) || (!((RecyclerView.v)localObject1).e())))
            {
              ((RecyclerView.v)localObject1).b(32);
              break label388;
            }
          }
          localObject1 = d;
          if (c.size() <= 0)
          {
            k = c.size();
            for (n = 0; n < k; n++)
            {
              localObject1 = (RecyclerView.v)c.get(n);
              if ((!((RecyclerView.v)localObject1).d()) && (((RecyclerView.v)localObject1).c() == paramInt)) {
                throw null;
              }
            }
            localObject1 = null;
            label388:
            n = m;
            localObject2 = localObject1;
            if (localObject1 != null) {
              if (((RecyclerView.v)localObject1).e())
              {
                if (!i0.d)
                {
                  ((RecyclerView.v)localObject1).b(4);
                  if (!((RecyclerView.v)localObject1).f())
                  {
                    m = f;
                    paramInt = j;
                    if ((m & 0x20) != 0) {
                      paramInt = 1;
                    }
                    if (paramInt != 0) {
                      f = (m & 0xFFFFFFDF);
                    }
                  }
                  else
                  {
                    removeDetachedView(null, false);
                    j.f((RecyclerView.v)localObject1);
                  }
                  d((RecyclerView.v)localObject1);
                  throw null;
                }
                n = 1;
                localObject2 = localObject1;
              }
              else
              {
                if (a >= 0)
                {
                  getClass();
                  throw null;
                }
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("Inconsistency detected. Invalid view holder adapter position");
                ((StringBuilder)localObject2).append(localObject1);
                ((StringBuilder)localObject2).append(l());
                throw new IndexOutOfBoundsException(((StringBuilder)localObject2).toString());
              }
            }
          }
          else
          {
            localObject2 = (View)c.get(0);
            ((k)a).getClass();
            RecyclerView.p((View)localObject2);
            throw null;
          }
        }
        if (localObject2 == null)
        {
          m = c.a(paramInt, 0);
          if (m >= 0)
          {
            getClass();
            throw null;
          }
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Inconsistency detected. Invalid item position ");
          ((StringBuilder)localObject1).append(paramInt);
          ((StringBuilder)localObject1).append("(offset:");
          ((StringBuilder)localObject1).append(m);
          ((StringBuilder)localObject1).append(").state:");
          ((StringBuilder)localObject1).append(i0.a());
          ((StringBuilder)localObject1).append(l());
          throw new IndexOutOfBoundsException(((StringBuilder)localObject1).toString());
        }
        if (n != 0)
        {
          localObject1 = i0;
          if (!d)
          {
            n = f;
            if ((0x2000 & n) != 0) {
              m = 1;
            } else {
              m = 0;
            }
            if (m != 0)
            {
              m = n & 0xDFFF | 0x0;
              f = m;
              if (e)
              {
                if ((!((RecyclerView.v)localObject2).d()) && ((m & 0xE & 0x4) == 0))
                {
                  localObject1 = l;
                  if (localObject1 != null) {
                    ((RecyclerView)localObject1).o((RecyclerView.v)localObject2);
                  }
                }
                localObject1 = O;
                if ((f & 0x400) == 0)
                {
                  localObject2 = g;
                  if ((localObject2 != null) && (((ArrayList)localObject2).size() != 0)) {}
                }
                else
                {
                  localObject2 = RecyclerView.v.m;
                }
                localObject1.getClass();
                throw null;
              }
            }
          }
        }
        if (i0.d)
        {
          if ((f & 0x1) != 0) {
            m = 1;
          } else {
            m = 0;
          }
          if (m != 0)
          {
            d = paramInt;
            break label1147;
          }
        }
        n = f;
        if ((n & 0x1) != 0) {
          m = 1;
        } else {
          m = 0;
        }
        if (m != 0)
        {
          if ((n & 0x2) != 0) {
            m = 1;
          } else {
            m = 0;
          }
          if ((m == 0) && (!((RecyclerView.v)localObject2).d())) {}
        }
        else
        {
          c.a(paramInt, 0);
          localObject1 = RecyclerView.this;
          l = ((RecyclerView)localObject1);
          long l1 = ((RecyclerView)localObject1).getNanoTime();
          if (paramLong == Long.MAX_VALUE) {
            break label1149;
          }
          RecyclerView.o localo = g;
          localObject2 = (RecyclerView.o.a)a.get(0);
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = new RecyclerView.o.a();
            a.put(0, localObject1);
          }
          long l2 = c;
          if (l2 != 0L)
          {
            paramInt = i;
            if (l1 + l2 >= paramLong) {}
          }
          else
          {
            paramInt = 1;
          }
          if (paramInt != 0) {
            break label1149;
          }
        }
        label1147:
        throw null;
        label1149:
        getClass();
        throw null;
      }
      Object localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Invalid item position ");
      ((StringBuilder)localObject1).append(paramInt);
      ((StringBuilder)localObject1).append("(");
      ((StringBuilder)localObject1).append(paramInt);
      ((StringBuilder)localObject1).append("). Item count:");
      ((StringBuilder)localObject1).append(i0.a());
      ((StringBuilder)localObject1).append(l());
      throw new IndexOutOfBoundsException(((StringBuilder)localObject1).toString());
    }
    
    public final void f(RecyclerView.v paramv)
    {
      ArrayList localArrayList;
      if (k) {
        localArrayList = b;
      } else {
        localArrayList = a;
      }
      localArrayList.remove(paramv);
      j = null;
      k = false;
      f &= 0xFFFFFFDF;
    }
    
    public final void g()
    {
      RecyclerView.j localj = q;
      f = (e + 0);
      int i = c.size();
      for (;;)
      {
        i--;
        if ((i < 0) || (c.size() <= f)) {
          break;
        }
        c(i);
      }
    }
  }
  
  public static abstract interface q
  {
    public abstract void a();
  }
  
  public static final class r
    extends n0.a
  {
    public static final Parcelable.Creator<r> CREATOR = new a();
    public Parcelable c;
    
    public r(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      if (paramClassLoader == null) {
        paramClassLoader = RecyclerView.j.class.getClassLoader();
      }
      c = paramParcel.readParcelable(paramClassLoader);
    }
    
    public r(Parcelable paramParcelable)
    {
      super();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeParcelable(a, paramInt);
      paramParcel.writeParcelable(c, 0);
    }
    
    public final class a
      implements Parcelable.ClassLoaderCreator<RecyclerView.r>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new RecyclerView.r(paramParcel, null);
      }
      
      public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        return new RecyclerView.r(paramParcel, paramClassLoader);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new RecyclerView.r[paramInt];
      }
    }
  }
  
  public static final class s
  {
    public int a = 0;
    public int b = 0;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    
    public final int a()
    {
      int i;
      if (d) {
        i = a - b;
      } else {
        i = 0;
      }
      return i;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("State{mTargetPosition=");
      localStringBuilder.append(-1);
      localStringBuilder.append(", mData=");
      localStringBuilder.append(null);
      localStringBuilder.append(", mItemCount=");
      localStringBuilder.append(0);
      localStringBuilder.append(", mIsMeasuring=");
      localStringBuilder.append(false);
      localStringBuilder.append(", mPreviousLayoutItemCount=");
      localStringBuilder.append(a);
      localStringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
      localStringBuilder.append(b);
      localStringBuilder.append(", mStructureChanged=");
      localStringBuilder.append(c);
      localStringBuilder.append(", mInPreLayout=");
      localStringBuilder.append(d);
      localStringBuilder.append(", mRunSimpleAnimations=");
      localStringBuilder.append(e);
      localStringBuilder.append(", mRunPredictiveAnimations=");
      localStringBuilder.append(f);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class t {}
  
  public final class u
    implements Runnable
  {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    
    public u()
    {
      RecyclerView.b localb = RecyclerView.u0;
      d = localb;
      e = false;
      f = false;
      c = new OverScroller(getContext(), localb);
    }
    
    public final void run()
    {
      Object localObject1 = RecyclerView.this;
      if (q == null)
      {
        ((View)localObject1).removeCallbacks(this);
        c.abortAnimation();
        return;
      }
      f = false;
      e = true;
      ((RecyclerView)localObject1).d();
      localObject1 = c;
      Object localObject3;
      if (((OverScroller)localObject1).computeScrollOffset())
      {
        int i = ((OverScroller)localObject1).getCurrX();
        int j = ((OverScroller)localObject1).getCurrY();
        int k = i - a;
        int m = j - b;
        a = i;
        b = j;
        Object localObject2 = RecyclerView.this;
        localObject3 = p0;
        localObject3[0] = 0;
        localObject3[1] = 0;
        i = k;
        j = m;
        if (((RecyclerView)localObject2).f(k, m, (int[])localObject3, null, 1))
        {
          localObject3 = p0;
          i = k - localObject3[0];
          j = m - localObject3[1];
        }
        if (getOverScrollMode() != 2) {
          c(i, j);
        }
        getClass();
        if (!t.isEmpty()) {
          invalidate();
        }
        localObject2 = RecyclerView.this;
        localObject3 = p0;
        localObject3[0] = 0;
        localObject3[1] = 0;
        ((RecyclerView)localObject2).g(0, 0, i, j, null, 1, (int[])localObject3);
        localObject3 = RecyclerView.this;
        localObject2 = p0;
        k = i - localObject2[0];
        m = j - localObject2[1];
        if (!RecyclerView.a((RecyclerView)localObject3)) {
          invalidate();
        }
        if (((OverScroller)localObject1).getCurrX() == ((OverScroller)localObject1).getFinalX()) {
          j = 1;
        } else {
          j = 0;
        }
        if (((OverScroller)localObject1).getCurrY() == ((OverScroller)localObject1).getFinalY()) {
          i = 1;
        } else {
          i = 0;
        }
        if ((!((OverScroller)localObject1).isFinished()) && (((j == 0) && (k == 0)) || ((i == 0) && (m == 0)))) {
          j = 0;
        } else {
          j = 1;
        }
        q.getClass();
        if (j != 0)
        {
          if (getOverScrollMode() != 2)
          {
            i = (int)((OverScroller)localObject1).getCurrVelocity();
            if (k < 0) {
              j = -i;
            } else if (k > 0) {
              j = i;
            } else {
              j = 0;
            }
            if (m < 0) {
              i = -i;
            } else if (m <= 0) {
              i = 0;
            }
            localObject3 = RecyclerView.this;
            if (j < 0)
            {
              ((RecyclerView)localObject3).i();
              if (K.isFinished()) {
                K.onAbsorb(-j);
              }
            }
            else if (j > 0)
            {
              ((RecyclerView)localObject3).j();
              if (M.isFinished()) {
                M.onAbsorb(j);
              }
            }
            if (i < 0)
            {
              ((RecyclerView)localObject3).k();
              if (L.isFinished()) {
                L.onAbsorb(-i);
              }
            }
            else if (i > 0)
            {
              ((RecyclerView)localObject3).h();
              if (N.isFinished()) {
                N.onAbsorb(i);
              }
            }
            else
            {
              localObject3.getClass();
            }
            if ((j != 0) || (i != 0))
            {
              localObject1 = d0.a;
              ((View)localObject3).postInvalidateOnAnimation();
            }
          }
          localObject1 = h0;
          localObject1.getClass();
          c = 0;
        }
        else
        {
          if (e)
          {
            f = true;
          }
          else
          {
            removeCallbacks(this);
            localObject1 = RecyclerView.this;
            localObject3 = d0.a;
            ((View)localObject1).postOnAnimation(this);
          }
          localObject1 = RecyclerView.this;
          localObject3 = g0;
          if (localObject3 != null) {
            ((e)localObject3).a((RecyclerView)localObject1, 0, 0);
          }
        }
      }
      q.getClass();
      e = false;
      if (f)
      {
        removeCallbacks(this);
        localObject3 = RecyclerView.this;
        localObject1 = d0.a;
        ((View)localObject3).postOnAnimation(this);
      }
      else
      {
        setScrollState(0);
        A(1);
      }
    }
  }
  
  public static abstract class v
  {
    public static final List<Object> m = ;
    public int a;
    public int b;
    public long c;
    public int d;
    public v e;
    public int f;
    public ArrayList g;
    public List<Object> h;
    public int i;
    public RecyclerView.p j;
    public boolean k;
    public RecyclerView l;
    
    public final void a(Object paramObject)
    {
      if (paramObject == null)
      {
        b(1024);
      }
      else if ((0x400 & f) == 0)
      {
        if (g == null)
        {
          ArrayList localArrayList = new ArrayList();
          g = localArrayList;
          h = Collections.unmodifiableList(localArrayList);
        }
        g.add(paramObject);
      }
    }
    
    public final void b(int paramInt)
    {
      f = (paramInt | f);
    }
    
    public final int c()
    {
      int n = d;
      int i1 = n;
      if (n == -1) {
        i1 = a;
      }
      return i1;
    }
    
    public final boolean d()
    {
      boolean bool;
      if ((f & 0x4) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean e()
    {
      boolean bool;
      if ((f & 0x8) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean f()
    {
      boolean bool;
      if (j != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean g()
    {
      boolean bool;
      if ((f & 0x100) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void h(boolean paramBoolean)
    {
      int n = i;
      if (paramBoolean) {
        n--;
      } else {
        n++;
      }
      i = n;
      if (n < 0)
      {
        i = 0;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
        localStringBuilder.append(this);
        Log.e("View", localStringBuilder.toString());
      }
      else
      {
        if ((!paramBoolean) && (n == 1)) {}
        for (n = f | 0x10;; n = f & 0xFFFFFFEF)
        {
          f = n;
          break;
          if ((!paramBoolean) || (n != 0)) {
            break;
          }
        }
      }
    }
    
    public final String toString()
    {
      if (v.class.isAnonymousClass()) {
        localObject = "ViewHolder";
      } else {
        localObject = v.class.getSimpleName();
      }
      Object localObject = g.g((String)localObject, "{");
      ((StringBuilder)localObject).append(Integer.toHexString(hashCode()));
      ((StringBuilder)localObject).append(" position=");
      ((StringBuilder)localObject).append(a);
      ((StringBuilder)localObject).append(" id=");
      ((StringBuilder)localObject).append(c);
      ((StringBuilder)localObject).append(", oldPos=");
      ((StringBuilder)localObject).append(b);
      ((StringBuilder)localObject).append(", pLpos:");
      ((StringBuilder)localObject).append(d);
      new StringBuilder(((StringBuilder)localObject).toString());
      if ((f & 0x10) != 0) {
        throw null;
      }
      localObject = d0.a;
      throw null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */