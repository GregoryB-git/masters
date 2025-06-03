// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.activity.result.e;
import android.content.Context;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.LayoutInflater$Factory2;
import java.util.Set;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.d;
import java.util.Collection;
import java.io.Writer;
import java.util.List;
import android.os.Parcelable;
import android.os.Looper;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.animation.Animation;
import android.content.Intent;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import android.content.res.Configuration;
import android.view.View;
import android.util.Log;
import android.view.ViewGroup;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.activity.b;
import androidx.activity.OnBackPressedDispatcher;
import java.util.ArrayList;
import java.util.ArrayDeque;
import androidx.activity.result.c;

public abstract class n
{
    public static boolean O = false;
    public static boolean P = true;
    public c A;
    public c B;
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
    public final ArrayList a;
    public boolean b;
    public final u c;
    public ArrayList d;
    public ArrayList e;
    public final androidx.fragment.app.l f;
    public OnBackPressedDispatcher g;
    public final b h;
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
    public c z;
    
    public n() {
        this.a = new ArrayList();
        this.c = new u();
        this.f = new androidx.fragment.app.l(this);
        this.h = new b(false) {
            @Override
            public void b() {
                androidx.fragment.app.n.this.A0();
            }
        };
        this.i = new AtomicInteger();
        this.j = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.k = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.m = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.n = new w.g() {
            @Override
            public void a(final Fragment fragment, final E.c c) {
                if (!c.b()) {
                    androidx.fragment.app.n.this.X0(fragment, c);
                }
            }
            
            @Override
            public void b(final Fragment fragment, final E.c c) {
                androidx.fragment.app.n.this.f(fragment, c);
            }
        };
        this.o = new androidx.fragment.app.m(this);
        this.p = new CopyOnWriteArrayList();
        this.q = -1;
        this.v = null;
        this.w = new j() {
            @Override
            public Fragment a(final ClassLoader classLoader, final String s) {
                return androidx.fragment.app.n.this.s0().b(androidx.fragment.app.n.this.s0().i(), s, null);
            }
        };
        this.x = null;
        this.y = new C() {
            @Override
            public B a(final ViewGroup viewGroup) {
                return new androidx.fragment.app.c(viewGroup);
            }
        };
        this.C = new ArrayDeque();
        this.N = new Runnable() {
            @Override
            public void run() {
                androidx.fragment.app.n.this.a0(true);
            }
        };
    }
    
    public static boolean D0(final int n) {
        return n.O || Log.isLoggable("FragmentManager", n);
    }
    
    public static /* synthetic */ u c(final n n) {
        return n.c;
    }
    
    public static void c0(final ArrayList list, final ArrayList list2, int i, final int n) {
        while (i < n) {
            final a a = list.get(i);
            final boolean booleanValue = list2.get(i);
            boolean b = true;
            if (booleanValue) {
                a.m(-1);
                if (i != n - 1) {
                    b = false;
                }
                a.r(b);
            }
            else {
                a.m(1);
                a.q();
            }
            ++i;
        }
    }
    
    public static int d1(final int n) {
        int n2 = 8194;
        if (n != 4097) {
            if (n != 4099) {
                if (n != 8194) {
                    return 0;
                }
                return 4097;
            }
            else {
                n2 = 4099;
            }
        }
        return n2;
    }
    
    public static Fragment y0(final View view) {
        final Object tag = view.getTag(U.b.a);
        if (tag instanceof Fragment) {
            return (Fragment)tag;
        }
        return null;
    }
    
    public void A(final Configuration configuration) {
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.P0(configuration);
            }
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
    
    public boolean B(final MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.Q0(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    public void B0(final Fragment obj) {
        if (D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
        if (!obj.N) {
            obj.N = true;
            obj.b0 ^= true;
            this.j1(obj);
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
    
    public boolean D(final Menu menu, final MenuInflater menuInflater) {
        final int q = this.q;
        int i = 0;
        if (q < 1) {
            return false;
        }
        final Iterator<Fragment> iterator = (Iterator<Fragment>)this.c.n().iterator();
        ArrayList<Fragment> e = null;
        boolean b = false;
        while (iterator.hasNext()) {
            final Fragment e2 = iterator.next();
            if (e2 != null && this.F0(e2) && e2.S0(menu, menuInflater)) {
                ArrayList<Fragment> list;
                if ((list = e) == null) {
                    list = new ArrayList<Fragment>();
                }
                list.add(e2);
                b = true;
                e = list;
            }
        }
        if (this.e != null) {
            while (i < this.e.size()) {
                final Fragment o = this.e.get(i);
                if (e == null || !e.contains(o)) {
                    o.s0();
                }
                ++i;
            }
        }
        this.e = e;
        return b;
    }
    
    public void E() {
        this.a0(this.G = true);
        this.X();
        this.S(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
        final c z = this.z;
        if (z != null) {
            z.c();
            this.A.c();
            this.B.c();
        }
    }
    
    public final boolean E0(final Fragment fragment) {
        return (fragment.R && fragment.S) || fragment.I.o();
    }
    
    public void F() {
        this.S(1);
    }
    
    public boolean F0(final Fragment fragment) {
        return fragment == null || fragment.Z();
    }
    
    public void G() {
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.Y0();
            }
        }
    }
    
    public boolean G0(final Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        final n g = fragment.G;
        return fragment.equals(g.w0()) && this.G0(g.t);
    }
    
    public void H(final boolean b) {
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.Z0(b);
            }
        }
    }
    
    public boolean H0(final int n) {
        return this.q >= n;
    }
    
    public void I(final Fragment fragment) {
        final Iterator<r> iterator = this.p.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, fragment);
        }
    }
    
    public boolean I0() {
        return this.E || this.F;
    }
    
    public boolean J(final MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null && fragment.a1(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    public void J0(final Fragment fragment, final Intent intent, final int n, final Bundle bundle) {
        if (this.z != null) {
            this.C.addLast(new m(fragment.t, n));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.z.a(intent);
            return;
        }
        this.r.p(fragment, intent, n, bundle);
    }
    
    public void K(final Menu menu) {
        if (this.q < 1) {
            return;
        }
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.b1(menu);
            }
        }
    }
    
