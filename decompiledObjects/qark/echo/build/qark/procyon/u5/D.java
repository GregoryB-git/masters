// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import android.view.ViewGroup;
import android.annotation.TargetApi;
import java.util.List;
import android.graphics.Rect;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.DisplayFeature;
import java.util.ArrayList;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowInfoTracker;
import android.view.ViewStructure;
import android.view.MotionEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.content.res.Configuration;
import android.app.Activity;
import android.view.DisplayCutout;
import android.graphics.Insets;
import androidx.window.layout.g;
import androidx.window.layout.f;
import androidx.window.layout.h;
import I.G;
import I.T;
import I.S;
import I.M;
import I.O;
import I.P;
import A.d;
import android.view.WindowInsets;
import android.view.WindowManager;
import io.flutter.plugin.platform.o;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.View;
import android.view.PointerIcon;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.text.format.DateFormat;
import android.provider.Settings$System;
import java.util.function.Predicate;
import android.os.Build$VERSION;
import android.view.textservice.SpellCheckerInfo;
import androidx.window.layout.WindowLayoutInfo;
import java.util.Iterator;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import io.flutter.plugin.editing.n;
import io.flutter.plugin.editing.C;
import java.util.Set;
import io.flutter.embedding.engine.renderer.k;
import H.a;
import io.flutter.embedding.engine.renderer.j;
import android.database.ContentObserver;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import android.view.textservice.TextServicesManager;
import io.flutter.view.i;
import F5.e;
import G5.b;
import android.widget.FrameLayout;

public class D extends FrameLayout implements b.c, e
{
    public F5.e A;
    public L B;
    public c C;
    public i D;
    public TextServicesManager E;
    public Q F;
    public final FlutterRenderer.f G;
    public final i.k H;
    public final ContentObserver I;
    public final io.flutter.embedding.engine.renderer.j J;
    public final a K;
    public s o;
    public t p;
    public r q;
    public k r;
    public k s;
    public final Set t;
    public boolean u;
    public io.flutter.embedding.engine.a v;
    public final Set w;
    public b x;
    public C y;
    public n z;
    
    public D(final Context context, final AttributeSet set, final s s) {
        super(context, set);
        this.t = new HashSet();
        this.w = new HashSet();
        this.G = new FlutterRenderer.f();
        this.H = new i.k() {
            @Override
            public void a(final boolean b, final boolean b2) {
                u5.D.this.z(b, b2);
            }
        };
        this.I = new ContentObserver(new Handler(Looper.getMainLooper())) {
            public boolean deliverSelfNotifications() {
                return true;
            }
            
            public void onChange(final boolean b) {
                super.onChange(b);
                if (u5.D.f(u5.D.this) == null) {
                    return;
                }
                t5.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
                u5.D.this.B();
            }
        };
        this.J = new io.flutter.embedding.engine.renderer.j() {
            @Override
            public void b() {
                u5.D.g(u5.D.this, false);
                final Iterator<j> iterator = u5.D.h(u5.D.this).iterator();
                while (iterator.hasNext()) {
                    iterator.next().b();
                }
            }
            
            @Override
            public void e() {
                u5.D.g(u5.D.this, true);
                final Iterator<j> iterator = u5.D.h(u5.D.this).iterator();
                while (iterator.hasNext()) {
                    iterator.next().e();
                }
            }
        };
        this.K = new a() {
            public void a(final WindowLayoutInfo windowInfoListenerDisplayFeatures) {
                u5.D.this.setWindowInfoListenerDisplayFeatures(windowInfoListenerDisplayFeatures);
            }
        };
        this.o = s;
        this.r = s;
        this.u();
    }
    
