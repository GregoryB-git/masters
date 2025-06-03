package d0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1169H implements Comparable, Parcelable {
    public static final Parcelable.Creator<C1169H> CREATOR = new a();

    /* renamed from: r, reason: collision with root package name */
    public static final String f12382r = g0.M.w0(0);

    /* renamed from: s, reason: collision with root package name */
    public static final String f12383s = g0.M.w0(1);

    /* renamed from: t, reason: collision with root package name */
    public static final String f12384t = g0.M.w0(2);

    /* renamed from: o, reason: collision with root package name */
    public final int f12385o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12386p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12387q;

    /* renamed from: d0.H$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1169H createFromParcel(Parcel parcel) {
            return new C1169H(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1169H[] newArray(int i7) {
            return new C1169H[i7];
        }
    }

    public C1169H(int i7, int i8, int i9) {
        this.f12385o = i7;
        this.f12386p = i8;
        this.f12387q = i9;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1169H c1169h) {
        int i7 = this.f12385o - c1169h.f12385o;
        if (i7 != 0) {
            return i7;
        }
        int i8 = this.f12386p - c1169h.f12386p;
        return i8 == 0 ? this.f12387q - c1169h.f12387q : i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1169H.class != obj.getClass()) {
            return false;
        }
        C1169H c1169h = (C1169H) obj;
        return this.f12385o == c1169h.f12385o && this.f12386p == c1169h.f12386p && this.f12387q == c1169h.f12387q;
    }

    public int hashCode() {
        return (((this.f12385o * 31) + this.f12386p) * 31) + this.f12387q;
    }

    public String toString() {
        return this.f12385o + "." + this.f12386p + "." + this.f12387q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f12385o);
        parcel.writeInt(this.f12386p);
        parcel.writeInt(this.f12387q);
    }

    public C1169H(Parcel parcel) {
        this.f12385o = parcel.readInt();
        this.f12386p = parcel.readInt();
        this.f12387q = parcel.readInt();
    }
}
