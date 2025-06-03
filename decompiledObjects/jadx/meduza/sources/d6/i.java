package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends n6.a {
    public static final Parcelable.Creator<i> CREATOR = new b0();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f3568a;

    public i(PendingIntent pendingIntent) {
        m6.j.i(pendingIntent);
        this.f3568a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return m6.h.a(this.f3568a, ((i) obj).f3568a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3568a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f3568a, i10, false);
        b.z.L(J, parcel);
    }
}
