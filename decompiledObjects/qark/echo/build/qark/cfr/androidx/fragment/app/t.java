/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.os.Bundle
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.Boolean
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.List
 */
package androidx.fragment.app;

import U.b;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.B;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.j;
import androidx.fragment.app.k;
import androidx.fragment.app.m;
import androidx.fragment.app.n;
import androidx.fragment.app.q;
import androidx.fragment.app.s;
import androidx.fragment.app.u;
import androidx.fragment.app.z;
import androidx.lifecycle.d;
import androidx.lifecycle.l;
import java.util.Iterator;
import java.util.List;

public class t {
    public final m a;
    public final u b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public t(m m8, u u8, Fragment fragment) {
        this.a = m8;
        this.b = u8;
        this.c = fragment;
    }

    /*
     * Enabled aggressive block sorting
     */
    public t(m object, u u8, Fragment fragment, s s8) {
        this.a = object;
        this.b = u8;
        this.c = fragment;
        fragment.q = null;
        fragment.r = null;
        fragment.F = 0;
        fragment.C = false;
        fragment.z = false;
        object = fragment.v;
        object = object != null ? object.t : null;
        fragment.w = object;
        fragment.v = null;
        object = s8.A;
        if (object == null) {
            object = new Bundle();
        }
        fragment.p = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public t(m m8, u object, ClassLoader classLoader, j j8, s s8) {
        this.a = m8;
        this.b = object;
        this.c = object = j8.a(classLoader, s8.o);
        m8 = s8.x;
        if (m8 != null) {
            m8.setClassLoader(classLoader);
        }
        object.w1(s8.x);
        object.t = s8.p;
        object.B = s8.q;
        object.D = true;
        object.K = s8.r;
        object.L = s8.s;
        object.M = s8.t;
        object.P = s8.u;
        object.A = s8.v;
        object.O = s8.w;
        object.N = s8.y;
        object.f0 = d.c.values()[s8.z];
        m8 = s8.A;
        if (m8 == null) {
            m8 = new Bundle();
        }
        object.p = m8;
        if (n.D0(2)) {
            m8 = new StringBuilder();
            m8.append("Instantiated fragment ");
            m8.append(object);
            Log.v((String)"FragmentManager", (String)m8.toString());
        }
    }

    public void a() {
        Object object;
        if (n.D0(3)) {
            object = new StringBuilder();
            object.append("moveto ACTIVITY_CREATED: ");
            object.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)object.toString());
        }
        object = this.c;
        object.N0(object.p);
        object = this.a;
        Fragment fragment = this.c;
        object.a(fragment, fragment.p, false);
    }

    public void b() {
        int n8 = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.U.addView(fragment.V, n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c() {
        Object object;
        if (n.D0(3)) {
            object = new StringBuilder();
            object.append("moveto ATTACHED: ");
            object.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)object.toString());
        }
        Object object2 = this.c;
        Fragment fragment = object2.v;
        object = null;
        if (fragment != null) {
            object = this.b.m(fragment.t);
            if (object == null) {
                object = new StringBuilder();
                object.append("Fragment ");
                object.append((Object)this.c);
                object.append(" declared target fragment ");
                object.append((Object)this.c.v);
                object.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(object.toString());
            }
            object2 = this.c;
            object2.w = object2.v.t;
            object2.v = null;
        } else {
            object2 = object2.w;
            if (object2 != null && (object = this.b.m((String)object2)) == null) {
                object = new StringBuilder();
                object.append("Fragment ");
                object.append((Object)this.c);
                object.append(" declared target fragment ");
                object.append(this.c.w);
                object.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(object.toString());
            }
        }
        if (object != null && (n.P || object.k().o < 1)) {
            object.m();
        }
        object = this.c;
        object.H = object.G.s0();
        object = this.c;
        object.J = object.G.v0();
        this.a.g(this.c, false);
        this.c.O0();
        this.a.b(this.c, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int d() {
        var4_1 = this.c;
        if (var4_1.G == null) {
            return var4_1.o;
        }
        var2_2 = this.e;
        var3_3 = .a[var4_1.f0.ordinal()];
        var1_4 = var2_2;
        if (var3_3 != 1) {
            var1_4 = var3_3 != 2 ? (var3_3 != 3 ? (var3_3 != 4 ? Math.min((int)var2_2, (int)-1) : Math.min((int)var2_2, (int)0)) : Math.min((int)var2_2, (int)1)) : Math.min((int)var2_2, (int)5);
        }
        var4_1 = this.c;
        var2_2 = var1_4;
        if (var4_1.B) {
            if (var4_1.C) {
                var1_4 = Math.max((int)this.e, (int)2);
                var4_1 = this.c.V;
                var2_2 = var1_4;
                if (var4_1 != null) {
                    var2_2 = var1_4;
                    if (var4_1.getParent() == null) {
                        var2_2 = Math.min((int)var1_4, (int)2);
                    }
                }
            } else {
                var2_2 = this.e < 4 ? Math.min((int)var1_4, (int)var4_1.o) : Math.min((int)var1_4, (int)1);
            }
        }
        var3_3 = var2_2;
        if (!this.c.z) {
            var3_3 = Math.min((int)var2_2, (int)1);
        }
        if (!n.P) ** GOTO lbl-1000
        var4_1 = this.c;
        var5_5 = var4_1.U;
        if (var5_5 != null) {
            var4_1 = B.n(var5_5, var4_1.F()).l(this);
        } else lbl-1000: // 2 sources:
        {
            var4_1 = null;
        }
        if (var4_1 == B.e.b.p) {
            var1_4 = Math.min((int)var3_3, (int)6);
        } else if (var4_1 == B.e.b.q) {
            var1_4 = Math.max((int)var3_3, (int)3);
        } else {
            var4_1 = this.c;
            var1_4 = var3_3;
            if (var4_1.A) {
                var1_4 = var4_1.Y() != false ? Math.min((int)var3_3, (int)1) : Math.min((int)var3_3, (int)-1);
            }
        }
        var4_1 = this.c;
        var2_2 = var1_4;
        if (var4_1.W) {
            var2_2 = var1_4;
            if (var4_1.o < 5) {
                var2_2 = Math.min((int)var1_4, (int)4);
            }
        }
        if (n.D0(2) == false) return var2_2;
        var4_1 = new StringBuilder();
        var4_1.append("computeExpectedState() of ");
        var4_1.append(var2_2);
        var4_1.append(" for ");
        var4_1.append((Object)this.c);
        Log.v((String)"FragmentManager", (String)var4_1.toString());
        return var2_2;
    }

    public void e() {
        Object object;
        if (n.D0(3)) {
            object = new StringBuilder();
            object.append("moveto CREATED: ");
            object.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)object.toString());
        }
        object = this.c;
        if (!object.e0) {
            this.a.h((Fragment)object, object.p, false);
            object = this.c;
            object.R0(object.p);
            object = this.a;
            Fragment fragment = this.c;
            object.c(fragment, fragment.p, false);
            return;
        }
        object.r1(object.p);
        this.c.o = 1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public void f() {
        block17 : {
            block18 : {
                block19 : {
                    block20 : {
                        if (this.c.B) {
                            return;
                        }
                        if (n.D0(3)) {
                            var5_1 = new StringBuilder();
                            var5_1.append("moveto CREATE_VIEW: ");
                            var5_1.append((Object)this.c);
                            Log.d((String)"FragmentManager", (String)var5_1.toString());
                        }
                        var5_1 = this.c;
                        var7_3 = var5_1.X0(var5_1.p);
                        var6_4 = this.c;
                        var5_1 = var6_4.U;
                        if (var5_1 != null) break block17;
                        var2_5 = var6_4.L;
                        if (var2_5 == 0) break block18;
                        if (var2_5 == -1) break block19;
                        var6_4 = (ViewGroup)var6_4.G.n0().e(this.c.L);
                        var5_1 = var6_4;
                        if (var6_4 != null) break block17;
                        var5_1 = this.c;
                        if (!var5_1.D) break block20;
                        var5_1 = var6_4;
                        break block17;
                    }
                    try {
                        var5_1 = var5_1.I().getResourceName(this.c.L);
                        ** GOTO lbl31
                    }
                    catch (Resources.NotFoundException var5_2) {
                        ** continue;
                    }
lbl29: // 1 sources:
                    do {
                        var5_1 = "unknown";
lbl31: // 2 sources:
                        var6_4 = new StringBuilder();
                        var6_4.append("No view found for id 0x");
                        var6_4.append(Integer.toHexString((int)this.c.L));
                        var6_4.append(" (");
                        var6_4.append((String)var5_1);
                        var6_4.append(") for fragment ");
                        var6_4.append((Object)this.c);
                        throw new IllegalArgumentException(var6_4.toString());
                        break;
                    } while (true);
                }
                var5_1 = new StringBuilder();
                var5_1.append("Cannot create fragment ");
                var5_1.append((Object)this.c);
                var5_1.append(" for a container view with no id");
                throw new IllegalArgumentException(var5_1.toString());
            }
            var5_1 = null;
        }
        var6_4 = this.c;
        var6_4.U = var5_1;
        var6_4.T0(var7_3, (ViewGroup)var5_1, var6_4.p);
        var6_4 = this.c.V;
        if (var6_4 != null) {
            var4_6 = false;
            var6_4.setSaveFromParentEnabled(false);
            var6_4 = this.c;
            var6_4.V.setTag(b.a, (Object)var6_4);
            if (var5_1 != null) {
                this.b();
            }
            var5_1 = this.c;
            if (var5_1.N) {
                var5_1.V.setVisibility(8);
            }
            if (I.s.t(this.c.V)) {
                I.s.A(this.c.V);
            } else {
                var5_1 = this.c.V;
                var5_1.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener((View)var5_1){
                    public final /* synthetic */ View o;
                    {
                        this.o = view;
                    }

                    public void onViewAttachedToWindow(View view) {
                        this.o.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
                        I.s.A(this.o);
                    }

                    public void onViewDetachedFromWindow(View view) {
                    }
                });
            }
            this.c.k1();
            var5_1 = this.a;
            var6_4 = this.c;
            var5_1.m(var6_4, var6_4.V, var6_4.p, false);
            var2_5 = this.c.V.getVisibility();
            var1_7 = this.c.V.getAlpha();
            if (n.P) {
                this.c.C1(var1_7);
                var5_1 = this.c;
                if (var5_1.U != null && var2_5 == 0) {
                    var5_1 = var5_1.V.findFocus();
                    if (var5_1 != null) {
                        this.c.x1((View)var5_1);
                        if (n.D0(2)) {
                            var6_4 = new StringBuilder();
                            var6_4.append("requestFocus: Saved focused view ");
                            var6_4.append(var5_1);
                            var6_4.append(" for Fragment ");
                            var6_4.append((Object)this.c);
                            Log.v((String)"FragmentManager", (String)var6_4.toString());
                        }
                    }
                    this.c.V.setAlpha(0.0f);
                }
            } else {
                var5_1 = this.c;
                var3_8 = var4_6;
                if (var2_5 == 0) {
                    var3_8 = var4_6;
                    if (var5_1.U != null) {
                        var3_8 = true;
                    }
                }
                var5_1.a0 = var3_8;
            }
        }
        this.c.o = 2;
    }

    public void g() {
        Object object;
        Object object2;
        if (n.D0(3)) {
            object2 = new StringBuilder();
            object2.append("movefrom CREATED: ");
            object2.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)object2.toString());
        }
        object2 = this.c;
        boolean bl = object2.A;
        boolean bl2 = true;
        boolean bl3 = bl && !object2.Y();
        if (!bl3 && !this.b.o().o(this.c)) {
            object2 = this.c.w;
            if (object2 != null && (object2 = this.b.f((String)object2)) != null && object2.P) {
                this.c.v = object2;
            }
            this.c.o = 0;
            return;
        }
        object2 = this.c.H;
        if (object2 instanceof androidx.lifecycle.u) {
            bl2 = this.b.o().l();
        } else if (object2.i() instanceof Activity) {
            bl2 = true ^ ((Activity)object2.i()).isChangingConfigurations();
        }
        if (bl3 || bl2) {
            this.b.o().f(this.c);
        }
        this.c.U0();
        this.a.d(this.c, false);
        object2 = this.b.k().iterator();
        while (object2.hasNext()) {
            object = (t)object2.next();
            if (object == null) continue;
            object = object.k();
            if (!this.c.t.equals((Object)object.w)) continue;
            object.v = this.c;
            object.w = null;
        }
        object2 = this.c;
        object = object2.w;
        if (object != null) {
            object2.v = this.b.f((String)object);
        }
        this.b.q(this);
    }

    public void h() {
        Object object;
        if (n.D0(3)) {
            object = new StringBuilder();
            object.append("movefrom CREATE_VIEW: ");
            object.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)object.toString());
        }
        Fragment fragment = this.c;
        object = fragment.U;
        if (object != null && (fragment = fragment.V) != null) {
            object.removeView((View)fragment);
        }
        this.c.V0();
        this.a.n(this.c, false);
        object = this.c;
        object.U = null;
        object.V = null;
        object.h0 = null;
        object.i0.j(null);
        this.c.C = false;
    }

    public void i() {
        Object object;
        if (n.D0(3)) {
            object = new StringBuilder();
            object.append("movefrom ATTACHED: ");
            object.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)object.toString());
        }
        this.c.W0();
        this.a.e(this.c, false);
        object = this.c;
        object.o = -1;
        object.H = null;
        object.J = null;
        object.G = null;
        if (object.A && !object.Y() || this.b.o().o(this.c)) {
            if (n.D0(3)) {
                object = new StringBuilder();
                object.append("initState called for fragment: ");
                object.append((Object)this.c);
                Log.d((String)"FragmentManager", (String)object.toString());
            }
            this.c.U();
        }
    }

    public void j() {
        Object object = this.c;
        if (object.B && object.C && !object.E) {
            if (n.D0(3)) {
                object = new StringBuilder();
                object.append("moveto CREATE_VIEW: ");
                object.append((Object)this.c);
                Log.d((String)"FragmentManager", (String)object.toString());
            }
            object = this.c;
            object.T0(object.X0(object.p), null, this.c.p);
            object = this.c.V;
            if (object != null) {
                object.setSaveFromParentEnabled(false);
                object = this.c;
                object.V.setTag(b.a, object);
                object = this.c;
                if (object.N) {
                    object.V.setVisibility(8);
                }
                this.c.k1();
                object = this.a;
                Fragment fragment = this.c;
                object.m(fragment, fragment.V, fragment.p, false);
                this.c.o = 2;
            }
        }
    }

    public Fragment k() {
        return this.c;
    }

    public final boolean l(View view) {
        if (view == this.c.V) {
            return true;
        }
        for (view = view.getParent(); view != null; view = view.getParent()) {
            if (view != this.c.V) continue;
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public void m() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public void n() {
        if (n.D0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("movefrom RESUMED: ");
            stringBuilder.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.c.c1();
        this.a.f(this.c, false);
    }

    public void o(ClassLoader object) {
        Bundle bundle = this.c.p;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader((ClassLoader)object);
        object = this.c;
        object.q = object.p.getSparseParcelableArray("android:view_state");
        object = this.c;
        object.r = object.p.getBundle("android:view_registry_state");
        object = this.c;
        object.w = object.p.getString("android:target_state");
        object = this.c;
        if (object.w != null) {
            object.x = object.p.getInt("android:target_req_state", 0);
        }
        object = this.c;
        bundle = object.s;
        if (bundle != null) {
            object.X = bundle.booleanValue();
            this.c.s = null;
        } else {
            object.X = object.p.getBoolean("android:user_visible_hint", true);
        }
        object = this.c;
        if (!object.X) {
            object.W = true;
        }
    }

    public void p() {
        Object object;
        if (n.D0(3)) {
            object = new StringBuilder();
            object.append("moveto RESUMED: ");
            object.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)object.toString());
        }
        if ((object = this.c.y()) != null && this.l((View)object)) {
            boolean bl = object.requestFocus();
            if (n.D0(2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("requestFocus: Restoring focused view ");
                stringBuilder.append(object);
                stringBuilder.append(" ");
                object = bl ? "succeeded" : "failed";
                stringBuilder.append((String)object);
                stringBuilder.append(" on Fragment ");
                stringBuilder.append((Object)this.c);
                stringBuilder.append(" resulting in focused view ");
                stringBuilder.append((Object)this.c.V.findFocus());
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
        }
        this.c.x1(null);
        this.c.g1();
        this.a.i(this.c, false);
        object = this.c;
        object.p = null;
        object.q = null;
        object.r = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.c.h1(bundle);
        this.a.j(this.c, bundle, false);
        Bundle bundle2 = bundle;
        if (bundle.isEmpty()) {
            bundle2 = null;
        }
        if (this.c.V != null) {
            this.s();
        }
        bundle = bundle2;
        if (this.c.q != null) {
            bundle = bundle2;
            if (bundle2 == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.q);
        }
        bundle2 = bundle;
        if (this.c.r != null) {
            bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBundle("android:view_registry_state", this.c.r);
        }
        bundle = bundle2;
        if (!this.c.X) {
            bundle = bundle2;
            if (bundle2 == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.X);
        }
        return bundle;
    }

    public s r() {
        s s8 = new s(this.c);
        Fragment fragment = this.c;
        if (fragment.o > -1 && s8.A == null) {
            fragment = this.q();
            s8.A = fragment;
            if (this.c.w != null) {
                if (fragment == null) {
                    s8.A = new Bundle();
                }
                s8.A.putString("android:target_state", this.c.w);
                int n8 = this.c.x;
                if (n8 != 0) {
                    s8.A.putInt("android:target_req_state", n8);
                    return s8;
                }
            }
        } else {
            s8.A = fragment.p;
        }
        return s8;
    }

    public void s() {
        if (this.c.V == null) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.c.V.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.q = sparseArray;
        }
        sparseArray = new Bundle();
        this.c.h0.e((Bundle)sparseArray);
        if (!sparseArray.isEmpty()) {
            this.c.r = sparseArray;
        }
    }

    public void t(int n8) {
        this.e = n8;
    }

    public void u() {
        if (n.D0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("moveto STARTED: ");
            stringBuilder.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.c.i1();
        this.a.k(this.c, false);
    }

    public void v() {
        if (n.D0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("movefrom STARTED: ");
            stringBuilder.append((Object)this.c);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.c.j1();
        this.a.l(this.c, false);
    }

}

