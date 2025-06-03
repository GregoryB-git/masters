package q6;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;

/* loaded from: classes.dex */
public final class d extends n6.a {
    public static final Parcelable.Creator<d> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f13337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13338b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f13339c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f13340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13341e;

    public d(int i10, int i11, Long l10, Long l11, int i12) {
        this.f13337a = i10;
        this.f13338b = i11;
        this.f13339c = l10;
        this.f13340d = l11;
        this.f13341e = i12;
        if (l10 == null || l11 == null || l11.longValue() == 0) {
            return;
        }
        l10.longValue();
        if (l11.longValue() == 0) {
            throw new IllegalArgumentException("Given Long is zero");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f13337a);
        z.z(parcel, 2, this.f13338b);
        z.D(parcel, 3, this.f13339c);
        z.D(parcel, 4, this.f13340d);
        z.z(parcel, 5, this.f13341e);
        z.L(J, parcel);
    }
}
