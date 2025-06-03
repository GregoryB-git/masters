package h7;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends n6.a implements k6.j {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final List f7179a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7180b;

    public f(String str, ArrayList arrayList) {
        this.f7179a = arrayList;
        this.f7180b = str;
    }

    @Override // k6.j
    public final Status getStatus() {
        return this.f7180b != null ? Status.f2812e : Status.f2815q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f7179a;
        int J = z.J(20293, parcel);
        z.G(parcel, 1, list);
        z.F(parcel, 2, this.f7180b, false);
        z.L(J, parcel);
    }
}
