/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.SparseArray
 *  android.view.MotionEvent
 *  android.view.MotionEvent$PointerCoords
 *  android.view.MotionEvent$PointerProperties
 *  android.view.Surface
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 */
package io.flutter.plugin.platform;

import D5.q;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.editing.C;
import io.flutter.plugin.platform.a;
import io.flutter.plugin.platform.b;
import io.flutter.plugin.platform.j;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.n;
import io.flutter.plugin.platform.o;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.y;
import io.flutter.view.TextureRegistry;
import io.flutter.view.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u5.D;
import u5.N;
import u5.c;

public class r
implements o {
    public static Class[] w = new Class[]{SurfaceView.class};
    public static boolean x = true;
    public static boolean y = true;
    public final m a;
    public c b;
    public Context c;
    public D d;
    public TextureRegistry e;
    public C f;
    public D5.q g;
    public final a h;
    public final HashMap i;
    public final HashMap j;
    public final SparseArray k;
    public final SparseArray l;
    public final SparseArray m;
    public final SparseArray n;
    public int o = 0;
    public boolean p = false;
    public boolean q = true;
    public final HashSet r;
    public final HashSet s;
    public final N t;
    public boolean u = false;
    public final q.g v;

    public r() {
        this.v = new q.g(){

            public static /* synthetic */ void j( a8, y y8, float f8, q.b b8) {
                a8.k(y8, f8, b8);
            }

            @Override
            public void a(boolean bl) {
                r.this.q = bl;
            }

            @Override
            public void b(int n8, double d8, double d9) {
                if (r.this.b(n8)) {
                    return;
                }
                n n9 = (n)((Object)r.this.n.get(n8));
                n9 = new StringBuilder();
                n9.append("Setting offset for unknown platform view with id: ");
                n9.append(n8);
                t5.b.b("PlatformViewsController", n9.toString());
            }

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public void c(int n8, int n9) {
                StringBuilder stringBuilder;
                Object object;
                if (!r.l0(n9)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Trying to set unknown direction value: ");
                    stringBuilder2.append(n9);
                    stringBuilder2.append("(view id: ");
                    stringBuilder2.append(n8);
                    stringBuilder2.append(")");
                    throw new IllegalStateException(stringBuilder2.toString());
                }
                if (r.this.b(n8)) {
                    object = ((y)r.this.i.get((Object)n8)).e();
                    if (object != null) {
                        object.setLayoutDirection(n9);
                        return;
                    }
                    stringBuilder = new StringBuilder();
                    object = "Setting direction to a null view with id: ";
                } else {
                    android.support.v4.media.a.a(r.this.k.get(n8));
                    stringBuilder = new StringBuilder();
                    object = "Setting direction to an unknown view with id: ";
                }
                stringBuilder.append((String)object);
                stringBuilder.append(n8);
                t5.b.b("PlatformViewsController", stringBuilder.toString());
            }

            @Override
            public void d(q.f f8) {
                int n8 = f8.a;
                float f9 = r.k((r)r.this).getResources().getDisplayMetrics().density;
                if (r.this.b(n8)) {
                    ((y)r.this.i.get((Object)n8)).b(r.this.h0(f9, f8, true));
                    return;
                }
                android.support.v4.media.a.a(r.this.k.get(n8));
                f8 = new StringBuilder();
                f8.append("Sending touch to an unknown view with id: ");
                f8.append(n8);
                t5.b.b("PlatformViewsController", f8.toString());
            }

            @Override
            public long e(q.d d8) {
                r.this.J(d8);
                int n8 = d8.a;
                if (r.this.n.get(n8) == null) {
                    if (r.this.e != null) {
                        if (r.this.d == null) {
                            d8 = new StringBuilder();
                            d8.append("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ");
                            d8.append(n8);
                            throw new IllegalStateException(d8.toString());
                        }
                        r.this.C(d8, true);
                        throw null;
                    }
                    d8 = new StringBuilder();
                    d8.append("Texture registry is null. This means that platform views controller was detached, view id: ");
                    d8.append(n8);
                    throw new IllegalStateException(d8.toString());
                }
                d8 = new StringBuilder();
                d8.append("Trying to create an already created platform view, view id: ");
                d8.append(n8);
                throw new IllegalStateException(d8.toString());
            }

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public void f(int n8) {
                View view;
                String string2;
                if (r.this.b(n8)) {
                    view = ((y)r.this.i.get((Object)n8)).e();
                    if (view != null) {
                        view.clearFocus();
                        return;
                    }
                    view = new StringBuilder();
                    string2 = "Clearing focus on a null view with id: ";
                } else {
                    android.support.v4.media.a.a(r.this.k.get(n8));
                    view = new StringBuilder();
                    string2 = "Clearing focus on an unknown view with id: ";
                }
                view.append(string2);
                view.append(n8);
                t5.b.b("PlatformViewsController", view.toString());
            }

            @Override
            public void g(int n8) {
                android.support.v4.media.a.a(r.this.k.get(n8));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Disposing unknown platform view with id: ");
                stringBuilder.append(n8);
                t5.b.b("PlatformViewsController", stringBuilder.toString());
            }

            @Override
            public void h(q.d d8) {
                r.this.I(19);
                r.this.J(d8);
                r.this.C(d8, false);
                r.this.z(null, d8);
            }

            @Override
            public void i(q.e object, q.b b8) {
                int n8 = r.this.i0(object.b);
                int n9 = r.this.i0(object.c);
                int n10 = object.a;
                if (r.this.b(n10)) {
                    float f8 = r.this.L();
                    object = (y)r.this.i.get((Object)n10);
                    r.this.Q((y)object);
                    object.i(n8, n9, new q(this, (y)object, f8, b8));
                    return;
                }
                android.support.v4.media.a.a(r.this.k.get(n10));
                object = (n)((Object)r.this.n.get(n10));
                object = new StringBuilder();
                object.append("Resizing unknown platform view with id: ");
                object.append(n10);
                t5.b.b("PlatformViewsController", object.toString());
            }

            public final /* synthetic */ void k(y y8, float f8, q.b b8) {
                r.this.k0(y8);
                if (r.this.c != null) {
                    f8 = r.this.L();
                }
                b8.a(new q.c(r.this.g0(y8.d(), f8), r.this.g0(y8.c(), f8)));
            }
        };
        this.a = new m();
        this.i = new HashMap();
        this.h = new a();
        this.j = new HashMap();
        this.m = new SparseArray();
        this.r = new HashSet();
        this.s = new HashSet();
        this.n = new SparseArray();
        this.k = new SparseArray();
        this.l = new SparseArray();
        this.t = N.a();
    }

    public static MotionEvent.PointerCoords a0(Object object, float f8) {
        object = (List)object;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float)((Double)object.get(0)).doubleValue();
        pointerCoords.pressure = (float)((Double)object.get(1)).doubleValue();
        pointerCoords.size = (float)((Double)object.get(2)).doubleValue();
        double d8 = (Double)object.get(3);
        double d9 = f8;
        pointerCoords.toolMajor = (float)(d8 * d9);
        pointerCoords.toolMinor = (float)((Double)object.get(4) * d9);
        pointerCoords.touchMajor = (float)((Double)object.get(5) * d9);
        pointerCoords.touchMinor = (float)((Double)object.get(6) * d9);
        pointerCoords.x = (float)((Double)object.get(7) * d9);
        pointerCoords.y = (float)((Double)object.get(8) * d9);
        return pointerCoords;
    }

    public static List b0(Object object, float f8) {
        List list = (List)object;
        object = new ArrayList();
        list = list.iterator();
        while (list.hasNext()) {
            object.add((Object)r.a0(list.next(), f8));
        }
        return object;
    }

    public static MotionEvent.PointerProperties c0(Object object) {
        object = (List)object;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = (Integer)object.get(0);
        pointerProperties.toolType = (Integer)object.get(1);
        return pointerProperties;
    }

    public static List d0(Object object) {
        List list = (List)object;
        object = new ArrayList();
        list = list.iterator();
        while (list.hasNext()) {
            object.add((Object)r.c0(list.next()));
        }
        return object;
    }

    public static /* synthetic */ void e(r r8) {
        r8.P();
    }

    public static void j0(MotionEvent motionEvent, MotionEvent.PointerCoords[] arrpointerCoords) {
        if (arrpointerCoords.length < 1) {
            return;
        }
        motionEvent.offsetLocation(arrpointerCoords[0].x - motionEvent.getX(), arrpointerCoords[0].y - motionEvent.getY());
    }

    public static boolean l0(int n8) {
        boolean bl = true;
        if (n8 != 0) {
            if (n8 == 1) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public FlutterOverlaySurface A() {
        return this.B(new b(this.d.getContext(), this.d.getWidth(), this.d.getHeight(), this.h));
    }

    public FlutterOverlaySurface B(b b8) {
        int n8 = this.o;
        this.o = n8 + 1;
        this.m.put(n8, (Object)b8);
        return new FlutterOverlaySurface(n8, b8.getSurface());
    }

    public j C(q.d d8, boolean bl) {
        this.a.a(d8.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to create a platform view of unregistered type: ");
        stringBuilder.append(d8.b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void D() {
        for (int i8 = 0; i8 < this.m.size(); ++i8) {
            b b8 = (b)this.m.valueAt(i8);
            b8.a();
            b8.f();
        }
    }

    public void E() {
        D5.q q8 = this.g;
        if (q8 != null) {
            q8.d(null);
        }
        this.D();
        this.g = null;
        this.c = null;
        this.e = null;
    }

    public void F() {
        int n8;
        FrameLayout frameLayout;
        for (n8 = 0; n8 < this.n.size(); ++n8) {
            frameLayout = (n)((Object)this.n.valueAt(n8));
            this.d.removeView((View)frameLayout);
        }
        for (n8 = 0; n8 < this.l.size(); ++n8) {
            frameLayout = (z5.a)((Object)this.l.valueAt(n8));
            this.d.removeView((View)frameLayout);
        }
        this.D();
        this.e0();
        this.d = null;
        this.p = false;
        if (this.k.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(this.k.valueAt(0));
        throw null;
    }

    public void G() {
        this.f = null;
    }

    public final void H() {
        while (this.k.size() > 0) {
            int n8 = this.k.keyAt(0);
            this.v.g(n8);
        }
    }

    public final void I(int n8) {
        int n9 = Build.VERSION.SDK_INT;
        if (n9 >= n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to use platform views with API ");
        stringBuilder.append(n9);
        stringBuilder.append(", required API level is: ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void J(q.d d8) {
        if (r.l0(d8.g)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to create a view with unknown direction value: ");
        stringBuilder.append(d8.g);
        stringBuilder.append("(view id: ");
        stringBuilder.append(d8.a);
        stringBuilder.append(")");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void K(boolean bl) {
        int n8;
        int n9;
        b b8;
        for (n8 = 0; n8 < this.m.size(); ++n8) {
            n9 = this.m.keyAt(n8);
            b8 = (b)this.m.valueAt(n8);
            if (this.r.contains((Object)n9)) {
                this.d.m(b8);
                bl &= b8.d();
                continue;
            }
            if (!this.p) {
                b8.a();
            }
            b8.setVisibility(8);
            this.d.removeView((View)b8);
        }
        for (n8 = 0; n8 < this.l.size(); ++n8) {
            n9 = this.l.keyAt(n8);
            b8 = (View)this.l.get(n9);
            if (this.s.contains((Object)n9) && (bl || !this.q)) {
                b8.setVisibility(0);
                continue;
            }
            b8.setVisibility(8);
        }
    }

    public final float L() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    public l M() {
        return this.a;
    }

    public void N(int n8) {
        android.support.v4.media.a.a(this.k.get(n8));
        throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
    }

    public final void O() {
        if (this.q && !this.p) {
            this.d.p();
            this.p = true;
        }
    }

    public final /* synthetic */ void P() {
        this.K(false);
    }

    public final void Q(y y8) {
        C c8 = this.f;
        if (c8 == null) {
            return;
        }
        c8.s();
        y8.f();
    }

    public void R() {
    }

    public void S() {
        this.r.clear();
        this.s.clear();
    }

    public void T() {
        this.H();
    }

    public void U(int n8, int n9, int n10, int n11, int n12) {
        if (this.m.get(n8) != null) {
            this.O();
            b b8 = (b)this.m.get(n8);
            if (b8.getParent() == null) {
                this.d.addView((View)b8);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n11, n12);
            layoutParams.leftMargin = n9;
            layoutParams.topMargin = n10;
            b8.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            b8.setVisibility(0);
            b8.bringToFront();
            this.r.add((Object)n8);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The overlay surface (id:");
        stringBuilder.append(n8);
        stringBuilder.append(") doesn't exist");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void V(int n8, int n9, int n10, int n11, int n12, int n13, int n14, FlutterMutatorsStack flutterMutatorsStack) {
        this.O();
        this.N(n8);
        z5.a a8 = (z5.a)((Object)this.l.get(n8));
        a8.a(flutterMutatorsStack, n9, n10, n11, n12);
        a8.setVisibility(0);
        a8.bringToFront();
        new FrameLayout.LayoutParams(n13, n14);
        android.support.v4.media.a.a(this.k.get(n8));
        throw null;
    }

    public void W() {
        boolean bl = this.p;
        boolean bl2 = false;
        if (bl && this.s.isEmpty()) {
            this.p = false;
            this.d.A(new p(this));
            return;
        }
        bl = bl2;
        if (this.p) {
            bl = bl2;
            if (this.d.k()) {
                bl = true;
            }
        }
        this.K(bl);
    }

    public void X() {
        this.H();
    }

    public void Y() {
        Iterator iterator = this.i.values().iterator();
        while (iterator.hasNext()) {
            ((y)iterator.next()).h();
        }
    }

    public void Z(int n8) {
        if (n8 < 40) {
            return;
        }
        Iterator iterator = this.i.values().iterator();
        while (iterator.hasNext()) {
            ((y)iterator.next()).a();
        }
    }

    @Override
    public void a(i i8) {
        this.h.b(i8);
    }

    @Override
    public boolean b(int n8) {
        return this.i.containsKey((Object)n8);
    }

    @Override
    public View c(int n8) {
        if (this.b(n8)) {
            return ((y)this.i.get((Object)n8)).e();
        }
        android.support.v4.media.a.a(this.k.get(n8));
        return null;
    }

    @Override
    public void d() {
        this.h.b(null);
    }

    public final void e0() {
        if (this.d == null) {
            t5.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i8 = 0; i8 < this.m.size(); ++i8) {
            this.d.removeView((View)this.m.valueAt(i8));
        }
        this.m.clear();
    }

    public void f0(boolean bl) {
        this.u = bl;
    }

    public final int g0(double d8, float f8) {
        return (int)Math.round((double)(d8 / (double)f8));
    }

    public MotionEvent h0(float f8, q.f f9, boolean bl) {
        MotionEvent.PointerCoords[] arrpointerCoords = N.a.c(f9.p);
        MotionEvent.PointerProperties[] arrpointerProperties = this.t.b((N.a)arrpointerCoords);
        arrpointerCoords = (MotionEvent.PointerCoords[])r.b0(f9.g, f8).toArray((Object[])new MotionEvent.PointerCoords[f9.e]);
        if (!bl && arrpointerProperties != null) {
            r.j0((MotionEvent)arrpointerProperties, arrpointerCoords);
            return arrpointerProperties;
        }
        arrpointerProperties = (MotionEvent.PointerProperties[])r.d0(f9.f).toArray((Object[])new MotionEvent.PointerProperties[f9.e]);
        return MotionEvent.obtain((long)f9.b.longValue(), (long)f9.c.longValue(), (int)f9.d, (int)f9.e, (MotionEvent.PointerProperties[])arrpointerProperties, (MotionEvent.PointerCoords[])arrpointerCoords, (int)f9.h, (int)f9.i, (float)f9.j, (float)f9.k, (int)f9.l, (int)f9.m, (int)f9.n, (int)f9.o);
    }

    public final int i0(double d8) {
        return (int)Math.round((double)(d8 * (double)this.L()));
    }

    public final void k0(y y8) {
        C c8 = this.f;
        if (c8 == null) {
            return;
        }
        c8.E();
        y8.g();
    }

    public void u(Context object, TextureRegistry textureRegistry, w5.a a8) {
        if (this.c == null) {
            this.c = object;
            this.e = textureRegistry;
            this.g = object = new D5.q(a8);
            object.d(this.v);
            return;
        }
        throw new AssertionError((Object)"A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void v(C c8) {
        this.f = c8;
    }

    public void w(FlutterRenderer flutterRenderer) {
        this.b = new c(flutterRenderer, true);
    }

    public void x(D frameLayout) {
        int n8;
        this.d = frameLayout;
        for (n8 = 0; n8 < this.n.size(); ++n8) {
            frameLayout = (n)((Object)this.n.valueAt(n8));
            this.d.addView((View)frameLayout);
        }
        for (n8 = 0; n8 < this.l.size(); ++n8) {
            frameLayout = (z5.a)((Object)this.l.valueAt(n8));
            this.d.addView((View)frameLayout);
        }
        if (this.k.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(this.k.valueAt(0));
        throw null;
    }

    public boolean y(View view) {
        if (view == null) {
            return false;
        }
        if (!this.j.containsKey((Object)view.getContext())) {
            return false;
        }
        View view2 = (View)this.j.get((Object)view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public final void z(j j8, q.d d8) {
        this.I(19);
        j8 = new StringBuilder();
        j8.append("Using hybrid composition for platform view: ");
        j8.append(d8.a);
        t5.b.e("PlatformViewsController", j8.toString());
    }

}

