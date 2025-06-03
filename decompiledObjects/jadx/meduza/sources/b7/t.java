package b7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t extends n6.a {
    public static final Parcelable.Creator<t> CREATOR = new t0();

    /* renamed from: a, reason: collision with root package name */
    public final String f1997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1998b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1999c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2000d;

    /* renamed from: e, reason: collision with root package name */
    public final g f2001e;
    public final i f;

    /* renamed from: o, reason: collision with root package name */
    public final e f2002o;

    /* renamed from: p, reason: collision with root package name */
    public final String f2003p;

    public t(String str, String str2, byte[] bArr, h hVar, g gVar, i iVar, e eVar, String str3) {
        boolean z10 = true;
        if ((hVar == null || gVar != null || iVar != null) && ((hVar != null || gVar == null || iVar != null) && (hVar != null || gVar != null || iVar == null))) {
            z10 = false;
        }
        m6.j.b(z10);
        this.f1997a = str;
        this.f1998b = str2;
        this.f1999c = bArr;
        this.f2000d = hVar;
        this.f2001e = gVar;
        this.f = iVar;
        this.f2002o = eVar;
        this.f2003p = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return m6.h.a(this.f1997a, tVar.f1997a) && m6.h.a(this.f1998b, tVar.f1998b) && Arrays.equals(this.f1999c, tVar.f1999c) && m6.h.a(this.f2000d, tVar.f2000d) && m6.h.a(this.f2001e, tVar.f2001e) && m6.h.a(this.f, tVar.f) && m6.h.a(this.f2002o, tVar.f2002o) && m6.h.a(this.f2003p, tVar.f2003p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1997a, this.f1998b, this.f1999c, this.f2001e, this.f2000d, this.f, this.f2002o, this.f2003p});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f1997a, false);
        b.z.F(parcel, 2, this.f1998b, false);
        b.z.w(parcel, 3, this.f1999c, false);
        b.z.E(parcel, 4, this.f2000d, i10, false);
        b.z.E(parcel, 5, this.f2001e, i10, false);
        b.z.E(parcel, 6, this.f, i10, false);
        b.z.E(parcel, 7, this.f2002o, i10, false);
        b.z.F(parcel, 8, this.f2003p, false);
        b.z.L(J, parcel);
    }
}
