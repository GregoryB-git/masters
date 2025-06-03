package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class f6 extends n6.a {
    public static final Parcelable.Creator<f6> CREATOR = new e6();

    /* renamed from: a, reason: collision with root package name */
    public final List<b6> f4211a;

    public f6(List<b6> list) {
        this.f4211a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.I(parcel, 1, this.f4211a, false);
        b.z.L(J, parcel);
    }
}
