package io.flutter.plugin.platform;

import D5.q;
import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.editing.C;
import io.flutter.plugin.platform.r;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t5.AbstractC1995b;
import u5.C2016c;
import u5.D;
import u5.N;
import w5.C2105a;
import z5.AbstractC2327a;

/* loaded from: classes.dex */
public class r implements o {

    /* renamed from: w, reason: collision with root package name */
    public static Class[] f15085w = {SurfaceView.class};

    /* renamed from: x, reason: collision with root package name */
    public static boolean f15086x = true;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f15087y = true;

    /* renamed from: b, reason: collision with root package name */
    public C2016c f15089b;

    /* renamed from: c, reason: collision with root package name */
    public Context f15090c;

    /* renamed from: d, reason: collision with root package name */
    public D f15091d;

    /* renamed from: e, reason: collision with root package name */
    public TextureRegistry f15092e;

    /* renamed from: f, reason: collision with root package name */
    public C f15093f;

    /* renamed from: g, reason: collision with root package name */
    public D5.q f15094g;

    /* renamed from: o, reason: collision with root package name */
    public int f15102o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15103p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15104q = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15108u = false;

    /* renamed from: v, reason: collision with root package name */
    public final q.g f15109v = new a();

    /* renamed from: a, reason: collision with root package name */
    public final m f15088a = new m();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f15096i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final io.flutter.plugin.platform.a f15095h = new io.flutter.plugin.platform.a();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f15097j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f15100m = new SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f15105r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f15106s = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f15101n = new SparseArray();

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f15098k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f15099l = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    public final N f15107t = N.a();

    public class a implements q.g {
        public a() {
        }

        @Override // D5.q.g
        public void a(boolean z7) {
            r.this.f15104q = z7;
        }

        @Override // D5.q.g
        public void b(int i7, double d7, double d8) {
            if (r.this.b(i7)) {
                return;
            }
            AbstractC1995b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i7);
        }

