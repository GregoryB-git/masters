package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final String f3534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3535b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3536c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3537d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f3538e;
    public final PendingIntent f;

    public a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f3534a = str;
        this.f3535b = str2;
        this.f3536c = str3;
        m6.j.i(arrayList);
        this.f3537d = arrayList;
        this.f = pendingIntent;
        this.f3538e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m6.h.a(this.f3534a, aVar.f3534a) && m6.h.a(this.f3535b, aVar.f3535b) && m6.h.a(this.f3536c, aVar.f3536c) && m6.h.a(this.f3537d, aVar.f3537d) && m6.h.a(this.f, aVar.f) && m6.h.a(this.f3538e, aVar.f3538e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3534a, this.f3535b, this.f3536c, this.f3537d, this.f, this.f3538e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f3534a, false);
        b.z.F(parcel, 2, this.f3535b, false);
        b.z.F(parcel, 3, this.f3536c, false);
        b.z.G(parcel, 4, this.f3537d);
        b.z.E(parcel, 5, this.f3538e, i10, false);
        b.z.E(parcel, 6, this.f, i10, false);
        b.z.L(J, parcel);
    }
}
