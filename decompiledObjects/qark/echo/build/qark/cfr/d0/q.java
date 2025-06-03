/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Objects
 *  java.util.UUID
 */
package d0;

import X2.v;
import android.text.TextUtils;
import d0.g;
import d0.h;
import d0.m;
import d0.t;
import d0.x;
import d0.z;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class q {
    public static final q M = new b().K();
    public static final String N = M.w0(0);
    public static final String O = M.w0(1);
    public static final String P = M.w0(2);
    public static final String Q = M.w0(3);
    public static final String R = M.w0(4);
    public static final String S = M.w0(5);
    public static final String T = M.w0(6);
    public static final String U = M.w0(7);
    public static final String V = M.w0(8);
    public static final String W = M.w0(9);
    public static final String X = M.w0(10);
    public static final String Y = M.w0(11);
    public static final String Z = M.w0(12);
    public static final String a0 = M.w0(13);
    public static final String b0 = M.w0(14);
    public static final String c0 = M.w0(15);
    public static final String d0 = M.w0(16);
    public static final String e0 = M.w0(17);
    public static final String f0 = M.w0(18);
    public static final String g0 = M.w0(19);
    public static final String h0 = M.w0(20);
    public static final String i0 = M.w0(21);
    public static final String j0 = M.w0(22);
    public static final String k0 = M.w0(23);
    public static final String l0 = M.w0(24);
    public static final String m0 = M.w0(25);
    public static final String n0 = M.w0(26);
    public static final String o0 = M.w0(27);
    public static final String p0 = M.w0(28);
    public static final String q0 = M.w0(29);
    public static final String r0 = M.w0(30);
    public static final String s0 = M.w0(31);
    public static final String t0 = M.w0(32);
    public final h A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final x k;
    public final Object l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final m r;
    public final long s;
    public final int t;
    public final int u;
    public final float v;
    public final int w;
    public final float x;
    public final byte[] y;
    public final int z;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public q(b var1_1) {
        block3 : {
            super();
            this.a = b.w(var1_1);
            var5_2 = M.L0(b.E(var1_1));
            this.d = var5_2;
            if (!b.a(var1_1).isEmpty() || b.l(var1_1) == null) break block3;
            var5_2 = v.Z(new t((String)var5_2, b.l(var1_1)));
            ** GOTO lbl15
        }
        if (!b.a(var1_1).isEmpty() && b.l(var1_1) == null) {
            this.c = b.a(var1_1);
            var5_2 = q.c(b.a(var1_1), (String)var5_2);
        } else {
            a.f(q.f(var1_1));
            var5_2 = b.a(var1_1);
lbl15: // 2 sources:
            this.c = var5_2;
            var5_2 = b.l(var1_1);
        }
        this.b = var5_2;
        this.e = b.F(var1_1);
        this.f = b.G(var1_1);
        this.g = var3_3 = b.H(var1_1);
        this.h = var4_4 = b.I(var1_1);
        if (var4_4 != -1) {
            var3_3 = var4_4;
        }
        this.i = var3_3;
        this.j = b.J(var1_1);
        this.k = b.b(var1_1);
        this.l = b.c(var1_1);
        this.m = b.d(var1_1);
        this.n = b.e(var1_1);
        this.o = b.f(var1_1);
        this.p = b.g(var1_1);
        var5_2 = b.h(var1_1) == null ? Collections.emptyList() : b.h(var1_1);
        this.q = var5_2;
        this.r = var5_2 = b.i(var1_1);
        this.s = b.j(var1_1);
        this.t = b.k(var1_1);
        this.u = b.m(var1_1);
        this.v = b.n(var1_1);
        var3_3 = b.o(var1_1);
        var4_4 = 0;
        var3_3 = var3_3 == -1 ? 0 : b.o(var1_1);
        this.w = var3_3;
        var2_5 = b.p(var1_1) == -1.0f ? 1.0f : b.p(var1_1);
        this.x = var2_5;
        this.y = b.q(var1_1);
        this.z = b.r(var1_1);
        this.A = b.s(var1_1);
        this.B = b.t(var1_1);
        this.C = b.u(var1_1);
        this.D = b.v(var1_1);
        var3_3 = b.x(var1_1) == -1 ? 0 : b.x(var1_1);
        this.E = var3_3;
        var3_3 = b.y(var1_1) == -1 ? var4_4 : b.y(var1_1);
        this.F = var3_3;
        this.G = b.z(var1_1);
        this.H = b.A(var1_1);
        this.I = b.B(var1_1);
        this.J = b.C(var1_1);
        var3_3 = b.D(var1_1) == 0 && var5_2 != null ? 1 : b.D(var1_1);
        this.K = var3_3;
    }

    public /* synthetic */ q(b b8,  a8) {
        this(b8);
    }

    public static String c(List list, String string2) {
        for (t t8 : list) {
            if (!TextUtils.equals((CharSequence)t8.a, (CharSequence)string2)) continue;
            return t8.b;
        }
        return ((t)list.get((int)0)).b;
    }

    public static boolean f(b b8) {
        if (b8.c.isEmpty() && b8.b == null) {
            return true;
        }
        for (int i8 = 0; i8 < b8.c.size(); ++i8) {
            if (!((t)b.a((b)b8).get((int)i8)).b.equals((Object)b8.b)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String g(q q8) {
        Object object;
        if (q8 == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id=");
        stringBuilder.append(q8.a);
        stringBuilder.append(", mimeType=");
        stringBuilder.append(q8.n);
        if (q8.m != null) {
            stringBuilder.append(", container=");
            stringBuilder.append(q8.m);
        }
        if (q8.i != -1) {
            stringBuilder.append(", bitrate=");
            stringBuilder.append(q8.i);
        }
        if (q8.j != null) {
            stringBuilder.append(", codecs=");
            stringBuilder.append(q8.j);
        }
        if (q8.r != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int n8 = 0;
            do {
                object = q8.r;
                if (n8 >= object.r) break;
                object = object.e((int)n8).p;
                if (object.equals((Object)g.b)) {
                    object = "cenc";
                } else if (object.equals((Object)g.c)) {
                    object = "clearkey";
                } else if (object.equals((Object)g.e)) {
                    object = "playready";
                } else if (object.equals((Object)g.d)) {
                    object = "widevine";
                } else if (object.equals((Object)g.a)) {
                    object = "universal";
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("unknown (");
                    stringBuilder2.append(object);
                    stringBuilder2.append(")");
                    object = stringBuilder2.toString();
                }
                linkedHashSet.add(object);
                ++n8;
            } while (true);
            stringBuilder.append(", drm=[");
            W2.h.f(',').b(stringBuilder, (Iterable)linkedHashSet);
            stringBuilder.append(']');
        }
        if (q8.t != -1 && q8.u != -1) {
            stringBuilder.append(", res=");
            stringBuilder.append(q8.t);
            stringBuilder.append("x");
            stringBuilder.append(q8.u);
        }
        if ((object = q8.A) != null && object.i()) {
            stringBuilder.append(", color=");
            stringBuilder.append(q8.A.m());
        }
        if (q8.v != -1.0f) {
            stringBuilder.append(", fps=");
            stringBuilder.append(q8.v);
        }
        if (q8.B != -1) {
            stringBuilder.append(", channels=");
            stringBuilder.append(q8.B);
        }
        if (q8.C != -1) {
            stringBuilder.append(", sample_rate=");
            stringBuilder.append(q8.C);
        }
        if (q8.d != null) {
            stringBuilder.append(", language=");
            stringBuilder.append(q8.d);
        }
        if (!q8.c.isEmpty()) {
            stringBuilder.append(", labels=[");
            W2.h.f(',').b(stringBuilder, (Iterable)q8.c);
            stringBuilder.append("]");
        }
        if (q8.e != 0) {
            stringBuilder.append(", selectionFlags=[");
            W2.h.f(',').b(stringBuilder, (Iterable)M.j0(q8.e));
            stringBuilder.append("]");
        }
        if (q8.f != 0) {
            stringBuilder.append(", roleFlags=[");
            W2.h.f(',').b(stringBuilder, (Iterable)M.i0(q8.f));
            stringBuilder.append("]");
        }
        if (q8.l != null) {
            stringBuilder.append(", customData=");
            stringBuilder.append(q8.l);
        }
        return stringBuilder.toString();
    }

    public b a() {
        return new b(this, null);
    }

    public q b(int n8) {
        return this.a().R(n8).K();
    }

    public int d() {
        int n8 = this.t;
        int n9 = -1;
        if (n8 != -1) {
            n9 = this.u;
            if (n9 == -1) {
                return -1;
            }
            n9 = n8 * n9;
        }
        return n9;
    }

    public boolean e(q q8) {
        if (this.q.size() != q8.q.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.q.size(); ++i8) {
            if (Arrays.equals((byte[])((byte[])this.q.get(i8)), (byte[])((byte[])q8.q.get(i8)))) continue;
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            int n8;
            if (q.class != object.getClass()) {
                return false;
            }
            object = (q)object;
            int n9 = this.L;
            if (n9 != 0 && (n8 = object.L) != 0 && n9 != n8) {
                return false;
            }
            if (this.e == object.e && this.f == object.f && this.g == object.g && this.h == object.h && this.o == object.o && this.s == object.s && this.t == object.t && this.u == object.u && this.w == object.w && this.z == object.z && this.B == object.B && this.C == object.C && this.D == object.D && this.E == object.E && this.F == object.F && this.G == object.G && this.I == object.I && this.J == object.J && this.K == object.K && Float.compare((float)this.v, (float)object.v) == 0 && Float.compare((float)this.x, (float)object.x) == 0 && Objects.equals((Object)this.a, (Object)object.a) && Objects.equals((Object)this.b, (Object)object.b) && this.c.equals((Object)object.c) && Objects.equals((Object)this.j, (Object)object.j) && Objects.equals((Object)this.m, (Object)object.m) && Objects.equals((Object)this.n, (Object)object.n) && Objects.equals((Object)this.d, (Object)object.d) && Arrays.equals((byte[])this.y, (byte[])object.y) && Objects.equals((Object)this.k, (Object)object.k) && Objects.equals((Object)this.A, (Object)object.A) && Objects.equals((Object)this.r, (Object)object.r) && this.e((q)object) && Objects.equals((Object)this.l, (Object)object.l)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public q h(q object) {
        String string2;
        int n8;
        String string3;
        String string4;
        int n9;
        int n10;
        Object object2;
        float f8;
        int n11;
        List list;
        Object object3;
        int n12;
        block13 : {
            block12 : {
                if (this == object) {
                    return this;
                }
                n10 = z.k(this.n);
                string3 = object.a;
                n8 = object.I;
                n9 = object.J;
                string4 = object.b;
                if (string4 == null) {
                    string4 = this.b;
                }
                list = !object.c.isEmpty() ? object.c : this.c;
                object2 = this.d;
                if (n10 == 3) break block12;
                string2 = object2;
                if (n10 != 1) break block13;
            }
            object3 = object.d;
            string2 = object2;
            if (object3 != null) {
                string2 = object3;
            }
        }
        int n13 = n11 = this.g;
        if (n11 == -1) {
            n13 = object.g;
        }
        n11 = n12 = this.h;
        if (n12 == -1) {
            n11 = object.h;
        }
        object2 = object3 = this.j;
        if (object3 == null) {
            String string5 = M.Q(object.j, n10);
            object2 = object3;
            if (M.d1(string5).length == 1) {
                object2 = string5;
            }
        }
        object3 = (object3 = this.k) == null ? object.k : object3.b(object.k);
        float f9 = f8 = this.v;
        if (f8 == -1.0f) {
            f9 = f8;
            if (n10 == 2) {
                f9 = object.v;
            }
        }
        n12 = this.e;
        n10 = object.e;
        int n14 = this.f;
        int n15 = object.f;
        object = m.d(object.r, this.r);
        return this.a().a0(string3).c0(string4).d0(list).e0(string2).q0(n12 | n10).m0(n14 | n15).M(n13).j0(n11).O((String)object2).h0((x)object3).U((m)object).X(f9).t0(n8).u0(n9).K();
    }

    public int hashCode() {
        if (this.L == 0) {
            Object object = this.a;
            int n8 = 0;
            int n9 = object == null ? 0 : object.hashCode();
            object = this.b;
            int n10 = object == null ? 0 : object.hashCode();
            int n11 = this.c.hashCode();
            object = this.d;
            int n12 = object == null ? 0 : object.hashCode();
            int n13 = this.e;
            int n14 = this.f;
            int n15 = this.g;
            int n16 = this.h;
            object = this.j;
            int n17 = object == null ? 0 : object.hashCode();
            object = this.k;
            int n18 = object == null ? 0 : object.hashCode();
            object = this.l;
            int n19 = object == null ? 0 : object.hashCode();
            object = this.m;
            int n20 = object == null ? 0 : object.hashCode();
            object = this.n;
            if (object != null) {
                n8 = object.hashCode();
            }
            this.L = (((((((((((((((((((((((((((((527 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n20) * 31 + n8) * 31 + this.o) * 31 + (int)this.s) * 31 + this.t) * 31 + this.u) * 31 + Float.floatToIntBits((float)this.v)) * 31 + this.w) * 31 + Float.floatToIntBits((float)this.x)) * 31 + this.z) * 31 + this.B) * 31 + this.C) * 31 + this.D) * 31 + this.E) * 31 + this.F) * 31 + this.G) * 31 + this.I) * 31 + this.J) * 31 + this.K;
        }
        return this.L;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Format(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.m);
        stringBuilder.append(", ");
        stringBuilder.append(this.n);
        stringBuilder.append(", ");
        stringBuilder.append(this.j);
        stringBuilder.append(", ");
        stringBuilder.append(this.i);
        stringBuilder.append(", ");
        stringBuilder.append(this.d);
        stringBuilder.append(", [");
        stringBuilder.append(this.t);
        stringBuilder.append(", ");
        stringBuilder.append(this.u);
        stringBuilder.append(", ");
        stringBuilder.append(this.v);
        stringBuilder.append(", ");
        stringBuilder.append((Object)this.A);
        stringBuilder.append("], [");
        stringBuilder.append(this.B);
        stringBuilder.append(", ");
        stringBuilder.append(this.C);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

    public static final class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public String a;
        public String b;
        public List c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public String i;
        public x j;
        public Object k;
        public String l;
        public String m;
        public int n;
        public int o;
        public List p;
        public m q;
        public long r;
        public int s;
        public int t;
        public float u;
        public int v;
        public float w;
        public byte[] x;
        public int y;
        public h z;

        public b() {
            this.c = v.Y();
            this.g = -1;
            this.h = -1;
            this.n = -1;
            this.o = -1;
            this.r = Long.MAX_VALUE;
            this.s = -1;
            this.t = -1;
            this.u = -1.0f;
            this.w = 1.0f;
            this.y = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.F = -1;
            this.G = 1;
            this.H = -1;
            this.I = -1;
            this.J = 0;
        }

        public b(q q8) {
            this.a = q8.a;
            this.b = q8.b;
            this.c = q8.c;
            this.d = q8.d;
            this.e = q8.e;
            this.f = q8.f;
            this.g = q8.g;
            this.h = q8.h;
            this.i = q8.j;
            this.j = q8.k;
            this.k = q8.l;
            this.l = q8.m;
            this.m = q8.n;
            this.n = q8.o;
            this.o = q8.p;
            this.p = q8.q;
            this.q = q8.r;
            this.r = q8.s;
            this.s = q8.t;
            this.t = q8.u;
            this.u = q8.v;
            this.v = q8.w;
            this.w = q8.x;
            this.x = q8.y;
            this.y = q8.z;
            this.z = q8.A;
            this.A = q8.B;
            this.B = q8.C;
            this.C = q8.D;
            this.D = q8.E;
            this.E = q8.F;
            this.F = q8.G;
            this.G = q8.H;
            this.H = q8.I;
            this.I = q8.J;
            this.J = q8.K;
        }

        public /* synthetic */ b(q q8,  a8) {
            this(q8);
        }

        public static /* synthetic */ int A(b b8) {
            return b8.G;
        }

        public static /* synthetic */ int B(b b8) {
            return b8.H;
        }

        public static /* synthetic */ int C(b b8) {
            return b8.I;
        }

        public static /* synthetic */ int D(b b8) {
            return b8.J;
        }

        public static /* synthetic */ String E(b b8) {
            return b8.d;
        }

        public static /* synthetic */ int F(b b8) {
            return b8.e;
        }

        public static /* synthetic */ int G(b b8) {
            return b8.f;
        }

        public static /* synthetic */ int H(b b8) {
            return b8.g;
        }

        public static /* synthetic */ int I(b b8) {
            return b8.h;
        }

        public static /* synthetic */ String J(b b8) {
            return b8.i;
        }

        public static /* synthetic */ x b(b b8) {
            return b8.j;
        }

        public static /* synthetic */ Object c(b b8) {
            return b8.k;
        }

        public static /* synthetic */ String d(b b8) {
            return b8.l;
        }

        public static /* synthetic */ String e(b b8) {
            return b8.m;
        }

        public static /* synthetic */ int f(b b8) {
            return b8.n;
        }

        public static /* synthetic */ int g(b b8) {
            return b8.o;
        }

        public static /* synthetic */ List h(b b8) {
            return b8.p;
        }

        public static /* synthetic */ m i(b b8) {
            return b8.q;
        }

        public static /* synthetic */ long j(b b8) {
            return b8.r;
        }

        public static /* synthetic */ int k(b b8) {
            return b8.s;
        }

        public static /* synthetic */ int m(b b8) {
            return b8.t;
        }

        public static /* synthetic */ float n(b b8) {
            return b8.u;
        }

        public static /* synthetic */ int o(b b8) {
            return b8.v;
        }

        public static /* synthetic */ float p(b b8) {
            return b8.w;
        }

        public static /* synthetic */ byte[] q(b b8) {
            return b8.x;
        }

        public static /* synthetic */ int r(b b8) {
            return b8.y;
        }

        public static /* synthetic */ h s(b b8) {
            return b8.z;
        }

        public static /* synthetic */ int t(b b8) {
            return b8.A;
        }

        public static /* synthetic */ int u(b b8) {
            return b8.B;
        }

        public static /* synthetic */ int v(b b8) {
            return b8.C;
        }

        public static /* synthetic */ String w(b b8) {
            return b8.a;
        }

        public static /* synthetic */ int x(b b8) {
            return b8.D;
        }

        public static /* synthetic */ int y(b b8) {
            return b8.E;
        }

        public static /* synthetic */ int z(b b8) {
            return b8.F;
        }

        public q K() {
            return new q(this, null);
        }

        public b L(int n8) {
            this.F = n8;
            return this;
        }

        public b M(int n8) {
            this.g = n8;
            return this;
        }

        public b N(int n8) {
            this.A = n8;
            return this;
        }

        public b O(String string2) {
            this.i = string2;
            return this;
        }

        public b P(h h8) {
            this.z = h8;
            return this;
        }

        public b Q(String string2) {
            this.l = z.t(string2);
            return this;
        }

        public b R(int n8) {
            this.J = n8;
            return this;
        }

        public b S(int n8) {
            this.G = n8;
            return this;
        }

        public b T(Object object) {
            this.k = object;
            return this;
        }

        public b U(m m8) {
            this.q = m8;
            return this;
        }

        public b V(int n8) {
            this.D = n8;
            return this;
        }

        public b W(int n8) {
            this.E = n8;
            return this;
        }

        public b X(float f8) {
            this.u = f8;
            return this;
        }

        public b Y(int n8) {
            this.t = n8;
            return this;
        }

        public b Z(int n8) {
            this.a = Integer.toString((int)n8);
            return this;
        }

        public b a0(String string2) {
            this.a = string2;
            return this;
        }

        public b b0(List list) {
            this.p = list;
            return this;
        }

        public b c0(String string2) {
            this.b = string2;
            return this;
        }

        public b d0(List list) {
            this.c = v.U((Collection)list);
            return this;
        }

        public b e0(String string2) {
            this.d = string2;
            return this;
        }

        public b f0(int n8) {
            this.n = n8;
            return this;
        }

        public b g0(int n8) {
            this.o = n8;
            return this;
        }

        public b h0(x x8) {
            this.j = x8;
            return this;
        }

        public b i0(int n8) {
            this.C = n8;
            return this;
        }

        public b j0(int n8) {
            this.h = n8;
            return this;
        }

        public b k0(float f8) {
            this.w = f8;
            return this;
        }

        public b l0(byte[] arrby) {
            this.x = arrby;
            return this;
        }

        public b m0(int n8) {
            this.f = n8;
            return this;
        }

        public b n0(int n8) {
            this.v = n8;
            return this;
        }

        public b o0(String string2) {
            this.m = z.t(string2);
            return this;
        }

        public b p0(int n8) {
            this.B = n8;
            return this;
        }

        public b q0(int n8) {
            this.e = n8;
            return this;
        }

        public b r0(int n8) {
            this.y = n8;
            return this;
        }

        public b s0(long l8) {
            this.r = l8;
            return this;
        }

        public b t0(int n8) {
            this.H = n8;
            return this;
        }

        public b u0(int n8) {
            this.I = n8;
            return this;
        }

        public b v0(int n8) {
            this.s = n8;
            return this;
        }
    }

}

