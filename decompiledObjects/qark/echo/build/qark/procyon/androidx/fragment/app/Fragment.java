// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.util.AttributeSet;
import w.m;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.animation.Animator;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import java.util.concurrent.atomic.AtomicReference;
import androidx.savedstate.SavedStateRegistry;
import android.app.Activity;
import android.os.Parcelable;
import android.util.Log;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.lifecycle.t;
import Y.a;
import androidx.lifecycle.w;
import androidx.lifecycle.v;
import android.view.MenuInflater;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f;
import android.content.res.Configuration;
import java.util.Iterator;
import android.content.res.Resources;
import android.os.Looper;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import I.g;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import java.util.UUID;
import android.util.SparseArray;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.savedstate.b;
import androidx.lifecycle.l;
import androidx.lifecycle.i;
import androidx.lifecycle.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.savedstate.c;
import androidx.lifecycle.u;
import androidx.lifecycle.h;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public abstract class Fragment implements ComponentCallbacks, View$OnCreateContextMenuListener, androidx.lifecycle.h, u, c
{
    public static final Object n0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public n G;
    public androidx.fragment.app.k H;
    public n I;
    public Fragment J;
    public int K;
    public int L;
    public String M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public ViewGroup U;
    public View V;
    public boolean W;
    public boolean X;
    public h Y;
    public Runnable Z;
    public boolean a0;
    public boolean b0;
    public float c0;
    public LayoutInflater d0;
    public boolean e0;
    public d.c f0;
    public androidx.lifecycle.i g0;
    public z h0;
    public l i0;
    public b j0;
    public int k0;
    public final AtomicInteger l0;
    public final ArrayList m0;
    public int o;
    public Bundle p;
    public SparseArray q;
    public Bundle r;
    public Boolean s;
    public String t;
    public Bundle u;
    public Fragment v;
    public String w;
    public int x;
    public Boolean y;
    public boolean z;
    
    static {
        n0 = new Object();
    }
    
    public Fragment() {
        this.o = -1;
        this.t = UUID.randomUUID().toString();
        this.w = null;
        this.y = null;
        this.I = new o();
        this.S = true;
        this.X = true;
        this.Z = new Runnable() {
            @Override
            public void run() {
                Fragment.this.G1();
            }
        };
        this.f0 = d.c.s;
        this.i0 = new l();
        this.l0 = new AtomicInteger();
        this.m0 = new ArrayList();
        this.T();
    }
    
    public static Fragment V(final Context context, final String s, final Bundle bundle) {
        Label_0189: {
            Label_0148: {
                Label_0107: {
                    Label_0066: {
                        Fragment fragment;
                        try {
                            fragment = androidx.fragment.app.j.d(context.getClassLoader(), s).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                            if (bundle != null) {
                                bundle.setClassLoader(fragment.getClass().getClassLoader());
                                fragment.w1(bundle);
                                return fragment;
                            }
                        }
                        catch (InvocationTargetException ex) {
                            break Label_0066;
                        }
                        catch (NoSuchMethodException ex2) {
                            break Label_0107;
                        }
                        catch (IllegalAccessException ex3) {
                            break Label_0148;
                        }
                        catch (InstantiationException ex4) {
                            break Label_0189;
                        }
                        return fragment;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to instantiate fragment ");
                    sb.append(s);
                    sb.append(": calling Fragment constructor caused an exception");
                    final InvocationTargetException ex;
                    throw new i(sb.toString(), ex);
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to instantiate fragment ");
                sb2.append(s);
                sb2.append(": could not find Fragment constructor");
                final NoSuchMethodException ex2;
                throw new i(sb2.toString(), ex2);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate fragment ");
            sb3.append(s);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            final IllegalAccessException ex3;
            throw new i(sb3.toString(), ex3);
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Unable to instantiate fragment ");
        sb4.append(s);
        sb4.append(": make sure class name exists, is public, and has an empty constructor that is public");
        final InstantiationException ex4;
        throw new i(sb4.toString(), ex4);
    }
    
    public LayoutInflater A(final Bundle bundle) {
        final androidx.fragment.app.k h = this.H;
        if (h != null) {
            final LayoutInflater n = h.n();
            g.a(n, this.I.t0());
            return n;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }
    
    public boolean A0(final MenuItem menuItem) {
        return false;
    }
    
    public void A1(final int d) {
        if (this.Y == null && d == 0) {
            return;
        }
        this.i();
        this.Y.d = d;
    }
    
    public final int B() {
        final d.c f0 = this.f0;
        if (f0 != d.c.p && this.J != null) {
            return Math.min(f0.ordinal(), this.J.B());
        }
        return f0.ordinal();
    }
    
    public void B0(final Menu menu) {
    }
    
    public void B1(final k r) {
        this.i();
        final h y = this.Y;
        final k r2 = y.r;
        if (r == r2) {
            return;
        }
        if (r != null && r2 != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        if (y.q) {
            y.r = r;
        }
        if (r != null) {
            r.b();
        }
    }
    
    public int C() {
        final h y = this.Y;
        if (y == null) {
            return 0;
        }
        return y.c;
    }
    
    public void C0() {
        this.T = true;
    }
    
    public void C1(final float o) {
        this.i().o = o;
    }
    
    public int D() {
        final h y = this.Y;
        if (y == null) {
            return 0;
        }
        return y.d;
    }
    
    public void D0(final boolean b) {
    }
    
    public void D1(final boolean p) {
        this.P = p;
        final n g = this.G;
        if (g == null) {
            this.Q = true;
            return;
        }
        if (p) {
            g.i(this);
            return;
        }
        g.a1(this);
    }
    
    public final Fragment E() {
        return this.J;
    }
    
    public void E0(final Menu menu) {
    }
    
    public void E1(final ArrayList e, final ArrayList f) {
        this.i();
        final h y = this.Y;
        y.e = e;
        y.f = f;
    }
    
    public final n F() {
        final n g = this.G;
        if (g != null) {
            return g;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }
    
    public void F0(final boolean b) {
    }
    
    public void F1(final Intent intent, final int n, final Bundle bundle) {
        if (this.H != null) {
            this.F().J0(this, intent, n, bundle);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    public float G() {
        final h y = this.Y;
        if (y == null) {
            return 1.0f;
        }
        return y.o;
    }
    
    public void G0(final int n, final String[] array, final int[] array2) {
    }
    
    public void G1() {
        if (this.Y != null) {
            if (!this.i().q) {
                return;
            }
            if (this.H == null) {
                this.i().q = false;
                return;
            }
            if (Looper.myLooper() != this.H.l().getLooper()) {
                this.H.l().postAtFrontOfQueue((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        Fragment.this.e(false);
                    }
                });
                return;
            }
            this.e(true);
        }
    }
    
    public Object H() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        Object o;
        if ((o = y.j) == Fragment.n0) {
            o = this.w();
        }
        return o;
    }
    
    public void H0() {
        this.T = true;
    }
    
    public final Resources I() {
        return this.p1().getResources();
    }
    
    public void I0(final Bundle bundle) {
    }
    
    public final boolean J() {
        return this.P;
    }
    
    public void J0() {
        this.T = true;
    }
    
    public Object K() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        Object o;
        if ((o = y.h) == Fragment.n0) {
            o = this.u();
        }
        return o;
    }
    
    public void K0() {
        this.T = true;
    }
    
    public Object L() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        return y.k;
    }
    
    public void L0(final View view, final Bundle bundle) {
    }
    
    public Object M() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        Object o;
        if ((o = y.l) == Fragment.n0) {
            o = this.L();
        }
        return o;
    }
    
    public void M0(final Bundle bundle) {
        this.T = true;
    }
    
    public ArrayList N() {
        final h y = this.Y;
        if (y != null) {
            final ArrayList e = y.e;
            if (e != null) {
                return e;
            }
        }
        return new ArrayList();
    }
    
    public void N0(final Bundle bundle) {
        this.I.P0();
        this.o = 3;
        this.T = false;
        this.g0(bundle);
        if (this.T) {
            this.s1();
            this.I.y();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new D(sb.toString());
    }
    
    public ArrayList O() {
        final h y = this.Y;
        if (y != null) {
            final ArrayList f = y.f;
            if (f != null) {
                return f;
            }
        }
        return new ArrayList();
    }
    
    public void O0() {
        final Iterator<j> iterator = this.m0.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.m0.clear();
        this.I.k(this.H, this.f(), this);
        this.o = 0;
        this.T = false;
        this.j0(this.H.i());
        if (this.T) {
            this.G.I(this);
            this.I.z();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onAttach()");
        throw new D(sb.toString());
    }
    
    public final String P(final int n) {
        return this.I().getString(n);
    }
    
    public void P0(final Configuration configuration) {
        this.onConfigurationChanged(configuration);
        this.I.A(configuration);
    }
    
    public final Fragment Q() {
        final Fragment v = this.v;
        if (v != null) {
            return v;
        }
        final n g = this.G;
        if (g != null) {
            final String w = this.w;
            if (w != null) {
                return g.f0(w);
            }
        }
        return null;
    }
    
    public boolean Q0(final MenuItem menuItem) {
        return !this.N && (this.l0(menuItem) || this.I.B(menuItem));
    }
    
    public View R() {
        return this.V;
    }
    
    public void R0(final Bundle bundle) {
        this.I.P0();
        this.o = 1;
        this.T = false;
        this.g0.a(new f() {
            @Override
            public void a(final androidx.lifecycle.h h, final d.b b) {
                if (b == d.b.ON_STOP) {
                    final View v = Fragment.this.V;
                    if (v != null) {
                        v.cancelPendingInputEvents();
                    }
                }
            }
        });
        this.j0.c(bundle);
        this.m0(bundle);
        this.e0 = true;
        if (this.T) {
            this.g0.h(d.b.ON_CREATE);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new D(sb.toString());
    }
    
    public LiveData S() {
        return this.i0;
    }
    
    public boolean S0(final Menu menu, final MenuInflater menuInflater) {
        final boolean n = this.N;
        boolean b = false;
        final boolean b2 = false;
        if (!n) {
            boolean b3 = b2;
            if (this.R) {
                b3 = b2;
                if (this.S) {
                    this.p0(menu, menuInflater);
                    b3 = true;
                }
            }
            b = (b3 | this.I.D(menu, menuInflater));
        }
        return b;
    }
    
    public final void T() {
        this.g0 = new androidx.lifecycle.i(this);
        this.j0 = b.a(this);
    }
    
    public void T0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.I.P0();
        this.E = true;
        this.h0 = new z();
        final View q0 = this.q0(layoutInflater, viewGroup, bundle);
        this.V = q0;
        if (q0 != null) {
            this.h0.b();
            androidx.lifecycle.v.a(this.V, this.h0);
            androidx.lifecycle.w.a(this.V, this);
            androidx.savedstate.d.a(this.V, this.h0);
            this.i0.j(this.h0);
            return;
        }
        if (!this.h0.c()) {
            this.h0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }
    
    public void U() {
        this.T();
        this.t = UUID.randomUUID().toString();
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.F = 0;
        this.G = null;
        this.I = new o();
        this.H = null;
        this.K = 0;
        this.L = 0;
        this.M = null;
        this.N = false;
        this.O = false;
    }
    
    public void U0() {
        this.I.E();
        this.g0.h(d.b.ON_DESTROY);
        this.o = 0;
        this.T = false;
        this.e0 = false;
        this.r0();
        if (this.T) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new D(sb.toString());
    }
    
    public void V0() {
        this.I.F();
        if (this.V != null && this.h0.g().b().c(d.c.q)) {
            this.h0.a(d.b.ON_DESTROY);
        }
        this.o = 1;
        this.T = false;
        this.t0();
        if (this.T) {
            a.b(this).c();
            this.E = false;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new D(sb.toString());
    }
    
    public final boolean W() {
        return this.H != null && this.z;
    }
    
    public void W0() {
        this.o = -1;
        this.T = false;
        this.u0();
        this.d0 = null;
        if (this.T) {
            if (!this.I.C0()) {
                this.I.E();
                this.I = new o();
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDetach()");
        throw new D(sb.toString());
    }
    
    public boolean X() {
        final h y = this.Y;
        return y != null && y.s;
    }
    
    public LayoutInflater X0(final Bundle bundle) {
        return this.d0 = this.v0(bundle);
    }
    
    public final boolean Y() {
        return this.F > 0;
    }
    
    public void Y0() {
        this.onLowMemory();
        this.I.G();
    }
    
    public final boolean Z() {
        if (this.S) {
            final n g = this.G;
            if (g == null || g.F0(this.J)) {
                return true;
            }
        }
        return false;
    }
    
    public void Z0(final boolean b) {
        this.z0(b);
        this.I.H(b);
    }
    
    public boolean a0() {
        final h y = this.Y;
        return y != null && y.q;
    }
    
    public boolean a1(final MenuItem menuItem) {
        return !this.N && ((this.R && this.S && this.A0(menuItem)) || this.I.J(menuItem));
    }
    
    public final boolean b0() {
        return this.A;
    }
    
    public void b1(final Menu menu) {
        if (!this.N) {
            if (this.R && this.S) {
                this.B0(menu);
            }
            this.I.K(menu);
        }
    }
    
    public final boolean c0() {
        final Fragment e = this.E();
        return e != null && (e.b0() || e.c0());
    }
    
    public void c1() {
        this.I.M();
        if (this.V != null) {
            this.h0.a(d.b.ON_PAUSE);
        }
        this.g0.h(d.b.ON_PAUSE);
        this.o = 6;
        this.T = false;
        this.C0();
        if (this.T) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onPause()");
        throw new D(sb.toString());
    }
    
    public t d() {
        if (this.G == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.B() != d.c.p.ordinal()) {
            return this.G.z0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    
    public final boolean d0() {
        return this.o >= 7;
    }
    
    public void d1(final boolean b) {
        this.D0(b);
        this.I.N(b);
    }
    
    public void e(final boolean b) {
        final h y = this.Y;
        Object r = null;
        if (y != null) {
            y.q = false;
            r = y.r;
            y.r = null;
        }
        if (r != null) {
            ((k)r).a();
            return;
        }
        if (n.P && this.V != null) {
            final ViewGroup u = this.U;
            if (u != null) {
                final n g = this.G;
                if (g != null) {
                    final B n = androidx.fragment.app.B.n(u, g);
                    n.p();
                    if (b) {
                        this.H.l().post((Runnable)new Runnable() {
                            @Override
                            public void run() {
                                n.g();
                            }
                        });
                        return;
                    }
                    n.g();
                }
            }
        }
    }
    
    public final boolean e0() {
        final n g = this.G;
        return g != null && g.I0();
    }
    
    public boolean e1(final Menu menu) {
        final boolean n = this.N;
        boolean b = false;
        final boolean b2 = false;
        if (!n) {
            boolean b3 = b2;
            if (this.R) {
                b3 = b2;
                if (this.S) {
                    this.E0(menu);
                    b3 = true;
                }
            }
            b = (b3 | this.I.O(menu));
        }
        return b;
    }
    
    @Override
    public final boolean equals(final Object obj) {
        return super.equals(obj);
    }
    
    public androidx.fragment.app.g f() {
        return new androidx.fragment.app.g() {
            @Override
            public View e(final int n) {
                final View v = Fragment.this.V;
                if (v != null) {
                    return v.findViewById(n);
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(Fragment.this);
                sb.append(" does not have a view");
                throw new IllegalStateException(sb.toString());
            }
            
            @Override
            public boolean f() {
                return Fragment.this.V != null;
            }
        };
    }
    
    public void f0() {
        this.I.P0();
    }
    
    public void f1() {
        final boolean g0 = this.G.G0(this);
        final Boolean y = this.y;
        if (y == null || y != g0) {
            this.y = g0;
            this.F0(g0);
            this.I.P();
        }
    }
    
    public d g() {
        return this.g0;
    }
    
    public void g0(final Bundle bundle) {
        this.T = true;
    }
    
    public void g1() {
        this.I.P0();
        this.I.a0(true);
        this.o = 7;
        this.T = false;
        this.H0();
        if (this.T) {
            final androidx.lifecycle.i g0 = this.g0;
            final d.b on_RESUME = d.b.ON_RESUME;
            g0.h(on_RESUME);
            if (this.V != null) {
                this.h0.a(on_RESUME);
            }
            this.I.Q();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new D(sb.toString());
    }
    
    public void h(final String str, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.K));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.L));
        printWriter.print(" mTag=");
        printWriter.println(this.M);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.o);
        printWriter.print(" mWho=");
        printWriter.print(this.t);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.z);
        printWriter.print(" mRemoving=");
        printWriter.print(this.A);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.B);
        printWriter.print(" mInLayout=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.N);
        printWriter.print(" mDetached=");
        printWriter.print(this.O);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.S);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.R);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.P);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.X);
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.H);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.J);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.u);
        }
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.p);
        }
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.q);
        }
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.r);
        }
        final Fragment q = this.Q();
        if (q != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(q);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.x);
        }
        if (this.C() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.C());
        }
        if (this.U != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.U);
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.V);
        }
        if (this.q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.q());
        }
        if (this.t() != null) {
            a.b(this).a(str, fileDescriptor, printWriter, array);
        }
        printWriter.print(str);
        final StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.I);
        sb.append(":");
        printWriter.println(sb.toString());
        final n i = this.I;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        i.W(sb2.toString(), fileDescriptor, printWriter, array);
    }
    
    public void h0(final int i, final int j, final Intent obj) {
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(j);
            sb.append(" data: ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public void h1(final Bundle bundle) {
        this.I0(bundle);
        this.j0.d(bundle);
        final Parcelable e1 = this.I.e1();
        if (e1 != null) {
            bundle.putParcelable("android:support:fragments", e1);
        }
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    public final h i() {
        if (this.Y == null) {
            this.Y = new h();
        }
        return this.Y;
    }
    
    public void i0(final Activity activity) {
        this.T = true;
    }
    
    public void i1() {
        this.I.P0();
        this.I.a0(true);
        this.o = 5;
        this.T = false;
        this.J0();
        if (this.T) {
            final androidx.lifecycle.i g0 = this.g0;
            final d.b on_START = d.b.ON_START;
            g0.h(on_START);
            if (this.V != null) {
                this.h0.a(on_START);
            }
            this.I.R();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new D(sb.toString());
    }
    
    public void j0(final Context context) {
        this.T = true;
        final androidx.fragment.app.k h = this.H;
        Activity h2;
        if (h == null) {
            h2 = null;
        }
        else {
            h2 = h.h();
        }
        if (h2 != null) {
            this.T = false;
            this.i0(h2);
        }
    }
    
    public void j1() {
        this.I.T();
        if (this.V != null) {
            this.h0.a(d.b.ON_STOP);
        }
        this.g0.h(d.b.ON_STOP);
        this.o = 4;
        this.T = false;
        this.K0();
        if (this.T) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStop()");
        throw new D(sb.toString());
    }
    
    public final SavedStateRegistry k() {
        return this.j0.b();
    }
    
    public void k0(final Fragment fragment) {
    }
    
    public void k1() {
        this.L0(this.V, this.p);
        this.I.U();
    }
    
    public Fragment l(final String s) {
        if (s.equals(this.t)) {
            return this;
        }
        return this.I.i0(s);
    }
    
    public boolean l0(final MenuItem menuItem) {
        return false;
    }
    
    public final androidx.activity.result.c l1(final d.a a, final o.a a2, final androidx.activity.result.b b) {
        if (this.o <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            this.n1((j)new j() {
                @Override
                public void a() {
                    atomicReference.set(((ActivityResultRegistry)a2.apply(null)).i(Fragment.this.m(), Fragment.this, a, b));
                }
            });
            return new androidx.activity.result.c() {
                @Override
                public void b(final Object o, final w.b b) {
                    final androidx.activity.result.c c = atomicReference.get();
                    if (c != null) {
                        c.b(o, b);
                        return;
                    }
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                
                @Override
                public void c() {
                    final androidx.activity.result.c c = atomicReference.getAndSet(null);
                    if (c != null) {
                        c.c();
                    }
                }
            };
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(sb.toString());
    }
    
    public String m() {
        final StringBuilder sb = new StringBuilder();
        sb.append("fragment_");
        sb.append(this.t);
        sb.append("_rq#");
        sb.append(this.l0.getAndIncrement());
        return sb.toString();
    }
    
    public void m0(final Bundle bundle) {
        this.T = true;
        this.r1(bundle);
        if (!this.I.H0(1)) {
            this.I.C();
        }
    }
    
    public final androidx.activity.result.c m1(final d.a a, final androidx.activity.result.b b) {
        return this.l1(a, new o.a() {
            public ActivityResultRegistry a(final Void void1) {
                final Fragment a = Fragment.this;
                final androidx.fragment.app.k h = a.H;
                if (h instanceof androidx.activity.result.d) {
                    return ((androidx.activity.result.d)h).c();
                }
                return a.o1().c();
            }
        }, b);
    }
    
    public final e n() {
        final androidx.fragment.app.k h = this.H;
        if (h == null) {
            return null;
        }
        return (e)h.h();
    }
    
    public Animation n0(final int n, final boolean b, final int n2) {
        return null;
    }
    
    public final void n1(final j e) {
        if (this.o >= 0) {
            e.a();
            return;
        }
        this.m0.add(e);
    }
    
    public boolean o() {
        final h y = this.Y;
        if (y != null) {
            final Boolean n = y.n;
            if (n != null) {
                return n;
            }
        }
        return true;
    }
    
    public Animator o0(final int n, final boolean b, final int n2) {
        return null;
    }
    
    public final e o1() {
        final e n = this.n();
        if (n != null) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.T = true;
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.o1().onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public void onLowMemory() {
        this.T = true;
    }
    
    public boolean p() {
        final h y = this.Y;
        if (y != null) {
            final Boolean m = y.m;
            if (m != null) {
                return m;
            }
        }
        return true;
    }
    
    public void p0(final Menu menu, final MenuInflater menuInflater) {
    }
    
    public final Context p1() {
        final Context t = this.t();
        if (t != null) {
            return t;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }
    
    public View q() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        return y.a;
    }
    
    public View q0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final int k0 = this.k0;
        if (k0 != 0) {
            return layoutInflater.inflate(k0, viewGroup, false);
        }
        return null;
    }
    
    public final View q1() {
        final View r = this.R();
        if (r != null) {
            return r;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }
    
    public Animator r() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        return y.b;
    }
    
    public void r0() {
        this.T = true;
    }
    
    public void r1(final Bundle bundle) {
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.I.c1(parcelable);
                this.I.C();
            }
        }
    }
    
    public final n s() {
        if (this.H != null) {
            return this.I;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }
    
    public void s0() {
    }
    
    public final void s1() {
        if (n.D0(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        if (this.V != null) {
            this.t1(this.p);
        }
        this.p = null;
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        this.F1(intent, n, null);
    }
    
    public Context t() {
        final androidx.fragment.app.k h = this.H;
        if (h == null) {
            return null;
        }
        return h.i();
    }
    
    public void t0() {
        this.T = true;
    }
    
    public final void t1(final Bundle bundle) {
        final SparseArray q = this.q;
        if (q != null) {
            this.V.restoreHierarchyState(q);
            this.q = null;
        }
        if (this.V != null) {
            this.h0.d(this.r);
            this.r = null;
        }
        this.T = false;
        this.M0(bundle);
        if (this.T) {
            if (this.V != null) {
                this.h0.a(d.b.ON_CREATE);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onViewStateRestored()");
        throw new D(sb.toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.t);
        sb.append(")");
        if (this.K != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.K));
        }
        if (this.M != null) {
            sb.append(" ");
            sb.append(this.M);
        }
        sb.append('}');
        return sb.toString();
    }
    
    public Object u() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        return y.g;
    }
    
    public void u0() {
        this.T = true;
    }
    
    public void u1(final View a) {
        this.i().a = a;
    }
    
    public m v() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        y.getClass();
        return null;
    }
    
    public LayoutInflater v0(final Bundle bundle) {
        return this.A(bundle);
    }
    
    public void v1(final Animator b) {
        this.i().b = b;
    }
    
    public Object w() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        return y.i;
    }
    
    public void w0(final boolean b) {
    }
    
    public void w1(final Bundle u) {
        if (this.G != null && this.e0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.u = u;
    }
    
    public m x() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        y.getClass();
        return null;
    }
    
    public void x0(final Activity activity, final AttributeSet set, final Bundle bundle) {
        this.T = true;
    }
    
    public void x1(final View p) {
        this.i().p = p;
    }
    
    public View y() {
        final h y = this.Y;
        if (y == null) {
            return null;
        }
        return y.p;
    }
    
    public void y0(final Context context, final AttributeSet set, final Bundle bundle) {
        this.T = true;
        final androidx.fragment.app.k h = this.H;
        Activity h2;
        if (h == null) {
            h2 = null;
        }
        else {
            h2 = h.h();
        }
        if (h2 != null) {
            this.T = false;
            this.x0(h2, set, bundle);
        }
    }
    
    public void y1(final boolean s) {
        this.i().s = s;
    }
    
    public final Object z() {
        final androidx.fragment.app.k h = this.H;
        if (h == null) {
            return null;
        }
        return h.m();
    }
    
    public void z0(final boolean b) {
    }
    
    public void z1(final int c) {
        if (this.Y == null && c == 0) {
            return;
        }
        this.i().c = c;
    }
    
    public static class h
    {
        public View a;
        public Animator b;
        public int c;
        public int d;
        public ArrayList e;
        public ArrayList f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Boolean m;
        public Boolean n;
        public float o;
        public View p;
        public boolean q;
        public k r;
        public boolean s;
        
        public h() {
            this.g = null;
            final Object n0 = Fragment.n0;
            this.h = n0;
            this.i = null;
            this.j = n0;
            this.k = null;
            this.l = n0;
            this.o = 1.0f;
            this.p = null;
        }
    }
    
    public static class i extends RuntimeException
    {
        public i(final String message, final Exception cause) {
            super(message, cause);
        }
    }
    
    public abstract static class j
    {
        public abstract void a();
    }
    
    public interface k
    {
        void a();
        
        void b();
    }
}
