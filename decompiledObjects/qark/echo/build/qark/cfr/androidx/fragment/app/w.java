/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.reflect.Constructor
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package androidx.fragment.app;

import E.c;
import I.q;
import I.s;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.n;
import androidx.fragment.app.t;
import androidx.fragment.app.u;
import androidx.fragment.app.v;
import androidx.fragment.app.x;
import androidx.fragment.app.y;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w.m;

public abstract class w {
    public static final int[] a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final y b = new x();
    public static final y c = w.w();

    public static void A(ArrayList arrayList, int n8) {
        if (arrayList == null) {
            return;
        }
        for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
            ((View)arrayList.get(i8)).setVisibility(n8);
        }
    }

    public static void B(Context context, androidx.fragment.app.g g8, ArrayList arrayList, ArrayList arrayList2, int n8, int n9, boolean bl, g g9) {
        Object object;
        int n10;
        SparseArray sparseArray = new SparseArray();
        for (n10 = n8; n10 < n9; ++n10) {
            object = (a)arrayList.get(n10);
            if (((Boolean)arrayList2.get(n10)).booleanValue()) {
                w.e((a)object, sparseArray, bl);
                continue;
            }
            w.c((a)object, sparseArray, bl);
        }
        if (sparseArray.size() != 0) {
            context = new View(context);
            int n11 = sparseArray.size();
            for (n10 = 0; n10 < n11; ++n10) {
                ViewGroup viewGroup;
                int n12 = sparseArray.keyAt(n10);
                object = w.d(n12, arrayList, arrayList2, n8, n9);
                h h8 = (h)sparseArray.valueAt(n10);
                if (!g8.f() || (viewGroup = (ViewGroup)g8.e(n12)) == null) continue;
                if (bl) {
                    w.o(viewGroup, h8, (View)context, (t.a)object, g9);
                    continue;
                }
                w.n(viewGroup, h8, (View)context, (t.a)object, g9);
            }
        }
    }

    public static void a(ArrayList arrayList, t.a a8, Collection collection) {
        for (int i8 = a8.size() - 1; i8 >= 0; --i8) {
            View view = (View)a8.l(i8);
            if (!collection.contains((Object)s.q(view))) continue;
            arrayList.add((Object)view);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void b(a var0, v.a var1_1, SparseArray var2_2, boolean var3_3, boolean var4_4) {
        block23 : {
            block24 : {
                block20 : {
                    block22 : {
                        block16 : {
                            block17 : {
                                block18 : {
                                    block21 : {
                                        block19 : {
                                            var13_5 = var1_1.b;
                                            if (var13_5 == null) {
                                                return;
                                            }
                                            var9_6 = var13_5.L;
                                            if (var9_6 == 0) {
                                                return;
                                            }
                                            var5_7 = var3_3 != false ? w.a[var1_1.a] : var1_1.a;
                                            var10_8 = false;
                                            var8_9 = 1;
                                            if (var5_7 == 1) break block16;
                                            if (var5_7 == 3) break block17;
                                            if (var5_7 == 4) break block18;
                                            if (var5_7 == 5) break block19;
                                            if (var5_7 == 6) break block17;
                                            if (var5_7 == 7) break block16;
                                            var6_11 = var5_7 = (var7_10 = 0);
                                            break block20;
                                        }
                                        if (!var4_4) break block21;
                                        if (!var13_5.b0 || var13_5.N || !var13_5.z) ** GOTO lbl-1000
                                        ** GOTO lbl-1000
                                    }
                                    var10_8 = var13_5.N;
                                    break block22;
                                }
                                if (!(var4_4 != false ? var13_5.b0 != false && var13_5.z != false && var13_5.N != false : var13_5.z != false && var13_5.N == false)) ** GOTO lbl-1000
                                ** GOTO lbl-1000
                            }
                            var11_12 = var13_5.z;
                            if (var4_4 != false ? var11_12 == false && (var1_1 = var13_5.V) != null && var1_1.getVisibility() == 0 && var13_5.c0 >= 0.0f : var11_12 != false && var13_5.N == false) lbl-1000: // 2 sources:
                            {
                                var5_7 = 1;
                            } else lbl-1000: // 2 sources:
                            {
                                var5_7 = 0;
                            }
                            var6_11 = var5_7;
                            var7_10 = 1;
                            var5_7 = 0;
                            break block20;
                        }
                        if (var4_4) {
                            var10_8 = var13_5.a0;
                        } else if (!var13_5.z && !var13_5.N) lbl-1000: // 2 sources:
                        {
                            var10_8 = true;
                        } else lbl-1000: // 2 sources:
                        {
                            var10_8 = false;
                        }
                    }
                    var7_10 = var6_11 = 0;
                    var5_7 = var8_9;
                }
                var1_1 = var12_13 = (h)var2_2.get(var9_6);
                if (var10_8) {
                    var1_1 = w.p((h)var12_13, var2_2, var9_6);
                    var1_1.a = var13_5;
                    var1_1.b = var3_3;
                    var1_1.c = var0;
                }
                if (!var4_4 && var5_7 != 0) {
                    if (var1_1 != null && var1_1.d == var13_5) {
                        var1_1.d = null;
                    }
                    if (!var0.r) {
                        var12_13 = var0.t;
                        var14_14 = var12_13.v(var13_5);
                        var12_13.q0().p(var14_14);
                        var12_13.N0(var13_5);
                    }
                }
                var12_13 = var1_1;
                if (var6_11 == 0) break block23;
                if (var1_1 == null) break block24;
                var12_13 = var1_1;
                if (var1_1.d != null) break block23;
            }
            var12_13 = w.p((h)var1_1, var2_2, var9_6);
            var12_13.d = var13_5;
            var12_13.e = var3_3;
            var12_13.f = var0;
        }
        if (var4_4 != false) return;
        if (var7_10 == 0) return;
        if (var12_13 == null) return;
        if (var12_13.a != var13_5) return;
        var12_13.a = null;
    }

    public static void c(a a8, SparseArray sparseArray, boolean bl) {
        int n8 = a8.c.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            w.b(a8, (v.a)a8.c.get(i8), sparseArray, false, bl);
        }
    }

    public static t.a d(int n8, ArrayList arrayList, ArrayList arrayList2, int n9, int n10) {
        t.a a8 = new t.a();
        --n10;
        while (n10 >= n9) {
            Object object = (a)arrayList.get(n10);
            if (object.u(n8)) {
                boolean bl = (Boolean)arrayList2.get(n10);
                ArrayList arrayList3 = object.p;
                if (arrayList3 != null) {
                    ArrayList arrayList4;
                    int n11 = arrayList3.size();
                    if (bl) {
                        arrayList4 = object.p;
                        arrayList3 = object.q;
                    } else {
                        arrayList3 = object.p;
                        arrayList4 = object.q;
                    }
                    for (int i8 = 0; i8 < n11; ++i8) {
                        object = (String)arrayList3.get(i8);
                        String string2 = (String)arrayList4.get(i8);
                        String string3 = (String)a8.remove(string2);
                        if (string3 != null) {
                            a8.put(object, string3);
                            continue;
                        }
                        a8.put(object, string2);
                    }
                }
            }
            --n10;
        }
        return a8;
    }

    public static void e(a a8, SparseArray sparseArray, boolean bl) {
        if (!a8.t.n0().f()) {
            return;
        }
        for (int i8 = a8.c.size() - 1; i8 >= 0; --i8) {
            w.b(a8, (v.a)a8.c.get(i8), sparseArray, true, bl);
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean bl, t.a a8, boolean bl2) {
        if (bl) {
            fragment2.v();
            return;
        }
        fragment.v();
    }

    public static boolean g(y y8, List list) {
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (y8.e(list.get(i8))) continue;
            return false;
        }
        return true;
    }

    public static t.a h(y object, t.a a8, Object object2, h h8) {
        Fragment fragment = h8.a;
        View view = fragment.R();
        if (!a8.isEmpty() && object2 != null && view != null) {
            object2 = new t.a();
            object.j((Map)object2, view);
            object = h8.c;
            if (h8.b) {
                fragment.x();
                object = object.p;
            } else {
                fragment.v();
                object = object.q;
            }
            if (object != null) {
                object2.p((Collection)object);
                object2.p(a8.values());
            }
            w.x(a8, (t.a)object2);
            return object2;
        }
        a8.clear();
        return null;
    }

    public static t.a i(y object, t.a a8, Object object2, h h8) {
        if (!a8.isEmpty() && object2 != null) {
            Fragment fragment = h8.d;
            object2 = new t.a();
            object.j((Map)object2, fragment.q1());
            object = h8.f;
            if (h8.e) {
                fragment.v();
                object = object.q;
            } else {
                fragment.x();
                object = object.p;
            }
            if (object != null) {
                object2.p((Collection)object);
            }
            a8.p((Collection)object2.keySet());
            return object2;
        }
        a8.clear();
        return null;
    }

    public static y j(Fragment object, Fragment object2) {
        ArrayList arrayList = new ArrayList();
        if (object != null) {
            Object object3 = object.w();
            if (object3 != null) {
                arrayList.add(object3);
            }
            if ((object3 = object.K()) != null) {
                arrayList.add(object3);
            }
            if ((object = object.M()) != null) {
                arrayList.add(object);
            }
        }
        if (object2 != null) {
            object = object2.u();
            if (object != null) {
                arrayList.add(object);
            }
            if ((object = object2.H()) != null) {
                arrayList.add(object);
            }
            if ((object = object2.L()) != null) {
                arrayList.add(object);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        object = b;
        if (object != null && w.g((y)object, (List)arrayList)) {
            return object;
        }
        object2 = c;
        if (object2 != null && w.g((y)object2, (List)arrayList)) {
            return object2;
        }
        if (object == null && object2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList k(y y8, Object object, Fragment fragment, ArrayList arrayList, View view) {
        if (object != null) {
            ArrayList arrayList2 = new ArrayList();
            if ((fragment = fragment.R()) != null) {
                y8.f(arrayList2, (View)fragment);
            }
            if (arrayList != null) {
                arrayList2.removeAll((Collection)arrayList);
            }
            fragment = arrayList2;
            if (!arrayList2.isEmpty()) {
                arrayList2.add((Object)view);
                y8.b(object, arrayList2);
                return arrayList2;
            }
        } else {
            fragment = null;
        }
        return fragment;
    }

    public static Object l(y y8, ViewGroup viewGroup, final View view, final t.a a8, final h h8, final ArrayList arrayList, final ArrayList arrayList2, final Object object, Object object2) {
        final Fragment fragment = h8.a;
        final Fragment fragment2 = h8.d;
        if (fragment != null) {
            if (fragment2 == null) {
                return null;
            }
            final boolean bl = h8.b;
            final Object object3 = a8.isEmpty() ? null : w.t(y8, fragment, fragment2, bl);
            t.a a9 = w.i(y8, a8, object3, h8);
            if (a8.isEmpty()) {
                object3 = null;
            } else {
                arrayList.addAll(a9.values());
            }
            if (object == null && object2 == null && object3 == null) {
                return null;
            }
            w.f(fragment, fragment2, bl, a9, true);
            if (object3 != null) {
                Rect rect = new Rect();
                y8.z(object3, view, arrayList);
                w.z(y8, object3, object2, a9, h8.e, h8.f);
                object2 = rect;
                if (object != null) {
                    y8.u(object, rect);
                    object2 = rect;
                }
            } else {
                object2 = null;
            }
            q.a((View)viewGroup, new Runnable((Rect)object2){
                public final /* synthetic */ Rect z;
                {
                    this.z = rect;
                }

                public void run() {
                    t.a a82 = w.h(y.this, a8, object3, h8);
                    if (a82 != null) {
                        arrayList2.addAll(a82.values());
                        arrayList2.add((Object)view);
                    }
                    w.f(fragment, fragment2, bl, a82, false);
                    Object object2 = object3;
                    if (object2 != null) {
                        y.this.A(object2, arrayList, arrayList2);
                        a82 = w.s(a82, h8, object, bl);
                        if (a82 != null) {
                            y.this.k((View)a82, this.z);
                        }
                    }
                }
            });
            return object3;
        }
        return null;
    }

    public static Object m(y y8, ViewGroup viewGroup, View view, t.a object, h h8, ArrayList arrayList, ArrayList arrayList2, Object object2, Object object3) {
        Fragment fragment = h8.a;
        final Fragment fragment2 = h8.d;
        if (fragment != null) {
            fragment.q1().setVisibility(0);
        }
        if (fragment != null) {
            if (fragment2 == null) {
                return null;
            }
            final boolean bl = h8.b;
            Object object4 = object.isEmpty() ? null : w.t(y8, fragment, fragment2, bl);
            t.a a8 = w.i(y8, (t.a)object, object4, h8);
            final t.a a9 = w.h(y8, (t.a)object, object4, h8);
            if (object.isEmpty()) {
                if (a8 != null) {
                    a8.clear();
                }
                if (a9 != null) {
                    a9.clear();
                }
                object = null;
            } else {
                w.a(arrayList, a8, (Collection)object.keySet());
                w.a(arrayList2, a9, object.values());
                object = object4;
            }
            if (object2 == null && object3 == null && object == null) {
                return null;
            }
            w.f(fragment, fragment2, bl, a8, true);
            if (object != null) {
                arrayList2.add((Object)view);
                y8.z(object, view, arrayList);
                w.z(y8, object, object3, a8, h8.e, h8.f);
                view = new Rect();
                h8 = w.s(a9, h8, object2, bl);
                if (h8 != null) {
                    y8.u(object2, (Rect)view);
                }
                arrayList = view;
            } else {
                view = null;
                arrayList = view;
                h8 = view;
            }
            q.a((View)viewGroup, new Runnable((View)h8, y8, (Rect)arrayList){
                public final /* synthetic */ View s;
                public final /* synthetic */ y t;
                public final /* synthetic */ Rect u;
                {
                    this.s = view;
                    this.t = y8;
                    this.u = rect;
                }

                public void run() {
                    w.f(Fragment.this, fragment2, bl, a9, false);
                    View view = this.s;
                    if (view != null) {
                        this.t.k(view, this.u);
                    }
                }
            });
            return object;
        }
        return null;
    }

    public static void n(ViewGroup viewGroup, h object, View view, t.a a8, g g8) {
        final Fragment fragment = object.d;
        Fragment fragment2 = object.a;
        y y8 = w.j(fragment, fragment2);
        if (y8 == null) {
            return;
        }
        boolean bl = object.b;
        boolean bl2 = object.e;
        Object object2 = w.q(y8, fragment2, bl);
        Object object3 = w.r(y8, fragment, bl2);
        Object object4 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        Object object5 = w.l(y8, viewGroup, view, a8, (h)object, (ArrayList)object4, arrayList, object2, object3);
        if (object2 == null && object5 == null && object3 == null) {
            return;
        }
        ArrayList arrayList2 = w.k(y8, object3, fragment, (ArrayList)object4, view);
        if (arrayList2 == null || arrayList2.isEmpty()) {
            object3 = null;
        }
        y8.a(object2, view);
        object = w.u(y8, object2, object3, object5, fragment2, object.b);
        if (fragment != null && arrayList2 != null && (arrayList2.size() > 0 || object4.size() > 0)) {
            object4 = new c();
            g8.b(fragment, (c)object4);
            y8.w(fragment, object, (c)object4, new Runnable((c)object4){
                public final /* synthetic */ c q;
                {
                    this.q = c8;
                }

                public void run() {
                    g.this.a(fragment, this.q);
                }
            });
        }
        if (object != null) {
            g8 = new ArrayList();
            y8.t(object, object2, (ArrayList)g8, object3, arrayList2, object5, arrayList);
            w.y(y8, viewGroup, fragment2, view, arrayList, object2, (ArrayList)g8, object3, arrayList2);
            y8.x((View)viewGroup, arrayList, a8);
            y8.c(viewGroup, object);
            y8.s(viewGroup, arrayList, a8);
        }
    }

    public static void o(ViewGroup viewGroup, h object, View view, t.a a8, g g8) {
        final Fragment fragment = object.d;
        Object object2 = object.a;
        y y8 = w.j(fragment, (Fragment)object2);
        if (y8 == null) {
            return;
        }
        boolean bl = object.b;
        boolean bl2 = object.e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object object3 = w.q(y8, (Fragment)object2, bl);
        Object object4 = w.r(y8, fragment, bl2);
        Object object5 = w.m(y8, viewGroup, view, a8, (h)object, arrayList2, arrayList, object3, object4);
        if (object3 == null && object5 == null && object4 == null) {
            return;
        }
        object = object4;
        object4 = w.k(y8, object, fragment, arrayList2, view);
        view = w.k(y8, object3, (Fragment)object2, arrayList, view);
        w.A((ArrayList)view, 4);
        object2 = w.u(y8, object3, object, object5, (Fragment)object2, bl);
        if (fragment != null && object4 != null && (object4.size() > 0 || arrayList2.size() > 0)) {
            final c c8 = new c();
            g8.b(fragment, c8);
            y8.w(fragment, object2, c8, new Runnable(){

                public void run() {
                    g.this.a(fragment, c8);
                }
            });
        }
        if (object2 != null) {
            w.v(y8, object, fragment, (ArrayList)object4);
            g8 = y8.o(arrayList);
            y8.t(object2, object3, (ArrayList)view, object, (ArrayList)object4, object5, arrayList);
            y8.c(viewGroup, object2);
            y8.y((View)viewGroup, arrayList2, arrayList, (ArrayList)g8, a8);
            w.A((ArrayList)view, 0);
            y8.A(object5, arrayList2, arrayList);
        }
    }

    public static h p(h h8, SparseArray sparseArray, int n8) {
        h h9 = h8;
        if (h8 == null) {
            h9 = new h();
            sparseArray.put(n8, (Object)h9);
        }
        return h9;
    }

    public static Object q(y y8, Fragment object, boolean bl) {
        if (object == null) {
            return null;
        }
        object = bl ? object.H() : object.u();
        return y8.g(object);
    }

    public static Object r(y y8, Fragment object, boolean bl) {
        if (object == null) {
            return null;
        }
        object = bl ? object.K() : object.w();
        return y8.g(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static View s(t.a a8, h object, Object object2, boolean bl) {
        object = object.c;
        if (object2 == null) return null;
        if (a8 == null) return null;
        object2 = object.p;
        if (object2 == null) return null;
        if (object2.isEmpty()) return null;
        object = bl ? object.p : object.q;
        object = (String)object.get(0);
        return (View)a8.get(object);
    }

    public static Object t(y y8, Fragment object, Fragment fragment, boolean bl) {
        if (object != null && fragment != null) {
            object = bl ? fragment.M() : object.L();
            return y8.B(y8.g(object));
        }
        return null;
    }

    public static Object u(y y8, Object object, Object object2, Object object3, Fragment fragment, boolean bl) {
        if (object != null && object2 != null && fragment != null) {
            bl = bl ? fragment.p() : fragment.o();
            if (!bl) {
                return y8.m(object2, object, object3);
            }
        }
        return y8.n(object2, object, object3);
    }

    public static void v(y y8, Object object, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && object != null && fragment.z && fragment.N && fragment.b0) {
            fragment.y1(true);
            y8.r(object, fragment.R(), arrayList);
            q.a((View)fragment.U, new Runnable(){

                public void run() {
                    w.A(ArrayList.this, 4);
                }
            });
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static y w() {
        try {
            return (y)Class.forName((String)"androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void x(t.a a8, t.a a9) {
        for (int i8 = a8.size() - 1; i8 >= 0; --i8) {
            if (a9.containsKey((String)a8.l(i8))) continue;
            a8.j(i8);
        }
    }

    public static void y(final y y8, ViewGroup viewGroup, final Fragment fragment, final View view, final ArrayList arrayList, Object object, final ArrayList arrayList2, final Object object2, final ArrayList arrayList3) {
        q.a((View)viewGroup, new Runnable(){

            public void run() {
                Object object = Object.this;
                if (object != null) {
                    y8.p(object, view);
                    object = w.k(y8, Object.this, fragment, arrayList, view);
                    arrayList2.addAll((Collection)object);
                }
                if (arrayList3 != null) {
                    if (object2 != null) {
                        object = new ArrayList();
                        object.add((Object)view);
                        y8.q(object2, arrayList3, (ArrayList)object);
                    }
                    arrayList3.clear();
                    arrayList3.add((Object)view);
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void z(y y8, Object object, Object object2, t.a a8, boolean bl, a object3) {
        ArrayList arrayList = object3.p;
        if (arrayList != null && !arrayList.isEmpty()) {
            object3 = bl ? object3.q : object3.p;
            object3 = (String)object3.get(0);
            a8 = (View)a8.get(object3);
            y8.v(object, (View)a8);
            if (object2 != null) {
                y8.v(object2, (View)a8);
            }
        }
    }

    public static interface g {
        public void a(Fragment var1, c var2);

        public void b(Fragment var1, c var2);
    }

    public static class h {
        public Fragment a;
        public boolean b;
        public a c;
        public Fragment d;
        public boolean e;
        public a f;
    }

}

