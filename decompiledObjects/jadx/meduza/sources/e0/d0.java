package e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import e0.a;
import e0.c;
import e0.d0;
import e0.s0;
import io.meduza.meduza.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, o0> f3766a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f3767b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3768c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final z f3769d = new v() { // from class: e0.z
        @Override // e0.v
        public final c a(c cVar) {
            return cVar;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final a f3770e = new a();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f3771a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f3771a.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
                    if (booleanValue != z10) {
                        d0.e(z10 ? 16 : 32, key);
                        entry.setValue(Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f3772a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<T> f3773b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3774c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3775d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f3772a = i10;
            this.f3773b = cls;
            this.f3775d = i11;
            this.f3774c = i12;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t);

        public final T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f3774c) {
                return b(view);
            }
            T t = (T) view.getTag(this.f3772a);
            if (this.f3773b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public final void e(View view, T t) {
            if (Build.VERSION.SDK_INT >= this.f3774c) {
                c(view, t);
                return;
            }
            if (f(d(view), t)) {
                View.AccessibilityDelegate c10 = d0.c(view);
                e0.a aVar = c10 == null ? null : c10 instanceof a.C0065a ? ((a.C0065a) c10).f3750a : new e0.a(c10);
                if (aVar == null) {
                    aVar = new e0.a();
                }
                d0.h(view, aVar);
                view.setTag(this.f3772a, t);
                d0.e(this.f3775d, view);
            }
        }

        public abstract boolean f(T t, T t10);
    }

    public static class c {
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

    public static class d {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public s0 f3776a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f3777b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t f3778c;

            public a(View view, t tVar) {
                this.f3777b = view;
                this.f3778c = tVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                s0 c10 = s0.c(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    d.a(windowInsets, this.f3777b);
                    if (c10.equals(this.f3776a)) {
                        return ((g.h) this.f3778c).a(view, c10).b();
                    }
                }
                this.f3776a = c10;
                s0 a10 = ((g.h) this.f3778c).a(view, c10);
                if (i10 >= 30) {
                    return a10.b();
                }
                c.c(view);
                return a10.b();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static s0 b(View view, s0 s0Var, Rect rect) {
            WindowInsets b10 = s0Var.b();
            if (b10 != null) {
                return s0.c(view.computeSystemWindowInsets(b10, rect), view);
            }
            rect.setEmpty();
            return s0Var;
        }

        public static boolean c(View view, float f, float f10, boolean z10) {
            return view.dispatchNestedFling(f, f10, z10);
        }

        public static boolean d(View view, float f, float f10) {
            return view.dispatchNestedPreFling(f, f10);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
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

        public static s0 j(View view) {
            if (s0.a.f3827d && view.isAttachedToWindow()) {
                try {
                    Object obj = s0.a.f3824a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) s0.a.f3825b.get(obj);
                        Rect rect2 = (Rect) s0.a.f3826c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i10 = Build.VERSION.SDK_INT;
                            s0.e dVar = i10 >= 30 ? new s0.d() : i10 >= 29 ? new s0.c() : new s0.b();
                            dVar.c(x.b.a(rect.left, rect.top, rect.right, rect.bottom));
                            dVar.d(x.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            s0 b10 = dVar.b();
                            b10.f3823a.l(b10);
                            b10.f3823a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    StringBuilder l10 = defpackage.f.l("Failed to get insets from AttachInfo. ");
                    l10.append(e10.getMessage());
                    Log.w("WindowInsetsCompat", l10.toString(), e10);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
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

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, t tVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, tVar);
            }
            if (tVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, tVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class e {
        public static s0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            s0 c10 = s0.c(rootWindowInsets, null);
            c10.f3823a.l(c10);
            c10.f3823a.d(view.getRootView());
            return c10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    public static class f {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            AutofillId autofillId;
            autofillId = view.getAutofillId();
            return autofillId;
        }

        public static int c(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        public static int d(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        public static boolean e(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        public static boolean f(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        public static boolean g(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        public static boolean h(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        public static View i(View view, View view2, int i10) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i10);
            return keyboardNavigationClusterSearch;
        }

        public static boolean j(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class g {
        /* JADX WARN: Type inference failed for: r0v1, types: [e0.e0, java.lang.Object] */
        public static void a(View view, final l lVar) {
            r.h hVar = (r.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new r.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(lVar);
            ?? r02 = new View$OnUnhandledKeyEventListener() { // from class: e0.e0
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return d0.l.this.a();
                }
            };
            hVar.put(lVar, r02);
            view.addOnUnhandledKeyEventListener(r02);
        }

        public static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        public static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        public static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        public static void e(View view, l lVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            r.h hVar = (r.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null || (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) hVar.getOrDefault(lVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i10) {
            KeyEvent.Callback requireViewById;
            requireViewById = view.requireViewById(i10);
            return (T) requireViewById;
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, g0.a aVar) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    public static class h {
        public static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        public static ContentCaptureSession b(View view) {
            ContentCaptureSession contentCaptureSession;
            contentCaptureSession = view.getContentCaptureSession();
            return contentCaptureSession;
        }

        public static List<Rect> c(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void e(View view, h0.a aVar) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class i {
        public static int a(View view) {
            int importantForContentCapture;
            importantForContentCapture = view.getImportantForContentCapture();
            return importantForContentCapture;
        }

        public static CharSequence b(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        public static boolean c(View view) {
            boolean isImportantForContentCapture;
            isImportantForContentCapture = view.isImportantForContentCapture();
            return isImportantForContentCapture;
        }

        public static void d(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class j {
        public static String[] a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        public static e0.c b(View view, e0.c cVar) {
            ContentInfo performReceiveContent;
            ContentInfo b10 = cVar.f3752a.b();
            Objects.requireNonNull(b10);
            performReceiveContent = view.performReceiveContent(b10);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == b10 ? cVar : new e0.c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, u uVar) {
            if (uVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new k(uVar));
            }
        }
    }

    public static final class k implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        public final u f3779a;

        public k(u uVar) {
            this.f3779a = uVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            e0.c cVar = new e0.c(new c.d(contentInfo));
            e0.c a10 = this.f3779a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo b10 = a10.f3752a.b();
            Objects.requireNonNull(b10);
            return b10;
        }
    }

    public interface l {
        boolean a();
    }

    public static class m {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f3780d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f3781a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f3782b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f3783c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((l) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f3781a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a10 == null);
                return a10;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    @Deprecated
    public static o0 a(View view) {
        if (f3766a == null) {
            f3766a = new WeakHashMap<>();
        }
        o0 o0Var = f3766a.get(view);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0(view);
        f3766a.put(view, o0Var2);
        return o0Var2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = m.f3780d;
        m mVar = (m) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (mVar == null) {
            mVar = new m();
            view.setTag(R.id.tag_unhandled_key_event_manager, mVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = mVar.f3781a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = m.f3780d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (mVar.f3781a == null) {
                        mVar.f3781a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = m.f3780d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            mVar.f3781a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                mVar.f3781a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = mVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (mVar.f3782b == null) {
                    mVar.f3782b = new SparseArray<>();
                }
                mVar.f3782b.put(keyCode, new WeakReference<>(a10));
            }
        }
        return a10 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(view);
        }
        if (f3768c) {
            return null;
        }
        if (f3767b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3767b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3768c = true;
                return null;
            }
        }
        Object obj = f3767b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static String[] d(View view) {
        return Build.VERSION.SDK_INT >= 31 ? j.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(int i10, View view) {
        Object obj;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i11 >= 28) {
                obj = g.b(view);
            } else {
                Object tag = view.getTag(R.id.tag_accessibility_pane_title);
                obj = CharSequence.class.isInstance(tag) ? tag : null;
            }
            boolean z10 = ((CharSequence) obj) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                obtain.setContentChangeTypes(i10);
                if (z10) {
                    List<CharSequence> text = obtain.getText();
                    if (i11 >= 28) {
                        charSequence = g.b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i10);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i11 >= 28) {
                charSequence = g.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e0.c f(View view, e0.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j.b(view, cVar);
        }
        u uVar = (u) view.getTag(R.id.tag_on_receive_content_listener);
        if (uVar == null) {
            return (view instanceof v ? (v) view : f3769d).a(cVar);
        }
        e0.c a10 = uVar.a(view, cVar);
        if (a10 == null) {
            return null;
        }
        return (view instanceof v ? (v) view : f3769d).a(a10);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            h.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void h(View view, e0.a aVar) {
        if (aVar == null && (c(view) instanceof a.C0065a)) {
            aVar = new e0.a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f3749b);
    }

    public static void i(View view, CharSequence charSequence) {
        new b0(CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            a aVar = f3770e;
            aVar.f3771a.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
            return;
        }
        a aVar2 = f3770e;
        aVar2.f3771a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
        view.addOnAttachStateChangeListener(aVar2);
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(aVar2);
        }
    }
}
