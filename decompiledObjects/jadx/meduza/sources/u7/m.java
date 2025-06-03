package u7;

import android.os.Parcel;
import android.os.Parcelable;
import ec.n;
import java.util.Date;
import p2.m0;

/* loaded from: classes.dex */
public final class m implements Comparable<m>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final long f15102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15103b;

    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            ec.i.e(parcel, "source");
            return new m(parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public static final class b {
        public static final void a(long j10, int i10) {
            if (!(i10 >= 0 && i10 < 1000000000)) {
                throw new IllegalArgumentException(defpackage.f.h("Timestamp nanoseconds out of range: ", i10).toString());
            }
            if (!(-62135596800L <= j10 && j10 < 253402300800L)) {
                throw new IllegalArgumentException(a0.j.i("Timestamp seconds out of range: ", j10).toString());
            }
        }
    }

    static {
        new b();
        CREATOR = new a();
    }

    public m(int i10, long j10) {
        b.a(j10, i10);
        this.f15102a = j10;
        this.f15103b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(Date date) {
        ec.i.e(date, "date");
        long j10 = 1000;
        long time = date.getTime() / j10;
        int time2 = (int) ((date.getTime() % j10) * 1000000);
        rb.d dVar = time2 < 0 ? new rb.d(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new rb.d(Long.valueOf(time), Integer.valueOf(time2));
        long longValue = ((Number) dVar.f13844a).longValue();
        int intValue = ((Number) dVar.f13845b).intValue();
        b.a(longValue, intValue);
        this.f15102a = longValue;
        this.f15103b = intValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && compareTo((m) obj) == 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        ec.i.e(mVar, "other");
        dc.l[] lVarArr = {new n() { // from class: u7.m.c
            @Override // ec.n, jc.f
            public final Object get(Object obj) {
                return Long.valueOf(((m) obj).f15102a);
            }
        }, new n() { // from class: u7.m.d
            @Override // ec.n, jc.f
            public final Object get(Object obj) {
                return Integer.valueOf(((m) obj).f15103b);
            }
        }};
        for (int i10 = 0; i10 < 2; i10++) {
            dc.l lVar = lVarArr[i10];
            int s10 = m0.s((Comparable) lVar.invoke(this), (Comparable) lVar.invoke(mVar));
            if (s10 != 0) {
                return s10;
            }
        }
        return 0;
    }

    public final int hashCode() {
        long j10 = this.f15102a;
        return (((((int) j10) * 37 * 37) + ((int) (j10 >> 32))) * 37) + this.f15103b;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Timestamp(seconds=");
        l10.append(this.f15102a);
        l10.append(", nanoseconds=");
        l10.append(this.f15103b);
        l10.append(')');
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ec.i.e(parcel, "dest");
        parcel.writeLong(this.f15102a);
        parcel.writeInt(this.f15103b);
    }
}
