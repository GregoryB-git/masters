package V0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.E;
import g0.z;

/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final long f6409o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6410p;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i7) {
            return new g[i7];
        }
    }

    public g(long j7, long j8) {
        this.f6409o = j7;
        this.f6410p = j8;
    }

    public static g a(z zVar, long j7, E e7) {
        long b7 = b(zVar, j7);
        return new g(b7, e7.b(b7));
    }

    public static long b(z zVar, long j7) {
        long G6 = zVar.G();
        if ((128 & G6) != 0) {
            return 8589934591L & ((((G6 & 1) << 32) | zVar.I()) + j7);
        }
        return -9223372036854775807L;
    }

    @Override // V0.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f6409o + ", playbackPositionUs= " + this.f6410p + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6409o);
        parcel.writeLong(this.f6410p);
    }

    public /* synthetic */ g(long j7, long j8, a aVar) {
        this(j7, j8);
    }
}
