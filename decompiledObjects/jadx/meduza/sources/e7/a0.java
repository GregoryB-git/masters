package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a0 extends n6.a implements Iterable<String> {
    public static final Parcelable.Creator<a0> CREATOR = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f4057a;

    public a0(Bundle bundle) {
        this.f4057a = bundle;
    }

    public final Double D() {
        return Double.valueOf(this.f4057a.getDouble("value"));
    }

    public final Bundle E() {
        return new Bundle(this.f4057a);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new d0(this);
    }

    public final String toString() {
        return this.f4057a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.v(parcel, 2, E(), false);
        b.z.L(J, parcel);
    }
}
