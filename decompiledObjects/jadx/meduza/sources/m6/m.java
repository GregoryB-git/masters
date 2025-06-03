package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends n6.a {
    public static final Parcelable.Creator<m> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final int f10296a;

    /* renamed from: b, reason: collision with root package name */
    public List f10297b;

    public m(int i10, List list) {
        this.f10296a = i10;
        this.f10297b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.z(parcel, 1, this.f10296a);
        b.z.I(parcel, 2, this.f10297b, false);
        b.z.L(J, parcel);
    }
}
