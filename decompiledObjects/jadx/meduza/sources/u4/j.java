package u4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v5.e0;

/* loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f14967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14969d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f14970e;
    public final int[] f;

    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        super("MLLT");
        this.f14967b = i10;
        this.f14968c = i11;
        this.f14969d = i12;
        this.f14970e = iArr;
        this.f = iArr2;
    }

    public j(Parcel parcel) {
        super("MLLT");
        this.f14967b = parcel.readInt();
        this.f14968c = parcel.readInt();
        this.f14969d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = e0.f15881a;
        this.f14970e = createIntArray;
        this.f = parcel.createIntArray();
    }

    @Override // u4.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f14967b == jVar.f14967b && this.f14968c == jVar.f14968c && this.f14969d == jVar.f14969d && Arrays.equals(this.f14970e, jVar.f14970e) && Arrays.equals(this.f, jVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.f14970e) + ((((((527 + this.f14967b) * 31) + this.f14968c) * 31) + this.f14969d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14967b);
        parcel.writeInt(this.f14968c);
        parcel.writeInt(this.f14969d);
        parcel.writeIntArray(this.f14970e);
        parcel.writeIntArray(this.f);
    }
}