    public D(final Context context, final AttributeSet set, final t t) {
        super(context, set);
        this.t = new HashSet();
        this.w = new HashSet();
        this.G = new FlutterRenderer.f();
        this.H = new i.k() {
            @Override
            public void a(final boolean b, final boolean b2) {
                u5.D.this.z(b, b2);
            }
        };
        this.I = new ContentObserver(new Handler(Looper.getMainLooper())) {
            public boolean deliverSelfNotifications() {
                return true;
            }
            
            public void onChange(final boolean b) {
                super.onChange(b);
                if (u5.D.f(u5.D.this) == null) {
                    return;
                }
                t5.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
                u5.D.this.B();
            }
        };
        this.J = new io.flutter.embedding.engine.renderer.j() {
            @Override
            public void b() {
                u5.D.g(u5.D.this, false);
                final Iterator<j> iterator = u5.D.h(u5.D.this).iterator();
                while (iterator.hasNext()) {
                    iterator.next().b();
                }
            }
            
            @Override
            public void e() {
                u5.D.g(u5.D.this, true);
                final Iterator<j> iterator = u5.D.h(u5.D.this).iterator();
                while (iterator.hasNext()) {
                    iterator.next().e();
                }
            }
        };
        this.K = new a() {
            public void a(final WindowLayoutInfo windowInfoListenerDisplayFeatures) {
                u5.D.this.setWindowInfoListenerDisplayFeatures(windowInfoListenerDisplayFeatures);
            }
        };
        this.p = t;
        this.r = t;
        this.u();
    }
    
    public D(final Context context, final s s) {
        this(context, null, s);
    }
    
    public D(final Context context, final t t) {
        this(context, null, t);
    }
    
    public static /* synthetic */ io.flutter.embedding.engine.a f(final D d) {
        return d.v;
    }
    
    public static /* synthetic */ boolean g(final D d, final boolean u) {
        return d.u = u;
    }
    
    public static /* synthetic */ Set h(final D d) {
        return d.t;
    }
    
    public static /* synthetic */ r i(final D d) {
        return d.q;
    }
    
