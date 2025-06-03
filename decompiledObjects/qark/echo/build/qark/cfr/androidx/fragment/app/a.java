/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.View
 *  java.io.PrintWriter
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 */
package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.A;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.k;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import androidx.lifecycle.d;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

public final class a
extends v
implements n.n {
    public final n t;
    public boolean u;
    public int v;

    public a(n n8) {
        j j8 = n8.p0();
        ClassLoader classLoader = n8.s0() != null ? n8.s0().i().getClassLoader() : null;
        super(j8, classLoader);
        this.v = -1;
        this.t = n8;
    }

    public static boolean w(v.a object) {
        object = object.b;
        if (object != null && object.z && object.V != null && !object.O && !object.N && object.a0()) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Fragment A(ArrayList var1_1, Fragment var2_2) {
        var3_3 = this.c.size() - 1;
        while (var3_3 >= 0) {
            block8 : {
                var5_5 = (v.a)this.c.get(var3_3);
                var4_4 = var5_5.a;
                if (var4_4 == 1) break block8;
                if (var4_4 == 3) ** GOTO lbl-1000
                switch (var4_4) {
                    default: {
                        ** break;
                    }
                    case 10: {
                        var5_5.h = var5_5.g;
                        ** break;
                    }
                    case 9: {
                        var2_2 = var5_5.b;
                        ** break;
                    }
                    case 8: {
                        var2_2 = null;
                        ** break;
                    }
                    case 6: lbl-1000: // 2 sources:
                    {
                        var1_1.add((Object)var5_5.b);
                        ** break;
                    }
                    case 7: 
                }
            }
            var1_1.remove((Object)var5_5.b);
lbl25: // 6 sources:
            --var3_3;
        }
        return var2_2;
    }

    @Override
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Run: ");
            stringBuilder.append((Object)this);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        arrayList.add((Object)this);
        arrayList2.add((Object)Boolean.FALSE);
        if (this.i) {
            this.t.e(this);
        }
        return true;
    }

    @Override
    public int f() {
        return this.n(false);
    }

    @Override
    public int g() {
        return this.n(true);
    }

    @Override
    public void h() {
        this.i();
        this.t.b0(this, true);
    }

    @Override
    public void j(int n8, Fragment fragment, String string2, int n9) {
        super.j(n8, fragment, string2, n9);
        fragment.G = this.t;
    }

    @Override
    public v k(Fragment fragment) {
        n n8 = fragment.G;
        if (n8 != null && n8 != this.t) {
            n8 = new StringBuilder();
            n8.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            n8.append(fragment.toString());
            n8.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(n8.toString());
        }
        return super.k(fragment);
    }

    public void m(int n8) {
        Object object;
        if (!this.i) {
            return;
        }
        if (n.D0(2)) {
            object = new StringBuilder();
            object.append("Bump nesting in ");
            object.append((Object)this);
            object.append(" by ");
            object.append(n8);
            Log.v((String)"FragmentManager", (String)object.toString());
        }
        int n9 = this.c.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            object = (v.a)this.c.get(i8);
            Fragment fragment = object.b;
            if (fragment == null) continue;
            fragment.F += n8;
            if (!n.D0(2)) continue;
            fragment = new StringBuilder();
            fragment.append("Bump nesting of ");
            fragment.append((Object)object.b);
            fragment.append(" to ");
            fragment.append(object.b.F);
            Log.v((String)"FragmentManager", (String)fragment.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int n(boolean bl) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (n.D0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Commit: ");
            stringBuilder.append((Object)this);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            stringBuilder = new PrintWriter((Writer)new A("FragmentManager"));
            this.o("  ", (PrintWriter)stringBuilder);
            stringBuilder.close();
        }
        this.u = true;
        int n8 = this.i ? this.t.j() : -1;
        this.v = n8;
        this.t.Y(this, bl);
        return this.v;
    }

    public void o(String string2, PrintWriter printWriter) {
        this.p(string2, printWriter, true);
    }

    public void p(String string2, PrintWriter printWriter, boolean bl) {
        if (bl) {
            printWriter.print(string2);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(string2);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString((int)this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(string2);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString((int)this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString((int)this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(string2);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString((int)this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString((int)this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(string2);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString((int)this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println((Object)this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(string2);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString((int)this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println((Object)this.o);
            }
        }
        if (!this.c.isEmpty()) {
            printWriter.print(string2);
            printWriter.println("Operations:");
            int n8 = this.c.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                String string3;
                v.a a8 = (v.a)this.c.get(i8);
                switch (a8.a) {
                    default: {
                        string3 = new StringBuilder();
                        string3.append("cmd=");
                        string3.append(a8.a);
                        string3 = string3.toString();
                        break;
                    }
                    case 10: {
                        string3 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string3 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string3 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string3 = "ATTACH";
                        break;
                    }
                    case 6: {
                        string3 = "DETACH";
                        break;
                    }
                    case 5: {
                        string3 = "SHOW";
                        break;
                    }
                    case 4: {
                        string3 = "HIDE";
                        break;
                    }
                    case 3: {
                        string3 = "REMOVE";
                        break;
                    }
                    case 2: {
                        string3 = "REPLACE";
                        break;
                    }
                    case 1: {
                        string3 = "ADD";
                        break;
                    }
                    case 0: {
                        string3 = "NULL";
                    }
                }
                printWriter.print(string2);
                printWriter.print("  Op #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.print(string3);
                printWriter.print(" ");
                printWriter.println((Object)a8.b);
                if (!bl) continue;
                if (a8.c != 0 || a8.d != 0) {
                    printWriter.print(string2);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString((int)a8.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString((int)a8.d));
                }
                if (a8.e == 0 && a8.f == 0) continue;
                printWriter.print(string2);
                printWriter.print("popEnterAnim=#");
                printWriter.print(Integer.toHexString((int)a8.e));
                printWriter.print(" popExitAnim=#");
                printWriter.println(Integer.toHexString((int)a8.f));
            }
        }
    }

    public void q() {
        Object object;
        int n8 = this.c.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            object = (v.a)this.c.get(i8);
            Fragment fragment = object.b;
            if (fragment != null) {
                fragment.A1(this.h);
                fragment.E1(this.p, this.q);
            }
            switch (object.a) {
                default: {
                    fragment = new StringBuilder();
                    fragment.append("Unknown cmd: ");
                    fragment.append(object.a);
                    throw new IllegalArgumentException(fragment.toString());
                }
                case 10: {
                    this.t.h1(fragment, object.h);
                    break;
                }
                case 9: {
                    this.t.i1(null);
                    break;
                }
                case 8: {
                    this.t.i1(fragment);
                    break;
                }
                case 7: {
                    fragment.z1(object.c);
                    this.t.g1(fragment, false);
                    this.t.l(fragment);
                    break;
                }
                case 6: {
                    fragment.z1(object.d);
                    this.t.x(fragment);
                    break;
                }
                case 5: {
                    fragment.z1(object.c);
                    this.t.g1(fragment, false);
                    this.t.k1(fragment);
                    break;
                }
                case 4: {
                    fragment.z1(object.d);
                    this.t.B0(fragment);
                    break;
                }
                case 3: {
                    fragment.z1(object.d);
                    this.t.Y0(fragment);
                    break;
                }
                case 1: {
                    fragment.z1(object.c);
                    this.t.g1(fragment, false);
                    this.t.g(fragment);
                }
            }
            if (this.r || object.a == 1 || fragment == null || n.P) continue;
            this.t.L0(fragment);
        }
        if (!this.r && !n.P) {
            object = this.t;
            object.M0(object.q, true);
        }
    }

    public void r(boolean bl) {
        Object object;
        for (int i8 = this.c.size() - 1; i8 >= 0; --i8) {
            object = (v.a)this.c.get(i8);
            Fragment fragment = object.b;
            if (fragment != null) {
                fragment.A1(n.d1(this.h));
                fragment.E1(this.q, this.p);
            }
            switch (object.a) {
                default: {
                    fragment = new StringBuilder();
                    fragment.append("Unknown cmd: ");
                    fragment.append(object.a);
                    throw new IllegalArgumentException(fragment.toString());
                }
                case 10: {
                    this.t.h1(fragment, object.g);
                    break;
                }
                case 9: {
                    this.t.i1(fragment);
                    break;
                }
                case 8: {
                    this.t.i1(null);
                    break;
                }
                case 7: {
                    fragment.z1(object.f);
                    this.t.g1(fragment, true);
                    this.t.x(fragment);
                    break;
                }
                case 6: {
                    fragment.z1(object.e);
                    this.t.l(fragment);
                    break;
                }
                case 5: {
                    fragment.z1(object.f);
                    this.t.g1(fragment, true);
                    this.t.B0(fragment);
                    break;
                }
                case 4: {
                    fragment.z1(object.e);
                    this.t.k1(fragment);
                    break;
                }
                case 3: {
                    fragment.z1(object.e);
                    this.t.g(fragment);
                    break;
                }
                case 1: {
                    fragment.z1(object.f);
                    this.t.g1(fragment, true);
                    this.t.Y0(fragment);
                }
            }
            if (this.r || object.a == 3 || fragment == null || n.P) continue;
            this.t.L0(fragment);
        }
        if (!this.r && bl && !n.P) {
            object = this.t;
            object.M0(object.q, true);
        }
    }

    public Fragment s(ArrayList arrayList, Fragment object) {
        int n8 = 0;
        Fragment fragment = object;
        while (n8 < this.c.size()) {
            int n9;
            block14 : {
                block11 : {
                    block12 : {
                        Object object2;
                        block13 : {
                            object2 = (v.a)this.c.get(n8);
                            n9 = object2.a;
                            if (n9 == 1) break block11;
                            if (n9 == 2) break block12;
                            if (n9 == 3 || n9 == 6) break block13;
                            if (n9 == 7) break block11;
                            if (n9 != 8) {
                                object = fragment;
                                n9 = n8;
                            } else {
                                this.c.add(n8, (Object)new v.a(9, fragment));
                                n9 = n8 + 1;
                                object = object2.b;
                            }
                            break block14;
                        }
                        arrayList.remove((Object)object2.b);
                        object2 = object2.b;
                        object = fragment;
                        n9 = n8;
                        if (object2 == fragment) {
                            this.c.add(n8, (Object)new v.a(9, (Fragment)object2));
                            n9 = n8 + 1;
                            object = null;
                        }
                        break block14;
                    }
                    Fragment fragment2 = object2.b;
                    int n10 = fragment2.L;
                    boolean bl = false;
                    n9 = n8;
                    object = fragment;
                    for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
                        Fragment fragment3 = (Fragment)arrayList.get(i8);
                        fragment = object;
                        n8 = n9;
                        boolean bl2 = bl;
                        if (fragment3.L == n10) {
                            if (fragment3 == fragment2) {
                                bl2 = true;
                                fragment = object;
                                n8 = n9;
                            } else {
                                fragment = object;
                                n8 = n9;
                                if (fragment3 == object) {
                                    this.c.add(n9, (Object)new v.a(9, fragment3));
                                    n8 = n9 + 1;
                                    fragment = null;
                                }
                                object = new v.a(3, fragment3);
                                object.c = object2.c;
                                object.e = object2.e;
                                object.d = object2.d;
                                object.f = object2.f;
                                this.c.add(n8, object);
                                arrayList.remove((Object)fragment3);
                                ++n8;
                                bl2 = bl;
                            }
                        }
                        object = fragment;
                        n9 = n8;
                        bl = bl2;
                    }
                    if (bl) {
                        this.c.remove(n9);
                        --n9;
                    } else {
                        object2.a = 1;
                        arrayList.add((Object)fragment2);
                    }
                    break block14;
                }
                arrayList.add((Object)object2.b);
                n9 = n8;
                object = fragment;
            }
            n8 = n9 + 1;
            fragment = object;
        }
        return fragment;
    }

    public String t() {
        return this.k;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        if (this.v >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.v);
        }
        if (this.k != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.k);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean u(int n8) {
        int n9 = this.c.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            Fragment fragment = ((v.a)this.c.get((int)i8)).b;
            int n10 = fragment != null ? fragment.L : 0;
            if (n10 == 0 || n10 != n8) continue;
            return true;
        }
        return false;
    }

    public boolean v(ArrayList arrayList, int n8, int n9) {
        if (n9 == n8) {
            return false;
        }
        int n10 = this.c.size();
        int n11 = -1;
        for (int i8 = 0; i8 < n10; ++i8) {
            Object object = ((v.a)this.c.get((int)i8)).b;
            int n12 = object != null ? object.L : 0;
            int n13 = n11;
            if (n12 != 0) {
                n13 = n11;
                if (n12 != n11) {
                    for (n11 = n8; n11 < n9; ++n11) {
                        object = (a)arrayList.get(n11);
                        int n14 = object.c.size();
                        for (n13 = 0; n13 < n14; ++n13) {
                            Fragment fragment = ((v.a)object.c.get((int)n13)).b;
                            int n15 = fragment != null ? fragment.L : 0;
                            if (n15 != n12) continue;
                            return true;
                        }
                    }
                    n13 = n12;
                }
            }
            n11 = n13;
        }
        return false;
    }

    public boolean x() {
        for (int i8 = 0; i8 < this.c.size(); ++i8) {
            if (!a.w((v.a)this.c.get(i8))) continue;
            return true;
        }
        return false;
    }

    public void y() {
        if (this.s != null) {
            for (int i8 = 0; i8 < this.s.size(); ++i8) {
                ((Runnable)this.s.get(i8)).run();
            }
            this.s = null;
        }
    }

    public void z(Fragment.k k8) {
        for (int i8 = 0; i8 < this.c.size(); ++i8) {
            v.a a8 = (v.a)this.c.get(i8);
            if (!a.w(a8)) continue;
            a8.b.B1(k8);
        }
    }
}

