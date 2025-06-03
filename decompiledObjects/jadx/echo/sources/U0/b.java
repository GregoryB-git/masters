package U0;

import U0.b;
import W2.k;
import X2.AbstractC0696n;
import android.os.Parcel;
import android.os.Parcelable;
import d0.AbstractC1202y;
import d0.C1194q;
import d0.C1200w;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.M;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements C1201x.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    public final List f6308o;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C0105b.class.getClassLoader());
            return new b(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    /* renamed from: U0.b$b, reason: collision with other inner class name */
    public static final class C0105b implements Parcelable {

        /* renamed from: o, reason: collision with root package name */
        public final long f6310o;

        /* renamed from: p, reason: collision with root package name */
        public final long f6311p;

        /* renamed from: q, reason: collision with root package name */
        public final int f6312q;

        /* renamed from: r, reason: collision with root package name */
        public static final Comparator f6309r = new Comparator() { // from class: U0.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b7;
                b7 = b.C0105b.b((b.C0105b) obj, (b.C0105b) obj2);
                return b7;
            }
        };
        public static final Parcelable.Creator<C0105b> CREATOR = new a();

        /* renamed from: U0.b$b$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0105b createFromParcel(Parcel parcel) {
                return new C0105b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0105b[] newArray(int i7) {
                return new C0105b[i7];
            }
        }

        public C0105b(long j7, long j8, int i7) {
            AbstractC1297a.a(j7 < j8);
            this.f6310o = j7;
            this.f6311p = j8;
            this.f6312q = i7;
        }

        public static /* synthetic */ int b(C0105b c0105b, C0105b c0105b2) {
            return AbstractC0696n.j().e(c0105b.f6310o, c0105b2.f6310o).e(c0105b.f6311p, c0105b2.f6311p).d(c0105b.f6312q, c0105b2.f6312q).i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0105b.class != obj.getClass()) {
                return false;
            }
            C0105b c0105b = (C0105b) obj;
            return this.f6310o == c0105b.f6310o && this.f6311p == c0105b.f6311p && this.f6312q == c0105b.f6312q;
        }

        public int hashCode() {
            return k.b(Long.valueOf(this.f6310o), Long.valueOf(this.f6311p), Integer.valueOf(this.f6312q));
        }

        public String toString() {
            return M.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f6310o), Long.valueOf(this.f6311p), Integer.valueOf(this.f6312q));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.f6310o);
            parcel.writeLong(this.f6311p);
            parcel.writeInt(this.f6312q);
        }
    }

    public b(List list) {
        this.f6308o = list;
        AbstractC1297a.a(!a(list));
    }

    public static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j7 = ((C0105b) list.get(0)).f6311p;
        for (int i7 = 1; i7 < list.size(); i7++) {
            if (((C0105b) list.get(i7)).f6310o < j7) {
                return true;
            }
            j7 = ((C0105b) list.get(i7)).f6311p;
        }
        return false;
    }

    @Override // d0.C1201x.b
    public /* synthetic */ void D(C1200w.b bVar) {
        AbstractC1202y.c(this, bVar);
    }

    @Override // d0.C1201x.b
    public /* synthetic */ byte[] M() {
        return AbstractC1202y.a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f6308o.equals(((b) obj).f6308o);
    }

    public int hashCode() {
        return this.f6308o.hashCode();
    }

    @Override // d0.C1201x.b
    public /* synthetic */ C1194q s() {
        return AbstractC1202y.b(this);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f6308o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f6308o);
    }
}
