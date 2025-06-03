package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends n6.a {
    public static final Parcelable.Creator<c> CREATOR = new b1();

    /* renamed from: a, reason: collision with root package name */
    public final String f2037a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2038b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2039c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2040d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2041e;
    public final String f;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2042o;

    /* renamed from: p, reason: collision with root package name */
    public String f2043p;

    /* renamed from: q, reason: collision with root package name */
    public int f2044q;

    /* renamed from: r, reason: collision with root package name */
    public String f2045r;

    /* renamed from: s, reason: collision with root package name */
    public final String f2046s;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f2047a;

        /* renamed from: b, reason: collision with root package name */
        public String f2048b;

        /* renamed from: c, reason: collision with root package name */
        public String f2049c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2050d;

        /* renamed from: e, reason: collision with root package name */
        public String f2051e;
        public boolean f = false;

        /* renamed from: g, reason: collision with root package name */
        public String f2052g;

        /* renamed from: h, reason: collision with root package name */
        public String f2053h;
    }

    public c(a aVar) {
        this.f2037a = aVar.f2047a;
        this.f2038b = aVar.f2048b;
        this.f2039c = null;
        this.f2040d = aVar.f2049c;
        this.f2041e = aVar.f2050d;
        this.f = aVar.f2051e;
        this.f2042o = aVar.f;
        this.f2045r = aVar.f2052g;
        this.f2046s = aVar.f2053h;
    }

    public c(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7, String str8) {
        this.f2037a = str;
        this.f2038b = str2;
        this.f2039c = str3;
        this.f2040d = str4;
        this.f2041e = z10;
        this.f = str5;
        this.f2042o = z11;
        this.f2043p = str6;
        this.f2044q = i10;
        this.f2045r = str7;
        this.f2046s = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2037a, false);
        b.z.F(parcel, 2, this.f2038b, false);
        b.z.F(parcel, 3, this.f2039c, false);
        b.z.F(parcel, 4, this.f2040d, false);
        b.z.t(parcel, 5, this.f2041e);
        b.z.F(parcel, 6, this.f, false);
        b.z.t(parcel, 7, this.f2042o);
        b.z.F(parcel, 8, this.f2043p, false);
        b.z.z(parcel, 9, this.f2044q);
        b.z.F(parcel, 10, this.f2045r, false);
        b.z.F(parcel, 11, this.f2046s, false);
        b.z.L(J, parcel);
    }
}
