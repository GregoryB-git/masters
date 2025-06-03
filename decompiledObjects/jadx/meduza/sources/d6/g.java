package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends n6.a {
    public static final Parcelable.Creator<g> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f3564a;

    public g(PendingIntent pendingIntent) {
        this.f3564a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return m6.h.a(this.f3564a, ((g) obj).f3564a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3564a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f3564a, i10, false);
        b.z.L(J, parcel);
    }
}
