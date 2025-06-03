package z5;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends n6.a {
    public static final Parcelable.Creator<c> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f17802a;

    /* renamed from: b, reason: collision with root package name */
    public final List f17803b;

    public c(int i10, ArrayList arrayList) {
        this.f17802a = i10;
        m6.j.i(arrayList);
        this.f17803b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f17802a);
        z.I(parcel, 2, this.f17803b, false);
        z.L(J, parcel);
    }
}
