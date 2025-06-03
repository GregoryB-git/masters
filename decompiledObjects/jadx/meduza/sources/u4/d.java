package u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f14947b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14948c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14949d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f14950e;
    public final h[] f;

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

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = e0.f15881a;
        this.f14947b = readString;
        this.f14948c = parcel.readByte() != 0;
        this.f14949d = parcel.readByte() != 0;
        this.f14950e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f = new h[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f14947b = str;
        this.f14948c = z10;
        this.f14949d = z11;
        this.f14950e = strArr;
        this.f = hVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f14948c == dVar.f14948c && this.f14949d == dVar.f14949d && e0.a(this.f14947b, dVar.f14947b) && Arrays.equals(this.f14950e, dVar.f14950e) && Arrays.equals(this.f, dVar.f);
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f14948c ? 1 : 0)) * 31) + (this.f14949d ? 1 : 0)) * 31;
        String str = this.f14947b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14947b);
        parcel.writeByte(this.f14948c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14949d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f14950e);
        parcel.writeInt(this.f.length);
        for (h hVar : this.f) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
