package w8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import b.z;
import java.util.ArrayList;
import java.util.List;
import v8.d;

/* loaded from: classes.dex */
public final class d extends n6.a implements v8.d {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16447a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f16448b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f16449c;

    public static class a extends n6.a implements d.a {
        public static final Parcelable.Creator<a> CREATOR = new f();

        /* renamed from: a, reason: collision with root package name */
        public final String f16450a;

        public a(String str) {
            this.f16450a = str;
        }

        @Override // v8.d.a
        public final String i() {
            return this.f16450a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int J = z.J(20293, parcel);
            z.F(parcel, 2, this.f16450a, false);
            z.L(J, parcel);
        }
    }

    public d(Uri uri, Uri uri2, ArrayList arrayList) {
        this.f16447a = uri;
        this.f16448b = uri2;
        this.f16449c = arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // v8.d
    public final Uri p() {
        return this.f16448b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.E(parcel, 1, this.f16447a, i10, false);
        z.E(parcel, 2, this.f16448b, i10, false);
        z.I(parcel, 3, this.f16449c, false);
        z.L(J, parcel);
    }

    @Override // v8.d
    public final List<a> x() {
        return this.f16449c;
    }

    @Override // v8.d
    public final Uri y() {
        return this.f16447a;
    }
}
