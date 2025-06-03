package I;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import t.h;
import v.c;

public abstract class s
{
  public static final AtomicInteger a = new AtomicInteger(1);
  public static WeakHashMap b = null;
  public static Field c;
  public static boolean d = false;
  public static final int[] e = { c.b, c.c, c.n, c.y, c.B, c.C, c.D, c.E, c.F, c.G, c.d, c.e, c.f, c.g, c.h, c.i, c.j, c.k, c.l, c.m, c.o, c.p, c.q, c.r, c.s, c.t, c.u, c.v, c.w, c.x, c.z, c.A };
  public static final p f = new r();
  public static final e g = new e();
  
  public static void A(View paramView)
  {
    j.c(paramView);
  }
  
  public static void B(View paramView, Context paramContext, int[] paramArrayOfInt, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      n.c(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
    }
  }
  
  public static f C()
  {
    return new a(c.M, Boolean.class, 28);
  }
  
  public static void D(View paramView, a parama)
  {
    a locala = parama;
    if (parama == null)
    {
      locala = parama;
      if ((f(paramView) instanceof a.a)) {
        locala = new a();
      }
    }
    if (locala == null) {
      parama = null;
    } else {
      parama = locala.d();
    }
    paramView.setAccessibilityDelegate(parama);
  }
  
  public static void E(View paramView, Drawable paramDrawable)
  {
    g.q(paramView, paramDrawable);
  }
  
  public static void F(View paramView, ColorStateList paramColorStateList)
  {
    k.q(paramView, paramColorStateList);
  }
  
  public static void G(View paramView, PorterDuff.Mode paramMode)
  {
    k.r(paramView, paramMode);
  }
  
  public static void H(View paramView, int paramInt)
  {
    g.s(paramView, paramInt);
  }
  
  public static void I(View paramView, String paramString)
  {
    k.v(paramView, paramString);
  }
  
