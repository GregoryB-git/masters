package t6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import t6.a;

/* loaded from: classes.dex */
public final class g extends n6.a {
    public static final Parcelable.Creator<g> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f14637a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14638b;

    /* renamed from: c, reason: collision with root package name */
    public final a.C0230a f14639c;

    public g(a.C0230a c0230a, String str) {
        this.f14637a = 1;
        this.f14638b = str;
        this.f14639c = c0230a;
    }

    public g(a.C0230a c0230a, String str, int i10) {
        this.f14637a = i10;
        this.f14638b = str;
        this.f14639c = c0230a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14637a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        z.F(parcel, 2, this.f14638b, false);
        z.E(parcel, 3, this.f14639c, i10, false);
        z.L(J, parcel);
    }
}