    public void A(final Runnable runnable) {
        if (this.q == null) {
            t5.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        final k s = this.s;
        if (s == null) {
            t5.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.r = s;
        this.s = null;
        final FlutterRenderer t = this.v.t();
        if (this.v != null && t != null) {
            this.r.b();
            t.f(new io.flutter.embedding.engine.renderer.j() {
                @Override
                public void b() {
                }
                
                @Override
                public void e() {
                    t.k(this);
                    runnable.run();
                    final D c = u5.D.this;
                    if (!(c.r instanceof r) && u5.D.i(c) != null) {
                        u5.D.i(u5.D.this).a();
                        u5.D.this.x();
                    }
                }
            });
            return;
        }
        this.q.a();
        this.x();
        runnable.run();
    }
    
    public void B() {
        D5.t.c c;
        if ((((View)this).getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            c = D5.t.c.q;
        }
        else {
            c = D5.t.c.p;
        }
        final TextServicesManager e = this.E;
        final boolean b = false;
        boolean b2 = false;
        Label_0090: {
            Label_0088: {
                if (e != null) {
                    if (Build$VERSION.SDK_INT >= 31) {
                        final boolean a = u5.x.a(u5.w.a(u5.v.a(e)), (Predicate)new u5.C());
                        if (!u5.y.a(this.E) || !a) {
                            break Label_0088;
                        }
                    }
                    b2 = true;
                    break Label_0090;
                }
            }
            b2 = false;
        }
        final D5.t.b d = this.v.v().d().f(((View)this).getResources().getConfiguration().fontScale).c(((View)this).getResources().getDisplayMetrics()).d(b2);
        boolean b3 = b;
        if (Settings$System.getInt(((View)this).getContext().getContentResolver(), "show_password", 1) == 1) {
            b3 = true;
        }
        d.b(b3).g(DateFormat.is24HourFormat(((View)this).getContext())).e(c).a();
    }
    
    public final void C() {
        if (!this.v()) {
            t5.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.G.a = ((View)this).getResources().getDisplayMetrics().density;
        this.G.p = ViewConfiguration.get(((View)this).getContext()).getScaledTouchSlop();
        this.v.t().n(this.G);
    }
    
    public void a(final KeyEvent keyEvent) {
        ((View)this).getRootView().dispatchKeyEvent(keyEvent);
    }
    
    public void autofill(final SparseArray sparseArray) {
        this.y.j(sparseArray);
    }
    
    public PointerIcon b(final int n) {
        return u5.B.a(((View)this).getContext(), n);
    }
    
    public boolean c(final KeyEvent keyEvent) {
        return this.y.p(keyEvent);
    }
    
    public boolean checkInputConnectionProxy(final View view) {
        final io.flutter.embedding.engine.a v = this.v;
        if (v != null) {
            return v.q().y(view);
        }
        return super.checkInputConnectionProxy(view);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int action = keyEvent.getAction();
        boolean b = true;
        if (action == 0 && keyEvent.getRepeatCount() == 0) {
            ((View)this).getKeyDispatcherState().startTracking(keyEvent, (Object)this);
        }
        else if (keyEvent.getAction() == 1) {
            ((View)this).getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if (!this.v() || !this.B.b(keyEvent)) {
            if (super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        final i d = this.D;
        if (d != null && d.B()) {
            return this.D;
        }
        return null;
    }
    
    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.v;
    }
    
    public E5.c getBinaryMessenger() {
        return this.v.k();
    }
    
    public r getCurrentImageSurface() {
        return this.q;
    }
    
    public boolean k() {
        final r q = this.q;
        return q != null && q.d();
    }
    
    public void l(final io.flutter.embedding.engine.renderer.j j) {
        this.t.add(j);
    }
    
    public void m(final r r) {
        final io.flutter.embedding.engine.a v = this.v;
        if (v != null) {
            r.c(v.t());
        }
    }
    
    public void n(io.flutter.embedding.engine.a iterator) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Attaching to a FlutterEngine: ");
        sb.append(iterator);
        t5.b.f("FlutterView", sb.toString());
        if (this.v()) {
            if (iterator == this.v) {
                t5.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            }
            t5.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
            this.s();
        }
        this.v = iterator;
        final FlutterRenderer t = iterator.t();
        this.u = t.h();
        this.r.c(t);
        t.f(this.J);
        if (Build$VERSION.SDK_INT >= 24) {
            this.x = new b((b.c)this, this.v.n());
        }
        this.y = new C((View)this, this.v.y(), this.v.q());
        while (true) {
            try {
                final TextServicesManager e = (TextServicesManager)((View)this).getContext().getSystemService("textservices");
                this.E = e;
                this.z = new n(e, this.v.w());
                while (true) {
                    this.A = this.v.m();
                    this.B = new L((L.e)this);
                    this.C = new c(this.v.t(), false);
                    (this.D = new i((View)this, iterator.h(), (AccessibilityManager)((View)this).getContext().getSystemService("accessibility"), ((View)this).getContext().getContentResolver(), this.v.q())).Z(this.H);
                    this.z(this.D.B(), this.D.D());
                    this.v.q().a(this.D);
                    this.v.q().w(this.v.t());
                    this.y.o().restartInput((View)this);
                    this.B();
                    ((View)this).getContext().getContentResolver().registerContentObserver(Settings$System.getUriFor("show_password"), false, this.I);
                    this.C();
                    iterator.q().x(this);
                    iterator = (io.flutter.embedding.engine.a)this.w.iterator();
                    if (!((Iterator)iterator).hasNext()) {
                        if (this.u) {
                            this.J.e();
                        }
                        return;
                    }
                    android.support.v4.media.a.a(((Iterator<Object>)iterator).next());
                    throw null;
                    t5.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
                    continue;
                }
            }
            catch (Exception ex) {}
            continue;
        }
    }
    
    public final f o() {
        final Context context = ((View)this).getContext();
        final int orientation = context.getResources().getConfiguration().orientation;
        final int rotation = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (orientation == 2) {
            if (rotation == 1) {
                return f.q;
            }
            if (rotation == 3) {
                return f.p;
            }
            if (rotation == 0 || rotation == 2) {
                return f.r;
            }
        }
        return f.o;
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        final WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT == 29) {
            final Insets a = I.L.a(windowInsets);
            this.G.l = A.c.a(a);
            this.G.m = A.d.a(a);
            this.G.n = A.e.a(a);
            this.G.o = A.b.a(a);
        }
        final int windowSystemUiVisibility = ((View)this).getWindowSystemUiVisibility();
        boolean b = true;
        int a2 = 0;
        final boolean b2 = (windowSystemUiVisibility & 0x4) == 0x0;
        if ((((View)this).getWindowSystemUiVisibility() & 0x2) != 0x0) {
            b = false;
        }
        if (sdk_INT >= 30) {
            if (b) {
                a2 = P.a();
            }
            int n = a2;
            if (b2) {
                n = (a2 | O.a());
            }
            final Insets a3 = M.a(windowInsets, n);
            this.G.d = A.c.a(a3);
            this.G.e = A.d.a(a3);
            this.G.f = A.e.a(a3);
            this.G.g = A.b.a(a3);
            final Insets a4 = M.a(windowInsets, S.a());
            this.G.h = A.c.a(a4);
            this.G.i = A.d.a(a4);
            this.G.j = A.e.a(a4);
            this.G.k = A.b.a(a4);
            final Insets a5 = M.a(windowInsets, T.a());
            this.G.l = A.c.a(a5);
            this.G.m = A.d.a(a5);
            this.G.n = A.e.a(a5);
            this.G.o = A.b.a(a5);
            final DisplayCutout a6 = I.G.a(windowInsets);
            if (a6 != null) {
                final Insets a7 = u5.u.a(a6);
                final FlutterRenderer.f g = this.G;
                g.d = Math.max(Math.max(g.d, A.c.a(a7)), androidx.window.layout.h.a(a6));
                final FlutterRenderer.f g2 = this.G;
                g2.e = Math.max(Math.max(g2.e, A.d.a(a7)), androidx.window.layout.e.a(a6));
                final FlutterRenderer.f g3 = this.G;
                g3.f = Math.max(Math.max(g3.f, A.e.a(a7)), androidx.window.layout.f.a(a6));
                final FlutterRenderer.f g4 = this.G;
                g4.g = Math.max(Math.max(g4.g, A.b.a(a7)), androidx.window.layout.g.a(a6));
            }
        }
        else {
            f f = u5.D.f.o;
            if (!b) {
                f = this.o();
            }
            final FlutterRenderer.f g5 = this.G;
            int systemWindowInsetTop;
            if (b2) {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            }
            else {
                systemWindowInsetTop = 0;
            }
            g5.d = systemWindowInsetTop;
            final FlutterRenderer.f g6 = this.G;
            int systemWindowInsetRight;
            if (f != u5.D.f.q && f != u5.D.f.r) {
                systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            }
            else {
                systemWindowInsetRight = 0;
            }
            g6.e = systemWindowInsetRight;
            final FlutterRenderer.f g7 = this.G;
            int systemWindowInsetBottom;
            if (b && this.t(windowInsets) == 0) {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            }
            else {
                systemWindowInsetBottom = 0;
            }
            g7.f = systemWindowInsetBottom;
            final FlutterRenderer.f g8 = this.G;
            int systemWindowInsetLeft;
            if (f != u5.D.f.p && f != u5.D.f.r) {
                systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            }
            else {
                systemWindowInsetLeft = 0;
            }
            g8.g = systemWindowInsetLeft;
            final FlutterRenderer.f g9 = this.G;
            g9.h = 0;
            g9.i = 0;
            g9.j = this.t(windowInsets);
            this.G.k = 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: ");
        sb.append(this.G.d);
        sb.append(", Left: ");
        sb.append(this.G.g);
        sb.append(", Right: ");
        sb.append(this.G.e);
        sb.append("\nKeyboard insets: Bottom: ");
        sb.append(this.G.j);
        sb.append(", Left: ");
        sb.append(this.G.k);
        sb.append(", Right: ");
        sb.append(this.G.i);
        sb.append("System Gesture Insets - Left: ");
        sb.append(this.G.o);
        sb.append(", Top: ");
        sb.append(this.G.l);
        sb.append(", Right: ");
        sb.append(this.G.m);
        sb.append(", Bottom: ");
        sb.append(this.G.j);
        t5.b.f("FlutterView", sb.toString());
        this.C();
        return onApplyWindowInsets;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = this.r();
        final Activity b = T5.g.b(((View)this).getContext());
        final Q f = this.F;
        if (f != null && b != null) {
            f.a(b, x.a.e(((View)this).getContext()), this.K);
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.v != null) {
            t5.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.A.d(configuration);
            this.B();
            T5.g.a(((View)this).getContext(), (T5.g.a)this.v);
        }
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        if (!this.v()) {
            return super.onCreateInputConnection(editorInfo);
        }
        return this.y.m((View)this, this.B, editorInfo);
    }
    
    public void onDetachedFromWindow() {
        final Q f = this.F;
        if (f != null) {
            f.b(this.K);
        }
        this.F = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        return (this.v() && this.C.j(motionEvent, ((View)this).getContext())) || super.onGenericMotionEvent(motionEvent);
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        if (!this.v()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.D.K(motionEvent);
    }
    
    public void onProvideAutofillVirtualStructure(final ViewStructure viewStructure, final int n) {
        super.onProvideAutofillVirtualStructure(viewStructure, n);
        this.y.x(viewStructure, n);
    }
    
    public void onSizeChanged(final int n, final int n2, final int i, final int j) {
        super.onSizeChanged(n, n2, i, j);
        final StringBuilder sb = new StringBuilder();
        sb.append("Size changed. Sending Flutter new viewport metrics. FlutterView was ");
        sb.append(i);
        sb.append(" x ");
        sb.append(j);
        sb.append(", it is now ");
        sb.append(n);
        sb.append(" x ");
        sb.append(n2);
        t5.b.f("FlutterView", sb.toString());
        final FlutterRenderer.f g = this.G;
        g.b = n;
        g.c = n2;
        this.C();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.v()) {
            return super.onTouchEvent(motionEvent);
        }
        ((View)this).requestUnbufferedDispatch(motionEvent);
        return this.C.k(motionEvent);
    }
    
    public void p() {
        this.r.j();
        final r q = this.q;
        if (q == null) {
            ((ViewGroup)this).addView((View)(this.q = this.q()));
        }
        else {
            q.k(((View)this).getWidth(), ((View)this).getHeight());
        }
        this.s = this.r;
        final r q2 = this.q;
        this.r = q2;
        final io.flutter.embedding.engine.a v = this.v;
        if (v != null) {
            q2.c(v.t());
        }
    }
    
    public r q() {
        return new r(((View)this).getContext(), ((View)this).getWidth(), ((View)this).getHeight(), u5.r.b.o);
    }
    
    public Q r() {
        try {
            return new Q(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(((View)this).getContext())));
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return null;
        }
    }
    
    public void s() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Detaching from a FlutterEngine: ");
        sb.append(this.v);
        t5.b.f("FlutterView", sb.toString());
        if (!this.v()) {
            t5.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        final Iterator<Object> iterator = (Iterator<Object>)this.w.iterator();
        if (!iterator.hasNext()) {
            ((View)this).getContext().getContentResolver().unregisterContentObserver(this.I);
            this.v.q().F();
            this.v.q().d();
            this.D.R();
            this.D = null;
            this.y.o().restartInput((View)this);
            this.y.n();
            this.B.d();
            final n z = this.z;
            if (z != null) {
                z.b();
            }
            final b x = this.x;
            if (x != null) {
                x.c();
            }
            final FlutterRenderer t = this.v.t();
            this.u = false;
            t.k(this.J);
            t.p();
            t.m(false);
            final k s = this.s;
            if (s != null && this.r == this.q) {
                this.r = s;
            }
            this.r.a();
            this.x();
            this.s = null;
            this.v = null;
            return;
        }
        android.support.v4.media.a.a(iterator.next());
        throw null;
    }
    
    public void setVisibility(final int n) {
        super.setVisibility(n);
        final k r = this.r;
        if (r instanceof s) {
            ((View)r).setVisibility(n);
        }
    }
    
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(final WindowLayoutInfo windowLayoutInfo) {
        final List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        final ArrayList<FlutterRenderer.b> q = new ArrayList<FlutterRenderer.b>();
        for (final DisplayFeature displayFeature : displayFeatures) {
            final StringBuilder sb = new StringBuilder();
            sb.append("WindowInfoTracker Display Feature reported with bounds = ");
            sb.append(displayFeature.getBounds().toString());
            sb.append(" and type = ");
            sb.append(((FoldingFeature)displayFeature).getClass().getSimpleName());
            t5.b.f("FlutterView", sb.toString());
            if (displayFeature instanceof FoldingFeature) {
                final FoldingFeature foldingFeature = (FoldingFeature)displayFeature;
                FlutterRenderer.d d;
                if (foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL) {
                    d = FlutterRenderer.d.r;
                }
                else {
                    d = FlutterRenderer.d.q;
                }
                FlutterRenderer.c c;
                if (foldingFeature.getState() == FoldingFeature.State.FLAT) {
                    c = FlutterRenderer.c.q;
                }
                else if (foldingFeature.getState() == FoldingFeature.State.HALF_OPENED) {
                    c = FlutterRenderer.c.r;
                }
                else {
                    c = FlutterRenderer.c.p;
                }
                q.add(new FlutterRenderer.b(displayFeature.getBounds(), d, c));
            }
            else {
                q.add(new FlutterRenderer.b(displayFeature.getBounds(), FlutterRenderer.d.p, FlutterRenderer.c.p));
            }
        }
        if (Build$VERSION.SDK_INT >= 28) {
            final WindowInsets rootWindowInsets = ((View)this).getRootWindowInsets();
            if (rootWindowInsets != null) {
                final DisplayCutout a = I.G.a(rootWindowInsets);
                if (a != null) {
                    for (final Rect rect : u5.A.a(a)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("DisplayCutout area reported with bounds = ");
                        sb2.append(rect.toString());
                        t5.b.f("FlutterView", sb2.toString());
                        q.add(new FlutterRenderer.b(rect, FlutterRenderer.d.s));
                    }
                }
            }
        }
        this.G.q = q;
        this.C();
    }
    
    public final int t(final WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < ((View)this).getRootView().getHeight() * 0.18) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }
    
    public final void u() {
        t5.b.f("FlutterView", "Initializing FlutterView");
        k k;
        if (this.o != null) {
            t5.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            k = this.o;
        }
        else if (this.p != null) {
            t5.b.f("FlutterView", "Internally using a FlutterTextureView.");
            k = this.p;
        }
        else {
            t5.b.f("FlutterView", "Internally using a FlutterImageView.");
            k = this.q;
        }
        ((ViewGroup)this).addView((View)k);
        ((View)this).setFocusable(true);
        ((View)this).setFocusableInTouchMode(true);
        if (Build$VERSION.SDK_INT >= 26) {
            u5.z.a(this, 1);
        }
    }
    
    public boolean v() {
        final io.flutter.embedding.engine.a v = this.v;
        return v != null && v.t() == this.r.getAttachedRenderer();
    }
    
    public final void x() {
        final r q = this.q;
        if (q != null) {
            q.f();
            ((ViewGroup)this).removeView((View)this.q);
            this.q = null;
        }
    }
    
    public void y(final io.flutter.embedding.engine.renderer.j j) {
        this.t.remove(j);
    }
    
    public final void z(final boolean b, final boolean b2) {
        final boolean i = this.v.t().i();
        boolean willNotDraw;
        final boolean b3 = willNotDraw = false;
        if (!i) {
            willNotDraw = b3;
            if (!b) {
                willNotDraw = b3;
                if (!b2) {
                    willNotDraw = true;
                }
            }
        }
        ((View)this).setWillNotDraw(willNotDraw);
    }
    
    public enum f
    {
        o("NONE", 0), 
        p("LEFT", 1), 
        q("RIGHT", 2), 
        r("BOTH", 3);
        
        static {
            s = c();
        }
        
        public f(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ f[] c() {
            return new f[] { f.o, f.p, f.q, f.r };
        }
    }
}
