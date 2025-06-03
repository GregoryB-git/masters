package d6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends n6.a {
    public static final Parcelable.Creator<k> CREATOR = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final String f3569a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3570b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3571c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3572d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f3573e;
    public final String f;

    /* renamed from: o, reason: collision with root package name */
    public final String f3574o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3575p;

    /* renamed from: q, reason: collision with root package name */
    public final b7.t f3576q;

    public k(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, b7.t tVar) {
        m6.j.i(str);
        this.f3569a = str;
        this.f3570b = str2;
        this.f3571c = str3;
        this.f3572d = str4;
        this.f3573e = uri;
        this.f = str5;
        this.f3574o = str6;
        this.f3575p = str7;
        this.f3576q = tVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return m6.h.a(this.f3569a, kVar.f3569a) && m6.h.a(this.f3570b, kVar.f3570b) && m6.h.a(this.f3571c, kVar.f3571c) && m6.h.a(this.f3572d, kVar.f3572d) && m6.h.a(this.f3573e, kVar.f3573e) && m6.h.a(this.f, kVar.f) && m6.h.a(this.f3574o, kVar.f3574o) && m6.h.a(this.f3575p, kVar.f3575p) && m6.h.a(this.f3576q, kVar.f3576q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3569a, this.f3570b, this.f3571c, this.f3572d, this.f3573e, this.f, this.f3574o, this.f3575p, this.f3576q});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f3569a, false);
        b.z.F(parcel, 2, this.f3570b, false);
        b.z.F(parcel, 3, this.f3571c, false);
        b.z.F(parcel, 4, this.f3572d, false);
        b.z.E(parcel, 5, this.f3573e, i10, false);
        b.z.F(parcel, 6, this.f, false);
        b.z.F(parcel, 7, this.f3574o, false);
        b.z.F(parcel, 8, this.f3575p, false);
        b.z.E(parcel, 9, this.f3576q, i10, false);
        b.z.L(J, parcel);
    }
}
