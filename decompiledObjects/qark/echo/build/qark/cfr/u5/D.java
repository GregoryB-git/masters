/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.database.ContentObserver
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.provider.Settings
 *  android.provider.Settings$System
 *  android.text.format.DateFormat
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.SparseArray
 *  android.view.Display
 *  android.view.DisplayCutout
 *  android.view.KeyEvent
 *  android.view.KeyEvent$DispatcherState
 *  android.view.MotionEvent
 *  android.view.PointerIcon
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewStructure
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeProvider
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.view.textservice.SpellCheckerInfo
 *  android.view.textservice.TextServicesManager
 *  android.widget.FrameLayout
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.NoClassDefFoundError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package u5;

import A.b;
import A.d;
import A.e;
import D5.m;
import D5.t;
import G5.b;
import I.G;
import I.M;
import I.O;
import I.P;
import I.S;
import I.T;
import T5.g;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
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
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.h;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.editing.n;
import io.flutter.plugin.platform.o;
import io.flutter.view.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import u5.A;
import u5.B;
import u5.C;
import u5.L;
import u5.Q;
import u5.c;
import u5.r;
import u5.s;
import u5.t;
import u5.u;
import u5.v;
import u5.w;
import u5.x;
import u5.y;
import u5.z;
import w5.a;

