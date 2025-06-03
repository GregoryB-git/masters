package d6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class b extends n6.a {
    public static final Parcelable.Creator<b> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    public final d f3539a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3540b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3541c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3542d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3543e;
    public final c f;

    /* renamed from: o, reason: collision with root package name */
    public final C0063b f3544o;

    public static final class a extends n6.a {
        public static final Parcelable.Creator<a> CREATOR = new u();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3545a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3546b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3547c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f3548d;

        /* renamed from: e, reason: collision with root package name */
        public final String f3549e;
        public final ArrayList f;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f3550o;

        public a(boolean z10, String str, String str2, boolean z11, String str3, ArrayList arrayList, boolean z12) {
            m6.j.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", (z11 && z12) ? false : true);
            this.f3545a = z10;
            if (z10 && str == null) {
                throw new NullPointerException("serverClientId must be provided if Google ID tokens are requested");
            }
            this.f3546b = str;
            this.f3547c = str2;
            this.f3548d = z11;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.f = arrayList2;
            this.f3549e = str3;
            this.f3550o = z12;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3545a == aVar.f3545a && m6.h.a(this.f3546b, aVar.f3546b) && m6.h.a(this.f3547c, aVar.f3547c) && this.f3548d == aVar.f3548d && m6.h.a(this.f3549e, aVar.f3549e) && m6.h.a(this.f, aVar.f) && this.f3550o == aVar.f3550o;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3545a), this.f3546b, this.f3547c, Boolean.valueOf(this.f3548d), this.f3549e, this.f, Boolean.valueOf(this.f3550o)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int J = b.z.J(20293, parcel);
            b.z.t(parcel, 1, this.f3545a);
            b.z.F(parcel, 2, this.f3546b, false);
            b.z.F(parcel, 3, this.f3547c, false);
            b.z.t(parcel, 4, this.f3548d);
            b.z.F(parcel, 5, this.f3549e, false);
            b.z.G(parcel, 6, this.f);
            b.z.t(parcel, 7, this.f3550o);
            b.z.L(J, parcel);
        }
    }

    /* renamed from: d6.b$b, reason: collision with other inner class name */
    public static final class C0063b extends n6.a {
        public static final Parcelable.Creator<C0063b> CREATOR = new v();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3551a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3552b;

        public C0063b(String str, boolean z10) {
            if (z10) {
                m6.j.i(str);
            }
            this.f3551a = z10;
            this.f3552b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0063b)) {
                return false;
            }
            C0063b c0063b = (C0063b) obj;
            return this.f3551a == c0063b.f3551a && m6.h.a(this.f3552b, c0063b.f3552b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3551a), this.f3552b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int J = b.z.J(20293, parcel);
            b.z.t(parcel, 1, this.f3551a);
            b.z.F(parcel, 2, this.f3552b, false);
            b.z.L(J, parcel);
        }
    }

    @Deprecated
    public static final class c extends n6.a {
        public static final Parcelable.Creator<c> CREATOR = new w();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3553a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f3554b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3555c;

        public c(boolean z10, byte[] bArr, String str) {
            if (z10) {
                m6.j.i(bArr);
                m6.j.i(str);
            }
            this.f3553a = z10;
            this.f3554b = bArr;
            this.f3555c = str;
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3553a == cVar.f3553a && Arrays.equals(this.f3554b, cVar.f3554b) && ((str = this.f3555c) == (str2 = cVar.f3555c) || (str != null && str.equals(str2)));
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f3554b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3553a), this.f3555c}) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int J = b.z.J(20293, parcel);
            b.z.t(parcel, 1, this.f3553a);
            b.z.w(parcel, 2, this.f3554b, false);
            b.z.F(parcel, 3, this.f3555c, false);
            b.z.L(J, parcel);
        }
    }

    public static final class d extends n6.a {
        public static final Parcelable.Creator<d> CREATOR = new x();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3556a;

        public d(boolean z10) {
            this.f3556a = z10;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof d) && this.f3556a == ((d) obj).f3556a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3556a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int J = b.z.J(20293, parcel);
            b.z.t(parcel, 1, this.f3556a);
            b.z.L(J, parcel);
        }
    }

    public b(d dVar, a aVar, String str, boolean z10, int i10, c cVar, C0063b c0063b) {
        m6.j.i(dVar);
        this.f3539a = dVar;
        m6.j.i(aVar);
        this.f3540b = aVar;
        this.f3541c = str;
        this.f3542d = z10;
        this.f3543e = i10;
        this.f = cVar == null ? new c(false, null, null) : cVar;
        this.f3544o = c0063b == null ? new C0063b(null, false) : c0063b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m6.h.a(this.f3539a, bVar.f3539a) && m6.h.a(this.f3540b, bVar.f3540b) && m6.h.a(this.f, bVar.f) && m6.h.a(this.f3544o, bVar.f3544o) && m6.h.a(this.f3541c, bVar.f3541c) && this.f3542d == bVar.f3542d && this.f3543e == bVar.f3543e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3539a, this.f3540b, this.f, this.f3544o, this.f3541c, Boolean.valueOf(this.f3542d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.E(parcel, 1, this.f3539a, i10, false);
        b.z.E(parcel, 2, this.f3540b, i10, false);
        b.z.F(parcel, 3, this.f3541c, false);
        b.z.t(parcel, 4, this.f3542d);
        b.z.z(parcel, 5, this.f3543e);
        b.z.E(parcel, 6, this.f, i10, false);
        b.z.E(parcel, 7, this.f3544o, i10, false);
        b.z.L(J, parcel);
    }
}
