/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.String
 *  java.util.List
 */
package R2;

import A2.n;
import B2.a;
import B2.c;
import R2.Y5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class W5
extends a {
    public static final Parcelable.Creator<W5> CREATOR = new Y5();
    public final long A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final Boolean F;
    public final long G;
    public final List H;
    public final String I;
    public final String J;
    public final String K;
    public final String L;
    public final boolean M;
    public final long N;
    public final int O;
    public final String P;
    public final int Q;
    public final long R;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final long s;
    public final long t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final long x;
    public final String y;
    public final long z;

    public W5(String string2, String string3, String string4, long l8, String string5, long l9, long l10, String string6, boolean bl, boolean bl2, String string7, long l11, long l12, int n8, boolean bl3, boolean bl4, String string8, Boolean bl5, long l13, List list, String string9, String string10, String string11, String string12, boolean bl6, long l14, int n9, String string13, int n10, long l15) {
        n.e(string2);
        this.o = string2;
        if (TextUtils.isEmpty((CharSequence)string3)) {
            string3 = null;
        }
        this.p = string3;
        this.q = string4;
        this.x = l8;
        this.r = string5;
        this.s = l9;
        this.t = l10;
        this.u = string6;
        this.v = bl;
        this.w = bl2;
        this.y = string7;
        this.z = l11;
        this.A = l12;
        this.B = n8;
        this.C = bl3;
        this.D = bl4;
        this.E = string8;
        this.F = bl5;
        this.G = l13;
        this.H = list;
        this.I = null;
        this.J = string10;
        this.K = string11;
        this.L = string12;
        this.M = bl6;
        this.N = l14;
        this.O = n9;
        this.P = string13;
        this.Q = n10;
        this.R = l15;
    }

    public W5(String string2, String string3, String string4, String string5, long l8, long l9, String string6, boolean bl, boolean bl2, long l10, String string7, long l11, long l12, int n8, boolean bl3, boolean bl4, String string8, Boolean bl5, long l13, List list, String string9, String string10, String string11, String string12, boolean bl6, long l14, int n9, String string13, int n10, long l15) {
        this.o = string2;
        this.p = string3;
        this.q = string4;
        this.x = l10;
        this.r = string5;
        this.s = l8;
        this.t = l9;
        this.u = string6;
        this.v = bl;
        this.w = bl2;
        this.y = string7;
        this.z = l11;
        this.A = l12;
        this.B = n8;
        this.C = bl3;
        this.D = bl4;
        this.E = string8;
        this.F = bl5;
        this.G = l13;
        this.H = list;
        this.I = string9;
        this.J = string10;
        this.K = string11;
        this.L = string12;
        this.M = bl6;
        this.N = l14;
        this.O = n9;
        this.P = string13;
        this.Q = n10;
        this.R = l15;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.n(parcel, 2, this.o, false);
        c.n(parcel, 3, this.p, false);
        c.n(parcel, 4, this.q, false);
        c.n(parcel, 5, this.r, false);
        c.k(parcel, 6, this.s);
        c.k(parcel, 7, this.t);
        c.n(parcel, 8, this.u, false);
        c.c(parcel, 9, this.v);
        c.c(parcel, 10, this.w);
        c.k(parcel, 11, this.x);
        c.n(parcel, 12, this.y, false);
        c.k(parcel, 13, this.z);
        c.k(parcel, 14, this.A);
        c.i(parcel, 15, this.B);
        c.c(parcel, 16, this.C);
        c.c(parcel, 18, this.D);
        c.n(parcel, 19, this.E, false);
        c.d(parcel, 21, this.F, false);
        c.k(parcel, 22, this.G);
        c.o(parcel, 23, this.H, false);
        c.n(parcel, 24, this.I, false);
        c.n(parcel, 25, this.J, false);
        c.n(parcel, 26, this.K, false);
        c.n(parcel, 27, this.L, false);
        c.c(parcel, 28, this.M);
        c.k(parcel, 29, this.N);
        c.i(parcel, 30, this.O);
        c.n(parcel, 31, this.P, false);
        c.i(parcel, 32, this.Q);
        c.k(parcel, 34, this.R);
        c.b(parcel, n8);
    }
}

