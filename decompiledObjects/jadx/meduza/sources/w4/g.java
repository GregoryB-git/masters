package w4;

import android.os.Parcel;
import android.os.Parcelable;
import v5.u;

/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f16316a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16317b;

    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(long j10, long j11) {
        this.f16316a = j10;
        this.f16317b = j11;
    }

    public static long a(long j10, u uVar) {
        long v10 = uVar.v();
        if ((128 & v10) != 0) {
            return 8589934591L & ((((v10 & 1) << 32) | uVar.w()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16316a);
        parcel.writeLong(this.f16317b);
    }
}
