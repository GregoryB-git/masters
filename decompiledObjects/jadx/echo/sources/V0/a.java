package V0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.M;
import g0.z;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0108a();

    /* renamed from: o, reason: collision with root package name */
    public final long f6373o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6374p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f6375q;

    /* renamed from: V0.a$a, reason: collision with other inner class name */
    public class C0108a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(long j7, byte[] bArr, long j8) {
        this.f6373o = j8;
        this.f6374p = j7;
        this.f6375q = bArr;
    }

    public static a a(z zVar, int i7, long j7) {
        long I6 = zVar.I();
        int i8 = i7 - 4;
        byte[] bArr = new byte[i8];
        zVar.l(bArr, 0, i8);
        return new a(I6, bArr, j7);
    }

    @Override // V0.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f6373o + ", identifier= " + this.f6374p + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6373o);
        parcel.writeLong(this.f6374p);
        parcel.writeByteArray(this.f6375q);
    }

    public a(Parcel parcel) {
        this.f6373o = parcel.readLong();
        this.f6374p = parcel.readLong();
        this.f6375q = (byte[]) M.i(parcel.createByteArray());
    }

    public /* synthetic */ a(Parcel parcel, C0108a c0108a) {
        this(parcel);
    }
}
