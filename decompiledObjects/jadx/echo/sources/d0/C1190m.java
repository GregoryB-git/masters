package d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g0.AbstractC1297a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: d0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190m implements Comparator, Parcelable {
    public static final Parcelable.Creator<C1190m> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final b[] f12655o;

    /* renamed from: p, reason: collision with root package name */
    public int f12656p;

    /* renamed from: q, reason: collision with root package name */
    public final String f12657q;

    /* renamed from: r, reason: collision with root package name */
    public final int f12658r;

    /* renamed from: d0.m$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1190m createFromParcel(Parcel parcel) {
            return new C1190m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1190m[] newArray(int i7) {
            return new C1190m[i7];
        }
    }

    /* renamed from: d0.m$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public int f12659o;

        /* renamed from: p, reason: collision with root package name */
        public final UUID f12660p;

        /* renamed from: q, reason: collision with root package name */
        public final String f12661q;

        /* renamed from: r, reason: collision with root package name */
        public final String f12662r;

        /* renamed from: s, reason: collision with root package name */
        public final byte[] f12663s;

        /* renamed from: d0.m$b$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i7) {
                return new b[i7];
            }
        }

        public b(Parcel parcel) {
            this.f12660p = new UUID(parcel.readLong(), parcel.readLong());
            this.f12661q = parcel.readString();
            this.f12662r = (String) g0.M.i(parcel.readString());
            this.f12663s = parcel.createByteArray();
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f12660p);
        }

        public b b(byte[] bArr) {
            return new b(this.f12660p, this.f12661q, this.f12662r, bArr);
        }

        public boolean c() {
            return this.f12663s != null;
        }

        public boolean d(UUID uuid) {
            return AbstractC1184g.f12615a.equals(this.f12660p) || uuid.equals(this.f12660p);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return g0.M.c(this.f12661q, bVar.f12661q) && g0.M.c(this.f12662r, bVar.f12662r) && g0.M.c(this.f12660p, bVar.f12660p) && Arrays.equals(this.f12663s, bVar.f12663s);
        }

        public int hashCode() {
            if (this.f12659o == 0) {
                int hashCode = this.f12660p.hashCode() * 31;
                String str = this.f12661q;
                this.f12659o = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f12662r.hashCode()) * 31) + Arrays.hashCode(this.f12663s);
            }
            return this.f12659o;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.f12660p.getMostSignificantBits());
            parcel.writeLong(this.f12660p.getLeastSignificantBits());
            parcel.writeString(this.f12661q);
            parcel.writeString(this.f12662r);
            parcel.writeByteArray(this.f12663s);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f12660p = (UUID) AbstractC1297a.e(uuid);
            this.f12661q = str;
            this.f12662r = AbstractC1203z.t((String) AbstractC1297a.e(str2));
            this.f12663s = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    public C1190m(Parcel parcel) {
        this.f12657q = parcel.readString();
        b[] bVarArr = (b[]) g0.M.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.f12655o = bVarArr;
        this.f12658r = bVarArr.length;
    }

    public static boolean b(ArrayList arrayList, int i7, UUID uuid) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (((b) arrayList.get(i8)).f12660p.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static C1190m d(C1190m c1190m, C1190m c1190m2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c1190m != null) {
            str = c1190m.f12657q;
            for (b bVar : c1190m.f12655o) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c1190m2 != null) {
            if (str == null) {
                str = c1190m2.f12657q;
            }
            int size = arrayList.size();
            for (b bVar2 : c1190m2.f12655o) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f12660p)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1190m(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = AbstractC1184g.f12615a;
        return uuid.equals(bVar.f12660p) ? uuid.equals(bVar2.f12660p) ? 0 : 1 : bVar.f12660p.compareTo(bVar2.f12660p);
    }

    public C1190m c(String str) {
        return g0.M.c(this.f12657q, str) ? this : new C1190m(str, false, this.f12655o);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i7) {
        return this.f12655o[i7];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1190m.class != obj.getClass()) {
            return false;
        }
        C1190m c1190m = (C1190m) obj;
        return g0.M.c(this.f12657q, c1190m.f12657q) && Arrays.equals(this.f12655o, c1190m.f12655o);
    }

    public C1190m f(C1190m c1190m) {
        String str;
        String str2 = this.f12657q;
        AbstractC1297a.f(str2 == null || (str = c1190m.f12657q) == null || TextUtils.equals(str2, str));
        String str3 = this.f12657q;
        if (str3 == null) {
            str3 = c1190m.f12657q;
        }
        return new C1190m(str3, (b[]) g0.M.N0(this.f12655o, c1190m.f12655o));
    }

    public int hashCode() {
        if (this.f12656p == 0) {
            String str = this.f12657q;
            this.f12656p = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f12655o);
        }
        return this.f12656p;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f12657q);
        parcel.writeTypedArray(this.f12655o, 0);
    }

    public C1190m(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C1190m(String str, boolean z7, b... bVarArr) {
        this.f12657q = str;
        bVarArr = z7 ? (b[]) bVarArr.clone() : bVarArr;
        this.f12655o = bVarArr;
        this.f12658r = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public C1190m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public C1190m(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public C1190m(b... bVarArr) {
        this((String) null, bVarArr);
    }
}
