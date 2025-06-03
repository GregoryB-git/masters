/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.SpannableStringBuilder
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package d1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c1.k;
import c1.p;
import c1.q;
import d1.e;
import d1.f;
import f0.a;
import g0.o;
import g0.z;
import j0.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
extends e {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final boolean[] G;
    public static final int[] z;
    public final z h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;
    public final ArrayList m;
    public a n;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public int w;
    public boolean x;
    public long y;

    static {
        z = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        B = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        C = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        D = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        E = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        F = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
        G = new boolean[]{false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    }

    /*
     * Enabled aggressive block sorting
     */
    public a(String string2, int n8, long l8) {
        block8 : {
            block6 : {
                block3 : {
                    block7 : {
                        block4 : {
                            block5 : {
                                block2 : {
                                    this.h = new z();
                                    this.m = new ArrayList();
                                    this.n = new a(0, 4);
                                    this.w = 0;
                                    if (l8 != -9223372036854775807L) {
                                        boolean bl = l8 >= 16000L;
                                        g0.a.a(bl);
                                        this.l = l8 * 1000L;
                                    } else {
                                        this.l = -9223372036854775807L;
                                    }
                                    int n9 = "application/x-mp4-cea-608".equals((Object)string2) ? 2 : 3;
                                    this.i = n9;
                                    if (n8 == 1) break block2;
                                    if (n8 == 2) break block3;
                                    if (n8 == 3) break block4;
                                    if (n8 == 4) break block5;
                                    o.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                                }
                                this.k = 0;
                                break block6;
                            }
                            this.k = 1;
                            break block7;
                        }
                        this.k = 0;
                    }
                    this.j = 1;
                    break block8;
                }
                this.k = 1;
            }
            this.j = 0;
        }
        this.O(0);
        this.N();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    public static boolean B(byte by) {
        if ((by & 224) == 0) {
            return true;
        }
        return false;
    }

    public static boolean C(byte by, byte by2) {
        if ((by & 246) == 18 && (by2 & 224) == 32) {
            return true;
        }
        return false;
    }

    public static boolean D(byte by, byte by2) {
        if ((by & 247) == 17 && (by2 & 240) == 32) {
            return true;
        }
        return false;
    }

    public static boolean E(byte by, byte by2) {
        if ((by & 246) == 20 && (by2 & 240) == 32) {
            return true;
        }
        return false;
    }

    public static boolean F(byte by, byte by2) {
        if ((by & 240) == 16 && (by2 & 192) == 64) {
            return true;
        }
        return false;
    }

    public static boolean G(byte by) {
        if ((by & 240) == 16) {
            return true;
        }
        return false;
    }

    public static boolean I(byte by) {
        if ((by & 246) == 20) {
            return true;
        }
        return false;
    }

    public static boolean J(byte by, byte by2) {
        if ((by & 247) == 17 && (by2 & 240) == 48) {
            return true;
        }
        return false;
    }

    public static boolean K(byte by, byte by2) {
        if ((by & 247) == 23 && by2 >= 33 && by2 <= 35) {
            return true;
        }
        return false;
    }

    public static boolean L(byte by) {
        if (1 <= by && by <= 15) {
            return true;
        }
        return false;
    }

    public static char r(byte by) {
        return (char)C[(by & 127) - 32];
    }

    public static int s(byte by) {
        return by >> 3 & 1;
    }

    public static char u(byte by) {
        return (char)E[by & 31];
    }

    public static char v(byte by) {
        return (char)F[by & 31];
    }

    public static char w(byte by, byte by2) {
        if ((by & 1) == 0) {
            return a.u(by2);
        }
        return a.v(by2);
    }

    public static char x(byte by) {
        return (char)D[by & 15];
    }

    public final void A(byte by, byte by2) {
        a a8;
        int n8 = z[by & 7];
        by = (byte)n8;
        if ((by2 & 32) != 0) {
            by = (byte)(n8 + 1);
        }
        if (by != this.n.d) {
            if (this.q != 1 && !this.n.i()) {
                this.n = a8 = new a(this.q, this.r);
                this.m.add((Object)a8);
            }
            this.n.d = by;
        }
        boolean bl = false;
        by = (by2 & 16) == 16 ? 1 : 0;
        if ((by2 & 1) == 1) {
            bl = true;
        }
        n8 = by2 >> 1 & 7;
        a8 = this.n;
        by2 = by != 0 ? (byte)8 : (byte)n8;
        a8.p(by2, bl);
        if (by != 0) {
            this.n.e = A[n8];
        }
    }

    public final boolean H(boolean bl, byte by, byte by2) {
        if (bl && a.G(by)) {
            if (this.t && this.u == by && this.v == by2) {
                this.t = false;
                return true;
            }
            this.t = true;
            this.u = by;
            this.v = by2;
            return false;
        }
        this.t = false;
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void M(byte var1_1, byte var2_2) {
        block9 : {
            if (a.L(var1_1)) ** GOTO lbl-1000
            if (a.I(var1_1) == false) return;
            if (var2_2 == 32 || var2_2 == 47) break block9;
            switch (var2_2) {
                default: {
                    switch (var2_2) {
                        case 42: 
                        case 43: lbl-1000: // 2 sources:
                        {
                            this.x = false;
                            return;
                        }
                        default: {
                            return;
                        }
                        case 41: 
                    }
                }
                case 37: 
                case 38: 
                case 39: 
            }
        }
        this.x = true;
    }

    public final void N() {
        this.n.j(this.q);
        this.m.clear();
        this.m.add((Object)this.n);
    }

    public final void O(int n8) {
        int n9 = this.q;
        if (n9 == n8) {
            return;
        }
        this.q = n8;
        if (n8 == 3) {
            for (n9 = 0; n9 < this.m.size(); ++n9) {
                ((a)this.m.get(n9)).l(n8);
            }
            return;
        }
        this.N();
        if (n9 == 3 || n8 == 1 || n8 == 0) {
            this.o = Collections.emptyList();
        }
    }

    public final void P(int n8) {
        this.r = n8;
        this.n.m(n8);
    }

    public final boolean Q() {
        boolean bl;
        long l8 = this.l;
        boolean bl2 = bl = false;
        if (l8 != -9223372036854775807L) {
            if (this.y == -9223372036854775807L) {
                return false;
            }
            bl2 = bl;
            if (this.l() - this.y >= this.l) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean R(byte by) {
        if (a.B(by)) {
            this.w = a.s(by);
        }
        if (this.w == this.k) {
            return true;
        }
        return false;
    }

    @Override
    public void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        this.O(0);
        this.P(4);
        this.N();
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override
    public k g() {
        List list;
        this.p = list = this.o;
        return new f((List)g0.a.e((Object)list));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void h(p object) {
        int n8;
        int n9;
        object = (ByteBuffer)g0.a.e((Object)object.r);
        this.h.R(object.array(), object.limit());
        int n10 = 0;
        while ((n8 = this.h.a()) >= (n9 = this.i)) {
            block13 : {
                char c8;
                block16 : {
                    byte by;
                    byte by2;
                    block14 : {
                        block17 : {
                            block15 : {
                                block12 : {
                                    n8 = n9 == 2 ? -4 : this.h.G();
                                    n9 = this.h.G();
                                    int n11 = this.h.G();
                                    if ((n8 & 2) != 0 || (n8 & 1) != this.j) continue;
                                    by = (byte)(n9 & 127);
                                    by2 = (byte)(n11 & 127);
                                    if (by == 0 && by2 == 0) continue;
                                    boolean bl = this.s;
                                    boolean bl2 = (n8 & 4) == 4 && (object = G)[n9] && object[n11];
                                    this.s = bl2;
                                    if (this.H(bl2, by, by2)) continue;
                                    if (this.s) break block12;
                                    if (!bl) continue;
                                    this.N();
                                    break block13;
                                }
                                this.M(by, by2);
                                if (!this.x || !this.R(by)) continue;
                                if (!a.B(by)) break block14;
                                if (!a.J(by, by2)) break block15;
                                object = this.n;
                                c8 = a.x(by2);
                                break block16;
                            }
                            if (!a.C(by, by2)) break block17;
                            this.n.f();
                            object = this.n;
                            c8 = a.w(by, by2);
                            break block16;
                        }
                        if (a.D(by, by2)) {
                            this.y(by2);
                        } else if (a.F(by, by2)) {
                            this.A(by, by2);
                        } else if (a.K(by, by2)) {
                            this.n.f = by2 - 32;
                        } else if (a.E(by, by2)) {
                            this.z(by2);
                        }
                        break block13;
                    }
                    this.n.e(a.r(by));
                    if ((by2 & 224) == 0) break block13;
                    object = this.n;
                    c8 = a.r(by2);
                }
                object.e(c8);
            }
            n10 = 1;
        }
    }

    @Override
    public q j() {
        q q8 = super.j();
        if (q8 != null) {
            return q8;
        }
        if (this.Q() && (q8 = this.k()) != null) {
            this.o = Collections.emptyList();
            this.y = -9223372036854775807L;
            k k8 = this.g();
            q8.z(this.l(), k8, Long.MAX_VALUE);
            return q8;
        }
        return null;
    }

    @Override
    public boolean m() {
        if (this.o != this.p) {
            return true;
        }
        return false;
    }

    @Override
    public void release() {
    }

    public final List t() {
        int n8;
        f0.a a8;
        int n9 = this.m.size();
        ArrayList arrayList = new ArrayList(n9);
        int n10 = 2;
        int n11 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            a8 = ((a)this.m.get(n8)).g(Integer.MIN_VALUE);
            arrayList.add((Object)a8);
            int n12 = n10;
            if (a8 != null) {
                n12 = Math.min((int)n10, (int)a8.i);
            }
            n10 = n12;
        }
        ArrayList arrayList2 = new ArrayList(n9);
        for (n8 = n11; n8 < n9; ++n8) {
            f0.a a9 = (f0.a)arrayList.get(n8);
            if (a9 == null) continue;
            a8 = a9;
            if (a9.i != n10) {
                a8 = (f0.a)g0.a.e(((a)this.m.get(n8)).g(n10));
            }
            arrayList2.add((Object)a8);
        }
        return arrayList2;
    }

    public final void y(byte by) {
        this.n.e(' ');
        boolean bl = (by & 1) == 1;
        this.n.p(by >> 1 & 7, bl);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void z(byte var1_1) {
        if (var1_1 == 32) {
            this.O(2);
            return;
        }
        if (var1_1 == 41) {
            this.O(3);
            return;
        }
        switch (var1_1) {
            default: {
                var2_2 = this.q;
                if (var2_2 == 0) {
                    return;
                }
                if (var1_1 == 33) {
                    this.n.f();
                    return;
                }
                switch (var1_1) {
                    default: {
                        return;
                    }
                    case 47: {
                        this.o = this.t();
                        ** GOTO lbl32
                    }
                    case 45: {
                        if (var2_2 != 1) return;
                        if (this.n.i() != false) return;
                        this.n.k();
                        return;
                    }
                    case 44: {
                        this.o = Collections.emptyList();
                        var1_1 = (byte)this.q;
                        if (var1_1 != 1) {
                            if (var1_1 != 3) return;
                            ** break;
                        }
                    }
lbl32: // 5 sources:
                    case 46: 
                }
                this.N();
                return;
            }
            case 39: {
                this.O(1);
                this.P(4);
                return;
            }
            case 38: {
                this.O(1);
                this.P(3);
                return;
            }
            case 37: 
        }
        this.O(1);
        this.P(2);
    }

    public static final class d1.a$a {
        public final List a = new ArrayList();
        public final List b = new ArrayList();
        public final StringBuilder c = new StringBuilder();
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        public d1.a$a(int n8, int n9) {
            this.j(n8);
            this.h = n9;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int n8, int n9, int n10) {
            if (n10 == -1) {
                return;
            }
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n10), n8, n9, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int n8, int n9) {
            spannableStringBuilder.setSpan((Object)new StyleSpan(2), n8, n9, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int n8, int n9) {
            spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n8, n9, 33);
        }

        public void e(char c8) {
            if (this.c.length() < 32) {
                this.c.append(c8);
            }
        }

        public void f() {
            int n8 = this.c.length();
            if (n8 > 0) {
                this.c.delete(n8 - 1, n8);
                for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
                    a a8 = (a)this.a.get(i8);
                    int n9 = a8.c;
                    if (n9 != n8) break;
                    a8.c = n9 - 1;
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        public f0.a g(int n8) {
            float f8;
            int n9;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (n9 = 0; n9 < this.b.size(); ++n9) {
                spannableStringBuilder.append((CharSequence)this.b.get(n9));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence)this.h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            n9 = this.e + this.f;
            int n10 = 32 - n9 - spannableStringBuilder.length();
            int n11 = n9 - n10;
            if (n8 == Integer.MIN_VALUE) {
                n8 = this.g == 2 && (Math.abs((int)n11) < 3 || n10 < 0) ? 1 : (this.g == 2 && n11 > 0 ? 2 : 0);
            }
            if (n8 != 1) {
                if (n8 == 2) {
                    n9 = 32 - n10;
                }
                f8 = (float)n9 / 32.0f * 0.8f + 0.1f;
            } else {
                f8 = 0.5f;
            }
            n10 = this.d;
            if (n10 > 7) {
                n9 = n10 - 17;
                return new a.b().o((CharSequence)spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(n9, 1).k(f8).l(n8).a();
            }
            n9 = n10;
            if (this.g != 1) return new a.b().o((CharSequence)spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(n9, 1).k(f8).l(n8).a();
            n9 = n10 - (this.h - 1);
            return new a.b().o((CharSequence)spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(n9, 1).k(f8).l(n8).a();
        }

        public final SpannableString h() {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.c);
            int n13 = spannableStringBuilder.length();
            int n14 = n12 = (n11 = (n10 = -1));
            int n15 = n8 = (n9 = 0);
            int n16 = n12;
            int n17 = n8;
            int n18 = n11;
            while (n9 < this.a.size()) {
                int n19;
                a a8 = (a)this.a.get(n9);
                boolean bl = a8.b;
                n8 = a8.a;
                n11 = n14;
                int n20 = n15;
                if (n8 != 8) {
                    n11 = n8 == 7 ? 1 : 0;
                    if (n8 != 7) {
                        n14 = B[n8];
                    }
                    n20 = n11;
                    n11 = n14;
                }
                n8 = a8.c;
                int n21 = n9 + 1;
                n14 = n21 < this.a.size() ? ((a)this.a.get((int)n21)).c : n13;
                if (n8 == n14) {
                    n9 = n21;
                    n14 = n11;
                    n15 = n20;
                    continue;
                }
                if (n10 != -1 && !bl) {
                    d1.a$a.q(spannableStringBuilder, n10, n8);
                    n12 = -1;
                } else {
                    n12 = n10;
                    if (n10 == -1) {
                        n12 = n10;
                        if (bl) {
                            n12 = n8;
                        }
                    }
                }
                if (n18 != -1 && n20 == 0) {
                    d1.a$a.o(spannableStringBuilder, n18, n8);
                    n19 = -1;
                } else {
                    n19 = n18;
                    if (n18 == -1) {
                        n19 = n18;
                        if (n20 != 0) {
                            n19 = n8;
                        }
                    }
                }
                n9 = n21;
                n10 = n12;
                n18 = n19;
                n14 = n11;
                n15 = n20;
                if (n11 == n16) continue;
                d1.a$a.n(spannableStringBuilder, n17, n8, n16);
                n16 = n11;
                n9 = n21;
                n10 = n12;
                n18 = n19;
                n17 = n8;
                n14 = n11;
                n15 = n20;
            }
            if (n10 != -1 && n10 != n13) {
                d1.a$a.q(spannableStringBuilder, n10, n13);
            }
            if (n18 != -1 && n18 != n13) {
                d1.a$a.o(spannableStringBuilder, n18, n13);
            }
            if (n17 != n13) {
                d1.a$a.n(spannableStringBuilder, n17, n13, n16);
            }
            return new SpannableString((CharSequence)spannableStringBuilder);
        }

        public boolean i() {
            if (this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0) {
                return true;
            }
            return false;
        }

        public void j(int n8) {
            this.g = n8;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.b.add((Object)this.h());
            this.c.setLength(0);
            this.a.clear();
            int n8 = Math.min((int)this.h, (int)this.d);
            while (this.b.size() >= n8) {
                this.b.remove(0);
            }
        }

        public void l(int n8) {
            this.g = n8;
        }

        public void m(int n8) {
            this.h = n8;
        }

        public void p(int n8, boolean bl) {
            this.a.add((Object)new a(n8, bl, this.c.length()));
        }

        public static class a {
            public final int a;
            public final boolean b;
            public int c;

            public a(int n8, boolean bl, int n9) {
                this.a = n8;
                this.b = bl;
                this.c = n9;
            }
        }

    }

}

