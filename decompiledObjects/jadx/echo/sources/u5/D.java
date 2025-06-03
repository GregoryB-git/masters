package u5;

import G5.b;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import t5.AbstractC1995b;
import u5.L;
import u5.r;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public class D extends FrameLayout implements b.c, L.e {

    /* renamed from: A, reason: collision with root package name */
    public F5.e f19794A;

    /* renamed from: B, reason: collision with root package name */
    public L f19795B;

    /* renamed from: C, reason: collision with root package name */
    public C2016c f19796C;

    /* renamed from: D, reason: collision with root package name */
    public io.flutter.view.i f19797D;

    /* renamed from: E, reason: collision with root package name */
    public TextServicesManager f19798E;

    /* renamed from: F, reason: collision with root package name */
    public Q f19799F;

    /* renamed from: G, reason: collision with root package name */
    public final FlutterRenderer.f f19800G;

    /* renamed from: H, reason: collision with root package name */
    public final i.k f19801H;

    /* renamed from: I, reason: collision with root package name */
    public final ContentObserver f19802I;

    /* renamed from: J, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f19803J;

    /* renamed from: K, reason: collision with root package name */
    public final H.a f19804K;

    /* renamed from: o, reason: collision with root package name */
    public s f19805o;

    /* renamed from: p, reason: collision with root package name */
    public t f19806p;

    /* renamed from: q, reason: collision with root package name */
    public r f19807q;

    /* renamed from: r, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f19808r;

    /* renamed from: s, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f19809s;

    /* renamed from: t, reason: collision with root package name */
    public final Set f19810t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19811u;

    /* renamed from: v, reason: collision with root package name */
    public io.flutter.embedding.engine.a f19812v;

    /* renamed from: w, reason: collision with root package name */
    public final Set f19813w;

    /* renamed from: x, reason: collision with root package name */
    public G5.b f19814x;

    /* renamed from: y, reason: collision with root package name */
    public io.flutter.plugin.editing.C f19815y;

    /* renamed from: z, reason: collision with root package name */
    public io.flutter.plugin.editing.n f19816z;

    public class a implements i.k {
        public a() {
        }

        @Override // io.flutter.view.i.k
        public void a(boolean z7, boolean z8) {
            D.this.z(z7, z8);
        }
    }

    public class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            super.onChange(z7);
            if (D.this.f19812v == null) {
                return;
            }
            AbstractC1995b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            D.this.B();
        }
    }

    public class c implements io.flutter.embedding.engine.renderer.j {
        public c() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
            D.this.f19811u = false;
            Iterator it = D.this.f19810t.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.j) it.next()).b();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void e() {
            D.this.f19811u = true;
            Iterator it = D.this.f19810t.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.j) it.next()).e();
            }
        }
    }

    public class d implements H.a {
        public d() {
        }

        @Override // H.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            D.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    public enum f {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public D(Context context, AttributeSet attributeSet, s sVar) {
        super(context, attributeSet);
        this.f19810t = new HashSet();
        this.f19813w = new HashSet();
        this.f19800G = new FlutterRenderer.f();
        this.f19801H = new a();
        this.f19802I = new b(new Handler(Looper.getMainLooper()));
        this.f19803J = new c();
        this.f19804K = new d();
        this.f19805o = sVar;
        this.f19808r = sVar;
        u();
    }

    public static /* synthetic */ boolean w(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    public void A(Runnable runnable) {
        if (this.f19807q == null) {
            AbstractC1995b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.k kVar = this.f19809s;
        if (kVar == null) {
            AbstractC1995b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f19808r = kVar;
        this.f19809s = null;
        FlutterRenderer t7 = this.f19812v.t();
        if (this.f19812v != null && t7 != null) {
            this.f19808r.b();
            t7.f(new e(t7, runnable));
        } else {
            this.f19807q.a();
            x();
            runnable.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r1 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L13
            D5.t$c r0 = D5.t.c.dark
            goto L15
        L13:
            D5.t$c r0 = D5.t.c.light
        L15:
            android.view.textservice.TextServicesManager r1 = r6.f19798E
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3c
            java.util.List r1 = u5.v.a(r1)
            java.util.stream.Stream r1 = u5.w.a(r1)
            u5.C r4 = new u5.C
            r4.<init>()
            boolean r1 = u5.x.a(r1, r4)
            android.view.textservice.TextServicesManager r4 = r6.f19798E
            boolean r4 = u5.y.a(r4)
            if (r4 == 0) goto L3e
            if (r1 == 0) goto L3e
        L3c:
            r1 = r3
            goto L3f
        L3e:
            r1 = r2
        L3f:
            io.flutter.embedding.engine.a r4 = r6.f19812v
            D5.t r4 = r4.v()
            D5.t$b r4 = r4.d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            D5.t$b r4 = r4.f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            D5.t$b r4 = r4.c(r5)
            D5.t$b r1 = r4.d(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L78
            r2 = r3
        L78:
            D5.t$b r1 = r1.b(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            D5.t$b r1 = r1.g(r2)
            D5.t$b r0 = r1.e(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.D.B():void");
    }

    public final void C() {
        if (!v()) {
            AbstractC1995b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f19800G.f14970a = getResources().getDisplayMetrics().density;
        this.f19800G.f14985p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f19812v.t().n(this.f19800G);
    }

    @Override // u5.L.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        this.f19815y.j(sparseArray);
    }

    @Override // G5.b.c
    public PointerIcon b(int i7) {
        PointerIcon systemIcon;
        systemIcon = PointerIcon.getSystemIcon(getContext(), i7);
        return systemIcon;
    }

    @Override // u5.L.e
    public boolean c(KeyEvent keyEvent) {
        return this.f19815y.p(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f19812v;
        return aVar != null ? aVar.q().y(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (v() && this.f19795B.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f19797D;
        if (iVar == null || !iVar.B()) {
            return null;
        }
        return this.f19797D;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f19812v;
    }

    @Override // u5.L.e
    public E5.c getBinaryMessenger() {
        return this.f19812v.k();
    }

    public r getCurrentImageSurface() {
        return this.f19807q;
    }

    public boolean k() {
        r rVar = this.f19807q;
        if (rVar != null) {
            return rVar.d();
        }
        return false;
    }

    public void l(io.flutter.embedding.engine.renderer.j jVar) {
        this.f19810t.add(jVar);
    }

    public void m(r rVar) {
        io.flutter.embedding.engine.a aVar = this.f19812v;
        if (aVar != null) {
            rVar.c(aVar.t());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        AbstractC1995b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (v()) {
            if (aVar == this.f19812v) {
                AbstractC1995b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                AbstractC1995b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f19812v = aVar;
        FlutterRenderer t7 = aVar.t();
        this.f19811u = t7.h();
        this.f19808r.c(t7);
        t7.f(this.f19803J);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f19814x = new G5.b(this, this.f19812v.n());
        }
        this.f19815y = new io.flutter.plugin.editing.C(this, this.f19812v.y(), this.f19812v.q());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f19798E = textServicesManager;
            this.f19816z = new io.flutter.plugin.editing.n(textServicesManager, this.f19812v.w());
        } catch (Exception unused) {
            AbstractC1995b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f19794A = this.f19812v.m();
        this.f19795B = new L(this);
        this.f19796C = new C2016c(this.f19812v.t(), false);
        io.flutter.view.i iVar = new io.flutter.view.i(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f19812v.q());
        this.f19797D = iVar;
        iVar.Z(this.f19801H);
        z(this.f19797D.B(), this.f19797D.D());
        this.f19812v.q().a(this.f19797D);
        this.f19812v.q().w(this.f19812v.t());
        this.f19815y.o().restartInput(this);
        B();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f19802I);
        C();
        aVar.q().x(this);
        Iterator it = this.f19813w.iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
        if (this.f19811u) {
            this.f19803J.e();
        }
    }

    public final f o() {
        Context context = getContext();
        int i7 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i7 == 2) {
            if (rotation == 1) {
                return f.RIGHT;
            }
            if (rotation == 3) {
                return f.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return f.BOTH;
            }
        }
        return f.NONE;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Insets insets;
        int i7;
        int i8;
        int i9;
        int i10;
        int ime;
        Insets insets2;
        int i11;
        int i12;
        int i13;
        int i14;
        int systemGestures;
        Insets insets3;
        int i15;
        int i16;
        int i17;
        int i18;
        DisplayCutout displayCutout;
        Insets waterfallInsets;
        int i19;
        int safeInsetTop;
        int i20;
        int safeInsetRight;
        int i21;
        int safeInsetBottom;
        int i22;
        int safeInsetLeft;
        int statusBars;
        Insets systemGestureInsets;
        int i23;
        int i24;
        int i25;
        int i26;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i27 = Build.VERSION.SDK_INT;
        if (i27 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.f fVar = this.f19800G;
            i23 = systemGestureInsets.top;
            fVar.f14981l = i23;
            FlutterRenderer.f fVar2 = this.f19800G;
            i24 = systemGestureInsets.right;
            fVar2.f14982m = i24;
            FlutterRenderer.f fVar3 = this.f19800G;
            i25 = systemGestureInsets.bottom;
            fVar3.f14983n = i25;
            FlutterRenderer.f fVar4 = this.f19800G;
            i26 = systemGestureInsets.left;
            fVar4.f14984o = i26;
        }
        boolean z7 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z8 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i27 >= 30) {
            int navigationBars = z8 ? WindowInsets.Type.navigationBars() : 0;
            if (z7) {
                statusBars = WindowInsets.Type.statusBars();
                navigationBars |= statusBars;
            }
            insets = windowInsets.getInsets(navigationBars);
            FlutterRenderer.f fVar5 = this.f19800G;
            i7 = insets.top;
            fVar5.f14973d = i7;
            FlutterRenderer.f fVar6 = this.f19800G;
            i8 = insets.right;
            fVar6.f14974e = i8;
            FlutterRenderer.f fVar7 = this.f19800G;
            i9 = insets.bottom;
            fVar7.f14975f = i9;
            FlutterRenderer.f fVar8 = this.f19800G;
            i10 = insets.left;
            fVar8.f14976g = i10;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            FlutterRenderer.f fVar9 = this.f19800G;
            i11 = insets2.top;
            fVar9.f14977h = i11;
            FlutterRenderer.f fVar10 = this.f19800G;
            i12 = insets2.right;
            fVar10.f14978i = i12;
            FlutterRenderer.f fVar11 = this.f19800G;
            i13 = insets2.bottom;
            fVar11.f14979j = i13;
            FlutterRenderer.f fVar12 = this.f19800G;
            i14 = insets2.left;
            fVar12.f14980k = i14;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            FlutterRenderer.f fVar13 = this.f19800G;
            i15 = insets3.top;
            fVar13.f14981l = i15;
            FlutterRenderer.f fVar14 = this.f19800G;
            i16 = insets3.right;
            fVar14.f14982m = i16;
            FlutterRenderer.f fVar15 = this.f19800G;
            i17 = insets3.bottom;
            fVar15.f14983n = i17;
            FlutterRenderer.f fVar16 = this.f19800G;
            i18 = insets3.left;
            fVar16.f14984o = i18;
            displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.f fVar17 = this.f19800G;
                int i28 = fVar17.f14973d;
                i19 = waterfallInsets.top;
                int max = Math.max(i28, i19);
                safeInsetTop = displayCutout.getSafeInsetTop();
                fVar17.f14973d = Math.max(max, safeInsetTop);
                FlutterRenderer.f fVar18 = this.f19800G;
                int i29 = fVar18.f14974e;
                i20 = waterfallInsets.right;
                int max2 = Math.max(i29, i20);
                safeInsetRight = displayCutout.getSafeInsetRight();
                fVar18.f14974e = Math.max(max2, safeInsetRight);
                FlutterRenderer.f fVar19 = this.f19800G;
                int i30 = fVar19.f14975f;
                i21 = waterfallInsets.bottom;
                int max3 = Math.max(i30, i21);
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                fVar19.f14975f = Math.max(max3, safeInsetBottom);
                FlutterRenderer.f fVar20 = this.f19800G;
                int i31 = fVar20.f14976g;
                i22 = waterfallInsets.left;
                int max4 = Math.max(i31, i22);
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                fVar20.f14976g = Math.max(max4, safeInsetLeft);
            }
        } else {
            f fVar21 = f.NONE;
            if (!z8) {
                fVar21 = o();
            }
            this.f19800G.f14973d = z7 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f19800G.f14974e = (fVar21 == f.RIGHT || fVar21 == f.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f19800G.f14975f = (z8 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f19800G.f14976g = (fVar21 == f.LEFT || fVar21 == f.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.f fVar22 = this.f19800G;
            fVar22.f14977h = 0;
            fVar22.f14978i = 0;
            fVar22.f14979j = t(windowInsets);
            this.f19800G.f14980k = 0;
        }
        AbstractC1995b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f19800G.f14973d + ", Left: " + this.f19800G.f14976g + ", Right: " + this.f19800G.f14974e + "\nKeyboard insets: Bottom: " + this.f19800G.f14979j + ", Left: " + this.f19800G.f14980k + ", Right: " + this.f19800G.f14978i + "System Gesture Insets - Left: " + this.f19800G.f14984o + ", Top: " + this.f19800G.f14981l + ", Right: " + this.f19800G.f14982m + ", Bottom: " + this.f19800G.f14979j);
        C();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19799F = r();
        Activity b7 = T5.g.b(getContext());
        Q q7 = this.f19799F;
        if (q7 == null || b7 == null) {
            return;
        }
        q7.a(b7, AbstractC2112a.e(getContext()), this.f19804K);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f19812v != null) {
            AbstractC1995b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f19794A.d(configuration);
            B();
            T5.g.a(getContext(), this.f19812v);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !v() ? super.onCreateInputConnection(editorInfo) : this.f19815y.m(this, this.f19795B, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Q q7 = this.f19799F;
        if (q7 != null) {
            q7.b(this.f19804K);
        }
        this.f19799F = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (v() && this.f19796C.j(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !v() ? super.onHoverEvent(motionEvent) : this.f19797D.K(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        super.onProvideAutofillVirtualStructure(viewStructure, i7);
        this.f19815y.x(viewStructure, i7);
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        AbstractC1995b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i9 + " x " + i10 + ", it is now " + i7 + " x " + i8);
        FlutterRenderer.f fVar = this.f19800G;
        fVar.f14971b = i7;
        fVar.f14972c = i8;
        C();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!v()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f19796C.k(motionEvent);
    }

    public void p() {
        this.f19808r.j();
        r rVar = this.f19807q;
        if (rVar == null) {
            r q7 = q();
            this.f19807q = q7;
            addView(q7);
        } else {
            rVar.k(getWidth(), getHeight());
        }
        this.f19809s = this.f19808r;
        r rVar2 = this.f19807q;
        this.f19808r = rVar2;
        io.flutter.embedding.engine.a aVar = this.f19812v;
        if (aVar != null) {
            rVar2.c(aVar.t());
        }
    }

    public r q() {
        return new r(getContext(), getWidth(), getHeight(), r.b.background);
    }

    public Q r() {
        try {
            return new Q(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        AbstractC1995b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f19812v);
        if (!v()) {
            AbstractC1995b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator it = this.f19813w.iterator();
        if (it.hasNext()) {
            android.support.v4.media.a.a(it.next());
            throw null;
        }
        getContext().getContentResolver().unregisterContentObserver(this.f19802I);
        this.f19812v.q().F();
        this.f19812v.q().d();
        this.f19797D.R();
        this.f19797D = null;
        this.f19815y.o().restartInput(this);
        this.f19815y.n();
        this.f19795B.d();
        io.flutter.plugin.editing.n nVar = this.f19816z;
        if (nVar != null) {
            nVar.b();
        }
        G5.b bVar = this.f19814x;
        if (bVar != null) {
            bVar.c();
        }
        FlutterRenderer t7 = this.f19812v.t();
        this.f19811u = false;
        t7.k(this.f19803J);
        t7.p();
        t7.m(false);
        io.flutter.embedding.engine.renderer.k kVar = this.f19809s;
        if (kVar != null && this.f19808r == this.f19807q) {
            this.f19808r = kVar;
        }
        this.f19808r.a();
        x();
        this.f19809s = null;
        this.f19812v = null;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        io.flutter.embedding.engine.renderer.k kVar = this.f19808r;
        if (kVar instanceof s) {
            ((s) kVar).setVisibility(i7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r7 = r7.getDisplayCutout();
     */
    @android.annotation.TargetApi(28)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setWindowInfoListenerDisplayFeatures(androidx.window.layout.WindowLayoutInfo r7) {
        /*
            r6 = this;
            java.util.List r7 = r7.getDisplayFeatures()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Ld:
            boolean r1 = r7.hasNext()
            java.lang.String r2 = "FlutterView"
            if (r1 == 0) goto L92
            java.lang.Object r1 = r7.next()
            androidx.window.layout.DisplayFeature r1 = (androidx.window.layout.DisplayFeature) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "WindowInfoTracker Display Feature reported with bounds = "
            r3.append(r4)
            android.graphics.Rect r4 = r1.getBounds()
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r4 = " and type = "
            r3.append(r4)
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            t5.AbstractC1995b.f(r2, r3)
            boolean r2 = r1 instanceof androidx.window.layout.FoldingFeature
            if (r2 == 0) goto L80
            r2 = r1
            androidx.window.layout.FoldingFeature r2 = (androidx.window.layout.FoldingFeature) r2
            androidx.window.layout.FoldingFeature$OcclusionType r3 = r2.getOcclusionType()
            androidx.window.layout.FoldingFeature$OcclusionType r4 = androidx.window.layout.FoldingFeature.OcclusionType.FULL
            if (r3 != r4) goto L59
            io.flutter.embedding.engine.renderer.FlutterRenderer$d r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.d.HINGE
            goto L5b
        L59:
            io.flutter.embedding.engine.renderer.FlutterRenderer$d r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.d.FOLD
        L5b:
            androidx.window.layout.FoldingFeature$State r4 = r2.getState()
            androidx.window.layout.FoldingFeature$State r5 = androidx.window.layout.FoldingFeature.State.FLAT
            if (r4 != r5) goto L66
            io.flutter.embedding.engine.renderer.FlutterRenderer$c r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.c.POSTURE_FLAT
            goto L73
        L66:
            androidx.window.layout.FoldingFeature$State r2 = r2.getState()
            androidx.window.layout.FoldingFeature$State r4 = androidx.window.layout.FoldingFeature.State.HALF_OPENED
            if (r2 != r4) goto L71
            io.flutter.embedding.engine.renderer.FlutterRenderer$c r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.c.POSTURE_HALF_OPENED
            goto L73
        L71:
            io.flutter.embedding.engine.renderer.FlutterRenderer$c r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.c.UNKNOWN
        L73:
            io.flutter.embedding.engine.renderer.FlutterRenderer$b r4 = new io.flutter.embedding.engine.renderer.FlutterRenderer$b
            android.graphics.Rect r1 = r1.getBounds()
            r4.<init>(r1, r3, r2)
            r0.add(r4)
            goto Ld
        L80:
            io.flutter.embedding.engine.renderer.FlutterRenderer$b r2 = new io.flutter.embedding.engine.renderer.FlutterRenderer$b
            android.graphics.Rect r1 = r1.getBounds()
            io.flutter.embedding.engine.renderer.FlutterRenderer$d r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.d.UNKNOWN
            io.flutter.embedding.engine.renderer.FlutterRenderer$c r4 = io.flutter.embedding.engine.renderer.FlutterRenderer.c.UNKNOWN
            r2.<init>(r1, r3, r4)
            r0.add(r2)
            goto Ld
        L92:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r7 < r1) goto Ldb
            android.view.WindowInsets r7 = r6.getRootWindowInsets()
            if (r7 == 0) goto Ldb
            android.view.DisplayCutout r7 = I.G.a(r7)
            if (r7 == 0) goto Ldb
            java.util.List r7 = u5.AbstractC2013A.a(r7)
            java.util.Iterator r7 = r7.iterator()
        Lac:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Ldb
            java.lang.Object r1 = r7.next()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "DisplayCutout area reported with bounds = "
            r3.append(r4)
            java.lang.String r4 = r1.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            t5.AbstractC1995b.f(r2, r3)
            io.flutter.embedding.engine.renderer.FlutterRenderer$b r3 = new io.flutter.embedding.engine.renderer.FlutterRenderer$b
            io.flutter.embedding.engine.renderer.FlutterRenderer$d r4 = io.flutter.embedding.engine.renderer.FlutterRenderer.d.CUTOUT
            r3.<init>(r1, r4)
            r0.add(r3)
            goto Lac
        Ldb:
            io.flutter.embedding.engine.renderer.FlutterRenderer$f r7 = r6.f19800G
            r7.f14986q = r0
            r6.C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.D.setWindowInfoListenerDisplayFeatures(androidx.window.layout.WindowLayoutInfo):void");
    }

    public final int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    public final void u() {
        View view;
        AbstractC1995b.f("FlutterView", "Initializing FlutterView");
        if (this.f19805o != null) {
            AbstractC1995b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f19805o;
        } else if (this.f19806p != null) {
            AbstractC1995b.f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f19806p;
        } else {
            AbstractC1995b.f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f19807q;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    public boolean v() {
        io.flutter.embedding.engine.a aVar = this.f19812v;
        return aVar != null && aVar.t() == this.f19808r.getAttachedRenderer();
    }

    public final void x() {
        r rVar = this.f19807q;
        if (rVar != null) {
            rVar.f();
            removeView(this.f19807q);
            this.f19807q = null;
        }
    }

    public void y(io.flutter.embedding.engine.renderer.j jVar) {
        this.f19810t.remove(jVar);
    }

    public final void z(boolean z7, boolean z8) {
        boolean z9 = false;
        if (!this.f19812v.t().i() && !z7 && !z8) {
            z9 = true;
        }
        setWillNotDraw(z9);
    }

    public D(Context context, AttributeSet attributeSet, t tVar) {
        super(context, attributeSet);
        this.f19810t = new HashSet();
        this.f19813w = new HashSet();
        this.f19800G = new FlutterRenderer.f();
        this.f19801H = new a();
        this.f19802I = new b(new Handler(Looper.getMainLooper()));
        this.f19803J = new c();
        this.f19804K = new d();
        this.f19806p = tVar;
        this.f19808r = tVar;
        u();
    }

    public D(Context context, s sVar) {
        this(context, (AttributeSet) null, sVar);
    }

    public D(Context context, t tVar) {
        this(context, (AttributeSet) null, tVar);
    }

    public class e implements io.flutter.embedding.engine.renderer.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlutterRenderer f19821a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f19822b;

        public e(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f19821a = flutterRenderer;
            this.f19822b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void e() {
            this.f19821a.k(this);
            this.f19822b.run();
            D d7 = D.this;
            if ((d7.f19808r instanceof r) || d7.f19807q == null) {
                return;
            }
            D.this.f19807q.a();
            D.this.x();
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
        }
    }
}
