package d6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends n6.a {
    public static final Parcelable.Creator<h> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final l f3565a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3566b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3567c;

    public h(l lVar, String str, int i10) {
        m6.j.i(lVar);
        this.f3565a = lVar;
        this.f3566b = str;
        this.f3567c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return m6.h.a(this.f3565a, hVar.f3565a) && m6.h.a(this.f3566b, hVar.f3566b) && this.f3567c == hVar.f3567c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3565a, this.f3566b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f3565a, i10, false);
        b.z.F(parcel, 2, this.f3566b, false);
        b.z.z(parcel, 3, this.f3567c);
        b.z.L(J, parcel);
    }
}
