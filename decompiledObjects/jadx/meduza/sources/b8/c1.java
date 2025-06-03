package b8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;

/* loaded from: classes.dex */
public final class c1 extends a0 {
    public static final Parcelable.Creator<c1> CREATOR = new e1();

    /* renamed from: a, reason: collision with root package name */
    public final String f2059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2060b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2061c;

    /* renamed from: d, reason: collision with root package name */
    public final zzaic f2062d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2063e;
    public final String f;

    /* renamed from: o, reason: collision with root package name */
    public final String f2064o;

    public c1(String str, String str2, String str3, zzaic zzaicVar, String str4, String str5, String str6) {
        this.f2059a = zzae.zzb(str);
        this.f2060b = str2;
        this.f2061c = str3;
        this.f2062d = zzaicVar;
        this.f2063e = str4;
        this.f = str5;
        this.f2064o = str6;
    }

    public static c1 H(zzaic zzaicVar) {
        if (zzaicVar != null) {
            return new c1(null, null, null, zzaicVar, null, null, null);
        }
        throw new NullPointerException("Must specify a non-null webSignInCredential");
    }

    @Override // b8.f
    public final String D() {
        return this.f2059a;
    }

    @Override // b8.f
    public final String E() {
        return this.f2059a;
    }

    @Override // b8.f
    public final f F() {
        return new c1(this.f2059a, this.f2060b, this.f2061c, this.f2062d, this.f2063e, this.f, this.f2064o);
    }

    @Override // b8.a0
    public final String G() {
        return this.f2061c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2059a, false);
        b.z.F(parcel, 2, this.f2060b, false);
        b.z.F(parcel, 3, this.f2061c, false);
        b.z.E(parcel, 4, this.f2062d, i10, false);
        b.z.F(parcel, 5, this.f2063e, false);
        b.z.F(parcel, 6, this.f, false);
        b.z.F(parcel, 7, this.f2064o, false);
        b.z.L(J, parcel);
    }
}
