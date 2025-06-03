package y4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f17428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17430c;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c() {
        this.f17428a = -1;
        this.f17429b = -1;
        this.f17430c = -1;
    }

    public c(Parcel parcel) {
        this.f17428a = parcel.readInt();
        this.f17429b = parcel.readInt();
        this.f17430c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        int i10 = this.f17428a - cVar2.f17428a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f17429b - cVar2.f17429b;
        return i11 == 0 ? this.f17430c - cVar2.f17430c : i11;
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
        c cVar = (c) obj;
        return this.f17428a == cVar.f17428a && this.f17429b == cVar.f17429b && this.f17430c == cVar.f17430c;
    }

    public final int hashCode() {
        return (((this.f17428a * 31) + this.f17429b) * 31) + this.f17430c;
    }

    public final String toString() {
        return this.f17428a + "." + this.f17429b + "." + this.f17430c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17428a);
        parcel.writeInt(this.f17429b);
        parcel.writeInt(this.f17430c);
    }
}
