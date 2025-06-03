package a4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import v5.e0;

/* loaded from: classes.dex */
public final class d implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f167a;

    /* renamed from: b, reason: collision with root package name */
    public int f168b;

    /* renamed from: c, reason: collision with root package name */
    public final String f169c;

    /* renamed from: d, reason: collision with root package name */
    public final int f170d;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f171a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f172b;

        /* renamed from: c, reason: collision with root package name */
        public final String f173c;

        /* renamed from: d, reason: collision with root package name */
        public final String f174d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f175e;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b() {
            throw null;
        }

        public b(Parcel parcel) {
            this.f172b = new UUID(parcel.readLong(), parcel.readLong());
            this.f173c = parcel.readString();
            String readString = parcel.readString();
            int i10 = e0.f15881a;
            this.f174d = readString;
            this.f175e = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f172b = uuid;
            this.f173c = str;
            str2.getClass();
            this.f174d = str2;
            this.f175e = bArr;
        }

        public final boolean a(UUID uuid) {
            return v3.h.f15394a.equals(this.f172b) || uuid.equals(this.f172b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return e0.a(this.f173c, bVar.f173c) && e0.a(this.f174d, bVar.f174d) && e0.a(this.f172b, bVar.f172b) && Arrays.equals(this.f175e, bVar.f175e);
        }

        public final int hashCode() {
            if (this.f171a == 0) {
                int hashCode = this.f172b.hashCode() * 31;
                String str = this.f173c;
                this.f171a = Arrays.hashCode(this.f175e) + a0.j.e(this.f174d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f171a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f172b.getMostSignificantBits());
            parcel.writeLong(this.f172b.getLeastSignificantBits());
            parcel.writeString(this.f173c);
            parcel.writeString(this.f174d);
            parcel.writeByteArray(this.f175e);
        }
    }

    public d() {
        throw null;
    }

    public d(Parcel parcel) {
        this.f169c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i10 = e0.f15881a;
        this.f167a = bVarArr;
        this.f170d = bVarArr.length;
    }

    public d(String str, ArrayList arrayList) {
        this(str, false, (b[]) arrayList.toArray(new b[0]));
    }

    public d(String str, boolean z10, b... bVarArr) {
        this.f169c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f167a = bVarArr;
        this.f170d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public d(b... bVarArr) {
        this(null, true, bVarArr);
    }

    public final d a(String str) {
        return e0.a(this.f169c, str) ? this : new d(str, false, this.f167a);
    }

    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = v3.h.f15394a;
        return uuid.equals(bVar3.f172b) ? uuid.equals(bVar4.f172b) ? 0 : 1 : bVar3.f172b.compareTo(bVar4.f172b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return e0.a(this.f169c, dVar.f169c) && Arrays.equals(this.f167a, dVar.f167a);
    }

    public final int hashCode() {
        if (this.f168b == 0) {
            String str = this.f169c;
            this.f168b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f167a);
        }
        return this.f168b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f169c);
        parcel.writeTypedArray(this.f167a, 0);
    }
}
