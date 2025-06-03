// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I;

import android.view.accessibility.AccessibilityRecord;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import android.view.View$OnUnhandledKeyEventListener;
import java.util.Objects;
import t.h;
import android.view.View$OnApplyWindowInsetsListener;
import android.graphics.Paint;
import android.view.Display;
import androidx.annotation.NonNull;
import android.view.ViewTreeObserver;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Iterator;
import java.util.Map;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.KeyEvent;
import android.view.WindowInsets;
import android.graphics.Rect;
import android.view.ViewParent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View$AccessibilityDelegate;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import v.c;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class s
{
    public static final AtomicInteger a;
    public static WeakHashMap b;
    public static Field c;
    public static boolean d;
    public static final int[] e;
    public static final I.p f;
    public static final e g;
    
    static {
        a = new AtomicInteger(1);
        s.b = null;
        s.d = false;
        e = new int[] { v.c.b, v.c.c, v.c.n, v.c.y, v.c.B, v.c.C, v.c.D, v.c.E, v.c.F, v.c.G, v.c.d, v.c.e, v.c.f, v.c.g, v.c.h, v.c.i, v.c.j, v.c.k, v.c.l, v.c.m, v.c.o, v.c.p, v.c.q, v.c.r, v.c.s, v.c.t, v.c.u, v.c.v, v.c.w, v.c.x, v.c.z, v.c.A };
        f = new r();
        g = new e();
    }
    
    public static void A(final View view) {
        j.c(view);
    }
    
    public static void B(final View view, final Context context, final int[] array, final AttributeSet set, final TypedArray typedArray, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 29) {
            s.n.c(view, context, array, set, typedArray, n, n2);
        }
    }
    
    public static f C() {
        return (f)new f(v.c.M, Boolean.class, 28) {
            public Boolean e(final View view) {
                return m.d(view);
            }
        };
    }
    
    public static void D(final View view, final a a) {
        a a2 = a;
        if (a == null) {
            a2 = a;
            if (f(view) instanceof a.a) {
                a2 = new a();
            }
        }
        View$AccessibilityDelegate d;
        if (a2 == null) {
            d = null;
        }
        else {
            d = a2.d();
        }
        view.setAccessibilityDelegate(d);
    }
    
    public static void E(final View view, final Drawable drawable) {
        s.g.q(view, drawable);
    }
    
    public static void F(final View view, final ColorStateList list) {
        k.q(view, list);
    }
    
    public static void G(final View view, final PorterDuff$Mode porterDuff$Mode) {
        k.r(view, porterDuff$Mode);
    }
    
    public static void H(final View view, final int n) {
        s.g.s(view, n);
    }
    
    public static void I(final View view, final String s) {
        k.v(view, s);
    }
    
    public static void J(final View view) {
        if (l(view) == 0) {
            H(view, 1);
        }
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            if (l((View)viewParent) == 4) {
                H(view, 2);
                return;
            }
        }
    }
    
    public static f K() {
        return (f)new f(v.c.N, CharSequence.class, 64, 30) {
            public CharSequence e(final View view) {
                return o.a(view);
            }
        };
    }
    
    public static void L(final View view) {
        k.z(view);
    }
    
    public static f a() {
        return (f)new f(v.c.J, Boolean.class, 28) {
            public Boolean e(final View view) {
                return m.c(view);
            }
        };
    }
    
    public static x b(final View view, final x x, final Rect rect) {
        return k.b(view, x, rect);
    }
    
    public static x c(final View view, final x x) {
        final WindowInsets r = x.r();
        if (r != null) {
            final WindowInsets a = j.a(view, r);
            if (!a.equals((Object)r)) {
                return x.t(a, view);
            }
        }
        return x;
    }
    
    public static boolean d(final View view, final KeyEvent keyEvent) {
        return Build$VERSION.SDK_INT < 28 && q.a(view).b(view, keyEvent);
    }
    
    public static boolean e(final View view, final KeyEvent keyEvent) {
        return Build$VERSION.SDK_INT < 28 && q.a(view).f(keyEvent);
    }
    
    public static View$AccessibilityDelegate f(final View view) {
        if (Build$VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        return g(view);
    }
    
    public static View$AccessibilityDelegate g(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            8
        //     6: aconst_null    
        //     7: areturn        
        //     8: getstatic       I/s.c:Ljava/lang/reflect/Field;
        //    11: ifnonnull       41
        //    14: ldc             Landroid/view/View;.class
        //    16: ldc_w           "mAccessibilityDelegate"
        //    19: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    22: astore_1       
        //    23: aload_1        
        //    24: putstatic       I/s.c:Ljava/lang/reflect/Field;
        //    27: aload_1        
        //    28: iconst_1       
        //    29: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    32: goto            41
        //    35: iconst_1       
        //    36: putstatic       I/s.d:Z
        //    39: aconst_null    
        //    40: areturn        
        //    41: getstatic       I/s.c:Ljava/lang/reflect/Field;
        //    44: aload_0        
        //    45: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    48: astore_0       
        //    49: aload_0        
        //    50: instanceof      Landroid/view/View$AccessibilityDelegate;
        //    53: ifeq            63
        //    56: aload_0        
        //    57: checkcast       Landroid/view/View$AccessibilityDelegate;
        //    60: astore_0       
        //    61: aload_0        
        //    62: areturn        
        //    63: aconst_null    
        //    64: areturn        
        //    65: iconst_1       
        //    66: putstatic       I/s.d:Z
        //    69: aconst_null    
        //    70: areturn        
        //    71: astore_0       
        //    72: goto            35
        //    75: astore_0       
        //    76: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     32     71     41     Any
        //  41     61     75     71     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static int h(final View view) {
        return i.a(view);
    }
    
    public static CharSequence i(final View view) {
        return (CharSequence)w().d(view);
    }
    
    public static ColorStateList j(final View view) {
        return k.g(view);
    }
    
    public static PorterDuff$Mode k(final View view) {
        return k.h(view);
    }
    
    public static int l(final View view) {
        return s.g.c(view);
    }
    
    public static int m(final View view) {
        return h.d(view);
    }
    
    public static int n(final View view) {
        return s.g.d(view);
    }
    
    public static x o(final View view) {
        return l.a(view);
    }
    
    public static CharSequence p(final View view) {
        return (CharSequence)K().d(view);
    }
    
    public static String q(final View view) {
        return k.k(view);
    }
    
    public static int r(final View view) {
        return s.g.g(view);
    }
    
    public static boolean s(final View view) {
        final Boolean b = (Boolean)a().d(view);
        return b != null && b;
    }
    
    public static boolean t(final View view) {
        return i.b(view);
    }
    
    public static boolean u(final View view) {
        final Boolean b = (Boolean)C().d(view);
        return b != null && b;
    }
    
    public static void v(final View source, final int n) {
        final AccessibilityManager accessibilityManager = (AccessibilityManager)source.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        final boolean b = i(source) != null && source.isShown() && source.getWindowVisibility() == 0;
        final int h = h(source);
        int eventType = 32;
        if (h == 0) {
            if (!b) {
                if (n == 32) {
                    final AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    source.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    i.g(obtain, n);
                    ((AccessibilityRecord)obtain).setSource(source);
                    source.onPopulateAccessibilityEvent(obtain);
                    ((AccessibilityRecord)obtain).getText().add(i(source));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (source.getParent() == null) {
                    return;
                }
                final ViewParent parent = source.getParent();
                try {
                    i.e(parent, source, source, n);
                    return;
                }
                catch (AbstractMethodError abstractMethodError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(source.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), (Throwable)abstractMethodError);
                    return;
                }
            }
        }
        final AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!b) {
            eventType = 2048;
        }
        obtain2.setEventType(eventType);
        i.g(obtain2, n);
        if (b) {
            ((AccessibilityRecord)obtain2).getText().add(i(source));
            J(source);
        }
        source.sendAccessibilityEventUnchecked(obtain2);
    }
    
    public static f w() {
        return (f)new f(v.c.K, CharSequence.class, 8, 28) {
            public CharSequence e(final View view) {
                return m.b(view);
            }
        };
    }
    
    public static void x(final View view) {
        s.g.k(view);
    }
    
    public static void y(final View view, final Runnable runnable) {
        s.g.m(view, runnable);
    }
    
    public static void z(final View view, final Runnable runnable, final long n) {
        s.g.n(view, runnable, n);
    }
    
    public static class e implements ViewTreeObserver$OnGlobalLayoutListener, View$OnAttachStateChangeListener
    {
        public final WeakHashMap o;
        
        public e() {
            this.o = new WeakHashMap();
        }
        
        public final void a(final View key, final boolean b) {
            final boolean b2 = key.isShown() && key.getWindowVisibility() == 0;
            if (b != b2) {
                int n;
                if (b2) {
                    n = 16;
                }
                else {
                    n = 32;
                }
                s.v(key, n);
                this.o.put(key, b2);
            }
        }
        
        public final void b(final View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        
        public void onGlobalLayout() {
            if (Build$VERSION.SDK_INT < 28) {
                for (final Map.Entry<View, V> entry : this.o.entrySet()) {
                    this.a(entry.getKey(), (boolean)entry.getValue());
                }
            }
        }
        
        public void onViewAttachedToWindow(final View view) {
            this.b(view);
        }
        
        public void onViewDetachedFromWindow(final View view) {
        }
    }
    
    public abstract static class f
    {
        public final int a;
        public final Class b;
        public final int c;
        public final int d;
        
        public f(final int n, final Class clazz, final int n2) {
            this(n, clazz, 0, n2);
        }
        
        public f(final int a, final Class b, final int d, final int c) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.c = c;
        }
        
        public final boolean a() {
            return true;
        }
        
        public final boolean b() {
            return Build$VERSION.SDK_INT >= this.c;
        }
        
        public abstract Object c(final View p0);
        
        public Object d(final View view) {
            if (this.b()) {
                return this.c(view);
            }
            if (this.a()) {
                final Object tag = view.getTag(this.a);
                if (this.b.isInstance(tag)) {
                    return tag;
                }
            }
            return null;
        }
    }
    
    public abstract static class g
    {
        public static AccessibilityNodeProvider a(final View view) {
            return view.getAccessibilityNodeProvider();
        }
        
        public static boolean b(final View view) {
            return view.getFitsSystemWindows();
        }
        
        public static int c(final View view) {
            return view.getImportantForAccessibility();
        }
        
        public static int d(final View view) {
            return view.getMinimumHeight();
        }
        
        public static int e(final View view) {
            return view.getMinimumWidth();
        }
        
        public static ViewParent f(final View view) {
            return view.getParentForAccessibility();
        }
        
        public static int g(final View view) {
            return view.getWindowSystemUiVisibility();
        }
        
        public static boolean h(final View view) {
            return view.hasOverlappingRendering();
        }
        
        public static boolean i(final View view) {
            return view.hasTransientState();
        }
        
        public static boolean j(final View view, final int n, final Bundle bundle) {
            return view.performAccessibilityAction(n, bundle);
        }
        
        public static void k(final View view) {
            view.postInvalidateOnAnimation();
        }
        
        public static void l(final View view, final int n, final int n2, final int n3, final int n4) {
            view.postInvalidateOnAnimation(n, n2, n3, n4);
        }
        
        public static void m(final View view, final Runnable runnable) {
            view.postOnAnimation(runnable);
        }
        
        public static void n(final View view, final Runnable runnable, final long n) {
            view.postOnAnimationDelayed(runnable, n);
        }
        
        public static void o(final ViewTreeObserver viewTreeObserver, final ViewTreeObserver$OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener);
        }
        
        public static void p(final View view) {
            view.requestFitSystemWindows();
        }
        
        public static void q(final View view, final Drawable background) {
            view.setBackground(background);
        }
        
        public static void r(final View view, final boolean hasTransientState) {
            view.setHasTransientState(hasTransientState);
        }
        
        public static void s(final View view, final int importantForAccessibility) {
            view.setImportantForAccessibility(importantForAccessibility);
        }
    }
    
    public abstract static class h
    {
        public static int a() {
            return View.generateViewId();
        }
        
        public static Display b(@NonNull final View view) {
            return view.getDisplay();
        }
        
        public static int c(final View view) {
            return view.getLabelFor();
        }
        
        public static int d(final View view) {
            return view.getLayoutDirection();
        }
        
        public static int e(final View view) {
            return view.getPaddingEnd();
        }
        
        public static int f(final View view) {
            return view.getPaddingStart();
        }
        
        public static boolean g(final View view) {
            return view.isPaddingRelative();
        }
        
        public static void h(final View view, final int labelFor) {
            view.setLabelFor(labelFor);
        }
        
        public static void i(final View view, final Paint layerPaint) {
            view.setLayerPaint(layerPaint);
        }
        
        public static void j(final View view, final int layoutDirection) {
            view.setLayoutDirection(layoutDirection);
        }
        
        public static void k(final View view, final int n, final int n2, final int n3, final int n4) {
            view.setPaddingRelative(n, n2, n3, n4);
        }
    }
    
    public abstract static class i
    {
        public static int a(final View view) {
            return view.getAccessibilityLiveRegion();
        }
        
        public static boolean b(@NonNull final View view) {
            return view.isAttachedToWindow();
        }
        
        public static boolean c(@NonNull final View view) {
            return view.isLaidOut();
        }
        
        public static boolean d(@NonNull final View view) {
            return view.isLayoutDirectionResolved();
        }
        
        public static void e(final ViewParent viewParent, final View view, final View view2, final int n) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, n);
        }
        
        public static void f(final View view, final int accessibilityLiveRegion) {
            view.setAccessibilityLiveRegion(accessibilityLiveRegion);
        }
        
        public static void g(final AccessibilityEvent accessibilityEvent, final int contentChangeTypes) {
            accessibilityEvent.setContentChangeTypes(contentChangeTypes);
        }
    }
    
    public abstract static class j
    {
        public static WindowInsets a(final View view, final WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }
        
        public static WindowInsets b(final View view, final WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }
        
        public static void c(final View view) {
            view.requestApplyInsets();
        }
    }
    
    public abstract static class k
    {
        public static void a(@NonNull final WindowInsets windowInsets, @NonNull final View view) {
            final View$OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener = (View$OnApplyWindowInsetsListener)view.getTag(v.c.Q);
            if (view$OnApplyWindowInsetsListener != null) {
                view$OnApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }
        
        public static x b(@NonNull final View view, @NonNull final x x, @NonNull final Rect rect) {
            final WindowInsets r = x.r();
            if (r != null) {
                return x.t(view.computeSystemWindowInsets(r, rect), view);
            }
            rect.setEmpty();
            return x;
        }
        
        public static boolean c(@NonNull final View view, final float n, final float n2, final boolean b) {
            return view.dispatchNestedFling(n, n2, b);
        }
        
        public static boolean d(@NonNull final View view, final float n, final float n2) {
            return view.dispatchNestedPreFling(n, n2);
        }
        
        public static boolean e(final View view, final int n, final int n2, final int[] array, final int[] array2) {
            return view.dispatchNestedPreScroll(n, n2, array, array2);
        }
        
        public static boolean f(final View view, final int n, final int n2, final int n3, final int n4, final int[] array) {
            return view.dispatchNestedScroll(n, n2, n3, n4, array);
        }
        
        public static ColorStateList g(final View view) {
            return view.getBackgroundTintList();
        }
        
        public static PorterDuff$Mode h(final View view) {
            return view.getBackgroundTintMode();
        }
        
        public static float i(final View view) {
            return view.getElevation();
        }
        
        public static x j(@NonNull final View view) {
            return x.a.a(view);
        }
        
        public static String k(final View view) {
            return view.getTransitionName();
        }
        
        public static float l(final View view) {
            return view.getTranslationZ();
        }
        
        public static float m(@NonNull final View view) {
            return view.getZ();
        }
        
        public static boolean n(final View view) {
            return view.hasNestedScrollingParent();
        }
        
        public static boolean o(final View view) {
            return view.isImportantForAccessibility();
        }
        
        public static boolean p(final View view) {
            return view.isNestedScrollingEnabled();
        }
        
        public static void q(final View view, final ColorStateList backgroundTintList) {
            view.setBackgroundTintList(backgroundTintList);
        }
        
        public static void r(final View view, final PorterDuff$Mode backgroundTintMode) {
            view.setBackgroundTintMode(backgroundTintMode);
        }
        
        public static void s(final View view, final float elevation) {
            view.setElevation(elevation);
        }
        
        public static void t(final View view, final boolean nestedScrollingEnabled) {
            view.setNestedScrollingEnabled(nestedScrollingEnabled);
        }
        
        public static void u(@NonNull final View view, final I.o o) {
            if (Build$VERSION.SDK_INT < 30) {
                view.setTag(v.c.L, (Object)o);
            }
            if (o == null) {
                view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)view.getTag(v.c.Q));
                return;
            }
            view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new View$OnApplyWindowInsetsListener() {
                public x a = null;
                
                public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
                    final x t = x.t(windowInsets, view);
                    if (Build$VERSION.SDK_INT < 30) {
                        k.a(windowInsets, view);
                        if (t.equals(this.a)) {
                            throw null;
                        }
                    }
                    this.a = t;
                    throw null;
                }
            });
        }
        
        public static void v(final View view, final String transitionName) {
            view.setTransitionName(transitionName);
        }
        
        public static void w(final View view, final float translationZ) {
            view.setTranslationZ(translationZ);
        }
        
        public static void x(@NonNull final View view, final float z) {
            view.setZ(z);
        }
        
        public static boolean y(final View view, final int n) {
            return view.startNestedScroll(n);
        }
        
        public static void z(final View view) {
            view.stopNestedScroll();
        }
    }
    
    public abstract static class l
    {
        public static x a(@NonNull final View view) {
            final WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            final x s = x.s(rootWindowInsets);
            s.p(s);
            s.d(view.getRootView());
            return s;
        }
        
        public static int b(@NonNull final View view) {
            return view.getScrollIndicators();
        }
        
        public static void c(@NonNull final View view, final int scrollIndicators) {
            view.setScrollIndicators(scrollIndicators);
        }
        
        public static void d(@NonNull final View view, final int n, final int n2) {
            view.setScrollIndicators(n, n2);
        }
    }
    
    public abstract static class m
    {
        public static void a(@NonNull final View view, @NonNull final p obj) {
            t.h h;
            if ((h = (t.h)view.getTag(v.c.P)) == null) {
                h = new t.h();
                view.setTag(v.c.P, (Object)h);
            }
            Objects.requireNonNull(obj);
            final t t = new t(obj);
            h.put(obj, t);
            view.addOnUnhandledKeyEventListener((View$OnUnhandledKeyEventListener)t);
        }
        
        public static CharSequence b(final View view) {
            return view.getAccessibilityPaneTitle();
        }
        
        public static boolean c(final View view) {
            return view.isAccessibilityHeading();
        }
        
        public static boolean d(final View view) {
            return view.isScreenReaderFocusable();
        }
        
        public static void e(@NonNull final View view, @NonNull final p p2) {
            final t.h h = (t.h)view.getTag(v.c.P);
            if (h == null) {
                return;
            }
            final View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener)h.get(p2);
            if (view$OnUnhandledKeyEventListener != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }
        
        public static <T> T f(final View view, final int n) {
            return (T)view.requireViewById(n);
        }
        
        public static void g(final View view, final boolean accessibilityHeading) {
            view.setAccessibilityHeading(accessibilityHeading);
        }
        
        public static void h(final View view, final CharSequence accessibilityPaneTitle) {
            view.setAccessibilityPaneTitle(accessibilityPaneTitle);
        }
        
        public static void i(final View view, final boolean screenReaderFocusable) {
            view.setScreenReaderFocusable(screenReaderFocusable);
        }
    }
    
    public abstract static class n
    {
        public static View$AccessibilityDelegate a(final View view) {
            return view.getAccessibilityDelegate();
        }
        
        public static List<Rect> b(final View view) {
            return (List<Rect>)view.getSystemGestureExclusionRects();
        }
        
        public static void c(@NonNull final View view, @NonNull final Context context, @NonNull final int[] array, final AttributeSet set, @NonNull final TypedArray typedArray, final int n, final int n2) {
            view.saveAttributeDataForStyleable(context, array, set, typedArray, n, n2);
        }
        
        public static void d(final View view, final List<Rect> systemGestureExclusionRects) {
            view.setSystemGestureExclusionRects((List)systemGestureExclusionRects);
        }
    }
    
    public abstract static class o
    {
        public static CharSequence a(final View view) {
            return view.getStateDescription();
        }
        
        public static void b(final View view, final CharSequence stateDescription) {
            view.setStateDescription(stateDescription);
        }
    }
    
    public interface p
    {
    }
    
    public static class q
    {
        public static final ArrayList d;
        public WeakHashMap a;
        public SparseArray b;
        public WeakReference c;
        
        static {
            d = new ArrayList();
        }
        
        public q() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        
        public static q a(final View view) {
            q q;
            if ((q = (q)view.getTag(v.c.O)) == null) {
                q = new q();
                view.setTag(v.c.O, (Object)q);
            }
            return q;
        }
        
        public boolean b(View c, final KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                this.g();
            }
            c = this.c(c, keyEvent);
            if (keyEvent.getAction() == 0) {
                final int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    this.d().put(keyCode, (Object)new WeakReference(c));
                }
            }
            return c != null;
        }
        
        public final View c(final View key, final KeyEvent keyEvent) {
            final WeakHashMap a = this.a;
            if (a != null) {
                if (!a.containsKey(key)) {
                    return null;
                }
                if (key instanceof ViewGroup) {
                    final ViewGroup viewGroup = (ViewGroup)key;
                    for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                        final View c = this.c(viewGroup.getChildAt(i), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (this.e(key, keyEvent)) {
                    return key;
                }
            }
            return null;
        }
        
        public final SparseArray d() {
            if (this.b == null) {
                this.b = new SparseArray();
            }
            return this.b;
        }
        
        public final boolean e(final View view, final KeyEvent keyEvent) {
            final ArrayList list = (ArrayList)view.getTag(v.c.P);
            if (list != null) {
                final int index = list.size() - 1;
                if (index >= 0) {
                    android.support.v4.media.a.a(list.get(index));
                    throw null;
                }
            }
            return false;
        }
        
        public boolean f(final KeyEvent referent) {
            final WeakReference c = this.c;
            if (c != null && c.get() == referent) {
                return false;
            }
            this.c = new WeakReference((T)referent);
            final SparseArray d = this.d();
            WeakReference<View> weakReference = null;
            Label_0080: {
                if (referent.getAction() == 1) {
                    final int indexOfKey = d.indexOfKey(referent.getKeyCode());
                    if (indexOfKey >= 0) {
                        weakReference = (WeakReference<View>)d.valueAt(indexOfKey);
                        d.removeAt(indexOfKey);
                        break Label_0080;
                    }
                }
                weakReference = null;
            }
            WeakReference<View> weakReference2 = weakReference;
            if (weakReference == null) {
                weakReference2 = (WeakReference<View>)d.get(referent.getKeyCode());
            }
            if (weakReference2 != null) {
                final View view = weakReference2.get();
                if (view != null && s.t(view)) {
                    this.e(view, referent);
                }
                return true;
            }
            return false;
        }
        
        public final void g() {
            final WeakHashMap a = this.a;
            if (a != null) {
                a.clear();
            }
            final ArrayList d = q.d;
            if (d.isEmpty()) {
                return;
            }
            while (true) {
                // monitorenter(d)
                while (true) {
                    int n = 0;
                    Label_0155: {
                        while (true) {
                            try {
                                if (this.a == null) {
                                    this.a = new WeakHashMap();
                                }
                                n = d.size() - 1;
                                if (n < 0) {
                                    // monitorexit(d)
                                    return;
                                }
                                final ArrayList d2 = q.d;
                                final View key = d2.get(n).get();
                                if (key == null) {
                                    d2.remove(n);
                                    break Label_0155;
                                }
                                this.a.put(key, Boolean.TRUE);
                                for (ViewParent viewParent = key.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
                                    this.a.put(viewParent, Boolean.TRUE);
                                }
                                break Label_0155;
                                // monitorexit(d)
                                throw;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                    --n;
                    continue;
                }
            }
        }
    }
}
