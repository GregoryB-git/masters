package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n extends n6.a {
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f4498a;

    public n(Bundle bundle) {
        this.f4498a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.v(parcel, 1, this.f4498a, false);
        b.z.L(J, parcel);
    }
}
