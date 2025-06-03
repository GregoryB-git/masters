package I;

import I.C0404a;
import I.C0426x;
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
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: I.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0421s {

    /* renamed from: c, reason: collision with root package name */
    public static Field f2436c;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f2434a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public static WeakHashMap f2435b = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2437d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2438e = {v.c.f20041b, v.c.f20042c, v.c.f20053n, v.c.f20064y, v.c.f20024B, v.c.f20025C, v.c.f20026D, v.c.f20027E, v.c.f20028F, v.c.f20029G, v.c.f20043d, v.c.f20044e, v.c.f20045f, v.c.f20046g, v.c.f20047h, v.c.f20048i, v.c.f20049j, v.c.f20050k, v.c.f20051l, v.c.f20052m, v.c.f20054o, v.c.f20055p, v.c.f20056q, v.c.f20057r, v.c.f20058s, v.c.f20059t, v.c.f20060u, v.c.f20061v, v.c.f20062w, v.c.f20063x, v.c.f20065z, v.c.f20023A};

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC0419p f2439f = new InterfaceC0419p() { // from class: I.r
    };

    /* renamed from: g, reason: collision with root package name */
    public static final e f2440g = new e();

    /* renamed from: I.s$a */
    public class a extends f {
        public a(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        @Override // I.AbstractC0421s.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(m.d(view));
        }
    }

    /* renamed from: I.s$b */
    public class b extends f {
        public b(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        @Override // I.AbstractC0421s.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.b(view);
        }
    }

    /* renamed from: I.s$c */
    public class c extends f {
        public c(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        @Override // I.AbstractC0421s.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return o.a(view);
        }
    }

    /* renamed from: I.s$d */
    public class d extends f {
        public d(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        @Override // I.AbstractC0421s.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(m.c(view));
        }
    }

    /* renamed from: I.s$f */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f2442a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f2443b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2444c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2445d;

        public f(int i7, Class cls, int i8) {
            this(i7, cls, 0, i8);
        }

        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f2444c;
        }

        public abstract Object c(View view);

        public Object d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            Object tag = view.getTag(this.f2442a);
            if (this.f2443b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public f(int i7, Class cls, int i8, int i9) {
            this.f2442a = i7;
            this.f2443b = cls;
            this.f2445d = i8;
            this.f2444c = i9;
        }
    }

    /* renamed from: I.s$g */
    public static class g {
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

        public static boolean j(View view, int i7, Bundle bundle) {
            return view.performAccessibilityAction(i7, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i7, int i8, int i9, int i10) {
            view.postInvalidateOnAnimation(i7, i8, i9, i10);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j7) {
            view.postOnAnimationDelayed(runnable, j7);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z7) {
            view.setHasTransientState(z7);
        }

        public static void s(View view, int i7) {
            view.setImportantForAccessibility(i7);
        }
    }

    /* renamed from: I.s$h */
    public static class h {
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

        public static void h(View view, int i7) {
            view.setLabelFor(i7);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i7) {
            view.setLayoutDirection(i7);
        }

        public static void k(View view, int i7, int i8, int i9, int i10) {
            view.setPaddingRelative(i7, i8, i9, i10);
        }
    }

    /* renamed from: I.s$i */
    public static class i {
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

        public static void e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i7);
        }

        public static void f(View view, int i7) {
            view.setAccessibilityLiveRegion(i7);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setContentChangeTypes(i7);
        }
    }

    /* renamed from: I.s$j */
    public static class j {
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

    /* renamed from: I.s$k */
    public static class k {

        /* renamed from: I.s$k$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public C0426x f2446a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f2447b;

            public a(View view, InterfaceC0418o interfaceC0418o) {
                this.f2447b = view;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0426x t7 = C0426x.t(windowInsets, view);
                if (Build.VERSION.SDK_INT < 30) {
                    k.a(windowInsets, this.f2447b);
                    if (t7.equals(this.f2446a)) {
                        throw null;
                    }
                }
                this.f2446a = t7;
                throw null;
            }
        }

        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(v.c.f20039Q);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static C0426x b(@NonNull View view, @NonNull C0426x c0426x, @NonNull Rect rect) {
            WindowInsets r7 = c0426x.r();
            if (r7 != null) {
                return C0426x.t(view.computeSystemWindowInsets(r7, rect), view);
            }
            rect.setEmpty();
            return c0426x;
        }

        public static boolean c(@NonNull View view, float f7, float f8, boolean z7) {
            return view.dispatchNestedFling(f7, f8, z7);
        }

        public static boolean d(@NonNull View view, float f7, float f8) {
            return view.dispatchNestedPreFling(f7, f8);
        }

        public static boolean e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
        }

        public static boolean f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
            return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
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

        public static C0426x j(@NonNull View view) {
            return C0426x.a.a(view);
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

        public static void s(View view, float f7) {
            view.setElevation(f7);
        }

        public static void t(View view, boolean z7) {
            view.setNestedScrollingEnabled(z7);
        }

        public static void u(@NonNull View view, InterfaceC0418o interfaceC0418o) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(v.c.f20034L, interfaceC0418o);
            }
            if (interfaceC0418o == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(v.c.f20039Q));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0418o));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f7) {
            view.setTranslationZ(f7);
        }

        public static void x(@NonNull View view, float f7) {
            view.setZ(f7);
        }

        public static boolean y(View view, int i7) {
            return view.startNestedScroll(i7);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: I.s$l */
    public static class l {
        public static C0426x a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0426x s7 = C0426x.s(rootWindowInsets);
            s7.p(s7);
            s7.d(view.getRootView());
            return s7;
        }

        public static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        public static void c(@NonNull View view, int i7) {
            view.setScrollIndicators(i7);
        }

        public static void d(@NonNull View view, int i7, int i8) {
            view.setScrollIndicators(i7, i8);
        }
    }

    /* renamed from: I.s$m */
    public static class m {
        public static void a(@NonNull View view, @NonNull final p pVar) {
            t.h hVar = (t.h) view.getTag(v.c.f20038P);
            if (hVar == null) {
                hVar = new t.h();
                view.setTag(v.c.f20038P, hVar);
            }
            Objects.requireNonNull(pVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(pVar) { // from class: I.t
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            hVar.put(pVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
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

        public static void e(@NonNull View view, @NonNull p pVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            t.h hVar = (t.h) view.getTag(v.c.f20038P);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.get(pVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i7) {
            return (T) view.requireViewById(i7);
        }

        public static void g(View view, boolean z7) {
            view.setAccessibilityHeading(z7);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z7) {
            view.setScreenReaderFocusable(z7);
        }
    }

    /* renamed from: I.s$n */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i7, int i8) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i8);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: I.s$o */
    public static class o {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: I.s$p */
    public interface p {
    }

    /* renamed from: I.s$q */
    public static class q {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList f2448d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap f2449a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f2450b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference f2451c = null;

        public static q a(View view) {
            q qVar = (q) view.getTag(v.c.f20037O);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = new q();
            view.setTag(v.c.f20037O, qVar2);
            return qVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c7 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c7 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c7));
                }
            }
            return c7 != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f2449a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c7 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c7 != null) {
                            return c7;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray d() {
            if (this.f2450b == null) {
                this.f2450b = new SparseArray();
            }
            return this.f2450b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(v.c.f20038P);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.a.a(arrayList.get(size));
            throw null;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f2451c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f2451c = new WeakReference(keyEvent);
            SparseArray d7 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d7.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) d7.valueAt(indexOfKey);
                d7.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) d7.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && AbstractC0421s.t(view)) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap weakHashMap = this.f2449a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f2448d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f2449a == null) {
                        this.f2449a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f2448d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f2449a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2449a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void A(View view) {
        j.c(view);
    }

    public static void B(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i7, i8);
        }
    }

    public static f C() {
        return new a(v.c.f20035M, Boolean.class, 28);
    }

    public static void D(View view, C0404a c0404a) {
        if (c0404a == null && (f(view) instanceof C0404a.C0040a)) {
            c0404a = new C0404a();
        }
        view.setAccessibilityDelegate(c0404a == null ? null : c0404a.d());
    }

    public static void E(View view, Drawable drawable) {
        g.q(view, drawable);
    }

    public static void F(View view, ColorStateList colorStateList) {
        k.q(view, colorStateList);
    }

    public static void G(View view, PorterDuff.Mode mode) {
        k.r(view, mode);
    }

    public static void H(View view, int i7) {
        g.s(view, i7);
    }

    public static void I(View view, String str) {
        k.v(view, str);
    }

    public static void J(View view) {
        if (l(view) == 0) {
            H(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (l((View) parent) == 4) {
                H(view, 2);
                return;
            }
        }
    }

    public static f K() {
        return new c(v.c.f20036N, CharSequence.class, 64, 30);
    }

    public static void L(View view) {
        k.z(view);
    }

    public static f a() {
        return new d(v.c.f20032J, Boolean.class, 28);
    }

    public static C0426x b(View view, C0426x c0426x, Rect rect) {
        return k.b(view, c0426x, rect);
    }

    public static C0426x c(View view, C0426x c0426x) {
        WindowInsets r7 = c0426x.r();
        if (r7 != null) {
            WindowInsets a7 = j.a(view, r7);
            if (!a7.equals(r7)) {
                return C0426x.t(a7, view);
            }
        }
        return c0426x;
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
        return Build.VERSION.SDK_INT >= 29 ? n.a(view) : g(view);
    }

    public static View.AccessibilityDelegate g(View view) {
        if (f2437d) {
            return null;
        }
        if (f2436c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2436c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2437d = true;
                return null;
            }
        }
        try {
            Object obj = f2436c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2437d = true;
            return null;
        }
    }

    public static int h(View view) {
        return i.a(view);
    }

    public static CharSequence i(View view) {
        return (CharSequence) w().d(view);
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

    public static C0426x o(View view) {
        return l.a(view);
    }

    public static CharSequence p(View view) {
        return (CharSequence) K().d(view);
    }

    public static String q(View view) {
        return k.k(view);
    }

    public static int r(View view) {
        return g.g(view);
    }

    public static boolean s(View view) {
        Boolean bool = (Boolean) a().d(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean t(View view) {
        return i.b(view);
    }

    public static boolean u(View view) {
        Boolean bool = (Boolean) C().d(view);
        return bool != null && bool.booleanValue();
    }

    public static void v(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z7 = i(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (h(view) != 0 || z7) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z7 ? 32 : 2048);
                i.g(obtain, i7);
                if (z7) {
                    obtain.getText().add(i(view));
                    J(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i7 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                i.g(obtain2, i7);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(i(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    i.e(view.getParent(), view, view, i7);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e7);
                }
            }
        }
    }

    public static f w() {
        return new b(v.c.f20033K, CharSequence.class, 8, 28);
    }

    public static void x(View view) {
        g.k(view);
    }

    public static void y(View view, Runnable runnable) {
        g.m(view, runnable);
    }

    public static void z(View view, Runnable runnable, long j7) {
        g.n(view, runnable, j7);
    }

    /* renamed from: I.s$e */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        public final WeakHashMap f2441o = new WeakHashMap();

        public final void a(View view, boolean z7) {
            boolean z8 = view.isShown() && view.getWindowVisibility() == 0;
            if (z7 != z8) {
                AbstractC0421s.v(view, z8 ? 16 : 32);
                this.f2441o.put(view, Boolean.valueOf(z8));
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f2441o.entrySet()) {
                    a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
