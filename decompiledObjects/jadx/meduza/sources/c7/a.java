package c7;

import android.os.Parcel;
import android.os.Parcelable;
import b.z;

@Deprecated
/* loaded from: classes.dex */
public final class a extends n6.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0036a f2384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2385b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2386c;

    /* renamed from: c7.a$a, reason: collision with other inner class name */
    public enum EnumC0036a implements Parcelable {
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);

        public static final Parcelable.Creator<EnumC0036a> CREATOR = new f();

        /* renamed from: a, reason: collision with root package name */
        public final int f2390a;

        EnumC0036a(int i10) {
            this.f2390a = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2390a);
        }
    }

    public static class b extends Exception {
        public b(int i10) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i10)));
        }
    }

    static {
        new a();
        new a("unavailable");
        new a("unused");
    }

    public a() {
        this.f2384a = EnumC0036a.ABSENT;
        this.f2386c = null;
        this.f2385b = null;
    }

    public a(int i10, String str, String str2) {
        try {
            for (EnumC0036a enumC0036a : EnumC0036a.values()) {
                if (i10 == enumC0036a.f2390a) {
                    this.f2384a = enumC0036a;
                    this.f2385b = str;
                    this.f2386c = str2;
                    return;
                }
            }
            throw new b(i10);
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public a(String str) {
        this.f2385b = str;
        this.f2384a = EnumC0036a.STRING;
        this.f2386c = null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f2384a.equals(aVar.f2384a)) {
            return false;
        }
        int ordinal = this.f2384a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            str = this.f2385b;
            str2 = aVar.f2385b;
        } else {
            if (ordinal != 2) {
                return false;
            }
            str = this.f2386c;
            str2 = aVar.f2386c;
        }
        return str.equals(str2);
    }

    public final int hashCode() {
        int i10;
        String str;
        int hashCode = this.f2384a.hashCode() + 31;
        int ordinal = this.f2384a.ordinal();
        if (ordinal == 1) {
            i10 = hashCode * 31;
            str = this.f2385b;
        } else {
            if (ordinal != 2) {
                return hashCode;
            }
            i10 = hashCode * 31;
            str = this.f2386c;
        }
        return str.hashCode() + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = z.J(20293, parcel);
        z.z(parcel, 2, this.f2384a.f2390a);
        z.F(parcel, 3, this.f2385b, false);
        z.F(parcel, 4, this.f2386c, false);
        z.L(J, parcel);
    }
}
