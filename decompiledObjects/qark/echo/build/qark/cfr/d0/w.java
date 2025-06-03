/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package d0;

import W2.k;
import android.net.Uri;
import android.os.Bundle;
import d0.G;
import d0.x;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.List;

public final class w {
    public static final w H = new b().I();
    public static final String I = M.w0(0);
    public static final String J = M.w0(1);
    public static final String K = M.w0(2);
    public static final String L = M.w0(3);
    public static final String M = M.w0(4);
    public static final String N = M.w0(5);
    public static final String O = M.w0(6);
    public static final String P = M.w0(8);
    public static final String Q = M.w0(9);
    public static final String R = M.w0(10);
    public static final String S = M.w0(11);
    public static final String T = M.w0(12);
    public static final String U = M.w0(13);
    public static final String V = M.w0(14);
    public static final String W = M.w0(15);
    public static final String X = M.w0(16);
    public static final String Y = M.w0(17);
    public static final String Z = M.w0(18);
    public static final String a0 = M.w0(19);
    public static final String b0 = M.w0(20);
    public static final String c0 = M.w0(21);
    public static final String d0 = M.w0(22);
    public static final String e0 = M.w0(23);
    public static final String f0 = M.w0(24);
    public static final String g0 = M.w0(25);
    public static final String h0 = M.w0(26);
    public static final String i0 = M.w0(27);
    public static final String j0 = M.w0(28);
    public static final String k0 = M.w0(29);
    public static final String l0 = M.w0(30);
    public static final String m0 = M.w0(31);
    public static final String n0 = M.w0(32);
    public static final String o0 = M.w0(33);
    public static final String p0 = M.w0(1000);
    public final Integer A;
    public final Integer B;
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;
    public final Integer F;
    public final Bundle G;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final byte[] i;
    public final Integer j;
    public final Uri k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Boolean o;
    public final Boolean p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final CharSequence z;

    public w(b b8) {
        Integer n8;
        Boolean bl;
        Integer n9;
        block9 : {
            Boolean bl2;
            boolean bl3;
            Integer n10;
            Integer n11;
            block7 : {
                int n12;
                block10 : {
                    block8 : {
                        bl2 = b8.o;
                        n11 = b8.n;
                        n10 = b8.E;
                        bl3 = false;
                        n12 = 0;
                        if (bl2 == null) break block7;
                        if (bl2.booleanValue()) break block8;
                        n8 = -1;
                        bl = bl2;
                        n9 = n10;
                        break block9;
                    }
                    if (n11 == null) break block10;
                    bl = bl2;
                    n8 = n11;
                    n9 = n10;
                    if (n11 != -1) break block9;
                }
                if (n10 != null) {
                    n12 = w.b(n10);
                }
                n8 = n12;
                bl = bl2;
                n9 = n10;
                break block9;
            }
            bl = bl2;
            n8 = n11;
            n9 = n10;
            if (n11 != null) {
                if (n11 != -1) {
                    bl3 = true;
                }
                bl = bl2 = Boolean.valueOf((boolean)bl3);
                n8 = n11;
                n9 = n10;
                if (bl3) {
                    bl = bl2;
                    n8 = n11;
                    n9 = n10;
                    if (n10 == null) {
                        n9 = w.c(n11);
                        n8 = n11;
                        bl = bl2;
                    }
                }
            }
        }
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
        this.e = b8.e;
        this.f = b8.f;
        this.g = b8.g;
        this.h = b8.h;
        b.d(b8);
        b.e(b8);
        this.i = b8.i;
        this.j = b8.j;
        this.k = b8.k;
        this.l = b8.l;
        this.m = b8.m;
        this.n = n8;
        this.o = bl;
        this.p = b8.p;
        this.q = b8.q;
        this.r = b8.q;
        this.s = b8.r;
        this.t = b8.s;
        this.u = b8.t;
        this.v = b8.u;
        this.w = b8.v;
        this.x = b8.w;
        this.y = b8.x;
        this.z = b8.y;
        this.A = b8.z;
        this.B = b8.A;
        this.C = b8.B;
        this.D = b8.C;
        this.E = b8.D;
        this.F = n9;
        this.G = b8.F;
    }