        @Override // D5.q.g
        public void c(int i7, int i8) {
            StringBuilder sb;
            String str;
            if (!r.l0(i8)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i8 + "(view id: " + i7 + ")");
            }
            if (r.this.b(i7)) {
                View e7 = ((y) r.this.f15096i.get(Integer.valueOf(i7))).e();
                if (e7 != null) {
                    e7.setLayoutDirection(i8);
                    return;
                } else {
                    sb = new StringBuilder();
                    str = "Setting direction to a null view with id: ";
                }
            } else {
                android.support.v4.media.a.a(r.this.f15098k.get(i7));
                sb = new StringBuilder();
                str = "Setting direction to an unknown view with id: ";
            }
            sb.append(str);
            sb.append(i7);
            AbstractC1995b.b("PlatformViewsController", sb.toString());
        }

        @Override // D5.q.g
        public void d(q.f fVar) {
            int i7 = fVar.f1389a;
            float f7 = r.this.f15090c.getResources().getDisplayMetrics().density;
            if (r.this.b(i7)) {
                ((y) r.this.f15096i.get(Integer.valueOf(i7))).b(r.this.h0(f7, fVar, true));
                return;
            }
            android.support.v4.media.a.a(r.this.f15098k.get(i7));
            AbstractC1995b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i7);
        }

        @Override // D5.q.g
        public long e(q.d dVar) {
            r.this.J(dVar);
            int i7 = dVar.f1373a;
            if (r.this.f15101n.get(i7) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i7);
            }
            if (r.this.f15092e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i7);
            }
            if (r.this.f15091d != null) {
                r.this.C(dVar, true);
                throw null;
            }
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i7);
        }

        @Override // D5.q.g
        public void f(int i7) {
            StringBuilder sb;
            String str;
            if (r.this.b(i7)) {
                View e7 = ((y) r.this.f15096i.get(Integer.valueOf(i7))).e();
                if (e7 != null) {
                    e7.clearFocus();
                    return;
                } else {
                    sb = new StringBuilder();
                    str = "Clearing focus on a null view with id: ";
                }
            } else {
                android.support.v4.media.a.a(r.this.f15098k.get(i7));
                sb = new StringBuilder();
                str = "Clearing focus on an unknown view with id: ";
            }
            sb.append(str);
            sb.append(i7);
            AbstractC1995b.b("PlatformViewsController", sb.toString());
        }

        @Override // D5.q.g
        public void g(int i7) {
            android.support.v4.media.a.a(r.this.f15098k.get(i7));
            AbstractC1995b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i7);
        }

        @Override // D5.q.g
        public void h(q.d dVar) {
            r.this.I(19);
            r.this.J(dVar);
            r.this.C(dVar, false);
            r.this.z(null, dVar);
        }

        @Override // D5.q.g
        public void i(q.e eVar, final q.b bVar) {
            int i02 = r.this.i0(eVar.f1387b);
            int i03 = r.this.i0(eVar.f1388c);
            int i7 = eVar.f1386a;
            if (r.this.b(i7)) {
                final float L6 = r.this.L();
                final y yVar = (y) r.this.f15096i.get(Integer.valueOf(i7));
                r.this.Q(yVar);
                yVar.i(i02, i03, new Runnable(yVar, L6, bVar) { // from class: io.flutter.plugin.platform.q

                    /* renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ y f15082p;

                    /* renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ float f15083q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ q.b f15084r;

                    {
                        this.f15083q = L6;
                        this.f15084r = bVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.this.k(this.f15082p, this.f15083q, this.f15084r);
                    }
                });
                return;
            }
            android.support.v4.media.a.a(r.this.f15098k.get(i7));
            AbstractC1995b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i7);
        }

        public final /* synthetic */ void k(y yVar, float f7, q.b bVar) {
            r.this.k0(yVar);
            if (r.this.f15090c != null) {
                f7 = r.this.L();
            }
            bVar.a(new q.c(r.this.g0(yVar.d(), f7), r.this.g0(yVar.c(), f7)));
        }
    }

    public static MotionEvent.PointerCoords a0(Object obj, float f7) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d7 = f7;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d7);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d7);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d7);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d7);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d7);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d7);
        return pointerCoords;
    }

    public static List b0(Object obj, float f7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(a0(it.next(), f7));
        }
        return arrayList;
    }

    public static MotionEvent.PointerProperties c0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    public static List d0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c0(it.next()));
        }
        return arrayList;
    }

    public static void j0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    public static boolean l0(int i7) {
        return i7 == 0 || i7 == 1;
    }

    public FlutterOverlaySurface A() {
        return B(new b(this.f15091d.getContext(), this.f15091d.getWidth(), this.f15091d.getHeight(), this.f15095h));
    }

    public FlutterOverlaySurface B(b bVar) {
        int i7 = this.f15102o;
        this.f15102o = i7 + 1;
        this.f15100m.put(i7, bVar);
        return new FlutterOverlaySurface(i7, bVar.getSurface());
    }

    public j C(q.d dVar, boolean z7) {
        this.f15088a.a(dVar.f1374b);
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f1374b);
    }

    public void D() {
        for (int i7 = 0; i7 < this.f15100m.size(); i7++) {
            b bVar = (b) this.f15100m.valueAt(i7);
            bVar.a();
            bVar.f();
        }
    }

    public void E() {
        D5.q qVar = this.f15094g;
        if (qVar != null) {
            qVar.d(null);
        }
        D();
        this.f15094g = null;
        this.f15090c = null;
        this.f15092e = null;
    }

    public void F() {
        for (int i7 = 0; i7 < this.f15101n.size(); i7++) {
            this.f15091d.removeView((n) this.f15101n.valueAt(i7));
        }
        for (int i8 = 0; i8 < this.f15099l.size(); i8++) {
            this.f15091d.removeView((AbstractC2327a) this.f15099l.valueAt(i8));
        }
        D();
        e0();
        this.f15091d = null;
        this.f15103p = false;
        if (this.f15098k.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(this.f15098k.valueAt(0));
        throw null;
    }

    public void G() {
        this.f15093f = null;
    }

    public final void H() {
        while (this.f15098k.size() > 0) {
            this.f15109v.g(this.f15098k.keyAt(0));
        }
    }

    public final void I(int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= i7) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i8 + ", required API level is: " + i7);
    }

    public final void J(q.d dVar) {
        if (l0(dVar.f1379g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f1379g + "(view id: " + dVar.f1373a + ")");
    }

    public final void K(boolean z7) {
        for (int i7 = 0; i7 < this.f15100m.size(); i7++) {
            int keyAt = this.f15100m.keyAt(i7);
            b bVar = (b) this.f15100m.valueAt(i7);
            if (this.f15105r.contains(Integer.valueOf(keyAt))) {
                this.f15091d.m(bVar);
                z7 &= bVar.d();
            } else {
                if (!this.f15103p) {
                    bVar.a();
                }
                bVar.setVisibility(8);
                this.f15091d.removeView(bVar);
            }
        }
        for (int i8 = 0; i8 < this.f15099l.size(); i8++) {
            int keyAt2 = this.f15099l.keyAt(i8);
            View view = (View) this.f15099l.get(keyAt2);
            if (!this.f15106s.contains(Integer.valueOf(keyAt2)) || (!z7 && this.f15104q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final float L() {
        return this.f15090c.getResources().getDisplayMetrics().density;
    }

    public l M() {
        return this.f15088a;
    }

    public void N(int i7) {
        android.support.v4.media.a.a(this.f15098k.get(i7));
        throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
    }

    public final void O() {
        if (!this.f15104q || this.f15103p) {
            return;
        }
        this.f15091d.p();
        this.f15103p = true;
    }

    public final /* synthetic */ void P() {
        K(false);
    }

    public final void Q(y yVar) {
        C c7 = this.f15093f;
        if (c7 == null) {
            return;
        }
        c7.s();
        yVar.f();
    }

    public void R() {
    }

    public void S() {
        this.f15105r.clear();
        this.f15106s.clear();
    }

    public void T() {
        H();
    }

    public void U(int i7, int i8, int i9, int i10, int i11) {
        if (this.f15100m.get(i7) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i7 + ") doesn't exist");
        }
        O();
        View view = (b) this.f15100m.get(i7);
        if (view.getParent() == null) {
            this.f15091d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        this.f15105r.add(Integer.valueOf(i7));
    }

    public void V(int i7, int i8, int i9, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        O();
        N(i7);
        AbstractC2327a abstractC2327a = (AbstractC2327a) this.f15099l.get(i7);
        abstractC2327a.a(flutterMutatorsStack, i8, i9, i10, i11);
        abstractC2327a.setVisibility(0);
        abstractC2327a.bringToFront();
        new FrameLayout.LayoutParams(i12, i13);
        android.support.v4.media.a.a(this.f15098k.get(i7));
        throw null;
    }

    public void W() {
        boolean z7 = false;
        if (this.f15103p && this.f15106s.isEmpty()) {
            this.f15103p = false;
            this.f15091d.A(new Runnable() { // from class: io.flutter.plugin.platform.p
                @Override // java.lang.Runnable
                public final void run() {
                    r.this.P();
                }
            });
        } else {
            if (this.f15103p && this.f15091d.k()) {
                z7 = true;
            }
            K(z7);
        }
    }

    public void X() {
        H();
    }

    public void Y() {
        Iterator it = this.f15096i.values().iterator();
        while (it.hasNext()) {
            ((y) it.next()).h();
        }
    }

    public void Z(int i7) {
        if (i7 < 40) {
            return;
        }
        Iterator it = this.f15096i.values().iterator();
        while (it.hasNext()) {
            ((y) it.next()).a();
        }
    }

    @Override // io.flutter.plugin.platform.o
    public void a(io.flutter.view.i iVar) {
        this.f15095h.b(iVar);
    }

    @Override // io.flutter.plugin.platform.o
    public boolean b(int i7) {
        return this.f15096i.containsKey(Integer.valueOf(i7));
    }

    @Override // io.flutter.plugin.platform.o
    public View c(int i7) {
        if (b(i7)) {
            return ((y) this.f15096i.get(Integer.valueOf(i7))).e();
        }
        android.support.v4.media.a.a(this.f15098k.get(i7));
        return null;
    }

    @Override // io.flutter.plugin.platform.o
    public void d() {
        this.f15095h.b(null);
    }

    public final void e0() {
        if (this.f15091d == null) {
            AbstractC1995b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i7 = 0; i7 < this.f15100m.size(); i7++) {
            this.f15091d.removeView((View) this.f15100m.valueAt(i7));
        }
        this.f15100m.clear();
    }

    public void f0(boolean z7) {
        this.f15108u = z7;
    }

    public final int g0(double d7, float f7) {
        return (int) Math.round(d7 / f7);
    }

    public MotionEvent h0(float f7, q.f fVar, boolean z7) {
        MotionEvent b7 = this.f15107t.b(N.a.c(fVar.f1404p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) b0(fVar.f1395g, f7).toArray(new MotionEvent.PointerCoords[fVar.f1393e]);
        if (z7 || b7 == null) {
            return MotionEvent.obtain(fVar.f1390b.longValue(), fVar.f1391c.longValue(), fVar.f1392d, fVar.f1393e, (MotionEvent.PointerProperties[]) d0(fVar.f1394f).toArray(new MotionEvent.PointerProperties[fVar.f1393e]), pointerCoordsArr, fVar.f1396h, fVar.f1397i, fVar.f1398j, fVar.f1399k, fVar.f1400l, fVar.f1401m, fVar.f1402n, fVar.f1403o);
        }
        j0(b7, pointerCoordsArr);
        return b7;
    }

    public final int i0(double d7) {
        return (int) Math.round(d7 * L());
    }

    public final void k0(y yVar) {
        C c7 = this.f15093f;
        if (c7 == null) {
            return;
        }
        c7.E();
        yVar.g();
    }

    public void u(Context context, TextureRegistry textureRegistry, C2105a c2105a) {
        if (this.f15090c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f15090c = context;
        this.f15092e = textureRegistry;
        D5.q qVar = new D5.q(c2105a);
        this.f15094g = qVar;
        qVar.d(this.f15109v);
    }

    public void v(C c7) {
        this.f15093f = c7;
    }

    public void w(FlutterRenderer flutterRenderer) {
        this.f15089b = new C2016c(flutterRenderer, true);
    }

    public void x(D d7) {
        this.f15091d = d7;
        for (int i7 = 0; i7 < this.f15101n.size(); i7++) {
            this.f15091d.addView((n) this.f15101n.valueAt(i7));
        }
        for (int i8 = 0; i8 < this.f15099l.size(); i8++) {
            this.f15091d.addView((AbstractC2327a) this.f15099l.valueAt(i8));
        }
        if (this.f15098k.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(this.f15098k.valueAt(0));
        throw null;
    }

    public boolean y(View view) {
        if (view == null || !this.f15097j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) this.f15097j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public final void z(j jVar, q.d dVar) {
        I(19);
        AbstractC1995b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f1373a);
    }
}
