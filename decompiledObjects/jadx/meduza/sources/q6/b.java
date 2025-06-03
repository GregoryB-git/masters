package q6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class b extends n6.a {
    public static final Parcelable.Creator<b> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f13334a;

    public b(PendingIntent pendingIntent) {
        this.f13334a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.E(parcel, 1, this.f13334a, i10, false);
        z.L(J, parcel);
    }
}
