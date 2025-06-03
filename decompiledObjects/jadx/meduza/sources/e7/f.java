package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f extends n6.a {
    public static final Parcelable.Creator<f> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public String f4182a;

    /* renamed from: b, reason: collision with root package name */
    public String f4183b;

    /* renamed from: c, reason: collision with root package name */
    public q6 f4184c;

    /* renamed from: d, reason: collision with root package name */
    public long f4185d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4186e;
    public String f;

    /* renamed from: o, reason: collision with root package name */
    public f0 f4187o;

    /* renamed from: p, reason: collision with root package name */
    public long f4188p;

    /* renamed from: q, reason: collision with root package name */
    public f0 f4189q;

    /* renamed from: r, reason: collision with root package name */
    public long f4190r;

    /* renamed from: s, reason: collision with root package name */
    public f0 f4191s;

    public f(f fVar) {
        m6.j.i(fVar);
        this.f4182a = fVar.f4182a;
        this.f4183b = fVar.f4183b;
        this.f4184c = fVar.f4184c;
        this.f4185d = fVar.f4185d;
        this.f4186e = fVar.f4186e;
        this.f = fVar.f;
        this.f4187o = fVar.f4187o;
        this.f4188p = fVar.f4188p;
        this.f4189q = fVar.f4189q;
        this.f4190r = fVar.f4190r;
        this.f4191s = fVar.f4191s;
    }

    public f(String str, String str2, q6 q6Var, long j10, boolean z10, String str3, f0 f0Var, long j11, f0 f0Var2, long j12, f0 f0Var3) {
        this.f4182a = str;
        this.f4183b = str2;
        this.f4184c = q6Var;
        this.f4185d = j10;
        this.f4186e = z10;
        this.f = str3;
        this.f4187o = f0Var;
        this.f4188p = j11;
        this.f4189q = f0Var2;
        this.f4190r = j12;
        this.f4191s = f0Var3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 2, this.f4182a, false);
        b.z.F(parcel, 3, this.f4183b, false);
        b.z.E(parcel, 4, this.f4184c, i10, false);
        b.z.C(parcel, 5, this.f4185d);
        b.z.t(parcel, 6, this.f4186e);
        b.z.F(parcel, 7, this.f, false);
        b.z.E(parcel, 8, this.f4187o, i10, false);
        b.z.C(parcel, 9, this.f4188p);
        b.z.E(parcel, 10, this.f4189q, i10, false);
        b.z.C(parcel, 11, this.f4190r);
        b.z.E(parcel, 12, this.f4191s, i10, false);
        b.z.L(J, parcel);
    }
}
