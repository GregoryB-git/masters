package b7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends n {
    public static final Parcelable.Creator<l> CREATOR = new v1();

    /* renamed from: a, reason: collision with root package name */
    public final u f1977a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f1978b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1979c;

    public l(u uVar, Uri uri, byte[] bArr) {
        m6.j.i(uVar);
        this.f1977a = uVar;
        m6.j.i(uri);
        m6.j.a("origin scheme must be non-empty", uri.getScheme() != null);
        m6.j.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f1978b = uri;
        m6.j.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f1979c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return m6.h.a(this.f1977a, lVar.f1977a) && m6.h.a(this.f1978b, lVar.f1978b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1977a, this.f1978b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 2, this.f1977a, i10, false);
        b.z.E(parcel, 3, this.f1978b, i10, false);
        b.z.w(parcel, 4, this.f1979c, false);
        b.z.L(J, parcel);
    }
}