    public /* synthetic */ w(b b8,  a8) {
        this(b8);
    }

    public static int b(int n8) {
        switch (n8) {
            default: {
                return 0;
            }
            case 25: {
                return 6;
            }
            case 24: {
                return 5;
            }
            case 23: {
                return 4;
            }
            case 22: {
                return 3;
            }
            case 21: {
                return 2;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
        }
        return 1;
    }

    public static int c(int n8) {
        switch (n8) {
            default: {
                return 20;
            }
            case 6: {
                return 25;
            }
            case 5: {
                return 24;
            }
            case 4: {
                return 23;
            }
            case 3: {
                return 22;
            }
            case 2: {
                return 21;
            }
            case 1: 
        }
        return 0;
    }

    public b a() {
        return new b(this, null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (w.class != object.getClass()) {
                return false;
            }
            object = (w)object;
            if (M.c((Object)this.a, (Object)object.a) && M.c((Object)this.b, (Object)object.b) && M.c((Object)this.c, (Object)object.c) && M.c((Object)this.d, (Object)object.d) && M.c((Object)this.e, (Object)object.e) && M.c((Object)this.f, (Object)object.f) && M.c((Object)this.g, (Object)object.g) && M.c((Object)this.h, (Object)object.h) && M.c(null, null) && M.c(null, null) && Arrays.equals((byte[])this.i, (byte[])object.i) && M.c((Object)this.j, (Object)object.j) && M.c((Object)this.k, (Object)object.k) && M.c((Object)this.l, (Object)object.l) && M.c((Object)this.m, (Object)object.m) && M.c((Object)this.n, (Object)object.n) && M.c((Object)this.o, (Object)object.o) && M.c((Object)this.p, (Object)object.p) && M.c((Object)this.r, (Object)object.r) && M.c((Object)this.s, (Object)object.s) && M.c((Object)this.t, (Object)object.t) && M.c((Object)this.u, (Object)object.u) && M.c((Object)this.v, (Object)object.v) && M.c((Object)this.w, (Object)object.w) && M.c((Object)this.x, (Object)object.x) && M.c((Object)this.y, (Object)object.y) && M.c((Object)this.z, (Object)object.z) && M.c((Object)this.A, (Object)object.A) && M.c((Object)this.B, (Object)object.B) && M.c((Object)this.C, (Object)object.C) && M.c((Object)this.D, (Object)object.D) && M.c((Object)this.E, (Object)object.E) && M.c((Object)this.F, (Object)object.F)) {
                boolean bl = this.G == null;
                boolean bl2 = object.G == null;
                if (bl == bl2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        CharSequence charSequence = this.a;
        boolean bl = false;
        CharSequence charSequence2 = this.b;
        CharSequence charSequence3 = this.c;
        CharSequence charSequence4 = this.d;
        CharSequence charSequence5 = this.e;
        CharSequence charSequence6 = this.f;
        CharSequence charSequence7 = this.g;
        Long l8 = this.h;
        int n8 = Arrays.hashCode((byte[])this.i);
        Integer n9 = this.j;
        Uri uri = this.k;
        Integer n10 = this.l;
        Integer n11 = this.m;
        Integer n12 = this.n;
        Boolean bl2 = this.o;
        Boolean bl3 = this.p;
        Integer n13 = this.r;
        Integer n14 = this.s;
        Integer n15 = this.t;
        Integer n16 = this.u;
        Integer n17 = this.v;
        Integer n18 = this.w;
        CharSequence charSequence8 = this.x;
        CharSequence charSequence9 = this.y;
        CharSequence charSequence10 = this.z;
        Integer n19 = this.A;
        Integer n20 = this.B;
        CharSequence charSequence11 = this.C;
        CharSequence charSequence12 = this.D;
        CharSequence charSequence13 = this.E;
        Integer n21 = this.F;
        if (this.G == null) {
            bl = true;
        }
        return k.b(new Object[]{charSequence, charSequence2, charSequence3, charSequence4, charSequence5, charSequence6, charSequence7, l8, null, null, n8, n9, uri, n10, n11, n12, bl2, bl3, n13, n14, n15, n16, n17, n18, charSequence8, charSequence9, charSequence10, n19, n20, charSequence11, charSequence12, charSequence13, n21, bl});
    }

    public static final class b {
        public Integer A;
        public CharSequence B;
        public CharSequence C;
        public CharSequence D;
        public Integer E;
        public Bundle F;
        public CharSequence a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public CharSequence f;
        public CharSequence g;
        public Long h;
        public byte[] i;
        public Integer j;
        public Uri k;
        public Integer l;
        public Integer m;
        public Integer n;
        public Boolean o;
        public Boolean p;
        public Integer q;
        public Integer r;
        public Integer s;
        public Integer t;
        public Integer u;
        public Integer v;
        public CharSequence w;
        public CharSequence x;
        public CharSequence y;
        public Integer z;

        public b() {
        }

        public b(w w8) {
            this.a = w8.a;
            this.b = w8.b;
            this.c = w8.c;
            this.d = w8.d;
            this.e = w8.e;
            this.f = w8.f;
            this.g = w8.g;
            this.h = w8.h;
            this.i = w8.i;
            this.j = w8.j;
            this.k = w8.k;
            this.l = w8.l;
            this.m = w8.m;
            this.n = w8.n;
            this.o = w8.o;
            this.p = w8.p;
            this.q = w8.r;
            this.r = w8.s;
            this.s = w8.t;
            this.t = w8.u;
            this.u = w8.v;
            this.v = w8.w;
            this.w = w8.x;
            this.x = w8.y;
            this.y = w8.z;
            this.z = w8.A;
            this.A = w8.B;
            this.B = w8.C;
            this.C = w8.D;
            this.D = w8.E;
            this.E = w8.F;
            this.F = w8.G;
        }

        public /* synthetic */ b(w w8,  a8) {
            this(w8);
        }

        public static /* synthetic */ G d(b b8) {
            b8.getClass();
            return null;
        }

        public static /* synthetic */ G e(b b8) {
            b8.getClass();
            return null;
        }

        public w I() {
            return new w(this, null);
        }

        public b J(byte[] arrby, int n8) {
            if (this.i == null || M.c(n8, 3) || !M.c((Object)this.j, 3)) {
                this.i = (byte[])arrby.clone();
                this.j = n8;
            }
            return this;
        }

        public b K(w w8) {
            if (w8 == null) {
                return this;
            }
            CharSequence charSequence = w8.a;
            if (charSequence != null) {
                this.n0(charSequence);
            }
            if ((charSequence = w8.b) != null) {
                this.P(charSequence);
            }
            if ((charSequence = w8.c) != null) {
                this.O(charSequence);
            }
            if ((charSequence = w8.d) != null) {
                this.N(charSequence);
            }
            if ((charSequence = w8.e) != null) {
                this.X(charSequence);
            }
            if ((charSequence = w8.f) != null) {
                this.m0(charSequence);
            }
            if ((charSequence = w8.g) != null) {
                this.V(charSequence);
            }
            if ((charSequence = w8.h) != null) {
                this.Y((Long)charSequence);
            }
            if ((charSequence = w8.k) != null || w8.i != null) {
                this.R((Uri)charSequence);
                this.Q(w8.i, w8.j);
            }
            if ((charSequence = w8.l) != null) {
                this.q0((Integer)charSequence);
            }
            if ((charSequence = w8.m) != null) {
                this.p0((Integer)charSequence);
            }
            if ((charSequence = w8.n) != null) {
                this.a0((Integer)charSequence);
            }
            if ((charSequence = w8.o) != null) {
                this.c0((Boolean)charSequence);
            }
            if ((charSequence = w8.p) != null) {
                this.d0((Boolean)charSequence);
            }
            if ((charSequence = w8.q) != null) {
                this.h0((Integer)charSequence);
            }
            if ((charSequence = w8.r) != null) {
                this.h0((Integer)charSequence);
            }
            if ((charSequence = w8.s) != null) {
                this.g0((Integer)charSequence);
            }
            if ((charSequence = w8.t) != null) {
                this.f0((Integer)charSequence);
            }
            if ((charSequence = w8.u) != null) {
                this.k0((Integer)charSequence);
            }
            if ((charSequence = w8.v) != null) {
                this.j0((Integer)charSequence);
            }
            if ((charSequence = w8.w) != null) {
                this.i0((Integer)charSequence);
            }
            if ((charSequence = w8.x) != null) {
                this.r0(charSequence);
            }
            if ((charSequence = w8.y) != null) {
                this.T(charSequence);
            }
            if ((charSequence = w8.z) != null) {
                this.U(charSequence);
            }
            if ((charSequence = w8.A) != null) {
                this.W((Integer)charSequence);
            }
            if ((charSequence = w8.B) != null) {
                this.o0((Integer)charSequence);
            }
            if ((charSequence = w8.C) != null) {
                this.b0(charSequence);
            }
            if ((charSequence = w8.D) != null) {
                this.S(charSequence);
            }
            if ((charSequence = w8.E) != null) {
                this.l0(charSequence);
            }
            if ((charSequence = w8.F) != null) {
                this.e0((Integer)charSequence);
            }
            if ((w8 = w8.G) != null) {
                this.Z((Bundle)w8);
            }
            return this;
        }

        public b L(x x8) {
            for (int i8 = 0; i8 < x8.e(); ++i8) {
                x8.d(i8).D(this);
            }
            return this;
        }

        public b M(List list) {
            for (int i8 = 0; i8 < list.size(); ++i8) {
                x x8 = (x)list.get(i8);
                for (int i9 = 0; i9 < x8.e(); ++i9) {
                    x8.d(i9).D(this);
                }
            }
            return this;
        }

        public b N(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b O(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b P(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public b Q(byte[] arrby, Integer n8) {
            arrby = arrby == null ? null : (byte[])arrby.clone();
            this.i = arrby;
            this.j = n8;
            return this;
        }

        public b R(Uri uri) {
            this.k = uri;
            return this;
        }

        public b S(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b T(CharSequence charSequence) {
            this.x = charSequence;
            return this;
        }

        public b U(CharSequence charSequence) {
            this.y = charSequence;
            return this;
        }

        public b V(CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public b W(Integer n8) {
            this.z = n8;
            return this;
        }

        public b X(CharSequence charSequence) {
            this.e = charSequence;
            return this;
        }

        public b Y(Long l8) {
            boolean bl = l8 == null || l8 >= 0L;
            a.a(bl);
            this.h = l8;
            return this;
        }

        public b Z(Bundle bundle) {
            this.F = bundle;
            return this;
        }

        public b a0(Integer n8) {
            this.n = n8;
            return this;
        }

        public b b0(CharSequence charSequence) {
            this.B = charSequence;
            return this;
        }

        public b c0(Boolean bl) {
            this.o = bl;
            return this;
        }

        public b d0(Boolean bl) {
            this.p = bl;
            return this;
        }

        public b e0(Integer n8) {
            this.E = n8;
            return this;
        }

        public b f0(Integer n8) {
            this.s = n8;
            return this;
        }

        public b g0(Integer n8) {
            this.r = n8;
            return this;
        }

        public b h0(Integer n8) {
            this.q = n8;
            return this;
        }

        public b i0(Integer n8) {
            this.v = n8;
            return this;
        }

        public b j0(Integer n8) {
            this.u = n8;
            return this;
        }

        public b k0(Integer n8) {
            this.t = n8;
            return this;
        }

        public b l0(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b m0(CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        public b n0(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b o0(Integer n8) {
            this.A = n8;
            return this;
        }

        public b p0(Integer n8) {
            this.m = n8;
            return this;
        }

        public b q0(Integer n8) {
            this.l = n8;
            return this;
        }

        public b r0(CharSequence charSequence) {
            this.w = charSequence;
            return this;
        }
    }

}

