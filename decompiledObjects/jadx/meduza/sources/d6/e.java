package d6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends n6.a {
    public static final Parcelable.Creator<e> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    public final int f3558a;

    public e(int i10) {
        this.f3558a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return m6.h.a(Integer.valueOf(this.f3558a), Integer.valueOf(((e) obj).f3558a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3558a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f3558a;
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, i11);
        b.z.L(J, parcel);
    }
}
