package d6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends n6.a {
    public static final Parcelable.Creator<f> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public final String f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3560b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3561c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3562d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3563e;
    public final int f;

    public f(String str, String str2, String str3, String str4, boolean z10, int i10) {
        m6.j.i(str);
        this.f3559a = str;
        this.f3560b = str2;
        this.f3561c = str3;
        this.f3562d = str4;
        this.f3563e = z10;
        this.f = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m6.h.a(this.f3559a, fVar.f3559a) && m6.h.a(this.f3562d, fVar.f3562d) && m6.h.a(this.f3560b, fVar.f3560b) && m6.h.a(Boolean.valueOf(this.f3563e), Boolean.valueOf(fVar.f3563e)) && this.f == fVar.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3559a, this.f3560b, this.f3562d, Boolean.valueOf(this.f3563e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f3559a, false);
        b.z.F(parcel, 2, this.f3560b, false);
        b.z.F(parcel, 3, this.f3561c, false);
        b.z.F(parcel, 4, this.f3562d, false);
        b.z.t(parcel, 5, this.f3563e);
        b.z.z(parcel, 6, this.f);
        b.z.L(J, parcel);
    }
}
