/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Paint
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.Display
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnUnhandledKeyEventListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.WindowInsets
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeProvider
 *  java.lang.AbstractMethodError
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Field
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.WeakHashMap
 *  java.util.concurrent.atomic.AtomicInteger
 */
package I;

import I.a;
import I.r;
import I.t;
import I.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import v.c;

public abstract class s {
    public static final AtomicInteger a = new AtomicInteger(1);
    public static WeakHashMap b = null;
    public static Field c;
    public static boolean d;
    public static final int[] e;
    public static final I.p f;
    public static final e g;

    static {
        d = false;
        e = new int[]{c.b, c.c, c.n, c.y, c.B, c.C, c.D, c.E, c.F, c.G, c.d, c.e, c.f, c.g, c.h, c.i, c.j, c.k, c.l, c.m, c.o, c.p, c.q, c.r, c.s, c.t, c.u, c.v, c.w, c.x, c.z, c.A};
        f = new r();
        g = new e();
    }

    public static void A(View view) {
        j.c(view);
    }

    public static void B(View view, Context context, int[] arrn, AttributeSet attributeSet, TypedArray typedArray, int n8, int n9) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, arrn, attributeSet, typedArray, n8, n9);
        }
    }

    public static f C() {
        return new f(c.M, Boolean.class, 28){

            public Boolean e(View view) {
                return m.d(view);
            }
        };
    }

    public static void D(View view, a a8) {
        a a9 = a8;
        if (a8 == null) {
            a9 = a8;
            if (s.f(view) instanceof a.a) {
                a9 = new a();
            }
        }
        a8 = a9 == null ? null : a9.d();
        view.setAccessibilityDelegate((View.AccessibilityDelegate)a8);
    }

    public static void E(View view, Drawable drawable2) {
        g.q(view, drawable2);
    }

    public static void F(View view, ColorStateList colorStateList) {
        k.q(view, colorStateList);
    }

    public static void G(View view, PorterDuff.Mode mode) {
        k.r(view, mode);
    }

    public static void H(View view, int n8) {
        g.s(view, n8);
    }

    public static void I(View view, String string2) {
        k.v(view, string2);
    }

    public static void J(View view) {
        if (s.l(view) == 0) {
            s.H(view, 1);
        }
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            if (s.l((View)viewParent) == 4) {
                s.H(view, 2);
                return;
            }
            viewParent = viewParent.getParent();
        }
    }

    public static f K() {
        return new f(c.N, CharSequence.class, 64, 30){

            public CharSequence e(View view) {
                return o.a(view);
            }
        };
    }

    public static void L(View view) {
        k.z(view);
    }

    public static f a() {
        return new f(c.J, Boolean.class, 28){

            public Boolean e(View view) {
                return m.c(view);
            }
        };
    }

    public static x b(View view, x x8, Rect rect) {
        return k.b(view, x8, rect);
    }

    public static x c(View view, x x8) {
        WindowInsets windowInsets;
        WindowInsets windowInsets2 = x8.r();
        if (windowInsets2 != null && !(windowInsets = j.a(view, windowInsets2)).equals((Object)windowInsets2)) {
            return x.t(windowInsets, view);
        }
        return x8;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).b(view, keyEvent);
    }

    public static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).f(keyEvent);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        return s.g(view);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static View.AccessibilityDelegate g(View object) {
        if (d) {
            return null;
        }
        if (c == null) {
            Field field;
            c = field = View.class.getDeclaredField("mAccessibilityDelegate");
            field.setAccessible(true);
        }
        try {
            object = c.get(object);
            if (!(object instanceof View.AccessibilityDelegate)) return null;
            return (View.AccessibilityDelegate)object;
        }
        catch (Throwable throwable) {}
        catch (Throwable throwable) {}
        d = true;
        return null;
        d = true;
        return null;
    }

    public static int h(View view) {
        return i.a(view);
    }

    public static CharSequence i(View view) {
        return (CharSequence)s.w().d(view);
    }

    public static ColorStateList j(View view) {
        return k.g(view);
    }

    public static PorterDuff.Mode k(View view) {
        return k.h(view);
    }

    public static int l(View view) {
        return g.c(view);
    }

    public static int m(View view) {
        return h.d(view);
    }

    public static int n(View view) {
        return g.d(view);
    }

    public static x o(View view) {
        return l.a(view);
    }

    public static CharSequence p(View view) {
        return (CharSequence)s.K().d(view);
    }

    public static String q(View view) {
        return k.k(view);
    }

    public static int r(View view) {
        return g.g(view);
    }

    public static boolean s(View view) {
        view = (Boolean)s.a().d(view);
        if (view != null && view.booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean t(View view) {
        return i.b(view);
    }

    public static boolean u(View view) {
        view = (Boolean)s.C().d(view);
        if (view != null && view.booleanValue()) {
            return true;
        }
        return false;
    }

    public static void v(View view, int n8) {
        AccessibilityManager accessibilityManager = (AccessibilityManager)view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        boolean bl = s.i(view) != null && view.isShown() && view.getWindowVisibility() == 0;
        int n9 = s.h(view);
        int n10 = 32;
        if (n9 == 0 && !bl) {
            if (n8 == 32) {
                AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEvent);
                accessibilityEvent.setEventType(32);
                i.g(accessibilityEvent, n8);
                accessibilityEvent.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEvent);
                accessibilityEvent.getText().add((Object)s.i(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
                return;
            }
            if (view.getParent() != null) {
                accessibilityManager = view.getParent();
                try {
                    i.e((ViewParent)accessibilityManager, view, view, n8);
                    return;
                }
                catch (AbstractMethodError abstractMethodError) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(view.getParent().getClass().getSimpleName());
                    stringBuilder.append(" does not fully implement ViewParent");
                    Log.e((String)"ViewCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                    return;
                }
            }
        } else {
            accessibilityManager = AccessibilityEvent.obtain();
            if (!bl) {
                n10 = 2048;
            }
            accessibilityManager.setEventType(n10);
            i.g((AccessibilityEvent)accessibilityManager, n8);
            if (bl) {
                accessibilityManager.getText().add((Object)s.i(view));
                s.J(view);
            }
            view.sendAccessibilityEventUnchecked((AccessibilityEvent)accessibilityManager);
        }
    }

    public static f w() {
        return new f(c.K, CharSequence.class, 8, 28){

            public CharSequence e(View view) {
                return m.b(view);
            }
        };
    }

    public static void x(View view) {
        g.k(view);
    }

    public static void y(View view, Runnable runnable) {
        g.m(view, runnable);
    }

    public static void z(View view, Runnable runnable, long l8) {
        g.n(view, runnable, l8);
    }

    public static class e
    implements ViewTreeObserver.OnGlobalLayoutListener,
    View.OnAttachStateChangeListener {
        public final WeakHashMap o = new WeakHashMap();

        public final void a(View view, boolean bl) {
            boolean bl2 = view.isShown() && view.getWindowVisibility() == 0;
            if (bl != bl2) {
                int n8 = bl2 ? 16 : 32;
                s.v(view, n8);
                this.o.put((Object)view, (Object)bl2);
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.o.entrySet()) {
                    this.a((View)entry.getKey(), (Boolean)entry.getValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            this.b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class f {
        public final int a;
        public final Class b;
        public final int c;
        public final int d;

        public f(int n8, Class class_, int n9) {
            this(n8, class_, 0, n9);
        }

        public f(int n8, Class class_, int n9, int n10) {
            this.a = n8;
            this.b = class_;
            this.d = n9;
            this.c = n10;
        }

        public final boolean a() {
            return true;
        }

        public final boolean b() {
            if (Build.VERSION.SDK_INT >= this.c) {
                return true;
            }
            return false;
        }

        public abstract Object c(View var1);

        public Object d(View object) {
            if (this.b()) {
                return this.c((View)object);
            }
            if (this.a() && this.b.isInstance(object = object.getTag(this.a))) {
                return object;
            }
            return null;
        }
    }

    public static abstract class g {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int n8, Bundle bundle) {
            return view.performAccessibilityAction(n8, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int n8, int n9, int n10, int n11) {
            view.postInvalidateOnAnimation(n8, n9, n10, n11);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long l8) {
            view.postOnAnimationDelayed(runnable, l8);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable2) {
            view.setBackground(drawable2);
        }

        public static void r(View view, boolean bl) {
            view.setHasTransientState(bl);
        }

        public static void s(View view, int n8) {
            view.setImportantForAccessibility(n8);
        }
    }

    public static abstract class h {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(@NonNull View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int n8) {
            view.setLabelFor(n8);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int n8) {
            view.setLayoutDirection(n8);
        }

        public static void k(View view, int n8, int n9, int n10, int n11) {
            view.setPaddingRelative(n8, n9, n10, n11);
        }
    }

    public static abstract class i {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(@NonNull View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(@NonNull View view) {
            return view.isLaidOut();
        }

        public static boolean d(@NonNull View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int n8) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, n8);
        }

        public static void f(View view, int n8) {
            view.setAccessibilityLiveRegion(n8);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int n8) {
            accessibilityEvent.setContentChangeTypes(n8);
        }
    }

    public static abstract class j {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static abstract class k {
        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)view.getTag(c.Q);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static x b(@NonNull View view, @NonNull x x8, @NonNull Rect rect) {
            WindowInsets windowInsets = x8.r();
            if (windowInsets != null) {
                return x.t(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return x8;
        }

        public static boolean c(@NonNull View view, float f8, float f9, boolean bl) {
            return view.dispatchNestedFling(f8, f9, bl);
        }

        public static boolean d(@NonNull View view, float f8, float f9) {
            return view.dispatchNestedPreFling(f8, f9);
        }

        public static boolean e(View view, int n8, int n9, int[] arrn, int[] arrn2) {
            return view.dispatchNestedPreScroll(n8, n9, arrn, arrn2);
        }

        public static boolean f(View view, int n8, int n9, int n10, int n11, int[] arrn) {
            return view.dispatchNestedScroll(n8, n9, n10, n11, arrn);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static x j(@NonNull View view) {
            return x.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(@NonNull View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f8) {
            view.setElevation(f8);
        }

        public static void t(View view, boolean bl) {
            view.setNestedScrollingEnabled(bl);
        }

        public static void u(@NonNull View view, I.o o8) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(c.L, (Object)o8);
            }
            if (o8 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)view.getTag(c.Q));
                return;
            }
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(view, o8){
                public x a;
                {
                    this.a = null;
                }

                public WindowInsets onApplyWindowInsets(View object, WindowInsets windowInsets) {
                    object = x.t(windowInsets, (View)object);
                    if (Build.VERSION.SDK_INT < 30) {
                        k.a(windowInsets, b);
                        if (object.equals(this.a)) {
                            throw null;
                        }
                    }
                    this.a = object;
                    throw null;
                }
            });
        }

        public static void v(View view, String string2) {
            view.setTransitionName(string2);
        }

        public static void w(View view, float f8) {
            view.setTranslationZ(f8);
        }

        public static void x(@NonNull View view, float f8) {
            view.setZ(f8);
        }

        public static boolean y(View view, int n8) {
            return view.startNestedScroll(n8);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }

    }

    public static abstract class l {
        public static x a(@NonNull View view) {
            Object object = view.getRootWindowInsets();
            if (object == null) {
                return null;
            }
            object = x.s((WindowInsets)object);
            object.p((x)object);
            object.d(view.getRootView());
            return object;
        }

        public static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        public static void c(@NonNull View view, int n8) {
            view.setScrollIndicators(n8);
        }

        public static void d(@NonNull View view, int n8, int n9) {
            view.setScrollIndicators(n8, n9);
        }
    }

    public static abstract class m {
        public static void a(@NonNull View view, @NonNull p p8) {
            Object object = (t.h)view.getTag(c.P);
            t.h h8 = object;
            if (object == null) {
                h8 = new t.h();
                view.setTag(c.P, (Object)h8);
            }
            Objects.requireNonNull((Object)p8);
            object = new t(p8);
            h8.put(p8, object);
            view.addOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener)object);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(@NonNull View view, @NonNull p p8) {
            t.h h8 = (t.h)view.getTag(c.P);
            if (h8 == null) {
                return;
            }
            if ((p8 = (View.OnUnhandledKeyEventListener)h8.get(p8)) != null) {
                view.removeOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener)p8);
            }
        }

        public static <T> T f(View view, int n8) {
            return (T)view.requireViewById(n8);
        }

        public static void g(View view, boolean bl) {
            view.setAccessibilityHeading(bl);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean bl) {
            view.setScreenReaderFocusable(bl);
        }
    }

    public static abstract class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(@NonNull View view, @NonNull Context context, @NonNull int[] arrn, AttributeSet attributeSet, @NonNull TypedArray typedArray, int n8, int n9) {
            view.saveAttributeDataForStyleable(context, arrn, attributeSet, typedArray, n8, n9);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static abstract class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static interface p {
    }

    public static class q {
        public static final ArrayList d = new ArrayList();
        public WeakHashMap a = null;
        public SparseArray b = null;
        public WeakReference c = null;

        public static q a(View view) {
            q q8;
            q q9 = q8 = (q)view.getTag(c.O);
            if (q8 == null) {
                q9 = new q();
                view.setTag(c.O, (Object)q9);
            }
            return q9;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                this.g();
            }
            view = this.c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int n8 = keyEvent.getKeyCode();
                if (view != null && !KeyEvent.isModifierKey((int)n8)) {
                    this.d().put(n8, (Object)new WeakReference((Object)view));
                }
            }
            if (view != null) {
                return true;
            }
            return false;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null) {
                if (!weakHashMap.containsKey((Object)view)) {
                    return null;
                }
                if (view instanceof ViewGroup) {
                    weakHashMap = (ViewGroup)view;
                    for (int i8 = weakHashMap.getChildCount() - 1; i8 >= 0; --i8) {
                        View view2 = this.c(weakHashMap.getChildAt(i8), keyEvent);
                        if (view2 == null) continue;
                        return view2;
                    }
                }
                if (this.e(view, keyEvent)) {
                    return view;
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

        public final boolean e(View view, KeyEvent keyEvent) {
            int n8;
            if ((view = (ArrayList)view.getTag(c.P)) != null && (n8 = view.size() - 1) >= 0) {
                android.support.v4.media.a.a(view.get(n8));
                throw null;
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            int n8;
            WeakReference weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference((Object)keyEvent);
            SparseArray sparseArray = this.d();
            if (keyEvent.getAction() == 1 && (n8 = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = (WeakReference)sparseArray.valueAt(n8);
                sparseArray.removeAt(n8);
            } else {
                weakReference = null;
            }
            WeakReference weakReference2 = weakReference;
            if (weakReference == null) {
                weakReference2 = (WeakReference)sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference2 != null) {
                weakReference = (View)weakReference2.get();
                if (weakReference != null && s.t((View)weakReference)) {
                    this.e((View)weakReference, keyEvent);
                }
                return true;
            }
            return false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void g() {
            ArrayList arrayList;
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if ((arrayList = d).isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                int n8;
                block11 : {
                    try {
                        if (this.a == null) {
                            this.a = new WeakHashMap();
                        }
                        n8 = arrayList.size() - 1;
                        break block11;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                while (n8 >= 0) {
                    weakHashMap = d;
                    View view = (View)((WeakReference)weakHashMap.get(n8)).get();
                    if (view == null) {
                        weakHashMap.remove(n8);
                    } else {
                        this.a.put((Object)view, (Object)Boolean.TRUE);
                        weakHashMap = view.getParent();
                        while (weakHashMap instanceof View) {
                            this.a.put((Object)((View)weakHashMap), (Object)Boolean.TRUE);
                            weakHashMap = weakHashMap.getParent();
                        }
                    }
                    --n8;
                }
                return;
            }
        }
    }

}

