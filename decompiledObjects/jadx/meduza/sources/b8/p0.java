package b8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class p0 extends n6.a {
    public static final Parcelable.Creator<p0> CREATOR = new a1();

    /* renamed from: a, reason: collision with root package name */
    public String f2125a;

    /* renamed from: b, reason: collision with root package name */
    public String f2126b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2127c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2128d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f2129e;

    public p0(String str, String str2, boolean z10, boolean z11) {
        this.f2125a = str;
        this.f2126b = str2;
        this.f2127c = z10;
        this.f2128d = z11;
        this.f2129e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 2, this.f2125a, false);
        b.z.F(parcel, 3, this.f2126b, false);
        b.z.t(parcel, 4, this.f2127c);
        b.z.t(parcel, 5, this.f2128d);
        b.z.L(J, parcel);
    }
}
