package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends w4.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f16289a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16290b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16291c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16292d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16293e;
    public final long f;

    /* renamed from: o, reason: collision with root package name */
    public final long f16294o;

    /* renamed from: p, reason: collision with root package name */
    public final List<b> f16295p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f16296q;

    /* renamed from: r, reason: collision with root package name */
    public final long f16297r;

    /* renamed from: s, reason: collision with root package name */
    public final int f16298s;
    public final int t;

    /* renamed from: u, reason: collision with root package name */
    public final int f16299u;

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

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16300a;

        /* renamed from: b, reason: collision with root package name */
        public final long f16301b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16302c;

        public b(int i10, long j10, long j11) {
            this.f16300a = i10;
            this.f16301b = j10;
            this.f16302c = j11;
        }
    }

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f16289a = j10;
        this.f16290b = z10;
        this.f16291c = z11;
        this.f16292d = z12;
        this.f16293e = z13;
        this.f = j11;
        this.f16294o = j12;
        this.f16295p = Collections.unmodifiableList(list);
        this.f16296q = z14;
        this.f16297r = j13;
        this.f16298s = i10;
        this.t = i11;
        this.f16299u = i12;
    }

    public d(Parcel parcel) {
        this.f16289a = parcel.readLong();
        this.f16290b = parcel.readByte() == 1;
        this.f16291c = parcel.readByte() == 1;
        this.f16292d = parcel.readByte() == 1;
        this.f16293e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.f16294o = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f16295p = Collections.unmodifiableList(arrayList);
        this.f16296q = parcel.readByte() == 1;
        this.f16297r = parcel.readLong();
        this.f16298s = parcel.readInt();
        this.t = parcel.readInt();
        this.f16299u = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16289a);
        parcel.writeByte(this.f16290b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16291c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16292d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16293e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.f16294o);
        int size = this.f16295p.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f16295p.get(i11);
            parcel.writeInt(bVar.f16300a);
            parcel.writeLong(bVar.f16301b);
            parcel.writeLong(bVar.f16302c);
        }
        parcel.writeByte(this.f16296q ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f16297r);
        parcel.writeInt(this.f16298s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.f16299u);
    }
}
