package c8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends n6.a {
    public static final Parcelable.Creator<e0> CREATOR = new g0();

    /* renamed from: a, reason: collision with root package name */
    public final List<b8.h0> f2438a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b8.l0> f2439b;

    public e0(ArrayList arrayList, ArrayList arrayList2) {
        this.f2438a = arrayList == null ? new ArrayList() : arrayList;
        this.f2439b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.I(parcel, 1, this.f2438a, false);
        b.z.I(parcel, 2, this.f2439b, false);
        b.z.L(J, parcel);
    }
}
