package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final String f6025p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6026q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6027r;

    /* renamed from: s, reason: collision with root package name */
    public final String[] f6028s;

    /* renamed from: t, reason: collision with root package name */
    public final i[] f6029t;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i7) {
            return new d[i7];
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        this.f6025p = (String) M.i(parcel.readString());
        this.f6026q = parcel.readByte() != 0;
        this.f6027r = parcel.readByte() != 0;
        this.f6028s = (String[]) M.i(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f6029t = new i[readInt];
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f6029t[i7] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6026q == dVar.f6026q && this.f6027r == dVar.f6027r && M.c(this.f6025p, dVar.f6025p) && Arrays.equals(this.f6028s, dVar.f6028s) && Arrays.equals(this.f6029t, dVar.f6029t);
    }

    public int hashCode() {
        int i7 = (((527 + (this.f6026q ? 1 : 0)) * 31) + (this.f6027r ? 1 : 0)) * 31;
        String str = this.f6025p;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f6025p);
        parcel.writeByte(this.f6026q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6027r ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f6028s);
        parcel.writeInt(this.f6029t.length);
        for (i iVar : this.f6029t) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(String str, boolean z7, boolean z8, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f6025p = str;
        this.f6026q = z7;
        this.f6027r = z8;
        this.f6028s = strArr;
        this.f6029t = iVarArr;
    }
}
