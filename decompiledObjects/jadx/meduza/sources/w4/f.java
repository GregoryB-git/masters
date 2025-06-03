package w4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends w4.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f16303a;

    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16304a;

        /* renamed from: b, reason: collision with root package name */
        public final long f16305b;

        public b(int i10, long j10) {
            this.f16304a = i10;
            this.f16305b = j10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f16306a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16307b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16308c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f16309d;

        /* renamed from: e, reason: collision with root package name */
        public final long f16310e;
        public final List<b> f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f16311g;

        /* renamed from: h, reason: collision with root package name */
        public final long f16312h;

        /* renamed from: i, reason: collision with root package name */
        public final int f16313i;

        /* renamed from: j, reason: collision with root package name */
        public final int f16314j;

        /* renamed from: k, reason: collision with root package name */
        public final int f16315k;

        public c(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f16306a = j10;
            this.f16307b = z10;
            this.f16308c = z11;
            this.f16309d = z12;
            this.f = Collections.unmodifiableList(arrayList);
            this.f16310e = j11;
            this.f16311g = z13;
            this.f16312h = j12;
            this.f16313i = i10;
            this.f16314j = i11;
            this.f16315k = i12;
        }

        public c(Parcel parcel) {
            this.f16306a = parcel.readLong();
            this.f16307b = parcel.readByte() == 1;
            this.f16308c = parcel.readByte() == 1;
            this.f16309d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.f16310e = parcel.readLong();
            this.f16311g = parcel.readByte() == 1;
            this.f16312h = parcel.readLong();
            this.f16313i = parcel.readInt();
            this.f16314j = parcel.readInt();
            this.f16315k = parcel.readInt();
        }
    }

    public f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new c(parcel));
        }
        this.f16303a = Collections.unmodifiableList(arrayList);
    }

    public f(ArrayList arrayList) {
        this.f16303a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.f16303a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f16303a.get(i11);
            parcel.writeLong(cVar.f16306a);
            parcel.writeByte(cVar.f16307b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f16308c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f16309d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                b bVar = cVar.f.get(i12);
                parcel.writeInt(bVar.f16304a);
                parcel.writeLong(bVar.f16305b);
            }
            parcel.writeLong(cVar.f16310e);
            parcel.writeByte(cVar.f16311g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f16312h);
            parcel.writeInt(cVar.f16313i);
            parcel.writeInt(cVar.f16314j);
            parcel.writeInt(cVar.f16315k);
        }
    }
}
