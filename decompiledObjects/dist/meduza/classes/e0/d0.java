package e0;

import a4.r;
import aa.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
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
import android.view.accessibility.AccessibilityRecord;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import d2.e;
import d2.k;
import f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

public final class d0
{
  public static WeakHashMap<View, o0> a;
  public static Field b;
  public static boolean c = false;
  public static final z d = new z();
  public static final a e = new a();
  
  @Deprecated
  public static o0 a(View paramView)
  {
    if (a == null) {
      a = new WeakHashMap();
    }
    o0 localo01 = (o0)a.get(paramView);
    o0 localo02 = localo01;
    if (localo01 == null)
    {
      localo02 = new o0(paramView);
      a.put(paramView, localo02);
    }
    return localo02;
  }
  
  public static boolean b(View paramView, KeyEvent paramKeyEvent)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 28) {
      return false;
    }
    Object localObject1 = m.d;
    Object localObject2 = (m)paramView.getTag(2131362042);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new m();
      paramView.setTag(2131362042, localObject1);
    }
    if (paramKeyEvent.getAction() == 0)
    {
      localObject2 = a;
      if (localObject2 != null) {
        ((WeakHashMap)localObject2).clear();
      }
      ArrayList localArrayList1 = m.d;
      if (!localArrayList1.isEmpty()) {
        label243:
        try
        {
          if (a == null)
          {
            localObject2 = new java/util/WeakHashMap;
            ((WeakHashMap)localObject2).<init>();
            a = ((WeakHashMap)localObject2);
          }
          int j;
          for (i = localArrayList1.size();; i = j)
          {
            j = i - 1;
            if (j < 0) {
              break label243;
            }
            ArrayList localArrayList2 = m.d;
            localObject2 = (View)((WeakReference)localArrayList2.get(j)).get();
            if (localObject2 != null) {
              break;
            }
            localArrayList2.remove(j);
          }
          a.put(localObject2, Boolean.TRUE);
          for (localObject2 = ((View)localObject2).getParent();; localObject2 = ((ViewParent)localObject2).getParent())
          {
            i = j;
            if (!(localObject2 instanceof View)) {
              break;
            }
            a.put((View)localObject2, Boolean.TRUE);
          }
        }
        finally {}
      }
    }
    paramView = ((m)localObject1).a(paramView, paramKeyEvent);
    if (paramKeyEvent.getAction() == 0)
    {
      i = paramKeyEvent.getKeyCode();
      if ((paramView != null) && (!KeyEvent.isModifierKey(i)))
      {
        if (b == null) {
          b = new SparseArray();
        }
        b.put(i, new WeakReference(paramView));
      }
    }
    if (paramView != null) {
      bool = true;
    }
    return bool;
  }
  
  public static View.AccessibilityDelegate c(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return h.a(paramView);
    }
    boolean bool = c;
    Object localObject1 = null;
    if (bool)
    {
      paramView = (View)localObject1;
    }
    else
    {
      if (b == null) {}
      try
      {
        Object localObject2 = View.class.getDeclaredField("mAccessibilityDelegate");
        b = (Field)localObject2;
        ((AccessibleObject)localObject2).setAccessible(true);
        localObject2 = b.get(paramView);
        paramView = (View)localObject1;
        if ((localObject2 instanceof View.AccessibilityDelegate)) {
          paramView = (View.AccessibilityDelegate)localObject2;
        }
      }
      finally
      {
        c = true;
        paramView = (View)localObject1;
      }
    }
    return paramView;
  }
  
  public static String[] d(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return j.a(paramView);
    }
    return (String[])paramView.getTag(2131362038);
  }
  
  public static void e(int paramInt, View paramView)
  {
    Object localObject1 = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
    if (!((AccessibilityManager)localObject1).isEnabled()) {
      return;
    }
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    int k = 0;
    int m;
    if (i >= 28) {
      m = 1;
    } else {
      m = 0;
    }
    List localList = null;
    Object localObject2 = null;
    Object localObject4;
    if (m != 0)
    {
      localObject4 = g.b(paramView);
    }
    else
    {
      localObject4 = paramView.getTag(2131362035);
      if (!CharSequence.class.isInstance(localObject4)) {
        localObject4 = null;
      }
    }
    if (((CharSequence)localObject4 != null) && (paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
      m = 1;
    } else {
      m = 0;
    }
    int n = paramView.getAccessibilityLiveRegion();
    int i1 = 32;
    Object localObject5;
    if ((n == 0) && (m == 0))
    {
      if (paramInt == 32)
      {
        localObject5 = AccessibilityEvent.obtain();
        paramView.onInitializeAccessibilityEvent((AccessibilityEvent)localObject5);
        ((AccessibilityEvent)localObject5).setEventType(32);
        ((AccessibilityEvent)localObject5).setContentChangeTypes(paramInt);
        ((AccessibilityRecord)localObject5).setSource(paramView);
        paramView.onPopulateAccessibilityEvent((AccessibilityEvent)localObject5);
        localList = ((AccessibilityRecord)localObject5).getText();
        paramInt = k;
        if (i >= 28) {
          paramInt = 1;
        }
        if (paramInt != 0)
        {
          paramView = g.b(paramView);
        }
        else
        {
          localObject4 = paramView.getTag(2131362035);
          paramView = (View)localObject2;
          if (CharSequence.class.isInstance(localObject4)) {
            paramView = (View)localObject4;
          }
        }
        localList.add((CharSequence)paramView);
        ((AccessibilityManager)localObject1).sendAccessibilityEvent((AccessibilityEvent)localObject5);
      }
      else if (paramView.getParent() != null)
      {
        localObject4 = paramView.getParent();
        try
        {
          ((ViewParent)localObject4).notifySubtreeAccessibilityStateChanged(paramView, paramView, paramInt);
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append(paramView.getParent().getClass().getSimpleName());
          ((StringBuilder)localObject4).append(" does not fully implement ViewParent");
          Log.e("ViewCompat", ((StringBuilder)localObject4).toString(), localAbstractMethodError);
        }
      }
    }
    else
    {
      localObject1 = AccessibilityEvent.obtain();
      if (m != 0) {
        k = i1;
      } else {
        k = 2048;
      }
      ((AccessibilityEvent)localObject1).setEventType(k);
      ((AccessibilityEvent)localObject1).setContentChangeTypes(paramInt);
      if (m != 0)
      {
        localObject5 = ((AccessibilityRecord)localObject1).getText();
        paramInt = j;
        if (i >= 28) {
          paramInt = 1;
        }
        if (paramInt != 0)
        {
          localObject4 = g.b(paramView);
        }
        else
        {
          Object localObject3 = paramView.getTag(2131362035);
          localObject4 = localList;
          if (CharSequence.class.isInstance(localObject3)) {
            localObject4 = localObject3;
          }
        }
        ((List)localObject5).add((CharSequence)localObject4);
        if (paramView.getImportantForAccessibility() == 0) {
          paramView.setImportantForAccessibility(1);
        }
      }
      paramView.sendAccessibilityEventUnchecked((AccessibilityEvent)localObject1);
    }
  }
  
  public static c f(View paramView, c paramc)
  {
    if (Log.isLoggable("ViewCompat", 3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("performReceiveContent: ");
      ((StringBuilder)localObject).append(paramc);
      ((StringBuilder)localObject).append(", view=");
      ((StringBuilder)localObject).append(paramView.getClass().getSimpleName());
      ((StringBuilder)localObject).append("[");
      ((StringBuilder)localObject).append(paramView.getId());
      ((StringBuilder)localObject).append("]");
      Log.d("ViewCompat", ((StringBuilder)localObject).toString());
    }
    if (Build.VERSION.SDK_INT >= 31) {
      return j.b(paramView, paramc);
    }
    Object localObject = (u)paramView.getTag(2131362037);
    if (localObject != null)
    {
      paramc = ((u)localObject).a(paramView, paramc);
      if (paramc == null)
      {
        paramView = null;
      }
      else
      {
        if ((paramView instanceof v)) {
          paramView = (v)paramView;
        } else {
          paramView = d;
        }
        paramView = paramView.a(paramc);
      }
      return paramView;
    }
    if ((paramView instanceof v)) {
      paramView = (v)paramView;
    } else {
      paramView = d;
    }
    return paramView.a(paramc);
  }
  
  public static void g(View paramView, Context paramContext, int[] paramArrayOfInt, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      h.d(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt, 0);
    }
  }
  
  public static void h(View paramView, a parama)
  {
    a locala = parama;
    if (parama == null)
    {
      locala = parama;
      if ((c(paramView) instanceof a.a)) {
        locala = new a();
      }
    }
    if (paramView.getImportantForAccessibility() == 0) {
      paramView.setImportantForAccessibility(1);
    }
    if (locala == null) {
      parama = null;
    } else {
      parama = b;
    }
    paramView.setAccessibilityDelegate(parama);
  }
  
  public static void i(View paramView, CharSequence paramCharSequence)
  {
    new b0(CharSequence.class).e(paramView, paramCharSequence);
    if (paramCharSequence != null)
    {
      paramCharSequence = e;
      WeakHashMap localWeakHashMap = a;
      boolean bool;
      if ((paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      localWeakHashMap.put(paramView, Boolean.valueOf(bool));
      paramView.addOnAttachStateChangeListener(paramCharSequence);
      if (paramView.isAttachedToWindow()) {
        paramView.getViewTreeObserver().addOnGlobalLayoutListener(paramCharSequence);
      }
    }
    else
    {
      paramCharSequence = e;
      a.remove(paramView);
      paramView.removeOnAttachStateChangeListener(paramCharSequence);
      paramView.getViewTreeObserver().removeOnGlobalLayoutListener(paramCharSequence);
    }
  }
  
  public static final class a
    implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener
  {
    public final WeakHashMap<View, Boolean> a = new WeakHashMap();
    
    public final void onGlobalLayout()
    {
      if (Build.VERSION.SDK_INT < 28)
      {
        Iterator localIterator = a.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          View localView = (View)localEntry.getKey();
          boolean bool1 = ((Boolean)localEntry.getValue()).booleanValue();
          boolean bool2;
          if ((localView.isShown()) && (localView.getWindowVisibility() == 0)) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          if (bool1 != bool2)
          {
            int i;
            if (bool2) {
              i = 16;
            } else {
              i = 32;
            }
            d0.e(i, localView);
            localEntry.setValue(Boolean.valueOf(bool2));
          }
        }
      }
    }
    
    public final void onViewAttachedToWindow(View paramView)
    {
      paramView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
    
    public final void onViewDetachedFromWindow(View paramView) {}
  }
  
  public static abstract class b<T>
  {
    public final int a;
    public final Class<T> b;
    public final int c;
    public final int d;
    
    public b(int paramInt1, Class<T> paramClass, int paramInt2, int paramInt3)
    {
      a = paramInt1;
      b = paramClass;
      d = paramInt2;
      c = paramInt3;
    }
    
    public static boolean a(Boolean paramBoolean1, Boolean paramBoolean2)
    {
      boolean bool = true;
      int i;
      if ((paramBoolean1 != null) && (paramBoolean1.booleanValue())) {
        i = 1;
      } else {
        i = 0;
      }
      int j;
      if ((paramBoolean2 != null) && (paramBoolean2.booleanValue())) {
        j = 1;
      } else {
        j = 0;
      }
      if (i != j) {
        bool = false;
      }
      return bool;
    }
    
    public abstract T b(View paramView);
    
    public abstract void c(View paramView, T paramT);
    
    public final T d(View paramView)
    {
      int i;
      if (Build.VERSION.SDK_INT >= c) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        return (T)b(paramView);
      }
      paramView = paramView.getTag(a);
      if (b.isInstance(paramView)) {
        return paramView;
      }
      return null;
    }
    
    public final void e(View paramView, T paramT)
    {
      int i;
      if (Build.VERSION.SDK_INT >= c) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        c(paramView, paramT);
      }
      else if (f(d(paramView), paramT))
      {
        Object localObject1 = d0.c(paramView);
        if (localObject1 == null) {
          localObject1 = null;
        } else if ((localObject1 instanceof a.a)) {
          localObject1 = a;
        } else {
          localObject1 = new a((View.AccessibilityDelegate)localObject1);
        }
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new a();
        }
        d0.h(paramView, (a)localObject2);
        paramView.setTag(a, paramT);
        d0.e(d, paramView);
      }
    }
    
    public abstract boolean f(T paramT1, T paramT2);
  }
  
  public static final class c
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
  
  public static final class d
  {
    public static void a(WindowInsets paramWindowInsets, View paramView)
    {
      View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(2131362044);
      if (localOnApplyWindowInsetsListener != null) {
        localOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
      }
    }
    
    public static s0 b(View paramView, s0 params0, Rect paramRect)
    {
      WindowInsets localWindowInsets = params0.b();
      if (localWindowInsets != null) {
        return s0.c(paramView.computeSystemWindowInsets(localWindowInsets, paramRect), paramView);
      }
      paramRect.setEmpty();
      return params0;
    }
    
    public static boolean c(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return paramView.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
    }
    
    public static boolean d(View paramView, float paramFloat1, float paramFloat2)
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
    
    public static s0 j(View paramView)
    {
      if ((s0.a.d) && (paramView.isAttachedToWindow()))
      {
        Object localObject = paramView.getRootView();
        try
        {
          localObject = s0.a.a.get(localObject);
          if (localObject != null)
          {
            Rect localRect1 = (Rect)s0.a.b.get(localObject);
            Rect localRect2 = (Rect)s0.a.c.get(localObject);
            if ((localRect1 != null) && (localRect2 != null))
            {
              int i = Build.VERSION.SDK_INT;
              if (i >= 30)
              {
                localObject = new e0/s0$d;
                ((s0.d)localObject).<init>();
              }
              else if (i >= 29)
              {
                localObject = new s0.c();
              }
              else
              {
                localObject = new s0.b();
              }
              ((s0.e)localObject).c(x.b.a(left, top, right, bottom));
              ((s0.e)localObject).d(x.b.a(left, top, right, bottom));
              localObject = ((s0.e)localObject).b();
              a.l((s0)localObject);
              paramView = paramView.getRootView();
              a.d(paramView);
              paramView = (View)localObject;
            }
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          paramView = f.l("Failed to get insets from AttachInfo. ");
          paramView.append(localIllegalAccessException.getMessage());
          Log.w("WindowInsetsCompat", paramView.toString(), localIllegalAccessException);
        }
      }
      paramView = null;
      return paramView;
    }
    
    public static String k(View paramView)
    {
      return paramView.getTransitionName();
    }
    
    public static float l(View paramView)
    {
      return paramView.getTranslationZ();
    }
    
    public static float m(View paramView)
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
    
    public static void u(View paramView, final t paramt)
    {
      if (Build.VERSION.SDK_INT < 30) {
        paramView.setTag(2131362036, paramt);
      }
      if (paramt == null)
      {
        paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)paramView.getTag(2131362044));
        return;
      }
      paramView.setOnApplyWindowInsetsListener(new a(paramt));
    }
    
    public static void v(View paramView, String paramString)
    {
      paramView.setTransitionName(paramString);
    }
    
    public static void w(View paramView, float paramFloat)
    {
      paramView.setTranslationZ(paramFloat);
    }
    
    public static void x(View paramView, float paramFloat)
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
    
    public final class a
      implements View.OnApplyWindowInsetsListener
    {
      public s0 a = null;
      
      public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
      {
        s0 locals0 = s0.c(paramWindowInsets, paramView);
        int i = Build.VERSION.SDK_INT;
        if (i < 30)
        {
          d0.d.a(paramWindowInsets, b);
          if (locals0.equals(a)) {
            return ((g.h)paramt).a(paramView, locals0).b();
          }
        }
        a = locals0;
        paramWindowInsets = ((g.h)paramt).a(paramView, locals0);
        if (i >= 30) {
          return paramWindowInsets.b();
        }
        d0.c.c(paramView);
        return paramWindowInsets.b();
      }
    }
  }
  
  public static final class e
  {
    public static s0 a(View paramView)
    {
      Object localObject = paramView.getRootWindowInsets();
      if (localObject == null) {
        return null;
      }
      localObject = s0.c((WindowInsets)localObject, null);
      a.l((s0)localObject);
      paramView = paramView.getRootView();
      a.d(paramView);
      return (s0)localObject;
    }
    
    public static int b(View paramView)
    {
      return paramView.getScrollIndicators();
    }
    
    public static void c(View paramView, int paramInt)
    {
      paramView.setScrollIndicators(paramInt);
    }
    
    public static void d(View paramView, int paramInt1, int paramInt2)
    {
      paramView.setScrollIndicators(paramInt1, paramInt2);
    }
  }
  
  public static final class f
  {
    public static void a(View paramView, Collection<View> paramCollection, int paramInt)
    {
      c0.b.t(paramView, paramCollection, paramInt);
    }
    
    public static AutofillId b(View paramView)
    {
      return e.i(paramView);
    }
    
    public static int c(View paramView)
    {
      return com.google.android.gms.internal.base.a.d(paramView);
    }
    
    public static int d(View paramView)
    {
      return com.google.android.gms.internal.base.a.z(paramView);
    }
    
    public static boolean e(View paramView)
    {
      return c0.b.C(paramView);
    }
    
    public static boolean f(View paramView)
    {
      return e.x(paramView);
    }
    
    public static boolean g(View paramView)
    {
      return e.v(paramView);
    }
    
    public static boolean h(View paramView)
    {
      return c0.b.B(paramView);
    }
    
    public static View i(View paramView1, View paramView2, int paramInt)
    {
      return c0.b.k(paramView1, paramView2, paramInt);
    }
    
    public static boolean j(View paramView)
    {
      return com.google.android.gms.internal.base.a.w(paramView);
    }
    
    public static void k(View paramView, String... paramVarArgs)
    {
      e.s(paramView, paramVarArgs);
    }
    
    public static void l(View paramView, boolean paramBoolean)
    {
      c0.b.u(paramView, paramBoolean);
    }
    
    public static void m(View paramView, int paramInt)
    {
      com.google.android.gms.internal.base.a.A(paramInt, paramView);
    }
    
    public static void n(View paramView, boolean paramBoolean)
    {
      e.r(paramView, paramBoolean);
    }
    
    public static void o(View paramView, int paramInt)
    {
      com.google.android.gms.internal.base.a.p(paramInt, paramView);
    }
    
    public static void p(View paramView, CharSequence paramCharSequence)
    {
      e.q(paramView, paramCharSequence);
    }
  }
  
  public static final class g
  {
    public static void a(View paramView, d0.l paraml)
    {
      Object localObject1 = (r.h)paramView.getTag(2131362043);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new r.h();
        paramView.setTag(2131362043, localObject2);
      }
      Objects.requireNonNull(paraml);
      localObject1 = new e0(paraml);
      ((r.h)localObject2).put(paraml, localObject1);
      com.google.android.recaptcha.internal.a.m(paramView, (e0)localObject1);
    }
    
    public static CharSequence b(View paramView)
    {
      return k.e(paramView);
    }
    
    public static boolean c(View paramView)
    {
      return k.m(paramView);
    }
    
    public static boolean d(View paramView)
    {
      return k.k(paramView);
    }
    
    public static void e(View paramView, d0.l paraml)
    {
      r.h localh = (r.h)paramView.getTag(2131362043);
      if (localh == null) {
        return;
      }
      paraml = (View.OnUnhandledKeyEventListener)localh.getOrDefault(paraml, null);
      if (paraml != null) {
        k.j(paramView, paraml);
      }
    }
    
    public static <T> T f(View paramView, int paramInt)
    {
      return com.google.android.recaptcha.internal.a.i(paramInt, paramView);
    }
    
    public static void g(View paramView, boolean paramBoolean)
    {
      android.support.v4.media.session.b.r(paramView, paramBoolean);
    }
    
    public static void h(View paramView, CharSequence paramCharSequence)
    {
      com.google.android.recaptcha.internal.a.n(paramView, paramCharSequence);
    }
    
    public static void i(View paramView, g0.a parama)
    {
      android.support.v4.media.session.b.i(paramView);
    }
    
    public static void j(View paramView, boolean paramBoolean)
    {
      android.support.v4.media.session.b.j(paramView, paramBoolean);
    }
  }
  
  public static final class h
  {
    public static View.AccessibilityDelegate a(View paramView)
    {
      return aa.v.f(paramView);
    }
    
    public static ContentCaptureSession b(View paramView)
    {
      return w.f(paramView);
    }
    
    public static List<Rect> c(View paramView)
    {
      return aa.u.f(paramView);
    }
    
    public static void d(View paramView, Context paramContext, int[] paramArrayOfInt, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2)
    {
      w.n(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
    }
    
    public static void e(View paramView, h0.a parama)
    {
      aa.v.m(paramView);
    }
    
    public static void f(View paramView, List<Rect> paramList)
    {
      aa.u.m(paramView, paramList);
    }
  }
  
  public static final class i
  {
    public static int a(View paramView)
    {
      return g0.a(paramView);
    }
    
    public static CharSequence b(View paramView)
    {
      return d3.a.e(paramView);
    }
    
    public static boolean c(View paramView)
    {
      return f0.h(paramView);
    }
    
    public static void d(View paramView, int paramInt)
    {
      f0.e(paramInt, paramView);
    }
    
    public static void e(View paramView, CharSequence paramCharSequence)
    {
      g0.g(paramView, paramCharSequence);
    }
  }
  
  public static final class j
  {
    public static String[] a(View paramView)
    {
      return r.k(paramView);
    }
    
    public static c b(View paramView, c paramc)
    {
      ContentInfo localContentInfo = a.b();
      Objects.requireNonNull(localContentInfo);
      paramView = h0.e(paramView, localContentInfo);
      if (paramView == null) {
        return null;
      }
      if (paramView == localContentInfo) {
        return paramc;
      }
      return new c(new c.d(paramView));
    }
    
    public static void c(View paramView, String[] paramArrayOfString, u paramu)
    {
      if (paramu == null) {
        i0.e(paramView, paramArrayOfString);
      } else {
        h0.i(paramView, paramArrayOfString, new d0.k(paramu));
      }
    }
  }
  
  public static final class k
    implements OnReceiveContentListener
  {
    public final u a;
    
    public k(u paramu)
    {
      a = paramu;
    }
    
    public final ContentInfo onReceiveContent(View paramView, ContentInfo paramContentInfo)
    {
      c localc = new c(new c.d(paramContentInfo));
      paramView = a.a(paramView, localc);
      if (paramView == null) {
        return null;
      }
      if (paramView == localc) {
        return paramContentInfo;
      }
      paramView = a.b();
      Objects.requireNonNull(paramView);
      return paramView;
    }
  }
  
  public static abstract interface l
  {
    public abstract boolean a();
  }
  
  public static final class m
  {
    public static final ArrayList<WeakReference<View>> d = new ArrayList();
    public WeakHashMap<View, Boolean> a = null;
    public SparseArray<WeakReference<View>> b = null;
    public WeakReference<KeyEvent> c = null;
    
    public static boolean b(View paramView, KeyEvent paramKeyEvent)
    {
      paramView = (ArrayList)paramView.getTag(2131362043);
      if (paramView != null) {
        for (int i = paramView.size() - 1; i >= 0; i--) {
          if (((d0.l)paramView.get(i)).a()) {
            return true;
          }
        }
      }
      return false;
    }
    
    public final View a(View paramView, KeyEvent paramKeyEvent)
    {
      Object localObject = a;
      if ((localObject != null) && (((WeakHashMap)localObject).containsKey(paramView)))
      {
        if ((paramView instanceof ViewGroup))
        {
          localObject = (ViewGroup)paramView;
          int i = ((ViewGroup)localObject).getChildCount();
          View localView;
          do
          {
            i--;
            if (i < 0) {
              break;
            }
            localView = a(((ViewGroup)localObject).getChildAt(i), paramKeyEvent);
          } while (localView == null);
          return localView;
        }
        if (b(paramView, paramKeyEvent)) {
          return paramView;
        }
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     e0.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */