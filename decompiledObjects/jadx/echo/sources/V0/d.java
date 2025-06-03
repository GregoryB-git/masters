package V0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.E;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends V0.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    public final int f6379A;

    /* renamed from: o, reason: collision with root package name */
    public final long f6380o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6381p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6382q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6383r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f6384s;

    /* renamed from: t, reason: collision with root package name */
    public final long f6385t;

    /* renamed from: u, reason: collision with root package name */
    public final long f6386u;

    /* renamed from: v, reason: collision with root package name */
    public final List f6387v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6388w;

    /* renamed from: x, reason: collision with root package name */
    public final long f6389x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6390y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6391z;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i7) {
            return new d[i7];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6392a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6393b;

        /* renamed from: c, reason: collision with root package name */
        public final long f6394c;

        public b(int i7, long j7, long j8) {
            this.f6392a = i7;
            this.f6393b = j7;
            this.f6394c = j8;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f6392a);
            parcel.writeLong(this.f6393b);
            parcel.writeLong(this.f6394c);
        }

        public /* synthetic */ b(int i7, long j7, long j8, a aVar) {
            this(i7, j7, j8);
        }
    }

    public d(long j7, boolean z7, boolean z8, boolean z9, boolean z10, long j8, long j9, List list, boolean z11, long j10, int i7, int i8, int i9) {
        this.f6380o = j7;
        this.f6381p = z7;
        this.f6382q = z8;
        this.f6383r = z9;
        this.f6384s = z10;
        this.f6385t = j8;
        this.f6386u = j9;
        this.f6387v = Collections.unmodifiableList(list);
        this.f6388w = z11;
        this.f6389x = j10;
        this.f6390y = i7;
        this.f6391z = i8;
        this.f6379A = i9;
    }

    public static d a(z zVar, long j7, E e7) {
        List list;
        boolean z7;
        boolean z8;
        long j8;
        boolean z9;
        long j9;
        int i7;
        int i8;
        int i9;
        boolean z10;
        boolean z11;
        long j10;
        long I6 = zVar.I();
        boolean z12 = (zVar.G() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z12) {
            list = emptyList;
            z7 = false;
            z8 = false;
            j8 = -9223372036854775807L;
            z9 = false;
            j9 = -9223372036854775807L;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            z10 = false;
        } else {
            int G6 = zVar.G();
            boolean z13 = (G6 & 128) != 0;
            boolean z14 = (G6 & 64) != 0;
            boolean z15 = (G6 & 32) != 0;
            boolean z16 = (G6 & 16) != 0;
            long b7 = (!z14 || z16) ? -9223372036854775807L : g.b(zVar, j7);
            if (!z14) {
                int G7 = zVar.G();
                ArrayList arrayList = new ArrayList(G7);
                for (int i10 = 0; i10 < G7; i10++) {
                    int G8 = zVar.G();
                    long b8 = !z16 ? g.b(zVar, j7) : -9223372036854775807L;
                    arrayList.add(new b(G8, b8, e7.b(b8), null));
                }
                emptyList = arrayList;
            }
            if (z15) {
                long G9 = zVar.G();
                boolean z17 = (128 & G9) != 0;
                j10 = ((((G9 & 1) << 32) | zVar.I()) * 1000) / 90;
                z11 = z17;
            } else {
                z11 = false;
                j10 = -9223372036854775807L;
            }
            i7 = zVar.M();
            z10 = z14;
            i8 = zVar.G();
            i9 = zVar.G();
            list = emptyList;
            long j11 = b7;
            z9 = z11;
            j9 = j10;
            z8 = z16;
            z7 = z13;
            j8 = j11;
        }
        return new d(I6, z12, z7, z10, z8, j8, e7.b(j8), list, z9, j9, i7, i8, i9);
    }

    @Override // V0.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f6385t + ", programSplicePlaybackPositionUs= " + this.f6386u + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f6380o);
        parcel.writeByte(this.f6381p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6382q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6383r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6384s ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6385t);
        parcel.writeLong(this.f6386u);
        int size = this.f6387v.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            ((b) this.f6387v.get(i8)).b(parcel);
        }
        parcel.writeByte(this.f6388w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6389x);
        parcel.writeInt(this.f6390y);
        parcel.writeInt(this.f6391z);
        parcel.writeInt(this.f6379A);
    }

    public d(Parcel parcel) {
        this.f6380o = parcel.readLong();
        this.f6381p = parcel.readByte() == 1;
        this.f6382q = parcel.readByte() == 1;
        this.f6383r = parcel.readByte() == 1;
        this.f6384s = parcel.readByte() == 1;
        this.f6385t = parcel.readLong();
        this.f6386u = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(b.a(parcel));
        }
        this.f6387v = Collections.unmodifiableList(arrayList);
        this.f6388w = parcel.readByte() == 1;
        this.f6389x = parcel.readLong();
        this.f6390y = parcel.readInt();
        this.f6391z = parcel.readInt();
        this.f6379A = parcel.readInt();
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }
}
