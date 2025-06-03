package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends n6.a {
    public static final Parcelable.Creator<c> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f3557a;

    public c(PendingIntent pendingIntent) {
        m6.j.i(pendingIntent);
        this.f3557a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f3557a, i10, false);
        b.z.L(J, parcel);
    }
}
