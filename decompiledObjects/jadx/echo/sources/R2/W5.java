package R2;

import A2.AbstractC0328n;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class W5 extends B2.a {
    public static final Parcelable.Creator<W5> CREATOR = new Y5();

    /* renamed from: A, reason: collision with root package name */
    public final long f5097A;

    /* renamed from: B, reason: collision with root package name */
    public final int f5098B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f5099C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f5100D;

    /* renamed from: E, reason: collision with root package name */
    public final String f5101E;

    /* renamed from: F, reason: collision with root package name */
    public final Boolean f5102F;

    /* renamed from: G, reason: collision with root package name */
    public final long f5103G;

    /* renamed from: H, reason: collision with root package name */
    public final List f5104H;

    /* renamed from: I, reason: collision with root package name */
    public final String f5105I;

    /* renamed from: J, reason: collision with root package name */
    public final String f5106J;

    /* renamed from: K, reason: collision with root package name */
    public final String f5107K;

    /* renamed from: L, reason: collision with root package name */
    public final String f5108L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f5109M;

    /* renamed from: N, reason: collision with root package name */
    public final long f5110N;

    /* renamed from: O, reason: collision with root package name */
    public final int f5111O;

    /* renamed from: P, reason: collision with root package name */
    public final String f5112P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f5113Q;

    /* renamed from: R, reason: collision with root package name */
    public final long f5114R;

    /* renamed from: o, reason: collision with root package name */
    public final String f5115o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5116p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5117q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5118r;

    /* renamed from: s, reason: collision with root package name */
    public final long f5119s;

    /* renamed from: t, reason: collision with root package name */
    public final long f5120t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5121u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5122v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f5123w;

    /* renamed from: x, reason: collision with root package name */
    public final long f5124x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5125y;

    /* renamed from: z, reason: collision with root package name */
    public final long f5126z;

    public W5(String str, String str2, String str3, long j7, String str4, long j8, long j9, String str5, boolean z7, boolean z8, String str6, long j10, long j11, int i7, boolean z9, boolean z10, String str7, Boolean bool, long j12, List list, String str8, String str9, String str10, String str11, boolean z11, long j13, int i8, String str12, int i9, long j14) {
        AbstractC0328n.e(str);
        this.f5115o = str;
        this.f5116p = TextUtils.isEmpty(str2) ? null : str2;
        this.f5117q = str3;
        this.f5124x = j7;
        this.f5118r = str4;
        this.f5119s = j8;
        this.f5120t = j9;
        this.f5121u = str5;
        this.f5122v = z7;
        this.f5123w = z8;
        this.f5125y = str6;
        this.f5126z = j10;
        this.f5097A = j11;
        this.f5098B = i7;
        this.f5099C = z9;
        this.f5100D = z10;
        this.f5101E = str7;
        this.f5102F = bool;
        this.f5103G = j12;
        this.f5104H = list;
        this.f5105I = null;
        this.f5106J = str9;
        this.f5107K = str10;
        this.f5108L = str11;
        this.f5109M = z11;
        this.f5110N = j13;
        this.f5111O = i8;
        this.f5112P = str12;
        this.f5113Q = i9;
        this.f5114R = j14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.n(parcel, 2, this.f5115o, false);
        B2.c.n(parcel, 3, this.f5116p, false);
        B2.c.n(parcel, 4, this.f5117q, false);
        B2.c.n(parcel, 5, this.f5118r, false);
        B2.c.k(parcel, 6, this.f5119s);
        B2.c.k(parcel, 7, this.f5120t);
        B2.c.n(parcel, 8, this.f5121u, false);
        B2.c.c(parcel, 9, this.f5122v);
        B2.c.c(parcel, 10, this.f5123w);
        B2.c.k(parcel, 11, this.f5124x);
        B2.c.n(parcel, 12, this.f5125y, false);
        B2.c.k(parcel, 13, this.f5126z);
        B2.c.k(parcel, 14, this.f5097A);
        B2.c.i(parcel, 15, this.f5098B);
        B2.c.c(parcel, 16, this.f5099C);
        B2.c.c(parcel, 18, this.f5100D);
        B2.c.n(parcel, 19, this.f5101E, false);
        B2.c.d(parcel, 21, this.f5102F, false);
        B2.c.k(parcel, 22, this.f5103G);
        B2.c.o(parcel, 23, this.f5104H, false);
        B2.c.n(parcel, 24, this.f5105I, false);
        B2.c.n(parcel, 25, this.f5106J, false);
        B2.c.n(parcel, 26, this.f5107K, false);
        B2.c.n(parcel, 27, this.f5108L, false);
        B2.c.c(parcel, 28, this.f5109M);
        B2.c.k(parcel, 29, this.f5110N);
        B2.c.i(parcel, 30, this.f5111O);
        B2.c.n(parcel, 31, this.f5112P, false);
        B2.c.i(parcel, 32, this.f5113Q);
        B2.c.k(parcel, 34, this.f5114R);
        B2.c.b(parcel, a7);
    }

    public W5(String str, String str2, String str3, String str4, long j7, long j8, String str5, boolean z7, boolean z8, long j9, String str6, long j10, long j11, int i7, boolean z9, boolean z10, String str7, Boolean bool, long j12, List list, String str8, String str9, String str10, String str11, boolean z11, long j13, int i8, String str12, int i9, long j14) {
        this.f5115o = str;
        this.f5116p = str2;
        this.f5117q = str3;
        this.f5124x = j9;
        this.f5118r = str4;
        this.f5119s = j7;
        this.f5120t = j8;
        this.f5121u = str5;
        this.f5122v = z7;
        this.f5123w = z8;
        this.f5125y = str6;
        this.f5126z = j10;
        this.f5097A = j11;
        this.f5098B = i7;
        this.f5099C = z9;
        this.f5100D = z10;
        this.f5101E = str7;
        this.f5102F = bool;
        this.f5103G = j12;
        this.f5104H = list;
        this.f5105I = str8;
        this.f5106J = str9;
        this.f5107K = str10;
        this.f5108L = str11;
        this.f5109M = z11;
        this.f5110N = j13;
        this.f5111O = i8;
        this.f5112P = str12;
        this.f5113Q = i9;
        this.f5114R = j14;
    }
}