public class D
extends FrameLayout
implements b.c,
L.e {
    public F5.e A;
    public L B;
    public c C;
    public i D;
    public TextServicesManager E;
    public Q F;
    public final FlutterRenderer.f G = new FlutterRenderer.f();
    public final i.k H;
    public final ContentObserver I;
    public final j J;
    public final H.a K;
    public s o;
    public t p;
    public r q;
    public k r;
    public k s;
    public final Set t = new HashSet();
    public boolean u;
    public io.flutter.embedding.engine.a v;
    public final Set w = new HashSet();
    public G5.b x;
    public io.flutter.plugin.editing.C y;
    public n z;

    public D(Context context, AttributeSet attributeSet, s s8) {
        super(context, attributeSet);
        this.H = new i.k(){

            @Override
            public void a(boolean bl, boolean bl2) {
                D.this.z(bl, bl2);
            }
        };
        this.I = new ContentObserver(new Handler(Looper.getMainLooper())){

            public boolean deliverSelfNotifications() {
                return true;
            }

            public void onChange(boolean bl) {
                super.onChange(bl);
                if (D.this.v == null) {
                    return;
                }
                t5.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
                D.this.B();
            }
        };
        this.J = new j(){

            @Override
            public void b() {
                D.this.u = false;
                Iterator iterator = D.this.t.iterator();
                while (iterator.hasNext()) {
                    ((j)iterator.next()).b();
                }
            }

            @Override
            public void e() {
                D.this.u = true;
                Iterator iterator = D.this.t.iterator();
                while (iterator.hasNext()) {
                    ((j)iterator.next()).e();
                }
            }
        };
        this.K = new H.a(){

            public void a(WindowLayoutInfo windowLayoutInfo2) {
                D.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo2);
            }
        };
        this.o = s8;
        this.r = s8;
        this.u();
    }

    public D(Context context, AttributeSet attributeSet, t t8) {
        super(context, attributeSet);
        this.H = new ;
        this.I = new ;
        this.J = new ;
        this.K = new ;
        this.p = t8;
        this.r = t8;
        this.u();
    }

    public D(Context context, s s8) {
        this(context, null, s8);
    }

    public D(Context context, t t8) {
        this(context, null, t8);
    }

    public static /* synthetic */ boolean d(SpellCheckerInfo spellCheckerInfo) {
        return D.w(spellCheckerInfo);
    }

    public static /* synthetic */ boolean w(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals((Object)"com.google.android.inputmethod.latin");
    }

    public void A(Runnable runnable) {
        if (this.q == null) {
            t5.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        Object object = this.s;
        if (object == null) {
            t5.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.r = object;
        this.s = null;
        object = this.v.t();
        if (this.v != null && object != null) {
            this.r.b();
            object.f(new j((FlutterRenderer)object, runnable){
                public final /* synthetic */ FlutterRenderer a;
                public final /* synthetic */ Runnable b;
                {
                    this.a = flutterRenderer;
                    this.b = runnable;
                }

                @Override
                public void b() {
                }

                @Override
                public void e() {
                    this.a.k(this);
                    this.b.run();
                    D d8 = D.this;
                    if (!(d8.r instanceof r) && d8.q != null) {
                        D.this.q.a();
                        D.this.x();
                    }
                }
            });
            return;
        }
        this.q.a();
        this.x();
        runnable.run();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void B() {
        var3_1 = (this.getResources().getConfiguration().uiMode & 48) == 32 ? t.c.q : t.c.p;
        var4_2 = this.E;
        var2_3 = false;
        if (var4_2 == null) ** GOTO lbl-1000
        if (Build.VERSION.SDK_INT < 31) ** GOTO lbl-1000
        var1_4 = x.a(w.a(v.a((TextServicesManager)var4_2)), new C());
        if (y.a(this.E) && var1_4) lbl-1000: // 2 sources:
        {
            var1_4 = true;
        } else lbl-1000: // 2 sources:
        {
            var1_4 = false;
        }
        var4_2 = this.v.v().d().f(this.getResources().getConfiguration().fontScale).c(this.getResources().getDisplayMetrics()).d(var1_4);
        var1_4 = var2_3;
        if (Settings.System.getInt((ContentResolver)this.getContext().getContentResolver(), (String)"show_password", (int)1) == 1) {
            var1_4 = true;
        }
        var4_2.b(var1_4).g(DateFormat.is24HourFormat((Context)this.getContext())).e(var3_1).a();
    }

    public final void C() {
        if (!this.v()) {
            t5.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.G.a = this.getResources().getDisplayMetrics().density;
        this.G.p = ViewConfiguration.get((Context)this.getContext()).getScaledTouchSlop();
        this.v.t().n(this.G);
    }

    @Override
    public void a(KeyEvent keyEvent) {
        this.getRootView().dispatchKeyEvent(keyEvent);
    }

    public void autofill(SparseArray sparseArray) {
        this.y.j(sparseArray);
    }

    @Override
    public PointerIcon b(int n8) {
        return B.a(this.getContext(), n8);
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return this.y.p(keyEvent);
    }

    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a a8 = this.v;
        if (a8 != null) {
            return a8.q().y(view);
        }
        return super.checkInputConnectionProxy(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n8 = keyEvent.getAction();
        boolean bl = true;
        if (n8 == 0 && keyEvent.getRepeatCount() == 0) {
            this.getKeyDispatcherState().startTracking(keyEvent, (Object)this);
        } else if (keyEvent.getAction() == 1) {
            this.getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if (!this.v() || !this.B.b(keyEvent)) {
            if (super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        i i8 = this.D;
        if (i8 != null && i8.B()) {
            return this.D;
        }
        return null;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.v;
    }

    @Override
    public E5.c getBinaryMessenger() {
        return this.v.k();
    }

    public r getCurrentImageSurface() {
        return this.q;
    }

    public boolean k() {
        r r8 = this.q;
        if (r8 != null) {
            return r8.d();
        }
        return false;
    }

    public void l(j j8) {
        this.t.add((Object)j8);
    }

    public void m(r r8) {
        io.flutter.embedding.engine.a a8 = this.v;
        if (a8 != null) {
            r8.c(a8.t());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void n(io.flutter.embedding.engine.a a8) {
        Object object;
        block7 : {
            object = new StringBuilder();
            object.append("Attaching to a FlutterEngine: ");
            object.append((Object)a8);
            t5.b.f("FlutterView", object.toString());
            if (this.v()) {
                if (a8 == this.v) {
                    t5.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                    return;
                }
                t5.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                this.s();
            }
            this.v = a8;
            object = a8.t();
            this.u = object.h();
            this.r.c((FlutterRenderer)object);
            object.f(this.J);
            if (Build.VERSION.SDK_INT >= 24) {
                this.x = new G5.b(this, this.v.n());
            }
            this.y = new io.flutter.plugin.editing.C((View)this, this.v.y(), this.v.q());
            try {
                this.E = object = (TextServicesManager)this.getContext().getSystemService("textservices");
                this.z = new n((TextServicesManager)object, this.v.w());
                break block7;
            }
            catch (Exception exception) {}
            t5.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.A = this.v.m();
        this.B = new L(this);
        this.C = new c(this.v.t(), false);
        this.D = object = new i((View)this, a8.h(), (AccessibilityManager)this.getContext().getSystemService("accessibility"), this.getContext().getContentResolver(), this.v.q());
        object.Z(this.H);
        this.z(this.D.B(), this.D.D());
        this.v.q().a(this.D);
        this.v.q().w(this.v.t());
        this.y.o().restartInput((View)this);
        this.B();
        this.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor((String)"show_password"), false, this.I);
        this.C();
        a8.q().x(this);
        a8 = this.w.iterator();
        if (a8.hasNext()) {
            android.support.v4.media.a.a(a8.next());
            throw null;
        }
        if (this.u) {
            this.J.e();
        }
    }

    public final f o() {
        Context context = this.getContext();
        int n8 = context.getResources().getConfiguration().orientation;
        int n9 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (n8 == 2) {
            if (n9 == 1) {
                return f.q;
            }
            if (n9 == 3) {
                return f.p;
            }
            if (n9 == 0 || n9 == 2) {
                return f.r;
            }
        }
        return f.o;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Object object;
        WindowInsets windowInsets2 = super.onApplyWindowInsets(windowInsets);
        int n8 = Build.VERSION.SDK_INT;
        if (n8 == 29) {
            object = I.L.a(windowInsets);
            this.G.l = A.c.a((Insets)object);
            this.G.m = d.a((Insets)object);
            this.G.n = e.a((Insets)object);
            this.G.o = b.a((Insets)object);
        }
        int n9 = this.getWindowSystemUiVisibility();
        int n10 = 1;
        int n11 = 0;
        n9 = (n9 & 4) == 0 ? 1 : 0;
        if ((this.getWindowSystemUiVisibility() & 2) != 0) {
            n10 = 0;
        }
        if (n8 >= 30) {
            if (n10 != 0) {
                n11 = P.a();
            }
            n10 = n11;
            if (n9 != 0) {
                n10 = n11 | O.a();
            }
            object = M.a(windowInsets, n10);
            this.G.d = A.c.a((Insets)object);
            this.G.e = d.a((Insets)object);
            this.G.f = e.a((Insets)object);
            this.G.g = b.a((Insets)object);
            object = M.a(windowInsets, S.a());
            this.G.h = A.c.a((Insets)object);
            this.G.i = d.a((Insets)object);
            this.G.j = e.a((Insets)object);
            this.G.k = b.a((Insets)object);
            object = M.a(windowInsets, T.a());
            this.G.l = A.c.a((Insets)object);
            this.G.m = d.a((Insets)object);
            this.G.n = e.a((Insets)object);
            this.G.o = b.a((Insets)object);
            if ((windowInsets = G.a(windowInsets)) != null) {
                object = u.a((DisplayCutout)windowInsets);
                FlutterRenderer.f f8 = this.G;
                f8.d = Math.max((int)Math.max((int)f8.d, (int)A.c.a((Insets)object)), (int)h.a((DisplayCutout)windowInsets));
                f8 = this.G;
                f8.e = Math.max((int)Math.max((int)f8.e, (int)d.a((Insets)object)), (int)androidx.window.layout.e.a((DisplayCutout)windowInsets));
                f8 = this.G;
                f8.f = Math.max((int)Math.max((int)f8.f, (int)e.a((Insets)object)), (int)androidx.window.layout.f.a((DisplayCutout)windowInsets));
                f8 = this.G;
                f8.g = Math.max((int)Math.max((int)f8.g, (int)b.a((Insets)object)), (int)androidx.window.layout.g.a((DisplayCutout)windowInsets));
            }
        } else {
            object = f.o;
            if (n10 == 0) {
                object = this.o();
            }
            FlutterRenderer.f f9 = this.G;
            n11 = n9 != 0 ? windowInsets.getSystemWindowInsetTop() : 0;
            f9.d = n11;
            f9 = this.G;
            n11 = object != f.q && object != f.r ? windowInsets.getSystemWindowInsetRight() : 0;
            f9.e = n11;
            f9 = this.G;
            n11 = n10 != 0 && this.t(windowInsets) == 0 ? windowInsets.getSystemWindowInsetBottom() : 0;
            f9.f = n11;
            f9 = this.G;
            n11 = object != f.p && object != f.r ? windowInsets.getSystemWindowInsetLeft() : 0;
            f9.g = n11;
            object = this.G;
            object.h = 0;
            object.i = 0;
            object.j = this.t(windowInsets);
            this.G.k = 0;
        }
        windowInsets = new StringBuilder();
        windowInsets.append("Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: ");
        windowInsets.append(this.G.d);
        windowInsets.append(", Left: ");
        windowInsets.append(this.G.g);
        windowInsets.append(", Right: ");
        windowInsets.append(this.G.e);
        windowInsets.append("\nKeyboard insets: Bottom: ");
        windowInsets.append(this.G.j);
        windowInsets.append(", Left: ");
        windowInsets.append(this.G.k);
        windowInsets.append(", Right: ");
        windowInsets.append(this.G.i);
        windowInsets.append("System Gesture Insets - Left: ");
        windowInsets.append(this.G.o);
        windowInsets.append(", Top: ");
        windowInsets.append(this.G.l);
        windowInsets.append(", Right: ");
        windowInsets.append(this.G.m);
        windowInsets.append(", Bottom: ");
        windowInsets.append(this.G.j);
        t5.b.f("FlutterView", windowInsets.toString());
        this.C();
        return windowInsets2;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = this.r();
        Activity activity = g.b(this.getContext());
        Q q8 = this.F;
        if (q8 != null && activity != null) {
            q8.a(activity, x.a.e(this.getContext()), this.K);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.v != null) {
            t5.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.A.d(configuration);
            this.B();
            g.a(this.getContext(), this.v);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!this.v()) {
            return super.onCreateInputConnection(editorInfo);
        }
        return this.y.m((View)this, this.B, editorInfo);
    }

    public void onDetachedFromWindow() {
        Q q8 = this.F;
        if (q8 != null) {
            q8.b(this.K);
        }
        this.F = null;
        super.onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.v() && this.C.j(motionEvent, this.getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!this.v()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.D.K(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int n8) {
        super.onProvideAutofillVirtualStructure(viewStructure, n8);
        this.y.x(viewStructure, n8);
    }

    public void onSizeChanged(int n8, int n9, int n10, int n11) {
        super.onSizeChanged(n8, n9, n10, n11);
        Object object = new StringBuilder();
        object.append("Size changed. Sending Flutter new viewport metrics. FlutterView was ");
        object.append(n10);
        object.append(" x ");
        object.append(n11);
        object.append(", it is now ");
        object.append(n8);
        object.append(" x ");
        object.append(n9);
        t5.b.f("FlutterView", object.toString());
        object = this.G;
        object.b = n8;
        object.c = n9;
        this.C();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.v()) {
            return super.onTouchEvent(motionEvent);
        }
        this.requestUnbufferedDispatch(motionEvent);
        return this.C.k(motionEvent);
    }

    public void p() {
        this.r.j();
        r r8 = this.q;
        if (r8 == null) {
            this.q = r8 = this.q();
            this.addView((View)r8);
        } else {
            r8.k(this.getWidth(), this.getHeight());
        }
        this.s = this.r;
        r8 = this.q;
        this.r = r8;
        io.flutter.embedding.engine.a a8 = this.v;
        if (a8 != null) {
            r8.c(a8.t());
        }
    }

    public r q() {
        return new r(this.getContext(), this.getWidth(), this.getHeight(), r.b.o);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Q r() {
        try {
            return new Q(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(this.getContext())));
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return null;
        }
    }

    public void s() {
        Object object = new StringBuilder();
        object.append("Detaching from a FlutterEngine: ");
        object.append((Object)this.v);
        t5.b.f("FlutterView", object.toString());
        if (!this.v()) {
            t5.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        object = this.w.iterator();
        if (!object.hasNext()) {
            this.getContext().getContentResolver().unregisterContentObserver(this.I);
            this.v.q().F();
            this.v.q().d();
            this.D.R();
            this.D = null;
            this.y.o().restartInput((View)this);
            this.y.n();
            this.B.d();
            object = this.z;
            if (object != null) {
                object.b();
            }
            if ((object = this.x) != null) {
                object.c();
            }
            object = this.v.t();
            this.u = false;
            object.k(this.J);
            object.p();
            object.m(false);
            object = this.s;
            if (object != null && this.r == this.q) {
                this.r = object;
            }
            this.r.a();
            this.x();
            this.s = null;
            this.v = null;
            return;
        }
        android.support.v4.media.a.a(object.next());
        throw null;
    }

    public void setVisibility(int n8) {
        super.setVisibility(n8);
        k k8 = this.r;
        if (k8 instanceof s) {
            ((s)k8).setVisibility(n8);
        }
    }

    @TargetApi(value=28)
    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo object) {
        object = object.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            DisplayFeature displayFeature = (DisplayFeature)iterator.next();
            object = new StringBuilder();
            object.append("WindowInfoTracker Display Feature reported with bounds = ");
            object.append(displayFeature.getBounds().toString());
            object.append(" and type = ");
            object.append(displayFeature.getClass().getSimpleName());
            t5.b.f("FlutterView", object.toString());
            if (displayFeature instanceof FoldingFeature) {
                object = (FoldingFeature)displayFeature;
                Object object2 = object.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? FlutterRenderer.d.r : FlutterRenderer.d.q;
                object = object.getState() == FoldingFeature.State.FLAT ? FlutterRenderer.c.q : (object.getState() == FoldingFeature.State.HALF_OPENED ? FlutterRenderer.c.r : FlutterRenderer.c.p);
                arrayList.add((Object)new FlutterRenderer.b(displayFeature.getBounds(), (FlutterRenderer.d)((Object)object2), (FlutterRenderer.c)((Object)object)));
                continue;
            }
            arrayList.add((Object)new FlutterRenderer.b(displayFeature.getBounds(), FlutterRenderer.d.p, FlutterRenderer.c.p));
        }
        if (Build.VERSION.SDK_INT >= 28 && (object = this.getRootWindowInsets()) != null && (object = G.a((WindowInsets)object)) != null) {
            for (Object object2 : A.a((DisplayCutout)object)) {
                iterator = new StringBuilder();
                iterator.append("DisplayCutout area reported with bounds = ");
                iterator.append(object2.toString());
                t5.b.f("FlutterView", iterator.toString());
                arrayList.add((Object)new FlutterRenderer.b((Rect)object2, FlutterRenderer.d.s));
            }
        }
        this.G.q = arrayList;
        this.C();
    }

    public final int t(WindowInsets windowInsets) {
        int n8 = this.getRootView().getHeight();
        if ((double)windowInsets.getSystemWindowInsetBottom() < (double)n8 * 0.18) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void u() {
        void var1_2;
        t5.b.f("FlutterView", "Initializing FlutterView");
        if (this.o != null) {
            t5.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            s s8 = this.o;
        } else if (this.p != null) {
            t5.b.f("FlutterView", "Internally using a FlutterTextureView.");
            t t8 = this.p;
        } else {
            t5.b.f("FlutterView", "Internally using a FlutterImageView.");
            r r8 = this.q;
        }
        this.addView((View)var1_2);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            z.a(this, 1);
        }
    }

    public boolean v() {
        io.flutter.embedding.engine.a a8 = this.v;
        if (a8 != null && a8.t() == this.r.getAttachedRenderer()) {
            return true;
        }
        return false;
    }

    public final void x() {
        r r8 = this.q;
        if (r8 != null) {
            r8.f();
            this.removeView((View)this.q);
            this.q = null;
        }
    }

    public void y(j j8) {
        this.t.remove((Object)j8);
    }

    public final void z(boolean bl, boolean bl2) {
        boolean bl3;
        boolean bl4 = this.v.t().i();
        boolean bl5 = bl3 = false;
        if (!bl4) {
            bl5 = bl3;
            if (!bl) {
                bl5 = bl3;
                if (!bl2) {
                    bl5 = true;
                }
            }
        }
        this.setWillNotDraw(bl5);
    }

    public static final class f
    extends Enum {
        public static final /* enum */ f o = new f();
        public static final /* enum */ f p = new f();
        public static final /* enum */ f q = new f();
        public static final /* enum */ f r = new f();
        public static final /* synthetic */ f[] s;

        static {
            s = f.c();
        }

        public static /* synthetic */ f[] c() {
            return new f[]{o, p, q, r};
        }

        public static f valueOf(String string2) {
            return (f)Enum.valueOf(f.class, (String)string2);
        }

        public static f[] values() {
            return (f[])s.clone();
        }
    }

}

