package i6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public final Intent f7564a;

    public a(Intent intent) {
        this.f7564a = intent;
    }

    public final String D() {
        String stringExtra = this.f7564a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f7564a.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f7564a, i10, false);
        b.z.L(J, parcel);
    }
}
