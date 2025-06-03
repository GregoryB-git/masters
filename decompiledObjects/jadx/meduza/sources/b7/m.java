package b7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends n {
    public static final Parcelable.Creator<m> CREATOR = new w1();

    /* renamed from: a, reason: collision with root package name */
    public final x f1981a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f1982b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1983c;

    public m(x xVar, Uri uri, byte[] bArr) {
        m6.j.i(xVar);
        this.f1981a = xVar;
        m6.j.i(uri);
        m6.j.a("origin scheme must be non-empty", uri.getScheme() != null);
        m6.j.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f1982b = uri;
        m6.j.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f1983c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return m6.h.a(this.f1981a, mVar.f1981a) && m6.h.a(this.f1982b, mVar.f1982b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1981a, this.f1982b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 2, this.f1981a, i10, false);
        b.z.E(parcel, 3, this.f1982b, i10, false);
        b.z.w(parcel, 4, this.f1983c, false);
        b.z.L(J, parcel);
    }
}
