package h7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b extends n6.a implements k6.j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public final int f7176a;

    /* renamed from: b, reason: collision with root package name */
    public int f7177b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f7178c;

    public b() {
        this(2, 0, null);
    }

    public b(int i10, int i11, Intent intent) {
        this.f7176a = i10;
        this.f7177b = i11;
        this.f7178c = intent;
    }

    @Override // k6.j
    public final Status getStatus() {
        return this.f7177b == 0 ? Status.f2812e : Status.f2815q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f7176a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        z.z(parcel, 2, this.f7177b);
        z.E(parcel, 3, this.f7178c, i10, false);
        z.L(J, parcel);
    }
}
