/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.app.Activity
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.UUID
 *  java.util.concurrent.atomic.AtomicInteger
 *  java.util.concurrent.atomic.AtomicReference
 */
package androidx.fragment.app;

import Y.a;
import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.fragment.app.B;
import androidx.fragment.app.D;
import androidx.fragment.app.e;
import androidx.fragment.app.g;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import androidx.fragment.app.z;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;
import androidx.savedstate.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import w.m;

public abstract class Fragment
implements ComponentCallbacks,
View.OnCreateContextMenuListener,
androidx.lifecycle.h,
u,
c {
    public static final Object n0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public n G;
    public androidx.fragment.app.k H;
    public n I = new o();
    public Fragment J;
    public int K;
    public int L;
    public String M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S = true;
    public boolean T;
    public ViewGroup U;
    public View V;
    public boolean W;
    public boolean X = true;
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
    public int o = -1;
    public Bundle p;
    public SparseArray q;
    public Bundle r;
    public Boolean s;
    public String t = UUID.randomUUID().toString();
    public Bundle u;
    public Fragment v;
    public String w = null;
    public int x;
    public Boolean y = null;
    public boolean z;

    public Fragment() {
        this.Z = new Runnable(){

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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Fragment V(Context object, String string2, Bundle bundle) {
        InstantiationException instantiationException2;
        block9 : {
            IllegalAccessException illegalAccessException2;
            block8 : {
                NoSuchMethodException noSuchMethodException2;
                block7 : {
                    InvocationTargetException invocationTargetException2;
                    object = (Fragment)androidx.fragment.app.j.d(object.getClassLoader(), string2).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (bundle == null) return object;
                    try {
                        bundle.setClassLoader(object.getClass().getClassLoader());
                        object.w1(bundle);
                        return object;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block7;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block8;
                    }
                    catch (InstantiationException instantiationException2) {
                        break block9;
                    }
                    bundle = new StringBuilder();
                    bundle.append("Unable to instantiate fragment ");
                    bundle.append(string2);
                    bundle.append(": calling Fragment constructor caused an exception");
                    throw new i(bundle.toString(), (Exception)invocationTargetException2);
                }
                bundle = new StringBuilder();
                bundle.append("Unable to instantiate fragment ");
                bundle.append(string2);
                bundle.append(": could not find Fragment constructor");
                throw new i(bundle.toString(), (Exception)noSuchMethodException2);
            }
            bundle = new StringBuilder();
            bundle.append("Unable to instantiate fragment ");
            bundle.append(string2);
            bundle.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new i(bundle.toString(), (Exception)illegalAccessException2);
        }
        bundle = new StringBuilder();
        bundle.append("Unable to instantiate fragment ");
        bundle.append(string2);
        bundle.append(": make sure class name exists, is public, and has an empty constructor that is public");
        throw new i(bundle.toString(), (Exception)instantiationException2);
    }

    public LayoutInflater A(Bundle object) {
        object = this.H;
        if (object != null) {
            object = object.n();
            I.g.a((LayoutInflater)object, this.I.t0());
            return object;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public boolean A0(MenuItem menuItem) {
        return false;
    }

    public void A1(int n8) {
        if (this.Y == null && n8 == 0) {
            return;
        }
        this.i();
        this.Y.d = n8;
    }

    public final int B() {
        d.c c8 = this.f0;
        if (c8 != d.c.p && this.J != null) {
            return Math.min((int)c8.ordinal(), (int)this.J.B());
        }
        return c8.ordinal();
    }

    public void B0(Menu menu) {
    }

    public void B1(k k8) {
        this.i();
        h h8 = this.Y;
        k k9 = h8.r;
        if (k8 == k9) {
            return;
        }
        if (k8 != null && k9 != null) {
            k8 = new StringBuilder();
            k8.append("Trying to set a replacement startPostponedEnterTransition on ");
            k8.append((Object)this);
            throw new IllegalStateException(k8.toString());
        }
        if (h8.q) {
            h8.r = k8;
        }
        if (k8 != null) {
            k8.b();
        }
    }

    public int C() {
        h h8 = this.Y;
        if (h8 == null) {
            return 0;
        }
        return h8.c;
    }

    public void C0() {
        this.T = true;
    }

    public void C1(float f8) {
        this.i().o = f8;
    }

    public int D() {
        h h8 = this.Y;
        if (h8 == null) {
            return 0;
        }
        return h8.d;
    }

    public void D0(boolean bl) {
    }

    public void D1(boolean bl) {
        this.P = bl;
        n n8 = this.G;
        if (n8 != null) {
            if (bl) {
                n8.i(this);
                return;
            }
            n8.a1(this);
            return;
        }
        this.Q = true;
    }

    public final Fragment E() {
        return this.J;
    }

    public void E0(Menu menu) {
    }

    public void E1(ArrayList arrayList, ArrayList arrayList2) {
        this.i();
        h h8 = this.Y;
        h8.e = arrayList;
        h8.f = arrayList2;
    }

    public final n F() {
        n n8 = this.G;
        if (n8 != null) {
            return n8;
        }
        n8 = new StringBuilder();
        n8.append("Fragment ");
        n8.append((Object)this);
        n8.append(" not associated with a fragment manager.");
        throw new IllegalStateException(n8.toString());
    }

    public void F0(boolean bl) {
    }

    public void F1(Intent intent, int n8, Bundle bundle) {
        if (this.H != null) {
            this.F().J0(this, intent, n8, bundle);
            return;
        }
        intent = new StringBuilder();
        intent.append("Fragment ");
        intent.append((Object)this);
        intent.append(" not attached to Activity");
        throw new IllegalStateException(intent.toString());
    }

    public float G() {
        h h8 = this.Y;
        if (h8 == null) {
            return 1.0f;
        }
        return h8.o;
    }

    public void G0(int n8, String[] arrstring, int[] arrn) {
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
                this.H.l().postAtFrontOfQueue(new Runnable(){

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
        Object object;
        Object object2 = this.Y;
        if (object2 == null) {
            return null;
        }
        object2 = object = object2.j;
        if (object == n0) {
            object2 = this.w();
        }
        return object2;
    }

    public void H0() {
        this.T = true;
    }

    public final Resources I() {
        return this.p1().getResources();
    }

    public void I0(Bundle bundle) {
    }

    public final boolean J() {
        return this.P;
    }

    public void J0() {
        this.T = true;
    }

    public Object K() {
        Object object;
        Object object2 = this.Y;
        if (object2 == null) {
            return null;
        }
        object2 = object = object2.h;
        if (object == n0) {
            object2 = this.u();
        }
        return object2;
    }

    public void K0() {
        this.T = true;
    }

    public Object L() {
        h h8 = this.Y;
        if (h8 == null) {
            return null;
        }
        return h8.k;
    }

    public void L0(View view, Bundle bundle) {
    }

    public Object M() {
        Object object;
        Object object2 = this.Y;
        if (object2 == null) {
            return null;
        }
        object2 = object = object2.l;
        if (object == n0) {
            object2 = this.L();
        }
        return object2;
    }

    public void M0(Bundle bundle) {
        this.T = true;
    }

    public ArrayList N() {
        h h8 = this.Y;
        if (h8 != null && (h8 = h8.e) != null) {
            return h8;
        }
        return new ArrayList();
    }

    public void N0(Bundle bundle) {
        this.I.P0();
        this.o = 3;
        this.T = false;
        this.g0(bundle);
        if (this.T) {
            this.s1();
            this.I.y();
            return;
        }
        bundle = new StringBuilder();
        bundle.append("Fragment ");
        bundle.append((Object)this);
        bundle.append(" did not call through to super.onActivityCreated()");
        throw new D(bundle.toString());
    }

    public ArrayList O() {
        h h8 = this.Y;
        if (h8 != null && (h8 = h8.f) != null) {
            return h8;
        }
        return new ArrayList();
    }

    public void O0() {
        Iterator iterator = this.m0.iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).a();
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
        iterator = new StringBuilder();
        iterator.append("Fragment ");
        iterator.append((Object)this);
        iterator.append(" did not call through to super.onAttach()");
        throw new D(iterator.toString());
    }

    public final String P(int n8) {
        return this.I().getString(n8);
    }

    public void P0(Configuration configuration) {
        this.onConfigurationChanged(configuration);
        this.I.A(configuration);
    }

    public final Fragment Q() {
        String string2;
        Object object = this.v;
        if (object != null) {
            return object;
        }
        object = this.G;
        if (object != null && (string2 = this.w) != null) {
            return object.f0(string2);
        }
        return null;
    }

    public boolean Q0(MenuItem menuItem) {
        if (!this.N) {
            if (this.l0(menuItem)) {
                return true;
            }
            return this.I.B(menuItem);
        }
        return false;
    }

    public View R() {
        return this.V;
    }

    public void R0(Bundle bundle) {
        this.I.P0();
        this.o = 1;
        this.T = false;
        this.g0.a(new f(){

            @Override
            public void a(androidx.lifecycle.h h8, d.b b8) {
                if (b8 == d.b.ON_STOP && (h8 = Fragment.this.V) != null) {
                    h8.cancelPendingInputEvents();
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
        bundle = new StringBuilder();
        bundle.append("Fragment ");
        bundle.append((Object)this);
        bundle.append(" did not call through to super.onCreate()");
        throw new D(bundle.toString());
    }

    public LiveData S() {
        return this.i0;
    }

    public boolean S0(Menu menu, MenuInflater menuInflater) {
        boolean bl = this.N;
        boolean bl2 = false;
        boolean bl3 = false;
        if (!bl) {
            boolean bl4 = bl3;
            if (this.R) {
                bl4 = bl3;
                if (this.S) {
                    this.p0(menu, menuInflater);
                    bl4 = true;
                }
            }
            bl2 = bl4 | this.I.D(menu, menuInflater);
        }
        return bl2;
    }

    public final void T() {
        this.g0 = new androidx.lifecycle.i(this);
        this.j0 = b.a(this);
    }

    public void T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.I.P0();
        this.E = true;
        this.h0 = new z();
        layoutInflater = this.q0(layoutInflater, viewGroup, bundle);
        this.V = layoutInflater;
        if (layoutInflater != null) {
            this.h0.b();
            v.a(this.V, this.h0);
            w.a(this.V, this);
            d.a(this.V, this.h0);
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onDestroy()");
        throw new D(stringBuilder.toString());
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onDestroyView()");
        throw new D(stringBuilder.toString());
    }

    public final boolean W() {
        if (this.H != null && this.z) {
            return true;
        }
        return false;
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onDetach()");
        throw new D(stringBuilder.toString());
    }

    public boolean X() {
        h h8 = this.Y;
        if (h8 == null) {
            return false;
        }
        return h8.s;
    }

    public LayoutInflater X0(Bundle bundle) {
        bundle = this.v0(bundle);
        this.d0 = bundle;
        return bundle;
    }

    public final boolean Y() {
        if (this.F > 0) {
            return true;
        }
        return false;
    }

    public void Y0() {
        this.onLowMemory();
        this.I.G();
    }

    public final boolean Z() {
        n n8;
        if (this.S && ((n8 = this.G) == null || n8.F0(this.J))) {
            return true;
        }
        return false;
    }

    public void Z0(boolean bl) {
        this.z0(bl);
        this.I.H(bl);
    }

    public boolean a0() {
        h h8 = this.Y;
        if (h8 == null) {
            return false;
        }
        return h8.q;
    }

    public boolean a1(MenuItem menuItem) {
        if (!this.N) {
            if (this.R && this.S && this.A0(menuItem)) {
                return true;
            }
            return this.I.J(menuItem);
        }
        return false;
    }

    public final boolean b0() {
        return this.A;
    }

    public void b1(Menu menu) {
        if (!this.N) {
            if (this.R && this.S) {
                this.B0(menu);
            }
            this.I.K(menu);
        }
    }

    public final boolean c0() {
        Fragment fragment = this.E();
        if (fragment != null && (fragment.b0() || fragment.c0())) {
            return true;
        }
        return false;
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onPause()");
        throw new D(stringBuilder.toString());
    }

    @Override
    public t d() {
        if (this.G != null) {
            if (this.B() != d.c.p.ordinal()) {
                return this.G.z0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean d0() {
        if (this.o >= 7) {
            return true;
        }
        return false;
    }

    public void d1(boolean bl) {
        this.D0(bl);
        this.I.N(bl);
    }

    public void e(boolean bl) {
        Object object = this.Y;
        Object object2 = null;
        if (object != null) {
            object.q = false;
            object2 = object.r;
            object.r = null;
        }
        if (object2 != null) {
            object2.a();
            return;
        }
        if (n.P && this.V != null && (object2 = this.U) != null && (object = this.G) != null) {
            object2 = B.n((ViewGroup)object2, (n)object);
            object2.p();
            if (bl) {
                this.H.l().post(new Runnable((B)object2){
                    public final /* synthetic */ B o;
                    {
                        this.o = b8;
                    }

                    public void run() {
                        this.o.g();
                    }
                });
                return;
            }
            object2.g();
        }
    }

    public final boolean e0() {
        n n8 = this.G;
        if (n8 == null) {
            return false;
        }
        return n8.I0();
    }

    public boolean e1(Menu menu) {
        boolean bl = this.N;
        boolean bl2 = false;
        boolean bl3 = false;
        if (!bl) {
            boolean bl4 = bl3;
            if (this.R) {
                bl4 = bl3;
                if (this.S) {
                    this.E0(menu);
                    bl4 = true;
                }
            }
            bl2 = bl4 | this.I.O(menu);
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public g f() {
        return new g(){

            @Override
            public View e(int n8) {
                View view = Fragment.this.V;
                if (view != null) {
                    return view.findViewById(n8);
                }
                view = new StringBuilder();
                view.append("Fragment ");
                view.append((Object)Fragment.this);
                view.append(" does not have a view");
                throw new IllegalStateException(view.toString());
            }

            @Override
            public boolean f() {
                if (Fragment.this.V != null) {
                    return true;
                }
                return false;
            }
        };
    }

    public void f0() {
        this.I.P0();
    }

    public void f1() {
        boolean bl = this.G.G0(this);
        Boolean bl2 = this.y;
        if (bl2 == null || bl2 != bl) {
            this.y = bl;
            this.F0(bl);
            this.I.P();
        }
    }

    @Override
    public androidx.lifecycle.d g() {
        return this.g0;
    }

    public void g0(Bundle bundle) {
        this.T = true;
    }

    public void g1() {
        this.I.P0();
        this.I.a0(true);
        this.o = 7;
        this.T = false;
        this.H0();
        if (this.T) {
            androidx.lifecycle.i i8 = this.g0;
            d.b b8 = d.b.ON_RESUME;
            i8.h(b8);
            if (this.V != null) {
                this.h0.a(b8);
            }
            this.I.Q();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new D(stringBuilder.toString());
    }

    public void h(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        Object object;
        printWriter.print(string2);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString((int)this.K));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString((int)this.L));
        printWriter.print(" mTag=");
        printWriter.println(this.M);
        printWriter.print(string2);
        printWriter.print("mState=");
        printWriter.print(this.o);
        printWriter.print(" mWho=");
        printWriter.print(this.t);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.F);
        printWriter.print(string2);
        printWriter.print("mAdded=");
        printWriter.print(this.z);
        printWriter.print(" mRemoving=");
        printWriter.print(this.A);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.B);
        printWriter.print(" mInLayout=");
        printWriter.println(this.C);
        printWriter.print(string2);
        printWriter.print("mHidden=");
        printWriter.print(this.N);
        printWriter.print(" mDetached=");
        printWriter.print(this.O);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.S);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.R);
        printWriter.print(string2);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.P);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.X);
        if (this.G != null) {
            printWriter.print(string2);
            printWriter.print("mFragmentManager=");
            printWriter.println((Object)this.G);
        }
        if (this.H != null) {
            printWriter.print(string2);
            printWriter.print("mHost=");
            printWriter.println((Object)this.H);
        }
        if (this.J != null) {
            printWriter.print(string2);
            printWriter.print("mParentFragment=");
            printWriter.println((Object)this.J);
        }
        if (this.u != null) {
            printWriter.print(string2);
            printWriter.print("mArguments=");
            printWriter.println((Object)this.u);
        }
        if (this.p != null) {
            printWriter.print(string2);
            printWriter.print("mSavedFragmentState=");
            printWriter.println((Object)this.p);
        }
        if (this.q != null) {
            printWriter.print(string2);
            printWriter.print("mSavedViewState=");
            printWriter.println((Object)this.q);
        }
        if (this.r != null) {
            printWriter.print(string2);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println((Object)this.r);
        }
        if ((object = this.Q()) != null) {
            printWriter.print(string2);
            printWriter.print("mTarget=");
            printWriter.print(object);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.x);
        }
        if (this.C() != 0) {
            printWriter.print(string2);
            printWriter.print("mNextAnim=");
            printWriter.println(this.C());
        }
        if (this.U != null) {
            printWriter.print(string2);
            printWriter.print("mContainer=");
            printWriter.println((Object)this.U);
        }
        if (this.V != null) {
            printWriter.print(string2);
            printWriter.print("mView=");
            printWriter.println((Object)this.V);
        }
        if (this.q() != null) {
            printWriter.print(string2);
            printWriter.print("mAnimatingAway=");
            printWriter.println((Object)this.q());
        }
        if (this.t() != null) {
            a.b(this).a(string2, fileDescriptor, printWriter, arrstring);
        }
        printWriter.print(string2);
        object = new StringBuilder();
        object.append("Child ");
        object.append((Object)this.I);
        object.append(":");
        printWriter.println(object.toString());
        object = this.I;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("  ");
        object.W(stringBuilder.toString(), fileDescriptor, printWriter, arrstring);
    }

    public void h0(int n8, int n9, Intent intent) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append((Object)this);
            stringBuilder.append(" received the following in onActivityResult(): requestCode: ");
            stringBuilder.append(n8);
            stringBuilder.append(" resultCode: ");
            stringBuilder.append(n9);
            stringBuilder.append(" data: ");
            stringBuilder.append((Object)intent);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    public void h1(Bundle bundle) {
        this.I0(bundle);
        this.j0.d(bundle);
        Parcelable parcelable = this.I.e1();
        if (parcelable != null) {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final h i() {
        if (this.Y == null) {
            this.Y = new h();
        }
        return this.Y;
    }

    public void i0(Activity activity) {
        this.T = true;
    }

    public void i1() {
        this.I.P0();
        this.I.a0(true);
        this.o = 5;
        this.T = false;
        this.J0();
        if (this.T) {
            androidx.lifecycle.i i8 = this.g0;
            d.b b8 = d.b.ON_START;
            i8.h(b8);
            if (this.V != null) {
                this.h0.a(b8);
            }
            this.I.R();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new D(stringBuilder.toString());
    }

    public void j0(Context object) {
        this.T = true;
        object = this.H;
        object = object == null ? null : object.h();
        if (object != null) {
            this.T = false;
            this.i0((Activity)object);
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onStop()");
        throw new D(stringBuilder.toString());
    }

    @Override
    public final SavedStateRegistry k() {
        return this.j0.b();
    }

    public void k0(Fragment fragment) {
    }

    public void k1() {
        this.L0(this.V, this.p);
        this.I.U();
    }

    public Fragment l(String string2) {
        if (string2.equals((Object)this.t)) {
            return this;
        }
        return this.I.i0(string2);
    }

    public boolean l0(MenuItem menuItem) {
        return false;
    }

    public final androidx.activity.result.c l1(final d.a a8, final o.a a9, final androidx.activity.result.b b8) {
        if (this.o <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            this.n1(new j(){

                @Override
                public void a() {
                    String string2 = Fragment.this.m();
                    ActivityResultRegistry activityResultRegistry = (ActivityResultRegistry)a9.apply(null);
                    atomicReference.set((Object)activityResultRegistry.i(string2, Fragment.this, a8, b8));
                }
            });
            return new androidx.activity.result.c(){

                @Override
                public void b(Object object, w.b b8) {
                    androidx.activity.result.c c8 = (androidx.activity.result.c)atomicReference.get();
                    if (c8 != null) {
                        c8.b(object, b8);
                        return;
                    }
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }

                @Override
                public void c() {
                    androidx.activity.result.c c8 = (androidx.activity.result.c)atomicReference.getAndSet((Object)null);
                    if (c8 != null) {
                        c8.c();
                    }
                }
            };
        }
        a8 = new StringBuilder();
        a8.append("Fragment ");
        a8.append((Object)this);
        a8.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(a8.toString());
    }

    public String m() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fragment_");
        stringBuilder.append(this.t);
        stringBuilder.append("_rq#");
        stringBuilder.append(this.l0.getAndIncrement());
        return stringBuilder.toString();
    }

    public void m0(Bundle bundle) {
        this.T = true;
        this.r1(bundle);
        if (!this.I.H0(1)) {
            this.I.C();
        }
    }

    public final androidx.activity.result.c m1(d.a a8, androidx.activity.result.b b8) {
        return this.l1(a8, new o.a(){

            public ActivityResultRegistry a(Void object) {
                object = Fragment.this;
                androidx.fragment.app.k k8 = object.H;
                if (k8 instanceof androidx.activity.result.d) {
                    return ((androidx.activity.result.d)((Object)k8)).c();
                }
                return object.o1().c();
            }
        }, b8);
    }

    public final e n() {
        androidx.fragment.app.k k8 = this.H;
        if (k8 == null) {
            return null;
        }
        return (e)k8.h();
    }

    public Animation n0(int n8, boolean bl, int n9) {
        return null;
    }

    public final void n1(j j8) {
        if (this.o >= 0) {
            j8.a();
            return;
        }
        this.m0.add((Object)j8);
    }

    public boolean o() {
        h h8 = this.Y;
        if (h8 != null && (h8 = h8.n) != null) {
            return h8.booleanValue();
        }
        return true;
    }

    public Animator o0(int n8, boolean bl, int n9) {
        return null;
    }

    public final e o1() {
        e e8 = this.n();
        if (e8 != null) {
            return e8;
        }
        e8 = new StringBuilder();
        e8.append("Fragment ");
        e8.append((Object)this);
        e8.append(" not attached to an activity.");
        throw new IllegalStateException(e8.toString());
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.T = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.o1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.T = true;
    }

    public boolean p() {
        h h8 = this.Y;
        if (h8 != null && (h8 = h8.m) != null) {
            return h8.booleanValue();
        }
        return true;
    }

    public void p0(Menu menu, MenuInflater menuInflater) {
    }

    public final Context p1() {
        Context context = this.t();
        if (context != null) {
            return context;
        }
        context = new StringBuilder();
        context.append("Fragment ");
        context.append((Object)this);
        context.append(" not attached to a context.");
        throw new IllegalStateException(context.toString());
    }

    public View q() {
        h h8 = this.Y;
        if (h8 == null) {
            return null;
        }
        return h8.a;
    }

    public View q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n8 = this.k0;
        if (n8 != 0) {
            return layoutInflater.inflate(n8, viewGroup, false);
        }
        return null;
    }

    public final View q1() {
        View view = this.R();
        if (view != null) {
            return view;
        }
        view = new StringBuilder();
        view.append("Fragment ");
        view.append((Object)this);
        view.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(view.toString());
    }

    public Animator r() {
        h h8 = this.Y;
        if (h8 == null) {
            return null;
        }
        return h8.b;
    }

    public void r0() {
        this.T = true;
    }

    public void r1(Bundle bundle) {
        if (bundle != null && (bundle = bundle.getParcelable("android:support:fragments")) != null) {
            this.I.c1((Parcelable)bundle);
            this.I.C();
        }
    }

    public final n s() {
        if (this.H != null) {
            return this.I;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" has not been attached yet.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void s0() {
    }

    public final void s1() {
        if (n.D0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("moveto RESTORE_VIEW_STATE: ");
            stringBuilder.append((Object)this);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (this.V != null) {
            this.t1(this.p);
        }
        this.p = null;
    }

    public void startActivityForResult(Intent intent, int n8) {
        this.F1(intent, n8, null);
    }

    public Context t() {
        androidx.fragment.app.k k8 = this.H;
        if (k8 == null) {
            return null;
        }
        return k8.i();
    }

    public void t0() {
        this.T = true;
    }

    public final void t1(Bundle bundle) {
        SparseArray sparseArray = this.q;
        if (sparseArray != null) {
            this.V.restoreHierarchyState(sparseArray);
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
        bundle = new StringBuilder();
        bundle.append("Fragment ");
        bundle.append((Object)this);
        bundle.append(" did not call through to super.onViewStateRestored()");
        throw new D(bundle.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append("}");
        stringBuilder.append(" (");
        stringBuilder.append(this.t);
        stringBuilder.append(")");
        if (this.K != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString((int)this.K));
        }
        if (this.M != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.M);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public Object u() {
        h h8 = this.Y;
        if (h8 == null) {
            return null;
        }
        return h8.g;
    }

    public void u0() {
        this.T = true;
    }

    public void u1(View view) {
        this.i().a = view;
    }

    public m v() {
        h h8 = this.Y;
        if (h8 == null) {
            return null;
        }
        h8.getClass();
        return null;
    }

    public LayoutInflater v0(Bundle bundle) {
        return this.A(bundle);
    }

    public void v1(Animator animator) {
        this.i().b = animator;
    }

    public Object w() {
        h h8 = this.Y;
        if (h8 == null) {
            return null;
        }
        return h8.i;
    }

    public void w0(boolean bl) {
    }

    public void w1(Bundle bundle) {
        if (this.G != null && this.e0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.u = bundle;
    }

    public m x() {
        h h8 = this.Y;
        if (h8 == null) {
            return null;
        }
        h8.getClass();
        return null;
    }

    public void x0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.T = true;
    }

    public void x1(View view) {
        this.i().p = view;
    }

    public View y() {
        h h8 = this.Y;
        if (h8 == null) {
            return null;
        }
        return h8.p;
    }

    public void y0(Context object, AttributeSet attributeSet, Bundle bundle) {
        this.T = true;
        object = this.H;
        object = object == null ? null : object.h();
        if (object != null) {
            this.T = false;
            this.x0((Activity)object, attributeSet, bundle);
        }
    }

    public void y1(boolean bl) {
        this.i().s = bl;
    }

    public final Object z() {
        androidx.fragment.app.k k8 = this.H;
        if (k8 == null) {
            return null;
        }
        return k8.m();
    }

    public void z0(boolean bl) {
    }

    public void z1(int n8) {
        if (this.Y == null && n8 == 0) {
            return;
        }
        this.i().c = n8;
    }

    public static class h {
        public View a;
        public Animator b;
        public int c;
        public int d;
        public ArrayList e;
        public ArrayList f;
        public Object g = null;
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
            Object object;
            this.h = object = Fragment.n0;
            this.i = null;
            this.j = object;
            this.k = null;
            this.l = object;
            this.o = 1.0f;
            this.p = null;
        }
    }

    public static class i
    extends RuntimeException {
        public i(String string2, Exception exception) {
            super(string2, (Throwable)exception);
        }
    }

    public static abstract class j {
        public j() {
        }

        public /* synthetic */ j( a8) {
            this();
        }

        public abstract void a();
    }

    public static interface k {
        public void a();

        public void b();
    }

}

