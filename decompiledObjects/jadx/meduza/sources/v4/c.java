package v4;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4.a;
import v3.i0;
import v3.p0;
import v5.e0;

/* loaded from: classes.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f15854a;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final long f15855a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15856b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15857c;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(int i10, long j10, long j11) {
            x6.b.q(j10 < j11);
            this.f15855a = j10;
            this.f15856b = j11;
            this.f15857c = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15855a == bVar.f15855a && this.f15856b == bVar.f15856b && this.f15857c == bVar.f15857c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f15855a), Long.valueOf(this.f15856b), Integer.valueOf(this.f15857c)});
        }

        public final String toString() {
            return e0.m("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f15855a), Long.valueOf(this.f15856b), Integer.valueOf(this.f15857c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f15855a);
            parcel.writeLong(this.f15856b);
            parcel.writeInt(this.f15857c);
        }
    }

    public c(ArrayList arrayList) {
        this.f15854a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((b) arrayList.get(0)).f15856b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i10)).f15855a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((b) arrayList.get(i10)).f15856b;
                    i10++;
                }
            }
        }
        x6.b.q(!z10);
    }

    @Override // p4.a.b
    public final /* synthetic */ byte[] B() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f15854a.equals(((c) obj).f15854a);
    }

    public final int hashCode() {
        return this.f15854a.hashCode();
    }

    @Override // p4.a.b
    public final /* synthetic */ void l(p0.a aVar) {
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("SlowMotion: segments=");
        l10.append(this.f15854a);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f15854a);
    }
}
