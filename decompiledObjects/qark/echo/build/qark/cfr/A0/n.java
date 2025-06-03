/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.AudioManager
 *  android.media.Spatializer
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.Pair
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 */
package A0;

import A0.A;
import A0.D;
import A0.a;
import A0.k;
import A0.l;
import A0.m;
import A0.o;
import A0.p;
import A0.q;
import A0.r;
import A0.s;
import A0.t;
import A0.u;
import A0.v;
import A0.w;
import A0.y;
import X2.P;
import X2.v;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d0.I;
import d0.J;
import d0.K;
import d0.b;
import g0.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k0.Y0;
import k0.Z0;
import k0.a1;
import k0.b1;
import m0.Z;
import x0.x;

public class n
extends A
implements a1.a {
    public static final P k = P.b(new A0.d());
    public final Object d = new Object();
    public final Context e;
    public final y.b f;
    public final boolean g;
    public e h;
    public g i;
    public d0.b j;

    public n(Context context) {
        this(context, new a.b());
    }

    public n(Context context, y.b b8) {
        this(context, e.h(context), b8);
    }

    public n(Context context, K k8, y.b b8) {
        this(k8, b8, context);
    }

    /*
     * Enabled aggressive block sorting
     */
    public n(K k8, y.b object, Context context) {
        Context context2 = context != null ? context.getApplicationContext() : null;
        this.e = context2;
        this.f = object;
        if (k8 instanceof e) {
            k8 = (e)k8;
        } else {
            object = context == null ? e.A0 : e.h(context);
            k8 = object.g().d0(k8).a0();
        }
        this.h = k8;
        this.j = d0.b.g;
        boolean bl = context != null && M.E0(context);
        this.g = bl;
        if (!bl && context != null && M.a >= 32) {
            this.i = g.g(context);
        }
        if (this.h.t0 && context == null) {
            g0.o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void D(A.a a8, e e8, y.a[] arra) {
        int n8 = a8.d();
        for (int i8 = 0; i8 < n8; ++i8) {
            x0.Z z8 = a8.f(i8);
            if (!e8.k(i8, z8)) continue;
            e8.j(i8, z8);
            arra[i8] = null;
        }
    }

    public static void E(A.a a8, K k8, y.a[] hashMap) {
        int n8;
        int n9 = a8.d();
        hashMap = new HashMap();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n.F(a8.f(n8), k8, (Map)hashMap);
        }
        n.F(a8.h(), k8, (Map)hashMap);
        for (n8 = n10; n8 < n9; ++n8) {
            android.support.v4.media.a.a(hashMap.get((Object)a8.e(n8)));
        }
    }

    public static void F(x0.Z z8, K k8, Map object) {
        for (int i8 = 0; i8 < z8.a; ++i8) {
            object = z8.b(i8);
            android.support.v4.media.a.a(k8.A.get(object));
        }
    }

    public static int G(d0.q object, String string2, boolean bl) {
        if (!TextUtils.isEmpty((CharSequence)string2) && string2.equals((Object)object.d)) {
            return 4;
        }
        string2 = n.X(string2);
        object = n.X(object.d);
        int n8 = 0;
        if (object != null && string2 != null) {
            if (!object.startsWith(string2) && !string2.startsWith((String)object)) {
                if (M.c1((String)object, "-")[0].equals((Object)M.c1(string2, "-")[0])) {
                    return 2;
                }
                return 0;
            }
            return 3;
        }
        int n9 = n8;
        if (bl) {
            n9 = n8;
            if (object == null) {
                n9 = 1;
            }
        }
        return n9;
    }

    public static int H(J j8, int n8, int n9, boolean bl) {
        int n10;
        int n11 = n10 = Integer.MAX_VALUE;
        if (n8 != Integer.MAX_VALUE) {
            if (n9 == Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            int n12 = 0;
            do {
                n11 = n10;
                if (n12 >= j8.a) break;
                d0.q q8 = j8.a(n12);
                int n13 = q8.t;
                n11 = n10;
                if (n13 > 0) {
                    int n14 = q8.u;
                    n11 = n10;
                    if (n14 > 0) {
                        Point point = n.I(bl, n8, n9, n13, n14);
                        n14 = q8.t;
                        int n15 = q8.u;
                        n13 = n14 * n15;
                        n11 = n10;
                        if (n14 >= (int)((float)point.x * 0.98f)) {
                            n11 = n10;
                            if (n15 >= (int)((float)point.y * 0.98f)) {
                                n11 = n10;
                                if (n13 < n10) {
                                    n11 = n13;
                                }
                            }
                        }
                    }
                }
                ++n12;
                n10 = n11;
            } while (true);
        }
        return n11;
    }

    public static Point I(boolean bl, int n8, int n9, int n10, int n11) {
        int n12;
        int n13;
        block6 : {
            block5 : {
                if (!bl) break block5;
                n12 = 0;
                n13 = n10 > n11 ? 1 : 0;
                if (n8 > n9) {
                    n12 = 1;
                }
                if (n13 != n12) break block6;
            }
            n13 = n9;
            n9 = n8;
            n8 = n13;
        }
        n13 = n10 * n8;
        n12 = n11 * n9;
        if (n13 >= n12) {
            return new Point(n9, M.k(n12, n10));
        }
        return new Point(M.k(n13, n11), n8);
    }

    public static int K(int n8, int n9) {
        if (n8 != 0 && n8 == n9) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount((int)(n8 & n9));
    }

    public static int L(String string2) {
        if (string2 == null) {
            return 0;
        }
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1599127257: {
                if (!string2.equals((Object)"video/x-vnd.on2.vp9")) break;
                n9 = 4;
                break;
            }
            case 1331836730: {
                if (!string2.equals((Object)"video/avc")) break;
                n9 = 3;
                break;
            }
            case -1662541442: {
                if (!string2.equals((Object)"video/hevc")) break;
                n9 = 2;
                break;
            }
            case -1662735862: {
                if (!string2.equals((Object)"video/av01")) break;
                n9 = 1;
                break;
            }
            case -1851077871: {
                if (!string2.equals((Object)"video/dolby-vision")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return 0;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 1;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 4;
            }
            case 0: 
        }
        return 5;
    }

    public static boolean N(d0.q object) {
        object = object.n;
        if (object == null) {
            return false;
        }
        object.hashCode();
        int n8 = object.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1504578661: {
                if (!object.equals((Object)"audio/eac3")) break;
                n9 = 3;
                break;
            }
            case 187078297: {
                if (!object.equals((Object)"audio/ac4")) break;
                n9 = 2;
                break;
            }
            case 187078296: {
                if (!object.equals((Object)"audio/ac3")) break;
                n9 = 1;
                break;
            }
            case -2123537834: {
                if (!object.equals((Object)"audio/eac3-joc")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
        }
        return true;
    }

    public static /* synthetic */ List P(e e8, int n8, J j8, int[] arrn) {
        return c.l(n8, j8, e8, arrn);
    }

    public static /* synthetic */ List Q(e e8, String string2, int n8, J j8, int[] arrn) {
        return h.l(n8, j8, e8, arrn, string2);
    }

    public static /* synthetic */ List R(e e8, int[] arrn, int n8, J j8, int[] arrn2) {
        return j.o(n8, j8, e8, arrn2, arrn[n8]);
    }

    public static /* synthetic */ int S(Integer n8, Integer n9) {
        int n10 = n8;
        int n11 = -1;
        if (n10 == -1) {
            if (n9 == -1) {
                return 0;
            }
        } else {
            if (n9 == -1) {
                return 1;
            }
            n11 = n8 - n9;
        }
        return n11;
    }

    public static void T(e object, A.a a8, int[][][] arrn, b1[] arrb1, y[] arry) {
        int n8;
        int n9 = -1;
        boolean bl = false;
        int n10 = n8 = 0;
        while (n8 < a8.d()) {
            int n11 = a8.e(n8);
            y y8 = arry[n8];
            if (n11 != 1 && y8 != null) {
                return;
            }
            int n12 = n9;
            int n13 = n10;
            if (n11 == 1) {
                n12 = n9;
                n13 = n10;
                if (y8 != null) {
                    n12 = n9;
                    n13 = n10;
                    if (y8.length() == 1) {
                        n11 = a8.f(n8).d(y8.d());
                        n12 = n9;
                        n13 = n10;
                        if (n.Y((e)object, arrn[n8][n11][y8.c(0)], y8.m())) {
                            n13 = n10 + 1;
                            n12 = n8;
                        }
                    }
                }
            }
            ++n8;
            n9 = n12;
            n10 = n13;
        }
        if (n10 == 1) {
            n8 = object.s.b ? 1 : 2;
            object = arrb1[n9];
            boolean bl2 = bl;
            if (object != null) {
                bl2 = bl;
                if (object.b) {
                    bl2 = true;
                }
            }
            arrb1[n9] = new b1(n8, bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void U(A.a object, int[][][] arrn, b1[] arrb1, y[] arry) {
        int n8;
        int n9;
        int n10;
        int n11;
        block2 : {
            n8 = n11 = -1;
            for (n9 = 0; n9 < object.d(); ++n9) {
                int n12;
                block4 : {
                    block7 : {
                        block6 : {
                            block5 : {
                                int n13;
                                y y8;
                                block3 : {
                                    n13 = object.e(n9);
                                    y8 = arry[n9];
                                    if (n13 == 1) break block3;
                                    n10 = n11;
                                    n12 = n8;
                                    if (n13 != 2) break block4;
                                }
                                n10 = n11;
                                n12 = n8;
                                if (y8 == null) break block4;
                                n10 = n11;
                                n12 = n8;
                                if (!n.Z(arrn[n9], object.f(n9), y8)) break block4;
                                if (n13 != 1) break block5;
                                if (n8 != -1) break block6;
                                n12 = n9;
                                n10 = n11;
                                break block4;
                            }
                            if (n11 == -1) break block7;
                        }
                        n9 = 0;
                        break block2;
                    }
                    n10 = n9;
                    n12 = n8;
                }
                n11 = n10;
                n8 = n12;
            }
            n9 = 1;
        }
        n10 = n8 != -1 && n11 != -1 ? 1 : 0;
        if ((n9 & n10) == 0) return;
        arrb1[n8] = object = new b1(0, true);
        arrb1[n11] = object;
    }

    public static String X(String string2) {
        String string3;
        block3 : {
            block2 : {
                if (TextUtils.isEmpty((CharSequence)string2)) break block2;
                string3 = string2;
                if (!TextUtils.equals((CharSequence)string2, (CharSequence)"und")) break block3;
            }
            string3 = null;
        }
        return string3;
    }

    public static boolean Y(e e8, int n8, d0.q q8) {
        int n9 = Z0.f(n8);
        boolean bl = false;
        if (n9 == 0) {
            return false;
        }
        if (e8.s.c && (Z0.f(n8) & 2048) == 0) {
            return false;
        }
        if (e8.s.b) {
            n9 = q8.E == 0 && q8.F == 0 ? 0 : 1;
            n8 = (Z0.f(n8) & 1024) != 0 ? 1 : 0;
            if (n9 == 0 || n8 != 0) {
                bl = true;
            }
            return bl;
        }
        return true;
    }

    public static boolean Z(int[][] arrn, x0.Z z8, y y8) {
        if (y8 == null) {
            return false;
        }
        int n8 = z8.d(y8.d());
        for (int i8 = 0; i8 < y8.length(); ++i8) {
            if (Z0.j(arrn[n8][y8.c(i8)]) == 32) continue;
            return false;
        }
        return true;
    }

    public static /* synthetic */ List r(e e8, int n8, J j8, int[] arrn) {
        return n.P(e8, n8, j8, arrn);
    }

    public static /* synthetic */ List s(e e8, String string2, int n8, J j8, int[] arrn) {
        return n.Q(e8, string2, n8, j8, arrn);
    }

    public static /* synthetic */ List t(n n8, e e8, boolean bl, int[] arrn, int n9, J j8, int[] arrn2) {
        return n8.O(e8, bl, arrn, n9, j8, arrn2);
    }

    public static /* synthetic */ List u(e e8, int[] arrn, int n8, J j8, int[] arrn2) {
        return n.R(e8, arrn, n8, j8, arrn2);
    }

    public static /* synthetic */ int v(Integer n8, Integer n9) {
        return n.S(n8, n9);
    }

    public static /* synthetic */ boolean w(n n8, d0.q q8) {
        return n8.M(q8);
    }

    public static /* synthetic */ int z(String string2) {
        return n.L(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e J() {
        Object object = this.d;
        synchronized (object) {
            return this.h;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean M(d0.q q8) {
        Object object = this.d;
        synchronized (object) {
            try {
                g g8;
                if (!this.h.t0) return true;
                if (this.g) return true;
                if (q8.B <= 2) return true;
                if (n.N(q8)) {
                    if (M.a < 32) return true;
                    g8 = this.i;
                    if (g8 == null) return true;
                    if (!g8.e()) return true;
                }
                if (M.a < 32) return false;
                g8 = this.i;
                if (g8 == null) return false;
                if (!g8.e()) return false;
                if (!this.i.c()) return false;
                if (!this.i.d()) return false;
                if (!this.i.a(this.j, q8)) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final /* synthetic */ List O(e e8, boolean bl, int[] arrn, int n8, J j8, int[] arrn2) {
        return b.l(n8, j8, e8, arrn2, bl, new m(this), arrn[n8]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void V() {
        Object object = this.d;
        // MONITORENTER : object
        if (!this.h.t0) return;
        if (this.g) return;
        if (M.a < 32) return;
        g g8 = this.i;
        if (g8 == null) return;
        if (!g8.e()) return;
        boolean bl = true;
        // MONITOREXIT : object
        if (!bl) return;
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void W(Y0 y02) {
        Object object = this.d;
        // MONITORENTER : object
        boolean bl = this.h.x0;
        // MONITOREXIT : object
        if (!bl) return;
        this.g(y02);
    }

    @Override
    public void a(Y0 y02) {
        this.W(y02);
    }

    public y.a[] a0(A.a a8, int[][][] arrn, int[] object, e e8) {
        int n8 = a8.d();
        y.a[] arra = new y.a[n8];
        Pair pair = this.g0(a8, arrn, (int[])object, e8);
        boolean bl = e8.x;
        Object var10_9 = null;
        Pair pair2 = !bl && pair != null ? null : this.c0(a8, arrn, e8);
        if (pair2 != null) {
            arra[((Integer)pair2.second).intValue()] = (y.a)pair2.first;
        } else if (pair != null) {
            arra[((Integer)pair.second).intValue()] = (y.a)pair.first;
        }
        object = this.b0(a8, arrn, (int[])object, e8);
        if (object != null) {
            arra[((Integer)object.second).intValue()] = (y.a)object.first;
        }
        int n9 = 0;
        if (object == null) {
            object = var10_9;
        } else {
            object = object.first;
            object = ((y.a)object).a.a((int)((y.a)object).b[0]).d;
        }
        object = this.e0(a8, arrn, e8, (String)object);
        int n10 = n9;
        if (object != null) {
            arra[((Integer)object.second).intValue()] = (y.a)object.first;
            n10 = n9;
        }
        while (n10 < n8) {
            n9 = a8.e(n10);
            if (n9 != 2 && n9 != 1 && n9 != 3 && n9 != 4) {
                arra[n10] = this.d0(n9, a8.f(n10), arrn[n10], e8);
            }
            ++n10;
        }
        return arra;
    }

    public Pair b0(A.a a8, int[][][] arrn, int[] arrn2, e e8) {
        boolean bl;
        boolean bl2 = false;
        int n8 = 0;
        do {
            bl = bl2;
            if (n8 >= a8.d()) break;
            if (2 == a8.e(n8) && a8.f((int)n8).a > 0) {
                bl = true;
                break;
            }
            ++n8;
        } while (true);
        return this.f0(1, a8, arrn, new A0.g(this, e8, bl, arrn2), new A0.h());
    }

    public Pair c0(A.a a8, int[][][] arrn, e e8) {
        if (e8.s.a == 2) {
            return null;
        }
        return this.f0(4, a8, arrn, new A0.e(e8), new A0.f());
    }

    @Override
    public a1.a d() {
        return this;
    }

    public y.a d0(int n8, x0.Z z8, int[][] arrn, e e8) {
        int n9;
        J j8;
        if (e8.s.a == 2) {
            return null;
        }
        int n10 = n9 = 0;
        J j9 = j8 = null;
        while (n9 < z8.a) {
            J j10 = z8.b(n9);
            int[] arrn2 = arrn[n9];
            for (n8 = 0; n8 < j10.a; ++n8) {
                J j11;
                Object object;
                int n11;
                block7 : {
                    d d8;
                    block8 : {
                        j11 = j8;
                        n11 = n10;
                        object = j9;
                        if (!Z0.k(arrn2[n8], e8.u0)) break block7;
                        d8 = new d(j10.a(n8), arrn2[n8]);
                        if (j9 == null) break block8;
                        j11 = j8;
                        n11 = n10;
                        object = j9;
                        if (d8.c((d)((Object)j9)) <= 0) break block7;
                    }
                    j11 = j10;
                    n11 = n8;
                    object = d8;
                }
                j8 = j11;
                n10 = n11;
                j9 = object;
            }
            ++n9;
        }
        if (j8 == null) {
            return null;
        }
        return new y.a(j8, n10);
    }

    public Pair e0(A.a a8, int[][][] arrn, e e8, String string2) {
        if (e8.s.a == 2) {
            return null;
        }
        return this.f0(3, a8, arrn, new k(e8, string2), new l());
    }

    public final Pair f0(int n8, A.a arrn, int[][][] object, i.a a8, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        int n9 = arrn.d();
        int n10 = 0;
        do {
            Object object2 = arrn;
            if (n10 >= n9) break;
            int n11 = n9;
            if (n8 == object2.e(n10)) {
                x0.Z z8 = object2.f(n10);
                int n12 = 0;
                do {
                    n11 = n9;
                    if (n12 >= z8.a) break;
                    J j8 = z8.b(n12);
                    List list = a8.a(n10, j8, (int[])object[n10][n12]);
                    boolean[] arrbl = new boolean[j8.a];
                    for (n11 = 0; n11 < j8.a; ++n11) {
                        i i8 = (i)list.get(n11);
                        int n13 = i8.c();
                        if (arrbl[n11] || n13 == 0) continue;
                        if (n13 == 1) {
                            object2 = X2.v.Z(i8);
                        } else {
                            object2 = new ArrayList();
                            object2.add((Object)i8);
                            for (n13 = n11 + 1; n13 < j8.a; ++n13) {
                                i i9 = (i)list.get(n13);
                                if (i9.c() != 2 || !i8.e(i9)) continue;
                                object2.add((Object)i9);
                                arrbl[n13] = true;
                            }
                        }
                        arrayList.add(object2);
                    }
                    ++n12;
                } while (true);
            }
            ++n10;
            n9 = n11;
        } while (true);
        if (arrayList.isEmpty()) {
            return null;
        }
        object = (List)Collections.max((Collection)arrayList, (Comparator)comparator);
        arrn = new int[object.size()];
        for (n8 = 0; n8 < object.size(); ++n8) {
            arrn[n8] = ((i)object.get((int)n8)).q;
        }
        object = (i)object.get(0);
        return Pair.create((Object)new y.a(object.p, arrn), (Object)object.o);
    }

    public Pair g0(A.a a8, int[][][] arrn, int[] arrn2, e e8) {
        if (e8.s.a == 2) {
            return null;
        }
        return this.f0(2, a8, arrn, new A0.i(e8, arrn2), new A0.j());
    }

    @Override
    public boolean h() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h0(e e8) {
        g0.a.e(e8);
        Object object = this.d;
        // MONITORENTER : object
        boolean bl = this.h.equals(e8);
        this.h = e8;
        // MONITOREXIT : object
        if (!(bl ^ true)) return;
        if (e8.t0 && this.e == null) {
            g0.o.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void j() {
        g g8;
        Object object = this.d;
        // MONITORENTER : object
        if (M.a >= 32 && (g8 = this.i) != null) {
            g8.f();
        }
        // MONITOREXIT : object
        D.super.j();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void l(d0.b b8) {
        Object object = this.d;
        // MONITORENTER : object
        boolean bl = this.j.equals(b8);
        this.j = b8;
        // MONITOREXIT : object
        if (!(bl ^ true)) return;
        this.V();
    }

    @Override
    public void m(K k8) {
        if (k8 instanceof e) {
            this.h0((e)k8);
        }
        this.h0(new e.a(this.J(), null).d0(k8).a0());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Pair q(A.a a8, int[][][] arrn, int[] object, x.b arry, I arrb1) {
        e e8;
        int n8;
        int n9;
        int n10;
        g g8;
        Object object2 = this.d;
        // MONITORENTER : object2
        e8 = this.h;
        if (e8.t0 && M.a >= 32 && (g8 = this.i) != null) {
            g8.b(this, (Looper)g0.a.h((Object)Looper.myLooper()));
        }
        // MONITOREXIT : object2
        n10 = a8.d();
        object = this.a0(a8, arrn, (int[])object, e8);
        n.E(a8, e8, (y.a[])object);
        n.D(a8, e8, (y.a[])object);
        n9 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            int n11 = a8.e(n8);
            if (!e8.i(n8) && !e8.B.contains(n11)) continue;
            object[n8] = null;
        }
        arry = this.f.a((y.a[])object, this.b(), (x.b)arry, (I)arrb1);
        arrb1 = new b1[n10];
        for (n8 = n9; n8 < n10; ++n8) {
            n9 = a8.e(n8);
            object = !e8.i(n8) && !e8.B.contains(n9) && (a8.e(n8) == -2 || arry[n8] != null) ? b1.c : null;
            arrb1[n8] = object;
        }
        if (e8.v0) {
            n.U(a8, arrn, arrb1, arry);
        }
        if (e8.s.a == 0) return Pair.create((Object)arrb1, (Object)arry);
        n.T(e8, a8, arrn, arrb1, arry);
        return Pair.create((Object)arrb1, (Object)arry);
    }

    public static final class b
    extends i
    implements Comparable {
        public final boolean A;
        public final boolean B;
        public final int C;
        public final int D;
        public final boolean E;
        public final int F;
        public final int G;
        public final int H;
        public final int I;
        public final boolean J;
        public final boolean K;
        public final int s;
        public final boolean t;
        public final String u;
        public final e v;
        public final boolean w;
        public final int x;
        public final int y;
        public final int z;

        public b(int n8, J object, int n9, e e8, int n10, boolean bl, W2.n n11, int n12) {
            boolean bl2;
            int n13;
            boolean bl3;
            block7 : {
                block6 : {
                    super(n8, (J)object, n9);
                    this.v = e8;
                    n9 = e8.s0 ? 24 : 16;
                    bl2 = e8.o0;
                    bl3 = true;
                    bl2 = bl2 && (n12 & n9) != 0;
                    this.A = bl2;
                    this.u = n.X(this.r.d);
                    this.w = Z0.k(n10, false);
                    n8 = 0;
                    do {
                        n12 = e8.n.size();
                        n13 = Integer.MAX_VALUE;
                        if (n8 >= n12) break;
                        n12 = n.G(this.r, (String)e8.n.get(n8), false);
                        if (n12 <= 0) {
                            ++n8;
                            continue;
                        }
                        break block6;
                        break;
                    } while (true);
                    n12 = 0;
                    n8 = Integer.MAX_VALUE;
                }
                this.y = n8;
                this.x = n12;
                this.z = n.K(this.r.f, e8.o);
                object = this.r;
                n8 = object.f;
                bl2 = n8 == 0 || (n8 & 1) != 0;
                this.B = bl2;
                bl2 = (object.e & 1) != 0;
                this.E = bl2;
                this.F = n8 = object.B;
                this.G = object.C;
                this.H = n12 = object.i;
                bl2 = !(n12 != -1 && n12 > e8.q || n8 != -1 && n8 > e8.p || !n11.apply(object));
                this.t = bl2;
                object = M.l0();
                for (n8 = 0; n8 < object.length; ++n8) {
                    n12 = n.G(this.r, object[n8], false);
                    if (n12 <= 0) {
                        continue;
                    }
                    break block7;
                }
                n12 = 0;
                n8 = Integer.MAX_VALUE;
            }
            this.C = n8;
            this.D = n12;
            n8 = 0;
            do {
                n12 = n13;
                if (n8 >= e8.r.size()) break;
                object = this.r.n;
                if (object != null && object.equals(e8.r.get(n8))) {
                    n12 = n8;
                    break;
                }
                ++n8;
            } while (true);
            this.I = n12;
            bl2 = Z0.g(n10) == 128;
            this.J = bl2;
            bl2 = Z0.i(n10) == 64 ? bl3 : false;
            this.K = bl2;
            this.s = this.m(n10, bl, n9);
        }

        public static int h(List list, List list2) {
            return ((b)Collections.max((Collection)list)).j((b)Collections.max((Collection)list2));
        }

        public static X2.v l(int n8, J j8, e e8, int[] arrn, boolean bl, W2.n n9, int n10) {
            v.a a8 = X2.v.M();
            for (int i8 = 0; i8 < j8.a; ++i8) {
                a8.h(new b(n8, j8, i8, e8, arrn[i8], bl, n9, n10));
            }
            return a8.k();
        }

        @Override
        public int c() {
            return this.s;
        }

        public int j(b b8) {
            X2.n n8;
            P p8 = this.t && this.w ? k : k.g();
            X2.n n9 = n8 = X2.n.j().g(this.w, b8.w).f(this.y, b8.y, P.d().g()).d(this.x, b8.x).d(this.z, b8.z).g(this.E, b8.E).g(this.B, b8.B).f(this.C, b8.C, P.d().g()).d(this.D, b8.D).g(this.t, b8.t).f(this.I, b8.I, P.d().g());
            if (this.v.y) {
                n9 = n8.f(this.H, b8.H, k.g());
            }
            n9 = n8 = n9.g(this.J, b8.J).g(this.K, b8.K).f(this.F, b8.F, p8).f(this.G, b8.G, p8);
            if (M.c(this.u, b8.u)) {
                n9 = n8.f(this.H, b8.H, p8);
            }
            return n9.i();
        }

        public final int m(int n8, boolean bl, int n9) {
            if (!Z0.k(n8, this.v.u0)) {
                return 0;
            }
            if (!this.t && !this.v.n0) {
                return 0;
            }
            e e8 = this.v;
            if (e8.s.a == 2 && !n.Y(e8, n8, this.r)) {
                return 0;
            }
            if (Z0.k(n8, false) && this.t && this.r.i != -1) {
                e8 = this.v;
                if (!(e8.z || e8.y || !e8.w0 && bl || e8.s.a == 2 || (n8 & n9) == 0)) {
                    return 2;
                }
            }
            return 1;
        }

        public boolean n(b b8) {
            block3 : {
                block2 : {
                    int n8;
                    Object object;
                    if (!this.v.q0 && ((n8 = this.r.B) == -1 || n8 != b8.r.B) || !this.A && ((object = this.r.n) == null || !TextUtils.equals((CharSequence)object, (CharSequence)b8.r.n))) break block2;
                    object = this.v;
                    if ((object.p0 || (n8 = this.r.C) != -1 && n8 == b8.r.C) && (object.r0 || this.J == b8.J && this.K == b8.K)) break block3;
                }
                return false;
            }
            return true;
        }
    }

    public static final class c
    extends i
    implements Comparable {
        public final int s;
        public final int t;

        public c(int n8, J j8, int n9, e e8, int n10) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public static int h(List list, List list2) {
            return ((c)list.get(0)).j((c)list2.get(0));
        }

        public static X2.v l(int n8, J j8, e e8, int[] arrn) {
            v.a a8 = X2.v.M();
            for (int i8 = 0; i8 < j8.a; ++i8) {
                a8.h(new c(n8, j8, i8, e8, arrn[i8]));
            }
            return a8.k();
        }

        @Override
        public int c() {
            return this.s;
        }

        public int j(c c8) {
            return Integer.compare((int)this.t, (int)c8.t);
        }

        public boolean m(c c8) {
            return false;
        }
    }

    public static final class d
    implements Comparable {
        public final boolean o;
        public final boolean p;

        public d(d0.q q8, int n8) {
            int n9 = q8.e;
            boolean bl = true;
            if ((n9 & 1) == 0) {
                bl = false;
            }
            this.o = bl;
            this.p = Z0.k(n8, false);
        }

        public int c(d d8) {
            return X2.n.j().g(this.p, d8.p).g(this.o, d8.o).i();
        }
    }

    public static final class e
    extends K {
        public static final e A0;
        public static final e B0;
        public static final String C0;
        public static final String D0;
        public static final String E0;
        public static final String F0;
        public static final String G0;
        public static final String H0;
        public static final String I0;
        public static final String J0;
        public static final String K0;
        public static final String L0;
        public static final String M0;
        public static final String N0;
        public static final String O0;
        public static final String P0;
        public static final String Q0;
        public static final String R0;
        public static final String S0;
        public static final String T0;
        public static final String U0;
        public final boolean j0;
        public final boolean k0;
        public final boolean l0;
        public final boolean m0;
        public final boolean n0;
        public final boolean o0;
        public final boolean p0;
        public final boolean q0;
        public final boolean r0;
        public final boolean s0;
        public final boolean t0;
        public final boolean u0;
        public final boolean v0;
        public final boolean w0;
        public final boolean x0;
        public final SparseArray y0;
        public final SparseBooleanArray z0;

        static {
            e e8;
            A0 = e8 = new a().a0();
            B0 = e8;
            C0 = M.w0(1000);
            D0 = M.w0(1001);
            E0 = M.w0(1002);
            F0 = M.w0(1003);
            G0 = M.w0(1004);
            H0 = M.w0(1005);
            I0 = M.w0(1006);
            J0 = M.w0(1007);
            K0 = M.w0(1008);
            L0 = M.w0(1009);
            M0 = M.w0(1010);
            N0 = M.w0(1011);
            O0 = M.w0(1012);
            P0 = M.w0(1013);
            Q0 = M.w0(1014);
            R0 = M.w0(1015);
            S0 = M.w0(1016);
            T0 = M.w0(1017);
            U0 = M.w0(1018);
        }

        public e(a a8) {
            super(a8);
            this.j0 = a8.C;
            this.k0 = a8.D;
            this.l0 = a8.E;
            this.m0 = a8.F;
            this.n0 = a8.G;
            this.o0 = a8.H;
            this.p0 = a8.I;
            this.q0 = a8.J;
            this.r0 = a8.K;
            this.s0 = a8.L;
            this.t0 = a8.M;
            this.u0 = a8.N;
            this.v0 = a8.O;
            this.w0 = a8.P;
            this.x0 = a8.Q;
            this.y0 = a8.R;
            this.z0 = a8.S;
        }

        public /* synthetic */ e(a a8,  a9) {
            this(a8);
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int n8 = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != n8) {
                return false;
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i8)) >= 0) continue;
                return false;
            }
            return true;
        }

        public static boolean e(SparseArray sparseArray, SparseArray sparseArray2) {
            int n8 = sparseArray.size();
            if (sparseArray2.size() != n8) {
                return false;
            }
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                if (n9 >= 0) {
                    if (e.f((Map)sparseArray.valueAt(i8), (Map)sparseArray2.valueAt(n9))) continue;
                    return false;
                }
                return false;
            }
            return true;
        }

        public static boolean f(Map map, Map map2) {
            int n8 = map.size();
            if (map2.size() != n8) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                x0.Z z8 = (x0.Z)entry.getKey();
                if (map2.containsKey((Object)z8) && M.c(entry.getValue(), map2.get((Object)z8))) continue;
                return false;
            }
            return true;
        }

        public static e h(Context context) {
            return new a(context).a0();
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (e.class != object.getClass()) {
                    return false;
                }
                if (super.equals(object = (e)object) && this.j0 == object.j0 && this.k0 == object.k0 && this.l0 == object.l0 && this.m0 == object.m0 && this.n0 == object.n0 && this.o0 == object.o0 && this.p0 == object.p0 && this.q0 == object.q0 && this.r0 == object.r0 && this.s0 == object.s0 && this.t0 == object.t0 && this.u0 == object.u0 && this.v0 == object.v0 && this.w0 == object.w0 && this.x0 == object.x0 && e.d(this.z0, object.z0) && e.e(this.y0, object.y0)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public a g() {
            return new a(this, null);
        }

        @Override
        public int hashCode() {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public boolean i(int n8) {
            return this.z0.get(n8);
        }

        public f j(int n8, x0.Z z8) {
            Map map = (Map)this.y0.get(n8);
            if (map != null) {
                android.support.v4.media.a.a(map.get((Object)z8));
            }
            return null;
        }

        public boolean k(int n8, x0.Z z8) {
            Map map = (Map)this.y0.get(n8);
            if (map != null && map.containsKey((Object)z8)) {
                return true;
            }
            return false;
        }

        public static final class a
        extends K.c {
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public boolean N;
            public boolean O;
            public boolean P;
            public boolean Q;
            public final SparseArray R;
            public final SparseBooleanArray S;

            public a() {
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                this.c0();
            }

            public a(e e8) {
                super(e8);
                this.C = e8.j0;
                this.D = e8.k0;
                this.E = e8.l0;
                this.F = e8.m0;
                this.G = e8.n0;
                this.H = e8.o0;
                this.I = e8.p0;
                this.J = e8.q0;
                this.K = e8.r0;
                this.L = e8.s0;
                this.M = e8.t0;
                this.N = e8.u0;
                this.O = e8.v0;
                this.P = e8.w0;
                this.Q = e8.x0;
                this.R = a.b0(e8.y0);
                this.S = e8.z0.clone();
            }

            public /* synthetic */ a(e e8,  a8) {
                this(e8);
            }

            public a(Context context) {
                super(context);
                this.R = new SparseArray();
                this.S = new SparseBooleanArray();
                this.c0();
            }

            public static SparseArray b0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
                    sparseArray2.put(sparseArray.keyAt(i8), (Object)new HashMap((Map)sparseArray.valueAt(i8)));
                }
                return sparseArray2;
            }

            public e a0() {
                return new e(this, null);
            }

            public final void c0() {
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = true;
                this.H = false;
                this.I = false;
                this.J = false;
                this.K = false;
                this.L = true;
                this.M = true;
                this.N = true;
                this.O = false;
                this.P = true;
                this.Q = false;
            }

            public a d0(K k8) {
                super.E(k8);
                return this;
            }

            public a e0(Context context) {
                super.G(context);
                return this;
            }

            public a f0(int n8, int n9, boolean bl) {
                super.H(n8, n9, bl);
                return this;
            }

            public a g0(Context context, boolean bl) {
                super.I(context, bl);
                return this;
            }
        }

    }

    public static final abstract class f {
    }

    public static class g {
        public final Spatializer a;
        public final boolean b;
        public Handler c;
        public Spatializer$OnSpatializerStateChangedListener d;

        public g(Spatializer spatializer) {
            this.a = spatializer;
            boolean bl = p.a(spatializer) != 0;
            this.b = bl;
        }

        public static g g(Context context) {
            if ((context = (AudioManager)context.getSystemService("audio")) == null) {
                return null;
            }
            return new g(o.a((AudioManager)context));
        }

        public boolean a(d0.b b8, d0.q q8) {
            int n8 = "audio/eac3-joc".equals((Object)q8.n) && q8.B == 16 ? 12 : q8.B;
            if ((n8 = M.M(n8)) == 0) {
                return false;
            }
            AudioFormat.Builder builder = new AudioFormat.Builder().setEncoding(2).setChannelMask(n8);
            n8 = q8.C;
            if (n8 != -1) {
                builder.setSampleRate(n8);
            }
            return u.a(this.a, b8.a().a, builder.build());
        }

        public void b(final n n8, Looper looper) {
            if (this.d == null) {
                if (this.c != null) {
                    return;
                }
                this.d = new Spatializer$OnSpatializerStateChangedListener(){

                    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean bl) {
                        n8.V();
                    }

                    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean bl) {
                        n8.V();
                    }
                };
                n8 = new Handler(looper);
                this.c = n8;
                looper = this.a;
                Objects.requireNonNull((Object)n8);
                q.a((Spatializer)looper, new Z((Handler)n8), this.d);
            }
        }

        public boolean c() {
            return s.a(this.a);
        }

        public boolean d() {
            return t.a(this.a);
        }

        public boolean e() {
            return this.b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.d;
            if (spatializer$OnSpatializerStateChangedListener != null) {
                if (this.c == null) {
                    return;
                }
                r.a(this.a, spatializer$OnSpatializerStateChangedListener);
                ((Handler)M.i((Object)this.c)).removeCallbacksAndMessages((Object)null);
                this.c = null;
                this.d = null;
            }
        }

    }

    public static final class h
    extends i
    implements Comparable {
        public final boolean A;
        public final int s;
        public final boolean t;
        public final boolean u;
        public final boolean v;
        public final int w;
        public final int x;
        public final int y;
        public final int z;

        public h(int n8, J object, int n9, e e8, int n10, String string2) {
            boolean bl;
            int n11;
            int n12;
            block4 : {
                super(n8, (J)object, n9);
                n12 = 0;
                this.t = Z0.k(n10, false);
                n8 = this.r.e & e8.v;
                bl = (n8 & 1) != 0;
                this.u = bl;
                bl = (n8 & 2) != 0;
                this.v = bl;
                object = e8.t.isEmpty() ? X2.v.Z("") : e8.t;
                for (n8 = 0; n8 < object.size(); ++n8) {
                    n9 = n.G(this.r, (String)object.get(n8), e8.w);
                    if (n9 <= 0) {
                        continue;
                    }
                    break block4;
                }
                n8 = Integer.MAX_VALUE;
                n9 = 0;
            }
            this.w = n8;
            this.x = n9;
            this.y = n8 = n.K(this.r.f, e8.u);
            bl = (this.r.f & 1088) != 0;
            this.A = bl;
            bl = n.X(string2) == null;
            this.z = n11 = n.G(this.r, string2, bl);
            n8 = !(n9 > 0 || e8.t.isEmpty() && n8 > 0 || this.u || this.v && n11 > 0) ? 0 : 1;
            n9 = n12;
            if (Z0.k(n10, e8.u0)) {
                n9 = n12;
                if (n8 != 0) {
                    n9 = 1;
                }
            }
            this.s = n9;
        }

        public static int h(List list, List list2) {
            return ((h)list.get(0)).j((h)list2.get(0));
        }

        public static X2.v l(int n8, J j8, e e8, int[] arrn, String string2) {
            v.a a8 = X2.v.M();
            for (int i8 = 0; i8 < j8.a; ++i8) {
                a8.h(new h(n8, j8, i8, e8, arrn[i8], string2));
            }
            return a8.k();
        }

        @Override
        public int c() {
            return this.s;
        }

        public int j(h h8) {
            X2.n n8 = X2.n.j().g(this.t, h8.t).f(this.w, h8.w, P.d().g()).d(this.x, h8.x).d(this.y, h8.y).g(this.u, h8.u);
            boolean bl = this.v;
            boolean bl2 = h8.v;
            Object object = this.x == 0 ? P.d() : P.d().g();
            n8 = n8.f(bl, bl2, (Comparator)object).d(this.z, h8.z);
            object = n8;
            if (this.y == 0) {
                object = n8.h(this.A, h8.A);
            }
            return object.i();
        }

        public boolean m(h h8) {
            return false;
        }
    }

    public static abstract class i {
        public final int o;
        public final J p;
        public final int q;
        public final d0.q r;

        public i(int n8, J j8, int n9) {
            this.o = n8;
            this.p = j8;
            this.q = n9;
            this.r = j8.a(n9);
        }

        public abstract int c();

        public abstract boolean e(i var1);

        public static interface a {
            public List a(int var1, J var2, int[] var3);
        }

    }

    public static final class j
    extends i {
        public final int A;
        public final boolean B;
        public final boolean C;
        public final int D;
        public final boolean E;
        public final boolean F;
        public final int G;
        public final boolean s;
        public final e t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final int x;
        public final int y;
        public final int z;

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public j(int var1_1, J var2_2, int var3_3, e var4_4, int var5_5, int var6_6, boolean var7_7) {
            block6 : {
                super(var1_1, (J)var2_2, var3_3);
                this.t = var4_4;
                var3_3 = var4_4.l0 != false ? 24 : 16;
                var9_8 = var4_4.k0;
                var10_9 = true;
                var9_8 = var9_8 != false && (var6_6 & var3_3) != 0;
                this.C = var9_8;
                if (!var7_7) ** GOTO lbl-1000
                var2_2 = this.r;
                var1_1 = var2_2.t;
                if (!(var1_1 != -1 && var1_1 > var4_4.a || (var1_1 = var2_2.u) != -1 && var1_1 > var4_4.b || (var8_10 = var2_2.v) != -1.0f && var8_10 > (float)var4_4.c || (var1_1 = var2_2.i) != -1 && var1_1 > var4_4.d)) {
                    var9_8 = true;
                } else lbl-1000: // 2 sources:
                {
                    var9_8 = false;
                }
                this.s = var9_8;
                if (!var7_7) ** GOTO lbl-1000
                var2_2 = this.r;
                var1_1 = var2_2.t;
                if (!(var1_1 != -1 && var1_1 < var4_4.e || (var1_1 = var2_2.u) != -1 && var1_1 < var4_4.f || (var8_10 = var2_2.v) != -1.0f && var8_10 < (float)var4_4.g || (var1_1 = var2_2.i) != -1 && var1_1 < var4_4.h)) {
                    var7_7 = true;
                } else lbl-1000: // 2 sources:
                {
                    var7_7 = false;
                }
                this.u = var7_7;
                this.v = Z0.k(var5_5, false);
                var2_2 = this.r;
                var8_10 = var2_2.v;
                var7_7 = var8_10 != -1.0f && var8_10 >= 10.0f;
                this.w = var7_7;
                this.x = var2_2.i;
                this.y = var2_2.d();
                this.A = n.y(this.r.f, var4_4.m);
                var1_1 = this.r.f;
                var7_7 = var1_1 == 0 || (var1_1 & 1) != 0;
                this.B = var7_7;
                for (var1_1 = 0; var1_1 < var4_4.l.size(); ++var1_1) {
                    var2_2 = this.r.n;
                    if (var2_2 == null || !var2_2.equals(var4_4.l.get(var1_1))) {
                        continue;
                    }
                    break block6;
                }
                var1_1 = Integer.MAX_VALUE;
            }
            this.z = var1_1;
            var7_7 = Z0.g(var5_5) == 128;
            this.E = var7_7;
            var7_7 = Z0.i(var5_5) == 64 ? var10_9 : false;
            this.F = var7_7;
            this.G = n.z(this.r.n);
            this.D = this.p(var5_5, var3_3);
        }

        public static /* synthetic */ int h(j j8, j j9) {
            return j.m(j8, j9);
        }

        public static /* synthetic */ int j(j j8, j j9) {
            return j.l(j8, j9);
        }

        public static int l(j j8, j j9) {
            X2.n n8;
            X2.n n9 = n8 = X2.n.j().g(j8.v, j9.v).d(j8.A, j9.A).g(j8.B, j9.B).g(j8.w, j9.w).g(j8.s, j9.s).g(j8.u, j9.u).f(j8.z, j9.z, P.d().g()).g(j8.E, j9.E).g(j8.F, j9.F);
            if (j8.E) {
                n9 = n8;
                if (j8.F) {
                    n9 = n8.d(j8.G, j9.G);
                }
            }
            return n9.i();
        }

        public static int m(j j8, j j9) {
            X2.n n8;
            P p8 = j8.s && j8.v ? k : k.g();
            X2.n n9 = n8 = X2.n.j();
            if (j8.t.y) {
                n9 = n8.f(j8.x, j9.x, k.g());
            }
            return n9.f(j8.y, j9.y, p8).f(j8.x, j9.x, p8).i();
        }

        public static int n(List list, List list2) {
            return X2.n.j().f((j)Collections.max((Collection)list, (Comparator)new v()), (j)Collections.max((Collection)list2, (Comparator)new v()), new v()).d(list.size(), list2.size()).f((j)Collections.max((Collection)list, (Comparator)new w()), (j)Collections.max((Collection)list2, (Comparator)new w()), new w()).i();
        }

        public static X2.v o(int n8, J j8, e e8, int[] arrn, int n9) {
            int n10 = n.H(j8, e8.i, e8.j, e8.k);
            v.a a8 = X2.v.M();
            for (int i8 = 0; i8 < j8.a; ++i8) {
                int n11 = j8.a(i8).d();
                boolean bl = n10 == Integer.MAX_VALUE || n11 != -1 && n11 <= n10;
                a8.h(new j(n8, j8, i8, e8, arrn[i8], n9, bl));
            }
            return a8.k();
        }

        @Override
        public int c() {
            return this.D;
        }

        public final int p(int n8, int n9) {
            if ((this.r.f & 16384) != 0) {
                return 0;
            }
            if (!Z0.k(n8, this.t.u0)) {
                return 0;
            }
            if (!this.s && !this.t.j0) {
                return 0;
            }
            if (Z0.k(n8, false) && this.u && this.s && this.r.i != -1) {
                e e8 = this.t;
                if (!e8.z && !e8.y && (n8 & n9) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        public boolean r(j j8) {
            if (!this.C && !M.c(this.r.n, j8.r.n) || !this.t.m0 && (this.E != j8.E || this.F != j8.F)) {
                return false;
            }
            return true;
        }
    }

}

