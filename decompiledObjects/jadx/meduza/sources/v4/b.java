package v4;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f;
import p4.a;
import v3.i0;
import v3.p0;

/* loaded from: classes.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f15849a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15850b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15851c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15852d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15853e;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f15849a = j10;
        this.f15850b = j11;
        this.f15851c = j12;
        this.f15852d = j13;
        this.f15853e = j14;
    }

    public b(Parcel parcel) {
        this.f15849a = parcel.readLong();
        this.f15850b = parcel.readLong();
        this.f15851c = parcel.readLong();
        this.f15852d = parcel.readLong();
        this.f15853e = parcel.readLong();
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15849a == bVar.f15849a && this.f15850b == bVar.f15850b && this.f15851c == bVar.f15851c && this.f15852d == bVar.f15852d && this.f15853e == bVar.f15853e;
    }

    public final int hashCode() {
        return x6.b.b0(this.f15853e) + ((x6.b.b0(this.f15852d) + ((x6.b.b0(this.f15851c) + ((x6.b.b0(this.f15850b) + ((x6.b.b0(this.f15849a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p4.a.b
    public final /* synthetic */ void l(p0.a aVar) {
    }

    @Override // p4.a.b
    public final /* synthetic */ i0 n() {
        return null;
    }

    public final String toString() {
        StringBuilder l10 = f.l("Motion photo metadata: photoStartPosition=");
        l10.append(this.f15849a);
        l10.append(", photoSize=");
        l10.append(this.f15850b);
        l10.append(", photoPresentationTimestampUs=");
        l10.append(this.f15851c);
        l10.append(", videoStartPosition=");
        l10.append(this.f15852d);
        l10.append(", videoSize=");
        l10.append(this.f15853e);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15849a);
        parcel.writeLong(this.f15850b);
        parcel.writeLong(this.f15851c);
        parcel.writeLong(this.f15852d);
        parcel.writeLong(this.f15853e);
    }
}
