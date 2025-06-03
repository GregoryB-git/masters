/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.atomic.AtomicInteger
 */
package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.e;
import androidx.fragment.app.A;
import androidx.fragment.app.B;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import androidx.fragment.app.j;
import androidx.fragment.app.q;
import androidx.fragment.app.r;
import androidx.fragment.app.s;
import androidx.fragment.app.t;
import androidx.fragment.app.u;
import androidx.fragment.app.v;
import androidx.fragment.app.w;
import androidx.fragment.app.z;
import androidx.lifecycle.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class n {
    public static boolean O = false;
    public static boolean P = true;
    public androidx.activity.result.c A;
    public androidx.activity.result.c B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public q M;
    public Runnable N;
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final u c = new u();
    public ArrayList d;
    public ArrayList e;
    public final androidx.fragment.app.l f;
    public OnBackPressedDispatcher g;
    public final androidx.activity.b h;
    public final AtomicInteger i;
    public final Map j;
    public final Map k;
    public ArrayList l;
    public Map m;
    public final w.g n;
    public final androidx.fragment.app.m o;
    public final CopyOnWriteArrayList p;
    public int q;
    public androidx.fragment.app.k r;
    public g s;
    public Fragment t;
    public Fragment u;
    public j v;
    public j w;
    public C x;
    public C y;
    public androidx.activity.result.c z;

    public n() {
        this.f = new androidx.fragment.app.l(this);
        this.h = new androidx.activity.b(false){

            @Override
            public void b() {
                n.this.A0();
            }
        };
        this.i = new AtomicInteger();
        this.j = Collections.synchronizedMap((Map)new HashMap());
        this.k = Collections.synchronizedMap((Map)new HashMap());
        this.m = Collections.synchronizedMap((Map)new HashMap());
        this.n = new w.g(){

            @Override
            public void a(Fragment fragment, E.c c8) {
                if (!c8.b()) {
                    n.this.X0(fragment, c8);
                }
            }

            @Override
            public void b(Fragment fragment, E.c c8) {
                n.this.f(fragment, c8);
            }
        };
        this.o = new androidx.fragment.app.m(this);
        this.p = new CopyOnWriteArrayList();
        this.q = -1;
        this.v = null;
        this.w = new j(){

            @Override
            public Fragment a(ClassLoader classLoader, String string2) {
                return n.this.s0().b(n.this.s0().i(), string2, null);
            }
        };
        this.x = null;
        this.y = new C(){

            @Override
            public B a(ViewGroup viewGroup) {
                return new c(viewGroup);
            }
        };
        this.C = new ArrayDeque();
        this.N = new Runnable(){

            public void run() {
                n.this.a0(true);
            }
        };
    }

    public static boolean D0(int n8) {
        if (!O && !Log.isLoggable((String)"FragmentManager", (int)n8)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Map a(n n8) {
        return n8.j;
    }

    public static /* synthetic */ Map b(n n8) {
        return n8.k;
    }

    public static void c0(ArrayList arrayList, ArrayList arrayList2, int n8, int n9) {
        while (n8 < n9) {
            a a8 = (a)arrayList.get(n8);
            boolean bl = (Boolean)arrayList2.get(n8);
            boolean bl2 = true;
            if (bl) {
                a8.m(-1);
                if (n8 != n9 - 1) {
                    bl2 = false;
                }
                a8.r(bl2);
            } else {
                a8.m(1);
                a8.q();
            }
            ++n8;
        }
    }

    public static int d1(int n8) {
        int n9 = 8194;
        if (n8 != 4097) {
            if (n8 != 4099) {
                if (n8 != 8194) {
                    return 0;
                }
                return 4097;
            }
            n9 = 4099;
        }
        return n9;
    }

    public static Fragment y0(View object) {
        if ((object = object.getTag(U.b.a)) instanceof Fragment) {
            return (Fragment)object;
        }
        return null;
    }

    public void A(Configuration configuration) {
        for (Fragment fragment : this.c.n()) {
            if (fragment == null) continue;
            fragment.P0(configuration);
        }
    }

    public void A0() {
        this.a0(true);
        if (this.h.c()) {
            this.S0();
            return;
        }
        this.g.c();
    }

    public boolean B(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment == null || !fragment.Q0(menuItem)) continue;
            return true;
        }
        return false;
    }

    public void B0(Fragment fragment) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide: ");
            stringBuilder.append((Object)fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (!fragment.N) {
            fragment.N = true;
            fragment.b0 = true ^ fragment.b0;
            this.j1(fragment);
        }
    }

    public void C() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        this.S(1);
    }

    public boolean C0() {
        return this.G;
    }

    public boolean D(Menu object, MenuInflater menuInflater) {
        int n8 = this.q;
        int n9 = 0;
        if (n8 < 1) {
            return false;
        }
        Iterator iterator = this.c.n().iterator();
        ArrayList arrayList = null;
        boolean bl = false;
        while (iterator.hasNext()) {
            Fragment fragment = (Fragment)iterator.next();
            if (fragment == null || !this.F0(fragment) || !fragment.S0((Menu)object, menuInflater)) continue;
            ArrayList arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.add((Object)fragment);
            bl = true;
            arrayList = arrayList2;
        }
        if (this.e != null) {
            while (n9 < this.e.size()) {
                object = (Fragment)this.e.get(n9);
                if (arrayList == null || !arrayList.contains(object)) {
                    object.s0();
                }
                ++n9;
            }
        }
        this.e = arrayList;
        return bl;
    }

    public void E() {
        androidx.activity.result.c c8;
        this.G = true;
        this.a0(true);
        this.X();
        this.S(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
        if ((c8 = this.z) != null) {
            c8.c();
            this.A.c();
            this.B.c();
        }
    }

    public final boolean E0(Fragment fragment) {
        if (fragment.R && fragment.S || fragment.I.o()) {
            return true;
        }
        return false;
    }

    public void F() {
        this.S(1);
    }

    public boolean F0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.Z();
    }

    public void G() {
        for (Fragment fragment : this.c.n()) {
            if (fragment == null) continue;
            fragment.Y0();
        }
    }

    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n n8 = fragment.G;
        if (fragment.equals(n8.w0()) && this.G0(n8.t)) {
            return true;
        }
        return false;
    }

    public void H(boolean bl) {
        for (Fragment fragment : this.c.n()) {
            if (fragment == null) continue;
            fragment.Z0(bl);
        }
    }

    public boolean H0(int n8) {
        if (this.q >= n8) {
            return true;
        }
        return false;
    }

    public void I(Fragment fragment) {
        Iterator iterator = this.p.iterator();
        while (iterator.hasNext()) {
            ((r)iterator.next()).a(this, fragment);
        }
    }

    public boolean I0() {
        if (!this.E && !this.F) {
            return false;
        }
        return true;
    }

    public boolean J(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment == null || !fragment.a1(menuItem)) continue;
            return true;
        }
        return false;
    }

    public void J0(Fragment object, Intent intent, int n8, Bundle bundle) {
        if (this.z != null) {
            object = new m(object.t, n8);
            this.C.addLast(object);
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.z.a((Object)intent);
            return;
        }
        this.r.p((Fragment)object, intent, n8, bundle);
    }

    public void K(Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment == null) continue;
            fragment.b1(menu);
        }
    }

    public final void K0(t.b b8) {
        int n8 = b8.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Fragment fragment = (Fragment)b8.s(i8);
            if (fragment.z) continue;
            View view = fragment.q1();
            fragment.c0 = view.getAlpha();
            view.setAlpha(0.0f);
        }
    }

    public final void L(Fragment fragment) {
        if (fragment != null && fragment.equals(this.f0(fragment.t))) {
            fragment.f1();
        }
    }

    public void L0(Fragment fragment) {
        if (!this.c.c(fragment.t)) {
            if (n.D0(3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring moving ");
                stringBuilder.append((Object)fragment);
                stringBuilder.append(" to state ");
                stringBuilder.append(this.q);
                stringBuilder.append("since it is not added to ");
                stringBuilder.append((Object)this);
                Log.d((String)"FragmentManager", (String)stringBuilder.toString());
            }
            return;
        }
        this.N0(fragment);
        Object object = fragment.V;
        if (object != null && fragment.a0 && fragment.U != null) {
            float f8 = fragment.c0;
            if (f8 > 0.0f) {
                object.setAlpha(f8);
            }
            fragment.c0 = 0.0f;
            fragment.a0 = false;
            object = f.b(this.r.i(), fragment, true);
            if (object != null) {
                Animation animation = object.a;
                if (animation != null) {
                    fragment.V.startAnimation(animation);
                } else {
                    object.b.setTarget((Object)fragment.V);
                    object.b.start();
                }
            }
        }
        if (fragment.b0) {
            this.u(fragment);
        }
    }

    public void M() {
        this.S(5);
    }

    public void M0(int n8, boolean bl) {
        Object object;
        if (this.r == null && n8 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!bl && n8 == this.q) {
            return;
        }
        this.q = n8;
        if (P) {
            this.c.r();
        } else {
            object = this.c.n().iterator();
            while (object.hasNext()) {
                this.L0((Fragment)object.next());
            }
            object = this.c.k().iterator();
            while (object.hasNext()) {
                t t8 = (t)object.next();
                Fragment fragment = t8.k();
                if (!fragment.a0) {
                    this.L0(fragment);
                }
                if (!fragment.A || fragment.Y()) continue;
                this.c.q(t8);
            }
        }
        this.l1();
        if (this.D && (object = this.r) != null && this.q == 7) {
            object.q();
            this.D = false;
        }
    }

    public void N(boolean bl) {
        for (Fragment fragment : this.c.n()) {
            if (fragment == null) continue;
            fragment.d1(bl);
        }
    }

    public void N0(Fragment fragment) {
        this.O0(fragment, this.q);
    }

    public boolean O(Menu menu) {
        int n8 = this.q;
        boolean bl = false;
        if (n8 < 1) {
            return false;
        }
        for (Fragment fragment : this.c.n()) {
            if (fragment == null || !this.F0(fragment) || !fragment.e1(menu)) continue;
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void O0(Fragment var1_1, int var2_2) {
        block38 : {
            block31 : {
                block37 : {
                    block36 : {
                        block35 : {
                            block34 : {
                                block33 : {
                                    block32 : {
                                        var7_3 = this.c.m(var1_1.t);
                                        var4_4 = 1;
                                        var6_5 = var7_3;
                                        if (var7_3 == null) {
                                            var6_5 = new t(this.o, this.c, var1_1);
                                            var6_5.t(1);
                                        }
                                        var3_6 = var2_2;
                                        if (var1_1.B) {
                                            var3_6 = var2_2;
                                            if (var1_1.C) {
                                                var3_6 = var2_2;
                                                if (var1_1.o == 2) {
                                                    var3_6 = Math.max((int)var2_2, (int)2);
                                                }
                                            }
                                        }
                                        if ((var5_7 = var1_1.o) > (var2_2 = Math.min((int)var3_6, (int)var6_5.d()))) break block31;
                                        if (var5_7 < var2_2 && !this.m.isEmpty()) {
                                            this.n(var1_1);
                                        }
                                        if ((var3_6 = var1_1.o) == -1) break block32;
                                        if (var3_6 == 0) break block33;
                                        if (var3_6 == 1) break block34;
                                        if (var3_6 == 2) break block35;
                                        if (var3_6 == 4) break block36;
                                        if (var3_6 == 5) break block37;
                                        var3_6 = var2_2;
                                        break block38;
                                    }
                                    if (var2_2 > -1) {
                                        var6_5.c();
                                    }
                                }
                                if (var2_2 > 0) {
                                    var6_5.e();
                                }
                            }
                            if (var2_2 > -1) {
                                var6_5.j();
                            }
                            if (var2_2 > 1) {
                                var6_5.f();
                            }
                        }
                        if (var2_2 > 2) {
                            var6_5.a();
                        }
                    }
                    if (var2_2 > 4) {
                        var6_5.u();
                    }
                }
                var3_6 = var2_2;
                if (var2_2 > 5) {
                    var6_5.p();
                    var3_6 = var2_2;
                }
                break block38;
            }
            var3_6 = var2_2;
            if (var5_7 <= var2_2) break block38;
            if (var5_7 == 0) ** GOTO lbl102
            if (var5_7 == 1) ** GOTO lbl97
            if (var5_7 == 2) ** GOTO lbl71
            if (var5_7 == 4) ** GOTO lbl63
            if (var5_7 == 5) ** GOTO lbl61
            if (var5_7 != 7) {
                var3_6 = var2_2;
            } else {
                if (var2_2 < 7) {
                    var6_5.n();
                }
lbl61: // 4 sources:
                if (var2_2 < 5) {
                    var6_5.v();
                }
lbl63: // 4 sources:
                if (var2_2 < 4) {
                    if (n.D0(3)) {
                        var7_3 = new StringBuilder();
                        var7_3.append("movefrom ACTIVITY_CREATED: ");
                        var7_3.append((Object)var1_1);
                        Log.d((String)"FragmentManager", (String)var7_3.toString());
                    }
                    if (var1_1.V != null && this.r.o(var1_1) && var1_1.q == null) {
                        var6_5.s();
                    }
                }
lbl71: // 6 sources:
                if (var2_2 < 2) {
                    var7_3 = var1_1.V;
                    if (var7_3 != null && (var8_8 = var1_1.U) != null) {
                        var8_8.endViewTransition((View)var7_3);
                        var1_1.V.clearAnimation();
                        if (!var1_1.c0()) {
                            var7_3 = this.q > -1 && this.G == false && var1_1.V.getVisibility() == 0 && var1_1.c0 >= 0.0f ? f.b(this.r.i(), var1_1, false) : null;
                            var1_1.c0 = 0.0f;
                            var8_8 = var1_1.U;
                            var9_9 = var1_1.V;
                            if (var7_3 != null) {
                                f.a(var1_1, (f.d)var7_3, this.n);
                            }
                            var8_8.removeView(var9_9);
                            if (n.D0(2)) {
                                var7_3 = new StringBuilder();
                                var7_3.append("Removing view ");
                                var7_3.append((Object)var9_9);
                                var7_3.append(" for fragment ");
                                var7_3.append((Object)var1_1);
                                var7_3.append(" from container ");
                                var7_3.append((Object)var8_8);
                                Log.v((String)"FragmentManager", (String)var7_3.toString());
                            }
                            if (var8_8 != var1_1.U) {
                                return;
                            }
                        }
                    }
                    if (this.m.get((Object)var1_1) == null) {
                        var6_5.h();
                    }
                }
lbl97: // 6 sources:
                if (var2_2 < 1) {
                    if (this.m.get((Object)var1_1) != null) {
                        var2_2 = var4_4;
                    } else {
                        var6_5.g();
                    }
                }
lbl102: // 5 sources:
                if (var2_2 < 0) {
                    var6_5.i();
                }
                var3_6 = var2_2;
            }
        }
        if (var1_1.o == var3_6) return;
        if (n.D0(3)) {
            var6_5 = new StringBuilder();
            var6_5.append("moveToState: Fragment state for ");
            var6_5.append((Object)var1_1);
            var6_5.append(" not updated inline; expected state ");
            var6_5.append(var3_6);
            var6_5.append(" found ");
            var6_5.append(var1_1.o);
            Log.d((String)"FragmentManager", (String)var6_5.toString());
        }
        var1_1.o = var3_6;
    }

    public void P() {
        this.n1();
        this.L(this.u);
    }

    public void P0() {
        if (this.r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.n(false);
        for (Fragment fragment : this.c.n()) {
            if (fragment == null) continue;
            fragment.f0();
        }
    }

    public void Q() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        this.S(7);
    }

    public void Q0(t t8) {
        Fragment fragment = t8.k();
        if (fragment.W) {
            if (this.b) {
                this.H = true;
                return;
            }
            fragment.W = false;
            if (P) {
                t8.m();
                return;
            }
            this.N0(fragment);
        }
    }

    public void R() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        this.S(5);
    }

    public void R0(int n8, int n9) {
        if (n8 >= 0) {
            this.Y(new o(null, n8, n9), false);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void S(int n8) {
        Throwable throwable2;
        block4 : {
            block3 : {
                try {
                    this.b = true;
                    this.c.d(n8);
                    this.M0(n8, false);
                    if (!P) break block3;
                    Iterator iterator = this.r().iterator();
                    while (iterator.hasNext()) {
                        ((B)iterator.next()).j();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            this.b = false;
            this.a0(true);
            return;
        }
        this.b = false;
        throw throwable2;
    }

    public boolean S0() {
        return this.T0(null, -1, 0);
    }

    public void T() {
        this.F = true;
        this.M.n(true);
        this.S(4);
    }

    public final boolean T0(String string2, int n8, int n9) {
        boolean bl;
        this.a0(false);
        this.Z(true);
        Fragment fragment = this.u;
        if (fragment != null && n8 < 0 && string2 == null && fragment.s().S0()) {
            return true;
        }
        bl = this.U0(this.I, this.J, string2, n8, n9);
        if (bl) {
            this.b = true;
            try {
                this.Z0(this.I, this.J);
            }
            finally {
                this.q();
            }
        }
        this.n1();
        this.V();
        this.c.b();
        return bl;
    }

    public void U() {
        this.S(2);
    }

    public boolean U0(ArrayList arrayList, ArrayList arrayList2, String string2, int n8, int n9) {
        Object object = this.d;
        if (object == null) {
            return false;
        }
        if (string2 == null && n8 < 0 && (n9 & 1) == 0) {
            n8 = object.size() - 1;
            if (n8 < 0) {
                return false;
            }
            arrayList.add(this.d.remove(n8));
            arrayList2.add((Object)Boolean.TRUE);
            return true;
        }
        if (string2 == null && n8 < 0) {
            n8 = -1;
        } else {
            int n10;
            for (n10 = object.size() - 1; n10 >= 0; --n10) {
                object = (a)this.d.get(n10);
                if (string2 != null && string2.equals((Object)object.t()) || n8 >= 0 && n8 == object.v) break;
            }
            if (n10 < 0) {
                return false;
            }
            int n11 = n10;
            if ((n9 & 1) != 0) {
                do {
                    n11 = n9 = n10 - 1;
                    if (n9 < 0) break;
                    object = (a)this.d.get(n9);
                    if (string2 != null) {
                        n10 = n9;
                        if (string2.equals((Object)object.t())) continue;
                    }
                    n11 = n9;
                    if (n8 < 0) break;
                    n11 = n9;
                    if (n8 != object.v) break;
                    n10 = n9;
                } while (true);
            }
            n8 = n11;
        }
        if (n8 == this.d.size() - 1) {
            return false;
        }
        for (n9 = this.d.size() - 1; n9 > n8; --n9) {
            arrayList.add(this.d.remove(n9));
            arrayList2.add((Object)Boolean.TRUE);
        }
        return true;
    }

    public final void V() {
        if (this.H) {
            this.H = false;
            this.l1();
        }
    }

    public final int V0(ArrayList arrayList, ArrayList arrayList2, int n8, int n9, t.b b8) {
        int n10 = n9;
        for (int i8 = n9 - 1; i8 >= n8; --i8) {
            a a8 = (a)arrayList.get(i8);
            boolean bl = (Boolean)arrayList2.get(i8);
            int n11 = n10;
            if (a8.x()) {
                n11 = n10;
                if (!a8.v(arrayList, i8 + 1, n9)) {
                    if (this.L == null) {
                        this.L = new ArrayList();
                    }
                    p p8 = new p(a8, bl);
                    this.L.add((Object)p8);
                    a8.z(p8);
                    if (bl) {
                        a8.q();
                    } else {
                        a8.r(false);
                    }
                    n11 = n10 - 1;
                    if (i8 != n11) {
                        arrayList.remove(i8);
                        arrayList.add(n11, (Object)a8);
                    }
                    this.d(b8);
                }
            }
            n10 = n11;
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void W(String string2, FileDescriptor object, PrintWriter printWriter, String[] object2) {
        block11 : {
            int n8;
            int n9;
            Object object3 = new StringBuilder();
            object3.append(string2);
            object3.append("    ");
            object3 = object3.toString();
            this.c.e(string2, (FileDescriptor)object, printWriter, (String[])object2);
            object = this.e;
            int n10 = 0;
            if (object != null && (n9 = object.size()) > 0) {
                printWriter.print(string2);
                printWriter.println("Fragments Created Menus:");
                for (n8 = 0; n8 < n9; ++n8) {
                    object = (Fragment)this.e.get(n8);
                    printWriter.print(string2);
                    printWriter.print("  #");
                    printWriter.print(n8);
                    printWriter.print(": ");
                    printWriter.println(object.toString());
                }
            }
            if ((object = this.d) != null && (n9 = object.size()) > 0) {
                printWriter.print(string2);
                printWriter.println("Back Stack:");
                for (n8 = 0; n8 < n9; ++n8) {
                    object = (a)this.d.get(n8);
                    printWriter.print(string2);
                    printWriter.print("  #");
                    printWriter.print(n8);
                    printWriter.print(": ");
                    printWriter.println(object.toString());
                    object.o((String)object3, printWriter);
                }
            }
            printWriter.print(string2);
            object = new StringBuilder();
            object.append("Back Stack Index: ");
            object.append(this.i.get());
            printWriter.println(object.toString());
            object = this.a;
            // MONITORENTER : object
            n9 = this.a.size();
            if (n9 <= 0) break block11;
            printWriter.print(string2);
            printWriter.println("Pending Actions:");
            for (n8 = n10; n8 < n9; ++n8) {
                object2 = (n)this.a.get(n8);
                printWriter.print(string2);
                printWriter.print("  #");
                printWriter.print(n8);
                printWriter.print(": ");
                printWriter.println(object2);
            }
        }
        printWriter.print(string2);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(string2);
        printWriter.print("  mHost=");
        printWriter.println((Object)this.r);
        printWriter.print(string2);
        printWriter.print("  mContainer=");
        printWriter.println((Object)this.s);
        if (this.t != null) {
            printWriter.print(string2);
            printWriter.print("  mParent=");
            printWriter.println((Object)this.t);
        }
        printWriter.print(string2);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (!this.D) return;
        printWriter.print(string2);
        printWriter.print("  mNeedMenuInvalidate=");
        printWriter.println(this.D);
    }

    public void W0(l l8, boolean bl) {
        this.o.o(l8, bl);
    }

    public final void X() {
        block3 : {
            block2 : {
                if (!P) break block2;
                Iterator iterator = this.r().iterator();
                while (iterator.hasNext()) {
                    ((B)iterator.next()).j();
                }
                break block3;
            }
            if (this.m.isEmpty()) break block3;
            for (Fragment fragment : this.m.keySet()) {
                this.n(fragment);
                this.N0(fragment);
            }
        }
    }

    public void X0(Fragment fragment, E.c c8) {
        HashSet hashSet = (HashSet)this.m.get((Object)fragment);
        if (hashSet != null && hashSet.remove((Object)c8) && hashSet.isEmpty()) {
            this.m.remove((Object)fragment);
            if (fragment.o < 5) {
                this.w(fragment);
                this.N0(fragment);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Y(n n8, boolean bl) {
        if (!bl) {
            if (this.r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            this.p();
        }
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            try {
                if (this.r != null) {
                    this.a.add((Object)n8);
                    this.f1();
                    return;
                }
                if (bl) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void Y0(Fragment fragment) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove: ");
            stringBuilder.append((Object)fragment);
            stringBuilder.append(" nesting=");
            stringBuilder.append(fragment.F);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        boolean bl = fragment.Y();
        if (!fragment.O || bl ^ true) {
            this.c.s(fragment);
            if (this.E0(fragment)) {
                this.D = true;
            }
            fragment.A = true;
            this.j1(fragment);
        }
    }

    public final void Z(boolean bl) {
        if (!this.b) {
            if (this.r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.r.l().getLooper()) {
                if (!bl) {
                    this.p();
                }
                if (this.I == null) {
                    this.I = new ArrayList();
                    this.J = new ArrayList();
                }
                this.b = true;
                try {
                    this.e0(null, null);
                    return;
                }
                finally {
                    this.b = false;
                }
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final void Z0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            this.e0(arrayList, arrayList2);
            int n8 = arrayList.size();
            int n9 = 0;
            int n10 = 0;
            while (n9 < n8) {
                int n11 = n9;
                int n12 = n10;
                if (!((a)arrayList.get((int)n9)).r) {
                    if (n10 != n9) {
                        this.d0(arrayList, arrayList2, n10, n9);
                    }
                    n12 = n10 = n9 + 1;
                    if (((Boolean)arrayList2.get(n9)).booleanValue()) {
                        do {
                            n12 = n10;
                            if (n10 >= n8) break;
                            n12 = n10;
                            if (!((Boolean)arrayList2.get(n10)).booleanValue()) break;
                            n12 = n10++;
                        } while (!((a)arrayList.get((int)n10)).r);
                    }
                    this.d0(arrayList, arrayList2, n9, n12);
                    n11 = n12 - 1;
                }
                n9 = n11 + 1;
                n10 = n12;
            }
            if (n10 != n8) {
                this.d0(arrayList, arrayList2, n10, n8);
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public boolean a0(boolean bl) {
        this.Z(bl);
        bl = false;
        while (this.k0(this.I, this.J)) {
            bl = true;
            this.b = true;
            try {
                this.Z0(this.I, this.J);
            }
            finally {
                this.q();
            }
        }
        this.n1();
        this.V();
        this.c.b();
        return bl;
    }

    public void a1(Fragment fragment) {
        this.M.m(fragment);
    }

    public void b0(n n8, boolean bl) {
        if (bl && (this.r == null || this.G)) {
            return;
        }
        this.Z(bl);
        if (n8.a(this.I, this.J)) {
            this.b = true;
            try {
                this.Z0(this.I, this.J);
            }
            finally {
                this.q();
            }
        }
        this.n1();
        this.V();
        this.c.b();
    }

    public final void b1() {
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            if (arrayList.size() <= 0) {
                return;
            }
            android.support.v4.media.a.a(this.l.get(0));
            throw null;
        }
    }

    public void c1(Parcelable object) {
        int n8;
        Object object2;
        if (object == null) {
            return;
        }
        androidx.fragment.app.p p8 = (androidx.fragment.app.p)object;
        if (p8.o == null) {
            return;
        }
        this.c.t();
        Object object32 = p8.o.iterator();
        while (object32.hasNext()) {
            StringBuilder stringBuilder;
            object = (s)object32.next();
            if (object == null) continue;
            object2 = this.M.g(object.p);
            if (object2 != null) {
                if (n.D0(2)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("restoreSaveState: re-attaching retained ");
                    stringBuilder.append(object2);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                object = new t(this.o, this.c, (Fragment)object2, (s)object);
            } else {
                object = new t(this.o, this.c, this.r.i().getClassLoader(), this.p0(), (s)object);
            }
            object2 = object.k();
            object2.G = this;
            if (n.D0(2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("restoreSaveState: active (");
                stringBuilder.append(object2.t);
                stringBuilder.append("): ");
                stringBuilder.append(object2);
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
            object.o(this.r.i().getClassLoader());
            this.c.p((t)object);
            object.t(this.q);
        }
        for (Object object32 : this.M.j()) {
            if (this.c.c(object32.t)) continue;
            if (n.D0(2)) {
                object2 = new StringBuilder();
                object2.append("Discarding retained Fragment ");
                object2.append(object32);
                object2.append(" that was not found in the set of active Fragments ");
                object2.append((Object)p8.o);
                Log.v((String)"FragmentManager", (String)object2.toString());
            }
            this.M.m((Fragment)object32);
            object32.G = this;
            object2 = new t(this.o, this.c, (Fragment)object32);
            object2.t(1);
            object2.m();
            object32.A = true;
            object2.m();
        }
        this.c.u((List)p8.p);
        object = p8.q;
        int n9 = 0;
        if (object != null) {
            this.d = new ArrayList(p8.q.length);
            for (n8 = 0; n8 < (object = p8.q).length; ++n8) {
                object = object[n8].a(this);
                if (n.D0(2)) {
                    object32 = new StringBuilder();
                    object32.append("restoreAllState: back stack #");
                    object32.append(n8);
                    object32.append(" (index ");
                    object32.append(object.v);
                    object32.append("): ");
                    object32.append(object);
                    Log.v((String)"FragmentManager", (String)object32.toString());
                    object32 = new PrintWriter((Writer)new A("FragmentManager"));
                    object.p("  ", (PrintWriter)object32, false);
                    object32.close();
                }
                this.d.add(object);
            }
        } else {
            this.d = null;
        }
        this.i.set(p8.r);
        object = p8.s;
        if (object != null) {
            this.u = object = this.f0((String)object);
            this.L((Fragment)object);
        }
        if ((object = p8.t) != null) {
            for (n8 = n9; n8 < object.size(); ++n8) {
                this.j.put(object.get(n8), p8.u.get(n8));
            }
        }
        this.C = new ArrayDeque((Collection)p8.v);
    }

    public final void d(t.b b8) {
        int n8 = this.q;
        if (n8 < 1) {
            return;
        }
        n8 = Math.min((int)n8, (int)5);
        for (Fragment fragment : this.c.n()) {
            if (fragment.o >= n8) continue;
            this.O0(fragment, n8);
            if (fragment.V == null || fragment.N || !fragment.a0) continue;
            b8.add(fragment);
        }
    }

    public final void d0(ArrayList arrayList, ArrayList arrayList2, int n8, int n9) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public void e(a a8) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add((Object)a8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void e0(ArrayList var1_1, ArrayList var2_2) {
        var7_3 = this.L;
        var4_4 = var7_3 == null ? 0 : var7_3.size();
        var3_5 = 0;
        var6_6 = var4_4;
        while (var3_5 < var6_6) {
            block7 : {
                block6 : {
                    block5 : {
                        var7_3 = (p)this.L.get(var3_5);
                        if (var1_1 == null || var7_3.a || (var4_4 = var1_1.indexOf((Object)var7_3.b)) == -1 || var2_2 == null || !((Boolean)var2_2.get(var4_4)).booleanValue()) break block5;
                        this.L.remove(var3_5);
                        var5_7 = var3_5 - 1;
                        var4_4 = var6_6 - 1;
                        ** GOTO lbl-1000
                    }
                    if (var7_3.e()) break block6;
                    var4_4 = var6_6;
                    var5_7 = var3_5;
                    if (var1_1 == null) break block7;
                    var4_4 = var6_6;
                    var5_7 = var3_5;
                    if (!var7_3.b.v(var1_1, 0, var1_1.size())) break block7;
                }
                this.L.remove(var3_5);
                var5_7 = var3_5 - 1;
                var4_4 = var6_6 - 1;
                ** if (var1_1 == null || var7_3.a || (var3_5 = var1_1.indexOf((Object)var7_3.b)) == -1 || var2_2 == null || !((Boolean)var2_2.get((int)var3_5)).booleanValue()) goto lbl-1000
lbl-1000: // 2 sources:
                {
                    var7_3.c();
                    ** GOTO lbl29
                }
lbl-1000: // 1 sources:
                {
                    var7_3.d();
                }
            }
            var3_5 = var5_7 + 1;
            var6_6 = var4_4;
        }
    }

    public Parcelable e1() {
        this.j0();
        this.X();
        this.a0(true);
        this.E = true;
        this.M.n(true);
        ArrayList arrayList = this.c.v();
        boolean bl = arrayList.isEmpty();
        b[] arrb = null;
        if (bl) {
            if (n.D0(2)) {
                Log.v((String)"FragmentManager", (String)"saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList arrayList2 = this.c.w();
        ArrayList arrayList3 = this.d;
        Object object = arrb;
        if (arrayList3 != null) {
            int n8 = arrayList3.size();
            object = arrb;
            if (n8 > 0) {
                arrb = new b[n8];
                int n9 = 0;
                do {
                    object = arrb;
                    if (n9 >= n8) break;
                    arrb[n9] = new b((a)this.d.get(n9));
                    if (n.D0(2)) {
                        object = new StringBuilder();
                        object.append("saveAllState: adding back stack #");
                        object.append(n9);
                        object.append(": ");
                        object.append(this.d.get(n9));
                        Log.v((String)"FragmentManager", (String)object.toString());
                    }
                    ++n9;
                } while (true);
            }
        }
        arrb = new b[]();
        arrb.o = arrayList;
        arrb.p = arrayList2;
        arrb.q = object;
        arrb.r = this.i.get();
        object = this.u;
        if (object != null) {
            arrb.s = object.t;
        }
        arrb.t.addAll((Collection)this.j.keySet());
        arrb.u.addAll(this.j.values());
        arrb.v = new ArrayList((Collection)this.C);
        return arrb;
    }

    public void f(Fragment fragment, E.c c8) {
        if (this.m.get((Object)fragment) == null) {
            this.m.put((Object)fragment, (Object)new HashSet());
        }
        ((HashSet)this.m.get((Object)fragment)).add((Object)c8);
    }

    public Fragment f0(String string2) {
        return this.c.f(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f1() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            block7 : {
                block5 : {
                    boolean bl;
                    boolean bl2;
                    block6 : {
                        try {
                            ArrayList arrayList2 = this.L;
                            bl2 = false;
                            bl = arrayList2 != null && !arrayList2.isEmpty();
                            if (this.a.size() != 1) break block5;
                            bl2 = true;
                            break block6;
                        }
                        catch (Throwable throwable) {}
                        throw throwable;
                    }
                    if (!bl && !bl2) break block7;
                }
                this.r.l().removeCallbacks(this.N);
                this.r.l().post(this.N);
                this.n1();
            }
            return;
        }
    }

    public void g(Fragment fragment) {
        Object object;
        if (n.D0(2)) {
            object = new StringBuilder();
            object.append("add: ");
            object.append((Object)fragment);
            Log.v((String)"FragmentManager", (String)object.toString());
        }
        object = this.v(fragment);
        fragment.G = this;
        this.c.p((t)object);
        if (!fragment.O) {
            this.c.a(fragment);
            fragment.A = false;
            if (fragment.V == null) {
                fragment.b0 = false;
            }
            if (this.E0(fragment)) {
                this.D = true;
            }
        }
    }

    public Fragment g0(int n8) {
        return this.c.g(n8);
    }

    public void g1(Fragment fragment, boolean bl) {
        if ((fragment = this.o0(fragment)) != null && fragment instanceof h) {
            ((h)((Object)fragment)).setDrawDisappearingViewsLast(bl ^ true);
        }
    }

    public void h(r r8) {
        this.p.add((Object)r8);
    }

    public Fragment h0(String string2) {
        return this.c.h(string2);
    }

    public void h1(Fragment fragment, d.c c8) {
        if (fragment.equals(this.f0(fragment.t)) && (fragment.H == null || fragment.G == this)) {
            fragment.f0 = c8;
            return;
        }
        c8 = new StringBuilder();
        c8.append("Fragment ");
        c8.append((Object)fragment);
        c8.append(" is not an active fragment of FragmentManager ");
        c8.append((Object)this);
        throw new IllegalArgumentException(c8.toString());
    }

    public void i(Fragment fragment) {
        this.M.e(fragment);
    }

    public Fragment i0(String string2) {
        return this.c.i(string2);
    }

    public void i1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(this.f0(fragment.t)) || fragment.H != null && fragment.G != this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append((Object)fragment);
            stringBuilder.append(" is not an active fragment of FragmentManager ");
            stringBuilder.append((Object)this);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Fragment fragment2 = this.u;
        this.u = fragment;
        this.L(fragment2);
        this.L(this.u);
    }

    public int j() {
        return this.i.getAndIncrement();
    }

    public final void j0() {
        block3 : {
            block2 : {
                if (!P) break block2;
                Iterator iterator = this.r().iterator();
                while (iterator.hasNext()) {
                    ((B)iterator.next()).k();
                }
                break block3;
            }
            if (this.L == null) break block3;
            while (!this.L.isEmpty()) {
                ((p)this.L.remove(0)).d();
            }
        }
    }

    public final void j1(Fragment fragment) {
        ViewGroup viewGroup = this.o0(fragment);
        if (viewGroup != null && fragment.C() > 0) {
            if (viewGroup.getTag(U.b.c) == null) {
                viewGroup.setTag(U.b.c, (Object)fragment);
            }
            ((Fragment)viewGroup.getTag(U.b.c)).z1(fragment.C());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void k(androidx.fragment.app.k object, g object2, final Fragment fragment) {
        block12 : {
            block11 : {
                block10 : {
                    if (this.r != null) {
                        throw new IllegalStateException("Already attached");
                    }
                    this.r = object;
                    this.s = object2;
                    this.t = fragment;
                    if (fragment == null) break block10;
                    object2 = new r(){

                        @Override
                        public void a(n n8, Fragment fragment2) {
                            fragment.k0(fragment2);
                        }
                    };
                    break block11;
                }
                if (!(object instanceof r)) break block12;
                object2 = (r)object;
            }
            this.h((r)object2);
        }
        if (this.t != null) {
            this.n1();
        }
        if (object instanceof androidx.activity.c) {
            OnBackPressedDispatcher onBackPressedDispatcher;
            object2 = (androidx.activity.c)object;
            this.g = onBackPressedDispatcher = object2.j();
            if (fragment != null) {
                object2 = fragment;
            }
            onBackPressedDispatcher.a((androidx.lifecycle.h)object2, this.h);
        }
        object = fragment != null ? fragment.G.m0(fragment) : (object instanceof androidx.lifecycle.u ? q.i(((androidx.lifecycle.u)object).d()) : new q(false));
        this.M = object;
        this.M.n(this.I0());
        this.c.x(this.M);
        object = this.r;
        if (object instanceof androidx.activity.result.d) {
            object2 = ((androidx.activity.result.d)object).c();
            if (fragment != null) {
                object = new StringBuilder();
                object.append(fragment.t);
                object.append(":");
                object = object.toString();
            } else {
                object = "";
            }
            fragment = new StringBuilder();
            fragment.append("FragmentManager:");
            fragment.append((String)object);
            object = fragment.toString();
            fragment = new StringBuilder();
            fragment.append((String)object);
            fragment.append("StartActivityForResult");
            this.z = object2.j(fragment.toString(), new d.c(), new androidx.activity.result.b(){

                public void b(androidx.activity.result.a a8) {
                    Object object = (m)n.this.C.pollFirst();
                    if (object == null) {
                        a8 = new StringBuilder();
                        a8.append("No Activities were started for result for ");
                        a8.append((Object)this);
                        Log.w((String)"FragmentManager", (String)a8.toString());
                        return;
                    }
                    String string2 = object.o;
                    int n8 = object.p;
                    object = n.this.c.i(string2);
                    if (object == null) {
                        a8 = new StringBuilder();
                        a8.append("Activity result delivered for unknown Fragment ");
                        a8.append(string2);
                        Log.w((String)"FragmentManager", (String)a8.toString());
                        return;
                    }
                    object.h0(n8, a8.b(), a8.a());
                }
            });
            fragment = new StringBuilder();
            fragment.append((String)object);
            fragment.append("StartIntentSenderForResult");
            this.A = object2.j(fragment.toString(), new k(), new androidx.activity.result.b(){

                public void b(androidx.activity.result.a a8) {
                    Object object = (m)n.this.C.pollFirst();
                    if (object == null) {
                        a8 = new StringBuilder();
                        a8.append("No IntentSenders were started for ");
                        a8.append((Object)this);
                        Log.w((String)"FragmentManager", (String)a8.toString());
                        return;
                    }
                    String string2 = object.o;
                    int n8 = object.p;
                    object = n.this.c.i(string2);
                    if (object == null) {
                        a8 = new StringBuilder();
                        a8.append("Intent Sender result delivered for unknown Fragment ");
                        a8.append(string2);
                        Log.w((String)"FragmentManager", (String)a8.toString());
                        return;
                    }
                    object.h0(n8, a8.b(), a8.a());
                }
            });
            fragment = new StringBuilder();
            fragment.append((String)object);
            fragment.append("RequestPermissions");
            this.B = object2.j(fragment.toString(), new d.b(), new androidx.activity.result.b(){

                /*
                 * Enabled aggressive block sorting
                 */
                public void b(Map stringBuilder) {
                    int n8;
                    String[] arrstring = (String[])stringBuilder.keySet().toArray((Object[])new String[0]);
                    Object object = new ArrayList(stringBuilder.values());
                    stringBuilder = new int[object.size()];
                    for (n8 = 0; n8 < object.size(); ++n8) {
                        int n9 = (Boolean)object.get(n8) != false ? 0 : -1;
                        stringBuilder[n8] = n9;
                    }
                    Object object2 = (m)n.this.C.pollFirst();
                    if (object2 == null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("No permissions were requested for ");
                        stringBuilder.append((Object)this);
                    } else {
                        object = object2.o;
                        n8 = object2.p;
                        object2 = n.this.c.i((String)object);
                        if (object2 != null) {
                            object2.G0(n8, arrstring, (int[])stringBuilder);
                            return;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Permission request result delivered for unknown Fragment ");
                        stringBuilder.append((String)object);
                    }
                    Log.w((String)"FragmentManager", (String)stringBuilder.toString());
                }
            });
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean k0(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.a;
        synchronized (arrayList3) {
            try {
                boolean bl = this.a.isEmpty();
                if (bl) {
                    return false;
                }
                int n8 = this.a.size();
                bl = false;
                for (int i8 = 0; i8 < n8; bl |= ((n)this.a.get((int)i8)).a((ArrayList)arrayList, (ArrayList)arrayList2), ++i8) {
                }
                this.a.clear();
                this.r.l().removeCallbacks(this.N);
                return bl;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void k1(Fragment fragment) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show: ");
            stringBuilder.append((Object)fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (fragment.N) {
            fragment.N = false;
            fragment.b0 ^= true;
        }
    }

    public void l(Fragment fragment) {
        StringBuilder stringBuilder;
        if (n.D0(2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("attach: ");
            stringBuilder.append((Object)fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (fragment.O) {
            fragment.O = false;
            if (!fragment.z) {
                this.c.a(fragment);
                if (n.D0(2)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("add from attach: ");
                    stringBuilder.append((Object)fragment);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                if (this.E0(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    public int l0() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void l1() {
        Iterator iterator = this.c.k().iterator();
        while (iterator.hasNext()) {
            this.Q0((t)iterator.next());
        }
    }

    public v m() {
        return new a(this);
    }

    public final q m0(Fragment fragment) {
        return this.M.h(fragment);
    }

    public void m1(l l8) {
        this.o.p(l8);
    }

    public final void n(Fragment fragment) {
        HashSet hashSet = (HashSet)this.m.get((Object)fragment);
        if (hashSet != null) {
            Iterator iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                ((E.c)iterator.next()).a();
            }
            hashSet.clear();
            this.w(fragment);
            this.m.remove((Object)fragment);
        }
    }

    public g n0() {
        return this.s;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void n1() {
        Object object = this.a;
        // MONITORENTER : object
        boolean bl = this.a.isEmpty();
        boolean bl2 = true;
        if (!bl) {
            this.h.f(true);
            // MONITOREXIT : object
            return;
        }
        // MONITOREXIT : object
        object = this.h;
        if (this.l0() <= 0 || !this.G0(this.t)) {
            bl2 = false;
        }
        object.f(bl2);
    }

    public boolean o() {
        Iterator iterator = this.c.l().iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            Fragment fragment = (Fragment)iterator.next();
            boolean bl2 = bl;
            if (fragment != null) {
                bl2 = this.E0(fragment);
            }
            bl = bl2;
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.L <= 0) {
            return null;
        }
        if (this.s.f() && (fragment = this.s.e(fragment.L)) instanceof ViewGroup) {
            return (ViewGroup)fragment;
        }
        return null;
    }

    public final void p() {
        if (!this.I0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public j p0() {
        Object object = this.v;
        if (object != null) {
            return object;
        }
        object = this.t;
        if (object != null) {
            return object.G.p0();
        }
        return this.w;
    }

    public final void q() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public u q0() {
        return this.c;
    }

    public final Set r() {
        HashSet hashSet = new HashSet();
        Iterator iterator = this.c.k().iterator();
        while (iterator.hasNext()) {
            ViewGroup viewGroup = ((t)iterator.next()).k().U;
            if (viewGroup == null) continue;
            hashSet.add((Object)B.o(viewGroup, this.x0()));
        }
        return hashSet;
    }

    public List r0() {
        return this.c.n();
    }

    public final Set s(ArrayList arrayList, int n8, int n9) {
        HashSet hashSet = new HashSet();
        while (n8 < n9) {
            Iterator iterator = ((a)arrayList.get((int)n8)).c.iterator();
            while (iterator.hasNext()) {
                Fragment fragment = ((v.a)iterator.next()).b;
                if (fragment == null || (fragment = fragment.U) == null) continue;
                hashSet.add((Object)B.n((ViewGroup)fragment, this));
            }
            ++n8;
        }
        return hashSet;
    }

    public androidx.fragment.app.k s0() {
        return this.r;
    }

    public void t(a a8, boolean bl, boolean bl2, boolean bl3) {
        if (bl) {
            a8.r(bl3);
        } else {
            a8.q();
        }
        ArrayList arrayList = new ArrayList(1);
        Object object2 = new ArrayList(1);
        arrayList.add((Object)a8);
        object2.add((Object)bl);
        if (bl2 && this.q >= 1) {
            w.B(this.r.i(), this.s, arrayList, (ArrayList)object2, 0, 1, true, this.n);
        }
        if (bl3) {
            this.M0(this.q, true);
        }
        for (Object object2 : this.c.l()) {
            if (object2 == null || object2.V == null || !object2.a0 || !a8.u(object2.L)) continue;
            float f8 = object2.c0;
            if (f8 > 0.0f) {
                object2.V.setAlpha(f8);
            }
            if (bl3) {
                object2.c0 = 0.0f;
                continue;
            }
            object2.c0 = -1.0f;
            object2.a0 = false;
        }
    }

    public LayoutInflater.Factory2 t0() {
        return this.f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        block2 : {
            var2_1 = new StringBuilder(128);
            var2_1.append("FragmentManager{");
            var2_1.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
            var2_1.append(" in ");
            var1_2 = this.t;
            if (var1_2 == null) break block2;
            var2_1.append(var1_2.getClass().getSimpleName());
            var2_1.append("{");
            var1_2 = this.t;
            ** GOTO lbl17
        }
        var1_2 = this.r;
        if (var1_2 != null) {
            var2_1.append(var1_2.getClass().getSimpleName());
            var2_1.append("{");
            var1_2 = this.r;
lbl17: // 2 sources:
            var2_1.append(Integer.toHexString((int)System.identityHashCode((Object)var1_2)));
            var2_1.append("}");
        } else {
            var2_1.append("null");
        }
        var2_1.append("}}");
        return var2_1.toString();
    }

    public final void u(Fragment fragment) {
        if (fragment.V != null) {
            Animator animator;
            f.d d8 = f.b(this.r.i(), fragment, fragment.N ^ true);
            if (d8 != null && (animator = d8.b) != null) {
                animator.setTarget((Object)fragment.V);
                if (fragment.N) {
                    if (fragment.X()) {
                        fragment.y1(false);
                    } else {
                        animator = fragment.U;
                        View view = fragment.V;
                        animator.startViewTransition(view);
                        d8.b.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter((ViewGroup)animator, view, fragment){
                            public final /* synthetic */ ViewGroup a;
                            public final /* synthetic */ View b;
                            public final /* synthetic */ Fragment c;
                            {
                                this.a = viewGroup;
                                this.b = view;
                                this.c = fragment;
                            }

                            public void onAnimationEnd(Animator object) {
                                this.a.endViewTransition(this.b);
                                object.removeListener((Animator.AnimatorListener)this);
                                object = this.c;
                                View view = object.V;
                                if (view != null && object.N) {
                                    view.setVisibility(8);
                                }
                            }
                        });
                    }
                } else {
                    fragment.V.setVisibility(0);
                }
                d8.b.start();
            } else {
                if (d8 != null) {
                    fragment.V.startAnimation(d8.a);
                    d8.a.start();
                }
                int n8 = fragment.N && !fragment.X() ? 8 : 0;
                fragment.V.setVisibility(n8);
                if (fragment.X()) {
                    fragment.y1(false);
                }
            }
        }
        if (fragment.z && this.E0(fragment)) {
            this.D = true;
        }
        fragment.b0 = false;
        fragment.w0(fragment.N);
    }

    public androidx.fragment.app.m u0() {
        return this.o;
    }

    public t v(Fragment object) {
        t t8 = this.c.m(object.t);
        if (t8 != null) {
            return t8;
        }
        object = new t(this.o, this.c, (Fragment)object);
        object.o(this.r.i().getClassLoader());
        object.t(this.q);
        return object;
    }

    public Fragment v0() {
        return this.t;
    }

    public final void w(Fragment fragment) {
        fragment.V0();
        this.o.n(fragment, false);
        fragment.U = null;
        fragment.V = null;
        fragment.h0 = null;
        fragment.i0.j(null);
        fragment.C = false;
    }

    public Fragment w0() {
        return this.u;
    }

    public void x(Fragment fragment) {
        StringBuilder stringBuilder;
        if (n.D0(2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("detach: ");
            stringBuilder.append((Object)fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (!fragment.O) {
            fragment.O = true;
            if (fragment.z) {
                if (n.D0(2)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("remove from detach: ");
                    stringBuilder.append((Object)fragment);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                this.c.s(fragment);
                if (this.E0(fragment)) {
                    this.D = true;
                }
                this.j1(fragment);
            }
        }
    }

    public C x0() {
        Object object = this.x;
        if (object != null) {
            return object;
        }
        object = this.t;
        if (object != null) {
            return object.G.x0();
        }
        return this.y;
    }

    public void y() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        this.S(4);
    }

    public void z() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        this.S(0);
    }

    public androidx.lifecycle.t z0(Fragment fragment) {
        return this.M.k(fragment);
    }

    public static class k
    extends d.a {
        public Intent d(Context object, e e8) {
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = e8.a();
            object = e8;
            if (intent2 != null) {
                Bundle bundle = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                object = e8;
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    object = e8;
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        object = new e.b(e8.d()).b(null).c(e8.c(), e8.b()).a();
                    }
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)object);
            if (n.D0(2)) {
                object = new StringBuilder();
                object.append("CreateIntent created the following intent: ");
                object.append((Object)intent);
                Log.v((String)"FragmentManager", (String)object.toString());
            }
            return intent;
        }

        public androidx.activity.result.a e(int n8, Intent intent) {
            return new androidx.activity.result.a(n8, intent);
        }
    }

    public static abstract class l {
        public void a(n n8, Fragment fragment, Bundle bundle) {
        }

        public void b(n n8, Fragment fragment, Context context) {
        }

        public void c(n n8, Fragment fragment, Bundle bundle) {
        }

        public void d(n n8, Fragment fragment) {
        }

        public void e(n n8, Fragment fragment) {
        }

        public void f(n n8, Fragment fragment) {
        }

        public void g(n n8, Fragment fragment, Context context) {
        }

        public void h(n n8, Fragment fragment, Bundle bundle) {
        }

        public void i(n n8, Fragment fragment) {
        }

        public void j(n n8, Fragment fragment, Bundle bundle) {
        }

        public void k(n n8, Fragment fragment) {
        }

        public void l(n n8, Fragment fragment) {
        }

        public void m(n n8, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(n n8, Fragment fragment) {
        }
    }

    public static class m
    implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator(){

            public m a(Parcel parcel) {
                return new m(parcel);
            }

            public m[] b(int n8) {
                return new m[n8];
            }
        };
        public String o;
        public int p;

        public m(Parcel parcel) {
            this.o = parcel.readString();
            this.p = parcel.readInt();
        }

        public m(String string2, int n8) {
            this.o = string2;
            this.p = n8;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeString(this.o);
            parcel.writeInt(this.p);
        }

    }

    public static interface n {
        public boolean a(ArrayList var1, ArrayList var2);
    }

    public class o
    implements n {
        public final String a;
        public final int b;
        public final int c;

        public o(String string2, int n9, int n10) {
            this.a = string2;
            this.b = n9;
            this.c = n10;
        }

        @Override
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = n.this.u;
            if (fragment != null && this.b < 0 && this.a == null && fragment.s().S0()) {
                return false;
            }
            return n.this.U0(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    public static class p
    implements Fragment.k {
        public final boolean a;
        public final a b;
        public int c;

        public p(a a8, boolean bl) {
            this.a = bl;
            this.b = a8;
        }

        @Override
        public void a() {
            int n8;
            this.c = n8 = this.c - 1;
            if (n8 != 0) {
                return;
            }
            this.b.t.f1();
        }

        @Override
        public void b() {
            ++this.c;
        }

        public void c() {
            a a8 = this.b;
            a8.t.t(a8, this.a, false, false);
        }

        public void d() {
            boolean bl = this.c > 0;
            for (Fragment fragment : this.b.t.r0()) {
                fragment.B1(null);
                if (!bl || !fragment.a0()) continue;
                fragment.G1();
            }
            a a8 = this.b;
            a8.t.t(a8, this.a, bl ^ true, true);
        }

        public boolean e() {
            if (this.c == 0) {
                return true;
            }
            return false;
        }
    }

}

