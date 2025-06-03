package z5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b.z;

/* loaded from: classes.dex */
public final class b extends n6.a {
    public static final Parcelable.Creator<b> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final int f17798a;

    /* renamed from: b, reason: collision with root package name */
    public int f17799b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public String f17800c;

    /* renamed from: d, reason: collision with root package name */
    public Account f17801d;

    public b(int i10, int i11, String str, Account account) {
        this.f17798a = i10;
        this.f17799b = i11;
        this.f17800c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f17801d = account;
        } else {
            this.f17801d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 1, this.f17798a);
        z.z(parcel, 2, this.f17799b);
        z.F(parcel, 3, this.f17800c, false);
        z.E(parcel, 4, this.f17801d, i10, false);
        z.L(J, parcel);
    }
}
