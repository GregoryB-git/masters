// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import B2.c;
import android.os.Parcel;
import android.text.TextUtils;
import A2.n;
import java.util.List;
import android.os.Parcelable$Creator;
import B2.a;

public final class W5 extends a
{
    public static final Parcelable$Creator<W5> CREATOR;
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
    
    static {
        CREATOR = (Parcelable$Creator)new Y5();
    }
    
    public W5(final String o, String p30, final String q, final long x, final String r, final long s, final long t, final String u, final boolean v, final boolean w, final String y, final long z, final long a, final int b, final boolean c, final boolean d, final String e, final Boolean f, final long g, final List h, final String s2, final String j, final String k, final String l, final boolean m, final long n, final int o2, final String p31, final int q2, final long r2) {
        n.e(o);
        this.o = o;
        if (TextUtils.isEmpty((CharSequence)p30)) {
            p30 = null;
        }
        this.p = p30;
        this.q = q;
        this.x = x;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = null;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o2;
        this.P = p31;
        this.Q = q2;
        this.R = r2;
    }
    
    public W5(final String o, final String p30, final String q, final String r, final long s, final long t, final String u, final boolean v, final boolean w, final long x, final String y, final long z, final long a, final int b, final boolean c, final boolean d, final String e, final Boolean f, final long g, final List h, final String i, final String j, final String k, final String l, final boolean m, final long n, final int o2, final String p31, final int q2, final long r2) {
        this.o = o;
        this.p = p30;
        this.q = q;
        this.x = x;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o2;
        this.P = p31;
        this.Q = q2;
        this.R = r2;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
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
        c.b(parcel, a);
    }
}
