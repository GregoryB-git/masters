package q0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements C1201x.b {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final String f18784o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18785p;

    /* renamed from: q, reason: collision with root package name */
    public final List f18786q;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i7) {
            return new t[i7];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public final int f18787o;

        /* renamed from: p, reason: collision with root package name */
        public final int f18788p;

        /* renamed from: q, reason: collision with root package name */
        public final String f18789q;

        /* renamed from: r, reason: collision with root package name */
        public final String f18790r;

        /* renamed from: s, reason: collision with root package name */
        public final String f18791s;

        /* renamed from: t, reason: collision with root package name */
        public final String f18792t;

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

        public b(int i7, int i8, String str, String str2, String str3, String str4) {
            this.f18787o = i7;
            this.f18788p = i8;
            this.f18789q = str;
            this.f18790r = str2;
            this.f18791s = str3;
            this.f18792t = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f18787o == bVar.f18787o && this.f18788p == bVar.f18788p && TextUtils.equals(this.f18789q, bVar.f18789q) && TextUtils.equals(this.f18790r, bVar.f18790r) && TextUtils.equals(this.f18791s, bVar.f18791s) && TextUtils.equals(this.f18792t, bVar.f18792t);
        }

        public int hashCode() {
            int i7 = ((this.f18787o * 31) + this.f18788p) * 31;
            String str = this.f18789q;
            int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f18790r;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f18791s;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f18792t;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f18787o);
            parcel.writeInt(this.f18788p);
            parcel.writeString(this.f18789q);
            parcel.writeString(this.f18790r);
            parcel.writeString(this.f18791s);
            parcel.writeString(this.f18792t);
        }

        public b(Parcel parcel) {
            this.f18787o = parcel.readInt();
            this.f18788p = parcel.readInt();
            this.f18789q = parcel.readString();
            this.f18790r = parcel.readString();
            this.f18791s = parcel.readString();
            this.f18792t = parcel.readString();
        }
    }

    public t(Parcel parcel) {
        this.f18784o = parcel.readString();
        this.f18785p = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f18786q = Collections.unmodifiableList(arrayList);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ void D(C1200w.b bVar) {
        AbstractC1202y.c(this, bVar);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ byte[] M() {
        return AbstractC1202y.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return TextUtils.equals(this.f18784o, tVar.f18784o) && TextUtils.equals(this.f18785p, tVar.f18785p) && this.f18786q.equals(tVar.f18786q);
    }

    public int hashCode() {
        String str = this.f18784o;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f18785p;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f18786q.hashCode();
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f18784o != null) {
            str = " [" + this.f18784o + ", " + this.f18785p + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f18784o);
        parcel.writeString(this.f18785p);
        int size = this.f18786q.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeParcelable((Parcelable) this.f18786q.get(i8), 0);
        }
    }

    public t(String str, String str2, List list) {
        this.f18784o = str;
        this.f18785p = str2;
        this.f18786q = Collections.unmodifiableList(new ArrayList(list));
    }
}