  public static void J(View paramView)
  {
    if (l(paramView) == 0) {
      H(paramView, 1);
    }
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent instanceof View); localViewParent = localViewParent.getParent()) {
      if (l((View)localViewParent) == 4)
      {
        H(paramView, 2);
        break;
      }
    }
  }
  
  public static f K()
  {
    return new c(c.N, CharSequence.class, 64, 30);
  }
  
  public static void L(View paramView)
  {
    k.z(paramView);
  }
  
  public static f a()
  {
    return new d(c.J, Boolean.class, 28);
  }
  
  public static x b(View paramView, x paramx, Rect paramRect)
  {
    return k.b(paramView, paramx, paramRect);
  }
  
  public static x c(View paramView, x paramx)
  {
    WindowInsets localWindowInsets1 = paramx.r();
    if (localWindowInsets1 != null)
    {
      WindowInsets localWindowInsets2 = j.a(paramView, localWindowInsets1);
      if (!localWindowInsets2.equals(localWindowInsets1)) {
        return x.t(localWindowInsets2, paramView);
      }
    }
    return paramx;
  }
  
  public static boolean d(View paramView, KeyEvent paramKeyEvent)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return false;
    }
    return q.a(paramView).b(paramView, paramKeyEvent);
  }
  
  public static boolean e(View paramView, KeyEvent paramKeyEvent)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return false;
    }
    return q.a(paramView).f(paramKeyEvent);
  }
  
  public static View.AccessibilityDelegate f(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return n.a(paramView);
    }
    return g(paramView);
  }
  
  /* Error */
  public static View.AccessibilityDelegate g(View paramView)
  {
    // Byte code:
    //   0: getstatic 78	I/s:d	Z
    //   3: ifeq +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: getstatic 291	I/s:c	Ljava/lang/reflect/Field;
    //   11: ifnonnull +31 -> 42
    //   14: ldc -49
    //   16: ldc_w 293
    //   19: invokevirtual 299	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   22: astore_1
    //   23: aload_1
    //   24: putstatic 291	I/s:c	Ljava/lang/reflect/Field;
    //   27: aload_1
    //   28: iconst_1
    //   29: invokevirtual 305	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   32: goto +10 -> 42
    //   35: astore_0
    //   36: iconst_1
    //   37: putstatic 78	I/s:d	Z
    //   40: aconst_null
    //   41: areturn
    //   42: getstatic 291	I/s:c	Ljava/lang/reflect/Field;
    //   45: aload_0
    //   46: invokevirtual 311	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   49: astore_0
    //   50: aload_0
    //   51: instanceof 313
    //   54: ifeq +10 -> 64
    //   57: aload_0
    //   58: checkcast 313	android/view/View$AccessibilityDelegate
    //   61: astore_0
    //   62: aload_0
    //   63: areturn
    //   64: aconst_null
    //   65: areturn
    //   66: astore_0
    //   67: iconst_1
    //   68: putstatic 78	I/s:d	Z
    //   71: aconst_null
    //   72: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	paramView	View
    //   22	6	1	localField	Field
    // Exception table:
    //   from	to	target	type
    //   14	32	35	finally
    //   42	62	66	finally
  }
  
  public static int h(View paramView)
  {
    return i.a(paramView);
  }
  
  public static CharSequence i(View paramView)
  {
    return (CharSequence)w().d(paramView);
  }
  
  public static ColorStateList j(View paramView)
  {
    return k.g(paramView);
  }
  
  public static PorterDuff.Mode k(View paramView)
  {
    return k.h(paramView);
  }
  
  public static int l(View paramView)
  {
    return g.c(paramView);
  }
  
  public static int m(View paramView)
  {
    return h.d(paramView);
  }
  
  public static int n(View paramView)
  {
    return g.d(paramView);
  }
  
  public static x o(View paramView)
  {
    return l.a(paramView);
  }
  
  public static CharSequence p(View paramView)
  {
    return (CharSequence)K().d(paramView);
  }
  
  public static String q(View paramView)
  {
    return k.k(paramView);
  }
  
  public static int r(View paramView)
  {
    return g.g(paramView);
  }
  
  public static boolean s(View paramView)
  {
    paramView = (Boolean)a().d(paramView);
    boolean bool;
    if ((paramView != null) && (paramView.booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean t(View paramView)
  {
    return i.b(paramView);
  }
  
  public static boolean u(View paramView)
  {
    paramView = (Boolean)C().d(paramView);
    boolean bool;
    if ((paramView != null) && (paramView.booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void v(View paramView, int paramInt)
  {
    AccessibilityManager localAccessibilityManager = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
    if (!localAccessibilityManager.isEnabled()) {
      return;
    }
    int i;
    if ((i(paramView) != null) && (paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
      i = 1;
    } else {
      i = 0;
    }
    int j = h(paramView);
    int k = 32;
    Object localObject;
    if ((j == 0) && (i == 0))
    {
      if (paramInt == 32)
      {
        localObject = AccessibilityEvent.obtain();
        paramView.onInitializeAccessibilityEvent((AccessibilityEvent)localObject);
        ((AccessibilityEvent)localObject).setEventType(32);
        i.g((AccessibilityEvent)localObject, paramInt);
        ((AccessibilityRecord)localObject).setSource(paramView);
        paramView.onPopulateAccessibilityEvent((AccessibilityEvent)localObject);
        ((AccessibilityRecord)localObject).getText().add(i(paramView));
        localAccessibilityManager.sendAccessibilityEvent((AccessibilityEvent)localObject);
      }
      else if (paramView.getParent() != null)
      {
        localObject = paramView.getParent();
        try
        {
          i.e((ViewParent)localObject, paramView, paramView, paramInt);
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append(paramView.getParent().getClass().getSimpleName());
          ((StringBuilder)localObject).append(" does not fully implement ViewParent");
          Log.e("ViewCompat", ((StringBuilder)localObject).toString(), localAbstractMethodError);
        }
      }
    }
    else
    {
      localObject = AccessibilityEvent.obtain();
      if (i == 0) {
        k = 2048;
      }
      ((AccessibilityEvent)localObject).setEventType(k);
      i.g((AccessibilityEvent)localObject, paramInt);
      if (i != 0)
      {
        ((AccessibilityRecord)localObject).getText().add(i(paramView));
        J(paramView);
      }
      paramView.sendAccessibilityEventUnchecked((AccessibilityEvent)localObject);
    }
  }
  
  public static f w()
  {
    return new b(c.K, CharSequence.class, 8, 28);
  }
  
  public static void x(View paramView)
  {
    g.k(paramView);
  }
  
  public static void y(View paramView, Runnable paramRunnable)
  {
    g.m(paramView, paramRunnable);
  }
  
  public static void z(View paramView, Runnable paramRunnable, long paramLong)
  {
    g.n(paramView, paramRunnable, paramLong);
  }
  
  public class a
    extends s.f
  {
    public a(Class paramClass, int paramInt)
    {
      super(paramClass, paramInt);
    }
    
    public Boolean e(View paramView)
    {
      return Boolean.valueOf(s.m.d(paramView));
    }
  }
  
  public class b
    extends s.f
  {
    public b(Class paramClass, int paramInt1, int paramInt2)
    {
      super(paramClass, paramInt1, paramInt2);
    }
    
    public CharSequence e(View paramView)
    {
      return s.m.b(paramView);
    }
  }
  
  public class c
    extends s.f
  {
    public c(Class paramClass, int paramInt1, int paramInt2)
    {
      super(paramClass, paramInt1, paramInt2);
    }
    
    public CharSequence e(View paramView)
    {
      return s.o.a(paramView);
    }
  }
  
  public class d
    extends s.f
  {
    public d(Class paramClass, int paramInt)
    {
      super(paramClass, paramInt);
    }
    
    public Boolean e(View paramView)
    {
      return Boolean.valueOf(s.m.c(paramView));
    }
  }
  
  public static class e
    implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener
  {
    public final WeakHashMap o = new WeakHashMap();
    
    public final void a(View paramView, boolean paramBoolean)
    {
      boolean bool;
      if ((paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      if (paramBoolean != bool)
      {
        int i;
        if (bool) {
          i = 16;
        } else {
          i = 32;
        }
        s.v(paramView, i);
        o.put(paramView, Boolean.valueOf(bool));
      }
    }
    
    public final void b(View paramView)
    {
      paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
    
    public void onGlobalLayout()
    {
      if (Build.VERSION.SDK_INT < 28)
      {
        Iterator localIterator = o.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          a((View)localEntry.getKey(), ((Boolean)localEntry.getValue()).booleanValue());
        }
      }
    }
    
    public void onViewAttachedToWindow(View paramView)
    {
      b(paramView);
    }
    
    public void onViewDetachedFromWindow(View paramView) {}
  }
  
  public static abstract class f
  {
    public final int a;
    public final Class b;
    public final int c;
    public final int d;
    
    public f(int paramInt1, Class paramClass, int paramInt2)
    {
      this(paramInt1, paramClass, 0, paramInt2);
    }
    
    public f(int paramInt1, Class paramClass, int paramInt2, int paramInt3)
    {
      a = paramInt1;
      b = paramClass;
      d = paramInt2;
      c = paramInt3;
    }
    
    public final boolean a()
    {
      return true;
    }
    
    public final boolean b()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= c) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public abstract Object c(View paramView);
    
    public Object d(View paramView)
    {
      if (b()) {
        return c(paramView);
      }
      if (a())
      {
        paramView = paramView.getTag(a);
        if (b.isInstance(paramView)) {
          return paramView;
        }
      }
      return null;
    }
  }
  
  public static abstract class g
  {
    public static AccessibilityNodeProvider a(View paramView)
    {
      return paramView.getAccessibilityNodeProvider();
    }
    
    public static boolean b(View paramView)
    {
      return paramView.getFitsSystemWindows();
    }
    
    public static int c(View paramView)
    {
      return paramView.getImportantForAccessibility();
    }
    
    public static int d(View paramView)
    {
      return paramView.getMinimumHeight();
    }
    
    public static int e(View paramView)
    {
      return paramView.getMinimumWidth();
    }
    
    public static ViewParent f(View paramView)
    {
      return paramView.getParentForAccessibility();
    }
    
    public static int g(View paramView)
    {
      return paramView.getWindowSystemUiVisibility();
    }
    
    public static boolean h(View paramView)
    {
      return paramView.hasOverlappingRendering();
    }
    
    public static boolean i(View paramView)
    {
      return paramView.hasTransientState();
    }
    
    public static boolean j(View paramView, int paramInt, Bundle paramBundle)
    {
      return paramView.performAccessibilityAction(paramInt, paramBundle);
    }
    
    public static void k(View paramView)
    {
      paramView.postInvalidateOnAnimation();
    }
    
    public static void l(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.postInvalidateOnAnimation(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public static void m(View paramView, Runnable paramRunnable)
    {
      paramView.postOnAnimation(paramRunnable);
    }
    
    public static void n(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
    }
    
    public static void o(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
    {
      paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
    }
    
    public static void p(View paramView)
    {
      paramView.requestFitSystemWindows();
    }
    
    public static void q(View paramView, Drawable paramDrawable)
    {
      paramView.setBackground(paramDrawable);
    }
    
    public static void r(View paramView, boolean paramBoolean)
    {
      paramView.setHasTransientState(paramBoolean);
    }
    
    public static void s(View paramView, int paramInt)
    {
      paramView.setImportantForAccessibility(paramInt);
    }
  }
  
  public static abstract class h
  {
    public static int a()
    {
      return View.generateViewId();
    }
    
    public static Display b(@NonNull View paramView)
    {
      return paramView.getDisplay();
    }
    
    public static int c(View paramView)
    {
      return paramView.getLabelFor();
    }
    
    public static int d(View paramView)
    {
      return paramView.getLayoutDirection();
    }
    
    public static int e(View paramView)
    {
      return paramView.getPaddingEnd();
    }
    
    public static int f(View paramView)
    {
      return paramView.getPaddingStart();
    }
    
    public static boolean g(View paramView)
    {
      return paramView.isPaddingRelative();
    }
    
    public static void h(View paramView, int paramInt)
    {
      paramView.setLabelFor(paramInt);
    }
    
    public static void i(View paramView, Paint paramPaint)
    {
      paramView.setLayerPaint(paramPaint);
    }
    
    public static void j(View paramView, int paramInt)
    {
      paramView.setLayoutDirection(paramInt);
    }
    
    public static void k(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public static abstract class i
  {
    public static int a(View paramView)
    {
      return paramView.getAccessibilityLiveRegion();
    }
    
    public static boolean b(@NonNull View paramView)
    {
      return paramView.isAttachedToWindow();
    }
    
    public static boolean c(@NonNull View paramView)
    {
      return paramView.isLaidOut();
    }
    
    public static boolean d(@NonNull View paramView)
    {
      return paramView.isLayoutDirectionResolved();
    }
    
    public static void e(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      paramViewParent.notifySubtreeAccessibilityStateChanged(paramView1, paramView2, paramInt);
    }
    
    public static void f(View paramView, int paramInt)
    {
      paramView.setAccessibilityLiveRegion(paramInt);
    }
    
    public static void g(AccessibilityEvent paramAccessibilityEvent, int paramInt)
    {
      paramAccessibilityEvent.setContentChangeTypes(paramInt);
    }
  }
  
  public static abstract class j
  {
    public static WindowInsets a(View paramView, WindowInsets paramWindowInsets)
    {
      return paramView.dispatchApplyWindowInsets(paramWindowInsets);
    }
    
    public static WindowInsets b(View paramView, WindowInsets paramWindowInsets)
    {
      return paramView.onApplyWindowInsets(paramWindowInsets);
    }
    
    public static void c(View paramView)
    {
      paramView.requestApplyInsets();
    }
  }
  
  public static abstract class k
  {
    public static void a(@NonNull WindowInsets paramWindowInsets, @NonNull View paramView)
    {
      View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(c.Q);
      if (localOnApplyWindowInsetsListener != null) {
        localOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
      }
    }
    
    public static x b(@NonNull View paramView, @NonNull x paramx, @NonNull Rect paramRect)
    {
      WindowInsets localWindowInsets = paramx.r();
      if (localWindowInsets != null) {
        return x.t(paramView.computeSystemWindowInsets(localWindowInsets, paramRect), paramView);
      }
      paramRect.setEmpty();
      return paramx;
    }
    
    public static boolean c(@NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return paramView.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
    }
    
    public static boolean d(@NonNull View paramView, float paramFloat1, float paramFloat2)
    {
      return paramView.dispatchNestedPreFling(paramFloat1, paramFloat2);
    }
    
    public static boolean e(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
    {
      return paramView.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
    }
    
    public static boolean f(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
    {
      return paramView.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
    }
    
    public static ColorStateList g(View paramView)
    {
      return paramView.getBackgroundTintList();
    }
    
    public static PorterDuff.Mode h(View paramView)
    {
      return paramView.getBackgroundTintMode();
    }
    
    public static float i(View paramView)
    {
      return paramView.getElevation();
    }
    
    public static x j(@NonNull View paramView)
    {
      return x.a.a(paramView);
    }
    
    public static String k(View paramView)
    {
      return paramView.getTransitionName();
    }
    
    public static float l(View paramView)
    {
      return paramView.getTranslationZ();
    }
    
    public static float m(@NonNull View paramView)
    {
      return paramView.getZ();
    }
    
    public static boolean n(View paramView)
    {
      return paramView.hasNestedScrollingParent();
    }
    
    public static boolean o(View paramView)
    {
      return paramView.isImportantForAccessibility();
    }
    
    public static boolean p(View paramView)
    {
      return paramView.isNestedScrollingEnabled();
    }
    
    public static void q(View paramView, ColorStateList paramColorStateList)
    {
      paramView.setBackgroundTintList(paramColorStateList);
    }
    
    public static void r(View paramView, PorterDuff.Mode paramMode)
    {
      paramView.setBackgroundTintMode(paramMode);
    }
    
    public static void s(View paramView, float paramFloat)
    {
      paramView.setElevation(paramFloat);
    }
    
    public static void t(View paramView, boolean paramBoolean)
    {
      paramView.setNestedScrollingEnabled(paramBoolean);
    }
    
    public static void u(@NonNull View paramView, o paramo)
    {
      if (Build.VERSION.SDK_INT < 30) {
        paramView.setTag(c.L, paramo);
      }
      if (paramo == null)
      {
        paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)paramView.getTag(c.Q));
        return;
      }
      paramView.setOnApplyWindowInsetsListener(new a(paramo));
    }
    
    public static void v(View paramView, String paramString)
    {
      paramView.setTransitionName(paramString);
    }
    
    public static void w(View paramView, float paramFloat)
    {
      paramView.setTranslationZ(paramFloat);
    }
    
    public static void x(@NonNull View paramView, float paramFloat)
    {
      paramView.setZ(paramFloat);
    }
    
    public static boolean y(View paramView, int paramInt)
    {
      return paramView.startNestedScroll(paramInt);
    }
    
    public static void z(View paramView)
    {
      paramView.stopNestedScroll();
    }
    
    public class a
      implements View.OnApplyWindowInsetsListener
    {
      public x a = null;
      
      public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
      {
        paramView = x.t(paramWindowInsets, paramView);
        if (Build.VERSION.SDK_INT < 30)
        {
          s.k.a(paramWindowInsets, b);
          if (paramView.equals(a)) {
            throw null;
          }
        }
        a = paramView;
        throw null;
      }
    }
  }
  
  public static abstract class l
  {
    public static x a(@NonNull View paramView)
    {
      Object localObject = paramView.getRootWindowInsets();
      if (localObject == null) {
        return null;
      }
      localObject = x.s((WindowInsets)localObject);
      ((x)localObject).p((x)localObject);
      ((x)localObject).d(paramView.getRootView());
      return (x)localObject;
    }
    
    public static int b(@NonNull View paramView)
    {
      return paramView.getScrollIndicators();
    }
    
    public static void c(@NonNull View paramView, int paramInt)
    {
      paramView.setScrollIndicators(paramInt);
    }
    
    public static void d(@NonNull View paramView, int paramInt1, int paramInt2)
    {
      paramView.setScrollIndicators(paramInt1, paramInt2);
    }
  }
  
  public static abstract class m
  {
    public static void a(@NonNull View paramView, @NonNull s.p paramp)
    {
      Object localObject1 = (h)paramView.getTag(c.P);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new h();
        paramView.setTag(c.P, localObject2);
      }
      Objects.requireNonNull(paramp);
      localObject1 = new t(paramp);
      ((h)localObject2).put(paramp, localObject1);
      paramView.addOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener)localObject1);
    }
    
    public static CharSequence b(View paramView)
    {
      return paramView.getAccessibilityPaneTitle();
    }
    
    public static boolean c(View paramView)
    {
      return paramView.isAccessibilityHeading();
    }
    
    public static boolean d(View paramView)
    {
      return paramView.isScreenReaderFocusable();
    }
    
    public static void e(@NonNull View paramView, @NonNull s.p paramp)
    {
      h localh = (h)paramView.getTag(c.P);
      if (localh == null) {
        return;
      }
      paramp = (View.OnUnhandledKeyEventListener)localh.get(paramp);
      if (paramp != null) {
        paramView.removeOnUnhandledKeyEventListener(paramp);
      }
    }
    
    public static <T> T f(View paramView, int paramInt)
    {
      return paramView.requireViewById(paramInt);
    }
    
    public static void g(View paramView, boolean paramBoolean)
    {
      paramView.setAccessibilityHeading(paramBoolean);
    }
    
    public static void h(View paramView, CharSequence paramCharSequence)
    {
      paramView.setAccessibilityPaneTitle(paramCharSequence);
    }
    
    public static void i(View paramView, boolean paramBoolean)
    {
      paramView.setScreenReaderFocusable(paramBoolean);
    }
  }
  
  public static abstract class n
  {
    public static View.AccessibilityDelegate a(View paramView)
    {
      return paramView.getAccessibilityDelegate();
    }
    
    public static List<Rect> b(View paramView)
    {
      return paramView.getSystemGestureExclusionRects();
    }
    
    public static void c(@NonNull View paramView, @NonNull Context paramContext, @NonNull int[] paramArrayOfInt, AttributeSet paramAttributeSet, @NonNull TypedArray paramTypedArray, int paramInt1, int paramInt2)
    {
      paramView.saveAttributeDataForStyleable(paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
    }
    
    public static void d(View paramView, List<Rect> paramList)
    {
      paramView.setSystemGestureExclusionRects(paramList);
    }
  }
  
  public static abstract class o
  {
    public static CharSequence a(View paramView)
    {
      return paramView.getStateDescription();
    }
    
    public static void b(View paramView, CharSequence paramCharSequence)
    {
      paramView.setStateDescription(paramCharSequence);
    }
  }
  
  public static abstract interface p {}
  
  public static class q
  {
    public static final ArrayList d = new ArrayList();
    public WeakHashMap a = null;
    public SparseArray b = null;
    public WeakReference c = null;
    
    public static q a(View paramView)
    {
      q localq1 = (q)paramView.getTag(c.O);
      q localq2 = localq1;
      if (localq1 == null)
      {
        localq2 = new q();
        paramView.setTag(c.O, localq2);
      }
      return localq2;
    }
    
    public boolean b(View paramView, KeyEvent paramKeyEvent)
    {
      if (paramKeyEvent.getAction() == 0) {
        g();
      }
      paramView = c(paramView, paramKeyEvent);
      if (paramKeyEvent.getAction() == 0)
      {
        int i = paramKeyEvent.getKeyCode();
        if ((paramView != null) && (!KeyEvent.isModifierKey(i))) {
          d().put(i, new WeakReference(paramView));
        }
      }
      boolean bool;
      if (paramView != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final View c(View paramView, KeyEvent paramKeyEvent)
    {
      Object localObject = a;
      if ((localObject != null) && (((WeakHashMap)localObject).containsKey(paramView)))
      {
        if ((paramView instanceof ViewGroup))
        {
          localObject = (ViewGroup)paramView;
          for (int i = ((ViewGroup)localObject).getChildCount() - 1; i >= 0; i--)
          {
            View localView = c(((ViewGroup)localObject).getChildAt(i), paramKeyEvent);
            if (localView != null) {
              return localView;
            }
          }
        }
        if (e(paramView, paramKeyEvent)) {
          return paramView;
        }
      }
      return null;
    }
    
    public final SparseArray d()
    {
      if (b == null) {
        b = new SparseArray();
      }
      return b;
    }
    
    public final boolean e(View paramView, KeyEvent paramKeyEvent)
    {
      paramView = (ArrayList)paramView.getTag(c.P);
      if (paramView != null)
      {
        int i = paramView.size() - 1;
        if (i >= 0)
        {
          android.support.v4.media.a.a(paramView.get(i));
          throw null;
        }
      }
      return false;
    }
    
    public boolean f(KeyEvent paramKeyEvent)
    {
      Object localObject1 = c;
      if ((localObject1 != null) && (((Reference)localObject1).get() == paramKeyEvent)) {
        return false;
      }
      c = new WeakReference(paramKeyEvent);
      SparseArray localSparseArray = d();
      if (paramKeyEvent.getAction() == 1)
      {
        int i = localSparseArray.indexOfKey(paramKeyEvent.getKeyCode());
        if (i >= 0)
        {
          localObject1 = (WeakReference)localSparseArray.valueAt(i);
          localSparseArray.removeAt(i);
          break label80;
        }
      }
      localObject1 = null;
      label80:
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = (WeakReference)localSparseArray.get(paramKeyEvent.getKeyCode());
      }
      if (localObject2 != null)
      {
        localObject1 = (View)((Reference)localObject2).get();
        if ((localObject1 != null) && (s.t((View)localObject1))) {
          e((View)localObject1, paramKeyEvent);
        }
        return true;
      }
      return false;
    }
    
    public final void g()
    {
      WeakHashMap localWeakHashMap = a;
      if (localWeakHashMap != null) {
        localWeakHashMap.clear();
      }
      ArrayList localArrayList = d;
      if (localArrayList.isEmpty()) {
        return;
      }
      try
      {
        if (a == null)
        {
          localWeakHashMap = new java/util/WeakHashMap;
          localWeakHashMap.<init>();
          a = localWeakHashMap;
        }
      }
      finally
      {
        break label159;
      }
      Object localObject2;
      for (int i = localArrayList.size() - 1; i >= 0; i--)
      {
        localObject2 = d;
        View localView = (View)((WeakReference)((ArrayList)localObject2).get(i)).get();
        if (localView == null)
        {
          ((ArrayList)localObject2).remove(i);
        }
        else
        {
          a.put(localView, Boolean.TRUE);
          for (localObject2 = localView.getParent(); (localObject2 instanceof View); localObject2 = ((ViewParent)localObject2).getParent()) {
            a.put((View)localObject2, Boolean.TRUE);
          }
        }
      }
      return;
      label159:
      throw ((Throwable)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     I.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */