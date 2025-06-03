package androidx.fragment.app;

import I.AbstractC0410g;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d;
import androidx.savedstate.SavedStateRegistry;
import d.AbstractC1161a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC1749a;

/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.h, androidx.lifecycle.u, androidx.savedstate.c {

    /* renamed from: n0, reason: collision with root package name */
    public static final Object f9235n0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f9236A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9237B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f9238C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9239D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9240E;

    /* renamed from: F, reason: collision with root package name */
    public int f9241F;

    /* renamed from: G, reason: collision with root package name */
    public n f9242G;

    /* renamed from: H, reason: collision with root package name */
    public androidx.fragment.app.k f9243H;

    /* renamed from: J, reason: collision with root package name */
    public Fragment f9245J;

    /* renamed from: K, reason: collision with root package name */
    public int f9246K;

    /* renamed from: L, reason: collision with root package name */
    public int f9247L;

    /* renamed from: M, reason: collision with root package name */
    public String f9248M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f9249N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f9250O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f9251P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f9252Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f9253R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f9255T;

    /* renamed from: U, reason: collision with root package name */
    public ViewGroup f9256U;

    /* renamed from: V, reason: collision with root package name */
    public View f9257V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f9258W;

    /* renamed from: Y, reason: collision with root package name */
    public h f9260Y;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f9262a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f9263b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f9264c0;

    /* renamed from: d0, reason: collision with root package name */
    public LayoutInflater f9265d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f9266e0;

    /* renamed from: g0, reason: collision with root package name */
    public androidx.lifecycle.i f9268g0;

    /* renamed from: h0, reason: collision with root package name */
    public z f9269h0;

    /* renamed from: j0, reason: collision with root package name */
    public androidx.savedstate.b f9271j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f9272k0;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f9276p;

    /* renamed from: q, reason: collision with root package name */
    public SparseArray f9277q;

    /* renamed from: r, reason: collision with root package name */
    public Bundle f9278r;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f9279s;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f9281u;

    /* renamed from: v, reason: collision with root package name */
    public Fragment f9282v;

    /* renamed from: x, reason: collision with root package name */
    public int f9284x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9286z;

    /* renamed from: o, reason: collision with root package name */
    public int f9275o = -1;

    /* renamed from: t, reason: collision with root package name */
    public String f9280t = UUID.randomUUID().toString();

    /* renamed from: w, reason: collision with root package name */
    public String f9283w = null;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f9285y = null;

    /* renamed from: I, reason: collision with root package name */
    public n f9244I = new o();

    /* renamed from: S, reason: collision with root package name */
    public boolean f9254S = true;

    /* renamed from: X, reason: collision with root package name */
    public boolean f9259X = true;

    /* renamed from: Z, reason: collision with root package name */
    public Runnable f9261Z = new a();

    /* renamed from: f0, reason: collision with root package name */
    public d.c f9267f0 = d.c.RESUMED;

    /* renamed from: i0, reason: collision with root package name */
    public androidx.lifecycle.l f9270i0 = new androidx.lifecycle.l();

    /* renamed from: l0, reason: collision with root package name */
    public final AtomicInteger f9273l0 = new AtomicInteger();

    /* renamed from: m0, reason: collision with root package name */
    public final ArrayList f9274m0 = new ArrayList();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.G1();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.e(false);
        }
    }

    public class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ B f9290o;

        public c(B b7) {
            this.f9290o = b7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9290o.g();
        }
    }

    public class d extends androidx.fragment.app.g {
        public d() {
        }

        @Override // androidx.fragment.app.g
        public View e(int i7) {
            View view = Fragment.this.f9257V;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            return Fragment.this.f9257V != null;
        }
    }

    public class e implements InterfaceC1749a {
        public e() {
        }

        @Override // o.InterfaceC1749a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.f9243H;
            return obj instanceof androidx.activity.result.d ? ((androidx.activity.result.d) obj).c() : fragment.o1().c();
        }
    }

    public class f extends j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1749a f9294a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f9295b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC1161a f9296c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.b f9297d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC1749a interfaceC1749a, AtomicReference atomicReference, AbstractC1161a abstractC1161a, androidx.activity.result.b bVar) {
            super(null);
            this.f9294a = interfaceC1749a;
            this.f9295b = atomicReference;
            this.f9296c = abstractC1161a;
            this.f9297d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.j
        public void a() {
            String m7 = Fragment.this.m();
            this.f9295b.set(((ActivityResultRegistry) this.f9294a.apply(null)).i(m7, Fragment.this, this.f9296c, this.f9297d));
        }
    }

    public class g extends androidx.activity.result.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f9299a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1161a f9300b;

        public g(AtomicReference atomicReference, AbstractC1161a abstractC1161a) {
            this.f9299a = atomicReference;
            this.f9300b = abstractC1161a;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, w.b bVar) {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f9299a.get();
            if (cVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar.b(obj, bVar);
        }

        @Override // androidx.activity.result.c
        public void c() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f9299a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public View f9302a;

        /* renamed from: b, reason: collision with root package name */
        public Animator f9303b;

        /* renamed from: c, reason: collision with root package name */
        public int f9304c;

        /* renamed from: d, reason: collision with root package name */
        public int f9305d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f9306e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f9307f;

        /* renamed from: g, reason: collision with root package name */
        public Object f9308g = null;

        /* renamed from: h, reason: collision with root package name */
        public Object f9309h;

        /* renamed from: i, reason: collision with root package name */
        public Object f9310i;

        /* renamed from: j, reason: collision with root package name */
        public Object f9311j;

        /* renamed from: k, reason: collision with root package name */
        public Object f9312k;

        /* renamed from: l, reason: collision with root package name */
        public Object f9313l;

        /* renamed from: m, reason: collision with root package name */
        public Boolean f9314m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f9315n;

        /* renamed from: o, reason: collision with root package name */
        public float f9316o;

        /* renamed from: p, reason: collision with root package name */
        public View f9317p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f9318q;

        /* renamed from: r, reason: collision with root package name */
        public k f9319r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f9320s;

        public h() {
            Object obj = Fragment.f9235n0;
            this.f9309h = obj;
            this.f9310i = null;
            this.f9311j = obj;
            this.f9312k = null;
            this.f9313l = obj;
            this.f9316o = 1.0f;
            this.f9317p = null;
        }
    }

    public static class i extends RuntimeException {
        public i(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class j {
        public j() {
        }

        public /* synthetic */ j(a aVar) {
            this();
        }

        public abstract void a();
    }

    public interface k {
        void a();

        void b();
    }

    public Fragment() {
        T();
    }

    public static Fragment V(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) androidx.fragment.app.j.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.w1(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e7) {
            throw new i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (InstantiationException e8) {
            throw new i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (NoSuchMethodException e9) {
            throw new i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e9);
        } catch (InvocationTargetException e10) {
            throw new i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e10);
        }
    }

    public LayoutInflater A(Bundle bundle) {
        androidx.fragment.app.k kVar = this.f9243H;
        if (kVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater n7 = kVar.n();
        AbstractC0410g.a(n7, this.f9244I.t0());
        return n7;
    }

    public boolean A0(MenuItem menuItem) {
        return false;
    }

    public void A1(int i7) {
        if (this.f9260Y == null && i7 == 0) {
            return;
        }
        i();
        this.f9260Y.f9305d = i7;
    }

    public final int B() {
        d.c cVar = this.f9267f0;
        return (cVar == d.c.INITIALIZED || this.f9245J == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f9245J.B());
    }

    public void B0(Menu menu) {
    }

    public void B1(k kVar) {
        i();
        h hVar = this.f9260Y;
        k kVar2 = hVar.f9319r;
        if (kVar == kVar2) {
            return;
        }
        if (kVar != null && kVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (hVar.f9318q) {
            hVar.f9319r = kVar;
        }
        if (kVar != null) {
            kVar.b();
        }
    }

    public int C() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return 0;
        }
        return hVar.f9304c;
    }

    public void C0() {
        this.f9255T = true;
    }

    public void C1(float f7) {
        i().f9316o = f7;
    }

    public int D() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return 0;
        }
        return hVar.f9305d;
    }

    public void D0(boolean z7) {
    }

    public void D1(boolean z7) {
        this.f9251P = z7;
        n nVar = this.f9242G;
        if (nVar == null) {
            this.f9252Q = true;
        } else if (z7) {
            nVar.i(this);
        } else {
            nVar.a1(this);
        }
    }

    public final Fragment E() {
        return this.f9245J;
    }

    public void E0(Menu menu) {
    }

    public void E1(ArrayList arrayList, ArrayList arrayList2) {
        i();
        h hVar = this.f9260Y;
        hVar.f9306e = arrayList;
        hVar.f9307f = arrayList2;
    }

    public final n F() {
        n nVar = this.f9242G;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void F0(boolean z7) {
    }

    public void F1(Intent intent, int i7, Bundle bundle) {
        if (this.f9243H != null) {
            F().J0(this, intent, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public float G() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return 1.0f;
        }
        return hVar.f9316o;
    }

    public void G0(int i7, String[] strArr, int[] iArr) {
    }

    public void G1() {
        if (this.f9260Y == null || !i().f9318q) {
            return;
        }
        if (this.f9243H == null) {
            i().f9318q = false;
        } else if (Looper.myLooper() != this.f9243H.l().getLooper()) {
            this.f9243H.l().postAtFrontOfQueue(new b());
        } else {
            e(true);
        }
    }

    public Object H() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f9311j;
        return obj == f9235n0 ? w() : obj;
    }

    public void H0() {
        this.f9255T = true;
    }

    public final Resources I() {
        return p1().getResources();
    }

    public void I0(Bundle bundle) {
    }

    public final boolean J() {
        return this.f9251P;
    }

    public void J0() {
        this.f9255T = true;
    }

    public Object K() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f9309h;
        return obj == f9235n0 ? u() : obj;
    }

    public void K0() {
        this.f9255T = true;
    }

    public Object L() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        return hVar.f9312k;
    }

    public void L0(View view, Bundle bundle) {
    }

    public Object M() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        Object obj = hVar.f9313l;
        return obj == f9235n0 ? L() : obj;
    }

    public void M0(Bundle bundle) {
        this.f9255T = true;
    }

    public ArrayList N() {
        ArrayList arrayList;
        h hVar = this.f9260Y;
        return (hVar == null || (arrayList = hVar.f9306e) == null) ? new ArrayList() : arrayList;
    }

    public void N0(Bundle bundle) {
        this.f9244I.P0();
        this.f9275o = 3;
        this.f9255T = false;
        g0(bundle);
        if (this.f9255T) {
            s1();
            this.f9244I.y();
        } else {
            throw new D("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public ArrayList O() {
        ArrayList arrayList;
        h hVar = this.f9260Y;
        return (hVar == null || (arrayList = hVar.f9307f) == null) ? new ArrayList() : arrayList;
    }

    public void O0() {
        Iterator it = this.f9274m0.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
        this.f9274m0.clear();
        this.f9244I.k(this.f9243H, f(), this);
        this.f9275o = 0;
        this.f9255T = false;
        j0(this.f9243H.i());
        if (this.f9255T) {
            this.f9242G.I(this);
            this.f9244I.z();
        } else {
            throw new D("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public final String P(int i7) {
        return I().getString(i7);
    }

    public void P0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f9244I.A(configuration);
    }

    public final Fragment Q() {
        String str;
        Fragment fragment = this.f9282v;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.f9242G;
        if (nVar == null || (str = this.f9283w) == null) {
            return null;
        }
        return nVar.f0(str);
    }

    public boolean Q0(MenuItem menuItem) {
        if (this.f9249N) {
            return false;
        }
        if (l0(menuItem)) {
            return true;
        }
        return this.f9244I.B(menuItem);
    }

    public View R() {
        return this.f9257V;
    }

    public void R0(Bundle bundle) {
        this.f9244I.P0();
        this.f9275o = 1;
        this.f9255T = false;
        this.f9268g0.a(new androidx.lifecycle.f() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.f
            public void a(androidx.lifecycle.h hVar, d.b bVar) {
                View view;
                if (bVar != d.b.ON_STOP || (view = Fragment.this.f9257V) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.f9271j0.c(bundle);
        m0(bundle);
        this.f9266e0 = true;
        if (this.f9255T) {
            this.f9268g0.h(d.b.ON_CREATE);
            return;
        }
        throw new D("Fragment " + this + " did not call through to super.onCreate()");
    }

    public LiveData S() {
        return this.f9270i0;
    }

    public boolean S0(Menu menu, MenuInflater menuInflater) {
        boolean z7 = false;
        if (this.f9249N) {
            return false;
        }
        if (this.f9253R && this.f9254S) {
            p0(menu, menuInflater);
            z7 = true;
        }
        return z7 | this.f9244I.D(menu, menuInflater);
    }

    public final void T() {
        this.f9268g0 = new androidx.lifecycle.i(this);
        this.f9271j0 = androidx.savedstate.b.a(this);
    }

    public void T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9244I.P0();
        this.f9240E = true;
        this.f9269h0 = new z();
        View q02 = q0(layoutInflater, viewGroup, bundle);
        this.f9257V = q02;
        if (q02 == null) {
            if (this.f9269h0.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f9269h0 = null;
        } else {
            this.f9269h0.b();
            androidx.lifecycle.v.a(this.f9257V, this.f9269h0);
            androidx.lifecycle.w.a(this.f9257V, this);
            androidx.savedstate.d.a(this.f9257V, this.f9269h0);
            this.f9270i0.j(this.f9269h0);
        }
    }

    public void U() {
        T();
        this.f9280t = UUID.randomUUID().toString();
        this.f9286z = false;
        this.f9236A = false;
        this.f9237B = false;
        this.f9238C = false;
        this.f9239D = false;
        this.f9241F = 0;
        this.f9242G = null;
        this.f9244I = new o();
        this.f9243H = null;
        this.f9246K = 0;
        this.f9247L = 0;
        this.f9248M = null;
        this.f9249N = false;
        this.f9250O = false;
    }

    public void U0() {
        this.f9244I.E();
        this.f9268g0.h(d.b.ON_DESTROY);
        this.f9275o = 0;
        this.f9255T = false;
        this.f9266e0 = false;
        r0();
        if (this.f9255T) {
            return;
        }
        throw new D("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void V0() {
        this.f9244I.F();
        if (this.f9257V != null && this.f9269h0.g().b().c(d.c.CREATED)) {
            this.f9269h0.a(d.b.ON_DESTROY);
        }
        this.f9275o = 1;
        this.f9255T = false;
        t0();
        if (this.f9255T) {
            Y.a.b(this).c();
            this.f9240E = false;
        } else {
            throw new D("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final boolean W() {
        return this.f9243H != null && this.f9286z;
    }

    public void W0() {
        this.f9275o = -1;
        this.f9255T = false;
        u0();
        this.f9265d0 = null;
        if (this.f9255T) {
            if (this.f9244I.C0()) {
                return;
            }
            this.f9244I.E();
            this.f9244I = new o();
            return;
        }
        throw new D("Fragment " + this + " did not call through to super.onDetach()");
    }

    public boolean X() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return false;
        }
        return hVar.f9320s;
    }

    public LayoutInflater X0(Bundle bundle) {
        LayoutInflater v02 = v0(bundle);
        this.f9265d0 = v02;
        return v02;
    }

    public final boolean Y() {
        return this.f9241F > 0;
    }

    public void Y0() {
        onLowMemory();
        this.f9244I.G();
    }

    public final boolean Z() {
        n nVar;
        return this.f9254S && ((nVar = this.f9242G) == null || nVar.F0(this.f9245J));
    }

    public void Z0(boolean z7) {
        z0(z7);
        this.f9244I.H(z7);
    }

    public boolean a0() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return false;
        }
        return hVar.f9318q;
    }

    public boolean a1(MenuItem menuItem) {
        if (this.f9249N) {
            return false;
        }
        if (this.f9253R && this.f9254S && A0(menuItem)) {
            return true;
        }
        return this.f9244I.J(menuItem);
    }

    public final boolean b0() {
        return this.f9236A;
    }

    public void b1(Menu menu) {
        if (this.f9249N) {
            return;
        }
        if (this.f9253R && this.f9254S) {
            B0(menu);
        }
        this.f9244I.K(menu);
    }

    public final boolean c0() {
        Fragment E6 = E();
        return E6 != null && (E6.b0() || E6.c0());
    }

    public void c1() {
        this.f9244I.M();
        if (this.f9257V != null) {
            this.f9269h0.a(d.b.ON_PAUSE);
        }
        this.f9268g0.h(d.b.ON_PAUSE);
        this.f9275o = 6;
        this.f9255T = false;
        C0();
        if (this.f9255T) {
            return;
        }
        throw new D("Fragment " + this + " did not call through to super.onPause()");
    }

    @Override // androidx.lifecycle.u
    public androidx.lifecycle.t d() {
        if (this.f9242G == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (B() != d.c.INITIALIZED.ordinal()) {
            return this.f9242G.z0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean d0() {
        return this.f9275o >= 7;
    }

    public void d1(boolean z7) {
        D0(z7);
        this.f9244I.N(z7);
    }

    public void e(boolean z7) {
        ViewGroup viewGroup;
        n nVar;
        h hVar = this.f9260Y;
        k kVar = null;
        if (hVar != null) {
            hVar.f9318q = false;
            k kVar2 = hVar.f9319r;
            hVar.f9319r = null;
            kVar = kVar2;
        }
        if (kVar != null) {
            kVar.a();
            return;
        }
        if (!n.f9446P || this.f9257V == null || (viewGroup = this.f9256U) == null || (nVar = this.f9242G) == null) {
            return;
        }
        B n7 = B.n(viewGroup, nVar);
        n7.p();
        if (z7) {
            this.f9243H.l().post(new c(n7));
        } else {
            n7.g();
        }
    }

    public final boolean e0() {
        n nVar = this.f9242G;
        if (nVar == null) {
            return false;
        }
        return nVar.I0();
    }

    public boolean e1(Menu menu) {
        boolean z7 = false;
        if (this.f9249N) {
            return false;
        }
        if (this.f9253R && this.f9254S) {
            E0(menu);
            z7 = true;
        }
        return z7 | this.f9244I.O(menu);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public androidx.fragment.app.g f() {
        return new d();
    }

    public void f0() {
        this.f9244I.P0();
    }

    public void f1() {
        boolean G02 = this.f9242G.G0(this);
        Boolean bool = this.f9285y;
        if (bool == null || bool.booleanValue() != G02) {
            this.f9285y = Boolean.valueOf(G02);
            F0(G02);
            this.f9244I.P();
        }
    }

    @Override // androidx.lifecycle.h
    public androidx.lifecycle.d g() {
        return this.f9268g0;
    }

    public void g0(Bundle bundle) {
        this.f9255T = true;
    }

    public void g1() {
        this.f9244I.P0();
        this.f9244I.a0(true);
        this.f9275o = 7;
        this.f9255T = false;
        H0();
        if (!this.f9255T) {
            throw new D("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.i iVar = this.f9268g0;
        d.b bVar = d.b.ON_RESUME;
        iVar.h(bVar);
        if (this.f9257V != null) {
            this.f9269h0.a(bVar);
        }
        this.f9244I.Q();
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f9246K));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f9247L));
        printWriter.print(" mTag=");
        printWriter.println(this.f9248M);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f9275o);
        printWriter.print(" mWho=");
        printWriter.print(this.f9280t);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f9241F);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f9286z);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f9236A);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f9237B);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f9238C);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f9249N);
        printWriter.print(" mDetached=");
        printWriter.print(this.f9250O);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f9254S);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f9253R);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f9251P);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f9259X);
        if (this.f9242G != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f9242G);
        }
        if (this.f9243H != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f9243H);
        }
        if (this.f9245J != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f9245J);
        }
        if (this.f9281u != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f9281u);
        }
        if (this.f9276p != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f9276p);
        }
        if (this.f9277q != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f9277q);
        }
        if (this.f9278r != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f9278r);
        }
        Fragment Q6 = Q();
        if (Q6 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(Q6);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f9284x);
        }
        if (C() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(C());
        }
        if (this.f9256U != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f9256U);
        }
        if (this.f9257V != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f9257V);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
        }
        if (t() != null) {
            Y.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f9244I + ":");
        this.f9244I.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void h0(int i7, int i8, Intent intent) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    public void h1(Bundle bundle) {
        I0(bundle);
        this.f9271j0.d(bundle);
        Parcelable e12 = this.f9244I.e1();
        if (e12 != null) {
            bundle.putParcelable("android:support:fragments", e12);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final h i() {
        if (this.f9260Y == null) {
            this.f9260Y = new h();
        }
        return this.f9260Y;
    }

    public void i0(Activity activity) {
        this.f9255T = true;
    }

    public void i1() {
        this.f9244I.P0();
        this.f9244I.a0(true);
        this.f9275o = 5;
        this.f9255T = false;
        J0();
        if (!this.f9255T) {
            throw new D("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.i iVar = this.f9268g0;
        d.b bVar = d.b.ON_START;
        iVar.h(bVar);
        if (this.f9257V != null) {
            this.f9269h0.a(bVar);
        }
        this.f9244I.R();
    }

    public void j0(Context context) {
        this.f9255T = true;
        androidx.fragment.app.k kVar = this.f9243H;
        Activity h7 = kVar == null ? null : kVar.h();
        if (h7 != null) {
            this.f9255T = false;
            i0(h7);
        }
    }

    public void j1() {
        this.f9244I.T();
        if (this.f9257V != null) {
            this.f9269h0.a(d.b.ON_STOP);
        }
        this.f9268g0.h(d.b.ON_STOP);
        this.f9275o = 4;
        this.f9255T = false;
        K0();
        if (this.f9255T) {
            return;
        }
        throw new D("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry k() {
        return this.f9271j0.b();
    }

    public void k0(Fragment fragment) {
    }

    public void k1() {
        L0(this.f9257V, this.f9276p);
        this.f9244I.U();
    }

    public Fragment l(String str) {
        return str.equals(this.f9280t) ? this : this.f9244I.i0(str);
    }

    public boolean l0(MenuItem menuItem) {
        return false;
    }

    public final androidx.activity.result.c l1(AbstractC1161a abstractC1161a, InterfaceC1749a interfaceC1749a, androidx.activity.result.b bVar) {
        if (this.f9275o <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            n1(new f(interfaceC1749a, atomicReference, abstractC1161a, bVar));
            return new g(atomicReference, abstractC1161a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public String m() {
        return "fragment_" + this.f9280t + "_rq#" + this.f9273l0.getAndIncrement();
    }

    public void m0(Bundle bundle) {
        this.f9255T = true;
        r1(bundle);
        if (this.f9244I.H0(1)) {
            return;
        }
        this.f9244I.C();
    }

    public final androidx.activity.result.c m1(AbstractC1161a abstractC1161a, androidx.activity.result.b bVar) {
        return l1(abstractC1161a, new e(), bVar);
    }

    public final androidx.fragment.app.e n() {
        androidx.fragment.app.k kVar = this.f9243H;
        if (kVar == null) {
            return null;
        }
        return (androidx.fragment.app.e) kVar.h();
    }

    public Animation n0(int i7, boolean z7, int i8) {
        return null;
    }

    public final void n1(j jVar) {
        if (this.f9275o >= 0) {
            jVar.a();
        } else {
            this.f9274m0.add(jVar);
        }
    }

    public boolean o() {
        Boolean bool;
        h hVar = this.f9260Y;
        if (hVar == null || (bool = hVar.f9315n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animator o0(int i7, boolean z7, int i8) {
        return null;
    }

    public final androidx.fragment.app.e o1() {
        androidx.fragment.app.e n7 = n();
        if (n7 != null) {
            return n7;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f9255T = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        o1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f9255T = true;
    }

    public boolean p() {
        Boolean bool;
        h hVar = this.f9260Y;
        if (hVar == null || (bool = hVar.f9314m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void p0(Menu menu, MenuInflater menuInflater) {
    }

    public final Context p1() {
        Context t7 = t();
        if (t7 != null) {
            return t7;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public View q() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        return hVar.f9302a;
    }

    public View q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7 = this.f9272k0;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    public final View q1() {
        View R6 = R();
        if (R6 != null) {
            return R6;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animator r() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        return hVar.f9303b;
    }

    public void r0() {
        this.f9255T = true;
    }

    public void r1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f9244I.c1(parcelable);
        this.f9244I.C();
    }

    public final n s() {
        if (this.f9243H != null) {
            return this.f9244I;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void s0() {
    }

    public final void s1() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f9257V != null) {
            t1(this.f9276p);
        }
        this.f9276p = null;
    }

    public void startActivityForResult(Intent intent, int i7) {
        F1(intent, i7, null);
    }

    public Context t() {
        androidx.fragment.app.k kVar = this.f9243H;
        if (kVar == null) {
            return null;
        }
        return kVar.i();
    }

    public void t0() {
        this.f9255T = true;
    }

    public final void t1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f9277q;
        if (sparseArray != null) {
            this.f9257V.restoreHierarchyState(sparseArray);
            this.f9277q = null;
        }
        if (this.f9257V != null) {
            this.f9269h0.d(this.f9278r);
            this.f9278r = null;
        }
        this.f9255T = false;
        M0(bundle);
        if (this.f9255T) {
            if (this.f9257V != null) {
                this.f9269h0.a(d.b.ON_CREATE);
            }
        } else {
            throw new D("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f9280t);
        sb.append(")");
        if (this.f9246K != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9246K));
        }
        if (this.f9248M != null) {
            sb.append(" ");
            sb.append(this.f9248M);
        }
        sb.append('}');
        return sb.toString();
    }

    public Object u() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        return hVar.f9308g;
    }

    public void u0() {
        this.f9255T = true;
    }

    public void u1(View view) {
        i().f9302a = view;
    }

    public w.m v() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        hVar.getClass();
        return null;
    }

    public LayoutInflater v0(Bundle bundle) {
        return A(bundle);
    }

    public void v1(Animator animator) {
        i().f9303b = animator;
    }

    public Object w() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        return hVar.f9310i;
    }

    public void w0(boolean z7) {
    }

    public void w1(Bundle bundle) {
        if (this.f9242G != null && e0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f9281u = bundle;
    }

    public w.m x() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        hVar.getClass();
        return null;
    }

    public void x0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f9255T = true;
    }

    public void x1(View view) {
        i().f9317p = view;
    }

    public View y() {
        h hVar = this.f9260Y;
        if (hVar == null) {
            return null;
        }
        return hVar.f9317p;
    }

    public void y0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f9255T = true;
        androidx.fragment.app.k kVar = this.f9243H;
        Activity h7 = kVar == null ? null : kVar.h();
        if (h7 != null) {
            this.f9255T = false;
            x0(h7, attributeSet, bundle);
        }
    }

    public void y1(boolean z7) {
        i().f9320s = z7;
    }

    public final Object z() {
        androidx.fragment.app.k kVar = this.f9243H;
        if (kVar == null) {
            return null;
        }
        return kVar.m();
    }

    public void z0(boolean z7) {
    }

    public void z1(int i7) {
        if (this.f9260Y == null && i7 == 0) {
            return;
        }
        i().f9304c = i7;
    }
}
