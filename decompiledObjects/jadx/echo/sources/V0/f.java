package V0;

import android.os.Parcel;
import android.os.Parcelable;
import g0.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends V0.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final List f6395o;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i7) {
            return new f[i7];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6396a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6397b;

        public b(int i7, long j7) {
            this.f6396a = i7;
            this.f6397b = j7;
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f6396a);
            parcel.writeLong(this.f6397b);
        }

        public /* synthetic */ b(int i7, long j7, a aVar) {
            this(i7, j7);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f6398a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6399b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6400c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f6401d;

        /* renamed from: e, reason: collision with root package name */
        public final long f6402e;

        /* renamed from: f, reason: collision with root package name */
        public final List f6403f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f6404g;

        /* renamed from: h, reason: collision with root package name */
        public final long f6405h;

        /* renamed from: i, reason: collision with root package name */
        public final int f6406i;

        /* renamed from: j, reason: collision with root package name */
        public final int f6407j;

        /* renamed from: k, reason: collision with root package name */
        public final int f6408k;

        public c(long j7, boolean z7, boolean z8, boolean z9, List list, long j8, boolean z10, long j9, int i7, int i8, int i9) {
            this.f6398a = j7;
            this.f6399b = z7;
            this.f6400c = z8;
            this.f6401d = z9;
            this.f6403f = Collections.unmodifiableList(list);
            this.f6402e = j8;
            this.f6404g = z10;
            this.f6405h = j9;
            this.f6406i = i7;
            this.f6407j = i8;
            this.f6408k = i9;
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(z zVar) {
            ArrayList arrayList;
            boolean z7;
            long j7;
            boolean z8;
            long j8;
            int i7;
            int i8;
            int i9;
            boolean z9;
            boolean z10;
            long j9;
            long I6 = zVar.I();
            boolean z11 = (zVar.G() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z11) {
                arrayList = arrayList2;
                z7 = false;
                j7 = -9223372036854775807L;
                z8 = false;
                j8 = -9223372036854775807L;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                z9 = false;
            } else {
                int G6 = zVar.G();
                boolean z12 = (G6 & 128) != 0;
                boolean z13 = (G6 & 64) != 0;
                boolean z14 = (G6 & 32) != 0;
                long I7 = z13 ? zVar.I() : -9223372036854775807L;
                if (!z13) {
                    int G7 = zVar.G();
                    ArrayList arrayList3 = new ArrayList(G7);
                    for (int i10 = 0; i10 < G7; i10++) {
                        arrayList3.add(new b(zVar.G(), zVar.I(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z14) {
                    long G8 = zVar.G();
                    boolean z15 = (128 & G8) != 0;
                    j9 = ((((G8 & 1) << 32) | zVar.I()) * 1000) / 90;
                    z10 = z15;
                } else {
                    z10 = false;
                    j9 = -9223372036854775807L;
                }
                int M6 = zVar.M();
                int G9 = zVar.G();
                z9 = z13;
                i9 = zVar.G();
                j8 = j9;
                arrayList = arrayList2;
                long j10 = I7;
                i7 = M6;
                i8 = G9;
                j7 = j10;
                boolean z16 = z12;
                z8 = z10;
                z7 = z16;
            }
            return new c(I6, z11, z7, z9, arrayList, j7, z8, j8, i7, i8, i9);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f6398a);
            parcel.writeByte(this.f6399b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f6400c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f6401d ? (byte) 1 : (byte) 0);
            int size = this.f6403f.size();
            parcel.writeInt(size);
            for (int i7 = 0; i7 < size; i7++) {
                ((b) this.f6403f.get(i7)).d(parcel);
            }
            parcel.writeLong(this.f6402e);
            parcel.writeByte(this.f6404g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f6405h);
            parcel.writeInt(this.f6406i);
            parcel.writeInt(this.f6407j);
            parcel.writeInt(this.f6408k);
        }

        public c(Parcel parcel) {
            this.f6398a = parcel.readLong();
            this.f6399b = parcel.readByte() == 1;
            this.f6400c = parcel.readByte() == 1;
            this.f6401d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i7 = 0; i7 < readInt; i7++) {
                arrayList.add(b.c(parcel));
            }
            this.f6403f = Collections.unmodifiableList(arrayList);
            this.f6402e = parcel.readLong();
            this.f6404g = parcel.readByte() == 1;
            this.f6405h = parcel.readLong();
            this.f6406i = parcel.readInt();
            this.f6407j = parcel.readInt();
            this.f6408k = parcel.readInt();
        }
    }

    public f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(c.d(parcel));
        }
        this.f6395o = Collections.unmodifiableList(arrayList);
    }

    public static f a(z zVar) {
        int G6 = zVar.G();
        ArrayList arrayList = new ArrayList(G6);
        for (int i7 = 0; i7 < G6; i7++) {
            arrayList.add(c.e(zVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int size = this.f6395o.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            ((c) this.f6395o.get(i8)).f(parcel);
        }
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public f(List list) {
        this.f6395o = Collections.unmodifiableList(list);
    }
}
