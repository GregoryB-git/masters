// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.platform;

import android.view.ViewGroup;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.i;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.os.Build$VERSION;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import android.view.MotionEvent;
import android.view.MotionEvent$PointerProperties;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.view.MotionEvent$PointerCoords;
import android.view.View;
import t5.b;
import android.view.SurfaceView;
import u5.N;
import java.util.HashSet;
import android.util.SparseArray;
import java.util.HashMap;
import D5.q;
import io.flutter.plugin.editing.C;
import io.flutter.view.TextureRegistry;
import u5.D;
import android.content.Context;
import u5.c;

public class r implements o
{
    public static Class[] w;
    public static boolean x;
    public static boolean y;
    public final m a;
    public c b;
    public Context c;
    public D d;
    public TextureRegistry e;
    public C f;
    public q g;
    public final a h;
    public final HashMap i;
    public final HashMap j;
    public final SparseArray k;
    public final SparseArray l;
    public final SparseArray m;
    public final SparseArray n;
    public int o;
    public boolean p;
    public boolean q;
    public final HashSet r;
    public final HashSet s;
    public final N t;
    public boolean u;
    public final q.g v;
    
    static {
        r.w = new Class[] { SurfaceView.class };
        r.x = true;
        r.y = true;
    }
    
    public r() {
        this.o = 0;
        this.p = false;
        this.q = true;
        this.u = false;
        this.v = new q.g() {
            @Override
            public void a(final boolean b) {
                io.flutter.plugin.platform.r.m(io.flutter.plugin.platform.r.this, b);
            }
            
            @Override
            public void b(final int i, final double n, final double n2) {
                if (io.flutter.plugin.platform.r.this.b(i)) {
                    return;
                }
                final n n3 = (n)io.flutter.plugin.platform.r.q(io.flutter.plugin.platform.r.this).get(i);
                final StringBuilder sb = new StringBuilder();
                sb.append("Setting offset for unknown platform view with id: ");
                sb.append(i);
                b.b("PlatformViewsController", sb.toString());
            }
            
            @Override
            public void c(final int i, final int n) {
                if (l0(n)) {
                    StringBuilder sb;
                    String str;
                    if (io.flutter.plugin.platform.r.this.b(i)) {
                        final View e = io.flutter.plugin.platform.r.this.i.get(i).e();
                        if (e != null) {
                            e.setLayoutDirection(n);
                            return;
                        }
                        sb = new StringBuilder();
                        str = "Setting direction to a null view with id: ";
                    }
                    else {
                        android.support.v4.media.a.a(io.flutter.plugin.platform.r.t(io.flutter.plugin.platform.r.this).get(i));
                        sb = new StringBuilder();
                        str = "Setting direction to an unknown view with id: ";
                    }
                    sb.append(str);
                    sb.append(i);
                    b.b("PlatformViewsController", sb.toString());
                    return;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Trying to set unknown direction value: ");
                sb2.append(n);
                sb2.append("(view id: ");
                sb2.append(i);
                sb2.append(")");
                throw new IllegalStateException(sb2.toString());
            }
            
            @Override
            public void d(final f f) {
                final int a = f.a;
                final float density = io.flutter.plugin.platform.r.k(io.flutter.plugin.platform.r.this).getResources().getDisplayMetrics().density;
                if (io.flutter.plugin.platform.r.this.b(a)) {
                    io.flutter.plugin.platform.r.this.i.get(a).b(io.flutter.plugin.platform.r.this.h0(density, f, true));
                    return;
                }
                android.support.v4.media.a.a(io.flutter.plugin.platform.r.t(io.flutter.plugin.platform.r.this).get(a));
                final StringBuilder sb = new StringBuilder();
                sb.append("Sending touch to an unknown view with id: ");
                sb.append(a);
                b.b("PlatformViewsController", sb.toString());
            }
            
            @Override
            public long e(final d d) {
                io.flutter.plugin.platform.r.this.J(d);
                final int a = d.a;
                if (io.flutter.plugin.platform.r.q(io.flutter.plugin.platform.r.this).get(a) != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Trying to create an already created platform view, view id: ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
                if (io.flutter.plugin.platform.r.r(io.flutter.plugin.platform.r.this) == null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Texture registry is null. This means that platform views controller was detached, view id: ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString());
                }
                if (io.flutter.plugin.platform.r.s(io.flutter.plugin.platform.r.this) == null) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ");
                    sb3.append(a);
                    throw new IllegalStateException(sb3.toString());
                }
                io.flutter.plugin.platform.r.this.C(d, true);
                throw null;
            }
            
            @Override
            public void f(final int n) {
                StringBuilder sb;
                String str;
                if (io.flutter.plugin.platform.r.this.b(n)) {
                    final View e = io.flutter.plugin.platform.r.this.i.get(n).e();
                    if (e != null) {
                        e.clearFocus();
                        return;
                    }
                    sb = new StringBuilder();
                    str = "Clearing focus on a null view with id: ";
                }
                else {
                    android.support.v4.media.a.a(io.flutter.plugin.platform.r.t(io.flutter.plugin.platform.r.this).get(n));
                    sb = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                }
                sb.append(str);
                sb.append(n);
                b.b("PlatformViewsController", sb.toString());
            }
            
            @Override
            public void g(final int i) {
                android.support.v4.media.a.a(io.flutter.plugin.platform.r.t(io.flutter.plugin.platform.r.this).get(i));
                final StringBuilder sb = new StringBuilder();
                sb.append("Disposing unknown platform view with id: ");
                sb.append(i);
                b.b("PlatformViewsController", sb.toString());
            }
            
            @Override
            public void h(final d d) {
                io.flutter.plugin.platform.r.this.I(19);
                io.flutter.plugin.platform.r.this.J(d);
                io.flutter.plugin.platform.r.this.C(d, false);
                io.flutter.plugin.platform.r.this.z(null, d);
            }
            
            @Override
            public void i(final e e, final b b) {
                final int h = io.flutter.plugin.platform.r.this.i0(e.b);
                final int h2 = io.flutter.plugin.platform.r.this.i0(e.c);
                final int a = e.a;
                if (io.flutter.plugin.platform.r.this.b(a)) {
                    final float i = io.flutter.plugin.platform.r.this.L();
                    final y y = io.flutter.plugin.platform.r.this.i.get(a);
                    io.flutter.plugin.platform.r.this.Q(y);
                    y.i(h, h2, new io.flutter.plugin.platform.q(this, y, i, b));
                    return;
                }
                android.support.v4.media.a.a(io.flutter.plugin.platform.r.t(io.flutter.plugin.platform.r.this).get(a));
                final n n = (n)io.flutter.plugin.platform.r.q(io.flutter.plugin.platform.r.this).get(a);
                final StringBuilder sb = new StringBuilder();
                sb.append("Resizing unknown platform view with id: ");
                sb.append(a);
                b.b("PlatformViewsController", sb.toString());
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
    
    public static MotionEvent$PointerCoords a0(final Object o, final float n) {
        final List list = (List)o;
        final MotionEvent$PointerCoords motionEvent$PointerCoords = new MotionEvent$PointerCoords();
        motionEvent$PointerCoords.orientation = (float)(double)list.get(0);
        motionEvent$PointerCoords.pressure = (float)(double)list.get(1);
        motionEvent$PointerCoords.size = (float)(double)list.get(2);
        final double doubleValue = list.get(3);
        final double n2 = n;
        motionEvent$PointerCoords.toolMajor = (float)(doubleValue * n2);
        motionEvent$PointerCoords.toolMinor = (float)(list.get(4) * n2);
        motionEvent$PointerCoords.touchMajor = (float)(list.get(5) * n2);
        motionEvent$PointerCoords.touchMinor = (float)(list.get(6) * n2);
        motionEvent$PointerCoords.x = (float)(list.get(7) * n2);
        motionEvent$PointerCoords.y = (float)(list.get(8) * n2);
        return motionEvent$PointerCoords;
    }
    
    public static List b0(final Object o, final float n) {
        final List list = (List)o;
        final ArrayList<MotionEvent$PointerCoords> list2 = new ArrayList<MotionEvent$PointerCoords>();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(a0(iterator.next(), n));
        }
        return list2;
    }
    
    public static MotionEvent$PointerProperties c0(final Object o) {
        final List list = (List)o;
        final MotionEvent$PointerProperties motionEvent$PointerProperties = new MotionEvent$PointerProperties();
        motionEvent$PointerProperties.id = list.get(0);
        motionEvent$PointerProperties.toolType = list.get(1);
        return motionEvent$PointerProperties;
    }
    
    public static List d0(final Object o) {
        final List list = (List)o;
        final ArrayList<MotionEvent$PointerProperties> list2 = new ArrayList<MotionEvent$PointerProperties>();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(c0(iterator.next()));
        }
        return list2;
    }
    
    public static void j0(final MotionEvent motionEvent, final MotionEvent$PointerCoords[] array) {
        if (array.length < 1) {
            return;
        }
        motionEvent.offsetLocation(array[0].x - motionEvent.getX(), array[0].y - motionEvent.getY());
    }
    
    public static /* synthetic */ Context k(final r r) {
        return r.c;
    }
    
    public static boolean l0(final int n) {
        boolean b = true;
        if (n != 0) {
            if (n == 1) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public static /* synthetic */ boolean m(final r r, final boolean q) {
        return r.q = q;
    }
    
    public static /* synthetic */ SparseArray q(final r r) {
        return r.n;
    }
    
    public static /* synthetic */ TextureRegistry r(final r r) {
        return r.e;
    }
    
    public static /* synthetic */ D s(final r r) {
        return r.d;
    }
    
    public static /* synthetic */ SparseArray t(final r r) {
        return r.k;
    }
    
    public FlutterOverlaySurface A() {
        return this.B(new io.flutter.plugin.platform.b(((View)this.d).getContext(), ((View)this.d).getWidth(), ((View)this.d).getHeight(), this.h));
    }
    
    public FlutterOverlaySurface B(final io.flutter.plugin.platform.b b) {
        final int n = this.o++;
        this.m.put(n, (Object)b);
        return new FlutterOverlaySurface(n, b.getSurface());
    }
    
    public j C(final q.d d, final boolean b) {
        this.a.a(d.b);
        final StringBuilder sb = new StringBuilder();
        sb.append("Trying to create a platform view of unregistered type: ");
        sb.append(d.b);
        throw new IllegalStateException(sb.toString());
    }
    
    public void D() {
        for (int i = 0; i < this.m.size(); ++i) {
            final io.flutter.plugin.platform.b b = (io.flutter.plugin.platform.b)this.m.valueAt(i);
            b.a();
            b.f();
        }
    }
    
    public void E() {
        final q g = this.g;
        if (g != null) {
            g.d(null);
        }
        this.D();
        this.g = null;
        this.c = null;
        this.e = null;
    }
    
    public void F() {
        for (int i = 0; i < this.n.size(); ++i) {
            ((ViewGroup)this.d).removeView((View)this.n.valueAt(i));
        }
        for (int j = 0; j < this.l.size(); ++j) {
            ((ViewGroup)this.d).removeView((View)this.l.valueAt(j));
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
            this.v.g(this.k.keyAt(0));
        }
    }
    
    public final void I(final int i) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= i) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Trying to use platform views with API ");
        sb.append(sdk_INT);
        sb.append(", required API level is: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
    
    public final void J(final q.d d) {
        if (l0(d.g)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Trying to create a view with unknown direction value: ");
        sb.append(d.g);
        sb.append("(view id: ");
        sb.append(d.a);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void K(boolean b) {
        for (int i = 0; i < this.m.size(); ++i) {
            final int key = this.m.keyAt(i);
            final io.flutter.plugin.platform.b b2 = (io.flutter.plugin.platform.b)this.m.valueAt(i);
            if (this.r.contains(key)) {
                this.d.m(b2);
                b &= b2.d();
            }
            else {
                if (!this.p) {
                    b2.a();
                }
                b2.setVisibility(8);
                ((ViewGroup)this.d).removeView((View)b2);
            }
        }
        for (int j = 0; j < this.l.size(); ++j) {
            final int key2 = this.l.keyAt(j);
            final View view = (View)this.l.get(key2);
            if (this.s.contains(key2) && (b || !this.q)) {
                view.setVisibility(0);
            }
            else {
                view.setVisibility(8);
            }
        }
    }
    
    public final float L() {
        return this.c.getResources().getDisplayMetrics().density;
    }
    
    public l M() {
        return this.a;
    }
    
    public void N(final int n) {
        android.support.v4.media.a.a(this.k.get(n));
        throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
    }
    
    public final void O() {
        if (this.q && !this.p) {
            this.d.p();
            this.p = true;
        }
    }
    
    public final void Q(final y y) {
        final C f = this.f;
        if (f == null) {
            return;
        }
        f.s();
        y.f();
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
    
    public void U(final int n, final int leftMargin, final int topMargin, final int n2, final int n3) {
        if (this.m.get(n) != null) {
            this.O();
            final io.flutter.plugin.platform.b b = (io.flutter.plugin.platform.b)this.m.get(n);
            if (b.getParent() == null) {
                ((ViewGroup)this.d).addView((View)b);
            }
            final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(n2, n3);
            layoutParams.leftMargin = leftMargin;
            layoutParams.topMargin = topMargin;
            b.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            b.setVisibility(0);
            b.bringToFront();
            this.r.add(n);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The overlay surface (id:");
        sb.append(n);
        sb.append(") doesn't exist");
        throw new IllegalStateException(sb.toString());
    }
    
    public void V(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final FlutterMutatorsStack flutterMutatorsStack) {
        this.O();
        this.N(n);
        final z5.a a = (z5.a)this.l.get(n);
        a.a(flutterMutatorsStack, n2, n3, n4, n5);
        ((View)a).setVisibility(0);
        ((View)a).bringToFront();
        new FrameLayout$LayoutParams(n6, n7);
        android.support.v4.media.a.a(this.k.get(n));
        throw null;
    }
    
    public void W() {
        final boolean p = this.p;
        final boolean b = false;
        if (p && this.s.isEmpty()) {
            this.p = false;
            this.d.A(new p(this));
            return;
        }
        boolean b2 = b;
        if (this.p) {
            b2 = b;
            if (this.d.k()) {
                b2 = true;
            }
        }
        this.K(b2);
    }
    
    public void X() {
        this.H();
    }
    
    public void Y() {
        final Iterator<y> iterator = this.i.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().h();
        }
    }
    
    public void Z(final int n) {
        if (n < 40) {
            return;
        }
        final Iterator<y> iterator = this.i.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    @Override
    public void a(final i i) {
        this.h.b(i);
    }
    
    @Override
    public boolean b(final int i) {
        return this.i.containsKey(i);
    }
    
    @Override
    public View c(final int i) {
        if (this.b(i)) {
            return this.i.get(i).e();
        }
        android.support.v4.media.a.a(this.k.get(i));
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
        for (int i = 0; i < this.m.size(); ++i) {
            ((ViewGroup)this.d).removeView((View)this.m.valueAt(i));
        }
        this.m.clear();
    }
    
    public void f0(final boolean u) {
        this.u = u;
    }
    
    public final int g0(final double n, final float n2) {
        return (int)Math.round(n / n2);
    }
    
    public MotionEvent h0(final float n, final q.f f, final boolean b) {
        final MotionEvent b2 = this.t.b(N.a.c(f.p));
        final MotionEvent$PointerCoords[] array = b0(f.g, n).toArray(new MotionEvent$PointerCoords[f.e]);
        if (!b && b2 != null) {
            j0(b2, array);
            return b2;
        }
        return MotionEvent.obtain(f.b.longValue(), f.c.longValue(), f.d, f.e, (MotionEvent$PointerProperties[])d0(f.f).toArray(new MotionEvent$PointerProperties[f.e]), array, f.h, f.i, f.j, f.k, f.l, f.m, f.n, f.o);
    }
    
    public final int i0(final double n) {
        return (int)Math.round(n * this.L());
    }
    
    public final void k0(final y y) {
        final C f = this.f;
        if (f == null) {
            return;
        }
        f.E();
        y.g();
    }
    
    public void u(final Context c, final TextureRegistry e, final w5.a a) {
        if (this.c == null) {
            this.c = c;
            this.e = e;
            (this.g = new q(a)).d(this.v);
            return;
        }
        throw new AssertionError((Object)"A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }
    
    public void v(final C f) {
        this.f = f;
    }
    
    public void w(final FlutterRenderer flutterRenderer) {
        this.b = new c(flutterRenderer, true);
    }
    
    public void x(final D d) {
        this.d = d;
        for (int i = 0; i < this.n.size(); ++i) {
            ((ViewGroup)this.d).addView((View)this.n.valueAt(i));
        }
        for (int j = 0; j < this.l.size(); ++j) {
            ((ViewGroup)this.d).addView((View)this.l.valueAt(j));
        }
        if (this.k.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(this.k.valueAt(0));
        throw null;
    }
    
    public boolean y(final View view) {
        if (view == null) {
            return false;
        }
        if (!this.j.containsKey(view.getContext())) {
            return false;
        }
        final View view2 = this.j.get(view.getContext());
        return view2 == view || view2.checkInputConnectionProxy(view);
    }
    
    public final void z(final j j, final q.d d) {
        this.I(19);
        final StringBuilder sb = new StringBuilder();
        sb.append("Using hybrid composition for platform view: ");
        sb.append(d.a);
        t5.b.e("PlatformViewsController", sb.toString());
    }
}
