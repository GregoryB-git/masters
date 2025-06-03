package e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f0 extends n6.a {
    public static final Parcelable.Creator<f0> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final String f4192a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f4193b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4194c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4195d;

    public f0(f0 f0Var, long j10) {
        m6.j.i(f0Var);
        this.f4192a = f0Var.f4192a;
        this.f4193b = f0Var.f4193b;
        this.f4194c = f0Var.f4194c;
        this.f4195d = j10;
    }

    public f0(String str, a0 a0Var, String str2, long j10) {
        this.f4192a = str;
        this.f4193b = a0Var;
        this.f4194c = str2;
        this.f4195d = j10;
    }

    public final String toString() {
        return "origin=" + this.f4194c + ",name=" + this.f4192a + ",params=" + String.valueOf(this.f4193b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 2, this.f4192a, false);
        b.z.E(parcel, 3, this.f4193b, i10, false);
        b.z.F(parcel, 4, this.f4194c, false);
        b.z.C(parcel, 5, this.f4195d);
        b.z.L(J, parcel);
    }
}
