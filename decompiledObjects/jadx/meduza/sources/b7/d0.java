package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 extends n6.a {
    public static final Parcelable.Creator<d0> CREATOR = new c1();

    /* renamed from: a, reason: collision with root package name */
    public final a f1943a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1944b;

    public enum a implements Parcelable {
        /* JADX INFO: Fake field, exist only in values array */
        PRESENT("present"),
        /* JADX INFO: Fake field, exist only in values array */
        SUPPORTED("supported"),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new b1();

        /* renamed from: a, reason: collision with root package name */
        public final String f1946a;

        a(String str) {
            this.f1946a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f1946a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f1946a);
        }
    }

    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    static {
        new d0("supported", null);
        new d0("not-supported", null);
    }

    public d0(String str, String str2) {
        m6.j.i(str);
        try {
            for (a aVar : a.values()) {
                if (str.equals(aVar.f1946a)) {
                    this.f1943a = aVar;
                    this.f1944b = str2;
                    return;
                }
            }
            throw new b(str);
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return zzao.zza(this.f1943a, d0Var.f1943a) && zzao.zza(this.f1944b, d0Var.f1944b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1943a, this.f1944b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 2, this.f1943a.f1946a, false);
        b.z.F(parcel, 3, this.f1944b, false);
        b.z.L(J, parcel);
    }
}
