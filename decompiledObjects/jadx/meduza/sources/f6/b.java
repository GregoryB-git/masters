package f6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class b extends n6.a {
    public static final Parcelable.Creator<b> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final int f5465a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f5466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5467c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5468d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5469e;
    public final Bundle f;

    public b(int i10, int i11, PendingIntent pendingIntent, int i12, Bundle bundle, byte[] bArr) {
        this.f5469e = i10;
        this.f5465a = i11;
        this.f5467c = i12;
        this.f = bundle;
        this.f5468d = bArr;
        this.f5466b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f5465a);
        z.E(parcel, 2, this.f5466b, i10, false);
        z.z(parcel, 3, this.f5467c);
        z.v(parcel, 4, this.f, false);
        z.w(parcel, 5, this.f5468d, false);
        z.z(parcel, 1000, this.f5469e);
        z.L(J, parcel);
    }
}
