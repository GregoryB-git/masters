package e5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4.a;
import v3.i0;
import v3.p0;

/* loaded from: classes.dex */
public final class o implements a.b {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f4039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4040b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f4041c;

    public class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f4042a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4043b;

        /* renamed from: c, reason: collision with root package name */
        public final String f4044c;

        /* renamed from: d, reason: collision with root package name */
        public final String f4045d;

        /* renamed from: e, reason: collision with root package name */
        public final String f4046e;
        public final String f;

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

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f4042a = i10;
            this.f4043b = i11;
            this.f4044c = str;
            this.f4045d = str2;
            this.f4046e = str3;
            this.f = str4;
        }

        public b(Parcel parcel) {
            this.f4042a = parcel.readInt();
            this.f4043b = parcel.readInt();
            this.f4044c = parcel.readString();
            this.f4045d = parcel.readString();
            this.f4046e = parcel.readString();
            this.f = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4042a == bVar.f4042a && this.f4043b == bVar.f4043b && TextUtils.equals(this.f4044c, bVar.f4044c) && TextUtils.equals(this.f4045d, bVar.f4045d) && TextUtils.equals(this.f4046e, bVar.f4046e) && TextUtils.equals(this.f, bVar.f);
        }

        public final int hashCode() {
            int i10 = ((this.f4042a * 31) + this.f4043b) * 31;
            String str = this.f4044c;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4045d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f4046e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4042a);
            parcel.writeInt(this.f4043b);
            parcel.writeString(this.f4044c);
            parcel.writeString(this.f4045d);
            parcel.writeString(this.f4046e);
            parcel.writeString(this.f);
        }
    }

    public o(Parcel parcel) {
        this.f4039a = parcel.readString();
        this.f4040b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f4041c = Collections.unmodifiableList(arrayList);
    }

    public o(String str, String str2, List<b> list) {
        this.f4039a = str;
        this.f4040b = str2;
        this.f4041c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // p4.a.b
    public final /* synthetic */ byte[] B() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return TextUtils.equals(this.f4039a, oVar.f4039a) && TextUtils.equals(this.f4040b, oVar.f4040b) && this.f4041c.equals(oVar.f4041c);
    }

    public final int hashCode() {
        String str = this.f4039a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4040b;
        return this.f4041c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p4.a.b
    public final /* synthetic */ void l(p0.a aVar) {
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder l10 = defpackage.f.l("HlsTrackMetadataEntry");
        if (this.f4039a != null) {
            StringBuilder l11 = defpackage.f.l(" [");
            l11.append(this.f4039a);
            l11.append(", ");
            str = defpackage.g.f(l11, this.f4040b, "]");
        } else {
            str = "";
        }
        l10.append(str);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4039a);
        parcel.writeString(this.f4040b);
        int size = this.f4041c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f4041c.get(i11), 0);
        }
    }
}
