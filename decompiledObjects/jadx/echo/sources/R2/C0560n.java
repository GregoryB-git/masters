package R2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560n extends B2.a {
    public static final Parcelable.Creator<C0560n> CREATOR = new C0553m();

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f5425o;

    public C0560n(Bundle bundle) {
        this.f5425o = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.e(parcel, 1, this.f5425o, false);
        B2.c.b(parcel, a7);
    }
}
