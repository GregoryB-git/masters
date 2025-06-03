package R2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class D extends B2.a implements Iterable {
    public static final Parcelable.Creator<D> CREATOR = new F();

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f4586o;

    public D(Bundle bundle) {
        this.f4586o = bundle;
    }

    public final int a() {
        return this.f4586o.size();
    }

    public final Double f(String str) {
        return Double.valueOf(this.f4586o.getDouble(str));
    }

    public final Bundle g() {
        return new Bundle(this.f4586o);
    }

    public final Long i(String str) {
        return Long.valueOf(this.f4586o.getLong(str));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new G(this);
    }

    public final Object k(String str) {
        return this.f4586o.get(str);
    }

    public final String q(String str) {
        return this.f4586o.getString(str);
    }

    public final String toString() {
        return this.f4586o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.e(parcel, 2, g(), false);
        B2.c.b(parcel, a7);
    }
}
