package w4;

import android.os.Parcel;
import android.os.Parcelable;
import v5.e0;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0253a();

    /* renamed from: a, reason: collision with root package name */
    public final long f16283a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16284b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16285c;

    /* renamed from: w4.a$a, reason: collision with other inner class name */
    public class C0253a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(long j10, byte[] bArr, long j11) {
        this.f16283a = j11;
        this.f16284b = j10;
        this.f16285c = bArr;
    }

    public a(Parcel parcel) {
        this.f16283a = parcel.readLong();
        this.f16284b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = e0.f15881a;
        this.f16285c = createByteArray;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16283a);
        parcel.writeLong(this.f16284b);
        parcel.writeByteArray(this.f16285c);
    }
}
