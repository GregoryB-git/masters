package T2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends B2.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: o, reason: collision with root package name */
    public final int f6068o;

    /* renamed from: p, reason: collision with root package name */
    public int f6069p;

    /* renamed from: q, reason: collision with root package name */
    public Intent f6070q;

    public b(int i7, int i8, Intent intent) {
        this.f6068o = i7;
        this.f6069p = i8;
        this.f6070q = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.i(parcel, 1, this.f6068o);
        B2.c.i(parcel, 2, this.f6069p);
        B2.c.m(parcel, 3, this.f6070q, i7, false);
        B2.c.b(parcel, a7);
    }
}