    public final void K0(final t.b b) {
        for (int size = b.size(), i = 0; i < size; ++i) {
            final Fragment fragment = (Fragment)b.s(i);
            if (!fragment.z) {
                final View q1 = fragment.q1();
                fragment.c0 = q1.getAlpha();
                q1.setAlpha(0.0f);
            }
        }
    }
    
    public final void L(final Fragment fragment) {
        if (fragment != null && fragment.equals(this.f0(fragment.t))) {
            fragment.f1();
        }
    }
    
    public void L0(final Fragment obj) {
        if (!this.c.c(obj.t)) {
            if (D0(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring moving ");
                sb.append(obj);
                sb.append(" to state ");
                sb.append(this.q);
                sb.append("since it is not added to ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            return;
        }
        this.N0(obj);
        final View v = obj.V;
        if (v != null && obj.a0 && obj.U != null) {
            final float c0 = obj.c0;
            if (c0 > 0.0f) {
                v.setAlpha(c0);
            }
            obj.c0 = 0.0f;
            obj.a0 = false;
            final f.d b = androidx.fragment.app.f.b(this.r.i(), obj, true);
            if (b != null) {
                final Animation a = b.a;
                if (a != null) {
                    obj.V.startAnimation(a);
                }
                else {
                    b.b.setTarget((Object)obj.V);
                    b.b.start();
                }
            }
        }
        if (obj.b0) {
            this.u(obj);
        }
    }
    
    public void M() {
        this.S(5);
    }
    
    public void M0(final int q, final boolean b) {
        if (this.r == null && q != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!b && q == this.q) {
            return;
        }
        this.q = q;
        if (androidx.fragment.app.n.P) {
            this.c.r();
        }
        else {
            final Iterator<Fragment> iterator = this.c.n().iterator();
            while (iterator.hasNext()) {
                this.L0(iterator.next());
            }
            for (final t t : this.c.k()) {
                final Fragment k = t.k();
                if (!k.a0) {
                    this.L0(k);
                }
                if (k.A && !k.Y()) {
                    this.c.q(t);
                }
            }
        }
        this.l1();
        if (this.D) {
            final androidx.fragment.app.k r = this.r;
            if (r != null && this.q == 7) {
                r.q();
                this.D = false;
            }
        }
    }
    
    public void N(final boolean b) {
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.d1(b);
            }
        }
    }
    
    public void N0(final Fragment fragment) {
        this.O0(fragment, this.q);
    }
    
    public boolean O(final Menu menu) {
        final int q = this.q;
        boolean b = false;
        if (q < 1) {
            return false;
        }
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null && this.F0(fragment) && fragment.e1(menu)) {
                b = true;
            }
        }
        return b;
    }
    
    public void O0(final Fragment obj, int min) {
        final t m = this.c.m(obj.t);
        final int n = 1;
        t t = m;
        if (m == null) {
            t = new t(this.o, this.c, obj);
            t.t(1);
        }
        int max = min;
        if (obj.B) {
            max = min;
            if (obj.C) {
                max = min;
                if (obj.o == 2) {
                    max = Math.max(min, 2);
                }
            }
        }
        min = Math.min(max, t.d());
        final int o = obj.o;
        int n2 = 0;
        Label_0677: {
            if (o <= min) {
                if (o < min && !this.m.isEmpty()) {
                    this.n(obj);
                }
                final int o2 = obj.o;
                Label_0226: {
                    Label_0216: {
                        Label_0206: {
                            Label_0186: {
                                if (o2 != -1) {
                                    if (o2 != 0) {
                                        if (o2 == 1) {
                                            break Label_0186;
                                        }
                                        if (o2 == 2) {
                                            break Label_0206;
                                        }
                                        if (o2 == 4) {
                                            break Label_0216;
                                        }
                                        if (o2 != 5) {
                                            n2 = min;
                                            break Label_0677;
                                        }
                                        break Label_0226;
                                    }
                                }
                                else if (min > -1) {
                                    t.c();
                                }
                                if (min > 0) {
                                    t.e();
                                }
                            }
                            if (min > -1) {
                                t.j();
                            }
                            if (min > 1) {
                                t.f();
                            }
                        }
                        if (min > 2) {
                            t.a();
                        }
                    }
                    if (min > 4) {
                        t.u();
                    }
                }
                if ((n2 = min) > 5) {
                    t.p();
                    n2 = min;
                }
            }
            else if (o > (n2 = min)) {
                if (o != 0) {
                    if (o != 1) {
                        if (o != 2) {
                            if (o != 4) {
                                if (o != 5) {
                                    if (o != 7) {
                                        n2 = min;
                                        break Label_0677;
                                    }
                                    if (min < 7) {
                                        t.n();
                                    }
                                }
                                if (min < 5) {
                                    t.v();
                                }
                            }
                            if (min < 4) {
                                if (D0(3)) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("movefrom ACTIVITY_CREATED: ");
                                    sb.append(obj);
                                    Log.d("FragmentManager", sb.toString());
                                }
                                if (obj.V != null && this.r.o(obj) && obj.q == null) {
                                    t.s();
                                }
                            }
                        }
                        if (min < 2) {
                            final View v = obj.V;
                            if (v != null) {
                                final ViewGroup u = obj.U;
                                if (u != null) {
                                    u.endViewTransition(v);
                                    obj.V.clearAnimation();
                                    if (!obj.c0()) {
                                        f.d b;
                                        if (this.q > -1 && !this.G && obj.V.getVisibility() == 0 && obj.c0 >= 0.0f) {
                                            b = androidx.fragment.app.f.b(this.r.i(), obj, false);
                                        }
                                        else {
                                            b = null;
                                        }
                                        obj.c0 = 0.0f;
                                        final ViewGroup u2 = obj.U;
                                        final View v2 = obj.V;
                                        if (b != null) {
                                            androidx.fragment.app.f.a(obj, b, this.n);
                                        }
                                        u2.removeView(v2);
                                        if (D0(2)) {
                                            final StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Removing view ");
                                            sb2.append(v2);
                                            sb2.append(" for fragment ");
                                            sb2.append(obj);
                                            sb2.append(" from container ");
                                            sb2.append(u2);
                                            Log.v("FragmentManager", sb2.toString());
                                        }
                                        if (u2 != obj.U) {
                                            return;
                                        }
                                    }
                                }
                            }
                            if (this.m.get(obj) == null) {
                                t.h();
                            }
                        }
                    }
                    if (min < 1) {
                        if (this.m.get(obj) != null) {
                            min = n;
                        }
                        else {
                            t.g();
                        }
                    }
                }
                if (min < 0) {
                    t.i();
                }
                n2 = min;
            }
        }
        if (obj.o != n2) {
            if (D0(3)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("moveToState: Fragment state for ");
                sb3.append(obj);
                sb3.append(" not updated inline; expected state ");
                sb3.append(n2);
                sb3.append(" found ");
                sb3.append(obj.o);
                Log.d("FragmentManager", sb3.toString());
            }
            obj.o = n2;
        }
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
        for (final Fragment fragment : this.c.n()) {
            if (fragment != null) {
                fragment.f0();
            }
        }
    }
    
    public void Q() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        this.S(7);
    }
    
    public void Q0(final t t) {
        final Fragment k = t.k();
        if (k.W) {
            if (this.b) {
                this.H = true;
                return;
            }
            k.W = false;
            if (androidx.fragment.app.n.P) {
                t.m();
                return;
            }
            this.N0(k);
        }
    }
    
    public void R() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        this.S(5);
    }
    
    public void R0(final int i, final int n) {
        if (i >= 0) {
            this.Y((n)new o(null, i, n), false);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void S(final int n) {
        Label_0075: {
            try {
                this.b = true;
                this.c.d(n);
                this.M0(n, false);
                if (n.P) {
                    final Iterator<B> iterator = this.r().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().j();
                    }
                }
            }
            finally {
                break Label_0075;
            }
            this.b = false;
            this.a0(true);
            return;
        }
        this.b = false;
    }
    
    public boolean S0() {
        return this.T0(null, -1, 0);
    }
    
    public void T() {
        this.F = true;
        this.M.n(true);
        this.S(4);
    }
    
    public final boolean T0(final String s, final int n, final int n2) {
        this.a0(false);
        this.Z(true);
        final Fragment u = this.u;
        if (u != null && n < 0 && s == null && u.s().S0()) {
            return true;
        }
        final boolean u2 = this.U0(this.I, this.J, s, n, n2);
        if (u2) {
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
        return u2;
    }
    
    public void U() {
        this.S(2);
    }
    
    public boolean U0(final ArrayList list, final ArrayList list2, final String s, int index, int i) {
        final ArrayList d = this.d;
        if (d == null) {
            return false;
        }
        if (s == null && index < 0 && (i & 0x1) == 0x0) {
            index = d.size() - 1;
            if (index < 0) {
                return false;
            }
            list.add(this.d.remove(index));
            list2.add(Boolean.TRUE);
            return true;
        }
        else {
            if (s == null && index < 0) {
                index = -1;
            }
            else {
                int j;
                for (j = d.size() - 1; j >= 0; --j) {
                    final a a = this.d.get(j);
                    if (s != null && s.equals(a.t())) {
                        break;
                    }
                    if (index >= 0 && index == a.v) {
                        break;
                    }
                }
                if (j < 0) {
                    return false;
                }
                int n = j;
                if ((i & 0x1) != 0x0) {
                    while (true) {
                        i = j - 1;
                        if ((n = i) < 0) {
                            break;
                        }
                        final a a2 = this.d.get(i);
                        if (s != null) {
                            j = i;
                            if (s.equals(a2.t())) {
                                continue;
                            }
                        }
                        n = i;
                        if (index < 0) {
                            break;
                        }
                        n = i;
                        if (index != a2.v) {
                            break;
                        }
                        j = i;
                    }
                }
                index = n;
            }
            if (index == this.d.size() - 1) {
                return false;
            }
            for (i = this.d.size() - 1; i > index; --i) {
                list.add(this.d.remove(i));
                list2.add(Boolean.TRUE);
            }
            return true;
        }
    }
    
    public final void V() {
        if (this.H) {
            this.H = false;
            this.l1();
        }
    }
    
    public final int V0(final ArrayList list, final ArrayList list2, final int n, final int n2, final t.b b) {
        int i = n2 - 1;
        int n3 = n2;
        while (i >= n) {
            final a element = list.get(i);
            final boolean booleanValue = list2.get(i);
            int index = n3;
            if (element.x()) {
                index = n3;
                if (!element.v(list, i + 1, n2)) {
                    if (this.L == null) {
                        this.L = new ArrayList();
                    }
                    final p e = new p(element, booleanValue);
                    this.L.add(e);
                    element.z(e);
                    if (booleanValue) {
                        element.q();
                    }
                    else {
                        element.r(false);
                    }
                    index = n3 - 1;
                    if (i != index) {
                        list.remove(i);
                        list.add(index, element);
                    }
                    this.d(b);
                }
            }
            --i;
            n3 = index;
        }
        return n3;
    }
    
    public void W(final String s, FileDescriptor a, final PrintWriter printWriter, final String[] array) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("    ");
        final String string = sb.toString();
        this.c.e(s, a, printWriter, array);
        final ArrayList e = this.e;
        final int n = 0;
        if (e != null) {
            final int size = e.size();
            if (size > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int i = 0; i < size; ++i) {
                    final Fragment fragment = this.e.get(i);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        final ArrayList d = this.d;
        if (d != null) {
            final int size2 = d.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int j = 0; j < size2; ++j) {
                    final a a2 = this.d.get(j);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(j);
                    printWriter.print(": ");
                    printWriter.println(a2.toString());
                    a2.o(string, printWriter);
                }
            }
        }
        printWriter.print(s);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Back Stack Index: ");
        sb2.append(this.i.get());
        printWriter.println(sb2.toString());
        a = (FileDescriptor)this.a;
        // monitorenter(a)
        while (true) {
            try {
                final int size3 = this.a.size();
                if (size3 > 0) {
                    printWriter.print(s);
                    printWriter.println("Pending Actions:");
                    for (int k = n; k < size3; ++k) {
                        final n x = this.a.get(k);
                        printWriter.print(s);
                        printWriter.print("  #");
                        printWriter.print(k);
                        printWriter.print(": ");
                        printWriter.println(x);
                    }
                }
                // monitorexit(a)
                printWriter.print(s);
                printWriter.println("FragmentManager misc state:");
                printWriter.print(s);
                printWriter.print("  mHost=");
                printWriter.println(this.r);
                printWriter.print(s);
                printWriter.print("  mContainer=");
                printWriter.println(this.s);
                if (this.t != null) {
                    printWriter.print(s);
                    printWriter.print("  mParent=");
                    printWriter.println(this.t);
                }
                printWriter.print(s);
                printWriter.print("  mCurState=");
                printWriter.print(this.q);
                printWriter.print(" mStateSaved=");
                printWriter.print(this.E);
                printWriter.print(" mStopped=");
                printWriter.print(this.F);
                printWriter.print(" mDestroyed=");
                printWriter.println(this.G);
                if (this.D) {
                    printWriter.print(s);
                    printWriter.print("  mNeedMenuInvalidate=");
                    printWriter.println(this.D);
                }
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void W0(final l l, final boolean b) {
        this.o.o(l, b);
    }
    
    public final void X() {
        if (androidx.fragment.app.n.P) {
            final Iterator<B> iterator = this.r().iterator();
            while (iterator.hasNext()) {
                iterator.next().j();
            }
        }
        else if (!this.m.isEmpty()) {
            for (final Fragment fragment : this.m.keySet()) {
                this.n(fragment);
                this.N0(fragment);
            }
        }
    }
    
    public void X0(final Fragment fragment, final E.c o) {
        final HashSet set = this.m.get(fragment);
        if (set != null && set.remove(o) && set.isEmpty()) {
            this.m.remove(fragment);
            if (fragment.o < 5) {
                this.w(fragment);
                this.N0(fragment);
            }
        }
    }
    
    public void Y(final n e, final boolean b) {
        if (!b) {
            if (this.r == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            else {
                this.p();
            }
        }
        final ArrayList a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (this.r != null) {
                    this.a.add(e);
                    this.f1();
                    // monitorexit(a)
                    return;
                }
                if (b) {
                    // monitorexit(a)
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void Y0(final Fragment obj) {
        if (D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(obj);
            sb.append(" nesting=");
            sb.append(obj.F);
            Log.v("FragmentManager", sb.toString());
        }
        final boolean y = obj.Y();
        if (!obj.O || (y ^ true)) {
            this.c.s(obj);
            if (this.E0(obj)) {
                this.D = true;
            }
            obj.A = true;
            this.j1(obj);
        }
    }
    
    public final void Z(final boolean b) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.r != null) {
            if (Looper.myLooper() == this.r.l().getLooper()) {
                if (!b) {
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
        if (this.G) {
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }
    
    public final void Z0(final ArrayList list, final ArrayList list2) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == list2.size()) {
            this.e0(list, list2);
            final int size = list.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                int n2 = i;
                int n3 = n;
                if (!list.get(i).r) {
                    if (n != i) {
                        this.d0(list, list2, n, i);
                    }
                    int n4 = n3 = i + 1;
                    if (list2.get(i)) {
                        while ((n3 = n4) < size) {
                            n3 = n4;
                            if (!list2.get(n4)) {
                                break;
                            }
                            n3 = n4;
                            if (list.get(n4).r) {
                                break;
                            }
                            ++n4;
                        }
                    }
                    this.d0(list, list2, i, n3);
                    n2 = n3 - 1;
                }
                i = n2 + 1;
                n = n3;
            }
            if (n != size) {
                this.d0(list, list2, n, size);
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }
    
    public boolean a0(boolean b) {
        this.Z(b);
        b = false;
        while (this.k0(this.I, this.J)) {
            b = true;
            this.b = true;
            try {
                this.Z0(this.I, this.J);
                continue;
            }
            finally {
                this.q();
            }
            break;
        }
        this.n1();
        this.V();
        this.c.b();
        return b;
    }
    
    public void a1(final Fragment fragment) {
        this.M.m(fragment);
    }
    
    public void b0(final n n, final boolean b) {
        if (b && (this.r == null || this.G)) {
            return;
        }
        this.Z(b);
        if (n.a(this.I, this.J)) {
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
        final ArrayList l = this.l;
        if (l == null) {
            return;
        }
        if (l.size() <= 0) {
            return;
        }
        android.support.v4.media.a.a(this.l.get(0));
        throw null;
    }
    
    public void c1(final Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        final androidx.fragment.app.p p = (androidx.fragment.app.p)parcelable;
        if (p.o == null) {
            return;
        }
        this.c.t();
        for (final s s : p.o) {
            if (s != null) {
                final Fragment g = this.M.g(s.p);
                t t;
                if (g != null) {
                    if (D0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(g);
                        Log.v("FragmentManager", sb.toString());
                    }
                    t = new t(this.o, this.c, g, s);
                }
                else {
                    t = new t(this.o, this.c, this.r.i().getClassLoader(), this.p0(), s);
                }
                final Fragment k = t.k();
                k.G = this;
                if (D0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(k.t);
                    sb2.append("): ");
                    sb2.append(k);
                    Log.v("FragmentManager", sb2.toString());
                }
                t.o(this.r.i().getClassLoader());
                this.c.p(t);
                t.t(this.q);
            }
        }
        for (final Fragment obj : this.M.j()) {
            if (!this.c.c(obj.t)) {
                if (D0(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(obj);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(p.o);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.M.m(obj);
                obj.G = this;
                final t t2 = new t(this.o, this.c, obj);
                t2.t(1);
                t2.m();
                obj.A = true;
                t2.m();
            }
        }
        this.c.u(p.p);
        final androidx.fragment.app.b[] q = p.q;
        final int n = 0;
        if (q != null) {
            this.d = new ArrayList(p.q.length);
            int i = 0;
            while (true) {
                final androidx.fragment.app.b[] q2 = p.q;
                if (i >= q2.length) {
                    break;
                }
                final a a = q2[i].a(this);
                if (D0(2)) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i);
                    sb4.append(" (index ");
                    sb4.append(a.v);
                    sb4.append("): ");
                    sb4.append(a);
                    Log.v("FragmentManager", sb4.toString());
                    final PrintWriter printWriter = new PrintWriter(new A("FragmentManager"));
                    a.p("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(a);
                ++i;
            }
        }
        else {
            this.d = null;
        }
        this.i.set(p.r);
        final String s2 = p.s;
        if (s2 != null) {
            this.L(this.u = this.f0(s2));
        }
        final ArrayList t3 = p.t;
        if (t3 != null) {
            for (int j = n; j < t3.size(); ++j) {
                this.j.put(t3.get(j), p.u.get(j));
            }
        }
        this.C = new ArrayDeque(p.v);
    }
    
    public final void d(final t.b b) {
        final int q = this.q;
        if (q < 1) {
            return;
        }
        final int min = Math.min(q, 5);
        for (final Fragment fragment : this.c.n()) {
            if (fragment.o < min) {
                this.O0(fragment, min);
                if (fragment.V == null || fragment.N || !fragment.a0) {
                    continue;
                }
                b.add(fragment);
            }
        }
    }
    
    public final void d0(final ArrayList list, final ArrayList list2, final int n, final int n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public void e(final a e) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(e);
    }
    
    public final void e0(final ArrayList list, final ArrayList list2) {
        final ArrayList l = this.L;
        int size;
        if (l == null) {
            size = 0;
        }
        else {
            size = l.size();
        }
        int n2;
        int n3;
    Label_0241:
        for (int i = 0, n = size; i < n; i = n2 + 1, n = n3) {
            final p p2 = this.L.get(i);
            while (true) {
                Label_0125: {
                    if (list == null || p2.a) {
                        break Label_0125;
                    }
                    final int index = list.indexOf(p2.b);
                    if (index == -1 || list2 == null || !list2.get(index)) {
                        break Label_0125;
                    }
                    this.L.remove(i);
                    n2 = i - 1;
                    n3 = n - 1;
                    p2.c();
                    continue Label_0241;
                }
                if (!p2.e()) {
                    n3 = n;
                    n2 = i;
                    if (list == null) {
                        continue Label_0241;
                    }
                    n3 = n;
                    n2 = i;
                    if (!p2.b.v(list, 0, list.size())) {
                        continue Label_0241;
                    }
                }
                this.L.remove(i);
                n2 = i - 1;
                n3 = n - 1;
                if (list != null && !p2.a) {
                    final int index2 = list.indexOf(p2.b);
                    if (index2 != -1 && list2 != null && list2.get(index2)) {
                        continue;
                    }
                }
                break;
            }
            p2.d();
        }
    }
    
    public Parcelable e1() {
        this.j0();
        this.X();
        this.a0(true);
        this.E = true;
        this.M.n(true);
        final ArrayList v = this.c.v();
        final boolean empty = v.isEmpty();
        final androidx.fragment.app.b[] array = null;
        if (empty) {
            if (D0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        final ArrayList w = this.c.w();
        final ArrayList d = this.d;
        androidx.fragment.app.b[] q = array;
        if (d != null) {
            final int size = d.size();
            q = array;
            if (size > 0) {
                final androidx.fragment.app.b[] array2 = new androidx.fragment.app.b[size];
                int index = 0;
                while (true) {
                    q = array2;
                    if (index >= size) {
                        break;
                    }
                    array2[index] = new androidx.fragment.app.b((a)this.d.get(index));
                    if (D0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(index);
                        sb.append(": ");
                        sb.append(this.d.get(index));
                        Log.v("FragmentManager", sb.toString());
                    }
                    ++index;
                }
            }
        }
        final androidx.fragment.app.p p = new androidx.fragment.app.p();
        p.o = v;
        p.p = w;
        p.q = q;
        p.r = this.i.get();
        final Fragment u = this.u;
        if (u != null) {
            p.s = u.t;
        }
        p.t.addAll(this.j.keySet());
        p.u.addAll(this.j.values());
        p.v = new ArrayList(this.C);
        return (Parcelable)p;
    }
    
    public void f(final Fragment fragment, final E.c e) {
        if (this.m.get(fragment) == null) {
            this.m.put(fragment, new HashSet());
        }
        this.m.get(fragment).add(e);
    }
    
    public Fragment f0(final String s) {
        return this.c.f(s);
    }
    
    public void f1() {
    Label_0049_Outer:
        while (true) {
            final ArrayList a = this.a;
            // monitorenter(a)
        Label_0082_Outer:
            while (true) {
                while (true) {
                    boolean b = false;
                    boolean b2 = false;
                Label_0100:
                    while (true) {
                        Label_0095: {
                            while (true) {
                                try {
                                    final ArrayList l = this.L;
                                    b = false;
                                    if (l == null || l.isEmpty()) {
                                        break Label_0095;
                                    }
                                    b2 = true;
                                    if (this.a.size() == 1) {
                                        b = true;
                                    }
                                    break Label_0100;
                                    // monitorexit(a)
                                    throw;
                                    this.r.l().removeCallbacks(this.N);
                                    this.r.l().post(this.N);
                                    this.n1();
                                    // monitorexit(a)
                                    return;
                                }
                                finally {
                                    continue Label_0049_Outer;
                                }
                                break;
                            }
                        }
                        b2 = false;
                        continue Label_0049_Outer;
                    }
                    if (!b2 && !b) {
                        continue;
                    }
                    break;
                }
                continue Label_0082_Outer;
            }
        }
    }
    
    public void g(final Fragment obj) {
        if (D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
        final t v = this.v(obj);
        obj.G = this;
        this.c.p(v);
        if (!obj.O) {
            this.c.a(obj);
            obj.A = false;
            if (obj.V == null) {
                obj.b0 = false;
            }
            if (this.E0(obj)) {
                this.D = true;
            }
        }
    }
    
    public Fragment g0(final int n) {
        return this.c.g(n);
    }
    
    public void g1(final Fragment fragment, final boolean b) {
        final ViewGroup o0 = this.o0(fragment);
        if (o0 != null && o0 instanceof h) {
            ((h)o0).setDrawDisappearingViewsLast(b ^ true);
        }
    }
    
    public void h(final r e) {
        this.p.add(e);
    }
    
    public Fragment h0(final String s) {
        return this.c.h(s);
    }
    
    public void h1(final Fragment obj, final d.c f0) {
        if (obj.equals(this.f0(obj.t)) && (obj.H == null || obj.G == this)) {
            obj.f0 = f0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(obj);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void i(final Fragment fragment) {
        this.M.e(fragment);
    }
    
    public Fragment i0(final String s) {
        return this.c.i(s);
    }
    
    public void i1(final Fragment fragment) {
        Label_0085: {
            if (fragment != null) {
                if (fragment.equals(this.f0(fragment.t))) {
                    if (fragment.H == null) {
                        break Label_0085;
                    }
                    if (fragment.G == this) {
                        break Label_0085;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        final Fragment u = this.u;
        this.u = fragment;
        this.L(u);
        this.L(this.u);
    }
    
    public int j() {
        return this.i.getAndIncrement();
    }
    
    public final void j0() {
        if (androidx.fragment.app.n.P) {
            final Iterator<B> iterator = this.r().iterator();
            while (iterator.hasNext()) {
                iterator.next().k();
            }
        }
        else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }
    
    public final void j1(final Fragment fragment) {
        final ViewGroup o0 = this.o0(fragment);
        if (o0 != null && fragment.C() > 0) {
            if (((View)o0).getTag(U.b.c) == null) {
                ((View)o0).setTag(U.b.c, (Object)fragment);
            }
            ((Fragment)((View)o0).getTag(U.b.c)).z1(fragment.C());
        }
    }
    
    public void k(androidx.fragment.app.k r, final g s, final Fragment t) {
        if (this.r == null) {
            this.r = r;
            this.s = s;
            Label_0059: {
                r r2;
                if ((this.t = t) != null) {
                    r2 = new r() {
                        @Override
                        public void a(final n n, final Fragment fragment) {
                            t.k0(fragment);
                        }
                    };
                }
                else {
                    if (!(r instanceof r)) {
                        break Label_0059;
                    }
                    r2 = (r)r;
                }
                this.h(r2);
            }
            if (this.t != null) {
                this.n1();
            }
            if (r instanceof androidx.activity.c) {
                Object o = r;
                final OnBackPressedDispatcher j = ((androidx.activity.c)o).j();
                this.g = j;
                if (t != null) {
                    o = t;
                }
                j.a((androidx.lifecycle.h)o, this.h);
            }
            q m;
            if (t != null) {
                m = t.G.m0(t);
            }
            else if (r instanceof androidx.lifecycle.u) {
                m = androidx.fragment.app.q.i(((androidx.lifecycle.u)r).d());
            }
            else {
                m = new q(false);
            }
            (this.M = m).n(this.I0());
            this.c.x(this.M);
            r = this.r;
            if (r instanceof androidx.activity.result.d) {
                final ActivityResultRegistry c = ((androidx.activity.result.d)r).c();
                String string;
                if (t != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(t.t);
                    sb.append(":");
                    string = sb.toString();
                }
                else {
                    string = "";
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentManager:");
                sb2.append(string);
                final String string2 = sb2.toString();
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append("StartActivityForResult");
                this.z = c.j(sb3.toString(), new d.c(), new androidx.activity.result.b() {
                    public void b(final androidx.activity.result.a a) {
                        final m m = androidx.fragment.app.n.this.C.pollFirst();
                        if (m == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No Activities were started for result for ");
                            sb.append(this);
                            Log.w("FragmentManager", sb.toString());
                            return;
                        }
                        final String o = m.o;
                        final int p = m.p;
                        final Fragment i = androidx.fragment.app.n.c(androidx.fragment.app.n.this).i(o);
                        if (i == null) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Activity result delivered for unknown Fragment ");
                            sb2.append(o);
                            Log.w("FragmentManager", sb2.toString());
                            return;
                        }
                        i.h0(p, a.b(), a.a());
                    }
                });
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string2);
                sb4.append("StartIntentSenderForResult");
                this.A = c.j(sb4.toString(), new k(), new androidx.activity.result.b() {
                    public void b(final androidx.activity.result.a a) {
                        final m m = androidx.fragment.app.n.this.C.pollFirst();
                        if (m == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No IntentSenders were started for ");
                            sb.append(this);
                            Log.w("FragmentManager", sb.toString());
                            return;
                        }
                        final String o = m.o;
                        final int p = m.p;
                        final Fragment i = androidx.fragment.app.n.c(androidx.fragment.app.n.this).i(o);
                        if (i == null) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Intent Sender result delivered for unknown Fragment ");
                            sb2.append(o);
                            Log.w("FragmentManager", sb2.toString());
                            return;
                        }
                        i.h0(p, a.b(), a.a());
                    }
                });
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string2);
                sb5.append("RequestPermissions");
                this.B = c.j(sb5.toString(), new d.b(), new androidx.activity.result.b() {
                    public void b(final Map map) {
                        final String[] array = map.keySet().toArray(new String[0]);
                        final ArrayList<Boolean> list = new ArrayList<Boolean>((Collection<? extends Boolean>)map.values());
                        final int[] array2 = new int[list.size()];
                        for (int i = 0; i < list.size(); ++i) {
                            int n;
                            if (list.get(i)) {
                                n = 0;
                            }
                            else {
                                n = -1;
                            }
                            array2[i] = n;
                        }
                        final m m = androidx.fragment.app.n.this.C.pollFirst();
                        StringBuilder sb;
                        if (m == null) {
                            sb = new StringBuilder();
                            sb.append("No permissions were requested for ");
                            sb.append(this);
                        }
                        else {
                            final String o = m.o;
                            final int p = m.p;
                            final Fragment j = androidx.fragment.app.n.c(androidx.fragment.app.n.this).i(o);
                            if (j != null) {
                                j.G0(p, array, array2);
                                return;
                            }
                            sb = new StringBuilder();
                            sb.append("Permission request result delivered for unknown Fragment ");
                            sb.append(o);
                        }
                        Log.w("FragmentManager", sb.toString());
                    }
                });
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }
    
    public final boolean k0(final ArrayList list, final ArrayList list2) {
        final ArrayList a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                final boolean empty = this.a.isEmpty();
                int i = 0;
                if (empty) {
                    // monitorexit(a)
                    return false;
                }
                final int size = this.a.size();
                boolean b = false;
                while (i < size) {
                    b |= this.a.get(i).a(list, list2);
                    ++i;
                }
                this.a.clear();
                this.r.l().removeCallbacks(this.N);
                // monitorexit(a)
                return b;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void k1(final Fragment obj) {
        if (D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(obj);
            Log.v("FragmentManager", sb.toString());
        }
        if (obj.N) {
            obj.N = false;
            obj.b0 ^= true;
        }
    }
    
    public void l(final Fragment fragment) {
        if (D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.O) {
            fragment.O = false;
            if (!fragment.z) {
                this.c.a(fragment);
                if (D0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (this.E0(fragment)) {
                    this.D = true;
                }
            }
        }
    }
    
    public int l0() {
        final ArrayList d = this.d;
        if (d != null) {
            return d.size();
        }
        return 0;
    }
    
    public final void l1() {
        final Iterator<t> iterator = this.c.k().iterator();
        while (iterator.hasNext()) {
            this.Q0(iterator.next());
        }
    }
    
    public v m() {
        return new a(this);
    }
    
    public final q m0(final Fragment fragment) {
        return this.M.h(fragment);
    }
    
    public void m1(final l l) {
        this.o.p(l);
    }
    
    public final void n(final Fragment fragment) {
        final HashSet<E.c> set = this.m.get(fragment);
        if (set != null) {
            final Iterator<E.c> iterator = set.iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
            set.clear();
            this.w(fragment);
            this.m.remove(fragment);
        }
    }
    
    public g n0() {
        return this.s;
    }
    
    public final void n1() {
        Object o = this.a;
        // monitorenter(o)
        while (true) {
            try {
                final boolean empty = this.a.isEmpty();
                boolean b = true;
                if (!empty) {
                    this.h.f(true);
                    // monitorexit(o)
                    return;
                }
                // monitorexit(o)
                o = this.h;
                if (this.l0() <= 0 || !this.G0(this.t)) {
                    b = false;
                }
                ((b)o).f(b);
                return;
                // monitorexit(o)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public boolean o() {
        final Iterator<Fragment> iterator = this.c.l().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment = iterator.next();
            int e0 = n;
            if (fragment != null) {
                e0 = (this.E0(fragment) ? 1 : 0);
            }
            if ((n = e0) != 0) {
                return true;
            }
        }
        return false;
    }
    
    public final ViewGroup o0(final Fragment fragment) {
        final ViewGroup u = fragment.U;
        if (u != null) {
            return u;
        }
        if (fragment.L <= 0) {
            return null;
        }
        if (this.s.f()) {
            final View e = this.s.e(fragment.L);
            if (e instanceof ViewGroup) {
                return (ViewGroup)e;
            }
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
        final j v = this.v;
        if (v != null) {
            return v;
        }
        final Fragment t = this.t;
        if (t != null) {
            return t.G.p0();
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
        final HashSet<B> set = new HashSet<B>();
        final Iterator<t> iterator = this.c.k().iterator();
        while (iterator.hasNext()) {
            final ViewGroup u = iterator.next().k().U;
            if (u != null) {
                set.add(androidx.fragment.app.B.o(u, this.x0()));
            }
        }
        return set;
    }
    
    public List r0() {
        return this.c.n();
    }
    
    public final Set s(final ArrayList list, int i, final int n) {
        final HashSet<B> set = new HashSet<B>();
        while (i < n) {
            final Iterator<v.a> iterator = list.get(i).c.iterator();
            while (iterator.hasNext()) {
                final Fragment b = iterator.next().b;
                if (b != null) {
                    final ViewGroup u = b.U;
                    if (u == null) {
                        continue;
                    }
                    set.add(androidx.fragment.app.B.n(u, this));
                }
            }
            ++i;
        }
        return set;
    }
    
    public androidx.fragment.app.k s0() {
        return this.r;
    }
    
    public void t(final a e, final boolean b, final boolean b2, final boolean b3) {
        if (b) {
            e.r(b3);
        }
        else {
            e.q();
        }
        final ArrayList<a> list = new ArrayList<a>(1);
        final ArrayList<Boolean> list2 = new ArrayList<Boolean>(1);
        list.add(e);
        list2.add(b);
        if (b2 && this.q >= 1) {
            androidx.fragment.app.w.B(this.r.i(), this.s, list, list2, 0, 1, true, this.n);
        }
        if (b3) {
            this.M0(this.q, true);
        }
        for (final Fragment fragment : this.c.l()) {
            if (fragment != null && fragment.V != null && fragment.a0 && e.u(fragment.L)) {
                final float c0 = fragment.c0;
                if (c0 > 0.0f) {
                    fragment.V.setAlpha(c0);
                }
                if (b3) {
                    fragment.c0 = 0.0f;
                }
                else {
                    fragment.c0 = -1.0f;
                    fragment.a0 = false;
                }
            }
        }
    }
    
    public LayoutInflater$Factory2 t0() {
        return (LayoutInflater$Factory2)this.f;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        final Fragment t = this.t;
        Label_0141: {
            Object o;
            if (t != null) {
                sb.append(t.getClass().getSimpleName());
                sb.append("{");
                o = this.t;
            }
            else {
                final androidx.fragment.app.k r = this.r;
                if (r == null) {
                    sb.append("null");
                    break Label_0141;
                }
                sb.append(r.getClass().getSimpleName());
                sb.append("{");
                o = this.r;
            }
            sb.append(Integer.toHexString(System.identityHashCode(o)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }
    
    public final void u(final Fragment fragment) {
        Label_0195: {
            if (fragment.V != null) {
                final f.d b = androidx.fragment.app.f.b(this.r.i(), fragment, fragment.N ^ true);
                if (b != null) {
                    final Animator b2 = b.b;
                    if (b2 != null) {
                        b2.setTarget((Object)fragment.V);
                        if (fragment.N) {
                            if (fragment.X()) {
                                fragment.y1(false);
                            }
                            else {
                                final ViewGroup u = fragment.U;
                                final View v = fragment.V;
                                u.startViewTransition(v);
                                b.b.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                                    public void onAnimationEnd(final Animator animator) {
                                        u.endViewTransition(v);
                                        animator.removeListener((Animator$AnimatorListener)this);
                                        final Fragment c = fragment;
                                        final View v = c.V;
                                        if (v != null && c.N) {
                                            v.setVisibility(8);
                                        }
                                    }
                                });
                            }
                        }
                        else {
                            fragment.V.setVisibility(0);
                        }
                        b.b.start();
                        break Label_0195;
                    }
                }
                if (b != null) {
                    fragment.V.startAnimation(b.a);
                    b.a.start();
                }
                int visibility;
                if (fragment.N && !fragment.X()) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                fragment.V.setVisibility(visibility);
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
    
    public t v(final Fragment fragment) {
        final t m = this.c.m(fragment.t);
        if (m != null) {
            return m;
        }
        final t t = new t(this.o, this.c, fragment);
        t.o(this.r.i().getClassLoader());
        t.t(this.q);
        return t;
    }
    
    public Fragment v0() {
        return this.t;
    }
    
    public final void w(final Fragment fragment) {
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
    
    public void x(final Fragment fragment) {
        if (D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.O) {
            fragment.O = true;
            if (fragment.z) {
                if (D0(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
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
        final C x = this.x;
        if (x != null) {
            return x;
        }
        final Fragment t = this.t;
        if (t != null) {
            return t.G.x0();
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
    
    public androidx.lifecycle.t z0(final Fragment fragment) {
        return this.M.k(fragment);
    }
    
    public static class k extends d.a
    {
        public Intent d(final Context context, final e e) {
            final Intent obj = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            final Intent a = e.a();
            e a2 = e;
            if (a != null) {
                final Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2 = e;
                if (bundleExtra != null) {
                    obj.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    a2 = e;
                    if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        a2 = new e.b(e.d()).b(null).c(e.c(), e.b()).a();
                    }
                }
            }
            obj.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)a2);
            if (androidx.fragment.app.n.D0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(obj);
                Log.v("FragmentManager", sb.toString());
            }
            return obj;
        }
        
        public androidx.activity.result.a e(final int n, final Intent intent) {
            return new androidx.activity.result.a(n, intent);
        }
    }
    
    public abstract static class l
    {
        public void a(final n n, final Fragment fragment, final Bundle bundle) {
        }
        
        public void b(final n n, final Fragment fragment, final Context context) {
        }
        
        public void c(final n n, final Fragment fragment, final Bundle bundle) {
        }
        
        public void d(final n n, final Fragment fragment) {
        }
        
        public void e(final n n, final Fragment fragment) {
        }
        
        public void f(final n n, final Fragment fragment) {
        }
        
        public void g(final n n, final Fragment fragment, final Context context) {
        }
        
        public void h(final n n, final Fragment fragment, final Bundle bundle) {
        }
        
        public void i(final n n, final Fragment fragment) {
        }
        
        public void j(final n n, final Fragment fragment, final Bundle bundle) {
        }
        
        public void k(final n n, final Fragment fragment) {
        }
        
        public void l(final n n, final Fragment fragment) {
        }
        
        public void m(final n n, final Fragment fragment, final View view, final Bundle bundle) {
        }
        
        public void n(final n n, final Fragment fragment) {
        }
    }
    
    public static class m implements Parcelable
    {
        public static final Parcelable$Creator<m> CREATOR;
        public String o;
        public int p;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public m a(final Parcel parcel) {
                    return new m(parcel);
                }
                
                public m[] b(final int n) {
                    return new m[n];
                }
            };
        }
        
        public m(final Parcel parcel) {
            this.o = parcel.readString();
            this.p = parcel.readInt();
        }
        
        public m(final String o, final int p2) {
            this.o = o;
            this.p = p2;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeString(this.o);
            parcel.writeInt(this.p);
        }
    }
    
    public interface n
    {
        boolean a(final ArrayList p0, final ArrayList p1);
    }
    
    public class o implements n
    {
        public final String a;
        public final int b;
        public final int c;
        
        public o(final String a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public boolean a(final ArrayList list, final ArrayList list2) {
            final Fragment u = n.this.u;
            return (u == null || this.b >= 0 || this.a != null || !u.s().S0()) && n.this.U0(list, list2, this.a, this.b, this.c);
        }
    }
    
    public static class p implements Fragment.k
    {
        public final boolean a;
        public final a b;
        public int c;
        
        public p(final a b, final boolean a) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void a() {
            final int c = this.c - 1;
            this.c = c;
            if (c != 0) {
                return;
            }
            this.b.t.f1();
        }
        
        @Override
        public void b() {
            ++this.c;
        }
        
        public void c() {
            final a b = this.b;
            b.t.t(b, this.a, false, false);
        }
        
        public void d() {
            final boolean b = this.c > 0;
            for (final Fragment fragment : this.b.t.r0()) {
                fragment.B1(null);
                if (b && fragment.a0()) {
                    fragment.G1();
                }
            }
            final a b2 = this.b;
            b2.t.t(b2, this.a, b ^ true, true);
        }
        
        public boolean e() {
            return this.c == 0;
        }
    }
}
