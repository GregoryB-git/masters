package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k6 extends n6.a {
    public static final Parcelable.Creator<k6> CREATOR = new v6();
    public final List<String> A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final boolean F;
    public final long G;
    public final int H;
    public final String I;
    public final int J;
    public final long K;
    public final String L;
    public final String M;
    public final long N;
    public final int O;

    /* renamed from: a, reason: collision with root package name */
    public final String f4437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4439c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4440d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4441e;
    public final long f;

    /* renamed from: o, reason: collision with root package name */
    public final String f4442o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4443p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4444q;

    /* renamed from: r, reason: collision with root package name */
    public final long f4445r;

    /* renamed from: s, reason: collision with root package name */
    public final String f4446s;
    public final long t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4447u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4448v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4449w;

    /* renamed from: x, reason: collision with root package name */
    public final String f4450x;

    /* renamed from: y, reason: collision with root package name */
    public final Boolean f4451y;

    /* renamed from: z, reason: collision with root package name */
    public final long f4452z;

    public k6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, boolean z14, long j15, int i11, String str11, int i12, long j16, String str12, String str13, long j17, int i13) {
        m6.j.e(str);
        this.f4437a = str;
        this.f4438b = TextUtils.isEmpty(str2) ? null : str2;
        this.f4439c = str3;
        this.f4445r = j10;
        this.f4440d = str4;
        this.f4441e = j11;
        this.f = j12;
        this.f4442o = str5;
        this.f4443p = z10;
        this.f4444q = z11;
        this.f4446s = str6;
        this.t = j13;
        this.f4447u = i10;
        this.f4448v = z12;
        this.f4449w = z13;
        this.f4450x = str7;
        this.f4451y = bool;
        this.f4452z = j14;
        this.A = list;
        this.B = null;
        this.C = str8;
        this.D = str9;
        this.E = str10;
        this.F = z14;
        this.G = j15;
        this.H = i11;
        this.I = str11;
        this.J = i12;
        this.K = j16;
        this.L = str12;
        this.M = str13;
        this.N = j17;
        this.O = i13;
    }

    public k6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z14, long j15, int i11, String str12, int i12, long j16, String str13, String str14, long j17, int i13) {
        this.f4437a = str;
        this.f4438b = str2;
        this.f4439c = str3;
        this.f4445r = j12;
        this.f4440d = str4;
        this.f4441e = j10;
        this.f = j11;
        this.f4442o = str5;
        this.f4443p = z10;
        this.f4444q = z11;
        this.f4446s = str6;
        this.t = j13;
        this.f4447u = i10;
        this.f4448v = z12;
        this.f4449w = z13;
        this.f4450x = str7;
        this.f4451y = bool;
        this.f4452z = j14;
        this.A = arrayList;
        this.B = str8;
        this.C = str9;
        this.D = str10;
        this.E = str11;
        this.F = z14;
        this.G = j15;
        this.H = i11;
        this.I = str12;
        this.J = i12;
        this.K = j16;
        this.L = str13;
        this.M = str14;
        this.N = j17;
        this.O = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 2, this.f4437a, false);
        b.z.F(parcel, 3, this.f4438b, false);
        b.z.F(parcel, 4, this.f4439c, false);
        b.z.F(parcel, 5, this.f4440d, false);
        b.z.C(parcel, 6, this.f4441e);
        b.z.C(parcel, 7, this.f);
        b.z.F(parcel, 8, this.f4442o, false);
        b.z.t(parcel, 9, this.f4443p);
        b.z.t(parcel, 10, this.f4444q);
        b.z.C(parcel, 11, this.f4445r);
        b.z.F(parcel, 12, this.f4446s, false);
        b.z.C(parcel, 14, this.t);
        b.z.z(parcel, 15, this.f4447u);
        b.z.t(parcel, 16, this.f4448v);
        b.z.t(parcel, 18, this.f4449w);
        b.z.F(parcel, 19, this.f4450x, false);
        b.z.u(parcel, 21, this.f4451y);
        b.z.C(parcel, 22, this.f4452z);
        b.z.G(parcel, 23, this.A);
        b.z.F(parcel, 24, this.B, false);
        b.z.F(parcel, 25, this.C, false);
        b.z.F(parcel, 26, this.D, false);
        b.z.F(parcel, 27, this.E, false);
        b.z.t(parcel, 28, this.F);
        b.z.C(parcel, 29, this.G);
        b.z.z(parcel, 30, this.H);
        b.z.F(parcel, 31, this.I, false);
        b.z.z(parcel, 32, this.J);
        b.z.C(parcel, 34, this.K);
        b.z.F(parcel, 35, this.L, false);
        b.z.F(parcel, 36, this.M, false);
        b.z.C(parcel, 37, this.N);
        b.z.z(parcel, 38, this.O);
        b.z.L(J, parcel);
    }
}
