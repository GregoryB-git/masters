package p4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import v3.i0;
import v3.p0;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0194a();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f12996a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12997b;

    /* renamed from: p4.a$a, reason: collision with other inner class name */
    public class C0194a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public interface b extends Parcelable {
        byte[] B();

        void l(p0.a aVar);

        i0 n();
    }

    public a() {
        throw null;
    }

    public a(long j10, b... bVarArr) {
        this.f12997b = j10;
        this.f12996a = bVarArr;
    }

    public a(Parcel parcel) {
        this.f12996a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f12996a;
            if (i10 >= bVarArr.length) {
                this.f12997b = parcel.readLong();
                return;
            } else {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            }
        }
    }

    public a(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public a(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f12996a, aVar.f12996a) && this.f12997b == aVar.f12997b;
    }

    public final int hashCode() {
        return x6.b.b0(this.f12997b) + (Arrays.hashCode(this.f12996a) * 31);
    }

    public final String toString() {
        String sb2;
        StringBuilder l10 = defpackage.f.l("entries=");
        l10.append(Arrays.toString(this.f12996a));
        if (this.f12997b == -9223372036854775807L) {
            sb2 = "";
        } else {
            StringBuilder l11 = defpackage.f.l(", presentationTimeUs=");
            l11.append(this.f12997b);
            sb2 = l11.toString();
        }
        l10.append(sb2);
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12996a.length);
        for (b bVar : this.f12996a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f12997b);
    }
}
