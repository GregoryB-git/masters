package T0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: p, reason: collision with root package name */
    public final int f6047p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6048q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6049r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f6050s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f6051t;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i7) {
            return new l[i7];
        }
    }

    public l(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f6047p = i7;
        this.f6048q = i8;
        this.f6049r = i9;
        this.f6050s = iArr;
        this.f6051t = iArr2;
    }

    @Override // T0.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f6047p == lVar.f6047p && this.f6048q == lVar.f6048q && this.f6049r == lVar.f6049r && Arrays.equals(this.f6050s, lVar.f6050s) && Arrays.equals(this.f6051t, lVar.f6051t);
    }

    public int hashCode() {
        return ((((((((527 + this.f6047p) * 31) + this.f6048q) * 31) + this.f6049r) * 31) + Arrays.hashCode(this.f6050s)) * 31) + Arrays.hashCode(this.f6051t);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6047p);
        parcel.writeInt(this.f6048q);
        parcel.writeInt(this.f6049r);
        parcel.writeIntArray(this.f6050s);
        parcel.writeIntArray(this.f6051t);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f6047p = parcel.readInt();
        this.f6048q = parcel.readInt();
        this.f6049r = parcel.readInt();
        this.f6050s = (int[]) M.i(parcel.createIntArray());
        this.f6051t = (int[]) M.i(parcel.createIntArray());
    }
}
